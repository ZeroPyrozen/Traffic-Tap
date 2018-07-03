import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Sound here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class Sound extends Button
{
    /**
     * Act - do whatever the Sound wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */
    int i = 1;
    GreenfootSound bgm;
    public Sound(GreenfootSound music)
    {
        bgm = music;
    }
    public void act() 
    {
        Playfield.backgroundMusic.stop();
        Tutorial.backgroundMusic.stop();
        Credits.backgroundMusic.stop();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), Button.class);
            for (Object object : objects)
            {
                if (object == this)
                {
                    if(Greenfoot.mouseClicked(this))
                    {
                        i++;
                        if(i == 1)
                        {
                            bgm.setVolume(30);
                            setImage("Volume +++.png");      
                        }
                        if(i == 2)
                        {
                            bgm.setVolume(20);
                            setImage("Volume ++.png"); 
                                        
                        }
                        if(i == 3)
                        {
                            bgm.setVolume(10);
                            setImage("Volume +.png");             
                        }
                        if(i == 4)
                        {
                            bgm.setVolume(0);
                            setImage("Volume x.png");       
                        }
                        if(i==5)
                        {    
                            setImage("Volume +++.png"); 
                            bgm.setVolume(30);
                            i =0;
                        }
                    }
                }
            }
        }  
    }    
}
