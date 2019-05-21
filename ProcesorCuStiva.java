import java.util.*;
public class ProcesorCuStiva{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine().trim();
        int in = Integer.parseInt(n);
        ArrayList<Integer> list = new ArrayList<>();
        boolean exceptie = false;
        for(int i=0; i<in; i++){
            int j=list.size();
            String line = sc.nextLine().trim();
            String parts[] = line.split(" ");
            String instructiune = parts[0];
            if(instructiune.equals("iload")){
                int valoare = Integer.parseInt(parts[1]);
                list.add(valoare);
            }
            
            if(instructiune.equals("iadd")){
                if(list.size() >= 2){
                    int a = list.get(j-1);
                    int b = list.get(j-2);
                    int c = a+b;
                    list.remove(j-1);
                    list.remove(j-2);
                    list.add(c);
                }else{
                    exceptie = true;
                    int index = i+1;
                    System.out.println("Exception: line "+index);
                }
            }
            
            if(instructiune.equals("imul")){
                if(list.size() >= 2){
                    int a = list.get(j-1);
                    int b = list.get(j-2);
                    int c = a*b;
                    list.remove(j-1);
                    list.remove(j-2);
                    list.add(c);
                }else{
                    exceptie = true;
                    int index = i+1;
                    System.out.println("Exception: line "+index);
                }
            }
            
            if(instructiune.equals("dup")){
                list.add(list.get(j-1));
            }
        }
        if(exceptie == false){
            System.out.println(list.size());
            for(int i=list.size()-1; i >= 0 ; i--){
               System.out.println(list.get(i));
            }
        } 
    }
}
