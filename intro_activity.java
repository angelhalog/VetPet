
	 
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
import android.content.Intent;
import android.widget.TextView;
import android.widget.ImageView;

public class intro_activity extends Activity {

	
	private View _bg__intro_ek2;
	private View ellipse_2;
	private View ellipse_1;
	private View _button;
	private TextView codecademy;
	private TextView sign_up;
	private View line_1;
	private ImageView arrow_2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);

		
		_bg__intro_ek2 = (View) findViewById(R.id._bg__intro_ek2);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		_button = (View) findViewById(R.id._button);
		codecademy = (TextView) findViewById(R.id.codecademy);
		sign_up = (TextView) findViewById(R.id.sign_up);
		line_1 = (View) findViewById(R.id.line_1);
		arrow_2 = (ImageView) findViewById(R.id.arrow_2);
	
		
		_button.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), sign_up_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	