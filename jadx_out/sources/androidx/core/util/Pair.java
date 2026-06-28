package androidx.core.util;

import a1.i;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f5, S s5) {
        this.first = f5;
        this.second = s5;
    }

    @NonNull
    public static <A, B> Pair<A, B> create(A a5, B b5) {
        return new Pair<>(a5, b5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!ObjectsCompat.equals(pair.first, this.first) || !ObjectsCompat.equals(pair.second, this.second)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f5 = this.first;
        int hashCode = f5 == null ? 0 : f5.hashCode();
        S s5 = this.second;
        return hashCode ^ (s5 != null ? s5.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.first + " " + this.second + i.f138d;
    }
}
