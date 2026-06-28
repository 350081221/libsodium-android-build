package kotlin.io.encoding;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"decodingWith", "Ljava/io/InputStream;", "base64", "Lkotlin/io/encoding/Base64;", "encodingWith", "Ljava/io/OutputStream;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/encoding/StreamEncodingKt")
/* loaded from: classes2.dex */
class h {
    @l
    @g1(version = "1.8")
    @f
    public static final InputStream a(@l InputStream inputStream, @l a base64) {
        l0.p(inputStream, "<this>");
        l0.p(base64, "base64");
        return new d(inputStream, base64);
    }

    @l
    @g1(version = "1.8")
    @f
    public static final OutputStream b(@l OutputStream outputStream, @l a base64) {
        l0.p(outputStream, "<this>");
        l0.p(base64, "base64");
        return new e(outputStream, base64);
    }
}
