package com.airbnb.lottie.model;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f1503c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f1504a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private f f1505b;

    public e(String... strArr) {
        this.f1504a = Arrays.asList(strArr);
    }

    private boolean b() {
        return this.f1504a.get(r0.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public e a(String str) {
        e eVar = new e(this);
        eVar.f1504a.add(str);
        return eVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(String str, int i5) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (i5 >= this.f1504a.size()) {
            return false;
        }
        if (i5 == this.f1504a.size() - 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        String str2 = this.f1504a.get(i5);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals(org.slf4j.d.ANY_MARKER)) {
                z6 = false;
            } else {
                z6 = true;
            }
            if ((!z4 && (i5 != this.f1504a.size() - 2 || !b())) || !z6) {
                return false;
            }
            return true;
        }
        if (!z4 && this.f1504a.get(i5 + 1).equals(str)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (i5 != this.f1504a.size() - 2 && (i5 != this.f1504a.size() - 3 || !b())) {
                return false;
            }
            return true;
        }
        if (z4) {
            return true;
        }
        int i6 = i5 + 1;
        if (i6 < this.f1504a.size() - 1) {
            return false;
        }
        return this.f1504a.get(i6).equals(str);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public f d() {
        return this.f1505b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e(String str, int i5) {
        if (f(str)) {
            return 0;
        }
        if (!this.f1504a.get(i5).equals("**")) {
            return 1;
        }
        if (i5 == this.f1504a.size() - 1 || !this.f1504a.get(i5 + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f1504a.equals(eVar.f1504a)) {
            return false;
        }
        f fVar = this.f1505b;
        f fVar2 = eVar.f1505b;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public String g() {
        return this.f1504a.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean h(String str, int i5) {
        if (f(str)) {
            return true;
        }
        if (i5 >= this.f1504a.size()) {
            return false;
        }
        if (this.f1504a.get(i5).equals(str) || this.f1504a.get(i5).equals("**") || this.f1504a.get(i5).equals(org.slf4j.d.ANY_MARKER)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i5;
        int hashCode = this.f1504a.hashCode() * 31;
        f fVar = this.f1505b;
        if (fVar != null) {
            i5 = fVar.hashCode();
        } else {
            i5 = 0;
        }
        return hashCode + i5;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean i(String str, int i5) {
        if ("__container".equals(str) || i5 < this.f1504a.size() - 1 || this.f1504a.get(i5).equals("**")) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public e j(f fVar) {
        e eVar = new e(this);
        eVar.f1505b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f1504a);
        sb.append(",resolved=");
        sb.append(this.f1505b != null);
        sb.append('}');
        return sb.toString();
    }

    private e(e eVar) {
        this.f1504a = new ArrayList(eVar.f1504a);
        this.f1505b = eVar.f1505b;
    }
}
