import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador2 extends Actor
{
    /**
     * Act - do whatever the Jugador2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
            if (Greenfoot.isKeyDown("left"))
            {
                turn(-10);
                
            }
            
            if (Greenfoot.isKeyDown("right"))
            {
                turn(10);
            }// Add yo
            
            if (Greenfoot.isKeyDown("up"))
            {
                move(10);
            }// Add your // Ad// Add your action code here.
            
            if (Greenfoot.isKeyDown("down"))
            {
                move(-2);
            }  
            
            if (Greenfoot.isKeyDown("<"))
            {
                move(30);
            }    
            
            if (getOneIntersectingObject(muro.class) !=null)
            {
                move(-10);
            }
            Actor meta;
            meta= getOneObjectAtOffset(0,0,meta.class);
            
            if(meta != null)
            {
             World world;
             world = getWorld();
            
             Background mundo = (Background)world;
             
             counter cont = mundo.getCounter();
             cont.adcontar();
            }

    }
}
