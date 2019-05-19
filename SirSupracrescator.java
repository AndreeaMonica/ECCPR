import java.util.*;
public class SirSupracrescator{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int suma=0;
        boolean isAccepted = false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int contor=0;
        
        for(int i=0;i<Integer.parseInt(n);i++){
            String x = sc.nextLine().trim();
            int elem = Integer.parseInt(x);
            if(suma < elem){
                isAccepted = true;
                suma = suma+elem;
            }
            else{
                
                elem = suma+1;
                suma = suma + elem;
                contor++;
                list.add(i+1);
                if(i>Integer.parseInt(n)/2){
                    isAccepted = false;
                }
            }
            
        }
        if(contor<=3 && isAccepted == true){
            System.out.println(contor);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            System.out.println("ACCEPT");
        }else{
            System.out.println(contor);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            System.out.println("RESPINS");
        }
        
        
    }
}
