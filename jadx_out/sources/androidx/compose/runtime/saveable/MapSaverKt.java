package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.i0;
import p4.l;
import t0.b;
import v3.p;

@i0(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ax\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\r\"\u0004\b\u0000\u0010\u00002:\u0010\n\u001a6\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0001¢\u0006\u0002\b\t2\"\u0010\f\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b¨\u0006\u000f"}, d2 = {"T", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/v0;", "name", b.f22420d, "", "", "", "Lkotlin/u;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "mapSaver", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MapSaverKt {
    @l
    public static final <T> Saver<T, Object> mapSaver(@l p<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> pVar, @l v3.l<? super Map<String, ? extends Object>, ? extends T> lVar) {
        return ListSaverKt.listSaver(new MapSaverKt$mapSaver$1(pVar), new MapSaverKt$mapSaver$2(lVar));
    }
}
