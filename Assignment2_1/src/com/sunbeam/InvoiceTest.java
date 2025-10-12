package com.sunbeam;
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Part Number: ");
        String partNumber = sc.nextLine();

        System.out.print("Enter Part Description: ");
        String partDescription = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price Per Item: ");
        double pricePerItem = sc.nextDouble();

        Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        System.out.println("\nInvoice Details:");
        invoice.DisplayInvoice();
    }
}
4