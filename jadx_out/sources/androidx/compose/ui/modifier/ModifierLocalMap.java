package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H \u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H \u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H \u0002¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalMap;", "", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "Lkotlin/r2;", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "<init>", "()V", "Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Landroidx/compose/ui/modifier/EmptyMap;", "Landroidx/compose/ui/modifier/MultiLocalMap;", "Landroidx/compose/ui/modifier/SingleLocalMap;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    private ModifierLocalMap() {
    }

    public /* synthetic */ ModifierLocalMap(w wVar) {
        this();
    }

    public abstract boolean contains$ui_release(@l ModifierLocal<?> modifierLocal);

    @m
    public abstract <T> T get$ui_release(@l ModifierLocal<T> modifierLocal);

    /* renamed from: set$ui_release */
    public abstract <T> void mo5085set$ui_release(@l ModifierLocal<T> modifierLocal, T t5);
}
