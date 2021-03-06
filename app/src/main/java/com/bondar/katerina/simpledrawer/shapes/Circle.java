package com.bondar.katerina.simpledrawer.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Circle extends Shape {

    private float centerX;
    private float centerY;
    private float radius;

    public Circle(int x, int y, Paint paint) {
        super(x, y, paint);
    }

    @Override
    public void draw(Canvas canvas) {
        preparation();
        canvas.drawCircle(centerX, centerY, radius, shapePaint);
    }

    private void preparation() {
        centerX = (startPoint.x + endPoint.x) / 2;
        radius = (startPoint.x - endPoint.x) / 2;
        if (radius < 0)
            radius = -radius;
        if (startPoint.y < endPoint.y) {
            centerY = startPoint.y + radius;
        } else {
            centerY = startPoint.y - radius;
        }
    }
}
