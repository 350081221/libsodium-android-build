package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.sequences.o;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [V, K] */
@f(c = "androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {TypedValues.TransitionType.TYPE_FROM}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
@i0(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@"}, d2 = {"K", "V", "Lkotlin/sequences/o;", "", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$entries$1$iterator$1\n*L\n699#1:1835,6\n699#1:1842,3\n699#1:1846,9\n699#1:1841\n699#1:1845\n*E\n"})
/* loaded from: classes.dex */
final class ScatterMap$MapWrapper$entries$1$iterator$1<K, V> extends k implements p<o<? super Map.Entry<? extends K, ? extends V>>, d<? super r2>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterMap<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterMap$MapWrapper$entries$1$iterator$1(ScatterMap<K, V> scatterMap, d<? super ScatterMap$MapWrapper$entries$1$iterator$1> dVar) {
        super(2, dVar);
        this.this$0 = scatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        ScatterMap$MapWrapper$entries$1$iterator$1 scatterMap$MapWrapper$entries$1$iterator$1 = new ScatterMap$MapWrapper$entries$1$iterator$1(this.this$0, dVar);
        scatterMap$MapWrapper$entries$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$entries$1$iterator$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l o<? super Map.Entry<? extends K, ? extends V>> oVar, @m d<? super r2> dVar) {
        return ((ScatterMap$MapWrapper$entries$1$iterator$1) create(oVar, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a5 -> B:5:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b0 -> B:6:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0056 -> B:8:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c1 -> B:23:0x00c3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
