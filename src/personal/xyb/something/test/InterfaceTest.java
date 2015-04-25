package personal.xyb.something.test;

import java.util.HashMap;
import java.util.Map;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Integer i=1;
		test(i);*/
		Gen<Integer> gen=new Gen<Integer>();
		int i=1;
		gen.setT1(1);
		Gen<Object> gen1=new Gen<Object>();
		gen1.setT1(i);
		System.out.println(gen.getT1());
		Comparable<Integer> r=new Comparable<Integer>(){

			@Override
			public int compareTo(Integer o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		//test(r);
		//Integer;
		//HashMap;
		test1(new Class1());
		test2(new Gen<Integer>());
		Map<String,Object> oneMap=new HashMap<String,Object>();
		oneMap.put("one","jack");
	}
	public static void test(Comparable<Object> obj ){
		
	}
	public static void test1(Face1 face1){
		
	}
    public static void test2(Gen<Integer> gen){
		
	}
    
}

class Gen<T1> {
	private T1 t1;
	public void setT1(T1 t1){
		this.t1=t1;
	}
	public T1 getT1(){
		return t1;
	}	
}
interface Face1{
	
} 
class Class1 implements Face1{
	
}