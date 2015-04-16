package personal.xyb.connect.activity;

import java.util.Scanner;

public class TestDemo extends UF{
	public TestDemo(int N) {
		super(N);
		// TODO Auto-generated constructor stub
	}

	protected int find(int p){
		   return id[p];
	   	}
	   	protected void union(int p,int q){
	   		int pId=find(p);
	   		int qId=find(q);
	   		if(pId==qId)return;
	   		for(int i=0;i<id.length;i++){
	   			if(id[i]==pId)id[i]=qId;
	   		}
	   		count--;
	   	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("个数");
		int N=scanner.nextInt();
		TestDemo uf=new TestDemo(N);
		System.out.println("请输入两数");
		while(scanner.hasNextInt()){	
			int p=scanner.nextInt();
			int q=scanner.nextInt();		
			if(uf.connected(p,q)){continue;}
			uf.union(p, q);
			System.out.println("p: "+p+"q: "+q+"\n");
		}
		for(int i=0;i<uf.id.length;i++){
			System.out.println("id["+i+"] : "+uf.id[i]);			
		}
		System.out.println("test分量数为:"+uf.count);
	}
}

