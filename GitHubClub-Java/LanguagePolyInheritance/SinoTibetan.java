class SinoTibetan extends Language {
  public SinoTibetan(String sinoName, int sinoSpeakers){
      super(sinoName, sinoSpeakers, "Asia", "subject-object-verb");
      if(sinoName.contains("Chinese")){
        this.wordOrder = "subject-verb-object";
      }
    }
  }