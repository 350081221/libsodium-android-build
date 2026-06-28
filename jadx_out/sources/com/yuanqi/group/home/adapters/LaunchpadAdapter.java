package com.yuanqi.group.home.adapters;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.yqtech.multiapp.databinding.ItemLauncherAppBigPreviewBinding;
import com.yqtech.multiapp.databinding.ItemLauncherAppBinding;
import com.yqtech.multiapp.databinding.ItemLauncherAppPreviewBinding;
import com.yuanqi.group.home.HomeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000501234B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\bH\u0017J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002J\u0016\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\bJ\u001a\u0010!\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\b2\n\u0010\"\u001a\u00060#R\u00020\u0000J\u000e\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u000eJ\u000e\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u000eJ\u0010\u0010(\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010)\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010*\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001e\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", com.umeng.analytics.pro.d.X, "Landroid/app/Activity;", "homeViewModel", "Lcom/yuanqi/group/home/HomeViewModel;", "viewType", "", "(Landroid/app/Activity;Lcom/yuanqi/group/home/HomeViewModel;I)V", "TAG", "", "list", "", "Lcom/yuanqi/group/home/models/AppData;", "getList", "()Ljava/util/List;", "mAppClickListener", "Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$OnAppClickListener;", "mList", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onItemClick", "onItemLongPress", "itemView", "Landroid/view/View;", "onSelected", "viewHolder", "Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolder;", "refresh", "model", "remove", "data", "setAppClickListener", "setItemViewType", "setList", "setPreviewData", "pid", TTDownloadField.TT_PACKAGE_NAME, "bitmap", "Landroid/graphics/Bitmap;", "Companion", "OnAppClickListener", "ViewHolder", "ViewHolderBigPreview", "ViewHolderPreview", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLaunchpadAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchpadAdapter.kt\ncom/yuanqi/group/home/adapters/LaunchpadAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,489:1\n766#2:490\n857#2,2:491\n766#2:493\n857#2,2:494\n1855#2,2:496\n766#2:498\n857#2,2:499\n766#2:501\n857#2,2:502\n766#2:504\n857#2,2:505\n*S KotlinDebug\n*F\n+ 1 LaunchpadAdapter.kt\ncom/yuanqi/group/home/adapters/LaunchpadAdapter\n*L\n257#1:490\n257#1:491,2\n395#1:493\n395#1:494,2\n447#1:496,2\n115#1:498\n115#1:499,2\n153#1:501\n153#1:502,2\n203#1:504\n203#1:505,2\n*E\n"})
/* loaded from: classes3.dex */
public final class LaunchpadAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: h, reason: collision with root package name */
    @l
    public static final a f13872h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f13873i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f13874j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f13875k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f13876l = 3;

    /* renamed from: b, reason: collision with root package name */
    @m
    private final Activity f13877b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final HomeViewModel f13878c;

    /* renamed from: d, reason: collision with root package name */
    private int f13879d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final String f13880e;

    /* renamed from: f, reason: collision with root package name */
    @m
    private List<com.yuanqi.group.home.models.b> f13881f;

    /* renamed from: g, reason: collision with root package name */
    @m
    private b f13882g;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/yqtech/multiapp/databinding/ItemLauncherAppBinding;", "(Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;Lcom/yqtech/multiapp/databinding/ItemLauncherAppBinding;)V", "getBinding", "()Lcom/yqtech/multiapp/databinding/ItemLauncherAppBinding;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final ItemLauncherAppBinding f13883a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LaunchpadAdapter f13884b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@l LaunchpadAdapter launchpadAdapter, ItemLauncherAppBinding binding) {
            super(binding.getRoot());
            l0.p(binding, "binding");
            this.f13884b = launchpadAdapter;
            this.f13883a = binding;
        }

        @l
        public final ItemLauncherAppBinding a() {
            return this.f13883a;
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolderBigPreview;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/yqtech/multiapp/databinding/ItemLauncherAppBigPreviewBinding;", "(Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;Lcom/yqtech/multiapp/databinding/ItemLauncherAppBigPreviewBinding;)V", "getBinding", "()Lcom/yqtech/multiapp/databinding/ItemLauncherAppBigPreviewBinding;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class ViewHolderBigPreview extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final ItemLauncherAppBigPreviewBinding f13885a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LaunchpadAdapter f13886b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderBigPreview(@l LaunchpadAdapter launchpadAdapter, ItemLauncherAppBigPreviewBinding binding) {
            super(binding.getRoot());
            l0.p(binding, "binding");
            this.f13886b = launchpadAdapter;
            this.f13885a = binding;
        }

        @l
        public final ItemLauncherAppBigPreviewBinding a() {
            return this.f13885a;
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$ViewHolderPreview;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;", "(Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;)V", "getBinding", "()Lcom/yqtech/multiapp/databinding/ItemLauncherAppPreviewBinding;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class ViewHolderPreview extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final ItemLauncherAppPreviewBinding f13887a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LaunchpadAdapter f13888b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolderPreview(@l LaunchpadAdapter launchpadAdapter, ItemLauncherAppPreviewBinding binding) {
            super(binding.getRoot());
            l0.p(binding, "binding");
            this.f13888b = launchpadAdapter;
            this.f13887a = binding;
        }

        @l
        public final ItemLauncherAppPreviewBinding a() {
            return this.f13887a;
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$Companion;", "", "()V", "VIEW_TYPE_1", "", "VIEW_TYPE_2", "VIEW_TYPE_3", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J8\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&J8\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&¨\u0006\u0015"}, d2 = {"Lcom/yuanqi/group/home/adapters/LaunchpadAdapter$OnAppClickListener;", "", "onAppClick", "", "position", "", "model", "Lcom/yuanqi/group/home/models/AppData;", "noteApp", "Lcom/yuanqi/master/database/model/AppNote;", "mList", "", "onAppError", "msg", "", "onAppLongPress", "itemView", "Landroid/view/View;", "appData", "onAppOtherClick", "view", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface b {
        void a(@l String str);

        void b(int i5, @l com.yuanqi.group.home.models.b bVar, @m v2.b bVar2, @l List<com.yuanqi.group.home.models.b> list);

        void c(int i5, @l View view, @l com.yuanqi.group.home.models.b bVar, @m v2.b bVar2, @l List<com.yuanqi.group.home.models.b> list);

        void d(int i5, @l View view, @l com.yuanqi.group.home.models.b bVar, @m v2.b bVar2, @l List<com.yuanqi.group.home.models.b> list);
    }

    public LaunchpadAdapter(@m Activity activity, @l HomeViewModel homeViewModel, int i5) {
        l0.p(homeViewModel, "homeViewModel");
        this.f13877b = activity;
        this.f13878c = homeViewModel;
        this.f13879d = i5;
        this.f13880e = "LaunchpadAdapter";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(com.yuanqi.group.home.models.b info, LaunchpadAdapter this$0, View view) {
        List<com.yuanqi.group.home.models.b> V5;
        l0.p(info, "$info");
        l0.p(this$0, "this$0");
        view.setSelected(!view.isSelected());
        info.isSelect = view.isSelected();
        List<com.yuanqi.group.home.models.b> list = this$0.f13881f;
        l0.m(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.yuanqi.group.home.models.b) obj).isSelect) {
                arrayList.add(obj);
            }
        }
        Log.d(this$0.f13880e, "list size ==" + arrayList.size());
        MutableLiveData<List<com.yuanqi.group.home.models.b>> H = this$0.f13878c.H();
        V5 = e0.V5(arrayList);
        H.postValue(V5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(LaunchpadAdapter this$0, int i5, com.yuanqi.group.home.models.b info, v2.b bVar, View view) {
        l0.p(this$0, "this$0");
        l0.p(info, "$info");
        b bVar2 = this$0.f13882g;
        if (bVar2 != null) {
            l0.m(view);
            List<com.yuanqi.group.home.models.b> list = this$0.f13881f;
            l0.m(list);
            bVar2.d(i5, view, info, bVar, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(com.yuanqi.group.home.models.b info, LaunchpadAdapter this$0, View view) {
        List<com.yuanqi.group.home.models.b> V5;
        l0.p(info, "$info");
        l0.p(this$0, "this$0");
        view.setSelected(!view.isSelected());
        info.isSelect = view.isSelected();
        List<com.yuanqi.group.home.models.b> list = this$0.f13881f;
        l0.m(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.yuanqi.group.home.models.b) obj).isSelect) {
                arrayList.add(obj);
            }
        }
        Log.d(this$0.f13880e, "list size ==" + arrayList.size());
        MutableLiveData<List<com.yuanqi.group.home.models.b>> H = this$0.f13878c.H();
        V5 = e0.V5(arrayList);
        H.postValue(V5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(com.yuanqi.group.home.models.b info, LaunchpadAdapter this$0, View view) {
        List<com.yuanqi.group.home.models.b> V5;
        l0.p(info, "$info");
        l0.p(this$0, "this$0");
        view.setSelected(!view.isSelected());
        info.isSelect = view.isSelected();
        List<com.yuanqi.group.home.models.b> list = this$0.f13881f;
        l0.m(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.yuanqi.group.home.models.b) obj).isSelect) {
                arrayList.add(obj);
            }
        }
        Log.d(this$0.f13880e, "list size ==" + arrayList.size());
        MutableLiveData<List<com.yuanqi.group.home.models.b>> H = this$0.f13878c.H();
        V5 = e0.V5(arrayList);
        H.postValue(V5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(com.yuanqi.group.home.models.b info, RecyclerView.ViewHolder holder, LaunchpadAdapter this$0, int i5, v2.b bVar, View view) {
        l0.p(info, "$info");
        l0.p(holder, "$holder");
        l0.p(this$0, "this$0");
        info.isShowMask = false;
        ((ViewHolderPreview) holder).a().layMask.setVisibility(8);
        b bVar2 = this$0.f13882g;
        if (bVar2 != null) {
            List<com.yuanqi.group.home.models.b> list = this$0.f13881f;
            l0.m(list);
            bVar2.b(i5, info, bVar, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(com.yuanqi.group.home.models.b info, RecyclerView.ViewHolder holder, LaunchpadAdapter this$0, int i5, v2.b bVar, View view) {
        l0.p(info, "$info");
        l0.p(holder, "$holder");
        l0.p(this$0, "this$0");
        info.isShowMask = false;
        ((ViewHolderPreview) holder).a().layMask.setVisibility(8);
        b bVar2 = this$0.f13882g;
        if (bVar2 != null) {
            l0.m(view);
            List<com.yuanqi.group.home.models.b> list = this$0.f13881f;
            l0.m(list);
            bVar2.d(i5, view, info, bVar, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(com.yuanqi.group.home.models.b info, RecyclerView.ViewHolder holder, LaunchpadAdapter this$0, int i5, v2.b bVar, View view) {
        l0.p(info, "$info");
        l0.p(holder, "$holder");
        l0.p(this$0, "this$0");
        info.isShowMask = false;
        ((ViewHolderBigPreview) holder).a().layMask.setVisibility(8);
        b bVar2 = this$0.f13882g;
        if (bVar2 != null) {
            List<com.yuanqi.group.home.models.b> list = this$0.f13881f;
            l0.m(list);
            bVar2.b(i5, info, bVar, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(com.yuanqi.group.home.models.b info, RecyclerView.ViewHolder holder, LaunchpadAdapter this$0, int i5, v2.b bVar, View view) {
        l0.p(info, "$info");
        l0.p(holder, "$holder");
        l0.p(this$0, "this$0");
        info.isShowMask = false;
        ((ViewHolderBigPreview) holder).a().layMask.setVisibility(8);
        b bVar2 = this$0.f13882g;
        if (bVar2 != null) {
            l0.m(view);
            List<com.yuanqi.group.home.models.b> list = this$0.f13881f;
            l0.m(list);
            bVar2.d(i5, view, info, bVar, list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<com.yuanqi.group.home.models.b> list = this.f13881f;
        if (list == null) {
            return 0;
        }
        l0.m(list);
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i5) {
        return this.f13879d;
    }

    @m
    public final List<com.yuanqi.group.home.models.b> i() {
        return this.f13881f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(final int i5, @l final RecyclerView.ViewHolder holder) {
        boolean z4;
        List<com.yuanqi.group.home.models.b> V5;
        l0.p(holder, "holder");
        if (i5 >= 0) {
            List<com.yuanqi.group.home.models.b> list = this.f13881f;
            l0.m(list);
            if (i5 < list.size()) {
                List<com.yuanqi.group.home.models.b> list2 = this.f13881f;
                l0.m(list2);
                final com.yuanqi.group.home.models.b bVar = list2.get(i5);
                Boolean value = this.f13878c.A().getValue();
                l0.m(value);
                if (value.booleanValue()) {
                    bVar.isSelect = !bVar.isSelect;
                    if (holder instanceof ViewHolder) {
                        ((ViewHolder) holder).a().itemCheckbox.setSelected(bVar.isSelect);
                    } else if (holder instanceof ViewHolderPreview) {
                        ((ViewHolderPreview) holder).a().itemCheckbox.setSelected(bVar.isSelect);
                    } else if (holder instanceof ViewHolderBigPreview) {
                        ((ViewHolderBigPreview) holder).a().itemCheckbox.setSelected(bVar.isSelect);
                    }
                    List<com.yuanqi.group.home.models.b> list3 = this.f13881f;
                    l0.m(list3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list3) {
                        if (((com.yuanqi.group.home.models.b) obj).isSelect) {
                            arrayList.add(obj);
                        }
                    }
                    MutableLiveData<List<com.yuanqi.group.home.models.b>> H = this.f13878c.H();
                    V5 = e0.V5(arrayList);
                    H.postValue(V5);
                    return;
                }
                List<v2.b> value2 = this.f13878c.y().getValue();
                v2.b bVar2 = null;
                int i6 = 0;
                if (value2 != null) {
                    Iterator<T> it = value2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        v2.b bVar3 = (v2.b) next;
                        if (bVar3.getUserId() == bVar.getUserId() && l0.g(bVar3.getPackageName(), bVar.getPackageName())) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            bVar2 = next;
                            break;
                        }
                    }
                    bVar2 = bVar2;
                }
                final v2.b bVar4 = bVar2;
                if (holder instanceof ViewHolder) {
                    b bVar5 = this.f13882g;
                    if (bVar5 != null) {
                        List<com.yuanqi.group.home.models.b> list4 = this.f13881f;
                        l0.m(list4);
                        bVar5.b(i5, bVar, bVar4, list4);
                        return;
                    }
                    return;
                }
                if (holder instanceof ViewHolderPreview) {
                    bVar.isShowMask = !bVar.isShowMask;
                    ViewHolderPreview viewHolderPreview = (ViewHolderPreview) holder;
                    LinearLayout linearLayout = viewHolderPreview.a().layMask;
                    if (!bVar.isShowMask) {
                        i6 = 8;
                    }
                    linearLayout.setVisibility(i6);
                    viewHolderPreview.a().tvOpen.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.adapters.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LaunchpadAdapter.o(com.yuanqi.group.home.models.b.this, holder, this, i5, bVar4, view);
                        }
                    });
                    viewHolderPreview.a().tvManager.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.adapters.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LaunchpadAdapter.p(com.yuanqi.group.home.models.b.this, holder, this, i5, bVar4, view);
                        }
                    });
                    return;
                }
                if (holder instanceof ViewHolderBigPreview) {
                    bVar.isShowMask = !bVar.isShowMask;
                    ViewHolderBigPreview viewHolderBigPreview = (ViewHolderBigPreview) holder;
                    LinearLayout linearLayout2 = viewHolderBigPreview.a().layMask;
                    if (!bVar.isShowMask) {
                        i6 = 8;
                    }
                    linearLayout2.setVisibility(i6);
                    viewHolderBigPreview.a().tvOpen.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.adapters.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LaunchpadAdapter.q(com.yuanqi.group.home.models.b.this, holder, this, i5, bVar4, view);
                        }
                    });
                    viewHolderBigPreview.a().tvManager.setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.adapters.i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LaunchpadAdapter.r(com.yuanqi.group.home.models.b.this, holder, this, i5, bVar4, view);
                        }
                    });
                    return;
                }
                return;
            }
        }
        b bVar6 = this.f13882g;
        if (bVar6 != null) {
            bVar6.a("该应用未找到，请在清除缓存之后再进行尝试");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x029a, code lost:
    
        if (r11 == true) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        if (r11 == true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ac, code lost:
    
        if (r11 == true) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(@p4.l androidx.recyclerview.widget.RecyclerView.ViewHolder r10, final int r11) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.group.home.adapters.LaunchpadAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l
    public RecyclerView.ViewHolder onCreateViewHolder(@l ViewGroup parent, int i5) {
        l0.p(parent, "parent");
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    ItemLauncherAppBigPreviewBinding inflate = ItemLauncherAppBigPreviewBinding.inflate(LayoutInflater.from(parent.getContext()), null, false);
                    l0.o(inflate, "inflate(...)");
                    return new ViewHolderBigPreview(this, inflate);
                }
                throw new IllegalArgumentException("Invalid view type");
            }
            ItemLauncherAppPreviewBinding inflate2 = ItemLauncherAppPreviewBinding.inflate(LayoutInflater.from(parent.getContext()), null, false);
            l0.o(inflate2, "inflate(...)");
            return new ViewHolderPreview(this, inflate2);
        }
        ItemLauncherAppBinding inflate3 = ItemLauncherAppBinding.inflate(LayoutInflater.from(parent.getContext()), null, false);
        l0.o(inflate3, "inflate(...)");
        return new ViewHolder(this, inflate3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(@l View itemView, int i5) {
        boolean z4;
        l0.p(itemView, "itemView");
        if (l0.g(this.f13878c.A().getValue(), Boolean.TRUE)) {
            return;
        }
        List<com.yuanqi.group.home.models.b> list = this.f13881f;
        l0.m(list);
        com.yuanqi.group.home.models.b bVar = list.get(i5);
        List<v2.b> value = this.f13878c.y().getValue();
        v2.b bVar2 = null;
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                v2.b bVar3 = (v2.b) next;
                if (bVar3.getUserId() == bVar.getUserId() && l0.g(bVar3.getPackageName(), bVar.getPackageName())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    bVar2 = next;
                    break;
                }
            }
            bVar2 = bVar2;
        }
        v2.b bVar4 = bVar2;
        if (this.f13879d == 1) {
            b bVar5 = this.f13882g;
            if (bVar5 != null) {
                List<com.yuanqi.group.home.models.b> list2 = this.f13881f;
                l0.m(list2);
                bVar5.c(i5, itemView, bVar, bVar4, list2);
                return;
            }
            return;
        }
        b bVar6 = this.f13882g;
        if (bVar6 != null) {
            bVar6.a("此模式下长按功能迁移到点击中");
        }
    }

    public final void t(int i5, @l ViewHolder viewHolder) {
        List<com.yuanqi.group.home.models.b> V5;
        l0.p(viewHolder, "viewHolder");
        if (i5 >= 0) {
            List<com.yuanqi.group.home.models.b> list = this.f13881f;
            l0.m(list);
            if (i5 < list.size()) {
                List<com.yuanqi.group.home.models.b> list2 = this.f13881f;
                l0.m(list2);
                com.yuanqi.group.home.models.b bVar = list2.get(i5);
                bVar.isSelect = true;
                viewHolder.a().itemCheckbox.setSelected(bVar.isSelect);
                List<com.yuanqi.group.home.models.b> list3 = this.f13881f;
                l0.m(list3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (((com.yuanqi.group.home.models.b) obj).isSelect) {
                        arrayList.add(obj);
                    }
                }
                MutableLiveData<List<com.yuanqi.group.home.models.b>> H = this.f13878c.H();
                V5 = e0.V5(arrayList);
                H.postValue(V5);
                return;
            }
        }
        b bVar2 = this.f13882g;
        if (bVar2 != null && bVar2 != null) {
            bVar2.a("该应用未找到，请在清除缓存之后再进行尝试");
        }
    }

    public final void u(@l com.yuanqi.group.home.models.b model) {
        l0.p(model, "model");
        List<com.yuanqi.group.home.models.b> list = this.f13881f;
        l0.m(list);
        int indexOf = list.indexOf(model);
        if (indexOf >= 0) {
            notifyItemChanged(indexOf);
        }
    }

    public final void v(@l com.yuanqi.group.home.models.b data) {
        l0.p(data, "data");
        List<com.yuanqi.group.home.models.b> list = this.f13881f;
        l0.m(list);
        int indexOf = list.indexOf(data);
        List<com.yuanqi.group.home.models.b> list2 = this.f13881f;
        l0.m(list2);
        if (list2.remove(data)) {
            notifyItemRemoved(indexOf);
        }
    }

    public final void w(@m b bVar) {
        this.f13882g = bVar;
    }

    public final void x(int i5) {
        List<com.yuanqi.group.home.models.b> list;
        this.f13879d = i5;
        if (i5 == 1 && (list = this.f13881f) != null) {
            l0.m(list);
            for (com.yuanqi.group.home.models.b bVar : list) {
                bVar.isShowMask = false;
                bVar.isShowPreview = false;
                bVar.bitmap = null;
                bVar.pid = -1;
            }
        }
        notifyDataSetChanged();
    }

    public final void y(@l List<com.yuanqi.group.home.models.b> list) {
        l0.p(list, "list");
        this.f13881f = list;
        notifyDataSetChanged();
    }

    public final void z(@l String pid, @l String packageName, @l Bitmap bitmap) {
        l0.p(pid, "pid");
        l0.p(packageName, "packageName");
        l0.p(bitmap, "bitmap");
        List<com.yuanqi.group.home.models.b> list = this.f13881f;
        if (list == null) {
            Log.d(this.f13880e, "setPreviewData: mList is null");
            return;
        }
        l0.m(list);
        if (list.isEmpty()) {
            Log.d(this.f13880e, "setPreviewData: mList is empty");
            return;
        }
        if (this.f13878c.w() >= 0) {
            int w4 = this.f13878c.w();
            List<com.yuanqi.group.home.models.b> list2 = this.f13881f;
            l0.m(list2);
            if (w4 <= list2.size()) {
                List<com.yuanqi.group.home.models.b> list3 = this.f13881f;
                l0.m(list3);
                if (l0.g(list3.get(this.f13878c.w()).getPackageName(), packageName)) {
                    List<com.yuanqi.group.home.models.b> list4 = this.f13881f;
                    l0.m(list4);
                    list4.get(this.f13878c.w()).pid = Integer.parseInt(pid);
                    List<com.yuanqi.group.home.models.b> list5 = this.f13881f;
                    l0.m(list5);
                    list5.get(this.f13878c.w()).bitmap = bitmap;
                    List<com.yuanqi.group.home.models.b> list6 = this.f13881f;
                    l0.m(list6);
                    list6.get(this.f13878c.w()).isShowPreview = true;
                    notifyItemChanged(this.f13878c.w());
                    return;
                }
                List<com.yuanqi.group.home.models.b> list7 = this.f13881f;
                l0.m(list7);
                int size = list7.size();
                for (int i5 = 0; i5 < size; i5++) {
                    List<com.yuanqi.group.home.models.b> list8 = this.f13881f;
                    l0.m(list8);
                    if (list8.get(i5).pid == Integer.parseInt(pid)) {
                        List<com.yuanqi.group.home.models.b> list9 = this.f13881f;
                        l0.m(list9);
                        list9.get(i5).pid = Integer.parseInt(pid);
                        List<com.yuanqi.group.home.models.b> list10 = this.f13881f;
                        l0.m(list10);
                        list10.get(i5).bitmap = bitmap;
                        List<com.yuanqi.group.home.models.b> list11 = this.f13881f;
                        l0.m(list11);
                        list11.get(i5).isShowPreview = true;
                        notifyItemChanged(i5);
                        return;
                    }
                }
                return;
            }
        }
        Log.d(this.f13880e, "setPreviewData: appIndex is error");
    }
}
