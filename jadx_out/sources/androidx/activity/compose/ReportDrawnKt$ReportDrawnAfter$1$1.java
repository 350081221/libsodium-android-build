package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

@f(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", f = "ReportDrawn.kt", i = {0}, l = {182}, m = "invokeSuspend", n = {"$this$reportWhenComplete$iv"}, s = {"L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,176:1\n180#2,10:177\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1$1\n*L\n173#1:177,10\n*E\n"})
/* loaded from: classes.dex */
final class ReportDrawnKt$ReportDrawnAfter$1$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ l<d<? super r2>, Object> $block;
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReportDrawnKt$ReportDrawnAfter$1$1(FullyDrawnReporter fullyDrawnReporter, l<? super d<? super r2>, ? extends Object> lVar, d<? super ReportDrawnKt$ReportDrawnAfter$1$1> dVar) {
        super(2, dVar);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new ReportDrawnKt$ReportDrawnAfter$1$1(this.$fullyDrawnReporter, this.$block, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((ReportDrawnKt$ReportDrawnAfter$1$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        FullyDrawnReporter fullyDrawnReporter;
        Throwable th;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                fullyDrawnReporter = (FullyDrawnReporter) this.L$0;
                try {
                    e1.n(obj);
                } catch (Throwable th2) {
                    th = th2;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
            l<d<? super r2>, Object> lVar = this.$block;
            fullyDrawnReporter2.addReporter();
            if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                try {
                    this.L$0 = fullyDrawnReporter2;
                    this.label = 1;
                    if (lVar.invoke(this) == l5) {
                        return l5;
                    }
                    fullyDrawnReporter = fullyDrawnReporter2;
                } catch (Throwable th3) {
                    fullyDrawnReporter = fullyDrawnReporter2;
                    th = th3;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            }
            return r2.f19517a;
        }
        fullyDrawnReporter.removeReporter();
        return r2.f19517a;
    }
}
