package GradleTest.src.main.java.gradleSrc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRead1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用方法：java TestRead1 ファイル");
            System.out.println("例：java TestRead1 TestRead1.java");
            System.exit(0);
        }
        String filename = args[0];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(filename + "がみつかりません。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
