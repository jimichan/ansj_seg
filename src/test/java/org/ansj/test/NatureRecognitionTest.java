package org.ansj.test;

import java.util.ArrayList;
import java.util.List;

import org.ansj.domain.Term;
import org.ansj.recognition.NatureRecognition;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.junit.Test;

/**
 * 词性标注的一个例子
 * 
 * @author ansj
 * 
 */
public class NatureRecognitionTest {
	
	@Test
	public void test(){
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("我们");
		list.add("回馈");
		List<Term> re = NatureRecognition.recognition(list, 0);
		System.out.println(re);
	}
}
