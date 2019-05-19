package GradleTest.src.main.java.gradleSrc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRead1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用方法：java TestRead1 検索文字列 検索大賞ファイル");
            System.out.println("例：java TestRead1 System TestRead1.java");
            System.exit(0);
        }
        String str = args[0];
        String filename = args[1];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int cnt = 1;
            while ((line = reader.readLine()) != null) {
                if (line.indexOf(str) != -1) {
                    System.out.println(cnt + ": " + line);
                }
                cnt++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(filename + "がみつかりません。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
