package com.yuanqi.master.network.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/yuanqi/master/network/model/ResultModel;", "", "msg", "", PluginConstants.KEY_ERROR_CODE, "", "data", "(Ljava/lang/String;ILjava/lang/Object;)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResultModel {
    public static final int $stable = 8;
    private final int code;

    @m
    private Object data;

    @l
    private final String msg;

    public ResultModel(@l String msg, int i5, @m Object obj) {
        l0.p(msg, "msg");
        this.msg = msg;
        this.code = i5;
        this.data = obj;
    }

    public static /* synthetic */ ResultModel copy$default(ResultModel resultModel, String str, int i5, Object obj, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            str = resultModel.msg;
        }
        if ((i6 & 2) != 0) {
            i5 = resultModel.code;
        }
        if ((i6 & 4) != 0) {
            obj = resultModel.data;
        }
        return resultModel.copy(str, i5, obj);
    }

    @l
    public final String component1() {
        return this.msg;
    }

    public final int component2() {
        return this.code;
    }

    @m
    public final Object component3() {
        return this.data;
    }

    @l
    public final ResultModel copy(@l String msg, int i5, @m Object obj) {
        l0.p(msg, "msg");
        return new ResultModel(msg, i5, obj);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultModel)) {
            return false;
        }
        ResultModel resultModel = (ResultModel) obj;
        return l0.g(this.msg, resultModel.msg) && this.code == resultModel.code && l0.g(this.data, resultModel.data);
    }

    public final int getCode() {
        return this.code;
    }

    @m
    public final Object getData() {
        return this.data;
    }

    @l
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int hashCode = ((this.msg.hashCode() * 31) + Integer.hashCode(this.code)) * 31;
        Object obj = this.data;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final void setData(@m Object obj) {
        this.data = obj;
    }

    @l
    public String toString() {
        return "ResultModel(msg=" + this.msg + ", code=" + this.code + ", data=" + this.data + ')';
    }

    public /* synthetic */ ResultModel(String str, int i5, Object obj, int i6, w wVar) {
        this(str, i5, (i6 & 4) != 0 ? null : obj);
    }
}
