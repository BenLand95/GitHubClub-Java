class Mayan extends Language{

    public Mayan(String mayaName, int mayaSpeakers){
    
    super(mayaName, mayaSpeakers, "Central America", "verb-object-subject");
  }

  @Override
  public void getInfo(){
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The Language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + "is an ergative language.");
  }
  
}