public class CircleRunner {
    public static void main(String args[]) {
        Circle circle = new Circle(5.0);
        String msg = circle.getInfo();
        System.out.print(msg);
        circle.setRadius(9.2);
        msg = circle.getInfo();
        System.out.print(msg);

        RightTriangle rightTriangle1 = new RightTriangle(3,4);
        RightTriangle rightTriangle2 = new RightTriangle(6.5,10.7);
        double hypotenuse1 = rightTriangle1.hypotenuse();
        double hypotenuse2 = rightTriangle2.hypotenuse();
        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);

        double degree = circle.radianToDegree(2.5);
        double radian = circle.degreeToRadian(275);
        System.out.println("The degree of 275 is equal to " + radian + " pi in radian");
        System.out.println("The radian of 2.5 pi is equal to " + degree + " in degree");
    }
}
