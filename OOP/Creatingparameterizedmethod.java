package OOP;



//parametarized  method

public class Creatingparameterizedmethod {


        String name;
        String gender;
        int phone; 
        void setparameter(String n, String g ,int P)
        {
            name = n;
            gender = g;
            phone = P;
                
        }


        void displayparameter()
        {

              System.out.println("Name: "+name);
              System.out.println("Gender: "+gender);
              System.out.println("Phone: "+phone);


        }
    
}
