 import java.util.Scanner; 
 
public class Test { 
 public static void main(String[] args) { 
  Scanner s=new Scanner(System.in); 
  Rto Kolhapur=new Rto(); 
  Vehicle v=null; 
   
  while(true) { 
   System.out.println("+++++++++PM AUTOREGISTRY +++++++++"); 
   System.out.println("1]Registration\n2]View Details\n3]Update Details\n4]Exit"); 
   System.out.println("Enter your choice:"); 
   int ch=s.nextInt();  
   switch(ch) { 
   case 1: 
    v=Kolhapur.regVehicle(); 
    System.out.println("Registration Done..........."); 
    break; 
   case 2: 
    Kolhapur.viewDetails(v); 
    break; 
   case 3: 
    v=Kolhapur.updateVehicle(v); 
    break; 
   case 4: 
    System.out.println("Exit........."); 
    System.exit(0); 
    break; 
   default: 
    System.out.println("Invalid No. Entered"); 
    break; 
   } 
  } 
 } 
 
} 