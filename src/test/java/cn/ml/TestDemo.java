package cn.ml;

import org.junit.Ignore;
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
		//跳过测试
		@Test
		@Ignore
		public void test() {
			System.out.println("跳过测试");
		}
		//乘法
		@Test
		public void test3() {
			Demo demo = new Demo();
			System.out.println(demo.ride(1, 2));
		}
		//异常测试
		@Test
		public void test4() {
			System.out.println(1/0);
		}
}
