package personal.xyb.sort;
/**
 * ����i��������������Ƚϣ�����бȵ�i����С�ģ��ͽ�������
 * @author xyb
 *
 */
public class SelectionSort extends BaseSort{//ѡ������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable<Object>[] a=new Comparable[]{12,67,43,45,124,89};
		sort(a);
		if(isSorted(a))System.out.println("����");
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
