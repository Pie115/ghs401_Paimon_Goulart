import javax.swing.JOptionPane;
public class WhileLoops
{ 
    
    public static void main(){
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter age"));
        while(age<0||age>120){
            age = Integer.parseInt(JOptionPane.showInputDialog("Please enter a correct age"));
   
        }
     System.out.println("wow thats cool");
    }
}
