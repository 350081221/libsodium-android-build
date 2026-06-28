package com.yuanqi.master.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import com.yuanqi.group.App;
import com.yuanqi.master.network.model.BaseResult;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.t1;
import kotlin.r2;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@kotlin.i0(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aJ\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0007\u001aD\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0007\u001a\u0006\u0010\u000b\u001a\u00020\t\u001a\u0006\u0010\f\u001a\u00020\r\u001a\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\t\u001a\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u001a\n\u0010\u001f\u001a\u00020\t*\u00020 \u001a\n\u0010!\u001a\u00020\r*\u00020\"\u001a\n\u0010#\u001a\u00020\r*\u00020\"\u001a%\u0010$\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020%*\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0086\b¨\u0006("}, d2 = {"ResultUltra", "", "T", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "Lcom/yuanqi/master/network/model/BaseResult;", "onSuccess", "Lkotlin/Function1;", "onFailure", "", "ResultUltraPlus", "getDateTime", "hasAllFilesAccessPermission", "", "hasFloatingPermission", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "hasFullScreenNotificationPermission", "hasIgnoreBatteryOptimizationsPermission", "hasInstallShortcutPermission", "hasLocationPermission", "hasNotificationPermission", "hasPermission", "permission", "hasStartPermission", "hasStoragePermission", "showMsg", CrashHianalyticsData.MESSAGE, "", "duration", "", "formatDateWithCurrentTimeZone", "Ljava/util/Date;", "isLatitudeValid", "", "isLongitudeValid", "startActivity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/yuanqi/master/tools/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
/* loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J$\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J0\u0010\t\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/yuanqi/master/tools/UtilsKt$ResultUltra$1", "Lretrofit2/Callback;", "Lcom/yuanqi/master/network/model/BaseResult;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", bi.aL, "", "onResponse", "response", "Lretrofit2/Response;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<T> implements Callback<BaseResult<T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.l<String, r2> f15107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.l<T, r2> f15108b;

        /* JADX WARN: Multi-variable type inference failed */
        a(v3.l<? super String, r2> lVar, v3.l<? super T, r2> lVar2) {
            this.f15107a = lVar;
            this.f15108b = lVar2;
        }

        @Override // retrofit2.Callback
        public void onFailure(@p4.l Call<BaseResult<T>> call, @p4.l Throwable t5) {
            kotlin.jvm.internal.l0.p(call, "call");
            kotlin.jvm.internal.l0.p(t5, "t");
            this.f15107a.invoke(String.valueOf(t5.getMessage()));
        }

        @Override // retrofit2.Callback
        public void onResponse(@p4.l Call<BaseResult<T>> call, @p4.l Response<BaseResult<T>> response) {
            kotlin.jvm.internal.l0.p(call, "call");
            kotlin.jvm.internal.l0.p(response, "response");
            if (!response.isSuccessful()) {
                this.f15107a.invoke("请求失败");
                return;
            }
            BaseResult<T> body = response.body();
            if (body == null) {
                return;
            }
            if (body.getCode() == 200) {
                this.f15108b.invoke(body.getData());
            } else if (body.getMsg() != null) {
                this.f15107a.invoke(body.getMsg());
            } else {
                this.f15107a.invoke("未知错误");
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¨\u0006\u000b"}, d2 = {"com/yuanqi/master/tools/UtilsKt$ResultUltraPlus$1", "Lretrofit2/Callback;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", bi.aL, "", "onResponse", "response", "Lretrofit2/Response;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b<T> implements Callback<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.l<String, r2> f15109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v3.l<T, r2> f15110b;

        /* JADX WARN: Multi-variable type inference failed */
        b(v3.l<? super String, r2> lVar, v3.l<? super T, r2> lVar2) {
            this.f15109a = lVar;
            this.f15110b = lVar2;
        }

        @Override // retrofit2.Callback
        public void onFailure(@p4.l Call<T> call, @p4.l Throwable t5) {
            kotlin.jvm.internal.l0.p(call, "call");
            kotlin.jvm.internal.l0.p(t5, "t");
            this.f15109a.invoke(String.valueOf(t5.getMessage()));
        }

        @Override // retrofit2.Callback
        public void onResponse(@p4.l Call<T> call, @p4.l Response<T> response) {
            kotlin.jvm.internal.l0.p(call, "call");
            kotlin.jvm.internal.l0.p(response, "response");
            if (!response.isSuccessful()) {
                this.f15109a.invoke("请求失败");
                return;
            }
            T body = response.body();
            if (body == null) {
                return;
            }
            this.f15110b.invoke(body);
        }
    }

    public static final <T> void a(@p4.l Call<BaseResult<T>> call, @p4.l v3.l<? super T, r2> onSuccess, @p4.l v3.l<? super String, r2> onFailure) {
        kotlin.jvm.internal.l0.p(call, "call");
        kotlin.jvm.internal.l0.p(onSuccess, "onSuccess");
        kotlin.jvm.internal.l0.p(onFailure, "onFailure");
        call.enqueue(new a(onFailure, onSuccess));
    }

    public static final <T> void b(@p4.l Call<T> call, @p4.l v3.l<? super T, r2> onSuccess, @p4.l v3.l<? super String, r2> onFailure) {
        kotlin.jvm.internal.l0.p(call, "call");
        kotlin.jvm.internal.l0.p(onSuccess, "onSuccess");
        kotlin.jvm.internal.l0.p(onFailure, "onFailure");
        call.enqueue(new b(onFailure, onSuccess));
    }

    @p4.l
    public static final String c(@p4.l Date date) {
        kotlin.jvm.internal.l0.p(date, "<this>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String format = simpleDateFormat.format(date);
        kotlin.jvm.internal.l0.o(format, "format(...)");
        return format;
    }

    @p4.l
    public static final String d() {
        LocalDateTime now;
        DateTimeFormatter ofPattern;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            now = LocalDateTime.now();
            ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
            format = now.format(ofPattern);
            kotlin.jvm.internal.l0.m(format);
            return format;
        }
        Calendar calendar = Calendar.getInstance();
        int i5 = calendar.get(1);
        int i6 = calendar.get(2) + 1;
        int i7 = calendar.get(5);
        int i8 = calendar.get(11);
        int i9 = calendar.get(12);
        int i10 = calendar.get(13);
        t1 t1Var = t1.f19457a;
        String format2 = String.format("%04d-%02d-%02d_%02d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)}, 6));
        kotlin.jvm.internal.l0.o(format2, "format(format, *args)");
        return format2;
    }

    public static final boolean e() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            return isExternalStorageManager;
        }
        return true;
    }

    public static final boolean f(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        return Settings.canDrawOverlays(context);
    }

    public static final boolean g(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        try {
            return NotificationManagerCompat.from(context).canUseFullScreenIntent();
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static final boolean h(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        return l(context, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
    }

    public static final boolean i(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        if (a3.a.a(context) != -1) {
            return true;
        }
        return false;
    }

    public static final boolean j(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        return l(context, "android.permission.ACCESS_COARSE_LOCATION");
    }

    public static final boolean k(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        try {
            return NotificationManagerCompat.from(context).areNotificationsEnabled();
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static final boolean l(@p4.l Context context, @p4.l String permission) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(permission, "permission");
        if (ContextCompat.checkSelfPermission(context, permission) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean m(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        return l(context, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
    }

    public static final boolean n(@p4.l Context context) {
        kotlin.jvm.internal.l0.p(context, "context");
        return l(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static final boolean o(double d5) {
        return d5 >= -90.0d && d5 <= 90.0d;
    }

    public static final boolean p(double d5) {
        return d5 >= -180.0d && d5 <= 180.0d;
    }

    public static final void q(@p4.l CharSequence message, int i5) {
        kotlin.jvm.internal.l0.p(message, "message");
        App a5 = App.f13716d.a();
        kotlin.jvm.internal.l0.m(a5);
        Toast.makeText(a5, message, i5).show();
    }

    public static /* synthetic */ void r(CharSequence charSequence, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        q(charSequence, i5);
    }

    public static final /* synthetic */ <T extends Activity> void s(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l0.p(activity, "<this>");
        kotlin.jvm.internal.l0.y(4, "T");
        Intent intent = new Intent(activity, (Class<?>) Activity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    public static /* synthetic */ void t(Activity activity, Bundle bundle, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.l0.p(activity, "<this>");
        kotlin.jvm.internal.l0.y(4, "T");
        Intent intent = new Intent(activity, (Class<?>) Activity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }
}
