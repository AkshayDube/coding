import java.util.Scanner;
public class One{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of Rows");
        int rows = sc.nextInt();
        System.out.println("\nEnter the no. of Columns");
        int cols = sc.nextInt();
        sc.close();

        //For Normal Rectangle
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //For Hollow Rectangle
        System.out.println("==============================================\n");
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1||i==rows||j==1||j==cols)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }

    }

}