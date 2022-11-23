package stack;

public class ValidStack {
    public static void main(String[] args){
        int[] pushed={1,2,3,4,5};
        int[] popped={4,5,3,2,1};
        boolean flag=validateStackSequences( pushed,  popped);
        System.out.println(flag);
    }
public static boolean validateStackSequences(int[] pushed, int[] popped){
    int j=0, i=0;
    for(int x:pushed){
        pushed[i++]=x;
       //System.out.println(x);
        while(i>0 && pushed[i-1]==popped[j]){
            i--;
            j++;
            //System.out.println(popped[j]);
        }
    }
    return i==0;
}
}
