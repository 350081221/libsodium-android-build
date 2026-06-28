package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import kotlin.coroutines.g;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/internal/n;", "Lkotlin/coroutines/g;", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/g$b;", "operation", "fold", "(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/g$c;", DatabaseFileArchive.COLUMN_KEY, "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "minusKey", com.umeng.analytics.pro.d.X, "plus", "", bi.ay, "Ljava/lang/Throwable;", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class n implements kotlin.coroutines.g {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public final Throwable f20137a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ kotlin.coroutines.g f20138b;

    public n(@p4.l Throwable th, @p4.l kotlin.coroutines.g gVar) {
        this.f20137a = th;
        this.f20138b = gVar;
    }

    @Override // kotlin.coroutines.g
    public <R> R fold(R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) this.f20138b.fold(r5, pVar);
    }

    @Override // kotlin.coroutines.g
    @p4.m
    public <E extends g.b> E get(@p4.l g.c<E> cVar) {
        return (E) this.f20138b.get(cVar);
    }

    @Override // kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g minusKey(@p4.l g.c<?> cVar) {
        return this.f20138b.minusKey(cVar);
    }

    @Override // kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g plus(@p4.l kotlin.coroutines.g gVar) {
        return this.f20138b.plus(gVar);
    }
}
