import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditButton extends Button
{
    /**
     * Act - do whatever the CreditButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getWorld().showText("Click me!!",getX(),getY());
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Credits());
        }
    }    
}
