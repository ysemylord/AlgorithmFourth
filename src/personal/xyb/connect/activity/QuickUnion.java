package personal.xyb.connect.activity;

import java.util.Scanner;

public class QuickUnion {
	/**
	 *һ���ݽṹ
	 *����id[]�±��ʾ���㣬
	 *		  -- ����Ϊ�����㣨id[p]!=p������ʾ��һͬһ�����ϵ���һ������
	 *����Ԫ��ֵ-	
	 *        -- ��Ϊ�����㣨id[p]==p������ʾ�������ڷ����ı�ʶ
	 * ���㷨
	 * find ˳�Ŵ����ҵ�������ʶ
	 * union ��˳�Ŵ����ҵ�������ʶ��Ȼ��������������
	 * 
	 * 
	 */
	private int count;
	private int id[];
	//��Ҫ�㷨
	//��Ҫ�㷨
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
	////////////��ͬ����
	boolean connected(int p,int q){
		return find(p)==find(q);
	}
	int getCount(){
		return count;
	}
	//////////////��ͬ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("����");
		int N=scanner.nextInt();
		QuickUnion uf=new QuickUnion(N);
		System.out.println("����������");
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
		System.out.println("������Ϊ:"+uf.count);
	}
}
