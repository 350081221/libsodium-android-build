package androidx.navigation;

import androidx.navigation.NavDeepLink;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/navigation/NavDeepLinkDslBuilder;", "", "()V", bi.aA, "", "action", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "builder", "Landroidx/navigation/NavDeepLink$Builder;", TTDownloadField.TT_MIME_TYPE, "getMimeType", "setMimeType", "uriPattern", "getUriPattern", "setUriPattern", "build", "Landroidx/navigation/NavDeepLink;", "build$navigation_common_release", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@NavDeepLinkDsl
@r1({"SMAP\nNavDeepLinkDslBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkDslBuilder.kt\nandroidx/navigation/NavDeepLinkDslBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: classes2.dex */
public final class NavDeepLinkDslBuilder {

    @m
    private String action;

    @l
    private final NavDeepLink.Builder builder = new NavDeepLink.Builder();

    @m
    private String mimeType;

    @m
    private String uriPattern;

    @l
    public final NavDeepLink build$navigation_common_release() {
        boolean z4;
        NavDeepLink.Builder builder = this.builder;
        String str = this.uriPattern;
        if (str == null && this.action == null && this.mimeType == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            if (str != null) {
                builder.setUriPattern(str);
            }
            String str2 = this.action;
            if (str2 != null) {
                builder.setAction(str2);
            }
            String str3 = this.mimeType;
            if (str3 != null) {
                builder.setMimeType(str3);
            }
            return builder.build();
        }
        throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.".toString());
    }

    @m
    public final String getAction() {
        return this.action;
    }

    @m
    public final String getMimeType() {
        return this.mimeType;
    }

    @m
    public final String getUriPattern() {
        return this.uriPattern;
    }

    public final void setAction(@m String str) {
        boolean z4;
        if (str != null) {
            if (str.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
        }
        this.action = str;
    }

    public final void setMimeType(@m String str) {
        this.mimeType = str;
    }

    public final void setUriPattern(@m String str) {
        this.uriPattern = str;
    }
}
