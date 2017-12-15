public abstract class Shape {
  int x, y;
  String Color;

  void moveTo(int x, int y) {
    this.x = x;
    this.y = y;
  }

  abstract void draw();
}
