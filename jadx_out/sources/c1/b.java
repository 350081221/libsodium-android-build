package c1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.ConditionVariable;
import android.text.TextUtils;
import c1.a;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class b {

    /* loaded from: classes2.dex */
    public static class a implements a.InterfaceC0080a<Object, Boolean> {
        @Override // c1.a.InterfaceC0080a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* renamed from: c1.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class CallableC0081b implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f700a;

        public CallableC0081b(Context context) {
            this.f700a = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return q.c.a(this.f700a);
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements a.InterfaceC0080a<Object, Boolean> {
        @Override // c1.a.InterfaceC0080a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof NetworkInfo) || obj == null);
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements Callable<NetworkInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f701a;

        public d(Context context) {
            this.f701a = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NetworkInfo call() {
            return ((ConnectivityManager) this.f701a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements a.InterfaceC0080a<Object, Boolean> {
        @Override // c1.a.InterfaceC0080a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* loaded from: classes2.dex */
    public static class f implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f702a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0.a f703b;

        public f(Context context, y0.a aVar) {
            this.f702a = context;
            this.f703b = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            try {
                return p0.a.c(this.f702a);
            } catch (Throwable th) {
                i0.a.i(this.f703b, i0.b.f16163o, i0.b.f16175u, th.getClass().getName());
                return "";
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements a.InterfaceC0080a<Object, Boolean> {
        @Override // c1.a.InterfaceC0080a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* loaded from: classes2.dex */
    public static class h implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f704a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f705b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f706c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y0.a f707d;

        /* loaded from: classes2.dex */
        public class a implements APSecuritySdk.InitResultListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f708a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConditionVariable f709b;

            public a(String[] strArr, ConditionVariable conditionVariable) {
                this.f708a = strArr;
                this.f709b = conditionVariable;
            }

            @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
            public void onResult(APSecuritySdk.TokenResult tokenResult) {
                if (tokenResult != null) {
                    this.f708a[0] = tokenResult.apdidToken;
                }
                this.f709b.open();
            }
        }

        public h(String str, String str2, Context context, y0.a aVar) {
            this.f704a = str;
            this.f705b = str2;
            this.f706c = context;
            this.f707d = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            HashMap hashMap = new HashMap();
            hashMap.put("tid", this.f704a);
            hashMap.put(k0.b.f19026g, this.f705b);
            String[] strArr = {""};
            try {
                APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.f706c);
                ConditionVariable conditionVariable = new ConditionVariable();
                aPSecuritySdk.initToken(0, hashMap, new a(strArr, conditionVariable));
                conditionVariable.block(a1.b.f90a);
            } catch (Throwable th) {
                a1.e.d(th);
                i0.a.i(this.f707d, i0.b.f16163o, i0.b.f16169r, th.getClass().getName());
            }
            if (TextUtils.isEmpty(strArr[0])) {
                i0.a.i(this.f707d, i0.b.f16163o, i0.b.f16171s, "missing token");
            }
            return strArr[0];
        }
    }

    public static NetworkInfo a(y0.a aVar, Context context) {
        Context a5 = c1.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (NetworkInfo) c1.a.c(2, 10L, timeUnit, new c(), new d(a5), false, 10L, timeUnit, aVar, false);
    }

    public static String b(y0.a aVar, Context context, String str, String str2) {
        Context a5 = c1.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (String) c1.a.c(4, 10L, timeUnit, new g(), new h(str, str2, a5, aVar), true, 3L, timeUnit, aVar, true);
    }

    public static String c(y0.a aVar, Context context) {
        if (!m0.a.J().E()) {
            return "";
        }
        return (String) c1.a.c(1, 1L, TimeUnit.DAYS, new a(), new CallableC0081b(c1.a.a(context)), true, 200L, TimeUnit.MILLISECONDS, aVar, true);
    }

    public static String d(y0.a aVar, Context context) {
        return (String) c1.a.c(3, 1L, TimeUnit.DAYS, new e(), new f(c1.a.a(context), aVar), true, 3L, TimeUnit.SECONDS, aVar, false);
    }
}
