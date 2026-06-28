package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.collections.v;
import kotlin.collections.x;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.q1;
import kotlin.r2;
import kotlin.text.r;
import kotlin.u0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b.\u0018\u0000 t2\u00020\u0001:\u0004utvwB'\b\u0000\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bq\u0010rB\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bq\u0010sJ*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002J0\u0010\u0018\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002J.\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002J.\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002J>\u0010\"\u001a\u00020\f2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002J*\u0010&\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0016H\u0002J,\u0010'\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010(\u001a\u00020\tH\u0002J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0)H\u0002J\u001c\u0010,\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010+H\u0002J\b\u0010-\u001a\u00020\tH\u0002J\u0017\u00100\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b.\u00103J\u0010\u00105\u001a\u0002042\u0006\u0010\u0010\u001a\u00020\u0002H\u0007J(\u00106\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001c\u001a\u00020\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0007J/\u00109\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0000¢\u0006\u0004\b7\u00108J\u0019\u0010=\u001a\u0002042\b\u0010:\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b;\u0010<J\u0013\u0010?\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010@\u001a\u000204H\u0016R\u0019\u0010A\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bE\u0010DR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bF\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010BR\u001d\u0010O\u001a\u0004\u0018\u00010J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001b\u0010Q\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bQ\u0010RR'\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010L\u001a\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR/\u0010\\\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010L\u001a\u0004\bZ\u0010[R!\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010L\u001a\u0004\b^\u0010_R\u001d\u0010c\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\bb\u0010DR\u001d\u0010f\u001a\u0004\u0018\u00010J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010L\u001a\u0004\be\u0010NR\u0018\u0010g\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010BR\u001d\u0010j\u001a\u0004\u0018\u00010J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010L\u001a\u0004\bi\u0010NR*\u0010l\u001a\u00020\f2\u0006\u0010k\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010X\u001a\u0004\bl\u0010R\"\u0004\bm\u0010nR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010_¨\u0006x"}, d2 = {"Landroidx/navigation/NavDeepLink;", "", "", "uri", "", "args", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "Lkotlin/r2;", "buildRegex", "Landroid/net/Uri;", "", "matchUri", "action", "matchAction", TTDownloadField.TT_MIME_TYPE, "matchMimeType", "fragment", "Landroid/os/Bundle;", "bundle", "", "Landroidx/navigation/NavArgument;", "arguments", "getMatchingUriFragment", "Ljava/util/regex/Matcher;", "matcher", "getMatchingPathArguments", "deepLink", "getMatchingQueryArguments", "", "inputParams", "Landroidx/navigation/NavDeepLink$ParamQuery;", "storedParam", "parseInputParams", "name", t0.b.f22420d, "argument", "parseArgument", "parseArgumentForRepeatedParam", "parsePath", "", "parseQuery", "Lkotlin/u0;", "parseFragment", "parseMime", "matches$navigation_common_release", "(Landroid/net/Uri;)Z", "matches", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "", "getMimeTypeMatchRating", "getMatchingArguments", "getMatchingPathAndQueryArgs$navigation_common_release", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "getMatchingPathAndQueryArgs", "requestedLink", "calculateMatchingPathSegments$navigation_common_release", "(Landroid/net/Uri;)I", "calculateMatchingPathSegments", "other", "equals", TTDownloadField.TT_HASHCODE, "uriPattern", "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", "getAction", "getMimeType", "pathArgs", "Ljava/util/List;", "pathRegex", "Ljava/util/regex/Pattern;", "pathPattern$delegate", "Lkotlin/d0;", "getPathPattern", "()Ljava/util/regex/Pattern;", "pathPattern", "isParameterizedQuery$delegate", "isParameterizedQuery", "()Z", "queryArgsMap$delegate", "getQueryArgsMap", "()Ljava/util/Map;", "queryArgsMap", "isSingleQueryParamValueOnly", "Z", "fragArgsAndRegex$delegate", "getFragArgsAndRegex", "()Lkotlin/u0;", "fragArgsAndRegex", "fragArgs$delegate", "getFragArgs", "()Ljava/util/List;", "fragArgs", "fragRegex$delegate", "getFragRegex", "fragRegex", "fragPattern$delegate", "getFragPattern", "fragPattern", "mimeTypeRegex", "mimeTypePattern$delegate", "getMimeTypePattern", "mimeTypePattern", "<set-?>", "isExactDeepLink", "setExactDeepLink$navigation_common_release", "(Z)V", "getArgumentsNames$navigation_common_release", "argumentsNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "Companion", "Builder", "MimeType", "ParamQuery", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1360#2:652\n1446#2,5:653\n1559#2:658\n1590#2,4:659\n1559#2:663\n1590#2,4:664\n1855#2:670\n1559#2:671\n1590#2,4:672\n1856#2:676\n215#3,2:668\n1#4:677\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n85#1:652\n85#1:653,5\n229#1:658\n229#1:659,4\n247#1:663\n247#1:664,4\n295#1:670\n307#1:671\n307#1:672,4\n295#1:676\n269#1:668,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavDeepLink {

    @m
    private final String action;

    @l
    private final d0 fragArgs$delegate;

    @l
    private final d0 fragArgsAndRegex$delegate;

    @l
    private final d0 fragPattern$delegate;

    @l
    private final d0 fragRegex$delegate;
    private boolean isExactDeepLink;

    @l
    private final d0 isParameterizedQuery$delegate;
    private boolean isSingleQueryParamValueOnly;

    @m
    private final String mimeType;

    @l
    private final d0 mimeTypePattern$delegate;

    @m
    private String mimeTypeRegex;

    @l
    private final List<String> pathArgs;

    @l
    private final d0 pathPattern$delegate;

    @m
    private String pathRegex;

    @l
    private final d0 queryArgsMap$delegate;

    @m
    private final String uriPattern;

    @l
    private static final Companion Companion = new Companion(null);
    private static final Pattern SCHEME_PATTERN = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private static final Pattern FILL_IN_PATTERN = Pattern.compile("\\{(.+?)\\}");

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0017¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "()V", "action", "", TTDownloadField.TT_MIME_TYPE, "uriPattern", "build", "Landroidx/navigation/NavDeepLink;", "setAction", "setMimeType", "setUriPattern", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Builder {

        @l
        public static final Companion Companion = new Companion(null);

        @m
        private String action;

        @m
        private String mimeType;

        @m
        private String uriPattern;

        @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder$Companion;", "", "()V", "fromAction", "Landroidx/navigation/NavDeepLink$Builder;", "action", "", "fromMimeType", TTDownloadField.TT_MIME_TYPE, "fromUriPattern", "uriPattern", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            @l
            @u3.m
            public final Builder fromAction(@l String action) {
                boolean z4;
                l0.p(action, "action");
                if (action.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    Builder builder = new Builder();
                    builder.setAction(action);
                    return builder;
                }
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }

            @l
            @u3.m
            public final Builder fromMimeType(@l String mimeType) {
                l0.p(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }

            @l
            @u3.m
            public final Builder fromUriPattern(@l String uriPattern) {
                l0.p(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
        }

        @l
        @u3.m
        public static final Builder fromAction(@l String str) {
            return Companion.fromAction(str);
        }

        @l
        @u3.m
        public static final Builder fromMimeType(@l String str) {
            return Companion.fromMimeType(str);
        }

        @l
        @u3.m
        public static final Builder fromUriPattern(@l String str) {
            return Companion.fromUriPattern(str);
        }

        @l
        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        @l
        public final Builder setAction(@l String action) {
            boolean z4;
            l0.p(action, "action");
            if (action.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.action = action;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        @l
        public final Builder setMimeType(@l String mimeType) {
            l0.p(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        @l
        public final Builder setUriPattern(@l String uriPattern) {
            l0.p(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/navigation/NavDeepLink$Companion;", "", "()V", "FILL_IN_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "SCHEME_PATTERN", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004¨\u0006\u000f"}, d2 = {"Landroidx/navigation/NavDeepLink$MimeType;", "", TTDownloadField.TT_MIME_TYPE, "", "(Ljava/lang/String;)V", "subType", "getSubType", "()Ljava/lang/String;", "setSubType", "type", "getType", "setType", "compareTo", "", "other", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n731#2,9:652\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n*L\n412#1:652,9\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class MimeType implements Comparable<MimeType> {

        @l
        private String subType;

        @l
        private String type;

        public MimeType(@l String mimeType) {
            List E;
            boolean z4;
            l0.p(mimeType, "mimeType");
            List<String> split = new r("/").split(mimeType, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        E = e0.G5(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            E = kotlin.collections.w.E();
            this.type = (String) E.get(0);
            this.subType = (String) E.get(1);
        }

        @l
        public final String getSubType() {
            return this.subType;
        }

        @l
        public final String getType() {
            return this.type;
        }

        public final void setSubType(@l String str) {
            l0.p(str, "<set-?>");
            this.subType = str;
        }

        public final void setType(@l String str) {
            l0.p(str, "<set-?>");
            this.type = str;
        }

        @Override // java.lang.Comparable
        public int compareTo(@l MimeType other) {
            l0.p(other, "other");
            int i5 = l0.g(this.type, other.type) ? 2 : 0;
            return l0.g(this.subType, other.subType) ? i5 + 1 : i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/navigation/NavDeepLink$ParamQuery;", "", "", "name", "Lkotlin/r2;", "addArgumentName", "", "index", "getArgumentName", "size", "paramRegex", "Ljava/lang/String;", "getParamRegex", "()Ljava/lang/String;", "setParamRegex", "(Ljava/lang/String;)V", "", "arguments", "Ljava/util/List;", "getArguments", "()Ljava/util/List;", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class ParamQuery {

        @l
        private final List<String> arguments = new ArrayList();

        @m
        private String paramRegex;

        public final void addArgumentName(@l String name) {
            l0.p(name, "name");
            this.arguments.add(name);
        }

        @l
        public final String getArgumentName(int i5) {
            return this.arguments.get(i5);
        }

        @l
        public final List<String> getArguments() {
            return this.arguments;
        }

        @m
        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(@m String str) {
            this.paramRegex = str;
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    public NavDeepLink(@m String str, @m String str2, @m String str3) {
        d0 c5;
        d0 c6;
        d0 b5;
        d0 b6;
        d0 b7;
        d0 b8;
        d0 c7;
        d0 c8;
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        this.pathArgs = new ArrayList();
        c5 = f0.c(new NavDeepLink$pathPattern$2(this));
        this.pathPattern$delegate = c5;
        c6 = f0.c(new NavDeepLink$isParameterizedQuery$2(this));
        this.isParameterizedQuery$delegate = c6;
        h0 h0Var = h0.NONE;
        b5 = f0.b(h0Var, new NavDeepLink$queryArgsMap$2(this));
        this.queryArgsMap$delegate = b5;
        b6 = f0.b(h0Var, new NavDeepLink$fragArgsAndRegex$2(this));
        this.fragArgsAndRegex$delegate = b6;
        b7 = f0.b(h0Var, new NavDeepLink$fragArgs$2(this));
        this.fragArgs$delegate = b7;
        b8 = f0.b(h0Var, new NavDeepLink$fragRegex$2(this));
        this.fragRegex$delegate = b8;
        c7 = f0.c(new NavDeepLink$fragPattern$2(this));
        this.fragPattern$delegate = c7;
        c8 = f0.c(new NavDeepLink$mimeTypePattern$2(this));
        this.mimeTypePattern$delegate = c8;
        parsePath();
        parseMime();
    }

    private final void buildRegex(String str, List<String> list, StringBuilder sb) {
        Matcher matcher = FILL_IN_PATTERN.matcher(str);
        int i5 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            l0.n(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i5) {
                String substring = str.substring(i5, matcher.start());
                l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]+?)");
            i5 = matcher.end();
        }
        if (i5 < str.length()) {
            String substring2 = str.substring(i5);
            l0.o(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
    }

    private final List<String> getFragArgs() {
        return (List) this.fragArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u0<List<String>, String> getFragArgsAndRegex() {
        return (u0) this.fragArgsAndRegex$delegate.getValue();
    }

    private final Pattern getFragPattern() {
        return (Pattern) this.fragPattern$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFragRegex() {
        return (String) this.fragRegex$delegate.getValue();
    }

    private final boolean getMatchingPathArguments(Matcher matcher, Bundle bundle, Map<String, NavArgument> map) {
        int Y;
        List<String> list = this.pathArgs;
        Y = x.Y(list, 10);
        ArrayList arrayList = new ArrayList(Y);
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.w.W();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i6));
            NavArgument navArgument = map.get(str);
            try {
                l0.o(value, "value");
                if (parseArgument(bundle, str, value, navArgument)) {
                    return false;
                }
                arrayList.add(r2.f19517a);
                i5 = i6;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean getMatchingQueryArguments(Uri uri, Bundle bundle, Map<String, NavArgument> map) {
        String query;
        for (Map.Entry<String, ParamQuery> entry : getQueryArgsMap().entrySet()) {
            String key = entry.getKey();
            ParamQuery value = entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = uri.getQuery()) != null && !l0.g(query, uri.toString())) {
                queryParameters = v.k(query);
            }
            if (!parseInputParams(queryParameters, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void getMatchingUriFragment(String str, Bundle bundle, Map<String, NavArgument> map) {
        Matcher matcher;
        int Y;
        Pattern fragPattern = getFragPattern();
        if (fragPattern != null) {
            matcher = fragPattern.matcher(String.valueOf(str));
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return;
        }
        List<String> fragArgs = getFragArgs();
        Y = x.Y(fragArgs, 10);
        ArrayList arrayList = new ArrayList(Y);
        int i5 = 0;
        for (Object obj : fragArgs) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.w.W();
            }
            String str2 = (String) obj;
            String value = Uri.decode(matcher.group(i6));
            NavArgument navArgument = map.get(str2);
            try {
                l0.o(value, "value");
                if (parseArgument(bundle, str2, value, navArgument)) {
                    return;
                }
                arrayList.add(r2.f19517a);
                i5 = i6;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    private final Pattern getMimeTypePattern() {
        return (Pattern) this.mimeTypePattern$delegate.getValue();
    }

    private final Pattern getPathPattern() {
        return (Pattern) this.pathPattern$delegate.getValue();
    }

    private final Map<String, ParamQuery> getQueryArgsMap() {
        return (Map) this.queryArgsMap$delegate.getValue();
    }

    private final boolean isParameterizedQuery() {
        return ((Boolean) this.isParameterizedQuery$delegate.getValue()).booleanValue();
    }

    private final boolean matchAction(String str) {
        boolean z4;
        boolean z5;
        if (str == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        String str2 = this.action;
        if (str2 != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 != z5 && (str == null || l0.g(str2, str))) {
            return true;
        }
        return false;
    }

    private final boolean matchMimeType(String str) {
        boolean z4;
        boolean z5;
        if (str == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.mimeType != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 != z5) {
            if (str == null) {
                return true;
            }
            Pattern mimeTypePattern = getMimeTypePattern();
            l0.m(mimeTypePattern);
            if (mimeTypePattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean matchUri(Uri uri) {
        boolean z4;
        boolean z5;
        if (uri == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (getPathPattern() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 != z5) {
            if (uri == null) {
                return true;
            }
            Pattern pathPattern = getPathPattern();
            l0.m(pathPattern);
            if (pathPattern.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean parseArgument(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            navArgument.getType().parseAndPut(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    private final boolean parseArgumentForRepeatedParam(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (navArgument != null) {
            NavType<Object> type = navArgument.getType();
            type.parseAndPut(bundle, str, str2, type.get(bundle, str));
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u0<List<String>, String> parseFragment() {
        String str = this.uriPattern;
        if (str != null && Uri.parse(str).getFragment() != null) {
            ArrayList arrayList = new ArrayList();
            String fragment = Uri.parse(this.uriPattern).getFragment();
            StringBuilder sb = new StringBuilder();
            l0.m(fragment);
            buildRegex(fragment, arrayList, sb);
            String sb2 = sb.toString();
            l0.o(sb2, "fragRegex.toString()");
            return q1.a(arrayList, sb2);
        }
        return null;
    }

    private final boolean parseInputParams(List<String> list, ParamQuery paramQuery, Bundle bundle, Map<String, NavArgument> map) {
        Matcher matcher;
        int Y;
        if (list != null) {
            for (String str : list) {
                String paramRegex = paramQuery.getParamRegex();
                if (paramRegex != null) {
                    matcher = Pattern.compile(paramRegex, 32).matcher(str);
                } else {
                    matcher = null;
                }
                if (matcher == null || !matcher.matches()) {
                    return false;
                }
                Bundle bundle2 = new Bundle();
                try {
                    List<String> arguments = paramQuery.getArguments();
                    Y = x.Y(arguments, 10);
                    ArrayList arrayList = new ArrayList(Y);
                    int i5 = 0;
                    for (Object obj : arguments) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            kotlin.collections.w.W();
                        }
                        String str2 = (String) obj;
                        String group = matcher.group(i6);
                        if (group == null) {
                            group = "";
                        } else {
                            l0.o(group, "argMatcher.group(index + 1) ?: \"\"");
                        }
                        NavArgument navArgument = map.get(str2);
                        if (parseArgumentForRepeatedParam(bundle, str2, group, navArgument)) {
                            if (!l0.g(group, '{' + str2 + '}') && parseArgument(bundle2, str2, group, navArgument)) {
                                return false;
                            }
                        }
                        arrayList.add(r2.f19517a);
                        i5 = i6;
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused) {
                }
            }
            return true;
        }
        return true;
    }

    private final void parseMime() {
        String i22;
        if (this.mimeType == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
            MimeType mimeType = new MimeType(this.mimeType);
            i22 = kotlin.text.e0.i2("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
            this.mimeTypeRegex = i22;
            return;
        }
        throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
    }

    private final void parsePath() {
        boolean T2;
        String i22;
        boolean T22;
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!SCHEME_PATTERN.matcher(this.uriPattern).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.uriPattern);
        matcher.find();
        boolean z4 = false;
        String substring = this.uriPattern.substring(0, matcher.start());
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        buildRegex(substring, this.pathArgs, sb);
        T2 = kotlin.text.f0.T2(sb, ".*", false, 2, null);
        if (!T2) {
            T22 = kotlin.text.f0.T2(sb, "([^/]+?)", false, 2, null);
            if (!T22) {
                z4 = true;
            }
        }
        this.isExactDeepLink = z4;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        l0.o(sb2, "uriRegex.toString()");
        i22 = kotlin.text.e0.i2(sb2, ".*", "\\E.*\\Q", false, 4, null);
        this.pathRegex = i22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, ParamQuery> parseQuery() {
        boolean z4;
        Object D2;
        String i22;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!isParameterizedQuery()) {
            return linkedHashMap;
        }
        Uri parse = Uri.parse(this.uriPattern);
        for (String paramName : parse.getQueryParameterNames()) {
            StringBuilder sb = new StringBuilder();
            List<String> queryParams = parse.getQueryParameters(paramName);
            int i5 = 0;
            if (queryParams.size() <= 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                l0.o(queryParams, "queryParams");
                D2 = e0.D2(queryParams);
                String queryParam = (String) D2;
                if (queryParam == null) {
                    this.isSingleQueryParamValueOnly = true;
                    queryParam = paramName;
                }
                Matcher matcher = FILL_IN_PATTERN.matcher(queryParam);
                ParamQuery paramQuery = new ParamQuery();
                while (matcher.find()) {
                    String group = matcher.group(1);
                    l0.n(group, "null cannot be cast to non-null type kotlin.String");
                    paramQuery.addArgumentName(group);
                    l0.o(queryParam, "queryParam");
                    String substring = queryParam.substring(i5, matcher.start());
                    l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(Pattern.quote(substring));
                    sb.append("(.+?)?");
                    i5 = matcher.end();
                }
                if (i5 < queryParam.length()) {
                    l0.o(queryParam, "queryParam");
                    String substring2 = queryParam.substring(i5);
                    l0.o(substring2, "this as java.lang.String).substring(startIndex)");
                    sb.append(Pattern.quote(substring2));
                }
                String sb2 = sb.toString();
                l0.o(sb2, "argRegex.toString()");
                i22 = kotlin.text.e0.i2(sb2, ".*", "\\E.*\\Q", false, 4, null);
                paramQuery.setParamRegex(i22);
                l0.o(paramName, "paramName");
                linkedHashMap.put(paramName, paramQuery);
            } else {
                throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
        }
        return linkedHashMap;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(@m Uri uri) {
        Set f32;
        if (uri != null && this.uriPattern != null) {
            List<String> requestedPathSegments = uri.getPathSegments();
            List<String> uriPathSegments = Uri.parse(this.uriPattern).getPathSegments();
            l0.o(requestedPathSegments, "requestedPathSegments");
            l0.o(uriPathSegments, "uriPathSegments");
            f32 = e0.f3(requestedPathSegments, uriPathSegments);
            return f32.size();
        }
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) obj;
        if (!l0.g(this.uriPattern, navDeepLink.uriPattern) || !l0.g(this.action, navDeepLink.action) || !l0.g(this.mimeType, navDeepLink.mimeType)) {
            return false;
        }
        return true;
    }

    @m
    public final String getAction() {
        return this.action;
    }

    @l
    public final List<String> getArgumentsNames$navigation_common_release() {
        List A4;
        List<String> A42;
        List<String> list = this.pathArgs;
        Collection<ParamQuery> values = getQueryArgsMap().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            b0.n0(arrayList, ((ParamQuery) it.next()).getArguments());
        }
        A4 = e0.A4(list, arrayList);
        A42 = e0.A4(A4, getFragArgs());
        return A42;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m
    public final Bundle getMatchingArguments(@l Uri deepLink, @l Map<String, NavArgument> arguments) {
        Matcher matcher;
        l0.p(deepLink, "deepLink");
        l0.p(arguments, "arguments");
        Pattern pathPattern = getPathPattern();
        if (pathPattern != null) {
            matcher = pathPattern.matcher(deepLink.toString());
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!getMatchingPathArguments(matcher, bundle, arguments)) {
            return null;
        }
        if (isParameterizedQuery() && !getMatchingQueryArguments(deepLink, bundle, arguments)) {
            return null;
        }
        getMatchingUriFragment(deepLink.getFragment(), bundle, arguments);
        if (!NavArgumentKt.missingRequiredArguments(arguments, new NavDeepLink$getMatchingArguments$missingRequiredArguments$1(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    @l
    public final Bundle getMatchingPathAndQueryArgs$navigation_common_release(@m Uri uri, @l Map<String, NavArgument> arguments) {
        Matcher matcher;
        l0.p(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern pathPattern = getPathPattern();
        if (pathPattern != null) {
            matcher = pathPattern.matcher(uri.toString());
        } else {
            matcher = null;
        }
        if (matcher == null) {
            return bundle;
        }
        if (!matcher.matches()) {
            return bundle;
        }
        getMatchingPathArguments(matcher, bundle, arguments);
        if (isParameterizedQuery()) {
            getMatchingQueryArguments(uri, bundle, arguments);
        }
        return bundle;
    }

    @m
    public final String getMimeType() {
        return this.mimeType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMimeTypeMatchRating(@l String mimeType) {
        l0.p(mimeType, "mimeType");
        if (this.mimeType != null) {
            Pattern mimeTypePattern = getMimeTypePattern();
            l0.m(mimeTypePattern);
            if (mimeTypePattern.matcher(mimeType).matches()) {
                return new MimeType(this.mimeType).compareTo(new MimeType(mimeType));
            }
        }
        return -1;
    }

    @m
    public final String getUriPattern() {
        return this.uriPattern;
    }

    public int hashCode() {
        int i5;
        int i6;
        String str = this.uriPattern;
        int i7 = 0;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i8 = (i5 + 0) * 31;
        String str2 = this.action;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i9 = (i8 + i6) * 31;
        String str3 = this.mimeType;
        if (str3 != null) {
            i7 = str3.hashCode();
        }
        return i9 + i7;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean matches$navigation_common_release(@l Uri uri) {
        l0.p(uri, "uri");
        return matches$navigation_common_release(new NavDeepLinkRequest(uri, null, null));
    }

    public final void setExactDeepLink$navigation_common_release(boolean z4) {
        this.isExactDeepLink = z4;
    }

    public final boolean matches$navigation_common_release(@l NavDeepLinkRequest deepLinkRequest) {
        l0.p(deepLinkRequest, "deepLinkRequest");
        if (matchUri(deepLinkRequest.getUri()) && matchAction(deepLinkRequest.getAction())) {
            return matchMimeType(deepLinkRequest.getMimeType());
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(@l String uri) {
        this(uri, null, null);
        l0.p(uri, "uri");
    }
}
