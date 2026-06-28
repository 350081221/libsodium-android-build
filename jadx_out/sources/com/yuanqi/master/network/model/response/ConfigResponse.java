package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/yuanqi/master/network/model/response/ConfigResponse;", "", "check_app", "", "check_force", "version", "", "show_full_ad", "(ZZIZ)V", "getCheck_app", "()Z", "getCheck_force", "getShow_full_ad", "getVersion", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", TTDownloadField.TT_HASHCODE, "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigResponse {
    public static final int $stable = 0;
    private final boolean check_app;
    private final boolean check_force;
    private final boolean show_full_ad;
    private final int version;

    public ConfigResponse(boolean z4, boolean z5, int i5, boolean z6) {
        this.check_app = z4;
        this.check_force = z5;
        this.version = i5;
        this.show_full_ad = z6;
    }

    public static /* synthetic */ ConfigResponse copy$default(ConfigResponse configResponse, boolean z4, boolean z5, int i5, boolean z6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z4 = configResponse.check_app;
        }
        if ((i6 & 2) != 0) {
            z5 = configResponse.check_force;
        }
        if ((i6 & 4) != 0) {
            i5 = configResponse.version;
        }
        if ((i6 & 8) != 0) {
            z6 = configResponse.show_full_ad;
        }
        return configResponse.copy(z4, z5, i5, z6);
    }

    public final boolean component1() {
        return this.check_app;
    }

    public final boolean component2() {
        return this.check_force;
    }

    public final int component3() {
        return this.version;
    }

    public final boolean component4() {
        return this.show_full_ad;
    }

    @l
    public final ConfigResponse copy(boolean z4, boolean z5, int i5, boolean z6) {
        return new ConfigResponse(z4, z5, i5, z6);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigResponse)) {
            return false;
        }
        ConfigResponse configResponse = (ConfigResponse) obj;
        return this.check_app == configResponse.check_app && this.check_force == configResponse.check_force && this.version == configResponse.version && this.show_full_ad == configResponse.show_full_ad;
    }

    public final boolean getCheck_app() {
        return this.check_app;
    }

    public final boolean getCheck_force() {
        return this.check_force;
    }

    public final boolean getShow_full_ad() {
        return this.show_full_ad;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z4 = this.check_app;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        ?? r22 = this.check_force;
        int i6 = r22;
        if (r22 != 0) {
            i6 = 1;
        }
        int hashCode = (((i5 + i6) * 31) + Integer.hashCode(this.version)) * 31;
        boolean z5 = this.show_full_ad;
        return hashCode + (z5 ? 1 : z5 ? 1 : 0);
    }

    @l
    public String toString() {
        return "ConfigResponse(check_app=" + this.check_app + ", check_force=" + this.check_force + ", version=" + this.version + ", show_full_ad=" + this.show_full_ad + ')';
    }
}
