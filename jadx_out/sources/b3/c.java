package b3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* loaded from: classes3.dex */
public class c implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f678a;

    public c(int i5) {
        this.f678a = i5;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z4, Layout layout) {
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z4) {
        if (z4) {
            return this.f678a;
        }
        return 0;
    }
}
