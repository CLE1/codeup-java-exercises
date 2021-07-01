package oop;

public class Person {
    private String name;
    public static void main(String[] args) {
//        The class should have a constructor that accepts a `String` value and sets
//        the person's name to the passed string.
//        Create a `main` method on the class that creates a new `oop.Person` object and
//        tests the above methods.
//        oop.Person person = new oop.Person("Amado");
        Person person = new Person();
        person.setName("Jesse");
        person.sayHello();
//        oop.Person person1 = new oop.Person("John");
//        oop.Person person2 = new oop.Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        oop.Person person1 = new oop.Person("John");
//        oop.Person person2 = person1;
//        System.out.println(person1 == person2);
//        oop.Person person1 = new oop.Person("John");
//        oop.Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
    public Person(){}
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        //TODO: return the person's name
        return this.name;
    }
    public void setName(String name){
        //TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println("Hello " + this.name + "!");
    }
}
























