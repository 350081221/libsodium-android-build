package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.e0;
import kotlin.text.f0;
import kotlin.text.r;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.SM;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p4.l;
import p4.m;
import t0.b;
import u3.h;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0002%&BO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\r\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0017J\r\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0018J\r\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001eJ\r\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0002\b\u001fJ\r\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u0003H\u0016J\u0015\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\nH\u0000¢\u0006\u0002\b#J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b$R\u0013\u0010\u0007\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\r\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0013\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\b\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0013\u0010\f\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0013\u0010\t\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000f¨\u0006'"}, d2 = {"Lokhttp3/Cookie;", "", "name", "", b.f22420d, "expiresAt", "", ClientCookie.DOMAIN_ATTR, ClientCookie.PATH_ATTR, ClientCookie.SECURE_ATTR, "", "httpOnly", "persistent", "hostOnly", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "()Ljava/lang/String;", "()J", "()Z", "-deprecated_domain", "equals", "other", "-deprecated_expiresAt", TTDownloadField.TT_HASHCODE, "", "-deprecated_hostOnly", "-deprecated_httpOnly", "matches", "url", "Lokhttp3/HttpUrl;", "-deprecated_name", "-deprecated_path", "-deprecated_persistent", "-deprecated_secure", "toString", "forObsoleteRfc2965", "toString$okhttp", "-deprecated_value", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Cookie {

    @l
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;

    @l
    private final String name;

    @l
    private final String path;
    private final boolean persistent;
    private final boolean secure;

    @l
    private final String value;

    @l
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0000J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "()V", ClientCookie.DOMAIN_ATTR, "", "expiresAt", "", "hostOnly", "", "httpOnly", "name", ClientCookie.PATH_ATTR, "persistent", ClientCookie.SECURE_ATTR, b.f22420d, "build", "Lokhttp3/Cookie;", "hostOnlyDomain", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {

        @m
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;

        @m
        private String name;
        private boolean persistent;
        private boolean secure;

        @m
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;

        @l
        private String path = "/";

        @l
        public final Cookie build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.value;
                if (str2 != null) {
                    long j5 = this.expiresAt;
                    String str3 = this.domain;
                    if (str3 != null) {
                        return new Cookie(str, str2, j5, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        @l
        public final Builder domain(@l String domain) {
            l0.p(domain, "domain");
            return domain(domain, false);
        }

        @l
        public final Builder expiresAt(long j5) {
            if (j5 <= 0) {
                j5 = Long.MIN_VALUE;
            }
            if (j5 > DatesKt.MAX_DATE) {
                j5 = 253402300799999L;
            }
            this.expiresAt = j5;
            this.persistent = true;
            return this;
        }

        @l
        public final Builder hostOnlyDomain(@l String domain) {
            l0.p(domain, "domain");
            return domain(domain, true);
        }

        @l
        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        @l
        public final Builder name(@l String name) {
            CharSequence C5;
            l0.p(name, "name");
            C5 = f0.C5(name);
            if (l0.g(C5.toString(), name)) {
                this.name = name;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        @l
        public final Builder path(@l String path) {
            boolean s22;
            l0.p(path, "path");
            s22 = e0.s2(path, "/", false, 2, null);
            if (s22) {
                this.path = path;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }

        @l
        public final Builder secure() {
            this.secure = true;
            return this;
        }

        @l
        public final Builder value(@l String value) {
            CharSequence C5;
            l0.p(value, "value");
            C5 = f0.C5(value);
            if (l0.g(C5.toString(), value)) {
                this.value = value;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }

        private final Builder domain(String str, boolean z4) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z4;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }
    }

    @i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002J'\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0002\b\u001bJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002J \u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\fH\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\fH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "()V", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "dateCharacterOffset", "", "input", "", "pos", "limit", "invert", "", "domainMatch", "urlHost", ClientCookie.DOMAIN_ATTR, "parse", "Lokhttp3/Cookie;", "currentTimeMillis", "", "url", "Lokhttp3/HttpUrl;", "setCookie", "parse$okhttp", "parseAll", "", TTDownloadField.TT_HEADERS, "Lokhttp3/Headers;", "parseDomain", bi.aE, "parseExpires", "parseMaxAge", "pathMatch", ClientCookie.PATH_ATTR, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x003b, code lost:
        
            if (r0 != ':') goto L31;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final int dateCharacterOffset(java.lang.String r6, int r7, int r8, boolean r9) {
            /*
                r5 = this;
            L0:
                if (r7 >= r8) goto L46
                char r0 = r6.charAt(r7)
                r1 = 32
                r2 = 1
                if (r0 >= r1) goto Lf
                r1 = 9
                if (r0 != r1) goto L3d
            Lf:
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 >= r1) goto L3d
                r1 = 48
                r3 = 58
                r4 = 0
                if (r1 > r0) goto L1e
                if (r0 >= r3) goto L1e
                r1 = r2
                goto L1f
            L1e:
                r1 = r4
            L1f:
                if (r1 != 0) goto L3d
                r1 = 97
                if (r1 > r0) goto L2b
                r1 = 123(0x7b, float:1.72E-43)
                if (r0 >= r1) goto L2b
                r1 = r2
                goto L2c
            L2b:
                r1 = r4
            L2c:
                if (r1 != 0) goto L3d
                r1 = 65
                if (r1 > r0) goto L38
                r1 = 91
                if (r0 >= r1) goto L38
                r1 = r2
                goto L39
            L38:
                r1 = r4
            L39:
                if (r1 != 0) goto L3d
                if (r0 != r3) goto L3e
            L3d:
                r4 = r2
            L3e:
                r0 = r9 ^ 1
                if (r4 != r0) goto L43
                return r7
            L43:
                int r7 = r7 + 1
                goto L0
            L46:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.dateCharacterOffset(java.lang.String, int, int, boolean):int");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            boolean J1;
            if (l0.g(str, str2)) {
                return true;
            }
            J1 = e0.J1(str, str2, false, 2, null);
            if (J1 && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str)) {
                return true;
            }
            return false;
        }

        private final String parseDomain(String str) {
            boolean J1;
            String a42;
            J1 = e0.J1(str, ".", false, 2, null);
            if (!J1) {
                a42 = f0.a4(str, ".");
                String canonicalHost = HostnamesKt.toCanonicalHost(a42);
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseExpires(String str, int i5, int i6) {
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            int p32;
            int dateCharacterOffset = dateCharacterOffset(str, i5, i6, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            while (dateCharacterOffset < i6) {
                int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i6, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i8 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String group = matcher.group(1);
                    l0.o(group, "matcher.group(1)");
                    i8 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    l0.o(group2, "matcher.group(2)");
                    i11 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    l0.o(group3, "matcher.group(3)");
                    i12 = Integer.parseInt(group3);
                } else if (i9 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String group4 = matcher.group(1);
                    l0.o(group4, "matcher.group(1)");
                    i9 = Integer.parseInt(group4);
                } else if (i10 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String group5 = matcher.group(1);
                    l0.o(group5, "matcher.group(1)");
                    Locale US = Locale.US;
                    l0.o(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = Cookie.MONTH_PATTERN.pattern();
                    l0.o(pattern, "MONTH_PATTERN.pattern()");
                    p32 = f0.p3(pattern, lowerCase, 0, false, 6, null);
                    i10 = p32 / 4;
                } else if (i7 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String group6 = matcher.group(1);
                    l0.o(group6, "matcher.group(1)");
                    i7 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i6, false);
            }
            if (70 <= i7 && i7 < 100) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                i7 += 1900;
            }
            if (i7 >= 0 && i7 < 70) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                i7 += 2000;
            }
            if (i7 >= 1601) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                if (i10 != -1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    if (1 <= i9 && i9 < 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        if (i8 >= 0 && i8 < 24) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            if (i11 >= 0 && i11 < 60) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (i12 >= 0 && i12 < 60) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i7);
                                    gregorianCalendar.set(2, i10 - 1);
                                    gregorianCalendar.set(5, i9);
                                    gregorianCalendar.set(11, i8);
                                    gregorianCalendar.set(12, i11);
                                    gregorianCalendar.set(13, i12);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseMaxAge(String str) {
            boolean s22;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e5) {
                if (new r("-?\\d+").matches(str)) {
                    s22 = e0.s2(str, "-", false, 2, null);
                    if (s22) {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                throw e5;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            boolean s22;
            boolean J1;
            String encodedPath = httpUrl.encodedPath();
            if (l0.g(encodedPath, str)) {
                return true;
            }
            s22 = e0.s2(encodedPath, str, false, 2, null);
            if (s22) {
                J1 = e0.J1(str, "/", false, 2, null);
                if (J1 || encodedPath.charAt(str.length()) == '/') {
                    return true;
                }
            }
            return false;
        }

        @m
        @u3.m
        public final Cookie parse(@l HttpUrl url, @l String setCookie) {
            l0.p(url, "url");
            l0.p(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:85:0x0102, code lost:
        
            if (r1 > okhttp3.internal.http.DatesKt.MAX_DATE) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.Cookie parse$okhttp(long r26, @p4.l okhttp3.HttpUrl r28, @p4.l java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.parse$okhttp(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        @l
        @u3.m
        public final List<Cookie> parseAll(@l HttpUrl url, @l Headers headers) {
            List<Cookie> E;
            l0.p(url, "url");
            l0.p(headers, "headers");
            List<String> values = headers.values(SM.SET_COOKIE);
            int size = values.size();
            ArrayList arrayList = null;
            for (int i5 = 0; i5 < size; i5++) {
                Cookie parse = parse(url, values.get(i5));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
            }
            if (arrayList != null) {
                List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
                l0.o(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
                return unmodifiableList;
            }
            E = kotlin.collections.w.E();
            return E;
        }
    }

    private Cookie(String str, String str2, long j5, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j5;
        this.domain = str3;
        this.path = str4;
        this.secure = z4;
        this.httpOnly = z5;
        this.persistent = z6;
        this.hostOnly = z7;
    }

    public /* synthetic */ Cookie(String str, String str2, long j5, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, w wVar) {
        this(str, str2, j5, str3, str4, z4, z5, z6, z7);
    }

    @m
    @u3.m
    public static final Cookie parse(@l HttpUrl httpUrl, @l String str) {
        return Companion.parse(httpUrl, str);
    }

    @l
    @u3.m
    public static final List<Cookie> parseAll(@l HttpUrl httpUrl, @l Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    @l
    @h(name = "-deprecated_domain")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = ClientCookie.DOMAIN_ATTR, imports = {}))
    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m6487deprecated_domain() {
        return this.domain;
    }

    @h(name = "-deprecated_expiresAt")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "expiresAt", imports = {}))
    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m6488deprecated_expiresAt() {
        return this.expiresAt;
    }

    @h(name = "-deprecated_hostOnly")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "hostOnly", imports = {}))
    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m6489deprecated_hostOnly() {
        return this.hostOnly;
    }

    @h(name = "-deprecated_httpOnly")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "httpOnly", imports = {}))
    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m6490deprecated_httpOnly() {
        return this.httpOnly;
    }

    @l
    @h(name = "-deprecated_name")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "name", imports = {}))
    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m6491deprecated_name() {
        return this.name;
    }

    @l
    @h(name = "-deprecated_path")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = ClientCookie.PATH_ATTR, imports = {}))
    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m6492deprecated_path() {
        return this.path;
    }

    @h(name = "-deprecated_persistent")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "persistent", imports = {}))
    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m6493deprecated_persistent() {
        return this.persistent;
    }

    @h(name = "-deprecated_secure")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = ClientCookie.SECURE_ATTR, imports = {}))
    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m6494deprecated_secure() {
        return this.secure;
    }

    @l
    @h(name = "-deprecated_value")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = b.f22420d, imports = {}))
    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m6495deprecated_value() {
        return this.value;
    }

    @l
    @h(name = ClientCookie.DOMAIN_ATTR)
    public final String domain() {
        return this.domain;
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (l0.g(cookie.name, this.name) && l0.g(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && l0.g(cookie.domain, this.domain) && l0.g(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    @h(name = "expiresAt")
    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly);
    }

    @h(name = "hostOnly")
    public final boolean hostOnly() {
        return this.hostOnly;
    }

    @h(name = "httpOnly")
    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(@l HttpUrl url) {
        boolean domainMatch;
        l0.p(url, "url");
        if (this.hostOnly) {
            domainMatch = l0.g(url.host(), this.domain);
        } else {
            domainMatch = Companion.domainMatch(url.host(), this.domain);
        }
        if (!domainMatch || !Companion.pathMatch(url, this.path)) {
            return false;
        }
        if (this.secure && !url.isHttps()) {
            return false;
        }
        return true;
    }

    @l
    @h(name = "name")
    public final String name() {
        return this.name;
    }

    @l
    @h(name = ClientCookie.PATH_ATTR)
    public final String path() {
        return this.path;
    }

    @h(name = "persistent")
    public final boolean persistent() {
        return this.persistent;
    }

    @h(name = ClientCookie.SECURE_ATTR)
    public final boolean secure() {
        return this.secure;
    }

    @l
    public String toString() {
        return toString$okhttp(false);
    }

    @l
    public final String toString$okhttp(boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(o0.a.f20835h);
        sb.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (z4) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        l0.o(sb2, "toString()");
        return sb2;
    }

    @l
    @h(name = b.f22420d)
    public final String value() {
        return this.value;
    }
}
