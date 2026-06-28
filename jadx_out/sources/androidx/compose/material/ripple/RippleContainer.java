package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014J\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000eJ\n\u0010\u0011\u001a\u00020\t*\u00020\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013¨\u0006 "}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "", "changed", "", "l", bi.aL, "r", "b", "Lkotlin/r2;", "onLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleHostView;", "getRippleHostView", "disposeRippleIfNeeded", "MaxRippleHosts", "I", "", "rippleHosts", "Ljava/util/List;", "unusedRippleHosts", "Landroidx/compose/material/ripple/RippleHostMap;", "rippleHostMap", "Landroidx/compose/material/ripple/RippleHostMap;", "nextHostIndex", "Landroid/content/Context;", d.X, "<init>", "(Landroid/content/Context;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {
    public static final int $stable = 8;
    private final int MaxRippleHosts;
    private int nextHostIndex;

    @l
    private final RippleHostMap rippleHostMap;

    @l
    private final List<RippleHostView> rippleHosts;

    @l
    private final List<RippleHostView> unusedRippleHosts;

    public RippleContainer(@l Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new RippleHostMap();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(androidx.compose.ui.R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(@l AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        androidRippleIndicationInstance.resetHostView();
        RippleHostView rippleHostView = this.rippleHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            rippleHostView.disposeRipple();
            this.rippleHostMap.remove(androidRippleIndicationInstance);
            this.unusedRippleHosts.add(rippleHostView);
        }
    }

    @l
    public final RippleHostView getRippleHostView(@l AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        Object K0;
        int G;
        RippleHostView rippleHostView = this.rippleHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        K0 = b0.K0(this.unusedRippleHosts);
        RippleHostView rippleHostView2 = (RippleHostView) K0;
        if (rippleHostView2 == null) {
            int i5 = this.nextHostIndex;
            G = w.G(this.rippleHosts);
            if (i5 > G) {
                rippleHostView2 = new RippleHostView(getContext());
                addView(rippleHostView2);
                this.rippleHosts.add(rippleHostView2);
            } else {
                rippleHostView2 = this.rippleHosts.get(this.nextHostIndex);
                AndroidRippleIndicationInstance androidRippleIndicationInstance2 = this.rippleHostMap.get(rippleHostView2);
                if (androidRippleIndicationInstance2 != null) {
                    androidRippleIndicationInstance2.resetHostView();
                    this.rippleHostMap.remove(androidRippleIndicationInstance2);
                    rippleHostView2.disposeRipple();
                }
            }
            int i6 = this.nextHostIndex;
            if (i6 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i6 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.set(androidRippleIndicationInstance, rippleHostView2);
        return rippleHostView2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        setMeasuredDimension(0, 0);
    }
}
