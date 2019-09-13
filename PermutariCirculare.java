import java.util.*;
public class PermutariCirculare{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toString(n, 2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<binary.length(); i++){
            String x = binary.substring(binary.length()-1,binary.length());
            String y = binary.substring(0,binary.length()-1);
            binary = x+y;
            int dec = Integer.parseInt(binary, 2);
            list.add(dec);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
        
    }
}
