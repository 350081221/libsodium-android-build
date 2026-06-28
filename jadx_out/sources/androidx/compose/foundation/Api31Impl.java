package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.i0;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J \u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/Api31Impl;", "", "()V", "create", "Landroid/widget/EdgeEffect;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "getDistance", "", "edgeEffect", "onPullDistance", "deltaDistance", "displacement", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(31)
/* loaded from: classes.dex */
final class Api31Impl {

    @p4.l
    public static final Api31Impl INSTANCE = new Api31Impl();

    private Api31Impl() {
    }

    @p4.l
    @DoNotInline
    public final EdgeEffect create(@p4.l Context context, @p4.m AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    @DoNotInline
    public final float getDistance(@p4.l EdgeEffect edgeEffect) {
        float distance;
        try {
            distance = edgeEffect.getDistance();
            return distance;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @DoNotInline
    public final float onPullDistance(@p4.l EdgeEffect edgeEffect, float f5, float f6) {
        float onPullDistance;
        try {
            onPullDistance = edgeEffect.onPullDistance(f5, f6);
            return onPullDistance;
        } catch (Throwable unused) {
            edgeEffect.onPull(f5, f6);
            return 0.0f;
        }
    }
}
