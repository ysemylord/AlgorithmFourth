package personal.xyb.connect.activity;

import java.util.Scanner;

import com.cn.util.StdIn;

/**
 * 
 * ���ⶨ��
 * ����һ����������һ�������ԣ������ԣ�p,q����ʾ���������ӣ�
 * �����Ӿ��д����Լ�p��q���ӣ�q��r������p��rҲ���ӡ�
 * �������������������ԡ�
 * ���磨1,4������4,9������1,9������Ϊ�����ԣ�1��9�����ӣ���1,9�����ࣩ
 * �������
 * ����������Ϊ����
 * �������Զ���Ϊ����
 * �����еȼ۵����ӳ�Ϊ����
 * API˵��
 * ����id[],�����±��ʾ���㣬����������Ԫ��ֵ��ʾ
 * int find(int p);�ҵ�����ķ�����־
 * void union(int,int);����������
 * boolean connected(int,int);�ж������Ƿ�����
 * int getCount();��ȡ������
 * @author xyb(1585853768@qq.com)
 * 
 */
public  class UF {
	public int count;
	protected int id[];
	public UF(int N){
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
	
	protected int find(int p){
		 return id[p];
	 };
	 void union(int p,int q){
		 
	 };    
}
