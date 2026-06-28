package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class i extends l implements Iterable<l> {

    /* renamed from: a, reason: collision with root package name */
    private final List<l> f7513a;

    public i() {
        this.f7513a = new ArrayList();
    }

    public void A(Character ch) {
        this.f7513a.add(ch == null ? n.f7725a : new r(ch));
    }

    public void B(Number number) {
        this.f7513a.add(number == null ? n.f7725a : new r(number));
    }

    public void C(String str) {
        this.f7513a.add(str == null ? n.f7725a : new r(str));
    }

    public void D(i iVar) {
        this.f7513a.addAll(iVar.f7513a);
    }

    public boolean E(l lVar) {
        return this.f7513a.contains(lVar);
    }

    @Override // com.google.gson.l
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public i a() {
        if (!this.f7513a.isEmpty()) {
            i iVar = new i(this.f7513a.size());
            Iterator<l> it = this.f7513a.iterator();
            while (it.hasNext()) {
                iVar.y(it.next().a());
            }
            return iVar;
        }
        return new i();
    }

    public l G(int i5) {
        return this.f7513a.get(i5);
    }

    public l H(int i5) {
        return this.f7513a.remove(i5);
    }

    public boolean I(l lVar) {
        return this.f7513a.remove(lVar);
    }

    public l J(int i5, l lVar) {
        return this.f7513a.set(i5, lVar);
    }

    @Override // com.google.gson.l
    public BigDecimal c() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public BigInteger e() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f7513a.equals(this.f7513a));
    }

    @Override // com.google.gson.l
    public boolean f() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).f();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public byte h() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f7513a.hashCode();
    }

    @Override // com.google.gson.l
    public char i() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).i();
        }
        throw new IllegalStateException();
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.f7513a.iterator();
    }

    @Override // com.google.gson.l
    public double j() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).j();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public float k() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).k();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public int l() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).l();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public long q() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).q();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public Number r() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).r();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public short s() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).s();
        }
        throw new IllegalStateException();
    }

    public int size() {
        return this.f7513a.size();
    }

    @Override // com.google.gson.l
    public String t() {
        if (this.f7513a.size() == 1) {
            return this.f7513a.get(0).t();
        }
        throw new IllegalStateException();
    }

    public void y(l lVar) {
        if (lVar == null) {
            lVar = n.f7725a;
        }
        this.f7513a.add(lVar);
    }

    public void z(Boolean bool) {
        this.f7513a.add(bool == null ? n.f7725a : new r(bool));
    }

    public i(int i5) {
        this.f7513a = new ArrayList(i5);
    }
}
