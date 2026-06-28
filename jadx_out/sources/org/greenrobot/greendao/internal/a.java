package org.greenrobot.greendao.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.greenrobot.greendao.i;

/* loaded from: classes4.dex */
public final class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final org.greenrobot.greendao.database.a f21361a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21362b;

    /* renamed from: c, reason: collision with root package name */
    public final i[] f21363c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f21364d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f21365e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f21366f;

    /* renamed from: g, reason: collision with root package name */
    public final i f21367g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21368h;

    /* renamed from: i, reason: collision with root package name */
    public final e f21369i;

    /* renamed from: j, reason: collision with root package name */
    private o4.a<?, ?> f21370j;

    public a(org.greenrobot.greendao.database.a aVar, Class<? extends org.greenrobot.greendao.a<?, ?>> cls) {
        this.f21361a = aVar;
        try {
            this.f21362b = (String) cls.getField("TABLENAME").get(null);
            i[] e5 = e(cls);
            this.f21363c = e5;
            this.f21364d = new String[e5.length];
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            i iVar = null;
            for (int i5 = 0; i5 < e5.length; i5++) {
                i iVar2 = e5[i5];
                String str = iVar2.f21360e;
                this.f21364d[i5] = str;
                if (iVar2.f21359d) {
                    arrayList.add(str);
                    iVar = iVar2;
                } else {
                    arrayList2.add(str);
                }
            }
            this.f21366f = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            this.f21365e = strArr;
            i iVar3 = strArr.length == 1 ? iVar : null;
            this.f21367g = iVar3;
            this.f21369i = new e(aVar, this.f21362b, this.f21364d, strArr);
            if (iVar3 != null) {
                Class<?> cls2 = iVar3.f21357b;
                this.f21368h = cls2.equals(Long.TYPE) || cls2.equals(Long.class) || cls2.equals(Integer.TYPE) || cls2.equals(Integer.class) || cls2.equals(Short.TYPE) || cls2.equals(Short.class) || cls2.equals(Byte.TYPE) || cls2.equals(Byte.class);
            } else {
                this.f21368h = false;
            }
        } catch (Exception e6) {
            throw new org.greenrobot.greendao.d("Could not init DAOConfig", e6);
        }
    }

    private static i[] e(Class<? extends org.greenrobot.greendao.a<?, ?>> cls) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
        Field[] declaredFields = Class.forName(cls.getName() + "$Properties").getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 9) == 9) {
                Object obj = field.get(null);
                if (obj instanceof i) {
                    arrayList.add((i) obj);
                }
            }
        }
        i[] iVarArr = new i[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            int i5 = iVar.f21356a;
            if (iVarArr[i5] == null) {
                iVarArr[i5] = iVar;
            } else {
                throw new org.greenrobot.greendao.d("Duplicate property ordinals");
            }
        }
        return iVarArr;
    }

    public void a() {
        o4.a<?, ?> aVar = this.f21370j;
        if (aVar != null) {
            aVar.clear();
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a(this);
    }

    public o4.a<?, ?> c() {
        return this.f21370j;
    }

    public void d(o4.d dVar) {
        if (dVar == o4.d.None) {
            this.f21370j = null;
            return;
        }
        if (dVar == o4.d.Session) {
            if (this.f21368h) {
                this.f21370j = new o4.b();
                return;
            } else {
                this.f21370j = new o4.c();
                return;
            }
        }
        throw new IllegalArgumentException("Unsupported type: " + dVar);
    }

    public void f(o4.a<?, ?> aVar) {
        this.f21370j = aVar;
    }

    public a(a aVar) {
        this.f21361a = aVar.f21361a;
        this.f21362b = aVar.f21362b;
        this.f21363c = aVar.f21363c;
        this.f21364d = aVar.f21364d;
        this.f21365e = aVar.f21365e;
        this.f21366f = aVar.f21366f;
        this.f21367g = aVar.f21367g;
        this.f21369i = aVar.f21369i;
        this.f21368h = aVar.f21368h;
    }
}
