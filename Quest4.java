package com.example.quiz;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;

public class Quest4 extends Activity implements OnClickListener {

	Button b1,b2;
	RadioGroup rg1 ;
	Bundle b;
	int c;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.q4);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b2.setOnClickListener(this);
		b1.setOnClickListener(this);
		rg1= (RadioGroup)findViewById(R.id.radioGroup1);
		b= getIntent().getExtras();
	  c=b.getInt("key");
	  
	}
	@Override
	public void onClick(View arg0) {
		if(rg1.getCheckedRadioButtonId()==R.id.radio0)
		{c++;
		}
		switch(arg0.getId())
		{
		case R.id.button1:
			Bundle b1=new Bundle();
			b1.putInt("key",c);
			Intent a=new Intent(Quest4.this,Quest5.class);
			a.putExtras(b1);
			startActivity(a);
			break;
		case R.id.button2:
			Bundle b2=new Bundle();
			b2.putInt("key", c);
			Intent b=new Intent(Quest4.this,Quest3.class);
			b.putExtras(b2);
			startActivity(b);
			break;
		}
		// TODO Auto-generated method stub
		
	}

}
