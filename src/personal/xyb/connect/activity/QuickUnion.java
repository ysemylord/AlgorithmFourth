package personal.xyb.connect.activity;

import java.util.Scanner;

public class QuickUnion {
	/**
	 *一数据结构
	 *数组id[]下标表示触点，
	 *		  -- 若不为根触点（id[p]!=p），表示下一同一分量上的下一个触点
	 *数组元素值-	
	 *        -- 若为根触点（id[p]==p），表示触点所在分量的标识
	 * 二算法
	 * find 顺着触点找到分量标识
	 * union 先顺着触点找到分量标识，然后连接两个分量
	 * 
	 * 
	 */
	private int count;
	private int id[];
	//主要算法
	//主要算法
	int find(int p){
		while(id[p]!=p){
			p=id[p];
		}
		return id[p];
	}
	void union(int p,int q){
		int pRoot=id[p];
		int qRoot=id[q];
		if(pRoot==qRoot){return;}
		id[p]=qRoot;
		count--;
	}	
	///
	public QuickUnion(int N){
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++){
			id[i]=i;
		}
	}
	////////////相同部分
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
		QuickUnion uf=new QuickUnion(N);
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
