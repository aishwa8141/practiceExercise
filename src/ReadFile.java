import java.io.*;

import java.util.Scanner;

public class ReadFile {

    public static void main(String [] args) throws IOException {



        StringBuffer buffer = new StringBuffer();

        BufferedReader inputStream = null;


        inputStream = new BufferedReader(new FileReader("/home/user/Assignment2/src/file1.txt"));


        String l;
        while ((l = inputStream.readLine()) != null) {
            buffer.append(l);
        }
        System.out.println(buffer);
        String string=buffer.toString().toUpperCase();
        System.out.println(string);

    }

}
