package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/input/PlatformImeOptions;", "", "privateImeOptions", "", "(Ljava/lang/String;)V", "getPrivateImeOptions", "()Ljava/lang/String;", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class PlatformImeOptions {
    public static final int $stable = 0;

    @m
    private final String privateImeOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformImeOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PlatformImeOptions(@m String str) {
        this.privateImeOptions = str;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PlatformImeOptions) && l0.g(this.privateImeOptions, ((PlatformImeOptions) obj).privateImeOptions)) {
            return true;
        }
        return false;
    }

    @m
    public final String getPrivateImeOptions() {
        return this.privateImeOptions;
    }

    public int hashCode() {
        String str = this.privateImeOptions;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @l
    public String toString() {
        return "PlatformImeOptions(privateImeOptions=" + this.privateImeOptions + ')';
    }

    public /* synthetic */ PlatformImeOptions(String str, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : str);
    }
}
