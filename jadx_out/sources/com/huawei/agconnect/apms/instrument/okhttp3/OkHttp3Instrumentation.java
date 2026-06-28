package com.huawei.agconnect.apms.instrument.okhttp3;

import android.text.TextUtils;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.a;
import com.huawei.agconnect.apms.a0;
import com.huawei.agconnect.apms.c0;
import com.huawei.agconnect.apms.cba;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.f0;
import com.huawei.agconnect.apms.fed;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.q1;
import com.huawei.agconnect.apms.y;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkUrlFactory;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes3.dex */
public class OkHttp3Instrumentation {
    public static final AgentLog LOG = AgentLogManager.getAgentLog();
    public static final String OKHTTP3_LISTENER_TAG = "okhttp3.RealCall";
    public static final String OKHTTP4_4_LISTENER_TAG = "okhttp3.internal.connection.RealCall";
    public static final String OKHTTP4_TRANSMITTER_TAG = "okhttp3.internal.connection.Transmitter";

    /* loaded from: classes3.dex */
    public static class abc {
        public static final Class abc;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 4 */
        static {
            Class cls;
            try {
                cls = Class.forName(OkHttp3Instrumentation.OKHTTP3_LISTENER_TAG);
            } catch (ClassNotFoundException unused) {
                cls = RealCall.class;
            }
            if (cls != null) {
                OkHttp3Instrumentation.LOG.debug("enhance network metrics initialization succeeded.");
            }
            abc = cls;
        }
    }

    /* loaded from: classes3.dex */
    public static class bcd {
        public static final Class abc;

        static {
            Class<?> cls;
            try {
                cls = Class.forName(OkHttp3Instrumentation.OKHTTP4_TRANSMITTER_TAG);
            } catch (Throwable unused) {
                cls = null;
            }
            abc = cls;
        }
    }

    public static void addEventListenerAndInject(Call call, fed fedVar) {
        Class cls;
        try {
            cls = getListenerParentClazz();
            if (cls == null) {
                return;
            }
            try {
                Field declaredField = cls.getDeclaredField("eventListener");
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                setListenerProxy(call, declaredField, fedVar);
            } catch (Throwable th) {
                th = th;
                try {
                    if (!tryAddEventListenerToTransmitter(call, cls, fedVar)) {
                        LOG.error(th.getMessage());
                    }
                } catch (Throwable th2) {
                    LOG.error(th2.getMessage());
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cls = null;
        }
    }

    public static void addNuwaHeaderId(Request.Builder builder, String str) {
        if (TextUtils.isEmpty(builder.build().header(HeaderType.X_TRACE_ID))) {
            builder.addHeader(HeaderType.X_TRACE_ID, str);
        }
        if (TextUtils.isEmpty(builder.build().header(HeaderType.X_MICROSERVICE_NAME))) {
            builder.addHeader(HeaderType.X_MICROSERVICE_NAME, "APMS");
        }
    }

    public static Response.Builder body(Response.Builder builder, ResponseBody responseBody) {
        if (Agent.isDisabled()) {
            return builder.body(responseBody);
        }
        try {
            return new f0(builder).abc.body(responseBody);
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: ");
            abc2.append(th.getMessage());
            agentLog.warn(abc2.toString());
            return builder.body(responseBody);
        }
    }

    public static OkHttpClient build(OkHttpClient.Builder builder) {
        if (Agent.isDisabled()) {
            return builder.build();
        }
        try {
            filterOkhttp3Interceptors(builder);
            return builder.addInterceptor(new c0()).build();
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: ");
            abc2.append(th.getMessage());
            agentLog.warn(abc2.toString());
            return builder.build();
        }
    }

    public static void filterOkhttp3Interceptors(OkHttpClient.Builder builder) {
        List<Interceptor> interceptors = builder.interceptors();
        if (interceptors != null && interceptors.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Interceptor interceptor : interceptors) {
                if (interceptor instanceof c0) {
                    arrayList.add(interceptor);
                }
            }
            interceptors.removeAll(arrayList);
        }
    }

    public static Class getListenerParentClazz() {
        return abc.abc;
    }

    public static Class getTransmitterClazz() {
        return bcd.abc;
    }

    public static String getValueFromHeader(Request request, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String header = request.header(str);
        if (TextUtils.isEmpty(header)) {
            return "";
        }
        return header;
    }

    public static Response.Builder newBuilder(Response.Builder builder) {
        if (Agent.isDisabled()) {
            return builder;
        }
        try {
            return new f0(builder);
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: "), LOG);
            return builder;
        }
    }

    public static Call newCall(OkHttpClient okHttpClient, Request request) {
        if (Agent.isDisabled()) {
            return okHttpClient.newCall(request);
        }
        try {
            fed fedVar = new fed();
            fedVar.jih = getValueFromHeader(request, HeaderType.X_TRACE_ID);
            Call newCall = okHttpClient.newCall(request);
            addEventListenerAndInject(newCall, fedVar);
            fedVar.ghi = 2;
            return new y(request, newCall, fedVar);
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: ");
            abc2.append(th.getMessage());
            agentLog.warn(abc2.toString());
            return okHttpClient.newCall(request);
        }
    }

    public static HttpURLConnection open(OkUrlFactory okUrlFactory, URL url) {
        HttpURLConnection open = okUrlFactory.open(url);
        if (Agent.isDisabled()) {
            return open;
        }
        try {
            if ("https".equals(url.getProtocol()) && (open instanceof HttpsURLConnection)) {
                return new a((HttpsURLConnection) open);
            }
            return new cba(open);
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: "), LOG);
            return open;
        }
    }

    public static void setListenerProxy(Object obj, Field field, fed fedVar) {
        try {
            field.set(obj, new a0((EventListener) field.get(obj), fedVar));
        } catch (Throwable th) {
            LOG.error(th.getMessage());
        }
    }

    public static boolean tryAddEventListenerToTransmitter(Call call, Class cls, fed fedVar) {
        if (call != null && cls != null && fedVar != null) {
            Class transmitterClazz = getTransmitterClazz();
            try {
                Field declaredField = cls.getDeclaredField("transmitter");
                Field declaredField2 = transmitterClazz.getDeclaredField("eventListener");
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                if (!declaredField2.isAccessible()) {
                    declaredField2.setAccessible(true);
                }
                try {
                    setListenerProxy(declaredField.get(call), declaredField2, fedVar);
                    return true;
                } catch (Throwable th) {
                    fedVar.abc(th.getMessage());
                    LOG.error(th.getMessage());
                    return false;
                }
            } catch (NoSuchFieldException e5) {
                fedVar.abc(e5.getMessage());
                LOG.error(e5.getMessage());
            }
        }
        return false;
    }

    public static Request build(Request.Builder builder) {
        if (Agent.isDisabled()) {
            return builder.build();
        }
        try {
            addNuwaHeaderId(builder, q1.abc());
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("skipping APMS OkHttp3 proxy: "), LOG);
        }
        return builder.build();
    }
}
