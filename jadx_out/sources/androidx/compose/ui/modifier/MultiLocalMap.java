package androidx.compose.ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.u0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B?\u00126\u0010\u0017\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00160\u0015\"\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0013\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/modifier/MultiLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "Lkotlin/r2;", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "Lkotlin/u0;", "entries", "<init>", "([Lkotlin/u0;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MultiLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;

    @l
    private final SnapshotStateMap<ModifierLocal<?>, Object> map;

    public MultiLocalMap(@l u0<? extends ModifierLocal<?>, ? extends Object>... u0VarArr) {
        super(null);
        Map<? extends ModifierLocal<?>, ? extends Object> H0;
        SnapshotStateMap<ModifierLocal<?>, Object> mutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
        this.map = mutableStateMapOf;
        H0 = a1.H0(u0VarArr);
        mutableStateMapOf.putAll(H0);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@l ModifierLocal<?> modifierLocal) {
        return this.map.containsKey(modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    @m
    public <T> T get$ui_release(@l ModifierLocal<T> modifierLocal) {
        T t5 = (T) this.map.get(modifierLocal);
        if (t5 == null) {
            return null;
        }
        return t5;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo5085set$ui_release(@l ModifierLocal<T> modifierLocal, T t5) {
        this.map.put(modifierLocal, t5);
    }
}
