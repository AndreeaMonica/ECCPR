import java.util.*;
public class Bomboane{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().trim();
        int n= Integer.parseInt(in);
        String sumaBani = sc.nextLine().trim();
        String [] parts = sumaBani.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int sumaZi =Integer.parseInt(parts[i]);
            list.add(sumaZi);
        }
        int gradFericire = 0;
        int baniRamasi = 0;
        ArrayList<Integer> fericire = new ArrayList<>();
        boolean bol = false;
        for(int i=0;i<n;i++){
            String intrare = sc.nextLine().trim();
            String [] parts2 = intrare.split(" ");
            int costBomboana = Integer.parseInt(parts2[0]);
            int aromaBomboana = Integer.parseInt(parts2[1]);
            baniRamasi = baniRamasi + list.get(i);
            
            if(baniRamasi >= costBomboana){
                gradFericire = gradFericire + aromaBomboana;
                baniRamasi = baniRamasi - costBomboana;
                fericire.add(aromaBomboana);
            }else{
                
                for(int k=0;k<fericire.size();k++){
                    if(aromaBomboana < fericire.get(k)){
                        bol=true;
                        break;
                    }
                    else{
                        bol = false;
                    }
                }
                if(bol == false){
                    gradFericire = gradFericire - aromaBomboana;
                }else{
                    gradFericire = gradFericire ;
                }
                
            }
            
        }
        System.out.println(gradFericire);
        
    }
}
