package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a]\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aU\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceState;", "rememberAndroidExternalSurfaceState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidExternalSurfaceState;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isOpaque", "Landroidx/compose/ui/unit/IntSize;", "surfaceSize", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "zOrder", "isSecure", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Lkotlin/r2;", "Lkotlin/u;", "onInit", "AndroidExternalSurface-58FFMhA", "(Landroidx/compose/ui/Modifier;ZJIZLv3/l;Landroidx/compose/runtime/Composer;II)V", "AndroidExternalSurface", "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "rememberAndroidEmbeddedExternalSurfaceState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "Landroidx/compose/ui/graphics/Matrix;", "transform", "AndroidEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLv3/l;Landroidx/compose/runtime/Composer;II)V", "AndroidEmbeddedExternalSurface", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAndroidExternalSurface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,480:1\n487#2,4:481\n491#2,2:489\n495#2:495\n487#2,4:509\n491#2,2:517\n495#2:523\n25#3:485\n25#3:496\n25#3:513\n25#3:524\n1116#4,3:486\n1119#4,3:492\n1116#4,6:497\n1116#4,6:503\n1116#4,3:514\n1119#4,3:520\n1116#4,6:525\n487#5:491\n487#5:519\n*S KotlinDebug\n*F\n+ 1 AndroidExternalSurface.android.kt\nandroidx/compose/foundation/AndroidExternalSurface_androidKt\n*L\n191#1:481,4\n191#1:489,2\n191#1:495\n385#1:509,4\n385#1:517,2\n385#1:523\n191#1:485\n192#1:496\n385#1:513\n386#1:524\n191#1:486,3\n191#1:492,3\n192#1:497,6\n300#1:503,6\n385#1:514,3\n385#1:520,3\n386#1:525,6\n191#1:491\n385#1:519\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidExternalSurface_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0060  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m196AndroidEmbeddedExternalSurfacesv6N_fY(@p4.m androidx.compose.ui.Modifier r20, boolean r21, long r22, @p4.m float[] r24, @p4.l v3.l<? super androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.r2> r25, @p4.m androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidExternalSurface_androidKt.m196AndroidEmbeddedExternalSurfacesv6N_fY(androidx.compose.ui.Modifier, boolean, long, float[], v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0060  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m197AndroidExternalSurface58FFMhA(@p4.m androidx.compose.ui.Modifier r17, boolean r18, long r19, int r21, boolean r22, @p4.l v3.l<? super androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.r2> r23, @p4.m androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidExternalSurface_androidKt.m197AndroidExternalSurface58FFMhA(androidx.compose.ui.Modifier, boolean, long, int, boolean, v3.l, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    private static final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(Composer composer, int i5) {
        composer.startReplaceableGroup(-1057437053);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1057437053, i5, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new AndroidEmbeddedExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidEmbeddedExternalSurfaceState;
    }

    @Composable
    private static final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(Composer composer, int i5) {
        composer.startReplaceableGroup(-873615933);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-873615933, i5, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new AndroidExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidExternalSurfaceState;
    }
}
