package om.sunbeam;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter center coordinates (x, y):");
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Enter Diameter:");
            double diameter = sc.nextDouble();

            Program p = new Program(x, y, diameter);
            p.display();

        } catch (NegativeDiameterException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
