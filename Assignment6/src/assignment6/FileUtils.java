/*
 * Lukas Krampitz
 * Apr 18, 2023
 * mplement a FileUtils class including some useful file methods
 */
package assignment6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Tacitor
 */
public abstract class FileUtils {

    public static void split(String fileName, int n) throws FileNotFoundException {

        //
        File ogFile = new File(fileName);
        String justTheFileName;
        ArrayList<StringBuilder> filesList = new ArrayList<>();
        //setup the frist builder
        filesList.add(new StringBuilder());

        //test to see if it exists
        if (!ogFile.exists()) {
            throw new FileNotFoundException("Error: file not found.");
        }

        //grab the file name
        justTheFileName = ogFile.getName();
        justTheFileName = justTheFileName.split("\\.")[0];
        String line;
        int fileCount = 0; //the index of the file currently being worked on
        int lineCount = 0; //the number of lines added to the current file

        //make a try with resources to read the Text File using character streams
        try (BufferedReader stringReader = new BufferedReader(new FileReader(ogFile))) {

            //loop until the end of the file is reached
            while (true) {
                line = stringReader.readLine();

                //check for end of file
                if (line == null) {
                    break;
                }

                //check if the max lines are reached
                if (lineCount >= n) {
                    //startup a new file
                    fileCount++;
                    filesList.add(new StringBuilder());
                    lineCount = 0;
                }

                //add the line to the current file
                //only add a new line if not the first line
                if (lineCount != 0) {
                    filesList.get(fileCount).append("\n");
                }
                filesList.get(fileCount).append(line);
                lineCount++;

            }

            //create the files
            File newFile;
            for (int i = 0; i < filesList.size(); i++) {
                newFile = new File("src\\assignment6\\" + justTheFileName + (i + 1) + ".txt");

                //try catch with resources the IOException while writing to the files
                try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newFile)))) {
                    
                    pw.print(filesList.get(i).toString());

                } catch (IOException e) {
                    System.out.println("Error: " + e);
                }//finally is implied

                //System.out.println(newFile.getAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("It would appear to to and error: " + e);
        }
        //the finally is implicit to close the file

    }

    public static String createRandomFile() throws IOException {
        StringBuilder fileLocation = new StringBuilder();
        //add the current dir
        fileLocation.append("src\\assignment6\\");

        int validRanges[][] = new int[][]{{97, 26}, {65, 26}}; //has the format of the start index, and then the number of consecutive entries. Gets the upper and lowercase letters in ASCII values

        int newNum;
        int rangeNum;

        //generate the name
        for (int i = 0; i < 15; i++) {
            //pick a range
            rangeNum = (int) (Math.random() * validRanges.length);

            //pick a random letter
            fileLocation.append((char) ((int) (Math.random() * validRanges[rangeNum][1]) + validRanges[rangeNum][0]));

        }

        fileLocation.append(".txt");

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
