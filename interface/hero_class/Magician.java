package hero_class;
import hero_interface.Hero;

public class Magician implements Hero {
  protected String name;
  protected int[] position;

  public Magician(String name) {
    this.name = name;
    this.position = defaultPosition;
  }

  public void getName() {
    System.out.println(name);
  }

  public void getPosition() {
    System.out.println(name + " is at [" + position[0] + ", " + position[1] + "]");
  }

  public void setName(String name) {
    this.name = name;
  }

  public void moveTo(int[] position) {
    this.position = position;
  }

  public void specialAttack() {
    System.out.println("Cyclone!");
  }
}
