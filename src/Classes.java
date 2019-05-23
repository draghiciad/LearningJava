public class Classes {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("John");
        human1.setAge(21);
        human1.getInfo();
    }
}

class Human {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("Name is " + name + "and age is " + age);
    }
}


