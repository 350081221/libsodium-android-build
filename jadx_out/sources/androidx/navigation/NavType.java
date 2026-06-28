package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.AnyRes;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.io.Serializable;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.text.d;
import kotlin.text.e0;
import okhttp3.HttpUrl;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b&\u0018\u0000 !*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006!\"#$%&B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u0010J'\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Landroidx/navigation/NavType;", "T", "", "Landroid/os/Bundle;", "bundle", "", DatabaseFileArchive.COLUMN_KEY, t0.b.f22420d, "Lkotlin/r2;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "parseAndPut", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "serializeAsValue", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "", "isNullableAllowed", "Z", "()Z", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "<init>", "(Z)V", "Companion", "EnumType", "ParcelableArrayType", "ParcelableType", "SerializableArrayType", "SerializableType", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class NavType<T> {
    private final boolean isNullableAllowed;

    @l
    private final String name = "nav_type";

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final NavType<Integer> IntType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$IntType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return TypedValues.Custom.S_INT;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @l
        public Integer get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            Object obj = bundle.get(key);
            l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @l
        public Integer parseValue(@l String value) {
            boolean s22;
            int parseInt;
            int a5;
            l0.p(value, "value");
            s22 = e0.s2(value, "0x", false, 2, null);
            if (s22) {
                String substring = value.substring(2);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                a5 = d.a(16);
                parseInt = Integer.parseInt(substring, a5);
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void put(@l Bundle bundle, @l String key, int i5) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putInt(key, i5);
        }
    };

    @l
    @e
    public static final NavType<Integer> ReferenceType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return "reference";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @l
        @AnyRes
        public Integer get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            Object obj = bundle.get(key);
            l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @l
        public Integer parseValue(@l String value) {
            boolean s22;
            int parseInt;
            int a5;
            l0.p(value, "value");
            s22 = e0.s2(value, "0x", false, 2, null);
            if (s22) {
                String substring = value.substring(2);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                a5 = d.a(16);
                parseInt = Integer.parseInt(substring, a5);
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        public void put(@l Bundle bundle, @l String key, @AnyRes int i5) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putInt(key, i5);
        }
    };

    @l
    @e
    public static final NavType<int[]> IntArrayType = new NavType<int[]>() { // from class: androidx.navigation.NavType$Companion$IntArrayType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return "integer[]";
        }

        @Override // androidx.navigation.NavType
        @m
        public int[] get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(@l Bundle bundle, @l String key, @m int[] iArr) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putIntArray(key, iArr);
        }

        @Override // androidx.navigation.NavType
        @l
        public int[] parseValue(@l String value) {
            l0.p(value, "value");
            return new int[]{NavType.IntType.parseValue(value).intValue()};
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
        
            r3 = kotlin.collections.o.s3(r3, parseValue(r2));
         */
        @Override // androidx.navigation.NavType
        @p4.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int[] parseValue(@p4.l java.lang.String r2, @p4.m int[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.l0.p(r2, r0)
                if (r3 == 0) goto L12
                int[] r0 = r1.parseValue(r2)
                int[] r3 = kotlin.collections.l.s3(r3, r0)
                if (r3 != 0) goto L16
            L12:
                int[] r3 = r1.parseValue(r2)
            L16:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$IntArrayType$1.parseValue(java.lang.String, int[]):int[]");
        }
    };

    @l
    @e
    public static final NavType<Long> LongType = new NavType<Long>() { // from class: androidx.navigation.NavType$Companion$LongType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return MethodReflectParams.LONG;
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Long l5) {
            put(bundle, str, l5.longValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @l
        public Long get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            Object obj = bundle.get(key);
            l0.n(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @l
        public Long parseValue(@l String value) {
            boolean J1;
            String str;
            boolean s22;
            long parseLong;
            int a5;
            l0.p(value, "value");
            J1 = e0.J1(value, "L", false, 2, null);
            if (J1) {
                str = value.substring(0, value.length() - 1);
                l0.o(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = value;
            }
            s22 = e0.s2(value, "0x", false, 2, null);
            if (s22) {
                String substring = str.substring(2);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                a5 = d.a(16);
                parseLong = Long.parseLong(substring, a5);
            } else {
                parseLong = Long.parseLong(str);
            }
            return Long.valueOf(parseLong);
        }

        public void put(@l Bundle bundle, @l String key, long j5) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putLong(key, j5);
        }
    };

    @l
    @e
    public static final NavType<long[]> LongArrayType = new NavType<long[]>() { // from class: androidx.navigation.NavType$Companion$LongArrayType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return "long[]";
        }

        @Override // androidx.navigation.NavType
        @m
        public long[] get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(@l Bundle bundle, @l String key, @m long[] jArr) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putLongArray(key, jArr);
        }

        @Override // androidx.navigation.NavType
        @l
        public long[] parseValue(@l String value) {
            l0.p(value, "value");
            return new long[]{NavType.LongType.parseValue(value).longValue()};
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
        
            r3 = kotlin.collections.o.v3(r3, parseValue(r2));
         */
        @Override // androidx.navigation.NavType
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long[] parseValue(@p4.l java.lang.String r2, @p4.m long[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.l0.p(r2, r0)
                if (r3 == 0) goto L12
                long[] r0 = r1.parseValue(r2)
                long[] r3 = kotlin.collections.l.v3(r3, r0)
                if (r3 != 0) goto L16
            L12:
                long[] r3 = r1.parseValue(r2)
            L16:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$LongArrayType$1.parseValue(java.lang.String, long[]):long[]");
        }
    };

    @l
    @e
    public static final NavType<Float> FloatType = new NavType<Float>() { // from class: androidx.navigation.NavType$Companion$FloatType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return "float";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Float f5) {
            put(bundle, str, f5.floatValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @l
        public Float get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            Object obj = bundle.get(key);
            l0.n(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @l
        public Float parseValue(@l String value) {
            l0.p(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void put(@l Bundle bundle, @l String key, float f5) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putFloat(key, f5);
        }
    };

    @l
    @e
    public static final NavType<float[]> FloatArrayType = new NavType<float[]>() { // from class: androidx.navigation.NavType$Companion$FloatArrayType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return "float[]";
        }

        @Override // androidx.navigation.NavType
        @m
        public float[] get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(@l Bundle bundle, @l String key, @m float[] fArr) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putFloatArray(key, fArr);
        }

        @Override // androidx.navigation.NavType
        @l
        public float[] parseValue(@l String value) {
            l0.p(value, "value");
            return new float[]{NavType.FloatType.parseValue(value).floatValue()};
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
        
            r3 = kotlin.collections.o.p3(r3, parseValue(r2));
         */
        @Override // androidx.navigation.NavType
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public float[] parseValue(@p4.l java.lang.String r2, @p4.m float[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.l0.p(r2, r0)
                if (r3 == 0) goto L12
                float[] r0 = r1.parseValue(r2)
                float[] r3 = kotlin.collections.l.p3(r3, r0)
                if (r3 != 0) goto L16
            L12:
                float[] r3 = r1.parseValue(r2)
            L16:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$FloatArrayType$1.parseValue(java.lang.String, float[]):float[]");
        }
    };

    @l
    @e
    public static final NavType<Boolean> BoolType = new NavType<Boolean>() { // from class: androidx.navigation.NavType$Companion$BoolType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return "boolean";
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Boolean bool) {
            put(bundle, str, bool.booleanValue());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @m
        public Boolean get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (Boolean) bundle.get(key);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @l
        public Boolean parseValue(@l String value) {
            boolean z4;
            l0.p(value, "value");
            if (l0.g(value, "true")) {
                z4 = true;
            } else {
                if (!l0.g(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }

        public void put(@l Bundle bundle, @l String key, boolean z4) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putBoolean(key, z4);
        }
    };

    @l
    @e
    public static final NavType<boolean[]> BoolArrayType = new NavType<boolean[]>() { // from class: androidx.navigation.NavType$Companion$BoolArrayType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return "boolean[]";
        }

        @Override // androidx.navigation.NavType
        @m
        public boolean[] get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(@l Bundle bundle, @l String key, @m boolean[] zArr) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putBooleanArray(key, zArr);
        }

        @Override // androidx.navigation.NavType
        @l
        public boolean[] parseValue(@l String value) {
            l0.p(value, "value");
            return new boolean[]{NavType.BoolType.parseValue(value).booleanValue()};
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
        
            r3 = kotlin.collections.o.E3(r3, parseValue2(r2));
         */
        @Override // androidx.navigation.NavType
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean[] parseValue(@p4.l java.lang.String r2, @p4.m boolean[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.l0.p(r2, r0)
                if (r3 == 0) goto L12
                boolean[] r0 = r1.parseValue(r2)
                boolean[] r3 = kotlin.collections.l.E3(r3, r0)
                if (r3 != 0) goto L16
            L12:
                boolean[] r3 = r1.parseValue(r2)
            L16:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$BoolArrayType$1.parseValue(java.lang.String, boolean[]):boolean[]");
        }
    };

    @l
    @e
    public static final NavType<String> StringType = new NavType<String>() { // from class: androidx.navigation.NavType$Companion$StringType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return TypedValues.Custom.S_STRING;
        }

        @Override // androidx.navigation.NavType
        @m
        public String get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (String) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        @m
        public String parseValue(@l String value) {
            l0.p(value, "value");
            if (l0.g(value, "null")) {
                return null;
            }
            return value;
        }

        @Override // androidx.navigation.NavType
        public void put(@l Bundle bundle, @l String key, @m String str) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putString(key, str);
        }

        @Override // androidx.navigation.NavType
        @l
        public String serializeAsValue(@m String str) {
            String encode = str != null ? Uri.encode(str) : null;
            return encode == null ? "null" : encode;
        }
    };

    @l
    @e
    public static final NavType<String[]> StringArrayType = new NavType<String[]>() { // from class: androidx.navigation.NavType$Companion$StringArrayType$1
        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            return "string[]";
        }

        @Override // androidx.navigation.NavType
        @l
        public String[] parseValue(@l String value) {
            l0.p(value, "value");
            return new String[]{value};
        }

        @Override // androidx.navigation.NavType
        @m
        public String[] get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        public void put(@l Bundle bundle, @l String key, @m String[] strArr) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            bundle.putStringArray(key, strArr);
        }

        @Override // androidx.navigation.NavType
        @m
        public String[] parseValue(@l String value, @m String[] strArr) {
            Object[] y32;
            l0.p(value, "value");
            if (strArr != null) {
                y32 = o.y3(strArr, parseValue(value));
                String[] strArr2 = (String[]) y32;
                if (strArr2 != null) {
                    return strArr2;
                }
            }
            return parseValue(value);
        }
    };

    @i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0017J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u0017H\u0007J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0007R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/navigation/NavType$Companion;", "", "()V", "BoolArrayType", "Landroidx/navigation/NavType;", "", "BoolType", "", "FloatArrayType", "", "FloatType", "", "IntArrayType", "", "IntType", "", "LongArrayType", "", "LongType", "", "ReferenceType", "StringArrayType", "", "", "StringType", "fromArgType", "type", TTDownloadField.TT_PACKAGE_NAME, "inferFromValue", t0.b.f22420d, "inferFromValueType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @u3.m
        public NavType<?> fromArgType(@m String str, @m String str2) {
            boolean z4;
            boolean s22;
            String str3;
            boolean J1;
            NavType<Integer> navType = NavType.IntType;
            if (l0.g(navType.getName(), str)) {
                return navType;
            }
            NavType navType2 = NavType.IntArrayType;
            if (l0.g(navType2.getName(), str)) {
                return navType2;
            }
            NavType<Long> navType3 = NavType.LongType;
            if (l0.g(navType3.getName(), str)) {
                return navType3;
            }
            NavType navType4 = NavType.LongArrayType;
            if (l0.g(navType4.getName(), str)) {
                return navType4;
            }
            NavType<Boolean> navType5 = NavType.BoolType;
            if (l0.g(navType5.getName(), str)) {
                return navType5;
            }
            NavType navType6 = NavType.BoolArrayType;
            if (l0.g(navType6.getName(), str)) {
                return navType6;
            }
            NavType<String> navType7 = NavType.StringType;
            if (l0.g(navType7.getName(), str)) {
                return navType7;
            }
            NavType navType8 = NavType.StringArrayType;
            if (l0.g(navType8.getName(), str)) {
                return navType8;
            }
            NavType<Float> navType9 = NavType.FloatType;
            if (l0.g(navType9.getName(), str)) {
                return navType9;
            }
            NavType navType10 = NavType.FloatArrayType;
            if (l0.g(navType10.getName(), str)) {
                return navType10;
            }
            NavType<Integer> navType11 = NavType.ReferenceType;
            if (l0.g(navType11.getName(), str)) {
                return navType11;
            }
            if (str != null && str.length() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4) {
                try {
                    s22 = e0.s2(str, ".", false, 2, null);
                    if (s22 && str2 != null) {
                        str3 = str2 + str;
                    } else {
                        str3 = str;
                    }
                    J1 = e0.J1(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false, 2, null);
                    if (J1) {
                        str3 = str3.substring(0, str3.length() - 2);
                        l0.o(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                        Class<?> cls = Class.forName(str3);
                        if (Parcelable.class.isAssignableFrom(cls)) {
                            l0.n(cls, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            return new ParcelableArrayType(cls);
                        }
                        if (Serializable.class.isAssignableFrom(cls)) {
                            l0.n(cls, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            return new SerializableArrayType(cls);
                        }
                    } else {
                        Class<?> cls2 = Class.forName(str3);
                        if (Parcelable.class.isAssignableFrom(cls2)) {
                            l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                            return new ParcelableType(cls2);
                        }
                        if (Enum.class.isAssignableFrom(cls2)) {
                            l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                            return new EnumType(cls2);
                        }
                        if (Serializable.class.isAssignableFrom(cls2)) {
                            l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            return new SerializableType(cls2);
                        }
                    }
                    throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
                } catch (ClassNotFoundException e5) {
                    throw new RuntimeException(e5);
                }
            }
            return navType7;
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @u3.m
        public final NavType<Object> inferFromValue(@l String value) {
            l0.p(value, "value");
            try {
                try {
                    try {
                        try {
                            NavType<Integer> navType = NavType.IntType;
                            navType.parseValue(value);
                            l0.n(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return navType;
                        } catch (IllegalArgumentException unused) {
                            NavType<Boolean> navType2 = NavType.BoolType;
                            navType2.parseValue(value);
                            l0.n(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return navType2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        NavType<Long> navType3 = NavType.LongType;
                        navType3.parseValue(value);
                        l0.n(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType3;
                    }
                } catch (IllegalArgumentException unused3) {
                    NavType<Float> navType4 = NavType.FloatType;
                    navType4.parseValue(value);
                    l0.n(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType4;
                }
            } catch (IllegalArgumentException unused4) {
                NavType<String> navType5 = NavType.StringType;
                l0.n(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType5;
            }
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @u3.m
        public final NavType<Object> inferFromValueType(@m Object obj) {
            NavType<Object> serializableType;
            if (obj instanceof Integer) {
                NavType<Integer> navType = NavType.IntType;
                l0.n(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType;
            }
            if (obj instanceof int[]) {
                NavType<int[]> navType2 = NavType.IntArrayType;
                l0.n(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType2;
            }
            if (obj instanceof Long) {
                NavType<Long> navType3 = NavType.LongType;
                l0.n(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType3;
            }
            if (obj instanceof long[]) {
                NavType<long[]> navType4 = NavType.LongArrayType;
                l0.n(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            }
            if (obj instanceof Float) {
                NavType<Float> navType5 = NavType.FloatType;
                l0.n(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType5;
            }
            if (obj instanceof float[]) {
                NavType<float[]> navType6 = NavType.FloatArrayType;
                l0.n(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType6;
            }
            if (obj instanceof Boolean) {
                NavType<Boolean> navType7 = NavType.BoolType;
                l0.n(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType7;
            }
            if (obj instanceof boolean[]) {
                NavType<boolean[]> navType8 = NavType.BoolArrayType;
                l0.n(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType8;
            }
            if (!(obj instanceof String) && obj != null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    NavType<String[]> navType9 = NavType.StringArrayType;
                    l0.n(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType9;
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    l0.m(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        l0.n(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        serializableType = new ParcelableArrayType<>(componentType2);
                        return serializableType;
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    l0.m(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        l0.n(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        serializableType = new SerializableArrayType<>(componentType4);
                        return serializableType;
                    }
                }
                if (obj instanceof Parcelable) {
                    serializableType = new ParcelableType<>(obj.getClass());
                } else if (obj instanceof Enum) {
                    serializableType = new EnumType<>(obj.getClass());
                } else if (obj instanceof Serializable) {
                    serializableType = new SerializableType<>(obj.getClass());
                } else {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                return serializableType;
            }
            NavType<String> navType10 = NavType.StringType;
            l0.n(navType10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return navType10;
        }
    }

    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/navigation/NavType$ParcelableArrayType;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/NavType;", "", "Landroid/os/Bundle;", "bundle", "", DatabaseFileArchive.COLUMN_KEY, t0.b.f22420d, "Lkotlin/r2;", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "parseValue", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Ljava/lang/Class;", "arrayType", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name", "type", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {

        @l
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(@l Class<D> type) {
            super(true);
            l0.p(type, "type");
            if (Parcelable.class.isAssignableFrom(type)) {
                try {
                    Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                    l0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                    this.arrayType = cls;
                    return;
                } catch (ClassNotFoundException e5) {
                    throw new RuntimeException(e5);
                }
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && l0.g(ParcelableArrayType.class, obj.getClass())) {
                return l0.g(this.arrayType, ((ParcelableArrayType) obj).arrayType);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            String name = this.arrayType.getName();
            l0.o(name, "arrayType.name");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        @m
        public D[] get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        @l
        public D[] parseValue(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@l Bundle bundle, @l String key, @m D[] dArr) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            this.arrayType.cast(dArr);
            bundle.putParcelableArray(key, dArr);
        }
    }

    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/navigation/NavType$ParcelableType;", "D", "Landroidx/navigation/NavType;", "Landroid/os/Bundle;", "bundle", "", DatabaseFileArchive.COLUMN_KEY, t0.b.f22420d, "Lkotlin/r2;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Ljava/lang/Class;", "type", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class ParcelableType<D> extends NavType<D> {

        @l
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(@l Class<D> type) {
            super(true);
            l0.p(type, "type");
            boolean z4 = true;
            if (!Parcelable.class.isAssignableFrom(type) && !Serializable.class.isAssignableFrom(type)) {
                z4 = false;
            }
            if (z4) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && l0.g(ParcelableType.class, obj.getClass())) {
                return l0.g(this.type, ((ParcelableType) obj).type);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        @m
        public D get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            String name = this.type.getName();
            l0.o(name, "type.name");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D parseValue(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@l Bundle bundle, @l String key, D d5) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            this.type.cast(d5);
            if (d5 != null && !(d5 instanceof Parcelable)) {
                if (d5 instanceof Serializable) {
                    bundle.putSerializable(key, (Serializable) d5);
                    return;
                }
                return;
            }
            bundle.putParcelable(key, (Parcelable) d5);
        }
    }

    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/navigation/NavType$SerializableArrayType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "", "Landroid/os/Bundle;", "bundle", "", DatabaseFileArchive.COLUMN_KEY, t0.b.f22420d, "Lkotlin/r2;", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Ljava/lang/Class;", "arrayType", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name", "type", "<init>", "(Ljava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {

        @l
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(@l Class<D> type) {
            super(true);
            l0.p(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                try {
                    Class<D[]> cls = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
                    l0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                    this.arrayType = cls;
                    return;
                } catch (ClassNotFoundException e5) {
                    throw new RuntimeException(e5);
                }
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && l0.g(SerializableArrayType.class, obj.getClass())) {
                return l0.g(this.arrayType, ((SerializableArrayType) obj).arrayType);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            String name = this.arrayType.getName();
            l0.o(name, "arrayType.name");
            return name;
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        @m
        public D[] get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        @l
        public D[] parseValue(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public void put(@l Bundle bundle, @l String key, @m D[] dArr) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            this.arrayType.cast(dArr);
            bundle.putSerializable(key, dArr);
        }
    }

    @i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u001dB\u001f\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0012\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u001fJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Landroidx/navigation/NavType$SerializableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Landroid/os/Bundle;", "bundle", "", DatabaseFileArchive.COLUMN_KEY, t0.b.f22420d, "Lkotlin/r2;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Ljava/lang/Class;", "type", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name", "<init>", "(Ljava/lang/Class;)V", "nullableAllowed", "(ZLjava/lang/Class;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$SerializableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,936:1\n1#2:937\n*E\n"})
    /* loaded from: classes2.dex */
    public static class SerializableType<D extends Serializable> extends NavType<D> {

        @l
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(@l Class<D> type) {
            super(true);
            l0.p(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                if (true ^ type.isEnum()) {
                    this.type = type;
                    return;
                }
                throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableType)) {
                return false;
            }
            return l0.g(this.type, ((SerializableType) obj).type);
        }

        @Override // androidx.navigation.NavType
        @l
        public String getName() {
            String name = this.type.getName();
            l0.o(name, "type.name");
            return name;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        @m
        public D get(@l Bundle bundle, @l String key) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        @l
        public D parseValue(@l String value) {
            l0.p(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@l Bundle bundle, @l String key, @l D value) {
            l0.p(bundle, "bundle");
            l0.p(key, "key");
            l0.p(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z4, @l Class<D> type) {
            super(z4);
            l0.p(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }

    public NavType(boolean z4) {
        this.isNullableAllowed = z4;
    }

    @l
    @u3.m
    public static NavType<?> fromArgType(@m String str, @m String str2) {
        return Companion.fromArgType(str, str2);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @u3.m
    public static final NavType<Object> inferFromValue(@l String str) {
        return Companion.inferFromValue(str);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @u3.m
    public static final NavType<Object> inferFromValueType(@m Object obj) {
        return Companion.inferFromValueType(obj);
    }

    @m
    public abstract T get(@l Bundle bundle, @l String str);

    @l
    public String getName() {
        return this.name;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(@l Bundle bundle, @l String key, @l String value) {
        l0.p(bundle, "bundle");
        l0.p(key, "key");
        l0.p(value, "value");
        T parseValue = parseValue(value);
        put(bundle, key, parseValue);
        return parseValue;
    }

    public abstract T parseValue(@l String str);

    public T parseValue(@l String value, T t5) {
        l0.p(value, "value");
        return parseValue(value);
    }

    public abstract void put(@l Bundle bundle, @l String str, T t5);

    @l
    public String serializeAsValue(T t5) {
        return String.valueOf(t5);
    }

    @l
    public String toString() {
        return getName();
    }

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/navigation/NavType$EnumType;", "D", "", "Landroidx/navigation/NavType$SerializableType;", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "name", "", "getName", "()Ljava/lang/String;", "parseValue", t0.b.f22420d, "(Ljava/lang/String;)Ljava/lang/Enum;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,936:1\n1#2:937\n1282#3,2:938\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n*L\n859#1:938,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {

        @l
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(@l Class<D> type) {
            super(false, type);
            l0.p(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        @l
        public String getName() {
            String name = this.type.getName();
            l0.o(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        @l
        public D parseValue(@l String value) {
            D d5;
            boolean K1;
            l0.p(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            l0.o(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    d5 = null;
                    break;
                }
                d5 = enumConstants[i5];
                K1 = e0.K1(d5.name(), value, true);
                if (K1) {
                    break;
                }
                i5++;
            }
            D d6 = d5;
            if (d6 != null) {
                return d6;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + external.org.apache.commons.lang3.d.f15957a);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(@l Bundle bundle, @l String key, @m String str, T t5) {
        l0.p(bundle, "bundle");
        l0.p(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str == null) {
            return t5;
        }
        T parseValue = parseValue(str, t5);
        put(bundle, key, parseValue);
        return parseValue;
    }
}
