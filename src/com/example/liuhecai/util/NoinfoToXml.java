package com.example.liuhecai.util;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;


import com.example.liuhecai.MainApplication;

public class NoinfoToXml {

	/**
	 * 将历史开奖数据保存到Xml文件中
	 */

    public int SaveNoinfoToXml(String[][] arr) { 

        final SharedPreferences prefs = PreferenceManager 
                .getDefaultSharedPreferences(MainApplication.getContext()); 
        Editor editor = prefs.edit(); 
        int arrLength = arr.length;
        if (arr != null) { 
        	editor.clear();
            for (int i = 0; i < arr.length; i++) {
            	String arrTemp =arr[i][0]+",";
            	for (int j = 1; j<arr[i].length; j++) {
            		arrTemp = arrTemp+arr[i][j] + ","; 
            	}
            	editor.putString(String.valueOf(i), arrTemp); 
            } 
        } 
        editor.putInt("length", arrLength);
        editor.commit(); 
        return arrLength;
    }
    
    public String[][] LoadParaFromXml() {
  	  final SharedPreferences prefs = PreferenceManager
  			    .getDefaultSharedPreferences(MainApplication.getContext());
  	  int arrLength = prefs.getInt("length", 0);
  	  String[] str = new String[prefs.getInt("length", 0)];
	  String[][] str_DeatilContent = new String[arrLength][];
  	  for (int i=0; i<arrLength; i++) {
  		  str[i] = prefs.getString(String.valueOf(i), "");
  	  }
  	  if (str.length > 0) {  
  		  for (int i = 0; i < arrLength; i++) {
  				str_DeatilContent[i] = str[i].trim().split(",");
  			   }
  			}
  		return str_DeatilContent;	  
  }
}
