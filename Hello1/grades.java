import javax.swing.JOptionPane;
public class grades
{
  public static void main(){
      boolean notreal = false;
      int grade = Integer.parseInt(JOptionPane.showInputDialog("Please enter a real percent grade"));
      if(grade<0||grade>100){
      while(notreal == false){
          grade = Integer.parseInt(JOptionPane.showInputDialog("Please enter a real percent grade"));
          if(grade<100||grade>0){
              notreal = true;
            }
        }
    }
       else if(grade>=90&&grade<=100){
           System.out.println("You have A");
        }
       else if(grade>=80&&grade<=89){
           System.out.println("You have B");
        }
       else if(grade>=70&&grade<=79){
           System.out.println("You have C");
        }
       else if(grade>=60&&grade<=69){
           System.out.println("You have D");
        }
       else if(grade>=0&&grade<=59){
           System.out.println("You have F");
        }
    }
}
