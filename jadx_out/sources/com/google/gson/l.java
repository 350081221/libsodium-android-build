package com.google.gson;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public abstract class l {
    public abstract l a();

    public BigDecimal c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    Boolean g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public char i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public i m() {
        if (u()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n n() {
        if (v()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public o o() {
        if (w()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public r p() {
        if (x()) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long q() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short s() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String t() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            com.google.gson.internal.n.b(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public boolean u() {
        return this instanceof i;
    }

    public boolean v() {
        return this instanceof n;
    }

    public boolean w() {
        return this instanceof o;
    }

    public boolean x() {
        return this instanceof r;
    }
}
