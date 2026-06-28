package kotlin.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.g.b;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0012\u0004\u0012\u0002H\u00030\u0004B8\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0002\b\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", "B", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "baseKey", "safeCast", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V", "topmostKey", "isSubKey", "", DatabaseFileArchive.COLUMN_KEY, "isSubKey$kotlin_stdlib", "tryCast", "tryCast$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r
@g1(version = "1.3")
/* loaded from: classes3.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final v3.l<g.b, E> f19224a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final g.c<?> f19225b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [v3.l<kotlin.coroutines.g$b, E extends B>, v3.l<? super kotlin.coroutines.g$b, ? extends E extends B>, java.lang.Object] */
    public b(@l g.c<B> baseKey, @l v3.l<? super g.b, ? extends E> safeCast) {
        l0.p(baseKey, "baseKey");
        l0.p(safeCast, "safeCast");
        this.f19224a = safeCast;
        this.f19225b = baseKey instanceof b ? (g.c<B>) ((b) baseKey).f19225b : baseKey;
    }

    public final boolean a(@l g.c<?> key) {
        l0.p(key, "key");
        if (key != this && this.f19225b != key) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/g$b;)TE; */
    @m
    public final g.b b(@l g.b element) {
        l0.p(element, "element");
        return (g.b) this.f19224a.invoke(element);
    }
}
