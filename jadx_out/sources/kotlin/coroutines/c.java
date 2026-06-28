package kotlin.coroutines;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.Serializable;
import kotlin.coroutines.g;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", com.umeng.analytics.pro.d.X, "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", TTDownloadField.TT_HASHCODE, "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.3")
@r1({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements g, Serializable {

    @l
    private final g.b element;

    @l
    private final g left;

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12720#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    /* loaded from: classes3.dex */
    private static final class a implements Serializable {

        @l
        public static final C0550a Companion = new C0550a(null);
        private static final long serialVersionUID = 0;

        @l
        private final g[] elements;

        @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.coroutines.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0550a {
            private C0550a() {
            }

            public /* synthetic */ C0550a(w wVar) {
                this();
            }
        }

        public a(@l g[] elements) {
            l0.p(elements, "elements");
            this.elements = elements;
        }

        private final Object readResolve() {
            g[] gVarArr = this.elements;
            g gVar = i.INSTANCE;
            for (g gVar2 : gVarArr) {
                gVar = gVar.plus(gVar2);
            }
            return gVar;
        }

        @l
        public final g[] getElements() {
            return this.elements;
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b extends n0 implements p<String, g.b, String> {
        public static final b INSTANCE = new b();

        b() {
            super(2);
        }

        @Override // v3.p
        @l
        public final String invoke(@l String acc, @l g.b element) {
            l0.p(acc, "acc");
            l0.p(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0551c extends n0 implements p<r2, g.b, r2> {
        final /* synthetic */ g[] $elements;
        final /* synthetic */ k1.f $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0551c(g[] gVarArr, k1.f fVar) {
            super(2);
            this.$elements = gVarArr;
            this.$index = fVar;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(r2 r2Var, g.b bVar) {
            invoke2(r2Var, bVar);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l r2 r2Var, @l g.b element) {
            l0.p(r2Var, "<anonymous parameter 0>");
            l0.p(element, "element");
            g[] gVarArr = this.$elements;
            k1.f fVar = this.$index;
            int i5 = fVar.element;
            fVar.element = i5 + 1;
            gVarArr[i5] = element;
        }
    }

    public c(@l g left, @l g.b element) {
        l0.p(left, "left");
        l0.p(element, "element");
        this.left = left;
        this.element = element;
    }

    private final boolean contains(g.b bVar) {
        return l0.g(get(bVar.getKey()), bVar);
    }

    private final boolean containsAll(c cVar) {
        while (contains(cVar.element)) {
            g gVar = cVar.left;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                l0.n(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return contains((g.b) gVar);
            }
        }
        return false;
    }

    private final int size() {
        int i5 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.left;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i5;
            }
            i5++;
        }
    }

    private final Object writeReplace() {
        boolean z4;
        int size = size();
        g[] gVarArr = new g[size];
        k1.f fVar = new k1.f();
        fold(r2.f19517a, new C0551c(gVarArr, fVar));
        if (fVar.element == size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(@m Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.size() != size() || !cVar.containsAll(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.g
    public <R> R fold(R r5, @l p<? super R, ? super g.b, ? extends R> operation) {
        l0.p(operation, "operation");
        return operation.invoke((Object) this.left.fold(r5, operation), this.element);
    }

    @Override // kotlin.coroutines.g
    @m
    public <E extends g.b> E get(@l g.c<E> key) {
        l0.p(key, "key");
        c cVar = this;
        while (true) {
            E e5 = (E) cVar.element.get(key);
            if (e5 != null) {
                return e5;
            }
            g gVar = cVar.left;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                return (E) gVar.get(key);
            }
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override // kotlin.coroutines.g
    @l
    public g minusKey(@l g.c<?> key) {
        l0.p(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        g minusKey = this.left.minusKey(key);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == i.INSTANCE) {
            return this.element;
        }
        return new c(minusKey, this.element);
    }

    @Override // kotlin.coroutines.g
    @l
    public g plus(@l g gVar) {
        return g.a.a(this, gVar);
    }

    @l
    public String toString() {
        return '[' + ((String) fold("", b.INSTANCE)) + ']';
    }
}
