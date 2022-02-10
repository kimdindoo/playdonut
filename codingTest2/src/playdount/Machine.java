package playdount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
    private Report report;
    private List<Item> items;
    private Map<Item, Integer> stocks;
    private int capacity = 10;
    private int money;

    public Machine() {
        items = new ArrayList<>();
        items.add(new Item(1, "레쓰비", 500));
        items.add(new Item(2, "포카리스웨트", 1000));
        items.add(new Item(3, "파워에이드", 1000));


        report = new Report();

        stocks = new HashMap<Item, Integer>();
        for (Item item : items) {
            stocks.put(item, capacity);
        }
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Item getItem(int itemId) {
        Item it = null;
        for (Item item : items) {
            if (item.itemId == itemId) {
                it = item;
            }
        }

        if (it == null) {
            System.out.println("찾으시는 상품이 없습니다.");
            return null;
        } else {
            return it;
        }
    }

    public void buy(int itemId) {
        for (Item item : items) {
            if (item.itemId == itemId) {
                Item it = item;
                int remains = stocks.get(it);
                if (remains == 0) {
                    System.out.println("Sold Out!!");
                } else {
                    stocks.put(it, remains - 1);
                    money -= it.price;
                }
            }
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public Map<Item, Integer> getStocks() {
        return stocks;
    }

    public Report getReport() {
        return report;
    }
}
