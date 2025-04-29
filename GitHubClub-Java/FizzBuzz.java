//This program is supposedly created to weed out a certain percentage of programmers.
//Invented by Imram Ghory
//Created by Ben Landgrave
//February 22, 2025
class FizzBuzz {
  public static void main(String[] args) {
  /*write loop for numbers 1-100
  At multiples 3 print "Fizz" 
  at multiples of 5 print "Buzz"
  for both 3 and 5 print "FizzBuzz" 
  */
    for(int i = 1; i<=100; i++){
      if(i % 3 == 0 && !(i % 5 == 0)){
        System.out.println("Fizz");
      }else if(i % 5 == 0 && !(i % 3 == 0)){
        System.out.println("Buzz");
      }else if(i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz");
      }else{
      System.out.println(i);
      }
    }
  }
}