package androidx.compose.ui.modifier;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.u0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001a\u0010\u0001\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a&\u0010\u0001\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00022\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00000\u0005\u001a)\u0010\u0001\u001a\u00020\u00002\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0007\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0001\u0010\t\u001aA\u0010\u0001\u001a\u00020\u000022\u0010\u000b\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\n0\u00050\u0007\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\u0001\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalMap;", "modifierLocalMapOf", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/u0;", "entry", "", "keys", "([Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "", "entries", "([Lkotlin/u0;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,209:1\n1#2:210\n11335#3:211\n11670#3,3:212\n37#4,2:215\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n*L\n199#1:211\n199#1:212,3\n199#1:215,2\n*E\n"})
/* loaded from: classes.dex */
public final class ModifierLocalModifierNodeKt {
    @l
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    @l
    public static final <T> ModifierLocalMap modifierLocalMapOf(@l ModifierLocal<T> modifierLocal) {
        return new SingleLocalMap(modifierLocal);
    }

    @l
    public static final <T> ModifierLocalMap modifierLocalMapOf(@l u0<? extends ModifierLocal<T>, ? extends T> u0Var) {
        SingleLocalMap singleLocalMap = new SingleLocalMap(u0Var.getFirst());
        singleLocalMap.mo5085set$ui_release(u0Var.getFirst(), u0Var.getSecond());
        return singleLocalMap;
    }

    @l
    public static final ModifierLocalMap modifierLocalMapOf(@l u0<? extends ModifierLocal<?>, ? extends Object>... u0VarArr) {
        return new MultiLocalMap((u0[]) Arrays.copyOf(u0VarArr, u0VarArr.length));
    }

    @l
    public static final ModifierLocalMap modifierLocalMapOf(@l ModifierLocal<?>... modifierLocalArr) {
        ArrayList arrayList = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> modifierLocal : modifierLocalArr) {
            arrayList.add(q1.a(modifierLocal, null));
        }
        u0[] u0VarArr = (u0[]) arrayList.toArray(new u0[0]);
        return new MultiLocalMap((u0[]) Arrays.copyOf(u0VarArr, u0VarArr.length));
    }
}
