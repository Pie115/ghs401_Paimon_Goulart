import javax.swing.JOptionPane;
import java.util.Random;
public class HighLoq
{
 public static void main(){
     int highvalue = Integer.parseInt(JOptionPane.showInputDialog("Please enter a high value"));
     int lowvalue = Integer.parseInt(JOptionPane.showInputDialog("Please enter a low value"));
     
     int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter value for array"));
     int evenorodd = 0;
     int odd = 0;
     int even = 0;
     Random dude = new Random();
     if(lowvalue>=highvalue){
         System.out.println("Error high value greater than low value");
        }
     else if(highvalue>lowvalue){
       int inbetween = (highvalue - lowvalue)+1;
       int bucky[]=new int [number]; 
       for(int i=0; i<number; i = i +1){
           bucky[i] = (int)((Math.random() * inbetween + lowvalue));
           evenorodd = (bucky[i]%2);
           if(evenorodd == 0){
           System.out.println("The value is of number " +(i+1) + " is: " +bucky[i]+" which is even");
           even = even+1;
        }
        else if(evenorodd==1){
             System.out.println("The value is of number " +(i+1) + " is: " + +bucky[i]+" which is odd");
             odd = odd +1;
        }
        }
        }
        System.out.println("There are " + even +" evens and there are " +odd +" odds");
   

     
     
     
    }
}
