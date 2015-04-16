package personal.xyb.connect.activity;

import java.util.Scanner;

import com.cn.util.StdIn;

/**
 * ���ݽṹ
 * id[]�±��ʾ����
 * id[]Ԫ��ֵ��ʾ�������ڷ����ı�־
 * �㷨
 * find���ݴ����ڷ����ı�־
 * union��p�������ڷ��������д���ķ�����־��Ϊq�������ڵķ����ı�־
 * @author Administrator
 *
 */
public class QuickFind {
	private int count;
	private int id[];
	
   //��Ҫ�㷨
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
	
	////////////��ͬ����
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
	//////////////��ͬ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("����");
		int N=scanner.nextInt();
		QuickFind uf=new QuickFind(N);
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
