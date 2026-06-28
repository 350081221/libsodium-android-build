package com.umeng.analytics.pro;

import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.cb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class cb<T extends cb<?, ?>, F extends by> implements br<T, F> {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends cy>, cz> f12372c;

    /* renamed from: a, reason: collision with root package name */
    protected Object f12373a;

    /* renamed from: b, reason: collision with root package name */
    protected F f12374b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends da<cb> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cq cqVar, cb cbVar) throws bx {
            cbVar.f12374b = null;
            cbVar.f12373a = null;
            cqVar.j();
            cl l5 = cqVar.l();
            Object a5 = cbVar.a(cqVar, l5);
            cbVar.f12373a = a5;
            if (a5 != null) {
                cbVar.f12374b = (F) cbVar.a(l5.f12439c);
            }
            cqVar.m();
            cqVar.l();
            cqVar.k();
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cq cqVar, cb cbVar) throws bx {
            if (cbVar.a() != null && cbVar.b() != null) {
                cqVar.a(cbVar.d());
                cqVar.a(cbVar.c(cbVar.f12374b));
                cbVar.a(cqVar);
                cqVar.c();
                cqVar.d();
                cqVar.b();
                return;
            }
            throw new cr("Cannot write a TUnion with no set value!");
        }
    }

    /* loaded from: classes3.dex */
    private static class b implements cz {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cz
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends db<cb> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cq cqVar, cb cbVar) throws bx {
            cbVar.f12374b = null;
            cbVar.f12373a = null;
            short v4 = cqVar.v();
            Object a5 = cbVar.a(cqVar, v4);
            cbVar.f12373a = a5;
            if (a5 != null) {
                cbVar.f12374b = (F) cbVar.a(v4);
            }
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cq cqVar, cb cbVar) throws bx {
            if (cbVar.a() != null && cbVar.b() != null) {
                cqVar.a(cbVar.f12374b.a());
                cbVar.b(cqVar);
                return;
            }
            throw new cr("Cannot write a TUnion with no set value!");
        }
    }

    /* loaded from: classes3.dex */
    private static class d implements cz {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cz
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f12372c = hashMap;
        hashMap.put(da.class, new b());
        hashMap.put(db.class, new d());
    }

    protected cb() {
        this.f12374b = null;
        this.f12373a = null;
    }

    private static Object a(Object obj) {
        if (obj instanceof br) {
            return ((br) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return bs.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        return obj instanceof Map ? a((Map<Object, Object>) obj) : obj;
    }

    protected abstract F a(short s5);

    protected abstract Object a(cq cqVar, cl clVar) throws bx;

    protected abstract Object a(cq cqVar, short s5) throws bx;

    protected abstract void a(cq cqVar) throws bx;

    public Object b() {
        return this.f12373a;
    }

    protected abstract void b(F f5, Object obj) throws ClassCastException;

    protected abstract void b(cq cqVar) throws bx;

    protected abstract cl c(F f5);

    public boolean c() {
        return this.f12374b != null;
    }

    @Override // com.umeng.analytics.pro.br
    public final void clear() {
        this.f12374b = null;
        this.f12373a = null;
    }

    protected abstract cv d();

    @Override // com.umeng.analytics.pro.br
    public void read(cq cqVar) throws bx {
        f12372c.get(cqVar.D()).b().b(cqVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (a() != null) {
            Object b5 = b();
            sb.append(c(a()).f12437a);
            sb.append(":");
            if (b5 instanceof ByteBuffer) {
                bs.a((ByteBuffer) b5, sb);
            } else {
                sb.append(b5.toString());
            }
        }
        sb.append(">");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.br
    public void write(cq cqVar) throws bx {
        f12372c.get(cqVar.D()).b().a(cqVar, this);
    }

    public boolean b(F f5) {
        return this.f12374b == f5;
    }

    public boolean b(int i5) {
        return b((cb<T, F>) a((short) i5));
    }

    protected cb(F f5, Object obj) {
        a((cb<T, F>) f5, obj);
    }

    protected cb(cb<T, F> cbVar) {
        if (cbVar.getClass().equals(getClass())) {
            this.f12374b = cbVar.f12374b;
            this.f12373a = a(cbVar.f12373a);
            return;
        }
        throw new ClassCastException();
    }

    private static Map a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            hashMap.put(a(entry.getKey()), a(entry.getValue()));
        }
        return hashMap;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(a(it.next()));
        }
        return hashSet;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public F a() {
        return this.f12374b;
    }

    public Object a(F f5) {
        if (f5 == this.f12374b) {
            return b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f5 + " because union's set field is " + this.f12374b);
    }

    public Object a(int i5) {
        return a((cb<T, F>) a((short) i5));
    }

    public void a(F f5, Object obj) {
        b(f5, obj);
        this.f12374b = f5;
        this.f12373a = obj;
    }

    public void a(int i5, Object obj) {
        a((cb<T, F>) a((short) i5), obj);
    }
}
