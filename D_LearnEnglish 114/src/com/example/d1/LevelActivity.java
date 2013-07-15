package com.example.d1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;


public class LevelActivity extends Activity {
	
	public void lzero(){
		Intent intent=new Intent(this,Level01Activity.class);
		startActivity(intent);	
}
public void lone(){
	Intent intent=new Intent(this,Level11Activity.class);
	startActivity(intent);
}
public void basic(){
	Intent intent=new Intent(this,Basic1Activity.class);
	startActivity(intent);
}
public void advanced(){
	Intent intent=new Intent(this,AdvancedActivity.class);
	startActivity(intent);
}
public void help(){
	Intent intent=new Intent(this,HelpActivity.class);
	startActivity(intent);
}
	
	public void rclick(View v){
		Intent intent=new Intent(this,Level01Activity.class);
		startActivity(intent);
		boolean checked = ((RadioButton) v).isChecked();
		 switch(v.getId()) {
	        case R.id.ilevel0:
	            if (checked)
	                // Pirates are the best
	            	lzero();	            
	            break;
	        case R.id.ilevel1:
	        	if (checked)
	                // level 1
	        		lone();
	        		break;
	       case R.id.ibasic:
	        	if (checked)
	        		//basic 
	        		basic();
	        		break;
	        case R.id.iadvanced:
	       	if (checked)
	        		//advanced
	       		advanced();
	        		break;
	        case R.id.ihelp:
	        	if (checked)
	        		//help
	        		help();
	        		break;
		   		        	
	   }
	}
	
	
	
	
	
	public void btabout(View v){
		Intent intent = new Intent(this,MainActivity.class);
		startActivity(intent);
	}
	public void lexit(View v){
		Intent intent = new Intent(Intent.ACTION_MAIN);
		intent.addCategory(Intent.CATEGORY_HOME);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intent);
	}
	
	
	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.level, menu);
		return true;
	}

}
