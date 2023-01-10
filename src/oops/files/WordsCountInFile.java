package oops.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordsCountInFile {
    private static  int getNumberOfWordsInFile() throws IOException {
        String line = null;
        int wordsCount=0;
        String[] words = null;
        FileReader file = new FileReader("/Users/nitish.niraj/git/DSA&OOPS&DesignPatterns/src/oops/files/input.txt");
        BufferedReader br = new BufferedReader(file);
        line = br.readLine();
        while(null != line){
            words = line.split(" ");
            wordsCount+=(words.length);
            line = br.readLine();
        }
        return wordsCount;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(getNumberOfWordsInFile());
    }
}
