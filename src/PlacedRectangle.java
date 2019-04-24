public class PlacedRectangle {
    int x;
    int y;

    TestRectangle rec;

    PlacedRectangle() {
        rec = new TestRectangle();
        setLocation(0, 0);
    }

    PlacedRectangle(int x, int y) {
        rec = new TestRectangle();
        setLocation(x, y);
    }

    PlacedRectangle(int x, int y, int width, int height) {
        rec = new TestRectangle(width, height);
        setLocation(x, y);
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") " + rec +" ]";
    }

    public static void main(String[] args) {
        PlacedRectangle a = new PlacedRectangle();
        PlacedRectangle b = new PlacedRectangle(12, 34);
        PlacedRectangle c = new PlacedRectangle(31, 41, 59, 26);
        PlacedRectangle d = new PlacedRectangle(1, 2, 100, 200);
        d.setLocation(3, 4);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
