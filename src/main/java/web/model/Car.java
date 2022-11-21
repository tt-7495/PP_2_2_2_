package web.model;

public class Car {
    private int id;
    private String brand;
    private  String series;


    public Car(int id, String brand, String series) {
        this.id = id;
        this.brand = brand;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car " +
                "brand='" + brand + '\'' +
                ", series='" + series ;
    }
}
