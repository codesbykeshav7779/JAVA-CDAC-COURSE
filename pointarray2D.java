package com.app.geometry;

public class pointarray2D {
    private double x;
    private double y;

    public pointarray2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "Point(x=" + x + ", y=" + y + ")";
    }

    public boolean isEqual(pointarray2D other) {
        return this.x == other.x && this.y == other.y;
    }

    public double calculateDistance(pointarray2D other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}
