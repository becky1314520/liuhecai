package com.example.liuhecai.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.liuhecai.R;
import com.example.liuhecai.util.HttpGetListGifNo;
import com.example.liuhecai.util.NoinfoToXml;

public class ChooseQishuActivity extends Activity {

	private TextView titleText;
	private ListView listView;
	private ArrayAdapter<String> adapter;
	private List<String> dataList = new ArrayList<String>();
	private int selectQishu;
    HttpGetListGifNo httpGetListGifNo = new HttpGetListGifNo();
    String[][] arrHttp = httpGetListGifNo.listGifNo();
    NoinfoToXml noinfoToXml = new NoinfoToXml();
    int n = noinfoToXml.SaveNoinfoToXml(arrHttp);
    String[][] arr = noinfoToXml.LoadParaFromXml();    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.choose_qishu);
		listView = (ListView)findViewById(R.id.list_view);
		titleText = (TextView)findViewById(R.id.title_text);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataList);
		listView.setAdapter(adapter);

	    
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View view, int index, long arg3) {
				itemToQishu(index);
				Intent intent = new Intent(ChooseQishuActivity.this, MainActivity.class);
				intent.putExtra("select_qishu", selectQishu);
				startActivity(intent);
			}
		});
		queryQishu(arr);

	}
	
	/**
	 * 显示各期列表
	 */
	private void queryQishu(String[][] arr) {
		dataList.clear();
		for (int i = arr.length-1; i>13; i--) {
			dataList.add("2015_"+(i+1)+"期:"+arr[i][0]+","+arr[i][1]+","+arr[i][2]+","+arr[i][3]+","+arr[i][4]+","+arr[i][5]);
		}
		adapter.notifyDataSetChanged();
		listView.setSelection(0);
		titleText.setText("请选择您想计算的六合彩期数");	

	}
	
	/**
	 * 返回点击的条目的期数
	 */
	private void itemToQishu(int index) {
		selectQishu = arr.length-index;
	}

}
