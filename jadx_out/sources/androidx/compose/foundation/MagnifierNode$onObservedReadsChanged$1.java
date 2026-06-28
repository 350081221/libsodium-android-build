package androidx.compose.foundation;

import android.view.View;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode$onObservedReadsChanged$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,467:1\n1#2:468\n*E\n"})
/* loaded from: classes.dex */
public final class MagnifierNode$onObservedReadsChanged$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ MagnifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onObservedReadsChanged$1(MagnifierNode magnifierNode) {
        super(0);
        this.this$0 = magnifierNode;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View view;
        Density density;
        PlatformMagnifier platformMagnifier;
        view = this.this$0.view;
        View view2 = (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, AndroidCompositionLocals_androidKt.getLocalView());
        this.this$0.view = view2;
        density = this.this$0.density;
        Density density2 = (Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalDensity());
        this.this$0.density = density2;
        platformMagnifier = this.this$0.magnifier;
        if (platformMagnifier == null || !l0.g(view2, view) || !l0.g(density2, density)) {
            this.this$0.recreateMagnifier();
        }
        this.this$0.updateMagnifier();
    }
}
