package kotlin.io;

import java.io.Closeable;
import kotlin.a1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0001\u001aH\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u0002\"\u0004\b\u0001\u0010\u0006*\u0002H\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"closeFinally", "", "Ljava/io/Closeable;", "cause", "", "use", "R", "T", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "CloseableKt")
/* loaded from: classes2.dex */
public final class c {
    @g1(version = "1.1")
    @a1
    public static final void a(@p4.m Closeable closeable, @p4.m Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                kotlin.p.a(th, th2);
            }
        }
    }

    @kotlin.internal.f
    private static final <T extends Closeable, R> R b(T t5, v3.l<? super T, ? extends R> block) {
        l0.p(block, "block");
        try {
            R invoke = block.invoke(t5);
            kotlin.jvm.internal.i0.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                a(t5, null);
            } else if (t5 != null) {
                t5.close();
            }
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.i0.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    if (t5 != null) {
                        try {
                            t5.close();
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    a(t5, th);
                }
                kotlin.jvm.internal.i0.c(1);
                throw th2;
            }
        }
    }
}
