package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt$BoxWithConstraints$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/* loaded from: classes.dex */
public final class BoxWithConstraintsKt$BoxWithConstraints$1$1 extends n0 implements p<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ q<BoxWithConstraintsScope, Composer, Integer, r2> $content;
    final /* synthetic */ MeasurePolicy $measurePolicy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoxWithConstraintsKt$BoxWithConstraints$1$1(MeasurePolicy measurePolicy, q<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, r2> qVar) {
        super(2);
        this.$measurePolicy = measurePolicy;
        this.$content = qVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m488invoke0kLqBqw(subcomposeMeasureScope, constraints.m6006unboximpl());
    }

    @l
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m488invoke0kLqBqw(@l SubcomposeMeasureScope subcomposeMeasureScope, long j5) {
        return this.$measurePolicy.mo30measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(r2.f19517a, ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(this.$content, new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, j5, null)))), j5);
    }
}
