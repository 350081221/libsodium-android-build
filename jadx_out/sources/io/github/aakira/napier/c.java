package io.github.aakira.napier;

import android.util.Log;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import io.github.aakira.napier.e;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.f0;
import org.apache.commons.logging.LogFactory;
import p4.l;
import p4.m;
import socket.g;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J.\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u00020\u0002*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lio/github/aakira/napier/c;", "Lio/github/aakira/napier/a;", "", TTDownloadField.TT_TAG, g.f22386a, "Lio/github/aakira/napier/e$a;", "", bi.aJ, LogFactory.PRIORITY_KEY, "", "throwable", CrashHianalyticsData.MESSAGE, "Lkotlin/r2;", "c", "className", "e", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", bi.ay, "Ljava/util/regex/Pattern;", "anonymousClass", "b", "Ljava/lang/String;", "defaultTag", "f", "(Ljava/lang/Throwable;)Ljava/lang/String;", "stackTraceString", "<init>", "(Ljava/lang/String;)V", "napier_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class c extends io.github.aakira.napier.a {

    /* renamed from: c, reason: collision with root package name */
    private static final int f16211c = 4000;

    /* renamed from: d, reason: collision with root package name */
    private static final int f16212d = 23;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16213e = 9;

    /* renamed from: f, reason: collision with root package name */
    @l
    public static final a f16214f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f16215a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16216b;

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lio/github/aakira/napier/c$a;", "", "", "CALL_STACK_INDEX", "I", "MAX_LOG_LENGTH", "MAX_TAG_LENGTH", "<init>", "()V", "napier_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public c(@l String defaultTag) {
        l0.p(defaultTag, "defaultTag");
        this.f16216b = defaultTag;
        this.f16215a = Pattern.compile("(\\$\\d+)+$");
    }

    private final String f(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        l0.o(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    private final String g(String str) {
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, "Thread.currentThread()");
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        if (stackTrace != null && stackTrace.length >= 9) {
            StackTraceElement stackTraceElement = stackTrace[9];
            StringBuilder sb = new StringBuilder();
            String className = stackTraceElement.getClassName();
            l0.o(className, "className");
            sb.append(e(className));
            sb.append('$');
            sb.append(stackTraceElement.getMethodName());
            return sb.toString();
        }
        return str;
    }

    private final int h(e.a aVar) {
        switch (d.f16217a[aVar.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                throw new j0();
        }
    }

    @Override // io.github.aakira.napier.a
    protected void c(@l e.a priority, @m String str, @m Throwable th, @m String str2) {
        int o32;
        int min;
        l0.p(priority, "priority");
        if (str == null) {
            str = g(this.f16216b);
        }
        if (str2 != null) {
            if (th != null) {
                str2 = str2 + '\n' + f(th);
            }
        } else if (th == null || (str2 = f(th)) == null) {
            return;
        }
        int length = str2.length();
        if (length <= 4000) {
            if (priority == e.a.ASSERT) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(h(priority), str, str2);
                return;
            }
        }
        int i5 = 0;
        while (i5 < length) {
            o32 = f0.o3(str2, '\n', i5, false, 4, null);
            if (o32 == -1) {
                o32 = length;
            }
            while (true) {
                min = Math.min(o32, i5 + 4000);
                String substring = str2.substring(i5, min);
                l0.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (h(priority) == 7) {
                    Log.wtf(str, substring);
                } else {
                    Log.println(h(priority), str, substring);
                }
                if (min >= o32) {
                    break;
                } else {
                    i5 = min;
                }
            }
            i5 = min + 1;
        }
    }

    @l
    public final String e(@l String className) {
        int C3;
        l0.p(className, "className");
        Matcher matcher = this.f16215a.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll("");
            l0.o(className, "m.replaceAll(\"\")");
        }
        C3 = f0.C3(className, external.org.apache.commons.lang3.d.f15957a, 0, false, 6, null);
        int i5 = C3 + 1;
        if (className != null) {
            String substring = className.substring(i5);
            l0.o(substring, "(this as java.lang.String).substring(startIndex)");
            substring.length();
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public /* synthetic */ c(String str, int i5, w wVar) {
        this((i5 & 1) != 0 ? "app" : str);
    }
}
