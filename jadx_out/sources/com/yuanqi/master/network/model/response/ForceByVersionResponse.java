package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;", "", TTDownloadField.TT_FORCE, "", "(Z)V", "getForce", "()Z", "component1", "copy", "equals", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ForceByVersionResponse {
    public static final int $stable = 0;
    private final boolean force;

    public ForceByVersionResponse(boolean z4) {
        this.force = z4;
    }

    public static /* synthetic */ ForceByVersionResponse copy$default(ForceByVersionResponse forceByVersionResponse, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = forceByVersionResponse.force;
        }
        return forceByVersionResponse.copy(z4);
    }

    public final boolean component1() {
        return this.force;
    }

    @l
    public final ForceByVersionResponse copy(boolean z4) {
        return new ForceByVersionResponse(z4);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceByVersionResponse) && this.force == ((ForceByVersionResponse) obj).force;
    }

    public final boolean getForce() {
        return this.force;
    }

    public int hashCode() {
        boolean z4 = this.force;
        if (z4) {
            return 1;
        }
        return z4 ? 1 : 0;
    }

    @l
    public String toString() {
        return "ForceByVersionResponse(force=" + this.force + ')';
    }
}
