package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.text.e0;
import kotlin.text.k0;
import p4.l;
import u3.h;
import u3.i;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0019"}, d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", "type", "subtype", "parameterNamesAndValues", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "[Ljava/lang/String;", "()Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "parameter", "name", "-deprecated_subtype", "toString", "-deprecated_type", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MediaType {

    @l
    private static final String QUOTED = "\"([^\"]*)\"";

    @l
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    @l
    private final String mediaType;

    @l
    private final String[] parameterNamesAndValues;

    @l
    private final String subtype;

    @l
    private final String type;

    @l
    public static final Companion Companion = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\nJ\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "()V", "PARAMETER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "QUOTED", "", "TOKEN", "TYPE_SUBTYPE", "get", "Lokhttp3/MediaType;", "mediaType", "-deprecated_get", "parse", "-deprecated_parse", "toMediaType", "toMediaTypeOrNull", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n1#2:182\n37#3,2:183\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n148#1:183,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @h(name = "-deprecated_get")
        @k(level = m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m6533deprecated_get(@l String mediaType) {
            l0.p(mediaType, "mediaType");
            return get(mediaType);
        }

        @h(name = "-deprecated_parse")
        @k(level = m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @p4.m
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m6534deprecated_parse(@l String mediaType) {
            l0.p(mediaType, "mediaType");
            return parse(mediaType);
        }

        @l
        @h(name = "get")
        @u3.m
        public final MediaType get(@l String str) {
            boolean s22;
            boolean J1;
            l0.p(str, "<this>");
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                l0.o(group, "typeSubtype.group(1)");
                Locale US = Locale.US;
                l0.o(US, "US");
                String lowerCase = group.toLowerCase(US);
                l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                l0.o(group2, "typeSubtype.group(2)");
                l0.o(US, "US");
                String lowerCase2 = group2.toLowerCase(US);
                l0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = MediaType.PARAMETER.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else {
                                s22 = e0.s2(group4, "'", false, 2, null);
                                if (s22) {
                                    J1 = e0.J1(group4, "'", false, 2, null);
                                    if (J1 && group4.length() > 2) {
                                        group4 = group4.substring(1, group4.length() - 1);
                                        l0.o(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                }
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        l0.o(substring, "this as java.lang.String).substring(startIndex)");
                        sb.append(substring);
                        sb.append("\" for: \"");
                        sb.append(str);
                        sb.append(k0.f19765b);
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + k0.f19765b).toString());
        }

        @h(name = "parse")
        @p4.m
        @u3.m
        public final MediaType parse(@l String str) {
            l0.p(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, w wVar) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    @l
    @h(name = "get")
    @u3.m
    public static final MediaType get(@l String str) {
        return Companion.get(str);
    }

    @h(name = "parse")
    @p4.m
    @u3.m
    public static final MediaType parse(@l String str) {
        return Companion.parse(str);
    }

    @l
    @h(name = "-deprecated_subtype")
    @k(level = m.ERROR, message = "moved to val", replaceWith = @b1(expression = "subtype", imports = {}))
    /* renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m6531deprecated_subtype() {
        return this.subtype;
    }

    @l
    @h(name = "-deprecated_type")
    @k(level = m.ERROR, message = "moved to val", replaceWith = @b1(expression = "type", imports = {}))
    /* renamed from: -deprecated_type, reason: not valid java name */
    public final String m6532deprecated_type() {
        return this.type;
    }

    @p4.m
    @i
    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    @p4.m
    @i
    public final Charset charset(@p4.m Charset charset) {
        String parameter = parameter("charset");
        if (parameter == null) {
            return charset;
        }
        try {
            return Charset.forName(parameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(@p4.m Object obj) {
        return (obj instanceof MediaType) && l0.g(((MediaType) obj).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x001b */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String parameter(@p4.l java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.String[] r0 = r4.parameterNamesAndValues
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = kotlin.internal.n.c(r2, r0, r1)
            if (r0 < 0) goto L28
        L12:
            java.lang.String[] r1 = r4.parameterNamesAndValues
            r1 = r1[r2]
            r3 = 1
            boolean r1 = kotlin.text.v.K1(r1, r5, r3)
            if (r1 == 0) goto L23
            java.lang.String[] r5 = r4.parameterNamesAndValues
            int r2 = r2 + r3
            r5 = r5[r2]
            return r5
        L23:
            if (r2 == r0) goto L28
            int r2 = r2 + 2
            goto L12
        L28:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MediaType.parameter(java.lang.String):java.lang.String");
    }

    @l
    @h(name = "subtype")
    public final String subtype() {
        return this.subtype;
    }

    @l
    public String toString() {
        return this.mediaType;
    }

    @l
    @h(name = "type")
    public final String type() {
        return this.type;
    }
}
