package kotlin.coroutines;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.Serializable;
import kotlin.coroutines.g;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\b\b\u0000\u0010\u000f*\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0096\u0002¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u00020\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016J\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/coroutines/EmptyCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", TTDownloadField.TT_HASHCODE, "", "minusKey", "plus", com.umeng.analytics.pro.d.X, "readResolve", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g1(version = "1.3")
/* loaded from: classes3.dex */
public final class i implements g, Serializable {

    @l
    public static final i INSTANCE = new i();
    private static final long serialVersionUID = 0;

    private i() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.g
    public <R> R fold(R r5, @l p<? super R, ? super g.b, ? extends R> operation) {
        l0.p(operation, "operation");
        return r5;
    }

    @Override // kotlin.coroutines.g
    @m
    public <E extends g.b> E get(@l g.c<E> key) {
        l0.p(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.g
    @l
    public g minusKey(@l g.c<?> key) {
        l0.p(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.g
    @l
    public g plus(@l g context) {
        l0.p(context, "context");
        return context;
    }

    @l
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
