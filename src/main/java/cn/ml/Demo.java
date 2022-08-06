package cn.ml;

public class Demo {
	//TDD加法
	public int add(int a,int b) {
		return a+b;
	}
	
	//TDD减法
	public int reduce(int a,int b) {
		if(a>b) {
			return a-b;
		}else {
			return b-a;
		}
	}
	
	//TDD乘法
	public int ride(int a,int b) {
		return a*b;
	}
}