package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/android/Paint29;", "", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Rect;", "rect", "Lkotlin/r2;", "getTextBounds", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(29)
/* loaded from: classes.dex */
final class Paint29 {

    @p4.l
    public static final Paint29 INSTANCE = new Paint29();

    private Paint29() {
    }

    @DoNotInline
    @u3.m
    public static final void getTextBounds(@p4.l Paint paint, @p4.l CharSequence charSequence, int i5, int i6, @p4.l Rect rect) {
        paint.getTextBounds(charSequence, i5, i6, rect);
    }
}
