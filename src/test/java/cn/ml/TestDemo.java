package cn.ml;

import org.junit.Test;

public class TestDemo {
	//加法
		@Test
		public void test1() {
			Demo demo = new Demo();
			System.out.println(demo.add(1, 2));
		}
		//减法
		@Test
		public void test2() {
			Demo demo = new Demo();
			System.out.println(demo.reduce(1, 2));
		}
		//乘法
		@Test
		public void test3() {
			Demo demo = new Demo();
			System.out.println(demo.ride(1, 2));
		}	
}
