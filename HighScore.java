import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScore here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class HighScore extends Actor
{
    public Car c;
    public void act() 
    {
        c = (Car)getOneObjectAtOffset(0,0, ZebraCross.class);
    }    
}
