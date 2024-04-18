public class ForceConvert {
	public static void main(String[] args) {
		
		//演示强制转换类型
		int n1 = (int)3.24;
		System.out.println("n1 = " + n1);//造成精度损失
		
		int n2 = 324;
		byte b1 = (byte)n2;
		System.out.println("b1 = " + b1);//造成数据溢出
	}
}