package personal.xyb.sort;
/**
 * ��������
 * ����i��Ԫ����i-1�Ƚϣ���i��i-1С�򽻻���Ȼ���ٽ���i-1���i-2��Ԫ�ر���Դ�����;
 * ����i��Ԫ�ر�i-1����������Ҫ�ٱȽϣ���Ϊǰi-1��Ԫ���Ѿ����������
 * ���������Ǹ���ģ��С���������������
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
