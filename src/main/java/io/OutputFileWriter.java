package io;

import java.io.*;

public class OutputFileWriter {

    public static void WriteToFile(String inputFileName, String data) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./".concat(inputFileName).concat("-submit.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            bufferedWriter.write(data);
            bufferedWriter.flush();
            bufferedWriter.close();

            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
