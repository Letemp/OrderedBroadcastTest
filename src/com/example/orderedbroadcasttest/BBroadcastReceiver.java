package com.example.orderedbroadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class BBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		//接收广播后执行的方法
		Bundle buddle=getResultExtras(true);
		Toast.makeText(context, "B is Invoked!"+"得到的信息"+buddle.getString("A"),Toast.LENGTH_SHORT).show();
		

	}

}
