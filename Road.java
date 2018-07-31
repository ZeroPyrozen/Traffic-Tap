import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Road here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class Road extends UI
{
    /*
       long elapsedTime = System.currentTimeMillis() - startTime;
       long elapsedSeconds = elapsedTime / 1000;
       long secondsDisplay = elapsedSeconds % 60;
       long elapsedMinutes = elapsedSeconds / 60;
       */
    private int counter = 0;
    public static float speed = 1;
    public final static float velocity = 0f;
    public int posY = 0;
    private long elapsedTime = 0,startTime = 0;
    public Road()
    {
        Playfield a = (Playfield)getWorld();
        //startTime = a.getStartTime();
    }
    public void act() 
    {
        elapsedTime = System.currentTimeMillis();
        Playfield a = (Playfield)getWorld();
        if(a!=null&&(elapsedTime-a.getStartTime())/1000%10==0)
        {
            speed = changeSpeed();
        }
        movement();
        if (getY() >= getWorld().getHeight()/2 + getImage().getHeight())
        {
            generateRoad();
            getWorld().removeObject(this);
            return;
        }
        if(getX()>getWorld().getHeight())
        {
            getWorld().removeObject(this);
            return;
        }
    }
    public void generateRoad()
    {
        Road jalan = new Road();
        getWorld().addObject(jalan, getWorld().getWidth()/2,(getWorld().getHeight()/2) - getImage().getHeight());
    }
    private void movement()
    {
        setLocation(getX(),(int)(getY()+speed));
        speed+=velocity;
    }
    private int changeSpeed()
    {
        return 1;
    }
    public static float getSpeed()
    {
        return speed;
    }

}
