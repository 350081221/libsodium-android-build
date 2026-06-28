package okhttp3;

import androidx.autofill.HintConstants;
import com.android.dx.io.Opcodes;
import com.android.multidex.ClassPathElement;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.actions.SearchIntents;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k0.c;
import kotlin.b1;
import kotlin.collections.l1;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.internal.n;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.ranges.j;
import kotlin.ranges.u;
import kotlin.text.e0;
import kotlin.text.f0;
import kotlin.text.h0;
import kotlin.text.k0;
import kotlin.text.r;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;
import t0.b;
import u3.h;

@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", HintConstants.AUTOFILL_HINT_USERNAME, HintConstants.AUTOFILL_HINT_PASSWORD, c.f19042f, ClientCookie.PORT_ATTR, "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", SearchIntents.EXTRA_QUERY, "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", TTDownloadField.TT_HASHCODE, "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", "index", "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpUrl {

    @l
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    @l
    public static final String FRAGMENT_ENCODE_SET = "";

    @l
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @l
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @l
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @l
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @l
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @l
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @l
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @l
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @l
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @m
    private final String fragment;

    @l
    private final String host;
    private final boolean isHttps;

    @l
    private final String password;

    @l
    private final List<String> pathSegments;
    private final int port;

    @m
    private final List<String> queryNamesAndValues;

    @l
    private final String scheme;

    @l
    private final String url;

    @l
    private final String username;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\r\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\bZ\u0010[J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J0\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0002J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u0010\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0010\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0004J\u0018\u0010,\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0004J\u0018\u00100\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u0018\u00101\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0004J\u000e\u00102\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u00103\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0004J\u0010\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0004J\u0010\u00105\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0004J\u000f\u00108\u001a\u00020\u0000H\u0000¢\u0006\u0004\b6\u00107J\u0006\u0010:\u001a\u000209J\b\u0010;\u001a\u00020\u0004H\u0016J!\u0010?\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001092\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b=\u0010>R$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0018\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010@\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR\"\u0010\u001a\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010\u001c\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010Q\u001a\u0004\bR\u0010SR,\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010S\"\u0004\bV\u0010WR$\u00105\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010@\u001a\u0004\bX\u0010B\"\u0004\bY\u0010D¨\u0006]"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "", "effectivePort", "", "pathSegments", "", "alreadyEncoded", "addPathSegments", "canonicalName", "Lkotlin/r2;", "removeAllCanonicalQueryParameters", "input", "startPos", "limit", "resolvePath", "pos", "addTrailingSlash", "push", "isDot", "isDotDot", "pop", "scheme", HintConstants.AUTOFILL_HINT_USERNAME, "encodedUsername", HintConstants.AUTOFILL_HINT_PASSWORD, "encodedPassword", c.f19042f, ClientCookie.PORT_ATTR, "pathSegment", "addPathSegment", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "index", "setPathSegment", "setEncodedPathSegment", "removePathSegment", "encodedPath", SearchIntents.EXTRA_QUERY, "encodedQuery", "name", b.f22420d, "addQueryParameter", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "toString", "base", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "Ljava/lang/String;", "getScheme$okhttp", "()Ljava/lang/String;", "setScheme$okhttp", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1869:1\n1#2:1870\n1549#3:1871\n1620#3,3:1872\n1549#3:1875\n1620#3,3:1876\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1180#1:1871\n1180#1:1872,3\n1181#1:1875\n1181#1:1876,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        public static final String INVALID_HOST = "Invalid URL host";

        @m
        private String encodedFragment;

        @l
        private final List<String> encodedPathSegments;

        @m
        private List<String> encodedQueryNamesAndValues;

        @m
        private String host;

        @m
        private String scheme;

        @l
        private String encodedUsername = "";

        @l
        private String encodedPassword = "";
        private int port = -1;

        @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i5, int i6) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, i6, "", false, false, false, false, null, 248, null));
                    boolean z4 = false;
                    if (1 <= parseInt && parseInt < 65536) {
                        z4 = true;
                    }
                    if (!z4) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i5, int i6) {
                while (i5 < i6) {
                    char charAt = str.charAt(i5);
                    if (charAt != '[') {
                        if (charAt == ':') {
                            return i5;
                        }
                        i5++;
                    }
                    do {
                        i5++;
                        if (i5 < i6) {
                        }
                        i5++;
                    } while (str.charAt(i5) != ']');
                    i5++;
                }
                return i6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i5, int i6) {
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                boolean z8;
                if (i6 - i5 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i5);
                if ((l0.t(charAt, 97) >= 0 && l0.t(charAt, 122) <= 0) || (l0.t(charAt, 65) >= 0 && l0.t(charAt, 90) <= 0)) {
                    for (int i7 = i5 + 1; i7 < i6; i7++) {
                        char charAt2 = str.charAt(i7);
                        boolean z9 = false;
                        if ('a' <= charAt2 && charAt2 < '{') {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 || ('A' <= charAt2 && charAt2 < '[')) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5 || ('0' <= charAt2 && charAt2 < ':')) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6 || charAt2 == '+') {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7 || charAt2 == '-') {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8 || charAt2 == '.') {
                            z9 = true;
                        }
                        if (!z9) {
                            if (charAt2 != ':') {
                                return -1;
                            }
                            return i7;
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i5, int i6) {
                int i7 = 0;
                while (i5 < i6) {
                    char charAt = str.charAt(i5);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i7++;
                    i5++;
                }
                return i7;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i5 = this.port;
            if (i5 != -1) {
                return i5;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            l0.m(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            boolean K1;
            if (l0.g(str, ".")) {
                return true;
            }
            K1 = e0.K1(str, "%2e", true);
            if (K1) {
                return true;
            }
            return false;
        }

        private final boolean isDotDot(String str) {
            boolean K1;
            boolean K12;
            boolean K13;
            if (l0.g(str, "..")) {
                return true;
            }
            K1 = e0.K1(str, "%2e.", true);
            if (K1) {
                return true;
            }
            K12 = e0.K1(str, ".%2e", true);
            if (K12) {
                return true;
            }
            K13 = e0.K1(str, "%2e%2e", true);
            if (K13) {
                return true;
            }
            return false;
        }

        private final void pop() {
            boolean z4;
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && (!this.encodedPathSegments.isEmpty())) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private final void push(String str, int i5, int i6, boolean z4, boolean z5) {
            boolean z6;
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, i6, HttpUrl.PATH_SEGMENT_ENCODE_SET, z5, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (z4) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            l0.m(list);
            int size = list.size() - 2;
            int c5 = n.c(size, 0, -2);
            if (c5 > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                l0.m(list2);
                if (l0.g(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    l0.m(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    l0.m(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    l0.m(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size != c5) {
                    size -= 2;
                } else {
                    return;
                }
            }
        }

        private final void resolvePath(String str, int i5, int i6) {
            boolean z4;
            if (i5 == i6) {
                return;
            }
            char charAt = str.charAt(i5);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            } else {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i5++;
            }
            while (true) {
                int i7 = i5;
                while (i7 < i6) {
                    i5 = Util.delimiterOffset(str, "/\\", i7, i6);
                    if (i5 < i6) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    push(str, i7, i5, z4, true);
                    if (z4) {
                        i7 = i5 + 1;
                    }
                }
                return;
            }
        }

        @l
        public final Builder addEncodedPathSegment(@l String encodedPathSegment) {
            l0.p(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @l
        public final Builder addEncodedPathSegments(@l String encodedPathSegments) {
            l0.p(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        @l
        public final Builder addEncodedQueryParameter(@l String encodedName, @m String str) {
            String str2;
            l0.p(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l0.m(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, Opcodes.DIV_INT_LIT16, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            l0.m(list2);
            if (str != null) {
                str2 = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, Opcodes.DIV_INT_LIT16, null);
            } else {
                str2 = null;
            }
            list2.add(str2);
            return this;
        }

        @l
        public final Builder addPathSegment(@l String pathSegment) {
            l0.p(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @l
        public final Builder addPathSegments(@l String pathSegments) {
            l0.p(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        @l
        public final Builder addQueryParameter(@l String name, @m String str) {
            String str2;
            l0.p(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l0.m(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, Opcodes.DIV_INT_LIT8, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            l0.m(list2);
            if (str != null) {
                str2 = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, Opcodes.DIV_INT_LIT8, null);
            } else {
                str2 = null;
            }
            list2.add(str2);
            return this;
        }

        @l
        public final HttpUrl build() {
            int Y;
            ArrayList arrayList;
            String str;
            int Y2;
            String str2;
            String str3 = this.scheme;
            if (str3 != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str4 = this.host;
                if (str4 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    Y = x.Y(list, 10);
                    ArrayList arrayList2 = new ArrayList(Y);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 != null) {
                        List<String> list3 = list2;
                        Y2 = x.Y(list3, 10);
                        arrayList = new ArrayList(Y2);
                        for (String str5 : list3) {
                            if (str5 != null) {
                                str2 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str5, 0, 0, true, 3, null);
                            } else {
                                str2 = null;
                            }
                            arrayList.add(str2);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str6 = this.encodedFragment;
                    if (str6 != null) {
                        str = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str6, 0, 0, false, 7, null);
                    } else {
                        str = null;
                    }
                    return new HttpUrl(str3, percentDecode$okhttp$default, percentDecode$okhttp$default2, str4, effectivePort, arrayList2, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        @l
        public final Builder encodedFragment(@m String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @l
        public final Builder encodedPassword(@l String encodedPassword) {
            l0.p(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @l
        public final Builder encodedPath(@l String encodedPath) {
            boolean s22;
            l0.p(encodedPath, "encodedPath");
            s22 = e0.s2(encodedPath, "/", false, 2, null);
            if (s22) {
                resolvePath(encodedPath, 0, encodedPath.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
        }

        @l
        public final Builder encodedQuery(@m String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, Opcodes.DIV_INT_LIT16, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @l
        public final Builder encodedUsername(@l String encodedUsername) {
            l0.p(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @l
        public final Builder fragment(@m String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @m
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        @l
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        @l
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @m
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @l
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        @m
        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        @m
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        @l
        public final Builder host(@l String host) {
            l0.p(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        @l
        public final Builder parse$okhttp(@m HttpUrl httpUrl, @l String str) {
            String V8;
            int delimiterOffset;
            int i5;
            int i6;
            String str2;
            boolean z4;
            int i7;
            String str3;
            int i8;
            boolean z5;
            boolean p22;
            boolean p23;
            String input = str;
            l0.p(input, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String str4 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z6 = true;
            char c5 = 65535;
            if (schemeDelimiterOffset != -1) {
                p22 = e0.p2(input, "https:", indexOfFirstNonAsciiWhitespace$default, true);
                if (p22) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    p23 = e0.p2(input, "http:", indexOfFirstNonAsciiWhitespace$default, true);
                    if (p23) {
                        this.scheme = "http";
                        indexOfFirstNonAsciiWhitespace$default += 5;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, schemeDelimiterOffset);
                        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                if (str.length() > 6) {
                    StringBuilder sb2 = new StringBuilder();
                    V8 = h0.V8(input, 6);
                    sb2.append(V8);
                    sb2.append("...");
                    input = sb2.toString();
                }
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input);
            }
            int slashCount = companion.slashCount(input, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c6 = '?';
            char c7 = '#';
            if (slashCount < 2 && httpUrl != null && l0.g(httpUrl.scheme(), this.scheme)) {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || input.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i5 = indexOfLastNonAsciiWhitespace$default;
            } else {
                int i9 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                boolean z7 = false;
                boolean z8 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(input, "@/\\?#", i9, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? input.charAt(delimiterOffset) : c5;
                    if (charAt == c5 || charAt == c7 || charAt == '/' || charAt == '\\' || charAt == c6) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z7) {
                            int delimiterOffset2 = Util.delimiterOffset(input, ':', i9, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            z4 = z6;
                            i7 = indexOfLastNonAsciiWhitespace$default;
                            String str5 = str4;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i9, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z8) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z5 = z4;
                            } else {
                                z5 = z7;
                            }
                            z7 = z5;
                            str3 = str5;
                            z8 = z4;
                            i8 = delimiterOffset;
                        } else {
                            z4 = z6;
                            i7 = indexOfLastNonAsciiWhitespace$default;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            str3 = str4;
                            i8 = delimiterOffset;
                            sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i9, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb3.toString();
                        }
                        i9 = i8 + 1;
                        str4 = str3;
                        z6 = z4;
                        indexOfLastNonAsciiWhitespace$default = i7;
                        c7 = '#';
                        c6 = '?';
                        c5 = 65535;
                    }
                }
                boolean z9 = z6;
                String str6 = str4;
                i5 = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(input, i9, delimiterOffset);
                int i10 = portColonOffset + 1;
                if (i10 < delimiterOffset) {
                    i6 = i9;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i9, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(input, i10, delimiterOffset);
                    this.port = parsePort;
                    if (!(parsePort != -1 ? z9 : false)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = input.substring(i10, delimiterOffset);
                        l0.o(substring2, str6);
                        sb4.append(substring2);
                        sb4.append(k0.f19765b);
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str2 = str6;
                } else {
                    i6 = i9;
                    str2 = str6;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i6, portColonOffset, false, 4, null));
                    String str7 = this.scheme;
                    l0.m(str7);
                    this.port = companion4.defaultPort(str7);
                }
                if (!(this.host != null ? z9 : false)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = input.substring(i6, portColonOffset);
                    l0.o(substring3, str2);
                    sb5.append(substring3);
                    sb5.append(k0.f19765b);
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
            }
            int i11 = i5;
            int delimiterOffset3 = Util.delimiterOffset(input, "?#", indexOfFirstNonAsciiWhitespace$default, i11);
            resolvePath(input, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i11 && input.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(input, '#', delimiterOffset3, i11);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, Opcodes.ADD_INT_LIT16, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i11 && input.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i11, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @l
        public final Builder password(@l String password) {
            l0.p(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, Opcodes.INVOKE_POLYMORPHIC_RANGE, null);
            return this;
        }

        @l
        public final Builder port(int i5) {
            boolean z4 = false;
            if (1 <= i5 && i5 < 65536) {
                z4 = true;
            }
            if (z4) {
                this.port = i5;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i5).toString());
        }

        @l
        public final Builder query(@m String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, Opcodes.DIV_INT_LIT8, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @l
        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2;
            String str3 = this.host;
            String str4 = null;
            if (str3 != null) {
                str = new r("[\"<>^`{|}]").replace(str3, "");
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i5 = 0; i5 < size; i5++) {
                List<String> list = this.encodedPathSegments;
                list.set(i5, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i5), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    String str5 = list2.get(i6);
                    if (str5 != null) {
                        str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str5, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i6, str2);
                }
            }
            String str6 = this.encodedFragment;
            if (str6 != null) {
                str4 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str6, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null);
            }
            this.encodedFragment = str4;
            return this;
        }

        @l
        public final Builder removeAllEncodedQueryParameters(@l String encodedName) {
            l0.p(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, Opcodes.DIV_INT_LIT16, null));
            return this;
        }

        @l
        public final Builder removeAllQueryParameters(@l String name) {
            l0.p(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, Opcodes.DIV_INT_LIT8, null));
            return this;
        }

        @l
        public final Builder removePathSegment(int i5) {
            this.encodedPathSegments.remove(i5);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @l
        public final Builder scheme(@l String scheme) {
            boolean K1;
            boolean K12;
            l0.p(scheme, "scheme");
            K1 = e0.K1(scheme, "http", true);
            if (K1) {
                this.scheme = "http";
            } else {
                K12 = e0.K1(scheme, "https", true);
                if (K12) {
                    this.scheme = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(@m String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@l String str) {
            l0.p(str, "<set-?>");
            this.encodedPassword = str;
        }

        @l
        public final Builder setEncodedPathSegment(int i5, @l String encodedPathSegment) {
            boolean z4;
            l0.p(encodedPathSegment, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i5, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@m List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @l
        public final Builder setEncodedQueryParameter(@l String encodedName, @m String str) {
            l0.p(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(@l String str) {
            l0.p(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@m String str) {
            this.host = str;
        }

        @l
        public final Builder setPathSegment(int i5, @l String pathSegment) {
            boolean z4;
            l0.p(pathSegment, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, Opcodes.INVOKE_POLYMORPHIC_RANGE, null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.encodedPathSegments.set(i5, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
        }

        public final void setPort$okhttp(int i5) {
            this.port = i5;
        }

        @l
        public final Builder setQueryParameter(@l String name, @m String str) {
            l0.p(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(@m String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            if (r1 != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
        
            if (r1 != r3.defaultPort(r2)) goto L38;
         */
        @p4.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = r2
                goto L24
            L23:
                r1 = r3
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = r2
                goto L33
            L32:
                r1 = r3
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = r3
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L77
                kotlin.jvm.internal.l0.m(r1)
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.v.S2(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L72
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L77
            L72:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L77:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L80
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L99
            L80:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L93
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                kotlin.jvm.internal.l0.m(r2)
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L99
            L93:
                r0.append(r4)
                r0.append(r1)
            L99:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto Lb1
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.l0.m(r2)
                r1.toQueryString$okhttp(r2, r0)
            Lb1:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lbf
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lbf:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.l0.o(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        @l
        public final Builder username(@l String username) {
            l0.p(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, Opcodes.INVOKE_POLYMORPHIC_RANGE, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z4) {
            int i5 = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i5, str.length());
                push(str, i5, delimiterOffset, delimiterOffset < str.length(), z4);
                i5 = delimiterOffset + 1;
            } while (i5 <= str.length());
            return this;
        }
    }

    @i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bG\u0010HJ,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001d\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u001b\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 *\u00020\u0003H\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010'\u001a\u00020$*\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010&J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020*H\u0007¢\u0006\u0004\b%\u0010+J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020,H\u0007¢\u0006\u0004\b%\u0010-J\u0017\u0010%\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b/\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b0\u0010&J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020*H\u0007¢\u0006\u0004\b/\u0010+J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u00101\u001a\u00020,H\u0007¢\u0006\u0004\b/\u0010-J1\u00104\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u00103Jc\u00107\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u00109R\u0014\u0010@\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u00109R\u0014\u0010A\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u00109R\u0014\u0010B\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u00109R\u0014\u0010C\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u00109R\u0014\u0010D\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u00109R\u0014\u0010E\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u00109R\u0014\u0010F\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u00109¨\u0006I"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "Lokio/l;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lkotlin/r2;", "writePercentDecoded", "isPercentEncoded", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "writeCanonicalized", "scheme", "defaultPort", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i5, int i6, String str2, boolean z4, boolean z5, boolean z6, boolean z7, Charset charset, int i7, Object obj) {
            return companion.canonicalize$okhttp(str, (i7 & 1) != 0 ? 0 : i5, (i7 & 2) != 0 ? str.length() : i6, str2, (i7 & 8) != 0 ? false : z4, (i7 & 16) != 0 ? false : z5, (i7 & 32) != 0 ? false : z6, (i7 & 64) != 0 ? false : z7, (i7 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i5, int i6) {
            int i7 = i5 + 2;
            if (i7 < i6 && str.charAt(i5) == '%' && Util.parseHexDigit(str.charAt(i5 + 1)) != -1 && Util.parseHexDigit(str.charAt(i7)) != -1) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i5, int i6, boolean z4, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i5 = 0;
            }
            if ((i7 & 2) != 0) {
                i6 = str.length();
            }
            if ((i7 & 4) != 0) {
                z4 = false;
            }
            return companion.percentDecode$okhttp(str, i5, i6, z4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
        
            if (isPercentEncoded(r16, r5, r18) == false) goto L41;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void writeCanonicalized(okio.l r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lb9
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb2
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.C(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L69
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L69
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L49
                if (r23 == 0) goto L69
            L49:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.v.S2(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L67
                if (r7 != r9) goto L62
                if (r20 == 0) goto L67
                if (r21 == 0) goto L62
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L63
                goto L6c
            L62:
                r8 = r14
            L63:
                r15.l(r7)
                goto Lb2
            L67:
                r8 = r14
                goto L6c
            L69:
                r8 = r14
                r12 = r19
            L6c:
                if (r6 != 0) goto L73
                okio.l r6 = new okio.l
                r6.<init>()
            L73:
                if (r3 == 0) goto L87
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.l0.g(r3, r10)
                if (r10 == 0) goto L7e
                goto L87
            L7e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.S(r1, r5, r10, r3)
                goto L8a
            L87:
                r6.l(r7)
            L8a:
                boolean r10 = r6.e0()
                if (r10 != 0) goto Lb2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L8a
            Lb2:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lb9:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.l, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(okio.l lVar, String str, int i5, int i6, boolean z4) {
            int i7;
            while (i5 < i6) {
                int codePointAt = str.codePointAt(i5);
                if (codePointAt == 37 && (i7 = i5 + 2) < i6) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i5 + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i7));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        lVar.writeByte((parseHexDigit << 4) + parseHexDigit2);
                        i5 = Character.charCount(codePointAt) + i7;
                    }
                    lVar.l(codePointAt);
                    i5 += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z4) {
                        lVar.writeByte(32);
                        i5++;
                    }
                    lVar.l(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
            }
        }

        @l
        @h(name = "-deprecated_get")
        @k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m6527deprecated_get(@l String url) {
            l0.p(url, "url");
            return get(url);
        }

        @h(name = "-deprecated_parse")
        @k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @m
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m6530deprecated_parse(@l String url) {
            l0.p(url, "url");
            return parse(url);
        }

        @l
        public final String canonicalize$okhttp(@l String str, int i5, int i6, @l String encodeSet, boolean z4, boolean z5, boolean z6, boolean z7, @m Charset charset) {
            boolean S2;
            l0.p(str, "<this>");
            l0.p(encodeSet, "encodeSet");
            int i7 = i5;
            while (i7 < i6) {
                int codePointAt = str.codePointAt(i7);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z7)) {
                    S2 = f0.S2(encodeSet, (char) codePointAt, false, 2, null);
                    if (!S2) {
                        if (codePointAt == 37) {
                            if (z4) {
                                if (z5) {
                                    if (!isPercentEncoded(str, i7, i6)) {
                                        okio.l lVar = new okio.l();
                                        lVar.F(str, i5, i7);
                                        writeCanonicalized(lVar, str, i7, i6, encodeSet, z4, z5, z6, z7, charset);
                                        return lVar.s0();
                                    }
                                    if (codePointAt == 43 || !z6) {
                                        i7 += Character.charCount(codePointAt);
                                    } else {
                                        okio.l lVar2 = new okio.l();
                                        lVar2.F(str, i5, i7);
                                        writeCanonicalized(lVar2, str, i7, i6, encodeSet, z4, z5, z6, z7, charset);
                                        return lVar2.s0();
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i7 += Character.charCount(codePointAt);
                    }
                }
                okio.l lVar22 = new okio.l();
                lVar22.F(str, i5, i7);
                writeCanonicalized(lVar22, str, i7, i6, encodeSet, z4, z5, z6, z7, charset);
                return lVar22.s0();
            }
            String substring = str.substring(i5, i6);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        @u3.m
        public final int defaultPort(@l String scheme) {
            l0.p(scheme, "scheme");
            if (l0.g(scheme, "http")) {
                return 80;
            }
            if (l0.g(scheme, "https")) {
                return 443;
            }
            return -1;
        }

        @l
        @h(name = "get")
        @u3.m
        public final HttpUrl get(@l String str) {
            l0.p(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        @h(name = "parse")
        @m
        @u3.m
        public final HttpUrl parse(@l String str) {
            l0.p(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @l
        public final String percentDecode$okhttp(@l String str, int i5, int i6, boolean z4) {
            l0.p(str, "<this>");
            for (int i7 = i5; i7 < i6; i7++) {
                char charAt = str.charAt(i7);
                if (charAt == '%' || (charAt == '+' && z4)) {
                    okio.l lVar = new okio.l();
                    lVar.F(str, i5, i7);
                    writePercentDecoded(lVar, str, i7, i6, z4);
                    return lVar.s0();
                }
            }
            String substring = str.substring(i5, i6);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(@l List<String> list, @l StringBuilder out) {
            l0.p(list, "<this>");
            l0.p(out, "out");
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                out.append(ClassPathElement.SEPARATOR_CHAR);
                out.append(list.get(i5));
            }
        }

        @l
        public final List<String> toQueryNamesAndValues$okhttp(@l String str) {
            int o32;
            int o33;
            l0.p(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (i5 <= str.length()) {
                o32 = f0.o3(str, k0.f19767d, i5, false, 4, null);
                if (o32 == -1) {
                    o32 = str.length();
                }
                int i6 = o32;
                o33 = f0.o3(str, o0.a.f20835h, i5, false, 4, null);
                if (o33 != -1 && o33 <= i6) {
                    String substring = str.substring(i5, o33);
                    l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(o33 + 1, i6);
                    l0.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i5, i6);
                    l0.o(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i5 = i6 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@l List<String> list, @l StringBuilder out) {
            kotlin.ranges.l W1;
            j B1;
            l0.p(list, "<this>");
            l0.p(out, "out");
            W1 = u.W1(0, list.size());
            B1 = u.B1(W1, 2);
            int e5 = B1.e();
            int g5 = B1.g();
            int i5 = B1.i();
            if ((i5 <= 0 || e5 > g5) && (i5 >= 0 || g5 > e5)) {
                return;
            }
            while (true) {
                String str = list.get(e5);
                String str2 = list.get(e5 + 1);
                if (e5 > 0) {
                    out.append(k0.f19767d);
                }
                out.append(str);
                if (str2 != null) {
                    out.append(o0.a.f20835h);
                    out.append(str2);
                }
                if (e5 != g5) {
                    e5 += i5;
                } else {
                    return;
                }
            }
        }

        @h(name = "-deprecated_get")
        @k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @m
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m6529deprecated_get(@l URL url) {
            l0.p(url, "url");
            return get(url);
        }

        @h(name = "get")
        @m
        @u3.m
        public final HttpUrl get(@l URL url) {
            l0.p(url, "<this>");
            String url2 = url.toString();
            l0.o(url2, "toString()");
            return parse(url2);
        }

        @h(name = "-deprecated_get")
        @k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @m
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m6528deprecated_get(@l URI uri) {
            l0.p(uri, "uri");
            return get(uri);
        }

        @h(name = "get")
        @m
        @u3.m
        public final HttpUrl get(@l URI uri) {
            l0.p(uri, "<this>");
            String uri2 = uri.toString();
            l0.o(uri2, "toString()");
            return parse(uri2);
        }
    }

    public HttpUrl(@l String scheme, @l String username, @l String password, @l String host, int i5, @l List<String> pathSegments, @m List<String> list, @m String str, @l String url) {
        l0.p(scheme, "scheme");
        l0.p(username, "username");
        l0.p(password, "password");
        l0.p(host, "host");
        l0.p(pathSegments, "pathSegments");
        l0.p(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i5;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = l0.g(scheme, "https");
    }

    @u3.m
    public static final int defaultPort(@l String str) {
        return Companion.defaultPort(str);
    }

    @l
    @h(name = "get")
    @u3.m
    public static final HttpUrl get(@l String str) {
        return Companion.get(str);
    }

    @h(name = "get")
    @m
    @u3.m
    public static final HttpUrl get(@l URI uri) {
        return Companion.get(uri);
    }

    @h(name = "get")
    @m
    @u3.m
    public static final HttpUrl get(@l URL url) {
        return Companion.get(url);
    }

    @h(name = "parse")
    @m
    @u3.m
    public static final HttpUrl parse(@l String str) {
        return Companion.parse(str);
    }

    @h(name = "-deprecated_encodedFragment")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedFragment", imports = {}))
    @m
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m6508deprecated_encodedFragment() {
        return encodedFragment();
    }

    @l
    @h(name = "-deprecated_encodedPassword")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedPassword", imports = {}))
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m6509deprecated_encodedPassword() {
        return encodedPassword();
    }

    @l
    @h(name = "-deprecated_encodedPath")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedPath", imports = {}))
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m6510deprecated_encodedPath() {
        return encodedPath();
    }

    @l
    @h(name = "-deprecated_encodedPathSegments")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedPathSegments", imports = {}))
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m6511deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @h(name = "-deprecated_encodedQuery")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedQuery", imports = {}))
    @m
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m6512deprecated_encodedQuery() {
        return encodedQuery();
    }

    @l
    @h(name = "-deprecated_encodedUsername")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "encodedUsername", imports = {}))
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m6513deprecated_encodedUsername() {
        return encodedUsername();
    }

    @h(name = "-deprecated_fragment")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "fragment", imports = {}))
    @m
    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m6514deprecated_fragment() {
        return this.fragment;
    }

    @l
    @h(name = "-deprecated_host")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = c.f19042f, imports = {}))
    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m6515deprecated_host() {
        return this.host;
    }

    @l
    @h(name = "-deprecated_password")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = HintConstants.AUTOFILL_HINT_PASSWORD, imports = {}))
    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m6516deprecated_password() {
        return this.password;
    }

    @l
    @h(name = "-deprecated_pathSegments")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "pathSegments", imports = {}))
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m6517deprecated_pathSegments() {
        return this.pathSegments;
    }

    @h(name = "-deprecated_pathSize")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "pathSize", imports = {}))
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m6518deprecated_pathSize() {
        return pathSize();
    }

    @h(name = "-deprecated_port")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = ClientCookie.PORT_ATTR, imports = {}))
    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m6519deprecated_port() {
        return this.port;
    }

    @h(name = "-deprecated_query")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = SearchIntents.EXTRA_QUERY, imports = {}))
    @m
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m6520deprecated_query() {
        return query();
    }

    @l
    @h(name = "-deprecated_queryParameterNames")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "queryParameterNames", imports = {}))
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m6521deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @h(name = "-deprecated_querySize")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "querySize", imports = {}))
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m6522deprecated_querySize() {
        return querySize();
    }

    @l
    @h(name = "-deprecated_scheme")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "scheme", imports = {}))
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m6523deprecated_scheme() {
        return this.scheme;
    }

    @l
    @h(name = "-deprecated_uri")
    @k(level = kotlin.m.ERROR, message = "moved to toUri()", replaceWith = @b1(expression = "toUri()", imports = {}))
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m6524deprecated_uri() {
        return uri();
    }

    @l
    @h(name = "-deprecated_url")
    @k(level = kotlin.m.ERROR, message = "moved to toUrl()", replaceWith = @b1(expression = "toUrl()", imports = {}))
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m6525deprecated_url() {
        return url();
    }

    @l
    @h(name = "-deprecated_username")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = HintConstants.AUTOFILL_HINT_USERNAME, imports = {}))
    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m6526deprecated_username() {
        return this.username;
    }

    @h(name = "encodedFragment")
    @m
    public final String encodedFragment() {
        int o32;
        if (this.fragment == null) {
            return null;
        }
        o32 = f0.o3(this.url, '#', 0, false, 6, null);
        String substring = this.url.substring(o32 + 1);
        l0.o(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @l
    @h(name = "encodedPassword")
    public final String encodedPassword() {
        boolean z4;
        int o32;
        int o33;
        if (this.password.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "";
        }
        o32 = f0.o3(this.url, ':', this.scheme.length() + 3, false, 4, null);
        o33 = f0.o3(this.url, '@', 0, false, 6, null);
        String substring = this.url.substring(o32 + 1, o33);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @l
    @h(name = "encodedPath")
    public final String encodedPath() {
        int o32;
        o32 = f0.o3(this.url, ClassPathElement.SEPARATOR_CHAR, this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        String substring = this.url.substring(o32, Util.delimiterOffset(str, "?#", o32, str.length()));
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @l
    @h(name = "encodedPathSegments")
    public final List<String> encodedPathSegments() {
        int o32;
        o32 = f0.o3(this.url, ClassPathElement.SEPARATOR_CHAR, this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", o32, str.length());
        ArrayList arrayList = new ArrayList();
        while (o32 < delimiterOffset) {
            int i5 = o32 + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, ClassPathElement.SEPARATOR_CHAR, i5, delimiterOffset);
            String substring = this.url.substring(i5, delimiterOffset2);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            o32 = delimiterOffset2;
        }
        return arrayList;
    }

    @h(name = "encodedQuery")
    @m
    public final String encodedQuery() {
        int o32;
        if (this.queryNamesAndValues == null) {
            return null;
        }
        o32 = f0.o3(this.url, '?', 0, false, 6, null);
        int i5 = o32 + 1;
        String str = this.url;
        String substring = this.url.substring(i5, Util.delimiterOffset(str, '#', i5, str.length()));
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @l
    @h(name = "encodedUsername")
    public final String encodedUsername() {
        boolean z4;
        if (this.username.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(@m Object obj) {
        return (obj instanceof HttpUrl) && l0.g(((HttpUrl) obj).url, this.url);
    }

    @h(name = "fragment")
    @m
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @l
    @h(name = c.f19042f)
    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    @l
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @l
    @h(name = HintConstants.AUTOFILL_HINT_PASSWORD)
    public final String password() {
        return this.password;
    }

    @l
    @h(name = "pathSegments")
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    @h(name = "pathSize")
    public final int pathSize() {
        return this.pathSegments.size();
    }

    @h(name = ClientCookie.PORT_ATTR)
    public final int port() {
        return this.port;
    }

    @h(name = SearchIntents.EXTRA_QUERY)
    @m
    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @m
    public final String queryParameter(@l String name) {
        kotlin.ranges.l W1;
        j B1;
        l0.p(name, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        W1 = u.W1(0, list.size());
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (!l0.g(name, this.queryNamesAndValues.get(e5))) {
                if (e5 != g5) {
                    e5 += i5;
                }
            }
            return this.queryNamesAndValues.get(e5 + 1);
        }
        return null;
    }

    @l
    public final String queryParameterName(int i5) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i5 * 2);
            l0.m(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    @l
    @h(name = "queryParameterNames")
    public final Set<String> queryParameterNames() {
        kotlin.ranges.l W1;
        j B1;
        Set<String> k5;
        if (this.queryNamesAndValues == null) {
            k5 = l1.k();
            return k5;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        W1 = u.W1(0, this.queryNamesAndValues.size());
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (true) {
                String str = this.queryNamesAndValues.get(e5);
                l0.m(str);
                linkedHashSet.add(str);
                if (e5 == g5) {
                    break;
                }
                e5 += i5;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        l0.o(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @m
    public final String queryParameterValue(int i5) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i5 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @l
    public final List<String> queryParameterValues(@l String name) {
        kotlin.ranges.l W1;
        j B1;
        List<String> E;
        l0.p(name, "name");
        if (this.queryNamesAndValues == null) {
            E = kotlin.collections.w.E();
            return E;
        }
        ArrayList arrayList = new ArrayList();
        W1 = u.W1(0, this.queryNamesAndValues.size());
        B1 = u.B1(W1, 2);
        int e5 = B1.e();
        int g5 = B1.g();
        int i5 = B1.i();
        if ((i5 > 0 && e5 <= g5) || (i5 < 0 && g5 <= e5)) {
            while (true) {
                if (l0.g(name, this.queryNamesAndValues.get(e5))) {
                    arrayList.add(this.queryNamesAndValues.get(e5 + 1));
                }
                if (e5 == g5) {
                    break;
                }
                e5 += i5;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        l0.o(unmodifiableList, "unmodifiableList(result)");
        return unmodifiableList;
    }

    @h(name = "querySize")
    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @l
    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        l0.m(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    @m
    public final HttpUrl resolve(@l String link) {
        l0.p(link, "link");
        Builder newBuilder = newBuilder(link);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    @l
    @h(name = "scheme")
    public final String scheme() {
        return this.scheme;
    }

    @l
    public String toString() {
        return this.url;
    }

    @m
    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    @l
    @h(name = "uri")
    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e5) {
            try {
                URI create = URI.create(new r("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(builder, ""));
                l0.o(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e5);
            }
        }
    }

    @l
    @h(name = "url")
    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e5) {
            throw new RuntimeException(e5);
        }
    }

    @l
    @h(name = HintConstants.AUTOFILL_HINT_USERNAME)
    public final String username() {
        return this.username;
    }

    @m
    public final Builder newBuilder(@l String link) {
        l0.p(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
