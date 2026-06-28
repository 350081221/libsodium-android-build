package com.tencent.vasdolly.common;

/* loaded from: classes3.dex */
public final class Pair<A, B> {
    private final A mFirst;
    private final B mSecond;

    private Pair(A a5, B b5) {
        this.mFirst = a5;
        this.mSecond = b5;
    }

    public static <A, B> Pair<A, B> create(A a5, B b5) {
        return new Pair<>(a5, b5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Pair.class != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        A a5 = this.mFirst;
        if (a5 == null) {
            if (pair.mFirst != null) {
                return false;
            }
        } else if (!a5.equals(pair.mFirst)) {
            return false;
        }
        B b5 = this.mSecond;
        if (b5 == null) {
            if (pair.mSecond != null) {
                return false;
            }
        } else if (!b5.equals(pair.mSecond)) {
            return false;
        }
        return true;
    }

    public A getFirst() {
        return this.mFirst;
    }

    public B getSecond() {
        return this.mSecond;
    }

    public int hashCode() {
        int hashCode;
        A a5 = this.mFirst;
        int i5 = 0;
        if (a5 == null) {
            hashCode = 0;
        } else {
            hashCode = a5.hashCode();
        }
        int i6 = (hashCode + 31) * 31;
        B b5 = this.mSecond;
        if (b5 != null) {
            i5 = b5.hashCode();
        }
        return i6 + i5;
    }

    public String toString() {
        return "first = " + this.mFirst + " , second = " + this.mSecond;
    }
}
