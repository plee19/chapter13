package ch13.work.command;

public class Corn implements Commodity {
    private String name = "Corn";
    private int quantity = 5;
    private double price = 5.00;

    public void buy() {
        System.out.println("Commodity [ Name: "+name+", Quantity: " + quantity +" ] bought at " + price + " for a total of " + getValue());
    }

    public void sell(){
        System.out.println("Commodity [ Name: "+name+", Quantity: " + quantity +" ] sold at " + price + " for a total of " + getValue());
    }

    public double getValue() {
        return quantity * price;
    }
}
