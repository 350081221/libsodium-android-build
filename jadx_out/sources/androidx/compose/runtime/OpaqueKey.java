package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/OpaqueKey;", "", DatabaseFileArchive.COLUMN_KEY, "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OpaqueKey {
    public static final int $stable = 0;

    @l
    private final String key;

    public OpaqueKey(@l String str) {
        this.key = str;
    }

    public static /* synthetic */ OpaqueKey copy$default(OpaqueKey opaqueKey, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = opaqueKey.key;
        }
        return opaqueKey.copy(str);
    }

    @l
    public final String component1() {
        return this.key;
    }

    @l
    public final OpaqueKey copy(@l String str) {
        return new OpaqueKey(str);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && l0.g(this.key, ((OpaqueKey) obj).key);
    }

    @l
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    @l
    public String toString() {
        return "OpaqueKey(key=" + this.key + ')';
    }
}
