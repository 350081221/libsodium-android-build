package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import u3.h;
import w3.g;

@Stable
@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001QB\u0007¢\u0006\u0004\bP\u0010JJ;\u0010\n\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052#\u0010\t\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\f\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052#\u0010\t\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0004\b\f\u0010\u000bJ6\u0010\r\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00052\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u00020\u0006H\u0082\b¢\u0006\u0004\b\r\u0010\u000bJ5\u0010\u0010\u001a\u00020\u000f2*\u0010\t\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\u0006H\u0082\bJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001a\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J!\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010\"\u001a\u00020\u000f2\u0014\u0010!\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0019\u0010#\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010%\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b$\u0010\u0019J0\u0010*\u001a\u00020\u00172\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&\u0012\u0004\u0012\u00020\u00170\u0006H\u0080\b¢\u0006\u0004\b(\u0010)J0\u0010-\u001a\u00020\u00172\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+\u0012\u0004\u0012\u00020\u00170\u0006H\u0080\b¢\u0006\u0004\b,\u0010)J0\u0010/\u001a\u00020\u00172\u001e\u0010'\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+\u0012\u0004\u0012\u00020\u00170\u0006H\u0080\b¢\u0006\u0004\b.\u0010)R$\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R,\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R \u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020A8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR&\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078@X\u0080\u0004¢\u0006\f\u0012\u0004\bI\u0010J\u001a\u0004\bG\u0010HR&\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00148AX\u0080\u0004¢\u0006\f\u0012\u0004\bN\u0010J\u001a\u0004\bL\u0010M¨\u0006R"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "Landroidx/compose/runtime/snapshots/StateObject;", "", "R", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "Lkotlin/u;", "block", "withCurrent", "(Lv3/l;)Ljava/lang/Object;", "writable", "mutate", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Lkotlin/r2;", "update", "Landroidx/compose/runtime/snapshots/StateRecord;", t0.b.f22420d, "prependStateRecord", "", "toMap", DatabaseFileArchive.COLUMN_KEY, "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, "putAll", "remove", "removeValue$runtime_release", "removeValue", "", "predicate", "removeIf$runtime_release", "(Lv3/l;)Z", "removeIf", "", "any$runtime_release", "any", "all$runtime_release", "all", "<set-?>", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "", "entries", "Ljava/util/Set;", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "", "values", "Ljava/util/Collection;", "getValues", "()Ljava/util/Collection;", "", "getSize", "()I", "size", "getModification$runtime_release", "modification", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release$annotations", "()V", "readable", "getDebuggerDisplayValue", "()Ljava/util/Map;", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "<init>", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n154#1:361\n121#1:362\n155#1,2:364\n125#1:366\n157#1,3:373\n162#1:379\n128#1,5:380\n133#1:386\n121#1:387\n134#1,7:389\n125#1:396\n141#1,6:402\n149#1,3:411\n128#1,5:414\n133#1:420\n121#1:421\n134#1,7:423\n125#1:430\n141#1,6:436\n149#1,3:445\n128#1,5:448\n133#1:454\n121#1:455\n134#1,7:457\n125#1:464\n141#1,6:470\n149#1,3:479\n128#1,5:485\n133#1:491\n121#1:492\n134#1,7:494\n125#1:501\n141#1,6:507\n149#1,3:516\n121#1:519\n121#1:532\n125#1:534\n121#1:545\n125#1:547\n2283#2:363\n2176#2,2:367\n1714#2:369\n2178#2,2:371\n2180#2,3:376\n2283#2:388\n2176#2,2:397\n1714#2:399\n2178#2,2:400\n2180#2,3:408\n2283#2:422\n2176#2,2:431\n1714#2:433\n2178#2,2:434\n2180#2,3:442\n2283#2:456\n2176#2,2:465\n1714#2:467\n2178#2,2:468\n2180#2,3:476\n2283#2:493\n2176#2,2:502\n1714#2:504\n2178#2,2:505\n2180#2,3:513\n2283#2:520\n2283#2:521\n2176#2,2:522\n1714#2:524\n2178#2,5:526\n2283#2:533\n2176#2,2:535\n1714#2:537\n2178#2,2:539\n2180#2,3:542\n2283#2:546\n2176#2,2:548\n1714#2:550\n2178#2,2:552\n2180#2,3:555\n82#3:370\n82#3:385\n82#3:419\n82#3:453\n82#3:490\n82#3:525\n82#3:531\n82#3:538\n82#3:541\n82#3:551\n82#3:554\n288#4,2:482\n1#5:484\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n69#1:361\n69#1:362\n69#1:364,2\n69#1:366\n69#1:373,3\n69#1:379\n70#1:380,5\n70#1:386\n70#1:387\n70#1:389,7\n70#1:396\n70#1:402,6\n70#1:411,3\n71#1:414,5\n71#1:420\n71#1:421\n71#1:423,7\n71#1:430\n71#1:436,6\n71#1:445,3\n72#1:448,5\n72#1:454\n72#1:455\n72#1:457,7\n72#1:464\n72#1:470,6\n72#1:479,3\n85#1:485,5\n85#1:491\n85#1:492\n85#1:494,7\n85#1:501\n85#1:507,6\n85#1:516,3\n117#1:519\n133#1:532\n140#1:534\n154#1:545\n156#1:547\n69#1:363\n69#1:367,2\n69#1:369\n69#1:371,2\n69#1:376,3\n70#1:388\n70#1:397,2\n70#1:399\n70#1:400,2\n70#1:408,3\n71#1:422\n71#1:431,2\n71#1:433\n71#1:434,2\n71#1:442,3\n72#1:456\n72#1:465,2\n72#1:467\n72#1:468,2\n72#1:476,3\n85#1:493\n85#1:502,2\n85#1:504\n85#1:505,2\n85#1:513,3\n117#1:520\n121#1:521\n125#1:522,2\n125#1:524\n125#1:526,5\n133#1:533\n140#1:535,2\n140#1:537\n140#1:539,2\n140#1:542,3\n154#1:546\n156#1:548,2\n156#1:550\n156#1:552,2\n156#1:555,3\n69#1:370\n70#1:385\n71#1:419\n72#1:453\n85#1:490\n125#1:525\n132#1:531\n140#1:538\n141#1:541\n156#1:551\n157#1:554\n77#1:482,2\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, g {
    public static final int $stable = 0;

    @l
    private StateRecord firstStateRecord = new StateMapStateRecord(ExtensionsKt.persistentHashMapOf());

    @l
    private final Set<Map.Entry<K, V>> entries = new SnapshotMapEntrySet(this);

    @l
    private final Set<K> keys = new SnapshotMapKeySet(this);

    @l
    private final Collection<V> values = new SnapshotMapValueSet(this);

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001d\b\u0000\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", "V", "Landroidx/compose/runtime/snapshots/StateRecord;", t0.b.f22420d, "Lkotlin/r2;", "assign", "create", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "map", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setMap$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "", "modification", "I", "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,360:1\n82#2:361\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n174#1:361\n*E\n"})
    /* loaded from: classes.dex */
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        public static final int $stable = 8;

        @l
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(@l PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@l StateRecord stateRecord) {
            Object obj;
            l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                r2 r2Var = r2.f19517a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @l
        public StateRecord create() {
            return new StateMapStateRecord(this.map);
        }

        @l
        public final PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setMap$runtime_release(@l PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        public final void setModification$runtime_release(int i5) {
            this.modification = i5;
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(v3.l<? super Map<K, V>, ? extends R> lVar) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        R invoke;
        Snapshot current;
        Object obj2;
        boolean z4;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    r2 r2Var = r2.f19517a;
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            l0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            invoke = lVar.invoke(builder);
            PersistentMap<K, V> build = builder.build();
            if (l0.g(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj2 = SnapshotStateMapKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateMapStateRecord3.setMap$runtime_release(build);
                                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            kotlin.jvm.internal.i0.d(1);
                        } finally {
                        }
                    }
                    kotlin.jvm.internal.i0.c(1);
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return invoke;
    }

    private final void update(v3.l<? super PersistentMap<K, ? extends V>, ? extends PersistentMap<K, ? extends V>> lVar) {
        Snapshot current;
        Object obj;
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        PersistentMap<K, ? extends V> invoke = lVar.invoke(stateMapStateRecord.getMap$runtime_release());
        if (invoke != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj = SnapshotStateMapKt.sync;
                    synchronized (obj) {
                        try {
                            stateMapStateRecord3.setMap$runtime_release(invoke);
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                            kotlin.jvm.internal.i0.d(1);
                        } catch (Throwable th) {
                            kotlin.jvm.internal.i0.d(1);
                            kotlin.jvm.internal.i0.c(1);
                            throw th;
                        }
                    }
                    kotlin.jvm.internal.i0.c(1);
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            SnapshotKt.notifyWrite(current, this);
        }
    }

    private final <R> R withCurrent(v3.l<? super StateMapStateRecord<K, V>, ? extends R> lVar) {
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return lVar.invoke(SnapshotKt.current((StateMapStateRecord) firstStateRecord));
    }

    private final <R> R writable(v3.l<? super StateMapStateRecord<K, V>, ? extends R> lVar) {
        Snapshot current;
        R invoke;
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) firstStateRecord;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = lVar.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        SnapshotKt.notifyWrite(current, this);
        return invoke;
    }

    public final boolean all$runtime_release(@l v3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (!lVar.invoke((Map.Entry) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(@l v3.l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (lVar.invoke((Map.Entry) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        Object obj;
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap$runtime_release();
        PersistentMap<K, V> persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentHashMapOf != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                obj = SnapshotStateMapKt.sync;
                synchronized (obj) {
                    stateMapStateRecord3.setMap$runtime_release(persistentHashMapOf);
                    stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                }
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    @m
    public V get(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().get(obj);
    }

    @l
    @h(name = "getDebuggerDisplayValue")
    public final Map<K, V> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime_release();
    }

    @l
    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @l
    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification$runtime_release();
    }

    @l
    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    @l
    public Collection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@l StateRecord stateRecord) {
        l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (StateMapStateRecord) stateRecord;
    }

    @Override // java.util.Map
    @m
    public V put(K k5, V v4) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        V put;
        Snapshot current;
        Object obj2;
        boolean z4;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            put = builder.put(k5, v4);
            PersistentMap<K, V> build = builder.build();
            if (l0.g(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                obj2 = SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z4 = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return put;
    }

    @Override // java.util.Map
    public void putAll(@l Map<? extends K, ? extends V> map) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z4;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            builder.putAll(map);
            PersistentMap<K, V> build = builder.build();
            if (!l0.g(build, map$runtime_release)) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj2 = SnapshotStateMapKt.sync;
                    synchronized (obj2) {
                        if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateMapStateRecord3.setMap$runtime_release(build);
                            z4 = true;
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                        } else {
                            z4 = false;
                        }
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            } else {
                return;
            }
        } while (!z4);
    }

    @Override // java.util.Map
    @m
    public V remove(Object obj) {
        Object obj2;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        V remove;
        Snapshot current;
        Object obj3;
        boolean z4;
        do {
            obj2 = SnapshotStateMapKt.sync;
            synchronized (obj2) {
                StateRecord firstStateRecord = getFirstStateRecord();
                l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                r2 r2Var = r2.f19517a;
            }
            l0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            remove = builder.remove(obj);
            PersistentMap<K, V> build = builder.build();
            if (l0.g(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                obj3 = SnapshotStateMapKt.sync;
                synchronized (obj3) {
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z4 = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z4 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return remove;
    }

    public final boolean removeIf$runtime_release(@l v3.l<? super Map.Entry<K, V>, Boolean> lVar) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z4;
        boolean z5 = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    l0.n(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    r2 r2Var = r2.f19517a;
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            l0.m(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (lVar.invoke(entry).booleanValue()) {
                    builder.remove(entry.getKey());
                    z5 = true;
                }
            }
            r2 r2Var2 = r2.f19517a;
            PersistentMap<K, V> build = builder.build();
            if (l0.g(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            l0.n(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj2 = SnapshotStateMapKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateMapStateRecord3.setMap$runtime_release(build);
                                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            kotlin.jvm.internal.i0.d(1);
                        } finally {
                        }
                    }
                    kotlin.jvm.internal.i0.c(1);
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th2) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th2;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z4);
        return z5;
    }

    public final boolean removeValue$runtime_release(V v4) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (l0.g(((Map.Entry) obj).getValue(), v4)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @l
    public final Map<K, V> toMap() {
        return getReadable$runtime_release().getMap$runtime_release();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
