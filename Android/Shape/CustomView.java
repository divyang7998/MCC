package com.example.shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;


import static android.graphics.Color.parseColor;

public class CustomView extends View {

	private Rect rectangle;
	private Paint paint;

	public CustomView(Context context) {
    	super(context);
    	int x = 50;
    	int y = 50;
    	int sideLength = 200;

    	// create a rectangle that we'll draw later
    	rectangle = new Rect(x, y, sideLength, sideLength);
    	// create the Paint and set its color
    	paint = new Paint();
    	paint.setColor(Color.YELLOW);


	}
	public void drawTriangle(Canvas canvas, Paint paint, int x, int y, int width) {
    	int halfWidth = width / 2;

    	Path path = new Path();
    	path.moveTo(x, y - halfWidth); // Top
    	path.lineTo(x - halfWidth, y + halfWidth); // Bottom left
    	path.lineTo(x + halfWidth, y + halfWidth); // Bottom right
    	path.lineTo(x, y - halfWidth); // Back to Top
    	path.close();

    	canvas.drawPath(path, paint);
	}

	@Override
	protected void onDraw(Canvas canvas) {
    	canvas.drawColor(Color.parseColor("#dcdcdc"));
    	canvas.drawRect(rectangle, paint);
    	canvas.drawRect(250,400,500,200,paint);

    	canvas.drawCircle(300,1100,100,paint);


    	drawTriangle(canvas, paint, 600, 600, 500);

	}

}
