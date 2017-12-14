public class MainProgram {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Animal animalDog = new Dog();
    Animal animalCat = new Cat();
    Dog dog = new Dog();
    Cat cat = new Cat();

    animal.makeSound();
    animalDog.makeSound();
    animalCat.makeSound();
    dog.makeSound();
    cat.makeSound();

    System.out.println();

    // animalDog.DogMethod();
    // animalCat.CatMethod();
    dog.dogMethod();
    cat.catMethod();
  }
}
