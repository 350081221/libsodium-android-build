package org.slf4j.helpers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import t4.MDCAdapter;

/* loaded from: classes4.dex */
public class a implements MDCAdapter {

    /* renamed from: b, reason: collision with root package name */
    static boolean f22237b = e();

    /* renamed from: a, reason: collision with root package name */
    private InheritableThreadLocal f22238a = new InheritableThreadLocal();

    static boolean e() {
        try {
            return System.getProperty("java.version").startsWith("1.4");
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // t4.MDCAdapter
    public void a(String str, String str2) {
        if (str != null) {
            Map map = (Map) this.f22238a.get();
            if (map == null) {
                map = Collections.synchronizedMap(new HashMap());
                this.f22238a.set(map);
            }
            map.put(str, str2);
            return;
        }
        throw new IllegalArgumentException("key cannot be null");
    }

    @Override // t4.MDCAdapter
    public Map b() {
        Map map = (Map) this.f22238a.get();
        if (map != null) {
            Map synchronizedMap = Collections.synchronizedMap(new HashMap());
            synchronized (map) {
                synchronizedMap.putAll(map);
            }
            return synchronizedMap;
        }
        return null;
    }

    @Override // t4.MDCAdapter
    public void c(Map map) {
        this.f22238a.set(Collections.synchronizedMap(new HashMap(map)));
    }

    @Override // t4.MDCAdapter
    public void clear() {
        Map map = (Map) this.f22238a.get();
        if (map != null) {
            map.clear();
            if (e()) {
                this.f22238a.set(null);
            } else {
                this.f22238a.remove();
            }
        }
    }

    public Set d() {
        Map map = (Map) this.f22238a.get();
        if (map != null) {
            return map.keySet();
        }
        return null;
    }

    @Override // t4.MDCAdapter
    public String get(String str) {
        Map map = (Map) this.f22238a.get();
        if (map != null && str != null) {
            return (String) map.get(str);
        }
        return null;
    }

    @Override // t4.MDCAdapter
    public void remove(String str) {
        Map map = (Map) this.f22238a.get();
        if (map != null) {
            map.remove(str);
        }
    }
}
