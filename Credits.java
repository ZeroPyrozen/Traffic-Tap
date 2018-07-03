import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class Credits extends World
{
    static GreenfootSound backgroundMusic = new GreenfootSound("Game Credit.mp3");
    public Credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(350, 585, 1); 
        backgroundMusic.setVolume(30);
        backgroundMusic.playLoop();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Back back = new Back();
        addObject(back,290,561);
        CreditsPenjelasan creditspenjelasan = new CreditsPenjelasan();
        addObject(creditspenjelasan,176,277);
        creditspenjelasan.setLocation(175,268);
    }
}
