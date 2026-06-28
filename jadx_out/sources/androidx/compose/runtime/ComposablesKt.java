package androidx.compose.runtime;

import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.m;
import u3.h;
import v3.l;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\b\u001a?\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\n\u001aI\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\f\u001aC\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u000f\u001aA\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0016\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0013\b\u0004\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a^\u0010#\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!H\u0087\b¢\u0006\u0004\b#\u0010$\u001a^\u0010%\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!H\u0087\b¢\u0006\u0004\b%\u0010$\u001am\u0010#\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b#\u0010&\u001am\u0010%\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b%\u0010&\u001a\u0093\u0001\u0010#\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2$\b\b\u0010(\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0010¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b#\u0010)\u001a\u0093\u0001\u0010%\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\"\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002¢\u0006\u0002\b!2$\b\b\u0010(\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0010¢\u0006\u0002\b!2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\b¢\u0006\u0004\b%\u0010)\u001a\b\u0010*\u001a\u00020\u0014H\u0001\u001a\u000f\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-\"\u0011\u00101\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0011\u00105\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0017\u0010;\u001a\u0002068G¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108\"\u0011\u0010?\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"T", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "calculation", "remember", "(Lv3/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "key1", "(Ljava/lang/Object;Lv3/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lv3/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv3/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "keys", "([Ljava/lang/Object;Lv3/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Landroidx/compose/runtime/Composable;", "block", DatabaseFileArchive.COLUMN_KEY, "([Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Lkotlin/r2;", "content", "ReusableContent", "(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "", "active", "ReusableContentHost", "(ZLv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Applier;", "E", "factory", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Lkotlin/u;", "update", "ComposeNode", "(Lv3/a;Lv3/l;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "(Lv3/a;Lv3/l;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/SkippableUpdater;", "skippableUpdate", "(Lv3/a;Lv3/l;Lv3/q;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "Landroidx/compose/runtime/CompositionContext;", "rememberCompositionContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentComposer", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "currentRecomposeScope", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "()V", "currentCompositionLocalContext", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n1116#2,6:485\n1116#2,6:491\n1116#2,6:497\n1116#2,6:503\n1116#2,6:509\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:485,6\n36#1:491,6\n49#1:497,6\n66#1:503,6\n85#1:509,6\n*E\n"})
/* loaded from: classes.dex */
public final class ComposablesKt {
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(v3.a<? extends T> aVar, l<? super Updater<T>, r2> lVar, Composer composer, int i5) {
        composer.startReplaceableGroup(1886828752);
        Applier<?> applier = composer.getApplier();
        l0.y(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(new ComposablesKt$ComposeNode$1(aVar));
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m3263boximpl(Updater.m3264constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(v3.a<? extends T> aVar, l<? super Updater<T>, r2> lVar, Composer composer, int i5) {
        composer.startReplaceableGroup(1405779621);
        Applier<?> applier = composer.getApplier();
        l0.y(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new ComposablesKt$ReusableComposeNode$1(aVar));
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m3263boximpl(Updater.m3264constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void ReusableContent(@m Object obj, @p4.l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(444418301);
        composer.startReusableGroup(207, obj);
        pVar.invoke(composer, Integer.valueOf((i5 >> 3) & 14));
        composer.endReusableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z4, @p4.l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        composer.startReusableGroup(207, Boolean.valueOf(z4));
        boolean changed = composer.changed(z4);
        if (z4) {
            pVar.invoke(composer, Integer.valueOf((i5 >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(changed);
        }
        composer.endReusableGroup();
    }

    @h(name = "getCurrentComposer")
    @p4.l
    @Composable
    @ReadOnlyComposable
    public static final Composer getCurrentComposer(@m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i5, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:183)");
        }
        throw new k0("Implemented as an intrinsic");
    }

    @h(name = "getCurrentCompositeKeyHash")
    @Composable
    public static final int getCurrentCompositeKeyHash(@m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i5, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    @p4.l
    @h(name = "getCurrentCompositionLocalContext")
    @Composable
    public static final CompositionLocalContext getCurrentCompositionLocalContext(@m Composer composer, int i5) {
        composer.startReplaceableGroup(-43352356);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i5, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:207)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return compositionLocalContext;
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @h(name = "getCurrentRecomposeScope")
    @p4.l
    @Composable
    @ReadOnlyComposable
    public static final RecomposeScope getCurrentRecomposeScope(@m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i5, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope != null) {
            composer.recordUsed(recomposeScope);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return recomposeScope;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    @a1
    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> T key(@p4.l Object[] objArr, @p4.l p<? super Composer, ? super Integer, ? extends T> pVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-11941951);
        T invoke = pVar.invoke(composer, Integer.valueOf((i5 >> 3) & 14));
        composer.endReplaceableGroup();
        return invoke;
    }

    @Composable
    public static final <T> T remember(@m Object obj, @p4.l v3.a<? extends T> aVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        T t5 = (T) composer.rememberedValue();
        if (changed || t5 == Composer.Companion.getEmpty()) {
            t5 = aVar.invoke();
            composer.updateRememberedValue(t5);
        }
        composer.endReplaceableGroup();
        return t5;
    }

    @p4.l
    @Composable
    public static final CompositionContext rememberCompositionContext(@m Composer composer, int i5) {
        composer.startReplaceableGroup(-1165786124);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i5, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        CompositionContext buildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buildContext;
    }

    @Composable
    public static final <T> T remember(@m Object obj, @m Object obj2, @p4.l v3.a<? extends T> aVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        T t5 = (T) composer.rememberedValue();
        if (changed || t5 == Composer.Companion.getEmpty()) {
            t5 = aVar.invoke();
            composer.updateRememberedValue(t5);
        }
        composer.endReplaceableGroup();
        return t5;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(v3.a<? extends T> aVar, l<? super Updater<T>, r2> lVar, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        composer.startReplaceableGroup(-548224868);
        Applier<?> applier = composer.getApplier();
        l0.y(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m3263boximpl(Updater.m3264constructorimpl(composer)));
        pVar.invoke(composer, Integer.valueOf((i5 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(v3.a<? extends T> aVar, l<? super Updater<T>, r2> lVar, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        composer.startReplaceableGroup(-692256719);
        Applier<?> applier = composer.getApplier();
        l0.y(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m3263boximpl(Updater.m3264constructorimpl(composer)));
        pVar.invoke(composer, Integer.valueOf((i5 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final <T> T remember(@m Object obj, @m Object obj2, @m Object obj3, @p4.l v3.a<? extends T> aVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T t5 = (T) composer.rememberedValue();
        if (changed || t5 == Composer.Companion.getEmpty()) {
            t5 = aVar.invoke();
            composer.updateRememberedValue(t5);
        }
        composer.endReplaceableGroup();
        return t5;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(v3.a<? extends T> aVar, l<? super Updater<T>, r2> lVar, q<? super SkippableUpdater<T>, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        Applier<?> applier = composer.getApplier();
        l0.y(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m3263boximpl(Updater.m3264constructorimpl(composer)));
        qVar.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, Integer.valueOf((i5 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(composer, Integer.valueOf((i5 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(v3.a<? extends T> aVar, l<? super Updater<T>, r2> lVar, q<? super SkippableUpdater<T>, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5) {
        Applier<?> applier = composer.getApplier();
        l0.y(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m3263boximpl(Updater.m3264constructorimpl(composer)));
        qVar.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, Integer.valueOf((i5 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(composer, Integer.valueOf((i5 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final <T> T remember(@p4.l Object[] objArr, @p4.l v3.a<? extends T> aVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (Object obj : objArr) {
            z4 |= composer.changed(obj);
        }
        T t5 = (T) composer.rememberedValue();
        if (z4 || t5 == Composer.Companion.getEmpty()) {
            t5 = aVar.invoke();
            composer.updateRememberedValue(t5);
        }
        composer.endReplaceableGroup();
        return t5;
    }

    @Composable
    public static final <T> T remember(@p4.l v3.a<? extends T> aVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-492369756);
        T t5 = (T) composer.rememberedValue();
        if (t5 == Composer.Companion.getEmpty()) {
            t5 = aVar.invoke();
            composer.updateRememberedValue(t5);
        }
        composer.endReplaceableGroup();
        return t5;
    }
}
