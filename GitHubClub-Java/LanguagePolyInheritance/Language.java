class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String langName, int langSpeakers, String langRegionsSpoken, String langWordOrder){
    this.name = langName;
    this.numSpeakers = langSpeakers;
    this.regionsSpoken = langRegionsSpoken;
    this.wordOrder = langWordOrder;
  }

  public void getInfo(){
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: [ " + this.wordOrder + "].");
  }

  public static void main(String[] args ){
    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");

    Mayan chuj = new Mayan("Chuj", 61630);

    SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 1390000000);
    SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);

    mandarinChinese.getInfo();

    burmese.getInfo();


    chuj.getInfo();
  }
}