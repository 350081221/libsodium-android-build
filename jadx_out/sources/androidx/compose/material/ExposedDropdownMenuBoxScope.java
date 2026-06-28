package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.q;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&JW\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "Landroidx/compose/ui/Modifier;", "", "matchTextFieldWidth", "exposedDropdownSize", "expanded", "Lkotlin/Function0;", "Lkotlin/r2;", "onDismissRequest", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "ExposedDropdownMenu", "(ZLv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
@r1({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,740:1\n25#2:741\n25#2:748\n1116#3,6:742\n1116#3,6:749\n1116#3,6:756\n74#4:755\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n*L\n249#1:741\n253#1:748\n249#1:742,6\n253#1:749,6\n258#1:756,6\n254#1:755\n*E\n"})
/* loaded from: classes.dex */
public interface ExposedDropdownMenuBoxScope {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        @Deprecated
        public static void ExposedDropdownMenu(@l ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z4, @l a<r2> aVar, @m Modifier modifier, @m ScrollState scrollState, @l q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, @m Composer composer, int i5, int i6) {
            ExposedDropdownMenuBoxScope.super.ExposedDropdownMenu(z4, aVar, modifier, scrollState, qVar, composer, i5, i6);
        }
    }

    static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z4, int i5, Object obj) {
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
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0077  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    default void ExposedDropdownMenu(boolean r27, @p4.l v3.a<kotlin.r2> r28, @p4.m androidx.compose.ui.Modifier r29, @p4.m androidx.compose.foundation.ScrollState r30, @p4.l v3.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.m androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu(boolean, v3.a, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @l
    Modifier exposedDropdownSize(@l Modifier modifier, boolean z4);
}
