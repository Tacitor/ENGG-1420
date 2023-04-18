/*
 * Lukas Krampitz
 * Apr 18, 2023
 * mplement a FileUtils class including some useful file methods
 */
package assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Tacitor
 */
public abstract class FileUtils {

    public static String createRandomFile() throws IOException {
        StringBuilder fileLocation = new StringBuilder();
        //add the current dir
        fileLocation.append("src\\assignment6\\test.txt");

        int validRanges[][] = new int[][]{{97, 26}, {65, 26}}; //has the format of the start index, and then the number of consecutive entries. Gets the upper and lowercase letters in ASCII values

        try {
            //Try and create the file
            File file = new File(fileLocation.toString());
            System.out.println("Made File: " + file.createNewFile());

            return file.getAbsolutePath();
        } catch (IOException e) {
            throw new IOException("ERROR in createRandomFile() in FileUtils.java: " + e);
        }

    }

    public static long length(String path) throws PathNotAFolderException, FileNotFoundException {
        return length(path, false);
    }

    /**
     * A private method that is only for internal use to turn off the error
     * flags
     *
     * @param path
     * @return
     * @throws PathNotAFolderException
     * @throws FileNotFoundException
     */
    private static long length(String path, boolean quietMode) throws PathNotAFolderException, FileNotFoundException {
        long length = 0; //accumulator for the size of the folder on disk

        //create a file at the path
        File dir = new File(path);

        //test if it exists
        if (!dir.exists()) {
            //if it does not exist throw an exception and return from the method
            throw new FileNotFoundException("Error in length() of FileUtils with argument: " + path);
        }

        //test if it is a folder
        if (!dir.isDirectory()) {
            //check if need to be quiet. If not quiet it is from a main call of the length method and this means the main input needs to be a folder
            if (!quietMode) {
                throw new PathNotAFolderException("Error in length() of FileUtils. The path " + path + " is not a directory.");
            } else { //this means quiet mode, so try and find length of the file then
                return dir.length();
            }
        } else {
            //if it is a directory find all sub elements and run length on them too
            File subFiles[] = dir.listFiles();

            //itterate over the list
            for (File f : subFiles) {
                length += length(f.getPath(), true);
            }
        }

        return length;
    }

}
