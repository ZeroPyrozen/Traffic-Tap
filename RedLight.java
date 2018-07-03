import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class RedLight here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class RedLight extends Button
{
    public void act() 
    {
        // Add your action code here
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            setImage("RedLightMode CLR.png");
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Button.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    setImage("RedLightMode PSRD.png");
                }
            }
        }
        if(Greenfoot.mouseClicked(this))
        {
            
        }
    }    
}
