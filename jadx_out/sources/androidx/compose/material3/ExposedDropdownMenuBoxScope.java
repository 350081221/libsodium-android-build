package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H&J\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&JW\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "Landroidx/compose/ui/Modifier;", "menuAnchor", "", "matchTextFieldWidth", "exposedDropdownSize", "expanded", "Lkotlin/Function0;", "Lkotlin/r2;", "onDismissRequest", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "ExposedDropdownMenu", "(ZLv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1091:1\n1116#2,6:1092\n1116#2,6:1098\n1116#2,6:1105\n74#3:1104\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n*L\n279#1:1092,6\n283#1:1098,6\n285#1:1105,6\n284#1:1104\n*E\n"})
/* loaded from: classes.dex */
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0077  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ExposedDropdownMenu(boolean r29, @p4.l v3.a<kotlin.r2> r30, @p4.m androidx.compose.ui.Modifier r31, @p4.m androidx.compose.foundation.ScrollState r32, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r33, @p4.m androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu(boolean, v3.a, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @p4.l
    public abstract Modifier exposedDropdownSize(@p4.l Modifier modifier, boolean z4);

    @p4.l
    public abstract Modifier menuAnchor(@p4.l Modifier modifier);
}
