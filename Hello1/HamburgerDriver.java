public class HamburgerDriver{
        public static void main(){
           Hamburger hamburger1 = new Hamburger();
           System.out.println(hamburger1.toString());
           Hamburger h3 = new Hamburger(true,3,"swiss");
           System.out.println(h3.toString());
        }
    }