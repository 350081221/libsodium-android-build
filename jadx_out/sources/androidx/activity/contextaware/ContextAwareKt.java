package androidx.activity.contextaware;

import android.content.Context;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.c;
import kotlin.coroutines.jvm.internal.h;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.q;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0006\u001a\u00078\u0000¢\u0006\u0002\b\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001e\b\u0004\u0010\u0005\u001a\u0018\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u0002H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"R", "Landroidx/activity/contextaware/ContextAware;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lu3/n;", "onContextAvailable", "withContextAvailable", "(Landroidx/activity/contextaware/ContextAware;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"})
/* loaded from: classes.dex */
public final class ContextAwareKt {
    @m
    public static final <R> Object withContextAvailable(@l ContextAware contextAware, @l v3.l<Context, R> lVar, @l d<R> dVar) {
        d e5;
        Object l5;
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return lVar.invoke(peekAvailableContext);
        }
        e5 = c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(qVar, lVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        qVar.g(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            h.c(dVar);
        }
        return E;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, v3.l<Context, R> lVar, d<R> dVar) {
        d e5;
        Object l5;
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return lVar.invoke(peekAvailableContext);
        }
        kotlin.jvm.internal.i0.e(0);
        e5 = c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(qVar, lVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        qVar.g(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        r2 r2Var = r2.f19517a;
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            h.c(dVar);
        }
        kotlin.jvm.internal.i0.e(1);
        return E;
    }
}
