package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\u000f\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014J0\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016JN\u0010#\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001fø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0006\u0010$\u001a\u00020\u0004J0\u0010'\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0006\u0010(\u001a\u00020\u0004R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "", "bounded", "Lkotlin/r2;", "createRipple", "pressed", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", bi.aL, "r", "b", "onLayout", "refreshDrawableState", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Landroidx/compose/ui/geometry/Size;", "size", "radius", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "addRipple-KOepWvA", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;ZJIJFLv3/a;)V", "addRipple", "removeRipple", "updateRippleProperties-biQXAtU", "(JIJF)V", "updateRippleProperties", "disposeRipple", "Landroidx/compose/material/ripple/UnprojectedRipple;", "ripple", "Landroidx/compose/material/ripple/UnprojectedRipple;", "Ljava/lang/Boolean;", "", "lastRippleStateChangeTimeMillis", "Ljava/lang/Long;", "Ljava/lang/Runnable;", "resetRippleRunnable", "Ljava/lang/Runnable;", "Lv3/a;", "Landroid/content/Context;", d.X, "<init>", "(Landroid/content/Context;)V", "Companion", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RippleHostView extends View {
    private static final long MinimumRippleStateChangeTime = 5;
    private static final long ResetRippleDelayDuration = 50;

    @m
    private Boolean bounded;

    @m
    private Long lastRippleStateChangeTimeMillis;

    @m
    private v3.a<r2> onInvalidateRipple;

    @m
    private Runnable resetRippleRunnable;

    @m
    private UnprojectedRipple ripple;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final int[] PressedState = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    @l
    private static final int[] RestingState = new int[0];

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView$Companion;", "", "()V", "MinimumRippleStateChangeTime", "", "PressedState", "", "ResetRippleDelayDuration", "RestingState", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public RippleHostView(@l Context context) {
        super(context);
    }

    private final void createRipple(boolean z4) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z4);
        setBackground(unprojectedRipple);
        this.ripple = unprojectedRipple;
    }

    private final void setRippleState(boolean z4) {
        long j5;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l5 = this.lastRippleStateChangeTimeMillis;
        if (l5 != null) {
            j5 = l5.longValue();
        } else {
            j5 = 0;
        }
        long j6 = currentAnimationTimeMillis - j5;
        if (!z4 && j6 < 5) {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.a
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.setRippleState$lambda$2(RippleHostView.this);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, ResetRippleDelayDuration);
        } else {
            if (z4) {
                iArr = PressedState;
            } else {
                iArr = RestingState;
            }
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        UnprojectedRipple unprojectedRipple = rippleHostView.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(RestingState);
        }
        rippleHostView.resetRippleRunnable = null;
    }

    /* renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m1538addRippleKOepWvA(@l PressInteraction.Press press, boolean z4, long j5, int i5, long j6, float f5, @l v3.a<r2> aVar) {
        if (this.ripple == null || !l0.g(Boolean.valueOf(z4), this.bounded)) {
            createRipple(z4);
            this.bounded = Boolean.valueOf(z4);
        }
        UnprojectedRipple unprojectedRipple = this.ripple;
        l0.m(unprojectedRipple);
        this.onInvalidateRipple = aVar;
        m1539updateRipplePropertiesbiQXAtU(j5, i5, j6, f5);
        if (z4) {
            unprojectedRipple.setHotspot(Offset.m3493getXimpl(press.m429getPressPositionF1C5BW0()), Offset.m3494getYimpl(press.m429getPressPositionF1C5BW0()));
        } else {
            unprojectedRipple.setHotspot(unprojectedRipple.getBounds().centerX(), unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            l0.m(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(RestingState);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@l Drawable drawable) {
        v3.a<r2> aVar = this.onInvalidateRipple;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* renamed from: updateRippleProperties-biQXAtU, reason: not valid java name */
    public final void m1539updateRipplePropertiesbiQXAtU(long j5, int i5, long j6, float f5) {
        int L0;
        int L02;
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple == null) {
            return;
        }
        unprojectedRipple.trySetRadius(i5);
        unprojectedRipple.m1546setColorDxMtmZc(j6, f5);
        L0 = kotlin.math.d.L0(Size.m3562getWidthimpl(j5));
        L02 = kotlin.math.d.L0(Size.m3559getHeightimpl(j5));
        Rect rect = new Rect(0, 0, L0, L02);
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }
}
