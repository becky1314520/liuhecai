package com.example.liuhecai.activity;



import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Map.Entry; 
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.example.liuhecai.R;
import com.example.liuhecai.R.id;
import com.example.liuhecai.R.layout;
import com.example.liuhecai.R.menu;
import com.example.liuhecai.util.HttpGetListGifNo;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    String[][] arrBak = {
/*    		{"8","15","31","35","42","44"},
    		{"3","14","16","18","38","49"},
    		{"8","18","19","28","37","44"},
    		{"10","21","24","33","40","47"},
    		{"16","21","27","37","40","43"},
    		{"1","2","14","37","43","49"},
    		{"14","15","16","25","27","30"},
    		{"5","7","9","13","15","29"},
    		{"8","16","21","30","42","46"},
    		{"17","18","20","26","31","32"},
    		{"4","5","10","13","28","35"},
    		{"6","15","25","29","32","46"},
    		{"5","7","14","17","46","47"},
    		{"11","34","36","43","47","49"},
*/    		{"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
            {"NA","NA","NA","NA","NA","NA"},
    		{"13","17","16","18","22","45"},
    		{"5","7","17","18","27","48"},
    		{"2","17","23","30","34","41"},
    		{"7","9","10","14","22","31"},
    		{"2","10","12","21","25","35"},
    		{"14","22","28","33","44","46"},
    		{"15","20","28","29","42","46"},
    		{"17","18","28","32","33","48"},
    		{"10","12","20","22","25","33"},
    		{"6","9","23","25","41","43"},
    		{"13","17","25","27","46","49"},
    		{"2","6","10","20","38","40"},
    		{"6","8","12","16","32","49"},
    		{"1","22","27","45","48","18"},
    		{"14","17","23","24","25","37"},
    		{"4","21","25","29","32","37"},
    		{"1","5","11","23","34","47"},
    		{"12","15","17","30","31","43"},
    		{"7","26","30","33","34","38"},
    		{"2","5","13","37","42","44"},
    		{"2","6","9","16","39","49"},
    		{"6","11","16","29","30","37"},
    		{"2","5","10","27","36","46"},
    		{"4","12","20","37","42","47"},
    		{"9","12","26","29","44","45"},
    		{"21","24","26","42","43","46"},
    		{"10","11","31","34","37","38"},
    		{"6","17","18","19","20","42"},
    		{"30","31","35","40","42","48"},
    		{"1","3","5","20","35","39"},
    		{"12","17","29","31","41","47"},
    		{"3","13","20","24","43","48"},
    		{"3","4","7","8","26","36"},
    		{"12","19","21","24","36","49"},
    		{"1","8","28","31","36","45"},
    		{"6","8","30","34","36","42"},
    		{"7","10","12","16","26","49"},
    		{"11","13","41","42","43","49"},
    		{"3","7","14","21","25","29"},
    		{"2","13","15","38","39","44"},
    		{"3","7","15","25","26","47"},
    		{"5","17","22","34","38","48"},
    		{"21","32","36","37","44","46"},
    		{"21","27","28","33","37","48"},
    		{"16","18","19","36","42","47"},
    		{"5","10","13","43","44","45"},
    		{"7","10","15","37","42","45"},
    		{"2","7","20","23","44","47"},
    		{"9","16","28","36","42","45"},
    		{"11","12","15","21","38","42"},
    		{"18","24","28","31","39","49"},
    		{"9","11","14","22","27","49"},
    		{"7","12","16","17","20","25"},
    		{"10","13","35","38","42","44"},
    		{"10","12","24","25","26","33"},
    		{"13","16","24","26","40","44"},
    		{"4","11","12","24","35","46"},
    		{"12","16","31","34","42","48"},
    		{"3","10","26","33","42","46"},
    		{"1","5","26","28","40","49"},
    		{"8","9","18","33","41","43"},
    		{"12","14","21","27","38","43"},
    		{"4","11","23","32","44","48"},
    		{"9","24","32","34","43","47"},
    		{"9","19","28","29","38","40"},
    		{"2","5","17","22","27","28"},
    		{"7","8","10","13","20","38"},
    		{"16","18","22","23","35","38"},
    		{"13","20","23","24","46","47"},
    		{"4","14","15","19","41","42"},
    		{"10","33","40","43","45","49"},
    		{"4","11","15","26","28","30"},
    		{"12","25","32","33","34","35"},
    		{"4","5","11","17","24","48"},
    		{"14","20","28","31","32","47"},
    		{"5","9","13","15","21","23"},
    		{"22","23","35","40","41","42"},
    		{"10","12","19","25","42","46"},
    		{"22","26","27","28","36","47"},
    		{"1","4","8","21","22","24"},
    		{"2","6","13","25","30","33"},
    		{"7","17","34","41","43","49"},
    		{"4","5","18","23","32","44"},
    		{"2","26","31","32","36","37"},
    		{"3","15","16","39","41","42"},  
    		{"9","13","29","30","39","45"}, 
    		{"9","22","28","32","37","39"}, 
    		{"5","6","8","10","31","36"}, 	
    		{"12","16","34","36","42","45"}, 
    		{"15","16","20","26","36","40"}, 
    		{"1","4","13","22","32","41"}, 

};     
    HttpGetListGifNo httpGetListGifNo = new HttpGetListGifNo();
    String[][] arr = httpGetListGifNo.listGifNo();
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.textview_1);
        textView.setBackgroundColor(Color.parseColor("#99ffcc"));
        textView.setTextSize(11);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        
//        textView.setText("1235258968882585688");
//        resultInsect();
      	 String[] subStrGN = new String[arrZ.length];
        	
      	 for (int i=0 ; i<arr.length;i++) {
       		String temp = arr[i][0];
       		for (int j = 0; j<5;j++) {
       			temp=temp+arrZ[i][j+1];
       			subStrGN[i] = temp ;
       		} 

       	 }
       	 
        for (int m = 2;m<6;m++)
        	for (int n =0;n<=6-m;n++) {
                resultHasSameSubStrGN(subStrGN[subStrGN.length-1].substring(n, m+n));        		
        	}
        
        


//          resultHasSameSubStr();
            resultInsectZSame();
//          resultInsectZ();
/*          ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        		  MainActivity.this,android.R.layout.simple_list_item_1,arr[1]);
          ListView listView = (ListView) findViewById(R.id.list_view);
          listView.setAdapter(adapter);
  */
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
  //六合彩，求号码的交集
    public void resultInsect() {   
    	     
        System.out.println("---------------------可爱的分割线------------------------");   
        Log.d("daihong","---------------------可爱的分割线------------------------"); 
        //测试insect   

        for (int i = 0; i < arr.length-1; i++) {
        List result_insect = intersect(arr[i],arr[arr.length-1]);   
        System.out.println("求交集的结果如下：");   
        TextView textView = (TextView)findViewById(R.id.textview_1);
        if (result_insect.size()>1){
	        textView.append("\n"+"2015_00"+(i+1)+"期:");
	        	for (int j=0; j<arr[i].length; j++) {
	        		textView.append(arr[i][j]+",");
	        		}
	    	textView.append("\t"+"与97期相同的号码是：");
		        for (Object str : result_insect) {   
		            textView.append((CharSequence) str+",");
		        }
		    textView.append("\n"+"2015_00"+(i+2)+"期:");
	        	for (int j=0; j<arr[i].length; j++) {
	        		textView.append(arr[i+1][j]+",");
	        		}
		    textView.append("\n");
		    
	        }
        }
    } 

//求号码的交集    
	public static List intersect(Object[] arr1, Object[] arr2) {   
        Map<String, Boolean> map = new HashMap<String, Boolean>();   
        LinkedList<String> list = new LinkedList<String>();   
        for (Object str : arr1) {   
            if (!map.containsKey(str)) {   
                map.put(str.toString(), Boolean.FALSE);   
            }   
        }   
        for (Object str : arr2) {   
            if (map.containsKey(str)) {   
                map.put(str.toString(), Boolean.TRUE);   
            }   
        }
  
        for (Entry<String, Boolean> e : map.entrySet()) {   
            if (e.getValue().equals(Boolean.TRUE)) {   
                list.add(e.getKey());   
            }   
        }   
  
        return list;   
    }
	
//六合彩，求生肖的交集
	
	 String[][] arrZ =  changeNoToZodiac(arr) ;

	 public void resultInsectZ() {	     
	        System.out.println("---------------------生肖------------------------");   
	        System.out.println("求交集的结果如下："); 
	        TextView textView = (TextView)findViewById(R.id.textview_1);
	        
	          
	        String[] delArrZ = deleteRepeatData(arrZ[arrZ.length-1]);
	        
      		textView.append("\n"+"==========生肖：所有两个以上相同=========="+"\n"+"第"+(arrZ.length)+"期开奖结果：");
        	for(String j: arrZ[arrZ.length-1]){     		 
       		 textView.append(j+",");
       	    }
        	textView.append("\n");
        	

	        int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;
		    textView.append("\n"+"每个生肖重复出现的次数"+"\n");

	        for (int i = 0; i < arrZ.length-1; i++) {
	            List result_insect = intersectArr(arrZ[i],delArrZ);                         
	            if (result_insect.size()>1){
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		if (arrZ[i+1][j]=="羊") 
	    	    	    		count1++;    			 
	    	    			 else if (arrZ[i+1][j]=="马") 
		    	    	    	count2++;
	    	    			 else if (arrZ[i+1][j]=="蛇") 
			    	    	    count3++;
	    	    			 else if (arrZ[i+1][j]=="龙") 
			    	    	    count4++;
	    	    			 else if (arrZ[i+1][j]=="兔") 
			    	    	    count5++;
	    	    			 else if (arrZ[i+1][j]=="虎") 
			    	    	    count6++;
	    	    			 else if (arrZ[i+1][j]=="牛") 
			    	    	    count7++;
	    	    			 else if (arrZ[i+1][j]=="鼠") 
			    	    	    count8++;
	    	    			 else if (arrZ[i+1][j]=="猪") 
			    	    	    count9++;
	    	    			 else if (arrZ[i+1][j]=="狗") 
			    	    	    count10++;
	    	    			 else if (arrZ[i+1][j]=="鸡") 
			    	    	    count11++;
	    	    			 else if (arrZ[i+1][j]=="猴") 
			    	    	    count12++; 	        		
	    	        		}
	    	        }
	            }
		    for (int i = 1; i < 2; i++) {
	        	textView.append("羊重复出现的次数是："+count1+"\n"
	        +"马重复出现的次数是："+count2+"\n"
	        +"蛇重复出现的次数是："+count3+"\n"
	        +"龙重复出现的次数是："+count4+"\n"
	        +"兔重复出现的次数是："+count5+"\n"
	        +"虎重复出现的次数是："+count6+"\n"
	        +"牛重复出现的次数是："+count7+"\n"
	        +"鼠重复出现的次数是："+count8+"\n"
	        +"猪重复出现的次数是："+count9+"\n"
	        +"狗重复出现的次数是："+count10+"\n"
	        +"鸡重复出现的次数是："+count11+"\n"
	        +"猴重复出现的次数是："+count12
	        );
	        }
	        
	        
/*
        	
        	
	        for (int i = 0; i < arrZ.length-1; i++) {
	            List result_insect = intersectArr(arrZ[i],delArrZ);   
	                       
	            if (result_insect.size()>1){
	    	        textView.append("\n"+"2015_00"+(i+1)+"期:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i][j]+",");
	    	        		}
	    	    	textView.append("\n"+"\t"+"与"+(arrZ.length)+"期相同的号码是：");
	    		        for (Object str : result_insect) {   
	    		            textView.append((CharSequence) str+",");
	    		        	}
	    		    textView.append("\n"+"2015_00"+(i+2)+"期:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i+1][j]+",");
	    	        		}
	    		    textView.append("\n");
	    	        }
	            }
*/
	    }
	 
	public String[][] changeNoToZodiac(String[][] arrNo) {
    	String[][] arrZodiac = new String[arr.length][6];

    	for (int i=0; i<arr.length; i++) {
    		for (int j=0; j<arr[i].length; j++) { 
    	    	if ((arrNo[i][j])!="NA"){
    			 if (Integer.parseInt(arrNo[i][j])%12==1) 
    	    		arrZodiac[i][j]="羊";    			 
    			 else if (Integer.parseInt(arrNo[i][j])%12==2) 
 	    			arrZodiac[i][j]="马";
    			 else if (Integer.parseInt(arrNo[i][j])%12==3) 
 	 	    		arrZodiac[i][j]="蛇";
    			 else if (Integer.parseInt(arrNo[i][j])%12==4) 
  	    			arrZodiac[i][j]="龙";
    			 else if (Integer.parseInt(arrNo[i][j])%12==5) 
  	    			arrZodiac[i][j]="兔";
    			 else if (Integer.parseInt(arrNo[i][j])%12==6) 
  	    			arrZodiac[i][j]="虎";
    			 else if (Integer.parseInt(arrNo[i][j])%12==7) 
  	    			arrZodiac[i][j]="牛";
    			 else if (Integer.parseInt(arrNo[i][j])%12==8) 
  	    			arrZodiac[i][j]="鼠";
    			 else if (Integer.parseInt(arrNo[i][j])%12==9) 
  	    			arrZodiac[i][j]="猪";
    			 else if (Integer.parseInt(arrNo[i][j])%12==10) 
  	    			arrZodiac[i][j]="狗";
    			 else if (Integer.parseInt(arrNo[i][j])%12==11) 
  	    			arrZodiac[i][j]="鸡";
    			 else if (Integer.parseInt(arrNo[i][j])%12==0) 
  	    			arrZodiac[i][j]="猴";
    	    	}
    		}
    	}
    	return arrZodiac;
    }
	
    private List intersectArr(String[] str1,  
    		String[] str2) {  
        int size1 = str1.length;  
        int size2 = str2.length; 
        LinkedList<String> list = new LinkedList<String>();   
//        TextView textView = (TextView)findViewById(R.id.textview_1);
//    	textView.append("\t"+"与97期相同的是：");
        if(size1 > size2){  
            for(int i = 0 ; i < size1 ; i ++){  
                for(int k = 0 ; k < size2 ; k ++){  
                    if(str1[i] == str2[k]){  
                        System.out.println("list1.get("+ i + ") == " + str1[i]);
 //                       textView.append(str1[i]+",");
                        list.add(str1[i]); 
                    }  
                }  
            }  
              
        }else{  
            for(int i = 0 ; i < size2 ; i ++){  
                for(int k = 0 ; k < size1 ; k ++){  
                    if(str2[i] == str1[k]){  
                        System.out.println("list2.get("+ i + ") == " + str2[i]); 
//                        textView.append(str2[i]+",");
                        list.add(str2[i]); 
                    }  
                }  
            }  
        }
//	    textView.append("\n");
	    return list;
    }
    
//生肖重复出现+位置相同   
    
    public void resultInsectZSame() {
        String[] delArrZ = deleteRepeatData(arrZ[arrZ.length-1]);
        TextView textView = (TextView)findViewById(R.id.textview_1); 
  		textView.append("\n"+"==========生肖和位置相同=========="+"\n"+"第"+(arrZ.length)+"期开奖结果：");
    	for(String j: arrZ[arrZ.length-1]){     		 
   		 textView.append(j+",");
   	    }
    	textView.append("\n");
    	
//每个生肖重复出现的次数
//        public void arrZResultCount(){
        int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;
	    textView.append("\n"+"每个生肖重复出现的次数"+"\n");

        for (int i = 0; i < arrZ.length-1; i++) {
            List result_insect = intersectArrSame(arrZ[i],arrZ[arrZ.length-1]);                         
            if (result_insect.size()>1){
    	        	for (int j=0; j<arrZ[i].length; j++) {
    	        		if (arrZ[i+1][j]=="羊") 
    	    	    		count1++;    			 
    	    			 else if (arrZ[i+1][j]=="马") 
	    	    	    	count2++;
    	    			 else if (arrZ[i+1][j]=="蛇") 
		    	    	    count3++;
    	    			 else if (arrZ[i+1][j]=="龙") 
		    	    	    count4++;
    	    			 else if (arrZ[i+1][j]=="兔") 
		    	    	    count5++;
    	    			 else if (arrZ[i+1][j]=="虎") 
		    	    	    count6++;
    	    			 else if (arrZ[i+1][j]=="牛") 
		    	    	    count7++;
    	    			 else if (arrZ[i+1][j]=="鼠") 
		    	    	    count8++;
    	    			 else if (arrZ[i+1][j]=="猪") 
		    	    	    count9++;
    	    			 else if (arrZ[i+1][j]=="狗") 
		    	    	    count10++;
    	    			 else if (arrZ[i+1][j]=="鸡") 
		    	    	    count11++;
    	    			 else if (arrZ[i+1][j]=="猴") 
		    	    	    count12++; 	        		
    	        		}
    	        }
            }
	    for (int i = 1; i < 2; i++) {
        	textView.append("羊重复出现的次数是："+count1+"\n"
        +"马重复出现的次数是："+count2+"\n"
        +"蛇重复出现的次数是："+count3+"\n"
        +"龙重复出现的次数是："+count4+"\n"
        +"兔重复出现的次数是："+count5+"\n"
        +"虎重复出现的次数是："+count6+"\n"
        +"牛重复出现的次数是："+count7+"\n"
        +"鼠重复出现的次数是："+count8+"\n"
        +"猪重复出现的次数是："+count9+"\n"
        +"狗重复出现的次数是："+count10+"\n"
        +"鸡重复出现的次数是："+count11+"\n"
        +"猴重复出现的次数是："+count12
        );
        }
        
        for (int i = 0; i < arrZ.length-1; i++) {
            List result_insect = intersectArrSame(arrZ[i],arrZ[arrZ.length-1]);   
                      
            if (result_insect.size()>1){
    	        textView.append("\n"+"2015_00"+(i+1)+"期:");
    	        	for (int j=0; j<arrZ[i].length; j++) {
    	        		textView.append(arrZ[i][j]+",");
    	        		}
    	    	textView.append("\n"+"\t"+"与"+(arrZ.length)+"期相同生肖和位置的号码是：");
    		        for (Object str : result_insect) {   
    		            textView.append((CharSequence) str+",");
    		        	}
    		    textView.append("\n"+"2015_00"+(i+2)+"期:");
    	        	for (int j=0; j<arrZ[i].length; j++) {
    	        		textView.append(arrZ[i+1][j]+",");
    	        		}
    		    textView.append("\n");
    	        }
            } 

            }
    
    private List intersectArrSame(String[] str1,  
    		String[] str2) {  
        int size1 = str1.length;  
        int size2 = str2.length; 
        LinkedList<String> list = new LinkedList<String>();   


        if(size1 > size2){  
            for(int i = 0 ; i < size1 ; i ++){  
                    if(str1[i] == str2[i]){  
                        System.out.println("list1.get("+ i + ") == " + str1[i]);
                        list.add(str1[i]); 
                    }  
                  
            }  
              
        }else{  
            for(int i = 0 ; i < size2 ; i ++){  
                    if(str2[i] == str1[i]){  
                        System.out.println("list2.get("+ i + ") == " + str2[i]); 
                        list.add(str2[i]); 
                    }  
                  
            }  
        }

	    return list;
    }

    private String[] deleteRepeatData(String[] arr) {  
		String[] arr1 = new String[6];
		TextView textView = (TextView)findViewById(R.id.textview_1);
    	Set<String> set = new HashSet<String>();
    	 for(String i : arr)
    	 set.add(i);
    	 textView.append("\n");
    	return set.toArray(arr1);
    	
          
    }

    private List intersectArrC(String[] str1,  
    		String[] str2) {  
        int size1 = str1.length;  
        int size2 = str2.length; 
    	int c =0 ;
        LinkedList<String> list = new LinkedList<String>();   

        if(size1 > size2){  
            for(int i = 0 ; i < size1 ; i ++){  
                for(int k = 0 ; k < size2 ; k ++){  
                    if(str1[i] == str2[k]){

                        System.out.println("list1.get("+ i + ") == " + str1[i]);
                        if(c==0){
	                        list.add(str1[i]);
	                        c=i;
                        }
                        else if(c==i-1){
                            list.add(str1[i]);
                            c=i;
                        }
                        	
                    }  
                }  
            }  
              
        }else{  
            for(int i = 0 ; i < size2 ; i ++){  
                for(int k = 0 ; k < size1 ; k ++){  
                    if(str2[i] == str1[k]){  
                        System.out.println("list2.get("+ i + ") == " + str2[i]); 

                        list.add(str2[i]); 
                    }  
                }  
            }  
        }

	    return list;
    }
//求生肖相同的子串,并根据子串进行归纳统计
    
    public  void resultHasSameSubStrGN(String sgn){
   	 
   	 
   	 String[] subStr = new String[arrZ.length];
   	
   	 for (int i=0 ; i<arrZ.length;i++) {
   		String temp = arrZ[i][0];
   		for (int j = 0; j<5;j++) {
   			temp=temp+arrZ[i][j+1];
   			subStr[i] = temp ;
   		} 
   		System.out.println(subStr[i]);
   	 }
   	TextView textView = (TextView)findViewById(R.id.textview_1);

   	        	
   	//每个生肖重复出现的次数

   		        int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;


   		        for (int i = 0; i < arrZ.length-1; i++) {
   		            List result_insect = hasSameSubStr(subStr[i],subStr[subStr.length-1]);                         
   		            if (result_insect.contains(sgn)){
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		if (arrZ[i+1][j]=="羊") 
   		    	    	    		count1++;    			 
   		    	    			 else if (arrZ[i+1][j]=="马") 
   			    	    	    	count2++;
   		    	    			 else if (arrZ[i+1][j]=="蛇") 
   				    	    	    count3++;
   		    	    			 else if (arrZ[i+1][j]=="龙") 
   				    	    	    count4++;
   		    	    			 else if (arrZ[i+1][j]=="兔") 
   				    	    	    count5++;
   		    	    			 else if (arrZ[i+1][j]=="虎") 
   				    	    	    count6++;
   		    	    			 else if (arrZ[i+1][j]=="牛") 
   				    	    	    count7++;
   		    	    			 else if (arrZ[i+1][j]=="鼠") 
   				    	    	    count8++;
   		    	    			 else if (arrZ[i+1][j]=="猪") 
   				    	    	    count9++;
   		    	    			 else if (arrZ[i+1][j]=="狗") 
   				    	    	    count10++;
   		    	    			 else if (arrZ[i+1][j]=="鸡") 
   				    	    	    count11++;
   		    	    			 else if (arrZ[i+1][j]=="猴") 
   				    	    	    count12++; 	        		
   		    	        		}
   		    	        }
   		            }

   			    if (count1+count2+count3+count4+count5+count6+count7+count8+count9+count10+count11+count12!=0) {
    		        
   			    	textView.append("\n"+"==========生肖连续相同（归纳）=========="+"\n"+"第"+(arrZ.length)+"期开奖结果：");
   			    	for(String j: arrZ[arrZ.length-1]){     		 
   			    		textView.append(j+",");
   			    	}
   			    	textView.append("\n");
   	   			    textView.append("\n"+"每个生肖重复出现的次数"+"\n");
   		        	textView.append("羊重复出现的次数是："+count1+"\n"
   		        +"马重复出现的次数是："+count2+"\n"
   		        +"蛇重复出现的次数是："+count3+"\n"
   		        +"龙重复出现的次数是："+count4+"\n"
   		        +"兔重复出现的次数是："+count5+"\n"
   		        +"虎重复出现的次数是："+count6+"\n"
   		        +"牛重复出现的次数是："+count7+"\n"
   		        +"鼠重复出现的次数是："+count8+"\n"
   		        +"猪重复出现的次数是："+count9+"\n"
   		        +"狗重复出现的次数是："+count10+"\n"
   		        +"鸡重复出现的次数是："+count11+"\n"
   		        +"猴重复出现的次数是："+count12
   		        );
   		        }

   		        
  		           	        	
   		        for (int i = 0; i < arrZ.length-1; i++) {
   		         List result_insect = hasSameSubStr(subStr[i],subStr[subStr.length-1]);     
   		                       
   		            if (result_insect.contains(sgn)){
   		    	        textView.append("\n"+"2015_00"+(i+1)+"期:");
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		textView.append(arrZ[i][j]+",");
   		    	        		}
   		    	    	textView.append("\n"+"\t"+"与"+(arrZ.length)+"期相同的号码是：");
   		    		        for (Object str : result_insect) {   
   		    		            textView.append((CharSequence) str+",");
   		    		        	}
   		    		    textView.append("\n"+"2015_00"+(i+2)+"期:");
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		textView.append(arrZ[i+1][j]+",");
   		    	        		}
   		    		    textView.append("\n");
   		    	        }
   		            }

  		    

       
    }    
//求生肖相同的子串
    
    public  void resultHasSameSubStr(){
   	 
   	 
   	 String[] subStr = new String[arrZ.length];
   	
   	 for (int i=0 ; i<arr.length;i++) {
   		String temp = arr[i][0];
   		for (int j = 0; j<5;j++) {
   			temp=temp+arrZ[i][j+1];
   			subStr[i] = temp ;
   		} 
   		System.out.println(subStr[i]);
   	 }
   	TextView textView = (TextView)findViewById(R.id.textview_1);
	            		        
   	      		textView.append("\n"+"==========生肖连续相同=========="+"\n"+"第"+(arrZ.length)+"期开奖结果：");
   	        	for(String j: arrZ[arrZ.length-1]){     		 
   	       		 textView.append(j+",");
   	       	    }
   	        	textView.append("\n");
   	        	
   	//每个生肖重复出现的次数

   		        int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;
   			    textView.append("\n"+"每个生肖重复出现的次数"+"\n");

   		        for (int i = 0; i < arrZ.length-1; i++) {
   		            List result_insect = hasSameSubStr(subStr[i],subStr[subStr.length-1]);                         
   		            if (result_insect.size()>0){
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		if (arrZ[i+1][j]=="羊") 
   		    	    	    		count1++;    			 
   		    	    			 else if (arrZ[i+1][j]=="马") 
   			    	    	    	count2++;
   		    	    			 else if (arrZ[i+1][j]=="蛇") 
   				    	    	    count3++;
   		    	    			 else if (arrZ[i+1][j]=="龙") 
   				    	    	    count4++;
   		    	    			 else if (arrZ[i+1][j]=="兔") 
   				    	    	    count5++;
   		    	    			 else if (arrZ[i+1][j]=="虎") 
   				    	    	    count6++;
   		    	    			 else if (arrZ[i+1][j]=="牛") 
   				    	    	    count7++;
   		    	    			 else if (arrZ[i+1][j]=="鼠") 
   				    	    	    count8++;
   		    	    			 else if (arrZ[i+1][j]=="猪") 
   				    	    	    count9++;
   		    	    			 else if (arrZ[i+1][j]=="狗") 
   				    	    	    count10++;
   		    	    			 else if (arrZ[i+1][j]=="鸡") 
   				    	    	    count11++;
   		    	    			 else if (arrZ[i+1][j]=="猴") 
   				    	    	    count12++; 	        		
   		    	        		}
   		    	        }
   		            }
   			    for (int i = 1; i < 2; i++) {
   		        	textView.append("羊重复出现的次数是："+count1+"\n"
   		        +"马重复出现的次数是："+count2+"\n"
   		        +"蛇重复出现的次数是："+count3+"\n"
   		        +"龙重复出现的次数是："+count4+"\n"
   		        +"兔重复出现的次数是："+count5+"\n"
   		        +"虎重复出现的次数是："+count6+"\n"
   		        +"牛重复出现的次数是："+count7+"\n"
   		        +"鼠重复出现的次数是："+count8+"\n"
   		        +"猪重复出现的次数是："+count9+"\n"
   		        +"狗重复出现的次数是："+count10+"\n"
   		        +"鸡重复出现的次数是："+count11+"\n"
   		        +"猴重复出现的次数是："+count12
   		        );
   		        }
   		        
  		           	        	
   		        for (int i = 0; i < arrZ.length-1; i++) {
   		         List result_insect = hasSameSubStr(subStr[i],subStr[subStr.length-1]);     
   		                       
   		            if (result_insect.size()>0){
   		    	        textView.append("\n"+"2015_00"+(i+1)+"期:");
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		textView.append(arrZ[i][j]+",");
   		    	        		}
   		    	    	textView.append("\n"+"\t"+"与"+(arrZ.length)+"期相同的号码是：");
   		    		        for (Object str : result_insect) {   
   		    		            textView.append((CharSequence) str+",");
   		    		        	}
   		    		    textView.append("\n"+"2015_00"+(i+2)+"期:");
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		textView.append(arrZ[i+1][j]+",");
   		    	        		}
   		    		    textView.append("\n");
   		    	        }
   		            }

  		    

       
    }
    private List hasSameSubStr (String s1,String s2) {
   	  List<String> sub1 = new ArrayList<String>();//保存s1的子串
   	  List<String> sub2 = new ArrayList<String>();//保存s2的子串
      LinkedList<String> list = new LinkedList<String>(); //保存相同的子串
   	  
   	  //求s1的子串
   	  for(int i = 2;i<s1.length();i++){
   	   for(int j = 0;j<=s1.length()-i;j++){
   	    sub1.add(s1.substring(j,j+i));
   	   }
   	  }
   	  
   	  //求s2的子串
   	  for(int i = 2;i<s2.length();i++){
   	   for(int j = 0;j<=s2.length()-i;j++){
   	    sub2.add(s2.substring(j,j+i));
   	   }
   	  }
   	  
   	  System.out.println("\"AABBC\"的子串 ： " + sub1);
   	  System.out.println("\"ABBCC\"的子串 ： " + sub2);
   	  
   	  for(String s: sub1)
   	   if(sub2.contains(s))
   		list.add(s);
   	  
/*   	  for(String s: sub2)
   	   if(sub1.contains(s))
   		list.add(s);
*/   	  
   	  System.out.println("相同的子串 ： " + list);
      return list;
   	 }
    

    

    
    
}
