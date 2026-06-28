package c4;

import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.text.n;
import kotlin.text.o;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¨\u0006\u0005"}, d2 = {"get", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, pn = "kotlin.text", xi = 48)
@h(name = "RegexExtensionsJDK8Kt")
/* loaded from: classes4.dex */
public final class a {
    @g1(version = "1.2")
    @m
    public static final kotlin.text.m a(@l n nVar, @l String name) {
        o oVar;
        l0.p(nVar, "<this>");
        l0.p(name, "name");
        if (nVar instanceof o) {
            oVar = (o) nVar;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            return oVar.get(name);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
