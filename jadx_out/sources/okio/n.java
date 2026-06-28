package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.cx;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 ]2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001]B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J,\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0010H\u0010¢\u0006\u0002\b#J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0000J\u0013\u0010'\u001a\u00020%2\b\u0010\u001a\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b,J\u0015\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0007¢\u0006\u0002\b-J\r\u0010.\u001a\u00020\tH\u0010¢\u0006\u0002\b/J\b\u0010\b\u001a\u00020\tH\u0016J\b\u00100\u001a\u00020\u0010H\u0016J\u001d\u00101\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u0000H\u0010¢\u0006\u0002\b3J\u0010\u00104\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u0010\u00105\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u0010\u00106\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u001a\u00107\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\tH\u0017J\u001a\u00107\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\tH\u0007J\r\u00109\u001a\u00020\u0004H\u0010¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020\tH\u0010¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\tH\u0017J\u001a\u0010>\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\tH\u0007J\u0006\u0010?\u001a\u00020\u0000J(\u0010@\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J(\u0010@\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J\u0010\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020DH\u0002J\u0006\u0010E\u001a\u00020\u0000J\u0006\u0010F\u001a\u00020\u0000J\u0006\u0010G\u001a\u00020\u0000J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bHJ\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u0000J\u0010\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020MH\u0016J\u001c\u0010N\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\t2\b\b\u0002\u0010P\u001a\u00020\tH\u0017J\b\u0010Q\u001a\u00020\u0000H\u0016J\b\u0010R\u001a\u00020\u0000H\u0016J\b\u0010S\u001a\u00020\u0004H\u0016J\b\u0010T\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020WH\u0016J%\u0010U\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020Y2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0010¢\u0006\u0002\bZJ\u0010\u0010[\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020\\H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006^"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "data", "", "([B)V", "getData$okio", "()[B", TTDownloadField.TT_HASHCODE, "", "getHashCode$okio", "()I", "setHashCode$okio", "(I)V", "size", "utf8", "", "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "base64Url", "compareTo", "other", "copyInto", "", TypedValues.CycleType.S_WAVE_OFFSET, TypedValues.AttributesType.S_TARGET, "targetOffset", "byteCount", "digest", "algorithm", "digest$okio", "endsWith", "", "suffix", "equals", "", "get", "", "index", "getByte", "-deprecated_getByte", "getSize", "getSize$okio", "hex", "hmac", DatabaseFileArchive.COLUMN_KEY, "hmac$okio", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "pos", "internalGet$okio", "lastIndexOf", TTDownloadField.TT_MD5, "rangeEquals", "otherOffset", "readObject", "in", "Ljava/io/ObjectInputStream;", "sha1", "sha256", "sha512", "-deprecated_size", "startsWith", "prefix", TypedValues.Custom.S_STRING, "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeObject", "Ljava/io/ObjectOutputStream;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n43#2,7:365\n53#2:372\n56#2:373\n64#2,4:374\n68#2:379\n70#2:381\n76#2,23:382\n104#2,23:405\n131#2,2:428\n133#2,9:431\n145#2:440\n148#2:441\n151#2:442\n154#2:443\n162#2:444\n172#2,3:445\n171#2:448\n185#2,2:449\n190#2:451\n194#2:452\n198#2:453\n202#2:454\n206#2,7:455\n219#2:462\n223#2,8:463\n235#2,4:471\n244#2,5:475\n253#2,6:480\n259#2,9:487\n322#2,8:496\n131#2,2:504\n133#2,9:507\n333#2,9:516\n68#3:378\n74#3:380\n74#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
/* loaded from: classes4.dex */
public class n implements Serializable, Comparable<n> {

    @p4.l
    public static final a Companion = new a(null);

    @p4.l
    @u3.e
    public static final n EMPTY = new n(new byte[0]);
    private static final long serialVersionUID = 1;

    @p4.l
    private final byte[] data;
    private transient int hashCode;

    @p4.m
    private transient String utf8;

    @kotlin.i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/ByteString$Companion;", "", "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", "", "decodeBase64", TypedValues.Custom.S_STRING, "", "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", "data", "", "", "array", TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n271#2:365\n275#2,3:366\n282#2,3:369\n289#2,2:372\n295#2:374\n297#2,7:376\n1#3:375\n1#3:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        public static /* synthetic */ n k(a aVar, String str, Charset charset, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                charset = kotlin.text.f.f19703b;
            }
            return aVar.j(str, charset);
        }

        public static /* synthetic */ n p(a aVar, byte[] bArr, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i5 = 0;
            }
            if ((i7 & 2) != 0) {
                i6 = i.f();
            }
            return aVar.o(bArr, i5, i6);
        }

        @u3.h(name = "-deprecated_decodeBase64")
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @p4.m
        public final n a(@p4.l String string) {
            kotlin.jvm.internal.l0.p(string, "string");
            return h(string);
        }

        @p4.l
        @u3.h(name = "-deprecated_decodeHex")
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        public final n b(@p4.l String string) {
            kotlin.jvm.internal.l0.p(string, "string");
            return i(string);
        }

        @p4.l
        @u3.h(name = "-deprecated_encodeString")
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        public final n c(@p4.l String string, @p4.l Charset charset) {
            kotlin.jvm.internal.l0.p(string, "string");
            kotlin.jvm.internal.l0.p(charset, "charset");
            return j(string, charset);
        }

        @p4.l
        @u3.h(name = "-deprecated_encodeUtf8")
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        public final n d(@p4.l String string) {
            kotlin.jvm.internal.l0.p(string, "string");
            return l(string);
        }

        @p4.l
        @u3.h(name = "-deprecated_of")
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        public final n e(@p4.l ByteBuffer buffer) {
            kotlin.jvm.internal.l0.p(buffer, "buffer");
            return m(buffer);
        }

        @p4.l
        @u3.h(name = "-deprecated_of")
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        public final n f(@p4.l byte[] array, int i5, int i6) {
            kotlin.jvm.internal.l0.p(array, "array");
            return o(array, i5, i6);
        }

        @p4.l
        @u3.h(name = "-deprecated_read")
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        public final n g(@p4.l InputStream inputstream, int i5) {
            kotlin.jvm.internal.l0.p(inputstream, "inputstream");
            return q(inputstream, i5);
        }

        @p4.m
        @u3.m
        public final n h(@p4.l String str) {
            kotlin.jvm.internal.l0.p(str, "<this>");
            byte[] a5 = okio.a.a(str);
            if (a5 != null) {
                return new n(a5);
            }
            return null;
        }

        @p4.l
        @u3.m
        public final n i(@p4.l String str) {
            boolean z4;
            kotlin.jvm.internal.l0.p(str, "<this>");
            if (str.length() % 2 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = i5 * 2;
                    bArr[i5] = (byte) ((okio.internal.b.b(str.charAt(i6)) << 4) + okio.internal.b.b(str.charAt(i6 + 1)));
                }
                return new n(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        @p4.l
        @u3.h(name = "encodeString")
        @u3.m
        public final n j(@p4.l String str, @p4.l Charset charset) {
            kotlin.jvm.internal.l0.p(str, "<this>");
            kotlin.jvm.internal.l0.p(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.l0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return new n(bytes);
        }

        @p4.l
        @u3.m
        public final n l(@p4.l String str) {
            kotlin.jvm.internal.l0.p(str, "<this>");
            n nVar = new n(s1.a(str));
            nVar.setUtf8$okio(str);
            return nVar;
        }

        @p4.l
        @u3.h(name = "of")
        @u3.m
        public final n m(@p4.l ByteBuffer byteBuffer) {
            kotlin.jvm.internal.l0.p(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new n(bArr);
        }

        @p4.l
        @u3.m
        public final n n(@p4.l byte... data) {
            kotlin.jvm.internal.l0.p(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, size)");
            return new n(copyOf);
        }

        @p4.l
        @u3.h(name = "of")
        @u3.m
        public final n o(@p4.l byte[] bArr, int i5, int i6) {
            byte[] f12;
            kotlin.jvm.internal.l0.p(bArr, "<this>");
            int m5 = i.m(bArr, i6);
            i.e(bArr.length, i5, m5);
            f12 = kotlin.collections.o.f1(bArr, i5, m5 + i5);
            return new n(f12);
        }

        @p4.l
        @u3.h(name = "read")
        @u3.m
        public final n q(@p4.l InputStream inputStream, int i5) throws IOException {
            boolean z4;
            kotlin.jvm.internal.l0.p(inputStream, "<this>");
            int i6 = 0;
            if (i5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                byte[] bArr = new byte[i5];
                while (i6 < i5) {
                    int read = inputStream.read(bArr, i6, i5 - i6);
                    if (read != -1) {
                        i6 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new n(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i5).toString());
        }
    }

    public n(@p4.l byte[] data) {
        kotlin.jvm.internal.l0.p(data, "data");
        this.data = data;
    }

    public static /* synthetic */ void copyInto$default(n nVar, int i5, byte[] bArr, int i6, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i8 & 1) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        nVar.copyInto(i5, bArr, i6, i7);
    }

    @p4.m
    @u3.m
    public static final n decodeBase64(@p4.l String str) {
        return Companion.h(str);
    }

    @p4.l
    @u3.m
    public static final n decodeHex(@p4.l String str) {
        return Companion.i(str);
    }

    @p4.l
    @u3.h(name = "encodeString")
    @u3.m
    public static final n encodeString(@p4.l String str, @p4.l Charset charset) {
        return Companion.j(str, charset);
    }

    @p4.l
    @u3.m
    public static final n encodeUtf8(@p4.l String str) {
        return Companion.l(str);
    }

    public static /* synthetic */ int indexOf$default(n nVar, n nVar2, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return nVar.indexOf(nVar2, i5);
    }

    public static /* synthetic */ int lastIndexOf$default(n nVar, n nVar2, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i6 & 2) != 0) {
            i5 = i.f();
        }
        return nVar.lastIndexOf(nVar2, i5);
    }

    @p4.l
    @u3.h(name = "of")
    @u3.m
    public static final n of(@p4.l ByteBuffer byteBuffer) {
        return Companion.m(byteBuffer);
    }

    @p4.l
    @u3.m
    public static final n of(@p4.l byte... bArr) {
        return Companion.n(bArr);
    }

    @p4.l
    @u3.h(name = "of")
    @u3.m
    public static final n of(@p4.l byte[] bArr, int i5, int i6) {
        return Companion.o(bArr, i5, i6);
    }

    @p4.l
    @u3.h(name = "read")
    @u3.m
    public static final n read(@p4.l InputStream inputStream, int i5) throws IOException {
        return Companion.q(inputStream, i5);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        n q5 = Companion.q(objectInputStream, objectInputStream.readInt());
        Field declaredField = n.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, q5.data);
    }

    public static /* synthetic */ n substring$default(n nVar, int i5, int i6, int i7, Object obj) {
        if (obj == null) {
            if ((i7 & 1) != 0) {
                i5 = 0;
            }
            if ((i7 & 2) != 0) {
                i6 = i.f();
            }
            return nVar.substring(i5, i6);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @u3.h(name = "-deprecated_getByte")
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to operator function", replaceWith = @kotlin.b1(expression = "this[index]", imports = {}))
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m6592deprecated_getByte(int i5) {
        return getByte(i5);
    }

    @u3.h(name = "-deprecated_size")
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "size", imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m6593deprecated_size() {
        return size();
    }

    @p4.l
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        kotlin.jvm.internal.l0.o(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    @p4.l
    public String base64() {
        return okio.a.c(getData$okio(), null, 1, null);
    }

    @p4.l
    public String base64Url() {
        return okio.a.b(getData$okio(), okio.a.f());
    }

    public void copyInto(int i5, @p4.l byte[] target, int i6, int i7) {
        kotlin.jvm.internal.l0.p(target, "target");
        kotlin.collections.o.v0(getData$okio(), target, i6, i5, i7 + i5);
    }

    @p4.l
    public n digest$okio(@p4.l String algorithm) {
        kotlin.jvm.internal.l0.p(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l0.m(digest);
        return new n(digest);
    }

    public final boolean endsWith(@p4.l n suffix) {
        kotlin.jvm.internal.l0.p(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(@p4.m Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.size() == getData$okio().length && nVar.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    @u3.h(name = "getByte")
    public final byte getByte(int i5) {
        return internalGet$okio(i5);
    }

    @p4.l
    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    @p4.m
    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio == 0) {
            int hashCode = Arrays.hashCode(getData$okio());
            setHashCode$okio(hashCode);
            return hashCode;
        }
        return hashCode$okio;
    }

    @p4.l
    public String hex() {
        String t12;
        char[] cArr = new char[getData$okio().length * 2];
        int i5 = 0;
        for (byte b5 : getData$okio()) {
            int i6 = i5 + 1;
            cArr[i5] = okio.internal.b.J()[(b5 >> 4) & 15];
            i5 = i6 + 1;
            cArr[i6] = okio.internal.b.J()[b5 & cx.f12477m];
        }
        t12 = kotlin.text.e0.t1(cArr);
        return t12;
    }

    @p4.l
    public n hmac$okio(@p4.l String algorithm, @p4.l n key) {
        kotlin.jvm.internal.l0.p(algorithm, "algorithm");
        kotlin.jvm.internal.l0.p(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] doFinal = mac.doFinal(this.data);
            kotlin.jvm.internal.l0.o(doFinal, "doFinal(...)");
            return new n(doFinal);
        } catch (InvalidKeyException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    @p4.l
    public n hmacSha1(@p4.l n key) {
        kotlin.jvm.internal.l0.p(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    @p4.l
    public n hmacSha256(@p4.l n key) {
        kotlin.jvm.internal.l0.p(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    @p4.l
    public n hmacSha512(@p4.l n key) {
        kotlin.jvm.internal.l0.p(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    @u3.i
    public final int indexOf(@p4.l n other) {
        kotlin.jvm.internal.l0.p(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    @u3.i
    public final int indexOf(@p4.l n other, int i5) {
        kotlin.jvm.internal.l0.p(other, "other");
        return indexOf(other.internalArray$okio(), i5);
    }

    @u3.i
    public final int indexOf(@p4.l byte[] other) {
        kotlin.jvm.internal.l0.p(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    @p4.l
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i5) {
        return getData$okio()[i5];
    }

    @u3.i
    public final int lastIndexOf(@p4.l n other) {
        kotlin.jvm.internal.l0.p(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    @u3.i
    public final int lastIndexOf(@p4.l n other, int i5) {
        kotlin.jvm.internal.l0.p(other, "other");
        return lastIndexOf(other.internalArray$okio(), i5);
    }

    @u3.i
    public final int lastIndexOf(@p4.l byte[] other) {
        kotlin.jvm.internal.l0.p(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    @p4.l
    public final n md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i5, @p4.l n other, int i6, int i7) {
        kotlin.jvm.internal.l0.p(other, "other");
        return other.rangeEquals(i6, getData$okio(), i5, i7);
    }

    public final void setHashCode$okio(int i5) {
        this.hashCode = i5;
    }

    public final void setUtf8$okio(@p4.m String str) {
        this.utf8 = str;
    }

    @p4.l
    public final n sha1() {
        return digest$okio("SHA-1");
    }

    @p4.l
    public final n sha256() {
        return digest$okio("SHA-256");
    }

    @p4.l
    public final n sha512() {
        return digest$okio("SHA-512");
    }

    @u3.h(name = "size")
    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@p4.l n prefix) {
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    @p4.l
    public String string(@p4.l Charset charset) {
        kotlin.jvm.internal.l0.p(charset, "charset");
        return new String(this.data, charset);
    }

    @p4.l
    @u3.i
    public final n substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @p4.l
    @u3.i
    public final n substring(int i5) {
        return substring$default(this, i5, 0, 2, null);
    }

    @p4.l
    @u3.i
    public n substring(int i5, int i6) {
        boolean z4;
        boolean z5;
        byte[] f12;
        int l5 = i.l(this, i6);
        boolean z6 = true;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (l5 <= getData$okio().length) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (l5 - i5 < 0) {
                    z6 = false;
                }
                if (z6) {
                    if (i5 == 0 && l5 == getData$okio().length) {
                        return this;
                    }
                    f12 = kotlin.collections.o.f1(getData$okio(), i5, l5);
                    return new n(f12);
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    @p4.l
    public n toAsciiLowercase() {
        for (int i5 = 0; i5 < getData$okio().length; i5++) {
            byte b5 = getData$okio()[i5];
            if (b5 >= 65 && b5 <= 90) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, size)");
                copyOf[i5] = (byte) (b5 + 32);
                for (int i6 = i5 + 1; i6 < copyOf.length; i6++) {
                    byte b6 = copyOf[i6];
                    if (b6 >= 65 && b6 <= 90) {
                        copyOf[i6] = (byte) (b6 + 32);
                    }
                }
                return new n(copyOf);
            }
        }
        return this;
    }

    @p4.l
    public n toAsciiUppercase() {
        for (int i5 = 0; i5 < getData$okio().length; i5++) {
            byte b5 = getData$okio()[i5];
            if (b5 >= 97 && b5 <= 122) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, size)");
                copyOf[i5] = (byte) (b5 - 32);
                for (int i6 = i5 + 1; i6 < copyOf.length; i6++) {
                    byte b6 = copyOf[i6];
                    if (b6 >= 97 && b6 <= 122) {
                        copyOf[i6] = (byte) (b6 - 32);
                    }
                }
                return new n(copyOf);
            }
        }
        return this;
    }

    @p4.l
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @p4.l
    public String toString() {
        boolean z4;
        String i22;
        String i23;
        String i24;
        boolean z5;
        n nVar;
        byte[] f12;
        String str;
        boolean z6 = true;
        if (getData$okio().length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            str = "[size=0]";
        } else {
            int a5 = okio.internal.b.a(getData$okio(), 64);
            if (a5 == -1) {
                if (getData$okio().length <= 64) {
                    str = "[hex=" + hex() + ']';
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[size=");
                    sb.append(getData$okio().length);
                    sb.append(" hex=");
                    int l5 = i.l(this, 64);
                    if (l5 <= getData$okio().length) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        if (l5 + 0 < 0) {
                            z6 = false;
                        }
                        if (z6) {
                            if (l5 == getData$okio().length) {
                                nVar = this;
                            } else {
                                f12 = kotlin.collections.o.f1(getData$okio(), 0, l5);
                                nVar = new n(f12);
                            }
                            sb.append(nVar.hex());
                            sb.append("…]");
                            return sb.toString();
                        }
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
                }
            } else {
                String utf8 = utf8();
                String substring = utf8.substring(0, a5);
                kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                i22 = kotlin.text.e0.i2(substring, "\\", "\\\\", false, 4, null);
                i23 = kotlin.text.e0.i2(i22, "\n", "\\n", false, 4, null);
                i24 = kotlin.text.e0.i2(i23, "\r", "\\r", false, 4, null);
                if (a5 < utf8.length()) {
                    return "[size=" + getData$okio().length + " text=" + i24 + "…]";
                }
                return "[text=" + i24 + ']';
            }
        }
        return str;
    }

    @p4.l
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio == null) {
            String c5 = s1.c(internalArray$okio());
            setUtf8$okio(c5);
            return c5;
        }
        return utf8$okio;
    }

    public void write(@p4.l OutputStream out) throws IOException {
        kotlin.jvm.internal.l0.p(out, "out");
        out.write(this.data);
    }

    public void write$okio(@p4.l l buffer, int i5, int i6) {
        kotlin.jvm.internal.l0.p(buffer, "buffer");
        okio.internal.b.H(this, buffer, i5, i6);
    }

    public static /* synthetic */ int indexOf$default(n nVar, byte[] bArr, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return nVar.indexOf(bArr, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(@p4.l okio.n r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.l0.p(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.n.compareTo(okio.n):int");
    }

    public final boolean endsWith(@p4.l byte[] suffix) {
        kotlin.jvm.internal.l0.p(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    @u3.i
    public int indexOf(@p4.l byte[] other, int i5) {
        kotlin.jvm.internal.l0.p(other, "other");
        int length = getData$okio().length - other.length;
        int max = Math.max(i5, 0);
        if (max <= length) {
            while (!i.d(getData$okio(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @u3.i
    public int lastIndexOf(@p4.l byte[] other, int i5) {
        kotlin.jvm.internal.l0.p(other, "other");
        for (int min = Math.min(i.l(this, i5), getData$okio().length - other.length); -1 < min; min--) {
            if (i.d(getData$okio(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i5, @p4.l byte[] other, int i6, int i7) {
        kotlin.jvm.internal.l0.p(other, "other");
        return i5 >= 0 && i5 <= getData$okio().length - i7 && i6 >= 0 && i6 <= other.length - i7 && i.d(getData$okio(), i5, other, i6, i7);
    }

    public final boolean startsWith(@p4.l byte[] prefix) {
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public static /* synthetic */ int lastIndexOf$default(n nVar, byte[] bArr, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i6 & 2) != 0) {
            i5 = i.f();
        }
        return nVar.lastIndexOf(bArr, i5);
    }
}
