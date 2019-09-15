package rehat.malam.vrohh;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		TextView tv = (TextView)findViewById(R.id.example);
		tv.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// membuat aktivitas dengan meng-klik text 
					
					startActivity(new Intent(MainActivity.this,KelasKedua.class));
					
				}
				
			
		});
		
    }
}
