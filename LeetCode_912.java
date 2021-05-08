class Solution {
    public int[] sortArray(int[] arr) {
        int len = arr.length;
        int i=0;
        arr = mergeSort(arr,0,len-1);
        return arr;
    }
    private int[] mergeSort(int []arr,int s,int e){
        if(s==e){
            return new int[]{arr[s]};
        }
        int mid = s+(e-s)/2;
        int l[] = mergeSort(arr,s,mid);
        int r[] = mergeSort(arr,mid+1,e);
        arr = merge(arr,l,r);
        return arr;
    }
    private int[] merge(int[] arr, int[] s,int []q){
        int length = s.length+q.length;
        int temp[] = new int[length];
        int i=0;
        int j=0;
        int k=0;
        while(i<s.length && j<q.length){
            if(s[i]<=q[j]){
                temp[k++]=s[i++];
            }
            else{
                temp[k++]=q[j++];
            }
        }
        while(i<s.length){
            temp[k++]=s[i++];
        }
        while(j<q.length){
            temp[k++]=q[j++];
        }
        return temp;
    }
}
