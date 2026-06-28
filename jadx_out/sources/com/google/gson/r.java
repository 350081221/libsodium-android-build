package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class r extends l {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f7727b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a, reason: collision with root package name */
    private Object f7728a;

    public r(Boolean bool) {
        E(bool);
    }

    private static boolean A(r rVar) {
        Object obj = rVar.f7728a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    private static boolean C(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f7727b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean B() {
        return this.f7728a instanceof Number;
    }

    public boolean D() {
        return this.f7728a instanceof String;
    }

    void E(Object obj) {
        boolean z4;
        if (obj instanceof Character) {
            this.f7728a = String.valueOf(((Character) obj).charValue());
            return;
        }
        if (!(obj instanceof Number) && !C(obj)) {
            z4 = false;
        } else {
            z4 = true;
        }
        com.google.gson.internal.a.a(z4);
        this.f7728a = obj;
    }

    @Override // com.google.gson.l
    public BigDecimal c() {
        Object obj = this.f7728a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(this.f7728a.toString());
    }

    @Override // com.google.gson.l
    public BigInteger e() {
        Object obj = this.f7728a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return new BigInteger(this.f7728a.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f7728a == null) {
            if (rVar.f7728a == null) {
                return true;
            }
            return false;
        }
        if (A(this) && A(rVar)) {
            if (r().longValue() == rVar.r().longValue()) {
                return true;
            }
            return false;
        }
        Object obj2 = this.f7728a;
        if ((obj2 instanceof Number) && (rVar.f7728a instanceof Number)) {
            double doubleValue = r().doubleValue();
            double doubleValue2 = rVar.r().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            return false;
        }
        return obj2.equals(rVar.f7728a);
    }

    @Override // com.google.gson.l
    public boolean f() {
        if (z()) {
            return g().booleanValue();
        }
        return Boolean.parseBoolean(t());
    }

    @Override // com.google.gson.l
    Boolean g() {
        return (Boolean) this.f7728a;
    }

    @Override // com.google.gson.l
    public byte h() {
        return B() ? r().byteValue() : Byte.parseByte(t());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f7728a == null) {
            return 31;
        }
        if (A(this)) {
            doubleToLongBits = r().longValue();
        } else {
            Object obj = this.f7728a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(r().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.google.gson.l
    public char i() {
        return t().charAt(0);
    }

    @Override // com.google.gson.l
    public double j() {
        return B() ? r().doubleValue() : Double.parseDouble(t());
    }

    @Override // com.google.gson.l
    public float k() {
        return B() ? r().floatValue() : Float.parseFloat(t());
    }

    @Override // com.google.gson.l
    public int l() {
        return B() ? r().intValue() : Integer.parseInt(t());
    }

    @Override // com.google.gson.l
    public long q() {
        return B() ? r().longValue() : Long.parseLong(t());
    }

    @Override // com.google.gson.l
    public Number r() {
        Object obj = this.f7728a;
        return obj instanceof String ? new com.google.gson.internal.h((String) obj) : (Number) obj;
    }

    @Override // com.google.gson.l
    public short s() {
        return B() ? r().shortValue() : Short.parseShort(t());
    }

    @Override // com.google.gson.l
    public String t() {
        if (B()) {
            return r().toString();
        }
        if (z()) {
            return g().toString();
        }
        return (String) this.f7728a;
    }

    @Override // com.google.gson.l
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public r a() {
        return this;
    }

    public boolean z() {
        return this.f7728a instanceof Boolean;
    }

    public r(Number number) {
        E(number);
    }

    public r(String str) {
        E(str);
    }

    public r(Character ch) {
        E(ch);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Object obj) {
        E(obj);
    }
}
