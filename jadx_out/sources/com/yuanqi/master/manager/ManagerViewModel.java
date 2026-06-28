package com.yuanqi.master.manager;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.net.http.Headers;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.client.ipc.VDeviceManager;
import com.lody.virtual.client.ipc.VLocationManager;
import com.lody.virtual.client.ipc.VirtualLocationManager;
import com.lody.virtual.client.stub.ExtLaunchAppActivity;
import com.lody.virtual.client.stub.RequestExternalStorageManagerActivity;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.BitmapUtils;
import com.lody.virtual.oem.OemPermissionHelper;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.remote.VDeviceConfig;
import com.lody.virtual.remote.vloc.VLocation;
import com.lody.virtual.server.extension.VExtPackageAccessor;
import com.umeng.analytics.pro.bi;
import com.yqtech.multiapp.R;
import com.yuanqi.group.App;
import com.yuanqi.group.home.HomeActivity;
import com.yuanqi.group.home.HomeViewModel;
import com.yuanqi.master.BaseViewModel;
import com.yuanqi.master.location.MapActivity;
import com.yuanqi.master.mine.MineActivity;
import com.yuanqi.master.network.model.DeviceModel;
import com.yuanqi.master.network.model.response.ChangeDeviceResponse;
import com.yuanqi.master.tools.a1;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.o0;
import com.yuanqi.master.tools.q0;
import com.yuanqi.master.tools.x0;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.d0;
import kotlin.e1;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.v0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 l2\u00020\u0001:\u0001lB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u000209J\u0010\u0010=\u001a\u00020\u00182\u0006\u0010:\u001a\u00020;H\u0003J\u0010\u0010>\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\u000e\u0010?\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u0010\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010:\u001a\u00020;J\u000e\u0010B\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u0010\u0010C\u001a\u0004\u0018\u00010\u00042\u0006\u0010:\u001a\u00020;J \u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u0004H\u0002J4\u0010H\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020L0J2\u0006\u0010(\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0012H\u0002J \u0010M\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u00105\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0004H\u0002J(\u0010N\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u00105\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0004H\u0003J\u000e\u0010P\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u0010\u0010Q\u001a\u0002092\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010R\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u0010\u0010S\u001a\u0002092\b\u0010T\u001a\u0004\u0018\u00010UJ\u000e\u0010V\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u0018\u0010W\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010O\u001a\u00020\u0004H\u0002J\u0010\u0010X\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010Y\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\u000e\u0010Z\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u001a\u0010[\u001a\u0002092\u0006\u0010:\u001a\u00020;2\b\b\u0002\u0010\\\u001a\u00020\u0018H\u0002J,\u0010]\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010^\u001a\u00020\u00042\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002090`H\u0002J\u0010\u0010a\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\u0016\u0010b\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010c\u001a\u00020dJ\u001e\u0010e\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010(\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0012J@\u0010f\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020L0J2\u0006\u0010(\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00122\f\u0010g\u001a\b\u0012\u0004\u0012\u0002090hJ\u0010\u0010i\u001a\u0002092\u0006\u0010j\u001a\u00020#H\u0002J\b\u0010k\u001a\u000209H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R+\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\u001a\u00105\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0014\"\u0004\b7\u0010\u0016¨\u0006m"}, d2 = {"Lcom/yuanqi/master/manager/ManagerViewModel;", "Lcom/yuanqi/master/BaseViewModel;", "()V", "TAG", "", TTDownloadField.TT_APP_NAME, "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "deviceModel", "Landroidx/compose/runtime/MutableState;", "Lcom/yuanqi/master/network/model/DeviceModel;", "getDeviceModel", "()Landroidx/compose/runtime/MutableState;", "setDeviceModel", "(Landroidx/compose/runtime/MutableState;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "isFirst", "", "()Z", "setFirst", "(Z)V", "locationData", "Lcom/yuanqi/group/home/models/LocationData;", "note", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getNote", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "noteApp", "Lcom/yuanqi/master/database/model/AppNote;", "getNoteApp", "()Lcom/yuanqi/master/database/model/AppNote;", "setNoteApp", "(Lcom/yuanqi/master/database/model/AppNote;)V", TTDownloadField.TT_PACKAGE_NAME, "getPackageName", "setPackageName", "pwdStr", "getPwdStr", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "showLocationTip", "getShowLocationTip", "setShowLocationTip", "showLocationTip$delegate", "Lcom/yuanqi/master/tools/MVFast;", "userId", "getUserId", "setUserId", "backToHost", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "changeDeviceInfo", "checkExtPackageBootPermission", "createShortCut", "getCurrentVirDeviceInfo", "getIcon", "Landroid/graphics/drawable/Drawable;", "getLocationData", "getVersion", "insertAppNote", "pkgName", "uId", "noteStr", "jumpMap", "changeLocationResultLauncher", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "launch", "launchAppBefore", "name", "launcherApp", "readLocation", "requestShortCupPermission", "saveLocation", Headers.LOCATION, "Lcom/lody/virtual/remote/vloc/VLocation;", "setAppPwd", "setShortCut", "showOverlayPermissionDialog", "showPermissionDialog", "showSetNoteDialog", "showSetPwdDialog", "isEdit", "showSetShorCutNameDialog", "notePlaceHolder", "action", "Lkotlin/Function1;", "showTipDialog", "toChangeDevice", "navController", "Landroidx/navigation/NavHostController;", "toClearAppCache", "toVirtualLocation", "cancel", "Lkotlin/Function0;", "updateAppNote", "appNote", "updateDeviceInfo", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nManagerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerViewModel.kt\ncom/yuanqi/master/manager/ManagerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,805:1\n1855#2,2:806\n1#3:808\n*S KotlinDebug\n*F\n+ 1 ManagerViewModel.kt\ncom/yuanqi/master/manager/ManagerViewModel\n*L\n464#1:806,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ManagerViewModel extends BaseViewModel {

    /* renamed from: r, reason: collision with root package name */
    @p4.l
    private static final d0<ManagerViewModel> f14729r;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final String f14730b;

    /* renamed from: c, reason: collision with root package name */
    private int f14731c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private String f14732d;

    /* renamed from: e, reason: collision with root package name */
    private int f14733e;

    /* renamed from: f, reason: collision with root package name */
    @p4.m
    private String f14734f;

    /* renamed from: g, reason: collision with root package name */
    @p4.m
    private v2.b f14735g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14736h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private final e0<String> f14737i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private final e0<String> f14738j;

    /* renamed from: k, reason: collision with root package name */
    @p4.l
    private final s0 f14739k;

    /* renamed from: l, reason: collision with root package name */
    @p4.l
    private final x0 f14740l;

    /* renamed from: m, reason: collision with root package name */
    @p4.l
    private MutableState<DeviceModel> f14741m;

    /* renamed from: n, reason: collision with root package name */
    @p4.m
    private com.yuanqi.group.home.models.g f14742n;

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f14727p = {l1.k(new kotlin.jvm.internal.x0(ManagerViewModel.class, "showLocationTip", "getShowLocationTip()Z", 0))};

    /* renamed from: o, reason: collision with root package name */
    @p4.l
    public static final b f14726o = new b(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f14728q = 8;

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yuanqi/master/manager/ManagerViewModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends n0 implements v3.a<ManagerViewModel> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final ManagerViewModel invoke() {
            return new ManagerViewModel(null);
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/manager/ManagerViewModel$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/manager/ManagerViewModel;", "getInstance", "()Lcom/yuanqi/master/manager/ManagerViewModel;", "instance$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        @p4.l
        public final ManagerViewModel a() {
            return (ManagerViewModel) ManagerViewModel.f14729r.getValue();
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class c extends n0 implements v3.l<Object, r2> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.manager.ManagerViewModel$changeDeviceInfo$1$1", f = "ManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            int label;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new a(dVar);
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
                    f1.r("换机成功", 0, 2, null);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        c() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
            invoke2(obj);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m Object obj) {
            App.a aVar = App.f13716d;
            ChangeDeviceResponse changeDeviceResponse = (ChangeDeviceResponse) aVar.c().n(aVar.c().z(obj), ChangeDeviceResponse.class);
            ManagerViewModel.this.x().setValue(new DeviceModel(changeDeviceResponse.getDeviceName(), changeDeviceResponse.getDeviceModel(), changeDeviceResponse.getDevice(), changeDeviceResponse.getDeviceManu(), changeDeviceResponse.getDeviceBrand(), changeDeviceResponse.getImei(), changeDeviceResponse.getAndroidId(), changeDeviceResponse.getWifi()));
            ManagerViewModel.this.p0();
            kotlinx.coroutines.k.f(ManagerViewModel.this.f14739k, k1.e(), null, new a(null), 2, null);
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class d extends n0 implements v3.l<String, r2> {
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
            l0.p(it, "it");
            f1.r(it, 0, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "content", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements v3.l<String, r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ManagerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, ManagerViewModel managerViewModel) {
            super(1);
            this.$context = context;
            this.this$0 = managerViewModel;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String content) {
            l0.p(content, "content");
            if (com.yuanqi.master.tools.e.f15100a.j()) {
                String string = this.$context.getString(R.string.create_success);
                l0.o(string, "getString(...)");
                f1.r(string, 0, 2, null);
            }
            this.this$0.Z(this.$context, content);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.manager.ManagerViewModel$insertAppNote$1", f = "ManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ String $noteStr;
        final /* synthetic */ String $pkgName;
        final /* synthetic */ int $uId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2, int i5, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.$noteStr = str;
            this.$pkgName = str2;
            this.$uId = i5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new f(this.$noteStr, this.$pkgName, this.$uId, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                try {
                    ManagerViewModel.this.B().setValue(this.$noteStr);
                    ManagerViewModel managerViewModel = ManagerViewModel.this;
                    v2.b bVar = new v2.b();
                    String str = this.$pkgName;
                    int i5 = this.$uId;
                    String str2 = this.$noteStr;
                    bVar.setPackageName(str);
                    bVar.setUserId(i5);
                    bVar.setNoteName(str2);
                    managerViewModel.X(bVar);
                    HomeViewModel.b bVar2 = HomeViewModel.A;
                    com.yuanqi.master.database.dao.c b5 = bVar2.b();
                    v2.b C = ManagerViewModel.this.C();
                    l0.m(C);
                    b5.d(C);
                    HomeViewModel.v(bVar2.c(), false, 1, null);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class g extends n0 implements v3.a<r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ManagerViewModel this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.a<r2> {
            final /* synthetic */ Context $context;
            final /* synthetic */ ManagerViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ManagerViewModel managerViewModel, Context context) {
                super(0);
                this.this$0 = managerViewModel;
                this.$context = context;
            }

            @Override // v3.a
            public /* bridge */ /* synthetic */ r2 invoke() {
                invoke2();
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (Build.VERSION.SDK_INT >= 30) {
                    ManagerViewModel managerViewModel = this.this$0;
                    Context context = this.$context;
                    int G = managerViewModel.G();
                    String D = this.this$0.D();
                    l0.m(D);
                    String v4 = this.this$0.v();
                    l0.m(v4);
                    managerViewModel.M(context, G, D, v4);
                    return;
                }
                ManagerViewModel managerViewModel2 = this.this$0;
                Context context2 = this.$context;
                int G2 = managerViewModel2.G();
                String D2 = this.this$0.D();
                l0.m(D2);
                managerViewModel2.L(context2, G2, D2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, ManagerViewModel managerViewModel) {
            super(0);
            this.$context = context;
            this.this$0 = managerViewModel;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HomeViewModel.A.c().j0(this.$context, this.this$0.C(), new a(this.this$0, this.$context));
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class h extends n0 implements v3.a<r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ManagerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, ManagerViewModel managerViewModel) {
            super(0);
            this.$context = context;
            this.this$0 = managerViewModel;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (f1.i(this.$context)) {
                this.this$0.u(this.$context);
            } else {
                f1.r("您当前并未设置为允许，请在设置后再进行操作。", 0, 2, null);
            }
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class i extends n0 implements v3.a<r2> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context context) {
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
            a1.f15052a.a(this.$context);
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class j extends n0 implements v3.a<r2> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context) {
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
            ManagerViewModel.this.h0(this.$context, true);
        }
    }

    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 ManagerViewModel.kt\ncom/yuanqi/master/manager/ManagerViewModel\n*L\n1#1,148:1\n261#2,3:149\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class k extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f14743a;

        public k(Context context) {
            this.f14743a = context;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Object systemService = this.f14743a.getSystemService("input_method");
            l0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).toggleSoftInput(0, 2);
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "content", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class l extends n0 implements v3.l<String, r2> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String content) {
            l0.p(content, "content");
            if (content.length() > 20) {
                f1.r("备注名字不能超过20个字符", 0, 2, null);
                return;
            }
            if (ManagerViewModel.this.C() != null) {
                v2.b C = ManagerViewModel.this.C();
                l0.m(C);
                C.setNoteName(content);
                ManagerViewModel.this.B().setValue(content);
                ManagerViewModel managerViewModel = ManagerViewModel.this;
                v2.b C2 = managerViewModel.C();
                l0.m(C2);
                managerViewModel.o0(C2);
                return;
            }
            ManagerViewModel managerViewModel2 = ManagerViewModel.this;
            String D = managerViewModel2.D();
            if (D == null) {
                D = "";
            }
            managerViewModel2.I(D, ManagerViewModel.this.G(), content);
            q0.f15237a.a().o(this.$context, String.valueOf(ManagerViewModel.this.v()), String.valueOf(ManagerViewModel.this.G()), content);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m extends n0 implements v3.l<View, r2> {
        final /* synthetic */ Context $context;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.manager.ManagerViewModel$showSetPwdDialog$1$1", f = "ManagerViewModel.kt", i = {}, l = {320}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ View $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, View view, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.$context = context;
                this.$it = view;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new a(this.$context, this.$it, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                    if (d1.b(500L, this) == l5) {
                        return l5;
                    }
                }
                Object systemService = this.$context.getSystemService("input_method");
                l0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(this.$it, 0);
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(View view) {
            invoke2(view);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l View it) {
            l0.p(it, "it");
            kotlinx.coroutines.k.f(ManagerViewModel.this.f14739k, k1.c(), null, new a(this.$context, it, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pwd", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n extends n0 implements v3.l<String, r2> {
        final /* synthetic */ boolean $isEdit;
        final /* synthetic */ ManagerViewModel this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.manager.ManagerViewModel$showSetPwdDialog$2$1", f = "ManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ String $pwd;
            int label;
            final /* synthetic */ ManagerViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ManagerViewModel managerViewModel, String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.this$0 = managerViewModel;
                this.$pwd = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new a(this.this$0, this.$pwd, dVar);
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
                    if (this.this$0.C() == null) {
                        v2.b bVar = new v2.b();
                        ManagerViewModel managerViewModel = this.this$0;
                        bVar.setUserId(managerViewModel.G());
                        bVar.setPackageName(String.valueOf(managerViewModel.D()));
                        bVar.setAppPwd(this.$pwd);
                        this.this$0.X(bVar);
                        HomeViewModel.A.b().d(bVar);
                    } else {
                        v2.b C = this.this$0.C();
                        l0.m(C);
                        C.setAppPwd(this.$pwd);
                        com.yuanqi.master.database.dao.c b5 = HomeViewModel.A.b();
                        v2.b C2 = this.this$0.C();
                        l0.m(C2);
                        b5.e(C2);
                    }
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z4, ManagerViewModel managerViewModel) {
            super(1);
            this.$isEdit = z4;
            this.this$0 = managerViewModel;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String pwd) {
            l0.p(pwd, "pwd");
            if (this.$isEdit) {
                int length = pwd.length();
                if (1 <= length && length < 4) {
                    f1.r("密码为4位数字", 0, 2, null);
                    return;
                }
            } else if (pwd.length() != 4) {
                f1.r("密码为4位数字", 0, 2, null);
                return;
            }
            kotlinx.coroutines.k.f(this.this$0.f14739k, k1.c(), null, new a(this.this$0, pwd, null), 2, null);
            HomeViewModel.A.c().u(true);
            f1.r("设置成功", 0, 2, null);
            this.this$0.E().setValue(pwd.length() == 0 ? "应用锁" : "修改密码");
        }
    }

    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 ManagerViewModel.kt\ncom/yuanqi/master/manager/ManagerViewModel\n*L\n1#1,148:1\n178#2,3:149\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f14744a;

        public o(Context context) {
            this.f14744a = context;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Object systemService = this.f14744a.getSystemService("input_method");
            l0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).toggleSoftInput(0, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "content", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class p extends n0 implements v3.l<String, r2> {
        final /* synthetic */ v3.l<String, r2> $action;
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(Context context, v3.l<? super String, r2> lVar) {
            super(1);
            this.$context = context;
            this.$action = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String content) {
            l0.p(content, "content");
            if (content.length() == 0) {
                String string = this.$context.getString(R.string.no_allow_empty);
                l0.o(string, "getString(...)");
                f1.r(string, 0, 2, null);
                return;
            }
            this.$action.invoke(content);
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class q extends n0 implements v3.a<r2> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Context context, int i5) {
            super(0);
            this.$context = context;
            this.$type = i5;
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
            if (this.$type != 1) {
                intent.putExtra("screen", com.yuanqi.master.mine.c.f14825g);
            } else {
                intent.putExtra("register", 1);
            }
            context.startActivity(intent);
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class r extends n0 implements v3.a<r2> {
        final /* synthetic */ String $packageName;
        final /* synthetic */ int $userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, int i5) {
            super(0);
            this.$packageName = str;
            this.$userId = i5;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VActivityManager.get().killAppByPkg(this.$packageName, this.$userId);
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class s extends n0 implements v3.a<r2> {
        final /* synthetic */ v3.a<r2> $cancel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(v3.a<r2> aVar) {
            super(0);
            this.$cancel = aVar;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ManagerViewModel.this.a0(false);
            this.$cancel.invoke();
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class t extends n0 implements v3.a<r2> {
        final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $changeLocationResultLauncher;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $packageName;
        final /* synthetic */ int $userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Context context, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, String str, int i5) {
            super(0);
            this.$context = context;
            this.$changeLocationResultLauncher = managedActivityResultLauncher;
            this.$packageName = str;
            this.$userId = i5;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ManagerViewModel.this.a0(true);
            ManagerViewModel.this.K(this.$context, this.$changeLocationResultLauncher, this.$packageName, this.$userId);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.manager.ManagerViewModel$updateAppNote$1", f = "ManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class u extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v2.b $appNote;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(v2.b bVar, kotlin.coroutines.d<? super u> dVar) {
            super(2, dVar);
            this.$appNote = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new u(this.$appNote, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((u) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                HomeViewModel.b bVar = HomeViewModel.A;
                bVar.b().e(this.$appNote);
                HomeViewModel.v(bVar.c(), false, 1, null);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        d0<ManagerViewModel> b5;
        b5 = f0.b(h0.SYNCHRONIZED, a.INSTANCE);
        f14729r = b5;
    }

    private ManagerViewModel() {
        MutableState<DeviceModel> mutableStateOf$default;
        this.f14730b = "ManagerViewModel";
        this.f14733e = -1;
        this.f14737i = v0.a("设置名称");
        this.f14738j = v0.a("应用锁");
        this.f14739k = t0.a(k1.e());
        this.f14740l = new x0(com.yuanqi.master.config.c.U, Boolean.FALSE);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f14741m = mutableStateOf$default;
    }

    public /* synthetic */ ManagerViewModel(w wVar) {
        this();
    }

    private final boolean F() {
        return ((Boolean) this.f14740l.getValue(this, f14727p[0])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String str, int i5, String str2) {
        kotlinx.coroutines.k.f(this.f14739k, k1.c(), null, new f(str2, str, i5, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Context context, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, String str, int i5) {
        q0 a5 = q0.f15237a.a();
        String str2 = this.f14734f;
        l0.m(str2);
        a5.l(context, str2, String.valueOf(i5));
        Intent intent = new Intent(context, (Class<?>) MapActivity.class);
        com.yuanqi.group.home.models.g gVar = this.f14742n;
        l0.m(gVar);
        if (gVar.f14032f != null) {
            com.yuanqi.group.home.models.g gVar2 = this.f14742n;
            l0.m(gVar2);
            intent.putExtra(com.yuanqi.group.c.f13757k, gVar2.f14032f);
        }
        String str3 = this.f14734f;
        l0.m(str3);
        intent.putExtra(com.yuanqi.group.c.f13762p, str3);
        intent.putExtra(com.yuanqi.group.c.f13763q, str);
        intent.putExtra(com.yuanqi.group.c.f13764r, i5);
        managedActivityResultLauncher.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Context context, int i5, String str) {
        boolean s8;
        s8 = kotlin.collections.p.s8(com.yuanqi.master.config.c.a(), str);
        if (s8) {
            String string = context.getString(R.string.app_not_supported);
            l0.o(string, "getString(...)");
            f1.r(string, 0, 2, null);
            return;
        }
        if (VirtualCore.get().isRunInExtProcess(str)) {
            if (!VirtualCore.get().isExtPackageInstalled()) {
                String string2 = context.getString(R.string.ext_package_mgs);
                l0.o(string2, "getString(...)");
                f1.r(string2, 0, 2, null);
                return;
            }
            if (!VExtPackageAccessor.hasExtPackageBootPermission()) {
                String string3 = context.getString(R.string.permission_boot_content);
                l0.o(string3, "getString(...)");
                f1.r(string3, 0, 2, null);
                return;
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(StubManifest.EXT_PACKAGE_NAME, ExtLaunchAppActivity.class.getName()));
            intent.addFlags(268435456);
            intent.putExtra("_VA_|_userid_", i5);
            intent.putExtra("_VA_|_package_", str);
            context.startActivity(intent);
            Log.d("ManagerViewModel", "launch32: " + i5 + ' ' + str);
            return;
        }
        Log.d("ManagerViewModel", "launch: " + i5 + ' ' + str);
        VActivityManager.get().launchApp(i5, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
    
        if (r5 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x01c4, code lost:
    
        if (com.yuanqi.master.tools.y0.f15274a.a(r12) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x01c7, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d A[Catch: all -> 0x0171, TRY_LEAVE, TryCatch #0 {all -> 0x0171, blocks: (B:11:0x0003, B:13:0x0012, B:20:0x0045, B:22:0x004b, B:29:0x007e, B:59:0x0094, B:60:0x00ab, B:31:0x00d5, B:35:0x00df, B:38:0x00e9, B:40:0x00f7, B:48:0x00f1, B:50:0x0143, B:52:0x0149, B:54:0x0159, B:56:0x016d, B:70:0x00a8), top: B:10:0x0003, inners: #2 }] */
    @androidx.annotation.RequiresApi(30)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(android.content.Context r12, int r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.manager.ManagerViewModel.M(android.content.Context, int, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(boolean z4, DialogInterface dialogInterface, int i5) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        RequestExternalStorageManagerActivity.request(VirtualCore.get().getContext(), z4);
    }

    private final void P(com.yuanqi.group.home.models.g gVar) {
        gVar.f14031e = VirtualLocationManager.get().getMode(gVar.f14038b, gVar.f14037a);
        gVar.f14032f = VLocationManager.get().getLocation(gVar.f14037a, gVar.f14038b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(Context context, String str) {
        ShortcutInfo.Builder longLabel;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder intent;
        ShortcutInfo build;
        Bitmap drawableToBitmap = BitmapUtils.drawableToBitmap(VirtualCore.get().getInstalledAppInfo(this.f14732d, 0).getApplicationInfo(this.f14733e).loadIcon(context.getPackageManager()));
        Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) HomeActivity.class);
        intent2.setAction("android.intent.action.MAIN");
        intent2.putExtra("index", this.f14731c);
        intent2.putExtra(bi.f12269o, this.f14732d);
        intent2.putExtra("user_id", this.f14733e);
        intent2.putExtra("app_name", this.f14734f);
        if (Build.VERSION.SDK_INT >= 26) {
            longLabel = new ShortcutInfo.Builder(context, this.f14732d + '@' + this.f14733e).setLongLabel(str);
            shortLabel = longLabel.setShortLabel(str);
            icon = shortLabel.setIcon(Icon.createWithBitmap(drawableToBitmap));
            intent = icon.setIntent(intent2);
            build = intent.build();
            l0.o(build, "build(...)");
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager != null) {
                try {
                    BuildCompat.isS();
                    shortcutManager.requestPinShortcut(build, null);
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
            return;
        }
        Intent intent3 = new Intent();
        intent3.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        intent3.putExtra("android.intent.extra.shortcut.NAME", str);
        intent3.putExtra("android.intent.extra.shortcut.ICON", BitmapUtils.warrperIcon(drawableToBitmap, 256, 256));
        intent3.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        try {
            context.sendBroadcast(intent3);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(boolean z4) {
        this.f14740l.setValue(this, f14727p[0], Boolean.valueOf(z4));
    }

    private final void c0(final Context context) {
        new AlertDialog.Builder(context, R.style.MyDialogTheme).setTitle(R.string.overlay_notice).setMessage(R.string.overlay_notice_content).setCancelable(false).setNegativeButton("GO", new DialogInterface.OnClickListener() { // from class: com.yuanqi.master.manager.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                ManagerViewModel.d0(ManagerViewModel.this, context, dialogInterface, i5);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(ManagerViewModel this$0, Context context, DialogInterface dialogInterface, int i5) {
        l0.p(this$0, "this$0");
        l0.p(context, "$context");
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + this$0.f14732d));
        context.startActivity(intent);
    }

    private final void e0(final Context context) {
        final Intent permissionActivityIntent = OemPermissionHelper.getPermissionActivityIntent(context);
        new AlertDialog.Builder(context).setTitle(R.string.permission_boot_notice).setMessage(R.string.permission_boot_content).setCancelable(false).setNegativeButton("GO", new DialogInterface.OnClickListener() { // from class: com.yuanqi.master.manager.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                ManagerViewModel.f0(permissionActivityIntent, context, dialogInterface, i5);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(Intent intent, Context context, DialogInterface dialogInterface, int i5) {
        l0.p(context, "$context");
        if (intent != null) {
            try {
                context.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(Context context, boolean z4) {
        o0.f15213a.y0(context, z4 ? "留空直接保存即为删除密码" : "密码仅限数字", new m(context), new n(z4, this));
    }

    static /* synthetic */ void i0(ManagerViewModel managerViewModel, Context context, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        managerViewModel.h0(context, z4);
    }

    private final void j0(Context context, String str, v3.l<? super String, r2> lVar) {
        o0 o0Var = o0.f15213a;
        String string = context.getString(R.string.set_short_cut_name);
        l0.o(string, "getString(...)");
        o0Var.d0(context, string, str, new p(context, lVar));
        new Timer().schedule(new o(context), 500L);
    }

    private final void k0(Context context) {
        int i5;
        String str;
        int i6;
        if (!com.yuanqi.master.mine.account.a.f14786a.c()) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        o0 o0Var = o0.f15213a;
        String string = context.getString(R.string.tip);
        l0.o(string, "getString(...)");
        if (i5 == 1) {
            str = "此功能需登录并购买VIP后方可使用。";
        } else {
            str = "很抱歉，此功能为付费VIP功能。";
        }
        if (i5 == 1) {
            i6 = R.string.go_login;
        } else {
            i6 = R.string.activate_vip;
        }
        String string2 = context.getString(i6);
        l0.m(string2);
        o0.Y(o0Var, context, string, str, "取消", string2, false, false, false, false, null, null, null, new q(context, i5), 4064, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(v2.b bVar) {
        kotlinx.coroutines.k.f(this.f14739k, k1.c(), null, new u(bVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        VDeviceManager vDeviceManager = VDeviceManager.get();
        int i5 = this.f14733e;
        VDeviceConfig vDeviceConfig = new VDeviceConfig();
        DeviceModel value = this.f14741m.getValue();
        String str8 = null;
        if (value != null) {
            str = value.getDeviceBrand();
        } else {
            str = null;
        }
        vDeviceConfig.setProp("BRAND", str);
        DeviceModel value2 = this.f14741m.getValue();
        if (value2 != null) {
            str2 = value2.getDeviceModel();
        } else {
            str2 = null;
        }
        vDeviceConfig.setProp("MODEL", str2);
        DeviceModel value3 = this.f14741m.getValue();
        if (value3 != null) {
            str3 = value3.getDevice();
        } else {
            str3 = null;
        }
        vDeviceConfig.setProp("DEVICE", str3);
        DeviceModel value4 = this.f14741m.getValue();
        if (value4 != null) {
            str4 = value4.getDeviceName();
        } else {
            str4 = null;
        }
        vDeviceConfig.setProp("DISPLAY", str4);
        DeviceModel value5 = this.f14741m.getValue();
        if (value5 != null) {
            str5 = value5.getDeviceManu();
        } else {
            str5 = null;
        }
        vDeviceConfig.setProp("MANUFACTURER", str5);
        DeviceModel value6 = this.f14741m.getValue();
        if (value6 != null) {
            str6 = value6.getImei();
        } else {
            str6 = null;
        }
        vDeviceConfig.deviceId = str6;
        DeviceModel value7 = this.f14741m.getValue();
        if (value7 != null) {
            str7 = value7.getWifi();
        } else {
            str7 = null;
        }
        vDeviceConfig.wifiMac = str7;
        DeviceModel value8 = this.f14741m.getValue();
        if (value8 != null) {
            str8 = value8.getAndroidId();
        }
        vDeviceConfig.androidId = str8;
        r2 r2Var = r2.f19517a;
        vDeviceManager.updateDeviceConfig(i5, vDeviceConfig);
    }

    @RequiresApi(30)
    private final boolean t(Context context) {
        if (VirtualCore.get().isExtPackageInstalled()) {
            if (!VExtPackageAccessor.hasExtPackageBootPermission()) {
                e0(context);
                return true;
            }
            if (BuildCompat.isQ() && !Settings.canDrawOverlays(context)) {
                c0(context);
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            ManagerActivity a5 = ManagerActivity.f14722b.a();
            l0.m(a5);
            ActivityCompat.requestPermissions(a5, new String[]{"android.permission.POST_NOTIFICATIONS"}, 0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Context context) {
        String str;
        String noteName;
        boolean z4;
        v2.b bVar = this.f14735g;
        boolean z5 = false;
        if (bVar != null && (noteName = bVar.getNoteName()) != null) {
            if (noteName.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                z5 = true;
            }
        }
        if (z5) {
            v2.b bVar2 = this.f14735g;
            l0.m(bVar2);
            str = bVar2.getNoteName();
        } else {
            str = this.f14734f + '_' + (this.f14733e + 1);
        }
        j0(context, str, new e(context, this));
    }

    public final void A(@p4.l Context context) {
        l0.p(context, "context");
        List<InstalledAppInfo> installedApps = VirtualCore.get().getInstalledApps(0);
        l0.o(installedApps, "getInstalledApps(...)");
        for (InstalledAppInfo installedAppInfo : installedApps) {
            if (l0.g(installedAppInfo.packageName, this.f14732d)) {
                com.yuanqi.group.home.models.g gVar = new com.yuanqi.group.home.models.g(context, installedAppInfo, this.f14733e);
                this.f14742n = gVar;
                l0.m(gVar);
                P(gVar);
            }
        }
    }

    @p4.l
    public final e0<String> B() {
        return this.f14737i;
    }

    @p4.m
    public final v2.b C() {
        return this.f14735g;
    }

    @p4.m
    public final String D() {
        return this.f14732d;
    }

    @p4.l
    public final e0<String> E() {
        return this.f14738j;
    }

    public final int G() {
        return this.f14733e;
    }

    @p4.m
    public final String H(@p4.l Context context) {
        l0.p(context, "context");
        try {
            String str = this.f14732d;
            if (str == null) {
                return null;
            }
            return VirtualCore.getPM().getPackageInfo(str, 0).versionName;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public final boolean J() {
        return this.f14736h;
    }

    public final void O(@p4.l Context context) {
        boolean s8;
        l0.p(context, "context");
        s8 = kotlin.collections.p.s8(com.yuanqi.master.config.c.a(), this.f14732d);
        if (s8) {
            String string = context.getString(R.string.app_not_supported);
            l0.o(string, "getString(...)");
            f1.r(string, 0, 2, null);
            return;
        }
        com.yuanqi.master.mine.account.a.f14786a.n(this.f14739k, new g(context, this));
    }

    public final void Q(@p4.l Context context) {
        l0.p(context, "context");
        if (!com.yuanqi.master.mine.account.a.f14786a.k()) {
            b(context, 1);
            return;
        }
        if (f1.i(context)) {
            u(context);
            return;
        }
        o0 o0Var = o0.f15213a;
        String string = context.getString(R.string.tip);
        l0.o(string, "getString(...)");
        String string2 = context.getString(R.string.need_short_cut);
        l0.o(string2, "getString(...)");
        String string3 = context.getString(R.string.already_setting);
        l0.o(string3, "getString(...)");
        String string4 = context.getString(R.string.go_setting);
        l0.o(string4, "getString(...)");
        o0.Y(o0Var, context, string, string2, string3, string4, false, false, false, false, null, new h(context, this), null, new i(context), 3040, null);
    }

    public final void R(@p4.m VLocation vLocation) {
        com.yuanqi.group.home.models.g gVar = this.f14742n;
        if (gVar != null) {
            gVar.f14032f = vLocation;
        }
        VirtualCore virtualCore = VirtualCore.get();
        com.yuanqi.group.home.models.g gVar2 = this.f14742n;
        l0.m(gVar2);
        String str = gVar2.f14037a;
        com.yuanqi.group.home.models.g gVar3 = this.f14742n;
        l0.m(gVar3);
        virtualCore.killApp(str, gVar3.f14038b);
        com.yuanqi.group.home.models.g gVar4 = this.f14742n;
        l0.m(gVar4);
        if (gVar4.f14032f != null) {
            com.yuanqi.group.home.models.g gVar5 = this.f14742n;
            l0.m(gVar5);
            if (!gVar5.f14032f.isEmpty()) {
                com.yuanqi.group.home.models.g gVar6 = this.f14742n;
                l0.m(gVar6);
                if (gVar6.f14031e != 2) {
                    Log.d(this.f14730b, "saveLocation: self");
                    VirtualLocationManager virtualLocationManager = VirtualLocationManager.get();
                    com.yuanqi.group.home.models.g gVar7 = this.f14742n;
                    l0.m(gVar7);
                    int i5 = gVar7.f14038b;
                    com.yuanqi.group.home.models.g gVar8 = this.f14742n;
                    l0.m(gVar8);
                    virtualLocationManager.setMode(i5, gVar8.f14037a, 2);
                }
                VirtualLocationManager virtualLocationManager2 = VirtualLocationManager.get();
                com.yuanqi.group.home.models.g gVar9 = this.f14742n;
                l0.m(gVar9);
                int i6 = gVar9.f14038b;
                com.yuanqi.group.home.models.g gVar10 = this.f14742n;
                l0.m(gVar10);
                String str2 = gVar10.f14037a;
                com.yuanqi.group.home.models.g gVar11 = this.f14742n;
                l0.m(gVar11);
                virtualLocationManager2.setLocation(i6, str2, gVar11.f14032f);
            }
        }
        Log.d(this.f14730b, "saveLocation: null");
        VirtualLocationManager virtualLocationManager3 = VirtualLocationManager.get();
        com.yuanqi.group.home.models.g gVar12 = this.f14742n;
        l0.m(gVar12);
        int i7 = gVar12.f14038b;
        com.yuanqi.group.home.models.g gVar13 = this.f14742n;
        l0.m(gVar13);
        virtualLocationManager3.setMode(i7, gVar13.f14037a, 0);
        VirtualLocationManager virtualLocationManager22 = VirtualLocationManager.get();
        com.yuanqi.group.home.models.g gVar92 = this.f14742n;
        l0.m(gVar92);
        int i62 = gVar92.f14038b;
        com.yuanqi.group.home.models.g gVar102 = this.f14742n;
        l0.m(gVar102);
        String str22 = gVar102.f14037a;
        com.yuanqi.group.home.models.g gVar112 = this.f14742n;
        l0.m(gVar112);
        virtualLocationManager22.setLocation(i62, str22, gVar112.f14032f);
    }

    public final void S(@p4.m String str) {
        this.f14734f = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r0 == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(@p4.l android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r10, r0)
            com.yuanqi.master.mine.account.a r0 = com.yuanqi.master.mine.account.a.f14786a
            boolean r0 = r0.k()
            r1 = 1
            if (r0 != 0) goto L12
            r9.b(r10, r1)
            return
        L12:
            v2.b r0 = r9.f14735g
            r2 = 0
            if (r0 == 0) goto L47
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.getAppPwd()
            if (r0 == 0) goto L2b
            int r0 = r0.length()
            if (r0 != 0) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 != r1) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r1 == 0) goto L2f
            goto L47
        L2f:
            com.yuanqi.master.tools.o0 r3 = com.yuanqi.master.tools.o0.f15213a
            kotlinx.coroutines.s0 r5 = r9.f14739k
            v2.b r0 = r9.f14735g
            kotlin.jvm.internal.l0.m(r0)
            java.lang.String r6 = r0.getAppPwd()
            r7 = 1
            com.yuanqi.master.manager.ManagerViewModel$j r8 = new com.yuanqi.master.manager.ManagerViewModel$j
            r8.<init>(r10)
            r4 = r10
            r3.M0(r4, r5, r6, r7, r8)
            goto L4c
        L47:
            r0 = 2
            r1 = 0
            i0(r9, r10, r2, r0, r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.manager.ManagerViewModel.T(android.content.Context):void");
    }

    public final void U(@p4.l MutableState<DeviceModel> mutableState) {
        l0.p(mutableState, "<set-?>");
        this.f14741m = mutableState;
    }

    public final void V(boolean z4) {
        this.f14736h = z4;
    }

    public final void W(int i5) {
        this.f14731c = i5;
    }

    public final void X(@p4.m v2.b bVar) {
        this.f14735g = bVar;
    }

    public final void Y(@p4.m String str) {
        this.f14732d = str;
    }

    public final void b0(int i5) {
        this.f14733e = i5;
    }

    public final void g0(@p4.l Context context) {
        String str;
        l0.p(context, "context");
        o0 o0Var = o0.f15213a;
        String string = context.getString(R.string.set_note);
        l0.o(string, "getString(...)");
        v2.b bVar = this.f14735g;
        if (bVar != null) {
            str = bVar.getNoteName();
        } else {
            str = null;
        }
        o0Var.d0(context, string, str, new l(context));
        new Timer().schedule(new k(context), 500L);
    }

    public final void l0(@p4.l Context context, @p4.l NavHostController navController) {
        l0.p(context, "context");
        l0.p(navController, "navController");
        if (!com.yuanqi.master.mine.account.a.f14786a.k()) {
            b(context, 1);
        } else {
            NavController.navigate$default(navController, com.yuanqi.master.manager.i.f14758c, null, null, 6, null);
        }
    }

    public final void m0(@p4.l Context context, @p4.l String packageName, int i5) {
        l0.p(context, "context");
        l0.p(packageName, "packageName");
        o0.f15213a.P(context, new r(packageName, i5));
        q0.f15237a.a().e(context);
    }

    public final void n0(@p4.l Context context, @p4.l ManagedActivityResultLauncher<Intent, ActivityResult> changeLocationResultLauncher, @p4.l String packageName, int i5, @p4.l v3.a<r2> cancel) {
        l0.p(context, "context");
        l0.p(changeLocationResultLauncher, "changeLocationResultLauncher");
        l0.p(packageName, "packageName");
        l0.p(cancel, "cancel");
        if (!com.yuanqi.master.mine.account.a.f14786a.k()) {
            b(context, 1);
        } else if (!F()) {
            o0.Y(o0.f15213a, context, "温馨提示", "请注意！\n       该功能为内部测试功能，严禁个人或组织用于各类违法违规活动，若因此产生的一切法律后果均由用户自行承担！", "取消", "我同意", false, false, false, false, null, new s(cancel), null, new t(context, changeLocationResultLauncher, packageName, i5), 3008, null);
        } else {
            K(context, changeLocationResultLauncher, packageName, i5);
        }
    }

    public final void r(@p4.l Context context) {
        l0.p(context, "context");
        this.f14741m.setValue(com.yuanqi.master.tools.e.f15100a.d(context));
        p0();
    }

    public final void s() {
        f1.a(com.yuanqi.master.network.repository.f.f14851g.g(), new c(), d.INSTANCE);
    }

    @p4.m
    public final String v() {
        return this.f14734f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0075 A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:3:0x001e, B:5:0x0069, B:10:0x0075, B:12:0x007b, B:16:0x0085, B:20:0x008b), top: B:2:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(@p4.l android.content.Context r13) {
        /*
            r12 = this;
            java.lang.String r0 = "getProp(...)"
            java.lang.String r1 = "context"
            kotlin.jvm.internal.l0.p(r13, r1)
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r13.getSystemService(r1)
            java.lang.String r2 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            kotlin.jvm.internal.l0.n(r1, r2)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            com.lody.virtual.client.ipc.VDeviceManager r1 = com.lody.virtual.client.ipc.VDeviceManager.get()
            int r2 = r12.f14733e
            com.lody.virtual.remote.VDeviceConfig r1 = r1.getDeviceConfig(r2)
            com.yuanqi.master.network.model.DeviceModel r11 = new com.yuanqi.master.network.model.DeviceModel     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = "DISPLAY"
            java.lang.String r3 = r1.getProp(r2)     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.l0.o(r3, r0)     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = "MODEL"
            java.lang.String r4 = r1.getProp(r2)     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.l0.o(r4, r0)     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = "DEVICE"
            java.lang.String r5 = r1.getProp(r2)     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.l0.o(r5, r0)     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = "MANUFACTURER"
            java.lang.String r6 = r1.getProp(r2)     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.l0.o(r6, r0)     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = "BRAND"
            java.lang.String r7 = r1.getProp(r2)     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.l0.o(r7, r0)     // Catch: java.lang.Exception -> L97
            java.lang.String r8 = r1.deviceId     // Catch: java.lang.Exception -> L97
            java.lang.String r9 = r1.androidId     // Catch: java.lang.Exception -> L97
            java.lang.String r0 = "androidId"
            kotlin.jvm.internal.l0.o(r9, r0)     // Catch: java.lang.Exception -> L97
            java.lang.String r10 = r1.wifiMac     // Catch: java.lang.Exception -> L97
            java.lang.String r0 = "wifiMac"
            kotlin.jvm.internal.l0.o(r10, r0)     // Catch: java.lang.Exception -> L97
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L97
            java.lang.String r0 = r11.getDevice()     // Catch: java.lang.Exception -> L97
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L72
            int r0 = r0.length()     // Catch: java.lang.Exception -> L97
            if (r0 != 0) goto L70
            goto L72
        L70:
            r0 = r1
            goto L73
        L72:
            r0 = r2
        L73:
            if (r0 != 0) goto L8b
            java.lang.String r0 = r11.getDeviceModel()     // Catch: java.lang.Exception -> L97
            if (r0 == 0) goto L81
            int r0 = r0.length()     // Catch: java.lang.Exception -> L97
            if (r0 != 0) goto L82
        L81:
            r1 = r2
        L82:
            if (r1 == 0) goto L85
            goto L8b
        L85:
            androidx.compose.runtime.MutableState<com.yuanqi.master.network.model.DeviceModel> r0 = r12.f14741m     // Catch: java.lang.Exception -> L97
            r0.setValue(r11)     // Catch: java.lang.Exception -> L97
            goto La2
        L8b:
            androidx.compose.runtime.MutableState<com.yuanqi.master.network.model.DeviceModel> r0 = r12.f14741m     // Catch: java.lang.Exception -> L97
            com.yuanqi.master.tools.e r1 = com.yuanqi.master.tools.e.f15100a     // Catch: java.lang.Exception -> L97
            com.yuanqi.master.network.model.DeviceModel r1 = r1.d(r13)     // Catch: java.lang.Exception -> L97
            r0.setValue(r1)     // Catch: java.lang.Exception -> L97
            goto La2
        L97:
            androidx.compose.runtime.MutableState<com.yuanqi.master.network.model.DeviceModel> r0 = r12.f14741m
            com.yuanqi.master.tools.e r1 = com.yuanqi.master.tools.e.f15100a
            com.yuanqi.master.network.model.DeviceModel r13 = r1.d(r13)
            r0.setValue(r13)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.manager.ManagerViewModel.w(android.content.Context):void");
    }

    @p4.l
    public final MutableState<DeviceModel> x() {
        return this.f14741m;
    }

    @p4.m
    public final Drawable y(@p4.l Context context) {
        l0.p(context, "context");
        try {
            String str = this.f14732d;
            if (str == null) {
                return null;
            }
            return VirtualCore.getPM().getApplicationIcon(str);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public final int z() {
        return this.f14731c;
    }
}
