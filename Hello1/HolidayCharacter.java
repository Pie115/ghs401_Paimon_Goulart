
public class HolidayCharacter
{
    private String character;
    private boolean hasBeard;
    private int numPresents;
    
    public HolidayCharacter(){
        System.out.println("a holiday character has been created");
        this.hasBeard = true;
        this.numPresents = 0;
        this.character = "Scrooge";
        //set all instance variables to generic values
    }
    public HolidayCharacter (String character, boolean hasBeard, int numPresents){
        this.hasBeard = hasBeard;
        this.numPresents = numPresents;
        this.character = character;
    }
    public String toString()
    {
        String output = "Name: " + character + "\nHas a beard?: " + hasBeard + "\nPresents Delivered:  " + numPresents;
        
        return output;
    }

}
