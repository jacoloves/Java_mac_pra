import java.awt.image.SampleModel;

public class SmpRcta {
    int width;
    int height;
    SmpRcta() {
        width = 0;
        height = 0;
    }
    SmpRcta(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class NamedRectangle extends SmpRcta {
    String name;
    NamedRectangle() {
        super();
        name = "NO NAME";
    }

    NamedRectangle(String name) {
        super(200, 32);

        this.name = name;
    }
}