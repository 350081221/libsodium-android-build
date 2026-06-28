package com.yuanqi.master.tools;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.mmkv.MMKV;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ!\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u0002H\u000e¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u0002H\u000e¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0019\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\u0002\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/yuanqi/master/tools/MMKVUtils;", "", "()V", "mmkv", "Lcom/tencent/mmkv/MMKV;", "getMmkv", "()Lcom/tencent/mmkv/MMKV;", "clearAll", "", "contains", "", DatabaseFileArchive.COLUMN_KEY, "", "decode", "T", "defValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "encode", t0.b.f22420d, "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "removeArray", "keys", "", "([Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final w0 f15264a = new w0();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final MMKV f15265b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f15266c;

    static {
        MMKV defaultMMKV = MMKV.defaultMMKV();
        kotlin.jvm.internal.l0.o(defaultMMKV, "defaultMMKV(...)");
        f15265b = defaultMMKV;
        f15266c = 8;
    }

    private w0() {
    }

    public final void a() {
        f15265b.clearAll();
    }

    public final boolean b(@p4.l String key) {
        kotlin.jvm.internal.l0.p(key, "key");
        return f15265b.contains(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T c(@p4.l String key, T t5) {
        kotlin.jvm.internal.l0.p(key, "key");
        if (t5 instanceof Integer) {
            return (T) Integer.valueOf(f15265b.decodeInt(key, ((Number) t5).intValue()));
        }
        if (t5 instanceof Long) {
            return (T) Long.valueOf(f15265b.decodeLong(key, ((Number) t5).longValue()));
        }
        if (t5 instanceof Float) {
            return (T) Float.valueOf(f15265b.decodeFloat(key, ((Number) t5).floatValue()));
        }
        if (t5 instanceof Double) {
            return (T) Double.valueOf(f15265b.decodeDouble(key, ((Number) t5).doubleValue()));
        }
        if (t5 instanceof Boolean) {
            return (T) Boolean.valueOf(f15265b.decodeBool(key, ((Boolean) t5).booleanValue()));
        }
        if (t5 instanceof String) {
            return (T) f15265b.decodeString(key, (String) t5);
        }
        return t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void d(@p4.l String key, T t5) {
        kotlin.jvm.internal.l0.p(key, "key");
        if (t5 instanceof Integer) {
            f15265b.encode(key, ((Number) t5).intValue());
            return;
        }
        if (t5 instanceof Long) {
            f15265b.encode(key, ((Number) t5).longValue());
            return;
        }
        if (t5 instanceof Float) {
            f15265b.encode(key, ((Number) t5).floatValue());
            return;
        }
        if (t5 instanceof Double) {
            f15265b.encode(key, ((Number) t5).doubleValue());
        } else if (t5 instanceof Boolean) {
            f15265b.encode(key, ((Boolean) t5).booleanValue());
        } else if (t5 instanceof String) {
            f15265b.encode(key, (String) t5);
        }
    }

    @p4.l
    public final MMKV e() {
        return f15265b;
    }

    public final void f(@p4.l String key) {
        kotlin.jvm.internal.l0.p(key, "key");
        f15265b.removeValueForKey(key);
    }

    public final void g(@p4.l String[] keys) {
        kotlin.jvm.internal.l0.p(keys, "keys");
        f15265b.removeValuesForKeys(keys);
    }
}
