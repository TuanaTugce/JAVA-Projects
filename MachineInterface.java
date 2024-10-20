import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class  {

    public static void main(String[] args) {
        File newFile = new File("numbers.txt");

        Scanner input = new Scanner(System.in);
        int AccNum;
        int password;
        int iterate=0;
        boolean check = false;

        System.out.println("Please enter account number: ");
        AccNum = input.nextInt();

        // Try-catch block to handle potential FileNotFoundException
        try {
            Scanner myReader = new Scanner(newFile);

            if (newFile.exists()) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();

                    if (data.toLowerCase().contains("passwords"))
                        break;
                    if(data.equals(Integer.toString(AccNum))) {
                        System.out.println("Valid account number!");
                        check = true;
                        break;
                    }
                    iterate+=1;
                   // System.out.println(data);
                }
                if(check == false) {
                    System.out.println("Invalid account number!!!");
                    return;
                }

                System.out.println("Please enter your password: ");
                password = input.nextInt();

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if(data.toLowerCase().contains("passwords")) {
                        int lineCount = 0;
                        while (myReader.hasNextLine() && lineCount < iterate) {
                            data = myReader.nextLine();
                            lineCount++;
                        }
                        if (data.equals(Integer.toString(password)))
                            System.out.println("You have successfully logged in!");
                        else
                            System.out.println("Wrong password!");
                    }
                }

            }
            // Close the scanner
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: File not found.");
            e.printStackTrace();
        }
    }
}
