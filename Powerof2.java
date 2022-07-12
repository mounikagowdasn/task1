package day5;

public class Powerof2{

	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);

        int i = 0;             
        int Powerof2 = 1; 
        while (i <= n) 
        {
            System.out.println(i + " " + Powerof2);  
            Powerof2 = 2 * Powerof2;                
            i = i + 1;
        }

    }

}

