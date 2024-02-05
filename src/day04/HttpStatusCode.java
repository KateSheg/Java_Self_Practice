package day04;


public class HttpStatusCode {
  
  public static String giveStatusCode(int e) {
    String s = "";
    switch (e) {
      case 200: { s = "OK"; break; }
      case 201: { s = "Created"; break; }
      case 202: { s = "Accepted"; break; }
      case 301: { s = "Moved Permanently"; break; }
      case 303: { s = "See Other"; break; }
      case 304: { s = "Not Modified"; break; }
      case 307: { s = "Temporary Redirect"; break;}
      case 400: { s = "Bad Request"; break; }
      case 401: { s = "Unauthorized"; break; }
      case 403: { s = "Forbidden"; break; }
      case 404: { s = "Not Found"; break; }
      case 410: { s = "Gone"; break; }
      case 500: { s = "Internal Server Error"; break; }
      case 503: { s = "Service Unavailable"; break; }
      default: { s = "Invalid number"; break; }
    }
    return s;
  }
  public static void main(String[] args) {
    int code = 210;
    System.out.println("Code " + code + " means " +giveStatusCode(code));
  }
}
