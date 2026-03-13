public class Dog extends Animal {
    private String breed;

    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{name='" + getAnimalName() + "', ownerName='" + getOwnerName() +
               "', age=" + getAge() + ", breed='" + breed + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dog)) return false;
        if (!super.equals(obj)) return false;

        Dog other = (Dog) obj;
        return this.breed.equals(other.breed);
    }
}