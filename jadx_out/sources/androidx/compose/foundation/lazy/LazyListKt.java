package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009a\u0001\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u008c\u0001\u0010$\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0 ¢\u0006\u0002\b\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "", "beyondBoundsItemCount", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/r2;", "Lkotlin/u;", "content", "LazyList", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lv3/l;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProviderLambda", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "rememberLazyListMeasurePolicy", "(Lv3/a;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;II)Lv3/p;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,353:1\n487#2,4:354\n491#2,2:362\n495#2:368\n25#3:358\n83#3,3:371\n1116#4,3:359\n1119#4,3:365\n1116#4,6:374\n487#5:364\n74#6:369\n74#6:370\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n84#1:354,4\n84#1:362,2\n84#1:368\n84#1:358\n168#1:371,3\n84#1:359,3\n84#1:365,3\n168#1:374,6\n84#1:364\n121#1:369\n129#1:370\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0142  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyList(@p4.l androidx.compose.ui.Modifier r34, @p4.l androidx.compose.foundation.lazy.LazyListState r35, @p4.l androidx.compose.foundation.layout.PaddingValues r36, boolean r37, boolean r38, @p4.l androidx.compose.foundation.gestures.FlingBehavior r39, boolean r40, int r41, @p4.m androidx.compose.ui.Alignment.Horizontal r42, @p4.m androidx.compose.foundation.layout.Arrangement.Vertical r43, @p4.m androidx.compose.ui.Alignment.Vertical r44, @p4.m androidx.compose.foundation.layout.Arrangement.Horizontal r45, @p4.l v3.l<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.r2> r46, @p4.m androidx.compose.runtime.Composer r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, v3.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ExperimentalFoundationApi
    private static final p<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(a<? extends LazyListItemProvider> aVar, LazyListState lazyListState, PaddingValues paddingValues, boolean z4, boolean z5, int i5, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, Composer composer, int i6, int i7) {
        Alignment.Horizontal horizontal3;
        Alignment.Vertical vertical3;
        Arrangement.Horizontal horizontal4;
        Arrangement.Vertical vertical4;
        composer.startReplaceableGroup(183156450);
        if ((i7 & 64) != 0) {
            horizontal3 = null;
        } else {
            horizontal3 = horizontal;
        }
        if ((i7 & 128) != 0) {
            vertical3 = null;
        } else {
            vertical3 = vertical;
        }
        if ((i7 & 256) != 0) {
            horizontal4 = null;
        } else {
            horizontal4 = horizontal2;
        }
        if ((i7 & 512) != 0) {
            vertical4 = null;
        } else {
            vertical4 = vertical2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(183156450, i6, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:167)");
        }
        Object[] objArr = {lazyListState, paddingValues, Boolean.valueOf(z4), Boolean.valueOf(z5), horizontal3, vertical3, horizontal4, vertical4};
        composer.startReplaceableGroup(-568225417);
        boolean z6 = false;
        for (int i8 = 0; i8 < 8; i8++) {
            z6 |= composer.changed(objArr[i8]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyListKt$rememberLazyListMeasurePolicy$1$1(lazyListState, z5, paddingValues, z4, aVar, vertical4, horizontal4, i5, horizontal3, vertical3);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        p<LazyLayoutMeasureScope, Constraints, MeasureResult> pVar = (p) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar;
    }
}
