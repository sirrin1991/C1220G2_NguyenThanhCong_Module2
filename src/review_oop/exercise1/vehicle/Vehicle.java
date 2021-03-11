package review_oop.exercise1.vehicle;


public class Vehicle {
    private int price;
    private int cc;
    private String name ;
    private float tax;

    public Vehicle(int price, int cubicCentimetre,String name) {
        this.price = price;
        this.cc = cubicCentimetre;
        this.name = name;
    }


    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public  float getTax() {
        return tax;
    }

    public void setTax(float taxx) {
      tax = taxx;
    }

    @Override
    public String toString() {
        return "{Vehicle's name: " + name +
                ", price=" + price +
                ", cc=" + cc +", tax="+ tax +
                '}';
    }
    public String getInfor() {
        return  price + "," + cc + "," + name +","+ tax ;
    }
}
