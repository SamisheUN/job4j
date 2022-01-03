package ru.job4j.condition;
/*1. Создайте класс ru.job4j.condition.Point. Допишите метод distance.
2. Доработайте метод main Добавьте в него вызов метода distance с различными параметрами точек.
*/
public class Point {
    private int x;
    private int y;
    
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);

        double dist = a.distance(b);
        System.out.println(dist);
    }

}
