package personal.xyb.sort;
/**
 * 插入排序
 * 将第i个元素与i-1比较，若i比i-1小则交换，然后再将第i-1与第i-2个元素标价以此类推;
 * 若第i个元素比i-1个数大，则不需要再比较，因为前i-1个元素已经是有序的了
 * 插入排序是个规模较小，部分有序的数组
 * @author xyb
 *
 */
public class InsertSort extends BaseSort {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable<Object>[] a=new Comparable[]{9,12,67,13,43,90,45,124,89};
		sort(a);
		show(a);
	}
	public static void sort(Comparable<Object> a[]){
		int N=a.length;
		for(int i=1;i<N;i++){
			for(int j=i;j>=0&&less(a,j,j-1);j--){
				exch(a,j,j-1);
			}
		}
	}
}
