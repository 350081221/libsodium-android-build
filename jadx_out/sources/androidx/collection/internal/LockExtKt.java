package androidx.collection.internal;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"T", "Landroidx/collection/internal/Lock;", "Lkotlin/Function0;", "block", "synchronized", "(Landroidx/collection/internal/Lock;Lv3/a;)Ljava/lang/Object;", "collection"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLockExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 2 Lock.jvm.kt\nandroidx/collection/internal/Lock\n*L\n1#1,27:1\n26#2:28\n*S KotlinDebug\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n*L\n25#1:28\n*E\n"})
/* loaded from: classes.dex */
public final class LockExtKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m27synchronized(@l Lock lock, @l a<? extends T> block) {
        T invoke;
        l0.p(lock, "<this>");
        l0.p(block, "block");
        synchronized (lock) {
            try {
                invoke = block.invoke();
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        return invoke;
    }
}
