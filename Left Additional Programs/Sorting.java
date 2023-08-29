// JAVA Program to sort an array

public class Sorting {
    public static void main(String[] args) {
        int temp;
        int array[] = {2,1,3,5,8,4,7,9,6};
        
        for (int i=0; i<array.length; i++) {
            for (int j=i; j<array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j]= array[i];
                    array[i] = temp ;
                }
            }

        }
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
