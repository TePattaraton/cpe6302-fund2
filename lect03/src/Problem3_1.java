// Student ID:6230300761
// First Name:Pattaraton
// Last Name:Prangprakhon
//
// Team Members:
// 1. 6230300761 Pattaraton Prangprakhon
// 2. 6230301091 Ittikon Chaipool
import java.util.Scanner;

public class Problem3_1 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int[] keep = new int[11];
        int max = 0;
        System.out.println("Input");
        for (int i=0; i<keep.length; i++)
        {
            int number = input.nextInt();
            if (number%4 == 0)
            {
                keep[i] = number;
                if (keep[i] > max) 
                {
                    max =keep[i];
                }
            }
        }
        System.out.println("Output");
        System.out.println(max);
    }
}
