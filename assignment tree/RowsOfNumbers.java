import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RowsOfNumbers {
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println ("This program reads variable-length lines of numbers from a file 'data.in'");
        System.out.println ("and prints the line along with the average. In additions, results are stored in a file 'data_out.txt'");
        
        // Put your code here
        String inputF = "data.in";
        String outputF = "data_out.txt";
        double num = 0.0;
        double sum = 0.0;
        double avg = 0.0;
        int count = 0;
        

        Scanner in = new Scanner(new File(inputF));
        PrintWriter out = new PrintWriter(outputF);

        while(in.hasNextLine()) {
            String line = in.nextLine();
            Scanner in2 = new Scanner(line);
            
            int row = 1;
            out.print("Row " + row + ":    ");

            while(in2.hasNext()) {
                num = in2.nextDouble();
                sum += num;
                out.print(num + " ");
                count++;
            }
            
            if(sum == 0.0)
               avg = 0.0; 
            else
                avg = sum / count;             
            
            out.println("average is " + avg);
            count = 0;
            sum = 0.0;
            
            in2.close();
            row++;
        }
        in.close();
        out.close();
    }
}