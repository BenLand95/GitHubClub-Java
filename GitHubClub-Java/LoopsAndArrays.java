// Import statement:
import java.util.ArrayList;

//Define class
class PrimeDirective {
  
  // This method will check if a number is prime or not
  public boolean isPrime(int number){
    
    if(number == 2){
      return true;
    }else if(number < 2){
      return false;
    }
    //for loop to check if number is not prime
    for(int i = 2; i < number; i++){
      if(number % i == 0){
        return false;
      }
    }
    return true;
  }

  //This method will take prime numbers from isPrime and strore them into an array
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();

    for(int number : numbers){
     if(isPrime(number)){
       primes.add(number);
     }
    }

    return primes;
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));

    System.out.println(pd.onlyPrimes(numbers));

  }  

}