import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GenerateLamp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenerateLamp extends Actor
{
    /**
     * Act - do whatever the GenerateLamp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int randNum = 0;
    private int counter = 0;
    public void act()
    {
        // Add your action code here.
        randNum = Greenfoot.getRandomNumber(60);
        counter++;
        if(counter == 100)
        {
             generateLampBaru(randNum);
             counter = 0;
        }
        if(getY() == getWorld().getHeight())
        {
            getWorld().removeObject(this);
        }
        
    }
    public void generateLampBaru(int space) 
    {
        int state = 0;
        TrafficLight lampu1;
        state = Greenfoot.getRandomNumber(3);
        lampu1 = new TrafficLight();
        lampu1.setState(state);
        ZebraCross zebra = new ZebraCross(state);
        getWorld().addObject(zebra, getWorld().getWidth()/2, 0);
        getWorld().addObject(lampu1, getWorld().getWidth()/2+100, 0);
    }
}
