package androidx.activity;

import kotlin.i0;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {185}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
@i0(k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt$reportWhenComplete$1\n*L\n1#1,190:1\n*E\n"})
/* loaded from: classes.dex */
public final class FullyDrawnReporterKt$reportWhenComplete$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullyDrawnReporterKt$reportWhenComplete$1(kotlin.coroutines.d<? super FullyDrawnReporterKt$reportWhenComplete$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
    }
}
