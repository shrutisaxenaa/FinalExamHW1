package takeHomeExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Assignment1 {

	public static void main(String[] args) {
		
		
		Scanner kb= new Scanner(System.in);
		
		List<Integer>mydata= new ArrayList<Integer>();
		
		Random randomNumber= new Random();
		Random rand = new Random();
	
		for (int i=0;i<500;i++) {
			
			int randomNumbers=rand.nextInt(100, 900);
			//System.out.println(randomNumbers);
			mydata.add(randomNumbers);
						
		}
		Collections.sort(mydata);
		System.out.println(mydata);
		System.out.println("Enter Nth Number");
		int NthNumber=kb.nextInt();
		
		System.out.println("The"+NthNumber+"th samllest number is"+mydata.get(NthNumber-1));
			
		}
		
		
	
	
	}


