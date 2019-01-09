
public class SquareRange
{
        public static void main(){
            int square = 0;
            int inbetween = 0;
            int randomnumb = 0;
            
            String[] favoritesong = new String[3];
            String[] favoritemovie = new String[3];
            
            favoritesong[0] = "DROSE";
            favoritesong[1] = "ESKETIT";
            favoritesong[2] = "ISHYNE";
            
            favoritemovie[0] = "TRANFORMERS MICHAEL BAY";
            favoritemovie[1] = "TRANFORMERS MICHAEL BAY 2";
            favoritemovie[2] = "TRANFORMERS MICHAEL BAY 3";
            int hello = 0;
            for(int i = 1;i<11;i = i+1){
                square = (i*i);
                inbetween = square - i+1;
                randomnumb = (int)(Math.random()*inbetween + i);
              
                
                if(randomnumb == i){
                System.out.println(i+"\t"+square+ "\t"+ randomnumb+"\t" + "the random value is equal to the index");
            }
            else if(randomnumb==square){
                System.out.println(i+"\t"+square+ "\t"+ randomnumb+"\t" + "the random value is equal to the square of the index");
            }
            else{
                  System.out.println(i+"\t"+square+ "\t"+ randomnumb+"\t");
            }
          
        }
          for(int j = 0;j<favoritesong.length;j=j+1){
                System.out.println(favoritesong[j]);
            }
            
          while(hello < favoritemovie.length){
          if(hello==favoritemovie.length-1)
          {System.out.print(favoritemovie[hello]);
            }
            else{
          System.out.print(favoritemovie[hello] + ", ");
        }
          hello = hello+1;
        }
      
    }
}