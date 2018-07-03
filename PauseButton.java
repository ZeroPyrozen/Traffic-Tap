import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseButton here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class PauseButton extends Button
{
    int counter = 0;
    boolean Pause = false;
    public void act() 
    {     
        if(counter != 1000)
        {
            counter = 1000;
        }
        if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("p"))
        {
            if(Pause == false)
            {
                Greenfoot.delay(counter);
                Pause = true;
            }
            if(Pause == true)
            {
                counter = 0;
                Greenfoot.delay(counter);
            }
        }
    }    
}
