package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.h;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collection;
import java.util.Map;
import kotlin.text.k0;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class JSONEncodeUtil {
    boolean expectObjectNull;
    boolean useAnnotation;

    public JSONEncodeUtil() {
        this(true);
    }

    public JSONEncodeUtil(boolean z4) {
        this.expectObjectNull = false;
        this.useAnnotation = z4;
    }

    public JSONEncodeUtil(boolean z4, boolean z5) {
        this.useAnnotation = z4;
        this.expectObjectNull = z5;
    }

    private void accessible(final Field field) {
        if (field.isAccessible()) {
            return;
        }
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.agconnect.https.adapter.JSONEncodeUtil.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                field.setAccessible(true);
                return null;
            }
        });
    }

    private String addJsonArrayEnding(StringBuilder sb) {
        if (sb.length() == 1) {
            sb.append(']');
        } else {
            sb.setCharAt(sb.length() - 1, ']');
        }
        return sb.toString();
    }

    private String array2Json(Object[] objArr) throws JSONException {
        StringBuilder sb = new StringBuilder(objArr.length << 4);
        sb.append('[');
        for (Object obj : objArr) {
            sb.append(toJson(obj));
            sb.append(',');
        }
        return addJsonArrayEnding(sb);
    }

    private String baseTypeArray2Json(Object obj) {
        if (obj instanceof int[]) {
            return intArray2Json((int[]) obj);
        }
        if (obj instanceof boolean[]) {
            return booleanArray2Json((boolean[]) obj);
        }
        if (obj instanceof long[]) {
            return longArray2Json((long[]) obj);
        }
        if (obj instanceof float[]) {
            return floatArray2Json((float[]) obj);
        }
        if (obj instanceof double[]) {
            return doubleArray2Json((double[]) obj);
        }
        if (obj instanceof short[]) {
            return shortArray2Json((short[]) obj);
        }
        if (obj instanceof byte[]) {
            return byteArray2Json((byte[]) obj);
        }
        return null;
    }

    private String boolean2Json(Boolean bool) {
        return bool.toString();
    }

    private String booleanArray2Json(boolean[] zArr) {
        StringBuilder sb = new StringBuilder(zArr.length << 4);
        sb.append('[');
        for (boolean z4 : zArr) {
            sb.append(z4);
            sb.append(',');
        }
        return addJsonArrayEnding(sb);
    }

    private String byteArray2Json(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length << 4);
        sb.append('[');
        for (byte b5 : bArr) {
            sb.append(Byte.toString(b5));
            sb.append(',');
        }
        return addJsonArrayEnding(sb);
    }

    private String collection2Json(Collection<Object> collection) throws JSONException {
        return toJson(collection.toArray(new Object[0]));
    }

    private String doubleArray2Json(double[] dArr) {
        StringBuilder sb = new StringBuilder(dArr.length << 4);
        sb.append('[');
        for (double d5 : dArr) {
            sb.append(d5);
            sb.append(',');
        }
        return addJsonArrayEnding(sb);
    }

    private String floatArray2Json(float[] fArr) {
        StringBuilder sb = new StringBuilder(fArr.length << 4);
        sb.append('[');
        for (float f5 : fArr) {
            sb.append(f5);
            sb.append(',');
        }
        return addJsonArrayEnding(sb);
    }

    private String getKey(Field field) {
        if (this.useAnnotation) {
            if (!field.isAnnotationPresent(com.huawei.agconnect.https.annotation.Field.class)) {
                return "";
            }
            String value = ((com.huawei.agconnect.https.annotation.Field) field.getAnnotation(com.huawei.agconnect.https.annotation.Field.class)).value();
            if (!h.a(value)) {
                return value;
            }
        }
        return field.getName();
    }

    private String intArray2Json(int[] iArr) {
        StringBuilder sb = new StringBuilder(iArr.length << 4);
        sb.append('[');
        for (int i5 : iArr) {
            sb.append(i5);
            sb.append(',');
        }
        return addJsonArrayEnding(sb);
    }

    private String longArray2Json(long[] jArr) {
        StringBuilder sb = new StringBuilder(jArr.length << 4);
        sb.append('[');
        for (long j5 : jArr) {
            sb.append(j5);
            sb.append(',');
        }
        return addJsonArrayEnding(sb);
    }

    private String map2Json(Map<String, Object> map) throws JSONException {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(map.size() << 4);
        sb.append('{');
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            sb.append(k0.f19765b);
            sb.append((Object) entry.getKey());
            sb.append(k0.f19765b);
            sb.append(':');
            sb.append(toJson(value));
            sb.append(',');
        }
        sb.setCharAt(sb.length() - 1, '}');
        return sb.toString();
    }

    private String number2Json(Number number) {
        return number.toString();
    }

    private String obj2Json(Object obj) throws JSONException {
        Object obj2;
        if (obj == null) {
            return "{}";
        }
        Class<?> cls = obj.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        do {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType() != cls) {
                    String key = getKey(field);
                    if (!h.a(key)) {
                        accessible(field);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(toJson(key));
                        sb2.append(':');
                        try {
                            obj2 = field.get(obj);
                        } catch (IllegalAccessException unused) {
                            sb2.append("null");
                        }
                        if (!this.expectObjectNull || obj2 != null) {
                            sb2.append(toJson(obj2));
                            sb2.append(',');
                            sb.append((CharSequence) sb2);
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (cls != Object.class);
        if (sb.length() == 1) {
            return obj.toString();
        }
        sb.setCharAt(sb.length() - 1, '}');
        return sb.toString();
    }

    private String shortArray2Json(short[] sArr) {
        StringBuilder sb = new StringBuilder(sArr.length << 4);
        sb.append('[');
        for (short s5 : sArr) {
            sb.append((int) s5);
            sb.append(',');
        }
        return addJsonArrayEnding(sb);
    }

    private String string2Json(String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str.length() + 20);
        sb.append(k0.f19765b);
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt == '\f') {
                str2 = "\\f";
            } else if (charAt == '\r') {
                str2 = "\\r";
            } else if (charAt == '\"') {
                str2 = "\\\"";
            } else if (charAt == '/') {
                str2 = "\\/";
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        str2 = "\\b";
                        break;
                    case '\t':
                        str2 = "\\t";
                        break;
                    case '\n':
                        str2 = "\\n";
                        break;
                    default:
                        sb.append(charAt);
                        continue;
                }
            } else {
                str2 = "\\\\";
            }
            sb.append(str2);
        }
        sb.append(k0.f19765b);
        return sb.toString();
    }

    public String toJson(Object obj) throws JSONException {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return string2Json((String) obj);
        }
        if (obj instanceof Boolean) {
            return boolean2Json((Boolean) obj);
        }
        if (obj instanceof Number) {
            return number2Json((Number) obj);
        }
        if (obj instanceof Map) {
            return map2Json((Map) obj);
        }
        if (obj instanceof Collection) {
            return collection2Json((Collection) obj);
        }
        if (obj instanceof Object[]) {
            return array2Json((Object[]) obj);
        }
        String baseTypeArray2Json = baseTypeArray2Json(obj);
        return baseTypeArray2Json != null ? baseTypeArray2Json : obj2Json(obj);
    }
}
