import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Rider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rider extends Button
{
    GreenfootSound effect = new GreenfootSound("Button Effect.mp3");
    /**
     * Act - do whatever the Rider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        MouseInfo mouse = Greenfoot.getMouseInfo();
       if (mouse != null)
       {
       setImage("Rider CLR.png");
        List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Button.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    setImage("Rider PSRD.png");
                }
            }
       }
       if(Greenfoot.mouseClicked(this))
       {
           effect.play();
           Greenfoot.setWorld(new RaiderMenu());
       }
    }    
}
