package String;
//Check whether a String is Palindrome or not
public class Palindrome1 {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        
        if(rev>=0 && rev==x)
            return true;
        else 
            return false;
        
    }

    public boolean palindrome(int x){
        String num=Integer.toString(x);
        
        int start=0,end=num.length()-1;
       
        while(start<=end){
            
            if(num.charAt(start)==num.charAt(end)){
               
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;

    }
    
}
