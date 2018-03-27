package hangman;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

public class FileService {

    public void reader(String path) {
        String thisLine;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    public void addWord(String path, String word) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(word);
            bw.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    public double random() {
        Random rn = new Random();
        int max = 100;
        int min = 1;
        int randomnumber = rn.nextInt((int) (max - min + 1)) + min;
        return randomnumber;

    }

}
