package Lec7;

import java.util.*;

public class rhombus {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the range ");
    int s=sc.nextInt();

    for(int i=1;i<=s;i++)
    {
        for(int j=s;j>=i;j--)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=s;j++)
        {
            System.out.print(" *");
        }
        System.out.println();
    }
    sc.close();

  }
}
