package com.yuanqi.master.network;

import com.umeng.analytics.pro.d;
import com.yuanqi.master.network.model.BaseResult;
import com.yuanqi.master.network.model.BasicResponse;
import com.yuanqi.master.network.model.LoginResponse;
import com.yuanqi.master.network.model.ResultModel;
import com.yuanqi.master.network.model.UserInfoData;
import com.yuanqi.master.network.model.request.BackCodeRequest;
import com.yuanqi.master.network.model.request.BindNewEmailRequest;
import com.yuanqi.master.network.model.request.BindNewPhoneRequest;
import com.yuanqi.master.network.model.request.CreateOrderRequest;
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
import com.yuanqi.master.network.model.response.ConfigResponse;
import com.yuanqi.master.network.model.response.EditResponse;
import com.yuanqi.master.network.model.response.ForceByVersionResponse;
import com.yuanqi.master.network.model.response.GenInvCodeResponse;
import com.yuanqi.master.network.model.response.GeocodingResponse;
import com.yuanqi.master.network.model.response.LoginUserInfoResponse;
import com.yuanqi.master.network.model.response.ReverseBaseStationItem;
import com.yuanqi.master.network.model.response.ReverseEncodingResponse;
import com.yuanqi.master.network.model.response.ShareListResponse;
import com.yuanqi.master.network.model.response.VipMealResponse;
import java.util.ArrayList;
import kotlin.i0;
import p4.l;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@i0(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH'J(\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0011H'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0014H'J(\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0017H'J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u001cH'J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u001cH'J\u001e\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010 \u001a\u00020!H'J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010#\u001a\u00020$H'J\u001e\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0014\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\n0\u0003H'J2\u0010)\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,0\u00032\b\b\u0001\u0010-\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\u0006H'J\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00100\u001a\u000201H'J\u001e\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\n0\u00032\b\b\u0001\u00104\u001a\u000205H'J\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00107\u001a\u000208H'J\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00032\b\b\u0001\u0010B\u001a\u00020CH'J\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00032\b\b\u0001\u0010F\u001a\u00020GH'J\"\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u00032\b\b\u0001\u0010J\u001a\u00020\u00062\b\b\u0001\u0010K\u001a\u00020\u0006H'J\"\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00032\b\b\u0001\u0010N\u001a\u00020\u00062\b\b\u0001\u0010K\u001a\u00020\u0006H'J(\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010P\u001a\u00020QH'J(\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010S\u001a\u00020TH'J(\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010V\u001a\u00020WH'¨\u0006X"}, d2 = {"Lcom/yuanqi/master/network/ApiService;", "", "backCode", "Lretrofit2/Call;", "Lcom/yuanqi/master/network/model/BasicResponse;", "token", "", "backCodeRequest", "Lcom/yuanqi/master/network/model/request/BackCodeRequest;", "changeDevice", "Lcom/yuanqi/master/network/model/BaseResult;", "changePwd", "Lcom/yuanqi/master/network/model/response/EditResponse;", "editPwdRequest", "Lcom/yuanqi/master/network/model/request/EditPwdRequest;", "changeUserEmail", "bindNewEmailRequest", "Lcom/yuanqi/master/network/model/request/BindNewEmailRequest;", "changeUserName", "editUnameRequest", "Lcom/yuanqi/master/network/model/request/EditUnameRequest;", "changeUserPhone", "bindNewPhoneRequest", "Lcom/yuanqi/master/network/model/request/BindNewPhoneRequest;", "createAliOrder", "Lcom/yuanqi/master/network/model/ResultModel;", "type", "createOrderRequest", "Lcom/yuanqi/master/network/model/request/CreateOrderRequest;", "createWxOrder", "deleteAccount", "forgetName", "forgetUnameRequest", "Lcom/yuanqi/master/network/model/request/ForgetUnameRequest;", "forgetPwd", "forgetPwdRequest", "Lcom/yuanqi/master/network/model/request/ForgetPwdRequest;", "geneInvCode", "Lcom/yuanqi/master/network/model/response/GenInvCodeResponse;", "getAppConfig", "Lcom/yuanqi/master/network/model/response/ConfigResponse;", "getBaseStation", "Ljava/util/ArrayList;", "Lcom/yuanqi/master/network/model/response/ReverseBaseStationItem;", "Lkotlin/collections/ArrayList;", d.C, "lon", "getEmailCode", "emailCodeRequest", "Lcom/yuanqi/master/network/model/request/EmailCodeRequest;", "getForceByVersion", "Lcom/yuanqi/master/network/model/response/ForceByVersionResponse;", "version", "", "getPhoneCode", "phoneCodeRequest", "Lcom/yuanqi/master/network/model/request/PhoneCodeRequest;", "getShareList", "Lcom/yuanqi/master/network/model/response/ShareListResponse;", "getUserInfoNew", "Lcom/yuanqi/master/network/model/UserInfoData;", "getVipMeal", "Lcom/yuanqi/master/network/model/response/VipMealResponse;", "giveVip", "loginByUserId", "Lcom/yuanqi/master/network/model/LoginResponse;", "loginRequest", "Lcom/yuanqi/master/network/model/request/LoginRequest;", "loginNew", "Lcom/yuanqi/master/network/model/response/LoginUserInfoResponse;", "loginUserInfoRequest", "Lcom/yuanqi/master/network/model/request/LoginUserInfoRequest;", "searchAddress", "Lcom/yuanqi/master/network/model/response/GeocodingResponse;", "ds", "tk", "searchLatlng", "Lcom/yuanqi/master/network/model/response/ReverseEncodingResponse;", "postStr", "smallRegistration", "smallRegistrationRequest", "Lcom/yuanqi/master/network/model/request/SmallRegistrationRequest;", "validOldEmail", "validOldEmailRequest", "Lcom/yuanqi/master/network/model/request/ValidOldEmailRequest;", "validOldPhone", "validOldPhoneRequest", "Lcom/yuanqi/master/network/model/request/ValidOldPhoneRequest;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {
    @l
    @POST("/yuanqi/user/changeUserPhone")
    Call<BaseResult<Object>> A(@l @Header("token") String str, @l @Body BindNewPhoneRequest bindNewPhoneRequest);

    @l
    @POST("/yuanqi/pay/{type}")
    Call<ResultModel> B(@l @Header("token") String str, @l @Path("type") String str2, @l @Body CreateOrderRequest createOrderRequest);

    @l
    @POST("/yuanqi/user/sendPhone")
    Call<BasicResponse> a(@l @Body PhoneCodeRequest phoneCodeRequest);

    @l
    @GET("/yuanqi/user/giveVip")
    Call<BasicResponse> b(@l @Header("token") String str);

    @l
    @POST("/yuanqi/user/sendEmail")
    Call<BasicResponse> c(@l @Body EmailCodeRequest emailCodeRequest);

    @l
    @POST("/yuanqi/user/changeUserEmail")
    Call<BaseResult<Object>> d(@l @Header("token") String str, @l @Body BindNewEmailRequest bindNewEmailRequest);

    @l
    @POST("/yuanqi/user/changeUserName")
    Call<EditResponse> e(@l @Header("token") String str, @l @Body EditUnameRequest editUnameRequest);

    @l
    @GET("/yuanqi/user/getUserInfoNew")
    Call<BaseResult<UserInfoData>> f(@l @Header("token") String str);

    @l
    @POST("/yuanqi/meal/getVipMeal")
    Call<VipMealResponse> g(@l @Header("token") String str);

    @l
    @GET("/yuanqi/device/getRandomDevice")
    Call<BaseResult<Object>> h(@l @Header("token") String str);

    @l
    @POST("/yuanqi/user/smallRegistration")
    Call<BaseResult<Object>> i(@l @Header("token") String str, @l @Body SmallRegistrationRequest smallRegistrationRequest);

    @l
    @GET("/geocoder?type=geocode")
    Call<ReverseEncodingResponse> j(@l @Query("postStr") String str, @l @Query("tk") String str2);

    @l
    @GET("/geocoder?")
    Call<GeocodingResponse> k(@l @Query("ds") String str, @l @Query("tk") String str2);

    @l
    @POST("/yuanqi/user/forgetName")
    Call<ResultModel> l(@l @Body ForgetUnameRequest forgetUnameRequest);

    @l
    @GET("/manage/config/getConfigList")
    Call<BaseResult<ConfigResponse>> m();

    @l
    @POST("/yuanqi/pay/{type}")
    Call<ResultModel> n(@l @Header("token") String str, @l @Path("type") String str2, @l @Body CreateOrderRequest createOrderRequest);

    @l
    @GET("/yuanqi/share/geneInvCode")
    Call<BaseResult<GenInvCodeResponse>> o(@l @Header("token") String str);

    @l
    @POST("/yuanqi/user/loginByUserId")
    Call<LoginResponse> p(@l @Body LoginRequest loginRequest);

    @l
    @POST("/yuanqi/user/validOldPhone")
    Call<BaseResult<Object>> q(@l @Header("token") String str, @l @Body ValidOldPhoneRequest validOldPhoneRequest);

    @l
    @GET("/yuanqi/share/getShareList")
    Call<ShareListResponse> r(@l @Header("token") String str);

    @l
    @GET("/recell/ise2582w.php?&n=10")
    Call<ArrayList<ReverseBaseStationItem>> s(@l @Query("lat") String str, @l @Query("lon") String str2);

    @l
    @POST("/yuanqi/user/changePwd")
    Call<EditResponse> t(@l @Header("token") String str, @l @Body EditPwdRequest editPwdRequest);

    @l
    @POST("/yuanqi/share/getInvCode")
    Call<BasicResponse> u(@l @Header("token") String str, @l @Body BackCodeRequest backCodeRequest);

    @l
    @POST("/yuanqi/user/forgetPwd")
    Call<ResultModel> v(@l @Body ForgetPwdRequest forgetPwdRequest);

    @l
    @GET("/manage/version/getForceByVersion")
    Call<BaseResult<ForceByVersionResponse>> w(@Header("version") int i5);

    @l
    @POST("/yuanqi/user/deleteAcount")
    Call<BaseResult<Object>> x(@l @Header("token") String str);

    @l
    @POST("/yuanqi/user/validOldEmail")
    Call<BaseResult<Object>> y(@l @Header("token") String str, @l @Body ValidOldEmailRequest validOldEmailRequest);

    @l
    @POST("/yuanqi/user/newLogin")
    Call<LoginUserInfoResponse> z(@l @Body LoginUserInfoRequest loginUserInfoRequest);
}
