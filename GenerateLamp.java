import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GenerateLamp here.
 * 
 * @Pyrozen 
 * @version (a version number or a date)
 */
public class GenerateLamp extends Actor
{
    private int randomSpacing = 0;
    private int randNum = 0;
    private int counter = 0;
    
    public GenerateLamp()
    {
        randomSpacing = Greenfoot.getRandomNumber(10);
    }
    
    public void act()
    {
        randNum = Greenfoot.getRandomNumber(60);
        counter++;
        if(counter == randomSpacing)
        {
            generateLampBaru(randNum);
            counter = 0;
            randomSpacing = 100 + Greenfoot.getRandomNumber(100);
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
