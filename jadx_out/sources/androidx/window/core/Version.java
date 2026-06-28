package androidx.window.core;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.lody.virtual.client.hook.providers.DownloadProviderHook;
import external.org.apache.commons.lang3.d;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB)\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Landroidx/window/core/Version;", "", "", "toString", "other", "", "compareTo", "", "", "equals", TTDownloadField.TT_HASHCODE, "major", "I", "getMajor", "()I", "minor", "getMinor", "patch", "getPatch", DownloadProviderHook.COLUMN_DESCRIPTION, "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Ljava/math/BigInteger;", "bigInteger$delegate", "Lkotlin/d0;", "getBigInteger", "()Ljava/math/BigInteger;", "bigInteger", "<init>", "(IIILjava/lang/String;)V", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class Version implements Comparable<Version> {

    @l
    private static final Version CURRENT;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Version UNKNOWN = new Version(0, 0, 0, "");

    @l
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");

    @l
    private static final Version VERSION_1_0;

    @l
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    @l
    private final d0 bigInteger$delegate;

    @l
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/window/core/Version$Companion;", "", "()V", "CURRENT", "Landroidx/window/core/Version;", "getCURRENT", "()Landroidx/window/core/Version;", GrsBaseInfo.CountryCodeSource.UNKNOWN, "getUNKNOWN", "VERSION_0_1", "getVERSION_0_1", "VERSION_1_0", "getVERSION_1_0", "VERSION_PATTERN_STRING", "", "parse", "versionString", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Version getCURRENT() {
            return Version.CURRENT;
        }

        @l
        public final Version getUNKNOWN() {
            return Version.UNKNOWN;
        }

        @l
        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        @l
        public final Version getVERSION_1_0() {
            return Version.VERSION_1_0;
        }

        @m
        @u3.m
        public final Version parse(@m String str) {
            boolean S1;
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            String str2;
            if (str != null) {
                S1 = e0.S1(str);
                if (!S1) {
                    Matcher matcher = Pattern.compile(Version.VERSION_PATTERN_STRING).matcher(str);
                    if (!matcher.matches()) {
                        return null;
                    }
                    String group = matcher.group(1);
                    if (group == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(Integer.parseInt(group));
                    }
                    if (valueOf == null) {
                        return null;
                    }
                    int intValue = valueOf.intValue();
                    String group2 = matcher.group(2);
                    if (group2 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(Integer.parseInt(group2));
                    }
                    if (valueOf2 == null) {
                        return null;
                    }
                    int intValue2 = valueOf2.intValue();
                    String group3 = matcher.group(3);
                    if (group3 == null) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(Integer.parseInt(group3));
                    }
                    if (valueOf3 == null) {
                        return null;
                    }
                    int intValue3 = valueOf3.intValue();
                    if (matcher.group(4) != null) {
                        str2 = matcher.group(4);
                    } else {
                        str2 = "";
                    }
                    String description = str2;
                    l0.o(description, "description");
                    return new Version(intValue, intValue2, intValue3, description, null);
                }
            }
            return null;
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    private Version(int i5, int i6, int i7, String str) {
        d0 c5;
        this.major = i5;
        this.minor = i6;
        this.patch = i7;
        this.description = str;
        c5 = f0.c(new Version$bigInteger$2(this));
        this.bigInteger$delegate = c5;
    }

    public /* synthetic */ Version(int i5, int i6, int i7, String str, w wVar) {
        this(i5, i6, i7, str);
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        l0.o(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @m
    @u3.m
    public static final Version parse(@m String str) {
        return Companion.parse(str);
    }

    public boolean equals(@m Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        if (this.major != version.major || this.minor != version.minor || this.patch != version.patch) {
            return false;
        }
        return true;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    @l
    public String toString() {
        boolean S1;
        String str;
        S1 = e0.S1(this.description);
        if (!S1) {
            str = l0.C("-", this.description);
        } else {
            str = "";
        }
        return this.major + d.f15957a + this.minor + d.f15957a + this.patch + str;
    }

    @Override // java.lang.Comparable
    public int compareTo(@l Version other) {
        l0.p(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }
}
