package com.alok.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class CandidateCode 
{ 
	
    public static int word_count(int input1,String input2,String input3)
    {	
    	if(input1<=0){
    		return -1;
    	}
    	if(null != input2 && null != input3 ){
    		
    		input2 = input2.replace(" ", "");
    		input3 = input3.replace(" ", "");
    		if(input2.isEmpty() || input3.isEmpty()){
    			return -1;
    		}
    	}
    	else{
    		return -1;
    	}
    	
    	
    	int count = 0;
    	String seperator = "#";
    	String delimiter = ",";
    	String target = input3.toString().replace(seperator, "")
											.replace(delimiter, "");
    	int targetSize = target.length();
    	int matrixSize = input1;
    	String inputStringWithoutSpclChar = input2.toString().replace(seperator, "")
    											.replace(delimiter, "");
    	
    	
    	LinkedHashMap<Integer,String> rowStrMap = new LinkedHashMap<Integer,String>();
    	LinkedHashMap<Integer,String> colStrMap = new LinkedHashMap<Integer,String>();
    	LinkedHashMap<Integer,String> diagStrMap = new LinkedHashMap<Integer,String>();
    	
    	//Initialize diagList with default blank values
    	diagStrMap.put(0,"");
    	diagStrMap.put(1, "");
    	
    	if(targetSize > matrixSize){
    		return count;
    	}
    	else {
    		for(int i=0;i<matrixSize;i++){
    			
    			int begIndex = matrixSize*i ;
    			int endIndex = begIndex + matrixSize;
    			
    			// add row
    			rowStrMap.put(i, inputStringWithoutSpclChar.substring(begIndex, endIndex));
    			
    			// left to Right diagonal
				String diagCharAsStrL2R = String.valueOf(rowStrMap.get(i).toCharArray()[i]);
				diagStrMap.put(0, diagStrMap.get(0).concat(diagCharAsStrL2R));
				
				//right to left diagonal
				String diagCharAsStrR2L = String.valueOf(rowStrMap.get(i).toCharArray()[(matrixSize-1)-i]);
				diagStrMap.put(1, diagStrMap.get(1).concat(diagCharAsStrR2L));
					
				
				//add column
    			for(int j = 0;j<matrixSize ;j++){
    				
    				String colCharAsStr = String.valueOf(rowStrMap.get(i).toCharArray()[j]);
    				if(i==0){
    					colStrMap.put(j, colCharAsStr);
    				}
    				else{
    					colStrMap.put(j, colStrMap.get(j).concat(colCharAsStr));
    				}
    				
    			}
    			
    			
    		}
    		
    	}
    		
    	//count target string's presence in rowStrMap elements 
    	for(Map.Entry<Integer, String> entry : rowStrMap.entrySet()){
    		 count = count + countInString(entry.getValue(), target);
    	}
    	//count target string's presence in colStrMap elements 
    	for(Map.Entry<Integer, String> entry : colStrMap.entrySet()){
   		 count = count + countInString(entry.getValue(), target);
    	}
    	// 1. count in diagStrMap elements 
    	 count = count + countInString(diagStrMap.get(0), target) 
    			 		+ countInString(getReverse(diagStrMap.get(0)), target)
    			 		+ countInString(diagStrMap.get(1), target)
    	 				+ countInString(getReverse(diagStrMap.get(1)), target);
    	
    	
    	return count;
    }

	private static String getReverse(String orgStr) {
		
		String reverse = "";
		
		for(int i=orgStr.length()-1 ; i>= 0 ;i--){
			reverse = reverse + String.valueOf(orgStr.charAt(i));
		}
		return reverse;
	}

	private static int countInString(String s, String target) {
		int count = 0;
		
		for(int i=0; i<= s.length() - target.length() ;i++){
			try{
				if(s.substring(i, i+target.length()).equals(target)){
					count = count +1;
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		
		
		return count;
	}
}