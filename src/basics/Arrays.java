package basics;

public class Arrays {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[5]; // to add values later
        // Arrays are constant size!
        // for dynamic size use ArrayList

        System.out.println("For Each loop");
        // iterate as for-each
        for(int a:arr){
            System.out.println(a);
        }

        System.out.println("1st val in arr: "+arr[0]);

        int[][] multi = new int[0][0];
        // multi-dimension array
    }
}
