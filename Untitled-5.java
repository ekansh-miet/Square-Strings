import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        if(l%2!=0)
        System.out.println("No");
        else{
            int n=l/2;
            String s1=s.substring(0,n);
            String s2=s.substring(n,l);
            if(s1.compareTo(s2)==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}