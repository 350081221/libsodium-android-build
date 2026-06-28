package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/ripple/RippleHostMap;", "", "Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "indicationInstance", "Landroidx/compose/material/ripple/RippleHostView;", "rippleHostView", "Lkotlin/r2;", "set", "get", "remove", "", "indicationToHostMap", "Ljava/util/Map;", "hostToIndicationMap", "<init>", "()V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleHostMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* loaded from: classes.dex */
public final class RippleHostMap {

    @l
    private final Map<AndroidRippleIndicationInstance, RippleHostView> indicationToHostMap = new LinkedHashMap();

    @l
    private final Map<RippleHostView, AndroidRippleIndicationInstance> hostToIndicationMap = new LinkedHashMap();

    @m
    public final RippleHostView get(@l AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        return this.indicationToHostMap.get(androidRippleIndicationInstance);
    }

    public final void remove(@l AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        RippleHostView rippleHostView = this.indicationToHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(androidRippleIndicationInstance);
    }

    public final void set(@l AndroidRippleIndicationInstance androidRippleIndicationInstance, @l RippleHostView rippleHostView) {
        this.indicationToHostMap.put(androidRippleIndicationInstance, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, androidRippleIndicationInstance);
    }

    @m
    public final AndroidRippleIndicationInstance get(@l RippleHostView rippleHostView) {
        return this.hostToIndicationMap.get(rippleHostView);
    }
}
