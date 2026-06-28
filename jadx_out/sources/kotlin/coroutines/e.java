package kotlin.coroutines;

import kotlin.coroutines.g;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.3")
/* loaded from: classes3.dex */
public interface e extends g.b {

    @l
    public static final b S = b.f19226a;

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <R> R a(@l e eVar, R r5, @l p<? super R, ? super g.b, ? extends R> operation) {
            l0.p(operation, "operation");
            return (R) g.b.a.a(eVar, r5, operation);
        }

        @m
        public static <E extends g.b> E b(@l e eVar, @l g.c<E> key) {
            l0.p(key, "key");
            if (key instanceof kotlin.coroutines.b) {
                kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                E e5 = (E) bVar.b(eVar);
                if (!(e5 instanceof g.b)) {
                    return null;
                }
                return e5;
            }
            if (e.S != key) {
                return null;
            }
            l0.n(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return eVar;
        }

        @l
        public static g c(@l e eVar, @l g.c<?> key) {
            l0.p(key, "key");
            if (key instanceof kotlin.coroutines.b) {
                kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
                if (bVar.a(eVar.getKey()) && bVar.b(eVar) != null) {
                    return i.INSTANCE;
                }
                return eVar;
            }
            if (e.S == key) {
                return i.INSTANCE;
            }
            return eVar;
        }

        @l
        public static g d(@l e eVar, @l g context) {
            l0.p(context, "context");
            return g.b.a.d(eVar, context);
        }

        public static void e(@l e eVar, @l d<?> continuation) {
            l0.p(continuation, "continuation");
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements g.c<e> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f19226a = new b();

        private b() {
        }
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @m
    <E extends g.b> E get(@l g.c<E> cVar);

    @l
    <T> d<T> interceptContinuation(@l d<? super T> dVar);

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @l
    g minusKey(@l g.c<?> cVar);

    void releaseInterceptedContinuation(@l d<?> dVar);
}
