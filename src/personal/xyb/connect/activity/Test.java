package personal.xyb.connect.activity;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String info="http://trace.cdsimu.com/?OBJECTID=54d03a88e4b05036bf3ed870";
		System.out.println(info);
		String arrStrings[]=info.split("\\?");
		String parameterString=arrStrings[1];
		String[] parameterArr=parameterString.split("\\=");
		String info2=parameterArr[1];
		System.out.println(info2);
	}

}
