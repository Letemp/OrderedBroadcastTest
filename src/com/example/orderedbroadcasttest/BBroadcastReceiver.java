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
		//���չ㲥��ִ�еķ���
		Bundle buddle=getResultExtras(true);
		Toast.makeText(context, "B is Invoked!"+"�õ�����Ϣ"+buddle.getString("A"),Toast.LENGTH_SHORT).show();
		

	}

}
