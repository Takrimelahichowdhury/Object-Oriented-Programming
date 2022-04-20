package OOP;

public class Staticvariable {

     String name;
     int id;
    
     static String university_name="Leading University";

     Staticvariable(String n, int i)
     {
         name = n;
         id = i;

     }

     void setdisplay()
     {
        System.out.println("Name: "+name);
        System.out.println("ID Number: "+id);
        System.out.println("University name: "+university_name);
    }

    
}
