package Dz3;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELOW = "\u001B[33m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_YELOW+"Программа вычисляет периметр прямоугольника по введенным коордитатам точек его сторон"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"Ведите название прямоугольника  : "+ANSI_RESET);
        String nameP = sc.nextLine();
        System.out.println(ANSI_BLUE+"Ведите х первой точки : "+ANSI_RESET);
        int x1 = sc.nextInt();
        System.out.println(ANSI_BLUE+"Ведите y первой точки : "+ANSI_RESET);
        int y1 = sc.nextInt();
        System.out.println(ANSI_BLUE+"Ведите х второй точки : "+ANSI_RESET);
        int x2 = sc.nextInt();
        System.out.println(ANSI_BLUE+"Ведите y второй точки : "+ANSI_RESET);
        int y2 = sc.nextInt();
        System.out.println(ANSI_BLUE+"Ведите х третей точки : "+ANSI_RESET);
        int x3 = sc.nextInt();
        System.out.println(ANSI_BLUE+"Ведите y третей точки : "+ANSI_RESET);
        int y3 = sc.nextInt();
        Point point1 = new Point("", x1, y1);
        Point point2 = new Point("", x2, y2);
        Point point3 = new Point("", x3, y3);
        Figure figure = new Figure(point1, point2, point3);
        System.out.println(ANSI_YELOW+"Название прямоугольника  "+ANSI_RESET+nameP);
        System.out.println(ANSI_YELOW+"Вы ввели координаты первой и второй точек, которые соответствуют первой стороне прямоугольника длиной : "+ANSI_RESET + figure.LengthSide(point1, point2));
        System.out.println(ANSI_YELOW+"Вы ввели координаты третей точки, которая в сочитании с второй точкой соответствуют второй стороне прямоугольника длиной : "+ANSI_RESET + figure.LengthSide(point2, point3));
        System.out.print(ANSI_YELOW+"Периметр прямоугольника равен :  "+ANSI_RESET);
        figure.PerimeterCalculator(figure);

    }
}