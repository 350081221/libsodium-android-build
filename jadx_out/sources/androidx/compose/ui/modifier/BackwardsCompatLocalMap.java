package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u0018\u0010\u0017J,\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "Lkotlin/r2;", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "element", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "getElement", "()Landroidx/compose/ui/modifier/ModifierLocalProvider;", "setElement", "(Landroidx/compose/ui/modifier/ModifierLocalProvider;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BackwardsCompatLocalMap extends ModifierLocalMap {
    public static final int $stable = 8;

    @l
    private ModifierLocalProvider<?> element;

    public BackwardsCompatLocalMap(@l ModifierLocalProvider<?> modifierLocalProvider) {
        super(null);
        this.element = modifierLocalProvider;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@l ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.element.getKey();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    @m
    public <T> T get$ui_release(@l ModifierLocal<T> modifierLocal) {
        boolean z4;
        if (modifierLocal == this.element.getKey()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return (T) this.element.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @l
    public final ModifierLocalProvider<?> getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo5085set$ui_release(@l ModifierLocal<T> modifierLocal, T t5) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider".toString());
    }

    public final void setElement(@l ModifierLocalProvider<?> modifierLocalProvider) {
        this.element = modifierLocalProvider;
    }
}
