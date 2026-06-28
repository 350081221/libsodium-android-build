package okhttp3.internal.http2;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okio.n;
import p4.l;
import p4.m;
import t0.b;
import u3.e;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "", "toString", "Lokio/n;", "component1", "component2", "name", b.f22420d, "copy", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "Lokio/n;", "hpackSize", "I", "<init>", "(Lokio/n;Lokio/n;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lokio/n;Ljava/lang/String;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Header {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final n PSEUDO_PREFIX;

    @l
    @e
    public static final n RESPONSE_STATUS;

    @l
    public static final String RESPONSE_STATUS_UTF8 = ":status";

    @l
    @e
    public static final n TARGET_AUTHORITY;

    @l
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";

    @l
    @e
    public static final n TARGET_METHOD;

    @l
    public static final String TARGET_METHOD_UTF8 = ":method";

    @l
    @e
    public static final n TARGET_PATH;

    @l
    public static final String TARGET_PATH_UTF8 = ":path";

    @l
    @e
    public static final n TARGET_SCHEME;

    @l
    public static final String TARGET_SCHEME_UTF8 = ":scheme";

    @e
    public final int hpackSize;

    @l
    @e
    public final n name;

    @l
    @e
    public final n value;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "Lokio/n;", "PSEUDO_PREFIX", "Lokio/n;", "RESPONSE_STATUS", "", "RESPONSE_STATUS_UTF8", "Ljava/lang/String;", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    static {
        n.a aVar = n.Companion;
        PSEUDO_PREFIX = aVar.l(":");
        RESPONSE_STATUS = aVar.l(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = aVar.l(TARGET_METHOD_UTF8);
        TARGET_PATH = aVar.l(TARGET_PATH_UTF8);
        TARGET_SCHEME = aVar.l(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = aVar.l(TARGET_AUTHORITY_UTF8);
    }

    public Header(@l n name, @l n value) {
        l0.p(name, "name");
        l0.p(value, "value");
        this.name = name;
        this.value = value;
        this.hpackSize = name.size() + 32 + value.size();
    }

    public static /* synthetic */ Header copy$default(Header header, n nVar, n nVar2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            nVar = header.name;
        }
        if ((i5 & 2) != 0) {
            nVar2 = header.value;
        }
        return header.copy(nVar, nVar2);
    }

    @l
    public final n component1() {
        return this.name;
    }

    @l
    public final n component2() {
        return this.value;
    }

    @l
    public final Header copy(@l n name, @l n value) {
        l0.p(name, "name");
        l0.p(value, "value");
        return new Header(name, value);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return l0.g(this.name, header.name) && l0.g(this.value, header.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    @l
    public String toString() {
        return this.name.utf8() + ": " + this.value.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Header(@p4.l java.lang.String r2, @p4.l java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.l0.p(r3, r0)
            okio.n$a r0 = okio.n.Companion
            okio.n r2 = r0.l(r2)
            okio.n r3 = r0.l(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@l n name, @l String value) {
        this(name, n.Companion.l(value));
        l0.p(name, "name");
        l0.p(value, "value");
    }
}
