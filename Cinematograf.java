import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.*;

public class Cinematograf{
    public static void main(String [] args){  
        Scanner sc = new Scanner(System.in);
        String oraInit = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date oraIntrare = null;
        
        try {           
            oraIntrare = sdf.parse(oraInit);
        } catch (ParseException e) {
            e.printStackTrace();
        }
               
        String filmContor = "";
        int pretContor =0;
        
        long contorMinute = 0;
        
        for(int i=0; i<n; i++){
            String line = sc.nextLine();
            String []parts1 = line.split(" ");
            String oraFilm = parts1[0];
            int pretFilm = Integer.parseInt(parts1[1]);
            String numeFilm = parts1[2];

            Date oraFilmCurrent = null;
            
            try {           
                oraFilmCurrent = sdf.parse(oraFilm);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        
            long duration  = oraFilmCurrent.getTime() - oraIntrare.getTime();

            long diffInMinute = TimeUnit.MILLISECONDS.toMinutes(duration);
              
                                                          
            if(contorMinute == 0 && diffInMinute >=0)
            {
                pretContor = pretFilm;
                filmContor = numeFilm;
                contorMinute = diffInMinute;
            }
            else if(contorMinute > diffInMinute && diffInMinute >= 0)
            {
                contorMinute = diffInMinute;
                pretContor = pretFilm;
                filmContor = numeFilm;
            }
            else if(contorMinute == diffInMinute)
            {
               if(pretFilm < pretContor)
               {
                   filmContor = numeFilm;
               }
            }
        }
        System.out.println(filmContor);
            
    } 
}
