package kotlin.coroutines;

import kotlin.coroutines.g;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0007¨\u0006\b"}, d2 = {"getPolymorphicElement", "E", "Lkotlin/coroutines/CoroutineContext$Element;", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusPolymorphicKey", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    @r
    @g1(version = "1.3")
    @m
    public static final <E extends g.b> E a(@l g.b bVar, @l g.c<E> key) {
        l0.p(bVar, "<this>");
        l0.p(key, "key");
        if (key instanceof b) {
            b bVar2 = (b) key;
            if (!bVar2.a(bVar.getKey())) {
                return null;
            }
            E e5 = (E) bVar2.b(bVar);
            if (!(e5 instanceof g.b)) {
                return null;
            }
            return e5;
        }
        if (bVar.getKey() != key) {
            return null;
        }
        return bVar;
    }

    @r
    @l
    @g1(version = "1.3")
    public static final g b(@l g.b bVar, @l g.c<?> key) {
        l0.p(bVar, "<this>");
        l0.p(key, "key");
        if (key instanceof b) {
            b bVar2 = (b) key;
            if (bVar2.a(bVar.getKey()) && bVar2.b(bVar) != null) {
                return i.INSTANCE;
            }
            return bVar;
        }
        if (bVar.getKey() == key) {
            return i.INSTANCE;
        }
        return bVar;
    }
}
