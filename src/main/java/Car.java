public class Car {

    private int ID;
    private String Name;
    private int price;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(ID);
        builder.append(" ");
        builder.append(Name);
        builder.append(" ");
        builder.append(price);

        return builder.toString();
    }
}
