package kotlin.coroutines;

import kotlin.coroutines.e;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", com.umeng.analytics.pro.d.X, "Element", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.3")
/* loaded from: classes3.dex */
public interface g {

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.coroutines.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0552a extends n0 implements p<g, b, g> {
            public static final C0552a INSTANCE = new C0552a();

            C0552a() {
                super(2);
            }

            @Override // v3.p
            @l
            public final g invoke(@l g acc, @l b element) {
                kotlin.coroutines.c cVar;
                l0.p(acc, "acc");
                l0.p(element, "element");
                g minusKey = acc.minusKey(element.getKey());
                i iVar = i.INSTANCE;
                if (minusKey == iVar) {
                    return element;
                }
                e.b bVar = e.S;
                e eVar = (e) minusKey.get(bVar);
                if (eVar == null) {
                    cVar = new kotlin.coroutines.c(minusKey, element);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar);
                    if (minusKey2 == iVar) {
                        return new kotlin.coroutines.c(element, eVar);
                    }
                    cVar = new kotlin.coroutines.c(new kotlin.coroutines.c(minusKey2, element), eVar);
                }
                return cVar;
            }
        }

        @l
        public static g a(@l g gVar, @l g context) {
            l0.p(context, "context");
            if (context != i.INSTANCE) {
                return (g) context.fold(gVar, C0552a.INSTANCE);
            }
            return gVar;
        }
    }

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface b extends g {

        @i0(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a {
            public static <R> R a(@l b bVar, R r5, @l p<? super R, ? super b, ? extends R> operation) {
                l0.p(operation, "operation");
                return operation.invoke(r5, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @m
            public static <E extends b> E b(@l b bVar, @l c<E> key) {
                l0.p(key, "key");
                if (l0.g(bVar.getKey(), key)) {
                    l0.n(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            @l
            public static g c(@l b bVar, @l c<?> key) {
                l0.p(key, "key");
                if (l0.g(bVar.getKey(), key)) {
                    return i.INSTANCE;
                }
                return bVar;
            }

            @l
            public static g d(@l b bVar, @l g context) {
                l0.p(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // kotlin.coroutines.g
        <R> R fold(R r5, @l p<? super R, ? super b, ? extends R> pVar);

        @Override // kotlin.coroutines.g
        @m
        <E extends b> E get(@l c<E> cVar);

        @l
        c<?> getKey();

        @Override // kotlin.coroutines.g
        @l
        g minusKey(@l c<?> cVar);
    }

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r5, @l p<? super R, ? super b, ? extends R> pVar);

    @m
    <E extends b> E get(@l c<E> cVar);

    @l
    g minusKey(@l c<?> cVar);

    @l
    g plus(@l g gVar);
}
