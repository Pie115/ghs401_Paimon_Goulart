 import javax.swing.JOptionPane;
public class GreatesttoLeasr
{
   public static void main(){
       int amount = Integer.parseInt(JOptionPane.showInputDialog("How much in array????"));
       while(amount<10||amount>100){
          amount = Integer.parseInt(JOptionPane.showInputDialog("Please Between 10 and 100 nerd????"));
        }
       int[] nerd = new int[amount];
       
       for(int i = 0; i<amount; i = i+1){
           nerd[i] = (int)(Math.random()*91 + 10);
           System.out.print(nerd[i] + " ");
        }
        int max = nerd[0];
        int least = nerd[0];
        for(int i = 0; i <amount; i = i+1){
            if(max < nerd[i]){
                max = nerd[i];
                
            }
              if(least > nerd[i]){
                least = nerd[i];
                
            }
        }
        System.out.println("");
        System.out.println("Greatest: " + max); 
        System.out.println("Least: " + least); 
    }
}
