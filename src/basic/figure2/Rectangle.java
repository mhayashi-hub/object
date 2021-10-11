package basic.figure2;

class Rectangle extends Figure {
    private double height;
    private double width;
    // constructor
    public Rectangle(double height, double width) {
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
    // getArea method
    /**
     *
     * @return double
     */
    @Override
    public double getArea(){
        return height * width;
    }
    // toString override
    @Override
    public String toString(){
        return String.format("長方形の 高さ:%.2f 幅:%.2f 面積:%.2f",height,width,getArea());
    }
}

