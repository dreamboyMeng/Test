package ProgAssignment2;

import java.io.IOException;

public class HotWordsTest {
	public static void main(String[] args) throws IOException{

        HotWordsAnalyzer A = new HotWordsAnalyzer("myHotWord.txt", "myTest.txt");
        int x = A.count();
        x= A.count("lif");
        //x = A.distinctCount();
        System.out.println(x);

        String[] B = new String[100];
        //B = A.prevHotWords("good");
        //int y = HotWordsAnalyzer.find("in");
        //System.out.println(y);
        
        B = A.nextHotWords("morning");
        
        //B = A.topHotWords(9);
        
        if(B == null)
        	System.out.println("Null");
        else 
        	print(B);
        
        boolean con;
        con = A.consecutive("morning","student");
        System.out.println(con);
        con = A.consecutive("good","morniNG");
        System.out.println(con);
        con = A.consecutive("student","good");
        System.out.println(con);
        con = A.consecutive("student","good","morning");
        System.out.println(con);
        con = A.consecutive("XML","system","design");
        System.out.println(con);
     }
	
	 private static void print(String[] S) {
	        for (int i = 0; i < S.length; i++) {
	            System.out.println(S[i]);
	        }
	    }
	 

}
