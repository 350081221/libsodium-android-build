package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.agconnect.credential.obs.c;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.k;
import com.huawei.hmf.tasks.m;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.i;
import com.huawei.hms.opendevice.j;
import com.huawei.hms.opendevice.l;
import com.huawei.hms.opendevice.o;
import com.huawei.hms.opendevice.p;
import com.huawei.hms.opendevice.q;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes3.dex */
public class HmsInstanceId {
    public static final String TAG = "HmsInstanceId";

    /* renamed from: a, reason: collision with root package name */
    public Context f8108a;

    /* renamed from: b, reason: collision with root package name */
    public PushPreferences f8109b;

    /* renamed from: c, reason: collision with root package name */
    public HuaweiApi<Api.ApiOptions.NoOptions> f8110c;

    public HmsInstanceId(Context context) {
        this.f8108a = context.getApplicationContext();
        this.f8109b = new PushPreferences(context, c.f7851a);
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f8110c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f8110c = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f8110c.setKitSdkVersion(50101306);
    }

    public static HmsInstanceId getInstance(Context context) {
        Preconditions.checkNotNull(context);
        com.huawei.hms.opendevice.c.d(context);
        return new HmsInstanceId(context);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (p.c(this.f8108a)) {
            String string = i.a(this.f8108a).getString("subjectId");
            if (TextUtils.isEmpty(string)) {
                i.a(this.f8108a).saveString("subjectId", str);
                return;
            }
            if (string.contains(str)) {
                return;
            }
            i.a(this.f8108a).saveString("subjectId", string + "," + str);
            return;
        }
        i.a(this.f8108a).removeKey("subjectId");
    }

    public final void b() throws ApiException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
        } else {
            throw ErrorEnum.ERROR_MAIN_THREAD.toApiException();
        }
    }

    public void deleteAAID() throws ApiException {
        b();
        try {
            if (!this.f8109b.containsKey(c.f7851a)) {
                return;
            }
            this.f8109b.removeKey(c.f7851a);
            this.f8109b.removeKey(c.f7852b);
            if (!o.e(this.f8108a)) {
                return;
            }
            if (ProxyCenter.getProxy() != null) {
                HMSLog.i(TAG, "use proxy delete all token after delete AaId.");
                ProxyCenter.getProxy().deleteAllToken(this.f8108a);
                return;
            }
            DeleteTokenReq b5 = o.b(this.f8108a);
            b5.setDeleteType(1);
            b5.setMultiSender(false);
            a(b5, 1);
            BaseUtils.deleteAllTokenCache(this.f8108a);
        } catch (ApiException e5) {
            throw e5;
        } catch (Exception unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public void deleteToken(String str, String str2) throws ApiException {
        b();
        a();
        DeleteTokenReq a5 = o.a(this.f8108a, str, str2);
        a5.setMultiSender(false);
        a(a5, 1);
    }

    public Task<AAIDResult> getAAID() {
        try {
            return m.f(new j(this.f8108a.getApplicationContext()));
        } catch (Exception unused) {
            k kVar = new k();
            kVar.c(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            return kVar.b();
        }
    }

    public long getCreationTime() {
        try {
            if (!this.f8109b.containsKey(c.f7852b)) {
                getAAID();
            }
            return this.f8109b.getLong(c.f7852b);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getId() {
        return o.c(this.f8108a);
    }

    @Deprecated
    public String getToken() {
        try {
            return getToken(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getToken(String str, String str2) throws ApiException {
        b();
        a();
        TokenReq b5 = o.b(this.f8108a, str, str2);
        b5.setAaid(getId());
        b5.setMultiSender(false);
        i.a(this.f8108a).saveString(this.f8108a.getPackageName(), "1");
        return a(b5, 1);
    }

    public void deleteToken(String str) throws ApiException {
        b();
        a();
        if (!TextUtils.isEmpty(str)) {
            String d5 = o.d(this.f8108a);
            if (!TextUtils.isEmpty(d5)) {
                if (str.equals(d5)) {
                    deleteToken(null, null);
                    return;
                }
                DeleteTokenReq a5 = o.a(this.f8108a, str);
                a5.setMultiSender(true);
                a(a5, 2);
                return;
            }
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public String getToken(String str) throws ApiException {
        b();
        a();
        if (!TextUtils.isEmpty(str)) {
            String d5 = o.d(this.f8108a);
            if (!TextUtils.isEmpty(d5)) {
                if (str.equals(d5)) {
                    return getToken(null, null);
                }
                TokenReq b5 = o.b(this.f8108a, str);
                b5.setAaid(getId());
                b5.setMultiSender(true);
                return a(b5, 2);
            }
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public final String a(TokenReq tokenReq, int i5) throws ApiException {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
            ProxyCenter.getProxy().getToken(this.f8108a, tokenReq.getSubjectId(), null);
            return null;
        }
        a(tokenReq.getSubjectId());
        String a5 = q.a(this.f8108a, "push.gettoken");
        try {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("getToken req :");
            sb.append(tokenReq.toString());
            HMSLog.d(str, sb.toString());
            l lVar = new l("push.gettoken", tokenReq, this.f8108a, a5);
            lVar.setApiLevel(i5);
            return ((TokenResult) m.c(this.f8110c.doWrite(lVar))).getToken();
        } catch (Exception e5) {
            if (e5.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e5.getCause();
                q.a(this.f8108a, "push.gettoken", a5, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f8108a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            q.a(context, "push.gettoken", a5, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    public final void a(DeleteTokenReq deleteTokenReq, int i5) throws ApiException {
        String subjectId = deleteTokenReq.getSubjectId();
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy delete token");
            ProxyCenter.getProxy().deleteToken(this.f8108a, subjectId, null);
            return;
        }
        String a5 = q.a(this.f8108a, "push.deletetoken");
        try {
            String b5 = i.a(this.f8108a).b(subjectId);
            if (deleteTokenReq.isMultiSender() && (TextUtils.isEmpty(b5) || b5.equals(i.a(this.f8108a).b(null)))) {
                i.a(this.f8108a).removeKey(subjectId);
                HMSLog.i(TAG, "The local subject token is null");
                return;
            }
            deleteTokenReq.setToken(b5);
            com.huawei.hms.opendevice.k kVar = new com.huawei.hms.opendevice.k("push.deletetoken", deleteTokenReq, a5);
            kVar.setApiLevel(i5);
            m.c(this.f8110c.doWrite(kVar));
            i.a(this.f8108a).c(subjectId);
        } catch (Exception e5) {
            if (e5.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e5.getCause();
                q.a(this.f8108a, "push.deletetoken", a5, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f8108a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            q.a(context, "push.deletetoken", a5, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    public final void a() throws ApiException {
        if (BaseUtils.getProxyInit(this.f8108a) && ProxyCenter.getProxy() == null && !BaseUtils.isMainProc(this.f8108a)) {
            HMSLog.e(TAG, "Operations in child processes are not supported.");
            throw ErrorEnum.ERROR_OPER_IN_CHILD_PROCESS.toApiException();
        }
    }
}
