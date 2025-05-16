public class Dog {

    /**
     * A class to describe a dog with a name, breed, and weight.
     * The name and breed are strings while the weight is an integer.
     * 
     * @param name the name of the dog, as a string
     * @param breed the breed of the dog, as a string
     * @param weight the weight of the dog, as a integer
     */
    private String name;
    private String breed;
    private int weight;

    /**
     * Constructor to initialize the Dog object.
     *
     * @param name  The name of the dog.
     * @param breed  The breed of the dog.
     * @param weight The weight of the dog in kilograms.
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * Sets the name of the dog.
     *
     * @return The name of the dog.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the breed of the dog.
     *
     * @return The breed of the dog.
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * Returns the weight of the dog.
     *
     * @return The weight of the dog in kilograms.
     */
    public int getWeight() {
        return this.weight;
    }

    /**
     * Returns the name of the dog.
     *
     * @param word The new name of the dog.
     */
    public void setName(String word) {
        this.name = word;
    }

    /**
     * Sets the breed of the dog.
     *
     * @param word2 The new breed of the dog.
     */
    public void setBreed(String word2) {
        this.breed = word2;
    }

    /**
     * Sets the weight of the dog.
     *
     * @param num The new weight of the dog in kilograms.
     */
    public void setWeight(int num) {
        this.weight = num;
    }
}