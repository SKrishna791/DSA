import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {2,9,8,3,0,1};

        // bubbleSort(a);

       // selectionSort(a);

        insertionSort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void bubbleSort(int[] array) {

        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }



    }
    public static void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int minIndex = i;

            for(int j=i+1;j< array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }

            if(i!=minIndex){
                int temp= array[i];
                array[i]=array[minIndex];
                array[minIndex]=temp;
            }
        }
    }
    public static void insertionSort(int[] array){
        for (int i=1;i< array.length;i++){
            int temp= array[i];
            int j=i-1;
            while (j > -1 && array[j]>temp){
                array[j+1]=array[j];
                array[j]=temp;
                j--;
            }
        }
    }

}