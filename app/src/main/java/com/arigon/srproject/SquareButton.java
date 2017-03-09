package com.arigon.srproject;

import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Ferny on 2/22/2017.
 */

public class SquareButton extends Button {
    public SquareButton(android.content.Context context) {
        super(context);
    }

    public SquareButton(android.content.Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareButton(android.content.Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        int size = width > height ? height : width;
        setMeasuredDimension(size, size); // make it square

    }
}
