import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class RedHeartsTengah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedHeartsTengah extends RedHearts
{
    /**
     * Act - do whatever the RedHeartsTengah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()   
    {  
        Check();
    }   
    public void Check()
    {
        if (!getWorld().getObjects(TrafficLight.class).isEmpty())   
        {
            List <TrafficLight> Traff = getWorld().getObjects(TrafficLight.class);
            int state = Traff.get(0).GetState();    
            if (Traff.get(0).CheckTouch() == true)
            {
                if(state == 0)
                {
                    if(RedHearts == 1)
                    {
                        
                        if (Con == 0)
                        {
                            RedHearts++;
                            Con++;
                            Con = 0;
                            setImage("RedHearts DED.png");
                        } 
                    }
                }
            }
        }
    }  
}
