package com.github.dobby233liu.android.wlygtfp;

import android.app.*;
import android.os.*;
import android.content.pm.*;
import android.*;
import android.content.*;
import android.net.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
	// Ask for permission: READ_EXTERNAL_STORAGE
	if (Integer.valueOf(android.os.Build.VERSION.SDK) >= 23 && checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
	!= PackageManager.PERMISSION_GRANTED) {
	/*if (shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE)) {

	 }*/

	requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 0);
	} else{


	Intent intent = getIntent();
	if (intent == null){
	return;
	}
	String action = intent.getAction();
	if (Intent.ACTION_VIEW.equals(action)) {
	Uri uri = intent.getData();
	if (null != uri) {
	String path=uri.getPath();
	ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
	cm.setText(path);
	Toast.makeText(this,"已复制位置",Toast.LENGTH_LONG).show();
	finish();
	}else{
	Toast.makeText(this,"不要直接打开我的软件！！！用法：点开一个文件，然后选择用这个程序打开",Toast.LENGTH_LONG).show();
finish();
	}
	/**else if(Intent.ACTION_SEND==action){
	Bundle bundle = intent.getExtras();
	Uri extraStream=(Uri)bundle.get(Intent.EXTRA_STREAM);
	String extraText;
	if(extraStream==null){
	extraText=(String) bundle.get(Intent.EXTRA_TEXT);
	ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
	cm.setText(extraText);
	Toast.makeText(this,"已复制位置",Toast.LENGTH_LONG).show();
	finish();
	}else{
	String path2=extraStream.getPath();
	ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
	cm.setText(path2);
	Toast.makeText(this,"已复制位置",Toast.LENGTH_LONG).show();
	finish();
	}
	}
	}
    }**/}}}
	@Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
	super.onRequestPermissionsResult(requestCode, permissions, grantResults);

	
	Intent intent = getIntent();
	if (intent == null){
	return;
	}
	String action = intent.getAction();
	if (Intent.ACTION_VIEW.equals(action)) {
	Uri uri = intent.getData();
	if (null != uri) {
	String path=uri.getPath();
	ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
	cm.setText(path);
	Toast.makeText(this,"已复制位置",Toast.LENGTH_LONG).show();
	finish();
	}else{
	Toast.makeText(this,"不要直接打开我的软件！！！用法：点开一个文件，然后选择用这个程序打开",Toast.LENGTH_LONG).show();
finish();
	}
/**	else if(Intent.ACTION_SEND==action){
	Bundle bundle = intent.getExtras();
	Uri extraStream=(Uri)bundle.get(Intent.EXTRA_STREAM);
	String extraText;
	if(extraStream==null){
	extraText=(String) bundle.get(Intent.EXTRA_TEXT);
	ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
	cm.setText(extraText);
	Toast.makeText(this,"已复制位置",Toast.LENGTH_LONG).show();
	finish();
	}else{
		String path2=extraStream.getPath();
	ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
	cm.setText(path2);
	Toast.makeText(this,"已复制位置",Toast.LENGTH_LONG).show();
	finish();
	}}**/
	}
	
	
    }

    
	
    
	

    
}
