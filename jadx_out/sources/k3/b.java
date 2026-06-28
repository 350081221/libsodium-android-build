package k3;

import external.org.apache.commons.lang3.f;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class b<L, R> implements Map.Entry<L, R>, Comparable<b<L, R>>, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    public static <L, R> b<L, R> of(L l5, R r5) {
        return new a(l5, r5);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (f.f(getKey(), entry.getKey()) && f.f(getValue(), entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return getLeft();
    }

    public abstract L getLeft();

    public abstract R getRight();

    @Override // java.util.Map.Entry
    public R getValue() {
        return getRight();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int hashCode;
        int i5 = 0;
        if (getKey() == null) {
            hashCode = 0;
        } else {
            hashCode = getKey().hashCode();
        }
        if (getValue() != null) {
            i5 = getValue().hashCode();
        }
        return hashCode ^ i5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(getLeft());
        sb.append(',');
        sb.append(getRight());
        sb.append(')');
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(b<L, R> bVar) {
        return new external.org.apache.commons.lang3.builder.b().g(getLeft(), bVar.getLeft()).g(getRight(), bVar.getRight()).C();
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getRight());
    }
}
