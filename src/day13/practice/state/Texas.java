package day13.practice.state;

public class Texas extends State{
  
  public Texas(String politicalParty, String governor, String senator, int population) {
    super("Texas","TX",politicalParty,governor,senator,population);
  }
  
  @Override
  public String toString() {
    return "Texas: TX, politicalParty=" + getPoliticalParty() +
            ", governor=" + getGovernor() +
            ", senator=" + getSenator() +
            ", population=" + getPopulation();
  }
}