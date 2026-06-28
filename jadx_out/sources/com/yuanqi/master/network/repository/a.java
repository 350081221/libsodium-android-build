package com.yuanqi.master.network.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.umeng.analytics.pro.bi;
import kotlin.coroutines.k;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.x0;
import kotlin.reflect.o;
import p4.l;
import p4.m;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00150\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/yuanqi/master/network/repository/BaseRepository;", "", "()V", "lbsService", "Lcom/yuanqi/master/network/ApiService;", "getLbsService", "()Lcom/yuanqi/master/network/ApiService;", "<set-?>", "", "mToken", "getMToken", "()Ljava/lang/String;", "setMToken", "(Ljava/lang/String;)V", "mToken$delegate", "Lcom/yuanqi/master/tools/MVFast;", "mapService", "getMapService", "service", "getService", "await", "T", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f14835e = {l1.k(new x0(a.class, "mToken", "getMToken()Ljava/lang/String;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public static final int f14836f = 0;

    /* renamed from: a, reason: collision with root package name */
    @l
    private final com.yuanqi.master.network.a f14837a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final com.yuanqi.master.network.a f14838b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final com.yuanqi.master.network.a f14839c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final com.yuanqi.master.tools.x0 f14840d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¨\u0006\u000b"}, d2 = {"com/yuanqi/master/network/repository/BaseRepository$await$2$1", "Lretrofit2/Callback;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", bi.aL, "", "onResponse", "response", "Lretrofit2/Response;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.network.repository.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0425a<T> implements Callback<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d<T> f14841a;

        /* JADX WARN: Multi-variable type inference failed */
        C0425a(kotlin.coroutines.d<? super T> dVar) {
            this.f14841a = dVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(@l Call<T> call, @l Throwable t5) {
            l0.p(call, "call");
            l0.p(t5, "t");
            kotlin.coroutines.d<T> dVar = this.f14841a;
            d1.a aVar = d1.Companion;
            dVar.resumeWith(d1.m6444constructorimpl(e1.a(t5)));
        }

        @Override // retrofit2.Callback
        public void onResponse(@l Call<T> call, @l Response<T> response) {
            l0.p(call, "call");
            l0.p(response, "response");
            T body = response.body();
            if (body != null) {
                kotlin.coroutines.d<T> dVar = this.f14841a;
                d1.a aVar = d1.Companion;
                dVar.resumeWith(d1.m6444constructorimpl(body));
            } else {
                kotlin.coroutines.d<T> dVar2 = this.f14841a;
                d1.a aVar2 = d1.Companion;
                dVar2.resumeWith(d1.m6444constructorimpl(e1.a(new RuntimeException("response body is null"))));
            }
        }
    }

    public a() {
        com.yuanqi.master.network.c cVar = com.yuanqi.master.network.c.f14828a;
        this.f14837a = (com.yuanqi.master.network.a) com.yuanqi.master.network.c.d(cVar, com.yuanqi.master.network.a.class, 0, 2, null);
        this.f14838b = (com.yuanqi.master.network.a) cVar.c(com.yuanqi.master.network.a.class, 1);
        this.f14839c = (com.yuanqi.master.network.a) cVar.c(com.yuanqi.master.network.a.class, 2);
        this.f14840d = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.N, "");
    }

    @m
    public final <T> Object a(@l Call<T> call, @l kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        k kVar = new k(e5);
        call.enqueue(new C0425a(kVar));
        Object b5 = kVar.b();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (b5 == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b5;
    }

    @l
    public final com.yuanqi.master.network.a b() {
        return this.f14839c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final String c() {
        return (String) this.f14840d.getValue(this, f14835e[0]);
    }

    @l
    public final com.yuanqi.master.network.a d() {
        return this.f14838b;
    }

    @l
    public final com.yuanqi.master.network.a e() {
        return this.f14837a;
    }

    protected final void f(@l String str) {
        l0.p(str, "<set-?>");
        this.f14840d.setValue(this, f14835e[0], str);
    }
}
