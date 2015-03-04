package org.ansj.app.crf;

import org.ansj.dic.DicReader;
import org.ansj.util.MyStaticValue;

public class Test2 {
	public static void main(String[] args) throws Exception {
		long t1 = System.currentTimeMillis();
		Model model = Model.loadModel(DicReader.getInputStream("crf/crf.model"));
		long t2 = System.currentTimeMillis();
		System.out.println("-------------- load use time "+(t2-t1));
	}
}
