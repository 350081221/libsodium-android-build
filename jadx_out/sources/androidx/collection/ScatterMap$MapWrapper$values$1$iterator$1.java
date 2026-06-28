package androidx.collection;

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

/* JADX INFO: Add missing generic type declarations: [V] */
@f(c = "androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {744}, m = "invokeSuspend", n = {"$this$iterator", "v$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
@i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"K", "V", "Lkotlin/sequences/o;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1$iterator$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n418#2,3:1835\n363#2,6:1838\n373#2,3:1845\n376#2,2:1849\n422#2,2:1851\n379#2,6:1853\n424#2:1859\n1810#3:1844\n1672#3:1848\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$values$1$iterator$1\n*L\n743#1:1835,3\n743#1:1838,6\n743#1:1845,3\n743#1:1849,2\n743#1:1851,2\n743#1:1853,6\n743#1:1859\n743#1:1844\n743#1:1848\n*E\n"})
/* loaded from: classes.dex */
final class ScatterMap$MapWrapper$values$1$iterator$1<V> extends k implements p<o<? super V>, d<? super r2>, Object> {
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
    public ScatterMap$MapWrapper$values$1$iterator$1(ScatterMap<K, V> scatterMap, d<? super ScatterMap$MapWrapper$values$1$iterator$1> dVar) {
        super(2, dVar);
        this.this$0 = scatterMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        ScatterMap$MapWrapper$values$1$iterator$1 scatterMap$MapWrapper$values$1$iterator$1 = new ScatterMap$MapWrapper$values$1$iterator$1(this.this$0, dVar);
        scatterMap$MapWrapper$values$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$values$1$iterator$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l o<? super V> oVar, @m d<? super r2> dVar) {
        return ((ScatterMap$MapWrapper$values$1$iterator$1) create(oVar, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        if (0 != 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009a -> B:5:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0058 -> B:20:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:7:0x006c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$values$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
