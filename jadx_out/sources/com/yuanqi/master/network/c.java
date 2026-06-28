package com.yuanqi.master.network;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import com.umeng.analytics.pro.d;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p4.l;
import p4.m;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u0002H\f\"\u0006\b\u0000\u0010\f\u0018\u0001H\u0086\b¢\u0006\u0002\u0010\rJ)\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012JO\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00150\u0014\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0016\u001a\u00020\u00172\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00150\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u001e\u001a\n  *\u0004\u0018\u00010\u001f0\u001f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/yuanqi/master/network/ServiceCreator;", "", "()V", "DEBUG", "", "baseUrl", "", "lbsDataRepository", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "tiandiMap", "create", "T", "()Ljava/lang/Object;", "serviceClass", "Ljava/lang/Class;", "type", "", "(Ljava/lang/Class;I)Ljava/lang/Object;", "fire", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", d.X, "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "getRetrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Instrumented
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f14829b = false;

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final String f14831d = "https://api.tianditu.gov.cn";

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final String f14832e = "http://vip.cellocation.com";

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final HttpLoggingInterceptor f14833f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14834g;

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final c f14828a = new c();

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final String f14830c = "https://api.yqdk.com";

    /* JADX INFO: Add missing generic type declarations: [T] */
    @f(c = "com.yuanqi.master.network.ServiceCreator$fire$1", f = "ServiceCreator.kt", i = {0}, l = {69, 74}, m = "invokeSuspend", n = {"$this$liveData"}, s = {"L$0"})
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/Result;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a<T> extends o implements p<LiveDataScope<d1<? extends T>>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.l<kotlin.coroutines.d<? super d1<? extends T>>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(v3.l<? super kotlin.coroutines.d<? super d1<? extends T>>, ? extends Object> lVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$block = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.$block, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l LiveDataScope<d1<T>> liveDataScope, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(liveDataScope, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.LiveDataScope] */
        /* JADX WARN: Type inference failed for: r1v4, types: [androidx.lifecycle.LiveDataScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7, types: [androidx.lifecycle.LiveDataScope] */
        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            Object l5;
            Object m6444constructorimpl;
            ?? r12;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            try {
            } catch (Exception e5) {
                d1.a aVar = d1.Companion;
                m6444constructorimpl = d1.m6444constructorimpl(e1.a(e5));
                r12 = i5;
            }
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        e1.n(obj);
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r13 = (LiveDataScope) this.L$0;
                e1.n(obj);
                i5 = r13;
            } else {
                e1.n(obj);
                ?? r14 = (LiveDataScope) this.L$0;
                v3.l<kotlin.coroutines.d<? super d1<? extends T>>, Object> lVar = this.$block;
                this.L$0 = r14;
                this.label = 1;
                obj = lVar.invoke(this);
                i5 = r14;
                if (obj == l5) {
                    return l5;
                }
            }
            m6444constructorimpl = ((d1) obj).m6453unboximpl();
            r12 = i5;
            d1 m6443boximpl = d1.m6443boximpl(m6444constructorimpl);
            this.L$0 = null;
            this.label = 2;
            if (r12.emit(m6443boximpl, this) == l5) {
                return l5;
            }
            return r2.f19517a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        f14833f = httpLoggingInterceptor;
        f14834g = 8;
    }

    private c() {
    }

    public static /* synthetic */ Object d(c cVar, Class cls, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return cVar.c(cls, i5);
    }

    private final OkHttpClient f(int i5) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new w2.a(i5));
        builder.connectTimeout(6L, TimeUnit.SECONDS);
        builder.addInterceptor(new w2.b()).hostnameVerifier(new HostnameVerifier() { // from class: com.yuanqi.master.network.b
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                boolean g5;
                g5 = c.g(str, sSLSession);
                return g5;
            }
        });
        return OkHttp3Instrumentation.build(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(String str, SSLSession sSLSession) {
        return true;
    }

    private final Retrofit h(int i5) {
        String str;
        Retrofit.Builder builder = new Retrofit.Builder();
        if (i5 != 1) {
            if (i5 != 2) {
                str = f14830c;
            } else {
                str = f14832e;
            }
        } else {
            str = f14831d;
        }
        return builder.baseUrl(str).client(f(i5)).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public final /* synthetic */ <T> T b() {
        l0.y(4, "T");
        return (T) d(this, Object.class, 0, 2, null);
    }

    public final <T> T c(@l Class<T> serviceClass, int i5) {
        l0.p(serviceClass, "serviceClass");
        return (T) h(i5).create(serviceClass);
    }

    @l
    public final <T> LiveData<d1<T>> e(@l g context, @l v3.l<? super kotlin.coroutines.d<? super d1<? extends T>>, ? extends Object> block) {
        l0.p(context, "context");
        l0.p(block, "block");
        return CoroutineLiveDataKt.liveData$default(context, 0L, new a(block, null), 2, (Object) null);
    }
}
