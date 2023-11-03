import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bonus extends Actor
{

    /**
     * Act - do whatever the Bonus wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if (Greenfoot.getRandomNumber(100) > 10) {
            turn(Greenfoot.getRandomNumber(15) - 30);
            move(Greenfoot.getRandomNumber(10) - 5);
            }
      else{
          
        }
      
    
    eatBomb();
    eatBug();
}
/**
 * I am trying to remove the Bomb by using another class to make a game littel bit intresting.
 */
    public void eatBomb()
    {
        if (isTouching(Bomb.class)) 
            removeTouching(Bomb.class);
            
            else{
            }
        }
        public void eatBug(){
      if 
     (isTouching(Bug.class)){
      removeTouching(Bug.class);
     getWorld().showText("You Lose",300,200); }
     
}
        } 

