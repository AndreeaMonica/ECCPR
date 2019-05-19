import java.util.*;
public class RNGRunLength{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String nr = sc.nextLine().trim();
        String seq = sc.nextLine().trim();
        String  []parts = seq.split("0+");
        Map<Integer,Integer> map = new TreeMap<>();
        
        for(int i=0; i<parts.length; i++){
            int x = map.containsKey(parts[i].length()) ? map.get(parts[i].length()):0;
            map.put(parts[i].length(),x+1);
        }
        for(int k=0; k<map.size();k++){
            if(map.containsKey(k)==false){
                map.put(k,0);
            }
        }
        map.remove(0);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getValue()+" ");
        }
        int cont=0;
        int def = 10000;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int a = entry.getValue();
            if(def >= a){
                cont = 1 ;  
                def = a;
            }
            else{
                cont = 0;
                break;
            }
        }
        System.out.println();
        System.out.print(cont);
        
    }
    
}
