package Pass_Mechanism;

public class pass_in_reference {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println("Before change: " + person.getName()); // Output: John
        person.changeName("Doe");
         // This will change the name of the person object
         // because we are passing the reference to the object
         // and modifying its internal state.
        System.out.println("After change: " + person.getName()); // Output: Doe
    }
}

class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void changeName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}