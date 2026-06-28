package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import u3.h;
import v3.q;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aJ\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\t\u001a^\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\b\u0010\u000e\u001ah\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0010\u001ar\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0012\u001al\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u0013\"\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0015\u001a\u001b\u0010\u001a\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0014\u0010\u001c\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000H\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "Lkotlin/u;", "inspectorInfo", "Landroidx/compose/runtime/Composable;", "factory", "composed", "(Landroidx/compose/ui/Modifier;Lv3/l;Lv3/q;)Landroidx/compose/ui/Modifier;", "", "fullyQualifiedName", "", "key1", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Lv3/l;Lv3/q;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lv3/l;Lv3/q;)Landroidx/compose/ui/Modifier;", "key3", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv3/l;Lv3/q;)Landroidx/compose/ui/Modifier;", "", "keys", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;[Ljava/lang/Object;Lv3/l;Lv3/q;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composer;", "modifier", "materializeModifier", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "materialize", "materializeWithCompositionLocalInjection", "materializeWithCompositionLocalInjectionInternal", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ComposedModifierKt {
    @l
    public static final Modifier composed(@l Modifier modifier, @l v3.l<? super InspectorInfo, r2> lVar, @l q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new ComposedModifier(lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, v3.l lVar, q qVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, lVar, qVar);
    }

    @l
    @h(name = "materializeModifier")
    public static final Modifier materializeModifier(@l Composer composer, @l Modifier modifier) {
        if (modifier.all(ComposedModifierKt$materialize$1.INSTANCE)) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new ComposedModifierKt$materialize$result$1(composer));
        composer.endReplaceableGroup();
        return modifier2;
    }

    @l
    public static final Modifier materializeWithCompositionLocalInjectionInternal(@l Composer composer, @l Modifier modifier) {
        if (modifier != Modifier.Companion) {
            return materializeModifier(composer, new CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
        }
        return modifier;
    }

    @l
    @ExperimentalComposeUiApi
    public static final Modifier composed(@l Modifier modifier, @l String str, @m Object obj, @l v3.l<? super InspectorInfo, r2> lVar, @l q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifier1(str, obj, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, v3.l lVar, q qVar, int i5, Object obj2) {
        if ((i5 & 4) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, (v3.l<? super InspectorInfo, r2>) lVar, (q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) qVar);
    }

    @l
    @ExperimentalComposeUiApi
    public static final Modifier composed(@l Modifier modifier, @l String str, @m Object obj, @m Object obj2, @l v3.l<? super InspectorInfo, r2> lVar, @l q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, v3.l lVar, q qVar, int i5, Object obj3) {
        if ((i5 & 8) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, lVar, qVar);
    }

    @l
    @ExperimentalComposeUiApi
    public static final Modifier composed(@l Modifier modifier, @l String str, @m Object obj, @m Object obj2, @m Object obj3, @l v3.l<? super InspectorInfo, r2> lVar, @l q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, v3.l lVar, q qVar, int i5, Object obj4) {
        if ((i5 & 16) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, lVar, qVar);
    }

    @l
    @ExperimentalComposeUiApi
    public static final Modifier composed(@l Modifier modifier, @l String str, @l Object[] objArr, @l v3.l<? super InspectorInfo, r2> lVar, @l q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> qVar) {
        return modifier.then(new KeyedComposedModifierN(str, objArr, lVar, qVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, v3.l lVar, q qVar, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            lVar = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, (v3.l<? super InspectorInfo, r2>) lVar, (q<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) qVar);
    }
}
