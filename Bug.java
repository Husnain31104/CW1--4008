import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * My main character is the spider which is called by name bug
 */
public class Bug extends Actor
{
    private int score = 0;

    /**
     * Act - do whatever the Bug wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(5);
        }
        
        if (Greenfoot.isKeyDown("down")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        eatFood();
        fireProject(); 
    }

    /**
     * To show something on the screen is I used that method when spider would touch food class it would remove automatically.
     */
    public void eatFood()
    {
        if (isTouching(Food.class)) {
            removeTouching(Food.class);
            score = score + 100;
            getWorld().showText("Score:" + score, 100, 30);
        }
    }

    /**
     * This is for to control fire by the mouse.
     */
    public void fireProject()
    {
        if (Greenfoot.mousePressed(null)) {
            getWorld().addObject( new  Fire(), getX(), getY());
        }
    }
}
