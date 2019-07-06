package javachapter1;

import java.util.Scanner;
// this I still cannot do it
public class CountDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = "Welcome to Cambodia";
        System.out.println(word);
        char search = input.nextLine().charAt(0);
        int counts =0;
        
        for (int i=0 ; i< word.length() ; i++){
            if( search == word.charAt(i) )
                counts ++ ;
        }
        System.out.println( search+ " appears " + counts + ((counts==1)?" time":" times."));
    }
}