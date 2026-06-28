package s3;

import kotlin.a1;
import kotlin.g1;
import kotlin.i0;
import kotlin.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.p;
import p4.m;
import u3.h;
import v3.l;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001\u001aH\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u0002\"\u0004\b\u0001\u0010\u0006*\u0002H\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"closeFinally", "", "Ljava/lang/AutoCloseable;", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "(Ljava/lang/AutoCloseable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 9, 0}, pn = "kotlin", xi = 48)
@h(name = "AutoCloseableKt")
/* loaded from: classes4.dex */
public final class a {
    @g1(version = "1.2")
    @a1
    public static final void a(@m AutoCloseable autoCloseable, @m Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                p.a(th, th2);
            }
        }
    }

    @g1(version = "1.2")
    @f
    private static final <T extends AutoCloseable, R> R b(T t5, l<? super T, ? extends R> block) {
        l0.p(block, "block");
        try {
            R invoke = block.invoke(t5);
            kotlin.jvm.internal.i0.d(1);
            a(t5, null);
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } finally {
        }
    }
}
