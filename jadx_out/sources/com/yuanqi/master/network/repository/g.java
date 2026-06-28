package com.yuanqi.master.network.repository;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.yuanqi.master.network.model.BaseResult;
import com.yuanqi.master.network.model.BasicResponse;
import com.yuanqi.master.network.model.LoginResponse;
import com.yuanqi.master.network.model.ResultModel;
import com.yuanqi.master.network.model.UserInfoData;
import com.yuanqi.master.network.model.request.BackCodeRequest;
import com.yuanqi.master.network.model.request.BindNewEmailRequest;
import com.yuanqi.master.network.model.request.BindNewPhoneRequest;
import com.yuanqi.master.network.model.request.EditPwdRequest;
import com.yuanqi.master.network.model.request.EditUnameRequest;
import com.yuanqi.master.network.model.request.EmailCodeRequest;
import com.yuanqi.master.network.model.request.ForgetPwdRequest;
import com.yuanqi.master.network.model.request.ForgetUnameRequest;
import com.yuanqi.master.network.model.request.LoginRequest;
import com.yuanqi.master.network.model.request.LoginUserInfoRequest;
import com.yuanqi.master.network.model.request.PhoneCodeRequest;
import com.yuanqi.master.network.model.request.SmallRegistrationRequest;
import com.yuanqi.master.network.model.request.ValidOldEmailRequest;
import com.yuanqi.master.network.model.request.ValidOldPhoneRequest;
import com.yuanqi.master.network.model.response.EditResponse;
import com.yuanqi.master.network.model.response.GenInvCodeResponse;
import com.yuanqi.master.network.model.response.LoginUserInfoResponse;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import retrofit2.Call;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007J\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0013\u001a\u00020\u0007J\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0004J8\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007J(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000f0\u0004J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u0007J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u0007J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000f0\u0004J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00042\u0006\u0010&\u001a\u00020'J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00042\u0006\u0010*\u001a\u00020+J*\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007J\"\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\"\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\u0006\u00101\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¨\u00062"}, d2 = {"Lcom/yuanqi/master/network/repository/UserRepository;", "Lcom/yuanqi/master/network/repository/BaseRepository;", "()V", "backInvCode", "Lretrofit2/Call;", "Lcom/yuanqi/master/network/model/BasicResponse;", "invCode", "", "changePwd", "Lcom/yuanqi/master/network/model/response/EditResponse;", "newPwd", "coding", "userPhone", "userEmail", "changeUserEmail", "Lcom/yuanqi/master/network/model/BaseResult;", "", "newUserEmail", "changeUserName", "newUserName", "changeUserPhone", "newUserPhone", "deleteAccount", "forgetPassword", "Lcom/yuanqi/master/network/model/ResultModel;", "userName", "pwd", "forgetUserName", "geneInvCode", "Lcom/yuanqi/master/network/model/response/GenInvCodeResponse;", "getEmailCode", NotificationCompat.CATEGORY_EMAIL, "getPhoneCode", HintConstants.AUTOFILL_HINT_PHONE, "getUserInfoNew", "Lcom/yuanqi/master/network/model/UserInfoData;", "loginByUserId", "Lcom/yuanqi/master/network/model/LoginResponse;", "userId", "", "loginNew", "Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;", "loginUserInfoRequest", "Lcom/yuanqi/master/network/model/request/LoginUserInfoRequest;", "smallRegistration", PluginConstants.KEY_ERROR_CODE, "validOldEmail", "oldUserEmail", "validOldPhone", "oldUserPhone", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends a {

    /* renamed from: g, reason: collision with root package name */
    @l
    public static final g f14853g = new g();

    /* renamed from: h, reason: collision with root package name */
    public static final int f14854h = 0;

    private g() {
    }

    public static /* synthetic */ Call i(g gVar, String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str3 = "";
        }
        if ((i5 & 8) != 0) {
            str4 = "";
        }
        return gVar.h(str, str2, str3, str4);
    }

    public static /* synthetic */ Call o(g gVar, String str, String str2, String str3, String str4, String str5, int i5, Object obj) {
        String str6;
        String str7;
        if ((i5 & 8) != 0) {
            str6 = "";
        } else {
            str6 = str4;
        }
        if ((i5 & 16) != 0) {
            str7 = "";
        } else {
            str7 = str5;
        }
        return gVar.n(str, str2, str3, str6, str7);
    }

    public static /* synthetic */ Call q(g gVar, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = "";
        }
        if ((i5 & 4) != 0) {
            str3 = "";
        }
        return gVar.p(str, str2, str3);
    }

    @l
    public final Call<BasicResponse> g(@l String invCode) {
        l0.p(invCode, "invCode");
        return e().u(c(), new BackCodeRequest(invCode));
    }

    @l
    public final Call<EditResponse> h(@l String newPwd, @l String coding, @l String userPhone, @l String userEmail) {
        l0.p(newPwd, "newPwd");
        l0.p(coding, "coding");
        l0.p(userPhone, "userPhone");
        l0.p(userEmail, "userEmail");
        return e().t(c(), new EditPwdRequest(newPwd, coding, userPhone, userEmail));
    }

    @l
    public final Call<BaseResult<Object>> j(@l String newUserEmail, @l String coding) {
        l0.p(newUserEmail, "newUserEmail");
        l0.p(coding, "coding");
        return e().d(c(), new BindNewEmailRequest(newUserEmail, coding));
    }

    @l
    public final Call<EditResponse> k(@l String newUserName) {
        l0.p(newUserName, "newUserName");
        return e().e(c(), new EditUnameRequest(newUserName));
    }

    @l
    public final Call<BaseResult<Object>> l(@l String newUserPhone, @l String coding) {
        l0.p(newUserPhone, "newUserPhone");
        l0.p(coding, "coding");
        return e().A(c(), new BindNewPhoneRequest(newUserPhone, coding));
    }

    @l
    public final Call<BaseResult<Object>> m() {
        return e().x(c());
    }

    @l
    public final Call<ResultModel> n(@l String userName, @l String pwd, @l String coding, @l String userPhone, @l String userEmail) {
        l0.p(userName, "userName");
        l0.p(pwd, "pwd");
        l0.p(coding, "coding");
        l0.p(userPhone, "userPhone");
        l0.p(userEmail, "userEmail");
        return e().v(new ForgetPwdRequest(userName, pwd, coding, userPhone, userEmail));
    }

    @l
    public final Call<ResultModel> p(@l String coding, @l String userPhone, @l String userEmail) {
        l0.p(coding, "coding");
        l0.p(userPhone, "userPhone");
        l0.p(userEmail, "userEmail");
        return e().l(new ForgetUnameRequest(coding, userPhone, userEmail));
    }

    @l
    public final Call<BaseResult<GenInvCodeResponse>> r() {
        return e().o(c());
    }

    @l
    public final Call<BasicResponse> s(@l String email) {
        l0.p(email, "email");
        return e().c(new EmailCodeRequest(email));
    }

    @l
    public final Call<BasicResponse> t(@l String phone) {
        l0.p(phone, "phone");
        return e().a(new PhoneCodeRequest(phone));
    }

    @l
    public final Call<BaseResult<UserInfoData>> u() {
        return e().f(c());
    }

    @l
    public final Call<LoginResponse> v(long j5) {
        return e().p(new LoginRequest(j5));
    }

    @l
    public final Call<LoginUserInfoResponse> w(@l LoginUserInfoRequest loginUserInfoRequest) {
        l0.p(loginUserInfoRequest, "loginUserInfoRequest");
        return e().z(loginUserInfoRequest);
    }

    @l
    public final Call<BaseResult<Object>> x(@l String userName, @l String userPhone, @l String code) {
        l0.p(userName, "userName");
        l0.p(userPhone, "userPhone");
        l0.p(code, "code");
        return e().i(c(), new SmallRegistrationRequest(userName, userPhone, code));
    }

    @l
    public final Call<BaseResult<Object>> y(@l String oldUserEmail, @l String coding) {
        l0.p(oldUserEmail, "oldUserEmail");
        l0.p(coding, "coding");
        return e().y(c(), new ValidOldEmailRequest(oldUserEmail, coding));
    }

    @l
    public final Call<BaseResult<Object>> z(@l String oldUserPhone, @l String coding) {
        l0.p(oldUserPhone, "oldUserPhone");
        l0.p(coding, "coding");
        return e().q(c(), new ValidOldPhoneRequest(oldUserPhone, coding));
    }
}
