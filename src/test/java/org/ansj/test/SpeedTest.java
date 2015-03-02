package org.ansj.test;

import java.io.IOException;
import java.io.StringReader;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;

public class SpeedTest {
	public static void main(String[] args) throws IOException {
		ToAnalysis.parse("test---aaaa中国孙健测试");
		String text = TextUtils.loadTestText("2012081303.txt");

		ToAnalysis toAnalysis = new ToAnalysis(new StringReader(text)); 
		long start = System.currentTimeMillis();
		long allCount = 0;
		long wordCount =0;
		
		Term term = null ;
		while((term = toAnalysis.next())!=null){
			allCount += term.getName().length();
			wordCount++;
		}

		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println("v3 共 " + allCount + " 个字符，"+wordCount+"个词.每秒处理了:" + (allCount * 1000.0 / (end - start)));
	}
}
