package basic.figure2;

class Circle {
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
