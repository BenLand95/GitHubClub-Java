//Import java utilities
import java.util.Arrays;
import java.util.ArrayList;

//define class
class Playlist {
  //Create main method
  public static void main(String[] args) {
    //make Array for favorite songs ex. {"author - songTitle"}
    String[] favoriteSongs = {
      "Shinedown - Shed Some Light",
      "Disturbed - Sound of Silence",
      "Falling in Reverse - The Drug in Me is Reimagined",
      "Earth Wind & Fire - Mighty Mighty",
      "Earth Wind & Fire - Serpentine Fire",
      "Gloria Estefan - Be Real",
      "Saliva - Click Click Boom",
      "Frank Sinatra - Somewhere Beyond the Sea",
      "Fools Never Die - Nocturnal Rites",
      "Seo Lin - Oro Se do Bheatha Bhaile"
       };

      /*Print first 3 songs of favoriteSongs Array 
      System.out.println(favoriteSongs[0]);
      System.out.println(favoriteSongs[1]);
      System.out.println(favoriteSongs[2]);
      */

      //Create arrayList desertIslandPlaylist
      ArrayList<String> desertIslandPlaylist = new ArrayList<>();

      //Add five songs to new ArrayList that were not in previous Array
      desertIslandPlaylist.add("Bryce Vine - Sour Patch Kids");
      desertIslandPlaylist.add('\n' + "Alec Benjamin - Let Me Down Slowely");
      desertIslandPlaylist.add("VoicePlay - My Mother Told Me");
      desertIslandPlaylist.add("VoicePlay - Drunken Sailor");
      desertIslandPlaylist.add("Lana Del Rey - Video Games");  

      /*Print ArrayList
      System.out.println(desertIslandPlaylist);  
      */

      //Add all of the Array to the ArrayList using addAll() and Arrays.asList() 
      desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

      //Print ArrayList
      System.out.println(desertIslandPlaylist); 

      //Print size of ArrayList
      System.out.println(desertIslandPlaylist.size());

      //Remove 5 songs
      desertIslandPlaylist.remove(13);
      desertIslandPlaylist.remove(11);
      desertIslandPlaylist.remove(10);
      desertIslandPlaylist.remove(1);
      desertIslandPlaylist.remove(0);

      //Print ArrayList
      System.out.println(desertIslandPlaylist);

      //Create int songA & songB variables for two songs from ArrayList using .indexOf()
      int songA = desertIslandPlaylist.indexOf("VoicePlay - Drunken Sailor");
      int songB = desertIslandPlaylist.indexOf("Lana Del Rey - Video Games");

      System.out.println(songA);

      //Create Strin tempA with value associated above variable
      String tempA = "VoicePlay - Drunken Sailor";

      //Replace songA with songB using set()
      desertIslandPlaylist.set(songA, "Lana Del Rey - Video Games");

      //Print ArrayList
      System.out.println(desertIslandPlaylist);

      //Call set() on ArrayList with index of songB and tempA
      desertIslandPlaylist.set(songB, tempA);

      //Print ArrayList to see songA and songB to be swapped
      System.out.println(desertIslandPlaylist);
      
      //Create method that shuffles song order

      //Reverse the song order
           
  }
}