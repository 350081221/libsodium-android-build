package com.efs.sdk.net;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.apache.http.client.utils.URLEncodedUtils;

@Instrumented
/* loaded from: classes2.dex */
public class NetManager {
    private static final String TAG = "OkHttpManager";
    private static NetConfigManager mNetConfigManager;
    private static EfsReporter mReporter;

    public static void get(String str, Callback callback) {
        OkHttpClient build;
        Request build2;
        Call newCall;
        OkHttpClient.Builder addNetworkInterceptor = new OkHttpClient.Builder().eventListenerFactory(OkHttpListener.get()).addNetworkInterceptor(new OkHttpInterceptor());
        if (!(addNetworkInterceptor instanceof OkHttpClient.Builder)) {
            build = addNetworkInterceptor.build();
        } else {
            build = OkHttp3Instrumentation.build(addNetworkInterceptor);
        }
        Request.Builder url = new Request.Builder().url(str);
        if (!(url instanceof Request.Builder)) {
            build2 = url.build();
        } else {
            build2 = OkHttp3Instrumentation.build(url);
        }
        if (!(build instanceof OkHttpClient)) {
            newCall = build.newCall(build2);
        } else {
            newCall = OkHttp3Instrumentation.newCall(build, build2);
        }
        newCall.enqueue(callback);
    }

    public static NetConfigManager getNetConfigManager() {
        return mNetConfigManager;
    }

    public static EfsReporter getReporter() {
        return mReporter;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context != null && efsReporter != null) {
            mReporter = efsReporter;
            mNetConfigManager = new NetConfigManager(context, efsReporter);
        } else {
            Log.e(TAG, "init net manager error! parameter is null!");
        }
    }

    public static void post(String str, Map<String, Object> map, Callback callback) {
        OkHttpClient build;
        Request build2;
        Call newCall;
        StringBuilder sb = new StringBuilder();
        for (String str2 : map.keySet()) {
            sb.append(str2);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(map.get(str2));
            sb.append("&");
        }
        OkHttpClient.Builder addNetworkInterceptor = new OkHttpClient.Builder().eventListenerFactory(OkHttpListener.get()).addNetworkInterceptor(new OkHttpInterceptor());
        if (!(addNetworkInterceptor instanceof OkHttpClient.Builder)) {
            build = addNetworkInterceptor.build();
        } else {
            build = OkHttp3Instrumentation.build(addNetworkInterceptor);
        }
        Request.Builder post = new Request.Builder().url(str).post(RequestBody.create(MediaType.parse(URLEncodedUtils.CONTENT_TYPE), sb.toString()));
        if (!(post instanceof Request.Builder)) {
            build2 = post.build();
        } else {
            build2 = OkHttp3Instrumentation.build(post);
        }
        if (!(build instanceof OkHttpClient)) {
            newCall = build.newCall(build2);
        } else {
            newCall = OkHttp3Instrumentation.newCall(build, build2);
        }
        newCall.enqueue(callback);
    }

    public static void postJson(String str, String str2, Callback callback) {
        OkHttpClient build;
        Request build2;
        Call newCall;
        OkHttpClient.Builder addNetworkInterceptor = new OkHttpClient.Builder().eventListenerFactory(OkHttpListener.get()).addNetworkInterceptor(new OkHttpInterceptor());
        if (!(addNetworkInterceptor instanceof OkHttpClient.Builder)) {
            build = addNetworkInterceptor.build();
        } else {
            build = OkHttp3Instrumentation.build(addNetworkInterceptor);
        }
        Request.Builder post = new Request.Builder().url(str).post(RequestBody.create(str2, MediaType.parse("application/json;charset=utf-8")));
        if (!(post instanceof Request.Builder)) {
            build2 = post.build();
        } else {
            build2 = OkHttp3Instrumentation.build(post);
        }
        if (!(build instanceof OkHttpClient)) {
            newCall = build.newCall(build2);
        } else {
            newCall = OkHttp3Instrumentation.newCall(build, build2);
        }
        newCall.enqueue(callback);
    }
}
