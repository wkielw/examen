package ejer1;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith (value=Parameterized.class)

public class test {
	public int expect,actual,delta;
	public Primordial ejer;
	@Parameters
	public static Collection<int[]> testParam(){
		return Arrays.asList(new int[][]{
			{2, 2, },
			{6, 3, 0},
			{6, 4, 0},
			{30, 5, 0},
			{210, 7, 0},
			{2310, 11, 0},
			{30030, 13, 0},
			{510510, 17, 0},
			{9699690, 19, 0},
			{223092870, 23, 0}	
		});
	}
	public test(int expect,int actual,int delta){
		this.expect=expect;
		this.actual=actual;
		this.delta=delta;
		
		
	}
	@Before
	public void crear(){
		ejer = new Primordial();
	}
	@Test
	public void testParams() {
		
		
		Assert.assertEquals(expect,ejer.get_primordial(actual), delta);
		System.out.println(ejer.get_primordial(actual));
		
	}
	@Test
	public void test2(){
		ejer.get_primordial(-1);
		
		
	}
	@Test
	public void test3(){
		boolean check;
		if(ejer.get_primordial(8)>200) {
			check=true;
		}else{
			check=false;
		};
		Assert.assertTrue(check);
		if(ejer.get_primordial(6)>30) {
			check=true;
		}else{
			check=false;
		};
		Assert.assertFalse(check);
		if(ejer.get_primordial(8)<=2) {
			check=true;
		}else{
			check=false;
		};
		Assert.assertTrue(check);
	}

}
