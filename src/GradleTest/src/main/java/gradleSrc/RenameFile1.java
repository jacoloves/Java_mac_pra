package GradleTest.src.main.java.gradleSrc;

import java.io.File;

public class RenameFile1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用方法：java RenameFile1 現在のファイル名 新しいファイル名");
            System.out.println("例：java RenameFile1 old.txt new.txt");
            System.exit(0);
        }
        String oldfilename = args[0];
        String enewfilename = args[1];
        File oldfile = new File(oldfilename);
        File newfile = new File(enewfilename);

        if (oldfile.renameTo(newfile)) {
            System.out.println(oldfilename + "を" + enewfilename + "に変更しました。");
        } else {
            System.out.println(oldfilename + "を" + enewfilename + "に変更できませんでした。");
        }
    }
}
