import java.util.*;
public class Loturi
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int nrLoturi = sc.nextInt();
        int contorLoturiUtile = 0;
        int contorLotMare = 0;
        
        for(int i=0; i<nrLoturi; i++)
        {
            int nrComponenteLot = sc.nextInt();
            if(nrComponenteLot == 0)
            {
                continue;
            }
            sc.nextLine();
            String tipComponenta = sc.nextLine();
            int contorR = 0;
            int contorC = 0;
            int contorT = 0;
            
            for(int j=0; j< nrComponenteLot; j++){
                String componentaCurenta = tipComponenta.substring(0,1);
                tipComponenta = tipComponenta.substring(1).trim();
                
                if(componentaCurenta.equals("R"))
                {
                    contorR++;
                }
                if(componentaCurenta.equals("C"))
                {
                    contorC++;
                }
                if(componentaCurenta.equals("T"))
                {
                    contorT++;
                }
            }
            if(contorC >= contorT && contorR >= contorC && contorR>=1 && contorC >= 1 && contorT >=1)
            {
                contorLoturiUtile++;
            }
            if(contorLotMare < nrComponenteLot)
            {
                contorLotMare = nrComponenteLot;
            }
        }
        System.out.println(contorLoturiUtile + " " + contorLotMare);
    }
}
