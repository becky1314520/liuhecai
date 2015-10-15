package com.example.liuhecai.activity;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;

import android.view.Menu;
import android.widget.TextView;

import com.example.liuhecai.R;
import com.example.liuhecai.util.NoinfoToXml;
import com.example.liuhecai.util.ShangXiaSame;

public class MainActivity extends Activity {
    

    NoinfoToXml noinfoToXml = new NoinfoToXml();
    String[][] arr = noinfoToXml.LoadParaFromXml(); 


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.textview_1);
        textView.setBackgroundColor(Color.parseColor("#99ffcc"));
        textView.setTextSize(11);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        Intent intent = getIntent();
        int selectQishu = intent.getIntExtra("select_qishu", 0);
        String s = String.valueOf(selectQishu);

//        resultInsect();

      	String[] subStrGN = new String[selectQishu];
        	
      	 for (int i=0 ; i<selectQishu;i++) {
       		String temp = arrZ[i][0];
       		for (int j = 0; j<5;j++) {
       			temp=temp+arrZ[i][j+1];
       			subStrGN[i] = temp ;
       		} 

       	 }
       	 
        for (int m = 2;m<6;m++)
        	for (int n =0;n<=6-m;n++) {
                resultHasSameSubStrGN(subStrGN[subStrGN.length-1].substring(n, m+n),selectQishu);        		
        	}
       
        ShangXiaSame shangXiaSame = new ShangXiaSame();
        shangXiaSame.ResultHasShangXia2Same (arr,arrZ,selectQishu, textView);
        shangXiaSame.ResultHasShangXia3Same (arr,arrZ,selectQishu, textView);
        shangXiaSame.ResultHasShangXia2Same_Zxie (arr,arrZ,selectQishu, textView);
        shangXiaSame.ResultHasShangXia3Same_Zxie (arr,arrZ,selectQishu, textView);
        shangXiaSame.ResultHasShangXia2Same_Fxie (arr,arrZ,selectQishu, textView);
        shangXiaSame.ResultHasShangXia3Same_Fxie (arr,arrZ,selectQishu, textView);
//      resultInsectZSame();        


//          resultHasSameSubStr();

//          resultInsectZ();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
  //���ϲʣ������Ľ���
    public void resultInsect() {   
    	     
 
        //����insect   

        for (int i = 0; i < arr.length-1; i++) {
        List result_insect = intersect(arr[i],arr[arr.length-1]);   

        TextView textView = (TextView)findViewById(R.id.textview_1);
        if (result_insect.size()>1){
	        textView.append("\n"+"2015_00"+(i+1)+"��:");
	        	for (int j=0; j<arr[i].length; j++) {
	        		textView.append(arr[i][j]+",");
	        		}
	    	textView.append("\t"+"��97����ͬ�ĺ����ǣ�");
		        for (Object str : result_insect) {   
		            textView.append((CharSequence) str+",");
		        }
		    textView.append("\n"+"2015_00"+(i+2)+"��:");
	        	for (int j=0; j<arr[i].length; j++) {
	        		textView.append(arr[i+1][j]+",");
	        		}
		    textView.append("\n");
		    
	        }
        }
    } 

//�����Ľ���    
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
	
//���ϲʣ�����Ф�Ľ���
	
	 String[][] arrZ =  changeNoToZodiac(arr) ;

	 public void resultInsectZ() {	     

	        TextView textView = (TextView)findViewById(R.id.textview_1);
	        
	          
	        String[] delArrZ = deleteRepeatData(arrZ[arrZ.length-1]);
	        
      		textView.append("\n"+"==========��Ф����������������ͬ=========="+"\n"+"��"+(arrZ.length)+"�ڿ��������");
        	for(String j: arrZ[arrZ.length-1]){     		 
       		 textView.append(j+",");
       	    }
        	textView.append("\n");
        	

	        int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;
		    textView.append("\n"+"ÿ����Ф�ظ����ֵĴ���"+"\n");

	        for (int i = 0; i < arrZ.length-1; i++) {
	            List result_insect = intersectArr(arrZ[i],delArrZ);                         
	            if (result_insect.size()>1){
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		if (arrZ[i+1][j]=="��") 
	    	    	    		count1++;    			 
	    	    			 else if (arrZ[i+1][j]=="��") 
		    	    	    	count2++;
	    	    			 else if (arrZ[i+1][j]=="��") 
			    	    	    count3++;
	    	    			 else if (arrZ[i+1][j]=="��") 
			    	    	    count4++;
	    	    			 else if (arrZ[i+1][j]=="��") 
			    	    	    count5++;
	    	    			 else if (arrZ[i+1][j]=="��") 
			    	    	    count6++;
	    	    			 else if (arrZ[i+1][j]=="ţ") 
			    	    	    count7++;
	    	    			 else if (arrZ[i+1][j]=="��") 
			    	    	    count8++;
	    	    			 else if (arrZ[i+1][j]=="��") 
			    	    	    count9++;
	    	    			 else if (arrZ[i+1][j]=="��") 
			    	    	    count10++;
	    	    			 else if (arrZ[i+1][j]=="��") 
			    	    	    count11++;
	    	    			 else if (arrZ[i+1][j]=="��") 
			    	    	    count12++; 	        		
	    	        		}
	    	        }
	            }
		    for (int i = 1; i < 2; i++) {
	        	textView.append("���ظ����ֵĴ����ǣ�"+count1+"\n"
	        +"���ظ����ֵĴ����ǣ�"+count2+"\n"
	        +"���ظ����ֵĴ����ǣ�"+count3+"\n"
	        +"���ظ����ֵĴ����ǣ�"+count4+"\n"
	        +"���ظ����ֵĴ����ǣ�"+count5+"\n"
	        +"���ظ����ֵĴ����ǣ�"+count6+"\n"
	        +"ţ�ظ����ֵĴ����ǣ�"+count7+"\n"
	        +"���ظ����ֵĴ����ǣ�"+count8+"\n"
	        +"���ظ����ֵĴ����ǣ�"+count9+"\n"
	        +"���ظ����ֵĴ����ǣ�"+count10+"\n"
	        +"���ظ����ֵĴ����ǣ�"+count11+"\n"
	        +"���ظ����ֵĴ����ǣ�"+count12
	        );
	        }
	        
	        

	    }
	 
	public String[][] changeNoToZodiac(String[][] arrNo) {
    	String[][] arrZodiac = new String[arr.length][6];

    	for (int i=0; i<arrNo.length; i++) {
    		for (int j=0; j<arr[i].length; j++) {
    			if(arrNo[i][j].contains("NA")) {
    				
    			} else {
    			 if (Integer.parseInt(arrNo[i][j])%12==1) 
    	    		arrZodiac[i][j]="��";    			 
    			 else if (Integer.parseInt(arrNo[i][j])%12==2) 
 	    			arrZodiac[i][j]="��";
    			 else if (Integer.parseInt(arrNo[i][j])%12==3) 
 	 	    		arrZodiac[i][j]="��";
    			 else if (Integer.parseInt(arrNo[i][j])%12==4) 
  	    			arrZodiac[i][j]="��";
    			 else if (Integer.parseInt(arrNo[i][j])%12==5) 
  	    			arrZodiac[i][j]="��";
    			 else if (Integer.parseInt(arrNo[i][j])%12==6) 
  	    			arrZodiac[i][j]="��";
    			 else if (Integer.parseInt(arrNo[i][j])%12==7) 
  	    			arrZodiac[i][j]="ţ";
    			 else if (Integer.parseInt(arrNo[i][j])%12==8) 
  	    			arrZodiac[i][j]="��";
    			 else if (Integer.parseInt(arrNo[i][j])%12==9) 
  	    			arrZodiac[i][j]="��";
    			 else if (Integer.parseInt(arrNo[i][j])%12==10) 
  	    			arrZodiac[i][j]="��";
    			 else if (Integer.parseInt(arrNo[i][j])%12==11) 
  	    			arrZodiac[i][j]="��";
    			 else if (Integer.parseInt(arrNo[i][j])%12==0) 
  	    			arrZodiac[i][j]="��";
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

        if(size1 > size2){  
            for(int i = 0 ; i < size1 ; i ++){  
                for(int k = 0 ; k < size2 ; k ++){  
                    if(str1[i] == str2[k]){  
                        list.add(str1[i]); 
                    }  
                }  
            }  
              
        }else{  
            for(int i = 0 ; i < size2 ; i ++){  
                for(int k = 0 ; k < size1 ; k ++){  
                    if(str2[i] == str1[k]){  
                        list.add(str2[i]); 
                    }  
                }  
            }  
        }

	    return list;
    }
    
//��Ф�ظ�����+λ����ͬ   
    
    public void resultInsectZSame() {
        String[] delArrZ = deleteRepeatData(arrZ[arrZ.length-1]);
        TextView textView = (TextView)findViewById(R.id.textview_1); 
  		textView.append("\n"+"==========��Ф��λ����ͬ=========="+"\n"+"��"+(arrZ.length)+"�ڿ��������");
    	for(String j: arrZ[arrZ.length-1]){     		 
   		 textView.append(j+",");
   	    }
    	textView.append("\n");
    	
//ÿ����Ф�ظ����ֵĴ���

        int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;
	    textView.append("\n"+"ÿ����Ф�ظ����ֵĴ���"+"\n");

        for (int i = 0; i < arrZ.length-1; i++) {
            List result_insect = intersectArrSame(arrZ[i],arrZ[arrZ.length-1]);                         
            if (result_insect.size()>1){
    	        	for (int j=0; j<arrZ[i].length; j++) {
    	        		if (arrZ[i+1][j]=="��") 
    	    	    		count1++;    			 
    	    			 else if (arrZ[i+1][j]=="��") 
	    	    	    	count2++;
    	    			 else if (arrZ[i+1][j]=="��") 
		    	    	    count3++;
    	    			 else if (arrZ[i+1][j]=="��") 
		    	    	    count4++;
    	    			 else if (arrZ[i+1][j]=="��") 
		    	    	    count5++;
    	    			 else if (arrZ[i+1][j]=="��") 
		    	    	    count6++;
    	    			 else if (arrZ[i+1][j]=="ţ") 
		    	    	    count7++;
    	    			 else if (arrZ[i+1][j]=="��") 
		    	    	    count8++;
    	    			 else if (arrZ[i+1][j]=="��") 
		    	    	    count9++;
    	    			 else if (arrZ[i+1][j]=="��") 
		    	    	    count10++;
    	    			 else if (arrZ[i+1][j]=="��") 
		    	    	    count11++;
    	    			 else if (arrZ[i+1][j]=="��") 
		    	    	    count12++; 	        		
    	        		}
    	        }
            }
	    for (int i = 1; i < 2; i++) {
        	textView.append("���ظ����ֵĴ����ǣ�"+count1+"\n"
        +"���ظ����ֵĴ����ǣ�"+count2+"\n"
        +"���ظ����ֵĴ����ǣ�"+count3+"\n"
        +"���ظ����ֵĴ����ǣ�"+count4+"\n"
        +"���ظ����ֵĴ����ǣ�"+count5+"\n"
        +"���ظ����ֵĴ����ǣ�"+count6+"\n"
        +"ţ�ظ����ֵĴ����ǣ�"+count7+"\n"
        +"���ظ����ֵĴ����ǣ�"+count8+"\n"
        +"���ظ����ֵĴ����ǣ�"+count9+"\n"
        +"���ظ����ֵĴ����ǣ�"+count10+"\n"
        +"���ظ����ֵĴ����ǣ�"+count11+"\n"
        +"���ظ����ֵĴ����ǣ�"+count12
        );
        }
        
        for (int i = 0; i < arrZ.length-1; i++) {
            List result_insect = intersectArrSame(arrZ[i],arrZ[arrZ.length-1]);   
                      
            if (result_insect.size()>1){
    	        textView.append("\n"+"2015_00"+(i+1)+"��:");
    	        	for (int j=0; j<arrZ[i].length; j++) {
    	        		textView.append(arrZ[i][j]+",");
    	        		}
    	    	textView.append("\n"+"\t"+"��"+(arrZ.length)+"����ͬ��Ф��λ�õĺ����ǣ�");
    		        for (Object str : result_insect) {   
    		            textView.append((CharSequence) str+",");
    		        	}
    		    textView.append("\n"+"2015_00"+(i+2)+"��:");
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
                        list.add(str1[i]); 
                    }  
                  
            }  
              
        }else{  
            for(int i = 0 ; i < size2 ; i ++){  
                    if(str2[i] == str1[i]){  
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
                        list.add(str2[i]); 
                    }  
                }  
            }  
        }

	    return list;
    }
//����Ф��ͬ���Ӵ�,�������Ӵ����й���ͳ��
    
    public  void resultHasSameSubStrGN(String sgn,int selectQishu){
   	 
   	 
   	 String[] subStr = new String[selectQishu];
   	
   	 for (int i=0 ; i<selectQishu;i++) {
   		String temp = arrZ[i][0];
   		for (int j = 0; j<5;j++) {
   			temp=temp+arrZ[i][j+1];
   			subStr[i] = temp ;
   		} 
   	 }
   	TextView textView = (TextView)findViewById(R.id.textview_1);

   	        	
   	//ÿ����Ф�ظ����ֵĴ���

   		        int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;


   		        for (int i = 0; i < selectQishu-1; i++) {
   		            List result_insect = hasSameSubStr(subStr[i],subStr[subStr.length-1]);                         
   		            if (result_insect.contains(sgn)){
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		if (arrZ[i+1][j]=="��") 
   		    	    	    		count1++;    			 
   		    	    			 else if (arrZ[i+1][j]=="��") 
   			    	    	    	count2++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count3++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count4++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count5++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count6++;
   		    	    			 else if (arrZ[i+1][j]=="ţ") 
   				    	    	    count7++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count8++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count9++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count10++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count11++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count12++; 	        		
   		    	        		}
   		    	        }
   		            }

   			    if (count1+count2+count3+count4+count5+count6+count7+count8+count9+count10+count11+count12!=0) {
    		        
   			    	textView.append("\n"+"==========��Ф������ͬ�����ɣ�=========="+"\n"+"��"+(selectQishu)+"�ڿ��������");
   			    	for(String j: arrZ[selectQishu-1]){     		 
   			    		textView.append(j+",");
   			    	}
   		    		textView.append("|");
   			    	for(String j: arr[selectQishu-1]){     		 
   			    		textView.append(j+",");
   			    	}
/*   			    	textView.append("\n");
   	   			    textView.append("\n"+"ÿ����Ф�ظ����ֵĴ���"+"\n");
   		        	textView.append("���ظ����ֵĴ����ǣ�"+count1+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count2+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count3+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count4+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count5+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count6+"\n"
   		        +"ţ�ظ����ֵĴ����ǣ�"+count7+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count8+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count9+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count10+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count11+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count12
   		        );
*/   		        }

   		        
  		           	        	
   		        for (int i = 0; i < selectQishu-1; i++) {
   		         List result_insect = hasSameSubStr(subStr[i],subStr[subStr.length-1]);     
   		                       
   		            if (result_insect.contains(sgn)){
   		    	        textView.append("\n"+"2015_00"+(i+1)+"��:");
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		textView.append(arrZ[i][j]+",");
   		    	        		}
		    	        		textView.append("|");
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		textView.append(arr[i][j]+",");
   		    	        		}
   		    	    	textView.append("\n"+"\t"+"��"+(selectQishu)+"����ͬ�ĺ����ǣ�");
   		    		        for (Object str : result_insect) {   
   		    		            textView.append((CharSequence) str+",");
   		    		        	}
   		    		    textView.append("\n"+"2015_00"+(i+2)+"��:");
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		textView.append(arrZ[i+1][j]+",");
   		    	        		}
	    	        		textView.append("|");
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		textView.append(arr[i+1][j]+",");
   		    	        		}
   		    		    textView.append("\n");
   		    	        }
   		            }

  		    

       
    }    
//����Ф��ͬ���Ӵ�
    
    public  void resultHasSameSubStr(){
   	 
   	 
   	 String[] subStr = new String[arrZ.length];
   	
   	 for (int i=0 ; i<arr.length;i++) {
   		String temp = arr[i][0];
   		for (int j = 0; j<5;j++) {
   			temp=temp+arrZ[i][j+1];
   			subStr[i] = temp ;
   		} 
   	 }
   	TextView textView = (TextView)findViewById(R.id.textview_1);
	            		        
   	      		textView.append("\n"+"==========��Ф������ͬ=========="+"\n"+"��"+(arrZ.length)+"�ڿ��������");
   	        	for(String j: arrZ[arrZ.length-1]){     		 
   	       		 textView.append(j+",");
   	       	    }
   	        	textView.append("\n");
   	        	
   	//ÿ����Ф�ظ����ֵĴ���

   		        int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0,count12=0;
   			    textView.append("\n"+"ÿ����Ф�ظ����ֵĴ���"+"\n");

   		        for (int i = 0; i < arrZ.length-1; i++) {
   		            List result_insect = hasSameSubStr(subStr[i],subStr[subStr.length-1]);                         
   		            if (result_insect.size()>0){
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		if (arrZ[i+1][j]=="��") 
   		    	    	    		count1++;    			 
   		    	    			 else if (arrZ[i+1][j]=="��") 
   			    	    	    	count2++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count3++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count4++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count5++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count6++;
   		    	    			 else if (arrZ[i+1][j]=="ţ") 
   				    	    	    count7++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count8++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count9++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count10++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count11++;
   		    	    			 else if (arrZ[i+1][j]=="��") 
   				    	    	    count12++; 	        		
   		    	        		}
   		    	        }
   		            }
   			    for (int i = 1; i < 2; i++) {
   		        	textView.append("���ظ����ֵĴ����ǣ�"+count1+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count2+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count3+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count4+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count5+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count6+"\n"
   		        +"ţ�ظ����ֵĴ����ǣ�"+count7+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count8+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count9+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count10+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count11+"\n"
   		        +"���ظ����ֵĴ����ǣ�"+count12
   		        );
   		        }
   		        
  		           	        	
   		        for (int i = 0; i < arrZ.length-1; i++) {
   		         List result_insect = hasSameSubStr(subStr[i],subStr[subStr.length-1]);     
   		                       
   		            if (result_insect.size()>0){
   		    	        textView.append("\n"+"2015_00"+(i+1)+"��:");
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		textView.append(arrZ[i][j]+",");
   		    	        		}
   		    	    	textView.append("\n"+"\t"+"��"+(arrZ.length)+"����ͬ�ĺ����ǣ�");
   		    		        for (Object str : result_insect) {   
   		    		            textView.append((CharSequence) str+",");
   		    		        	}
   		    		    textView.append("\n"+"2015_00"+(i+2)+"��:");
   		    	        	for (int j=0; j<arrZ[i].length; j++) {
   		    	        		textView.append(arrZ[i+1][j]+",");
   		    	        		}
   		    		    textView.append("\n");
   		    	        }
   		            }

  		    

       
    }
    private List hasSameSubStr (String s1,String s2) {
   	  List<String> sub1 = new ArrayList<String>();//����s1���Ӵ�
   	  List<String> sub2 = new ArrayList<String>();//����s2���Ӵ�
      LinkedList<String> list = new LinkedList<String>(); //������ͬ���Ӵ�
   	  
   	  //��s1���Ӵ�
   	  for(int i = 2;i<s1.length();i++){
   	   for(int j = 0;j<=s1.length()-i;j++){
   	    sub1.add(s1.substring(j,j+i));
   	   }
   	  }
   	  
   	  //��s2���Ӵ�
   	  for(int i = 2;i<s2.length();i++){
   	   for(int j = 0;j<=s2.length()-i;j++){
   	    sub2.add(s2.substring(j,j+i));
   	   }
   	  }

   	  
   	  for(String s: sub1)
   	   if(sub2.contains(s))
   		list.add(s);
   	  
/*   	  for(String s: sub2)
   	   if(sub1.contains(s))
   		list.add(s);
*/   	  
   	  System.out.println("��ͬ���Ӵ� �� " + list);
      return list;
   	 }
    

    

    
    
}
