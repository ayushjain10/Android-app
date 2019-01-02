package com.example.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
//import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Quest1 extends Activity implements OnClickListener{

	Button b1;
	RadioGroup rg1 ;
	int c=0;
	 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.q1);
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		rg1=(RadioGroup)findViewById(R.id.radioGroup1);
		//b= getIntent().getExtras();
		//c=b.getInt("key");
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(rg1.getCheckedRadioButtonId()==R.id.radio2)
		{c++;
		}
		Bundle b1= new Bundle();
		b1.putInt("key", c);
		Intent a=new Intent(Quest1.this,Quest2.class);
		a.putExtras(b1);
		startActivity(a);
	}
	
}
