import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\n Welcome to File I/O ");

        String pathName = "C:\\Users\\BE218\\Downloads\\arrivingAnimals.txt";
        String pathOutput = "C:\\Users\\BE218\\Downloads\\myNewFile.txt";
        BufferedReader reader = null;
        String line = "";

        //Create a file writer
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOutput))

        try {
            reader = new BufferedReader(new FileReader(pathName));
            while( (line = reader.readLine()) !=null ) {
                String[] row  = line.split(",");

                for(String i : row) {
                    System.out.println("\n" + i);
                    writer.write();
                }

            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }

        // Write to a file named: myNewFile.txt

        // Create a File Writer.
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOutput));

        try {
            writer.write("This is a line of animals... ");
            // Write to our file with a for loop
            for (int i =0; i<10; i++) {
                writer.write("\n i is: " + i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
