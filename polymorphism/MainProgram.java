public class MainProgram {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Animal animalCat = new Cat();
    Cat cat = new Cat();

    animal.makeSound(); // from Animal
    animalCat.makeSound(); // from Cat
    cat.makeSound(); // from Cat

    cat.sayMeow(); // say meow!
    // animalCat.sayMeow(); // compile error
    // animal.sayMeow(); // compile error
  }
}
