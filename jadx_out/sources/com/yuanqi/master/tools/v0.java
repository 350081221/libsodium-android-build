package com.yuanqi.master.tools;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.FileProvider;
import androidx.core.net.MailTo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.yqtech.multiapp.R;
import com.yuanqi.group.App;
import java.io.File;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0016\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ$\u0010\u001d\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\tJ\"\u0010 \u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t¨\u0006!"}, d2 = {"Lcom/yuanqi/master/tools/LocalUtil;", "", "()V", "contactUSWithQQ", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "contactUSWithQQMsg", TTDownloadField.TT_APP_NAME, "", "version", "copyTextToClipboard", "text", "getAppVersion", "getAppVersionCode", "", "getDeviceInfo", "gotoUpdateApp", "isAppInstalled", "", TTDownloadField.TT_PACKAGE_NAME, "activity", "launchWeChat", "openAppInAppBao", "appId", "openBrowser1", "url", "reviewApp", "sendEmail", "shareImg", "Landroid/app/Activity;", "imgPath", "shareText", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final v0 f15260a = new v0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f15261b = 0;

    private v0() {
    }

    private final String f(Context context, String str, String str2) {
        return "App名称: " + str + "\nApp版本: " + str2 + "\n设备型号: " + Build.MODEL + "\nAndroid版本: " + Build.VERSION.RELEASE + "\n程序版本: " + d(context);
    }

    private final void j(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + str));
        intent.setPackage("com.tencent.android.qqdownloader");
        context.startActivity(intent);
    }

    public final void a(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=3818531525")));
        } catch (Exception unused) {
            String string = context.getString(R.string.no_qq);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            f1.r(string, 0, 2, null);
        }
    }

    public final void b(@p4.l Context context, @p4.l String appName, @p4.l String version) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(appName, "appName");
        kotlin.jvm.internal.l0.p(version, "version");
        String f5 = f(context, appName, version);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=3818531525"));
            c(context, f5 + "\n请输入您想反馈的问题:\n\n");
            f1.r("反馈的应用问题基本已复制到剪切板，请手动粘贴再完善具体问题内容", 0, 2, null);
            context.startActivity(intent);
        } catch (Exception unused) {
            String string = context.getString(R.string.no_qq);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            f1.r(string, 0, 2, null);
        }
    }

    public final void c(@p4.l Context context, @p4.l String text) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(text, "text");
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(TTDownloadField.TT_LABEL, text));
    }

    @p4.l
    public final String d(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            kotlin.jvm.internal.l0.o(packageInfo, "getPackageInfo(...)");
            String str = packageInfo.versionName;
            kotlin.jvm.internal.l0.m(str);
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "N/A";
        }
    }

    public final int e(@p4.l Context context) {
        int i5;
        long longVersionCode;
        kotlin.jvm.internal.l0.p(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            kotlin.jvm.internal.l0.o(packageInfo, "getPackageInfo(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
                i5 = (int) longVersionCode;
            } else {
                i5 = packageInfo.versionCode;
            }
            return i5;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public final void g(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        try {
            if (e.f15100a.g()) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName()));
                intent.addFlags(268435456);
                context.startActivity(intent);
            } else if (h("com.tencent.android.qqdownloader", context)) {
                String packageName = context.getPackageName();
                kotlin.jvm.internal.l0.o(packageName, "getPackageName(...)");
                j(context, packageName);
            } else {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://sj.qq.com/appdetail/com.yqtech.multiapp")));
            }
        } catch (Exception e5) {
            String string = context.getString(R.string.no_market);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            f1.r(string, 0, 2, null);
            e5.printStackTrace();
        }
    }

    public final boolean h(@p4.l String packageName, @p4.l Context activity) {
        kotlin.jvm.internal.l0.p(packageName, "packageName");
        kotlin.jvm.internal.l0.p(activity, "activity");
        PackageManager packageManager = activity.getPackageManager();
        kotlin.jvm.internal.l0.o(packageManager, "getPackageManager(...)");
        try {
            packageManager.getPackageInfo(packageName, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final void i(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268435456);
            context.startActivity(launchIntentForPackage);
        } else {
            Toast.makeText(context, "无法启微信，请确保您已经安装了微信。", 0).show();
        }
    }

    public final void k(@p4.l String url, @p4.l Context context) {
        kotlin.jvm.internal.l0.p(url, "url");
        kotlin.jvm.internal.l0.p(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(url));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            intent.resolveActivity(context.getPackageManager());
            context.startActivity(Intent.createChooser(intent, "请选择浏览器"));
        } else {
            f1.r("请下载浏览器", 0, 2, null);
        }
    }

    public final void l(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName()));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e5) {
            String string = context.getString(R.string.no_market);
            kotlin.jvm.internal.l0.o(string, "getString(...)");
            f1.r(string, 0, 2, null);
            e5.printStackTrace();
        }
    }

    public final void m(@p4.l Context context, @p4.l String appName, @p4.l String version) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(appName, "appName");
        kotlin.jvm.internal.l0.p(version, "version");
        String f5 = f(context, appName, version);
        String[] strArr = {"3818531525@qq.com"};
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("plain/text");
        intent.putExtra("android.intent.extra.SUBJECT", "问题反馈");
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        intent.putExtra("android.intent.extra.TEXT", "请输入您想反馈的问题:\n\n\n" + f5);
        boolean h5 = h("com.tencent.androidqqmail", context);
        boolean h6 = h("com.netease.mail", context);
        if (h5) {
            Intent intent2 = new Intent(intent);
            intent2.setPackage("com.tencent.androidqqmail");
            context.startActivity(intent2);
        } else if (h6) {
            c(context, "3818531525@qq.com");
            f1.r("收件人邮箱已复制到剪切板，请手动粘贴", 0, 2, null);
            Intent intent3 = new Intent(intent);
            intent3.setPackage("com.netease.mail");
            context.startActivity(intent3);
        } else {
            try {
                Intent intent4 = new Intent("android.intent.action.SENDTO");
                intent4.setData(Uri.parse(MailTo.MAILTO_SCHEME));
                intent4.putExtra("android.intent.extra.EMAIL", strArr);
                intent4.putExtra("android.intent.extra.SUBJECT", "问题反馈");
                intent4.putExtra("android.intent.extra.TEXT", "请输入您想反馈的问题:\n\n\n" + f5);
                context.startActivity(intent4);
            } catch (Exception unused) {
                f1.r("未找到邮件客户端", 0, 2, null);
            }
        }
        q0.f15237a.a().g(context);
    }

    public final boolean n(@p4.m Activity activity, @p4.m String str, @p4.m String str2) {
        Log.e(com.yuanqi.master.config.c.f14519a, "sysShareImg:" + str);
        if (str != null && activity != null) {
            Intent intent = new Intent();
            File file = new File(str);
            if (!file.exists()) {
                return false;
            }
            App a5 = App.f13716d.a();
            kotlin.jvm.internal.l0.m(a5);
            Uri uriForFile = FileProvider.getUriForFile(a5.getApplicationContext(), activity.getPackageName() + ".fileprovider", file);
            intent.setAction("android.intent.action.SEND");
            intent.addFlags(268435456);
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            if (str2 != null) {
                intent.setPackage(str2);
            }
            Intent createChooser = Intent.createChooser(intent, "Share To");
            kotlin.jvm.internal.l0.o(createChooser, "createChooser(...)");
            try {
                activity.startActivity(createChooser);
                return true;
            } catch (Exception e5) {
                e5.printStackTrace();
                Log.e(com.yuanqi.master.config.c.f14519a, "sysShareImg Exception:" + e5.getMessage());
            }
        }
        return false;
    }

    public final void o(@p4.l Context activity, @p4.m String str, @p4.m String str2) {
        kotlin.jvm.internal.l0.p(activity, "activity");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.addFlags(268435456);
        if (str2 != null) {
            intent.setPackage(str2);
        }
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        Intent createChooser = Intent.createChooser(intent, "Share To");
        kotlin.jvm.internal.l0.o(createChooser, "createChooser(...)");
        try {
            activity.startActivity(createChooser);
            q0.f15237a.a().t(activity);
        } catch (Exception e5) {
            e5.printStackTrace();
            Log.e(com.yuanqi.master.config.c.f14519a, "sysShareText Exception:" + e5.getMessage());
        }
    }
}
