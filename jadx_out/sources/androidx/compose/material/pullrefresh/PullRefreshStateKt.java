package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.alipay.sdk.m.x.d;
import kotlin.coroutines.i;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a<\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"", "refreshing", "Lkotlin/Function0;", "Lkotlin/r2;", d.f3024p, "Landroidx/compose/ui/unit/Dp;", "refreshThreshold", "refreshingOffset", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "rememberPullRefreshState-UuyPYSY", "(ZLv3/a;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/pullrefresh/PullRefreshState;", "rememberPullRefreshState", "", "DragMultiplier", "F", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,234:1\n154#2:235\n1#3:236\n487#4,4:237\n491#4,2:245\n495#4:251\n25#5:241\n36#5:253\n1116#6,3:242\n1119#6,3:248\n1116#6,6:254\n487#7:247\n74#8:252\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n*L\n63#1:235\n65#1:237,4\n65#1:245,2\n65#1:251\n65#1:241\n75#1:253\n65#1:242,3\n65#1:248,3\n75#1:254,6\n65#1:247\n70#1:252\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshStateKt {
    private static final float DragMultiplier = 0.5f;

    @l
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: rememberPullRefreshState-UuyPYSY, reason: not valid java name */
    public static final PullRefreshState m1532rememberPullRefreshStateUuyPYSY(boolean z4, @l a<r2> aVar, float f5, float f6, @m Composer composer, int i5, int i6) {
        boolean z5;
        composer.startReplaceableGroup(-174977512);
        if ((i6 & 4) != 0) {
            f5 = PullRefreshDefaults.INSTANCE.m1525getRefreshThresholdD9Ej5fM();
        }
        if ((i6 & 8) != 0) {
            f6 = PullRefreshDefaults.INSTANCE.m1526getRefreshingOffsetD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-174977512, i5, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        if (Dp.m6043compareTo0680j_4(f5, Dp.m6044constructorimpl(0)) > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(i.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composer, (i5 >> 3) & 14);
            k1.e eVar = new k1.e();
            k1.e eVar2 = new k1.e();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            eVar.element = density.mo304toPx0680j_4(f5);
            eVar2.element = density.mo304toPx0680j_4(f6);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(coroutineScope);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new PullRefreshState(coroutineScope, rememberUpdatedState, eVar2.element, eVar.element);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            PullRefreshState pullRefreshState = (PullRefreshState) rememberedValue2;
            EffectsKt.SideEffect(new PullRefreshStateKt$rememberPullRefreshState$3(pullRefreshState, z4, eVar, eVar2), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return pullRefreshState;
        }
        throw new IllegalArgumentException("The refresh trigger must be greater than zero!".toString());
    }
}
