package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import com.umeng.analytics.pro.d;
import java.util.Set;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.t0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u001a'\u0010\u0015\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"T", "Lkotlinx/coroutines/flow/t0;", "Lkotlin/coroutines/g;", d.X, "Landroidx/compose/runtime/State;", "collectAsState", "(Lkotlinx/coroutines/flow/t0;Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "R", "Lkotlinx/coroutines/flow/i;", "initial", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "block", "snapshotFlow", "Landroidx/collection/MutableScatterSet;", "", "", "set", "", "intersects$SnapshotStateKt__SnapshotFlowKt", "(Landroidx/collection/MutableScatterSet;Ljava/util/Set;)Z", "intersects", "runtime_release"}, k = 5, mv = {1, 8, 0}, xs = "androidx/compose/runtime/SnapshotStateKt")
@r1({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,181:1\n296#2,2:182\n267#2,4:184\n237#2,7:188\n248#2,3:196\n251#2,2:200\n272#2:202\n298#2,2:203\n273#2:205\n254#2,6:206\n274#2:212\n300#2:213\n1810#3:195\n1672#3:199\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n180#1:182,2\n180#1:184,4\n180#1:188,7\n180#1:196,3\n180#1:200,2\n180#1:202\n180#1:203,2\n180#1:205\n180#1:206,6\n180#1:212\n180#1:213\n180#1:195\n180#1:199\n*E\n"})
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    @l
    @Composable
    public static final <T> State<T> collectAsState(@l t0<? extends T> t0Var, @m g gVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1439883919);
        if ((i6 & 1) != 0) {
            gVar = i.INSTANCE;
        }
        g gVar2 = gVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i5, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:46)");
        }
        State<T> collectAsState = SnapshotStateKt.collectAsState(t0Var, t0Var.getValue(), gVar2, composer, 520, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return collectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(MutableScatterSet<Object> mutableScatterSet, Set<? extends Object> set) {
        boolean z4;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
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
                    if (z4 && set.contains(objArr[(i5 << 3) + i7])) {
                        return true;
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return false;
                }
            }
            if (i5 == length) {
                return false;
            }
            i5++;
        }
    }

    @l
    public static final <T> kotlinx.coroutines.flow.i<T> snapshotFlow(@l v3.a<? extends T> aVar) {
        return k.J0(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(aVar, null));
    }

    @l
    @Composable
    public static final <T extends R, R> State<R> collectAsState(@l kotlinx.coroutines.flow.i<? extends T> iVar, R r5, @m g gVar, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-606625098);
        if ((i6 & 2) != 0) {
            gVar = i.INSTANCE;
        }
        g gVar2 = gVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i5, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:61)");
        }
        int i7 = i5 >> 3;
        State<R> produceState = SnapshotStateKt.produceState(r5, iVar, gVar2, new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(gVar2, iVar, null), composer, (i7 & 8) | 4672 | (i7 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return produceState;
    }
}
