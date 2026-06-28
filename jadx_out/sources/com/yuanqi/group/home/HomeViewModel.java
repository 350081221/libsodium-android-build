package com.yuanqi.group.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.umeng.analytics.pro.bi;
import com.yqtech.multiapp.R;
import com.yqtech.multiapp.databinding.DialogBaseTipBinding;
import com.yuanqi.group.App;
import com.yuanqi.group.home.HomeViewModel;
import com.yuanqi.master.BaseViewModel;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.database.a;
import com.yuanqi.master.mine.MineActivity;
import com.yuanqi.master.network.model.response.ConfigResponse;
import com.yuanqi.master.network.model.response.ForceByVersionResponse;
import com.yuanqi.master.tools.c1;
import com.yuanqi.master.tools.dialog.b;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.v0;
import com.yuanqi.master.tools.w0;
import com.yuanqi.master.tools.x0;
import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.e1;
import kotlin.jvm.internal.l1;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u009b\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0006\u0010^\u001a\u00020_J\u0010\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020\nH\u0002J\u0010\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020eJ\u000e\u0010f\u001a\u00020_2\u0006\u0010g\u001a\u00020;J\b\u0010h\u001a\u00020_H\u0002J\u0010\u0010i\u001a\u00020_2\b\b\u0002\u0010j\u001a\u00020\u001eJ\b\u0010k\u001a\u00020_H\u0002J\u0006\u0010l\u001a\u00020\nJ\u000e\u0010m\u001a\u00020_2\u0006\u0010n\u001a\u00020oJ\u000e\u0010p\u001a\u00020_2\u0006\u0010n\u001a\u00020oJ\u0006\u0010q\u001a\u00020_J\u0016\u0010r\u001a\u00020_2\u0006\u0010n\u001a\u00020#2\u0006\u0010s\u001a\u00020\nJ\b\u0010t\u001a\u00020_H\u0016J\b\u0010u\u001a\u00020_H\u0016J\b\u0010v\u001a\u00020_H\u0016J\u001a\u0010w\u001a\u00020_2\u0006\u0010x\u001a\u00020\n2\b\u0010y\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010z\u001a\u00020_2\u0006\u0010{\u001a\u00020\u001e2\u0006\u0010|\u001a\u00020\n2\b\u0010}\u001a\u0004\u0018\u00010~H\u0016J9\u0010\u007f\u001a\u00020_2\u0007\u0010\u0080\u0001\u001a\u00020\u001e2\u0007\u0010\u0081\u0001\u001a\u00020\n2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00062\u0007\u0010\u0083\u0001\u001a\u00020\n2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\u0085\u0001\u001a\u00020_2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010TH\u0016J\t\u0010\u0086\u0001\u001a\u00020_H\u0016J\u0014\u0010\u0086\u0001\u001a\u00020_2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010TH\u0016J\t\u0010\u0088\u0001\u001a\u00020_H\u0016J\t\u0010\u0089\u0001\u001a\u00020_H\u0016J\t\u0010\u008a\u0001\u001a\u00020_H\u0016J1\u0010\u008b\u0001\u001a\u00020_2\u0007\u0010\u008c\u0001\u001a\u00020\u00062\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0016\u0010\u008e\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020_0\u008f\u0001J\u0010\u0010\u0090\u0001\u001a\u00020_2\u0007\u0010\u0091\u0001\u001a\u00020\nJ\u0019\u0010\u0092\u0001\u001a\u00020_2\u0006\u0010n\u001a\u00020o2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\t\u0010\u0095\u0001\u001a\u00020_H\u0002J\u0013\u0010\u0096\u0001\u001a\u00020_2\b\b\u0002\u0010y\u001a\u00020\u0006H\u0002J*\u0010\u0097\u0001\u001a\u00020_2\u0006\u0010n\u001a\u00020o2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00020_0\u009a\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u001a\u0010\"\u001a\u00020#X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001aR\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:0\u0016¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u001aR+\u0010=\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u0014\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR+\u0010A\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u0014\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR+\u0010E\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u0014\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u001aR\u0010\u0010K\u001a\u0004\u0018\u00010LX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010N\u001a\n P*\u0004\u0018\u00010O0OX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010S\u001a\u0004\u0018\u00010TX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010X\u001a\u00020W2\u0006\u0010\u000f\u001a\u00020W8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010\u0014\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006\u009c\u0001"}, d2 = {"Lcom/yuanqi/group/home/HomeViewModel;", "Lcom/yuanqi/master/BaseViewModel;", "Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;", "Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;", "()V", "TAG", "", "adSlotFive", "Lcom/bytedance/sdk/openadsdk/AdSlot;", "appIndex", "", "getAppIndex", "()I", "setAppIndex", "(I)V", "<set-?>", com.yuanqi.master.config.c.T, "getAppMode", "setAppMode", "appMode$delegate", "Lcom/yuanqi/master/tools/MVFast;", "appNoteList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/yuanqi/master/database/model/AppNote;", "getAppNoteList", "()Landroidx/lifecycle/MutableLiveData;", "setAppNoteList", "(Landroidx/lifecycle/MutableLiveData;)V", "deleteModel", "", "getDeleteModel", "longPressGuide", "getLongPressGuide", "mContext", "Landroid/app/Activity;", "getMContext", "()Landroid/app/Activity;", "setMContext", "(Landroid/app/Activity;)V", "mIsRewardValid", "needAboutPoint", "getNeedAboutPoint", "()Z", "setNeedAboutPoint", "(Z)V", "needShowHelpPoint", "getNeedShowHelpPoint", "setNeedShowHelpPoint", "needShowMenuPoint", "getNeedShowMenuPoint", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "setScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "selectDeleteApp", "", "Lcom/yuanqi/group/home/models/AppData;", "getSelectDeleteApp", "showAdNum", "getShowAdNum", "setShowAdNum", "showAdNum$delegate", "showAdNumNoLogin", "getShowAdNumNoLogin", "setShowAdNumNoLogin", "showAdNumNoLogin$delegate", "showHelp", "getShowHelp", "setShowHelp", "showHelp$delegate", "startGuide", "getStartGuide", "todayMode", "Lcom/yuanqi/master/database/model/AdModel;", "todayString", "ttAdManagerFive", "Lcom/bytedance/sdk/openadsdk/TTAdManager;", "kotlin.jvm.PlatformType", "ttAdNativeFive", "Lcom/bytedance/sdk/openadsdk/TTAdNative;", "ttRewardVideoAdFive", "Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;", "updateDialog", "Lcom/yuanqi/master/tools/dialog/AlertDialog;", "", "vipTimeNoLogin", "getVipTimeNoLogin", "()J", "setVipTimeNoLogin", "(J)V", "vipTimeNoLogin$delegate", "checkApp", "", "checkForce", "version", "convertBmpByteArrayToBitmap", "Landroid/graphics/Bitmap;", "bmpData", "", "deleteAppNote", "data", "dismissProgress", "getAllAppNote", "isDelay", "getCurrentAd", "getSpanCount", "insertAboutKey", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "insertHelpMenuKey", "insertTodayAd", "jumpToDataManagement", "appNum", "onAdClose", "onAdShow", "onAdVideoBarClick", "onError", PluginConstants.KEY_ERROR_CODE, "msg", "onRewardArrived", "isRewardValid", MediationConstant.KEY_REWARD_TYPE, MediationConstant.KEY_EXTRA_INFO, "Landroid/os/Bundle;", "onRewardVerify", "p0", "p1", "p2", "p3", "p4", "onRewardVideoAdLoad", "onRewardVideoCached", bi.az, "onSkippedVideo", "onVideoComplete", "onVideoError", "requestAppNote", "mPackageName", "userId", "action", "Lkotlin/Function1;", "setAboutPoint", "currentVersion", "setLocale", "newLocale", "Ljava/util/Locale;", "showGoUpdateDialog", "showProgress", "verifyAppPwd", "noteApp", "openAction", "Lkotlin/Function0;", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Instrumented
/* loaded from: classes3.dex */
public final class HomeViewModel extends BaseViewModel implements TTAdNative.RewardVideoAdListener, TTRewardVideoAd.RewardAdInteractionListener {

    @p4.l
    private static final kotlin.d0<HomeViewModel> D;

    @p4.l
    private static final com.yuanqi.master.database.dao.c E;

    @p4.l
    private static final com.yuanqi.master.database.dao.a F;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final String f13836b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13837c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13838d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13839e;

    /* renamed from: f, reason: collision with root package name */
    private final TTAdManager f13840f;

    /* renamed from: g, reason: collision with root package name */
    private TTAdNative f13841g;

    /* renamed from: h, reason: collision with root package name */
    private AdSlot f13842h;

    /* renamed from: i, reason: collision with root package name */
    @p4.m
    private TTRewardVideoAd f13843i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private final x0 f13844j;

    /* renamed from: k, reason: collision with root package name */
    @p4.l
    private final x0 f13845k;

    /* renamed from: l, reason: collision with root package name */
    @p4.l
    private final x0 f13846l;

    /* renamed from: m, reason: collision with root package name */
    @p4.l
    private final x0 f13847m;

    /* renamed from: n, reason: collision with root package name */
    @p4.l
    private final x0 f13848n;

    /* renamed from: o, reason: collision with root package name */
    private int f13849o;

    /* renamed from: p, reason: collision with root package name */
    @p4.l
    private String f13850p;

    /* renamed from: q, reason: collision with root package name */
    @p4.l
    private s0 f13851q;

    /* renamed from: r, reason: collision with root package name */
    @p4.m
    private v2.a f13852r;

    /* renamed from: s, reason: collision with root package name */
    public Activity f13853s;

    /* renamed from: t, reason: collision with root package name */
    @p4.l
    private final MutableLiveData<Boolean> f13854t;

    /* renamed from: u, reason: collision with root package name */
    @p4.l
    private final MutableLiveData<Boolean> f13855u;

    /* renamed from: v, reason: collision with root package name */
    @p4.l
    private final MutableLiveData<Boolean> f13856v;

    /* renamed from: w, reason: collision with root package name */
    @p4.l
    private final MutableLiveData<Boolean> f13857w;

    /* renamed from: x, reason: collision with root package name */
    @p4.l
    private final MutableLiveData<List<com.yuanqi.group.home.models.b>> f13858x;

    /* renamed from: y, reason: collision with root package name */
    @p4.l
    private MutableLiveData<List<v2.b>> f13859y;

    /* renamed from: z, reason: collision with root package name */
    @p4.m
    private com.yuanqi.master.tools.dialog.b f13860z;
    static final /* synthetic */ kotlin.reflect.o<Object>[] B = {l1.k(new kotlin.jvm.internal.x0(HomeViewModel.class, "showHelp", "getShowHelp()I", 0)), l1.k(new kotlin.jvm.internal.x0(HomeViewModel.class, "showAdNum", "getShowAdNum()I", 0)), l1.k(new kotlin.jvm.internal.x0(HomeViewModel.class, "showAdNumNoLogin", "getShowAdNumNoLogin()I", 0)), l1.k(new kotlin.jvm.internal.x0(HomeViewModel.class, "vipTimeNoLogin", "getVipTimeNoLogin()J", 0)), l1.k(new kotlin.jvm.internal.x0(HomeViewModel.class, com.yuanqi.master.config.c.T, "getAppMode()I", 0))};

    @p4.l
    public static final b A = new b(null);
    public static final int C = 8;

    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yuanqi/group/home/HomeViewModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.n0 implements v3.a<HomeViewModel> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final HomeViewModel invoke() {
            return new HomeViewModel(null);
        }
    }

    @kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yuanqi/group/home/HomeViewModel$Companion;", "", "()V", "adModelDao", "Lcom/yuanqi/master/database/dao/AdModelDao;", "getAdModelDao", "()Lcom/yuanqi/master/database/dao/AdModelDao;", "appNoteDao", "Lcom/yuanqi/master/database/dao/AppNoteDao;", "getAppNoteDao", "()Lcom/yuanqi/master/database/dao/AppNoteDao;", "instance", "Lcom/yuanqi/group/home/HomeViewModel;", "getInstance", "()Lcom/yuanqi/group/home/HomeViewModel;", "instance$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final com.yuanqi.master.database.dao.a a() {
            return HomeViewModel.F;
        }

        @p4.l
        public final com.yuanqi.master.database.dao.c b() {
            return HomeViewModel.E;
        }

        @p4.l
        public final HomeViewModel c() {
            return (HomeViewModel) HomeViewModel.D.getValue();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/yuanqi/master/network/model/response/ConfigResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.n0 implements v3.l<ConfigResponse, r2> {
        c() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ConfigResponse configResponse) {
            invoke2(configResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m ConfigResponse configResponse) {
            if (configResponse != null) {
                if (configResponse.getCheck_app() && !com.yuanqi.master.tools.e.f15100a.f(HomeViewModel.this.C())) {
                    Log.d(HomeViewModel.this.f13836b, "checkApp: 签名校验失败");
                    HomeViewModel.this.g0();
                }
                int e5 = v0.f15260a.e(HomeViewModel.this.C());
                int version = configResponse.getVersion();
                if (configResponse.getCheck_force()) {
                    HomeViewModel.this.q(version);
                }
                if (version > e5) {
                    HomeViewModel.this.T(e5);
                }
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        public static final d INSTANCE = new d();

        d() {
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.n0 implements v3.l<ForceByVersionResponse, r2> {
        e() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ForceByVersionResponse forceByVersionResponse) {
            invoke2(forceByVersionResponse);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m ForceByVersionResponse forceByVersionResponse) {
            if (forceByVersionResponse != null && forceByVersionResponse.getForce()) {
                HomeViewModel.this.g0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.n0 implements v3.l<String, r2> {
        f() {
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
            HomeViewModel.this.g0();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeViewModel$deleteAppNote$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class g extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ com.yuanqi.group.home.models.b $data;
        int label;
        final /* synthetic */ HomeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.yuanqi.group.home.models.b bVar, HomeViewModel homeViewModel, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.$data = bVar;
            this.this$0 = homeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new g(this.$data, this.this$0, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                b bVar = HomeViewModel.A;
                com.yuanqi.master.database.dao.c b5 = bVar.b();
                String packageName = this.$data.getPackageName();
                kotlin.jvm.internal.l0.o(packageName, "getPackageName(...)");
                b5.f(packageName, this.$data.getUserId());
                this.this$0.y().postValue(bVar.b().getAll());
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeViewModel$getAllAppNote$1", f = "HomeViewModel.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ boolean $isDelay;
        int label;
        final /* synthetic */ HomeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z4, HomeViewModel homeViewModel, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.$isDelay = z4;
            this.this$0 = homeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new h(this.$isDelay, this.this$0, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                if (this.$isDelay) {
                    this.label = 1;
                    if (d1.b(500L, this) == l5) {
                        return l5;
                    }
                }
            }
            this.this$0.y().postValue(HomeViewModel.A.b().getAll());
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeViewModel$getCurrentAd$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new i(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                HomeViewModel.this.f13852r = HomeViewModel.A.a().a(HomeViewModel.this.f13850p);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeViewModel$insertAboutKey$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class j extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new j(this.$context, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((j) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                String str = "about_" + v0.f15260a.e(this.$context);
                w0 w0Var = w0.f15264a;
                if (!w0Var.b(str)) {
                    w0Var.d(str, kotlin.coroutines.jvm.internal.b.f(1));
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeViewModel$insertHelpMenuKey$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class k extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new k(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((k) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                HomeViewModel.this.e0(1);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeViewModel$insertTodayAd$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class l extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;

        l(kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new l(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((l) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                HomeViewModel homeViewModel = HomeViewModel.this;
                v2.a aVar = new v2.a();
                aVar.c(HomeViewModel.this.f13850p);
                homeViewModel.f13852r = aVar;
                com.yuanqi.master.database.dao.a a5 = HomeViewModel.A.a();
                v2.a aVar2 = HomeViewModel.this.f13852r;
                kotlin.jvm.internal.l0.m(aVar2);
                a5.b(aVar2);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeViewModel$requestAppNote$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class m extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.l<v2.b, r2> $action;
        final /* synthetic */ String $mPackageName;
        final /* synthetic */ int $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(String str, int i5, v3.l<? super v2.b, r2> lVar, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.$mPackageName = str;
            this.$userId = i5;
            this.$action = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new m(this.$mPackageName, this.$userId, this.$action, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((m) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                this.$action.invoke(HomeViewModel.A.b().b(this.$mPackageName, this.$userId));
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeViewModel$showGoUpdateDialog$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1$lambda$0(HomeViewModel homeViewModel, View view) {
            com.yuanqi.master.tools.dialog.b bVar = homeViewModel.f13860z;
            if (bVar != null) {
                bVar.dismiss();
            }
            v0.f15260a.g(homeViewModel.C());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new n(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((n) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Boolean bool;
            com.yuanqi.master.tools.dialog.b bVar;
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                if (!HomeViewModel.this.C().isFinishing() && !HomeViewModel.this.C().isDestroyed()) {
                    if (HomeViewModel.this.f13860z == null) {
                        DialogBaseTipBinding inflate = DialogBaseTipBinding.inflate(LayoutInflater.from(HomeViewModel.this.C()));
                        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
                        HomeViewModel homeViewModel = HomeViewModel.this;
                        homeViewModel.f13860z = new b.a(homeViewModel.C()).a().k(inflate.getRoot()).i(false).t(c1.f15065a.c(HomeViewModel.this.C(), 300.0f), -2).b();
                        final HomeViewModel homeViewModel2 = HomeViewModel.this;
                        inflate.ivWarn.setVisibility(8);
                        inflate.tvTitle.setText(homeViewModel2.C().getResources().getString(R.string.tip));
                        inflate.tvContent.setText(homeViewModel2.C().getResources().getString(R.string.current_version_ex));
                        inflate.tvContent.setMovementMethod(LinkMovementMethod.getInstance());
                        inflate.btnRefuse.setVisibility(4);
                        inflate.btnConfirm.setText("去更新");
                        inflate.ivClose.setVisibility(4);
                        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.n0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                HomeViewModel.n.invokeSuspend$lambda$1$lambda$0(HomeViewModel.this, view);
                            }
                        });
                    }
                    com.yuanqi.master.tools.dialog.b bVar2 = HomeViewModel.this.f13860z;
                    if (bVar2 != null) {
                        bool = kotlin.coroutines.jvm.internal.b.a(bVar2.isShowing());
                    } else {
                        bool = null;
                    }
                    kotlin.jvm.internal.l0.m(bool);
                    if (!bool.booleanValue() && (bVar = HomeViewModel.this.f13860z) != null) {
                        bVar.show();
                    }
                    return r2.f19517a;
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeViewModel$verifyAppPwd$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class o extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ v2.b $noteApp;
        final /* synthetic */ v3.a<r2> $openAction;
        int label;
        final /* synthetic */ HomeViewModel this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ v3.a<r2> $openAction;
            final /* synthetic */ HomeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeViewModel homeViewModel, v3.a<r2> aVar) {
                super(0);
                this.this$0 = homeViewModel;
                this.$openAction = aVar;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.t();
                this.$openAction.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ Context $context;
            final /* synthetic */ HomeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(HomeViewModel homeViewModel, Context context) {
                super(0);
                this.this$0 = homeViewModel;
                this.$context = context;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.t();
                Context context = this.$context;
                Intent intent = new Intent(this.$context, (Class<?>) MineActivity.class);
                if (com.yuanqi.master.mine.account.a.f14786a.c()) {
                    intent.putExtra("screen", com.yuanqi.master.mine.c.f14825g);
                }
                context.startActivity(intent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(v2.b bVar, Context context, HomeViewModel homeViewModel, v3.a<r2> aVar, kotlin.coroutines.d<? super o> dVar) {
            super(2, dVar);
            this.$noteApp = bVar;
            this.$context = context;
            this.this$0 = homeViewModel;
            this.$openAction = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new o(this.$noteApp, this.$context, this.this$0, this.$openAction, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((o) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        
            if (r1 == true) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                kotlin.coroutines.intrinsics.b.l()
                int r1 = r0.label
                if (r1 != 0) goto Lb4
                kotlin.e1.n(r21)
                com.yuanqi.master.mine.account.a r1 = com.yuanqi.master.mine.account.a.f14786a
                boolean r1 = r1.k()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L48
                v2.b r1 = r0.$noteApp
                if (r1 == 0) goto L2d
                java.lang.String r1 = r1.getAppPwd()
                if (r1 == 0) goto L2d
                int r1 = r1.length()
                if (r1 <= 0) goto L28
                r1 = r2
                goto L29
            L28:
                r1 = r3
            L29:
                if (r1 != r2) goto L2d
                r1 = r2
                goto L2e
            L2d:
                r1 = r3
            L2e:
                if (r1 == 0) goto L48
                com.yuanqi.master.tools.o0 r4 = com.yuanqi.master.tools.o0.f15213a
                android.content.Context r5 = r0.$context
                com.yuanqi.group.home.HomeViewModel r1 = r0.this$0
                kotlinx.coroutines.s0 r6 = r1.G()
                v2.b r1 = r0.$noteApp
                java.lang.String r7 = r1.getAppPwd()
                r8 = 0
                v3.a<kotlin.r2> r9 = r0.$openAction
                r4.M0(r5, r6, r7, r8, r9)
                goto Lb1
            L48:
                v2.b r1 = r0.$noteApp
                if (r1 == 0) goto L5e
                java.lang.String r1 = r1.getAppPwd()
                if (r1 == 0) goto L5e
                int r1 = r1.length()
                if (r1 <= 0) goto L5a
                r1 = r2
                goto L5b
            L5a:
                r1 = r3
            L5b:
                if (r1 != r2) goto L5e
                goto L5f
            L5e:
                r2 = r3
            L5f:
                if (r2 == 0) goto Lac
                com.yuanqi.master.tools.w0 r1 = com.yuanqi.master.tools.w0.f15264a
                java.lang.String r2 = "vip_pass"
                boolean r3 = r1.b(r2)
                if (r3 == 0) goto L73
                v3.a<kotlin.r2> r1 = r0.$openAction
                r1.invoke()
                kotlin.r2 r1 = kotlin.r2.f19517a
                return r1
            L73:
                com.yuanqi.master.tools.o0 r3 = com.yuanqi.master.tools.o0.f15213a
                android.content.Context r4 = r0.$context
                java.lang.String r5 = "提示"
                java.lang.String r6 = "您的VIP已过期，密码保护功能已失效，是否续费？"
                java.lang.String r7 = "取消"
                java.lang.String r8 = "续费"
                r9 = 0
                r10 = 0
                r11 = 0
                com.yuanqi.group.home.HomeViewModel$o$a r14 = new com.yuanqi.group.home.HomeViewModel$o$a
                com.yuanqi.group.home.HomeViewModel r15 = r0.this$0
                v3.a<kotlin.r2> r13 = r0.$openAction
                r14.<init>(r15, r13)
                com.yuanqi.group.home.HomeViewModel$o$b r13 = new com.yuanqi.group.home.HomeViewModel$o$b
                com.yuanqi.group.home.HomeViewModel r15 = r0.this$0
                android.content.Context r12 = r0.$context
                r13.<init>(r15, r12)
                r18 = 3040(0xbe0, float:4.26E-42)
                r19 = 0
                r12 = 0
                r17 = r13
                r13 = 0
                r15 = 0
                r16 = r17
                r17 = r18
                r18 = r19
                com.yuanqi.master.tools.o0.Y(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                java.lang.String r3 = "1"
                r1.d(r2, r3)
                goto Lb1
            Lac:
                v3.a<kotlin.r2> r1 = r0.$openAction
                r1.invoke()
            Lb1:
                kotlin.r2 r1 = kotlin.r2.f19517a
                return r1
            Lb4:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.group.home.HomeViewModel.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        kotlin.d0<HomeViewModel> b5;
        b5 = kotlin.f0.b(kotlin.h0.SYNCHRONIZED, a.INSTANCE);
        D = b5;
        a.b bVar = com.yuanqi.master.database.a.f14574b;
        com.yuanqi.master.database.a a5 = bVar.a();
        App.a aVar = App.f13716d;
        App a6 = aVar.a();
        kotlin.jvm.internal.l0.m(a6);
        E = a5.c(a6);
        com.yuanqi.master.database.a a7 = bVar.a();
        App a8 = aVar.a();
        kotlin.jvm.internal.l0.m(a8);
        F = a7.b(a8);
    }

    private HomeViewModel() {
        String format;
        List<v2.b> E2;
        DateTimeFormatter ofPattern;
        LocalDateTime now;
        this.f13836b = "HomeViewModel";
        this.f13840f = TTAdSdk.getAdManager();
        this.f13844j = new x0(com.yuanqi.master.config.c.D, 0);
        this.f13845k = new x0(com.yuanqi.master.config.c.F, 0);
        this.f13846l = new x0(com.yuanqi.master.config.c.G, 0);
        this.f13847m = new x0(com.yuanqi.master.config.c.H, 0L);
        this.f13848n = new x0(com.yuanqi.master.config.c.T, 1);
        if (Build.VERSION.SDK_INT >= 26) {
            ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            now = LocalDateTime.now();
            format = ofPattern.format(now);
            kotlin.jvm.internal.l0.m(format);
        } else {
            format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            kotlin.jvm.internal.l0.m(format);
        }
        this.f13850p = format;
        this.f13851q = t0.a(k1.e());
        u(true);
        z();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.f13854t = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(bool);
        this.f13855u = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(bool);
        this.f13856v = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.setValue(bool);
        this.f13857w = mutableLiveData4;
        MutableLiveData<List<com.yuanqi.group.home.models.b>> mutableLiveData5 = new MutableLiveData<>();
        mutableLiveData5.setValue(new ArrayList());
        this.f13858x = mutableLiveData5;
        MutableLiveData<List<v2.b>> mutableLiveData6 = new MutableLiveData<>();
        E2 = kotlin.collections.w.E();
        mutableLiveData6.setValue(E2);
        this.f13859y = mutableLiveData6;
    }

    public /* synthetic */ HomeViewModel(kotlin.jvm.internal.w wVar) {
        this();
    }

    private final int I() {
        return ((Number) this.f13845k.getValue(this, B[1])).intValue();
    }

    private final int J() {
        return ((Number) this.f13846l.getValue(this, B[2])).intValue();
    }

    private final int K() {
        return ((Number) this.f13844j.getValue(this, B[0])).intValue();
    }

    private final long N() {
        return ((Number) this.f13847m.getValue(this, B[3])).longValue();
    }

    private final void c0(int i5) {
        this.f13845k.setValue(this, B[1], Integer.valueOf(i5));
    }

    private final void d0(int i5) {
        this.f13846l.setValue(this, B[2], Integer.valueOf(i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(int i5) {
        this.f13844j.setValue(this, B[0], Integer.valueOf(i5));
    }

    private final void f0(long j5) {
        this.f13847m.setValue(this, B[3], Long.valueOf(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        kotlinx.coroutines.k.f(this.f13851q, k1.e(), null, new n(null), 2, null);
    }

    private final void h0(String str) {
        com.yuanqi.master.tools.o0.f15213a.x0(C(), str);
    }

    static /* synthetic */ void i0(HomeViewModel homeViewModel, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = homeViewModel.C().getString(R.string.progress_msg);
            kotlin.jvm.internal.l0.o(str, "getString(...)");
        }
        homeViewModel.h0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(int i5) {
        f1.a(com.yuanqi.master.network.repository.f.f14851g.i(i5), new e(), new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        com.yuanqi.master.tools.o0.f15213a.K();
    }

    public static /* synthetic */ void v(HomeViewModel homeViewModel, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        homeViewModel.u(z4);
    }

    private final void z() {
        kotlinx.coroutines.k.f(this.f13851q, k1.c(), null, new i(null), 2, null);
    }

    @p4.l
    public final MutableLiveData<Boolean> A() {
        return this.f13857w;
    }

    @p4.l
    public final MutableLiveData<Boolean> B() {
        return this.f13855u;
    }

    @p4.l
    public final Activity C() {
        Activity activity = this.f13853s;
        if (activity != null) {
            return activity;
        }
        kotlin.jvm.internal.l0.S("mContext");
        return null;
    }

    public final boolean D() {
        return this.f13838d;
    }

    public final boolean E() {
        return this.f13837c;
    }

    @p4.l
    public final MutableLiveData<Boolean> F() {
        return this.f13856v;
    }

    @p4.l
    public final s0 G() {
        return this.f13851q;
    }

    @p4.l
    public final MutableLiveData<List<com.yuanqi.group.home.models.b>> H() {
        return this.f13858x;
    }

    public final int L() {
        return (x() == 1 || x() == 2) ? 3 : 2;
    }

    @p4.l
    public final MutableLiveData<Boolean> M() {
        return this.f13854t;
    }

    public final void O(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        boolean z4 = false;
        this.f13838d = false;
        kotlinx.coroutines.k.f(this.f13851q, k1.c(), null, new j(context, null), 2, null);
        MutableLiveData<Boolean> mutableLiveData = this.f13856v;
        if (this.f13837c || this.f13838d) {
            z4 = true;
        }
        mutableLiveData.setValue(Boolean.valueOf(z4));
    }

    public final void P(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        boolean z4 = false;
        this.f13837c = false;
        kotlinx.coroutines.k.f(this.f13851q, k1.c(), null, new k(null), 2, null);
        MutableLiveData<Boolean> mutableLiveData = this.f13856v;
        if (this.f13837c || this.f13838d) {
            z4 = true;
        }
        mutableLiveData.setValue(Boolean.valueOf(z4));
    }

    public final void Q() {
        kotlinx.coroutines.k.f(this.f13851q, k1.c(), null, new l(null), 2, null);
    }

    public final void R(@p4.l Activity context, int i5) {
        kotlin.jvm.internal.l0.p(context, "context");
        if (!com.yuanqi.master.mine.account.a.f14786a.k()) {
            b(context, 1);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) AddAppActivity.class);
        intent.putExtra(com.yuanqi.master.config.c.f14521b, com.yuanqi.master.config.c.f14539k);
        intent.putExtra("appNum", i5);
        context.startActivity(intent);
    }

    public final void S(@p4.l String mPackageName, int i5, @p4.l v3.l<? super v2.b, r2> action) {
        kotlin.jvm.internal.l0.p(mPackageName, "mPackageName");
        kotlin.jvm.internal.l0.p(action, "action");
        kotlinx.coroutines.k.f(this.f13851q, k1.c(), null, new m(mPackageName, i5, action, null), 2, null);
    }

    public final void T(int i5) {
        boolean b5 = w0.f15264a.b("about_" + i5);
        boolean z4 = true;
        boolean z5 = b5 ^ true;
        this.f13838d = z5;
        MutableLiveData<Boolean> mutableLiveData = this.f13856v;
        if (!z5 && !this.f13837c) {
            z4 = false;
        }
        mutableLiveData.setValue(Boolean.valueOf(z4));
    }

    public final void U(int i5) {
        this.f13849o = i5;
    }

    public final void V(int i5) {
        this.f13848n.setValue(this, B[4], Integer.valueOf(i5));
    }

    public final void W(@p4.l MutableLiveData<List<v2.b>> mutableLiveData) {
        kotlin.jvm.internal.l0.p(mutableLiveData, "<set-?>");
        this.f13859y = mutableLiveData;
    }

    public final void X(@p4.l Context context, @p4.l Locale newLocale) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(newLocale, "newLocale");
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale.setDefault(newLocale);
        Configuration configuration2 = new Configuration(configuration);
        configuration2.setLocale(newLocale);
        context.createConfigurationContext(configuration2);
        context.getResources().updateConfiguration(configuration2, resources.getDisplayMetrics());
    }

    public final void Y(@p4.l Activity activity) {
        kotlin.jvm.internal.l0.p(activity, "<set-?>");
        this.f13853s = activity;
    }

    public final void Z(boolean z4) {
        this.f13838d = z4;
    }

    public final void a0(boolean z4) {
        this.f13837c = z4;
    }

    public final void b0(@p4.l s0 s0Var) {
        kotlin.jvm.internal.l0.p(s0Var, "<set-?>");
        this.f13851q = s0Var;
    }

    public final void j0(@p4.l Context context, @p4.m v2.b bVar, @p4.l v3.a<r2> openAction) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(openAction, "openAction");
        kotlinx.coroutines.k.f(this.f13851q, k1.e(), null, new o(bVar, context, this, openAction, null), 2, null);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onAdClose() {
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onAdShow() {
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onAdVideoBarClick() {
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onError(int i5, @p4.m String str) {
        t();
        Log.d(this.f13836b, "onError: code = " + i5 + " msg = " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onRewardArrived(boolean z4, int i5, @p4.m Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onRewardVerify(boolean z4, int i5, @p4.m String str, int i6, @p4.m String str2) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onRewardVideoAdLoad(@p4.m TTRewardVideoAd tTRewardVideoAd) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onRewardVideoCached() {
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative.RewardVideoAdListener
    public void onRewardVideoCached(@p4.m TTRewardVideoAd tTRewardVideoAd) {
        t();
        this.f13843i = tTRewardVideoAd;
        if (tTRewardVideoAd != null) {
            tTRewardVideoAd.setRewardAdInteractionListener(this);
        }
        TTRewardVideoAd tTRewardVideoAd2 = this.f13843i;
        if (tTRewardVideoAd2 != null) {
            tTRewardVideoAd2.showRewardVideoAd(C());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onSkippedVideo() {
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onVideoComplete() {
    }

    @Override // com.bytedance.sdk.openadsdk.TTRewardVideoAd.RewardAdInteractionListener
    public void onVideoError() {
    }

    public final void p() {
        if (!w0.f15264a.b(com.yuanqi.master.config.c.D)) {
            this.f13837c = true;
            this.f13856v.setValue(Boolean.TRUE);
        } else {
            this.f13837c = false;
            this.f13856v.setValue(Boolean.FALSE);
        }
        f1.a(com.yuanqi.master.network.repository.f.f14851g.h(), new c(), d.INSTANCE);
    }

    @p4.m
    public final Bitmap r(@p4.l byte[] bmpData) {
        kotlin.jvm.internal.l0.p(bmpData, "bmpData");
        return BitmapFactoryInstrumentation.decodeStream(new ByteArrayInputStream(bmpData));
    }

    public final void s(@p4.l com.yuanqi.group.home.models.b data) {
        kotlin.jvm.internal.l0.p(data, "data");
        kotlinx.coroutines.k.f(this.f13851q, k1.c(), null, new g(data, this, null), 2, null);
    }

    public final void u(boolean z4) {
        kotlinx.coroutines.k.f(this.f13851q, k1.c(), null, new h(z4, this, null), 2, null);
    }

    public final int w() {
        return this.f13849o;
    }

    public final int x() {
        return ((Number) this.f13848n.getValue(this, B[4])).intValue();
    }

    @p4.l
    public final MutableLiveData<List<v2.b>> y() {
        return this.f13859y;
    }
}
