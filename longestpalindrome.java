package Logic;

public class longestpalindrome {
        public static void main(String[] args) {
            String str = "babad";
            int max = Integer.MIN_VALUE;
            StringBuilder str2 =null;
            for(int len =1;len<=str.length();len++){
                for(int i =0;i<=str.length()-len;i++){
                        String palin ="";
                    for(int j =i;j<i+len;j++){
                        palin +=str.charAt(j);
                    }
                    if(palin.length()>max&& isPalindrome(palin)){
                        max = palin.length();
                        str2 = new StringBuilder(palin);
                    }
                }
            }
            System.out.print(str2);
        }
            public static boolean isPalindrome(String str){
                    StringBuilder str2 = new StringBuilder(str);
                return str.equals(str2.reverse()); 
            }
        
}
