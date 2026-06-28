package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import com.huawei.agconnect.credential.obs.c;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.k;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.l;
import com.huawei.hms.opendevice.o;
import com.huawei.hms.opendevice.q;
import com.huawei.hms.support.log.HMSLog;
import java.util.UUID;

@Deprecated
/* loaded from: classes3.dex */
public class HmsInstanceIdEx {
    public static final String TAG = "HmsInstanceIdEx";

    /* renamed from: a, reason: collision with root package name */
    public Context f8111a;

    /* renamed from: b, reason: collision with root package name */
    public PushPreferences f8112b;

    /* renamed from: c, reason: collision with root package name */
    public HuaweiApi<Api.ApiOptions.NoOptions> f8113c;

    public HmsInstanceIdEx(Context context) {
        this.f8112b = null;
        this.f8111a = context;
        this.f8112b = new PushPreferences(context, c.f7851a);
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f8113c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f8113c = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f8113c.setKitSdkVersion(50101306);
    }

    public static HmsInstanceIdEx getInstance(Context context) {
        Preconditions.checkNotNull(context);
        return new HmsInstanceIdEx(context);
    }

    public final String a(String str) {
        return c.f7852b + str;
    }

    public void deleteAAID(String str) throws ApiException {
        if (str != null) {
            try {
                if (this.f8112b.containsKey(str)) {
                    this.f8112b.removeKey(str);
                    this.f8112b.removeKey(a(str));
                    return;
                }
                return;
            } catch (RuntimeException unused) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            } catch (Exception unused2) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            }
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public String getAAId(String str) throws ApiException {
        if (str != null) {
            try {
                if (this.f8112b.containsKey(str)) {
                    return this.f8112b.getString(str);
                }
                String uuid = UUID.randomUUID().toString();
                this.f8112b.saveString(str, uuid);
                this.f8112b.saveLong(a(str), Long.valueOf(System.currentTimeMillis()));
                return uuid;
            } catch (RuntimeException unused) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            } catch (Exception unused2) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            }
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public long getCreationTime(String str) throws ApiException {
        if (str != null) {
            try {
                if (!this.f8112b.containsKey(a(str))) {
                    getAAId(str);
                }
                return this.f8112b.getLong(a(str));
            } catch (RuntimeException unused) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            } catch (Exception unused2) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            }
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public Task<TokenResult> getToken() {
        if (ProxyCenter.getProxy() != null) {
            try {
                HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
                ProxyCenter.getProxy().getToken(this.f8111a, null, null);
                k kVar = new k();
                kVar.d(new TokenResult());
                return kVar.b();
            } catch (ApiException e5) {
                return a(e5);
            } catch (Exception unused) {
                return a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            }
        }
        String a5 = q.a(this.f8111a, "push.gettoken");
        try {
            TokenReq b5 = o.b(this.f8111a, null, null);
            b5.setAaid(HmsInstanceId.getInstance(this.f8111a).getId());
            return this.f8113c.doWrite(new l("push.gettoken", b5, this.f8111a, a5));
        } catch (RuntimeException unused2) {
            Context context = this.f8111a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            q.a(context, "push.gettoken", a5, errorEnum);
            return a(errorEnum.toApiException());
        } catch (Exception unused3) {
            Context context2 = this.f8111a;
            ErrorEnum errorEnum2 = ErrorEnum.ERROR_INTERNAL_ERROR;
            q.a(context2, "push.gettoken", a5, errorEnum2);
            return a(errorEnum2.toApiException());
        }
    }

    public final Task<TokenResult> a(Exception exc) {
        k kVar = new k();
        kVar.c(exc);
        return kVar.b();
    }
}
