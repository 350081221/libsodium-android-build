package com.tendcloud.tenddata;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static volatile z f11846a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, Set<ae>> f11847b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final ThreadLocal<ConcurrentLinkedQueue<a>> f11848c = new ThreadLocal<ConcurrentLinkedQueue<a>>() { // from class: com.tendcloud.tenddata.z.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ConcurrentLinkedQueue<a> initialValue() {
            return new ConcurrentLinkedQueue<>();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Boolean> f11849d = new ThreadLocal<Boolean>() { // from class: com.tendcloud.tenddata.z.2
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, Set<Class<?>>> f11850e = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {
        final Object event;
        final ae handler;

        public a(Object obj, ae aeVar) {
            this.event = obj;
            this.handler = aeVar;
        }
    }

    private z() {
    }

    public static z a() {
        if (f11846a == null) {
            synchronized (z.class) {
                if (f11846a == null) {
                    f11846a = new z();
                }
            }
        }
        return f11846a;
    }

    private Set<Class<?>> c(Class<?> cls) {
        try {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(cls);
            while (!linkedList.isEmpty()) {
                Class cls2 = (Class) linkedList.remove(0);
                hashSet.add(cls2);
                Class superclass = cls2.getSuperclass();
                if (superclass != null) {
                    linkedList.add(superclass);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return null;
        }
    }

    protected void b() {
        try {
            if (this.f11849d.get().booleanValue()) {
                return;
            }
            this.f11849d.set(Boolean.TRUE);
            while (true) {
                a poll = this.f11848c.get().poll();
                if (poll == null) {
                    return;
                }
                if (poll.handler.a()) {
                    b(poll.event, poll.handler);
                }
            }
        } finally {
            this.f11849d.set(Boolean.FALSE);
        }
    }

    public void post(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Iterator<Class<?>> it = b(obj.getClass()).iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                Set<ae> a5 = a(it.next());
                if (a5 != null && !a5.isEmpty()) {
                    Iterator<ae> it2 = a5.iterator();
                    while (it2.hasNext()) {
                        a(obj, it2.next());
                    }
                    z4 = true;
                }
            }
            if (!z4 && !(obj instanceof ag)) {
                post(new ag(this, obj));
            }
            b();
        } catch (Throwable unused) {
        }
    }

    public void register(Object obj) {
        Set<ae> putIfAbsent;
        if (obj == null) {
            return;
        }
        try {
            Map<Class<?>, Set<ae>> a5 = ad.a(obj);
            for (Class<?> cls : a5.keySet()) {
                Set<ae> set = this.f11847b.get(cls);
                if (set == null && (putIfAbsent = this.f11847b.putIfAbsent(cls, (set = new CopyOnWriteArraySet<>()))) != null) {
                    set = putIfAbsent;
                }
                if (!set.addAll(a5.get(cls))) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void unregister(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            for (Map.Entry<Class<?>, Set<ae>> entry : ad.a(obj).entrySet()) {
                Set<ae> a5 = a(entry.getKey());
                Set<ae> value = entry.getValue();
                if (a5 != null && a5.containsAll(value)) {
                    for (ae aeVar : a5) {
                        if (value.contains(aeVar)) {
                            aeVar.b();
                        }
                    }
                    a5.removeAll(value);
                }
                return;
            }
        } catch (Throwable unused) {
        }
    }

    protected void a(Object obj, ae aeVar) {
        try {
            this.f11848c.get().offer(new a(obj, aeVar));
        } catch (Throwable unused) {
        }
    }

    Set<ae> a(Class<?> cls) {
        try {
            return this.f11847b.get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    protected void b(Object obj, ae aeVar) {
        try {
            aeVar.handleEvent(obj);
        } catch (Throwable unused) {
        }
    }

    Set<Class<?>> b(Class<?> cls) {
        try {
            Set<Class<?>> set = this.f11850e.get(cls);
            if (set != null) {
                return set;
            }
            Set<Class<?>> c5 = c(cls);
            this.f11850e.put(cls, c5);
            return c5;
        } catch (Throwable unused) {
            return null;
        }
    }
}
