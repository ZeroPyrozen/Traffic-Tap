import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class GreenLight here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class GreenLight extends Button
{
    int check = 0;
    GreenfootSound effect = new GreenfootSound("Button Effect.mp3");
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null)
        {
            setImage("GreenLightMode CLR.png");
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Button.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    setImage("GreenLightMode PSRD.png");
                }
            }
        }
        if(Greenfoot.mouseClicked(this))
        {
            effect.play();
            check = 1; 
            Greenfoot.setWorld(new Playfield());
        }
    }
    public int getCheck()
    {
        return check;
    }
}
