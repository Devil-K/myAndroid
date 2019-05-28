package com.example.lenovo.myapplication;
//向下跳的scroll view，去除ScrollView自动滑动到底部。滑动到指定位置，重写api去除api 23的限制
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ScrollView;
public class NoAutoScrollViewWithPosition extends ScrollView {

    private ScrollViewListener scrollViewListener;

    public NoAutoScrollViewWithPosition(Context context) {
        super(context);
    }

    public NoAutoScrollViewWithPosition(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoAutoScrollViewWithPosition(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        return 0;
    }

    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        this.scrollViewListener = scrollViewListener;
    }

    @Override
    protected void onScrollChanged(int x, int y, int ux, int uy) {
        super.onScrollChanged(x, y, ux, uy);
        if (scrollViewListener != null) {
            scrollViewListener.onScrollChanged(this, x, y, ux, uy);
        }
    }

    public interface ScrollViewListener {
        void onScrollChanged(NoAutoScrollViewWithPosition noAutoScrollViewWithPosition, int x, int y, int ux, int uy);
    }
}

