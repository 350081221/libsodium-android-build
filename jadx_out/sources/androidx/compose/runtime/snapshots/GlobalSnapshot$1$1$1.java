package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,2294:1\n33#2,6:2295\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n*L\n1325#1:2295,6\n*E\n"})
/* loaded from: classes.dex */
final class GlobalSnapshot$1$1$1 extends n0 implements l<Object, r2> {
    final /* synthetic */ List<l<Object, r2>> $it;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GlobalSnapshot$1$1$1(List<? extends l<Object, r2>> list) {
        super(1);
        this.$it = list;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
        invoke2(obj);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Object obj) {
        List<l<Object, r2>> list = this.$it;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            list.get(i5).invoke(obj);
        }
    }
}
