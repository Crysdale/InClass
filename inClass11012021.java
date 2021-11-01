import java.util.Random;
import java.util.ArrayList;

public class inClass11012021
{
    public static void main(String[] args)
    {
	    int[] numbers = new int[5];

	    //numbers[5] = 100; 25 storage places in stored as 0-24, not 1-2, so you will get a out of bounds error

        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = new Random().nextInt(); //random number
        }

        for (int n: numbers)
        {
            System.out.println(n);
        }

        int[] newNumbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
        {
            newNumbers[i] = numbers[i];
        }
        for (int i = numbers.length; i < newNumbers.length; i++)
        {
            newNumbers[i] = new Random().nextInt();
        }
        System.out.println("\n");
        for (int n: newNumbers)
        {
            System.out.println(n);
        }

        numbers = new int[newNumbers.length];
        for (int i = 0; i < newNumbers.length; i++)
        {
            numbers[i] = newNumbers[i];
        }

        System.out.println("\n");
        for (int n: newNumbers)
        {
            System.out.println(n);
        }

        String[] namesAsArray = new String[10];
        ArrayList<String> names = new ArrayList<String>();
        //namesAsArray[3] = "Crysdale";

        names.add("Carson");
        names.add("Camryn");
        names.add("Tracey");
        names.add("Chris");
        names.add(3, "Shealeigh");

        names.remove(3);
        names.add(3, "Test");
        names.set(3, "Shealeigh");

        for (int i = 0; i < 5; i++)
        {
            names.add("Shealeigh");
        }

        for (String name: names)
        {
            System.out.println(name);
        }
        names.remove(1);
        System.out.println(names.size());
        System.out.println(names.get(3));

        System.out.println(names.toString().toUpperCase());

        ArrayList<String> nums = new ArrayList<>();
        nums.add("0");
        nums.add("1");
        nums.add("2");
        nums.add("3");
        nums.add("4");
        nums.add("5");

        int[] moreNumbers = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++)
        {
            moreNumbers[i] = Integer.parseInt(nums.get(i));
        }



    }
}
