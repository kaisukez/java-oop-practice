public class MainProgram {
  public static void main(String[] args) {
    Cal1 cal1 = new Cal1();
    Cal2 cal2 = new Cal2();

    int num1 = 55;
    int num2 = 44;

    int addCal1 = cal1.add(num1, num2);
    int minusCal1 = cal1.minus(num1, num2);
    int addValueCal1 = cal1.addValue(num1);

    int addCal2 = cal2.add(num1, num2);
    int minusCal2 = cal2.minus(num1, num2);
    int addValueCal2 = cal2.addValue(num1);

    System.out.println(addCal1);
    System.out.println(minusCal1);
    System.out.println(addValueCal1);
    System.out.println();
    System.out.println(addCal2);
    System.out.println(minusCal2);
    System.out.println(addValueCal2);
  }
}
