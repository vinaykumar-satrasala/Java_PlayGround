import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left=sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right) {

        int[] mix = new int[left.length + right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k++] = left[i++];
            }else if(left[i] > right[j]){
                mix[k++] = right[j++];
            }else{
                mix[k++] = left[i++];
                mix[k++] = right[j++];
            }
        }

        while(i < left.length){
            mix[k++] = left[i++];
        }

        while(j < right.length){
            mix[k++] = right[j++];
        }
        return mix;
    }
}
