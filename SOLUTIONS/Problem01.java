
import java.util.Scanner;

 class Problem01 {    
public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   int n = sc.nextInt(),k=sc.nextInt();
   String a[]=new String [n];
   for(int i=0;i<n;i++)
       a[i]=sc.next();
 if(k%n==0)
        System.out.println(a[n-1]);
 else
        System.out.println(a[(k%n)-1]);
   
}
 }
