package com.yuanqi.master.mine.account;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yuanqi.master.network.model.MemberType;
import com.yuanqi.master.network.model.UserInfoData;
import com.yuanqi.master.tools.f1;
import com.yuanqi.master.tools.w0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.x0;
import kotlin.r2;
import kotlin.reflect.o;
import kotlin.text.e0;
import kotlin.text.f0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010&\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(J\u0006\u0010*\u001a\u00020\bJ\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\bJ\u0006\u0010-\u001a\u00020)J\u001c\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u0002002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0011\u0010\u0017\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000bR+\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u000f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00061"}, d2 = {"Lcom/yuanqi/master/mine/account/AccountManager;", "", "()V", "isPayMember", "", "()Z", "isVip", "<set-?>", "", "mToken", "getMToken", "()Ljava/lang/String;", "setMToken", "(Ljava/lang/String;)V", "mToken$delegate", "Lcom/yuanqi/master/tools/MVFast;", "userInfo", "Landroidx/compose/runtime/MutableState;", "Lcom/yuanqi/master/network/model/UserInfoData;", "getUserInfo", "()Landroidx/compose/runtime/MutableState;", "userLogin", "getUserLogin", "userToken", "getUserToken", "vipLevel", "Lcom/yuanqi/master/network/model/MemberType;", "getVipLevel", "()Lcom/yuanqi/master/network/model/MemberType;", "vipTime", "getVipTime", "", "vipTimeNoLogin", "getVipTimeNoLogin", "()J", "setVipTimeNoLogin", "(J)V", "vipTimeNoLogin$delegate", "getUserTitle", "action", "Lkotlin/Function0;", "", "getUserTitlePlus", "loginIn", "token", "loginOut", "requestUserInfo", "scope", "Lkotlinx/coroutines/CoroutineScope;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nAccountManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountManager.kt\ncom/yuanqi/master/mine/account/AccountManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final MutableState<UserInfoData> f14790e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14791f = 0;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f14787b = {l1.k(new x0(a.class, "mToken", "getMToken()Ljava/lang/String;", 0)), l1.k(new x0(a.class, "vipTimeNoLogin", "getVipTimeNoLogin()J", 0))};

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f14786a = new a();

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final com.yuanqi.master.tools.x0 f14788c = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.N, "");

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final com.yuanqi.master.tools.x0 f14789d = new com.yuanqi.master.tools.x0(com.yuanqi.master.config.c.H, 0L);

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/yuanqi/master/network/model/UserInfoData;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yuanqi.master.mine.account.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0372a extends n0 implements v3.l<UserInfoData, r2> {
        final /* synthetic */ v3.a<r2> $action;
        final /* synthetic */ s0 $scope;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.yuanqi.master.mine.account.AccountManager$requestUserInfo$1$1", f = "AccountManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.yuanqi.master.mine.account.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0373a extends kotlin.coroutines.jvm.internal.o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ UserInfoData $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0373a(UserInfoData userInfoData, kotlin.coroutines.d<? super C0373a> dVar) {
                super(2, dVar);
                this.$it = userInfoData;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return new C0373a(this.$it, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
                return ((C0373a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    a.f14786a.b().setValue(this.$it);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0372a(s0 s0Var, v3.a<r2> aVar) {
            super(1);
            this.$scope = s0Var;
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(UserInfoData userInfoData) {
            invoke2(userInfoData);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m UserInfoData userInfoData) {
            k.f(this.$scope, k1.e(), null, new C0373a(userInfoData, null), 2, null);
            this.$action.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends n0 implements v3.l<String, r2> {
        final /* synthetic */ v3.a<r2> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v3.a<r2> aVar) {
            super(1);
            this.$action = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(String str) {
            invoke2(str);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l String it) {
            l0.p(it, "it");
            this.$action.invoke();
        }
    }

    static {
        MutableState<UserInfoData> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        f14790e = mutableStateOf$default;
    }

    private a() {
    }

    private final String a() {
        return (String) f14788c.getValue(this, f14787b[0]);
    }

    private final long i() {
        return ((Number) f14789d.getValue(this, f14787b[1])).longValue();
    }

    private final void o(String str) {
        f14788c.setValue(this, f14787b[0], str);
    }

    private final void p(long j5) {
        f14789d.setValue(this, f14787b[1], Long.valueOf(j5));
    }

    @l
    public final MutableState<UserInfoData> b() {
        return f14790e;
    }

    public final boolean c() {
        return w0.f15264a.b(com.yuanqi.master.config.c.N);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(@p4.l v3.a<kotlin.r2> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "action"
            kotlin.jvm.internal.l0.p(r7, r0)
            androidx.compose.runtime.MutableState<com.yuanqi.master.network.model.UserInfoData> r0 = com.yuanqi.master.mine.account.a.f14790e
            java.lang.Object r0 = r0.getValue()
            com.yuanqi.master.network.model.UserInfoData r0 = (com.yuanqi.master.network.model.UserInfoData) r0
            java.lang.String r1 = ""
            if (r0 != 0) goto L15
            r7.invoke()
            return r1
        L15:
            java.lang.String r2 = r0.getUserName()
            if (r2 != 0) goto L1c
            r2 = r1
        L1c:
            boolean r3 = kotlin.text.v.S1(r2)
            r4 = 1
            r3 = r3 ^ r4
            r5 = 0
            if (r3 == 0) goto L26
            goto L27
        L26:
            r2 = r5
        L27:
            if (r2 != 0) goto L4f
            java.lang.String r2 = r0.getUserPhone()
            if (r2 != 0) goto L30
            r2 = r1
        L30:
            boolean r3 = kotlin.text.v.S1(r2)
            r3 = r3 ^ r4
            if (r3 == 0) goto L38
            goto L39
        L38:
            r2 = r5
        L39:
            if (r2 != 0) goto L4f
            java.lang.String r0 = r0.getUserEmail()
            if (r0 != 0) goto L42
            r0 = r1
        L42:
            boolean r2 = kotlin.text.v.S1(r0)
            r2 = r2 ^ r4
            if (r2 == 0) goto L4a
            r5 = r0
        L4a:
            if (r5 != 0) goto L4d
            goto L50
        L4d:
            r1 = r5
            goto L50
        L4f:
            r1 = r2
        L50:
            int r0 = r1.length()
            if (r0 != 0) goto L57
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L5d
            r7.invoke()
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yuanqi.master.mine.account.a.d(v3.a):java.lang.String");
    }

    @l
    public final String e() {
        boolean S1;
        boolean S12;
        boolean S13;
        UserInfoData value = f14790e.getValue();
        if (value == null) {
            return "";
        }
        String userName = value.getUserName();
        if (userName == null) {
            userName = "";
        }
        S1 = e0.S1(userName);
        String str = null;
        if (!(!S1)) {
            userName = null;
        }
        if (userName == null) {
            userName = value.getUserPhone();
            if (userName == null) {
                userName = "";
            }
            S12 = e0.S1(userName);
            if (!(!S12)) {
                userName = null;
            }
            if (userName == null) {
                String userEmail = value.getUserEmail();
                if (userEmail == null) {
                    userEmail = "";
                }
                S13 = e0.S1(userEmail);
                if (!S13) {
                    str = userEmail;
                }
                if (str == null) {
                    return "";
                }
                return str;
            }
        }
        return userName;
    }

    @l
    public final String f() {
        return a();
    }

    @l
    public final MemberType g() {
        String str;
        String str2;
        boolean z4;
        boolean z5;
        boolean z6;
        if (!c()) {
            if (i() > System.currentTimeMillis()) {
                return MemberType.FREE;
            }
            return MemberType.NORMAL;
        }
        MutableState<UserInfoData> mutableState = f14790e;
        UserInfoData value = mutableState.getValue();
        String str3 = null;
        if (value != null) {
            str = value.isVip();
        } else {
            str = null;
        }
        if (!l0.g(str, "1")) {
            return MemberType.NORMAL;
        }
        UserInfoData value2 = mutableState.getValue();
        if (value2 != null) {
            str2 = value2.getVipOpentime();
        } else {
            str2 = null;
        }
        boolean z7 = true;
        if (str2 != null && str2.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            return MemberType.UNKNOWN;
        }
        UserInfoData value3 = mutableState.getValue();
        if (value3 != null) {
            str3 = value3.getVipOvertime();
        }
        if (str3 != null && str3.length() != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            return MemberType.UNKNOWN;
        }
        com.yuanqi.master.tools.d dVar = com.yuanqi.master.tools.d.f15067a;
        UserInfoData value4 = mutableState.getValue();
        l0.m(value4);
        Long b5 = dVar.b(value4.getVipOvertime());
        l0.m(b5);
        long longValue = b5.longValue();
        if (longValue < System.currentTimeMillis()) {
            return MemberType.NORMAL;
        }
        UserInfoData value5 = mutableState.getValue();
        l0.m(value5);
        Long b6 = dVar.b(value5.getVipOpentime());
        l0.m(b6);
        long longValue2 = (longValue - b6.longValue()) / 86400000;
        Log.d("", "vipDays: " + longValue2);
        if (0 <= longValue2 && longValue2 < 30) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            return MemberType.FREE;
        }
        if (30 > longValue2 || longValue2 >= 346) {
            z7 = false;
        }
        if (z7) {
            return MemberType.MONTH;
        }
        return MemberType.YEAR;
    }

    @l
    public final String h() {
        String str;
        boolean z4;
        List R4;
        Object y22;
        if (c()) {
            MutableState<UserInfoData> mutableState = f14790e;
            UserInfoData value = mutableState.getValue();
            if (value != null) {
                str = value.getVipOvertime();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                return "";
            }
            UserInfoData value2 = mutableState.getValue();
            l0.m(value2);
            R4 = f0.R4(value2.getVipOvertime(), new String[]{" "}, false, 0, 6, null);
            y22 = kotlin.collections.e0.y2(R4);
            return (String) y22;
        }
        if (i() <= System.currentTimeMillis()) {
            return "";
        }
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(i()));
        l0.o(format, "format(...)");
        return format;
    }

    public final boolean j() {
        return g() == MemberType.YEAR || g() == MemberType.MONTH;
    }

    public final boolean k() {
        String str;
        if (c()) {
            UserInfoData value = f14790e.getValue();
            if (value != null) {
                str = value.isVip();
            } else {
                str = null;
            }
            return l0.g(str, "1");
        }
        if (i() > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public final void l(@l String token) {
        l0.p(token, "token");
        o(token);
    }

    public final void m() {
        w0 w0Var = w0.f15264a;
        w0Var.f(com.yuanqi.master.config.c.N);
        w0Var.f(com.yuanqi.master.config.c.K);
        w0Var.f(com.yuanqi.master.config.c.V);
        f14790e.setValue(null);
    }

    public final void n(@l s0 scope, @l v3.a<r2> action) {
        l0.p(scope, "scope");
        l0.p(action, "action");
        if (!c()) {
            action.invoke();
        } else {
            f1.a(com.yuanqi.master.network.repository.g.f14853g.u(), new C0372a(scope, action), new b(action));
        }
    }
}
