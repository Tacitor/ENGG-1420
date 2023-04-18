/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.*;
import java.io.*;

/**
 *
 * @author Lukas
 */
public class BinFile {

    public static void main(String args[]) {
        long start = System.currentTimeMillis();

        //Make a new file at the location
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(new File("src\\assignment6\\numbers.bin")))) {

            //loop 10 million times
            for (long i = 0; i < 10000000; i++) { //10000000
                out.writeInt((int) (Math.random() * 100));

                if (i % 100000 == 0) {

                    System.out.println("Still alive: " + i);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start));
    }

}
