import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShopMenu here.
 * 
 * @Pyrozen (your name) 
 * @version (a version number or a date)
 */
public class ShopMenu extends World
{

    /**
     * Constructor for objects of class ShopMenu.
     * 
     */
    public ShopMenu()
    {    
        super(351, 585, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Back back = new Back();
        addObject(back,171,496);
        back.setLocation(175,534);
    }
}
