package org.slf4j.helpers;

/* loaded from: classes4.dex */
public abstract class e extends j implements org.slf4j.a {
    private static final long serialVersionUID = 9044267456635152283L;

    @Override // org.slf4j.a
    public void debug(org.slf4j.d dVar, String str) {
        debug(str);
    }

    @Override // org.slf4j.a
    public void error(org.slf4j.d dVar, String str) {
        error(str);
    }

    @Override // org.slf4j.helpers.j, org.slf4j.a
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // org.slf4j.a
    public void info(org.slf4j.d dVar, String str) {
        info(str);
    }

    @Override // org.slf4j.a
    public boolean isDebugEnabled(org.slf4j.d dVar) {
        return isDebugEnabled();
    }

    @Override // org.slf4j.a
    public boolean isErrorEnabled(org.slf4j.d dVar) {
        return isErrorEnabled();
    }

    @Override // org.slf4j.a
    public boolean isInfoEnabled(org.slf4j.d dVar) {
        return isInfoEnabled();
    }

    @Override // org.slf4j.a
    public boolean isTraceEnabled(org.slf4j.d dVar) {
        return isTraceEnabled();
    }

    @Override // org.slf4j.a
    public boolean isWarnEnabled(org.slf4j.d dVar) {
        return isWarnEnabled();
    }

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }

    @Override // org.slf4j.a
    public void trace(org.slf4j.d dVar, String str) {
        trace(str);
    }

    @Override // org.slf4j.a
    public void warn(org.slf4j.d dVar, String str) {
        warn(str);
    }

    @Override // org.slf4j.a
    public void debug(org.slf4j.d dVar, String str, Object obj) {
        debug(str, obj);
    }

    @Override // org.slf4j.a
    public void error(org.slf4j.d dVar, String str, Object obj) {
        error(str, obj);
    }

    @Override // org.slf4j.a
    public void info(org.slf4j.d dVar, String str, Object obj) {
        info(str, obj);
    }

    @Override // org.slf4j.a
    public void trace(org.slf4j.d dVar, String str, Object obj) {
        trace(str, obj);
    }

    @Override // org.slf4j.a
    public void warn(org.slf4j.d dVar, String str, Object obj) {
        warn(str, obj);
    }

    @Override // org.slf4j.a
    public void debug(org.slf4j.d dVar, String str, Object obj, Object obj2) {
        debug(str, obj, obj2);
    }

    @Override // org.slf4j.a
    public void error(org.slf4j.d dVar, String str, Object obj, Object obj2) {
        error(str, obj, obj2);
    }

    @Override // org.slf4j.a
    public void info(org.slf4j.d dVar, String str, Object obj, Object obj2) {
        info(str, obj, obj2);
    }

    @Override // org.slf4j.a
    public void trace(org.slf4j.d dVar, String str, Object obj, Object obj2) {
        trace(str, obj, obj2);
    }

    @Override // org.slf4j.a
    public void warn(org.slf4j.d dVar, String str, Object obj, Object obj2) {
        warn(str, obj, obj2);
    }

    @Override // org.slf4j.a
    public void debug(org.slf4j.d dVar, String str, Object... objArr) {
        debug(str, objArr);
    }

    @Override // org.slf4j.a
    public void error(org.slf4j.d dVar, String str, Object... objArr) {
        error(str, objArr);
    }

    @Override // org.slf4j.a
    public void info(org.slf4j.d dVar, String str, Object... objArr) {
        info(str, objArr);
    }

    @Override // org.slf4j.a
    public void trace(org.slf4j.d dVar, String str, Object... objArr) {
        trace(str, objArr);
    }

    @Override // org.slf4j.a
    public void warn(org.slf4j.d dVar, String str, Object... objArr) {
        warn(str, objArr);
    }

    @Override // org.slf4j.a
    public void debug(org.slf4j.d dVar, String str, Throwable th) {
        debug(str, th);
    }

    @Override // org.slf4j.a
    public void error(org.slf4j.d dVar, String str, Throwable th) {
        error(str, th);
    }

    @Override // org.slf4j.a
    public void info(org.slf4j.d dVar, String str, Throwable th) {
        info(str, th);
    }

    @Override // org.slf4j.a
    public void trace(org.slf4j.d dVar, String str, Throwable th) {
        trace(str, th);
    }

    @Override // org.slf4j.a
    public void warn(org.slf4j.d dVar, String str, Throwable th) {
        warn(str, th);
    }
}
