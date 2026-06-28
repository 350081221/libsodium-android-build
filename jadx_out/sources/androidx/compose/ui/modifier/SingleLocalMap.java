package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0003\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0014\u001a\u00020\u00112\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0090\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0006¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/modifier/SingleLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "", b.f22420d, "Lkotlin/r2;", "forceValue$ui_release", "(Ljava/lang/Object;)V", "forceValue", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", DatabaseFileArchive.COLUMN_KEY, "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "Landroidx/compose/ui/modifier/ModifierLocal;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "<init>", "(Landroidx/compose/ui/modifier/ModifierLocal;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,209:1\n81#2:210\n107#2,2:211\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n41#1:210\n41#1:211,2\n*E\n"})
/* loaded from: classes.dex */
public final class SingleLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;

    @l
    private final ModifierLocal<?> key;

    @l
    private final MutableState value$delegate;

    public SingleLocalMap(@l ModifierLocal<?> modifierLocal) {
        super(null);
        MutableState mutableStateOf$default;
        this.key = modifierLocal;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.value$delegate = mutableStateOf$default;
    }

    private final Object getValue() {
        return this.value$delegate.getValue();
    }

    private final void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@l ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.key;
    }

    public final void forceValue$ui_release(@m Object obj) {
        setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    @m
    public <T> T get$ui_release(@l ModifierLocal<T> modifierLocal) {
        boolean z4;
        if (modifierLocal == this.key) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            T t5 = (T) getValue();
            if (t5 == null) {
                return null;
            }
            return t5;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo5085set$ui_release(@l ModifierLocal<T> modifierLocal, T t5) {
        boolean z4;
        if (modifierLocal == this.key) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setValue(t5);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
