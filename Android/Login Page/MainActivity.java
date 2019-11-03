package tutorials.crunchify.login_cr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);

    	final Button button_login = findViewById(R.id.button_login);
    	final EditText user_text = (EditText) findViewById(R.id.userid);
    	final EditText pass_text = (EditText) findViewById(R.id.password);

    	button_login.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
            	// Code here executes on main thread after user presses button
            	Context context = getApplicationContext();
            	int duration = Toast.LENGTH_SHORT;
            	if(user_text.getText().toString().equals("abc") && pass_text.getText().toString().equals("abc")){
                	/*CharSequence text = "Sahi Password";
                	Toast toast = Toast.makeText(context, text, duration);
                	toast.show();*/
                	Toast.makeText(context, "Correct Password", Toast.LENGTH_SHORT).show();
            	}
            	else {
                	/*CharSequence text = "Galat Password";
                	Toast toast = Toast.makeText(context, text, duration);
                	toast.show();*/
                	Toast.makeText(context, "Wrong Passowrd", Toast.LENGTH_SHORT).show();
            	}

        	}
    	});
	}
}
