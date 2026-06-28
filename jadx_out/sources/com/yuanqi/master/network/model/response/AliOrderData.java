package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/yuanqi/master/network/model/response/AliOrderData;", "", "data", "", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AliOrderData {
    public static final int $stable = 0;

    @l
    private final String data;

    public AliOrderData(@l String data) {
        l0.p(data, "data");
        this.data = data;
    }

    public static /* synthetic */ AliOrderData copy$default(AliOrderData aliOrderData, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = aliOrderData.data;
        }
        return aliOrderData.copy(str);
    }

    @l
    public final String component1() {
        return this.data;
    }

    @l
    public final AliOrderData copy(@l String data) {
        l0.p(data, "data");
        return new AliOrderData(data);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AliOrderData) && l0.g(this.data, ((AliOrderData) obj).data);
    }

    @l
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @l
    public String toString() {
        return "AliOrderData(data=" + this.data + ')';
    }
}
