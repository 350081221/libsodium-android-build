package com.yuanqi.group.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;

/* loaded from: classes3.dex */
public class SquareCardView extends CardView {
    public SquareCardView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i6) {
        setMeasuredDimension(View.getDefaultSize(0, i5), View.getDefaultSize(0, i6));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public SquareCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareCardView(Context context) {
        super(context);
    }
}
