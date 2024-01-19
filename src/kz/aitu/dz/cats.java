package kz.aitu.dz;
public class cats {
    private String name;
    private Integer age;
    private String color;
    public cats (String name, Integer age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void name(){
        System.out.println("Cat's name is "+name);
    }
    public void age(){
        System.out.println(name+" "+ +age+ " years old");
    }
    public void color(){
        System.out.println("It's "+color+" colored");
    }
    public String getName(){
        System.out.println("Getter for name was called");
        return name;
    }
    public void setName(){
        if(name==null){
            throw new IllegalArgumentException();
        }
        this.name=name;

    }
    public void meow(){

    }

}