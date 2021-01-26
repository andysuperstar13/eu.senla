package eu.senla.task3;

public class Cat {
    private String name = "Tom";
    private int age = 2;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Cat(String a, int b){
        name = a;
        age = b;
    }
    public Cat(){

    }
}
