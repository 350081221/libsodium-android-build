package androidx.compose.ui.text.platform;

import kotlin.a1;
import kotlin.i0;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a,\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/platform/SynchronizedObject;", "createSynchronizedObject", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Landroidx/compose/ui/text/platform/SynchronizedObject;Lv3/a;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Synchronization_jvmKt {
    @l
    public static final SynchronizedObject createSynchronizedObject() {
        return new SynchronizedObject();
    }

    @a1
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m5802synchronized(@l SynchronizedObject synchronizedObject, @l a<? extends R> aVar) {
        R invoke;
        synchronized (synchronizedObject) {
            try {
                invoke = aVar.invoke();
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
