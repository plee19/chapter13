package ch13.work.command;

public class BuyCommodity implements Order {
    private Commodity abcCommodity;

    public BuyCommodity(Commodity abcCommodity){
        this.abcCommodity = abcCommodity;
    }

    public void execute() {
        abcCommodity.buy();
    }

    public double getValue() { return abcCommodity.getValue(); };
}
