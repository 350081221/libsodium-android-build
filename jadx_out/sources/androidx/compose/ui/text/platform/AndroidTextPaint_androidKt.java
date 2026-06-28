package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import kotlin.i0;
import kotlin.math.d;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"Landroid/text/TextPaint;", "", "alpha", "Lkotlin/r2;", "setAlpha", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidTextPaint_androidKt {
    public static final void setAlpha(@l TextPaint textPaint, float f5) {
        float H;
        int L0;
        if (!Float.isNaN(f5)) {
            H = u.H(f5, 0.0f, 1.0f);
            L0 = d.L0(H * 255);
            textPaint.setAlpha(L0);
        }
    }
}
