package external.org.apache.commons.lang3.builder;

import a1.i;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class h implements Serializable {
    private static final long serialVersionUID = -2587890625525655916L;
    public static final h DEFAULT_STYLE = new a();
    public static final h MULTI_LINE_STYLE = new b();
    public static final h NO_FIELD_NAMES_STYLE = new c();
    public static final h SHORT_PREFIX_STYLE = new d();
    public static final h SIMPLE_STYLE = new e();
    private static final ThreadLocal<WeakHashMap<Object, Object>> REGISTRY = new ThreadLocal<>();
    private boolean useFieldNames = true;
    private boolean useClassName = true;
    private boolean useShortClassName = false;
    private boolean useIdentityHashCode = true;
    private String contentStart = "[";
    private String contentEnd = "]";
    private String fieldNameValueSeparator = ContainerUtils.KEY_VALUE_DELIMITER;
    private boolean fieldSeparatorAtStart = false;
    private boolean fieldSeparatorAtEnd = false;
    private String fieldSeparator = ",";
    private String arrayStart = "{";
    private String arraySeparator = ",";
    private boolean arrayContentDetail = true;
    private String arrayEnd = i.f138d;
    private boolean defaultFullDetail = true;
    private String nullText = "<null>";
    private String sizeStartText = "<size=";
    private String sizeEndText = ">";
    private String summaryObjectStartText = "<";
    private String summaryObjectEndText = ">";

    /* loaded from: classes3.dex */
    private static final class a extends h {
        private static final long serialVersionUID = 1;

        a() {
        }

        private Object readResolve() {
            return h.DEFAULT_STYLE;
        }
    }

    /* loaded from: classes3.dex */
    private static final class b extends h {
        private static final long serialVersionUID = 1;

        b() {
            setContentStart("[");
            StringBuilder sb = new StringBuilder();
            String str = external.org.apache.commons.lang3.h.L;
            sb.append(str);
            sb.append("  ");
            setFieldSeparator(sb.toString());
            setFieldSeparatorAtStart(true);
            setContentEnd(str + "]");
        }

        private Object readResolve() {
            return h.MULTI_LINE_STYLE;
        }
    }

    /* loaded from: classes3.dex */
    private static final class c extends h {
        private static final long serialVersionUID = 1;

        c() {
            setUseFieldNames(false);
        }

        private Object readResolve() {
            return h.NO_FIELD_NAMES_STYLE;
        }
    }

    /* loaded from: classes3.dex */
    private static final class d extends h {
        private static final long serialVersionUID = 1;

        d() {
            setUseShortClassName(true);
            setUseIdentityHashCode(false);
        }

        private Object readResolve() {
            return h.SHORT_PREFIX_STYLE;
        }
    }

    /* loaded from: classes3.dex */
    private static final class e extends h {
        private static final long serialVersionUID = 1;

        e() {
            setUseClassName(false);
            setUseIdentityHashCode(false);
            setUseFieldNames(false);
            setContentStart("");
            setContentEnd("");
        }

        private Object readResolve() {
            return h.SIMPLE_STYLE;
        }
    }

    protected h() {
    }

    static Map<Object, Object> getRegistry() {
        return REGISTRY.get();
    }

    static boolean isRegistered(Object obj) {
        Map<Object, Object> registry = getRegistry();
        if (registry != null && registry.containsKey(obj)) {
            return true;
        }
        return false;
    }

    static void register(Object obj) {
        if (obj != null) {
            if (getRegistry() == null) {
                REGISTRY.set(new WeakHashMap<>());
            }
            getRegistry().put(obj, null);
        }
    }

    static void unregister(Object obj) {
        Map<Object, Object> registry;
        if (obj != null && (registry = getRegistry()) != null) {
            registry.remove(obj);
            if (registry.isEmpty()) {
                REGISTRY.remove();
            }
        }
    }

    public void append(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (obj == null) {
            appendNullText(stringBuffer, str);
        } else {
            appendInternal(stringBuffer, str, obj, isFullDetail(bool));
        }
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendClassName(StringBuffer stringBuffer, Object obj) {
        if (this.useClassName && obj != null) {
            register(obj);
            if (this.useShortClassName) {
                stringBuffer.append(getShortClassName(obj.getClass()));
            } else {
                stringBuffer.append(obj.getClass().getName());
            }
        }
    }

    protected void appendContentEnd(StringBuffer stringBuffer) {
        stringBuffer.append(this.contentEnd);
    }

    protected void appendContentStart(StringBuffer stringBuffer) {
        stringBuffer.append(this.contentStart);
    }

    protected void appendCyclicObject(StringBuffer stringBuffer, String str, Object obj) {
        external.org.apache.commons.lang3.f.k(stringBuffer, obj);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    public void appendEnd(StringBuffer stringBuffer, Object obj) {
        if (!this.fieldSeparatorAtEnd) {
            removeLastFieldSeparator(stringBuffer);
        }
        appendContentEnd(stringBuffer);
        unregister(obj);
    }

    protected void appendFieldEnd(StringBuffer stringBuffer, String str) {
        appendFieldSeparator(stringBuffer);
    }

    protected void appendFieldSeparator(StringBuffer stringBuffer) {
        stringBuffer.append(this.fieldSeparator);
    }

    protected void appendFieldStart(StringBuffer stringBuffer, String str) {
        if (this.useFieldNames && str != null) {
            stringBuffer.append(str);
            stringBuffer.append(this.fieldNameValueSeparator);
        }
    }

    protected void appendIdentityHashCode(StringBuffer stringBuffer, Object obj) {
        if (isUseIdentityHashCode() && obj != null) {
            register(obj);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    protected void appendInternal(StringBuffer stringBuffer, String str, Object obj, boolean z4) {
        if (isRegistered(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            appendCyclicObject(stringBuffer, str, obj);
            return;
        }
        register(obj);
        try {
            if (obj instanceof Collection) {
                if (z4) {
                    appendDetail(stringBuffer, str, (Collection<?>) obj);
                } else {
                    appendSummarySize(stringBuffer, str, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z4) {
                    appendDetail(stringBuffer, str, (Map<?, ?>) obj);
                } else {
                    appendSummarySize(stringBuffer, str, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z4) {
                    appendDetail(stringBuffer, str, (long[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (long[]) obj);
                }
            } else if (obj instanceof int[]) {
                if (z4) {
                    appendDetail(stringBuffer, str, (int[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (int[]) obj);
                }
            } else if (obj instanceof short[]) {
                if (z4) {
                    appendDetail(stringBuffer, str, (short[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (short[]) obj);
                }
            } else if (obj instanceof byte[]) {
                if (z4) {
                    appendDetail(stringBuffer, str, (byte[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (byte[]) obj);
                }
            } else if (obj instanceof char[]) {
                if (z4) {
                    appendDetail(stringBuffer, str, (char[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (char[]) obj);
                }
            } else if (obj instanceof double[]) {
                if (z4) {
                    appendDetail(stringBuffer, str, (double[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (double[]) obj);
                }
            } else if (obj instanceof float[]) {
                if (z4) {
                    appendDetail(stringBuffer, str, (float[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (float[]) obj);
                }
            } else if (obj instanceof boolean[]) {
                if (z4) {
                    appendDetail(stringBuffer, str, (boolean[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (boolean[]) obj);
                }
            } else if (obj.getClass().isArray()) {
                if (z4) {
                    appendDetail(stringBuffer, str, (Object[]) obj);
                } else {
                    appendSummary(stringBuffer, str, (Object[]) obj);
                }
            } else if (z4) {
                appendDetail(stringBuffer, str, obj);
            } else {
                appendSummary(stringBuffer, str, obj);
            }
        } finally {
            unregister(obj);
        }
    }

    protected void appendNullText(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.nullText);
    }

    public void appendStart(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            appendClassName(stringBuffer, obj);
            appendIdentityHashCode(stringBuffer, obj);
            appendContentStart(stringBuffer);
            if (this.fieldSeparatorAtStart) {
                appendFieldSeparator(stringBuffer);
            }
        }
    }

    protected void appendSummary(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.summaryObjectStartText);
        stringBuffer.append(getShortClassName(obj.getClass()));
        stringBuffer.append(this.summaryObjectEndText);
    }

    protected void appendSummarySize(StringBuffer stringBuffer, String str, int i5) {
        stringBuffer.append(this.sizeStartText);
        stringBuffer.append(i5);
        stringBuffer.append(this.sizeEndText);
    }

    public void appendSuper(StringBuffer stringBuffer, String str) {
        appendToString(stringBuffer, str);
    }

    public void appendToString(StringBuffer stringBuffer, String str) {
        int indexOf;
        int lastIndexOf;
        if (str != null && (indexOf = str.indexOf(this.contentStart) + this.contentStart.length()) != (lastIndexOf = str.lastIndexOf(this.contentEnd)) && indexOf >= 0 && lastIndexOf >= 0) {
            String substring = str.substring(indexOf, lastIndexOf);
            if (this.fieldSeparatorAtStart) {
                removeLastFieldSeparator(stringBuffer);
            }
            stringBuffer.append(substring);
            appendFieldSeparator(stringBuffer);
        }
    }

    protected String getArrayEnd() {
        return this.arrayEnd;
    }

    protected String getArraySeparator() {
        return this.arraySeparator;
    }

    protected String getArrayStart() {
        return this.arrayStart;
    }

    protected String getContentEnd() {
        return this.contentEnd;
    }

    protected String getContentStart() {
        return this.contentStart;
    }

    protected String getFieldNameValueSeparator() {
        return this.fieldNameValueSeparator;
    }

    protected String getFieldSeparator() {
        return this.fieldSeparator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getNullText() {
        return this.nullText;
    }

    protected String getShortClassName(Class<?> cls) {
        return external.org.apache.commons.lang3.d.v(cls);
    }

    protected String getSizeEndText() {
        return this.sizeEndText;
    }

    protected String getSizeStartText() {
        return this.sizeStartText;
    }

    protected String getSummaryObjectEndText() {
        return this.summaryObjectEndText;
    }

    protected String getSummaryObjectStartText() {
        return this.summaryObjectStartText;
    }

    protected boolean isArrayContentDetail() {
        return this.arrayContentDetail;
    }

    protected boolean isDefaultFullDetail() {
        return this.defaultFullDetail;
    }

    protected boolean isFieldSeparatorAtEnd() {
        return this.fieldSeparatorAtEnd;
    }

    protected boolean isFieldSeparatorAtStart() {
        return this.fieldSeparatorAtStart;
    }

    protected boolean isFullDetail(Boolean bool) {
        if (bool == null) {
            return this.defaultFullDetail;
        }
        return bool.booleanValue();
    }

    protected boolean isUseClassName() {
        return this.useClassName;
    }

    protected boolean isUseFieldNames() {
        return this.useFieldNames;
    }

    protected boolean isUseIdentityHashCode() {
        return this.useIdentityHashCode;
    }

    protected boolean isUseShortClassName() {
        return this.useShortClassName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void reflectionAppendArrayDetail(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.arrayStart);
        int length = Array.getLength(obj);
        for (int i5 = 0; i5 < length; i5++) {
            Object obj2 = Array.get(obj, i5);
            if (i5 > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            if (obj2 == null) {
                appendNullText(stringBuffer, str);
            } else {
                appendInternal(stringBuffer, str, obj2, this.arrayContentDetail);
            }
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void removeLastFieldSeparator(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        int length2 = this.fieldSeparator.length();
        if (length > 0 && length2 > 0 && length >= length2) {
            boolean z4 = false;
            int i5 = 0;
            while (true) {
                if (i5 < length2) {
                    if (stringBuffer.charAt((length - 1) - i5) != this.fieldSeparator.charAt((length2 - 1) - i5)) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                stringBuffer.setLength(length - length2);
            }
        }
    }

    protected void setArrayContentDetail(boolean z4) {
        this.arrayContentDetail = z4;
    }

    protected void setArrayEnd(String str) {
        if (str == null) {
            str = "";
        }
        this.arrayEnd = str;
    }

    protected void setArraySeparator(String str) {
        if (str == null) {
            str = "";
        }
        this.arraySeparator = str;
    }

    protected void setArrayStart(String str) {
        if (str == null) {
            str = "";
        }
        this.arrayStart = str;
    }

    protected void setContentEnd(String str) {
        if (str == null) {
            str = "";
        }
        this.contentEnd = str;
    }

    protected void setContentStart(String str) {
        if (str == null) {
            str = "";
        }
        this.contentStart = str;
    }

    protected void setDefaultFullDetail(boolean z4) {
        this.defaultFullDetail = z4;
    }

    protected void setFieldNameValueSeparator(String str) {
        if (str == null) {
            str = "";
        }
        this.fieldNameValueSeparator = str;
    }

    protected void setFieldSeparator(String str) {
        if (str == null) {
            str = "";
        }
        this.fieldSeparator = str;
    }

    protected void setFieldSeparatorAtEnd(boolean z4) {
        this.fieldSeparatorAtEnd = z4;
    }

    protected void setFieldSeparatorAtStart(boolean z4) {
        this.fieldSeparatorAtStart = z4;
    }

    protected void setNullText(String str) {
        if (str == null) {
            str = "";
        }
        this.nullText = str;
    }

    protected void setSizeEndText(String str) {
        if (str == null) {
            str = "";
        }
        this.sizeEndText = str;
    }

    protected void setSizeStartText(String str) {
        if (str == null) {
            str = "";
        }
        this.sizeStartText = str;
    }

    protected void setSummaryObjectEndText(String str) {
        if (str == null) {
            str = "";
        }
        this.summaryObjectEndText = str;
    }

    protected void setSummaryObjectStartText(String str) {
        if (str == null) {
            str = "";
        }
        this.summaryObjectStartText = str;
    }

    protected void setUseClassName(boolean z4) {
        this.useClassName = z4;
    }

    protected void setUseFieldNames(boolean z4) {
        this.useFieldNames = z4;
    }

    protected void setUseIdentityHashCode(boolean z4) {
        this.useIdentityHashCode = z4;
    }

    protected void setUseShortClassName(boolean z4) {
        this.useShortClassName = z4;
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, long j5) {
        stringBuffer.append(j5);
    }

    protected void appendSummary(StringBuffer stringBuffer, String str, Object[] objArr) {
        appendSummarySize(stringBuffer, str, objArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, long j5) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, j5);
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, int i5) {
        stringBuffer.append(i5);
    }

    protected void appendSummary(StringBuffer stringBuffer, String str, long[] jArr) {
        appendSummarySize(stringBuffer, str, jArr.length);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, short s5) {
        stringBuffer.append((int) s5);
    }

    protected void appendSummary(StringBuffer stringBuffer, String str, int[] iArr) {
        appendSummarySize(stringBuffer, str, iArr.length);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, byte b5) {
        stringBuffer.append((int) b5);
    }

    protected void appendSummary(StringBuffer stringBuffer, String str, short[] sArr) {
        appendSummarySize(stringBuffer, str, sArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, int i5) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, i5);
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, char c5) {
        stringBuffer.append(c5);
    }

    protected void appendSummary(StringBuffer stringBuffer, String str, byte[] bArr) {
        appendSummarySize(stringBuffer, str, bArr.length);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, double d5) {
        stringBuffer.append(d5);
    }

    protected void appendSummary(StringBuffer stringBuffer, String str, char[] cArr) {
        appendSummarySize(stringBuffer, str, cArr.length);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, float f5) {
        stringBuffer.append(f5);
    }

    protected void appendSummary(StringBuffer stringBuffer, String str, double[] dArr) {
        appendSummarySize(stringBuffer, str, dArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, short s5) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, s5);
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, boolean z4) {
        stringBuffer.append(z4);
    }

    protected void appendSummary(StringBuffer stringBuffer, String str, float[] fArr) {
        appendSummarySize(stringBuffer, str, fArr.length);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.arrayStart);
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (i5 > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            if (obj == null) {
                appendNullText(stringBuffer, str);
            } else {
                appendInternal(stringBuffer, str, obj, this.arrayContentDetail);
            }
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void appendSummary(StringBuffer stringBuffer, String str, boolean[] zArr) {
        appendSummarySize(stringBuffer, str, zArr.length);
    }

    public void append(StringBuffer stringBuffer, String str, byte b5) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, b5);
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, char c5) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, c5);
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.arrayStart);
        for (int i5 = 0; i5 < jArr.length; i5++) {
            if (i5 > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, jArr[i5]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, double d5) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, d5);
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, float f5) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, f5);
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.arrayStart);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (i5 > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, iArr[i5]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, boolean z4) {
        appendFieldStart(stringBuffer, str);
        appendDetail(stringBuffer, str, z4);
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (objArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, objArr);
        } else {
            appendSummary(stringBuffer, str, objArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.arrayStart);
        for (int i5 = 0; i5 < sArr.length; i5++) {
            if (i5 > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, sArr[i5]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.arrayStart);
        for (int i5 = 0; i5 < bArr.length; i5++) {
            if (i5 > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, bArr[i5]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (jArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, jArr);
        } else {
            appendSummary(stringBuffer, str, jArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.arrayStart);
        for (int i5 = 0; i5 < cArr.length; i5++) {
            if (i5 > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, cArr[i5]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (iArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, iArr);
        } else {
            appendSummary(stringBuffer, str, iArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.arrayStart);
        for (int i5 = 0; i5 < dArr.length; i5++) {
            if (i5 > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, dArr[i5]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (sArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, sArr);
        } else {
            appendSummary(stringBuffer, str, sArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.arrayStart);
        for (int i5 = 0; i5 < fArr.length; i5++) {
            if (i5 > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, fArr[i5]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (bArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, bArr);
        } else {
            appendSummary(stringBuffer, str, bArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    protected void appendDetail(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.arrayStart);
        for (int i5 = 0; i5 < zArr.length; i5++) {
            if (i5 > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            appendDetail(stringBuffer, str, zArr[i5]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    public void append(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (cArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, cArr);
        } else {
            appendSummary(stringBuffer, str, cArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (dArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, dArr);
        } else {
            appendSummary(stringBuffer, str, dArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (fArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, fArr);
        } else {
            appendSummary(stringBuffer, str, fArr);
        }
        appendFieldEnd(stringBuffer, str);
    }

    public void append(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        appendFieldStart(stringBuffer, str);
        if (zArr == null) {
            appendNullText(stringBuffer, str);
        } else if (isFullDetail(bool)) {
            appendDetail(stringBuffer, str, zArr);
        } else {
            appendSummary(stringBuffer, str, zArr);
        }
        appendFieldEnd(stringBuffer, str);
    }
}
