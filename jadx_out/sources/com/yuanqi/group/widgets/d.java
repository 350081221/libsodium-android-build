package com.yuanqi.group.widgets;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class d extends i {

    /* renamed from: i, reason: collision with root package name */
    public static final float f14288i = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float[] f14289h = {1.0f, 1.0f, 1.0f};

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(int i5, ValueAnimator valueAnimator) {
        this.f14289h[i5] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        n();
    }

    @Override // com.yuanqi.group.widgets.i
    public void d(Canvas canvas, Paint paint) {
        float min = (Math.min(k(), j()) - 8.0f) / 6.0f;
        float f5 = 2.0f * min;
        float k5 = (k() / 2) - (f5 + 4.0f);
        float j5 = j() / 2;
        for (int i5 = 0; i5 < 3; i5++) {
            canvas.save();
            float f6 = i5;
            canvas.translate((f5 * f6) + k5 + (f6 * 4.0f), j5);
            float f7 = this.f14289h[i5];
            canvas.scale(f7, f7);
            canvas.drawCircle(0.0f, 0.0f, min, paint);
            canvas.restore();
        }
    }

    @Override // com.yuanqi.group.widgets.i
    public ArrayList<ValueAnimator> m() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {120, 240, 360};
        for (final int i5 = 0; i5 < 3; i5++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            ofFloat.setDuration(750L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay(iArr[i5]);
            a(ofFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.yuanqi.group.widgets.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    d.this.u(i5, valueAnimator);
                }
            });
            arrayList.add(ofFloat);
        }
        return arrayList;
    }
}
