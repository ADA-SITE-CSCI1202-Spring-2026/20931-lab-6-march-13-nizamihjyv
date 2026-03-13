public class Main {
    public static void main(String[] args) {
        // Animal and Dog test
        Animal animal1 = new Animal("Milo", "Alice", 3);
        Animal animal2 = new Animal("Milo", "Alice", 3);

        Dog dog1 = new Dog("Buddy", "John", 5, "Golden Retriever");
        Dog dog2 = new Dog("Buddy", "John", 5, "Golden Retriever");

        System.out.println(animal1);
        System.out.println("animal1 equals animal2: " + animal1.equals(animal2));

        System.out.println(dog1);
        System.out.println("dog1 equals dog2: " + dog1.equals(dog2));

        System.out.println();

        // Account test
        Account account = new Account(1001, "Bob Smith", 500.0);
        System.out.println(account);

        account.deposit(200.0);
        System.out.println("After deposit: " + account);

        try {
            account.withdraw(800.0); // more than balance
        } catch (InvalidAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        account.withdraw(300.0);
        System.out.println("After withdrawal: " + account);
    }
}