package com.huawei.hms.common.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class Objects {

    /* loaded from: classes3.dex */
    public static final class ToStringHelper {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f8366a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f8367b;

        public final ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str2.length() + valueOf.length() + 1);
            sb.append(str2);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(valueOf);
            this.f8366a.add(sb.toString());
            return this;
        }

        public final String toString() {
            String simpleName = this.f8367b.getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(100);
            sb.append(simpleName);
            sb.append('{');
            int size = this.f8366a.size();
            for (int i5 = 0; i5 < size; i5++) {
                sb.append(this.f8366a.get(i5));
                if (i5 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }

        public ToStringHelper(Object obj) {
            this.f8367b = Preconditions.checkNotNull(obj);
            this.f8366a = new ArrayList();
        }
    }

    public Objects() {
        throw new AssertionError("Uninstantiable");
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }
}
