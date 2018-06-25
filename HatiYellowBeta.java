import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HatiYellowBeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HatiYellowBeta extends YellowHearts
{
    public ZebraCross zc;
    public int state = 0;
    public int Hearts = 3;
    public int cek = 0;
    public int temp =0;
    GreenfootSound Hijau = new GreenfootSound("Green Light Effect.mp3");
    GreenfootSound Merah = new GreenfootSound("Red Light Effect 2.mp3");
    /**
     * Act - do whatever the HatiBeta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

     public void act()   
    {  
        zc = (ZebraCross)getOneObjectAtOffset(-60,-128, ZebraCross.class);
        if(zc != null) 
        {
            state = zc.getState();
        }
        else if (zc == null) 
        {
            if(state == 1)
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
                            setImage("YHearts ++-.png");
                            cek--;
                        }
                    }
                    }
                    else if(Hearts == 1 )
                    {
                        if(cek == 1)
                        {
                            setImage("YHearts +--.png");
                            cek--;
                        }
                    }
                    else if(Hearts == 0 )
                    {
                        if(cek == 1)
                        {
                            setImage("YHearts ---.png");
                            cek--;
                        }
                    }
                    state =0;
                }
    }
    public int getHearts()
    {
        return Hearts;
    }
}
