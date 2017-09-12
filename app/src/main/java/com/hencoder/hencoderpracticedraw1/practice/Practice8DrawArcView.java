package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        RectF rectF = new RectF();
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        //扇形
        rectF.top = 100;
        rectF.left = 200;
        rectF.right = 500;
        rectF.bottom = 300;
        canvas.drawArc(rectF, -110, 100, true, paint);

        //弧形
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(rectF, 110, 100, false, paint);
    }
}
