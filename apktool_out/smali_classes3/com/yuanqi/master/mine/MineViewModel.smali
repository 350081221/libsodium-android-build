.class public final Lcom/yuanqi/master/mine/MineViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/master/mine/MineViewModel$b;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0007\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010F\u001a\u00020GJ,\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ$\u0010N\u001a\u00020G2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u00142\u000c\u0010R\u001a\u0008\u0012\u0004\u0012\u00020G0MJ\u0016\u0010S\u001a\u00020G2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u0014J\u0014\u0010T\u001a\u00020G2\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ4\u0010U\u001a\u00020G2\u0006\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00142\u0006\u0010X\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ\u001c\u0010Y\u001a\u00020G2\u0006\u0010Z\u001a\u00020\u00042\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ<\u0010[\u001a\u00020G2\u0006\u0010I\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00142\u0006\u0010X\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ,\u0010^\u001a\u00020G2\u0006\u0010]\u001a\u00020\u00142\u0006\u0010X\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ\u001e\u0010_\u001a\u00020G2\u0006\u0010`\u001a\u00020a2\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MH\u0002J,\u0010b\u001a\u00020G2\u0006\u0010O\u001a\u00020c2\u0006\u0010d\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ\u0010\u0010e\u001a\u00020G2\u0006\u0010f\u001a\u00020gH\u0002J\u000e\u0010h\u001a\u00020G2\u0006\u0010O\u001a\u00020PJ$\u0010i\u001a\u00020G2\u0006\u0010j\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ$\u0010k\u001a\u00020G2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ\u0006\u0010l\u001a\u00020GJ\u0006\u0010m\u001a\u00020GJ\u0006\u0010n\u001a\u00020GJ$\u0010o\u001a\u00020G2\u0006\u0010j\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ$\u0010p\u001a\u00020G2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020G0MJ\"\u0010q\u001a\u00020G2\u0006\u0010X\u001a\u00020\u00042\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020G0rJ\u0008\u0010s\u001a\u00020GH\u0002J\u0010\u0010t\u001a\u00020G2\u0006\u0010u\u001a\u00020\u0004H\u0002J\u000e\u0010v\u001a\u00020G2\u0006\u0010w\u001a\u00020\u0004J\u000e\u0010x\u001a\u00020G2\u0006\u0010w\u001a\u00020\u0004J\u000e\u0010y\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u0004J\u000e\u0010z\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004J\u000e\u0010{\u001a\u00020\u00042\u0006\u0010j\u001a\u00020\u0004J\u000e\u0010|\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010}\u001a\u00020\u00042\u0006\u0010~\u001a\u00020\u0004J\u0018\u0010}\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u00042\u0006\u0010\u007f\u001a\u00020\u0014H\u0002J\u000f\u0010\u0080\u0001\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u0004J\u000f\u0010\u0081\u0001\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u0017\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\u0011\u0010,\u001a\u00020-\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R+\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00084\u00105\u001a\u0004\u00082\u0010\u0006\"\u0004\u00083\u0010\u0008R\u0017\u00106\u001a\u0008\u0012\u0004\u0012\u00020807\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0017\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010\u0012R\u0017\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010\u0012R\u0017\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010\u0012R\u0019\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010\u0012R\u0019\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010\u0012\u00a8\u0006\u0083\u0001"
    }
    d2 = {
        "Lcom/yuanqi/master/mine/MineViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "()V",
        "editType",
        "",
        "getEditType",
        "()Ljava/lang/String;",
        "setEditType",
        "(Ljava/lang/String;)V",
        "forgetType",
        "",
        "getForgetType",
        "()I",
        "setForgetType",
        "(I)V",
        "invCode",
        "Landroidx/compose/runtime/MutableState;",
        "getInvCode",
        "()Landroidx/compose/runtime/MutableState;",
        "isHomeToVip",
        "",
        "()Z",
        "setHomeToVip",
        "(Z)V",
        "loginStatus",
        "getLoginStatus",
        "()Ljava/lang/Boolean;",
        "setLoginStatus",
        "(Ljava/lang/Boolean;)V",
        "Ljava/lang/Boolean;",
        "mHandler",
        "Landroid/os/Handler;",
        "getMHandler",
        "()Landroid/os/Handler;",
        "setMHandler",
        "(Landroid/os/Handler;)V",
        "msgApi",
        "Lcom/tencent/mm/opensdk/openapi/IWXAPI;",
        "navHostController",
        "Landroidx/navigation/NavHostController;",
        "getNavHostController",
        "()Landroidx/navigation/NavHostController;",
        "setNavHostController",
        "(Landroidx/navigation/NavHostController;)V",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "getScope",
        "()Lkotlinx/coroutines/CoroutineScope;",
        "<set-?>",
        "shareCodeKey",
        "getShareCodeKey",
        "setShareCodeKey",
        "shareCodeKey$delegate",
        "Lcom/yuanqi/master/tools/MVFast;",
        "shareList",
        "",
        "Lcom/yuanqi/master/network/model/ShareListData;",
        "getShareList",
        "()Ljava/util/List;",
        "showLoadMsg",
        "getShowLoadMsg",
        "showLoading",
        "getShowLoading",
        "showProgress",
        "getShowProgress",
        "vipMonth",
        "Lcom/yuanqi/master/network/model/response/VipMealData;",
        "getVipMonth",
        "vipYear",
        "getVipYear",
        "backAccount",
        "",
        "bulkRegistration",
        "userName",
        "phone",
        "code",
        "action",
        "Lkotlin/Function0;",
        "buyVipByAli",
        "context",
        "Landroid/app/Activity;",
        "isChooseYear",
        "successAction",
        "buyVipByWX",
        "deleteAccount",
        "editPwd",
        "newPwd",
        "userPhone",
        "phoneOrEmail",
        "editUserName",
        "useName",
        "forgetPwd",
        "pwd",
        "usePhone",
        "forgetUname",
        "loginByUserId",
        "userId",
        "",
        "loginPlus",
        "Landroid/content/Context;",
        "account",
        "loginSuccess",
        "result",
        "Lcom/yuanqi/master/network/model/response/EditResponse;",
        "registerIWXAPI",
        "requestChangeEmail",
        "email",
        "requestChangePhone",
        "requestInviteCode",
        "requestShareList",
        "requestVIPMeal",
        "requestValidOldEmail",
        "requestValidOldPhone",
        "sendCodePlus",
        "Lkotlin/Function1;",
        "sendShareCode",
        "setSuccess",
        "token",
        "showMsg",
        "msg",
        "showShort",
        "verifyAccount",
        "verifyCode",
        "verifyEmail",
        "verifyPhone",
        "verifyPhoneOrEmail",
        "input",
        "isPhone",
        "verifyPwd",
        "verifyUname",
        "Companion",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final q:Lcom/yuanqi/master/mine/MineViewModel$b;
    .annotation build Lp4/l;
    .end annotation
.end field

.field static final synthetic r:[Lkotlin/reflect/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/o<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final s:I

.field private static final t:Lkotlin/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/d0<",
            "Lcom/yuanqi/master/mine/MineViewModel;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final a:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private b:Ljava/lang/Boolean;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private c:Z

.field private d:I

.field private e:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final f:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final g:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final h:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final i:Lkotlinx/coroutines/s0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private j:Lcom/tencent/mm/opensdk/openapi/IWXAPI;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private k:Landroid/os/Handler;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final l:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final m:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/yuanqi/master/network/model/response/VipMealData;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final n:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/yuanqi/master/network/model/response/VipMealData;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuanqi/master/network/model/ShareListData;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private p:Landroidx/navigation/NavHostController;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lkotlin/reflect/o;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/x0;

    .line 5
    .line 6
    const-string v2, "shareCodeKey"

    .line 7
    .line 8
    const-string v3, "getShareCodeKey()Ljava/lang/String;"

    .line 9
    .line 10
    const-class v4, Lcom/yuanqi/master/mine/MineViewModel;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/x0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/l1;->k(Lkotlin/jvm/internal/w0;)Lkotlin/reflect/l;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    aput-object v1, v0, v5

    .line 21
    .line 22
    sput-object v0, Lcom/yuanqi/master/mine/MineViewModel;->r:[Lkotlin/reflect/o;

    .line 23
    .line 24
    new-instance v0, Lcom/yuanqi/master/mine/MineViewModel$b;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, v1}, Lcom/yuanqi/master/mine/MineViewModel$b;-><init>(Lkotlin/jvm/internal/w;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/yuanqi/master/mine/MineViewModel;->q:Lcom/yuanqi/master/mine/MineViewModel$b;

    .line 31
    .line 32
    const/16 v0, 0x8

    .line 33
    .line 34
    sput v0, Lcom/yuanqi/master/mine/MineViewModel;->s:I

    .line 35
    .line 36
    sget-object v0, Lkotlin/h0;->SYNCHRONIZED:Lkotlin/h0;

    .line 37
    .line 38
    sget-object v1, Lcom/yuanqi/master/mine/MineViewModel$a;->INSTANCE:Lcom/yuanqi/master/mine/MineViewModel$a;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/e0;->b(Lkotlin/h0;Lv3/a;)Lkotlin/d0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, Lcom/yuanqi/master/mine/MineViewModel;->t:Lkotlin/d0;

    .line 45
    .line 46
    return-void
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/yuanqi/master/tools/x0;

    .line 5
    .line 6
    const-string v1, "share_code_key"

    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->a:Lcom/yuanqi/master/tools/x0;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->d:I

    .line 17
    .line 18
    const-string v0, "1"

    .line 19
    .line 20
    iput-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->e:Ljava/lang/String;

    .line 21
    .line 22
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-static {v0, v1, v3, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 31
    .line 32
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {v0, v1, v3, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->g:Landroidx/compose/runtime/MutableState;

    .line 39
    .line 40
    invoke-static {v2, v1, v3, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 45
    .line 46
    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lkotlinx/coroutines/t0;->a(Lkotlin/coroutines/g;)Lkotlinx/coroutines/s0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->i:Lkotlinx/coroutines/s0;

    .line 55
    .line 56
    invoke-static {v2, v1, v3, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->l:Landroidx/compose/runtime/MutableState;

    .line 61
    .line 62
    invoke-static {v1, v1, v3, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->m:Landroidx/compose/runtime/MutableState;

    .line 67
    .line 68
    invoke-static {v1, v1, v3, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->n:Landroidx/compose/runtime/MutableState;

    .line 73
    .line 74
    new-instance v0, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->o:Ljava/util/List;

    .line 83
    .line 84
    return-void
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/mine/MineViewModel;-><init>()V

    return-void
.end method

.method private final C(JLv3/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 9
    .line 10
    const-string v1, "\u767b\u5f55\u4e2d"

    .line 11
    .line 12
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Lcom/yuanqi/master/network/repository/g;->v(J)Lretrofit2/Call;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance p2, Lcom/yuanqi/master/mine/MineViewModel$u;

    .line 22
    .line 23
    invoke-direct {p2, p0, p3}, Lcom/yuanqi/master/mine/MineViewModel$u;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 24
    .line 25
    .line 26
    new-instance p3, Lcom/yuanqi/master/mine/MineViewModel$v;

    .line 27
    .line 28
    invoke-direct {p3, p0}, Lcom/yuanqi/master/mine/MineViewModel$v;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2, p3}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method private final E(Lcom/yuanqi/master/network/model/response/EditResponse;)V
    .locals 1

    sget-object v0, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/EditResponse;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/yuanqi/master/mine/account/a;->l(Ljava/lang/String;)V

    return-void
.end method

.method private final O()V
    .locals 3

    .line 1
    sget-object v0, Lcom/yuanqi/master/tools/w0;->a:Lcom/yuanqi/master/tools/w0;

    .line 2
    .line 3
    const-string v1, "share_code_key"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/tools/w0;->b(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/yuanqi/master/mine/MineViewModel;->u()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-eqz v0, :cond_2

    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 29
    .line 30
    invoke-direct {p0}, Lcom/yuanqi/master/mine/MineViewModel;->u()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/network/repository/g;->g(Ljava/lang/String;)Lretrofit2/Call;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Lcom/yuanqi/master/mine/MineViewModel$q0;->INSTANCE:Lcom/yuanqi/master/mine/MineViewModel$q0;

    .line 39
    .line 40
    new-instance v2, Lcom/yuanqi/master/mine/MineViewModel$r0;

    .line 41
    .line 42
    invoke-direct {v2, p0}, Lcom/yuanqi/master/mine/MineViewModel$r0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1, v2}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 46
    .line 47
    .line 48
    return-void
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method private final V(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->a:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/MineViewModel;->r:[Lkotlin/reflect/o;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method private final W(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    invoke-virtual {v0, p1}, Lcom/yuanqi/master/mine/account/a;->l(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic a()Lkotlin/d0;
    .locals 1

    sget-object v0, Lcom/yuanqi/master/mine/MineViewModel;->t:Lkotlin/d0;

    return-object v0
.end method

.method public static final synthetic b(Lcom/yuanqi/master/mine/MineViewModel;JLv3/a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/yuanqi/master/mine/MineViewModel;->C(JLv3/a;)V

    return-void
.end method

.method public static final synthetic c(Lcom/yuanqi/master/mine/MineViewModel;Lcom/yuanqi/master/network/model/response/EditResponse;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->E(Lcom/yuanqi/master/network/model/response/EditResponse;)V

    return-void
.end method

.method public static final synthetic d(Lcom/yuanqi/master/mine/MineViewModel;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->W(Ljava/lang/String;)V

    return-void
.end method

.method private final e0(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const-string v1, "getString(...)"

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    const p2, 0x7f120225

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const p2, 0x7f1200f6

    .line 30
    .line 31
    .line 32
    :goto_1
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_2
    const-string v0, ""

    .line 41
    .line 42
    if-eqz p2, :cond_4

    .line 43
    .line 44
    new-instance p2, Lkotlin/text/r;

    .line 45
    .line 46
    const-string v2, "^1[3-9]\\d{9}$"

    .line 47
    .line 48
    invoke-direct {p2, v2}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, p1}, Lkotlin/text/r;->matches(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_3
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const p2, 0x7f120226

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_4
    new-instance p2, Lkotlin/text/r;

    .line 79
    .line 80
    const-string v1, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"

    .line 81
    .line 82
    invoke-direct {p2, v1}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, p1}, Lkotlin/text/r;->matches(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    const p2, 0x7f1200f7

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :goto_2
    return-object v0
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method private final u()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->a:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/MineViewModel;->r:[Lkotlin/reflect/o;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final A()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/yuanqi/master/network/model/response/VipMealData;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->m:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final B()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->c:Z

    return v0
.end method

.method public final D(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lv3/a;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "account"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "code"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "action"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p2}, Lcom/yuanqi/master/mine/MineViewModel;->d0(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    move v1, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v1, v3

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p3}, Lcom/yuanqi/master/mine/MineViewModel;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-lez v1, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v2, v3

    .line 50
    :goto_1
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/yuanqi/master/mine/MineViewModel;->Y(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 57
    .line 58
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 64
    .line 65
    const-string v1, "\u767b\u5f55\u4e2d"

    .line 66
    .line 67
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 71
    .line 72
    new-instance v1, Lcom/yuanqi/master/network/model/request/LoginUserInfoRequest;

    .line 73
    .line 74
    invoke-direct {p0}, Lcom/yuanqi/master/mine/MineViewModel;->u()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-direct {v1, p2, p3, v2}, Lcom/yuanqi/master/network/model/request/LoginUserInfoRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/network/repository/g;->w(Lcom/yuanqi/master/network/model/request/LoginUserInfoRequest;)Lretrofit2/Call;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    new-instance p3, Lcom/yuanqi/master/mine/MineViewModel$w;

    .line 86
    .line 87
    invoke-direct {p3, p0, p1, p4}, Lcom/yuanqi/master/mine/MineViewModel$w;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Landroid/content/Context;Lv3/a;)V

    .line 88
    .line 89
    .line 90
    new-instance p1, Lcom/yuanqi/master/mine/MineViewModel$x;

    .line 91
    .line 92
    invoke-direct {p1, p0}, Lcom/yuanqi/master/mine/MineViewModel$x;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p2, p3, p1}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 96
    .line 97
    .line 98
    return-void
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final F(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-static {p1, v0}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel;->j:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string v0, "wx0abebc768438058b"

    .line 16
    .line 17
    invoke-interface {p1, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final G(Ljava/lang/String;Ljava/lang/String;Lv3/a;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "email"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "code"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "action"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, p1, v0}, Lcom/yuanqi/master/mine/MineViewModel;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    move v2, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v2, v0

    .line 31
    :goto_0
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lcom/yuanqi/master/mine/MineViewModel;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-lez v2, :cond_2

    .line 42
    .line 43
    move v0, v3

    .line 44
    :cond_2
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lcom/yuanqi/master/mine/MineViewModel;->Y(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 51
    .line 52
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 58
    .line 59
    const-string v1, "\u8bf7\u6c42\u4e2d"

    .line 60
    .line 61
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 65
    .line 66
    invoke-virtual {v0, p1, p2}, Lcom/yuanqi/master/network/repository/g;->j(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance p2, Lcom/yuanqi/master/mine/MineViewModel$y;

    .line 71
    .line 72
    invoke-direct {p2, p0, p3}, Lcom/yuanqi/master/mine/MineViewModel$y;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 73
    .line 74
    .line 75
    new-instance p3, Lcom/yuanqi/master/mine/MineViewModel$z;

    .line 76
    .line 77
    invoke-direct {p3, p0}, Lcom/yuanqi/master/mine/MineViewModel$z;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2, p3}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 81
    .line 82
    .line 83
    return-void
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final H(Ljava/lang/String;Ljava/lang/String;Lv3/a;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "phone"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "code"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "action"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p0, p1, v0}, Lcom/yuanqi/master/mine/MineViewModel;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    move v2, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v2, v3

    .line 31
    :goto_0
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lcom/yuanqi/master/mine/MineViewModel;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-lez v2, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v0, v3

    .line 45
    :goto_1
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lcom/yuanqi/master/mine/MineViewModel;->Y(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 52
    .line 53
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 59
    .line 60
    const-string v1, "\u8bf7\u6c42\u4e2d"

    .line 61
    .line 62
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 66
    .line 67
    invoke-virtual {v0, p1, p2}, Lcom/yuanqi/master/network/repository/g;->l(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p2, Lcom/yuanqi/master/mine/MineViewModel$a0;

    .line 72
    .line 73
    invoke-direct {p2, p0, p3}, Lcom/yuanqi/master/mine/MineViewModel$a0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 74
    .line 75
    .line 76
    new-instance p3, Lcom/yuanqi/master/mine/MineViewModel$b0;

    .line 77
    .line 78
    invoke-direct {p3, p0}, Lcom/yuanqi/master/mine/MineViewModel$b0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p2, p3}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 82
    .line 83
    .line 84
    return-void
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final I()V
    .locals 3

    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    invoke-virtual {v0}, Lcom/yuanqi/master/network/repository/g;->r()Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/yuanqi/master/mine/MineViewModel$c0;

    invoke-direct {v1, p0}, Lcom/yuanqi/master/mine/MineViewModel$c0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    new-instance v2, Lcom/yuanqi/master/mine/MineViewModel$d0;

    invoke-direct {v2, p0}, Lcom/yuanqi/master/mine/MineViewModel$d0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    invoke-static {v0, v1, v2}, Lcom/yuanqi/master/tools/f1;->a(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    return-void
.end method

.method public final J()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/yuanqi/master/network/repository/f;->g:Lcom/yuanqi/master/network/repository/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/yuanqi/master/network/repository/f;->j()Lretrofit2/Call;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lcom/yuanqi/master/mine/MineViewModel$e0;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lcom/yuanqi/master/mine/MineViewModel$e0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lcom/yuanqi/master/mine/MineViewModel$f0;

    .line 18
    .line 19
    invoke-direct {v2, p0}, Lcom/yuanqi/master/mine/MineViewModel$f0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public final K()V
    .locals 3

    sget-object v0, Lcom/yuanqi/master/network/repository/h;->g:Lcom/yuanqi/master/network/repository/h;

    invoke-virtual {v0}, Lcom/yuanqi/master/network/repository/h;->i()Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/yuanqi/master/mine/MineViewModel$g0;

    invoke-direct {v1, p0}, Lcom/yuanqi/master/mine/MineViewModel$g0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    new-instance v2, Lcom/yuanqi/master/mine/MineViewModel$h0;

    invoke-direct {v2, p0}, Lcom/yuanqi/master/mine/MineViewModel$h0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    invoke-static {v0, v1, v2}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    return-void
.end method

.method public final L(Ljava/lang/String;Ljava/lang/String;Lv3/a;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "email"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "code"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "action"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, p1, v0}, Lcom/yuanqi/master/mine/MineViewModel;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    move v2, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v2, v0

    .line 31
    :goto_0
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lcom/yuanqi/master/mine/MineViewModel;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-lez v2, :cond_2

    .line 42
    .line 43
    move v0, v3

    .line 44
    :cond_2
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lcom/yuanqi/master/mine/MineViewModel;->Y(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 51
    .line 52
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 58
    .line 59
    const-string v1, "\u8bf7\u6c42\u4e2d"

    .line 60
    .line 61
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 65
    .line 66
    invoke-virtual {v0, p1, p2}, Lcom/yuanqi/master/network/repository/g;->y(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance p2, Lcom/yuanqi/master/mine/MineViewModel$i0;

    .line 71
    .line 72
    invoke-direct {p2, p0, p3}, Lcom/yuanqi/master/mine/MineViewModel$i0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 73
    .line 74
    .line 75
    new-instance p3, Lcom/yuanqi/master/mine/MineViewModel$j0;

    .line 76
    .line 77
    invoke-direct {p3, p0}, Lcom/yuanqi/master/mine/MineViewModel$j0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2, p3}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 81
    .line 82
    .line 83
    return-void
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final M(Ljava/lang/String;Ljava/lang/String;Lv3/a;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "phone"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "code"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "action"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p0, p1, v0}, Lcom/yuanqi/master/mine/MineViewModel;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    move v2, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v2, v3

    .line 31
    :goto_0
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lcom/yuanqi/master/mine/MineViewModel;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-lez v2, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v0, v3

    .line 45
    :goto_1
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lcom/yuanqi/master/mine/MineViewModel;->Y(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 52
    .line 53
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 59
    .line 60
    const-string v1, "\u8bf7\u6c42\u4e2d"

    .line 61
    .line 62
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 66
    .line 67
    invoke-virtual {v0, p1, p2}, Lcom/yuanqi/master/network/repository/g;->z(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p2, Lcom/yuanqi/master/mine/MineViewModel$k0;

    .line 72
    .line 73
    invoke-direct {p2, p0, p3}, Lcom/yuanqi/master/mine/MineViewModel$k0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 74
    .line 75
    .line 76
    new-instance p3, Lcom/yuanqi/master/mine/MineViewModel$l0;

    .line 77
    .line 78
    invoke-direct {p3, p0}, Lcom/yuanqi/master/mine/MineViewModel$l0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p2, p3}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 82
    .line 83
    .line 84
    return-void
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final N(Ljava/lang/String;Lv3/l;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "phoneOrEmail"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "action"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const-string p1, "\u8bf7\u8f93\u5165\u624b\u673a\u53f7\u6216\u90ae\u7bb1"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->Y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 30
    .line 31
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 37
    .line 38
    const-string v2, "\u8bf7\u6c42\u4e2d"

    .line 39
    .line 40
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    const/4 v2, 0x0

    .line 45
    const-string v3, "@"

    .line 46
    .line 47
    invoke-static {p1, v3, v1, v0, v2}, Lkotlin/text/v;->T2(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lcom/yuanqi/master/network/repository/g;->s(Ljava/lang/String;)Lretrofit2/Call;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v0, Lcom/yuanqi/master/mine/MineViewModel$m0;

    .line 60
    .line 61
    invoke-direct {v0, p2, p0}, Lcom/yuanqi/master/mine/MineViewModel$m0;-><init>(Lv3/l;Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Lcom/yuanqi/master/mine/MineViewModel$n0;

    .line 65
    .line 66
    invoke-direct {v1, p0, p2}, Lcom/yuanqi/master/mine/MineViewModel$n0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/l;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v0, v1}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lcom/yuanqi/master/network/repository/g;->t(Ljava/lang/String;)Lretrofit2/Call;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v0, Lcom/yuanqi/master/mine/MineViewModel$o0;

    .line 80
    .line 81
    invoke-direct {v0, p2, p0}, Lcom/yuanqi/master/mine/MineViewModel$o0;-><init>(Lv3/l;Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 82
    .line 83
    .line 84
    new-instance v1, Lcom/yuanqi/master/mine/MineViewModel$p0;

    .line 85
    .line 86
    invoke-direct {v1, p0, p2}, Lcom/yuanqi/master/mine/MineViewModel$p0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/l;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0, v1}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-void
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public final P(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel;->e:Ljava/lang/String;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final Q(I)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/master/mine/MineViewModel;->d:I

    return-void
.end method

.method public final R(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/master/mine/MineViewModel;->c:Z

    return-void
.end method

.method public final S(Ljava/lang/Boolean;)V
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel;->b:Ljava/lang/Boolean;

    return-void
.end method

.method public final T(Landroid/os/Handler;)V
    .locals 0
    .param p1    # Landroid/os/Handler;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel;->k:Landroid/os/Handler;

    return-void
.end method

.method public final U(Landroidx/navigation/NavHostController;)V
    .locals 0
    .param p1    # Landroidx/navigation/NavHostController;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel;->p:Landroidx/navigation/NavHostController;

    return-void
.end method

.method public final X(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "msg"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->g:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 19
    .line 20
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-interface {p1, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/yuanqi/master/mine/MineViewModel;->i:Lkotlinx/coroutines/s0;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    new-instance v4, Lcom/yuanqi/master/mine/MineViewModel$s0;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-direct {v4, p0, p1}, Lcom/yuanqi/master/mine/MineViewModel$s0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lkotlin/coroutines/d;)V

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public final Y(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "msg"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->g:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 19
    .line 20
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-interface {p1, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/yuanqi/master/mine/MineViewModel;->i:Lkotlinx/coroutines/s0;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    new-instance v4, Lcom/yuanqi/master/mine/MineViewModel$t0;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-direct {v4, p0, p1}, Lcom/yuanqi/master/mine/MineViewModel$t0;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lkotlin/coroutines/d;)V

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public final Z(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "account"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const-string p1, "\u624b\u673a\u53f7/\u90ae\u7bb1\u4e0d\u80fd\u4e3a\u7a7a"

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    const-string p1, ""

    .line 21
    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final a0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "code"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const v0, 0x7f1200dc

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "getString(...)"

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    const-string p1, ""

    .line 40
    .line 41
    return-object p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public final b0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "email"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const v0, 0x7f1200f6

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "getString(...)"

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    new-instance v0, Lkotlin/text/r;

    .line 40
    .line 41
    const-string v1, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lkotlin/text/r;->matches(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    const-string p1, ""

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const v0, 0x7f1200f7

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    return-object p1
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public final c0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "phone"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const v0, 0x7f120225

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "getString(...)"

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    new-instance v0, Lkotlin/text/r;

    .line 40
    .line 41
    const-string v1, "^1[3-9]\\d{9}$"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lkotlin/text/r;->matches(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    const-string p1, ""

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const v0, 0x7f120226

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    return-object p1
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public final d0(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "@"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/v;->T2(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    xor-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    invoke-direct {p0, p1, v0}, Lcom/yuanqi/master/mine/MineViewModel;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final e()V
    .locals 9

    .line 1
    sget-object v0, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    .line 2
    .line 3
    sget-object v1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "\u8bf7\u6c42\u4e2d"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lcom/yuanqi/master/tools/o0;->x0(Landroid/app/Activity;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lcom/yuanqi/master/mine/MineViewModel;->i:Lkotlinx/coroutines/s0;

    .line 18
    .line 19
    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x0

    .line 24
    new-instance v6, Lcom/yuanqi/master/mine/MineViewModel$c;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-direct {v6, p0, v0}, Lcom/yuanqi/master/mine/MineViewModel$c;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lkotlin/coroutines/d;)V

    .line 28
    .line 29
    .line 30
    const/4 v7, 0x2

    .line 31
    const/4 v8, 0x0

    .line 32
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv3/a;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "userName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "phone"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "code"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "action"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->g0(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    move v1, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v1, v3

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p3}, Lcom/yuanqi/master/mine/MineViewModel;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-lez v1, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move v2, v3

    .line 50
    :goto_1
    if-eqz v2, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/yuanqi/master/mine/MineViewModel;->Y(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 57
    .line 58
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 64
    .line 65
    const-string v1, "\u8bf7\u6c42\u4e2d"

    .line 66
    .line 67
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 71
    .line 72
    invoke-virtual {v0, p1, p2, p3}, Lcom/yuanqi/master/network/repository/g;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance p2, Lcom/yuanqi/master/mine/MineViewModel$d;

    .line 77
    .line 78
    invoke-direct {p2, p0, p4}, Lcom/yuanqi/master/mine/MineViewModel$d;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 79
    .line 80
    .line 81
    new-instance p3, Lcom/yuanqi/master/mine/MineViewModel$e;

    .line 82
    .line 83
    invoke-direct {p3, p0}, Lcom/yuanqi/master/mine/MineViewModel$e;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1, p2, p3}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 87
    .line 88
    .line 89
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final f0(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "pwd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    const-string v1, "getString(...)"

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const v0, 0x7f120232

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/16 v2, 0x20

    .line 44
    .line 45
    if-le v0, v2, :cond_2

    .line 46
    .line 47
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const v0, 0x7f120233

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_2
    new-instance v0, Lkotlin/text/r;

    .line 68
    .line 69
    const-string v1, "^[a-zA-Z0-9]+$"

    .line 70
    .line 71
    invoke-direct {v0, v1}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1}, Lkotlin/text/r;->matches(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    const-string p1, ""

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    const v0, 0x7f120234

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :goto_1
    return-object p1
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public final g(Landroid/app/Activity;ZLv3/a;)V
    .locals 6
    .param p1    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Z",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "successAction"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/yuanqi/master/mine/MineViewModel$f;

    .line 16
    .line 17
    invoke-direct {v1, p0, p3, v0}, Lcom/yuanqi/master/mine/MineViewModel$f;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lcom/yuanqi/master/mine/MineViewModel;->k:Landroid/os/Handler;

    .line 21
    .line 22
    iget-object p3, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 23
    .line 24
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-interface {p3, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p3, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 30
    .line 31
    const v0, 0x7f120240

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "getString(...)"

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p3, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object p3, Lcom/yuanqi/master/vip/a;->c:Lcom/yuanqi/master/vip/a$b;

    .line 47
    .line 48
    invoke-virtual {p3}, Lcom/yuanqi/master/vip/a$b;->a()Lcom/yuanqi/master/vip/a;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v3, p0, Lcom/yuanqi/master/mine/MineViewModel;->k:Landroid/os/Handler;

    .line 53
    .line 54
    invoke-static {v3}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance v4, Lcom/yuanqi/master/mine/MineViewModel$g;

    .line 58
    .line 59
    invoke-direct {v4, p0}, Lcom/yuanqi/master/mine/MineViewModel$g;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 60
    .line 61
    .line 62
    new-instance v5, Lcom/yuanqi/master/mine/MineViewModel$h;

    .line 63
    .line 64
    invoke-direct {v5, p1, p0}, Lcom/yuanqi/master/mine/MineViewModel$h;-><init>(Landroid/app/Activity;Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 65
    .line 66
    .line 67
    move-object v1, p1

    .line 68
    move v2, p2

    .line 69
    invoke-virtual/range {v0 .. v5}, Lcom/yuanqi/master/vip/a;->f(Landroid/app/Activity;ZLandroid/os/Handler;Lv3/a;Lv3/l;)V

    .line 70
    .line 71
    .line 72
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final g0(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "userName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    const-string v1, "getString(...)"

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const v0, 0x7f1202b5

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    new-instance v0, Lkotlin/text/r;

    .line 40
    .line 41
    const-string v2, "^[a-zA-Z0-9]+$"

    .line 42
    .line 43
    invoke-direct {v0, v2}, Lkotlin/text/r;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lkotlin/text/r;->matches(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const v0, 0x7f1202b6

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v2, 0x5

    .line 77
    if-lt v0, v2, :cond_4

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    const/16 v0, 0xc

    .line 84
    .line 85
    if-le p1, v0, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const-string p1, ""

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_4
    :goto_1
    sget-object p1, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    const v0, 0x7f1202b7

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object p1
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
.end method

.method public final h(Landroid/app/Activity;Z)V
    .locals 7
    .param p1    # Landroid/app/Activity;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 14
    .line 15
    const v1, 0x7f120240

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "getString(...)"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lcom/yuanqi/master/vip/a;->c:Lcom/yuanqi/master/vip/a$b;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/yuanqi/master/vip/a$b;->a()Lcom/yuanqi/master/vip/a;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v4, p0, Lcom/yuanqi/master/mine/MineViewModel;->j:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 37
    .line 38
    invoke-static {v4}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v5, Lcom/yuanqi/master/mine/MineViewModel$i;

    .line 42
    .line 43
    invoke-direct {v5, p0}, Lcom/yuanqi/master/mine/MineViewModel$i;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 44
    .line 45
    .line 46
    new-instance v6, Lcom/yuanqi/master/mine/MineViewModel$j;

    .line 47
    .line 48
    invoke-direct {v6, p1, p0}, Lcom/yuanqi/master/mine/MineViewModel$j;-><init>(Landroid/app/Activity;Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 49
    .line 50
    .line 51
    move-object v2, p1

    .line 52
    move v3, p2

    .line 53
    invoke-virtual/range {v1 .. v6}, Lcom/yuanqi/master/vip/a;->g(Landroid/app/Activity;ZLcom/tencent/mm/opensdk/openapi/IWXAPI;Lv3/a;Lv3/l;)V

    .line 54
    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public final i(Lv3/a;)V
    .locals 2
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 14
    .line 15
    const-string v1, "\u8bf7\u6c42\u4e2d"

    .line 16
    .line 17
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/yuanqi/master/network/repository/g;->m()Lretrofit2/Call;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lcom/yuanqi/master/mine/MineViewModel$k;

    .line 27
    .line 28
    invoke-direct {v1, p0, p1}, Lcom/yuanqi/master/mine/MineViewModel$k;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lcom/yuanqi/master/mine/MineViewModel$l;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lcom/yuanqi/master/mine/MineViewModel$l;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1, p1}, Lcom/yuanqi/master/tools/f1;->a(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
.end method

.method public final j(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lv3/a;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "newPwd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "phoneOrEmail"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "code"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "action"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->f0(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    move v1, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v1, v3

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-direct {p0, p3, p2}, Lcom/yuanqi/master/mine/MineViewModel;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_2

    .line 47
    .line 48
    move v1, v2

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v1, v3

    .line 51
    :goto_1
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0, p4}, Lcom/yuanqi/master/mine/MineViewModel;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-lez v1, :cond_4

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    move v2, v3

    .line 65
    :goto_2
    if-eqz v2, :cond_5

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_5
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 72
    .line 73
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 79
    .line 80
    const-string v1, "\u8bf7\u6c42\u4e2d"

    .line 81
    .line 82
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 86
    .line 87
    const-string v1, ""

    .line 88
    .line 89
    if-eqz p2, :cond_6

    .line 90
    .line 91
    move-object v2, p3

    .line 92
    goto :goto_3

    .line 93
    :cond_6
    move-object v2, v1

    .line 94
    :goto_3
    if-nez p2, :cond_7

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_7
    move-object p3, v1

    .line 98
    :goto_4
    invoke-virtual {v0, p1, p4, v2, p3}, Lcom/yuanqi/master/network/repository/g;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance p2, Lcom/yuanqi/master/mine/MineViewModel$m;

    .line 103
    .line 104
    invoke-direct {p2, p0, p5}, Lcom/yuanqi/master/mine/MineViewModel$m;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 105
    .line 106
    .line 107
    new-instance p3, Lcom/yuanqi/master/mine/MineViewModel$n;

    .line 108
    .line 109
    invoke-direct {p3, p0}, Lcom/yuanqi/master/mine/MineViewModel$n;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1, p2, p3}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 113
    .line 114
    .line 115
    return-void
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
.end method

.method public final k(Ljava/lang/String;Lv3/a;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "useName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "action"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->g0(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-lez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/yuanqi/master/mine/MineViewModel;->Y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/yuanqi/master/mine/account/a;->b()Landroidx/compose/runtime/MutableState;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast v0, Lcom/yuanqi/master/network/model/UserInfoData;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->getUserName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    const-string p1, "\u7528\u6237\u540d\u4e0d\u80fd\u548c\u4fee\u6539\u524d\u76f8\u540c"

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->Y(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 62
    .line 63
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 69
    .line 70
    const-string v1, "\u8bf7\u6c42\u4e2d"

    .line 71
    .line 72
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Lcom/yuanqi/master/network/repository/g;->k(Ljava/lang/String;)Lretrofit2/Call;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v0, Lcom/yuanqi/master/mine/MineViewModel$o;

    .line 82
    .line 83
    invoke-direct {v0, p0, p2}, Lcom/yuanqi/master/mine/MineViewModel$o;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 84
    .line 85
    .line 86
    new-instance p2, Lcom/yuanqi/master/mine/MineViewModel$p;

    .line 87
    .line 88
    invoke-direct {p2, p0}, Lcom/yuanqi/master/mine/MineViewModel$p;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v0, p2}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 92
    .line 93
    .line 94
    return-void
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lv3/a;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p6    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "userName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pwd"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "phoneOrEmail"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "code"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "action"

    .line 22
    .line 23
    invoke-static {p6, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->g0(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x1

    .line 35
    const/4 v3, 0x0

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    move v1, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v1, v3

    .line 41
    :goto_0
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, p2}, Lcom/yuanqi/master/mine/MineViewModel;->f0(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    move v1, v2

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v1, v3

    .line 56
    :goto_1
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-direct {p0, p4, p3}, Lcom/yuanqi/master/mine/MineViewModel;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :cond_3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_4

    .line 67
    .line 68
    move v1, v2

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    move v1, v3

    .line 71
    :goto_2
    if-eqz v1, :cond_5

    .line 72
    .line 73
    invoke-virtual {p0, p5}, Lcom/yuanqi/master/mine/MineViewModel;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :cond_5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-lez v1, :cond_6

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_6
    move v2, v3

    .line 85
    :goto_3
    if-eqz v2, :cond_7

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_7
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 92
    .line 93
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 99
    .line 100
    const-string v1, "\u8bf7\u6c42\u4e2d"

    .line 101
    .line 102
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object v2, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 106
    .line 107
    const-string v0, ""

    .line 108
    .line 109
    if-eqz p3, :cond_8

    .line 110
    .line 111
    move-object v6, p4

    .line 112
    goto :goto_4

    .line 113
    :cond_8
    move-object v6, v0

    .line 114
    :goto_4
    if-nez p3, :cond_9

    .line 115
    .line 116
    move-object v7, p4

    .line 117
    goto :goto_5

    .line 118
    :cond_9
    move-object v7, v0

    .line 119
    :goto_5
    move-object v3, p1

    .line 120
    move-object v4, p2

    .line 121
    move-object v5, p5

    .line 122
    invoke-virtual/range {v2 .. v7}, Lcom/yuanqi/master/network/repository/g;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance p2, Lcom/yuanqi/master/mine/MineViewModel$q;

    .line 127
    .line 128
    invoke-direct {p2, p0, p6}, Lcom/yuanqi/master/mine/MineViewModel$q;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 129
    .line 130
    .line 131
    new-instance p3, Lcom/yuanqi/master/mine/MineViewModel$r;

    .line 132
    .line 133
    invoke-direct {p3, p0}, Lcom/yuanqi/master/mine/MineViewModel$r;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1, p2, p3}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 137
    .line 138
    .line 139
    return-void
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
.end method

.method public final m(ZLjava/lang/String;Ljava/lang/String;Lv3/a;)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "phoneOrEmail"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "code"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "action"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p2, p1}, Lcom/yuanqi/master/mine/MineViewModel;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v3, 0x0

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    move v1, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v1, v3

    .line 31
    :goto_0
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, p3}, Lcom/yuanqi/master/mine/MineViewModel;->a0(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-lez v1, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v2, v3

    .line 45
    :goto_1
    if-eqz v2, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    .line 52
    .line 53
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    .line 59
    .line 60
    const-string v1, "\u8bf7\u6c42\u4e2d"

    .line 61
    .line 62
    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lcom/yuanqi/master/network/repository/g;->g:Lcom/yuanqi/master/network/repository/g;

    .line 66
    .line 67
    const-string v1, ""

    .line 68
    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    move-object v2, p2

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move-object v2, v1

    .line 74
    :goto_2
    if-nez p1, :cond_5

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    move-object p2, v1

    .line 78
    :goto_3
    invoke-virtual {v0, p3, v2, p2}, Lcom/yuanqi/master/network/repository/g;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance p2, Lcom/yuanqi/master/mine/MineViewModel$s;

    .line 83
    .line 84
    invoke-direct {p2, p0, p4}, Lcom/yuanqi/master/mine/MineViewModel$s;-><init>(Lcom/yuanqi/master/mine/MineViewModel;Lv3/a;)V

    .line 85
    .line 86
    .line 87
    new-instance p3, Lcom/yuanqi/master/mine/MineViewModel$t;

    .line 88
    .line 89
    invoke-direct {p3, p0}, Lcom/yuanqi/master/mine/MineViewModel$t;-><init>(Lcom/yuanqi/master/mine/MineViewModel;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1, p2, p3}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 93
    .line 94
    .line 95
    return-void
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method public final n()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->d:I

    return v0
.end method

.method public final p()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->l:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final q()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->b:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final r()Landroid/os/Handler;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->k:Landroid/os/Handler;

    return-object v0
.end method

.method public final s()Landroidx/navigation/NavHostController;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->p:Landroidx/navigation/NavHostController;

    return-object v0
.end method

.method public final t()Lkotlinx/coroutines/s0;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->i:Lkotlinx/coroutines/s0;

    return-object v0
.end method

.method public final v()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yuanqi/master/network/model/ShareListData;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->o:Ljava/util/List;

    return-object v0
.end method

.method public final w()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->h:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final x()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->f:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final y()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->g:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final z()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/yuanqi/master/network/model/response/VipMealData;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel;->n:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method
