package tutorials.crunchify.font_cr_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);

    	final float[] size = {20};

    	final TextView myText = (TextView) findViewById(R.id.textView);

    	final Button button_plus = findViewById(R.id.button_plus);
    	final Button button_minus = findViewById(R.id.button_minus);
    	final Button button_color = findViewById(R.id.button_color);
    	final Button button_font = findViewById(R.id.button_font);

    	button_plus.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
            	// Code here executes on main thread after user presses button
            	size[0] +=2;
            	myText.setTextSize(size[0] +2);
        	}
    	});

    	button_minus.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
            	// Code here executes on main thread after user presses button
            	size[0] -=2;
            	myText.setTextSize(size[0] -2);
        	}
    	});

    	button_color.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
            	// Code here executes on main thread after user presses button
            	Random rnd = new Random();

            	int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            	myText.setTextColor(color);
        	}
    	});

    	button_font.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
//             	Code here executes on main thread after user presses button
//            	Typeface type = Typeface.createFromAsset(getAssets(),"font/pac.ttf");
//            	myText.setTypeface(type);

            	Context context = getApplicationContext();
            	CharSequence text = "Sorry For Inconvenience";
            	int duration = Toast.LENGTH_SHORT;

            	Toast toast = Toast.makeText(context, text, duration);
            	toast.show();
        	}
    	});
	}
}
