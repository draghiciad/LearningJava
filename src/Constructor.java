public class Constructor {
  public static void main(String[] args) {
    Student student1=new Student();
    student1.showInfo();
    Student student2=new Student("Andrei");
    student2.showInfo();
    Student student3=new Student("George",5);
    student3.showInfo();
  }
}

class Student {
  String name;
  int group;

    Student(){
      System.out.println("Student1 is initialized by default constructor");
      group=4;
    }

    Student(String name){
      System.out.println("Constructor with name parameter.");
      this.name=name;
      group=55;
    }
    Student(String name,int group){
      System.out.println("Constructor with two parameters.");
      this.name=name;
      this.group=group;
    }


    public void showInfo () {
      System.out.println("Name:" + name + ",group:" + group + ".");
    }
  }

