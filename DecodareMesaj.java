import java.util.*;
import java.io.*;

public class DecodareMesaj{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
        map.put(0," ");
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");
        map.put(7,"G");
        map.put(8,"H");
        map.put(9,"I");
        map.put(10,"J");
        map.put(11,"K");
        map.put(12,"L");
        map.put(13,"M");
        map.put(14,"N");
        map.put(15,"O");
        map.put(16,"P");
        map.put(17,"Q");
        map.put(18,"R");
        map.put(19,"S");
        map.put(20,"T");
        map.put(21,"U");
        map.put(22,"V");
        map.put(23,"W");
        map.put(24,"X");
        map.put(25,"Y");
        map.put(26,"Z");
        
        String twoChar="";
        String oneChar= "";
        String mesajDec= "";
        
        while(input.length() !=0 ){
            if(input.length() >=2 ){
                twoChar = input.substring(0,2);
            }else{
                twoChar = input.substring(0,1);
            }
            
            if(Integer.parseInt(twoChar) > 26){
                oneChar = input.substring(0,1);
                input = input.substring(1);
                
                mesajDec = mesajDec + map.get(Integer.parseInt(oneChar));
                oneChar = ""; 
            }else{
                mesajDec = mesajDec + map.get(Integer.parseInt(twoChar));
                if(twoChar.length()!=1)
                    input = input.substring(2);
                    else
                    input = input.substring(1);
                 
                twoChar = "";
                
            }
        }
        System.out.println(mesajDec);
    }
}
