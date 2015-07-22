package test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.alok.test.CandidateCode;

public class CandidateCodeTest {

	@Ignore
	@Test
	public void TestCase1(){
		String matrix = "ALOKALOKA  LOKALOK";
		String target ="ALOK";
		int size = 4;
		
		Assert.assertEquals(6, CandidateCode.word_count(size, matrix, target));
		Assert.assertEquals(-1,CandidateCode.word_count(size, null, null));
		Assert.assertEquals(-1,CandidateCode.word_count(size, matrix, null));
		Assert.assertEquals(-1,CandidateCode.word_count(-1, matrix, target));
		
	}
	
	@Ignore
	@Test
	public void testArray(){
		char c6 = '\uface';
		float f = -343;
		
		//String s = (String) 's';   is wrong 
				
	}
	
	@Test(expected = InvalidAmountException.class)
	public void testATM() throws InvalidAmountException{
		getMoneyAlt(1234);
	}
	
	@Test
	public void testATM2() throws InvalidAmountException{
		Assert.assertArrayEquals(new int[] {3,0,0},getMoneyAlt(300));
		Assert.assertArrayEquals(new int[] {0,1,0},getMoneyAlt(500));
		Assert.assertArrayEquals(new int[] {3,0,2},getMoneyAlt(2300));
		Assert.assertArrayEquals(new int[] {3,0,3},getMoneyAlt(3300));
		Assert.assertArrayEquals(new int[] {3,0,24},getMoneyAlt(24300));
		Assert.assertArrayEquals(new int[] {1,1,23},getMoneyAlt(23600));
	}
	
	
	public int[] getMoneyAlt(int n) throws InvalidAmountException{
		int[] result = new int[3];
		if(n % 100 != 0){
			throw new InvalidAmountException();
		}
		else{
			int hundredCount = (n % 500)/100;
			result[0]=hundredCount;
			//System.out.println("Hundred count = "+ hundredCount);
			n= n- 100 * hundredCount;
			int fiveHundredCount = (n % 1000)/500;
			result[1] = fiveHundredCount;
			//System.out.println("Five Hundred count = "+ fiveHundredCount);
			n = n- fiveHundredCount * 500;
			int thousandCount = n / 1000;
			result[2] = thousandCount;
			//System.out.println("Thousand count = "+ thousandCount);
		}
		return result;
	}
	

	public void getMoney(int n){
		int thousands = (n-(n % 1000));
		int hundreds = (n- thousands);
		int five_hundreds = hundreds-hundreds % 500;
		int hundredCounts = (hundreds - five_hundreds)/100;
		System.out.println("thousands : 1000 * "+thousands/1000
							+"\n five_hundreds : 500 * "+five_hundreds/500
							+"\n hundreds : 100 * "+hundredCounts);
	}
	
	
	
	class InvalidAmountException extends Exception{

		private static final long serialVersionUID = 1L;
		
		InvalidAmountException(){
			super("Invalid Amount, amount should be multiple of 100 ");
		}
	}
	
}
