
public class Hamburger
{
    private boolean hasLettuce;
    private int numPatties;
    private String cheeseType;
    public Hamburger(){
        System.out.println("a hamburger has been created");
        this.hasLettuce = false;
        this.numPatties = 0;
        this.cheeseType = "Cheddar";
        //set all instance variables to generic values
    }
    public Hamburger (boolean hasLettuce, int numPatties, String cheeseType){
        this.hasLettuce = hasLettuce;
        this.numPatties = numPatties;
        this.cheeseType = cheeseType;
    }
    public String toString()
    {
        String output = "Has letuce: " + hasLettuce + "\nPatties: " + this.numPatties + "\nCheese Type:  " + cheeseType;
        
        return output;
    }

    
}
