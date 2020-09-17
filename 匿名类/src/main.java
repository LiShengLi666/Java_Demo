import com.ls.Times;
import com.ls.Times.Block;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Times.test(new Block() {
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				System.out.println("ls");
			}
		});
		

//		//
//		ni_ming testMing = new ni_ming() {
//			
//			@Override
//			public void printf() {
//				// TODO Auto-generated method stub
//				System.out.println("我就试试匿名类");
//			}
//		};
//		testMing.printf();
//		
//		// 
//		new ni_ming() {
//			
//			@Override
//			public void printf() {
//				// TODO Auto-generated method stub
//				System.out.println("试试简写");
//			}
//		}.printf();
	}
}
