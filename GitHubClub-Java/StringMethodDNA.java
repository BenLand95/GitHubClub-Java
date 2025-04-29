/*This program checks whether a strand of DNA contains a protein
//Created 2/25/25
//Ben Landgrave
*/


/*protein starts with ATG and ends with TGA
sequence of 3 nucleotides between. Meaning sequence length is divisible by 3
*/

public class DNA {

  public static void main(String[] args) {

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna3;
    System.out.println("Length: " + dna.length());

    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");

    System.out.println("Start: " + dna.indexOf("ATG"));
    System.out.println("End: " + dna.indexOf("TGA"));

    if(start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      System.out.println("Condition 1, 2, and 3 are satisfied.");
      String protein = dna.substring(start, stop + 3);
      System.out.println("Protein: " + protein);
    }else {
      System.out.println("No protein");
    }
  }
}