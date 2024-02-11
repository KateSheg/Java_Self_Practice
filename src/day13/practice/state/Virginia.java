package day13.practice.state;

public class Virginia extends State{
  
  public Virginia(String politicalParty, String governor, String senator, int population) {
    super("Virginia","VA",politicalParty,governor,senator,population);
  }
  
  @Override
  public String toString() {
    return "Virginia: VA, politicalParty=" + getPoliticalParty() +
            ", governor=" + getGovernor() +
            ", senator=" + getSenator() +
            ", population=" + getPopulation();
  }
}
