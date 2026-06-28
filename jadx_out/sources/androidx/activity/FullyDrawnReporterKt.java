package androidx.activity;

import kotlin.i0;
import kotlin.r2;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "reporter", "reportWhenComplete", "(Landroidx/activity/FullyDrawnReporter;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FullyDrawnReporterKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.r2, java.lang.Object] */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object reportWhenComplete(@p4.l androidx.activity.FullyDrawnReporter r4, @p4.l v3.l<? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            boolean r0 = r6 instanceof androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            androidx.activity.FullyDrawnReporter r4 = (androidx.activity.FullyDrawnReporter) r4
            kotlin.e1.n(r6)     // Catch: java.lang.Throwable -> L5b
            goto L4f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r6)
            r4.addReporter()
            boolean r6 = r4.isFullyDrawnReported()
            if (r6 == 0) goto L44
            kotlin.r2 r4 = kotlin.r2.f19517a
            return r4
        L44:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L5b
            r0.label = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L5b
            if (r5 != r1) goto L4f
            return r1
        L4f:
            kotlin.jvm.internal.i0.d(r3)
            r4.removeReporter()
            kotlin.jvm.internal.i0.c(r3)
            kotlin.r2 r4 = kotlin.r2.f19517a
            return r4
        L5b:
            r5 = move-exception
            kotlin.jvm.internal.i0.d(r3)
            r4.removeReporter()
            kotlin.jvm.internal.i0.c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.FullyDrawnReporterKt.reportWhenComplete(androidx.activity.FullyDrawnReporter, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, v3.l<? super kotlin.coroutines.d<? super r2>, ? extends Object> lVar, kotlin.coroutines.d<? super r2> dVar) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return r2.f19517a;
        }
        try {
            lVar.invoke(dVar);
            kotlin.jvm.internal.i0.d(1);
            fullyDrawnReporter.removeReporter();
            kotlin.jvm.internal.i0.c(1);
            return r2.f19517a;
        } catch (Throwable th) {
            kotlin.jvm.internal.i0.d(1);
            fullyDrawnReporter.removeReporter();
            kotlin.jvm.internal.i0.c(1);
            throw th;
        }
    }
}
