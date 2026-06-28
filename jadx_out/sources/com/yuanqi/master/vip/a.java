package com.yuanqi.master.vip;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alipay.sdk.app.PayTask;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.yqtech.multiapp.R;
import com.yuanqi.master.network.model.ResultModel;
import com.yuanqi.master.network.repository.h;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.v0;
import java.util.Map;
import kotlin.coroutines.jvm.internal.o;
import kotlin.d0;
import kotlin.e1;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.json.JSONObject;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JB\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\f0\u001dJB\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\f0\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006 "}, d2 = {"Lcom/yuanqi/master/vip/VipManager;", "", "()V", "SDK_PAY_FLAG", "", "getSDK_PAY_FLAG", "()I", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "buyVipByAliPay", "", com.umeng.analytics.pro.d.X, "Landroid/app/Activity;", "orderInfo", "", "backHandler", "Landroid/os/Handler;", "buyVipByWechat", "dataStr", "msgApi", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "createOrderByAli", "isChooseYear", "", "action", "Lkotlin/Function0;", "failedAction", "Lkotlin/Function1;", "createOrderByWX", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @l
    public static final b f15295c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f15296d = 8;

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final d0<a> f15297e;

    /* renamed from: a, reason: collision with root package name */
    private final int f15298a = 1001;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final s0 f15299b = t0.a(k1.c());

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yuanqi/master/vip/VipManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.vip.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0435a extends n0 implements v3.a<a> {
        public static final C0435a INSTANCE = new C0435a();

        C0435a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @l
        public final a invoke() {
            return new a();
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/vip/VipManager$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/vip/VipManager;", "getInstance", "()Lcom/yuanqi/master/vip/VipManager;", "instance$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        @l
        public final a a() {
            return (a) a.f15297e.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.vip.VipManager$buyVipByAliPay$1", f = "VipManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Handler $backHandler;
        final /* synthetic */ Activity $context;
        final /* synthetic */ String $orderInfo;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, String str, a aVar, Handler handler, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.$context = activity;
            this.$orderInfo = str;
            this.this$0 = aVar;
            this.$backHandler = handler;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new c(this.$context, this.$orderInfo, this.this$0, this.$backHandler, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                Map<String, String> payV2 = new PayTask(this.$context).payV2(this.$orderInfo, true);
                Message message = new Message();
                message.what = this.this$0.h();
                message.obj = payV2;
                this.$backHandler.sendMessage(message);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/yuanqi/master/network/model/ResultModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements v3.l<ResultModel, r2> {
        final /* synthetic */ v3.a<r2> $action;
        final /* synthetic */ Handler $backHandler;
        final /* synthetic */ Activity $context;
        final /* synthetic */ v3.l<String, r2> $failedAction;
        final /* synthetic */ a this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.vip.VipManager$createOrderByAli$1$1", f = "VipManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.vip.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0436a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ Handler $backHandler;
            final /* synthetic */ Activity $context;
            final /* synthetic */ ResultModel $result;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0436a(a aVar, Activity activity, ResultModel resultModel, Handler handler, kotlin.coroutines.d<? super C0436a> dVar) {
                super(2, dVar);
                this.this$0 = aVar;
                this.$context = activity;
                this.$result = resultModel;
                this.$backHandler = handler;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return new C0436a(this.this$0, this.$context, this.$result, this.$backHandler, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                return ((C0436a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    this.this$0.d(this.$context, String.valueOf(this.$result.getData()), this.$backHandler);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(v3.l<? super String, r2> lVar, v3.a<r2> aVar, a aVar2, Activity activity, Handler handler) {
            super(1);
            this.$failedAction = lVar;
            this.$action = aVar;
            this.this$0 = aVar2;
            this.$context = activity;
            this.$backHandler = handler;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ResultModel resultModel) {
            invoke2(resultModel);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m ResultModel resultModel) {
            if (resultModel == null) {
                this.$failedAction.invoke("创建支付宝订单失败");
            } else {
                this.$action.invoke();
                k.f(this.this$0.i(), k1.e(), null, new C0436a(this.this$0, this.$context, resultModel, this.$backHandler, null), 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements v3.l<String, r2> {
        final /* synthetic */ v3.l<String, r2> $failedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(v3.l<? super String, r2> lVar) {
            super(1);
            this.$failedAction = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l String it) {
            l0.p(it, "it");
            this.$failedAction.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/yuanqi/master/network/model/ResultModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends n0 implements v3.l<ResultModel, r2> {
        final /* synthetic */ v3.a<r2> $action;
        final /* synthetic */ v3.l<String, r2> $failedAction;
        final /* synthetic */ IWXAPI $msgApi;
        final /* synthetic */ a this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.vip.VipManager$createOrderByWX$1$1", f = "VipManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.vip.a$f$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0437a extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ IWXAPI $msgApi;
            final /* synthetic */ ResultModel $result;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0437a(a aVar, ResultModel resultModel, IWXAPI iwxapi, kotlin.coroutines.d<? super C0437a> dVar) {
                super(2, dVar);
                this.this$0 = aVar;
                this.$result = resultModel;
                this.$msgApi = iwxapi;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return new C0437a(this.this$0, this.$result, this.$msgApi, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                return ((C0437a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    this.this$0.e(String.valueOf(this.$result.getData()), this.$msgApi);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(v3.l<? super String, r2> lVar, v3.a<r2> aVar, a aVar2, IWXAPI iwxapi) {
            super(1);
            this.$failedAction = lVar;
            this.$action = aVar;
            this.this$0 = aVar2;
            this.$msgApi = iwxapi;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ResultModel resultModel) {
            invoke2(resultModel);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m ResultModel resultModel) {
            if (resultModel == null) {
                this.$failedAction.invoke("创建微信订单失败");
            } else {
                this.$action.invoke();
                k.f(this.this$0.i(), k1.e(), null, new C0437a(this.this$0, resultModel, this.$msgApi, null), 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends n0 implements v3.l<String, r2> {
        final /* synthetic */ v3.l<String, r2> $failedAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(v3.l<? super String, r2> lVar) {
            super(1);
            this.$failedAction = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l String it) {
            l0.p(it, "it");
            this.$failedAction.invoke(it);
        }
    }

    static {
        d0<a> b5;
        b5 = f0.b(h0.SYNCHRONIZED, C0435a.INSTANCE);
        f15297e = b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Activity activity, String str, Handler handler) {
        k.f(this.f15299b, k1.c(), null, new c(activity, str, this, handler, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(String str, IWXAPI iwxapi) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            PayReq payReq = new PayReq();
            payReq.appId = com.yuanqi.master.config.c.f14520a0;
            payReq.partnerId = com.yuanqi.master.config.c.f14522b0;
            payReq.prepayId = jSONObject.getString("prepayid");
            payReq.packageValue = "Sign=WXPay";
            payReq.nonceStr = jSONObject.getString("noncestr");
            payReq.timeStamp = jSONObject.getString("timestamp");
            payReq.sign = jSONObject.getString("sign");
            iwxapi.sendReq(payReq);
        } catch (Exception unused) {
        }
    }

    public final void f(@l Activity context, boolean z4, @l Handler backHandler, @l v3.a<r2> action, @l v3.l<? super String, r2> failedAction) {
        String str;
        l0.p(context, "context");
        l0.p(backHandler, "backHandler");
        l0.p(action, "action");
        l0.p(failedAction, "failedAction");
        if (z4) {
            str = "aliPay";
        } else {
            str = "aliPayByMonth";
        }
        f1.b(h.f14855g.g(str), new d(failedAction, action, this, context, backHandler), new e(failedAction));
    }

    public final void g(@l Activity context, boolean z4, @l IWXAPI msgApi, @l v3.a<r2> action, @l v3.l<? super String, r2> failedAction) {
        String str;
        l0.p(context, "context");
        l0.p(msgApi, "msgApi");
        l0.p(action, "action");
        l0.p(failedAction, "failedAction");
        if (!v0.f15260a.h("com.tencent.mm", context)) {
            String string = context.getString(R.string.no_wechat);
            l0.o(string, "getString(...)");
            f1.r(string, 0, 2, null);
            action.invoke();
            return;
        }
        if (z4) {
            str = "wxPay";
        } else {
            str = "wxPayByMonth";
        }
        f1.b(h.f14855g.h(str), new f(failedAction, action, this, msgApi), new g(failedAction));
    }

    public final int h() {
        return this.f15298a;
    }

    @l
    public final s0 i() {
        return this.f15299b;
    }
}
