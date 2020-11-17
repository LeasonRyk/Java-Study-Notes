/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studynotes1a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leason Rykaart
 */
public class readNwrite {
    public static void main(String[] args) throws IOException {
        String score ="150";
        checkFile();
        checkScore(score);
        
    }
    public static void checkFile() throws IOException{
         File file = new File("input.txt");
         if(file.exists() && file.isFile()){
             System.out.println("there is a file ");
         }else{
             System.out.println("file doesnt exists");
             file.createNewFile();
             if(!file.exists() && file.isFile()){
                 System.out.println("File was not created! ");
             }
             System.out.println("Created new file! ");
         }
}
    public static void checkScore(String score) throws IOException {
        HashSet<Integer> set = new HashSet<>();
        FileReader in = null;
        try {
            in = new FileReader("input.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(readNwrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner sIn = new Scanner(in);
        boolean check = sIn.hasNextLine();
        if(!check){
            FileWriter wScore = new FileWriter("input.txt");
            wScore.write(score);
            wScore.close();
        }
     
            String sScore = sIn.nextLine();
            System.out.println(sScore);
            int iScore = Integer.parseInt(score);
            if(iScore > Integer.parseInt(score)){
            FileWriter wScore = new FileWriter("input.txt");
            wScore.write(Integer.toString(iScore));
            wScore.close();
        }
    }
}