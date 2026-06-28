package kotlin.io.encoding;

import kotlin.collections.o;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003¨\u0006\u000f"}, d2 = {"base64DecodeMap", "", "getBase64DecodeMap$annotations", "()V", "base64EncodeMap", "", "getBase64EncodeMap$annotations", "base64UrlDecodeMap", "getBase64UrlDecodeMap$annotations", "base64UrlEncodeMap", "getBase64UrlEncodeMap$annotations", "isInMimeAlphabet", "", "symbol", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,649:1\n13384#2,3:650\n13384#2,3:653\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n584#1:650,3\n603#1:653,3\n*E\n"})
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    @l
    private static final byte[] f19285a;

    /* renamed from: b */
    @l
    private static final int[] f19286b;

    /* renamed from: c */
    @l
    private static final byte[] f19287c;

    /* renamed from: d */
    @l
    private static final int[] f19288d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f19285a = bArr;
        int[] iArr = new int[256];
        int i5 = 0;
        o.T1(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            iArr[bArr[i6]] = i7;
            i6++;
            i7++;
        }
        f19286b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f19287c = bArr2;
        int[] iArr2 = new int[256];
        o.T1(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i8 = 0;
        while (i5 < length2) {
            iArr2[bArr2[i5]] = i8;
            i5++;
            i8++;
        }
        f19288d = iArr2;
    }

    public static final /* synthetic */ int[] a() {
        return f19286b;
    }

    public static final /* synthetic */ byte[] b() {
        return f19285a;
    }

    public static final /* synthetic */ int[] c() {
        return f19288d;
    }

    public static final /* synthetic */ byte[] d() {
        return f19287c;
    }

    @f
    private static /* synthetic */ void e() {
    }

    private static /* synthetic */ void f() {
    }

    @f
    private static /* synthetic */ void g() {
    }

    private static /* synthetic */ void h() {
    }

    @g1(version = "1.8")
    @f
    public static final boolean i(int i5) {
        return (i5 >= 0 && i5 < f19286b.length) && f19286b[i5] != -1;
    }
}
