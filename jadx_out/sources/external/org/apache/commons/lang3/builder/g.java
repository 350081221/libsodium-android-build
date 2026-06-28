package external.org.apache.commons.lang3.builder;

/* loaded from: classes3.dex */
public class g implements a<String> {

    /* renamed from: d, reason: collision with root package name */
    private static volatile h f15950d = h.DEFAULT_STYLE;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuffer f15951a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15952b;

    /* renamed from: c, reason: collision with root package name */
    private final h f15953c;

    public g(Object obj) {
        this(obj, null, null);
    }

    public static h Y() {
        return f15950d;
    }

    public static String c0(Object obj) {
        return f.v0(obj);
    }

    public static String d0(Object obj, h hVar) {
        return f.w0(obj, hVar);
    }

    public static String e0(Object obj, h hVar, boolean z4) {
        return f.z0(obj, hVar, z4, false, null);
    }

    public static <T> String f0(T t5, h hVar, boolean z4, Class<? super T> cls) {
        return f.z0(t5, hVar, z4, false, cls);
    }

    public static void g0(h hVar) {
        if (hVar != null) {
            f15950d = hVar;
            return;
        }
        throw new IllegalArgumentException("The style must not be null");
    }

    public g A(String str, int[] iArr, boolean z4) {
        this.f15953c.append(this.f15951a, str, iArr, Boolean.valueOf(z4));
        return this;
    }

    public g B(String str, long[] jArr) {
        this.f15953c.append(this.f15951a, str, jArr, (Boolean) null);
        return this;
    }

    public g C(String str, long[] jArr, boolean z4) {
        this.f15953c.append(this.f15951a, str, jArr, Boolean.valueOf(z4));
        return this;
    }

    public g D(String str, Object[] objArr) {
        this.f15953c.append(this.f15951a, str, objArr, (Boolean) null);
        return this;
    }

    public g E(String str, Object[] objArr, boolean z4) {
        this.f15953c.append(this.f15951a, str, objArr, Boolean.valueOf(z4));
        return this;
    }

    public g F(String str, short[] sArr) {
        this.f15953c.append(this.f15951a, str, sArr, (Boolean) null);
        return this;
    }

    public g G(String str, short[] sArr, boolean z4) {
        this.f15953c.append(this.f15951a, str, sArr, Boolean.valueOf(z4));
        return this;
    }

    public g H(String str, boolean[] zArr) {
        this.f15953c.append(this.f15951a, str, zArr, (Boolean) null);
        return this;
    }

    public g I(String str, boolean[] zArr, boolean z4) {
        this.f15953c.append(this.f15951a, str, zArr, Boolean.valueOf(z4));
        return this;
    }

    public g J(short s5) {
        this.f15953c.append(this.f15951a, (String) null, s5);
        return this;
    }

    public g K(boolean z4) {
        this.f15953c.append(this.f15951a, (String) null, z4);
        return this;
    }

    public g L(byte[] bArr) {
        this.f15953c.append(this.f15951a, (String) null, bArr, (Boolean) null);
        return this;
    }

    public g M(char[] cArr) {
        this.f15953c.append(this.f15951a, (String) null, cArr, (Boolean) null);
        return this;
    }

    public g N(double[] dArr) {
        this.f15953c.append(this.f15951a, (String) null, dArr, (Boolean) null);
        return this;
    }

    public g O(float[] fArr) {
        this.f15953c.append(this.f15951a, (String) null, fArr, (Boolean) null);
        return this;
    }

    public g P(int[] iArr) {
        this.f15953c.append(this.f15951a, (String) null, iArr, (Boolean) null);
        return this;
    }

    public g Q(long[] jArr) {
        this.f15953c.append(this.f15951a, (String) null, jArr, (Boolean) null);
        return this;
    }

    public g R(Object[] objArr) {
        this.f15953c.append(this.f15951a, (String) null, objArr, (Boolean) null);
        return this;
    }

    public g S(short[] sArr) {
        this.f15953c.append(this.f15951a, (String) null, sArr, (Boolean) null);
        return this;
    }

    public g T(boolean[] zArr) {
        this.f15953c.append(this.f15951a, (String) null, zArr, (Boolean) null);
        return this;
    }

    public g U(Object obj) {
        external.org.apache.commons.lang3.f.k(a0(), obj);
        return this;
    }

    public g V(String str) {
        if (str != null) {
            this.f15953c.appendSuper(this.f15951a, str);
        }
        return this;
    }

    public g W(String str) {
        if (str != null) {
            this.f15953c.appendToString(this.f15951a, str);
        }
        return this;
    }

    @Override // external.org.apache.commons.lang3.builder.a
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public String build() {
        return toString();
    }

    public Object Z() {
        return this.f15952b;
    }

    public g a(byte b5) {
        this.f15953c.append(this.f15951a, (String) null, b5);
        return this;
    }

    public StringBuffer a0() {
        return this.f15951a;
    }

    public g b(char c5) {
        this.f15953c.append(this.f15951a, (String) null, c5);
        return this;
    }

    public h b0() {
        return this.f15953c;
    }

    public g c(double d5) {
        this.f15953c.append(this.f15951a, (String) null, d5);
        return this;
    }

    public g d(float f5) {
        this.f15953c.append(this.f15951a, (String) null, f5);
        return this;
    }

    public g e(int i5) {
        this.f15953c.append(this.f15951a, (String) null, i5);
        return this;
    }

    public g f(long j5) {
        this.f15953c.append(this.f15951a, (String) null, j5);
        return this;
    }

    public g g(Object obj) {
        this.f15953c.append(this.f15951a, (String) null, obj, (Boolean) null);
        return this;
    }

    public g h(String str, byte b5) {
        this.f15953c.append(this.f15951a, str, b5);
        return this;
    }

    public g i(String str, char c5) {
        this.f15953c.append(this.f15951a, str, c5);
        return this;
    }

    public g j(String str, double d5) {
        this.f15953c.append(this.f15951a, str, d5);
        return this;
    }

    public g k(String str, float f5) {
        this.f15953c.append(this.f15951a, str, f5);
        return this;
    }

    public g l(String str, int i5) {
        this.f15953c.append(this.f15951a, str, i5);
        return this;
    }

    public g m(String str, long j5) {
        this.f15953c.append(this.f15951a, str, j5);
        return this;
    }

    public g n(String str, Object obj) {
        this.f15953c.append(this.f15951a, str, obj, (Boolean) null);
        return this;
    }

    public g o(String str, Object obj, boolean z4) {
        this.f15953c.append(this.f15951a, str, obj, Boolean.valueOf(z4));
        return this;
    }

    public g p(String str, short s5) {
        this.f15953c.append(this.f15951a, str, s5);
        return this;
    }

    public g q(String str, boolean z4) {
        this.f15953c.append(this.f15951a, str, z4);
        return this;
    }

    public g r(String str, byte[] bArr) {
        this.f15953c.append(this.f15951a, str, bArr, (Boolean) null);
        return this;
    }

    public g s(String str, byte[] bArr, boolean z4) {
        this.f15953c.append(this.f15951a, str, bArr, Boolean.valueOf(z4));
        return this;
    }

    public g t(String str, char[] cArr) {
        this.f15953c.append(this.f15951a, str, cArr, (Boolean) null);
        return this;
    }

    public String toString() {
        if (Z() == null) {
            a0().append(b0().getNullText());
        } else {
            this.f15953c.appendEnd(a0(), Z());
        }
        return a0().toString();
    }

    public g u(String str, char[] cArr, boolean z4) {
        this.f15953c.append(this.f15951a, str, cArr, Boolean.valueOf(z4));
        return this;
    }

    public g v(String str, double[] dArr) {
        this.f15953c.append(this.f15951a, str, dArr, (Boolean) null);
        return this;
    }

    public g w(String str, double[] dArr, boolean z4) {
        this.f15953c.append(this.f15951a, str, dArr, Boolean.valueOf(z4));
        return this;
    }

    public g x(String str, float[] fArr) {
        this.f15953c.append(this.f15951a, str, fArr, (Boolean) null);
        return this;
    }

    public g y(String str, float[] fArr, boolean z4) {
        this.f15953c.append(this.f15951a, str, fArr, Boolean.valueOf(z4));
        return this;
    }

    public g z(String str, int[] iArr) {
        this.f15953c.append(this.f15951a, str, iArr, (Boolean) null);
        return this;
    }

    public g(Object obj, h hVar) {
        this(obj, hVar, null);
    }

    public g(Object obj, h hVar, StringBuffer stringBuffer) {
        hVar = hVar == null ? Y() : hVar;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.f15951a = stringBuffer;
        this.f15953c = hVar;
        this.f15952b = obj;
        hVar.appendStart(stringBuffer, obj);
    }
}
