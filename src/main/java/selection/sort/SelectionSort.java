package selection.sort;

public class SelectionSort {

        static double[] list = {1, 4 ,5 ,6, 8,9,11,23,55};


    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length; i ++){

            double currentMin = list[i];
            int curentMinIndex = i;

            for(int j = i + 1; j < list.length; j++){
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    curentMinIndex = j;
                }
            }

            if (curentMinIndex !=i) {
                list[curentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
