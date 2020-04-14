package com.lwq.custom_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * Created by： liwq.
 * Created Time: 2020/4/13
 * Description：
 */
public class CustomView extends View {


    private Paint mPaint;
    private Path path;


    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        path = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //画一个圆形
        mPaint.setColor(Color.RED);
        //mPaint.setStyle(Paint.Style.STROKE); // Style 修改为画线模式 空心圆
        mPaint.setAntiAlias(true);
        canvas.drawCircle(300, 300, 200, mPaint);

        //画一个矩形
        mPaint.setColor(Color.parseColor("#009688"));
        canvas.drawRect(30, 30, 230, 180, mPaint);

        ////画一条直线
        mPaint.setColor(Color.parseColor("#FF9800"));
        mPaint.setStrokeWidth(3);
        canvas.drawLine(300, 30, 600, 300, mPaint);

        //再添加一天直线
        canvas.drawLine(320, 600, 750, 50, mPaint);

        mPaint.setColor(Color.parseColor("#E91E63"));
        //设置绘制文字大小
        mPaint.setTextSize(30f);
        //设置绘制样式
        mPaint.setStyle(Paint.Style.FILL);
        //设置绘制线条宽度
        mPaint.setStrokeWidth(2);
        //设置抗锯齿开关 等价 new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setAntiAlias(true);

        //绘制文字
        canvas.drawText("Created by： 李维强", 500, 130, mPaint);

    }
}
