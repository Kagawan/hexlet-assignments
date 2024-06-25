package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    public int getFloor() {
        return floor;
    }

    public String toString() {
        return "Квартира площадью " +
                getArea() +
                " метров на "
                + getFloor() +
                " этаже";
    }


    public int compareTo(Home another) {
        return Double.compare(this.getArea(), another.getArea());
    }
}
// END
