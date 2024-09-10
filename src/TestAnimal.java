// Animal.java
class Animal {
    // sound method for the Animal class
    public void sound() {
        System.out.println("animal makes sounds");
    }
}

// Dog.java
class Dog extends Animal {
    // sound method for the Dog class
    @Override
    public void sound() {
        System.out.println("bark");
    }
}

// Cat.java
class Cat extends Animal {
    // sound method for the Cat class
    @Override
    public void sound() {
        System.out.println("meow");
    }
}

// Wolf.java
class Wolf extends Animal {
    // sound method for the Wolf class
    @Override
    public void sound() {
        System.out.println("howl");
    }
}

// TestAnimal.java
public class TestAnimal {
    public static void main(String[] args) {
        // Create instances of each animal
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal wolf = new Wolf();

        // Call the sound method for each animal
        dog.sound();  // Prints "bark"
        cat.sound();  // Prints "meow"
        wolf.sound(); // Prints "howl"
    }
}
