package com.yuanqi.group.home;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.airbnb.lottie.LottieAnimationView;
import com.android.multidex.ClassPathElement;
import com.huawei.agconnect.apms.APMS;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.huawei.hms.analytics.HiAnalytics;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.oem.OemPermissionHelper;
import com.lody.virtual.server.content.SyncStorageEngine;
import com.tencent.vasdolly.helper.ChannelReaderUtil;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.bi;
import com.umeng.commonsdk.UMConfigure;
import com.yqtech.multiapp.R;
import com.yqtech.multiapp.databinding.ActivityHomeBinding;
import com.yqtech.multiapp.databinding.MenuHomeBinding;
import com.yuanqi.group.abs.ui.VActivity;
import com.yuanqi.group.home.HomeActivity;
import com.yuanqi.group.home.adapters.LaunchpadAdapter;
import com.yuanqi.group.home.adapters.decorations.ItemOffsetDecoration;
import com.yuanqi.group.home.models.AppInfoLite;
import com.yuanqi.group.home.r;
import com.yuanqi.master.ViewModelFactoryKt;
import com.yuanqi.master.addapp.AddAppActivity;
import com.yuanqi.master.config.a;
import com.yuanqi.master.manager.ManagerActivity;
import com.yuanqi.master.mine.MineActivity;
import com.yuanqi.master.start.WebActivity;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.guide.model.b;
import com.yuanqi.master.tools.q0;
import com.yuanqi.master.tools.v0;
import com.yuanqi.master.tools.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.e1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.x0;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.x2;
import socket.g;

@StabilityInferred(parameters = 0)
@Instrumented
@kotlin.i0(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020ZH\u0002J\b\u0010\\\u001a\u00020ZH\u0002J\u0018\u0010]\u001a\u00020Z2\u0006\u0010^\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u0017H\u0002J\b\u0010`\u001a\u00020ZH\u0002J\u000e\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u0006J\b\u0010d\u001a\u00020ZH\u0016J\b\u0010e\u001a\u00020ZH\u0002J\b\u0010f\u001a\u00020ZH\u0003J\b\u0010g\u001a\u00020ZH\u0002J\b\u0010h\u001a\u00020ZH\u0003J\b\u0010i\u001a\u00020ZH\u0002J\b\u0010j\u001a\u00020\u0017H\u0002J\b\u0010k\u001a\u00020\u0017H\u0002J\b\u0010l\u001a\u00020ZH\u0002J\"\u0010m\u001a\u00020Z2\u0006\u0010n\u001a\u00020\b2\u0006\u0010o\u001a\u00020p2\b\u0010q\u001a\u0004\u0018\u00010rH\u0002J\u0010\u0010s\u001a\u00020Z2\u0006\u0010t\u001a\u00020uH\u0016J\u0016\u0010v\u001a\u00020Z2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020p0xH\u0016J\"\u0010y\u001a\u00020Z2\u0006\u0010z\u001a\u00020\b2\u0006\u0010{\u001a\u00020\b2\b\u0010|\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010}\u001a\u00020ZH\u0016J\u0012\u0010~\u001a\u00020Z2\b\u0010\u007f\u001a\u0004\u0018\u00010\u0006H\u0016J\u0015\u0010\u0080\u0001\u001a\u00020Z2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0014J\u0012\u0010\u0083\u0001\u001a\u00020Z2\u0007\u0010\u0084\u0001\u001a\u00020\u000bH\u0014J\u001c\u0010\u0085\u0001\u001a\u00020Z2\u0007\u0010\u0086\u0001\u001a\u00020\u00172\b\u0010|\u001a\u0004\u0018\u00010bH\u0016J\t\u0010\u0087\u0001\u001a\u00020ZH\u0014J\u0011\u0010\u0088\u0001\u001a\u00020Z2\u0006\u0010|\u001a\u00020pH\u0016J\u0012\u0010\u0089\u0001\u001a\u00020Z2\u0007\u0010\u008a\u0001\u001a\u00020pH\u0016J\u0012\u0010\u008b\u0001\u001a\u00020Z2\u0007\u0010\u008a\u0001\u001a\u00020pH\u0016J\u0007\u0010\u008c\u0001\u001a\u00020ZJ\t\u0010\u008d\u0001\u001a\u00020ZH\u0002J\t\u0010\u008e\u0001\u001a\u00020ZH\u0016J\u0014\u0010\u008f\u0001\u001a\u00020Z2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010,H\u0016J$\u0010\u0091\u0001\u001a\u00020Z2\u0007\u0010\u0092\u0001\u001a\u00020\u00062\u0007\u0010\u0093\u0001\u001a\u00020\b2\u0007\u0010\u0094\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u0095\u0001\u001a\u00020ZH\u0002J%\u0010\u0096\u0001\u001a\u00020Z2\b\u0010\u0097\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u008a\u0001\u001a\u00020p2\u0007\u0010\u0099\u0001\u001a\u00020(H\u0016J\t\u0010\u009a\u0001\u001a\u00020ZH\u0016J\t\u0010\u009b\u0001\u001a\u00020ZH\u0016J\t\u0010\u009c\u0001\u001a\u00020ZH\u0016J\t\u0010\u009d\u0001\u001a\u00020ZH\u0016J\t\u0010\u009e\u0001\u001a\u00020ZH\u0002J3\u0010\u009f\u0001\u001a\u00020Z2\r\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020p0x2\u0007\u0010\u008a\u0001\u001a\u00020p2\u0006\u0010n\u001a\u00020\b2\b\u0010q\u001a\u0004\u0018\u00010rH\u0002J\t\u0010¡\u0001\u001a\u00020ZH\u0002J\t\u0010¢\u0001\u001a\u00020ZH\u0002J\u001c\u0010£\u0001\u001a\u00030\u0098\u00012\b\u0010¤\u0001\u001a\u00030\u0098\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R+\u00105\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001e\u001a\u0004\b6\u00107\"\u0004\b8\u00109R+\u0010;\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u001e\u001a\u0004\b<\u00107\"\u0004\b=\u00109R+\u0010?\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010\u001e\u001a\u0004\b@\u00107\"\u0004\bA\u00109R+\u0010C\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\u001e\u001a\u0004\bD\u00107\"\u0004\bE\u00109R+\u0010G\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u001e\u001a\u0004\bH\u0010\u001a\"\u0004\bI\u0010\u001cR+\u0010K\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010\u001e\u001a\u0004\bL\u00107\"\u0004\bM\u00109R+\u0010O\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010\u001e\u001a\u0004\bP\u0010\u001a\"\u0004\bQ\u0010\u001cR+\u0010S\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010\u001e\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006§\u0001"}, d2 = {"Lcom/yuanqi/group/home/HomeActivity;", "Lcom/yuanqi/group/abs/ui/VActivity;", "Lcom/yuanqi/group/home/HomeContract$HomeView;", "Lsocket/ClientCallback;", "()V", "TAG", "", "addAppNum", "", "addSelectAppLaunch", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "homeBinding", "Lcom/yqtech/multiapp/databinding/ActivityHomeBinding;", "homeViewModel", "Lcom/yuanqi/group/home/HomeViewModel;", "getHomeViewModel", "()Lcom/yuanqi/group/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "lastTime", "", "<set-?>", "", "longPressGuideKey", "getLongPressGuideKey", "()Z", "setLongPressGuideKey", "(Z)V", "longPressGuideKey$delegate", "Lcom/yuanqi/master/tools/MVFast;", "mLauncherView", "Landroidx/recyclerview/widget/RecyclerView;", "mLaunchpadAdapter", "Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;", "mLayoutManager", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "mLoadingView", "Lcom/airbnb/lottie/LottieAnimationView;", "mMenuView", "Landroid/view/View;", "mPopupMenu", "Landroid/widget/PopupWindow;", "mPresenter", "Lcom/yuanqi/group/home/HomeContract$HomePresenter;", "mUiHandler", "Landroid/os/Handler;", "menuClickListener", "Landroid/view/View$OnClickListener;", "menuHomeBinding", "Lcom/yqtech/multiapp/databinding/MenuHomeBinding;", "serverThread", "Lsocket/SocketServer$ServerThread;", "showADNoteKey", "getShowADNoteKey", "()I", "setShowADNoteKey", "(I)V", "showADNoteKey$delegate", "showAdNum", "getShowAdNum", "setShowAdNum", "showAdNum$delegate", "showAdNumNoLogin", "getShowAdNumNoLogin", "setShowAdNumNoLogin", "showAdNumNoLogin$delegate", "showAdVipKey", "getShowAdVipKey", "setShowAdVipKey", "showAdVipKey$delegate", "showFloatWindowKey", "getShowFloatWindowKey", "setShowFloatWindowKey", "showFloatWindowKey$delegate", "showGetAppKey", "getShowGetAppKey", "setShowGetAppKey", "showGetAppKey$delegate", "startGuideKey", "getStartGuideKey", "setStartGuideKey", "startGuideKey$delegate", "vipTimeNoLogin", "getVipTimeNoLogin", "()J", "setVipTimeNoLogin", "(J)V", "vipTimeNoLogin$delegate", "askInstallGms", "", "bindViews", "changeMenuIcon", "checkIfShortcut", "mIntent", "isRestart", "checkPermission", "hexStringToByteArray", "", bi.aE, "hideLoading", "initHW", "initLaunchpad", "initMenu", "initObserver", "initYoum", "isNotificationEnabled", "isServerStartUp", "jumpSelectApp", "launcherApp", "position", "appData", "Lcom/yuanqi/group/home/models/AppData;", "noteApp", "Lcom/yuanqi/master/database/model/AppNote;", "loadError", NotificationCompat.CATEGORY_ERROR, "", "loadFinish", "list", "", "onActivityResult", "requestCode", "resultCode", "data", "onBackPressed", "onClientConnected", "address", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "newIntent", "onReceiverData", SyncStorageEngine.MESG_SUCCESS, "onResume", "qickClone", "refreshLauncherItem", "model", "removeAppToLauncher", "requestNotificationPermission", "requestNotificationPolicyAccess", "saveConfig", "setPresenter", "presenter", "shortcutLaunchApp", "mPackageName", "mUserId", "mName", "showADNoteDialog", "showDeleteDialog", "updateContext", "Landroid/content/Context;", "view", "showGuide", "showLoading", "showOverlayPermissionDialog", "showPermissionDialog", "showUpDateContentDialog", "startAppManager", "mList", "startServer", "stopServer", "updateBaseContextLocale", com.umeng.analytics.pro.d.X, "locale", "Ljava/util/Locale;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/yuanqi/group/home/HomeActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Utils.kt\ncom/yuanqi/master/tools/UtilsKt\n*L\n1#1,1191:1\n75#2,13:1192\n1#3:1205\n766#4:1206\n857#4,2:1207\n350#4,7:1209\n378#4,7:1216\n288#4,2:1229\n288#4,2:1231\n33#5,6:1223\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/yuanqi/group/home/HomeActivity\n*L\n137#1:1192,13\n911#1:1206\n911#1:1207,2\n918#1:1209,7\n1026#1:1216,7\n986#1:1229,2\n989#1:1231,2\n566#1:1223,6\n*E\n"})
/* loaded from: classes3.dex */
public final class HomeActivity extends VActivity implements r.b, socket.f {
    static final /* synthetic */ kotlin.reflect.o<Object>[] A = {l1.k(new x0(HomeActivity.class, "showADNoteKey", "getShowADNoteKey()I", 0)), l1.k(new x0(HomeActivity.class, "showAdVipKey", "getShowAdVipKey()I", 0)), l1.k(new x0(HomeActivity.class, "showAdNum", "getShowAdNum()I", 0)), l1.k(new x0(HomeActivity.class, "showAdNumNoLogin", "getShowAdNumNoLogin()I", 0)), l1.k(new x0(HomeActivity.class, "vipTimeNoLogin", "getVipTimeNoLogin()J", 0)), l1.k(new x0(HomeActivity.class, "showGetAppKey", "getShowGetAppKey()I", 0)), l1.k(new x0(HomeActivity.class, "startGuideKey", "getStartGuideKey()Z", 0)), l1.k(new x0(HomeActivity.class, "longPressGuideKey", "getLongPressGuideKey()Z", 0)), l1.k(new x0(HomeActivity.class, "showFloatWindowKey", "getShowFloatWindowKey()Z", 0))};
    public static final int B = 8;

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private r.a f13804a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private LottieAnimationView f13805b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private RecyclerView f13806c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private View f13807d;

    /* renamed from: e, reason: collision with root package name */
    @p4.m
    private PopupWindow f13808e;

    /* renamed from: f, reason: collision with root package name */
    @p4.m
    private StaggeredGridLayoutManager f13809f;

    /* renamed from: g, reason: collision with root package name */
    @p4.m
    private LaunchpadAdapter f13810g;

    /* renamed from: h, reason: collision with root package name */
    @p4.m
    private Handler f13811h;

    /* renamed from: k, reason: collision with root package name */
    private ActivityHomeBinding f13814k;

    /* renamed from: m, reason: collision with root package name */
    @p4.l
    private final kotlin.d0 f13816m;

    /* renamed from: n, reason: collision with root package name */
    @p4.l
    private final ActivityResultLauncher<Intent> f13817n;

    /* renamed from: o, reason: collision with root package name */
    private int f13818o;

    /* renamed from: p, reason: collision with root package name */
    @p4.m
    private g.c f13819p;

    /* renamed from: q, reason: collision with root package name */
    private long f13820q;

    /* renamed from: r, reason: collision with root package name */
    @p4.l
    private final View.OnClickListener f13821r;

    /* renamed from: s, reason: collision with root package name */
    private MenuHomeBinding f13822s;

    /* renamed from: t, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.tools.x0 f13823t;

    /* renamed from: u, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.tools.x0 f13824u;

    /* renamed from: v, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.tools.x0 f13825v;

    /* renamed from: w, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.tools.x0 f13826w;

    /* renamed from: x, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.tools.x0 f13827x;

    /* renamed from: y, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.tools.x0 f13828y;

    /* renamed from: z, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.tools.x0 f13829z;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.tools.x0 f13812i = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.f14555y, 0);

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.tools.x0 f13813j = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.f14556z, 0);

    /* renamed from: l, reason: collision with root package name */
    @p4.l
    private final String f13815l = "HomeActivity";

    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Landroidx/activity/result/ActivityResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a implements ActivityResultCallback<ActivityResult> {
        a() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(@p4.l ActivityResult result) {
            Intent data;
            kotlin.jvm.internal.l0.p(result, "result");
            if (result.getResultCode() == -1 && (data = result.getData()) != null) {
                HomeActivity homeActivity = HomeActivity.this;
                ArrayList<AppInfoLite> parcelableArrayListExtra = data.getParcelableArrayListExtra(com.yuanqi.group.c.f13754h);
                if (parcelableArrayListExtra != null) {
                    homeActivity.f13818o = parcelableArrayListExtra.size();
                    for (AppInfoLite appInfoLite : parcelableArrayListExtra) {
                        r.a aVar = homeActivity.f13804a;
                        kotlin.jvm.internal.l0.m(aVar);
                        aVar.c(appInfoLite);
                    }
                }
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$4"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a0 extends kotlin.jvm.internal.n0 implements v3.a<CreationExtras> {
        final /* synthetic */ v3.a $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(v3.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = aVar;
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            v3.a aVar = this.$extrasProducer;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.n0 implements v3.a<r2> {
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
            HomeActivity.this.e1(1);
            HomeActivity.this.Q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/yuanqi/group/home/HomeActivity$changeMenuIcon$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1191:1\n766#2:1192\n857#2,2:1193\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/yuanqi/group/home/HomeActivity$changeMenuIcon$2$1\n*L\n430#1:1192\n430#1:1193,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.n0 implements v3.a<r2> {
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
            LaunchpadAdapter launchpadAdapter = HomeActivity.this.f13810g;
            kotlin.jvm.internal.l0.m(launchpadAdapter);
            List<com.yuanqi.group.home.models.b> i5 = launchpadAdapter.i();
            kotlin.jvm.internal.l0.m(i5);
            ArrayList arrayList = new ArrayList();
            for (Object obj : i5) {
                if (((com.yuanqi.group.home.models.b) obj).isSelect) {
                    arrayList.add(obj);
                }
            }
            r.a aVar = HomeActivity.this.f13804a;
            kotlin.jvm.internal.l0.m(aVar);
            aVar.e(arrayList);
            HomeActivity.this.w0().A().postValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeActivity$checkIfShortcut$1", f = "HomeActivity.kt", i = {}, l = {238, 239}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ String $mName;
        final /* synthetic */ String $mPackageName;
        final /* synthetic */ int $mUserId;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeActivity$checkIfShortcut$1$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ String $mName;
            final /* synthetic */ String $mPackageName;
            final /* synthetic */ int $mUserId;
            int label;
            final /* synthetic */ HomeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeActivity homeActivity, String str, int i5, String str2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.this$0 = homeActivity;
                this.$mPackageName = str;
                this.$mUserId = i5;
                this.$mName = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new a(this.this$0, this.$mPackageName, this.$mUserId, this.$mName, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    this.this$0.h1(this.$mPackageName, this.$mUserId, this.$mName);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, int i5, String str2, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.$mPackageName = str;
            this.$mUserId = i5;
            this.$mName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new d(this.$mPackageName, this.$mUserId, this.$mName, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        e1.n(obj);
                        return r2.f19517a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
            } else {
                e1.n(obj);
                this.label = 1;
                if (d1.b(500L, this) == l5) {
                    return l5;
                }
            }
            x2 e5 = k1.e();
            a aVar = new a(HomeActivity.this, this.$mPackageName, this.$mUserId, this.$mName, null);
            this.label = 2;
            if (kotlinx.coroutines.i.h(e5, aVar, this) == l5) {
                return l5;
            }
            return r2.f19517a;
        }
    }

    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class e extends kotlin.jvm.internal.n0 implements v3.a<ViewModelProvider.Factory> {
        public static final e INSTANCE = new e();

        e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final ViewModelProvider.Factory invoke() {
            return ViewModelFactoryKt.a();
        }
    }

    @kotlin.i0(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J8\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J8\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016¨\u0006\u0015"}, d2 = {"com/yuanqi/group/home/HomeActivity$initLaunchpad$1", "Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$OnAppClickListener;", "onAppClick", "", "position", "", "model", "Lcom/yuanqi/group/home/models/AppData;", "noteApp", "Lcom/yuanqi/master/database/model/AppNote;", "mList", "", "onAppError", "msg", "", "onAppLongPress", "itemView", "Landroid/view/View;", "appData", "onAppOtherClick", "view", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/yuanqi/group/home/HomeActivity$initLaunchpad$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1191:1\n766#2:1192\n857#2,2:1193\n350#2,7:1195\n766#2:1202\n857#2,2:1203\n350#2,7:1205\n766#2:1212\n857#2,2:1213\n350#2,7:1215\n766#2:1222\n857#2,2:1223\n350#2,7:1225\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/yuanqi/group/home/HomeActivity$initLaunchpad$1\n*L\n826#1:1192\n826#1:1193,2\n827#1:1195,7\n851#1:1202\n851#1:1203,2\n852#1:1205,7\n876#1:1212\n876#1:1213,2\n877#1:1215,7\n883#1:1222\n883#1:1223,2\n885#1:1225,7\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class f implements LaunchpadAdapter.b {

        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ HomeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeActivity homeActivity) {
                super(0);
                this.this$0 = homeActivity;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.w0().a(this.this$0, 2);
            }
        }

        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        static final class b extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ HomeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(HomeActivity homeActivity) {
                super(0);
                this.this$0 = homeActivity;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.w0().b(this.this$0, 2);
            }
        }

        f() {
        }

        @Override // com.yuanqi.group.home.adapters.LaunchpadAdapter.b
        public void a(@p4.l String msg) {
            kotlin.jvm.internal.l0.p(msg, "msg");
            f1.r(msg, 0, 2, null);
        }

        @Override // com.yuanqi.group.home.adapters.LaunchpadAdapter.b
        public void b(int i5, @p4.l com.yuanqi.group.home.models.b model, @p4.m v2.b bVar, @p4.l List<com.yuanqi.group.home.models.b> mList) {
            boolean s8;
            kotlin.jvm.internal.l0.p(model, "model");
            kotlin.jvm.internal.l0.p(mList, "mList");
            s8 = kotlin.collections.p.s8(com.yuanqi.master.config.c.a(), model.getPackageName());
            int i6 = 0;
            if (s8) {
                String string = HomeActivity.this.getResources().getString(R.string.app_not_supported);
                kotlin.jvm.internal.l0.o(string, "getString(...)");
                f1.r(string, 0, 2, null);
                return;
            }
            com.yuanqi.master.mine.account.a aVar = com.yuanqi.master.mine.account.a.f14786a;
            if (!aVar.c()) {
                HomeActivity.this.w0().a(HomeActivity.this, 2);
                return;
            }
            if (!aVar.k()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : mList) {
                    if (kotlin.jvm.internal.l0.g(((com.yuanqi.group.home.models.b) obj).getPackageName(), model.getPackageName())) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (kotlin.jvm.internal.l0.g((com.yuanqi.group.home.models.b) it.next(), model)) {
                            break;
                        } else {
                            i6++;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                if (i6 != 0) {
                    HomeActivity.this.w0().b(HomeActivity.this, 2);
                    return;
                }
            }
            HomeActivity.this.R0(i5, model, bVar);
        }

        @Override // com.yuanqi.group.home.adapters.LaunchpadAdapter.b
        public void c(int i5, @p4.l View itemView, @p4.l com.yuanqi.group.home.models.b appData, @p4.m v2.b bVar, @p4.l List<com.yuanqi.group.home.models.b> mList) {
            boolean s8;
            boolean z4;
            kotlin.jvm.internal.l0.p(itemView, "itemView");
            kotlin.jvm.internal.l0.p(appData, "appData");
            kotlin.jvm.internal.l0.p(mList, "mList");
            s8 = kotlin.collections.p.s8(com.yuanqi.master.config.c.a(), appData.getPackageName());
            if (s8) {
                String string = HomeActivity.this.getResources().getString(R.string.app_not_supported);
                kotlin.jvm.internal.l0.o(string, "getString(...)");
                f1.r(string, 0, 2, null);
                return;
            }
            com.yuanqi.master.mine.account.a aVar = com.yuanqi.master.mine.account.a.f14786a;
            if (!aVar.c()) {
                HomeActivity.this.w0().a(HomeActivity.this, 2);
                return;
            }
            int i6 = -1;
            if (!aVar.k()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : mList) {
                    if (kotlin.jvm.internal.l0.g(((com.yuanqi.group.home.models.b) obj).getPackageName(), appData.getPackageName())) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                int i7 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (kotlin.jvm.internal.l0.g((com.yuanqi.group.home.models.b) it.next(), appData)) {
                            break;
                        } else {
                            i7++;
                        }
                    } else {
                        i7 = -1;
                        break;
                    }
                }
                if (i7 != 0) {
                    HomeActivity.this.w0().b(HomeActivity.this, 2);
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : mList) {
                if (kotlin.jvm.internal.l0.g(((com.yuanqi.group.home.models.b) obj2).getPackageName(), appData.getPackageName())) {
                    arrayList2.add(obj2);
                }
            }
            r.a aVar2 = HomeActivity.this.f13804a;
            kotlin.jvm.internal.l0.m(aVar2);
            HomeActivity homeActivity = HomeActivity.this;
            Iterator it2 = arrayList2.iterator();
            int i8 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.l0.g((com.yuanqi.group.home.models.b) it2.next(), appData)) {
                    i6 = i8;
                    break;
                }
                i8++;
            }
            if (i6 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            aVar2.k(homeActivity, i5, itemView, appData, bVar, z4, new a(HomeActivity.this), new b(HomeActivity.this));
        }

        @Override // com.yuanqi.group.home.adapters.LaunchpadAdapter.b
        public void d(int i5, @p4.l View view, @p4.l com.yuanqi.group.home.models.b model, @p4.m v2.b bVar, @p4.l List<com.yuanqi.group.home.models.b> mList) {
            boolean s8;
            kotlin.jvm.internal.l0.p(view, "view");
            kotlin.jvm.internal.l0.p(model, "model");
            kotlin.jvm.internal.l0.p(mList, "mList");
            s8 = kotlin.collections.p.s8(com.yuanqi.master.config.c.a(), model.getPackageName());
            int i6 = 0;
            if (s8) {
                String string = HomeActivity.this.getResources().getString(R.string.app_not_supported);
                kotlin.jvm.internal.l0.o(string, "getString(...)");
                f1.r(string, 0, 2, null);
                return;
            }
            com.yuanqi.master.mine.account.a aVar = com.yuanqi.master.mine.account.a.f14786a;
            if (!aVar.c()) {
                HomeActivity.this.w0().a(HomeActivity.this, 2);
                return;
            }
            if (!aVar.k()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : mList) {
                    if (kotlin.jvm.internal.l0.g(((com.yuanqi.group.home.models.b) obj).getPackageName(), model.getPackageName())) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (kotlin.jvm.internal.l0.g((com.yuanqi.group.home.models.b) it.next(), model)) {
                            break;
                        } else {
                            i6++;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                if (i6 != 0) {
                    HomeActivity.this.w0().b(HomeActivity.this, 2);
                    return;
                }
            }
            HomeActivity.this.m1(mList, model, i5, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lcom/yuanqi/master/database/model/AppNote;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g implements Observer<List<? extends v2.b>> {
        g() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(List<v2.b> list) {
            LaunchpadAdapter launchpadAdapter = HomeActivity.this.f13810g;
            kotlin.jvm.internal.l0.m(launchpadAdapter);
            launchpadAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.n0 implements v3.a<r2> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ HomeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeActivity homeActivity) {
                super(0);
                this.this$0 = homeActivity;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MenuHomeBinding menuHomeBinding = this.this$0.f13822s;
                if (menuHomeBinding == null) {
                    kotlin.jvm.internal.l0.S("menuHomeBinding");
                    menuHomeBinding = null;
                }
                menuHomeBinding.menuAccountText.setText(com.yuanqi.master.mine.account.a.f14786a.e());
            }
        }

        h() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            com.yuanqi.master.mine.account.a.f14786a.n(HomeActivity.this.w0().G(), new a(HomeActivity.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/yuanqi/group/home/HomeActivity$initObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1191:1\n1855#2,2:1192\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/yuanqi/group/home/HomeActivity$initObserver$1\n*L\n295#1:1192,2\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.n0 implements v3.l<Boolean, r2> {
        i() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
            invoke2(bool);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (!bool.booleanValue()) {
                LaunchpadAdapter launchpadAdapter = HomeActivity.this.f13810g;
                kotlin.jvm.internal.l0.m(launchpadAdapter);
                List<com.yuanqi.group.home.models.b> i5 = launchpadAdapter.i();
                if (i5 != null) {
                    Iterator<T> it = i5.iterator();
                    while (it.hasNext()) {
                        ((com.yuanqi.group.home.models.b) it.next()).isSelect = false;
                    }
                }
                ActivityHomeBinding activityHomeBinding = HomeActivity.this.f13814k;
                ActivityHomeBinding activityHomeBinding2 = null;
                if (activityHomeBinding == null) {
                    kotlin.jvm.internal.l0.S("homeBinding");
                    activityHomeBinding = null;
                }
                activityHomeBinding.selectNum.setText("");
                ActivityHomeBinding activityHomeBinding3 = HomeActivity.this.f13814k;
                if (activityHomeBinding3 == null) {
                    kotlin.jvm.internal.l0.S("homeBinding");
                } else {
                    activityHomeBinding2 = activityHomeBinding3;
                }
                activityHomeBinding2.totalNum.setText("");
            }
            LaunchpadAdapter launchpadAdapter2 = HomeActivity.this.f13810g;
            if (launchpadAdapter2 != null) {
                launchpadAdapter2.notifyDataSetChanged();
            }
            HomeActivity.this.r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/yuanqi/group/home/models/AppData;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j extends kotlin.jvm.internal.n0 implements v3.l<List<com.yuanqi.group.home.models.b>, r2> {
        j() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(List<com.yuanqi.group.home.models.b> list) {
            invoke2(list);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<com.yuanqi.group.home.models.b> list) {
            kotlin.jvm.internal.l0.m(list);
            ActivityHomeBinding activityHomeBinding = null;
            if (!list.isEmpty()) {
                ActivityHomeBinding activityHomeBinding2 = HomeActivity.this.f13814k;
                if (activityHomeBinding2 == null) {
                    kotlin.jvm.internal.l0.S("homeBinding");
                    activityHomeBinding2 = null;
                }
                activityHomeBinding2.selectNum.setText(String.valueOf(list.size()));
                ActivityHomeBinding activityHomeBinding3 = HomeActivity.this.f13814k;
                if (activityHomeBinding3 == null) {
                    kotlin.jvm.internal.l0.S("homeBinding");
                } else {
                    activityHomeBinding = activityHomeBinding3;
                }
                TextView textView = activityHomeBinding.totalNum;
                HomeActivity homeActivity = HomeActivity.this;
                StringBuilder sb = new StringBuilder();
                sb.append(ClassPathElement.SEPARATOR_CHAR);
                LaunchpadAdapter launchpadAdapter = homeActivity.f13810g;
                kotlin.jvm.internal.l0.m(launchpadAdapter);
                List<com.yuanqi.group.home.models.b> i5 = launchpadAdapter.i();
                kotlin.jvm.internal.l0.m(i5);
                sb.append(i5.size());
                textView.setText(sb.toString());
                int size = list.size();
                LaunchpadAdapter launchpadAdapter2 = homeActivity.f13810g;
                kotlin.jvm.internal.l0.m(launchpadAdapter2);
                List<com.yuanqi.group.home.models.b> i6 = launchpadAdapter2.i();
                kotlin.jvm.internal.l0.m(i6);
                textView.setTextColor(ContextCompat.getColor(homeActivity, size == i6.size() ? R.color.select_color : R.color.total_color));
                return;
            }
            ActivityHomeBinding activityHomeBinding4 = HomeActivity.this.f13814k;
            if (activityHomeBinding4 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding4 = null;
            }
            activityHomeBinding4.selectNum.setText("");
            ActivityHomeBinding activityHomeBinding5 = HomeActivity.this.f13814k;
            if (activityHomeBinding5 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
            } else {
                activityHomeBinding = activityHomeBinding5;
            }
            activityHomeBinding.totalNum.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k extends kotlin.jvm.internal.n0 implements v3.l<Boolean, r2> {
        k() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
            invoke2(bool);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            ActivityHomeBinding activityHomeBinding = HomeActivity.this.f13814k;
            if (activityHomeBinding == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding = null;
            }
            ImageView imageView = activityHomeBinding.homeMenu;
            kotlin.jvm.internal.l0.m(bool);
            imageView.setImageResource(bool.booleanValue() ? R.mipmap.menu_red : R.mipmap.menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l extends kotlin.jvm.internal.n0 implements v3.l<Boolean, r2> {

        @kotlin.i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/yuanqi/group/home/HomeActivity$initObserver$4$1", "Lcom/yuanqi/master/tools/guide/listener/OnGuideChangedListener;", "onRemoved", "", "controller", "Lcom/yuanqi/master/tools/guide/core/Controller;", "onShowed", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements y2.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeActivity f13833a;

            a(HomeActivity homeActivity) {
                this.f13833a = homeActivity;
            }

            @Override // y2.b
            public void a(@p4.m com.yuanqi.master.tools.guide.core.b bVar) {
                this.f13833a.w0().M().setValue(Boolean.FALSE);
            }

            @Override // y2.b
            public void b(@p4.m com.yuanqi.master.tools.guide.core.b bVar) {
                this.f13833a.f1(true);
                this.f13833a.w0().M().setValue(Boolean.FALSE);
                ActivityHomeBinding activityHomeBinding = this.f13833a.f13814k;
                if (activityHomeBinding == null) {
                    kotlin.jvm.internal.l0.S("homeBinding");
                    activityHomeBinding = null;
                }
                if (activityHomeBinding.homeLauncher.getChildCount() > 0) {
                    this.f13833a.w0().B().setValue(Boolean.TRUE);
                }
            }
        }

        l() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
            invoke2(bool);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            kotlin.jvm.internal.l0.m(bool);
            if (!bool.booleanValue() || HomeActivity.this.E0()) {
                return;
            }
            com.yuanqi.master.tools.guide.core.a g5 = x2.a.b(HomeActivity.this).f("guide_start").g(new a(HomeActivity.this));
            com.yuanqi.master.tools.guide.model.a D = com.yuanqi.master.tools.guide.model.a.D();
            ActivityHomeBinding activityHomeBinding = HomeActivity.this.f13814k;
            if (activityHomeBinding == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding = null;
            }
            g5.a(D.h(activityHomeBinding.homeMenu, b.a.RECTANGLE).I(R.layout.view_guide_menu, new int[0])).j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m extends kotlin.jvm.internal.n0 implements v3.l<Boolean, r2> {

        @kotlin.i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/yuanqi/group/home/HomeActivity$initObserver$5$1$1", "Lcom/yuanqi/master/tools/guide/listener/OnGuideChangedListener;", "onRemoved", "", "controller", "Lcom/yuanqi/master/tools/guide/core/Controller;", "onShowed", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements y2.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeActivity f13834a;

            a(HomeActivity homeActivity) {
                this.f13834a = homeActivity;
            }

            @Override // y2.b
            public void a(@p4.m com.yuanqi.master.tools.guide.core.b bVar) {
                this.f13834a.X0(true);
            }

            @Override // y2.b
            public void b(@p4.m com.yuanqi.master.tools.guide.core.b bVar) {
                this.f13834a.X0(true);
            }
        }

        m() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(HomeActivity this$0) {
            kotlin.jvm.internal.l0.p(this$0, "this$0");
            ActivityHomeBinding activityHomeBinding = this$0.f13814k;
            ActivityHomeBinding activityHomeBinding2 = null;
            if (activityHomeBinding == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding = null;
            }
            if (activityHomeBinding.homeLauncher.getChildCount() <= 0) {
                Log.d(this$0.f13815l, "No child views available.");
                return;
            }
            ActivityHomeBinding activityHomeBinding3 = this$0.f13814k;
            if (activityHomeBinding3 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
            } else {
                activityHomeBinding2 = activityHomeBinding3;
            }
            View childAt = activityHomeBinding2.homeLauncher.getChildAt(0);
            if (childAt.getParent() != null && childAt.isAttachedToWindow() && childAt.getVisibility() == 0) {
                x2.a.b(this$0).f("guide_long_press").g(new a(this$0)).a(com.yuanqi.master.tools.guide.model.a.D().h(childAt, b.a.RECTANGLE).I(R.layout.view_guide_long_press, new int[0])).j();
            } else {
                Log.d(this$0.f13815l, "The view is not showing in the window or is not visible.");
            }
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
            invoke2(bool);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            kotlin.jvm.internal.l0.m(bool);
            if (bool.booleanValue() && HomeActivity.this.E0() && !HomeActivity.this.x0()) {
                ActivityHomeBinding activityHomeBinding = HomeActivity.this.f13814k;
                if (activityHomeBinding == null) {
                    kotlin.jvm.internal.l0.S("homeBinding");
                    activityHomeBinding = null;
                }
                RecyclerView recyclerView = activityHomeBinding.homeLauncher;
                final HomeActivity homeActivity = HomeActivity.this;
                recyclerView.post(new Runnable() { // from class: com.yuanqi.group.home.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeActivity.m.invoke$lambda$0(HomeActivity.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ com.yuanqi.group.home.models.b $appData;
        final /* synthetic */ v2.b $noteApp;
        final /* synthetic */ int $position;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
            final /* synthetic */ com.yuanqi.group.home.models.b $appData;
            final /* synthetic */ int $position;
            final /* synthetic */ HomeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeActivity homeActivity, int i5, com.yuanqi.group.home.models.b bVar) {
                super(0);
                this.this$0 = homeActivity;
                this.$position = i5;
                this.$appData = bVar;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LaunchpadAdapter launchpadAdapter = this.this$0.f13810g;
                kotlin.jvm.internal.l0.m(launchpadAdapter);
                launchpadAdapter.notifyItemChanged(this.$position);
                r.a aVar = this.this$0.f13804a;
                kotlin.jvm.internal.l0.m(aVar);
                int userId = this.$appData.getUserId();
                String packageName = this.$appData.getPackageName();
                kotlin.jvm.internal.l0.o(packageName, "getPackageName(...)");
                String name = this.$appData.getName();
                kotlin.jvm.internal.l0.o(name, "getName(...)");
                aVar.g(userId, packageName, name);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(v2.b bVar, int i5, com.yuanqi.group.home.models.b bVar2) {
            super(0);
            this.$noteApp = bVar;
            this.$position = i5;
            this.$appData = bVar2;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HomeViewModel w02 = HomeActivity.this.w0();
            HomeActivity homeActivity = HomeActivity.this;
            w02.j0(homeActivity, this.$noteApp, new a(homeActivity, this.$position, this.$appData));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        public static final o INSTANCE = new o();

        o() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VActivityManager.get().killAllApps();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class p extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        p() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Intent intent = new Intent(HomeActivity.this, (Class<?>) MineActivity.class);
            intent.putExtra("register", 1);
            HomeActivity.this.startActivity(intent);
        }
    }

    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class q extends kotlin.jvm.internal.n0 implements v3.a<r2> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeActivity$onCreate$1$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            int label;
            final /* synthetic */ HomeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeActivity homeActivity, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.this$0 = homeActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new a(this.this$0, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    com.yuanqi.master.tools.o0.f15213a.R0(this.this$0);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        q() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            kotlinx.coroutines.k.f(HomeActivity.this.w0().G(), k1.e(), null, new a(HomeActivity.this, null), 2, null);
        }
    }

    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class r extends kotlin.jvm.internal.n0 implements v3.a<r2> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.group.home.HomeActivity$onResume$1$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            int label;
            final /* synthetic */ HomeActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeActivity homeActivity, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.this$0 = homeActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new a(this.this$0, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                int i5;
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    ActivityHomeBinding activityHomeBinding = this.this$0.f13814k;
                    if (activityHomeBinding == null) {
                        kotlin.jvm.internal.l0.S("homeBinding");
                        activityHomeBinding = null;
                    }
                    ImageView imageView = activityHomeBinding.homeVip;
                    if (com.yuanqi.master.mine.account.a.f14786a.k()) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    imageView.setVisibility(i5);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        r() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            kotlinx.coroutines.k.f(HomeActivity.this.w0().G(), k1.e(), null, new a(HomeActivity.this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class s implements Observer, kotlin.jvm.internal.d0 {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ v3.l f13835a;

        s(v3.l function) {
            kotlin.jvm.internal.l0.p(function, "function");
            this.f13835a = function;
        }

        public final boolean equals(@p4.m Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.d0)) {
                return kotlin.jvm.internal.l0.g(getFunctionDelegate(), ((kotlin.jvm.internal.d0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d0
        @p4.l
        public final kotlin.v<?> getFunctionDelegate() {
            return this.f13835a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13835a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class t extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ String $mName;
        final /* synthetic */ String $mPackageName;
        final /* synthetic */ int $mUserId;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/database/model/AppNote;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.n0 implements v3.l<v2.b, r2> {
            final /* synthetic */ String $mName;
            final /* synthetic */ String $mPackageName;
            final /* synthetic */ int $mUserId;
            final /* synthetic */ HomeActivity this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.yuanqi.group.home.HomeActivity$t$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0259a extends kotlin.jvm.internal.n0 implements v3.a<r2> {
                final /* synthetic */ String $mName;
                final /* synthetic */ String $mPackageName;
                final /* synthetic */ int $mUserId;
                final /* synthetic */ HomeActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0259a(HomeActivity homeActivity, int i5, String str, String str2) {
                    super(0);
                    this.this$0 = homeActivity;
                    this.$mUserId = i5;
                    this.$mPackageName = str;
                    this.$mName = str2;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    r.a aVar = this.this$0.f13804a;
                    kotlin.jvm.internal.l0.m(aVar);
                    aVar.g(this.$mUserId, this.$mPackageName, this.$mName);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeActivity homeActivity, int i5, String str, String str2) {
                super(1);
                this.this$0 = homeActivity;
                this.$mUserId = i5;
                this.$mPackageName = str;
                this.$mName = str2;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(v2.b bVar) {
                invoke2(bVar);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.m v2.b bVar) {
                HomeViewModel w02 = this.this$0.w0();
                HomeActivity homeActivity = this.this$0;
                w02.j0(homeActivity, bVar, new C0259a(homeActivity, this.$mUserId, this.$mPackageName, this.$mName));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, int i5, String str2) {
            super(0);
            this.$mPackageName = str;
            this.$mUserId = i5;
            this.$mName = str2;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HomeViewModel w02 = HomeActivity.this.w0();
            String str = this.$mPackageName;
            int i5 = this.$mUserId;
            w02.S(str, i5, new a(HomeActivity.this, i5, str, this.$mName));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class u extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        u() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HomeActivity.this.l1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class v extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        v() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HomeActivity.this.Z0(1);
        }
    }

    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class w extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ com.yuanqi.group.home.models.b $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(com.yuanqi.group.home.models.b bVar) {
            super(0);
            this.$model = bVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            r.a aVar = HomeActivity.this.f13804a;
            kotlin.jvm.internal.l0.m(aVar);
            aVar.b(this.$model);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class x extends kotlin.jvm.internal.n0 implements v3.a<r2> {
        final /* synthetic */ String $showUpDateContentKey;
        final /* synthetic */ HomeActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, HomeActivity homeActivity) {
            super(0);
            this.$showUpDateContentKey = str;
            this.this$0 = homeActivity;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            w0.f15264a.d(this.$showUpDateContentKey, 1);
            this.this$0.w0().M().setValue(Boolean.TRUE);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class y extends kotlin.jvm.internal.n0 implements v3.a<ViewModelProvider.Factory> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final ViewModelProvider.Factory invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class z extends kotlin.jvm.internal.n0 implements v3.a<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    public HomeActivity() {
        v3.a aVar = e.INSTANCE;
        this.f13816m = new ViewModelLazy(l1.d(HomeViewModel.class), new z(this), aVar == null ? new y(this) : aVar, new a0(null, this));
        this.f13817n = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a());
        this.f13821r = new View.OnClickListener() { // from class: com.yuanqi.group.home.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.T0(HomeActivity.this, view);
            }
        };
        this.f13823t = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.F, 0);
        this.f13824u = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.G, 0);
        this.f13825v = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.H, 0L);
        this.f13826w = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.f14554x, 0);
        Boolean bool = Boolean.FALSE;
        this.f13827x = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.P, bool);
        this.f13828y = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.R, bool);
        this.f13829z = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.S, bool);
    }

    private final int A0() {
        return ((Number) this.f13824u.getValue(this, A[3])).intValue();
    }

    private final int B0() {
        return ((Number) this.f13813j.getValue(this, A[1])).intValue();
    }

    private final boolean C0() {
        return ((Boolean) this.f13829z.getValue(this, A[8])).booleanValue();
    }

    private final int D0() {
        return ((Number) this.f13826w.getValue(this, A[5])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E0() {
        return ((Boolean) this.f13827x.getValue(this, A[6])).booleanValue();
    }

    private final long F0() {
        return ((Number) this.f13825v.getValue(this, A[4])).longValue();
    }

    private final void H0() {
        HiAnalytics.getInstance(getApplicationContext()).setChannel(ChannelReaderUtil.getChannel(getApplicationContext()));
        APMS.getInstance().setUserPrivacyAgreed(true);
        APMS.getInstance().enableCollection(true);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void I0() {
        RecyclerView recyclerView = this.f13806c;
        kotlin.jvm.internal.l0.m(recyclerView);
        recyclerView.setHasFixedSize(true);
        this.f13809f = new StaggeredGridLayoutManager(com.yuanqi.master.config.a.f14505g.a().c().getValue().intValue(), 1);
        RecyclerView recyclerView2 = this.f13806c;
        kotlin.jvm.internal.l0.m(recyclerView2);
        recyclerView2.setLayoutManager(this.f13809f);
        this.f13810g = new LaunchpadAdapter(this, w0(), w0().x());
        RecyclerView recyclerView3 = this.f13806c;
        kotlin.jvm.internal.l0.m(recyclerView3);
        recyclerView3.setAdapter(this.f13810g);
        RecyclerView recyclerView4 = this.f13806c;
        kotlin.jvm.internal.l0.m(recyclerView4);
        recyclerView4.addItemDecoration(new ItemOffsetDecoration(this, R.dimen.desktop_divider));
        LaunchpadAdapter launchpadAdapter = this.f13810g;
        kotlin.jvm.internal.l0.m(launchpadAdapter);
        launchpadAdapter.w(new f());
        w0().y().observe(this, new g());
        LaunchpadAdapter launchpadAdapter2 = this.f13810g;
        kotlin.jvm.internal.l0.m(launchpadAdapter2);
        RecyclerView recyclerView5 = this.f13806c;
        kotlin.jvm.internal.l0.m(recyclerView5);
        final GestureDetector gestureDetector = new GestureDetector(this, new com.yuanqi.group.home.adapters.j(launchpadAdapter2, recyclerView5));
        RecyclerView recyclerView6 = this.f13806c;
        kotlin.jvm.internal.l0.m(recyclerView6);
        recyclerView6.setOnTouchListener(new View.OnTouchListener() { // from class: com.yuanqi.group.home.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean J0;
                J0 = HomeActivity.J0(gestureDetector, view, motionEvent);
                return J0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J0(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.l0.p(gestureDetector, "$gestureDetector");
        gestureDetector.onTouchEvent(motionEvent);
        return false;
    }

    private final void K0() {
        this.f13808e = new PopupWindow(new ContextThemeWrapper(this, R.style.MyPopMenuTheme));
        MenuHomeBinding inflate = MenuHomeBinding.inflate(LayoutInflater.from(p1(this, com.yuanqi.master.config.a.f14505g.a().e())));
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        this.f13822s = inflate;
        PopupWindow popupWindow = this.f13808e;
        kotlin.jvm.internal.l0.m(popupWindow);
        MenuHomeBinding menuHomeBinding = this.f13822s;
        MenuHomeBinding menuHomeBinding2 = null;
        if (menuHomeBinding == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
            menuHomeBinding = null;
        }
        popupWindow.setContentView(menuHomeBinding.getRoot());
        PopupWindow popupWindow2 = this.f13808e;
        kotlin.jvm.internal.l0.m(popupWindow2);
        popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
        MenuHomeBinding menuHomeBinding3 = this.f13822s;
        if (menuHomeBinding3 == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
            menuHomeBinding3 = null;
        }
        menuHomeBinding3.menuSetPermiss.setOnClickListener(this.f13821r);
        MenuHomeBinding menuHomeBinding4 = this.f13822s;
        if (menuHomeBinding4 == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
            menuHomeBinding4 = null;
        }
        menuHomeBinding4.menuShare.setOnClickListener(this.f13821r);
        MenuHomeBinding menuHomeBinding5 = this.f13822s;
        if (menuHomeBinding5 == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
            menuHomeBinding5 = null;
        }
        menuHomeBinding5.menuClear.setOnClickListener(this.f13821r);
        MenuHomeBinding menuHomeBinding6 = this.f13822s;
        if (menuHomeBinding6 == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
            menuHomeBinding6 = null;
        }
        menuHomeBinding6.menuHelp.setOnClickListener(this.f13821r);
        MenuHomeBinding menuHomeBinding7 = this.f13822s;
        if (menuHomeBinding7 == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
            menuHomeBinding7 = null;
        }
        menuHomeBinding7.menuDataManagement.setOnClickListener(this.f13821r);
        MenuHomeBinding menuHomeBinding8 = this.f13822s;
        if (menuHomeBinding8 == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
            menuHomeBinding8 = null;
        }
        menuHomeBinding8.menuProcessLimits.setOnClickListener(this.f13821r);
        MenuHomeBinding menuHomeBinding9 = this.f13822s;
        if (menuHomeBinding9 == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
            menuHomeBinding9 = null;
        }
        menuHomeBinding9.menuAboutus.setOnClickListener(this.f13821r);
        MenuHomeBinding menuHomeBinding10 = this.f13822s;
        if (menuHomeBinding10 == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
        } else {
            menuHomeBinding2 = menuHomeBinding10;
        }
        menuHomeBinding2.menuAccount.setOnClickListener(this.f13821r);
        PopupWindow popupWindow3 = this.f13808e;
        kotlin.jvm.internal.l0.m(popupWindow3);
        popupWindow3.setOutsideTouchable(true);
        View view = this.f13807d;
        kotlin.jvm.internal.l0.m(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeActivity.L0(HomeActivity.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(HomeActivity this$0, View view) {
        int i5;
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        PopupWindow popupWindow = this$0.f13808e;
        kotlin.jvm.internal.l0.m(popupWindow);
        if (popupWindow.isShowing()) {
            PopupWindow popupWindow2 = this$0.f13808e;
            kotlin.jvm.internal.l0.m(popupWindow2);
            popupWindow2.dismiss();
            return;
        }
        PopupWindow popupWindow3 = this$0.f13808e;
        kotlin.jvm.internal.l0.m(popupWindow3);
        popupWindow3.setFocusable(true);
        MenuHomeBinding menuHomeBinding = this$0.f13822s;
        MenuHomeBinding menuHomeBinding2 = null;
        if (menuHomeBinding == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
            menuHomeBinding = null;
        }
        ImageView imageView = menuHomeBinding.redPoint;
        int i6 = 4;
        if (this$0.w0().D()) {
            i5 = 0;
        } else {
            i5 = 4;
        }
        imageView.setVisibility(i5);
        MenuHomeBinding menuHomeBinding3 = this$0.f13822s;
        if (menuHomeBinding3 == null) {
            kotlin.jvm.internal.l0.S("menuHomeBinding");
            menuHomeBinding3 = null;
        }
        ImageView imageView2 = menuHomeBinding3.redPointHelp;
        if (this$0.w0().E()) {
            i6 = 0;
        }
        imageView2.setVisibility(i6);
        com.yuanqi.master.mine.account.a aVar = com.yuanqi.master.mine.account.a.f14786a;
        if (aVar.c()) {
            if (aVar.k()) {
                MenuHomeBinding menuHomeBinding4 = this$0.f13822s;
                if (menuHomeBinding4 == null) {
                    kotlin.jvm.internal.l0.S("menuHomeBinding");
                    menuHomeBinding4 = null;
                }
                menuHomeBinding4.menuAccountIcon.setImageResource(R.mipmap.menu_vip);
                MenuHomeBinding menuHomeBinding5 = this$0.f13822s;
                if (menuHomeBinding5 == null) {
                    kotlin.jvm.internal.l0.S("menuHomeBinding");
                    menuHomeBinding5 = null;
                }
                menuHomeBinding5.menuAccountText.setTextColor(this$0.getColor(R.color.vip_color));
            } else {
                MenuHomeBinding menuHomeBinding6 = this$0.f13822s;
                if (menuHomeBinding6 == null) {
                    kotlin.jvm.internal.l0.S("menuHomeBinding");
                    menuHomeBinding6 = null;
                }
                menuHomeBinding6.menuAccountIcon.setImageResource(R.mipmap.menu_user);
                MenuHomeBinding menuHomeBinding7 = this$0.f13822s;
                if (menuHomeBinding7 == null) {
                    kotlin.jvm.internal.l0.S("menuHomeBinding");
                    menuHomeBinding7 = null;
                }
                menuHomeBinding7.menuAccountText.setTextColor(this$0.getColor(R.color.gray3));
            }
            MenuHomeBinding menuHomeBinding8 = this$0.f13822s;
            if (menuHomeBinding8 == null) {
                kotlin.jvm.internal.l0.S("menuHomeBinding");
            } else {
                menuHomeBinding2 = menuHomeBinding8;
            }
            menuHomeBinding2.menuAccountText.setText(aVar.d(new h()));
        } else {
            MenuHomeBinding menuHomeBinding9 = this$0.f13822s;
            if (menuHomeBinding9 == null) {
                kotlin.jvm.internal.l0.S("menuHomeBinding");
                menuHomeBinding9 = null;
            }
            menuHomeBinding9.menuAccountIcon.setImageResource(R.mipmap.menu_user);
            MenuHomeBinding menuHomeBinding10 = this$0.f13822s;
            if (menuHomeBinding10 == null) {
                kotlin.jvm.internal.l0.S("menuHomeBinding");
                menuHomeBinding10 = null;
            }
            menuHomeBinding10.menuAccountText.setTextColor(this$0.getColor(R.color.gray3));
            MenuHomeBinding menuHomeBinding11 = this$0.f13822s;
            if (menuHomeBinding11 == null) {
                kotlin.jvm.internal.l0.S("menuHomeBinding");
            } else {
                menuHomeBinding2 = menuHomeBinding11;
            }
            menuHomeBinding2.menuAccountText.setText(this$0.getString(R.string.activate_vip));
        }
        PopupWindow popupWindow4 = this$0.f13808e;
        kotlin.jvm.internal.l0.m(popupWindow4);
        popupWindow4.showAsDropDown(this$0.f13807d, 0, -20);
    }

    @SuppressLint({"NotifyDataSetChanged", "UseCompatLoadingForDrawables"})
    private final void M0() {
        w0().A().observe(this, new s(new i()));
        w0().H().observe(this, new s(new j()));
        w0().F().observe(this, new s(new k()));
        w0().M().observe(this, new s(new l()));
        w0().B().observe(this, new s(new m()));
    }

    private final void N0() {
        UMConfigure.init(this, com.yuanqi.master.config.c.f14550t, ChannelReaderUtil.getChannel(getApplicationContext()), 1, "");
        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO);
    }

    private final boolean O0() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return ((NotificationManager) getSystemService(NotificationManager.class)).isNotificationPolicyAccessGranted();
        }
        if (i5 >= 26) {
            NotificationManagerCompat from = NotificationManagerCompat.from(this);
            kotlin.jvm.internal.l0.o(from, "from(...)");
            return from.areNotificationsEnabled();
        }
        if (Settings.Secure.getString(getContentResolver(), "enabled_notification_listeners") != null) {
            return true;
        }
        return false;
    }

    private final boolean P0() {
        g.c cVar = this.f13819p;
        if (cVar == null) {
            return false;
        }
        kotlin.jvm.internal.l0.m(cVar);
        return !cVar.f22395b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0() {
        ActivityResultLauncher<Intent> activityResultLauncher = this.f13817n;
        Intent intent = new Intent(this, (Class<?>) AddAppActivity.class);
        intent.addFlags(603979776);
        activityResultLauncher.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0(int i5, com.yuanqi.group.home.models.b bVar, v2.b bVar2) {
        com.yuanqi.master.mine.account.a.f14786a.n(w0().G(), new n(bVar2, i5, bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int S0(com.yuanqi.group.home.models.b bVar, com.yuanqi.group.home.models.b bVar2) {
        Object obj;
        Object obj2;
        char S6;
        char S62;
        if (kotlin.jvm.internal.l0.g(bVar.getPackageName(), bVar2.getPackageName())) {
            return kotlin.jvm.internal.l0.t(bVar.getUserId(), bVar2.getUserId());
        }
        Iterator<T> it = com.yuanqi.master.config.a.f14505g.a().h().getValue().iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (kotlin.jvm.internal.l0.g(bVar.getPackageName(), ((com.yuanqi.master.config.e) obj2).c())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        com.yuanqi.master.config.e eVar = (com.yuanqi.master.config.e) obj2;
        Iterator<T> it2 = com.yuanqi.master.config.a.f14505g.a().h().getValue().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (kotlin.jvm.internal.l0.g(bVar2.getPackageName(), ((com.yuanqi.master.config.e) next).c())) {
                obj = next;
                break;
            }
        }
        com.yuanqi.master.config.e eVar2 = (com.yuanqi.master.config.e) obj;
        if (eVar != null && eVar2 != null) {
            return kotlin.jvm.internal.l0.t(eVar.d(), eVar2.d());
        }
        if (eVar == null && eVar2 != null) {
            return 1;
        }
        if (eVar == null || eVar2 != null) {
            try {
                String name = bVar.getName();
                kotlin.jvm.internal.l0.o(name, "getName(...)");
                S6 = kotlin.text.h0.S6(name);
                String g5 = com.github.promeg.pinyinhelper.c.g(S6);
                kotlin.jvm.internal.l0.o(g5, "toPinyin(...)");
                Locale locale = Locale.ROOT;
                String upperCase = g5.toUpperCase(locale);
                kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String name2 = bVar2.getName();
                kotlin.jvm.internal.l0.o(name2, "getName(...)");
                S62 = kotlin.text.h0.S6(name2);
                String g6 = com.github.promeg.pinyinhelper.c.g(S62);
                kotlin.jvm.internal.l0.o(g6, "toPinyin(...)");
                String upperCase2 = g6.toUpperCase(locale);
                kotlin.jvm.internal.l0.o(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return upperCase.compareTo(upperCase2);
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(HomeActivity this$0, View view) {
        HomeActivity homeActivity;
        String str;
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        switch (view.getId()) {
            case R.id.menu_aboutus /* 2131296774 */:
                homeActivity = this$0;
                this$0.w0().O(homeActivity);
                Intent intent = new Intent(homeActivity, (Class<?>) AddAppActivity.class);
                intent.putExtra(com.yuanqi.master.config.c.f14521b, com.yuanqi.master.config.c.f14537j);
                homeActivity.startActivity(intent);
                break;
            case R.id.menu_account /* 2131296775 */:
                homeActivity = this$0;
                homeActivity.startActivity(new Intent(homeActivity, (Class<?>) MineActivity.class));
                break;
            case R.id.menu_clear /* 2131296778 */:
                homeActivity = this$0;
                com.yuanqi.master.tools.o0.f15213a.P(homeActivity, o.INSTANCE);
                q0.f15237a.a().e(homeActivity);
                break;
            case R.id.menu_data_management /* 2131296780 */:
                homeActivity = this$0;
                HomeViewModel w02 = this$0.w0();
                LaunchpadAdapter launchpadAdapter = homeActivity.f13810g;
                kotlin.jvm.internal.l0.m(launchpadAdapter);
                w02.R(homeActivity, launchpadAdapter.getItemCount());
                break;
            case R.id.menu_help /* 2131296783 */:
                homeActivity = this$0;
                this$0.w0().P(homeActivity);
                Bundle bundle = new Bundle();
                if (kotlin.jvm.internal.l0.g(com.yuanqi.master.config.a.f14505g.a().e().getLanguage(), "zh")) {
                    str = this$0.getResources().getString(R.string.menu_help);
                } else {
                    str = "Help";
                }
                bundle.putString(com.alipay.sdk.m.x.d.f3030v, str);
                bundle.putString("url", com.yuanqi.master.config.c.f14546p);
                Intent intent2 = new Intent(homeActivity, (Class<?>) WebActivity.class);
                intent2.putExtras(bundle);
                homeActivity.startActivity(intent2);
                q0 a5 = q0.f15237a.a();
                Context context = this$0.getContext();
                kotlin.jvm.internal.l0.o(context, "getContext(...)");
                a5.v(context);
                break;
            case R.id.menu_process_limits /* 2131296786 */:
                homeActivity = this$0;
                Intent intent3 = new Intent(homeActivity, (Class<?>) AddAppActivity.class);
                intent3.putExtra(com.yuanqi.master.config.c.f14521b, com.yuanqi.master.config.c.f14541l);
                homeActivity.startActivity(intent3);
                break;
            case R.id.menu_set_permiss /* 2131296788 */:
                homeActivity = this$0;
                Intent intent4 = new Intent(homeActivity, (Class<?>) AddAppActivity.class);
                intent4.putExtra(com.yuanqi.master.config.c.f14521b, com.yuanqi.master.config.c.f14533h);
                homeActivity.startActivityForResult(intent4, 8);
                break;
            case R.id.menu_share /* 2131296790 */:
                if (com.yuanqi.master.mine.account.a.f14786a.c()) {
                    Intent intent5 = new Intent(this$0, (Class<?>) MineActivity.class);
                    intent5.putExtra("screen", com.yuanqi.master.mine.c.f14824f);
                    this$0.startActivity(intent5);
                } else {
                    com.yuanqi.master.tools.o0 o0Var = com.yuanqi.master.tools.o0.f15213a;
                    String string = this$0.getString(R.string.tip);
                    kotlin.jvm.internal.l0.o(string, "getString(...)");
                    String string2 = this$0.getString(R.string.share_tip_msg);
                    kotlin.jvm.internal.l0.o(string2, "getString(...)");
                    com.yuanqi.master.tools.o0.Y(o0Var, this$0, string, string2, "取消", "好的", false, false, false, false, null, null, null, new p(), 4064, null);
                    homeActivity = this$0;
                    break;
                }
            default:
                homeActivity = this$0;
                break;
        }
        PopupWindow popupWindow = homeActivity.f13808e;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U0(HomeActivity this$0, String str, String str2, Bitmap bitmap) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        LaunchpadAdapter launchpadAdapter = this$0.f13810g;
        if (launchpadAdapter != null) {
            kotlin.jvm.internal.l0.m(str);
            kotlin.jvm.internal.l0.m(str2);
            kotlin.jvm.internal.l0.m(bitmap);
            launchpadAdapter.z(str, str2, bitmap);
        }
    }

    private final void W0() {
        if (Build.VERSION.SDK_INT >= 33) {
            requestPermissions(new String[]{"android.permission.ACCESS_NOTIFICATION_POLICY"}, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0(boolean z4) {
        this.f13828y.setValue(this, A[7], Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z0(int i5) {
        this.f13812i.setValue(this, A[0], Integer.valueOf(i5));
    }

    private final void a1(int i5) {
        this.f13823t.setValue(this, A[2], Integer.valueOf(i5));
    }

    private final void b1(int i5) {
        this.f13824u.setValue(this, A[3], Integer.valueOf(i5));
    }

    private final void c1(int i5) {
        this.f13813j.setValue(this, A[1], Integer.valueOf(i5));
    }

    private final void d1(boolean z4) {
        this.f13829z.setValue(this, A[8], Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1(int i5) {
        this.f13826w.setValue(this, A[5], Integer.valueOf(i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1(boolean z4) {
        this.f13827x.setValue(this, A[6], Boolean.valueOf(z4));
    }

    private final void g1(long j5) {
        this.f13825v.setValue(this, A[4], Long.valueOf(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(String str, int i5, String str2) {
        com.yuanqi.master.mine.account.a aVar = com.yuanqi.master.mine.account.a.f14786a;
        if (!aVar.c()) {
            HomeViewModel w02 = w0();
            Context context = getContext();
            kotlin.jvm.internal.l0.o(context, "getContext(...)");
            w02.a(context, 2);
            return;
        }
        aVar.n(w0().G(), new t(str, i5, str2));
    }

    private final void i1() {
        if (w0.f15264a.b(com.yuanqi.master.config.c.f14555y)) {
            l1();
            return;
        }
        com.yuanqi.master.tools.o0 o0Var = com.yuanqi.master.tools.o0.f15213a;
        String string = getResources().getString(R.string.tip);
        kotlin.jvm.internal.l0.o(string, "getString(...)");
        String string2 = getResources().getString(R.string.ad_tip);
        kotlin.jvm.internal.l0.o(string2, "getString(...)");
        String string3 = getResources().getString(R.string.i_know);
        kotlin.jvm.internal.l0.o(string3, "getString(...)");
        com.yuanqi.master.tools.o0.Y(o0Var, this, string, string2, null, string3, false, true, false, false, null, null, new u(), new v(), 1960, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(HomeActivity this$0, DialogInterface dialogInterface, int i5) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + this$0.getPackageName()));
        this$0.startActivityForResult(intent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(Intent intent, HomeActivity this$0, DialogInterface dialogInterface, int i5) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        if (intent != null) {
            try {
                this$0.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l1() {
        String str = "UpDateContent_" + v0.f15260a.e(this);
        if (w0.f15264a.b(str)) {
            return;
        }
        com.yuanqi.master.tools.o0 o0Var = com.yuanqi.master.tools.o0.f15213a;
        String string = getResources().getString(R.string.update_content);
        kotlin.jvm.internal.l0.o(string, "getString(...)");
        o0Var.D0(this, string, (r16 & 4) != 0 ? null : null, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, new x(str, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(HomeActivity this$0, DialogInterface dialogInterface, int i5) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        if (GmsSupport.isOutsideGoogleFrameworkExist()) {
            GmsSupport.installDynamicGms(0);
            r.a aVar = this$0.f13804a;
            kotlin.jvm.internal.l0.m(aVar);
            aVar.h();
            Toast.makeText(this$0, "done!", 0).show();
            return;
        }
        Toast.makeText(this$0, "No GMS installed outside.", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1(List<com.yuanqi.group.home.models.b> list, com.yuanqi.group.home.models.b bVar, int i5, v2.b bVar2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (kotlin.jvm.internal.l0.g(((com.yuanqi.group.home.models.b) obj).getPackageName(), bVar.getPackageName())) {
                arrayList.add(obj);
            }
        }
        Activity r5 = r();
        Intent intent = new Intent(r(), (Class<?>) ManagerActivity.class);
        intent.putExtra("screen", com.yuanqi.master.manager.i.f14757b);
        intent.putExtra("index", i5);
        intent.putExtra(bi.f12269o, bVar.getPackageName());
        intent.putExtra("user_id", bVar.getUserId());
        intent.putExtra("app_name", bVar.getName());
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        int i6 = 0;
        while (true) {
            if (it.hasNext()) {
                if (kotlin.jvm.internal.l0.g((com.yuanqi.group.home.models.b) it.next(), bVar)) {
                    break;
                } else {
                    i6++;
                }
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 == 0) {
            z4 = true;
        }
        intent.putExtra("is_first", z4);
        if (bVar2 != null) {
            intent.putExtra("app_note", bVar2);
        }
        r5.startActivity(intent);
    }

    private final void n0() {
        ActivityHomeBinding activityHomeBinding = this.f13814k;
        ActivityHomeBinding activityHomeBinding2 = null;
        if (activityHomeBinding == null) {
            kotlin.jvm.internal.l0.S("homeBinding");
            activityHomeBinding = null;
        }
        this.f13805b = activityHomeBinding.animationView;
        ActivityHomeBinding activityHomeBinding3 = this.f13814k;
        if (activityHomeBinding3 == null) {
            kotlin.jvm.internal.l0.S("homeBinding");
            activityHomeBinding3 = null;
        }
        this.f13806c = activityHomeBinding3.homeLauncher;
        ActivityHomeBinding activityHomeBinding4 = this.f13814k;
        if (activityHomeBinding4 == null) {
            kotlin.jvm.internal.l0.S("homeBinding");
            activityHomeBinding4 = null;
        }
        this.f13807d = activityHomeBinding4.homeMenu;
        ActivityHomeBinding activityHomeBinding5 = this.f13814k;
        if (activityHomeBinding5 == null) {
            kotlin.jvm.internal.l0.S("homeBinding");
            activityHomeBinding5 = null;
        }
        activityHomeBinding5.homeAdd.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.o0(HomeActivity.this, view);
            }
        });
        ActivityHomeBinding activityHomeBinding6 = this.f13814k;
        if (activityHomeBinding6 == null) {
            kotlin.jvm.internal.l0.S("homeBinding");
            activityHomeBinding6 = null;
        }
        activityHomeBinding6.homeMode.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.p0(HomeActivity.this, view);
            }
        });
        ActivityHomeBinding activityHomeBinding7 = this.f13814k;
        if (activityHomeBinding7 == null) {
            kotlin.jvm.internal.l0.S("homeBinding");
        } else {
            activityHomeBinding2 = activityHomeBinding7;
        }
        activityHomeBinding2.homeVip.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.q0(HomeActivity.this, view);
            }
        });
    }

    private final void n1() {
        Log.d(this.f13815l, "startServer");
        this.f13819p = socket.g.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(HomeActivity this$0, View view) {
        int i5;
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        if (!com.yuanqi.master.mine.account.a.f14786a.c()) {
            ActivityHomeBinding activityHomeBinding = this$0.f13814k;
            if (activityHomeBinding == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding = null;
            }
            if (activityHomeBinding.homeLauncher.getChildCount() > 0) {
                i5 = 3;
            } else {
                i5 = 1;
            }
            HomeViewModel w02 = this$0.w0();
            Context context = this$0.getContext();
            kotlin.jvm.internal.l0.o(context, "getContext(...)");
            w02.a(context, i5);
            return;
        }
        if (w0.f15264a.b(com.yuanqi.master.config.c.f14554x)) {
            this$0.Q0();
            return;
        }
        com.yuanqi.master.tools.o0 o0Var = com.yuanqi.master.tools.o0.f15213a;
        Context context2 = this$0.getContext();
        kotlin.jvm.internal.l0.o(context2, "getContext(...)");
        String string = this$0.getResources().getString(R.string.warn_tip);
        kotlin.jvm.internal.l0.o(string, "getString(...)");
        String string2 = this$0.getResources().getString(R.string.first_add_app_tip_content);
        kotlin.jvm.internal.l0.o(string2, "getString(...)");
        String string3 = this$0.getResources().getString(R.string.cancel_msg);
        kotlin.jvm.internal.l0.o(string3, "getString(...)");
        String string4 = this$0.getResources().getString(R.string.confirm_msg);
        kotlin.jvm.internal.l0.o(string4, "getString(...)");
        com.yuanqi.master.tools.o0.Y(o0Var, context2, string, string2, string3, string4, false, false, false, false, null, null, null, new b(), 4064, null);
    }

    private final void o1() {
        Log.d(this.f13815l, "stopServer");
        socket.g.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(HomeActivity this$0, View view) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        int x4 = this$0.w0().x();
        if (x4 != 1) {
            if (x4 != 2) {
                if (x4 == 3) {
                    this$0.w0().V(1);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = this$0.f13809f;
                    if (staggeredGridLayoutManager != null) {
                        staggeredGridLayoutManager.setSpanCount(3);
                    }
                    LaunchpadAdapter launchpadAdapter = this$0.f13810g;
                    if (launchpadAdapter != null) {
                        launchpadAdapter.x(1);
                    }
                    if (this$0.P0()) {
                        this$0.o1();
                        return;
                    }
                    return;
                }
                return;
            }
            this$0.w0().V(3);
            StaggeredGridLayoutManager staggeredGridLayoutManager2 = this$0.f13809f;
            if (staggeredGridLayoutManager2 != null) {
                staggeredGridLayoutManager2.setSpanCount(2);
            }
            LaunchpadAdapter launchpadAdapter2 = this$0.f13810g;
            if (launchpadAdapter2 != null) {
                launchpadAdapter2.x(3);
                return;
            }
            return;
        }
        this$0.w0().V(2);
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = this$0.f13809f;
        if (staggeredGridLayoutManager3 != null) {
            staggeredGridLayoutManager3.setSpanCount(3);
        }
        LaunchpadAdapter launchpadAdapter3 = this$0.f13810g;
        if (launchpadAdapter3 != null) {
            launchpadAdapter3.x(2);
        }
        if (!this$0.P0()) {
            this$0.n1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(HomeActivity this$0, View view) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        Context context = this$0.getContext();
        Intent intent = new Intent(this$0.getContext(), (Class<?>) MineActivity.class);
        if (com.yuanqi.master.mine.account.a.f14786a.c()) {
            intent.putExtra("screen", com.yuanqi.master.mine.c.f14825g);
            intent.putExtra("isHomeToVip", true);
        } else {
            intent.putExtra("register", 1);
        }
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        Boolean value = w0().A().getValue();
        kotlin.jvm.internal.l0.m(value);
        int i5 = 8;
        ActivityHomeBinding activityHomeBinding = null;
        if (value.booleanValue()) {
            ActivityHomeBinding activityHomeBinding2 = this.f13814k;
            if (activityHomeBinding2 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding2 = null;
            }
            activityHomeBinding2.homeMultiDelete.setVisibility(0);
            ActivityHomeBinding activityHomeBinding3 = this.f13814k;
            if (activityHomeBinding3 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding3 = null;
            }
            activityHomeBinding3.homeAdd.setVisibility(8);
            ActivityHomeBinding activityHomeBinding4 = this.f13814k;
            if (activityHomeBinding4 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding4 = null;
            }
            activityHomeBinding4.homeMenu.setVisibility(8);
            ActivityHomeBinding activityHomeBinding5 = this.f13814k;
            if (activityHomeBinding5 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding5 = null;
            }
            activityHomeBinding5.tvContent.setVisibility(8);
            ActivityHomeBinding activityHomeBinding6 = this.f13814k;
            if (activityHomeBinding6 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding6 = null;
            }
            activityHomeBinding6.layBack.setVisibility(0);
            ActivityHomeBinding activityHomeBinding7 = this.f13814k;
            if (activityHomeBinding7 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding7 = null;
            }
            activityHomeBinding7.homeVip.setVisibility(8);
        } else {
            ActivityHomeBinding activityHomeBinding8 = this.f13814k;
            if (activityHomeBinding8 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding8 = null;
            }
            activityHomeBinding8.homeMultiDelete.setVisibility(4);
            ActivityHomeBinding activityHomeBinding9 = this.f13814k;
            if (activityHomeBinding9 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding9 = null;
            }
            activityHomeBinding9.homeAdd.setVisibility(0);
            ActivityHomeBinding activityHomeBinding10 = this.f13814k;
            if (activityHomeBinding10 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding10 = null;
            }
            activityHomeBinding10.homeMenu.setVisibility(0);
            ActivityHomeBinding activityHomeBinding11 = this.f13814k;
            if (activityHomeBinding11 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding11 = null;
            }
            activityHomeBinding11.tvContent.setVisibility(0);
            ActivityHomeBinding activityHomeBinding12 = this.f13814k;
            if (activityHomeBinding12 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding12 = null;
            }
            activityHomeBinding12.layBack.setVisibility(8);
            ActivityHomeBinding activityHomeBinding13 = this.f13814k;
            if (activityHomeBinding13 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding13 = null;
            }
            ImageView imageView = activityHomeBinding13.homeVip;
            if (!com.yuanqi.master.mine.account.a.f14786a.k()) {
                i5 = 0;
            }
            imageView.setVisibility(i5);
        }
        ActivityHomeBinding activityHomeBinding14 = this.f13814k;
        if (activityHomeBinding14 == null) {
            kotlin.jvm.internal.l0.S("homeBinding");
            activityHomeBinding14 = null;
        }
        activityHomeBinding14.layBack.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.s0(HomeActivity.this, view);
            }
        });
        ActivityHomeBinding activityHomeBinding15 = this.f13814k;
        if (activityHomeBinding15 == null) {
            kotlin.jvm.internal.l0.S("homeBinding");
        } else {
            activityHomeBinding = activityHomeBinding15;
        }
        activityHomeBinding.homeMultiDelete.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.t0(HomeActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(HomeActivity this$0, View view) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.w0().A().postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(HomeActivity this$0, View view) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        List<com.yuanqi.group.home.models.b> value = this$0.w0().H().getValue();
        kotlin.jvm.internal.l0.m(value);
        if (value.isEmpty()) {
            return;
        }
        com.yuanqi.master.tools.o0 o0Var = com.yuanqi.master.tools.o0.f15213a;
        String string = this$0.getString(R.string.text_delete_app_list);
        kotlin.jvm.internal.l0.o(string, "getString(...)");
        com.yuanqi.master.tools.o0.R(o0Var, this$0, string, null, new c(), 4, null);
    }

    private final void u0(Intent intent, boolean z4) {
        String str;
        String str2;
        int intExtra = intent.getIntExtra("user_id", -1);
        String stringExtra = intent.getStringExtra(bi.f12269o);
        if (stringExtra == null) {
            str = "";
        } else {
            str = stringExtra;
        }
        String stringExtra2 = intent.getStringExtra("app_name");
        if (stringExtra2 == null) {
            str2 = "";
        } else {
            str2 = stringExtra2;
        }
        if (intExtra != -1) {
            if (!z4) {
                kotlinx.coroutines.k.f(w0().G(), k1.c(), null, new d(str, intExtra, str2, null), 2, null);
            } else {
                h1(str, intExtra, str2);
            }
        }
        intent.putExtra("user_id", -1);
    }

    private final void v0() {
        if (System.currentTimeMillis() - this.f13820q > 1000) {
            r.a aVar = this.f13804a;
            if (aVar != null) {
                aVar.f();
            }
            this.f13820q = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x0() {
        return ((Boolean) this.f13828y.getValue(this, A[7])).booleanValue();
    }

    private final int y0() {
        return ((Number) this.f13812i.getValue(this, A[0])).intValue();
    }

    private final int z0() {
        return ((Number) this.f13823t.getValue(this, A[2])).intValue();
    }

    @p4.l
    public final byte[] G0(@p4.l String s5) {
        Integer I;
        int i5;
        Integer I2;
        kotlin.jvm.internal.l0.p(s5, "s");
        int length = s5.length();
        byte[] bArr = new byte[length / 2];
        for (int i6 = 0; i6 < length; i6 += 2) {
            int i7 = i6 / 2;
            I = kotlin.text.e.I(s5.charAt(i6), 16);
            if (I != null) {
                i5 = I.intValue();
            } else {
                i5 = -16;
            }
            I2 = kotlin.text.e.I(s5.charAt(i6 + 1), 16);
            kotlin.jvm.internal.l0.m(I2);
            bArr[i7] = (byte) (i5 + I2.intValue());
        }
        return bArr;
    }

    public final void V0() {
        Intent intent = new Intent();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            intent.setAction("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
        } else if (i5 >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", getPackageName());
            intent.putExtra("app_uid", getApplicationInfo().uid);
        }
        startActivity(intent);
    }

    @Override // q2.b
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public void i(@p4.m r.a aVar) {
        this.f13804a = aVar;
    }

    @Override // com.yuanqi.group.home.r.b
    public void b(@p4.l com.yuanqi.group.home.models.b data) {
        Integer num;
        List<com.yuanqi.group.home.models.b> i5;
        int i6;
        kotlin.jvm.internal.l0.p(data, "data");
        LaunchpadAdapter launchpadAdapter = this.f13810g;
        if (launchpadAdapter != null && (i5 = launchpadAdapter.i()) != null) {
            ListIterator<com.yuanqi.group.home.models.b> listIterator = i5.listIterator(i5.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (kotlin.jvm.internal.l0.g(listIterator.previous().getPackageName(), data.getPackageName())) {
                        i6 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i6 = -1;
                    break;
                }
            }
            num = Integer.valueOf(i6);
        } else {
            num = null;
        }
        LaunchpadAdapter launchpadAdapter2 = this.f13810g;
        kotlin.jvm.internal.l0.m(launchpadAdapter2);
        List<com.yuanqi.group.home.models.b> i7 = launchpadAdapter2.i();
        kotlin.jvm.internal.l0.m(i7);
        kotlin.jvm.internal.l0.m(num);
        i7.add(num.intValue() + 1, data);
        LaunchpadAdapter launchpadAdapter3 = this.f13810g;
        kotlin.jvm.internal.l0.m(launchpadAdapter3);
        launchpadAdapter3.notifyItemInserted(num.intValue() + 1);
    }

    @Override // com.yuanqi.group.home.r.b
    public void c() {
        new AlertDialog.Builder(this, R.style.MyDialogTheme).setTitle(R.string.overlay_notice).setMessage(R.string.overlay_notice_content).setCancelable(false).setNegativeButton("GO", new DialogInterface.OnClickListener() { // from class: com.yuanqi.group.home.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                HomeActivity.j1(HomeActivity.this, dialogInterface, i5);
            }
        }).show();
    }

    @Override // com.yuanqi.group.home.r.b
    public void d(@p4.l List<com.yuanqi.group.home.models.b> list) {
        kotlin.jvm.internal.l0.p(list, "list");
        ActivityHomeBinding activityHomeBinding = null;
        if (list.isEmpty()) {
            ActivityHomeBinding activityHomeBinding2 = this.f13814k;
            if (activityHomeBinding2 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
            } else {
                activityHomeBinding = activityHomeBinding2;
            }
            activityHomeBinding.nodata.setVisibility(0);
        } else {
            ActivityHomeBinding activityHomeBinding3 = this.f13814k;
            if (activityHomeBinding3 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
            } else {
                activityHomeBinding = activityHomeBinding3;
            }
            activityHomeBinding.nodata.setVisibility(4);
            kotlin.collections.a0.m0(list, new Comparator() { // from class: com.yuanqi.group.home.g
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int S0;
                    S0 = HomeActivity.S0((com.yuanqi.group.home.models.b) obj, (com.yuanqi.group.home.models.b) obj2);
                    return S0;
                }
            });
            LaunchpadAdapter launchpadAdapter = this.f13810g;
            kotlin.jvm.internal.l0.m(launchpadAdapter);
            launchpadAdapter.y(list);
            r.a aVar = this.f13804a;
            kotlin.jvm.internal.l0.m(aVar);
            aVar.j(list);
        }
        k();
    }

    @Override // com.yuanqi.group.home.r.b
    public void e(@p4.l com.yuanqi.group.home.models.b model) {
        kotlin.jvm.internal.l0.p(model, "model");
        LaunchpadAdapter launchpadAdapter = this.f13810g;
        kotlin.jvm.internal.l0.m(launchpadAdapter);
        launchpadAdapter.u(model);
    }

    @Override // com.yuanqi.group.home.r.b
    public void f() {
    }

    @Override // com.yuanqi.group.home.r.b
    public void g(@p4.l Context updateContext, @p4.l com.yuanqi.group.home.models.b model, @p4.l View view) {
        kotlin.jvm.internal.l0.p(updateContext, "updateContext");
        kotlin.jvm.internal.l0.p(model, "model");
        kotlin.jvm.internal.l0.p(view, "view");
        com.yuanqi.master.tools.o0 o0Var = com.yuanqi.master.tools.o0.f15213a;
        String string = updateContext.getString(R.string.text_delete_app, model.getName());
        kotlin.jvm.internal.l0.o(string, "getString(...)");
        o0Var.Q(updateContext, string, view, new w(model));
    }

    @Override // com.yuanqi.group.home.r.b
    public void h(@p4.l com.yuanqi.group.home.models.b model) {
        kotlin.jvm.internal.l0.p(model, "model");
        LaunchpadAdapter launchpadAdapter = this.f13810g;
        kotlin.jvm.internal.l0.m(launchpadAdapter);
        launchpadAdapter.v(model);
    }

    @Override // socket.f
    public void j(@p4.m String str) {
        Log.d(this.f13815l, "onClientConnected: " + str);
    }

    @Override // com.yuanqi.group.home.r.b
    public void k() {
        LottieAnimationView lottieAnimationView = this.f13805b;
        kotlin.jvm.internal.l0.m(lottieAnimationView);
        lottieAnimationView.setVisibility(8);
    }

    @Override // com.yuanqi.group.home.r.b
    public void l() {
        LottieAnimationView lottieAnimationView = this.f13805b;
        kotlin.jvm.internal.l0.m(lottieAnimationView);
        lottieAnimationView.setVisibility(0);
    }

    @Override // com.yuanqi.group.home.r.b
    public void m() {
        List<com.yuanqi.group.home.models.b> list;
        List<com.yuanqi.group.home.models.b> V5;
        LaunchpadAdapter launchpadAdapter = this.f13810g;
        List<com.yuanqi.group.home.models.b> list2 = null;
        if (launchpadAdapter != null) {
            list = launchpadAdapter.i();
        } else {
            list = null;
        }
        kotlin.jvm.internal.l0.m(list);
        if (list.isEmpty()) {
            ActivityHomeBinding activityHomeBinding = this.f13814k;
            if (activityHomeBinding == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding = null;
            }
            activityHomeBinding.nodata.setVisibility(0);
        } else {
            ActivityHomeBinding activityHomeBinding2 = this.f13814k;
            if (activityHomeBinding2 == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding2 = null;
            }
            activityHomeBinding2.nodata.setVisibility(4);
        }
        r.a aVar = this.f13804a;
        if (aVar != null) {
            LaunchpadAdapter launchpadAdapter2 = this.f13810g;
            if (launchpadAdapter2 != null) {
                list2 = launchpadAdapter2.i();
            }
            kotlin.jvm.internal.l0.m(list2);
            V5 = kotlin.collections.e0.V5(list2);
            aVar.j(V5);
        }
    }

    @Override // com.yuanqi.group.home.r.b
    public void n() {
        final Intent permissionActivityIntent = OemPermissionHelper.getPermissionActivityIntent(this);
        new AlertDialog.Builder(this).setTitle(R.string.permission_boot_notice).setMessage(R.string.permission_boot_content).setCancelable(false).setNegativeButton("GO", new DialogInterface.OnClickListener() { // from class: com.yuanqi.group.home.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                HomeActivity.k1(permissionActivityIntent, this, dialogInterface, i5);
            }
        }).show();
    }

    @Override // socket.f
    public void o(boolean z4, @p4.m byte[] bArr) {
        if (bArr == null) {
            return;
        }
        Log.d(this.f13815l, "onReceiverData: " + bArr.length);
        final String j5 = socket.h.j(Arrays.copyOfRange(bArr, 0, 10));
        Log.d(this.f13815l, "pid: " + j5);
        final String j6 = socket.h.j(Arrays.copyOfRange(bArr, 10, 110));
        Log.d(this.f13815l, "packageName: " + j6);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 110, bArr.length);
        Log.d(this.f13815l, "bitmapArray: " + copyOfRange.length);
        final Bitmap b5 = socket.h.b(copyOfRange);
        runOnUiThread(new Runnable() { // from class: com.yuanqi.group.home.h
            @Override // java.lang.Runnable
            public final void run() {
                HomeActivity.U0(HomeActivity.this, j5, j6, b5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i5, int i6, @p4.m Intent intent) {
        super.onActivityResult(i5, i6, intent);
        if (i5 != 6) {
            if (i5 == 7) {
                a.b bVar = com.yuanqi.master.config.a.f14505g;
                bVar.a().i();
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(bVar.a().c().getValue().intValue(), 1);
                RecyclerView recyclerView = this.f13806c;
                kotlin.jvm.internal.l0.m(recyclerView);
                recyclerView.setLayoutManager(staggeredGridLayoutManager);
                r.a aVar = this.f13804a;
                kotlin.jvm.internal.l0.m(aVar);
                aVar.h();
                return;
            }
            return;
        }
        if (i6 == -1) {
            kotlin.jvm.internal.l0.m(intent);
            String stringExtra = intent.getStringExtra("pkg");
            VActivityManager.get().launchApp(intent.getIntExtra("user_id", -1), stringExtra);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Boolean value = w0().A().getValue();
        kotlin.jvm.internal.l0.m(value);
        if (value.booleanValue()) {
            w0().A().postValue(Boolean.FALSE);
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@p4.m Bundle bundle) {
        TraceManager.startActivityTrace(HomeActivity.class.getName());
        overridePendingTransition(0, 0);
        w0().Y(this);
        w0().X(this, com.yuanqi.master.config.a.f14505g.a().e());
        super.onCreate(bundle);
        ActivityHomeBinding inflate = ActivityHomeBinding.inflate(getLayoutInflater());
        kotlin.jvm.internal.l0.o(inflate, "inflate(...)");
        this.f13814k = inflate;
        if (inflate == null) {
            kotlin.jvm.internal.l0.S("homeBinding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        i1();
        H0();
        N0();
        this.f13811h = new Handler(Looper.getMainLooper());
        new k0(this, w0());
        n0();
        I0();
        K0();
        M0();
        r.a aVar = this.f13804a;
        kotlin.jvm.internal.l0.m(aVar);
        aVar.start();
        w0().A().setValue(Boolean.FALSE);
        List<com.yuanqi.group.home.models.b> value = w0().H().getValue();
        if (value != null) {
            value.clear();
        }
        q0 a5 = q0.f15237a.a();
        String localClassName = getLocalClassName();
        kotlin.jvm.internal.l0.o(localClassName, "getLocalClassName(...)");
        a5.r("home_screen", localClassName);
        if (!O0()) {
            W0();
        }
        Intent intent = getIntent();
        kotlin.jvm.internal.l0.o(intent, "getIntent(...)");
        u0(intent, false);
        com.yuanqi.master.mine.account.a.f14786a.n(w0().G(), new q());
        if (w0().x() != 1 && !P0()) {
            n1();
        }
        AppInstrumentation.onActivityCreateEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@p4.l Intent newIntent) {
        kotlin.jvm.internal.l0.p(newIntent, "newIntent");
        u0(newIntent, true);
        super.onNewIntent(newIntent);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(HomeActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(HomeActivity.class.getName());
        super.onResume();
        w0().p();
        v0();
        r.a aVar = this.f13804a;
        kotlin.jvm.internal.l0.m(aVar);
        aVar.h();
        com.yuanqi.master.mine.account.a.f14786a.n(w0().G(), new r());
        if (E0() && !x0()) {
            ActivityHomeBinding activityHomeBinding = this.f13814k;
            if (activityHomeBinding == null) {
                kotlin.jvm.internal.l0.S("homeBinding");
                activityHomeBinding = null;
            }
            if (activityHomeBinding.homeLauncher.getChildCount() > 0) {
                w0().B().setValue(Boolean.TRUE);
            }
        }
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yuanqi.group.abs.ui.VActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(HomeActivity.class.getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    @Override // com.yuanqi.group.home.r.b
    public void p(@p4.l Throwable err) {
        kotlin.jvm.internal.l0.p(err, "err");
        err.printStackTrace();
        k();
    }

    @p4.l
    public final Context p1(@p4.l Context context, @p4.l Locale locale) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(locale, "locale");
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        kotlin.jvm.internal.l0.o(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    @Override // com.yuanqi.group.home.r.b
    public void q() {
        if (GmsSupport.isInstalledGoogleService()) {
            Toast.makeText(this, "You have installed Gms.", 0).show();
            return;
        }
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this, R.style.MyDialogTheme).setTitle(R.string.tip).setMessage(R.string.text_install_gms).setNeutralButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setCancelable(false);
        cancelable.setPositiveButton("import outside", new DialogInterface.OnClickListener() { // from class: com.yuanqi.group.home.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                HomeActivity.m0(HomeActivity.this, dialogInterface, i5);
            }
        });
        cancelable.show();
    }

    @p4.l
    public final HomeViewModel w0() {
        return (HomeViewModel) this.f13816m.getValue();
    }
}
