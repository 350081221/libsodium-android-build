package com.zzhoujay.richtext.ext;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class f extends LinkMovementMethod {

    /* renamed from: b, reason: collision with root package name */
    private static final int f15723b = 500;

    /* renamed from: a, reason: collision with root package name */
    private long f15724a;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1 && action != 0) {
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int totalPaddingLeft = x4 - textView.getTotalPaddingLeft();
        int totalPaddingTop = y4 - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        h3.d[] dVarArr = (h3.d[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, h3.d.class);
        if (dVarArr.length != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            h3.d dVar = dVarArr[0];
            int spanStart = spannable.getSpanStart(dVar);
            int spanEnd = spannable.getSpanEnd(dVar);
            h3.b[] bVarArr = (h3.b[]) spannable.getSpans(spanStart, spanEnd, h3.b.class);
            if (bVarArr.length > 0) {
                if (!bVarArr[0].a(scrollX)) {
                    Selection.removeSelection(spannable);
                    return false;
                }
            } else if (offsetForHorizontal < layout.getOffsetToLeftOf(spanStart) || offsetForHorizontal > layout.getOffsetToLeftOf(spanEnd + 1)) {
                Selection.removeSelection(spannable);
                return false;
            }
            if (action == 1) {
                if (currentTimeMillis - this.f15724a > 500) {
                    if (!dVar.onLongClick(textView)) {
                        dVar.onClick(textView);
                    }
                } else {
                    dVar.onClick(textView);
                }
            } else {
                Selection.setSelection(spannable, spanStart, spanEnd);
            }
            this.f15724a = currentTimeMillis;
            return true;
        }
        Selection.removeSelection(spannable);
        return false;
    }
}
