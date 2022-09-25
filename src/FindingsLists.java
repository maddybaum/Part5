
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsLists{
    public FindingsLists() throws InterruptedException {

        Thread.sleep(500);
        System.out.println("Welcome back to your expedition. Time to catalog everything you found");

        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("Wait a second that last one is not a rock. We need to delete that from the list");


        rockList.remove("not rock");

        System.out.println(rockList);
        System.out.println("Perfect");

        Thread.sleep(500);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data downloaded");

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about?");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")){
            System.out.println("Fosill: " + fossilChoice + "" +
                    "n Description " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish fossil")){
            System.out.println("Fosill: " + fossilChoice + "" +
                    "n Description " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")){
            System.out.println("Fosill: " + fossilChoice + "" +
                    "n Description " + fossilDirectory.get(fossilChoice));
        }
        Thread.sleep(500);

        HashSet<String> suppliesBought = new HashSet<>();
        HashSet<String> suppliesUsed = new HashSet<>();

        suppliesBought.add("Food");
        suppliesBought.add("Water");
        suppliesBought.add("Medicine");

        suppliesUsed.add("Food");
        suppliesUsed.add("Water");

        System.out.println("Medicine");
    }
}