package ch13.work.command;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Stock abcStock = new Stock();
        CommodityFactory commodityFactory = new CommodityFactory();
        ArrayList<SellCommodity> commSellOrders = new ArrayList<>();
        ArrayList<BuyCommodity> commBuyOrders = new ArrayList<>();

        //BuyStock buyStockOrder = new BuyStock(abcStock);
        //SellStock sellStockOrder = new SellStock(abcStock);

        Commodity beans = commodityFactory.getCommodity(CommodityType.BEANS);
        Commodity corn = commodityFactory.getCommodity(CommodityType.CORN);
        Commodity wheat = commodityFactory.getCommodity(CommodityType.WHEAT);

        BuyCommodity buyCornOrder = new BuyCommodity(corn);
        BuyCommodity buyWheatOrder = new BuyCommodity(wheat);
        BuyCommodity buyBeansOrder = new BuyCommodity(beans);

        SellCommodity sellCornOrder = new SellCommodity(corn);
        SellCommodity sellWheatOrder = new SellCommodity(wheat);
        SellCommodity sellBeansOrder = new SellCommodity(beans);

        commBuyOrders.add(buyCornOrder);
        commBuyOrders.add(buyWheatOrder);
        commBuyOrders.add(buyBeansOrder);

        commSellOrders.add(sellCornOrder);
        commSellOrders.add(sellWheatOrder);
        commSellOrders.add(sellBeansOrder);

        Broker broker = new Broker();
        //broker.takeOrder(buyStockOrder);
        //broker.takeOrder(sellStockOrder);

        for (Order o : commBuyOrders) {
            broker.takeOrder(o);
        }
        broker.placeOrders();

        for (Order o : commSellOrders) {
            broker.takeOrder(o);
        }
        broker.placeOrders();
    }

}
