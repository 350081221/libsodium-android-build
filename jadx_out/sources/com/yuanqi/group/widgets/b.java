package com.yuanqi.group.widgets;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class b extends i {

    /* renamed from: h, reason: collision with root package name */
    private static final int f14284h = 255;

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f14285i = {255, 255, 255, 255, 255, 255, 255, 255, 255};

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(int i5, ValueAnimator valueAnimator) {
        f14285i[i5] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        n();
    }

    @Override // com.yuanqi.group.widgets.i
    public void d(Canvas canvas, Paint paint) {
        float k5 = (k() - 16.0f) / 6.0f;
        float f5 = 2.0f * k5;
        float f6 = f5 + 4.0f;
        float k6 = (k() / 2) - f6;
        float k7 = (k() / 2) - f6;
        for (int i5 = 0; i5 < 3; i5++) {
            for (int i6 = 0; i6 < 3; i6++) {
                canvas.save();
                float f7 = i6;
                float f8 = (f5 * f7) + k6 + (f7 * 4.0f);
                float f9 = i5;
                canvas.translate(f8, (f5 * f9) + k7 + (f9 * 4.0f));
                paint.setAlpha(f14285i[(i5 * 3) + i6]);
                canvas.drawCircle(0.0f, 0.0f, k5, paint);
                canvas.restore();
            }
        }
    }

    @Override // com.yuanqi.group.widgets.i
    public ArrayList<ValueAnimator> m() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {960, 930, 1190, 1130, 1340, 940, 1200, 820, 1190};
        int[] iArr2 = {360, 400, 680, 410, 710, -150, -120, 10, 320};
        for (final int i5 = 0; i5 < 9; i5++) {
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 168, 255);
            ofInt.setDuration(iArr[i5]);
            ofInt.setRepeatCount(-1);
            ofInt.setStartDelay(iArr2[i5]);
            a(ofInt, new ValueAnimator.AnimatorUpdateListener() { // from class: com.yuanqi.group.widgets.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    b.this.u(i5, valueAnimator);
                }
            });
            arrayList.add(ofInt);
        }
        return arrayList;
    }
}
