package com.yuanqi.master.main;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Environment;
import android.provider.Settings;
import android.view.Menu;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.client.stub.ExtLaunchAppActivity;
import com.lody.virtual.client.stub.RequestExternalStorageManagerActivity;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.open.MultiAppHelper;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.remote.VAppInstallerResult;
import com.lody.virtual.server.extension.VExtPackageAccessor;
import com.yqtech.multiapp.R;
import com.yuanqi.group.home.models.AppInfoLite;
import com.yuanqi.master.database.AppDataBase;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jonathanfinerty.once.Once;
import kotlin.collections.e0;
import kotlin.d0;
import kotlin.e1;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 H2\u00020\u0001:\u0002GHB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/H\u0007J\u0006\u00100\u001a\u00020*J\u000e\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020\u0005J\u000e\u00103\u001a\u00020*2\u0006\u00102\u001a\u00020\u0005J\b\u00104\u001a\u00020*H\u0002J\u0012\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000106J\u0012\u00108\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u00109\u001a\u00020*2\u0006\u0010.\u001a\u00020/J\u0016\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u000206J\u0018\u0010=\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u00010\u0005J \u0010=\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\u0006\u0010>\u001a\u00020?2\u0006\u00107\u001a\u000206H\u0002J\u0016\u0010@\u001a\u00020*2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001fJ\u0006\u0010D\u001a\u00020*J\u000e\u0010E\u001a\u00020*2\u0006\u0010F\u001a\u00020\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u0019\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001d¨\u0006I"}, d2 = {"Lcom/yuanqi/master/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "appList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/yuanqi/group/home/models/AppData;", "getAppList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "appNoteDao", "Lcom/yuanqi/master/database/dao/AppNoteDao;", "getAppNoteDao", "()Lcom/yuanqi/master/database/dao/AppNoteDao;", "appNoteList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/yuanqi/master/database/model/AppNote;", "getAppNoteList", "()Landroidx/lifecycle/MutableLiveData;", "setAppNoteList", "(Landroidx/lifecycle/MutableLiveData;)V", "gridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getGridState", "()Landroidx/compose/foundation/lazy/grid/LazyGridState;", "mRepo", "Lcom/yuanqi/group/home/repo/AppRepository;", "selectAppdata", "Landroidx/compose/runtime/MutableState;", "getSelectAppdata", "()Landroidx/compose/runtime/MutableState;", "showGuide", "", "getShowGuide", "showLoading", "getShowLoading", "showOverlayPermissionDialog", "getShowOverlayPermissionDialog", "showPermissionDialog", "getShowPermissionDialog", "showPopMenu", "getShowPopMenu", "addApp", "", "info", "Lcom/yuanqi/group/home/models/AppInfoLite;", "checkExtPackageBootPermission", "mActivity", "Landroid/app/Activity;", "dataChanged", "deleteApp", "data", "deleteAppNote", "getAllAppNote", "getLabel", "", TTDownloadField.TT_PACKAGE_NAME, "handleLoadingApp", "initViewModel", "insertAppNote", "appData", "note", "launchApp", "userId", "", "setIconEnable", "menu", "Landroid/view/Menu;", "enable", "start", "updateAppNote", "appNote", "AddResult", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/yuanqi/master/main/MainViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,436:1\n288#2,2:437\n288#2,2:439\n1#3:441\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/yuanqi/master/main/MainViewModel\n*L\n314#1:437,2\n317#1:439,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MainViewModel extends ViewModel {

    /* renamed from: l, reason: collision with root package name */
    @p4.l
    public static final c f14676l = new c(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f14677m = 8;

    /* renamed from: n, reason: collision with root package name */
    @p4.l
    private static final d0<MainViewModel> f14678n;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final LazyGridState f14679a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final MutableState<com.yuanqi.group.home.models.b> f14680b;

    /* renamed from: c, reason: collision with root package name */
    private t2.f f14681c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14682d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14683e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14684f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14685g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private final MutableState<Boolean> f14686h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private final SnapshotStateList<com.yuanqi.group.home.models.b> f14687i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private final com.yuanqi.master.database.dao.c f14688j;

    /* renamed from: k, reason: collision with root package name */
    @p4.l
    private MutableLiveData<List<v2.b>> f14689k;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yuanqi/master/main/MainViewModel$AddResult;", "", "(Lcom/yuanqi/master/main/MainViewModel;)V", "appData", "Lcom/yuanqi/group/home/models/PackageAppData;", "getAppData", "()Lcom/yuanqi/group/home/models/PackageAppData;", "setAppData", "(Lcom/yuanqi/group/home/models/PackageAppData;)V", "userId", "", "getUserId", "()I", "setUserId", "(I)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @p4.m
        private com.yuanqi.group.home.models.i f14690a;

        /* renamed from: b, reason: collision with root package name */
        private int f14691b;

        public a() {
        }

        @p4.m
        public final com.yuanqi.group.home.models.i a() {
            return this.f14690a;
        }

        public final int b() {
            return this.f14691b;
        }

        public final void c(@p4.m com.yuanqi.group.home.models.i iVar) {
            this.f14690a = iVar;
        }

        public final void d(int i5) {
            this.f14691b = i5;
        }
    }

    @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yuanqi/master/main/MainViewModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class b extends n0 implements v3.a<MainViewModel> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final MainViewModel invoke() {
            return new MainViewModel(null);
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/main/MainViewModel$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/main/MainViewModel;", "getInstance", "()Lcom/yuanqi/master/main/MainViewModel;", "instance$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(w wVar) {
            this();
        }

        @p4.l
        public final MainViewModel a() {
            return (MainViewModel) MainViewModel.f14678n.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.main.MainViewModel$deleteAppNote$1", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ com.yuanqi.group.home.models.b $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.yuanqi.group.home.models.b bVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.$data = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new d(this.$data, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                com.yuanqi.master.database.dao.c H = MainViewModel.this.H();
                String packageName = this.$data.getPackageName();
                l0.o(packageName, "getPackageName(...)");
                H.f(packageName, this.$data.getUserId());
                MainViewModel.this.I().postValue(MainViewModel.this.H().getAll());
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.main.MainViewModel$getAllAppNote$1", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new e(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                MainViewModel.this.I().postValue(MainViewModel.this.H().getAll());
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.main.MainViewModel$insertAppNote$1", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class f extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ com.yuanqi.group.home.models.b $appData;
        final /* synthetic */ String $note;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.yuanqi.group.home.models.b bVar, String str, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.$appData = bVar;
            this.$note = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new f(this.$appData, this.$note, dVar);
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
                com.yuanqi.master.database.dao.c H = MainViewModel.this.H();
                v2.b bVar = new v2.b();
                com.yuanqi.group.home.models.b bVar2 = this.$appData;
                String str = this.$note;
                String packageName = bVar2.getPackageName();
                l0.o(packageName, "getPackageName(...)");
                bVar.setPackageName(packageName);
                bVar.setUserId(bVar2.getUserId());
                bVar.setNoteName(str);
                H.d(bVar);
                MainViewModel.this.I().postValue(MainViewModel.this.H().getAll());
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.main.MainViewModel$updateAppNote$1", f = "MainViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class g extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v2.b $appNote;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(v2.b bVar, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.$appNote = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new g(this.$appNote, dVar);
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
                MainViewModel.this.H().e(this.$appNote);
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        d0<MainViewModel> b5;
        b5 = f0.b(h0.SYNCHRONIZED, b.INSTANCE);
        f14678n = b5;
    }

    private MainViewModel() {
        MutableState<com.yuanqi.group.home.models.b> mutableStateOf$default;
        MutableState<Boolean> mutableStateOf$default2;
        MutableState<Boolean> mutableStateOf$default3;
        MutableState<Boolean> mutableStateOf$default4;
        MutableState<Boolean> mutableStateOf$default5;
        MutableState<Boolean> mutableStateOf$default6;
        List<v2.b> E;
        this.f14679a = new LazyGridState(0, 0, 3, null);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f14680b = mutableStateOf$default;
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f14682d = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f14683e = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f14684f = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f14685g = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f14686h = mutableStateOf$default6;
        this.f14687i = SnapshotStateKt.mutableStateListOf();
        AppDataBase d5 = com.yuanqi.master.database.a.f14574b.a().d();
        l0.m(d5);
        this.f14688j = d5.b();
        MutableLiveData<List<v2.b>> mutableLiveData = new MutableLiveData<>();
        E = kotlin.collections.w.E();
        mutableLiveData.setValue(E);
        this.f14689k = mutableLiveData;
    }

    public /* synthetic */ MainViewModel(w wVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(MainViewModel this$0, List list) {
        l0.p(this$0, "this$0");
        this$0.f14685g.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(MainViewModel this$0, com.yuanqi.group.home.models.b data) {
        l0.p(this$0, "this$0");
        l0.p(data, "$data");
        t2.f fVar = this$0.f14681c;
        if (fVar == null) {
            l0.S("mRepo");
            fVar = null;
        }
        fVar.c(data.getPackageName(), data.getUserId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(MainViewModel this$0, com.yuanqi.group.home.models.b data, Void r22) {
        l0.p(this$0, "this$0");
        l0.p(data, "$data");
        this$0.E(data);
    }

    private final void F() {
        kotlinx.coroutines.k.f(ViewModelKt.getViewModelScope(this), k1.c(), null, new e(null), 2, null);
    }

    private final void R(final com.yuanqi.group.home.models.b bVar) {
        com.yuanqi.group.abs.ui.b.a().g(new Runnable() { // from class: com.yuanqi.master.main.g
            @Override // java.lang.Runnable
            public final void run() {
                MainViewModel.S();
            }
        }).d(new org.jdeferred.g() { // from class: com.yuanqi.master.main.h
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                MainViewModel.T(com.yuanqi.group.home.models.b.this, (Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S() {
        long currentTimeMillis = System.currentTimeMillis() - System.currentTimeMillis();
        if (currentTimeMillis < 1500) {
            try {
                Thread.sleep(1500 - currentTimeMillis);
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(com.yuanqi.group.home.models.b bVar, Void r32) {
        if (bVar instanceof com.yuanqi.group.home.models.i) {
            com.yuanqi.group.home.models.i iVar = (com.yuanqi.group.home.models.i) bVar;
            iVar.isLoading = false;
            iVar.isFirstOpen = true;
        } else if (bVar instanceof com.yuanqi.group.home.models.h) {
            com.yuanqi.group.home.models.h hVar = (com.yuanqi.group.home.models.h) bVar;
            hVar.isLoading = false;
            hVar.isFirstOpen = true;
        }
    }

    private final void W(Activity activity, int i5, String str) {
        if (VirtualCore.get().isRunInExtProcess(str)) {
            if (!VirtualCore.get().isExtPackageInstalled()) {
                Toast.makeText(activity, R.string.ext_package_mgs, 0).show();
                return;
            }
            if (!VExtPackageAccessor.hasExtPackageBootPermission()) {
                Toast.makeText(activity, R.string.permission_boot_content, 0).show();
                return;
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(StubManifest.EXT_PACKAGE_NAME, ExtLaunchAppActivity.class.getName()));
            intent.addFlags(268435456);
            intent.putExtra("_VA_|_userid_", i5);
            intent.putExtra("_VA_|_package_", str);
            activity.startActivity(intent);
            return;
        }
        VActivityManager.get().launchApp(i5, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(boolean z4, DialogInterface dialogInterface, int i5) {
        RequestExternalStorageManagerActivity.request(VirtualCore.get().getContext(), z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(AppInfoLite appInfoLite, MainViewModel this$0, List addResults) {
        boolean z4;
        l0.p(this$0, "this$0");
        l0.p(addResults, "$addResults");
        l0.m(appInfoLite);
        int i5 = appInfoLite.f14009g;
        for (int i6 = 0; i6 < i5; i6++) {
            a aVar = new a();
            InstalledAppInfo installedAppInfo = VirtualCore.get().getInstalledAppInfo(appInfoLite.f14003a, 0);
            if (installedAppInfo != null) {
                aVar.d(MultiAppHelper.installExistedPackage(installedAppInfo));
            } else {
                t2.f fVar = this$0.f14681c;
                if (fVar == null) {
                    l0.S("mRepo");
                    fVar = null;
                }
                VAppInstallerResult d5 = fVar.d(appInfoLite);
                if (d5.status == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalStateException(("error code: " + d5.status).toString());
                }
            }
            aVar.c(t2.i.d().e(appInfoLite.f14003a));
            addResults.add(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(MainViewModel this$0, Throwable e5) {
        l0.p(this$0, "this$0");
        l0.p(e5, "e");
        e5.printStackTrace();
        this$0.f14685g.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(List addResults, MainViewModel this$0, Void r5) {
        l0.p(addResults, "$addResults");
        l0.p(this$0, "this$0");
        ArrayList arrayList = new ArrayList();
        Iterator it = addResults.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.b() == 0) {
                com.yuanqi.group.home.models.i a5 = aVar.a();
                this$0.R(a5);
                l0.m(a5);
                arrayList.add(a5);
            } else {
                com.yuanqi.group.home.models.h hVar = new com.yuanqi.group.home.models.h(aVar.a(), aVar.b());
                this$0.R(hVar);
                arrayList.add(hVar);
            }
        }
        this$0.f14685g.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(DialogInterface dialogInterface, int i5) {
        RequestExternalStorageManagerActivity.request(VirtualCore.get().getContext(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(MainViewModel this$0, List appModels) {
        List r5;
        l0.p(this$0, "this$0");
        l0.p(appModels, "appModels");
        this$0.f14687i.clear();
        SnapshotStateList<com.yuanqi.group.home.models.b> snapshotStateList = this$0.f14687i;
        r5 = e0.r5(appModels, new Comparator() { // from class: com.yuanqi.master.main.q
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int y4;
                y4 = MainViewModel.y((com.yuanqi.group.home.models.b) obj, (com.yuanqi.group.home.models.b) obj2);
                return y4;
            }
        });
        snapshotStateList.addAll(r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int y(com.yuanqi.group.home.models.b bVar, com.yuanqi.group.home.models.b bVar2) {
        Object obj;
        Object obj2;
        if (l0.g(bVar.getPackageName(), bVar2.getPackageName())) {
            return l0.t(bVar.getUserId(), bVar2.getUserId());
        }
        Iterator<T> it = com.yuanqi.master.config.a.f14505g.a().h().getValue().iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (l0.g(bVar.getName(), ((com.yuanqi.master.config.e) obj2).a())) {
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
            if (l0.g(bVar2.getName(), ((com.yuanqi.master.config.e) next).a())) {
                obj = next;
                break;
            }
        }
        com.yuanqi.master.config.e eVar2 = (com.yuanqi.master.config.e) obj;
        if (eVar != null && eVar2 != null) {
            return l0.t(eVar.d(), eVar2.d());
        }
        String packageName = bVar.getPackageName();
        String packageName2 = bVar2.getPackageName();
        l0.o(packageName2, "getPackageName(...)");
        return packageName.compareTo(packageName2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(Throwable th) {
    }

    public final void B(@p4.l final com.yuanqi.group.home.models.b data) {
        l0.p(data, "data");
        this.f14687i.remove(data);
        com.yuanqi.group.abs.ui.b.a().g(new Runnable() { // from class: com.yuanqi.master.main.r
            @Override // java.lang.Runnable
            public final void run() {
                MainViewModel.C(MainViewModel.this, data);
            }
        }).d(new org.jdeferred.g() { // from class: com.yuanqi.master.main.f
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                MainViewModel.D(MainViewModel.this, data, (Void) obj);
            }
        });
    }

    public final void E(@p4.l com.yuanqi.group.home.models.b data) {
        l0.p(data, "data");
        kotlinx.coroutines.k.f(ViewModelKt.getViewModelScope(this), k1.c(), null, new d(data, null), 2, null);
    }

    @p4.l
    public final SnapshotStateList<com.yuanqi.group.home.models.b> G() {
        return this.f14687i;
    }

    @p4.l
    public final com.yuanqi.master.database.dao.c H() {
        return this.f14688j;
    }

    @p4.l
    public final MutableLiveData<List<v2.b>> I() {
        return this.f14689k;
    }

    @p4.l
    public final LazyGridState J() {
        return this.f14679a;
    }

    @p4.m
    public final String K(@p4.m String str) {
        t2.f fVar = this.f14681c;
        if (fVar == null) {
            l0.S("mRepo");
            fVar = null;
        }
        return fVar.a(str);
    }

    @p4.l
    public final MutableState<com.yuanqi.group.home.models.b> L() {
        return this.f14680b;
    }

    @p4.l
    public final MutableState<Boolean> M() {
        return this.f14682d;
    }

    @p4.l
    public final MutableState<Boolean> N() {
        return this.f14685g;
    }

    @p4.l
    public final MutableState<Boolean> O() {
        return this.f14684f;
    }

    @p4.l
    public final MutableState<Boolean> P() {
        return this.f14683e;
    }

    @p4.l
    public final MutableState<Boolean> Q() {
        return this.f14686h;
    }

    public final void U(@p4.l Activity mActivity) {
        l0.p(mActivity, "mActivity");
        this.f14681c = new t2.f(mActivity);
        F();
        b0();
    }

    public final void V(@p4.l com.yuanqi.group.home.models.b appData, @p4.l String note) {
        l0.p(appData, "appData");
        l0.p(note, "note");
        kotlinx.coroutines.k.f(ViewModelKt.getViewModelScope(this), k1.c(), null, new f(appData, note, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:3:0x0005, B:6:0x0015, B:39:0x003b, B:9:0x005a, B:12:0x0062, B:14:0x006a, B:17:0x0070, B:20:0x0078, B:25:0x0084, B:29:0x00ad, B:31:0x00b3, B:33:0x00c3, B:35:0x00d1, B:40:0x004d, B:42:0x0051), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(@p4.l android.app.Activity r12, @p4.m com.yuanqi.group.home.models.b r13) {
        /*
            r11 = this;
            java.lang.String r0 = "mActivity"
            kotlin.jvm.internal.l0.p(r12, r0)
            kotlin.jvm.internal.l0.m(r13)     // Catch: java.lang.Throwable -> Ld7
            int r0 = r13.getUserId()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r7 = r13.getPackageName()     // Catch: java.lang.Throwable -> Ld7
            r1 = -1
            if (r0 == r1) goto Ldb
            if (r7 == 0) goto Ldb
            com.lody.virtual.client.core.VirtualCore r1 = com.lody.virtual.client.core.VirtualCore.get()     // Catch: java.lang.Throwable -> Ld7
            com.lody.virtual.remote.InstalledAppInfo r1 = r1.getInstalledAppInfo(r7, r0)     // Catch: java.lang.Throwable -> Ld7
            android.content.pm.ApplicationInfo r2 = r1.getApplicationInfo(r0)     // Catch: java.lang.Throwable -> Ld7
            com.lody.virtual.client.core.VirtualCore r3 = com.lody.virtual.client.core.VirtualCore.get()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r4 = r1.packageName     // Catch: java.lang.Throwable -> Ld7
            boolean r3 = r3.isRunInExtProcess(r4)     // Catch: java.lang.Throwable -> Ld7
            com.lody.virtual.client.core.VirtualCore r4 = com.lody.virtual.client.core.VirtualCore.get()     // Catch: java.lang.Throwable -> Ld7
            android.content.pm.ApplicationInfo r4 = r4.getHostApplicationInfo()     // Catch: java.lang.Throwable -> Ld7
            int r4 = r4.targetSdkVersion     // Catch: java.lang.Throwable -> Ld7
            r5 = 30
            r6 = 1
            r8 = 0
            if (r3 == 0) goto L5a
            android.content.pm.PackageManager r9 = r12.getPackageManager()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> Ld7
            com.lody.virtual.client.core.SettingConfig r10 = com.lody.virtual.client.core.VirtualCore.getConfig()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> Ld7
            java.lang.String r10 = r10.getExtPackageName()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> Ld7
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r10, r8)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> Ld7
            int r4 = r9.targetSdkVersion     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> Ld7
        L4d:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Ld7
            if (r9 < r5) goto L56
            boolean r9 = r11.u(r12)     // Catch: java.lang.Throwable -> Ld7
            goto L57
        L56:
            r9 = r6
        L57:
            if (r9 == 0) goto L5a
            return
        L5a:
            boolean r9 = com.lody.virtual.helper.compat.BuildCompat.isR()     // Catch: java.lang.Throwable -> Ld7
            if (r9 == 0) goto Lad
            if (r4 < r5) goto Lad
            android.content.pm.ApplicationInfo r4 = r1.getApplicationInfo(r0)     // Catch: java.lang.Throwable -> Ld7
            int r4 = r4.targetSdkVersion     // Catch: java.lang.Throwable -> Ld7
            if (r4 >= r5) goto Lad
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Ld7
            if (r4 < r5) goto L81
            if (r3 == 0) goto L76
            boolean r4 = com.lody.virtual.server.extension.VExtPackageAccessor.isExternalStorageManager()     // Catch: java.lang.Throwable -> Ld7
            if (r4 == 0) goto L81
        L76:
            if (r3 != 0) goto L7f
            boolean r4 = com.lody.virtual.client.stub.b.a()     // Catch: java.lang.Throwable -> Ld7
            if (r4 != 0) goto L7f
            goto L81
        L7f:
            r4 = r8
            goto L82
        L81:
            r4 = r6
        L82:
            if (r4 == 0) goto Lad
            androidx.appcompat.app.AlertDialog$Builder r13 = new androidx.appcompat.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> Ld7
            r0 = 2131951958(0x7f130156, float:1.9540345E38)
            r13.<init>(r12, r0)     // Catch: java.lang.Throwable -> Ld7
            r12 = 2131886622(0x7f12021e, float:1.9407828E38)
            androidx.appcompat.app.AlertDialog$Builder r12 = r13.setTitle(r12)     // Catch: java.lang.Throwable -> Ld7
            r13 = 2131886655(0x7f12023f, float:1.9407895E38)
            androidx.appcompat.app.AlertDialog$Builder r12 = r12.setMessage(r13)     // Catch: java.lang.Throwable -> Ld7
            androidx.appcompat.app.AlertDialog$Builder r12 = r12.setCancelable(r8)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r13 = "GO"
            com.yuanqi.master.main.e r0 = new com.yuanqi.master.main.e     // Catch: java.lang.Throwable -> Ld7
            r0.<init>()     // Catch: java.lang.Throwable -> Ld7
            androidx.appcompat.app.AlertDialog$Builder r12 = r12.setNegativeButton(r13, r0)     // Catch: java.lang.Throwable -> Ld7
            r12.show()     // Catch: java.lang.Throwable -> Ld7
            return
        Lad:
            boolean r2 = com.lody.virtual.helper.compat.PermissionCompat.isCheckPermissionRequired(r2)     // Catch: java.lang.Throwable -> Ld7
            if (r2 == 0) goto Lcf
            com.lody.virtual.client.ipc.VPackageManager r2 = com.lody.virtual.client.ipc.VPackageManager.get()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Throwable -> Ld7
            java.lang.String[] r2 = r2.getDangerousPermissions(r1)     // Catch: java.lang.Throwable -> Ld7
            boolean r1 = com.lody.virtual.helper.compat.PermissionCompat.checkPermissions(r2, r3)     // Catch: java.lang.Throwable -> Ld7
            if (r1 != 0) goto Lcf
            java.lang.String r3 = r13.getName()     // Catch: java.lang.Throwable -> Ld7
            r6 = 6
            r1 = r12
            r4 = r0
            r5 = r7
            com.yuanqi.group.home.PermissionRequestActivity.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Ld7
            r6 = r8
        Lcf:
            if (r6 == 0) goto Ldb
            r13.isFirstOpen = r8     // Catch: java.lang.Throwable -> Ld7
            r11.W(r12, r0, r7)     // Catch: java.lang.Throwable -> Ld7
            goto Ldb
        Ld7:
            r12 = move-exception
            r12.printStackTrace()
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.main.MainViewModel.X(android.app.Activity, com.yuanqi.group.home.models.b):void");
    }

    public final void Z(@p4.l MutableLiveData<List<v2.b>> mutableLiveData) {
        l0.p(mutableLiveData, "<set-?>");
        this.f14689k = mutableLiveData;
    }

    public final void a0(@p4.l Menu menu, boolean z4) {
        l0.p(menu, "menu");
        try {
            Method declaredMethod = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(menu, Boolean.valueOf(z4));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public final void b0() {
        w();
        if (!Once.beenDone(com.yuanqi.group.c.f13748b)) {
            this.f14682d.setValue(Boolean.TRUE);
            Once.markDone(com.yuanqi.group.c.f13748b);
        }
    }

    public final void c0(@p4.l v2.b appNote) {
        l0.p(appNote, "appNote");
        kotlinx.coroutines.k.f(ViewModelKt.getViewModelScope(this), k1.c(), null, new g(appNote, null), 2, null);
    }

    public final void p(@p4.m final AppInfoLite appInfoLite) {
        final ArrayList arrayList = new ArrayList();
        this.f14685g.setValue(Boolean.TRUE);
        com.yuanqi.group.abs.ui.b.a().g(new Runnable() { // from class: com.yuanqi.master.main.m
            @Override // java.lang.Runnable
            public final void run() {
                MainViewModel.q(AppInfoLite.this, this, arrayList);
            }
        }).a(new org.jdeferred.g() { // from class: com.yuanqi.master.main.n
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                MainViewModel.r((Void) obj);
            }
        }).p(new org.jdeferred.j() { // from class: com.yuanqi.master.main.o
            @Override // org.jdeferred.j
            public final void onFail(Object obj) {
                MainViewModel.s(MainViewModel.this, (Throwable) obj);
            }
        }).d(new org.jdeferred.g() { // from class: com.yuanqi.master.main.p
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                MainViewModel.t(arrayList, this, (Void) obj);
            }
        });
    }

    @RequiresApi(api = 30)
    public final boolean u(@p4.l Activity mActivity) {
        boolean isExternalStorageManager;
        l0.p(mActivity, "mActivity");
        if (VirtualCore.get().isExtPackageInstalled()) {
            if (!VExtPackageAccessor.hasExtPackageBootPermission()) {
                this.f14683e.setValue(Boolean.TRUE);
                return true;
            }
            if (BuildCompat.isQ() && !Settings.canDrawOverlays(mActivity)) {
                this.f14684f.setValue(Boolean.TRUE);
                return true;
            }
        }
        if (VirtualCore.get().getTargetSdkVersion() >= 23 && ContextCompat.checkSelfPermission(mActivity, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(mActivity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
            return true;
        }
        if (BuildCompat.isR() && mActivity.getApplicationInfo().targetSdkVersion >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                new AlertDialog.Builder(mActivity, R.style.MyDialogTheme).setTitle(R.string.permission_boot_notice).setMessage(R.string.scan_files_request_all_file_access_permissions).setCancelable(false).setNegativeButton("GO", new DialogInterface.OnClickListener() { // from class: com.yuanqi.master.main.i
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        MainViewModel.v(dialogInterface, i5);
                    }
                }).show();
                return true;
            }
        }
        return false;
    }

    public final void w() {
        this.f14685g.setValue(Boolean.TRUE);
        t2.f fVar = this.f14681c;
        if (fVar == null) {
            l0.S("mRepo");
            fVar = null;
        }
        fVar.f().d(new org.jdeferred.g() { // from class: com.yuanqi.master.main.j
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                MainViewModel.x(MainViewModel.this, (List) obj);
            }
        }).p(new org.jdeferred.j() { // from class: com.yuanqi.master.main.k
            @Override // org.jdeferred.j
            public final void onFail(Object obj) {
                MainViewModel.z((Throwable) obj);
            }
        }).d(new org.jdeferred.g() { // from class: com.yuanqi.master.main.l
            @Override // org.jdeferred.g
            public final void a(Object obj) {
                MainViewModel.A(MainViewModel.this, (List) obj);
            }
        });
    }
}
