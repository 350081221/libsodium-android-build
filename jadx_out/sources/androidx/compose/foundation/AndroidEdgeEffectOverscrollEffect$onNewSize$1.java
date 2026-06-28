package androidx.compose.foundation;

import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "size", "Lkotlin/r2;", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect$onNewSize$1 extends n0 implements v3.l<IntSize, r2> {
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$onNewSize$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(IntSize intSize) {
        m183invokeozmzZPI(intSize.m6218unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m183invokeozmzZPI(long j5) {
        long j6;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        EdgeEffect edgeEffect4;
        EdgeEffect edgeEffect5;
        EdgeEffect edgeEffect6;
        EdgeEffect edgeEffect7;
        EdgeEffect edgeEffect8;
        long m6224toSizeozmzZPI = IntSizeKt.m6224toSizeozmzZPI(j5);
        j6 = this.this$0.containerSize;
        boolean z4 = !Size.m3558equalsimpl0(m6224toSizeozmzZPI, j6);
        this.this$0.containerSize = IntSizeKt.m6224toSizeozmzZPI(j5);
        if (z4) {
            edgeEffect = this.this$0.topEffect;
            edgeEffect.setSize(IntSize.m6214getWidthimpl(j5), IntSize.m6213getHeightimpl(j5));
            edgeEffect2 = this.this$0.bottomEffect;
            edgeEffect2.setSize(IntSize.m6214getWidthimpl(j5), IntSize.m6213getHeightimpl(j5));
            edgeEffect3 = this.this$0.leftEffect;
            edgeEffect3.setSize(IntSize.m6213getHeightimpl(j5), IntSize.m6214getWidthimpl(j5));
            edgeEffect4 = this.this$0.rightEffect;
            edgeEffect4.setSize(IntSize.m6213getHeightimpl(j5), IntSize.m6214getWidthimpl(j5));
            edgeEffect5 = this.this$0.topEffectNegation;
            edgeEffect5.setSize(IntSize.m6214getWidthimpl(j5), IntSize.m6213getHeightimpl(j5));
            edgeEffect6 = this.this$0.bottomEffectNegation;
            edgeEffect6.setSize(IntSize.m6214getWidthimpl(j5), IntSize.m6213getHeightimpl(j5));
            edgeEffect7 = this.this$0.leftEffectNegation;
            edgeEffect7.setSize(IntSize.m6213getHeightimpl(j5), IntSize.m6214getWidthimpl(j5));
            edgeEffect8 = this.this$0.rightEffectNegation;
            edgeEffect8.setSize(IntSize.m6213getHeightimpl(j5), IntSize.m6214getWidthimpl(j5));
        }
        if (z4) {
            this.this$0.invalidateOverscroll();
            this.this$0.animateToRelease();
        }
    }
}
