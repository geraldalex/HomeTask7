package Dz3;

public class Figure {

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    private Point point5;

    public Figure(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Figure(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Figure(Point point1, Point point2, Point point3, Point point4, Point point5) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.point5 = point5;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public Point getPoint5() {
        return point5;
    }


    public static double LengthSide(Point A, Point B) {

        double LengthX;
        double LengthY;
        double Side;

        LengthX = (B.getX() - A.getX()) * (B.getX() - A.getX());
        LengthY = (B.getY() - A.getY()) * (B.getY() - A.getY());

        Side = LengthY + LengthX;

        return Math.sqrt(Side);
    }

    public static void PerimeterCalculator(Figure figure) {

        double AB = LengthSide(figure.getPoint1(), figure.getPoint2());
        double BC = LengthSide(figure.getPoint2(), figure.getPoint3());

        System.out.println((AB + BC)*2);

    }
}














