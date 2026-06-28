package com.google.gson;

import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o extends l {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.j<String, l> f7726a = new com.google.gson.internal.j<>();

    private l D(Object obj) {
        return obj == null ? n.f7725a : new r(obj);
    }

    public void A(String str, Character ch) {
        y(str, D(ch));
    }

    public void B(String str, Number number) {
        y(str, D(number));
    }

    public void C(String str, String str2) {
        y(str, D(str2));
    }

    @Override // com.google.gson.l
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public o a() {
        o oVar = new o();
        for (Map.Entry<String, l> entry : this.f7726a.entrySet()) {
            oVar.y(entry.getKey(), entry.getValue().a());
        }
        return oVar;
    }

    public Set<Map.Entry<String, l>> F() {
        return this.f7726a.entrySet();
    }

    public l G(String str) {
        return this.f7726a.get(str);
    }

    public i H(String str) {
        return (i) this.f7726a.get(str);
    }

    public o I(String str) {
        return (o) this.f7726a.get(str);
    }

    public r J(String str) {
        return (r) this.f7726a.get(str);
    }

    public boolean K(String str) {
        return this.f7726a.containsKey(str);
    }

    public Set<String> L() {
        return this.f7726a.keySet();
    }

    public l M(String str) {
        return this.f7726a.remove(str);
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof o) || !((o) obj).f7726a.equals(this.f7726a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f7726a.hashCode();
    }

    public int size() {
        return this.f7726a.size();
    }

    public void y(String str, l lVar) {
        if (lVar == null) {
            lVar = n.f7725a;
        }
        this.f7726a.put(str, lVar);
    }

    public void z(String str, Boolean bool) {
        y(str, D(bool));
    }
}
