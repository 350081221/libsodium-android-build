package com.yuanqi.group.home;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.yuanqi.group.home.models.AppInfoLite;
import java.util.List;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/yuanqi/group/home/HomeContract;", "", "()V", "HomePresenter", "HomeView", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14047a = 0;

    @kotlin.i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rH&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H&J\b\u0010\u0016\u001a\u00020\u0003H&J\u0016\u0010\u0017\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&JV\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(H&¨\u0006*"}, d2 = {"Lcom/yuanqi/group/home/HomeContract$HomePresenter;", "Lcom/yuanqi/group/abs/BasePresenter;", "addApp", "", "info", "Lcom/yuanqi/group/home/models/AppInfoLite;", "checkExtPackageBootPermission", "", "deleteApp", "data", "Lcom/yuanqi/group/home/models/AppData;", "deleteAppList", "dataList", "", "enterAppSetting", "getLabel", "", TTDownloadField.TT_PACKAGE_NAME, "launchAppBefore", "userId", "", "name", "requestVirtualApp", "saveConfig", "list", "", "showInstall32BitExt", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "showPopupMenu", "activity", "Landroid/app/Activity;", "position", "view", "Landroid/view/View;", "model", "noteApp", "Lcom/yuanqi/master/database/model/AppNote;", "isFirst", "shouldLogin", "Lkotlin/Function0;", "shouldVip", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface a extends q2.a {
        @p4.m
        String a(@p4.m String str);

        void b(@p4.m com.yuanqi.group.home.models.b bVar);

        void c(@p4.m AppInfoLite appInfoLite);

        void d(@p4.l Context context);

        void e(@p4.l List<? extends com.yuanqi.group.home.models.b> list);

        boolean f();

        void g(int i5, @p4.l String str, @p4.l String str2);

        void h();

        void i(@p4.m com.yuanqi.group.home.models.b bVar);

        void j(@p4.l List<com.yuanqi.group.home.models.b> list);

        void k(@p4.l Activity activity, int i5, @p4.l View view, @p4.l com.yuanqi.group.home.models.b bVar, @p4.m v2.b bVar2, boolean z4, @p4.l v3.a<r2> aVar, @p4.l v3.a<r2> aVar2);
    }

    @kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH&J\b\u0010\u0012\u001a\u00020\u0004H&J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0004H&J\b\u0010\u0019\u001a\u00020\u0004H&J\b\u0010\u001a\u001a\u00020\u0004H&J\b\u0010\u001b\u001a\u00020\u0004H&¨\u0006\u001c"}, d2 = {"Lcom/yuanqi/group/home/HomeContract$HomeView;", "Lcom/yuanqi/group/abs/BaseView;", "Lcom/yuanqi/group/home/HomeContract$HomePresenter;", "askInstallGms", "", "hideLoading", "loadError", NotificationCompat.CATEGORY_ERROR, "", "loadFinish", "appModels", "", "Lcom/yuanqi/group/home/models/AppData;", "qickClone", "data", "refreshLauncherItem", "model", "removeAppToLauncher", "saveConfig", "showDeleteDialog", "updateContext", "Landroid/content/Context;", "view", "Landroid/view/View;", "showGuide", "showLoading", "showOverlayPermissionDialog", "showPermissionDialog", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface b extends q2.b<a> {
        void b(@p4.l com.yuanqi.group.home.models.b bVar);

        void c();

        void d(@p4.l List<com.yuanqi.group.home.models.b> list);

        void e(@p4.l com.yuanqi.group.home.models.b bVar);

        void f();

        void g(@p4.l Context context, @p4.l com.yuanqi.group.home.models.b bVar, @p4.l View view);

        void h(@p4.l com.yuanqi.group.home.models.b bVar);

        void k();

        void l();

        void m();

        void n();

        void p(@p4.l Throwable th);

        void q();
    }
}
