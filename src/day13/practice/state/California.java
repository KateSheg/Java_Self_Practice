package day13.practice.state;

public class California extends State{
  
  public California(String politicalParty, String governor, String senator, int population) {
    super("California","CA",politicalParty,governor,senator,population);
  }
  
  @Override
  public String toString() {
    return "California: CA, politicalParty=" + getPoliticalParty() +
            ", governor=" + getGovernor() +
            ", senator=" + getSenator() +
            ", population=" + getPopulation();
  }
}
