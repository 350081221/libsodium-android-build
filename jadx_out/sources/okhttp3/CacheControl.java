package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.concurrent.TimeUnit;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.f0;
import p4.l;
import p4.m;
import u3.e;
import u3.h;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CacheControl {

    @m
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();

    @l
    @e
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j5) {
            if (j5 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j5;
        }

        @l
        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        @l
        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        @l
        public final Builder maxAge(int i5, @l TimeUnit timeUnit) {
            boolean z4;
            l0.p(timeUnit, "timeUnit");
            if (i5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i5));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i5).toString());
        }

        @l
        public final Builder maxStale(int i5, @l TimeUnit timeUnit) {
            boolean z4;
            l0.p(timeUnit, "timeUnit");
            if (i5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i5));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i5).toString());
        }

        @l
        public final Builder minFresh(int i5, @l TimeUnit timeUnit) {
            boolean z4;
            l0.p(timeUnit, "timeUnit");
            if (i5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i5));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i5).toString());
        }

        @l
        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        @l
        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        @l
        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        @l
        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", TTDownloadField.TT_HEADERS, "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i5) {
            boolean S2;
            int length = str.length();
            while (i5 < length) {
                S2 = f0.S2(str2, str.charAt(i5), false, 2, null);
                if (S2) {
                    return i5;
                }
                i5++;
            }
            return str.length();
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i5, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                i5 = 0;
            }
            return companion.indexOfElement(str, str2, i5);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
        @p4.l
        @u3.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.CacheControl parse(@p4.l okhttp3.Headers r31) {
            /*
                Method dump skipped, instructions count: 402
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    private CacheControl(boolean z4, boolean z5, int i5, int i6, boolean z6, boolean z7, boolean z8, int i7, int i8, boolean z9, boolean z10, boolean z11, String str) {
        this.noCache = z4;
        this.noStore = z5;
        this.maxAgeSeconds = i5;
        this.sMaxAgeSeconds = i6;
        this.isPrivate = z6;
        this.isPublic = z7;
        this.mustRevalidate = z8;
        this.maxStaleSeconds = i7;
        this.minFreshSeconds = i8;
        this.onlyIfCached = z9;
        this.noTransform = z10;
        this.immutable = z11;
        this.headerValue = str;
    }

    public /* synthetic */ CacheControl(boolean z4, boolean z5, int i5, int i6, boolean z6, boolean z7, boolean z8, int i7, int i8, boolean z9, boolean z10, boolean z11, String str, w wVar) {
        this(z4, z5, i5, i6, z6, z7, z8, i7, i8, z9, z10, z11, str);
    }

    @l
    @u3.m
    public static final CacheControl parse(@l Headers headers) {
        return Companion.parse(headers);
    }

    @h(name = "-deprecated_immutable")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "immutable", imports = {}))
    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m6469deprecated_immutable() {
        return this.immutable;
    }

    @h(name = "-deprecated_maxAgeSeconds")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "maxAgeSeconds", imports = {}))
    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m6470deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @h(name = "-deprecated_maxStaleSeconds")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "maxStaleSeconds", imports = {}))
    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m6471deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @h(name = "-deprecated_minFreshSeconds")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "minFreshSeconds", imports = {}))
    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m6472deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @h(name = "-deprecated_mustRevalidate")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "mustRevalidate", imports = {}))
    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m6473deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @h(name = "-deprecated_noCache")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "noCache", imports = {}))
    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m6474deprecated_noCache() {
        return this.noCache;
    }

    @h(name = "-deprecated_noStore")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "noStore", imports = {}))
    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m6475deprecated_noStore() {
        return this.noStore;
    }

    @h(name = "-deprecated_noTransform")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "noTransform", imports = {}))
    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m6476deprecated_noTransform() {
        return this.noTransform;
    }

    @h(name = "-deprecated_onlyIfCached")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "onlyIfCached", imports = {}))
    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m6477deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @h(name = "-deprecated_sMaxAgeSeconds")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "sMaxAgeSeconds", imports = {}))
    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m6478deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @h(name = "immutable")
    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    @h(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @h(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @h(name = "minFreshSeconds")
    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @h(name = "mustRevalidate")
    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    @h(name = "noCache")
    public final boolean noCache() {
        return this.noCache;
    }

    @h(name = "noStore")
    public final boolean noStore() {
        return this.noStore;
    }

    @h(name = "noTransform")
    public final boolean noTransform() {
        return this.noTransform;
    }

    @h(name = "onlyIfCached")
    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    @h(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @l
    public String toString() {
        boolean z4;
        String str = this.headerValue;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.noCache) {
                sb.append("no-cache, ");
            }
            if (this.noStore) {
                sb.append("no-store, ");
            }
            if (this.maxAgeSeconds != -1) {
                sb.append("max-age=");
                sb.append(this.maxAgeSeconds);
                sb.append(", ");
            }
            if (this.sMaxAgeSeconds != -1) {
                sb.append("s-maxage=");
                sb.append(this.sMaxAgeSeconds);
                sb.append(", ");
            }
            if (this.isPrivate) {
                sb.append("private, ");
            }
            if (this.isPublic) {
                sb.append("public, ");
            }
            if (this.mustRevalidate) {
                sb.append("must-revalidate, ");
            }
            if (this.maxStaleSeconds != -1) {
                sb.append("max-stale=");
                sb.append(this.maxStaleSeconds);
                sb.append(", ");
            }
            if (this.minFreshSeconds != -1) {
                sb.append("min-fresh=");
                sb.append(this.minFreshSeconds);
                sb.append(", ");
            }
            if (this.onlyIfCached) {
                sb.append("only-if-cached, ");
            }
            if (this.noTransform) {
                sb.append("no-transform, ");
            }
            if (this.immutable) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            this.headerValue = sb2;
            return sb2;
        }
        return str;
    }
}
