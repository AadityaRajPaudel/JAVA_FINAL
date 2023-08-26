// JAVA Program to sort an array

public class Sorting {
    public static void main(String[] args) {
        int temp;
        int array[] = {2,1,3,5,8,4,7,9,6};
        int sortedArray[] = new int[array.length];
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            for (int j=i; j<array.length; j++) {
                if (min > array[j]) min = array[j];
            }

            temp = array[i];
            array[i]=min;
            min = array[i];
        }
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
