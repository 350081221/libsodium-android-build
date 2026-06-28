package com.yuanqi.master.network.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/yuanqi/master/network/model/response/EditResponse;", "", "msg", "", PluginConstants.KEY_ERROR_CODE, "", "token", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EditResponse {
    public static final int $stable = 0;
    private final int code;

    @l
    private final String msg;

    @l
    private final String token;

    public EditResponse(@l String msg, int i5, @l String token) {
        l0.p(msg, "msg");
        l0.p(token, "token");
        this.msg = msg;
        this.code = i5;
        this.token = token;
    }

    public static /* synthetic */ EditResponse copy$default(EditResponse editResponse, String str, int i5, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = editResponse.msg;
        }
        if ((i6 & 2) != 0) {
            i5 = editResponse.code;
        }
        if ((i6 & 4) != 0) {
            str2 = editResponse.token;
        }
        return editResponse.copy(str, i5, str2);
    }

    @l
    public final String component1() {
        return this.msg;
    }

    public final int component2() {
        return this.code;
    }

    @l
    public final String component3() {
        return this.token;
    }

    @l
    public final EditResponse copy(@l String msg, int i5, @l String token) {
        l0.p(msg, "msg");
        l0.p(token, "token");
        return new EditResponse(msg, i5, token);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditResponse)) {
            return false;
        }
        EditResponse editResponse = (EditResponse) obj;
        return l0.g(this.msg, editResponse.msg) && this.code == editResponse.code && l0.g(this.token, editResponse.token);
    }

    public final int getCode() {
        return this.code;
    }

    @l
    public final String getMsg() {
        return this.msg;
    }

    @l
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((this.msg.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + this.token.hashCode();
    }

    @l
    public String toString() {
        return "EditResponse(msg=" + this.msg + ", code=" + this.code + ", token=" + this.token + ')';
    }
}
