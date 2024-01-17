package Amazon;

public class merge_Sort {
    public static void printSorted_Element(int nums1[],int nums2[],int m,int n){
        int i = m-1;
        int j = n-1;
        int x = m+n-1;

        while (i>=0 && j>=0) {
            if (nums1[i] > nums2[j]) {
                nums1[x] = nums1[i];
                x--;
                i--;
            } else {
                nums1[x] = nums2[j];
                x--;
                j--;
            }
        }
            while (j>=0){
                nums1[x]=nums2[j];
                    j--;
                    x--;

            }

        }




    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m=3;
        int n=3;

        printSorted_Element(nums1,nums2,m,n);
        for (int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }



    }
}
