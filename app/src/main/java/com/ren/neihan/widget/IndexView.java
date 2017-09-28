package com.ren.neihan.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Ren on 2017/09/28 0028.
 * TODO
 */

public class IndexView extends View {
    private Paint paint;
    private int width, height;

    public IndexView(Context context) {
        super(context);
    }

    public IndexView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    public IndexView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        width = getMeasuredWidth();
        height = getMeasuredHeight();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLACK);
        RectF rectF = new RectF(0, 0, width, height);
        //实例化路径
        Path path = new Path();
        path.moveTo(width / 2, 0);// 此点为多边形的起点
        path.lineTo(0, height / 2);
        path.lineTo(width, height / 2);
        path.close(); // 使这些点构成封闭的多边形
        canvas.drawRoundRect(rectF,20,20,paint);
    }
}
