public class Rectangle {
    int width;
    int height;
    int x;
    int y;

    private static final int INITIAL_WIDTH = 10;
    private static final int INITIAL_HEIGHT = 10;

    Rectangle() {
        setLocation(0, 0);
        setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = INITIAL_WIDTH;
        this.height = INITIAL_HEIGHT;
    }

    Rectangle(int x, int y, int w, int h) {
        setSize(w, h);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + this.x + ", " + this.y + ", " + this.width + ", " + this.height + "]";
    }

//    void intersect(Rectangle r) {
//        int sx = Math.max(this.x, r.x);
//        int sy = Math.max(this.y, r.y);
//        int ex = Math.min(this.x + this.width, r.x + r.width);
//        int ey = Math.min(this.y + this.height, r.y + this.height);
//        int newwidth = ex - sx;
//        int newheight = ey - sy;
//        if (newwidth > 0l && newheight > 0) {
//            return new Rectangle(sx, sy, newwidth, newheight);
//        } else {
//            return null;
//        }
//    }
}
