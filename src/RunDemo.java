public class RunDemo {
    public static void main(String[] args) {

        //Rectangle 1
        Rectangle firstRectangle = new Rectangle(4, 40);
        System.out.println("Area of first rectangle is : " + firstRectangle.getArea());
        System.out.println("Perimeter of first rectangle is : " + firstRectangle.getPerimeter());

        //Rectangle 2
        Rectangle secondRectangle = new Rectangle(3.5, 35.9);
        System.out.println("Area of second rectangle is : " + secondRectangle.getArea());
        System.out.println("Perimeter of second rectangle is : " + secondRectangle.getPerimeter());
    }
}
