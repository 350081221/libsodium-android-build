package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import kotlin.d1;

@kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlin/coroutines/d;", "", "c", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", bi.ay, "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nDebugStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugStrings.kt\nkotlinx/coroutines/DebugStringsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* loaded from: classes4.dex */
public final class x0 {
    @p4.l
    public static final String a(@p4.l Object obj) {
        return obj.getClass().getSimpleName();
    }

    @p4.l
    public static final String b(@p4.l Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @p4.l
    public static final String c(@p4.l kotlin.coroutines.d<?> dVar) {
        Object m6444constructorimpl;
        if (dVar instanceof kotlinx.coroutines.internal.l) {
            return dVar.toString();
        }
        try {
            d1.a aVar = kotlin.d1.Companion;
            m6444constructorimpl = kotlin.d1.m6444constructorimpl(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            d1.a aVar2 = kotlin.d1.Companion;
            m6444constructorimpl = kotlin.d1.m6444constructorimpl(kotlin.e1.a(th));
        }
        if (kotlin.d1.m6447exceptionOrNullimpl(m6444constructorimpl) != null) {
            m6444constructorimpl = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) m6444constructorimpl;
    }
}
