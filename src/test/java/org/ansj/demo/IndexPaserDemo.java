package org.ansj.demo;

import org.ansj.splitWord.analysis.IndexAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;

public class IndexPaserDemo {
	public static void main(String[] args) {
		System.out.println(IndexAnalysis.parse("上海虹桥机场南路"));
		System.out.println(IndexAnalysis.parse("主副食品"));
		System.out.println(IndexAnalysis.parse("花生油"));
		
		System.out.println(ToAnalysis.parse("上海虹桥机场南路"));
		System.out.println(ToAnalysis.parse("主副食品"));
		System.out.println(ToAnalysis.parse("花生油"));
	}
}
