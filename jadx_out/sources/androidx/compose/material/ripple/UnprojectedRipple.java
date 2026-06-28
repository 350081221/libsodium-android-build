package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Method;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple;", "Landroid/graphics/drawable/RippleDrawable;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "", "alpha", "calculateRippleColor-5vOe2sY", "(JF)J", "calculateRippleColor", "Lkotlin/r2;", "setColor-DxMtmZc", "(JF)V", "setColor", "", "isProjected", "Landroid/graphics/Rect;", "getDirtyBounds", "", "radius", "trySetRadius", "bounded", "Z", "rippleColor", "Landroidx/compose/ui/graphics/Color;", "rippleRadius", "Ljava/lang/Integer;", "projected", "<init>", "(Z)V", "Companion", "MRadiusHelper", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UnprojectedRipple extends RippleDrawable {

    @l
    public static final Companion Companion = new Companion(null);
    private static boolean setMaxRadiusFetched;

    @m
    private static Method setMaxRadiusMethod;
    private final boolean bounded;
    private boolean projected;

    @m
    private Color rippleColor;

    @m
    private Integer rippleRadius;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple$Companion;", "", "()V", "setMaxRadiusFetched", "", "setMaxRadiusMethod", "Ljava/lang/reflect/Method;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple$MRadiusHelper;", "", "Landroid/graphics/drawable/RippleDrawable;", "ripple", "", "radius", "Lkotlin/r2;", "setRadius", "<init>", "()V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(23)
    /* loaded from: classes.dex */
    private static final class MRadiusHelper {

        @l
        public static final MRadiusHelper INSTANCE = new MRadiusHelper();

        private MRadiusHelper() {
        }

        @DoNotInline
        public final void setRadius(@l RippleDrawable rippleDrawable, int i5) {
            rippleDrawable.setRadius(i5);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UnprojectedRipple(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L10
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L11
        L10:
            r2 = r1
        L11:
            r4.<init>(r0, r1, r2)
            r4.bounded = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.UnprojectedRipple.<init>(boolean):void");
    }

    /* renamed from: calculateRippleColor-5vOe2sY, reason: not valid java name */
    private final long m1545calculateRippleColor5vOe2sY(long j5, float f5) {
        float A;
        if (Build.VERSION.SDK_INT < 28) {
            f5 *= 2;
        }
        A = u.A(f5, 1.0f);
        return Color.m3733copywmQWz5c$default(j5, A, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @l
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    /* renamed from: setColor-DxMtmZc, reason: not valid java name */
    public final void m1546setColorDxMtmZc(long j5, float f5) {
        boolean m3735equalsimpl0;
        long m1545calculateRippleColor5vOe2sY = m1545calculateRippleColor5vOe2sY(j5, f5);
        Color color = this.rippleColor;
        if (color == null) {
            m3735equalsimpl0 = false;
        } else {
            m3735equalsimpl0 = Color.m3735equalsimpl0(color.m3744unboximpl(), m1545calculateRippleColor5vOe2sY);
        }
        if (!m3735equalsimpl0) {
            this.rippleColor = Color.m3724boximpl(m1545calculateRippleColor5vOe2sY);
            setColor(ColorStateList.valueOf(ColorKt.m3788toArgb8_81llA(m1545calculateRippleColor5vOe2sY)));
        }
    }

    public final void trySetRadius(int i5) {
        Integer num = this.rippleRadius;
        if (num == null || num.intValue() != i5) {
            this.rippleRadius = Integer.valueOf(i5);
            MRadiusHelper.INSTANCE.setRadius(this, i5);
        }
    }
}
