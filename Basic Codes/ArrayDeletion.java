import java.util.*;

public class ArrayDeletion {
    public static void main(String[] args) {
        int [] array = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Enter number to delete: position: 0-9: ");
        int x  =scan.nextInt();
        removeArray( x, array) ;
    }
    public static void removeArray(int x, int [] array) {
        int [] newArray = new int [9];

        for (int i=0, j=0; i<array.length; i++) {
            if (i==x ){
                j++;
                continue;
            }
            else {
                newArray[j] = array[i];
                j++;
            }

        }

        for(int i:newArray){
            System.out.print(" "+newArray[i]);
        }
    }
}
