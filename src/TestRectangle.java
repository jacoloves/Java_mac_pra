class TestRectangle {
    int width;
    int height;

    TestRectangle() {
        setSize(0, 0);
    }

    TestRectangle(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + width + ", " + height + "]";
    }
}
