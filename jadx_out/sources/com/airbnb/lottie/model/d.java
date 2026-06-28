package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.content.q;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final List<q> f1497a;

    /* renamed from: b, reason: collision with root package name */
    private final char f1498b;

    /* renamed from: c, reason: collision with root package name */
    private final double f1499c;

    /* renamed from: d, reason: collision with root package name */
    private final double f1500d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1501e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1502f;

    public d(List<q> list, char c5, double d5, double d6, String str, String str2) {
        this.f1497a = list;
        this.f1498b = c5;
        this.f1499c = d5;
        this.f1500d = d6;
        this.f1501e = str;
        this.f1502f = str2;
    }

    public static int c(char c5, String str, String str2) {
        return (((c5 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f1497a;
    }

    public double b() {
        return this.f1500d;
    }

    public int hashCode() {
        return c(this.f1498b, this.f1502f, this.f1501e);
    }
}
