package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000\u001a<\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#\"\u0014\u0010%\u001a\u00020!8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#*b\b\u0002\u0010(\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0002\b\u0007¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\u0002\b\u0007¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006)"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material3/SnackbarData;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "snackbar", "SnackbarHost", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "", "toMillis", "current", "content", "FadeInFadeOutWithScale", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/State;", "animatedOpacity", "(Landroidx/compose/animation/core/AnimationSpec;ZLv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "SnackbarFadeInMillis", "I", "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "Lkotlin/v0;", "name", "FadeInFadeOutTransition", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,464:1\n74#2:465\n1116#3,6:466\n1116#3,6:472\n1116#3,6:545\n1116#3,6:551\n1116#3,6:557\n1116#3,6:563\n151#4,3:478\n33#4,4:481\n154#4,2:485\n38#4:487\n156#4:488\n200#4,2:489\n33#4,4:491\n202#4,2:495\n38#4:497\n204#4:498\n33#4,6:534\n68#5,6:499\n74#5:533\n78#5:544\n78#6,11:505\n91#6:543\n456#7,8:516\n464#7,3:530\n467#7,3:540\n3737#8,6:524\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n*L\n227#1:465\n228#1:466,6\n348#1:472,6\n438#1:545,6\n439#1:551,6\n451#1:557,6\n452#1:563,6\n351#1:478,3\n351#1:481,4\n351#1:485,2\n351#1:487\n351#1:488\n356#1:489,2\n356#1:491,4\n356#1:495,2\n356#1:497\n356#1:498\n408#1:534,6\n406#1:499,6\n406#1:533\n406#1:544\n406#1:505,11\n406#1:543\n406#1:516,8\n406#1:530,3\n406#1:540,3\n406#1:524,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01da A[LOOP:2: B:54:0x01d8->B:55:0x01da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0049  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FadeInFadeOutWithScale(androidx.compose.material3.SnackbarData r16, androidx.compose.ui.Modifier r17, v3.q<? super androidx.compose.material3.SnackbarData, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostKt.FadeInFadeOutWithScale(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SnackbarHost(@p4.l SnackbarHostState snackbarHostState, @p4.m Modifier modifier, @p4.m v3.q<? super SnackbarData, ? super Composer, ? super Integer, r2> qVar, @p4.m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(464178177);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(snackbarHostState)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        int i11 = i6 & 2;
        if (i11 != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        int i12 = i6 & 4;
        if (i12 != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i7 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier = Modifier.Companion;
            }
            if (i12 != 0) {
                qVar = ComposableSingletons$SnackbarHostKt.INSTANCE.m1761getLambda1$material3_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(464178177, i7, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:224)");
            }
            SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
            AccessibilityManager accessibilityManager = (AccessibilityManager) startRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager());
            startRestartGroup.startReplaceableGroup(-1401194142);
            boolean changed = startRestartGroup.changed(currentSnackbarData) | startRestartGroup.changedInstance(accessibilityManager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostKt$SnackbarHost$1$1(currentSnackbarData, accessibilityManager, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(currentSnackbarData, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue, startRestartGroup, 0);
            FadeInFadeOutWithScale(snackbarHostState.getCurrentSnackbarData(), modifier, qVar, startRestartGroup, (i7 & 112) | (i7 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        v3.q<? super SnackbarData, ? super Composer, ? super Integer, r2> qVar2 = qVar;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SnackbarHostKt$SnackbarHost$2(snackbarHostState, modifier2, qVar2, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z4, v3.a<r2> aVar, Composer composer, int i5, int i6) {
        boolean z5;
        float f5;
        composer.startReplaceableGroup(1431889134);
        if ((i6 & 4) != 0) {
            aVar = SnackbarHostKt$animatedOpacity$1.INSTANCE;
        }
        v3.a<r2> aVar2 = aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1431889134, i5, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:436)");
        }
        composer.startReplaceableGroup(1730440772);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            if (!z4) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            rememberedValue = AnimatableKt.Animatable$default(f5, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        Animatable animatable = (Animatable) rememberedValue;
        composer.endReplaceableGroup();
        Boolean valueOf = Boolean.valueOf(z4);
        composer.startReplaceableGroup(1730440850);
        boolean changedInstance = composer.changedInstance(animatable);
        boolean z6 = false;
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(z4)) || (i5 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean changedInstance2 = changedInstance | z5 | composer.changedInstance(animationSpec);
        if ((((i5 & 896) ^ 384) > 256 && composer.changed(aVar2)) || (i5 & 384) == 256) {
            z6 = true;
        }
        boolean z7 = changedInstance2 | z6;
        Object rememberedValue2 = composer.rememberedValue();
        if (z7 || rememberedValue2 == companion.getEmpty()) {
            Object snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, z4, animationSpec, aVar2, null);
            composer.updateRememberedValue(snackbarHostKt$animatedOpacity$2$1);
            rememberedValue2 = snackbarHostKt$animatedOpacity$2$1;
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue2, composer, (i5 >> 3) & 14);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z4, Composer composer, int i5) {
        boolean z5;
        float f5;
        composer.startReplaceableGroup(1966809761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1966809761, i5, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:449)");
        }
        composer.startReplaceableGroup(-92311588);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            if (!z4) {
                f5 = 1.0f;
            } else {
                f5 = 0.8f;
            }
            rememberedValue = AnimatableKt.Animatable$default(f5, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        Animatable animatable = (Animatable) rememberedValue;
        composer.endReplaceableGroup();
        Boolean valueOf = Boolean.valueOf(z4);
        composer.startReplaceableGroup(-92311508);
        boolean changedInstance = composer.changedInstance(animatable);
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(z4)) || (i5 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean changedInstance2 = changedInstance | z5 | composer.changedInstance(animationSpec);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnackbarHostKt$animatedScale$1$1(animatable, z4, animationSpec, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue2, composer, (i5 >> 3) & 14);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    public static final long toMillis(@p4.l SnackbarDuration snackbarDuration, boolean z4, @p4.m AccessibilityManager accessibilityManager) {
        long j5;
        int i5 = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    j5 = 4000;
                } else {
                    throw new kotlin.j0();
                }
            } else {
                j5 = 10000;
            }
        } else {
            j5 = Long.MAX_VALUE;
        }
        long j6 = j5;
        if (accessibilityManager == null) {
            return j6;
        }
        return accessibilityManager.calculateRecommendedTimeoutMillis(j6, true, true, z4);
    }
}
