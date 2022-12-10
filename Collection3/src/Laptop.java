import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Laptop implements Comparable<Laptop>{
    public String brand;
    public int Ram;
    public int Price;
    public Laptop(String brand,int Ram,int Price) {
        this.brand =brand;
        this.Price = Price;
        this.Ram = Ram;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", Ram=" + Ram +
                ", Price=" + Price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Ram == laptop.Ram;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Ram);
    }

    @Override
    public int compareTo(Laptop that) {
        if(this.Price > that.Price){
            return 1;
        }else if(this.Price< that.Price){
            return -1;
        }else{
            return 0;
        }
    }
}
