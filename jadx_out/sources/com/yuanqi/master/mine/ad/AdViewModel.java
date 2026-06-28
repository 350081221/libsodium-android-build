package com.yuanqi.master.mine.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdLoadType;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.umeng.analytics.pro.bi;
import com.yqtech.multiapp.R;
import com.yuanqi.master.mine.MineActivity;
import com.yuanqi.master.network.model.BasicResponse;
import com.yuanqi.master.network.repository.h;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.o0;
import com.yuanqi.master.tools.y0;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.x0;
import kotlin.k;
import kotlin.r2;
import kotlin.reflect.o;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020*H\u0016J\u001a\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u000106H\u0016J4\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\u00102\b\u0010:\u001a\u0004\u0018\u00010\u00062\u0006\u0010;\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010=\u001a\u00020*2\b\u0010>\u001a\u0004\u0018\u00010!H\u0016J\b\u0010?\u001a\u00020*H\u0017J\u0012\u0010?\u001a\u00020*2\b\u0010>\u001a\u0004\u0018\u00010!H\u0016J\b\u0010@\u001a\u00020*H\u0016J\b\u0010A\u001a\u00020*H\u0016J\b\u0010B\u001a\u00020*H\u0016J\b\u0010C\u001a\u00020*H\u0002J\u0012\u0010D\u001a\u00020*2\b\b\u0002\u00101\u001a\u00020\u0006H\u0002J\b\u0010E\u001a\u00020*H\u0002J\u0006\u0010F\u001a\u00020*J\u0016\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\"8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006K"}, d2 = {"Lcom/yuanqi/master/mine/ad/AdViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;", "Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;", "()V", "TAG", "", "adRewardSlot", "Lcom/bytedance/sdk/openadsdk/AdSlot;", "mContext", "Landroid/app/Activity;", "mIsRewardValid", "", "mScope", "Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "", "showAdNum", "getShowAdNum", "()I", "setShowAdNum", "(I)V", "showAdNum$delegate", "Lcom/yuanqi/master/tools/MVFast;", "showAdNumNoLogin", "getShowAdNumNoLogin", "setShowAdNumNoLogin", "showAdNumNoLogin$delegate", "ttAdManager", "Lcom/bytedance/sdk/openadsdk/TTAdManager;", "ttAdNative", "Lcom/bytedance/sdk/openadsdk/TTAdNative;", "ttRewardVideoAd", "Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;", "", "vipTimeNoLogin", "getVipTimeNoLogin", "()J", "setVipTimeNoLogin", "(J)V", "vipTimeNoLogin$delegate", "dismissProgress", "", "giveVip", "onAdClose", "onAdShow", "onAdVideoBarClick", "onError", PluginConstants.KEY_ERROR_CODE, "msg", "onRewardArrived", "isRewardValid", MediationConstant.KEY_REWARD_TYPE, MediationConstant.KEY_EXTRA_INFO, "Landroid/os/Bundle;", "onRewardVerify", "p0", "p1", "p2", "p3", "p4", "onRewardVideoAdLoad", bi.az, "onRewardVideoCached", "onSkippedVideo", "onVideoComplete", "onVideoError", "showAdTipsDialog", "showProgress", "showRewardAd", "showTwoAds", "showVipTips", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "tipType", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class AdViewModel extends ViewModel implements TTAdNative.RewardVideoAdListener, TTRewardVideoAd.RewardAdInteractionListener {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f14806l = {l1.k(new x0(AdViewModel.class, "showAdNum", "getShowAdNum()I", 0)), l1.k(new x0(AdViewModel.class, "showAdNumNoLogin", "getShowAdNumNoLogin()I", 0)), l1.k(new x0(AdViewModel.class, "vipTimeNoLogin", "getVipTimeNoLogin()J", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final int f14807m = 8;

    /* renamed from: a, reason: collision with root package name */
    @l
    private final String f14808a = "AdViewModel";

    /* renamed from: b, reason: collision with root package name */
    @l
    private final TTAdManager f14809b;

    /* renamed from: c, reason: collision with root package name */
    private TTAdNative f14810c;

    /* renamed from: d, reason: collision with root package name */
    private AdSlot f14811d;

    /* renamed from: e, reason: collision with root package name */
    @m
    private TTRewardVideoAd f14812e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private final com.yuanqi.master.tools.x0 f14813f;

    /* renamed from: g, reason: collision with root package name */
    @l
    private final com.yuanqi.master.tools.x0 f14814g;

    /* renamed from: h, reason: collision with root package name */
    @l
    private final com.yuanqi.master.tools.x0 f14815h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14816i;

    /* renamed from: j, reason: collision with root package name */
    @l
    private s0 f14817j;

    /* renamed from: k, reason: collision with root package name */
    private Activity f14818k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/BasicResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends n0 implements v3.l<BasicResponse, r2> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.ad.AdViewModel$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0412a extends n0 implements v3.a<r2> {
            public static final C0412a INSTANCE = new C0412a();

            C0412a() {
                super(0);
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        a() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BasicResponse basicResponse) {
            invoke2(basicResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m BasicResponse basicResponse) {
            AdViewModel.this.f();
            if (basicResponse != null) {
                if (basicResponse.getCode() == 200) {
                    f1.r("已获取VIP奖励", 0, 2, null);
                    AdViewModel.this.k(0);
                    com.yuanqi.master.mine.account.a.f14786a.n(AdViewModel.this.f14817j, C0412a.INSTANCE);
                    return;
                }
                f1.r(basicResponse.getMsg(), 0, 2, null);
                return;
            }
            f1.r("赠送VIP失败，请检查网络", 0, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements v3.l<String, r2> {
        b() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l String it) {
            l0.p(it, "it");
            AdViewModel.this.f();
            f1.r(it, 0, 2, null);
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends n0 implements v3.a<r2> {
        c() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AdViewModel.this.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.ad.AdViewModel$showTwoAds$1", f = "AdViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return new d(dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                AdViewModel.p(AdViewModel.this, null, 1, null);
                y0 y0Var = y0.f15274a;
                Activity activity = AdViewModel.this.f14818k;
                if (activity == null) {
                    l0.S("mContext");
                    activity = null;
                }
                if (!y0Var.a(activity)) {
                    AdViewModel.this.f();
                    Activity activity2 = AdViewModel.this.f14818k;
                    if (activity2 == null) {
                        l0.S("mContext");
                        activity2 = null;
                    }
                    String string = activity2.getString(R.string.no_network);
                    l0.o(string, "getString(...)");
                    f1.r(string, 0, 2, null);
                    return r2.f19517a;
                }
                if (!com.yuanqi.master.config.c.e()) {
                    AdViewModel.this.f();
                    return r2.f19517a;
                }
                AdViewModel.this.q();
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class e extends n0 implements v3.a<r2> {
        e() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AdViewModel.this.r();
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class f extends n0 implements v3.a<r2> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Context context = this.$context;
            Intent intent = new Intent(this.$context, (Class<?>) MineActivity.class);
            if (com.yuanqi.master.mine.account.a.f14786a.c()) {
                intent.putExtra("screen", com.yuanqi.master.mine.c.f14825g);
            } else {
                intent.putExtra("register", 1);
            }
            context.startActivity(intent);
        }
    }

    public AdViewModel() {
        TTAdManager adManager = TTAdSdk.getAdManager();
        l0.o(adManager, "getAdManager(...)");
        this.f14809b = adManager;
        this.f14813f = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.F, 0);
        this.f14814g = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.G, 0);
        this.f14815h = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.H, 0L);
        this.f14817j = t0.a(k1.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        o0.f15213a.K();
    }

    private final int g() {
        return ((Number) this.f14813f.getValue(this, f14806l[0])).intValue();
    }

    private final int h() {
        return ((Number) this.f14814g.getValue(this, f14806l[1])).intValue();
    }

    private final long i() {
        return ((Number) this.f14815h.getValue(this, f14806l[2])).longValue();
    }

    private final void j() {
        if (com.yuanqi.master.mine.account.a.f14786a.c()) {
            o("正在赠送VIP...");
            f1.b(h.f14855g.j(), new a(), new b());
        } else {
            long currentTimeMillis = System.currentTimeMillis() + 86400000;
            l(0);
            m(currentTimeMillis);
            f1.r("已获取VIP奖励", 0, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int i5) {
        this.f14813f.setValue(this, f14806l[0], Integer.valueOf(i5));
    }

    private final void l(int i5) {
        this.f14814g.setValue(this, f14806l[1], Integer.valueOf(i5));
    }

    private final void m(long j5) {
        this.f14815h.setValue(this, f14806l[2], Long.valueOf(j5));
    }

    private final void n() {
        int h5;
        if (com.yuanqi.master.mine.account.a.f14786a.c()) {
            h5 = g();
        } else {
            h5 = h();
        }
        o0 o0Var = o0.f15213a;
        Activity activity = this.f14818k;
        Activity activity2 = null;
        if (activity == null) {
            l0.S("mContext");
            activity = null;
        }
        Activity activity3 = this.f14818k;
        if (activity3 == null) {
            l0.S("mContext");
            activity3 = null;
        }
        String string = activity3.getString(R.string.warn_tip);
        l0.o(string, "getString(...)");
        String str = "今日已看 " + h5 + " 个广告，再看 " + (2 - h5) + " 个广告可获取一天VIP。";
        Activity activity4 = this.f14818k;
        if (activity4 == null) {
            l0.S("mContext");
        } else {
            activity2 = activity4;
        }
        String string2 = activity2.getString(R.string.cancel_msg);
        l0.o(string2, "getString(...)");
        o0.Y(o0Var, activity, string, str, string2, "下一个", false, false, false, false, null, null, null, new c(), 4064, null);
    }

    private final void o(String str) {
        o0 o0Var = o0.f15213a;
        Activity activity = this.f14818k;
        if (activity == null) {
            l0.S("mContext");
            activity = null;
        }
        o0Var.x0(activity, str);
    }

    static /* synthetic */ void p(AdViewModel adViewModel, String str, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgress");
        }
        if ((i5 & 1) != 0) {
            Activity activity = adViewModel.f14818k;
            if (activity == null) {
                l0.S("mContext");
                activity = null;
            }
            str = activity.getString(R.string.progress_msg);
            l0.o(str, "getString(...)");
        }
        adViewModel.o(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        AdSlot adSlot = null;
        p(this, null, 1, null);
        this.f14816i = false;
        AdSlot build = new AdSlot.Builder().setCodeId(com.yuanqi.master.config.c.f14526d0).setAdLoadType(TTAdLoadType.LOAD).build();
        l0.o(build, "build(...)");
        this.f14811d = build;
        TTAdNative tTAdNative = this.f14810c;
        if (tTAdNative == null) {
            l0.S("ttAdNative");
            tTAdNative = null;
        }
        AdSlot adSlot2 = this.f14811d;
        if (adSlot2 == null) {
            l0.S("adRewardSlot");
        } else {
            adSlot = adSlot2;
        }
        tTAdNative.loadRewardVideoAd(adSlot, this);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onAdClose() {
        if (this.f14816i) {
            if (g() == 2 || h() == 2) {
                j();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onAdShow() {
        Log.d(this.f14808a, "onAdShow");
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onAdVideoBarClick() {
        Log.d(this.f14808a, "onAdVideoBarClick");
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onError(int i5, @m String str) {
        f();
        Log.d(this.f14808a, "onError: code = " + i5 + " msg = " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onRewardArrived(boolean z4, int i5, @m Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onRewardVerify(boolean z4, int i5, @m String str, int i6, @m String str2) {
        Log.d(this.f14808a, "onRewardVerify");
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onRewardVideoAdLoad(@m TTRewardVideoAd tTRewardVideoAd) {
        Log.d(this.f14808a, "onRewardVideoAdLoad");
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    @k(message = "Deprecated in Java")
    public void onRewardVideoCached() {
        Log.d(this.f14808a, "onRewardVideoCached");
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onSkippedVideo() {
        Log.d(this.f14808a, "onSkippedVideo");
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onVideoComplete() {
        Log.d(this.f14808a, "onVideoComplete");
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onVideoError() {
        Log.d(this.f14808a, "onVideoError");
    }

    public final void r() {
        kotlinx.coroutines.k.f(this.f14817j, k1.e(), null, new d(null), 2, null);
    }

    public final void s(@l Context context, int i5) {
        String string;
        l0.p(context, "context");
        if (i5 != 1) {
            if (i5 != 2) {
                string = context.getString(R.string.activate_vip_tip_1);
            } else {
                string = context.getString(R.string.activate_vip_tip_2);
            }
        } else {
            string = context.getString(R.string.activate_vip_tip_1);
        }
        String str = string;
        l0.m(str);
        o0 o0Var = o0.f15213a;
        String string2 = context.getString(R.string.warn_tip);
        l0.o(string2, "getString(...)");
        String string3 = context.getString(R.string.look_ad);
        l0.o(string3, "getString(...)");
        String string4 = context.getString(R.string.activate_vip);
        l0.o(string4, "getString(...)");
        o0.Y(o0Var, context, string2, str, string3, string4, false, false, false, false, null, new e(), null, new f(context), 3040, null);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onRewardVideoCached(@m TTRewardVideoAd tTRewardVideoAd) {
        try {
            f();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f14812e = tTRewardVideoAd;
        if (tTRewardVideoAd != null) {
            tTRewardVideoAd.setRewardAdInteractionListener(this);
        }
        TTRewardVideoAd tTRewardVideoAd2 = this.f14812e;
        if (tTRewardVideoAd2 != null) {
            Activity activity = this.f14818k;
            if (activity == null) {
                l0.S("mContext");
                activity = null;
            }
            tTRewardVideoAd2.showRewardVideoAd(activity);
        }
    }
}
