import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayTutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class PlayTutorial extends Button
{
    /**
     * Act - do whatever the PlayTutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public int NilaiI()
    {
        return i;
    }
    public int i = 0;
    public void act() 
    {
        
        // Add your action code here
       if(Greenfoot.mouseClicked(this))
       {
          //Greenfoot.setWorld(new Playfield());
          i++;
          if (i == 1)
          {
            setImage("Tombol Stop.png");
            NilaiI();
          }
          if (i == 2)
          {
            setImage("Tombol Play.png");
            i = 0;
            NilaiI();
          }
       }
    } 
}
