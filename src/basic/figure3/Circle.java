package basic.figure3;

class Circle implements IfGetArea {
    private double radius;
    // constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // getter method
    public double getRadius() {
        return radius;
    }
    // area calc method
    /**
     *
     * @return double
     */
    @Override
    public double getArea() {
    //    return radius * radius * Math.PI ;
        return Math.PI * Math.pow(radius,2);
    }
    // toString override
    @Override
    public String toString() {
        return String.format("円の 半径:%.2f 面積:%.2f",radius,getArea());
    }
}
