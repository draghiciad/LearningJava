public class StaticKeyWord {
  public static void main(String[] args) {
    Employee e1 = new Employee("Andrei", 33);
    Employee e2 = new Employee("Daniel", 44);
    Employee.company = "Google";

    System.out.println("Company Name: " + Employee.company);
    Employee.getCompanyName();
    e1.getCompany();
  }
}

class Employee {
  String name;
  int age;
  static String company;

  Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void getCompanyName() {
    System.out.println("From static method " + company);
  }

  public void getCompany() {
    System.out.println("From non static method " + company);
  }
}

