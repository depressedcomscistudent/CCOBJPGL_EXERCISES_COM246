
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 public class Exercise {
 
     public static void main(String[] args) throws FileNotFoundException {
        Scanner loginScanner = new Scanner(System.in);

         System.out.println("Enter your username:");
 
         String username_from_input = loginScanner.nextLine();
 
         System.out.println("Enter your Password:");
 
         String password_from_input = loginScanner.nextLine();
 
         File myfile = new File("accounts.txt");

    User me = new User(username_from_input, password_from_input);

         Scanner fileScanner = new Scanner(myfile);

         while(fileScanner.hasNextLine()){
             String filedata = fileScanner.nextLine();           

             String[] data = filedata.split(",");

                String username_from_file = data[0];
                String password_from_file = data[1];

             if (username_from_input.equals(username_from_file) && password_from_input.equals(password_from_file)) {      
                System.out.println("Login Succesfully, Hello " + me.getUsername());
                break;
            }
            else{
                System.out.println("Login Failed");
            }
            fileScanner.close();
        }   
           loginScanner.close();
    }
}