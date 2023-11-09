
package i_minimum;

public class I_minimum {
public int select(int arr[],int last,int begin,int key)
{ 
if(last==begin)
    return arr[last];
int pivot=partition(arr,last,begin);
int k=pivot-last;
if(key==k)
    return arr[pivot];
else if(key<pivot)
    return select(arr,last,pivot,key);
else
    return select(arr,pivot+1,begin,key-k);       
}
    private int partition(int arr[], int begin, int end)
    {
    int pivot = arr[end];
    int i = (begin-1);

    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;

            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }

    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;
    return i+1; 
   }
    public static void main(String[] args) {
       int arr[]={2,3,5,6,8,10,11,13};
       int key=3;
       int last=arr.length-1;
       int begin=0;
       I_minimum ob=new I_minimum();
      int index=ob.select(arr, last, begin, key);
        System.out.print("index is  "+index);
       
    }
    
}
