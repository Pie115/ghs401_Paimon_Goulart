import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BEE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BEE extends Actor
{
    private int speed;
    /**
     * Act - do whatever the BEE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BEE(){
        System.out.println("Bee has been created");
        this.speed = 1;
    }
    public BEE(int speed){
        System.out.println("Bee has been created with speed");
        this.speed = speed;
    }
    public void act() 
    {
       move(this.speed);
       if(isAtEdge()){
           turn(120);
        }
           
    }    
}
