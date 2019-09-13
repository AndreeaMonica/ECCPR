import java.util.*;
public class Cazino{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        ArrayList<String> list= new ArrayList<>();
        int maxCards =3;
        String cardProblem = "";
        
        for(int i=0; i<n; i++){
            String line = sc.nextLine().trim();
            list.add(line);
            if(list.stream().filter(c-> c.equals(line)).count()==maxCards){
                if(cardProblem == ""){
                    cardProblem = line;
                }
            }
        }
        
        if(cardProblem != ""){
            System.out.println(cardProblem);
        }else{
            System.out.println("JOC OK");
        }
    }
}
