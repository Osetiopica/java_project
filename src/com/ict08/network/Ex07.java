package com.ict08.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Document;

//	json 颇教 - 扁惑没
public class Ex07 {
	public static void main(String[] args) {
		BufferedReader br = null;

//		xml 颇教 : 其捞瘤俊 立辟秦 临 Document 按眉 积己
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document document = null;

		try {
			URL url = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
//			System.out.println(sb.toString());

//			json 颇教
			JSONParser jp = new JSONParser();
			JSONObject jo1 = (JSONObject) jp.parse(sb.toString());
			JSONObject jo2 = (JSONObject) jo1.get("SeoulLibraryTime");
			JSONArray ja = (JSONArray) jo2.get("row");
			StringBuffer sb2 = new StringBuffer();
			for (int i = 0; i < ja.size(); i++) {
				JSONObject jo3 = (JSONObject) ja.get(i);
				String name = (String) jo3.get("LBRRY_NAME");
				String tel = (String) jo3.get("TEL_NO");
				String adr = (String) jo3.get("ADRES");
				sb2.append(name+"\t\t");
				sb2.append(tel+"\t\t");
				sb2.append(adr+"\n");

			}
			System.out.println(sb2.toString());
		} catch (Exception e) {
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}