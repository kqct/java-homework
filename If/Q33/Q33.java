import java.util.Scanner;

public class Q33{
    public static void main(String[] args) {
        //start init
        Scanner keyboard = new Scanner(System.in);
        //end init

        System.out.println("Welcome to Josh's Choose Your Own Adventure game!\n");
        System.out.print("You are standing in front of a house." +
        " There is a \"door\" in front of you and a \"garage\" to the left." +
        "\n> ");
        String q1 = keyboard.nextLine();

        if (q1.equals("door")){

            System.out.print("You go in the door and down the cluttered hallway." +
            " There is a \"living room\" in front of you" +
            " and a \"kitchen\" on your right." +
            "\n> ");
            String q2A = keyboard.nextLine();

            if (q2A.equals("living room")){

                System.out.print("You enter the living room." +
                " There is a sofa, a fan, and a coffee table. You see a TV remote." +
                " Do you turn on the TV? (yes/no)" +
                "\n> ");
                String q3A = keyboard.nextLine();

                if (q3A.equals("yes")){
                    System.out.println("You turn on the fan and watch TV for a while.");
                }

                if (q3A.equals("no")){
                    System.out.println("You sit down on the couch and ponder your choices.");
                }
            }

            if (q2A.equals("kitchen")){

                System.out.print("You walk into the kitchen." +
                " You walk around, exploring the kitchen." +
                " You see a refrigerator, a sink, a microwave, and an oven." +
                " On the counter, you notice a plate of cookies." +
                " Do you take one of the cookies? (yes/no)" +
                "\n> ");
                String q3B = keyboard.nextLine();

                if (q3B.equals("yes")){
                    System.out.println("You eat one of the cookies." +
                    " They are quite good, so you have another.");
                }

                if (q3B.equals("no")){
                    System.out.println("You continue exploring the kitchen." +
                    " Eventually, you decide to stop going through random people's houses, and exit the house.");
                }
            }
        }

        if (q1.equals("garage")){

            System.out.print("You take a left, and walk into the garage." +
            " You notice a lawn \"mower\" and a \"bike\", with a helmet on it." +
            " The lawn mower key is on a hook next to you, below the garage door opener." +
            "\n> ");
            String q2B = keyboard.nextLine();

            if (q2B.equals("mower")){

                System.out.print("You take the key, open the garage door, and " +
                " Suddenly, a thought comes to you." +
                " Should you \"bag\" the grass clippings, or \"mulch\" them?" +
                "\n> ");
                String q3C = keyboard.nextLine();

                if (q3C.equals("bag")){
                    System.out.println("You install the bag attachment, and continue mowing the lawn." +
                    " As needed, you stop to empty the clippings from the bag.");
                }

                if (q3C.equals("mulch")){
                    System.out.println("You continue mowing, and feel proud" +
                    " that you are continuing to help the lawn grow.");
                }
            }

            if (q2B.equals("bike")){

                System.out.print("You put on the helmet, and get on the bike." +
                " You get back off the bicycle, open the garage door, then get back on." +
                " Riding down the driveway, you find yourself at a crossroads." +
                " Do you take a \"left\" or a \"right\"?" +
                "\n> ");
                String q3D = keyboard.nextLine();

                if (q3D.equals("left")){
                    System.out.println("You take a left, then continue biking." +
                    " Eventually, you get tired, and turn around.");
                }

                if (q3D.equals("right")){
                    System.out.println("You turn right, and continue." +
                    " You bike until you realize that you are just travelling in a loop. " +
                    " At the next turn, you head back.");
                }
            }
        }
    }
}
