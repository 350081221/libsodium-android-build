package okhttp3.internal.platform.android;

import android.util.Log;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.text.f0;
import kotlin.text.h0;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J1\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0007R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "", "loggerName", "loggerTag", "logger", TTDownloadField.TT_TAG, "Lkotlin/r2;", "enableLogging", "", "logLevel", CrashHianalyticsData.MESSAGE, "", bi.aL, "androidLog$okhttp", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "androidLog", "enable", "MAX_LOG_LENGTH", "I", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "configuredLoggers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "knownLoggers", "Ljava/util/Map;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
@SuppressSignatureCheck
/* loaded from: classes4.dex */
public final class AndroidLog {
    private static final int MAX_LOG_LENGTH = 4000;

    @l
    private static final Map<String, String> knownLoggers;

    @l
    public static final AndroidLog INSTANCE = new AndroidLog();

    @l
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        String str;
        Map<String, String> D0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = OkHttpClient.class.getPackage();
        if (r22 != null) {
            str = r22.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = OkHttpClient.class.getName();
        l0.o(name, "OkHttpClient::class.java.name");
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = Http2.class.getName();
        l0.o(name2, "Http2::class.java.name");
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = TaskRunner.class.getName();
        l0.o(name3, "TaskRunner::class.java.name");
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        D0 = a1.D0(linkedHashMap);
        knownLoggers = D0;
    }

    private AndroidLog() {
    }

    private final void enableLogging(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String V8;
        String str2 = knownLoggers.get(str);
        if (str2 != null) {
            return str2;
        }
        V8 = h0.V8(str, 23);
        return V8;
    }

    public final void androidLog$okhttp(@l String loggerName, int i5, @l String message, @m Throwable th) {
        int o32;
        int min;
        l0.p(loggerName, "loggerName");
        l0.p(message, "message");
        String loggerTag = loggerTag(loggerName);
        if (Log.isLoggable(loggerTag, i5)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            int length = message.length();
            int i6 = 0;
            while (i6 < length) {
                o32 = f0.o3(message, '\n', i6, false, 4, null);
                if (o32 == -1) {
                    o32 = length;
                }
                while (true) {
                    min = Math.min(o32, i6 + 4000);
                    String substring = message.substring(i6, min);
                    l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i5, loggerTag, substring);
                    if (min >= o32) {
                        break;
                    } else {
                        i6 = min;
                    }
                }
                i6 = min + 1;
            }
        }
    }

    public final void enable() {
        for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
            enableLogging(entry.getKey(), entry.getValue());
        }
    }
}
