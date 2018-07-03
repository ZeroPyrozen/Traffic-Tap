import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Exit here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Button
{
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            setImage("Exit CLR.png");
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Button.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    setImage("Exit PSRD.png");
                }
            }
        }

        if(Greenfoot.mouseClicked(this))
        {
            int count = 11;
            int counter = 600;
            int dly = 1;
            for(int i = 0; i < 660;i++)
            {
                if(i % 60 == 0)
                {
                    count--;
                }
                getWorld().showText("Game will end in "+ count + " second(s)", getWorld().getWidth()/2, 15);
                Greenfoot.delay(dly); 
            }
            System.exit(0);
        }
    }    
}
