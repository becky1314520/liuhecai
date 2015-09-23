package com.example.liuhecai.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HttpGetListGifNo {

	/**
	 * 自动获取历史开奖数据
	 */
	public String[][] listGifNo() {

     	final List<String> list1 = new ArrayList<String>();
     	final List<String> list2 = new ArrayList<String>();

    	new Thread(new Runnable() {
	    	public void run() {
	        try {
	        String url = "http://kj8888.com/kjjg/2015dx.htm";
	        Document doc = Jsoup.connect(url).get();
	        Elements links = doc.select("a[href]");
	        Elements media = doc.select("[src]");
	        Elements imports = doc.select("link[href]");

	        for (Element src : media) {
	            if (src.tagName().equals("img")) {
	            list1.add(src.attr("abs:src"));
	            }
	        }

	        for (String s : list1) {
	        	if(s.substring(28,29).contains("."))
	        		list2.add(s.substring(27,28));
	        	else 
	        		list2.add(s.substring(27,29)); 
	
	        }

	        } catch (IOException e) {
	          e.printStackTrace();
	          
	        }
	    	}
    	}).start();
    	while (list2.size()<106) {
    		try {
    		Thread.sleep(1000);
    		} catch (InterruptedException e) {
    		e.printStackTrace();
    		}
    		System.out.println("正从kj8888.com获取号码!");
    		}
		String[][] str = new String[list2.size()/7+1][7];

        for (int i=0; i<list2.size(); i++) {
           		str[i/7][i%7]=list2.get(i);      	
        } 
        
        String[][] str1 = new String[str.length-1][6];
        for (int i=0; i<str.length-1; i++) {
        	for (int j=0; j<6; j++) {
        		if(i<14 && i>=0) {
        			str1[i][j]="NA";
        		}
        		else {
	        		str1[i][j]=str[i][j];
        		}
        		System.out.print(str1[i][j]);
        	}       	
        } 
	    return str1; 
    }
}
