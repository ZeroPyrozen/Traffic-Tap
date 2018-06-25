import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int i=0;
    public int state = 0;
    public int score = 0;
    public ZebraCross zc;
    GreenfootSound Hijau = new GreenfootSound("Green Light Effect.mp3");
    GreenfootSound Merah = new GreenfootSound("Red Light Effect 2.mp3");
    public void act() 
    {
      zc = (ZebraCross)getOneObjectAtOffset(0,0, ZebraCross.class);
      getWorld().showText("Score : "+score, 50, 15);
      if(zc != null) 
        {
            state = zc.getState();
        }
      else if (zc == null) 
        {
            if(state == 2)
                {
                    score++;
                    Hijau.play();
                    state = 0;
                }     
        }
   }
   public int getScore()
   {
    return score;
   }
}
