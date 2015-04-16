package personal.xyb.connect.activity;

import java.util.Scanner;

import com.cn.util.StdIn;

/**
 * 数据结构
 * id[]下标表示触点
 * id[]元素值表示触点所在分量的标志
 * 算法
 * find根据触点在分量的标志
 * union将p触点所在分量的所有触点的分量标志改为q触点所在的分量的标志
 * @author Administrator
 *
 */
public class QuickFind {
	private int count;
	private int id[];
	
   //主要算法
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
	
	////////////相同部分
	public QuickFind(int N){
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++){
			id[i]=i;
		}
	}
	boolean connected(int p,int q){
		return find(p)==find(q);
	}
	int getCount(){
		return count;
	}
	//////////////相同部分
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("个数");
		int N=scanner.nextInt();
		QuickFind uf=new QuickFind(N);
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
		System.out.println("分量数为:"+uf.count);
	}

}
