import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseButton extends Button
{
    int counter=0;
    boolean Pause = false;
    /**
     * Act - do whatever the PauseButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
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
