import java.util.*;
public class SondajeDeOpinie{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String []parts = in.split(" ");
        int nrPartidePolitice = Integer.parseInt(parts[0]);
        int nrSondaje = Integer.parseInt(parts[1]);
        
        ArrayList<String> commandToProcess = new ArrayList<String>();
        ArrayList<String> partideAscendente = new ArrayList<>();
        
        boolean ePartidAsc = false;
        int politicalValue = 0;
        String politicalName = "";
        
        for(int i=0; i< nrPartidePolitice; i++)
        {
            String line = sc.nextLine();
            commandToProcess.add(line);
        }
        
        
        for(String s:commandToProcess)
        {
            String []sondajSplit = s.split(" ");
            int valoareAux =0;
            for(int i=1; i<=nrSondaje; i++)
            {
                int sondaj = Integer.parseInt(sondajSplit[i]);
                if(valoareAux <= sondaj)
                {
                    valoareAux = sondaj;
                    ePartidAsc = true;
                }
                else
                {
                    ePartidAsc = false;
                    break;
                }
                
            }
            int primulSondaj = Integer.parseInt(sondajSplit[1]);
            int ultimulSondaj = Integer.parseInt(sondajSplit[nrSondaje]);            
            
            int difSondaje = ultimulSondaj-primulSondaj;
            
            if(politicalValue < difSondaje)
            {
                politicalValue = difSondaje;
                politicalName = sondajSplit[0];
            }
            
            if(ePartidAsc == true)
            {
                partideAscendente.add(sondajSplit[0]);
            } 
        }
        if(partideAscendente.size() != 0)
        {
            for(String s:partideAscendente)
            {
                System.out.print(s+" ");
            }
            System.out.println();
        }
        else
        {
            System.out.println("Nu exista");
        }
        System.out.println(politicalName+" "+ politicalValue+"%");
    }
}
