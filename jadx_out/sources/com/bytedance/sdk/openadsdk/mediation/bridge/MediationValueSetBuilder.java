package com.bytedance.sdk.openadsdk.mediation.bridge;

import android.util.SparseArray;
import com.bykv.vk.openvk.api.proto.ValueSet;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class MediationValueSetBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<Object> f5176a;

    /* loaded from: classes2.dex */
    public interface BooleanGetter extends ValueSet.ValueGetter<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface DoubleGetter extends ValueSet.ValueGetter<Double> {
    }

    /* loaded from: classes2.dex */
    public interface FloatGetter extends ValueSet.ValueGetter<Float> {
    }

    /* loaded from: classes2.dex */
    public interface IntGetter extends ValueSet.ValueGetter<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface LongGetter extends ValueSet.ValueGetter<Long> {
    }

    /* loaded from: classes2.dex */
    public interface ObjectGetter extends ValueSet.ValueGetter<Object> {
    }

    /* loaded from: classes2.dex */
    public interface StringGetter extends ValueSet.ValueGetter<String> {
    }

    /* loaded from: classes2.dex */
    private static final class ValueSetImpl implements ValueSet {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<Object> f5177a;

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public <T> T[] arrayValue(int i5, Class<T> cls) {
            Object obj = this.f5177a.get(i5);
            if (obj == null) {
                return null;
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
            return this.f5177a.indexOfKey(i5) >= 0;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public double doubleValue(int i5) {
            Object obj = this.f5177a.get(i5);
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
            int size = this.f5177a.size();
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < size; i5++) {
                hashSet.add(Integer.valueOf(i5));
            }
            return hashSet;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public long longValue(int i5) {
            return longValue(i5, 0L);
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public <T> T objectValue(int i5, Class<T> cls) {
            Object obj = this.f5177a.get(i5);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            if (cls.isInstance(obj)) {
                return (T) this.f5177a.get(i5);
            }
            return null;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int size() {
            SparseArray<Object> sparseArray = this.f5177a;
            if (sparseArray == null) {
                return 0;
            }
            return sparseArray.size();
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public String stringValue(int i5) {
            return stringValue(i5, null);
        }

        private ValueSetImpl(SparseArray<Object> sparseArray) {
            this.f5177a = sparseArray;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public boolean booleanValue(int i5, boolean z4) {
            Object obj = this.f5177a.get(i5);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z4;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public float floatValue(int i5, float f5) {
            Object obj = this.f5177a.get(i5);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Float ? ((Float) obj).floatValue() : f5;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public int intValue(int i5, int i6) {
            Object obj = this.f5177a.get(i5);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Integer ? ((Integer) obj).intValue() : i6;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public long longValue(int i5, long j5) {
            Object obj = this.f5177a.get(i5);
            if (obj instanceof ValueSet.ValueGetter) {
                obj = ((ValueSet.ValueGetter) obj).get();
            }
            return obj instanceof Long ? ((Long) obj).longValue() : j5;
        }

        @Override // com.bykv.vk.openvk.api.proto.ValueSet
        public String stringValue(int i5, String str) {
            Object obj = this.f5177a.get(i5);
            return (obj instanceof ValueSet.ValueGetter ? ((ValueSet.ValueGetter) obj).get() : obj) instanceof String ? obj.toString() : str;
        }
    }

    private MediationValueSetBuilder(SparseArray<Object> sparseArray) {
        this.f5176a = sparseArray;
    }

    public static final MediationValueSetBuilder create() {
        return new MediationValueSetBuilder(new SparseArray());
    }

    public MediationValueSetBuilder add(int i5, Object obj) {
        this.f5176a.put(i5, obj);
        return this;
    }

    public <T> MediationValueSetBuilder addArray(int i5, T[] tArr) {
        this.f5176a.put(i5, tArr);
        return this;
    }

    public ValueSet build() {
        return new ValueSetImpl(this.f5176a);
    }

    public static final MediationValueSetBuilder create(ValueSet valueSet) {
        if (valueSet != null && !valueSet.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            for (Integer num : valueSet.keys()) {
                sparseArray.put(num.intValue(), valueSet.objectValue(num.intValue(), Object.class));
            }
            return new MediationValueSetBuilder(sparseArray);
        }
        return new MediationValueSetBuilder(new SparseArray());
    }

    public MediationValueSetBuilder add(int i5, String str) {
        this.f5176a.put(i5, str);
        return this;
    }

    public MediationValueSetBuilder add(int i5, int i6) {
        this.f5176a.put(i5, Integer.valueOf(i6));
        return this;
    }

    public MediationValueSetBuilder add(int i5, double d5) {
        this.f5176a.put(i5, Double.valueOf(d5));
        return this;
    }

    public MediationValueSetBuilder add(int i5, boolean z4) {
        this.f5176a.put(i5, Boolean.valueOf(z4));
        return this;
    }

    public MediationValueSetBuilder add(int i5, long j5) {
        this.f5176a.put(i5, Long.valueOf(j5));
        return this;
    }

    public MediationValueSetBuilder add(int i5, float f5) {
        this.f5176a.put(i5, Float.valueOf(f5));
        return this;
    }

    public MediationValueSetBuilder add(int i5, ObjectGetter objectGetter) {
        this.f5176a.put(i5, objectGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i5, StringGetter stringGetter) {
        this.f5176a.put(i5, stringGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i5, DoubleGetter doubleGetter) {
        this.f5176a.put(i5, doubleGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i5, IntGetter intGetter) {
        this.f5176a.put(i5, intGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i5, BooleanGetter booleanGetter) {
        this.f5176a.put(i5, booleanGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i5, LongGetter longGetter) {
        this.f5176a.put(i5, longGetter);
        return this;
    }

    public MediationValueSetBuilder add(int i5, FloatGetter floatGetter) {
        this.f5176a.put(i5, floatGetter);
        return this;
    }
}
