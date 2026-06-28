package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B%\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007B\u000f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest;", "", "uri", "Landroid/net/Uri;", "action", "", TTDownloadField.TT_MIME_TYPE, "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "getAction", "()Ljava/lang/String;", "getMimeType", "getUri", "()Landroid/net/Uri;", "toString", "Builder", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class NavDeepLinkRequest {

    @m
    private final String action;

    @m
    private final String mimeType;

    @m
    private final Uri uri;

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "()V", "action", "", TTDownloadField.TT_MIME_TYPE, "uri", "Landroid/net/Uri;", "build", "Landroidx/navigation/NavDeepLinkRequest;", "setAction", "setMimeType", "setUri", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nNavDeepLinkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkRequest.kt\nandroidx/navigation/NavDeepLinkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Builder {

        @l
        public static final Companion Companion = new Companion(null);

        @m
        private String action;

        @m
        private String mimeType;

        @m
        private Uri uri;

        @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder$Companion;", "", "()V", "fromAction", "Landroidx/navigation/NavDeepLinkRequest$Builder;", "action", "", "fromMimeType", TTDownloadField.TT_MIME_TYPE, "fromUri", "uri", "Landroid/net/Uri;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
                    Builder builder = new Builder(null);
                    builder.setAction(action);
                    return builder;
                }
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
            }

            @l
            @u3.m
            public final Builder fromMimeType(@l String mimeType) {
                l0.p(mimeType, "mimeType");
                Builder builder = new Builder(null);
                builder.setMimeType(mimeType);
                return builder;
            }

            @l
            @u3.m
            public final Builder fromUri(@l Uri uri) {
                l0.p(uri, "uri");
                Builder builder = new Builder(null);
                builder.setUri(uri);
                return builder;
            }
        }

        private Builder() {
        }

        public /* synthetic */ Builder(w wVar) {
            this();
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
        public static final Builder fromUri(@l Uri uri) {
            return Companion.fromUri(uri);
        }

        @l
        public final NavDeepLinkRequest build() {
            return new NavDeepLinkRequest(this.uri, this.action, this.mimeType);
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
            throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
        }

        @l
        public final Builder setMimeType(@l String mimeType) {
            l0.p(mimeType, "mimeType");
            if (new r("^[-\\w*.]+/[-\\w+*.]+$").matches(mimeType)) {
                this.mimeType = mimeType;
                return this;
            }
            throw new IllegalArgumentException(("The given mimeType " + mimeType + " does not match to required \"type/subtype\" format").toString());
        }

        @l
        public final Builder setUri(@l Uri uri) {
            l0.p(uri, "uri");
            this.uri = uri;
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(@m Uri uri, @m String str, @m String str2) {
        this.uri = uri;
        this.action = str;
        this.mimeType = str2;
    }

    @m
    public String getAction() {
        return this.action;
    }

    @m
    public String getMimeType() {
        return this.mimeType;
    }

    @m
    public Uri getUri() {
        return this.uri;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (getUri() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb.append(" action=");
            sb.append(getAction());
        }
        if (getMimeType() != null) {
            sb.append(" mimetype=");
            sb.append(getMimeType());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLinkRequest(@l Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        l0.p(intent, "intent");
    }
}
