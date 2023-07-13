
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		intro
	 *	@date 		Wednesday 28th of September 2022 03:35:15 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class sign_up_activity extends Activity {

	
	private View _bg__sign_up_ek3;
	private ImageView arrow_1;
	private View rectangle_2;
	private TextView what_is_your_name_;
	private View _rectangle_4;
	private TextView sign_up_ek4;
	private TextView continue;
	private View line_3;
	private TextView _back;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up);

		
		_bg__sign_up_ek3 = (View) findViewById(R.id._bg__sign_up_ek3);
		arrow_1 = (ImageView) findViewById(R.id.arrow_1);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		what_is_your_name_ = (TextView) findViewById(R.id.what_is_your_name_);
		_rectangle_4 = (View) findViewById(R.id._rectangle_4);
		sign_up_ek4 = (TextView) findViewById(R.id.sign_up_ek4);
		continue = (TextView) findViewById(R.id.continue);
		line_3 = (View) findViewById(R.id.line_3);
		_back = (TextView) findViewById(R.id._back);
	
		
		_rectangle_4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), welcome_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_back.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), intro_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	