package playdount;

public class Item {
    int itemId;
    String name;
    int price;

    public Item(int itemId, String name, int price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return itemId + "." + name + price + "원 ";
    }
}