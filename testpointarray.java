package tester;

import java.util.ArrayList;
import java.util.Scanner;
import com.app.geometry.Point2D;

public class testpointarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Point2D> points = new ArrayList<>();

        System.out.println("Enter points coordinates. Type 'q' to stop.");

        while (true) {
            System.out.print("Enter x coordinate (or 'q' to quit): ");
            String inputX = sc.next();

            if (inputX.equalsIgnoreCase("q")) {
                break; 
            }

            double x;
            try {
                x = Double.parseDouble(inputX);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for x coordinate. Please try again.");
                continue; 
            }

            System.out.print("Enter y coordinate: ");
            String inputY = sc.next();

            double y;
            try {
                y = Double.parseDouble(inputY);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for y coordinate. Please try again.");
                continue; 
            }

            Point2D p = new Point2D(x, y);
            points.add(p);
            System.out.println("Point added: " + p.getDetails());
        }

       
        System.out.println("\nAll entered points:");
        for (int i = 0; i < points.size(); i++) {
            System.out.println("Point " + (i + 1) + ": " + points.get(i).getDetails());
        }

     
        System.out.println("\nComparing points:");
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                Point2D p1 = points.get(i);
                Point2D p2 = points.get(j);

                System.out.print("Between Point " + (i + 1) + " and Point " + (j + 1) + ": ");
                if (p1.isEqual(p2)) {
                    System.out.println("Points are at the same position.");
                } else {
                    double dist = p1.calculateDistance(p2);
                    System.out.printf("Distance = %.2f\n", dist);
                }
            }
        }

        sc.close();
    }
}
