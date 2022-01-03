package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public double perimeter(Point first, Point second, Point third) {
        return first.distance(second) + second.distance(third) + third.distance(first);
    }

    public boolean exist(Point first, Point second, Point third) {
        return first.distance(second) + second.distance(third) > third.distance(first)
                && second.distance(third) + third.distance(first) > first.distance(second)
                && third.distance(first) + first.distance(second) > second.distance(third);
    }

    public double area() {
        double ab = first.distance(second);
        double bc = first.distance(third);
        double ca = second.distance(third);
        double p = perimeter(first, second, third) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }
}