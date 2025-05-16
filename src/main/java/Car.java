public class Car {

    /**
     * A class to describe a car, specifying its make, model, year, and price.
     * 
     * @param make the manufacturer of the car, as a string
     * @param model the model of the car, as a string
     * @param year the year that the car was manufactured, as an integer
     * @param price the price of the car, as a double
     */
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructor to initialize the Car object.
     *
     * @param make  The make of the car.
     * @param model The model of the car.
     * @param year  The year of manufacture of the car.
     * @param price The price of the car.
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Returns the make of the car.
     *
     * @return The make of the car.
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Returns the model of the car.
     *
     * @return The model of the car.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Returns the year of manufacture of the car.
     *
     * @return The year of manufacture of the car.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Returns the price of the car.
     *
     * @return The price of the car.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets the make of the car.
     *
     * @param word The new make of the car.
     */
    public void setMake(String word) {
        this.make = word;
    }

    /**
     * Sets the model of the car.
     *
     * @param word2 The new model of the car.
     */
    public void setModel(String word2) {
        this.model = word2;
    }

    /**
     * Sets the year of manufacture of the car.
     *
     * @param num The new year of manufacture of the car.
     */
    public void setYear(int num) {
        this.year = num;
    }

    /**
     * Sets the price of the car.
     *
     * @param d The new price of the car.
     */
    public void setPrice(double d) {
        this.price = d;
    }
}
