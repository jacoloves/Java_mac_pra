package GradleTest.src.main.java.gradleSrc;

import java.io.*;

public class ListDir1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用方法：java ListDir1 ディレクトリ名");
            System.out.println("例：kjava ListDir1 doc");
            System.exit(0);
        }
        String dirname = args[0];
        File dir = new File(dirname);
        String[] dirList = dir.list();
        for (int i = 0; i < dirList.length; i++) {
            System.out.println(dirList[i]);
        }
    }

    public static class TestRead1 {
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
}
