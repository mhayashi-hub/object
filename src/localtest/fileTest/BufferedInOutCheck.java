package localtest.fileTest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class BufferedInOutCheck {
    public static void main(String[] args) {
        String dirPath1 = "C:\\Users\\user.DESKTOP-05BGNA3\\IdeaProjects\\object\\src" +
                "\\localtest\\fileTest";
        String fileName1 = "trial.txt";
        String charset = "UTF-8";

        try (
            FileInputStream fileIn = new FileInputStream(dirPath1 +"\\"+ fileName1);
            InputStreamReader inStreamRead = new InputStreamReader(fileIn, charset);
            BufferedReader fileReader = new BufferedReader(inStreamRead);
        ) {
            while (fileReader.ready()) {
                System.out.println(fileReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileName2 = "outtrial.txt";
        List<String> outList = new ArrayList<> ();
        outList.add("赤");
        outList.add("青");
        outList.add("黄");
        outList.add("red");
        outList.add("green");
        outList.add("yellow");
        for (String listElement:outList) {
            System.out.println(listElement);
        }

        try (
                FileOutputStream fileOut = new FileOutputStream(dirPath1 +"\\"+ fileName2);
                OutputStreamWriter outStreamWrite = new OutputStreamWriter(fileOut, charset);
                BufferedWriter fileWriter = new BufferedWriter(outStreamWrite);
                ) {
            for (String listElement:outList) {
                fileWriter.write(listElement);
                fileWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
