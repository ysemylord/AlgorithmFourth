package personal.xyb.sort;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{45,234,2,3,1,56,43,90,12,45,11,10,9,4,50,42};
		show(a,0);
		System.out.println();
		sort(a);//16		
	}
	 public static void sort(int[] a) 

	    {
	        int N = a.length;

	        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ... 
	        int h = 1;
	        while (h < N/3) h = 3*h + 1; 
            //System.out.println("array is "+N);          
            int count=0;
	        while (h >= 1) 
	        {
	        	System.out.println("跳数是 "+h);
	            // h-sort the array
	            for (int i = h; i < N; i++) {
	            	//System.out.println("交换元素下标:");
	                for (int j = i; j >= h && less(a[j], a[j-h],j,h-j); j -= h) {
	                    exch(a, j, j-h);	                    
	                }
	                System.out.println();
	            }
	            show(a,++count);
	            h /= 3;
	            System.out.println();
	        }
	     }
	private static void show(int[] a,int count) {
		// TODO Auto-generated method stub
		System.out.println("第"+count+"次排序结果为:");
		for(int i=0;i<a.length;i++){
			//System.out.print("["+i+"] ");
			System.out.printf("[%3d]",i);
		}
		System.out.println();
		for(int num:a){
			//System.out.print(" "+num+" ");	
			System.out.printf(" %3d ",num);
		}
		System.out.println();
	}
	private static void exch(int[] a, int j, int i) {
		// TODO Auto-generated method stub
		//System.out.print("交换元素下标 "+j+"--"+i);
		 a[j]=a[j]+a[i];
		 a[i]=a[j]-a[i];
         a[j]=a[j]-a[i];				 
		
	}
	private static boolean less(int i, int j, int where1, int where2) {
		// TODO Auto-generated method stub
        System.out.print("比较:"+where1+"--"+where2+" ");
        if(i<j){
        	System.out.print("交换 "+where1+"--"+where2+"  ");
        }else{
        	System.out.print("未交换 "+where1+"--"+where2);
        }
		return i<j;
	}


}
