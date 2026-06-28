package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/y2;", "Lkotlinx/coroutines/internal/x;", "Lkotlinx/coroutines/e2;", "", "state", "B", "toString", "", "isActive", "()Z", bi.ay, "()Lkotlinx/coroutines/y2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1451:1\n341#2,6:1452\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1363#1:1452,6\n*E\n"})
/* loaded from: classes4.dex */
public final class y2 extends kotlinx.coroutines.internal.x implements e2 {
    @p4.l
    public final String B(@p4.l String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object l5 = l();
        kotlin.jvm.internal.l0.n(l5, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z4 = true;
        for (kotlinx.coroutines.internal.z zVar = (kotlinx.coroutines.internal.z) l5; !kotlin.jvm.internal.l0.g(zVar, this); zVar = zVar.m()) {
            if (zVar instanceof s2) {
                s2 s2Var = (s2) zVar;
                if (z4) {
                    z4 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(s2Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // kotlinx.coroutines.e2
    @p4.l
    public y2 a() {
        return this;
    }

    @Override // kotlinx.coroutines.e2
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.z
    @p4.l
    public String toString() {
        return super.toString();
    }
}
