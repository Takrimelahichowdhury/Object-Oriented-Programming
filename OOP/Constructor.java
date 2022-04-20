package OOP;



public class Constructor {

      String name;
      String gender;
      int phone;
    
      //default constructor
      Constructor()
      {
            System.out.println("NULL");
      }


      //parametarized constructor
      
      Constructor( String n, String g, int p ){

            name = n;
            gender = g;
            phone = p;
 
      }

      void setdisplay(){

            System.out.println("Name: "+name);
            System.out.println("Gender: "+gender);
            System.out.println("Phone Number: "+phone);


      }

    
}
