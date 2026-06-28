package kotlinx.coroutines;

import kotlin.coroutines.g;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/y3;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", DatabaseFileArchive.COLUMN_KEY, "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class y3 implements g.b, g.c<y3> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final y3 f20695a = new y3();

    private y3() {
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R fold(R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r5, pVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.m
    public <E extends g.b> E get(@p4.l g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.g.b
    @p4.l
    public g.c<?> getKey() {
        return this;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g minusKey(@p4.l g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g plus(@p4.l kotlin.coroutines.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
