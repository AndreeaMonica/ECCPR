import java.util.*;
public class SondajePolitice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String []parts = in.split(" ");
        int nrPartide = Integer.parseInt(parts[0]);
        int nrSondaje = Integer.parseInt(parts[1]);
        
        ArrayList<String> partideSiSondaje = new ArrayList<String>();
        ArrayList<String> partideAsc = new ArrayList<String>();
        
        for(int i=0; i<nrPartide; i++){
            String line = sc.nextLine();
            partideSiSondaje.add(line);
        }
        
        boolean partidAscendent = false;
        int difSond = 0;
        String numePartid ="";
        
        for(String s : partideSiSondaje)
        {
            String []parts2 = s.split(" ");
            int valAux=0;
            for(int i=1; i <= nrSondaje; i++)
            {   
                int sondaj = Integer.parseInt(parts2[i]);
                if(valAux <= sondaj)
                {
                    valAux = sondaj;
                    partidAscendent = true;
                }
                else
                {
                    partidAscendent = false;
                    break;
                }
            }   
            
            if(partidAscendent == true)
            {
                partideAsc.add(parts2[0]);
            }
                
            int primulSondaj = Integer.parseInt(parts2[1]);
            int ultimulSondaj = Integer.parseInt(parts2[nrSondaje]);
            int diferentaSondaje = ultimulSondaj-primulSondaj;
            if(difSond < diferentaSondaje )
            {
                difSond = diferentaSondaje;
                numePartid = parts2[0];
            }
        }
        if(partideAsc.size() != 0)
        {
            for(String e:partideAsc)
            {
                System.out.print(e+" ");
            }
            System.out.println();
        }else
        {
            System.out.println("Nu exista");
        }
        System.out.println(numePartid+" "+difSond+"%");
    }
}
