package com.sunbeam;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }

    // Setter and Getter for partNumber
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartNumber() {
        return partNumber;
    }

    // Setter and Getter for partDescription
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public String getPartDescription() {
        return partDescription;
    }

    // Setter and Getter for quantity
    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;
    }
    public int getQuantity() {
        return quantity;
    }

    // Setter and Getter for pricePerItem
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0.0;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }

    // Calculate total invoice amount
    public double InvoiceAmount() {
        return quantity * pricePerItem;
    }

    // Display method
    public void DisplayInvoice() {
        System.out.println("Part Number: " + partNumber);
        System.out.println("Part Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: " + pricePerItem);
        System.out.println("Total Amount: " + InvoiceAmount());
    }
}

