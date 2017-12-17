package hero_interface;

public interface Hero {
  public static final int[] defaultPosition = new int[]{0, 0};
  public void getName();
  public void getPosition();
  public void setName(String name);
  public void moveTo(int[] position);
  public void specialAttack();
}
