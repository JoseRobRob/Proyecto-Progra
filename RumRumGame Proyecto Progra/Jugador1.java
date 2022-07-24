import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador1 extends Actor
{
    public Jugador1()
    {
    
    
    }


    
    
    public void act()
    
    
    
    {
    
        if (Greenfoot.isKeyDown("a"))
            {
                turn(-10);
                
            }// Add yo    
            
        if (Greenfoot.isKeyDown("d"))
            {
                turn(10);
                
            }// Add yo
            
            if (Greenfoot.isKeyDown("w"))
            {
                move(10);
                
            }// Add your // Ad// Add your action code here.
            
            if (Greenfoot.isKeyDown("s"))
            {
                move(-2);
            }   
            
            if (Greenfoot.isKeyDown("f"))
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
