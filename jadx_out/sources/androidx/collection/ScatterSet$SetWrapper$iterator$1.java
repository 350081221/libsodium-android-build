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

/* JADX INFO: Add missing generic type declarations: [E] */
@f(c = "androidx.collection.ScatterSet$SetWrapper$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {495}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlin/sequences/o;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n267#2,4:1085\n237#2,7:1089\n248#2,3:1097\n251#2,2:1101\n272#2,2:1103\n254#2,6:1105\n274#2:1111\n1810#3:1096\n1672#3:1100\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n*L\n494#1:1085,4\n494#1:1089,7\n494#1:1097,3\n494#1:1101,2\n494#1:1103,2\n494#1:1105,6\n494#1:1111\n494#1:1096\n494#1:1100\n*E\n"})
/* loaded from: classes.dex */
final class ScatterSet$SetWrapper$iterator$1<E> extends k implements p<o<? super E>, d<? super r2>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterSet<E> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterSet$SetWrapper$iterator$1(ScatterSet<E> scatterSet, d<? super ScatterSet$SetWrapper$iterator$1> dVar) {
        super(2, dVar);
        this.this$0 = scatterSet;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        ScatterSet$SetWrapper$iterator$1 scatterSet$SetWrapper$iterator$1 = new ScatterSet$SetWrapper$iterator$1(this.this$0, dVar);
        scatterSet$SetWrapper$iterator$1.L$0 = obj;
        return scatterSet$SetWrapper$iterator$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l o<? super E> oVar, @m d<? super r2> dVar) {
        return ((ScatterSet$SetWrapper$iterator$1) create(oVar, dVar)).invokeSuspend(r2.f19517a);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet$SetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
