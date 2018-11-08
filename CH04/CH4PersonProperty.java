
class PersonX {
  String name;

  public String getName() {
    return this.name;
  }
  public void setName(String arg) {
    this.name = arg;
  }

  public static void main(String []args) {
    PersonX person = new PersonX();
    person.setName("John Doe");
    System.out.println(person.getName());
  }
}
