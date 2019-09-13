import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.*;

public class Cinema{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String oraIn = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        
        SimpleDateFormat sdf  = new SimpleDateFormat("HH:mm");
        Date oraIntrare = null;
        
        try{
            oraIntrare = sdf.parse(oraIn);
        }catch(ParseException e){
            e.printStackTrace();
        }
        
        String filmContor="";
        int pretContor=0;
        long contorMinute = 0;
        
        for(int i=0; i<n; i++){
            String line = sc.nextLine();
            String []parts = line.split(" ");
            String oraFilm = parts[0];
            int pretFilm = Integer.parseInt(parts[1]);
            String numeFilm = parts[2];
             
            Date oraFilmCurent = null;
            try{
                oraFilmCurent = sdf.parse(oraFilm);
            }catch(ParseException e){
                e.printStackTrace();
            }
            
            long diferenta = oraFilmCurent.getTime()-oraIntrare.getTime();
            long diffInMinute = TimeUnit.MILLISECONDS.toMinutes(diferenta);
            
            if(contorMinute ==0 && diffInMinute>=0){
                contorMinute = diffInMinute;
                pretContor = pretFilm;
                filmContor = numeFilm;
            }else{
                if(contorMinute >diffInMinute && diffInMinute>=0){
                    contorMinute = diffInMinute;
                    pretContor = pretFilm;
                    filmContor = numeFilm;
                }else if(contorMinute == diffInMinute){
                        if(pretContor> pretFilm){
                            filmContor = numeFilm;
                        }
                }
            }
            
        }
        System.out.println(filmContor);
    }
}
