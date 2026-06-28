package androidx.constraintlayout.compose;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.HashMap;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/DesignElement;", "", "id", "", "type", "params", "Ljava/util/HashMap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "getType", "setType", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DesignElement {

    @l
    private String id;

    @l
    private HashMap<String, String> params;

    @l
    private String type;

    public DesignElement(@l String id, @l String type, @l HashMap<String, String> params) {
        l0.p(id, "id");
        l0.p(type, "type");
        l0.p(params, "params");
        this.id = id;
        this.type = type;
        this.params = params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DesignElement copy$default(DesignElement designElement, String str, String str2, HashMap hashMap, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = designElement.id;
        }
        if ((i5 & 2) != 0) {
            str2 = designElement.type;
        }
        if ((i5 & 4) != 0) {
            hashMap = designElement.params;
        }
        return designElement.copy(str, str2, hashMap);
    }

    @l
    public final String component1() {
        return this.id;
    }

    @l
    public final String component2() {
        return this.type;
    }

    @l
    public final HashMap<String, String> component3() {
        return this.params;
    }

    @l
    public final DesignElement copy(@l String id, @l String type, @l HashMap<String, String> params) {
        l0.p(id, "id");
        l0.p(type, "type");
        l0.p(params, "params");
        return new DesignElement(id, type, params);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DesignElement)) {
            return false;
        }
        DesignElement designElement = (DesignElement) obj;
        return l0.g(this.id, designElement.id) && l0.g(this.type, designElement.type) && l0.g(this.params, designElement.params);
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final HashMap<String, String> getParams() {
        return this.params;
    }

    @l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.params.hashCode();
    }

    public final void setId(@l String str) {
        l0.p(str, "<set-?>");
        this.id = str;
    }

    public final void setParams(@l HashMap<String, String> hashMap) {
        l0.p(hashMap, "<set-?>");
        this.params = hashMap;
    }

    public final void setType(@l String str) {
        l0.p(str, "<set-?>");
        this.type = str;
    }

    @l
    public String toString() {
        return "DesignElement(id=" + this.id + ", type=" + this.type + ", params=" + this.params + ')';
    }
}
