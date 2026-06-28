package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import u3.h;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001+B%\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016¢\u0006\u0004\b)\u0010*J:\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0019\u0010(\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010!¨\u0006,"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/DerivedState;", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "readable", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "forceDependencyReads", "Lkotlin/Function0;", "calculation", "currentRecord", "", "displayValue", "Landroidx/compose/runtime/snapshots/StateRecord;", "current", b.f22420d, "Lkotlin/r2;", "prependStateRecord", "toString", "Lv3/a;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", bi.bt, "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "first", "Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "Landroidx/compose/runtime/DerivedState$Record;", "getCurrentRecord", "()Landroidx/compose/runtime/DerivedState$Record;", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "()V", "debuggerDisplayValue", "<init>", "(Lv3/a;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 7 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,396:1\n368#2,2:397\n370#2,2:410\n75#2,4:412\n373#2,2:442\n75#2,4:444\n368#2,2:448\n370#2,5:461\n460#3,11:399\n460#3,11:450\n401#4,4:416\n373#4,6:420\n383#4,3:427\n386#4,2:431\n406#4,2:433\n389#4,6:435\n408#4:441\n1810#5:426\n1672#5:430\n1714#6:466\n2283#6:468\n2283#6:469\n2283#6:470\n2283#6:471\n2283#6:472\n82#7:467\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n179#1:397,2\n179#1:410,2\n181#1:412,4\n179#1:442,2\n195#1:444,4\n197#1:448,2\n197#1:461,5\n179#1:399,11\n197#1:450,11\n183#1:416,4\n183#1:420,6\n183#1:427,3\n183#1:431,2\n183#1:433,2\n183#1:435,6\n183#1:441\n183#1:426\n183#1:430\n220#1:466\n266#1:468\n273#1:469\n278#1:470\n289#1:471\n297#1:472\n220#1:467\n*E\n"})
/* loaded from: classes.dex */
public final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {

    @l
    private final v3.a<T> calculation;

    @l
    private ResultRecord<T> first = new ResultRecord<>();

    @m
    private final SnapshotMutationPolicy<T> policy;

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 /*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nR\"\u0010\u0010\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0011\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u0014\u0010,\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%¨\u00060"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", b.f22420d, "Lkotlin/r2;", "assign", "create", "Landroidx/compose/runtime/DerivedState;", "derivedState", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "isValid", "", "readableHash", "validSnapshotId", "I", "getValidSnapshotId", "()I", "setValidSnapshotId", "(I)V", "validSnapshotWriteCount", "getValidSnapshotWriteCount", "setValidSnapshotWriteCount", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "dependencies", "Landroidx/collection/ObjectIntMap;", "getDependencies", "()Landroidx/collection/ObjectIntMap;", "setDependencies", "(Landroidx/collection/ObjectIntMap;)V", "", "result", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "resultHash", "getResultHash", "setResultHash", "getCurrentValue", "currentValue", "<init>", "()V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,396:1\n1714#2:397\n1714#2:399\n1714#2:401\n82#3:398\n82#3:400\n82#3:402\n368#4,2:403\n370#4,2:416\n373#4,2:444\n460#5,11:405\n401#6,4:418\n373#6,6:422\n383#6,3:429\n386#6,2:433\n406#6,2:435\n389#6,6:437\n408#6:443\n1810#7:428\n1672#7:432\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n110#1:397\n117#1:399\n128#1:401\n110#1:398\n117#1:400\n128#1:402\n130#1:403,2\n130#1:416,2\n130#1:444,2\n130#1:405,11\n131#1:418,4\n131#1:422,6\n131#1:429,3\n131#1:433,2\n131#1:435,2\n131#1:437,6\n131#1:443\n131#1:428\n131#1:432\n*E\n"})
    /* loaded from: classes.dex */
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {

        @l
        private ObjectIntMap<StateObject> dependencies = ObjectIntMapKt.emptyObjectIntMap();

        @m
        private Object result = Unset;
        private int resultHash;
        private int validSnapshotId;
        private int validSnapshotWriteCount;

        @l
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        @l
        private static final Object Unset = new Object();

        @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "()V", "Unset", "getUnset", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            @l
            public final Object getUnset() {
                return ResultRecord.Unset;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@l StateRecord stateRecord) {
            l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @l
        public StateRecord create() {
            return new ResultRecord();
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.result;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        @l
        public ObjectIntMap<StateObject> getDependencies() {
            return this.dependencies;
        }

        @m
        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final int getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final boolean isValid(@l DerivedState<?> derivedState, @l Snapshot snapshot) {
            boolean z4;
            boolean z5;
            synchronized (SnapshotKt.getLock()) {
                z4 = false;
                if (this.validSnapshotId == snapshot.getId()) {
                    if (this.validSnapshotWriteCount == snapshot.getWriteCount$runtime_release()) {
                        z5 = false;
                    }
                }
                z5 = true;
            }
            if (this.result != Unset && (!z5 || this.resultHash == readableHash(derivedState, snapshot))) {
                z4 = true;
            }
            if (z4 && z5) {
                synchronized (SnapshotKt.getLock()) {
                    this.validSnapshotId = snapshot.getId();
                    this.validSnapshotWriteCount = snapshot.getWriteCount$runtime_release();
                    r2 r2Var = r2.f19517a;
                }
            }
            return z4;
        }

        public final int readableHash(@l DerivedState<?> derivedState, @l Snapshot snapshot) {
            ObjectIntMap<StateObject> dependencies;
            int i5;
            boolean z4;
            int i6;
            StateRecord current;
            synchronized (SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            char c5 = 7;
            if (dependencies.isNotEmpty()) {
                MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                int size = derivedStateObservers.getSize();
                if (size > 0) {
                    DerivedStateObserver[] content = derivedStateObservers.getContent();
                    int i7 = 0;
                    do {
                        content[i7].start(derivedState);
                        i7++;
                    } while (i7 < size);
                }
                try {
                    Object[] objArr = dependencies.keys;
                    int[] iArr = dependencies.values;
                    long[] jArr = dependencies.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i8 = 7;
                        int i9 = 0;
                        while (true) {
                            long j5 = jArr[i9];
                            if ((((~j5) << c5) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((j5 & 255) < 128) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        int i13 = (i9 << 3) + i12;
                                        StateObject stateObject = (StateObject) objArr[i13];
                                        if (iArr[i13] == 1) {
                                            if (stateObject instanceof DerivedSnapshotState) {
                                                current = ((DerivedSnapshotState) stateObject).current(snapshot);
                                            } else {
                                                current = SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                                            }
                                            i8 = (((i8 * 31) + ActualJvm_jvmKt.identityHashCode(current)) * 31) + current.getSnapshotId$runtime_release();
                                        }
                                        i6 = 8;
                                    } else {
                                        i6 = i10;
                                    }
                                    j5 >>= i6;
                                    i12++;
                                    i10 = i6;
                                }
                                if (i11 != i10) {
                                    break;
                                }
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            c5 = 7;
                        }
                        i5 = i8;
                    } else {
                        i5 = 7;
                    }
                    r2 r2Var = r2.f19517a;
                    int size2 = derivedStateObservers.getSize();
                    if (size2 > 0) {
                        DerivedStateObserver[] content2 = derivedStateObservers.getContent();
                        int i14 = 0;
                        do {
                            content2[i14].done(derivedState);
                            i14++;
                        } while (i14 < size2);
                        return i5;
                    }
                    return i5;
                } catch (Throwable th) {
                    int size3 = derivedStateObservers.getSize();
                    if (size3 > 0) {
                        DerivedStateObserver[] content3 = derivedStateObservers.getContent();
                        int i15 = 0;
                        do {
                            content3[i15].done(derivedState);
                            i15++;
                        } while (i15 < size3);
                    }
                    throw th;
                }
            }
            return 7;
        }

        public void setDependencies(@l ObjectIntMap<StateObject> objectIntMap) {
            this.dependencies = objectIntMap;
        }

        public final void setResult(@m Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i5) {
            this.resultHash = i5;
        }

        public final void setValidSnapshotId(int i5) {
            this.validSnapshotId = i5;
        }

        public final void setValidSnapshotWriteCount(int i5) {
            this.validSnapshotWriteCount = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(@l v3.a<? extends T> aVar, @m SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.calculation = aVar;
        this.policy = snapshotMutationPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> resultRecord, Snapshot snapshot, boolean z4, v3.a<? extends T> aVar) {
        Snapshot.Companion companion;
        boolean z5;
        boolean z6;
        boolean z7;
        int i5;
        ResultRecord<T> resultRecord2 = resultRecord;
        boolean z8 = true;
        if (resultRecord2.isValid(this, snapshot)) {
            if (z4) {
                MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                int size = derivedStateObservers.getSize();
                if (size > 0) {
                    DerivedStateObserver[] content = derivedStateObservers.getContent();
                    int i6 = 0;
                    do {
                        content[i6].start(this);
                        i6++;
                    } while (i6 < size);
                }
                try {
                    ObjectIntMap<StateObject> dependencies = resultRecord.getDependencies();
                    IntRef intRef = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                    if (intRef == null) {
                        intRef = new IntRef(0);
                        SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef);
                    }
                    int element = intRef.getElement();
                    Object[] objArr = dependencies.keys;
                    int[] iArr = dependencies.values;
                    long[] jArr = dependencies.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j5 = jArr[i7];
                            long[] jArr2 = jArr;
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = 0;
                                while (i10 < i9) {
                                    if ((j5 & 255) < 128) {
                                        z7 = z8;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        int i11 = (i7 << 3) + i10;
                                        StateObject stateObject = (StateObject) objArr[i11];
                                        intRef.setElement(element + iArr[i11]);
                                        v3.l<Object, r2> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
                                        if (readObserver$runtime_release != null) {
                                            readObserver$runtime_release.invoke(stateObject);
                                        }
                                        i5 = 8;
                                    } else {
                                        i5 = i8;
                                    }
                                    j5 >>= i5;
                                    i10++;
                                    i8 = i5;
                                    z8 = true;
                                }
                                if (i9 != i8) {
                                    break;
                                }
                            }
                            if (i7 == length) {
                                break;
                            }
                            i7++;
                            jArr = jArr2;
                            z8 = true;
                        }
                    }
                    intRef.setElement(element);
                    r2 r2Var = r2.f19517a;
                    int size2 = derivedStateObservers.getSize();
                    if (size2 > 0) {
                        DerivedStateObserver[] content2 = derivedStateObservers.getContent();
                        int i12 = 0;
                        do {
                            content2[i12].done(this);
                            i12++;
                        } while (i12 < size2);
                    }
                } catch (Throwable th) {
                    int size3 = derivedStateObservers.getSize();
                    if (size3 > 0) {
                        DerivedStateObserver[] content3 = derivedStateObservers.getContent();
                        int i13 = 0;
                        do {
                            content3[i13].done(this);
                            i13++;
                        } while (i13 < size3);
                    }
                    throw th;
                }
            }
            return resultRecord2;
        }
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        IntRef intRef2 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
        if (intRef2 == null) {
            intRef2 = new IntRef(0);
            SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef2);
        }
        int element2 = intRef2.getElement();
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        int size4 = derivedStateObservers2.getSize();
        if (size4 > 0) {
            DerivedStateObserver[] content4 = derivedStateObservers2.getContent();
            int i14 = 0;
            while (true) {
                content4[i14].start(this);
                int i15 = i14 + 1;
                if (i15 >= size4) {
                    break;
                }
                i14 = i15;
            }
        }
        try {
            intRef2.setElement(element2 + 1);
            Object observe = Snapshot.Companion.observe(new DerivedSnapshotState$currentRecord$result$1$1$result$1(this, intRef2, mutableObjectIntMap, element2), null, aVar);
            intRef2.setElement(element2);
            int size5 = derivedStateObservers2.getSize();
            if (size5 > 0) {
                DerivedStateObserver[] content5 = derivedStateObservers2.getContent();
                int i16 = 0;
                while (true) {
                    content5[i16].done(this);
                    int i17 = i16 + 1;
                    if (i17 >= size5) {
                        break;
                    }
                    i16 = i17;
                }
            }
            synchronized (SnapshotKt.getLock()) {
                companion = Snapshot.Companion;
                Snapshot current = companion.getCurrent();
                if (resultRecord.getResult() != ResultRecord.Companion.getUnset()) {
                    SnapshotMutationPolicy<T> policy = getPolicy();
                    if (policy != 0 && policy.equivalent(observe, resultRecord.getResult())) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        resultRecord2.setDependencies(mutableObjectIntMap);
                        resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                        resultRecord2.setValidSnapshotId(snapshot.getId());
                        resultRecord2.setValidSnapshotWriteCount(snapshot.getWriteCount$runtime_release());
                    }
                }
                resultRecord2 = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                resultRecord2.setDependencies(mutableObjectIntMap);
                resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                resultRecord2.setValidSnapshotId(snapshot.getId());
                resultRecord2.setValidSnapshotWriteCount(snapshot.getWriteCount$runtime_release());
                resultRecord2.setResult(observe);
            }
            IntRef intRef3 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
            if (intRef3 != null && intRef3.getElement() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                companion.notifyObjectsInitialized();
            }
            return resultRecord2;
        } catch (Throwable th2) {
            int size6 = derivedStateObservers2.getSize();
            if (size6 > 0) {
                DerivedStateObserver[] content6 = derivedStateObservers2.getContent();
                int i18 = 0;
                do {
                    content6[i18].done(this);
                    i18++;
                } while (i18 < size6);
            }
            throw th2;
        }
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return String.valueOf(resultRecord.getResult());
        }
        return "<Not calculated>";
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @l
    public final StateRecord current(@l Snapshot snapshot) {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    @Override // androidx.compose.runtime.DerivedState
    @l
    public DerivedState.Record<T> getCurrentRecord() {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first), Snapshot.Companion.getCurrent(), false, this.calculation);
    }

    @h(name = "getDebuggerDisplayValue")
    @m
    public final T getDebuggerDisplayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return (T) resultRecord.getResult();
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @l
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.DerivedState
    @m
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Snapshot.Companion companion = Snapshot.Companion;
        v3.l<Object, r2> readObserver$runtime_release = companion.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first), companion.getCurrent(), true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@l StateRecord stateRecord) {
        l0.n(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (ResultRecord) stateRecord;
    }

    @l
    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }
}
