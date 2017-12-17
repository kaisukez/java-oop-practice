package hero_class;

public class George extends BasicSuperHero {
  public George(String name) {
    super(name);
  }

  public void specialAttack() {
    System.out.println("George Power!!");
  }

  public void boostPower(int value) {
    System.out.println(this.name + "'s power is increased by " + value + " points");
  }
}
