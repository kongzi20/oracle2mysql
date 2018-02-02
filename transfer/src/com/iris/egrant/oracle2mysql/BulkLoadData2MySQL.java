package com.iris.egrant.oracle2mysql;
 
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 *  测试 以inputsteam形式 导入数据
 * @author cg
 * @since 07.03.2013
 */
public class BulkLoadData2MySQL {

	public static InputStream getTestDataInputStream() {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 10; i++) {
				sb.append(4);
				sb.append("\t");
				sb.append(4 + 1);
				sb.append("\t");
				sb.append(4 + 2);
				sb.append("\t");
				sb.append(4 + 3);
				sb.append("\t");
				sb.append(4 + 4);
				sb.append("\t");
				sb.append(4 + 5);
				sb.append("\n");
		}
		System.out.println(sb);
		byte[] bytes = sb.toString().getBytes();
		InputStream is = new ByteArrayInputStream(bytes);
		return is;
	} 

}
