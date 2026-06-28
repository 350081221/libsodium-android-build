package okio;

import java.io.Closeable;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0006\u001aA\u0010\u0007\u001a\u0002H\b\"\u0010\b\u0000\u0010\t*\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\"\u0004\b\u0001\u0010\b*\u0002H\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\b0\rH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"blackholeSink", "Lokio/Sink;", "blackhole", "buffer", "Lokio/BufferedSink;", "Lokio/BufferedSource;", "Lokio/Source;", "use", "R", "T", "Ljava/io/Closeable;", "Lokio/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "okio"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "okio/Okio")
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 {
    @p4.l
    @u3.h(name = "blackhole")
    public static final l1 a() {
        return new k();
    }

    @p4.l
    public static final m b(@p4.l l1 l1Var) {
        kotlin.jvm.internal.l0.p(l1Var, "<this>");
        return new g1(l1Var);
    }

    @p4.l
    public static final BufferedSource c(@p4.l n1 n1Var) {
        kotlin.jvm.internal.l0.p(n1Var, "<this>");
        return new h1(n1Var);
    }

    public static final <T extends Closeable, R> R d(T t5, @p4.l v3.l<? super T, ? extends R> block) {
        R r5;
        kotlin.jvm.internal.l0.p(block, "block");
        Throwable th = null;
        try {
            r5 = block.invoke(t5);
            kotlin.jvm.internal.i0.d(1);
            if (t5 != null) {
                try {
                    t5.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.i0.c(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.i0.d(1);
            if (t5 != null) {
                try {
                    t5.close();
                } catch (Throwable th4) {
                    kotlin.p.a(th3, th4);
                }
            }
            kotlin.jvm.internal.i0.c(1);
            th = th3;
            r5 = null;
        }
        if (th == null) {
            kotlin.jvm.internal.l0.m(r5);
            return r5;
        }
        throw th;
    }
}
