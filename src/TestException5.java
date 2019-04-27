public class TestException5 {
    public static void main(String[] args) {
        try {
            method1(0);
            method2(0);
            method3(0);
        } catch (Exception e) {
            System.out.println("例外：" + e);
            e.printStackTrace();
        }
    }

    private static void method3(int i) throws Exception{
        if (i > 0) {
            throw new Exception();
        }
    }

    private static void method2(int i) throws Exception{
        if (i == 0) {
            throw new Exception();
        }
    }

    private static void method1(int i) throws Exception{
        if (i > 0) {
            throw new Exception();
        }
    }
}
