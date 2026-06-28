package com.bykv.a.a.a.a;

import android.util.SparseArray;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final ValueSet f3106c = b(0).k();

    /* renamed from: d, reason: collision with root package name */
    public static final Bridge f3107d = new C0103b();

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<Object> f3108a;

    /* renamed from: b, reason: collision with root package name */
    private ValueSet f3109b;

    /* renamed from: com.bykv.a.a.a.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0103b implements Bridge {
        private C0103b() {
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i5, ValueSet valueSet, Class<T> cls) {
            if (cls == Boolean.class) {
                return (T) Boolean.FALSE;
            }
            if (cls != Integer.TYPE && cls != Integer.class) {
                if (cls != Long.TYPE && cls != Long.class) {
                    if (cls != Double.TYPE && cls != Double.class) {
                        if (cls != Float.TYPE && cls != Float.class) {
                            return null;
                        }
                        return (T) new Float(0.0f);
                    }
                    return (T) new Double(0.0d);
                }
                return (T) new Long(0L);
            }
            return (T) new Integer(0);
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return b.f3106c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c implements ValueSet {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<Object> f3110a;

        /* renamed from: b, reason: collision with root package name */
        private ValueSet f3111b;

        /* renamed from: c, reason: collision with root package name */
        private int f3112c;

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public <T> T[] arrayValue(int i5, Class<T> cls) {
            Object obj = this.f3110a.get(i5);
            if (obj == null) {
                ValueSet valueSet = this.f3111b;
                if (valueSet == null) {
                    return null;
                }
                return (T[]) valueSet.arrayValue(i5, cls);
            }
            Class<?> cls2 = obj.getClass();
            if (!cls2.isArray() || !cls.isAssignableFrom(cls2.getComponentType())) {
                return null;
            }
            return (T[]) ((Object[]) obj);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean booleanValue(int i5) {
            return booleanValue(i5, false);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean containsKey(int i5) {
            ValueSet valueSet;
            int indexOfKey = this.f3110a.indexOfKey(i5);
            if (indexOfKey < 0 && (valueSet = this.f3111b) != null) {
                return valueSet.containsKey(i5);
            }
            if (indexOfKey >= 0) {
                return true;
            }
            return false;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public double doubleValue(int i5) {
            ValueSet valueSet;
            Object obj = this.f3110a.get(i5);
            if (obj == null && (valueSet = this.f3111b) != null) {
                return valueSet.doubleValue(i5);
            }
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            if (obj instanceof Double) {
                return ((Double) obj).doubleValue();
            }
            return 0.0d;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public float floatValue(int i5) {
            return floatValue(i5, 0.0f);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int intValue(int i5) {
            return intValue(i5, 0);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean isEmpty() {
            return size() <= 0;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public Set<Integer> keys() {
            int size = this.f3110a.size();
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < size; i5++) {
                hashSet.add(Integer.valueOf(this.f3110a.keyAt(i5)));
            }
            ValueSet valueSet = this.f3111b;
            if (valueSet != null) {
                hashSet.addAll(valueSet.keys());
            }
            this.f3112c = hashSet.size();
            return hashSet;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public long longValue(int i5) {
            return longValue(i5, 0L);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public <T> T objectValue(int i5, Class<T> cls) {
            Object obj = this.f3110a.get(i5);
            if (obj == null) {
                ValueSet valueSet = this.f3111b;
                if (valueSet == null) {
                    return null;
                }
                return (T) valueSet.objectValue(i5, cls);
            }
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            if (!cls.isInstance(obj)) {
                return null;
            }
            return (T) obj;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int size() {
            if (this.f3112c < 0) {
                keys();
            }
            return this.f3112c;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public String stringValue(int i5) {
            return stringValue(i5, null);
        }

        private c(SparseArray<Object> sparseArray, ValueSet valueSet) {
            this.f3112c = -1;
            this.f3110a = sparseArray;
            this.f3111b = valueSet;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean booleanValue(int i5, boolean z4) {
            ValueSet valueSet;
            Object obj = this.f3110a.get(i5);
            if (obj == null && (valueSet = this.f3111b) != null) {
                return valueSet.booleanValue(i5, z4);
            }
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z4;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public float floatValue(int i5, float f5) {
            ValueSet valueSet;
            Object obj = this.f3110a.get(i5);
            if (obj == null && (valueSet = this.f3111b) != null) {
                return valueSet.floatValue(i5, f5);
            }
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Float ? ((Float) obj).floatValue() : f5;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int intValue(int i5, int i6) {
            ValueSet valueSet;
            Object obj = this.f3110a.get(i5);
            if (obj == null && (valueSet = this.f3111b) != null) {
                return valueSet.intValue(i5, i6);
            }
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Integer ? ((Integer) obj).intValue() : i6;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public long longValue(int i5, long j5) {
            ValueSet valueSet;
            Object obj = this.f3110a.get(i5);
            if (obj == null && (valueSet = this.f3111b) != null) {
                return valueSet.longValue(i5, j5);
            }
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Long ? ((Long) obj).longValue() : j5;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public String stringValue(int i5, String str) {
            ValueSet valueSet;
            Object obj = this.f3110a.get(i5);
            if (obj != null || (valueSet = this.f3111b) == null) {
                return (obj instanceof ValueSet.ValueGetter ? ((ValueSet.ValueGetter) obj).get() : obj) instanceof String ? obj.toString() : str;
            }
            return valueSet.stringValue(i5, str);
        }
    }

    private b(SparseArray<Object> sparseArray, ValueSet valueSet) {
        this.f3108a = sparseArray;
        this.f3109b = valueSet;
    }

    public static final b a() {
        return new b(new SparseArray());
    }

    public static final b b(int i5) {
        return new b(new SparseArray(i5));
    }

    public static final b j(ValueSet valueSet) {
        return new b(new SparseArray(), valueSet);
    }

    public b c(int i5, double d5) {
        this.f3108a.put(i5, Double.valueOf(d5));
        return this;
    }

    public b d(int i5, float f5) {
        this.f3108a.put(i5, Float.valueOf(f5));
        return this;
    }

    public b e(int i5, int i6) {
        this.f3108a.put(i5, Integer.valueOf(i6));
        return this;
    }

    public b f(int i5, long j5) {
        this.f3108a.put(i5, Long.valueOf(j5));
        return this;
    }

    public b g(int i5, Object obj) {
        this.f3108a.put(i5, obj);
        return this;
    }

    public b h(int i5, String str) {
        this.f3108a.put(i5, str);
        return this;
    }

    public b i(int i5, boolean z4) {
        this.f3108a.put(i5, Boolean.valueOf(z4));
        return this;
    }

    public ValueSet k() {
        return new c(this.f3108a, this.f3109b);
    }

    private b(SparseArray<Object> sparseArray) {
        this.f3108a = sparseArray;
    }
}
