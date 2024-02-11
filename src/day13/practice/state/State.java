package day13.practice.state;

public class State {
  private String name;
  private String abbreviation;
  private String politicalParty;
  private String governor;
  private String senator;
  private int population;
  
  public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
    setName(name);
    setAbbreviation(abbreviation);
    setPoliticalParty(politicalParty);
    setGovernor(governor);
    setSenator(senator);
    setPopulation(population);
  }
  
  public String getName() {
    return name;
  }
  
  public String getAbbreviation() {
    return abbreviation;
  }
  
  public String getPoliticalParty() {
    return politicalParty;
  }
  
  public String getGovernor() {
    return governor;
  }
  
  public String getSenator() {
    return senator;
  }
  
  public int getPopulation() {
    return population;
  }
  
  public void setName(String name) {
    if (isNotNullEmptyBlank(name)) this.name = name;
    //else though new exception
  }
  
  public void setAbbreviation(String abbreviation) {
    if (isNotNullEmptyBlank(abbreviation)) this.abbreviation = abbreviation;
  }
  
  public void setPoliticalParty(String politicalParty) {
    if (isNotNullEmptyBlank(politicalParty)) this.politicalParty = politicalParty;
  }
  
  public void setGovernor(String governor) {
    if (isNotNullEmptyBlank(governor)) this.governor = governor;
  }
  
  public void setSenator(String senator) {
    if (isNotNullEmptyBlank(senator)) this.senator = senator;
  }
  
  public void setPopulation(int population) {
    if (population>0) this.population = population;
  }
  
  public boolean isNotNullEmptyBlank(String s) {
    if (s.isBlank() || s.isEmpty() || s==null) return false;
    else return true;
  }
  
  @Override
  public String toString() {
    return "State {" +
            "name='" + name + '\'' +
            ", abbreviation='" + abbreviation + '\'' +
            ", politicalParty='" + politicalParty + '\'' +
            ", governor='" + governor + '\'' +
            ", senator='" + senator + '\'' +
            ", population=" + population +
            '}';
  }
}
