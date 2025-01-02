package javapractice;

public class Person {
     private String name="abhi";
    private int age=24;
    private String country="india";
    public void setName(String name) {
        this.name = "avinash";
    }
    public void setAge(int age) {
        this.age = 25;
    }
    public void setCountry(String country) {
        this.country = "usa";
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCountry() {
        return country;
    }
    public void disp()
    {
        System.out.println("name:"+name);

        System.out.println("age:"+age);

        System.out.println("country:"+country);
    }

    public static void main(String[] args) {
        Person p=new Person();
        p.setName("avinash");
        p.setAge(25);
        p.setCountry("USA");
        p.disp();
    }

}
