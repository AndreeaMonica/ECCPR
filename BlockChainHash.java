import java.util.*;

public class BlockChainHash{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> numberStorage = new ArrayList<String>();
        ArrayList<Integer> sumTotal = new ArrayList<Integer>(); 
        
        String in = sc.nextLine();
        String parts [] =in.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        
        int sumNumbers = 0;
        String numbers = sc.nextLine();
        String parts2 [] =numbers.split(" ");
        
        
        for(String s: parts2){
            numberStorage.add(s);
        }
        
         for(int i=0; i < numberStorage.size(); i++){
            int nr = Integer.parseInt(numberStorage.get(i));
            
            for(int j=0; j<k;j++){
                nr = CalculateHash(Integer.toString(nr));
                sumNumbers = sumNumbers + nr;
                               
            }
            sumTotal.add(sumNumbers);
            sumNumbers=0;
        }
        Collections.sort(sumTotal);
        int max = sumTotal.get(sumTotal.size()-1);
        System.out.println(max);

    }
    public static int CalculateHash(String numbers){
        String resultNumber = ""; // in var salvez suma cifrelor numarului
        if(Integer.parseInt(numbers)<=9){
            return Integer.parseInt(numbers);
        }
        do{
            int nr1 = Integer.parseInt(numbers.substring(0,1));
            int nr2 = Integer.parseInt(numbers.substring(1,2));
            
            if(nr1 < nr2){
                int x = nr2-nr1;
                resultNumber = resultNumber + String.valueOf(x); //varianta 2 de a face stringul Integer.toString(x)
            }else{
                int y = nr1-nr2;
                resultNumber = resultNumber + String.valueOf(y); 
            }   
            numbers = numbers.substring(1);
        }while(numbers.length() !=1);
        
        return Integer.parseInt(resultNumber);
    }
}
