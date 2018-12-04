package ch13.work.command;

public class SellCommodity implements Order {
    private Commodity abcCommodity;

    public SellCommodity(Commodity abcCommodity){
        this.abcCommodity = abcCommodity;
    }

    public void execute() {
        abcCommodity.sell();
    }

    public double getValue() { return abcCommodity.getValue(); }

}
