import java.util.*;
public class Biblioteca{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String in= sc.nextLine().trim();
        String []parts = in.split(" ");
        int dimRafturi = Integer.parseInt(parts[0]);
        int dimCarti = Integer.parseInt(parts[1]);
        ArrayList<Integer> listaNrCarti= new ArrayList<Integer>();
        ArrayList<Integer> listaNrPagini= new ArrayList<Integer>();       
        int contorCartiTotal=0;
        for(int i=0; i<dimCarti; i++){    
            String line = sc.nextLine().trim();
            String []parts2 = line.split(" ");
            int nrCarti = Integer.parseInt(parts2[0]);
            int nrPagini= Integer.parseInt(parts2[1]);
            listaNrCarti.add(nrCarti);
            for(int l=0;l<nrCarti;l++){
                listaNrPagini.add(nrPagini);
            }
            contorCartiTotal = contorCartiTotal+nrCarti;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int locRamas=dimRafturi;
       
        for(int i=0; i<contorCartiTotal; i++){
            
            for(int j=0;j<listaNrPagini.size();j++){
                
                int x = listaNrPagini.get(j);
                if(x <= locRamas){
                    locRamas = locRamas-x;
                    list.add(x);
                    listaNrPagini.remove(j);
                }

            }
            
            for(int k=0;k<list.size();k++){
                System.out.print(list.get(k)+" ");
            }
            list.clear();
            System.out.println();
            locRamas = dimRafturi;
        }
    }
}
