package personal.xyb.connect.activity;

import java.util.Scanner;

import com.cn.util.StdIn;

/**
 * 
 * 问题定义
 * 给出一列整数，与一组整数对，整数对（p,q）表示两整数连接，
 * 且连接具有传递性即p与q连接，q与r连接则p与r也连接。
 * 现在请剃除多余的整数对。
 * （如（1,4），（4,9），（1,9）。因为传递性，1与9已连接，则（1,9）多余）
 * 问题抽象
 * 将整数定义为触点
 * 将整数对定义为连接
 * 将所有等价的连接称为分量
 * API说明
 * 数组id[],数组下标表示触点，分量用数组元素值表示
 * int find(int p);找到触点的分量标志
 * void union(int,int);连接两触点
 * boolean connected(int,int);判断两点是否连接
 * int getCount();获取分量数
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
