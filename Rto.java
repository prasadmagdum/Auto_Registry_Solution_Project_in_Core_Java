
import java.util.Scanner; 
 
public class Rto { 
    Scanner s = new Scanner(System.in); 
    public Vehicle regVehicle() { 
        System.out.println("Enter Registration Id:"); 
        int reg = s.nextInt(); s.nextLine(); 
        
        System.out.println("Enter owner  name:"); 
        String owner = s.nextLine();
       
        
        System.out.println("Enter model name:"); 
        String model = s.nextLine(); 
        
        System.out.println("Enter a price:"); 
        int price = s.nextInt(); s.nextLine(); 
       
        System.out.println("Enter colour name:"); 
        String colour = s.nextLine(); 
        
        System.out.println("Enter your adhaar card no.:"); 
        long adhaar = s.nextLong(); s.nextLine(); 
       
        System.out.println("Enter mobile no.:"); 
        long mobile = s.nextLong(); s.nextLine();  
        
        System.out.println("Enter city:"); 
        String city = s.nextLine(); 
        
        Vehicle v = new Vehicle(reg,price,owner,model,colour,city,adhaar,mobile); 
        return v; 
    } 
 
    public void viewDetails(Vehicle v) { 
 
        System.out.println("==========Information=========="); 
        System.out.println("Registration id: " + v.regId); 
        System.out.println("Owner name: " + v.ownername); 
        System.out.println("Model name: " + v.modelno); 
        System.out.println("Price: " + v.price); 
        System.out.println("Colour: " + v.colour); 
        System.out.println("Adhaar No.: " + v.adhaarno); 
        System.out.println("Mobile No.: " + v.mobno); 
        System.out.println("City: " + v.city); 
    } 
 
    public Vehicle updateVehicle(Vehicle v) {
       
        System.out.println("Enter your choice:"); 
        int ch = s.nextInt(); 
        s.nextLine(); 
 
        switch (ch) { 
 
            case 1: 
                System.out.println("Enter new Registration Id:"); 
                v.regId = s.nextInt(); 
                s.nextLine(); 
                break; 
            case 2: 
                System.out.println("Enter new owner name:"); 
                v.ownername = s.nextLine(); 
                break; 
            case 3: 
                System.out.println("Enter new model name:"); 
                v.modelno = s.nextLine(); 
                break; 
            case 4: 
                System.out.println("Enter new price:"); 
                v.price = s.nextInt(); 
                s.nextLine();  
                break; 
            case 5: 
                System.out.println("Enter new colour name:"); 
                v.colour = s.nextLine(); 
                break; 
            case 6: 
                System.out.println("Enter your new adhaar no.:"); 
                v.adhaarno = s.nextLong(); 
                s.nextLine(); 
                break; 
            case 7: 
                System.out.println("Enter new mobile no.:"); 
                v.mobno = s.nextLong(); 
                s.nextLine();  
                break; 
            case 8: 
                System.out.println("Enter new city:"); 
                v.city = s.nextLine(); 
                break; 
 
            default: 
              System.out.println("Entered wrong choice...."); 
        } 
        return v; 
    } 
}

