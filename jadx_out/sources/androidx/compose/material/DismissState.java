package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/DismissState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/DismissValue;", "Landroidx/compose/material/DismissDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "", "isDismissed", "Lkotlin/r2;", "reset", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "(Landroidx/compose/material/DismissDirection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getDismissDirection", "()Landroidx/compose/material/DismissDirection;", "dismissDirection", "initialValue", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/DismissValue;Lv3/l;)V", "Companion", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class DismissState extends SwipeableState<DismissValue> {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/DismissValue;", "invoke", "(Landroidx/compose/material/DismissValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.DismissState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<DismissValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        @l
        public final Boolean invoke(@l DismissValue dismissValue) {
            return Boolean.TRUE;
        }
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Landroidx/compose/material/DismissState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DismissState;", "Landroidx/compose/material/DismissValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<DismissState, DismissValue> Saver(@l v3.l<? super DismissValue, Boolean> lVar) {
            return SaverKt.Saver(DismissState$Companion$Saver$1.INSTANCE, new DismissState$Companion$Saver$2(lVar));
        }
    }

    public /* synthetic */ DismissState(DismissValue dismissValue, v3.l lVar, int i5, w wVar) {
        this(dismissValue, (i5 & 2) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }

    @m
    public final Object dismiss(@l DismissDirection dismissDirection, @l d<? super r2> dVar) {
        DismissValue dismissValue;
        Object l5;
        if (dismissDirection == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this, dismissValue, null, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animateTo$default == l5) {
            return animateTo$default;
        }
        return r2.f19517a;
    }

    @m
    public final DismissDirection getDismissDirection() {
        if (getOffset().getValue().floatValue() == 0.0f) {
            return null;
        }
        return getOffset().getValue().floatValue() > 0.0f ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
    }

    public final boolean isDismissed(@l DismissDirection dismissDirection) {
        return getCurrentValue() == (dismissDirection == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart);
    }

    @m
    public final Object reset(@l d<? super r2> dVar) {
        Object l5;
        Object animateTo$default = SwipeableState.animateTo$default(this, DismissValue.Default, null, dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateTo$default == l5 ? animateTo$default : r2.f19517a;
    }

    public DismissState(@l DismissValue dismissValue, @l v3.l<? super DismissValue, Boolean> lVar) {
        super(dismissValue, null, lVar, 2, null);
    }
}
