import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game
{

    List<Item> inventory = new ArrayList<>();
    public static Player aleksi = new Player();
    public static Dog marlow = new Dog();
    private static boolean dead = false; 
    public static int decision = 0;
    public static int determinant = 0;
    
     public static int decision() 
    {
        return decision;
    }

    
    public static void play()
    {
        dead = aleksi.isDead();
        Scanner sc = new Scanner(System.in);
        decision = (int) (Math.random() * 2) + 1;

        System.out.println("Aleksi is a Russian dissident, he first came to the states to find more information about a fabled weapon called the 'Fame Mortuus'. \n However, after meeting his wife Harshada, he settles down inside the United States in Monmouth, Oregon on some Farmland with their Alaskan Malamute named Marlo. [PRESS ENTER TO CONTINUE]");
        sc.nextLine();
        System.out.println("While Harshada is out one day, Aleski hears on his old Russian Comms off them deflecting a missile heading towards the country, he hears them assuming on the comms it was a Thermobaric Weapon but he knows it was Fame Mortuus. \nHarshada comes home and looks pale and she tells him that everyone in town had been going crazy, acting cannibalistic, and she tells him to lock her in the basement cause she may have caught what they had. [PRESS ENTER TO CONTINUE]");
        sc.nextLine();
        System.out.println("She tells him to take Marlow and get as far away from the farm as possible, he promises he’ll be back to cure her. He hops in his truck and heads toward the base the comms said the weapon was launched from, which would be ALASKA [PRESS ENTER TO CONTINUE]");
        sc.nextLine();

        while (!dead)
        {
            if (dead)
                break;
            System.out.println("DAY ONE");
            System.out.println(aleksi);
            System.out.println(marlow);
            sc.nextLine();
            System.out.println("Aleksi and Marlow are driving through Oregon on the way to Seattle Port, they took supplies from home but it’s not enough to last long as they had to leave fast so they have to grab more food and fuel.");
            sc.nextLine();
            System.out.println("They come across an abandoned grocery store, with seemingly no one in it, they can either grab food here and risk being ambushed, or they can play it safe and go further without food meaning that Marlow will have to sleep during the night.");
            sc.nextLine();
            System.out.println("Do you they enter the Grocery Store?[Y || N]");
            String answer = sc.nextLine().toUpperCase();
            
            if (answer.equals("Y"))
            {
                determinant = 1;
                if (decision == 1)
                {
                    System.out.println("Aleksi and Marlow enter the Store and luckily there are no zombies inside as everyone must have ran out the store when the sickness first hit and the panic set, while mostly ransacked, Aleski is able to grab a crowbar as a weapon and prying tool, he’s able to grab some cans of dog food for Marlow and some food for himself. \nNow Marlow will be able to stay awake during the night and preserve Aleksi’s psyche.");
                    aleksi.alterHunger(15);
                    aleksi.alterSanity(15);
                    marlow.alterHealth(-100);
                    marlow.alterHunger(10);
                    System.out.println(aleksi + "\n" + marlow);
                }
                else
                {
                    System.out.println("Aleksi and Marlow enter the Store and unluckily there are zombies inside, A zombie grabs Aleksi from behind but Aleski is able to grab a crowbar as a weapon and kill the Zombie, not without his back and leg getting clawed.\n  He’s able to grab some cans of dog food for Marlow and some food for himself. Marlow will be able to stay awake during the night and preserve Aleksi’s psyche. ");
                    aleksi.alterHunger(15);
                    aleksi.alterSanity(-5);
                    aleksi.alterHealth(-100);
                    marlow.alterHealth(10);
                    marlow.alterHunger(10);
                    System.out.println(aleksi + "\n" + marlow);
                }
            }
            else
            {
                System.out.println("Aleksi and Marlow continue on without much food or supplies and are hungry, they set up shop for the night and Marlow has to sleep making Aleksi stay up");
                    aleksi.alterHunger(-15);
                    aleksi.alterSanity(-25);
                    aleksi.alterHealth(-100);
                    marlow.alterHealth(-5);
                    marlow.alterHunger(-35);
                    System.out.println(aleksi + "\n" + marlow);
                    determinant = 0;
                    
                    
                    
            }
            
            // DAY 2 
            
            System.out.println("DAY 2");
            
            //Yes supplies
            if (determinant == 1)
            {
                System.out.println("They’re ready to go so they get into the car, but before they go to Seattle Port, \nAleksi parks somewhere discreet and takes a nap while Marlow stays on the lookout. \nAleksi dreams about his wife and how much he truly loves her. [ENTER TO CONTINUE]");
                sc.nextLine();
                aleksi.alterSanity(10);
                System.out.println("After the nap, it's time they make their way to Seattle Port. There are some abandoned cars on the road and highway so they have to take a long route and they have to be sneaky in order to not get caught by zombies. \n30 minutes into the drive they see a huge group of zombies on the highway which means they have to take a longer route to Seattle Port. \nHe's going to have to drive until sunrise while Marlow sleeps.");
                aleksi.alterSanity(-5);
            }
            //No supplies
            else if (determinant == 0)
            {
                
            }
            
            
            System.out.println("DAY 3");
            System.out.println(aleksi);
            System.out.println(marlow);
            
            System.out.println(" As dawn breaks on the third day, Aleksi wakes up to the sight of the previously \nbubbling city cast with an eerie emptiness. Even void of zombies. He leaves Marlow and he begins to venture out in hopes of finding someone who can boat him \nto Alaska. A few hours pass with seemingly no luck. Aleksi notes that it’s very peculiar that there hasn’t been a single zombie encounter, despite the abundance of materials, one of which includes a \nmakeshift molotov.")
            System.out.println("It’s around noon when he arrives on what's left of  Jackson Street. \nHe gets startled by a lone zombie and hides behind a building, watching as it makes its way into a cafe. A closer inspection leads to him finding a very large group of them inside this singular cafe, almost pouring out. \nAleksi realises that something important has to be there if they’re all cooped up like this. Like someone wanted this to be noticed. He has to make a choice if he wants to get rid of them.")
            
            System.out.println("Do you kill the zombies? [Y || N]");
            answer = sc.nextLine().toUpperCase();
            
            if (answer.equals("Y") && determinant == 1)
            {
                System.out.println("Weapon in hand, Aleksi steels himself and prepares to charge in. He leaps off the ground and begins to slaughter the zombies one after the other. \nOne of the zombies is much tougher than the others and ends up getting the upper hand on Aleksi' weapon. It’s unusable in its current state now. Despite the damage and fatigue on himself, Aleksi powers through and finishes the rest of them off. There’s a gun in the far back of the room!(You've acquired a new weapon)");
                aleksi.alterHealth(-25);
            }
            
            
            
            dead = aleksi.isDead();
            while (dead)
            {
                System.out.println("You have died, do you want to play again [Y || N]");
                answer = sc.nextLine().toUpperCase();
                if (answer.equals("Y"))
                {
                    aleksi.resetHealth();
                    aleksi.resetHunger();
                    aleksi.resetSanity();
                    
                }
                else
                    System.out.println("Thank you for Playing");
                play();
            }
            
        } 
        }
    }



