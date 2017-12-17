import hero_interface.Hero;
import hero_interface.SuperHero;
import hero_class.Magician;
import hero_class.George;

public class MainProgram {
  public static void main(String[] args) {
    Hero john = new Magician("John");
    john.getName(); // John
    john.getPosition(); // John is at [0, 0]
    john.specialAttack(); // Cyclone!
    System.out.println();

    john.setName("newJohn");
    john.moveTo(new int[]{11, 22});
    john.getName(); // newJohn
    john.getPosition(); // newJohn is at [11, 22]
    System.out.println(john.defaultPosition[0] + " " + john.defaultPosition[1]); // 0 0
    System.out.println();

    SuperHero george = new George("George");
    george.getName(); // George
    george.getPosition(); // George is at [0, 0]
    george.specialAttack(); // George Power!!
    george.boostPower(1000); // George's power is increased by 1000 points
  }
}
