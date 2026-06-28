package androidx.compose.material.pullrefresh;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n*L\n1#1,170:1\n83#2,5:171\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2 extends n0 implements l<InspectorInfo, r2> {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ l $onPull$inlined;
    final /* synthetic */ p $onRelease$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2(l lVar, p pVar, boolean z4) {
        super(1);
        this.$onPull$inlined = lVar;
        this.$onRelease$inlined = pVar;
        this.$enabled$inlined = z4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pullRefresh");
        inspectorInfo.getProperties().set("onPull", this.$onPull$inlined);
        inspectorInfo.getProperties().set("onRelease", this.$onRelease$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
    }
}
