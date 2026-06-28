package androidx.compose.runtime.saveable;

import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import p4.l;
import t0.b;
import v3.p;

@i0(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a}\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000122\u0010\t\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0002¢\u0006\u0002\b\b2)\u0010\f\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¨\u0006\u0010"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/v0;", "name", b.f22420d, "", "Lkotlin/u;", "save", "Lkotlin/Function1;", "list", "restore", "Landroidx/compose/runtime/saveable/Saver;", "", "listSaver", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ListSaverKt {
    @l
    public static final <Original, Saveable> Saver<Original, Object> listSaver(@l p<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> pVar, @l v3.l<? super List<? extends Saveable>, ? extends Original> lVar) {
        ListSaverKt$listSaver$1 listSaverKt$listSaver$1 = new ListSaverKt$listSaver$1(pVar);
        l0.n(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return SaverKt.Saver(listSaverKt$listSaver$1, (v3.l) u1.q(lVar, 1));
    }
}
