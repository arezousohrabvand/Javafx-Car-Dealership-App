package sample;

public class Car {

    private String make,model,condition,engine,year,number,price,color,date;

    public Car(String make, String model, String condition, String engine, String year, String number, String price, String color, String date) {
        this.make = make;
        this.model = model;
        this.condition = condition;
        this.engine = engine;
        this.year = year;
        this.number = number;
        this.price = price;
        this.color = color;
        this.date = date;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getCondition() {
        return condition;
    }

    public String getEngine() {
        return engine;
    }

    public String getYear() {
        return year;
    }

    public String getNumber() {
        return number;
    }

    public String getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getDate() {
        return date;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDate(String date) {
        this.date = date;
    }
}


