package org.slf4j;

import java.util.Map;
import org.slf4j.helpers.i;
import org.slf4j.helpers.l;
import org.slf4j.impl.StaticMDCBinder;
import t4.MDCAdapter;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    static final String f22233a = "http://www.slf4j.org/codes.html#null_MDCA";

    /* renamed from: b, reason: collision with root package name */
    static final String f22234b = "http://www.slf4j.org/codes.html#no_static_mdc_binder";

    /* renamed from: c, reason: collision with root package name */
    static MDCAdapter f22235c;

    static {
        try {
            f22235c = StaticMDCBinder.SINGLETON.getMDCA();
        } catch (Exception e5) {
            l.b("MDC binding unsuccessful.", e5);
        } catch (NoClassDefFoundError e6) {
            f22235c = new i();
            String message = e6.getMessage();
            if (message != null && message.indexOf("StaticMDCBinder") != -1) {
                l.a("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
                l.a("Defaulting to no-operation MDCAdapter implementation.");
                l.a("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
                return;
            }
            throw e6;
        }
    }

    private c() {
    }

    public static void a() {
        MDCAdapter mDCAdapter = f22235c;
        if (mDCAdapter != null) {
            mDCAdapter.clear();
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static String b(String str) throws IllegalArgumentException {
        if (str != null) {
            MDCAdapter mDCAdapter = f22235c;
            if (mDCAdapter != null) {
                return mDCAdapter.get(str);
            }
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        throw new IllegalArgumentException("key parameter cannot be null");
    }

    public static Map c() {
        MDCAdapter mDCAdapter = f22235c;
        if (mDCAdapter != null) {
            return mDCAdapter.b();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static MDCAdapter d() {
        return f22235c;
    }

    public static void e(String str, String str2) throws IllegalArgumentException {
        if (str != null) {
            MDCAdapter mDCAdapter = f22235c;
            if (mDCAdapter != null) {
                mDCAdapter.a(str, str2);
                return;
            }
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        throw new IllegalArgumentException("key parameter cannot be null");
    }

    public static void f(String str) throws IllegalArgumentException {
        if (str != null) {
            MDCAdapter mDCAdapter = f22235c;
            if (mDCAdapter != null) {
                mDCAdapter.remove(str);
                return;
            }
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        throw new IllegalArgumentException("key parameter cannot be null");
    }

    public static void g(Map map) {
        MDCAdapter mDCAdapter = f22235c;
        if (mDCAdapter != null) {
            mDCAdapter.c(map);
            return;
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }
}
