package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import p4.p;
import t0.b;

@i0(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001a\u0010\n\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b\u001a\u001a\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b\u001a\u001c\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\bH\u0007\u001a$\u0010\n\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u001a$\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u001aK\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011\"\b\b\u0001\u0010\u0013*\u00020\u0011*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00150\u00142\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010 \u001a\u00020\u0017\"\u0004\b\u0000\u0010\u001a*\u0012\u0012\u0004\u0012\u00028\u00000\u001bj\b\u0012\u0004\u0012\u00028\u0000`\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082\b\"\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\" \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u001e\u0010\u0010\u001a\u00020\u000f*\u00020\r8GX\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"T", "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/CompositionServiceKey;", DatabaseFileArchive.COLUMN_KEY, "getCompositionService", "(Landroidx/compose/runtime/Composition;Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parent", "Composition", "Landroidx/compose/runtime/ReusableComposition;", "ReusableComposition", "Landroidx/compose/runtime/ControlledComposition;", "ControlledComposition", "Lkotlin/coroutines/g;", "recomposeCoroutineContext", "", "K", "V", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", b.f22420d, "Lkotlin/r2;", "addValue", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Ljava/lang/Object;Ljava/lang/Object;)V", "E", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Lkotlin/Function1;", "", "predicate", "removeValueIf", "PendingApplyNoModifications", "Ljava/lang/Object;", "Landroidx/compose/runtime/CompositionImpl;", "CompositionImplServiceKey", "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionImplServiceKey", "()Landroidx/compose/runtime/CompositionServiceKey;", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/g;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1381:1\n1#2:1382\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionKt {

    @l
    private static final Object PendingApplyNoModifications = new Object();

    @l
    private static final CompositionServiceKey<CompositionImpl> CompositionImplServiceKey = new CompositionServiceKey<CompositionImpl>() { // from class: androidx.compose.runtime.CompositionKt$CompositionImplServiceKey$1
    };

    @l
    public static final Composition Composition(@l Applier<?> applier, @l CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @l
    @p
    public static final ControlledComposition ControlledComposition(@l Applier<?> applier, @l CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @l
    public static final ReusableComposition ReusableComposition(@l Applier<?> applier, @l CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> void addValue(IdentityArrayMap<K, IdentityArraySet<V>> identityArrayMap, K k5, V v4) {
        if (identityArrayMap.contains(k5)) {
            IdentityArraySet<V> identityArraySet = identityArrayMap.get(k5);
            if (identityArraySet != null) {
                identityArraySet.add(v4);
                return;
            }
            return;
        }
        IdentityArraySet<V> identityArraySet2 = new IdentityArraySet<>();
        identityArraySet2.add(v4);
        r2 r2Var = r2.f19517a;
        identityArrayMap.set(k5, identityArraySet2);
    }

    @l
    public static final CompositionServiceKey<CompositionImpl> getCompositionImplServiceKey() {
        return CompositionImplServiceKey;
    }

    @m
    public static final <T> T getCompositionService(@l Composition composition, @l CompositionServiceKey<T> compositionServiceKey) {
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    @l
    @ExperimentalComposeApi
    public static final g getRecomposeCoroutineContext(@l ControlledComposition controlledComposition) {
        g recomposeContext;
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? i.INSTANCE : recomposeContext;
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }

    private static final <E> void removeValueIf(HashSet<E> hashSet, v3.l<? super E, Boolean> lVar) {
        Iterator<E> it = hashSet.iterator();
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue()) {
                it.remove();
            }
        }
    }

    @l
    @ExperimentalComposeApi
    public static final Composition Composition(@l Applier<?> applier, @l CompositionContext compositionContext, @l g gVar) {
        return new CompositionImpl(compositionContext, applier, gVar);
    }

    @l
    @p
    @ExperimentalComposeApi
    public static final ControlledComposition ControlledComposition(@l Applier<?> applier, @l CompositionContext compositionContext, @l g gVar) {
        return new CompositionImpl(compositionContext, applier, gVar);
    }
}
