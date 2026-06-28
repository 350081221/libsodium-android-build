package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.RecomposeScopeObserver;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001[B\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bY\u0010ZJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\"\u0010\u0019\u001a\u00020\u00052\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0016H\u0016J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\rJ\u0016\u0010\"\u001a\u00020\u001e2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010 J\u0006\u0010#\u001a\u00020\u0005J\u001c\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0005\u0018\u00010$2\u0006\u0010\u001a\u001a\u00020\u0017R\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00101R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\b\u00102\u0012\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010(R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R*\u0010;\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030:\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010A\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010D\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\u0011\u0010F\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bE\u0010>R\u0011\u0010H\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bG\u0010>R$\u0010K\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010>\"\u0004\bJ\u0010@R$\u0010N\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010>\"\u0004\bM\u0010@R$\u0010Q\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010>\"\u0004\bP\u0010@R$\u0010T\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010>\"\u0004\bS\u0010@R$\u0010W\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010>\"\u0004\bV\u0010@R\u0011\u0010X\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bX\u0010>¨\u0006\\"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/Composer;", "composer", "Lkotlin/r2;", "compose", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe$runtime_release", "(Landroidx/compose/runtime/tooling/RecomposeScopeObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe", "", b.f22420d, "Landroidx/compose/runtime/InvalidationResult;", "invalidateForResult", "release", "Landroidx/compose/runtime/RecomposeScopeOwner;", "owner", "adoptedBy", "invalidate", "Lkotlin/Function2;", "", "block", "updateScope", "token", "start", "scopeSkipped", "instance", "", "recordRead", "Landroidx/compose/runtime/collection/IdentityArraySet;", "instances", "isInvalidFor", "rereadTrackedInstances", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "end", "flags", "I", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/Anchor;", "anchor", "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "Lv3/p;", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "getObserver$annotations", "()V", "currentToken", "Landroidx/collection/MutableObjectIntMap;", "trackedInstances", "Landroidx/collection/MutableObjectIntMap;", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/DerivedState;", "trackedDependencies", "Landroidx/collection/MutableScatterMap;", "getRereading", "()Z", "setRereading", "(Z)V", "rereading", "getSkipped$runtime_release", "setSkipped", "skipped", "getValid", "valid", "getCanRecompose", "canRecompose", "getUsed", "setUsed", "used", "getDefaultsInScope", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "setDefaultsInvalid", "defaultsInvalid", "getRequiresRecompose", "setRequiresRecompose", "requiresRecompose", "getForcedRecompose", "setForcedRecompose", "forcedRecompose", "isConditional", "<init>", "(Landroidx/compose/runtime/RecomposeScopeOwner;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,444:1\n82#2:445\n1#3:446\n1726#4,3:447\n401#5,4:450\n373#5,6:454\n383#5,3:461\n386#5,2:465\n406#5,2:467\n389#5,6:469\n408#5:475\n449#5:476\n401#5,4:477\n373#5,6:481\n383#5,3:488\n386#5,2:492\n406#5:494\n450#5,2:495\n407#5:497\n389#5,6:498\n408#5:504\n452#5:505\n1810#6:460\n1672#6:464\n1810#6:487\n1672#6:491\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n197#1:445\n353#1:447,3\n371#1:450,4\n371#1:454,6\n371#1:461,3\n371#1:465,2\n371#1:467,2\n371#1:469,6\n371#1:475\n394#1:476\n394#1:477,4\n394#1:481,6\n394#1:488,3\n394#1:492,2\n394#1:494\n394#1:495,2\n394#1:497\n394#1:498,6\n394#1:504\n394#1:505\n371#1:460\n371#1:464\n394#1:487\n394#1:491\n*E\n"})
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {

    @m
    private Anchor anchor;

    @m
    private p<? super Composer, ? super Integer, r2> block;
    private int currentToken;
    private int flags;

    @m
    private RecomposeScopeObserver observer;

    @m
    private RecomposeScopeOwner owner;

    @m
    private MutableScatterMap<DerivedState<?>, Object> trackedDependencies;

    @m
    private MutableObjectIntMap<Object> trackedInstances;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "Landroidx/compose/runtime/SlotWriter;", "slots", "", "Landroidx/compose/runtime/Anchor;", "anchors", "Landroidx/compose/runtime/RecomposeScopeOwner;", "newOwner", "Lkotlin/r2;", "adoptAnchoredScopes$runtime_release", "(Landroidx/compose/runtime/SlotWriter;Ljava/util/List;Landroidx/compose/runtime/RecomposeScopeOwner;)V", "adoptAnchoredScopes", "Landroidx/compose/runtime/SlotTable;", "", "hasAnchoredRecomposeScopes$runtime_release", "(Landroidx/compose/runtime/SlotTable;Ljava/util/List;)Z", "hasAnchoredRecomposeScopes", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,444:1\n33#2,6:445\n93#2,2:451\n33#2,4:453\n95#2,2:457\n38#2:459\n97#2:460\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n429#1:445,6\n439#1:451,2\n439#1:453,4\n439#1:457,2\n439#1:459\n439#1:460\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public final void adoptAnchoredScopes$runtime_release(@l SlotWriter slotWriter, @l List<Anchor> list, @l RecomposeScopeOwner recomposeScopeOwner) {
            RecomposeScopeImpl recomposeScopeImpl;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object slot = slotWriter.slot(list.get(i5), 0);
                    if (slot instanceof RecomposeScopeImpl) {
                        recomposeScopeImpl = (RecomposeScopeImpl) slot;
                    } else {
                        recomposeScopeImpl = null;
                    }
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.adoptedBy(recomposeScopeOwner);
                    }
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(@l SlotTable slotTable, @l List<Anchor> list) {
            boolean z4;
            boolean z5;
            if (!list.isEmpty()) {
                int size = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        Anchor anchor = list.get(i5);
                        if (slotTable.ownsAnchor(anchor) && (slotTable.slot$runtime_release(slotTable.anchorIndex(anchor), 0) instanceof RecomposeScopeImpl)) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            z4 = true;
                            break;
                        }
                        i5++;
                    } else {
                        z4 = false;
                        break;
                    }
                }
                if (z4) {
                    return true;
                }
            }
            return false;
        }
    }

    public RecomposeScopeImpl(@m RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    @ExperimentalComposeRuntimeApi
    private static /* synthetic */ void getObserver$annotations() {
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setRereading(boolean z4) {
        if (z4) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void setSkipped(boolean z4) {
        if (z4) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void adoptedBy(@l RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final void compose(@l Composer composer) {
        r2 r2Var;
        p<? super Composer, ? super Integer, r2> pVar = this.block;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null && pVar != null) {
            recomposeScopeObserver.onBeginScopeComposition(this);
            try {
                pVar.invoke(composer, 1);
                return;
            } finally {
                recomposeScopeObserver.onEndScopeComposition(this);
            }
        }
        if (pVar != null) {
            pVar.invoke(composer, 1);
            r2Var = r2.f19517a;
        } else {
            r2Var = null;
        }
        if (r2Var != null) {
        } else {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    @m
    public final v3.l<Composition, r2> end(int i5) {
        boolean z4;
        boolean z5;
        MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        if (mutableObjectIntMap == null || getSkipped$runtime_release()) {
            return null;
        }
        Object[] objArr = mutableObjectIntMap.keys;
        int[] iArr = mutableObjectIntMap.values;
        long[] jArr = mutableObjectIntMap.metadata;
        int length = jArr.length - 2;
        boolean z6 = false;
        if (length >= 0) {
            int i6 = 0;
            loop0: while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (true) {
                        if (i8 < i7) {
                            if ((255 & j5) < 128) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr[i9];
                                if (iArr[i9] != i5) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    z6 = true;
                                    break loop0;
                                }
                            }
                            j5 >>= 8;
                            i8++;
                        } else if (i7 != 8) {
                            break;
                        }
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
        }
        if (!z6) {
            return null;
        }
        return new RecomposeScopeImpl$end$1$2(this, i5, mutableObjectIntMap);
    }

    @m
    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getForcedRecompose() {
        return (this.flags & 64) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final boolean getValid() {
        if (this.owner == null) {
            return false;
        }
        Anchor anchor = this.anchor;
        return anchor != null ? anchor.getValid() : false;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    @l
    public final InvalidationResult invalidateForResult(@m Object obj) {
        InvalidationResult invalidate;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        return (recomposeScopeOwner == null || (invalidate = recomposeScopeOwner.invalidate(this, obj)) == null) ? InvalidationResult.IGNORED : invalidate;
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:16:0x001c->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInvalidFor(@p4.m androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L4
            return r0
        L4:
            androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> r1 = r6.trackedDependencies
            if (r1 != 0) goto L9
            return r0
        L9:
            boolean r2 = r7.isNotEmpty()
            if (r2 == 0) goto L51
            boolean r2 = r7.isEmpty()
            r3 = 0
            if (r2 == 0) goto L18
        L16:
            r7 = r0
            goto L4e
        L18:
            java.util.Iterator r7 = r7.iterator()
        L1c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r7.next()
            boolean r4 = r2 instanceof androidx.compose.runtime.DerivedState
            if (r4 == 0) goto L4a
            androidx.compose.runtime.DerivedState r2 = (androidx.compose.runtime.DerivedState) r2
            androidx.compose.runtime.SnapshotMutationPolicy r4 = r2.getPolicy()
            if (r4 != 0) goto L36
            androidx.compose.runtime.SnapshotMutationPolicy r4 = androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy()
        L36:
            androidx.compose.runtime.DerivedState$Record r5 = r2.getCurrentRecord()
            java.lang.Object r5 = r5.getCurrentValue()
            java.lang.Object r2 = r1.get(r2)
            boolean r2 = r4.equivalent(r5, r2)
            if (r2 == 0) goto L4a
            r2 = r0
            goto L4b
        L4a:
            r2 = r3
        L4b:
            if (r2 != 0) goto L1c
            r7 = r3
        L4e:
            if (r7 == 0) goto L51
            return r3
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.isInvalidFor(androidx.compose.runtime.collection.IdentityArraySet):boolean");
    }

    @l
    @ExperimentalComposeRuntimeApi
    public final CompositionObserverHandle observe$runtime_release(@l final RecomposeScopeObserver recomposeScopeObserver) {
        Object obj;
        obj = RecomposeScopeImplKt.callbackLock;
        synchronized (obj) {
            this.observer = recomposeScopeObserver;
            r2 r2Var = r2.f19517a;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.RecomposeScopeImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj2;
                RecomposeScopeObserver recomposeScopeObserver2;
                obj2 = RecomposeScopeImplKt.callbackLock;
                RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
                RecomposeScopeObserver recomposeScopeObserver3 = recomposeScopeObserver;
                synchronized (obj2) {
                    recomposeScopeObserver2 = recomposeScopeImpl.observer;
                    if (l0.g(recomposeScopeObserver2, recomposeScopeObserver3)) {
                        recomposeScopeImpl.observer = null;
                    }
                    r2 r2Var2 = r2.f19517a;
                }
            }
        };
    }

    public final boolean recordRead(@l Object obj) {
        int i5 = 0;
        if (getRereading()) {
            return false;
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        w wVar = null;
        int i6 = 1;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
            this.trackedInstances = mutableObjectIntMap;
        }
        if (mutableObjectIntMap.put(obj, this.currentToken, -1) == this.currentToken) {
            return true;
        }
        if (obj instanceof DerivedState) {
            MutableScatterMap<DerivedState<?>, Object> mutableScatterMap = this.trackedDependencies;
            if (mutableScatterMap == null) {
                mutableScatterMap = new MutableScatterMap<>(i5, i6, wVar);
                this.trackedDependencies = mutableScatterMap;
            }
            mutableScatterMap.set(obj, ((DerivedState) obj).getCurrentRecord().getCurrentValue());
        }
        return false;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null) {
            recomposeScopeObserver.onScopeDisposed(this);
        }
    }

    public final void rereadTrackedInstances() {
        MutableObjectIntMap<Object> mutableObjectIntMap;
        boolean z4;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null && (mutableObjectIntMap = this.trackedInstances) != null) {
            setRereading(true);
            try {
                Object[] objArr = mutableObjectIntMap.keys;
                int[] iArr = mutableObjectIntMap.values;
                long[] jArr = mutableObjectIntMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j5) < 128) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj = objArr[i8];
                                    int i9 = iArr[i8];
                                    recomposeScopeOwner.recordReadOf(obj);
                                }
                                j5 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            } finally {
                setRereading(false);
            }
        }
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final void setAnchor(@m Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setDefaultsInScope(boolean z4) {
        if (z4) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z4) {
        if (z4) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void setForcedRecompose(boolean z4) {
        if (z4) {
            this.flags |= 64;
        } else {
            this.flags &= -65;
        }
    }

    public final void setRequiresRecompose(boolean z4) {
        if (z4) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void setUsed(boolean z4) {
        if (z4) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void start(int i5) {
        this.currentToken = i5;
        setSkipped(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(@l p<? super Composer, ? super Integer, r2> pVar) {
        this.block = pVar;
    }
}
