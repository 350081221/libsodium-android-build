package org.slf4j;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: f0, reason: collision with root package name */
    public static final String f22214f0 = "ROOT";

    void debug(String str);

    void debug(String str, Object obj);

    void debug(String str, Object obj, Object obj2);

    void debug(String str, Throwable th);

    void debug(String str, Object... objArr);

    void debug(d dVar, String str);

    void debug(d dVar, String str, Object obj);

    void debug(d dVar, String str, Object obj, Object obj2);

    void debug(d dVar, String str, Throwable th);

    void debug(d dVar, String str, Object... objArr);

    void error(String str);

    void error(String str, Object obj);

    void error(String str, Object obj, Object obj2);

    void error(String str, Throwable th);

    void error(String str, Object... objArr);

    void error(d dVar, String str);

    void error(d dVar, String str, Object obj);

    void error(d dVar, String str, Object obj, Object obj2);

    void error(d dVar, String str, Throwable th);

    void error(d dVar, String str, Object... objArr);

    String getName();

    void info(String str);

    void info(String str, Object obj);

    void info(String str, Object obj, Object obj2);

    void info(String str, Throwable th);

    void info(String str, Object... objArr);

    void info(d dVar, String str);

    void info(d dVar, String str, Object obj);

    void info(d dVar, String str, Object obj, Object obj2);

    void info(d dVar, String str, Throwable th);

    void info(d dVar, String str, Object... objArr);

    boolean isDebugEnabled();

    boolean isDebugEnabled(d dVar);

    boolean isErrorEnabled();

    boolean isErrorEnabled(d dVar);

    boolean isInfoEnabled();

    boolean isInfoEnabled(d dVar);

    boolean isTraceEnabled();

    boolean isTraceEnabled(d dVar);

    boolean isWarnEnabled();

    boolean isWarnEnabled(d dVar);

    void trace(String str);

    void trace(String str, Object obj);

    void trace(String str, Object obj, Object obj2);

    void trace(String str, Throwable th);

    void trace(String str, Object... objArr);

    void trace(d dVar, String str);

    void trace(d dVar, String str, Object obj);

    void trace(d dVar, String str, Object obj, Object obj2);

    void trace(d dVar, String str, Throwable th);

    void trace(d dVar, String str, Object... objArr);

    void warn(String str);

    void warn(String str, Object obj);

    void warn(String str, Object obj, Object obj2);

    void warn(String str, Throwable th);

    void warn(String str, Object... objArr);

    void warn(d dVar, String str);

    void warn(d dVar, String str, Object obj);

    void warn(d dVar, String str, Object obj, Object obj2);

    void warn(d dVar, String str, Throwable th);

    void warn(d dVar, String str, Object... objArr);
}
