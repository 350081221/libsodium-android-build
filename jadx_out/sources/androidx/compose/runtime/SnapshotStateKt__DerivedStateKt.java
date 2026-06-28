package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000\u001a0\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\b\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\" \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001c"}, d2 = {"T", "Lkotlin/Function1;", "Landroidx/compose/runtime/internal/IntRef;", "block", "withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt", "(Lv3/l;)Ljava/lang/Object;", "withCalculationNestedLevel", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/State;", "derivedStateOf", "Landroidx/compose/runtime/SnapshotMutationPolicy;", bi.bt, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateObservers", "R", "Landroidx/compose/runtime/DerivedState;", "derivedState", "notifyObservers$SnapshotStateKt__DerivedStateKt", "(Landroidx/compose/runtime/DerivedState;Lv3/a;)Ljava/lang/Object;", "notifyObservers", "observer", "Lkotlin/r2;", "observeDerivedStateRecalculations", "Landroidx/compose/runtime/SnapshotThreadLocal;", "calculationBlockNestedLevel", "Landroidx/compose/runtime/SnapshotThreadLocal;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xs = "androidx/compose/runtime/SnapshotStateKt")
@r1({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,396:1\n1188#2:397\n460#3,11:398\n460#3,11:409\n48#3:420\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n363#1:397\n369#1:398,11\n373#1:409,11\n393#1:420\n*E\n"})
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__DerivedStateKt {

    @l
    private static final SnapshotThreadLocal<IntRef> calculationBlockNestedLevel = new SnapshotThreadLocal<>();

    @l
    private static final SnapshotThreadLocal<MutableVector<DerivedStateObserver>> derivedStateObservers = new SnapshotThreadLocal<>();

    @l
    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        SnapshotThreadLocal<MutableVector<DerivedStateObserver>> snapshotThreadLocal = derivedStateObservers;
        MutableVector<DerivedStateObserver> mutableVector = snapshotThreadLocal.get();
        if (mutableVector == null) {
            MutableVector<DerivedStateObserver> mutableVector2 = new MutableVector<>(new DerivedStateObserver[0], 0);
            snapshotThreadLocal.set(mutableVector2);
            return mutableVector2;
        }
        return mutableVector;
    }

    @l
    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(@l v3.a<? extends T> aVar) {
        return new DerivedSnapshotState(aVar, null);
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, v3.a<? extends R> aVar) {
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        int size = derivedStateObservers2.getSize();
        int i5 = 0;
        if (size > 0) {
            DerivedStateObserver[] content = derivedStateObservers2.getContent();
            int i6 = 0;
            do {
                content[i6].start(derivedState);
                i6++;
            } while (i6 < size);
        }
        try {
            R invoke = aVar.invoke();
            kotlin.jvm.internal.i0.d(1);
            int size2 = derivedStateObservers2.getSize();
            if (size2 > 0) {
                DerivedStateObserver[] content2 = derivedStateObservers2.getContent();
                do {
                    content2[i5].done(derivedState);
                    i5++;
                } while (i5 < size2);
            }
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } catch (Throwable th) {
            kotlin.jvm.internal.i0.d(1);
            int size3 = derivedStateObservers2.getSize();
            if (size3 > 0) {
                DerivedStateObserver[] content3 = derivedStateObservers2.getContent();
                do {
                    content3[i5].done(derivedState);
                    i5++;
                } while (i5 < size3);
            }
            kotlin.jvm.internal.i0.c(1);
            throw th;
        }
    }

    public static final <R> void observeDerivedStateRecalculations(@l DerivedStateObserver derivedStateObserver, @l v3.a<? extends R> aVar) {
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        try {
            derivedStateObservers2.add(derivedStateObserver);
            aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            derivedStateObservers2.removeAt(derivedStateObservers2.getSize() - 1);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    private static final <T> T withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt(v3.l<? super IntRef, ? extends T> lVar) {
        IntRef intRef = (IntRef) calculationBlockNestedLevel.get();
        if (intRef == null) {
            intRef = new IntRef(0);
            calculationBlockNestedLevel.set(intRef);
        }
        return lVar.invoke(intRef);
    }

    @l
    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(@l SnapshotMutationPolicy<T> snapshotMutationPolicy, @l v3.a<? extends T> aVar) {
        return new DerivedSnapshotState(aVar, snapshotMutationPolicy);
    }
}
