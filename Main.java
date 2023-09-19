import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    // Create the genUniqueIDFunction

    // values for theSpecies:
    // lion
    String genUniqueID(String theSpecies ) {
        if (theSpecies.equals("lion")) {
            // do something
        }



    }
    public static void main(String [] args) {

        System.out.println("Welcome to my Zoo Warmup!");

        // Create an animal object
        Animal myNewAnimal = new Animal();

        myNewAnimal.desc = " this is my description";

        System.out.println("\n the description of the new animal is: " + myNewAnimal.desc);

        // open the arriving animal text file

        // Define the path to the file
        String filePath = "C:\\Users\\BE218\\IdeaProjects\\Zoo Warm Up\\files\\arrivingAnimals.txt";


        // Create an Arraylist to hold animal objects
        ArrayList<Animal> animalList = new ArrayList<>();

        try {
            // Create a FileReader and BufferedReader to read the file
            FileReader fileReader = new FileReader(filePath);

            //Create a BufferedReader to efficiently read lines
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;


            // Read and print each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                // Split the line into 6 substring
                String[] myArray = line.split( ",");
                System.out.println("\n myArray[0] is " + myArray[0]);
                System.out.println("\n myArray[1] is " + myArray[1]);

                // Create an Animal Object from the Animal Class
                Animal anyOldAnimal = new Animal();
                // Increment the static animal count
                Animal.numOfAnimals++;


                // Fill the object's data fields
                anyOldAnimal.desc = myArray[0];
                anyOldAnimal.birthSeason = myArray[1];
                anyOldAnimal.color = myArray[2];
                anyOldAnimal.weight = myArray[3];
                anyOldAnimal.origin01 = myArray[4];
                anyOldAnimal.origin02 = myArray[5];

                // Add the newly created animal object to the array list
                animalList.add(anyOldAnimal);

            }

            // Close the BufferedReader and FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            // Handle any IOException that may occur (e.g., file not found)
            e.printStackTrace();
            System.err.println("An error occured while reading the file");
        }

        //We are done with the text file.
        // Output the ArrayList!
        //Output the catList with an item in loop
        for (Animal animal : animalList) {
            System.out.println(animal.desc);
            // Get the species
            
            System.out.println(animal.birthSeason);
            System.out.println(animal.color);
            System.out.println(animal.weight);
            System.out.println(animal.origin01);
            System.out.println(animal.origin02);
            System.out.println("\n\n");
        }

        System.out.println(" The numebr of animals is: " + Animal.numOfAnimals);
    }
}




