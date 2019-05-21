import java.util.*;
public class ProcesorRISC{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().trim();
        int nrLinii = Integer.parseInt(in);
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> afisare = new ArrayList<Integer>();
        boolean exceptie = false;
        for(int i=0; i<nrLinii; i++){
            String line = sc.nextLine().trim();
            String [] parts = line.split(" ");
            String instructiune = parts[0];
            int reg = 0;
            if(instructiune.equals("lconst"))
            {
                int registru = Integer.parseInt(parts[1]);
                int valoare = Integer.parseInt(parts[2]);
                map.put(registru,valoare);
                
            }
            if(instructiune.equals("print")){
                int registru = Integer.parseInt(parts[1]);
                afisare.add(map.get(registru));
            }
            if(instructiune.equals("add")){
                int registru = Integer.parseInt(parts[1]);
                int valoareReg1 = Integer.parseInt(parts[2]);
                int valoareReg2 = Integer.parseInt(parts[3]);
                int a = map.get(valoareReg1);
                int b = map.get(valoareReg2);
                int c = a+b;
                map.put(registru,c);
            }
            if(instructiune.equals("mul")){
                int registru = Integer.parseInt(parts[1]);
                int valoareReg1 = Integer.parseInt(parts[2]);
                int valoareReg2 = Integer.parseInt(parts[3]);
                int a = map.get(valoareReg1);
                int b = map.get(valoareReg2);
                int c = a*b;
                map.put(registru,c);
            }
            if(instructiune.equals("div")){
                int registru = Integer.parseInt(parts[1]);
                int valoareReg1 = Integer.parseInt(parts[2]);
                int valoareReg2 = Integer.parseInt(parts[3]);
                int a = map.get(valoareReg1);
                int b = map.get(valoareReg2);
                int c=0;
                if(b==0 || a == 0){
                    for(int j=0;j<afisare.size();j++){
                        System.out.println(afisare.get(j));
                    }
                    exceptie = true;
                    int exc = i+1;
                    System.out.println("Exception: line "+exc);
                    break;
                }else{
                    c = a/b;
                    map.put(registru,c);
                }
            }
        }
        if(exceptie == false){
            for(int i=0;i<afisare.size();i++){
                System.out.println(afisare.get(i));
            }
        }
    }
}
