package SectionA;

public class Student {

    private String name;
    private int age;
    private int ID;

    public Student(String name, int age, int ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getID(){
        return ID;
    }
    public String getUsername() {
        return name + age;
    }
}
