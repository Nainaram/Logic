package Logic;

public class SlidingWindow {
    public static void main(String[] args) {
        
        int array [] =  {1,4,10,4,7,9,8};
        int subArraySize =4;
        // solvin the problem using sliding window technique
        // printing the subarray of max sum of the subarray
            printMaxSumArray(array,subArraySize);
            
                }
            
      public  static void printMaxSumArray(int[] array, int subArraySize) {
                
        int maxSum =0;
        for(int i =0;i<subArraySize;i++){
                maxSum+=array[i];
        }
        int currentSum =maxSum;
        int startIndex =0;
        // for(int i =subArraySize;i<array.length;i++){
        //          currentSum = currentSum -array[i-subArraySize]+array[i];
        //         if(currentSum>maxSum){
        //             maxSum = currentSum;
        //             startIndex =i-subArraySize+1;
        //         }
                
        // }
        for(int i= 1;i<array.length-subArraySize;i++){
            currentSum = currentSum -array[i-1]+array[i+1];
            if(currentSum>maxSum){
                maxSum =currentSum;
                startIndex = i+1;
            }
        }
        for(int i = startIndex ;i<startIndex+subArraySize;i++){

            System.out.print(array[i]+" ");
        }
    }
}
