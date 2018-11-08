class DisplayMessage {

  public static void main(String []args) {
    displayMessage("Hello", 3);
  }

  static void displayMessage(String msg,int count) {
    int counter = 1;
    while(counter++ <= count) {
      System.out.println(msg);
    }
  }
}
