package personal.xyb.sort;
/**
 * 将第i个数与后面的舒相比较，如果有比第i个数小的，就交换两数
 * @author xyb
 *
 */
public class SelectionSort extends BaseSort{//选择排序

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable<Object>[] a=new Comparable[]{12,67,43,45,124,89};
		sort(a);
		if(isSorted(a))System.out.println("有序");
		show(a);
	}
	
	public static void sort(Comparable<Object> a[]){
		for(int i=0;i<a.length;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++)
				{if(less(a,j,min))min=j;}
				exch(a,min,i);			
		}
	}
}
