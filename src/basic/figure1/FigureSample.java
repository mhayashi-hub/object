package basic.figure1;

class FigureSample {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5,41);
        Rectangle rectangle2 = new Rectangle(3.5,2.4);
        Circle c1 = new Circle(4);
        Triangle t1 = new Triangle(3,4);

        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(c1);
        System.out.println(t1);
    }
}
