package com.ls;

public class Times {

	// 写个block接口
	public interface Block {
		// 定义一个检测耗时的方法
		void execute(); 
	};
	public static void test (Block block) {
		block.execute();
		System.out.println("耗时" + "s");
	}
}
 