package com.yuanqi.master.tools;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.download.api.constant.BaseConstants;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bJ\u001e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bJ\u001e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bJ\u001c\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u001e\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ&\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bJ\u0016\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bJ\u0016\u0010(\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\bJ\u000e\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010+\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006/"}, d2 = {"Lcom/yuanqi/master/tools/EventUtil;", "", "()V", "logADInitFaild", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", PluginConstants.KEY_ERROR_CODE, "", "msg", "logChangeDisplayAndSort", "disPlayNum", "firstAppName", "logChangeLanguage", bi.N, "logClearCache", "logDeleteApp", TTDownloadField.TT_APP_NAME, "uid", "logFeedback", "logInstallAppEvent", "installNum", "", "isFromSD", "", "logLauncherApp", "logLauncherAppWithoutNet", "logLocationLaunch", "logMultiDeleteApp", "appList", "", "Lcom/yuanqi/group/home/models/AppData;", "logNOAD", "logNoteApp", "note", "logQuickCloneApp", "logRefuseAndExit", "logScreenView", "screenName", "className", "logSearchEvent", "searchStr", "logShare", "logShowPrivacy", "logShowTerm", "logSort", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nEventUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventUtil.kt\ncom/yuanqi/master/tools/EventUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n1549#2:162\n1620#2,3:163\n*S KotlinDebug\n*F\n+ 1 EventUtil.kt\ncom/yuanqi/master/tools/EventUtil\n*L\n55#1:162\n55#1:163,3\n*E\n"})
/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final b f15237a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f15238b = 0;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final kotlin.d0<q0> f15239c;

    @kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/yuanqi/master/tools/EventUtil;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.n0 implements v3.a<q0> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final q0 invoke() {
            return new q0();
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/tools/EventUtil$Companion;", "", "()V", "instance", "Lcom/yuanqi/master/tools/EventUtil;", "getInstance", "()Lcom/yuanqi/master/tools/EventUtil;", "instance$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final q0 a() {
            return (q0) q0.f15239c.getValue();
        }
    }

    static {
        kotlin.d0<q0> b5;
        b5 = kotlin.f0.b(kotlin.h0.SYNCHRONIZED, a.INSTANCE);
        f15239c = b5;
    }

    public static /* synthetic */ void i(q0 q0Var, Context context, String str, long j5, boolean z4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z4 = false;
        }
        q0Var.h(context, str, j5, z4);
    }

    public final void b(@p4.l Context context, @p4.l String code, @p4.l String msg) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(msg, "msg");
        HashMap hashMap = new HashMap();
        hashMap.put(PluginConstants.KEY_ERROR_CODE, code);
        hashMap.put("msg", msg);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "ad_init_failed", hashMap);
    }

    public final void c(@p4.l Context context, @p4.l String disPlayNum, @p4.l String firstAppName) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(disPlayNum, "disPlayNum");
        kotlin.jvm.internal.l0.p(firstAppName, "firstAppName");
        HashMap hashMap = new HashMap();
        hashMap.put(com.yuanqi.master.config.c.C, disPlayNum);
        hashMap.put("first_app_name", firstAppName);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "change_display_sort", hashMap);
    }

    public final void d(@p4.l Context context, @p4.l String language) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(language, "language");
        HashMap hashMap = new HashMap();
        hashMap.put(bi.N, language);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "change_language", hashMap);
    }

    public final void e(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        MobclickAgent.onEvent(context, "clear_cache");
    }

    public final void f(@p4.l Context context, @p4.l String appName, @p4.l String uid) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(appName, "appName");
        kotlin.jvm.internal.l0.p(uid, "uid");
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", appName);
        hashMap.put("uid", uid);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "delete_app", hashMap);
    }

    public final void g(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        MobclickAgent.onEvent(context, "feedback");
    }

    public final void h(@p4.l Context context, @p4.l String appName, long j5, boolean z4) {
        String str;
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(appName, "appName");
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", appName);
        hashMap.put("install_num", Long.valueOf(j5));
        if (z4) {
            str = "SD";
        } else {
            str = "virtual";
        }
        hashMap.put(TypedValues.TransitionType.S_FROM, str);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "install_app", hashMap);
    }

    public final void j(@p4.l Context context, @p4.l String appName, @p4.l String uid) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(appName, "appName");
        kotlin.jvm.internal.l0.p(uid, "uid");
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", appName);
        hashMap.put("uid", uid);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "launch_app", hashMap);
    }

    public final void k(@p4.l Context context, @p4.l String appName, @p4.l String uid) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(appName, "appName");
        kotlin.jvm.internal.l0.p(uid, "uid");
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", appName);
        hashMap.put("uid", uid);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "launch_app_no_net", hashMap);
    }

    public final void l(@p4.l Context context, @p4.l String appName, @p4.l String uid) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(appName, "appName");
        kotlin.jvm.internal.l0.p(uid, "uid");
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", appName);
        hashMap.put("uid", uid);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "location_launch", hashMap);
    }

    public final void m(@p4.l Context context, @p4.l List<? extends com.yuanqi.group.home.models.b> appList) {
        int Y;
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(appList, "appList");
        Bundle[] bundleArr = new Bundle[0];
        List<? extends com.yuanqi.group.home.models.b> list = appList;
        Y = kotlin.collections.x.Y(list, 10);
        ArrayList arrayList = new ArrayList(Y);
        for (com.yuanqi.group.home.models.b bVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_name", bVar.getName().toString());
            bundle.putString("uid", String.valueOf(bVar.getUserId()));
            arrayList.add(bundle);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_info", bundleArr);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "delete_app_list", hashMap);
    }

    public final void n(@p4.l Context context, @p4.l String code, @p4.l String msg) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(code, "code");
        kotlin.jvm.internal.l0.p(msg, "msg");
        HashMap hashMap = new HashMap();
        hashMap.put(PluginConstants.KEY_ERROR_CODE, code);
        hashMap.put("msg", msg);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "no_ad", hashMap);
    }

    public final void o(@p4.l Context context, @p4.l String appName, @p4.l String uid, @p4.l String note) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(appName, "appName");
        kotlin.jvm.internal.l0.p(uid, "uid");
        kotlin.jvm.internal.l0.p(note, "note");
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", appName);
        hashMap.put("uid", uid);
        hashMap.put("note", note);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "note_app", hashMap);
    }

    public final void p(@p4.l Context context, @p4.l String appName) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(appName, "appName");
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", appName);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, "qulick_clone_app", hashMap);
    }

    public final void q(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        MobclickAgent.onEvent(context, "refuse_exit");
    }

    public final void r(@p4.l String screenName, @p4.l String className) {
        kotlin.jvm.internal.l0.p(screenName, "screenName");
        kotlin.jvm.internal.l0.p(className, "className");
    }

    public final void s(@p4.l Context context, @p4.l String searchStr) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(searchStr, "searchStr");
        HashMap hashMap = new HashMap();
        hashMap.put(BaseConstants.MARKET_URI_AUTHORITY_SEARCH, searchStr);
        r2 r2Var = r2.f19517a;
        MobclickAgent.onEventObject(context, BaseConstants.MARKET_URI_AUTHORITY_SEARCH, hashMap);
    }

    public final void t(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        MobclickAgent.onEvent(context, "app_share");
    }

    public final void u(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        MobclickAgent.onEvent(context, "show_privacy");
    }

    public final void v(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        MobclickAgent.onEvent(context, "show_term");
    }

    public final void w(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        MobclickAgent.onEvent(context, "menu_sort");
    }
}
