package day04;

public class MonthName {

public static String monthName2 (int i) {
  String s = "";
  switch (i) {
    case 1: {
      s = "January";
      break;
    }
    case 2: {
      s = "February";
      break;
    }
    case 3: {
      s = "March";
      break;
    }
    case 4: {
      s = "April";
      break;
    }
    case 5: {
      s = "May";
      break;
    }
    case 6: {
      s = "June";
      break;
    }
    case 7: {
      s = "July";
      break;
    }
    case 8: {
      s = "August";
      break;
    }
    case 9: {
      s = "September";
      break;
    }
    case 10: {
      s = "October";
      break;
    }
    case 11: {
      s = "November";
      break;
    }
    case 12: {
      s = "December";
      break;
    }
    default: {
      s = "No such month";
      break;
    }
  }
  return s;
}


  public static void main(String[] args) {
    int i = 21;
    System.out.println(monthName2(i));
    
  }
}
