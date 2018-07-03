import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * This Class is for Back Button in Main Menu GUI.
 * 
 * @Pyrozen
 * @version (a version number or a date)
 */
public class Back extends Button
{
    GreenfootSound effect = new GreenfootSound("Back Effect.mp3");
    public void act() 
    {
        // Add your action code here
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            setImage("BackButton CLR.png");
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Button.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    setImage("BackButton PSRD.png");
                }
            }
        }
        if(Greenfoot.mouseClicked(this))
        {
            effect.play();
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
