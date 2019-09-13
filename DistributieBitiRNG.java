import java.util.*;

public class DistributieBitiRNG{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<String> list = new LinkedList<String>();
        String line = sc.nextLine();
        list.add(line);
        int a=0,b=0,c=0,d=0;
        int zero=0,unu=0;
        double r1,r2;
        
        for(int i = 0; i< n ; i=i+2){
            if(line.charAt(i)=='0' && line.charAt(i+1)=='0'){
                a++;
            }
            if(line.charAt(i)=='0' && line.charAt(i+1)=='1'){
                b++;
            }
            if(line.charAt(i)=='1' && line.charAt(i+1)=='0'){
                c++;
            }
            if(line.charAt(i)=='1' && line.charAt(i+1)=='1'){
                d++;
            }
        }
       
      
        for(int i=0; i<n; i++){
            if(line.charAt(i)=='0'){
                zero++;
            }
            if(line.charAt(i)=='1'){
                unu++;
            }
        }
        
        if(zero>unu){
            r2 = ((double)zero)/unu;
        }else{
            r2 = ((double)unu)/zero;
        }
        
        int max=a,min=a;
        if(a>=b && a>=c && a>=d){
                max = a;
            }else if(b>=a && b>=c && b>=d){
                max = b;
            }else if(c>=a && c>=b && c>=d){
                max = c;
            }else max=d;            
        //System.out.println("max=" + max);    
        if(a<=b && a<=b && a<=d){
                min = a;
            }else if(b<=a && b<=c && b<=d){
                min = b;
            }else if(c<=a && c<=b && c<=d){
                min = c;
            }else min=d;
        r1=((double) max)/min; 
        //System.out.println("min = " + min);    
        
        System.out.printf("%.2f ", r1);
        
        System.out.printf("%.2f", r2);
        
        System.out.println();
        
        if(r1<=1.1 && r2<=1.1){
            System.out.println("1");
        }else{ 
            System.out.println("0");
        }
    }
}
