package com.example.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Finish extends Activity implements OnClickListener {

	Button b1,b2;
	Bundle b;
	TextView tv1;
	int c;
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.finish);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		tv1=(TextView)findViewById(R.id.textView2);
		b= getIntent().getExtras();
		 c=b.getInt("key");
		 tv1.setText(Integer.toString(c));
		 
		 
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
		case R.id.button1 : 
			Intent a=new Intent(Finish.this,Answer.class);
			startActivity(a);
		break;
		case R.id.button2 :
			Intent a1= new Intent(Finish.this,ins.class);
			startActivity(a1);
			break;
		}
	}

}
