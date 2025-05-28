public class Main{
    public static void selectionSort(int[] array){
        int n = array.length; //tamanho do valor

        for (int i = 0; i < n-1; i++ ){
            int indiceMenor = i;
            for (int j = i+1; j<n; j++){
                if (array[j]< array[indiceMenor]){
                    indiceMenor = j;
                }
            }
            int temp = array[indiceMenor];
            array[indiceMenor] = array[i];
            array[i] = temp;
        }
    }

    public static void main (String[] args){
        int[] v = {7,3,11,0,6};
        System.out.println("Vetor original:");
        for (int num : v){
            System.out.print(num + " ");
        }
        selectionSort(v);

        System.out.println("Vetor ordenado:");
        for (int num : v){
            System.out.print(num + " ");
        }
    }
}