package personal.xyb.sort;

public class BaseSort {
    public static boolean less(Comparable<Object> a[],int i,int j){
  	  int result=a[i].compareTo(a[j]);  	 
  	  if(result<0)
  		  return true;
  	  else
  		  return false;
    }
    public static void exch(Comparable<Object> a[],int i,int j){
    	Comparable<Object> temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    }
    public static boolean isSorted(Comparable<Object> a[]){
    	for(int i=1;i<a.length;i++){
    		if(less(a,i,i-1)){
    			return false;
    		}
    	}
    	return true;
    	
    }
    public static void show(Comparable<Object> a[]){
    	for(Comparable i:a){
    		System.out.print(" "+i);
    	}
    	System.out.println();
    }
}
