public class ClientDate {
  public static void main (String [] args ){
    Date dateTest = new Date(31,4,2022);
    Date dateTest1 = new Date(25,4,2022);
    dateTest1.compareTo(dateTest);
    System.out.println(dateTest.toString());
    System.out.println(dateTest.estBissextile(2100));
    System.out.println(dateTest.dernierJourDuMois(4 ,2022));

  }
}
