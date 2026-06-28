package androidx.collection;

import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.sequences.o;
import kotlin.sequences.q;
import p4.l;
import p4.m;
import v3.p;
import w3.d;

/* JADX INFO: Add missing generic type declarations: [V, K] */
@i0(d1 = {"\u0000+\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R4\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1", "", "", "", "hasNext", "next", "Lkotlin/r2;", "remove", "", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V", "", "current", "I", "getCurrent", "()I", "setCurrent", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, d {
    private int current = -1;

    @l
    private Iterator<? extends Map.Entry<K, V>> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    @f(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1312}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @i0(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@"}, d2 = {"K", "V", "Lkotlin/sequences/o;", "", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n1810#3:1841\n1672#3:1845\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1\n*L\n1310#1:1835,6\n1310#1:1842,3\n1310#1:1846,9\n1310#1:1841\n1310#1:1845\n*E\n"})
    /* renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends k implements p<o<? super Map.Entry<K, V>>, kotlin.coroutines.d<? super r2>, Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutableScatterMap<K, V> this$0;
        final /* synthetic */ MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableScatterMap<K, V> mutableScatterMap, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = mutableScatterMap;
            this.this$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.this$1, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l o<? super Map.Entry<K, V>> oVar, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(oVar, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00b9 -> B:5:0x00bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00c4 -> B:6:0x00c5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005f -> B:7:0x0076). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d9 -> B:22:0x00da). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        Iterator<? extends Map.Entry<K, V>> a5;
        this.this$0 = mutableScatterMap;
        a5 = q.a(new AnonymousClass1(mutableScatterMap, this, null));
        this.iterator = a5;
    }

    public final int getCurrent() {
        return this.current;
    }

    @l
    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i5 = this.current;
        if (i5 != -1) {
            this.this$0.removeValueAt(i5);
            this.current = -1;
        }
    }

    public final void setCurrent(int i5) {
        this.current = i5;
    }

    public final void setIterator(@l Iterator<? extends Map.Entry<K, V>> it) {
        l0.p(it, "<set-?>");
        this.iterator = it;
    }

    @Override // java.util.Iterator
    @l
    public Map.Entry<K, V> next() {
        return this.iterator.next();
    }
}
