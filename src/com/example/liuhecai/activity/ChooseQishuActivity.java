package com.example.liuhecai.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
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

public class ChooseQishuActivity extends Activity {

	private TextView titleText;
	private ListView listView;
	private ArrayAdapter<String> adapter;
	private List<String> dataList = new ArrayList<String>();
    HttpGetListGifNo httpGetListGifNo = new HttpGetListGifNo();
    String[][] arr = httpGetListGifNo.listGifNo();
    
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
				queryCompare();
			}
		});
		queryQishu();
	}
	
	/**
	 * ��ʾ�����б�
	 */
	private void queryQishu() {
		dataList.clear();
		for (int i = arr.length-1; i>13; i--) {
			dataList.add("2015_"+(i+1)+"��:"+arr[i][0]+","+arr[i][1]+","+arr[i][2]+","+arr[i][3]+","+arr[i][4]+","+arr[i][5]);
		}
		for (int i = 0; i<dataList.size(); i++) {
		System.out.println("\n");
		System.out.println(dataList.get(i));
		}
		adapter.notifyDataSetChanged();
		listView.setSelection(0);
		titleText.setText("��ѡ�������������ϲ�����");		
	}
	
	/**
	 * ��ʾ��ѡ�е����ϲ������ĶԱȽ��
	 */
	
	private void queryCompare() {
		
	}
}
