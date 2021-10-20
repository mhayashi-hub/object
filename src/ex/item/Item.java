package ex.item;

class Item {
    private int id;
    private String name;
    private int price;

    public Item(int id, String name, int price) {
        this.id = id;      // 商品ID
        this.name = name;  // 商品名商
        this.price = price;// 商品価格
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}
