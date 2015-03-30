package org.saburto.seq;

import org.junit.Test;
import org.saburto.seq.example.ClassB;

public class TestClassSeq {
	
	@Test
	public void testRunSeq(){
		methodA();
	}
	
	@Test
	public void testRunSeq2(){
		methodA();
	}
	
	@Test
	public void test_Run_Seq_3(){
		methodA();
	}

	private void methodA() {
		System.out.println("Hello World");
	}
	
	@Test
	public void test_Complex_Seq(){
		ClassB b = new ClassB();
		b.execute();
	}

}
