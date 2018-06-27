import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static GreenfootSound backgroundMusic;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(351, 585, 1); 
        prepare();
        
    }
  
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartGame startgame = new StartGame();
        addObject(startgame,332,191);
        startgame.setLocation(184,207);
        GreenLight greenlight = new GreenLight();
        addObject(greenlight,188,316);
        greenlight.setLocation(172,316);
        RedLight redlight = new RedLight();
        addObject(redlight,181,370);
        redlight.setLocation(174,367);
        greenlight.setLocation(171,316);
        greenlight.setLocation(174,315);
        removeObject(startgame);
        Exit exit = new Exit();
        addObject(exit,206,417);
        exit.setLocation(200,416);
        exit.setLocation(201,419);
        exit.setLocation(203,418);
        greenlight.setLocation(283,299);
        greenlight.setLocation(175,313);
        redlight.setLocation(174,367);
        exit.setLocation(204,418);
        Rider rider = new Rider();
        addObject(rider,277,481);
        Shop shop = new Shop();
        addObject(shop,98,475);
        shop.setLocation(63,540);
        rider.setLocation(289,542);
        exit.setLocation(203,419);
        backgroundMusic = new GreenfootSound("Menu Start.mp3");
        backgroundMusic.setVolume(30);
        backgroundMusic.playLoop();
        Sound sound = new Sound(backgroundMusic);
        addObject(sound,99,435);
        sound.setLocation(127,419);
        redlight.setLocation(175,366);
        greenlight.setLocation(175,314);
        TutorialButton tutorialbutton = new TutorialButton();
        addObject(tutorialbutton,272,222);
        CreditButton creditbutton = new CreditButton();
        addObject(creditbutton,getWidth()/2,540);
        
    }


    public void LaguStop()
    {
        backgroundMusic.stop();
    }
}
