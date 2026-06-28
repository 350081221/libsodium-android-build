package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a5\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a%\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b¨\u0006\u000e"}, d2 = {"platformCharsToBytes", "", "Lkotlin/io/encoding/Base64;", "source", "", "startIndex", "", "endIndex", "platformEncodeIntoByteArray", "destination", "destinationOffset", "platformEncodeToByteArray", "platformEncodeToString", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {
    @g1(version = "1.8")
    @f
    @kotlin.internal.f
    private static final byte[] a(a aVar, CharSequence source, int i5, int i6) {
        l0.p(aVar, "<this>");
        l0.p(source, "source");
        if (source instanceof String) {
            aVar.g(source.length(), i5, i6);
            String substring = ((String) source).substring(i5, i6);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = kotlin.text.f.f19708g;
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            l0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        return aVar.e(source, i5, i6);
    }

    @g1(version = "1.8")
    @f
    @kotlin.internal.f
    private static final int b(a aVar, byte[] source, byte[] destination, int i5, int i6, int i7) {
        l0.p(aVar, "<this>");
        l0.p(source, "source");
        l0.p(destination, "destination");
        return aVar.v(source, destination, i5, i6, i7);
    }

    @g1(version = "1.8")
    @f
    @kotlin.internal.f
    private static final byte[] c(a aVar, byte[] source, int i5, int i6) {
        l0.p(aVar, "<this>");
        l0.p(source, "source");
        return aVar.B(source, i5, i6);
    }

    @g1(version = "1.8")
    @f
    @kotlin.internal.f
    private static final String d(a aVar, byte[] source, int i5, int i6) {
        l0.p(aVar, "<this>");
        l0.p(source, "source");
        return new String(aVar.B(source, i5, i6), kotlin.text.f.f19708g);
    }
}
