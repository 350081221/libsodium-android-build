package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/Composition;", "composition", "Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composition;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n+ 2 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,444:1\n843#2:445\n845#2,4:459\n849#2:469\n373#3,6:446\n383#3,3:453\n386#3,2:457\n389#3,6:463\n1810#4:452\n1672#4:456\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$end$1$2\n*L\n400#1:445\n400#1:459,4\n400#1:469\n400#1:446,6\n400#1:453,3\n400#1:457,2\n400#1:463,6\n400#1:452\n400#1:456\n*E\n"})
/* loaded from: classes.dex */
public final class RecomposeScopeImpl$end$1$2 extends n0 implements l<Composition, r2> {
    final /* synthetic */ MutableObjectIntMap<Object> $instances;
    final /* synthetic */ int $token;
    final /* synthetic */ RecomposeScopeImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposeScopeImpl$end$1$2(RecomposeScopeImpl recomposeScopeImpl, int i5, MutableObjectIntMap<Object> mutableObjectIntMap) {
        super(1);
        this.this$0 = recomposeScopeImpl;
        this.$token = i5;
        this.$instances = mutableObjectIntMap;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Composition composition) {
        invoke2(composition);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Composition composition) {
        int i5;
        MutableObjectIntMap mutableObjectIntMap;
        int i6;
        MutableScatterMap mutableScatterMap;
        i5 = this.this$0.currentToken;
        if (i5 == this.$token) {
            MutableObjectIntMap<Object> mutableObjectIntMap2 = this.$instances;
            mutableObjectIntMap = this.this$0.trackedInstances;
            if (l0.g(mutableObjectIntMap2, mutableObjectIntMap) && (composition instanceof CompositionImpl)) {
                MutableObjectIntMap<Object> mutableObjectIntMap3 = this.$instances;
                int i7 = this.$token;
                RecomposeScopeImpl recomposeScopeImpl = this.this$0;
                long[] jArr = mutableObjectIntMap3.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr[i8];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8;
                            int i10 = 8 - ((~(i8 - length)) >>> 31);
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((255 & j5) < 128) {
                                    int i12 = (i8 << 3) + i11;
                                    Object obj = mutableObjectIntMap3.keys[i12];
                                    boolean z4 = mutableObjectIntMap3.values[i12] != i7;
                                    if (z4) {
                                        CompositionImpl compositionImpl = (CompositionImpl) composition;
                                        compositionImpl.removeObservation$runtime_release(obj, recomposeScopeImpl);
                                        DerivedState<?> derivedState = obj instanceof DerivedState ? (DerivedState) obj : null;
                                        if (derivedState != null) {
                                            compositionImpl.removeDerivedStateObservation$runtime_release(derivedState);
                                            mutableScatterMap = recomposeScopeImpl.trackedDependencies;
                                            if (mutableScatterMap != null) {
                                                mutableScatterMap.remove(derivedState);
                                                if (mutableScatterMap.getSize() == 0) {
                                                    recomposeScopeImpl.trackedDependencies = null;
                                                }
                                            }
                                        }
                                    }
                                    if (z4) {
                                        mutableObjectIntMap3.removeValueAt(i12);
                                    }
                                    i6 = 8;
                                } else {
                                    i6 = i9;
                                }
                                j5 >>= i6;
                                i11++;
                                i9 = i6;
                            }
                            if (i10 != i9) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                if (this.$instances.getSize() == 0) {
                    this.this$0.trackedInstances = null;
                }
            }
        }
    }
}
