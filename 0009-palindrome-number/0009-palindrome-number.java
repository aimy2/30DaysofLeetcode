class Solution {
    public boolean isPalindrome(int x) {
        String xstring = String.valueOf(x);
        char[] result = xstring.toCharArray();
        int j=result.length-1;
        int middle=result.length/2;
    
        for(int i=0;i<= middle;i++){
                if(result[i]!=result[j]){
                    System.out.print("is not a palindrome");
                    return false;
                }else{
                    j--;}}
                
            return true;}
        }
        
    
    