import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class HatiBeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class HatiBeta extends RedHearts

{
    public ZebraCross zc;
    public HatiYellowBeta yh;
    public int state = 3;
    public int Hearts = 3;
    public int cek = 0;
    public int temp =0;
 
    /**
     * Act - do whatever the HatiBeta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    GreenfootSound Hijau = new GreenfootSound("Green Light Effect.mp3");
    GreenfootSound Merah = new GreenfootSound("Red Light Effect 2.mp3");
    GreenfootSound Failed = new GreenfootSound("Game Audio.mp3");
     public void act()   
    {  
        MyWorld.backgroundMusic.stop();
        Failed.setVolume(30);
        zc = (ZebraCross)getOneObjectAtOffset(0,-75, ZebraCross.class);
        yh = (HatiYellowBeta)getOneObjectAtOffset(60,53, HatiYellowBeta.class);
        if(zc != null) 
        {
            state = zc.getState();
            if(state == 1)
            {
                if(yh.getHearts() < 1)
                {
                    state = 0;
                }
            }
            
        }
        else if (zc == null) 
        {
            if(state == 0)
                {
                    if (cek ==0 )
                    {
                        Hearts--;
                        Merah.play();
                        cek++;
                    }
                    //System.out.println(Hearts);
                    if(Hearts == 2 )
                    {
                        if(cek == 1)
                        {
                            setImage("Hearts ++-.png");
                            cek--;
                        }
                    }
                    }
                    else if(Hearts == 1 )
                    {
                        if(cek == 1)
                        {
                            setImage("Hearts +--.png");
                            cek--;
                        }
                    }
                    else if(Hearts == 0 )
                    {
                        Playfield.backgroundMusic.stop();
                        if(cek == 1)
                        {
                            setImage("Hearts ---.png");
                            
                            int count = 11;
                            int counter = 600;
                            int dly = 1;
                            for(int i = 0; i < 660;i++)
                            {
                                if(i % 60 == 0)
                                {
                                    count--;
                                }
                                getWorld().showText("Back to Main Menu in "+ count + " second(s)", getWorld().getWidth()/2, getWorld().getHeight()/2);
                                Greenfoot.delay(dly);
                                if(i == 2)Failed.playLoop();
                                if(i == 658)Failed.stop();
                                if(i == 659)
                                {
                                    Greenfoot.setWorld(new MyWorld());
                                    
                                }
                            }
                            
                            cek--;
                        }
                    }
                    state =3;
                }
        }
}
