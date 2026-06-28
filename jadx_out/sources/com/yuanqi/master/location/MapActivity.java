package com.yuanqi.master.location;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.http.Headers;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VirtualLocationManager;
import com.lody.virtual.remote.vloc.VLocation;
import com.umeng.analytics.pro.bi;
import com.yqtech.multiapp.R;
import com.yqtech.multiapp.databinding.ActivityMapBinding;
import com.yqtech.multiapp.databinding.DialogBaseTipBinding;
import com.yuanqi.group.App;
import com.yuanqi.master.ViewModelFactoryKt;
import com.yuanqi.master.network.model.CustomAddress;
import com.yuanqi.master.tools.c1;
import com.yuanqi.master.tools.dialog.b;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.r0;
import com.yuanqi.master.tools.u0;
import com.yuanqi.master.tools.z0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.x0;
import kotlin.r2;
import kotlin.text.f0;
import kotlin.v;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.api.IMapController;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.CustomZoomButtonsController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.Overlay;

@StabilityInferred(parameters = 0)
@Instrumented
@SuppressLint({"MissingPermission"})
@i0(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000203H\u0002J\b\u00107\u001a\u000203H\u0002J\b\u00108\u001a\u000203H\u0002J\b\u00109\u001a\u000203H\u0002J\b\u0010:\u001a\u000203H\u0002J\u0012\u0010;\u001a\u0002032\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\u001a\u0010>\u001a\u0002032\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020\bH\u0016J\b\u0010B\u001a\u000203H\u0014J\b\u0010C\u001a\u000203H\u0014J,\u0010D\u001a\u0002032\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002030JH\u0002J\b\u0010K\u001a\u000203H\u0002J\b\u0010L\u001a\u000203H\u0002J\b\u0010M\u001a\u000203H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u000e\u0010(\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u00101\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/yuanqi/master/location/MapActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/yuanqi/master/tools/OnItemClickListener;", "()V", "CHANGE_MAP_ZOOM", "", "DEFAULT_ZOOM", "HISTORY_RESULT_CODE", "", "PARSE_SUCCESS_CODE", "TAG", "", "address", "addressesLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/yuanqi/master/network/model/CustomAddress;", TTDownloadField.TT_APP_NAME, "binding", "Lcom/yqtech/multiapp/databinding/ActivityMapBinding;", "isLocation", "", "isShowList", "locationListener", "Landroid/location/LocationListener;", "locationManager", "Landroid/location/LocationManager;", "mAdapter", "Lcom/yuanqi/master/location/AddressAdapter;", "mList", "", "mLocation", "Lcom/lody/virtual/remote/vloc/VLocation;", "mMarker", "Lorg/osmdroid/views/overlay/Marker;", "mapViewModel", "Lcom/yuanqi/master/location/MapViewModel;", "getMapViewModel", "()Lcom/yuanqi/master/location/MapViewModel;", "mapViewModel$delegate", "Lkotlin/Lazy;", TTDownloadField.TT_PACKAGE_NAME, "<set-?>", "showMapTipKey", "getShowMapTipKey", "()Z", "setShowMapTipKey", "(Z)V", "showMapTipKey$delegate", "Lcom/yuanqi/master/tools/MVFast;", "userId", "changeMapCenter", "", "geoPoint", "Lorg/osmdroid/util/GeoPoint;", "finishResult", "hideKeyboard", "initMap", "initObservers", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "view", "Landroid/view/View;", "position", "onPause", "onResume", "setEditListener", "et", "Landroidx/appcompat/widget/AppCompatEditText;", "ivClear", "Landroid/widget/ImageView;", "action", "Lkotlin/Function1;", com.yuanqi.master.config.c.W, "startLocation", "stopLocation", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMapActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapActivity.kt\ncom/yuanqi/master/location/MapActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,531:1\n75#2,13:532\n*S KotlinDebug\n*F\n+ 1 MapActivity.kt\ncom/yuanqi/master/location/MapActivity\n*L\n66#1:532,13\n*E\n"})
/* loaded from: classes3.dex */
public final class MapActivity extends AppCompatActivity implements z0 {

    /* renamed from: v, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f14618v = {l1.k(new x0(MapActivity.class, "showMapTipKey", "getShowMapTipKey()Z", 0))};

    /* renamed from: w, reason: collision with root package name */
    public static final int f14619w = 8;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final String f14620a = "MapActivity";

    /* renamed from: b, reason: collision with root package name */
    private ActivityMapBinding f14621b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final d0 f14622c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private MutableLiveData<CustomAddress> f14623d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private MutableLiveData<Boolean> f14624e;

    /* renamed from: f, reason: collision with root package name */
    @p4.m
    private AddressAdapter f14625f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final List<CustomAddress> f14626g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private String f14627h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private String f14628i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private String f14629j;

    /* renamed from: k, reason: collision with root package name */
    private int f14630k;

    /* renamed from: l, reason: collision with root package name */
    @p4.m
    private VLocation f14631l;

    /* renamed from: m, reason: collision with root package name */
    @p4.m
    private Marker f14632m;

    /* renamed from: n, reason: collision with root package name */
    private final float f14633n;

    /* renamed from: o, reason: collision with root package name */
    private final float f14634o;

    /* renamed from: p, reason: collision with root package name */
    private final int f14635p;

    /* renamed from: q, reason: collision with root package name */
    private final int f14636q;

    /* renamed from: r, reason: collision with root package name */
    private LocationManager f14637r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14638s;

    /* renamed from: t, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.tools.x0 f14639t;

    /* renamed from: u, reason: collision with root package name */
    @p4.l
    private final LocationListener f14640u;

    @i0(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/yuanqi/master/location/MapActivity$initMap$1$2", "Lorg/osmdroid/views/overlay/Overlay;", "onSingleTapConfirmed", "", "e", "Landroid/view/MotionEvent;", "mapView", "Lorg/osmdroid/views/MapView;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends Overlay {
        a() {
        }

        @Override // org.osmdroid.views.overlay.Overlay
        public boolean onSingleTapConfirmed(@p4.m MotionEvent motionEvent, @p4.m MapView mapView) {
            Projection projection;
            if (mapView != null && (projection = mapView.getProjection()) != null) {
                MapActivity mapActivity = MapActivity.this;
                l0.m(motionEvent);
                IGeoPoint fromPixels = projection.fromPixels((int) motionEvent.getX(), (int) motionEvent.getY());
                l0.n(fromPixels, "null cannot be cast to non-null type org.osmdroid.util.GeoPoint");
                Log.d(mapActivity.f14620a, "onSingleTapConfirmed: 切换地图中心位置");
                mapActivity.X((GeoPoint) fromPixels);
            }
            return super.onSingleTapConfirmed(motionEvent, mapView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "customAddress", "Lcom/yuanqi/master/network/model/CustomAddress;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements v3.l<CustomAddress, r2> {
        b() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(CustomAddress customAddress) {
            invoke2(customAddress);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomAddress customAddress) {
            if (!MapActivity.this.f14626g.isEmpty()) {
                MapActivity.this.f14626g.clear();
            }
            List list = MapActivity.this.f14626g;
            l0.m(customAddress);
            list.add(customAddress);
            ActivityMapBinding activityMapBinding = MapActivity.this.f14621b;
            if (activityMapBinding == null) {
                l0.S("binding");
                activityMapBinding = null;
            }
            activityMapBinding.rvResult.setVisibility(0);
            AddressAdapter addressAdapter = MapActivity.this.f14625f;
            if (addressAdapter != null) {
                addressAdapter.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends n0 implements v3.l<Boolean, r2> {
        c() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
            invoke2(bool);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            ActivityMapBinding activityMapBinding = MapActivity.this.f14621b;
            if (activityMapBinding == null) {
                l0.S("binding");
                activityMapBinding = null;
            }
            RecyclerView recyclerView = activityMapBinding.rvResult;
            l0.m(bool);
            recyclerView.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends n0 implements v3.l<Boolean, r2> {
        d() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool) {
            invoke2(bool);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            String str = MapActivity.this.f14620a;
            StringBuilder sb = new StringBuilder();
            sb.append("save History ");
            l0.m(bool);
            sb.append(bool.booleanValue() ? "Success" : "Failed");
            Log.d(str, sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/tools/Failure;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends n0 implements v3.l<r0, r2> {
        e() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(r0 r0Var) {
            invoke2(r0Var);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(r0 r0Var) {
            Log.d(MapActivity.this.f14620a, String.valueOf(App.f13716d.c().z(r0Var)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/CustomAddress;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends n0 implements v3.l<CustomAddress, r2> {
        f() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(CustomAddress customAddress) {
            invoke2(customAddress);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.m CustomAddress customAddress) {
            if (customAddress != null) {
                MapActivity.this.f14623d.setValue(customAddress);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "content", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends n0 implements v3.l<String, r2> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/CustomAddress;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends n0 implements v3.l<CustomAddress, r2> {
            final /* synthetic */ MapActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MapActivity mapActivity) {
                super(1);
                this.this$0 = mapActivity;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(CustomAddress customAddress) {
                invoke2(customAddress);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.m CustomAddress customAddress) {
                if (customAddress != null) {
                    this.this$0.f14623d.setValue(customAddress);
                }
            }
        }

        g() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l String content) {
            l0.p(content, "content");
            MapActivity.this.Z().f(content, new a(MapActivity.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends n0 implements v3.l<String, r2> {
        public static final h INSTANCE = new h();

        h() {
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i extends n0 implements v3.l<String, r2> {
        public static final i INSTANCE = new i();

        i() {
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
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class j extends n0 implements v3.a<ViewModelProvider.Factory> {
        public static final j INSTANCE = new j();

        j() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final ViewModelProvider.Factory invoke() {
            return ViewModelFactoryKt.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k implements Observer, kotlin.jvm.internal.d0 {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ v3.l f14642a;

        k(v3.l function) {
            l0.p(function, "function");
            this.f14642a = function;
        }

        public final boolean equals(@p4.m Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.d0)) {
                return l0.g(getFunctionDelegate(), ((kotlin.jvm.internal.d0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d0
        @p4.l
        public final v<?> getFunctionDelegate() {
            return this.f14642a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f14642a.invoke(obj);
        }
    }

    @i0(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/yuanqi/master/location/MapActivity$setEditListener$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", bi.aE, "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f14643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.l<String, r2> f14644b;

        /* JADX WARN: Multi-variable type inference failed */
        l(ImageView imageView, v3.l<? super String, r2> lVar) {
            this.f14643a = imageView;
            this.f14644b = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@p4.m Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@p4.m CharSequence charSequence, int i5, int i6, int i7) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@p4.l CharSequence s5, int i5, int i6, int i7) {
            boolean z4;
            l0.p(s5, "s");
            if (s5.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.f14643a.setVisibility(0);
                this.f14644b.invoke(s5.toString());
            } else {
                this.f14643a.setVisibility(8);
            }
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class m extends n0 implements v3.a<ViewModelProvider.Factory> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
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

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$3"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class n extends n0 implements v3.a<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentActivity componentActivity) {
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

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$4"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o extends n0 implements v3.a<CreationExtras> {
        final /* synthetic */ v3.a $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(v3.a aVar, ComponentActivity componentActivity) {
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

    public MapActivity() {
        v3.a aVar = j.INSTANCE;
        this.f14622c = new ViewModelLazy(l1.d(MapViewModel.class), new n(this), aVar == null ? new m(this) : aVar, new o(null, this));
        this.f14623d = new MutableLiveData<>();
        this.f14624e = new MutableLiveData<>();
        this.f14626g = new ArrayList();
        this.f14627h = "";
        this.f14628i = "";
        this.f14629j = "";
        this.f14630k = -1;
        this.f14633n = 8.0f;
        this.f14634o = 16.0f;
        this.f14635p = 369;
        this.f14636q = 1000;
        this.f14639t = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.W, Boolean.TRUE);
        this.f14640u = new LocationListener() { // from class: com.yuanqi.master.location.i
            @Override // android.location.LocationListener
            public final void onLocationChanged(Location location) {
                MapActivity.p0(MapActivity.this, location);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(GeoPoint geoPoint) {
        ActivityMapBinding activityMapBinding = this.f14621b;
        ActivityMapBinding activityMapBinding2 = null;
        if (activityMapBinding == null) {
            l0.S("binding");
            activityMapBinding = null;
        }
        activityMapBinding.tvLatitudeLongitude.setText("纬度：" + geoPoint.getLatitude() + " , 经度：" + geoPoint.getLongitude());
        ActivityMapBinding activityMapBinding3 = this.f14621b;
        if (activityMapBinding3 == null) {
            l0.S("binding");
            activityMapBinding3 = null;
        }
        MapView mapView = activityMapBinding3.map;
        if (mapView.getRepository() != null) {
            if (this.f14632m != null) {
                ActivityMapBinding activityMapBinding4 = this.f14621b;
                if (activityMapBinding4 == null) {
                    l0.S("binding");
                } else {
                    activityMapBinding2 = activityMapBinding4;
                }
                activityMapBinding2.map.getOverlays().remove(this.f14632m);
            }
            Marker marker = new Marker(mapView);
            marker.setTitle("当前位置");
            marker.setPosition(geoPoint);
            marker.setIcon(ContextCompat.getDrawable(this, R.drawable.ic_marker));
            this.f14632m = marker;
            mapView.getOverlays().add(this.f14632m);
        }
        VLocation vLocation = this.f14631l;
        if (vLocation != null) {
            vLocation.latitude = geoPoint.getLatitude();
        }
        VLocation vLocation2 = this.f14631l;
        if (vLocation2 != null) {
            vLocation2.longitude = geoPoint.getLongitude();
        }
        IMapController controller = mapView.getController();
        controller.setZoom(14.0d);
        controller.setCenter(geoPoint);
    }

    private final void Y() {
        VirtualCore.get().killApp(this.f14628i, this.f14630k);
        VirtualLocationManager.get().setMode(this.f14630k, this.f14628i, 2);
        VirtualLocationManager.get().setLocation(this.f14630k, this.f14628i, this.f14631l);
        Intent intent = new Intent();
        intent.putExtra(com.yuanqi.group.c.f13757k, this.f14631l);
        intent.putExtra(com.yuanqi.group.c.f13763q, this.f14628i);
        intent.putExtra(com.yuanqi.group.c.f13764r, this.f14630k);
        r2 r2Var = r2.f19517a;
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapViewModel Z() {
        return (MapViewModel) this.f14622c.getValue();
    }

    private final boolean a0() {
        return ((Boolean) this.f14639t.getValue(this, f14618v[0])).booleanValue();
    }

    private final void b0() {
        Object systemService = getSystemService("input_method");
        l0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        ActivityMapBinding activityMapBinding = this.f14621b;
        IBinder iBinder = null;
        if (activityMapBinding == null) {
            l0.S("binding");
            activityMapBinding = null;
        }
        inputMethodManager.showSoftInput(activityMapBinding.etSearch, 1);
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            iBinder = currentFocus.getWindowToken();
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
    }

    private final void c0() {
        VLocation vLocation;
        ActivityMapBinding activityMapBinding = this.f14621b;
        ActivityMapBinding activityMapBinding2 = null;
        if (activityMapBinding == null) {
            l0.S("binding");
            activityMapBinding = null;
        }
        MapView mapView = activityMapBinding.map;
        mapView.setTileSource(u0.f15255b);
        mapView.setMinZoomLevel(Double.valueOf(3.0d));
        mapView.setMaxZoomLevel(Double.valueOf(18.0d));
        mapView.setTilesScaledToDpi(true);
        mapView.setBuiltInZoomControls(true);
        IMapController controller = mapView.getController();
        controller.setZoom(11.0d);
        controller.setCenter(new GeoPoint(43.9d, 125.33d));
        mapView.getZoomController().setVisibility(CustomZoomButtonsController.Visibility.NEVER);
        mapView.setMultiTouchControls(true);
        mapView.getOverlayManager().getTilesOverlay().setEnabled(true);
        mapView.setSelected(true);
        mapView.getOverlayManager().add(new a());
        if (getIntent().hasExtra(com.yuanqi.group.c.f13757k)) {
            vLocation = (VLocation) getIntent().getParcelableExtra(com.yuanqi.group.c.f13757k);
        } else {
            vLocation = null;
        }
        if (vLocation != null) {
            this.f14631l = vLocation;
            com.orhanobut.logger.j.d("虚拟位置：" + vLocation + " ， packageName：" + this.f14628i, new Object[0]);
            if (VirtualLocationManager.get().isUseVirtualLocation(this.f14630k, this.f14628i)) {
                ActivityMapBinding activityMapBinding3 = this.f14621b;
                if (activityMapBinding3 == null) {
                    l0.S("binding");
                    activityMapBinding3 = null;
                }
                activityMapBinding3.ivCloseVirtualLocation.setVisibility(0);
                ActivityMapBinding activityMapBinding4 = this.f14621b;
                if (activityMapBinding4 == null) {
                    l0.S("binding");
                } else {
                    activityMapBinding2 = activityMapBinding4;
                }
                activityMapBinding2.tvCloseVirtualLocation.setVisibility(0);
                X(new GeoPoint(vLocation.getLatitude(), vLocation.getLongitude()));
                return;
            }
            Log.d(this.f14620a, "未使用虚拟位置");
            w0();
            return;
        }
        this.f14631l = new VLocation();
        Log.d(this.f14620a, "虚拟位置为null");
        w0();
    }

    private final void d0() {
        this.f14623d.observe(this, new k(new b()));
        this.f14624e.observe(this, new k(new c()));
        Z().d().observe(this, new k(new d()));
        Z().c().observe(this, new k(new e()));
    }

    private final void e0() {
        final ActivityMapBinding activityMapBinding = this.f14621b;
        if (activityMapBinding == null) {
            l0.S("binding");
            activityMapBinding = null;
        }
        activityMapBinding.rvResult.setVisibility(8);
        activityMapBinding.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.m0(MapActivity.this, view);
            }
        });
        activityMapBinding.tvHistory.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.n0(MapActivity.this, view);
            }
        });
        if (this.f14625f == null) {
            AddressAdapter addressAdapter = new AddressAdapter(this.f14626g);
            addressAdapter.e(this);
            this.f14625f = addressAdapter;
            RecyclerView recyclerView = activityMapBinding.rvResult;
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            l0.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(this.f14625f);
        }
        AppCompatEditText etSearch = activityMapBinding.etSearch;
        l0.o(etSearch, "etSearch");
        ImageView ivClear = activityMapBinding.ivClear;
        l0.o(ivClear, "ivClear");
        q0(etSearch, ivClear, new g());
        AppCompatEditText etLat = activityMapBinding.etLat;
        l0.o(etLat, "etLat");
        ImageView ivLatClear = activityMapBinding.ivLatClear;
        l0.o(ivLatClear, "ivLatClear");
        q0(etLat, ivLatClear, h.INSTANCE);
        AppCompatEditText etLng = activityMapBinding.etLng;
        l0.o(etLng, "etLng");
        ImageView ivLngClear = activityMapBinding.ivLngClear;
        l0.o(ivLngClear, "ivLngClear");
        q0(etLng, ivLngClear, i.INSTANCE);
        activityMapBinding.ivClear.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.o0(MapActivity.this, activityMapBinding, view);
            }
        });
        activityMapBinding.ivLatClear.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.f0(MapActivity.this, activityMapBinding, view);
            }
        });
        activityMapBinding.ivLngClear.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.g0(MapActivity.this, activityMapBinding, view);
            }
        });
        activityMapBinding.ivSearchLatlng.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.h0(ActivityMapBinding.this, this, view);
            }
        });
        activityMapBinding.ivChangeSearch.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.i0(ActivityMapBinding.this, view);
            }
        });
        activityMapBinding.ivCloseVirtualLocation.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.j0(MapActivity.this, activityMapBinding, view);
            }
        });
        activityMapBinding.ivMyLocation.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.k0(MapActivity.this, view);
            }
        });
        activityMapBinding.btnMock.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.l0(MapActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(MapActivity this$0, ActivityMapBinding this_apply, View view) {
        l0.p(this$0, "this$0");
        l0.p(this_apply, "$this_apply");
        this$0.f14624e.setValue(Boolean.FALSE);
        this_apply.etLat.setText("");
        this_apply.etLat.requestFocus();
        this$0.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(MapActivity this$0, ActivityMapBinding this_apply, View view) {
        l0.p(this$0, "this$0");
        l0.p(this_apply, "$this_apply");
        this$0.f14624e.setValue(Boolean.FALSE);
        this_apply.etLng.setText("");
        this_apply.etLng.requestFocus();
        this$0.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(ActivityMapBinding this_apply, MapActivity this$0, View view) {
        boolean z4;
        l0.p(this_apply, "$this_apply");
        l0.p(this$0, "this$0");
        String valueOf = String.valueOf(this_apply.etLat.getText());
        boolean z5 = true;
        if (valueOf.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            f1.r("请输入纬度", 0, 2, null);
            return;
        }
        if (!f1.o(Double.parseDouble(valueOf))) {
            f1.r("请输入正确的纬度", 0, 2, null);
            return;
        }
        String valueOf2 = String.valueOf(this_apply.etLng.getText());
        if (valueOf2.length() != 0) {
            z5 = false;
        }
        if (z5) {
            f1.r("请输入经度", 0, 2, null);
        } else if (!f1.p(Double.parseDouble(valueOf2))) {
            f1.r("请输入正确的经度", 0, 2, null);
        } else {
            this$0.Z().g(valueOf, valueOf2, new f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(ActivityMapBinding this_apply, View view) {
        l0.p(this_apply, "$this_apply");
        if (this_apply.laySearchCity.getVisibility() == 0) {
            this_apply.laySearchCity.setVisibility(8);
            this_apply.laySearchLatlon.setVisibility(0);
            this_apply.etSearch.setText("");
        } else {
            this_apply.laySearchLatlon.setVisibility(8);
            this_apply.laySearchCity.setVisibility(0);
            this_apply.etLat.setText("");
            this_apply.etLng.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(MapActivity this$0, ActivityMapBinding this_apply, View view) {
        l0.p(this$0, "this$0");
        l0.p(this_apply, "$this_apply");
        f1.r("位置保护已关闭", 0, 2, null);
        VirtualCore.get().killApp(this$0.f14628i, this$0.f14630k);
        VirtualLocationManager.get().setMode(this$0.f14630k, this$0.f14628i, 0);
        VirtualLocationManager.get().setLocation(this$0.f14630k, this$0.f14628i, this$0.f14631l);
        this_apply.ivCloseVirtualLocation.setVisibility(8);
        this_apply.tvCloseVirtualLocation.setVisibility(8);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(MapActivity this$0, View view) {
        l0.p(this$0, "this$0");
        f1.r("正在定位当前位置...", 0, 2, null);
        this$0.w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(MapActivity this$0, View view) {
        double d5;
        l0.p(this$0, "this$0");
        if (this$0.f14632m == null) {
            f1.r("请先选择一个位置", 0, 2, null);
            return;
        }
        MapViewModel Z = this$0.Z();
        String str = this$0.f14627h;
        String str2 = this$0.f14628i;
        String str3 = this$0.f14629j;
        VLocation vLocation = this$0.f14631l;
        double d6 = 0.0d;
        if (vLocation != null) {
            d5 = vLocation.latitude;
        } else {
            d5 = 0.0d;
        }
        if (vLocation != null) {
            d6 = vLocation.longitude;
        }
        Z.e(new v2.c(0, str, str2, str3, d5, d6, new Date(), 1, null));
        f1.r("地址已保存！", 0, 2, null);
        this$0.Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(MapActivity this$0, View view) {
        l0.p(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(MapActivity this$0, View view) {
        l0.p(this$0, "this$0");
        this$0.startActivityForResult(new Intent(this$0, (Class<?>) HistoryActivity.class), this$0.f14635p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(MapActivity this$0, ActivityMapBinding this_apply, View view) {
        l0.p(this$0, "this$0");
        l0.p(this_apply, "$this_apply");
        this$0.f14624e.setValue(Boolean.FALSE);
        this_apply.etSearch.setText("");
        this_apply.etSearch.requestFocus();
        this$0.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(MapActivity this$0, Location location) {
        l0.p(this$0, "this$0");
        l0.p(location, "location");
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        Log.d(this$0.f14620a, "onLocationChanged: " + latitude + ", " + longitude);
        this$0.X(new GeoPoint(latitude, longitude));
        this$0.x0();
    }

    private final void q0(AppCompatEditText appCompatEditText, ImageView imageView, v3.l<? super String, r2> lVar) {
        appCompatEditText.addTextChangedListener(new l(imageView, lVar));
    }

    private final void r0(boolean z4) {
        this.f14639t.setValue(this, f14618v[0], Boolean.valueOf(z4));
    }

    private final void s0() {
        int p32;
        int p33;
        int p34;
        int p35;
        int p36;
        int p37;
        DialogBaseTipBinding inflate = DialogBaseTipBinding.inflate(LayoutInflater.from(this));
        l0.o(inflate, "inflate(...)");
        final com.yuanqi.master.tools.dialog.b b5 = new b.a(this).a().k(inflate.getRoot()).i(true).t(c1.f15065a.c(this, 300.0f), -2).b();
        SpannableString spannableString = new SpannableString("请注意：\n1. 为保证该功能正常使用，建议您将 元气多开 及需要 多开的原应用 位置权限设置为 始终允许；\n2. 调整位置后，再启动分身应用，若位置信息未生效，可尝试后台关闭分身应用，再次启动更新位置信息。");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(this, R.color.holo_red_dark));
        p32 = f0.p3("请注意：\n1. 为保证该功能正常使用，建议您将 元气多开 及需要 多开的原应用 位置权限设置为 始终允许；\n2. 调整位置后，再启动分身应用，若位置信息未生效，可尝试后台关闭分身应用，再次启动更新位置信息。", "元气多开", 0, false, 6, null);
        p33 = f0.p3("请注意：\n1. 为保证该功能正常使用，建议您将 元气多开 及需要 多开的原应用 位置权限设置为 始终允许；\n2. 调整位置后，再启动分身应用，若位置信息未生效，可尝试后台关闭分身应用，再次启动更新位置信息。", "元气多开", 0, false, 6, null);
        spannableString.setSpan(foregroundColorSpan, p32, p33 + 4, 0);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(ContextCompat.getColor(this, R.color.holo_red_dark));
        p34 = f0.p3("请注意：\n1. 为保证该功能正常使用，建议您将 元气多开 及需要 多开的原应用 位置权限设置为 始终允许；\n2. 调整位置后，再启动分身应用，若位置信息未生效，可尝试后台关闭分身应用，再次启动更新位置信息。", "多开的原应用", 0, false, 6, null);
        p35 = f0.p3("请注意：\n1. 为保证该功能正常使用，建议您将 元气多开 及需要 多开的原应用 位置权限设置为 始终允许；\n2. 调整位置后，再启动分身应用，若位置信息未生效，可尝试后台关闭分身应用，再次启动更新位置信息。", "多开的原应用", 0, false, 6, null);
        spannableString.setSpan(foregroundColorSpan2, p34, p35 + 6, 0);
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(ContextCompat.getColor(this, R.color.holo_red_dark));
        p36 = f0.p3("请注意：\n1. 为保证该功能正常使用，建议您将 元气多开 及需要 多开的原应用 位置权限设置为 始终允许；\n2. 调整位置后，再启动分身应用，若位置信息未生效，可尝试后台关闭分身应用，再次启动更新位置信息。", "始终允许", 0, false, 6, null);
        p37 = f0.p3("请注意：\n1. 为保证该功能正常使用，建议您将 元气多开 及需要 多开的原应用 位置权限设置为 始终允许；\n2. 调整位置后，再启动分身应用，若位置信息未生效，可尝试后台关闭分身应用，再次启动更新位置信息。", "始终允许", 0, false, 6, null);
        spannableString.setSpan(foregroundColorSpan3, p36, p37 + 4, 0);
        inflate.tvTitle.setText(getString(R.string.warn_tip));
        inflate.tvContent.setText(spannableString);
        inflate.tvContent.setTextSize(16.0f);
        inflate.btnRefuse.setVisibility(4);
        inflate.btnConfirm.setText(getString(R.string.i_know));
        inflate.ivClose.setVisibility(0);
        inflate.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.t0(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        inflate.btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.location.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapActivity.u0(com.yuanqi.master.tools.dialog.b.this, view);
            }
        });
        b5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yuanqi.master.location.h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MapActivity.v0(MapActivity.this, dialogInterface);
            }
        });
        b5.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(com.yuanqi.master.tools.dialog.b bVar, View view) {
        bVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(MapActivity this$0, DialogInterface dialogInterface) {
        l0.p(this$0, "this$0");
        this$0.r0(false);
    }

    private final void w0() {
        if (!this.f14638s) {
            LocationManager locationManager = this.f14637r;
            if (locationManager == null) {
                l0.S("locationManager");
                locationManager = null;
            }
            locationManager.requestLocationUpdates("network", 0L, 0.0f, this.f14640u);
            this.f14638s = !this.f14638s;
        }
    }

    private final void x0() {
        if (this.f14638s) {
            LocationManager locationManager = this.f14637r;
            if (locationManager == null) {
                l0.S("locationManager");
                locationManager = null;
            }
            locationManager.removeUpdates(this.f14640u);
            this.f14638s = !this.f14638s;
        }
    }

    @Override // com.yuanqi.master.tools.z0
    public void a(@p4.m View view, int i5) {
        CustomAddress customAddress = this.f14626g.get(i5);
        X(new GeoPoint(customAddress.getLat(), customAddress.getLng()));
        this.f14624e.setValue(Boolean.FALSE);
        b0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@p4.m Bundle bundle) {
        TraceManager.startActivityTrace(MapActivity.class.getName());
        super.onCreate(bundle);
        ActivityMapBinding inflate = ActivityMapBinding.inflate(getLayoutInflater());
        l0.o(inflate, "inflate(...)");
        this.f14621b = inflate;
        if (inflate == null) {
            l0.S("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        Object systemService = getSystemService(Headers.LOCATION);
        l0.n(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.f14637r = (LocationManager) systemService;
        String stringExtra = getIntent().getStringExtra(com.yuanqi.group.c.f13762p);
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f14627h = stringExtra;
        String stringExtra2 = getIntent().getStringExtra(com.yuanqi.group.c.f13763q);
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f14628i = str;
        this.f14630k = getIntent().getIntExtra(com.yuanqi.group.c.f13764r, -1);
        c0();
        e0();
        d0();
        if (a0()) {
            s0();
        }
        AppInstrumentation.onActivityCreateEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ActivityMapBinding activityMapBinding = this.f14621b;
        if (activityMapBinding == null) {
            l0.S("binding");
            activityMapBinding = null;
        }
        activityMapBinding.map.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(MapActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(MapActivity.class.getName());
        super.onResume();
        ActivityMapBinding activityMapBinding = this.f14621b;
        if (activityMapBinding == null) {
            l0.S("binding");
            activityMapBinding = null;
        }
        activityMapBinding.map.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(MapActivity.class.getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
