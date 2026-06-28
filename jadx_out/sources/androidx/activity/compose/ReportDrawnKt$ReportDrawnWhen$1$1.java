package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,176:1\n62#2,5:177\n62#2,5:182\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1$1\n*L\n135#1:177,5\n138#1:182,5\n*E\n"})
/* loaded from: classes.dex */
final class ReportDrawnKt$ReportDrawnWhen$1$1 extends n0 implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    final /* synthetic */ v3.a<Boolean> $predicate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$1$1(FullyDrawnReporter fullyDrawnReporter, v3.a<Boolean> aVar) {
        super(1);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$predicate = aVar;
    }

    @Override // v3.l
    @p4.l
    public final DisposableEffectResult invoke(@p4.l DisposableEffectScope disposableEffectScope) {
        if (this.$fullyDrawnReporter.isFullyDrawnReported()) {
            return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(this.$fullyDrawnReporter, this.$predicate);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ReportDrawnComposition.this.removeReporter();
            }
        };
    }
}
