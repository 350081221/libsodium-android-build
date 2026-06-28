package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f21623a;

    public a() {
        this.f21623a = new ArrayList();
    }

    public a(Object obj) {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i5 = 0; i5 < length; i5++) {
            this.f21623a.add(Array.get(obj, i5));
        }
    }

    public a(String str) {
        this(new c(str));
    }

    public a(Collection collection) {
        this.f21623a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a(c cVar) {
        this();
        char c5;
        ArrayList arrayList;
        Object d5;
        char c6 = cVar.c();
        if (c6 == '[') {
            c5 = ']';
        } else {
            if (c6 != '(') {
                throw cVar.a("A JSONArray text must start with '['");
            }
            c5 = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c7 = cVar.c();
            cVar.a();
            if (c7 == ',') {
                arrayList = this.f21623a;
                d5 = null;
            } else {
                arrayList = this.f21623a;
                d5 = cVar.d();
            }
            arrayList.add(d5);
            char c8 = cVar.c();
            if (c8 != ')') {
                if (c8 != ',' && c8 != ';') {
                    if (c8 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c5 == c8) {
                return;
            }
            throw cVar.a("Expected a '" + new Character(c5) + "'");
        } while (cVar.c() != ']');
    }

    private String a(String str) {
        int size = this.f21623a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.a(this.f21623a.get(i5)));
        }
        return stringBuffer.toString();
    }

    public final int a() {
        return this.f21623a.size();
    }

    public final Object a(int i5) {
        Object obj = (i5 < 0 || i5 >= this.f21623a.size()) ? null : this.f21623a.get(i5);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONArray[" + i5 + "] not found.");
    }

    public String toString() {
        try {
            return "[" + a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }
}
