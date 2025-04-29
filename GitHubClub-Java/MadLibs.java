public class MadLibs {
  /*
  This program generates a mad libbed adventure.
  Authpr: Ben
  Date: 1/15/2025
  */
  	public static void main(String[] args){
      
      //The area where variables are stored to represent the blanks
      String name1 = "Fred";
      String adjective1 = "fast";
      String adjective2 = "pretty";
      String adjective3 = "robust";
      String verb1 = "lift";
      String noun1 = "beach";
      String noun2 = "ocean";
      String noun3 = "field";
      String noun4 = "airplane";
      String noun5 = "battleship";
      String noun6 = "hammock";
      String name2 = "Daphnie";
      int number = 69;
      String place1 = "Gulf of Mexico";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
