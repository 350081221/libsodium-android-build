package androidx.compose.material3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a9\u0010\u000b\u001a\u00020\u0007*\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/State;", "", "touchExplorationState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/lifecycle/Lifecycle;", "Lkotlin/Function1;", "Landroidx/lifecycle/Lifecycle$Event;", "Lkotlin/r2;", "handleEvent", "Lkotlin/Function0;", "onDispose", "ObserveState", "(Landroidx/lifecycle/Lifecycle;Lv3/l;Lv3/a;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n74#2:109\n74#2:122\n1116#3,6:110\n1116#3,6:116\n1116#3,6:123\n1116#3,6:129\n1116#3,6:135\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt\n*L\n41#1:109\n48#1:122\n42#1:110,6\n46#1:116,6\n49#1:123,6\n54#1:129,6\n67#1:135,6\n*E\n"})
/* loaded from: classes.dex */
public final class TouchExplorationStateProvider_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ObserveState(Lifecycle lifecycle, v3.l<? super Lifecycle.Event, r2> lVar, v3.a<r2> aVar, Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        Composer startRestartGroup = composer.startRestartGroup(-1703772404);
        if ((Integer.MIN_VALUE & i6) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (startRestartGroup.changedInstance(lifecycle)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        int i11 = i6 & 1;
        if (i11 != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        int i12 = i6 & 2;
        if (i12 != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
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
                lVar = TouchExplorationStateProvider_androidKt$ObserveState$1.INSTANCE;
            }
            if (i12 != 0) {
                aVar = TouchExplorationStateProvider_androidKt$ObserveState$2.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1703772404, i7, -1, "androidx.compose.material3.ObserveState (TouchExplorationStateProvider.android.kt:65)");
            }
            startRestartGroup.startReplaceableGroup(-1018043936);
            boolean z5 = false;
            if ((i7 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean changedInstance = z4 | startRestartGroup.changedInstance(lifecycle);
            if ((i7 & 896) == 256) {
                z5 = true;
            }
            boolean z6 = changedInstance | z5;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TouchExplorationStateProvider_androidKt$ObserveState$3$1(lifecycle, lVar, aVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycle, (v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, startRestartGroup, i7 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        v3.l<? super Lifecycle.Event, r2> lVar2 = lVar;
        v3.a<r2> aVar2 = aVar;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TouchExplorationStateProvider_androidKt$ObserveState$4(lifecycle, lVar2, aVar2, i5, i6));
        }
    }

    @p4.l
    @Composable
    public static final State<Boolean> touchExplorationState(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-906157724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-906157724, i5, -1, "androidx.compose.material3.touchExplorationState (TouchExplorationStateProvider.android.kt:39)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-1014858715);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object systemService = context.getSystemService("accessibility");
            kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            rememberedValue = (AccessibilityManager) systemService;
            composer.updateRememberedValue(rememberedValue);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1014858590);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new Listener();
            composer.updateRememberedValue(rememberedValue2);
        }
        Listener listener = (Listener) rememberedValue2;
        composer.endReplaceableGroup();
        Lifecycle lifecycle = ((LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        composer.startReplaceableGroup(-1014858487);
        boolean changedInstance = composer.changedInstance(accessibilityManager);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new TouchExplorationStateProvider_androidKt$touchExplorationState$1$1(listener, accessibilityManager);
            composer.updateRememberedValue(rememberedValue3);
        }
        v3.l lVar = (v3.l) rememberedValue3;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1014858321);
        boolean changedInstance2 = composer.changedInstance(accessibilityManager);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new TouchExplorationStateProvider_androidKt$touchExplorationState$2$1(listener, accessibilityManager);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        ObserveState(lifecycle, lVar, (v3.a) rememberedValue4, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return listener;
    }
}
