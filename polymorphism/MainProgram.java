public class MainProgram {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Animal animalDog = new Dog();
    Animal animalCat = new Cat();
    Dog dog = new Dog();
    Cat cat = new Cat();

    animal.MakeSound();
    animalDog.MakeSound();
    animalCat.MakeSound();
    dog.MakeSound();
    cat.MakeSound();

    System.out.println();

    // animalDog.DogMethod();
    // animalCat.CatMethod();
    dog.DogMethod();
    cat.CatMethod();
  }
}
