package basic.figure2;

public class Triangle {
    public double height;
    public double width;
    // constructor
    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    // getter method
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    // area calc method
    public double getArea() {
        return height * width / 2;
    }
    // override toString method
    @Override
    public String toString() {
        return String.format("三角形の 高さ:%.2f 底辺:%.2f 面積:%.2f",height,width,getArea());
    }
}
