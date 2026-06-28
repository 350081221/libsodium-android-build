package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.p;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u001as\u0010\u0005\u001a\u00020\u0000*\u00020\u00002!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00070\u000621\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "state", "", "enabled", "pullRefresh", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "pullDelta", "onPull", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/d;", "", "onRelease", "(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/p;Z)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPullRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,120:1\n135#2:121\n146#2:122\n135#2:123\n146#2:124\n*S KotlinDebug\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n*L\n47#1:121\n47#1:122\n82#1:123\n82#1:124\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshKt {
    @l
    @ExperimentalMaterialApi
    public static final Modifier pullRefresh(@l Modifier modifier, @l PullRefreshState pullRefreshState, boolean z4) {
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1(pullRefreshState, z4) : InspectableValueKt.getNoInspectorInfo(), pullRefresh(Modifier.Companion, new PullRefreshKt$pullRefresh$2$1(pullRefreshState), new PullRefreshKt$pullRefresh$2$2(pullRefreshState), z4));
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        return pullRefresh(modifier, pullRefreshState, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pullRefresh$lambda$1$onRelease(PullRefreshState pullRefreshState, float f5, d dVar) {
        return b.e(pullRefreshState.onRelease$material_release(f5));
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, v3.l lVar, p pVar, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        return pullRefresh(modifier, lVar, pVar, z4);
    }

    @l
    @ExperimentalMaterialApi
    public static final Modifier pullRefresh(@l Modifier modifier, @l v3.l<? super Float, Float> lVar, @l p<? super Float, ? super d<? super Float>, ? extends Object> pVar, boolean z4) {
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2(lVar, pVar, z4) : InspectableValueKt.getNoInspectorInfo(), NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, new PullRefreshNestedScrollConnection(lVar, pVar, z4), null, 2, null));
    }
}
