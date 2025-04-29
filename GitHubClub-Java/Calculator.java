/*this program is the first bare boes of a calculator. Will add ReadText functionality once the course gets there :)
Ben 2025*/
public class Calculator {
  public Calculator() {

  }
  public int add(int a, int b){
    return a + b;
  }
  public int subtract(int a, int b){
    return a - b;
  }
  public int multiply(int a, int b){
    return a * b;
  }
  public int divide(int a, int b){
    return a / b;
  }
    public int module(int a, int b){
    return a % b;
  }

  public static void main(String[] args){
    Calculator myCalculator = new Calculator();

    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.multiply(5,7));
    System.out.println(myCalculator.divide(35,7));
    System.out.println(myCalculator.module(21,6));
  }
}