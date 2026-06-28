package com.yuanqi.master.mine;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.yqtech.multiapp.R;
import com.yuanqi.master.network.model.BaseResult;
import com.yuanqi.master.network.model.BasicResponse;
import com.yuanqi.master.network.model.LoginResponse;
import com.yuanqi.master.network.model.ResultModel;
import com.yuanqi.master.network.model.ShareListData;
import com.yuanqi.master.network.model.UserInfoData;
import com.yuanqi.master.network.model.request.LoginUserInfoRequest;
import com.yuanqi.master.network.model.response.EditResponse;
import com.yuanqi.master.network.model.response.GenInvCodeResponse;
import com.yuanqi.master.network.model.response.LoginUserInfoResponse;
import com.yuanqi.master.network.model.response.ShareListResponse;
import com.yuanqi.master.network.model.response.UserInfo;
import com.yuanqi.master.network.model.response.VipMealData;
import com.yuanqi.master.network.model.response.VipMealResponse;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.w0;
import com.yuanqi.master.tools.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.e1;
import kotlin.jvm.internal.l1;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k1;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010F\u001a\u00020GJ,\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ$\u0010N\u001a\u00020G2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u00142\f\u0010R\u001a\b\u0012\u0004\u0012\u00020G0MJ\u0016\u0010S\u001a\u00020G2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u0014J\u0014\u0010T\u001a\u00020G2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ4\u0010U\u001a\u00020G2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00142\u0006\u0010X\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ\u001c\u0010Y\u001a\u00020G2\u0006\u0010Z\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ<\u0010[\u001a\u00020G2\u0006\u0010I\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00142\u0006\u0010X\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ,\u0010^\u001a\u00020G2\u0006\u0010]\u001a\u00020\u00142\u0006\u0010X\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ\u001e\u0010_\u001a\u00020G2\u0006\u0010`\u001a\u00020a2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MH\u0002J,\u0010b\u001a\u00020G2\u0006\u0010O\u001a\u00020c2\u0006\u0010d\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ\u0010\u0010e\u001a\u00020G2\u0006\u0010f\u001a\u00020gH\u0002J\u000e\u0010h\u001a\u00020G2\u0006\u0010O\u001a\u00020PJ$\u0010i\u001a\u00020G2\u0006\u0010j\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ$\u0010k\u001a\u00020G2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ\u0006\u0010l\u001a\u00020GJ\u0006\u0010m\u001a\u00020GJ\u0006\u0010n\u001a\u00020GJ$\u0010o\u001a\u00020G2\u0006\u0010j\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ$\u0010p\u001a\u00020G2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\f\u0010L\u001a\b\u0012\u0004\u0012\u00020G0MJ\"\u0010q\u001a\u00020G2\u0006\u0010X\u001a\u00020\u00042\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020G0rJ\b\u0010s\u001a\u00020GH\u0002J\u0010\u0010t\u001a\u00020G2\u0006\u0010u\u001a\u00020\u0004H\u0002J\u000e\u0010v\u001a\u00020G2\u0006\u0010w\u001a\u00020\u0004J\u000e\u0010x\u001a\u00020G2\u0006\u0010w\u001a\u00020\u0004J\u000e\u0010y\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u0004J\u000e\u0010z\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004J\u000e\u0010{\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u0004J\u000e\u0010|\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010}\u001a\u00020\u00042\u0006\u0010~\u001a\u00020\u0004J\u0018\u0010}\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u00042\u0006\u0010\u007f\u001a\u00020\u0014H\u0002J\u000f\u0010\u0080\u0001\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u0004J\u000f\u0010\u0081\u0001\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R+\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020807¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0012R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0012R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0012R\u0019\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0\u0010¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0012R\u0019\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0\u0010¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0012¨\u0006\u0083\u0001"}, d2 = {"Lcom/yuanqi/master/mine/MineViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "editType", "", "getEditType", "()Ljava/lang/String;", "setEditType", "(Ljava/lang/String;)V", "forgetType", "", "getForgetType", "()I", "setForgetType", "(I)V", "invCode", "Landroidx/compose/runtime/MutableState;", "getInvCode", "()Landroidx/compose/runtime/MutableState;", "isHomeToVip", "", "()Z", "setHomeToVip", "(Z)V", "loginStatus", "getLoginStatus", "()Ljava/lang/Boolean;", "setLoginStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "msgApi", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "navHostController", "Landroidx/navigation/NavHostController;", "getNavHostController", "()Landroidx/navigation/NavHostController;", "setNavHostController", "(Landroidx/navigation/NavHostController;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "shareCodeKey", "getShareCodeKey", "setShareCodeKey", "shareCodeKey$delegate", "Lcom/yuanqi/master/tools/MVFast;", "shareList", "", "Lcom/yuanqi/master/network/model/ShareListData;", "getShareList", "()Ljava/util/List;", "showLoadMsg", "getShowLoadMsg", "showLoading", "getShowLoading", "showProgress", "getShowProgress", "vipMonth", "Lcom/yuanqi/master/network/model/response/VipMealData;", "getVipMonth", "vipYear", "getVipYear", "backAccount", "", "bulkRegistration", "userName", HintConstants.AUTOFILL_HINT_PHONE, PluginConstants.KEY_ERROR_CODE, "action", "Lkotlin/Function0;", "buyVipByAli", com.umeng.analytics.pro.d.X, "Landroid/app/Activity;", "isChooseYear", "successAction", "buyVipByWX", "deleteAccount", "editPwd", "newPwd", "userPhone", "phoneOrEmail", "editUserName", "useName", "forgetPwd", "pwd", "usePhone", "forgetUname", "loginByUserId", "userId", "", "loginPlus", "Landroid/content/Context;", ServiceManagerNative.ACCOUNT, "loginSuccess", "result", "Lcom/yuanqi/master/network/model/response/EditResponse;", "registerIWXAPI", "requestChangeEmail", NotificationCompat.CATEGORY_EMAIL, "requestChangePhone", "requestInviteCode", "requestShareList", "requestVIPMeal", "requestValidOldEmail", "requestValidOldPhone", "sendCodePlus", "Lkotlin/Function1;", "sendShareCode", "setSuccess", "token", "showMsg", "msg", "showShort", "verifyAccount", "verifyCode", "verifyEmail", "verifyPhone", "verifyPhoneOrEmail", "input", "isPhone", "verifyPwd", "verifyUname", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MineViewModel extends ViewModel {

    /* renamed from: t, reason: collision with root package name */
    @p4.l
    private static final kotlin.d0<MineViewModel> f14767t;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final x0 f14768a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private Boolean f14769b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14770c;

    /* renamed from: d, reason: collision with root package name */
    private int f14771d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private String f14772e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14773f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14774g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private final MutableState<String> f14775h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private final kotlinx.coroutines.s0 f14776i;

    /* renamed from: j, reason: collision with root package name */
    @p4.m
    private IWXAPI f14777j;

    /* renamed from: k, reason: collision with root package name */
    @p4.m
    private Handler f14778k;

    /* renamed from: l, reason: collision with root package name */
    @p4.l
    private final MutableState<String> f14779l;

    /* renamed from: m, reason: collision with root package name */
    @p4.l
    private final MutableState<VipMealData> f14780m;

    /* renamed from: n, reason: collision with root package name */
    @p4.l
    private final MutableState<VipMealData> f14781n;

    /* renamed from: o, reason: collision with root package name */
    @p4.l
    private final List<ShareListData> f14782o;

    /* renamed from: p, reason: collision with root package name */
    @p4.m
    private NavHostController f14783p;

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f14765r = {l1.k(new kotlin.jvm.internal.x0(MineViewModel.class, "shareCodeKey", "getShareCodeKey()Ljava/lang/String;", 0))};

    /* renamed from: q, reason: collision with root package name */
    @p4.l
    public static final b f14764q = new b(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f14766s = 8;

    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yuanqi/master/mine/MineViewModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.n0 implements v3.a<MineViewModel> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final MineViewModel invoke() {
            return new MineViewModel(null);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/BaseResult;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a0 extends kotlin.jvm.internal.n0 implements v3.l<BaseResult<Object>, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            public static final a INSTANCE = new a();

            a() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BaseResult<Object> baseResult) {
            invoke2(baseResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m BaseResult<Object> baseResult) {
            MineViewModel.this.x().setValue(Boolean.FALSE);
            if (baseResult == null) {
                return;
            }
            if (baseResult.getCode() == 200) {
                MineViewModel mineViewModel = MineViewModel.this;
                String msg = baseResult.getMsg();
                kotlin.jvm.internal.l0.m(msg);
                mineViewModel.X(msg);
                com.yuanqi.master.mine.account.a.f14786a.n(MineViewModel.this.t(), a.INSTANCE);
                this.$action.invoke();
                return;
            }
            MineViewModel mineViewModel2 = MineViewModel.this;
            String msg2 = baseResult.getMsg();
            kotlin.jvm.internal.l0.m(msg2);
            mineViewModel2.X(msg2);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/mine/MineViewModel$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/mine/MineViewModel;", "getInstance", "()Lcom/yuanqi/master/mine/MineViewModel;", "instance$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final MineViewModel a() {
            return (MineViewModel) MineViewModel.f14767t.getValue();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b0 extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        b0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel.this.X(it);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.MineViewModel$backAccount$1", f = "MineViewModel.kt", i = {0}, l = {938}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.MineViewModel$backAccount$1$1", f = "MineViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
            int label;
            final /* synthetic */ MineViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.this$0 = mineViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new a(this.this$0, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    com.yuanqi.master.tools.o0.f15213a.K();
                    NavHostController s5 = this.this$0.s();
                    if (s5 != null) {
                        NavController.navigate$default(s5, com.yuanqi.master.mine.c.f14826h, null, null, 6, null);
                    }
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            kotlinx.coroutines.s0 s0Var;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    kotlinx.coroutines.s0 s0Var2 = (kotlinx.coroutines.s0) this.L$0;
                    e1.n(obj);
                    s0Var = s0Var2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                kotlinx.coroutines.s0 s0Var3 = (kotlinx.coroutines.s0) this.L$0;
                this.L$0 = s0Var3;
                this.label = 1;
                if (d1.b(1000L, this) == l5) {
                    return l5;
                }
                s0Var = s0Var3;
            }
            kotlinx.coroutines.k.f(s0Var, k1.e(), null, new a(MineViewModel.this, null), 2, null);
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/response/GenInvCodeResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c0 extends kotlin.jvm.internal.n0 implements v3.l<GenInvCodeResponse, r2> {
        c0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(GenInvCodeResponse genInvCodeResponse) {
            invoke2(genInvCodeResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m GenInvCodeResponse genInvCodeResponse) {
            if (genInvCodeResponse != null) {
                MineViewModel.this.p().setValue(genInvCodeResponse.getInvCode());
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/BaseResult;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.n0 implements v3.l<BaseResult<Object>, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BaseResult<Object> baseResult) {
            invoke2(baseResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m BaseResult<Object> baseResult) {
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel mineViewModel = MineViewModel.this;
            String msg = baseResult != null ? baseResult.getMsg() : null;
            kotlin.jvm.internal.l0.m(msg);
            mineViewModel.X(msg);
            boolean z4 = false;
            if (baseResult != null && baseResult.getCode() == 200) {
                z4 = true;
            }
            if (z4) {
                this.$action.invoke();
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class d0 extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        d0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class e extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        e() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/response/ShareListResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class e0 extends kotlin.jvm.internal.n0 implements v3.l<ShareListResponse, r2> {
        e0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ShareListResponse shareListResponse) {
            invoke2(shareListResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m ShareListResponse shareListResponse) {
            if (shareListResponse != null && shareListResponse.getCode() == 200 && (!shareListResponse.getData().isEmpty())) {
                MineViewModel.this.v().addAll(shareListResponse.getData());
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/yuanqi/master/mine/MineViewModel$buyVipByAli$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends Handler {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.a<r2> f14785b;

        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ v3.a<r2> $successAction;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v3.a<r2> aVar) {
                super(0);
                this.$successAction = aVar;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$successAction.invoke();
            }
        }

        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        static final class b extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            public static final b INSTANCE = new b();

            b() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(v3.a<r2> aVar, Looper looper) {
            super(looper);
            this.f14785b = aVar;
        }

        @Override // android.os.Handler
        public void handleMessage(@p4.l Message msg) {
            kotlin.jvm.internal.l0.p(msg, "msg");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            if (msg.what == 1001) {
                Object obj = msg.obj;
                kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
                HashMap hashMap = (HashMap) obj;
                if (kotlin.jvm.internal.l0.g(String.valueOf(hashMap.get(a1.l.f146a)), "9000")) {
                    MineViewModel.this.Y("购买成功");
                    com.yuanqi.master.mine.account.a.f14786a.n(MineViewModel.this.t(), new a(this.f14785b));
                }
                if (kotlin.jvm.internal.l0.g(String.valueOf(hashMap.get(a1.l.f146a)), "6001")) {
                    MineViewModel.this.Y(String.valueOf(hashMap.get(a1.l.f147b)));
                    com.yuanqi.master.mine.account.a.f14786a.n(MineViewModel.this.t(), b.INSTANCE);
                }
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class f0 extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        f0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class g extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        g() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MineViewModel.this.x().setValue(Boolean.FALSE);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", HiAnalyticsConstant.Direction.RESPONSE, "Lcom/yuanqi/master/network/model/response/VipMealResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class g0 extends kotlin.jvm.internal.n0 implements v3.l<VipMealResponse, r2> {
        g0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(VipMealResponse vipMealResponse) {
            invoke2(vipMealResponse);
            return r2.f19517a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m VipMealResponse vipMealResponse) {
            Object y22;
            if (vipMealResponse != null && vipMealResponse.getCode() == 200) {
                if (vipMealResponse.getData().isEmpty()) {
                    MineViewModel.this.X("未获取到VIP套餐信息");
                } else if (vipMealResponse.getData().size() == 2) {
                    MutableState<VipMealData> A = MineViewModel.this.A();
                    y22 = kotlin.collections.e0.y2(vipMealResponse.getData());
                    A.setValue(y22);
                    MineViewModel.this.z().setValue(vipMealResponse.getData().get(1));
                }
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "msg", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class h extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        final /* synthetic */ Activity $context;
        final /* synthetic */ MineViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Activity activity, MineViewModel mineViewModel) {
            super(1);
            this.$context = activity;
            this.this$0 = mineViewModel;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m String str) {
            if (str == null) {
                str = this.$context.getString(R.string.no_network);
                kotlin.jvm.internal.l0.o(str, "getString(...)");
            }
            this.this$0.Y(str);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class h0 extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        h0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class i extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        i() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MineViewModel.this.x().setValue(Boolean.FALSE);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/BaseResult;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class i0 extends kotlin.jvm.internal.n0 implements v3.l<BaseResult<Object>, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BaseResult<Object> baseResult) {
            invoke2(baseResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m BaseResult<Object> baseResult) {
            MineViewModel.this.x().setValue(Boolean.FALSE);
            if (baseResult == null) {
                return;
            }
            if (baseResult.getCode() == 200) {
                MineViewModel.this.X("验证成功");
                this.$action.invoke();
            } else {
                MineViewModel mineViewModel = MineViewModel.this;
                String msg = baseResult.getMsg();
                kotlin.jvm.internal.l0.m(msg);
                mineViewModel.X(msg);
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "msg", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class j extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        final /* synthetic */ Activity $context;
        final /* synthetic */ MineViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Activity activity, MineViewModel mineViewModel) {
            super(1);
            this.$context = activity;
            this.this$0 = mineViewModel;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m String str) {
            if (str == null) {
                str = this.$context.getString(R.string.no_network);
                kotlin.jvm.internal.l0.o(str, "getString(...)");
            }
            this.this$0.X(str);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class j0 extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        j0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class k extends kotlin.jvm.internal.n0 implements v3.l<Object, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.MineViewModel$deleteAccount$1$1", f = "MineViewModel.kt", i = {0}, l = {953}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ v3.a<r2> $action;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.MineViewModel$deleteAccount$1$1$1", f = "MineViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.master.mine.MineViewModel$k$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0370a extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ v3.a<r2> $action;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0370a(v3.a<r2> aVar, kotlin.coroutines.d<? super C0370a> dVar) {
                    super(2, dVar);
                    this.$action = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C0370a(this.$action, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0370a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        this.$action.invoke();
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v3.a<r2> aVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.$action = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.$action, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                kotlinx.coroutines.s0 s0Var;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        kotlinx.coroutines.s0 s0Var2 = (kotlinx.coroutines.s0) this.L$0;
                        e1.n(obj);
                        s0Var = s0Var2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    e1.n(obj);
                    kotlinx.coroutines.s0 s0Var3 = (kotlinx.coroutines.s0) this.L$0;
                    this.L$0 = s0Var3;
                    this.label = 1;
                    if (d1.b(1000L, this) == l5) {
                        return l5;
                    }
                    s0Var = s0Var3;
                }
                kotlinx.coroutines.k.f(s0Var, k1.e(), null, new C0370a(this.$action, null), 2, null);
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
            invoke2(obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m Object obj) {
            MineViewModel.this.X("账号注销成功");
            kotlinx.coroutines.k.f(MineViewModel.this.t(), k1.c(), null, new a(this.$action, null), 2, null);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/BaseResult;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class k0 extends kotlin.jvm.internal.n0 implements v3.l<BaseResult<Object>, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BaseResult<Object> baseResult) {
            invoke2(baseResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m BaseResult<Object> baseResult) {
            MineViewModel.this.x().setValue(Boolean.FALSE);
            if (baseResult == null) {
                return;
            }
            if (baseResult.getCode() == 200) {
                MineViewModel.this.X("验证成功");
                this.$action.invoke();
            } else {
                MineViewModel mineViewModel = MineViewModel.this;
                String msg = baseResult.getMsg();
                kotlin.jvm.internal.l0.m(msg);
                mineViewModel.X(msg);
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class l extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        l() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class l0 extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        l0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/response/EditResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class m extends kotlin.jvm.internal.n0 implements v3.l<EditResponse, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(EditResponse editResponse) {
            invoke2(editResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m EditResponse editResponse) {
            String str;
            boolean z4 = false;
            if (editResponse != null && editResponse.getCode() == 200) {
                z4 = true;
            }
            if (z4) {
                MineViewModel.this.X("修改成功");
                this.$action.invoke();
                return;
            }
            MineViewModel mineViewModel = MineViewModel.this;
            if (editResponse == null || (str = editResponse.getMsg()) == null) {
                str = "解析错误";
            }
            mineViewModel.X(str);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", HiAnalyticsConstant.Direction.RESPONSE, "Lcom/yuanqi/master/network/model/BasicResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class m0 extends kotlin.jvm.internal.n0 implements v3.l<BasicResponse, r2> {
        final /* synthetic */ v3.l<Integer, r2> $action;
        final /* synthetic */ MineViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m0(v3.l<? super Integer, r2> lVar, MineViewModel mineViewModel) {
            super(1);
            this.$action = lVar;
            this.this$0 = mineViewModel;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BasicResponse basicResponse) {
            invoke2(basicResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m BasicResponse basicResponse) {
            if (basicResponse == null) {
                this.$action.invoke(-1);
            } else {
                this.this$0.X(basicResponse.getCode() == 200 ? "发送成功" : basicResponse.getMsg());
                this.$action.invoke(Integer.valueOf(basicResponse.getCode()));
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class n extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        n() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class n0 extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        final /* synthetic */ v3.l<Integer, r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n0(v3.l<? super Integer, r2> lVar) {
            super(1);
            this.$action = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel.this.X(it);
            this.$action.invoke(-1);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/response/EditResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class o extends kotlin.jvm.internal.n0 implements v3.l<EditResponse, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            public static final a INSTANCE = new a();

            a() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(EditResponse editResponse) {
            invoke2(editResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m EditResponse editResponse) {
            String str;
            MineViewModel.this.x().setValue(Boolean.FALSE);
            boolean z4 = false;
            if (editResponse != null && editResponse.getCode() == 200) {
                z4 = true;
            }
            if (z4) {
                MineViewModel.this.X("修改成功");
                MineViewModel.this.E(editResponse);
                this.$action.invoke();
                com.yuanqi.master.mine.account.a.f14786a.n(MineViewModel.this.t(), a.INSTANCE);
                return;
            }
            MineViewModel mineViewModel = MineViewModel.this;
            if (editResponse == null || (str = editResponse.getMsg()) == null) {
                str = "解析错误";
            }
            mineViewModel.X(str);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", HiAnalyticsConstant.Direction.RESPONSE, "Lcom/yuanqi/master/network/model/BasicResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class o0 extends kotlin.jvm.internal.n0 implements v3.l<BasicResponse, r2> {
        final /* synthetic */ v3.l<Integer, r2> $action;
        final /* synthetic */ MineViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o0(v3.l<? super Integer, r2> lVar, MineViewModel mineViewModel) {
            super(1);
            this.$action = lVar;
            this.this$0 = mineViewModel;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BasicResponse basicResponse) {
            invoke2(basicResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m BasicResponse basicResponse) {
            if (basicResponse == null) {
                this.$action.invoke(-1);
            } else {
                this.this$0.X(basicResponse.getCode() == 200 ? "发送成功" : basicResponse.getMsg());
                this.$action.invoke(Integer.valueOf(basicResponse.getCode()));
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class p extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        p() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class p0 extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        final /* synthetic */ v3.l<Integer, r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p0(v3.l<? super Integer, r2> lVar) {
            super(1);
            this.$action = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel.this.X(it);
            this.$action.invoke(-1);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/ResultModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class q extends kotlin.jvm.internal.n0 implements v3.l<ResultModel, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ResultModel resultModel) {
            invoke2(resultModel);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m ResultModel resultModel) {
            String str;
            boolean z4 = false;
            if (resultModel != null && resultModel.getCode() == 200) {
                z4 = true;
            }
            if (z4) {
                MineViewModel.this.X("修改成功");
                this.$action.invoke();
                return;
            }
            MineViewModel mineViewModel = MineViewModel.this;
            if (resultModel == null || (str = resultModel.getMsg()) == null) {
                str = "解析错误";
            }
            mineViewModel.X(str);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/BasicResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class q0 extends kotlin.jvm.internal.n0 implements v3.l<BasicResponse, r2> {
        public static final q0 INSTANCE = new q0();

        q0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BasicResponse basicResponse) {
            invoke2(basicResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m BasicResponse basicResponse) {
            w0.f15264a.f(com.yuanqi.master.config.c.f14552v);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class r extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        r() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class r0 extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        r0() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/ResultModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class s extends kotlin.jvm.internal.n0 implements v3.l<ResultModel, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ResultModel resultModel) {
            invoke2(resultModel);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m ResultModel resultModel) {
            String str;
            boolean z4 = false;
            if (resultModel != null && resultModel.getCode() == 200) {
                z4 = true;
            }
            if (z4) {
                MineViewModel.this.X(resultModel.getMsg());
                this.$action.invoke();
                return;
            }
            MineViewModel mineViewModel = MineViewModel.this;
            if (resultModel == null || (str = resultModel.getMsg()) == null) {
                str = "解析错误";
            }
            mineViewModel.X(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.MineViewModel$showMsg$1", f = "MineViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class s0 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;

        s0(kotlin.coroutines.d<? super s0> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new s0(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((s0) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                this.label = 1;
                if (d1.b(1000L, this) == l5) {
                    return l5;
                }
            }
            MineViewModel.this.x().setValue(kotlin.coroutines.jvm.internal.b.a(false));
            MineViewModel.this.y().setValue(kotlin.coroutines.jvm.internal.b.a(true));
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class t extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        t() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.X(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.MineViewModel$showShort$1", f = "MineViewModel.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class t0 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;

        t0(kotlin.coroutines.d<? super t0> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new t0(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((t0) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                this.label = 1;
                if (d1.b(1000L, this) == l5) {
                    return l5;
                }
            }
            MineViewModel.this.x().setValue(kotlin.coroutines.jvm.internal.b.a(false));
            MineViewModel.this.y().setValue(kotlin.coroutines.jvm.internal.b.a(true));
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/LoginResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class u extends kotlin.jvm.internal.n0 implements v3.l<LoginResponse, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(LoginResponse loginResponse) {
            invoke2(loginResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m LoginResponse loginResponse) {
            if (loginResponse != null) {
                MineViewModel mineViewModel = MineViewModel.this;
                v3.a<r2> aVar = this.$action;
                if (loginResponse.getCode() == 200) {
                    mineViewModel.X("登录成功");
                    mineViewModel.W(loginResponse.getToken());
                    aVar.invoke();
                    return;
                }
                mineViewModel.X(loginResponse.getMsg());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class v extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        v() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class w extends kotlin.jvm.internal.n0 implements v3.l<LoginUserInfoResponse, r2> {
        final /* synthetic */ v3.a<r2> $action;
        final /* synthetic */ Context $context;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "userId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.l<Long, r2> {
            final /* synthetic */ v3.a<r2> $action;
            final /* synthetic */ MineViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MineViewModel mineViewModel, v3.a<r2> aVar) {
                super(1);
                this.this$0 = mineViewModel;
                this.$action = aVar;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
                invoke(l5.longValue());
                return r2.f19517a;
            }

            public final void invoke(long j5) {
                this.this$0.C(j5, this.$action);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(Context context, v3.a<r2> aVar) {
            super(1);
            this.$context = context;
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(LoginUserInfoResponse loginUserInfoResponse) {
            invoke2(loginUserInfoResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m LoginUserInfoResponse loginUserInfoResponse) {
            MineViewModel.this.x().setValue(Boolean.FALSE);
            if (loginUserInfoResponse == null) {
                MineViewModel.this.X("未获取到用户信息，请检查网络后再试");
                return;
            }
            if (loginUserInfoResponse.getCode() != 200) {
                MineViewModel.this.X(loginUserInfoResponse.getMsg());
                return;
            }
            List<UserInfo> data = loginUserInfoResponse.getData();
            if (data == null || data.isEmpty()) {
                MineViewModel.this.X("未获取到用户信息，请检查网络后再试");
            } else if (loginUserInfoResponse.getData().size() > 1) {
                com.yuanqi.master.tools.o0.f15213a.K0(this.$context, loginUserInfoResponse.getData(), new a(MineViewModel.this, this.$action));
            } else {
                MineViewModel.this.C(loginUserInfoResponse.getData().get(0).getUserId(), this.$action);
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class x extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        x() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel.this.X(it);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/BaseResult;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class y extends kotlin.jvm.internal.n0 implements v3.l<BaseResult<Object>, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            public static final a INSTANCE = new a();

            a() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BaseResult<Object> baseResult) {
            invoke2(baseResult);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m BaseResult<Object> baseResult) {
            MineViewModel.this.x().setValue(Boolean.FALSE);
            if (baseResult == null) {
                return;
            }
            if (baseResult.getCode() == 200) {
                MineViewModel.this.X("修改成功");
                com.yuanqi.master.mine.account.a.f14786a.n(MineViewModel.this.t(), a.INSTANCE);
                this.$action.invoke();
            } else {
                MineViewModel mineViewModel = MineViewModel.this;
                String msg = baseResult.getMsg();
                kotlin.jvm.internal.l0.m(msg);
                mineViewModel.X(msg);
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class z extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        z() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String it) {
            kotlin.jvm.internal.l0.p(it, "it");
            MineViewModel.this.x().setValue(Boolean.FALSE);
            MineViewModel.this.X(it);
        }
    }

    static {
        kotlin.d0<MineViewModel> b5;
        b5 = kotlin.f0.b(kotlin.h0.SYNCHRONIZED, a.INSTANCE);
        f14767t = b5;
    }

    private MineViewModel() {
        MutableState<Boolean> mutableStateOf$default;
        MutableState<Boolean> mutableStateOf$default2;
        MutableState<String> mutableStateOf$default3;
        MutableState<String> mutableStateOf$default4;
        MutableState<VipMealData> mutableStateOf$default5;
        MutableState<VipMealData> mutableStateOf$default6;
        this.f14768a = new x0(com.yuanqi.master.config.c.f14552v, "");
        this.f14771d = 1;
        this.f14772e = "1";
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f14773f = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.f14774g = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.f14775h = mutableStateOf$default3;
        this.f14776i = kotlinx.coroutines.t0.a(k1.c());
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.f14779l = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f14780m = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f14781n = mutableStateOf$default6;
        ArrayList arrayList = new ArrayList();
        kotlin.collections.w.E();
        this.f14782o = arrayList;
    }

    public /* synthetic */ MineViewModel(kotlin.jvm.internal.w wVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(long j5, v3.a<r2> aVar) {
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("登录中");
        f1.b(com.yuanqi.master.network.repository.g.f14853g.v(j5), new u(aVar), new v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(EditResponse editResponse) {
        com.yuanqi.master.mine.account.a.f14786a.l(editResponse.getToken());
    }

    private final void O() {
        boolean z4;
        if (!w0.f15264a.b(com.yuanqi.master.config.c.f14552v)) {
            return;
        }
        if (u().length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        f1.b(com.yuanqi.master.network.repository.g.f14853g.g(u()), q0.INSTANCE, new r0());
    }

    private final void V(String str) {
        this.f14768a.setValue(this, f14765r[0], str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(String str) {
        com.yuanqi.master.mine.account.a.f14786a.l(str);
    }

    private final String e0(String str, boolean z4) {
        boolean z5;
        int i5;
        if (str.length() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            MineActivity a5 = MineActivity.f14760b.a();
            kotlin.jvm.internal.l0.m(a5);
            if (z4) {
                i5 = R.string.phone_error1;
            } else {
                i5 = R.string.email_error1;
            }
            String string = a5.getString(i5);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            return string;
        }
        if (z4) {
            if (new kotlin.text.r("^1[3-9]\\d{9}$").matches(str)) {
                return "";
            }
            MineActivity a6 = MineActivity.f14760b.a();
            kotlin.jvm.internal.l0.m(a6);
            String string2 = a6.getString(R.string.phone_error2);
            kotlin.jvm.internal.l0.o(string2, "getString(...)");
            return string2;
        }
        if (new kotlin.text.r("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$").matches(str)) {
            return "";
        }
        MineActivity a7 = MineActivity.f14760b.a();
        kotlin.jvm.internal.l0.m(a7);
        String string3 = a7.getString(R.string.email_error2);
        kotlin.jvm.internal.l0.m(string3);
        return string3;
    }

    private final String u() {
        return (String) this.f14768a.getValue(this, f14765r[0]);
    }

    @p4.l
    public final MutableState<VipMealData> A() {
        return this.f14780m;
    }

    public final boolean B() {
        return this.f14770c;
    }

    public final void D(@p4.l Context context, @p4.l String account, @p4.l String code, @p4.l v3.a<r2> action) {
        boolean z4;
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(account, "account");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(action, "action");
        String d02 = d0(account);
        boolean z5 = true;
        if (d02.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            d02 = a0(code);
        }
        if (d02.length() <= 0) {
            z5 = false;
        }
        if (z5) {
            Y(d02);
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("登录中");
        f1.b(com.yuanqi.master.network.repository.g.f14853g.w(new LoginUserInfoRequest(account, code, u())), new w(context, action), new x());
    }

    public final void F(@p4.l Activity context) {
        kotlin.jvm.internal.l0.p(context, "context");
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context, null);
        this.f14777j = createWXAPI;
        if (createWXAPI != null) {
            createWXAPI.registerApp(com.yuanqi.master.config.c.f14520a0);
        }
    }

    public final void G(@p4.l String email, @p4.l String code, @p4.l v3.a<r2> action) {
        boolean z4;
        kotlin.jvm.internal.l0.p(email, "email");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(action, "action");
        boolean z5 = false;
        String e02 = e0(email, false);
        if (e02.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            e02 = a0(code);
        }
        if (e02.length() > 0) {
            z5 = true;
        }
        if (z5) {
            Y(e02);
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        f1.b(com.yuanqi.master.network.repository.g.f14853g.j(email, code), new y(action), new z());
    }

    public final void H(@p4.l String phone, @p4.l String code, @p4.l v3.a<r2> action) {
        boolean z4;
        kotlin.jvm.internal.l0.p(phone, "phone");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(action, "action");
        boolean z5 = true;
        String e02 = e0(phone, true);
        if (e02.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            e02 = a0(code);
        }
        if (e02.length() <= 0) {
            z5 = false;
        }
        if (z5) {
            Y(e02);
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        f1.b(com.yuanqi.master.network.repository.g.f14853g.l(phone, code), new a0(action), new b0());
    }

    public final void I() {
        f1.a(com.yuanqi.master.network.repository.g.f14853g.r(), new c0(), new d0());
    }

    public final void J() {
        this.f14782o.clear();
        f1.b(com.yuanqi.master.network.repository.f.f14851g.j(), new e0(), new f0());
    }

    public final void K() {
        f1.b(com.yuanqi.master.network.repository.h.f14855g.i(), new g0(), new h0());
    }

    public final void L(@p4.l String email, @p4.l String code, @p4.l v3.a<r2> action) {
        boolean z4;
        kotlin.jvm.internal.l0.p(email, "email");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(action, "action");
        boolean z5 = false;
        String e02 = e0(email, false);
        if (e02.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            e02 = a0(code);
        }
        if (e02.length() > 0) {
            z5 = true;
        }
        if (z5) {
            Y(e02);
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        f1.b(com.yuanqi.master.network.repository.g.f14853g.y(email, code), new i0(action), new j0());
    }

    public final void M(@p4.l String phone, @p4.l String code, @p4.l v3.a<r2> action) {
        boolean z4;
        kotlin.jvm.internal.l0.p(phone, "phone");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(action, "action");
        boolean z5 = true;
        String e02 = e0(phone, true);
        if (e02.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            e02 = a0(code);
        }
        if (e02.length() <= 0) {
            z5 = false;
        }
        if (z5) {
            Y(e02);
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        f1.b(com.yuanqi.master.network.repository.g.f14853g.z(phone, code), new k0(action), new l0());
    }

    public final void N(@p4.l String phoneOrEmail, @p4.l v3.l<? super Integer, r2> action) {
        boolean z4;
        boolean T2;
        kotlin.jvm.internal.l0.p(phoneOrEmail, "phoneOrEmail");
        kotlin.jvm.internal.l0.p(action, "action");
        if (phoneOrEmail.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Y("请输入手机号或邮箱");
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        T2 = kotlin.text.f0.T2(phoneOrEmail, "@", false, 2, null);
        if (T2) {
            f1.b(com.yuanqi.master.network.repository.g.f14853g.s(phoneOrEmail), new m0(action, this), new n0(action));
        } else {
            f1.b(com.yuanqi.master.network.repository.g.f14853g.t(phoneOrEmail), new o0(action, this), new p0(action));
        }
    }

    public final void P(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<set-?>");
        this.f14772e = str;
    }

    public final void Q(int i5) {
        this.f14771d = i5;
    }

    public final void R(boolean z4) {
        this.f14770c = z4;
    }

    public final void S(@p4.m Boolean bool) {
        this.f14769b = bool;
    }

    public final void T(@p4.m Handler handler) {
        this.f14778k = handler;
    }

    public final void U(@p4.m NavHostController navHostController) {
        this.f14783p = navHostController;
    }

    public final void X(@p4.l String msg) {
        kotlin.jvm.internal.l0.p(msg, "msg");
        this.f14774g.setValue(Boolean.FALSE);
        this.f14775h.setValue(msg);
        this.f14773f.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(this.f14776i, null, null, new s0(null), 3, null);
    }

    public final void Y(@p4.l String msg) {
        kotlin.jvm.internal.l0.p(msg, "msg");
        this.f14774g.setValue(Boolean.FALSE);
        this.f14775h.setValue(msg);
        this.f14773f.setValue(Boolean.TRUE);
        kotlinx.coroutines.k.f(this.f14776i, null, null, new t0(null), 3, null);
    }

    @p4.l
    public final String Z(@p4.l String account) {
        boolean z4;
        kotlin.jvm.internal.l0.p(account, "account");
        if (account.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "手机号/邮箱不能为空";
        }
        return "";
    }

    @p4.l
    public final String a0(@p4.l String code) {
        boolean z4;
        kotlin.jvm.internal.l0.p(code, "code");
        if (code.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            MineActivity a5 = MineActivity.f14760b.a();
            kotlin.jvm.internal.l0.m(a5);
            String string = a5.getString(R.string.code_error1);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            return string;
        }
        return "";
    }

    @p4.l
    public final String b0(@p4.l String email) {
        boolean z4;
        kotlin.jvm.internal.l0.p(email, "email");
        if (email.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            MineActivity a5 = MineActivity.f14760b.a();
            kotlin.jvm.internal.l0.m(a5);
            String string = a5.getString(R.string.email_error1);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            return string;
        }
        if (new kotlin.text.r("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$").matches(email)) {
            return "";
        }
        MineActivity a6 = MineActivity.f14760b.a();
        kotlin.jvm.internal.l0.m(a6);
        String string2 = a6.getString(R.string.email_error2);
        kotlin.jvm.internal.l0.m(string2);
        return string2;
    }

    @p4.l
    public final String c0(@p4.l String phone) {
        boolean z4;
        kotlin.jvm.internal.l0.p(phone, "phone");
        if (phone.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            MineActivity a5 = MineActivity.f14760b.a();
            kotlin.jvm.internal.l0.m(a5);
            String string = a5.getString(R.string.phone_error1);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            return string;
        }
        if (new kotlin.text.r("^1[3-9]\\d{9}$").matches(phone)) {
            return "";
        }
        MineActivity a6 = MineActivity.f14760b.a();
        kotlin.jvm.internal.l0.m(a6);
        String string2 = a6.getString(R.string.phone_error2);
        kotlin.jvm.internal.l0.m(string2);
        return string2;
    }

    @p4.l
    public final String d0(@p4.l String input) {
        boolean T2;
        kotlin.jvm.internal.l0.p(input, "input");
        T2 = kotlin.text.f0.T2(input, "@", false, 2, null);
        return e0(input, !T2);
    }

    public final void e() {
        com.yuanqi.master.tools.o0 o0Var = com.yuanqi.master.tools.o0.f15213a;
        MineActivity a5 = MineActivity.f14760b.a();
        kotlin.jvm.internal.l0.m(a5);
        o0Var.x0(a5, "请求中");
        kotlinx.coroutines.k.f(this.f14776i, k1.c(), null, new c(null), 2, null);
    }

    public final void f(@p4.l String userName, @p4.l String phone, @p4.l String code, @p4.l v3.a<r2> action) {
        boolean z4;
        kotlin.jvm.internal.l0.p(userName, "userName");
        kotlin.jvm.internal.l0.p(phone, "phone");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(action, "action");
        String g02 = g0(userName);
        boolean z5 = true;
        if (g02.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            g02 = a0(code);
        }
        if (g02.length() <= 0) {
            z5 = false;
        }
        if (z5) {
            Y(g02);
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        f1.b(com.yuanqi.master.network.repository.g.f14853g.x(userName, phone, code), new d(action), new e());
    }

    @p4.l
    public final String f0(@p4.l String pwd) {
        boolean z4;
        kotlin.jvm.internal.l0.p(pwd, "pwd");
        if (pwd.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            MineActivity a5 = MineActivity.f14760b.a();
            kotlin.jvm.internal.l0.m(a5);
            String string = a5.getString(R.string.pwd_error1);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            return string;
        }
        if (pwd.length() > 32) {
            MineActivity a6 = MineActivity.f14760b.a();
            kotlin.jvm.internal.l0.m(a6);
            String string2 = a6.getString(R.string.pwd_error2);
            kotlin.jvm.internal.l0.o(string2, "getString(...)");
            return string2;
        }
        if (new kotlin.text.r("^[a-zA-Z0-9]+$").matches(pwd)) {
            return "";
        }
        MineActivity a7 = MineActivity.f14760b.a();
        kotlin.jvm.internal.l0.m(a7);
        String string3 = a7.getString(R.string.pwd_error3);
        kotlin.jvm.internal.l0.m(string3);
        return string3;
    }

    public final void g(@p4.l Activity context, boolean z4, @p4.l v3.a<r2> successAction) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(successAction, "successAction");
        this.f14778k = new f(successAction, context.getMainLooper());
        this.f14773f.setValue(Boolean.TRUE);
        MutableState<String> mutableState = this.f14775h;
        String string = context.getString(R.string.requesting);
        kotlin.jvm.internal.l0.o(string, "getString(...)");
        mutableState.setValue(string);
        com.yuanqi.master.vip.a a5 = com.yuanqi.master.vip.a.f15295c.a();
        Handler handler = this.f14778k;
        kotlin.jvm.internal.l0.m(handler);
        a5.f(context, z4, handler, new g(), new h(context, this));
    }

    @p4.l
    public final String g0(@p4.l String userName) {
        boolean z4;
        kotlin.jvm.internal.l0.p(userName, "userName");
        if (userName.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            MineActivity a5 = MineActivity.f14760b.a();
            kotlin.jvm.internal.l0.m(a5);
            String string = a5.getString(R.string.uname_error1);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            return string;
        }
        if (!new kotlin.text.r("^[a-zA-Z0-9]+$").matches(userName)) {
            MineActivity a6 = MineActivity.f14760b.a();
            kotlin.jvm.internal.l0.m(a6);
            String string2 = a6.getString(R.string.uname_error2);
            kotlin.jvm.internal.l0.o(string2, "getString(...)");
            return string2;
        }
        if (userName.length() >= 5 && userName.length() <= 12) {
            return "";
        }
        MineActivity a7 = MineActivity.f14760b.a();
        kotlin.jvm.internal.l0.m(a7);
        String string3 = a7.getString(R.string.uname_error3);
        kotlin.jvm.internal.l0.o(string3, "getString(...)");
        return string3;
    }

    public final void h(@p4.l Activity context, boolean z4) {
        kotlin.jvm.internal.l0.p(context, "context");
        this.f14773f.setValue(Boolean.TRUE);
        MutableState<String> mutableState = this.f14775h;
        String string = context.getString(R.string.requesting);
        kotlin.jvm.internal.l0.o(string, "getString(...)");
        mutableState.setValue(string);
        com.yuanqi.master.vip.a a5 = com.yuanqi.master.vip.a.f15295c.a();
        IWXAPI iwxapi = this.f14777j;
        kotlin.jvm.internal.l0.m(iwxapi);
        a5.g(context, z4, iwxapi, new i(), new j(context, this));
    }

    public final void i(@p4.l v3.a<r2> action) {
        kotlin.jvm.internal.l0.p(action, "action");
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        f1.a(com.yuanqi.master.network.repository.g.f14853g.m(), new k(action), new l());
    }

    public final void j(@p4.l String newPwd, boolean z4, @p4.l String phoneOrEmail, @p4.l String code, @p4.l v3.a<r2> action) {
        boolean z5;
        boolean z6;
        String str;
        kotlin.jvm.internal.l0.p(newPwd, "newPwd");
        kotlin.jvm.internal.l0.p(phoneOrEmail, "phoneOrEmail");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(action, "action");
        String f02 = f0(newPwd);
        boolean z7 = true;
        if (f02.length() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            f02 = e0(phoneOrEmail, z4);
        }
        if (f02.length() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            f02 = a0(code);
        }
        if (f02.length() <= 0) {
            z7 = false;
        }
        if (z7) {
            X(f02);
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        com.yuanqi.master.network.repository.g gVar = com.yuanqi.master.network.repository.g.f14853g;
        if (!z4) {
            str = "";
        } else {
            str = phoneOrEmail;
        }
        if (z4) {
            phoneOrEmail = "";
        }
        f1.b(gVar.h(newPwd, code, str, phoneOrEmail), new m(action), new n());
    }

    public final void k(@p4.l String useName, @p4.l v3.a<r2> action) {
        boolean z4;
        kotlin.jvm.internal.l0.p(useName, "useName");
        kotlin.jvm.internal.l0.p(action, "action");
        String g02 = g0(useName);
        if (g02.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Y(g02);
            return;
        }
        UserInfoData value = com.yuanqi.master.mine.account.a.f14786a.b().getValue();
        kotlin.jvm.internal.l0.m(value);
        if (kotlin.jvm.internal.l0.g(useName, value.getUserName())) {
            Y("用户名不能和修改前相同");
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        f1.b(com.yuanqi.master.network.repository.g.f14853g.k(useName), new o(action), new p());
    }

    public final void l(@p4.l String userName, @p4.l String pwd, boolean z4, @p4.l String phoneOrEmail, @p4.l String code, @p4.l v3.a<r2> action) {
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        String str2;
        kotlin.jvm.internal.l0.p(userName, "userName");
        kotlin.jvm.internal.l0.p(pwd, "pwd");
        kotlin.jvm.internal.l0.p(phoneOrEmail, "phoneOrEmail");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(action, "action");
        String g02 = g0(userName);
        boolean z8 = true;
        if (g02.length() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            g02 = f0(pwd);
        }
        if (g02.length() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            g02 = e0(phoneOrEmail, z4);
        }
        if (g02.length() == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            g02 = a0(code);
        }
        if (g02.length() <= 0) {
            z8 = false;
        }
        if (z8) {
            X(g02);
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        com.yuanqi.master.network.repository.g gVar = com.yuanqi.master.network.repository.g.f14853g;
        if (!z4) {
            str = "";
        } else {
            str = phoneOrEmail;
        }
        if (z4) {
            str2 = "";
        } else {
            str2 = phoneOrEmail;
        }
        f1.b(gVar.n(userName, pwd, code, str, str2), new q(action), new r());
    }

    public final void m(boolean z4, @p4.l String phoneOrEmail, @p4.l String code, @p4.l v3.a<r2> action) {
        boolean z5;
        String str;
        kotlin.jvm.internal.l0.p(phoneOrEmail, "phoneOrEmail");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(action, "action");
        String e02 = e0(phoneOrEmail, z4);
        boolean z6 = true;
        if (e02.length() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            e02 = a0(code);
        }
        if (e02.length() <= 0) {
            z6 = false;
        }
        if (z6) {
            X(e02);
            return;
        }
        this.f14773f.setValue(Boolean.TRUE);
        this.f14775h.setValue("请求中");
        com.yuanqi.master.network.repository.g gVar = com.yuanqi.master.network.repository.g.f14853g;
        if (!z4) {
            str = "";
        } else {
            str = phoneOrEmail;
        }
        if (z4) {
            phoneOrEmail = "";
        }
        f1.b(gVar.p(code, str, phoneOrEmail), new s(action), new t());
    }

    @p4.l
    public final String n() {
        return this.f14772e;
    }

    public final int o() {
        return this.f14771d;
    }

    @p4.l
    public final MutableState<String> p() {
        return this.f14779l;
    }

    @p4.m
    public final Boolean q() {
        return this.f14769b;
    }

    @p4.m
    public final Handler r() {
        return this.f14778k;
    }

    @p4.m
    public final NavHostController s() {
        return this.f14783p;
    }

    @p4.l
    public final kotlinx.coroutines.s0 t() {
        return this.f14776i;
    }

    @p4.l
    public final List<ShareListData> v() {
        return this.f14782o;
    }

    @p4.l
    public final MutableState<String> w() {
        return this.f14775h;
    }

    @p4.l
    public final MutableState<Boolean> x() {
        return this.f14773f;
    }

    @p4.l
    public final MutableState<Boolean> y() {
        return this.f14774g;
    }

    @p4.l
    public final MutableState<VipMealData> z() {
        return this.f14781n;
    }
}
