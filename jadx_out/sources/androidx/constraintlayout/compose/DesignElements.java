package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import v3.r;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022)\u0010\b\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nRQ\u0010\u000b\u001a1\u0012\u0004\u0012\u00020\u0002\u0012'\u0012%\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00070\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/constraintlayout/compose/DesignElements;", "", "", "name", "Lkotlin/Function2;", "Ljava/util/HashMap;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "function", "define", "(Ljava/lang/String;Lv3/r;)V", "map", "Ljava/util/HashMap;", "getMap", "()Ljava/util/HashMap;", "setMap", "(Ljava/util/HashMap;)V", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DesignElements {

    @l
    public static final DesignElements INSTANCE = new DesignElements();

    @l
    private static HashMap<String, r<String, HashMap<String, String>, Composer, Integer, r2>> map = new HashMap<>();
    public static final int $stable = 8;

    private DesignElements() {
    }

    public final void define(@l String name, @l r<? super String, ? super HashMap<String, String>, ? super Composer, ? super Integer, r2> function) {
        l0.p(name, "name");
        l0.p(function, "function");
        map.put(name, function);
    }

    @l
    public final HashMap<String, r<String, HashMap<String, String>, Composer, Integer, r2>> getMap() {
        return map;
    }

    public final void setMap(@l HashMap<String, r<String, HashMap<String, String>, Composer, Integer, r2>> hashMap) {
        l0.p(hashMap, "<set-?>");
        map = hashMap;
    }
}
