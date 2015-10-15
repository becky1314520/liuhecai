package com.example.liuhecai.util;

import java.util.LinkedList;
import java.util.List;

import android.widget.TextView;

import com.example.liuhecai.R;



public class ShangXiaSame {

	public LinkedList hasShangXia2SameDAYU0 (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i<selectQishu-1; i++) {
			for (int l = 0; l<6; l++) {
				if (arrZ[i][l]==arrZ[selectQishu-1][k] &&arrZ[i-1][l]==arrZ[selectQishu-2][k] ) {	
					list.add(Integer.valueOf(i));
				}
			}			
		}
		return list;
	}
	
	public void hasShangXia2Same (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
		
		
		
		for (int i = 1; i<selectQishu-1; i++) {
			for (int l = 0; l<6; l++) {
				if (arrZ[i][l]==arrZ[selectQishu-1][k] &&arrZ[i-1][l]==arrZ[selectQishu-2][k] ) {

					textView.append("\n"+"2015_00"+(i)+"��:");
    	        	for (int j=0; j<arrZ[i].length; j++) {
    	        		textView.append(arrZ[i-1][j]+",");
    	        		}
	        		textView.append("|");
    	        	for (int j=0; j<arrZ[i].length; j++) {
    	        		textView.append(arr[i-1][j]+",");
    	        		}
    	        	
					textView.append("\n"+"2015_00"+(i+1)+"��:");
    	        	for (int j=0; j<arrZ[i].length; j++) {
    	        		textView.append(arrZ[i][j]+",");
    	        		}
	        		textView.append("|");
    	        	for (int j=0; j<arrZ[i].length; j++) {
    	        		textView.append(arr[i][j]+",");
    	        		}
    	        	
    	    	textView.append("\n"+"\t"+"��"+(selectQishu)+"����ͬ�ĺ����ǣ�");
    		            textView.append((CharSequence) arrZ[selectQishu-2][k]+","+arrZ[selectQishu-1][k]);

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
	}	


	public void ResultHasShangXia2Same (String arr[][],String arrZ[][],int selectQishu, TextView textView) {

	    for (int i = 0; i<6; i++) {
		    LinkedList<Integer> list = new LinkedList<Integer>();
		    list = hasShangXia2SameDAYU0(arr,arrZ, selectQishu,i , textView);
		if (list.size()>0) {
	        
	    	textView.append("\n"+"==========��Ф����2����ͬ�����ɣ�=========="+"\n"+"��"+(selectQishu-1)+"�ڿ��������");
	    	for(String j: arrZ[selectQishu-2]){     		 
	    		textView.append(j+",");
	    	}
    		textView.append("|");
	    	for(String j: arr[selectQishu-2]){     		 
	    		textView.append(j+",");
	    	}
	    	textView.append("\n"+"��"+(selectQishu)+"�ڿ��������");
	    	for(String j: arrZ[selectQishu-1]){     		 
	    		textView.append(j+",");
	    	}
    		textView.append("|");
	    	for(String j: arr[selectQishu-1]){     		 
	    		textView.append(j+",");
	    	}
		}
			    
	    	hasShangXia2Same (arr,arrZ, selectQishu,i , textView);
	    }
	}
	    /*
	     * ����������ͬ
	     */
	    
		public LinkedList hasShangXia3SameDAYU0 (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			for (int i = 1; i<selectQishu-2; i++) {
				for (int l = 0; l<6; l++) {
					if (arrZ[i][l]==arrZ[selectQishu-1][k] &&arrZ[i-1][l]==arrZ[selectQishu-2][k] &&arrZ[i-2][l]==arrZ[selectQishu-3][k]) {	
						list.add(Integer.valueOf(i));
					}
				}			
			}
			return list;
		}
		
		public void hasShangXia3Same (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
			
			
			
			for (int i = 1; i<selectQishu-2; i++) {
				for (int l = 0; l<6; l++) {
					if (arrZ[i][l]==arrZ[selectQishu-1][k] &&arrZ[i-1][l]==arrZ[selectQishu-2][k] &&arrZ[i-2][l]==arrZ[selectQishu-3][k]) {

						textView.append("\n"+"2015_00"+(i-1)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i-2][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i-2][j]+",");
	    	        		}
	    	        	
						textView.append("\n"+"2015_00"+(i)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i-1][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i-1][j]+",");
	    	        		}
	    	        	
						textView.append("\n"+"2015_00"+(i+1)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i][j]+",");
	    	        		}
	    	        	
	    	    	textView.append("\n"+"\t"+"��"+(selectQishu)+"����ͬ�ĺ����ǣ�");
	    		            textView.append((CharSequence) arrZ[selectQishu-3][k]+","+arrZ[selectQishu-2][k]+","+arrZ[selectQishu-1][k]);

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
		}	


		public void ResultHasShangXia3Same (String arr[][],String arrZ[][],int selectQishu, TextView textView) {

		    for (int i = 0; i<6; i++) {
			    LinkedList<Integer> list = new LinkedList<Integer>();
			    list = hasShangXia3SameDAYU0(arr,arrZ, selectQishu,i , textView);
			if (list.size()>0) {
		    	textView.append("\n"+"==========��Ф����3����ͬ�����ɣ�=========="+"\n"+"��"+(selectQishu-2)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-3]){     		 
		    		textView.append(j+",");
		    	}	
		    	
	    		textView.append("|");
		    	for(String j: arr[selectQishu-3]){     		 
		    		textView.append(j+",");
		    	}
		    	
		    	textView.append("\n"+"��"+(selectQishu-1)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-2]){     		 
		    		textView.append(j+",");
		    	}
	    		textView.append("|");
		    	for(String j: arr[selectQishu-2]){     		 
		    		textView.append(j+",");
		    	}
		    	textView.append("\n"+"��"+(selectQishu)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-1]){     		 
		    		textView.append(j+",");
		    	}
	    		textView.append("|");
		    	for(String j: arr[selectQishu-1]){     		 
		    		textView.append(j+",");
		    	}
		    	
			}
				    
		    	hasShangXia3Same (arr,arrZ, selectQishu,i , textView);
		    }

	        
	}       	        	

		/*
		 * ����2����б��ͬ/
		 */
		public LinkedList hasShangXia2SameDAYU0_Fxie (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			for (int i = 1; i<selectQishu-1; i++) {
				for (int l = 0; l<5; l++) {
					if (arrZ[i][l+1]==arrZ[selectQishu-1][k+1] &&arrZ[i-1][l]==arrZ[selectQishu-2][k] ) {	
						list.add(Integer.valueOf(i));
					}
				}			
			}
			return list;
		}
		
		public void hasShangXia2Same_Fxie (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
			
			
			
			for (int i = 1; i<selectQishu-1; i++) {
				for (int l = 0; l<5; l++) {
					if (arrZ[i][l+1]==arrZ[selectQishu-1][k+1] &&arrZ[i-1][l]==arrZ[selectQishu-2][k] ) {
						textView.append("\n"+"2015_00"+(i)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i-1][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i-1][j]+",");
	    	        		}
	    	        	
						textView.append("\n"+"2015_00"+(i+1)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i][j]+",");
	    	        		}
	    	        	
	    	    	textView.append("\n"+"\t"+"��"+(selectQishu)+"����ͬ�ĺ����ǣ�");
	    		            textView.append((CharSequence) arrZ[selectQishu-2][k]+","+arrZ[selectQishu-1][k+1]);

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
		}	


		public void ResultHasShangXia2Same_Fxie (String arr[][],String arrZ[][],int selectQishu, TextView textView) {

		    for (int i = 0; i<5; i++) {
			    LinkedList<Integer> list = new LinkedList<Integer>();
			    list = hasShangXia2SameDAYU0_Fxie(arr,arrZ, selectQishu,i , textView);
			if (list.size()>0) {
		        
		    	textView.append("\n"+"========��Ф����2���·�б\\��ͬ�����ɣ�========"+"\n"+"��"+(selectQishu-1)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-2]){     		 
		    		textView.append(j+",");
		    	}
	    		textView.append("|");
		    	for(String j: arr[selectQishu-2]){     		 
		    		textView.append(j+",");
		    	}
		    	textView.append("\n"+"��"+(selectQishu)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-1]){     		 
		    		textView.append(j+",");
		    	}
	    		textView.append("|");
		    	for(String j: arr[selectQishu-1]){     		 
		    		textView.append(j+",");
		    	}
		    	
			}
				    
		    	hasShangXia2Same_Fxie (arr,arrZ, selectQishu,i , textView);
		    }
		}
	
		/*
		 * ����3����б��ͬ/
		 */
		public LinkedList hasShangXia3SameDAYU0_Fxie (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			for (int i = 2; i<selectQishu-2; i++) {
				for (int l = 0; l<4; l++) {
					if (arrZ[i][l+2]==arrZ[selectQishu-1][k+2] &&arrZ[i-1][l+1]==arrZ[selectQishu-2][k+1] &&arrZ[i-2][l]==arrZ[selectQishu-3][k])
						
					{	
						list.add(Integer.valueOf(i));
					}
				}			
			}
			return list;
		}
		
		public void hasShangXia3Same_Fxie (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
			
			
			
			for (int i = 2; i<selectQishu-2; i++) {
				for (int l = 0; l<4; l++) {
					if (arrZ[i][l+2]==arrZ[selectQishu-1][k+2] &&arrZ[i-1][l+1]==arrZ[selectQishu-2][k+1] &&arrZ[i-2][l]==arrZ[selectQishu-3][k]) {
						textView.append("\n"+"2015_00"+(i-1)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i-2][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i-2][j]+",");
	    	        		}
	    	        	
						textView.append("\n"+"2015_00"+(i)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i-1][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i-1][j]+",");
	    	        		}
	    	        	
						textView.append("\n"+"2015_00"+(i+1)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i][j]+",");
	    	        		}
	    	        	
	    	    	textView.append("\n"+"\t"+"��"+(selectQishu)+"����ͬ�ĺ����ǣ�");
	    		            textView.append((CharSequence)arrZ[selectQishu-3][k] +","+arrZ[selectQishu-2][k+1]+","+arrZ[selectQishu-1][k+2]);

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
		}		


		public void ResultHasShangXia3Same_Fxie (String arr[][],String arrZ[][],int selectQishu, TextView textView) {

		    for (int i = 0; i<4; i++) {
			    LinkedList<Integer> list = new LinkedList<Integer>();
			    list = hasShangXia3SameDAYU0_Fxie(arr,arrZ, selectQishu,i , textView);
			if (list.size()>0) {
		    	textView.append("\n"+"========��Ф����3����б\\��ͬ�����ɣ�========"+"\n"+"��"+(selectQishu-2)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-3]){     		 
		    		textView.append(j+",");
		    	}	
	    		textView.append("|");
		    	for(String j: arr[selectQishu-3]){     		 
		    		textView.append(j+",");
		    	}
		    	textView.append("\n"+"��"+(selectQishu-1)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-2]){     		 
		    		textView.append(j+",");
		    	}
	    		textView.append("|");
		    	for(String j: arr[selectQishu-2]){     		 
		    		textView.append(j+",");
		    	}
		    	textView.append("\n"+"��"+(selectQishu)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-1]){     		 
		    		textView.append(j+",");
		    	}
	    		textView.append("|");
		    	for(String j: arr[selectQishu-1]){     		 
		    		textView.append(j+",");
		    	}
		    	
			}
				    
		    	hasShangXia3Same_Fxie (arr,arrZ, selectQishu,i , textView);
		    }

	        
	}       	        	

		
		/*
		 * ����2����б��ͬ/
		 */
		public LinkedList hasShangXia2SameDAYU0_Zxie (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			for (int i = 1; i<selectQishu-1; i++) {
				for (int l = 0; l<5; l++) {
					if (arrZ[i][l]==arrZ[selectQishu-1][k] &&arrZ[i-1][l+1]==arrZ[selectQishu-2][k+1]) {	
						list.add(Integer.valueOf(i));
					}
				}			
			}
			return list;
		}
		
		public void hasShangXia2Same_Zxie (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
			
			
			
			for (int i = 1; i<selectQishu-1; i++) {
				for (int l = 0; l<5; l++) {
					if (arrZ[i][l]==arrZ[selectQishu-1][k] &&arrZ[i-1][l+1]==arrZ[selectQishu-2][k+1] ) {
						textView.append("\n"+"2015_00"+(i)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i-1][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i-1][j]+",");
	    	        		}
	    	        	
						textView.append("\n"+"2015_00"+(i+1)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i][j]+",");
	    	        		}
	    	        	
	    	    	textView.append("\n"+"\t"+"��"+(selectQishu)+"����ͬ�ĺ����ǣ�");
	    		            textView.append((CharSequence) arrZ[selectQishu-2][k+1]+","+arrZ[selectQishu-1][k]);

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
		}	


		public void ResultHasShangXia2Same_Zxie (String arr[][],String arrZ[][],int selectQishu, TextView textView) {

		    for (int i = 0; i<5; i++) {
			    LinkedList<Integer> list = new LinkedList<Integer>();
			    list = hasShangXia2SameDAYU0_Zxie(arr,arrZ, selectQishu,i , textView);
			if (list.size()>0) {
		        
		    	textView.append("\n"+"========��Ф����2����б/��ͬ�����ɣ�========"+"\n"+"��"+(selectQishu-1)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-2]){     		 
		    		textView.append(j+",");
		    	}
	    		textView.append("|");
		    	for(String j: arr[selectQishu-2]){     		 
		    		textView.append(j+",");
		    	}
		    	textView.append("\n"+"��"+(selectQishu)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-1]){     		 
		    		textView.append(j+",");
		    	}
	    		textView.append("|");
		    	for(String j: arr[selectQishu-1]){     		 
		    		textView.append(j+",");
		    	}
		    	
			}
				    
		    	hasShangXia2Same_Zxie (arr,arrZ, selectQishu,i , textView);
		    }
		}
		/*
		 * ����3����б��ͬ/
		 */
		public LinkedList hasShangXia3SameDAYU0_Zxie (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			for (int i = 2; i<selectQishu-2; i++) {
				for (int l = 0; l<4; l++) {
					if (arrZ[i][l]==arrZ[selectQishu-1][k] &&arrZ[i-1][l+1]==arrZ[selectQishu-2][k+1] &&arrZ[i-2][l+2]==arrZ[selectQishu-3][k+2]) {	
						list.add(Integer.valueOf(i));
					}
				}			
			}
			return list;
		}
		
		public void hasShangXia3Same_Zxie (String arr[][],String arrZ[][],int selectQishu,int k , TextView textView) {
			
			
			
			for (int i = 2; i<selectQishu-2; i++) {
				for (int l = 0; l<4; l++) {
					if (arrZ[i][l]==arrZ[selectQishu-1][k] &&arrZ[i-1][l+1]==arrZ[selectQishu-2][k+1] &&arrZ[i-2][l+2]==arrZ[selectQishu-3][k+2]) {
						textView.append("\n"+"2015_00"+(i-1)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i-2][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i-2][j]+",");
	    	        		}
	    	        	
						textView.append("\n"+"2015_00"+(i)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i-1][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i-1][j]+",");
	    	        		}
	    	        	
						textView.append("\n"+"2015_00"+(i+1)+"��:");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arrZ[i][j]+",");
	    	        		}
		        		textView.append("|");
	    	        	for (int j=0; j<arrZ[i].length; j++) {
	    	        		textView.append(arr[i][j]+",");
	    	        		}
	    	        	
	    	    	textView.append("\n"+"\t"+"��"+(selectQishu)+"����ͬ�ĺ����ǣ�");
	    		            textView.append((CharSequence) arrZ[selectQishu-3][k+2]+","+arrZ[selectQishu-2][k+1]+","+arrZ[selectQishu-1][k]);

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
		}		


		public void ResultHasShangXia3Same_Zxie (String arr[][],String arrZ[][],int selectQishu, TextView textView) {

		    for (int i = 0; i<4; i++) {
			    LinkedList<Integer> list = new LinkedList<Integer>();
			    list = hasShangXia3SameDAYU0_Zxie(arr,arrZ, selectQishu,i , textView);
			if (list.size()>0) {
		    	textView.append("\n"+"========��Ф����3����б/��ͬ�����ɣ�========"+"\n"+"��"+(selectQishu-2)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-3]){     		 
		    		textView.append(j+",");
		    	}	
	    		textView.append("|");
		    	for(String j: arr[selectQishu-3]){     		 
		    		textView.append(j+",");
		    	}
		    	textView.append("\n"+"��"+(selectQishu-1)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-2]){     		 
		    		textView.append(j+",");
		    	}
	    		textView.append("|");
		    	for(String j: arr[selectQishu-2]){     		 
		    		textView.append(j+",");
		    	}
		    	textView.append("\n"+"��"+(selectQishu)+"�ڿ��������");
		    	for(String j: arrZ[selectQishu-1]){     		 
		    		textView.append(j+",");
		    	}
	    		textView.append("|");
		    	for(String j: arr[selectQishu-1]){     		 
		    		textView.append(j+",");
		    	}
		    	
			}
				    
		    	hasShangXia3Same_Zxie (arr,arrZ, selectQishu,i , textView);
		    }

	        
	}  
}
