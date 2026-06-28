package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import kotlin.r2;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\t\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\r\u001a<\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\u000f\u001aF\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\u0011\u001a@\u0010\t\u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0012\"\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\u0014\u001a8\u0010\u0019\u001a\u00020\u00012'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aB\u0010\u0019\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001b\u001aL\u0010\u0019\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001c\u001aV\u0010\u0019\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001d\u001aP\u0010\u0019\u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0012\"\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u0018\u0010#\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001\u001a%\u0010&\u001a\u00020\u00162\u0013\b\u0006\u0010%\u001a\r\u0012\u0004\u0012\u00020\u001f0\u0000¢\u0006\u0002\b$H\u0087\b¢\u0006\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,¨\u0006."}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "effect", "SideEffect", "(Lv3/a;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/u;", "DisposableEffect", "(Lv3/l;Landroidx/compose/runtime/Composer;I)V", "", "key1", "(Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V", "", "keys", "([Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/d;", "block", "LaunchedEffect", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/coroutines/g;", "coroutineContext", "Landroidx/compose/runtime/Composer;", "composer", "createCompositionCoroutineScope", "Landroidx/compose/runtime/DisallowComposableCalls;", "getContext", "rememberCoroutineScope", "(Lv3/a;Landroidx/compose/runtime/Composer;II)Lkotlinx/coroutines/s0;", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "", "DisposableEffectNoParamError", "Ljava/lang/String;", "LaunchedEffectNoParamError", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,497:1\n36#2:498\n50#2:505\n49#2:506\n67#2,3:513\n66#2:516\n83#2,3:523\n36#2:532\n50#2:539\n49#2:540\n67#2,3:547\n66#2:550\n83#2,3:557\n25#2:566\n1116#3,6:499\n1116#3,6:507\n1116#3,6:517\n1116#3,6:526\n1116#3,6:533\n1116#3,6:541\n1116#3,6:551\n1116#3,6:560\n1116#3,6:567\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n157#1:498\n197#1:505\n197#1:506\n238#1:513,3\n238#1:516\n278#1:523,3\n340#1:532\n363#1:539\n363#1:540\n387#1:547,3\n387#1:550\n420#1:557,3\n490#1:566\n157#1:499,6\n197#1:507,6\n238#1:517,6\n278#1:526,6\n340#1:533,6\n363#1:541,6\n387#1:551,6\n420#1:560,6\n490#1:567,6\n*E\n"})
/* loaded from: classes.dex */
public final class EffectsKt {

    @l
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    @l
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();

    @l
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Composable
    @k(level = m.ERROR, message = DisposableEffectNoParamError)
    public static final void DisposableEffect(@l v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-904483903);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i5, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:119)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError.toString());
    }

    @Composable
    @k(level = m.ERROR, message = LaunchedEffectNoParamError)
    public static final void LaunchedEffect(@l p<? super s0, ? super d<? super r2>, ? extends Object> pVar, @p4.m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-805415771);
        if ((i5 & 1) != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i5, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:318)");
            }
            throw new IllegalStateException(LaunchedEffectNoParamError.toString());
        }
        startRestartGroup.skipToGroupEnd();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new EffectsKt$LaunchedEffect$1(pVar, i5));
        }
    }

    @Composable
    public static final void SideEffect(@l v3.a<r2> aVar, @p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i5, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        composer.recordSideEffect(aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @l
    @a1
    public static final s0 createCompositionCoroutineScope(@l g gVar, @l Composer composer) {
        l2.b bVar = l2.U;
        if (gVar.get(bVar) != null) {
            b0 c5 = p2.c(null, 1, null);
            c5.c(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return t0.a(c5);
        }
        g applyCoroutineContext = composer.getApplyCoroutineContext();
        return t0.a(applyCoroutineContext.plus(p2.a((l2) applyCoroutineContext.get(bVar))).plus(gVar));
    }

    @l
    @Composable
    public static final s0 rememberCoroutineScope(@p4.m v3.a<? extends g> aVar, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(773894976);
        if ((i6 & 1) != 0) {
            aVar = EffectsKt$rememberCoroutineScope$1.INSTANCE;
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new CompositionScopedCoroutineScopeCanceller(createCompositionCoroutineScope(aVar.invoke(), composer));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        return coroutineScope;
    }

    @Composable
    public static final void DisposableEffect(@p4.m Object obj, @l v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1371986847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i5, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@p4.m Object obj, @l p<? super s0, ? super d<? super r2>, ? extends Object> pVar, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1179185413);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i5, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        g applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@p4.m Object obj, @p4.m Object obj2, @l v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1429097729);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i5, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@p4.m Object obj, @p4.m Object obj2, @l p<? super s0, ? super d<? super r2>, ? extends Object> pVar, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(590241125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i5, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        g applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@p4.m Object obj, @p4.m Object obj2, @p4.m Object obj3, @l v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1239538271);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i5, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@p4.m Object obj, @p4.m Object obj2, @p4.m Object obj3, @l p<? super s0, ? super d<? super r2>, ? extends Object> pVar, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-54093371);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i5, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        g applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@l Object[] objArr, @l v3.l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1307627122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i5, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (Object obj : copyOf) {
            z4 |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@l Object[] objArr, @l p<? super s0, ? super d<? super r2>, ? extends Object> pVar, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-139560008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i5, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:417)");
        }
        g applyCoroutineContext = composer.getApplyCoroutineContext();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (Object obj : copyOf) {
            z4 |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
