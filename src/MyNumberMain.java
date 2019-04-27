import java.io.FileNotFoundException;

public class MyNumberMain {
    public static void main(String[] args) throws FileNotFoundException {
        DebugPrintable[] objs = new DebugPrintable[2];

        objs[0] = new MyNumber(123);
        objs[1] = new MyFileReader("input.txt");

        for (int i = 0; i < objs.length; i++) {
            objs[i].debugPrint();
        }
    }
}
