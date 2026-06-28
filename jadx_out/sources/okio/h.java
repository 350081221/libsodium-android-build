package okio;

import java.util.zip.Inflater;

@kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"inflate", "Lokio/InflaterSource;", "Lokio/Source;", "inflater", "Ljava/util/zip/Inflater;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "-InflaterSourceExtensions")
/* loaded from: classes4.dex */
public final class h {
    @p4.l
    public static final d0 a(@p4.l n1 n1Var, @p4.l Inflater inflater) {
        kotlin.jvm.internal.l0.p(n1Var, "<this>");
        kotlin.jvm.internal.l0.p(inflater, "inflater");
        return new d0(n1Var, inflater);
    }

    public static /* synthetic */ d0 b(n1 n1Var, Inflater inflater, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            inflater = new Inflater();
        }
        kotlin.jvm.internal.l0.p(n1Var, "<this>");
        kotlin.jvm.internal.l0.p(inflater, "inflater");
        return new d0(n1Var, inflater);
    }
}
