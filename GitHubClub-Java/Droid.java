public class Droid {

   String name;
   int batteryLevel;

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  public String toString(){
    if(name == "Steve"){
      return "Hello, I'm the better droid " + name + "!";
    } else{
    return "Hello, I'm the droid: " + name + ".";
    }
  }

  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }

  public void energyReport(){
    System.out.println(name + " has " + batteryLevel + "% battery power remaining.");
  }

  public static void main(String[] args){
    Droid Codey = new Droid("Codey");

    System.out.println(Codey);
    Codey.performTask("cleaning dog poop.");
    Codey.performTask("making lunch.");
    Codey.performTask("vacuuming carpet.");
    Codey.energyReport();
    
    System.out.println();

    Droid Steve = new Droid("Steve");
    System.out.println(Steve);
    Steve.performTask("play video games with Elijah");
    Steve.performTask("Play fetch with Artemis");
    Steve.energyReport();

  }

}