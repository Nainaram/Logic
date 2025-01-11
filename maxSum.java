package Logic;

public class maxSum {
        public static void main(String[] args) {
            int array[] = {2, 1, 5, 1, 3, 2};
            int k = 3;
            int maxSum =0;
            for(int i =0;i<k;i++){
                maxSum +=array[i];
            }
            int  currentSum = maxSum;
            for(int i=k;i<array.length;i++){
                currentSum = currentSum - array[i-k]+array[i];
                maxSum =Math.max(currentSum,maxSum);
            }
            System.out.println(maxSum);
        }
    
}
