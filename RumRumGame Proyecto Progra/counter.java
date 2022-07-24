import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter extends Actor
{
    int contar =0;
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
      setImage(new GreenfootImage("LAPS : " + contar, 50, Color.WHITE, Color.BLACK));
      
      
    }
    
    public void adcontar()
    {
        contar++;
    }
}
