package study;

import org.junit.Test;

public class TestJUnit {

	public static void main(String[] args) {
		String str = "aa";
		System.err.println(str);

	}
	
	@Test
	public void test1() {
		String str = "aa";
		System.out.println(str);
	}
	
	@Test
	public void m1() {
		System.err.println("hello world!");
	}
}
