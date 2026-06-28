package okio;

import java.util.zip.Deflater;

@kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"deflate", "Lokio/DeflaterSink;", "Lokio/Sink;", "deflater", "Ljava/util/zip/Deflater;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "-DeflaterSinkExtensions")
/* loaded from: classes4.dex */
public final class b {
    @p4.l
    public static final q a(@p4.l l1 l1Var, @p4.l Deflater deflater) {
        kotlin.jvm.internal.l0.p(l1Var, "<this>");
        kotlin.jvm.internal.l0.p(deflater, "deflater");
        return new q(l1Var, deflater);
    }

    public static /* synthetic */ q b(l1 l1Var, Deflater deflater, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            deflater = new Deflater();
        }
        kotlin.jvm.internal.l0.p(l1Var, "<this>");
        kotlin.jvm.internal.l0.p(deflater, "deflater");
        return new q(l1Var, deflater);
    }
}
