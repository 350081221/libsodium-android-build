package okhttp3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.a1;
import kotlin.collections.p;
import kotlin.collections.s0;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.t1;
import kotlin.jvm.internal.u1;
import kotlin.r2;
import kotlin.ranges.u;
import kotlin.text.e0;
import kotlin.text.f;
import kotlin.text.f0;
import kotlin.text.r;
import m0.a;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.BufferedSource;
import okio.b1;
import okio.l1;
import okio.n;
import okio.n1;
import org.apache.http.auth.AUTH;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import p4.l;
import p4.m;
import t0.b;
import u3.e;
import u3.h;

@i0(d1 = {"\u0000´\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010&\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010'\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010)\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0\f\"\u00020*¢\u0006\u0004\b)\u0010,\u001a\u0012\u00100\u001a\u00020.*\u00020-2\u0006\u0010/\u001a\u00020.\u001a \u00104\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000102\u001a\n\u00105\u001a\u00020\u0018*\u00020$\u001a\u0010\u00109\u001a\u000208*\b\u0012\u0004\u0012\u00020706\u001a\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020706*\u000208\u001a\u0012\u0010;\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010>\u001a\u00020=*\u00020<\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020?2\u0006\u0010@\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020B2\u0006\u0010@\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0000*\u00020\u00182\u0006\u0010@\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010E\u001a\u00020\u0004*\u00020C2\u0006\u0010D\u001a\u00020\u0018\u001a\n\u0010F\u001a\u00020\u0018*\u00020-\u001a\u001a\u0010I\u001a\u00020\b*\u00020G2\u0006\u00101\u001a\u00020\u00182\u0006\u0010H\u001a\u000202\u001a\u001a\u0010K\u001a\u00020\b*\u00020G2\u0006\u0010J\u001a\u00020\u00182\u0006\u0010H\u001a\u000202\u001a\n\u0010M\u001a\u00020\u0006*\u00020L\u001a\u0012\u0010O\u001a\u00020\b*\u00020L2\u0006\u0010N\u001a\u00020-\u001a\u001a\u0010R\u001a\u00020\u00042\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040PH\u0086\bø\u0001\u0000\u001a\"\u0010S\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040PH\u0086\bø\u0001\u0000\u001a\u0012\u0010I\u001a\u00020\u0018*\u00020T2\u0006\u0010U\u001a\u00020?\u001a\u0014\u0010V\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010X\u001a\u00020\u0000*\u00020W\u001a\u0012\u0010Z\u001a\u00020\u0000*\u00020\u00062\u0006\u0010Y\u001a\u00020\u0000\u001a\u0014\u0010[\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010Y\u001a\u00020\u0018\u001a\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\*\b\u0012\u0004\u0012\u00028\u000006\u001a/\u0010_\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\2\u0012\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b_\u0010`\u001a.\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\"\u0004\b\u0000\u0010a\"\u0004\b\u0001\u0010b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\u001a\n\u0010f\u001a\u00020\u0004*\u00020e\u001a\n\u0010f\u001a\u00020\u0004*\u00020L\u001a\n\u0010f\u001a\u00020\u0004*\u00020g\u001a\u0012\u0010k\u001a\u00020\b*\u00020h2\u0006\u0010j\u001a\u00020i\u001a\n\u0010l\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010l\u001a\u00020\u0006*\u00020\u0018\u001a\r\u0010m\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010n\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010o\u001a\u00020\u0004*\u00020*H\u0086\b\u001a3\u0010t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\\2\u0006\u0010p\u001a\u00020*2\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000q2\u0006\u0010s\u001a\u00020\u0006¢\u0006\u0004\bt\u0010u\u001a'\u0010y\u001a\u00020\u0004\"\u0004\b\u0000\u0010v*\b\u0012\u0004\u0012\u00028\u00000w2\u0006\u0010x\u001a\u00028\u0000H\u0000¢\u0006\u0004\by\u0010z\u001a\r\u0010{\u001a\u00020\u0004*\u00020*H\u0080\b\u001a\r\u0010|\u001a\u00020\u0004*\u00020*H\u0080\b\u001a\"\u0010\u0081\u0001\u001a\u00030\u0080\u0001*\u00060}j\u0002`~2\u0010\u0010\u007f\u001a\f\u0012\b\u0012\u00060}j\u0002`~06\u001a@\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\*\t\u0012\u0004\u0012\u00028\u00000\u0082\u00012\u001a\u0010\u0085\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0083\u0001¢\u0006\u0003\b\u0084\u0001H\u0086\bø\u0001\u0000\"\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0017\u0010\u008a\u0001\u001a\u0002088\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0017\u0010\u009b\u0001\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0017\u0010\u009d\u0001\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0017\u0010\u009f\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 \u0001"}, d2 = {"", "arrayLength", TypedValues.CycleType.S_WAVE_OFFSET, "count", "Lkotlin/r2;", "checkOffsetAndCount", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "", "other", "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", b.f22420d, "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "trimSubstring", "delimiters", "delimiterOffset", "", "delimiter", "indexOfControlOrNonAscii", "canParseAsIpAddress", "isSensitiveHeader", "format", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "checkDuration", "parseHexDigit", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "toHeaderList", "canReuseConnectionFor", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "", "mask", "and", "", "Lokio/m;", "medium", "writeMedium", "readMedium", "Lokio/n1;", "timeUnit", "skipAll", a.Z, ClientCookie.DISCARD_ATTR, "Ljava/net/Socket;", "peerName", "source", "isHealthy", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "threadName", "Lokio/l;", "b", "indexOfNonWhitespace", "Lokhttp3/Response;", "headersContentLength", "defaultValue", "toLongOrDefault", "toNonNegativeInt", "T", "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", "V", "", "toImmutableMap", "Ljava/io/Closeable;", "closeQuietly", "Ljava/net/ServerSocket;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "toHexString", "wait", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "", "Lkotlin/Function1;", "Lkotlin/u;", "predicate", "filterList", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lokio/b1;", "UNICODE_BOMS", "Lokio/b1;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/r;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/r;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", TTDownloadField.TT_USERAGENT, "okhttp"}, k = 2, mv = {1, 8, 0})
@h(name = "Util")
@r1({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,636:1\n37#2,2:637\n1627#3,6:639\n1#4:645\n1549#5:646\n1620#5,3:647\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n*L\n127#1:637,2\n167#1:639,6\n300#1:646\n300#1:647,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Util {

    @l
    @e
    public static final byte[] EMPTY_BYTE_ARRAY;

    @l
    @e
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);

    @l
    @e
    public static final RequestBody EMPTY_REQUEST;

    @l
    @e
    public static final ResponseBody EMPTY_RESPONSE;

    @l
    private static final b1 UNICODE_BOMS;

    @l
    @e
    public static final TimeZone UTC;

    @l
    private static final r VERIFY_AS_IP_ADDRESS;

    @e
    public static final boolean assertionsEnabled;

    @l
    @e
    public static final String okHttpName;

    @l
    public static final String userAgent = "okhttp/4.12.0";

    static {
        String a42;
        String g42;
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        b1.a aVar = b1.f20864c;
        n.a aVar2 = n.Companion;
        UNICODE_BOMS = aVar.d(aVar2.i("efbbbf"), aVar2.i("feff"), aVar2.i("fffe"), aVar2.i("0000ffff"), aVar2.i("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        l0.m(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new r("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        l0.o(name, "OkHttpClient::class.java.name");
        a42 = f0.a4(name, "okhttp3.");
        g42 = f0.g4(a42, "Client");
        okHttpName = g42;
    }

    public static final <E> void addIfAbsent(@l List<E> list, E e5) {
        l0.p(list, "<this>");
        if (!list.contains(e5)) {
            list.add(e5);
        }
    }

    public static final int and(byte b5, int i5) {
        return b5 & i5;
    }

    public static final int and(short s5, int i5) {
        return s5 & i5;
    }

    public static final long and(int i5, long j5) {
        return i5 & j5;
    }

    @l
    public static final EventListener.Factory asFactory(@l final EventListener eventListener) {
        l0.p(eventListener, "<this>");
        return new EventListener.Factory() { // from class: j4.b
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                EventListener asFactory$lambda$8;
                asFactory$lambda$8 = Util.asFactory$lambda$8(EventListener.this, call);
                return asFactory$lambda$8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$8(EventListener this_asFactory, Call it) {
        l0.p(this_asFactory, "$this_asFactory");
        l0.p(it, "it");
        return this_asFactory;
    }

    public static final void assertThreadDoesntHoldLock(@l Object obj) {
        l0.p(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(@l Object obj) {
        l0.p(obj, "<this>");
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
        }
    }

    public static final boolean canParseAsIpAddress(@l String str) {
        l0.p(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.matches(str);
    }

    public static final boolean canReuseConnectionFor(@l HttpUrl httpUrl, @l HttpUrl other) {
        l0.p(httpUrl, "<this>");
        l0.p(other, "other");
        if (l0.g(httpUrl.host(), other.host()) && httpUrl.port() == other.port() && l0.g(httpUrl.scheme(), other.scheme())) {
            return true;
        }
        return false;
    }

    public static final int checkDuration(@l String name, long j5, @m TimeUnit timeUnit) {
        boolean z4;
        boolean z5;
        boolean z6;
        l0.p(name, "name");
        boolean z7 = true;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (timeUnit != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                long millis = timeUnit.toMillis(j5);
                if (millis <= 2147483647L) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (millis == 0 && j5 > 0) {
                        z7 = false;
                    }
                    if (z7) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((name + " too small.").toString());
                }
                throw new IllegalArgumentException((name + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((name + " < 0").toString());
    }

    public static final void checkOffsetAndCount(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@l Closeable closeable) {
        l0.p(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    @l
    public static final String[] concat(@l String[] strArr, @l String value) {
        int we;
        l0.p(strArr, "<this>");
        l0.p(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        l0.o(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        we = p.we(strArr2);
        strArr2[we] = value;
        return strArr2;
    }

    public static final int delimiterOffset(@l String str, @l String delimiters, int i5, int i6) {
        boolean S2;
        l0.p(str, "<this>");
        l0.p(delimiters, "delimiters");
        while (i5 < i6) {
            S2 = f0.S2(delimiters, str.charAt(i5), false, 2, null);
            if (S2) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = str.length();
        }
        return delimiterOffset(str, str2, i5, i6);
    }

    public static final boolean discard(@l n1 n1Var, int i5, @l TimeUnit timeUnit) {
        l0.p(n1Var, "<this>");
        l0.p(timeUnit, "timeUnit");
        try {
            return skipAll(n1Var, i5, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @l
    public static final <T> List<T> filterList(@l Iterable<? extends T> iterable, @l v3.l<? super T, Boolean> predicate) {
        List<T> E;
        l0.p(iterable, "<this>");
        l0.p(predicate, "predicate");
        E = w.E();
        for (T t5 : iterable) {
            if (predicate.invoke(t5).booleanValue()) {
                if (E.isEmpty()) {
                    E = new ArrayList<>();
                }
                l0.n(E, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                u1.g(E).add(t5);
            }
        }
        return E;
    }

    @l
    public static final String format(@l String format, @l Object... args) {
        l0.p(format, "format");
        l0.p(args, "args");
        t1 t1Var = t1.f19457a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        l0.o(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean hasIntersection(@l String[] strArr, @m String[] strArr2, @l Comparator<? super String> comparator) {
        boolean z4;
        boolean z5;
        l0.p(strArr, "<this>");
        l0.p(comparator, "comparator");
        if (strArr.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && strArr2 != null) {
            if (strArr2.length == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                for (String str : strArr) {
                    Iterator a5 = i.a(strArr2);
                    while (a5.hasNext()) {
                        if (comparator.compare(str, (String) a5.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@l Response response) {
        l0.p(response, "<this>");
        String str = response.headers().get(HTTP.CONTENT_LEN);
        if (str == null) {
            return -1L;
        }
        return toLongOrDefault(str, -1L);
    }

    public static final void ignoreIoExceptions(@l v3.a<r2> block) {
        l0.p(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @l
    public static final <T> List<T> immutableListOf(@l T... elements) {
        List L;
        l0.p(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        L = w.L(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(L);
        l0.o(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(@l String[] strArr, @l String value, @l Comparator<String> comparator) {
        boolean z4;
        l0.p(strArr, "<this>");
        l0.p(value, "value");
        l0.p(comparator, "comparator");
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (comparator.compare(strArr[i5], value) == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@l String str) {
        l0.p(str, "<this>");
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (l0.t(charAt, 31) <= 0 || l0.t(charAt, 127) >= 0) {
                return i5;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@l String str, int i5, int i6) {
        boolean z4;
        boolean z5;
        boolean z6;
        l0.p(str, "<this>");
        while (i5 < i6) {
            char charAt = str.charAt(i5);
            boolean z7 = false;
            if (charAt == '\t' || charAt == '\n') {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || charAt == '\f') {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 || charAt == '\r') {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 || charAt == ' ') {
                z7 = true;
            }
            if (!z7) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i5, i6);
    }

    public static final int indexOfLastNonAsciiWhitespace(@l String str, int i5, int i6) {
        boolean z4;
        boolean z5;
        boolean z6;
        l0.p(str, "<this>");
        int i7 = i6 - 1;
        if (i5 <= i7) {
            while (true) {
                char charAt = str.charAt(i7);
                boolean z7 = false;
                if (charAt == '\t' || charAt == '\n') {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 || charAt == '\f') {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 || charAt == '\r') {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 || charAt == ' ') {
                    z7 = true;
                }
                if (!z7) {
                    return i7 + 1;
                }
                if (i7 == i5) {
                    break;
                }
                i7--;
            }
        }
        return i5;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i5, i6);
    }

    public static final int indexOfNonWhitespace(@l String str, int i5) {
        l0.p(str, "<this>");
        int length = str.length();
        while (i5 < length) {
            char charAt = str.charAt(i5);
            if (charAt != ' ' && charAt != '\t') {
                return i5;
            }
            i5++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        return indexOfNonWhitespace(str, i5);
    }

    @l
    public static final String[] intersect(@l String[] strArr, @l String[] other, @l Comparator<? super String> comparator) {
        l0.p(strArr, "<this>");
        l0.p(other, "other");
        l0.p(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i5]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i5++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(@l FileSystem fileSystem, @l File file) {
        l0.p(fileSystem, "<this>");
        l0.p(file, "file");
        l1 sink = fileSystem.sink(file);
        try {
            l1 l1Var = sink;
            try {
                fileSystem.delete(file);
                c.a(sink, null);
                return true;
            } catch (IOException unused) {
                r2 r2Var = r2.f19517a;
                c.a(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean isHealthy(@l Socket socket2, @l BufferedSource source) {
        l0.p(socket2, "<this>");
        l0.p(source, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z4 = !source.e0();
                socket2.setSoTimeout(soTimeout);
                return z4;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(@l String name) {
        boolean K1;
        boolean K12;
        boolean K13;
        boolean K14;
        l0.p(name, "name");
        K1 = e0.K1(name, AUTH.WWW_AUTH_RESP, true);
        if (K1) {
            return true;
        }
        K12 = e0.K1(name, SM.COOKIE, true);
        if (K12) {
            return true;
        }
        K13 = e0.K1(name, AUTH.PROXY_AUTH_RESP, true);
        if (K13) {
            return true;
        }
        K14 = e0.K1(name, SM.SET_COOKIE, true);
        if (K14) {
            return true;
        }
        return false;
    }

    public static final void notify(@l Object obj) {
        l0.p(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(@l Object obj) {
        l0.p(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c5) {
        if ('0' <= c5 && c5 < ':') {
            return c5 - '0';
        }
        char c6 = 'a';
        if (!('a' <= c5 && c5 < 'g')) {
            c6 = 'A';
            if (!('A' <= c5 && c5 < 'G')) {
                return -1;
            }
        }
        return (c5 - c6) + 10;
    }

    @l
    public static final String peerName(@l Socket socket2) {
        l0.p(socket2, "<this>");
        SocketAddress remoteSocketAddress = socket2.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            l0.o(hostName, "address.hostName");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    @l
    public static final Charset readBomAsCharset(@l BufferedSource bufferedSource, @l Charset charset) throws IOException {
        l0.p(bufferedSource, "<this>");
        l0.p(charset, "default");
        int B0 = bufferedSource.B0(UNICODE_BOMS);
        if (B0 != -1) {
            if (B0 != 0) {
                if (B0 != 1) {
                    if (B0 != 2) {
                        if (B0 != 3) {
                            if (B0 == 4) {
                                return f.f19702a.c();
                            }
                            throw new AssertionError();
                        }
                        return f.f19702a.b();
                    }
                    Charset UTF_16LE = StandardCharsets.UTF_16LE;
                    l0.o(UTF_16LE, "UTF_16LE");
                    return UTF_16LE;
                }
                Charset UTF_16BE = StandardCharsets.UTF_16BE;
                l0.o(UTF_16BE, "UTF_16BE");
                return UTF_16BE;
            }
            Charset UTF_8 = StandardCharsets.UTF_8;
            l0.o(UTF_8, "UTF_8");
            return UTF_8;
        }
        return charset;
    }

    @m
    public static final <T> T readFieldOrNull(@l Object instance, @l Class<T> fieldType, @l String fieldName) {
        T t5;
        Object readFieldOrNull;
        l0.p(instance, "instance");
        l0.p(fieldType, "fieldType");
        l0.p(fieldName, "fieldName");
        Class<?> cls = instance.getClass();
        while (true) {
            t5 = null;
            if (!l0.g(cls, Object.class)) {
                try {
                    Field declaredField = cls.getDeclaredField(fieldName);
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(instance);
                    if (!fieldType.isInstance(obj)) {
                        break;
                    }
                    t5 = fieldType.cast(obj);
                    break;
                } catch (NoSuchFieldException unused) {
                    cls = cls.getSuperclass();
                    l0.o(cls, "c.superclass");
                }
            } else {
                if (l0.g(fieldName, "delegate") || (readFieldOrNull = readFieldOrNull(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(readFieldOrNull, fieldType, fieldName);
            }
        }
        return t5;
    }

    public static final int readMedium(@l BufferedSource bufferedSource) throws IOException {
        l0.p(bufferedSource, "<this>");
        return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
    }

    public static final boolean skipAll(@l n1 n1Var, int i5, @l TimeUnit timeUnit) throws IOException {
        l0.p(n1Var, "<this>");
        l0.p(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = n1Var.timeout().hasDeadline() ? n1Var.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        n1Var.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i5)) + nanoTime);
        try {
            okio.l lVar = new okio.l();
            while (n1Var.read(lVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                lVar.c();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                n1Var.timeout().clearDeadline();
            } else {
                n1Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                n1Var.timeout().clearDeadline();
            } else {
                n1Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                n1Var.timeout().clearDeadline();
            } else {
                n1Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    @l
    public static final ThreadFactory threadFactory(@l final String name, final boolean z4) {
        l0.p(name, "name");
        return new ThreadFactory() { // from class: j4.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadFactory$lambda$1;
                threadFactory$lambda$1 = Util.threadFactory$lambda$1(name, z4, runnable);
                return threadFactory$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String name, boolean z4, Runnable runnable) {
        l0.p(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z4);
        return thread;
    }

    public static final void threadName(@l String name, @l v3.a<r2> block) {
        l0.p(name, "name");
        l0.p(block, "block");
        Thread currentThread = Thread.currentThread();
        String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            block.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            currentThread.setName(name2);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    @l
    public static final List<Header> toHeaderList(@l Headers headers) {
        kotlin.ranges.l W1;
        int Y;
        l0.p(headers, "<this>");
        W1 = u.W1(0, headers.size());
        Y = x.Y(W1, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int nextInt = ((s0) it).nextInt();
            arrayList.add(new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    @l
    public static final Headers toHeaders(@l List<Header> list) {
        l0.p(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    @l
    public static final String toHexString(long j5) {
        String hexString = Long.toHexString(j5);
        l0.o(hexString, "toHexString(this)");
        return hexString;
    }

    @l
    public static final String toHostHeader(@l HttpUrl httpUrl, boolean z4) {
        boolean T2;
        String host;
        l0.p(httpUrl, "<this>");
        T2 = f0.T2(httpUrl.host(), ":", false, 2, null);
        if (T2) {
            host = '[' + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (z4 || httpUrl.port() != HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host + ':' + httpUrl.port();
        }
        return host;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        return toHostHeader(httpUrl, z4);
    }

    @l
    public static final <T> List<T> toImmutableList(@l List<? extends T> list) {
        List V5;
        l0.p(list, "<this>");
        V5 = kotlin.collections.e0.V5(list);
        List<T> unmodifiableList = Collections.unmodifiableList(V5);
        l0.o(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    @l
    public static final <K, V> Map<K, V> toImmutableMap(@l Map<K, ? extends V> map) {
        Map<K, V> z4;
        l0.p(map, "<this>");
        if (map.isEmpty()) {
            z4 = a1.z();
            return z4;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        l0.o(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(@l String str, long j5) {
        l0.p(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j5;
        }
    }

    public static final int toNonNegativeInt(@m String str, int i5) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i5;
    }

    @l
    public static final String trimSubstring(@l String str, int i5, int i6) {
        l0.p(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i5, i6);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i6));
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        return trimSubstring(str, i5, i6);
    }

    public static final void wait(@l Object obj) {
        l0.p(obj, "<this>");
        obj.wait();
    }

    @l
    public static final Throwable withSuppressed(@l Exception exc, @l List<? extends Exception> suppressed) {
        l0.p(exc, "<this>");
        l0.p(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            kotlin.p.a(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(@l okio.m mVar, int i5) throws IOException {
        l0.p(mVar, "<this>");
        mVar.writeByte((i5 >>> 16) & 255);
        mVar.writeByte((i5 >>> 8) & 255);
        mVar.writeByte(i5 & 255);
    }

    public static final int delimiterOffset(@l String str, char c5, int i5, int i6) {
        l0.p(str, "<this>");
        while (i5 < i6) {
            if (str.charAt(i5) == c5) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c5, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = str.length();
        }
        return delimiterOffset(str, c5, i5, i6);
    }

    @l
    public static final String toHexString(int i5) {
        String hexString = Integer.toHexString(i5);
        l0.o(hexString, "toHexString(this)");
        return hexString;
    }

    public static final void closeQuietly(@l Socket socket2) {
        l0.p(socket2, "<this>");
        try {
            socket2.close();
        } catch (AssertionError e5) {
            throw e5;
        } catch (RuntimeException e6) {
            if (!l0.g(e6.getMessage(), "bio == null")) {
                throw e6;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@l ServerSocket serverSocket) {
        l0.p(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(@l okio.l lVar, byte b5) {
        l0.p(lVar, "<this>");
        int i5 = 0;
        while (!lVar.e0() && lVar.P(0L) == b5) {
            i5++;
            lVar.readByte();
        }
        return i5;
    }
}
