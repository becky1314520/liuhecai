package com.example.liuhecai;

import android.app.Application;  
import android.content.Context;  
  
public class MainApplication extends Application{  
    /** 
     * ȫ�ֵ������� 
     */  
    private static Context mContext;  
      
    @Override  
    public void onCreate() {  
        super.onCreate();  
        mContext = getApplicationContext();    
    }  
      
    /** 
     * ��ȡcontext 
     * @return 
     */  
    public static Context getContext(){  
        return mContext;  
    }  
      
    @Override  
    public void onLowMemory() {  
        super.onLowMemory();  
    }  
  
}  
