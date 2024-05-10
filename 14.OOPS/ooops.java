public class ooops {
    public static void main(String[] args){
        Pen p1 = new Pen();// created  a pen object called p1
        p1.setColor("blue");
        // System.out.println(p1.color);

        // p1.color ="yellow";

        BankAccount myacc = new BankAccount();
        myacc.username = "Naman";
        myacc.setPwd("aaaaaa");
        // We cant print password here as it is private tot he given class

        System.out.println(p1.getColor());
        Student s1 = new Student("naman");
        System.out.println(s1.name);


    }
    
}


class BankAccount{
    public String username;
    private String password;
    public void setPwd(String pwd)
    {
        password = pwd;
    }
}

class Pen{

    //property
    //function


    private String color;
    int tip;


    void setColor(String newcolor)
    {
        this.color = newcolor;
    }

    String getColor()
    {
        return this.color;
    }

    void setTip(int newTip)
    {
        tip = newTip;
    }
}

class Student{
    String name ;
    int age;
    float percentage;

    Student(String name)
    {
        this.name = name;
    }

    // void calcpercentage(int phy,int chem, int maths)
    // {
    //     percentage = (phy+chem+maths)/3;
    // }
}
