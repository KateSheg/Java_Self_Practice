package day13.practice.state;

public class Florida extends State{
  
  public Florida(String politicalParty, String governor, String senator, int population) {
    super("Florida","FL",politicalParty,governor,senator,population);
  }
  
  @Override
  public String toString() {
    return "Florida: FL, politicalParty=" + getPoliticalParty() +
            ", governor=" + getGovernor() +
            ", senator=" + getSenator() +
            ", population=" + getPopulation();
  }
}
