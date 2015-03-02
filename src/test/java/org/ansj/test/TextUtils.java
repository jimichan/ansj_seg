package org.ansj.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TextUtils {
	
	public static String loadTestText(String name){
		try{
			InputStream in = TextUtils.class.getResourceAsStream("/"+name);
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = br.readLine())!=null){
				sb.append(line);
				sb.append("\n");
			}
			return sb.toString();
		}catch (Exception e) {
		}
		return "";
	}
}
