package com.example.orderedbroadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ABroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		//接收广播后执行的方法
		Toast.makeText(context, "A is Invoked!", Toast.LENGTH_SHORT).show();
		
		Bundle buddle=new Bundle();
		buddle.putString("A", "the message of A");
		setResultExtras(buddle);

	}

}
