package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0006\u001a\u00020\u0005*\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/material3/DraggableAnchorsConfig;", "T", "", "", "position", "Lkotlin/r2;", "at", "(Ljava/lang/Object;F)V", "", "anchors", "Ljava/util/Map;", "getAnchors$material3_release", "()Ljava/util/Map;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;

    @p4.l
    private final Map<T, Float> anchors = new LinkedHashMap();

    public final void at(T t5, float f5) {
        this.anchors.put(t5, Float.valueOf(f5));
    }

    @p4.l
    public final Map<T, Float> getAnchors$material3_release() {
        return this.anchors;
    }
}
