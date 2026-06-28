.class public Lcom/yuanqi/master/mine/ad/AdViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;
.implements Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010)\u001a\u00020*H\u0002J\u0008\u0010+\u001a\u00020*H\u0002J\u0008\u0010,\u001a\u00020*H\u0016J\u0008\u0010-\u001a\u00020*H\u0016J\u0008\u0010.\u001a\u00020*H\u0016J\u001a\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u00102\u0008\u00101\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\u000c2\u0006\u00104\u001a\u00020\u00102\u0008\u00105\u001a\u0004\u0018\u000106H\u0016J4\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\u000c2\u0006\u00109\u001a\u00020\u00102\u0008\u0010:\u001a\u0004\u0018\u00010\u00062\u0006\u0010;\u001a\u00020\u00102\u0008\u0010<\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010=\u001a\u00020*2\u0008\u0010>\u001a\u0004\u0018\u00010!H\u0016J\u0008\u0010?\u001a\u00020*H\u0017J\u0012\u0010?\u001a\u00020*2\u0008\u0010>\u001a\u0004\u0018\u00010!H\u0016J\u0008\u0010@\u001a\u00020*H\u0016J\u0008\u0010A\u001a\u00020*H\u0016J\u0008\u0010B\u001a\u00020*H\u0016J\u0008\u0010C\u001a\u00020*H\u0002J\u0012\u0010D\u001a\u00020*2\u0008\u0008\u0002\u00101\u001a\u00020\u0006H\u0002J\u0008\u0010E\u001a\u00020*H\u0002J\u0006\u0010F\u001a\u00020*J\u0016\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u0017\u001a\u0004\u0008\u0019\u0010\u0013\"\u0004\u0008\u001a\u0010\u0015R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\"8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008(\u0010\u0017\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'\u00a8\u0006K"
    }
    d2 = {
        "Lcom/yuanqi/master/mine/ad/AdViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;",
        "Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;",
        "()V",
        "TAG",
        "",
        "adRewardSlot",
        "Lcom/bytedance/sdk/openadsdk/AdSlot;",
        "mContext",
        "Landroid/app/Activity;",
        "mIsRewardValid",
        "",
        "mScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "<set-?>",
        "",
        "showAdNum",
        "getShowAdNum",
        "()I",
        "setShowAdNum",
        "(I)V",
        "showAdNum$delegate",
        "Lcom/yuanqi/master/tools/MVFast;",
        "showAdNumNoLogin",
        "getShowAdNumNoLogin",
        "setShowAdNumNoLogin",
        "showAdNumNoLogin$delegate",
        "ttAdManager",
        "Lcom/bytedance/sdk/openadsdk/TTAdManager;",
        "ttAdNative",
        "Lcom/bytedance/sdk/openadsdk/TTAdNative;",
        "ttRewardVideoAd",
        "Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;",
        "",
        "vipTimeNoLogin",
        "getVipTimeNoLogin",
        "()J",
        "setVipTimeNoLogin",
        "(J)V",
        "vipTimeNoLogin$delegate",
        "dismissProgress",
        "",
        "giveVip",
        "onAdClose",
        "onAdShow",
        "onAdVideoBarClick",
        "onError",
        "code",
        "msg",
        "onRewardArrived",
        "isRewardValid",
        "rewardType",
        "extraInfo",
        "Landroid/os/Bundle;",
        "onRewardVerify",
        "p0",
        "p1",
        "p2",
        "p3",
        "p4",
        "onRewardVideoAdLoad",
        "ad",
        "onRewardVideoCached",
        "onSkippedVideo",
        "onVideoComplete",
        "onVideoError",
        "showAdTipsDialog",
        "showProgress",
        "showRewardAd",
        "showTwoAds",
        "showVipTips",
        "context",
        "Landroid/content/Context;",
        "tipType",
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
.field static final synthetic l:[Lkotlin/reflect/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/o<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final m:I


# instance fields
.field private final a:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final b:Lcom/bytedance/sdk/openadsdk/TTAdManager;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private c:Lcom/bytedance/sdk/openadsdk/TTAdNative;

.field private d:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field private e:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final f:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final g:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final h:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private i:Z

.field private j:Lkotlinx/coroutines/s0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private k:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Lkotlin/reflect/o;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/x0;

    .line 5
    .line 6
    const-string v2, "showAdNum"

    .line 7
    .line 8
    const-string v3, "getShowAdNum()I"

    .line 9
    .line 10
    const-class v4, Lcom/yuanqi/master/mine/ad/AdViewModel;

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
    new-instance v1, Lkotlin/jvm/internal/x0;

    .line 23
    .line 24
    const-string v2, "showAdNumNoLogin"

    .line 25
    .line 26
    const-string v3, "getShowAdNumNoLogin()I"

    .line 27
    .line 28
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/x0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lkotlin/jvm/internal/l1;->k(Lkotlin/jvm/internal/w0;)Lkotlin/reflect/l;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x1

    .line 36
    aput-object v1, v0, v2

    .line 37
    .line 38
    new-instance v1, Lkotlin/jvm/internal/x0;

    .line 39
    .line 40
    const-string v2, "vipTimeNoLogin"

    .line 41
    .line 42
    const-string v3, "getVipTimeNoLogin()J"

    .line 43
    .line 44
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/x0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lkotlin/jvm/internal/l1;->k(Lkotlin/jvm/internal/w0;)Lkotlin/reflect/l;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x2

    .line 52
    aput-object v1, v0, v2

    .line 53
    .line 54
    sput-object v0, Lcom/yuanqi/master/mine/ad/AdViewModel;->l:[Lkotlin/reflect/o;

    .line 55
    .line 56
    const/16 v0, 0x8

    .line 57
    .line 58
    sput v0, Lcom/yuanqi/master/mine/ad/AdViewModel;->m:I

    .line 59
    .line 60
    return-void
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

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "AdViewModel"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getAdManager(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->b:Lcom/bytedance/sdk/openadsdk/TTAdManager;

    .line 18
    .line 19
    new-instance v0, Lcom/yuanqi/master/tools/x0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "showADNum"

    .line 27
    .line 28
    invoke-direct {v0, v2, v1}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->f:Lcom/yuanqi/master/tools/x0;

    .line 32
    .line 33
    new-instance v0, Lcom/yuanqi/master/tools/x0;

    .line 34
    .line 35
    const-string v2, "showADNumNoLogin"

    .line 36
    .line 37
    invoke-direct {v0, v2, v1}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->g:Lcom/yuanqi/master/tools/x0;

    .line 41
    .line 42
    new-instance v0, Lcom/yuanqi/master/tools/x0;

    .line 43
    .line 44
    const-wide/16 v1, 0x0

    .line 45
    .line 46
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "showADVipTimeNoLogin"

    .line 51
    .line 52
    invoke-direct {v0, v2, v1}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->h:Lcom/yuanqi/master/tools/x0;

    .line 56
    .line 57
    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lkotlinx/coroutines/t0;->a(Lkotlin/coroutines/g;)Lkotlinx/coroutines/s0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->j:Lkotlinx/coroutines/s0;

    .line 66
    .line 67
    return-void
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

.method public static final synthetic a(Lcom/yuanqi/master/mine/ad/AdViewModel;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->f()V

    return-void
.end method

.method public static final synthetic b(Lcom/yuanqi/master/mine/ad/AdViewModel;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->k:Landroid/app/Activity;

    return-object p0
.end method

.method public static final synthetic c(Lcom/yuanqi/master/mine/ad/AdViewModel;)Lkotlinx/coroutines/s0;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->j:Lkotlinx/coroutines/s0;

    return-object p0
.end method

.method public static final synthetic d(Lcom/yuanqi/master/mine/ad/AdViewModel;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/yuanqi/master/mine/ad/AdViewModel;->k(I)V

    return-void
.end method

.method public static final synthetic e(Lcom/yuanqi/master/mine/ad/AdViewModel;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->q()V

    return-void
.end method

.method private final f()V
    .locals 1

    sget-object v0, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    invoke-virtual {v0}, Lcom/yuanqi/master/tools/o0;->K()V

    return-void
.end method

.method private final g()I
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->f:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/ad/AdViewModel;->l:[Lkotlin/reflect/o;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private final h()I
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->g:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/ad/AdViewModel;->l:[Lkotlin/reflect/o;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private final i()J
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->h:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/ad/AdViewModel;->l:[Lkotlin/reflect/o;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private final j()V
    .locals 4

    .line 1
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/yuanqi/master/mine/account/a;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "\u6b63\u5728\u8d60\u9001VIP..."

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->o(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lcom/yuanqi/master/network/repository/h;->g:Lcom/yuanqi/master/network/repository/h;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/yuanqi/master/network/repository/h;->j()Lretrofit2/Call;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lcom/yuanqi/master/mine/ad/AdViewModel$a;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/yuanqi/master/mine/ad/AdViewModel$a;-><init>(Lcom/yuanqi/master/mine/ad/AdViewModel;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lcom/yuanqi/master/mine/ad/AdViewModel$b;

    .line 26
    .line 27
    invoke-direct {v2, p0}, Lcom/yuanqi/master/mine/ad/AdViewModel$b;-><init>(Lcom/yuanqi/master/mine/ad/AdViewModel;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lcom/yuanqi/master/tools/f1;->b(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    const v2, 0x5265c00

    .line 39
    .line 40
    .line 41
    int-to-long v2, v2

    .line 42
    add-long/2addr v0, v2

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-direct {p0, v2}, Lcom/yuanqi/master/mine/ad/AdViewModel;->l(I)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v0, v1}, Lcom/yuanqi/master/mine/ad/AdViewModel;->m(J)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x2

    .line 51
    const/4 v1, 0x0

    .line 52
    const-string v3, "\u5df2\u83b7\u53d6VIP\u5956\u52b1"

    .line 53
    .line 54
    invoke-static {v3, v2, v0, v1}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-void
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

.method private final k(I)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->f:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/ad/AdViewModel;->l:[Lkotlin/reflect/o;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method private final l(I)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->g:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/ad/AdViewModel;->l:[Lkotlin/reflect/o;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method private final m(J)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->h:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/master/mine/ad/AdViewModel;->l:[Lkotlin/reflect/o;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method private final n()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/yuanqi/master/mine/account/a;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct/range {p0 .. p0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->g()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->h()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    sget-object v2, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    .line 21
    .line 22
    iget-object v3, v0, Lcom/yuanqi/master/mine/ad/AdViewModel;->k:Landroid/app/Activity;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const-string v5, "mContext"

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    invoke-static {v5}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    move-object v3, v4

    .line 33
    :cond_1
    iget-object v6, v0, Lcom/yuanqi/master/mine/ad/AdViewModel;->k:Landroid/app/Activity;

    .line 34
    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    invoke-static {v5}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object v6, v4

    .line 41
    :cond_2
    const v7, 0x7f1202cb

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const-string v7, "getString(...)"

    .line 49
    .line 50
    invoke-static {v6, v7}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v8, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v9, "\u4eca\u65e5\u5df2\u770b "

    .line 59
    .line 60
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v9, " \u4e2a\u5e7f\u544a\uff0c\u518d\u770b "

    .line 67
    .line 68
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    rsub-int/lit8 v1, v1, 0x2

    .line 72
    .line 73
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, " \u4e2a\u5e7f\u544a\u53ef\u83b7\u53d6\u4e00\u5929VIP\u3002"

    .line 77
    .line 78
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-object v8, v0, Lcom/yuanqi/master/mine/ad/AdViewModel;->k:Landroid/app/Activity;

    .line 86
    .line 87
    if-nez v8, :cond_3

    .line 88
    .line 89
    invoke-static {v5}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    move-object v4, v8

    .line 94
    :goto_1
    const v5, 0x7f1200cc

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-static {v8, v7}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string v7, "\u4e0b\u4e00\u4e2a"

    .line 105
    .line 106
    const/4 v9, 0x0

    .line 107
    const/4 v10, 0x0

    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    new-instance v5, Lcom/yuanqi/master/mine/ad/AdViewModel$c;

    .line 114
    .line 115
    invoke-direct {v5, v0}, Lcom/yuanqi/master/mine/ad/AdViewModel$c;-><init>(Lcom/yuanqi/master/mine/ad/AdViewModel;)V

    .line 116
    .line 117
    .line 118
    const/16 v16, 0xfe0

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    move-object v4, v6

    .line 123
    move-object/from16 v18, v5

    .line 124
    .line 125
    move-object v5, v1

    .line 126
    move-object v6, v8

    .line 127
    move v8, v9

    .line 128
    move v9, v10

    .line 129
    move v10, v11

    .line 130
    move v11, v12

    .line 131
    move-object v12, v13

    .line 132
    move-object v13, v14

    .line 133
    move-object v14, v15

    .line 134
    move-object/from16 v15, v18

    .line 135
    .line 136
    invoke-static/range {v2 .. v17}, Lcom/yuanqi/master/tools/o0;->Y(Lcom/yuanqi/master/tools/o0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLv3/a;Lv3/a;Lv3/a;Lv3/a;ILjava/lang/Object;)V

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
.end method

.method private final o(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    iget-object v1, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->k:Landroid/app/Activity;

    if-nez v1, :cond_0

    const-string v1, "mContext"

    invoke-static {v1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lcom/yuanqi/master/tools/o0;->x0(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic p(Lcom/yuanqi/master/mine/ad/AdViewModel;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_2

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->k:Landroid/app/Activity;

    if-nez p1, :cond_0

    const-string p1, "mContext"

    invoke-static {p1}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    const p2, 0x7f12022d

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0, p1}, Lcom/yuanqi/master/mine/ad/AdViewModel;->o(Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showProgress"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final q()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, v1, v0, v1}, Lcom/yuanqi/master/mine/ad/AdViewModel;->p(Lcom/yuanqi/master/mine/ad/AdViewModel;Ljava/lang/String;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->i:Z

    .line 8
    .line 9
    new-instance v0, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "957364666"

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setCodeId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v2, Lcom/bytedance/sdk/openadsdk/TTAdLoadType;->LOAD:Lcom/bytedance/sdk/openadsdk/TTAdLoadType;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setAdLoadType(Lcom/bytedance/sdk/openadsdk/TTAdLoadType;)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->build()Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v2, "build(...)"

    .line 31
    .line 32
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->d:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->c:Lcom/bytedance/sdk/openadsdk/TTAdNative;

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    const-string v0, "ttAdNative"

    .line 42
    .line 43
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :cond_0
    iget-object v2, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->d:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    const-string v2, "adRewardSlot"

    .line 52
    .line 53
    invoke-static {v2}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-object v1, v2

    .line 58
    :goto_0
    invoke-interface {v0, v1, p0}, Lcom/bytedance/sdk/openadsdk/TTAdNative;->loadRewardVideoAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;)V

    .line 59
    .line 60
    .line 61
    return-void
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


# virtual methods
.method public onAdClose()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->g()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->h()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-direct {p0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->j()V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
    .line 22
    .line 23
.end method

.method public onAdShow()V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->a:Ljava/lang/String;

    const-string v1, "onAdShow"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onAdVideoBarClick()V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->a:Ljava/lang/String;

    const-string v1, "onAdVideoBarClick"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->a:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "onError: code = "

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, " msg = "

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

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

.method public onRewardArrived(ZILandroid/os/Bundle;)V
    .locals 0
    .param p3    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param

    return-void
.end method

.method public onRewardVerify(ZILjava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->a:Ljava/lang/String;

    const-string p2, "onRewardVerify"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onRewardVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)V
    .locals 1
    .param p1    # Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->a:Ljava/lang/String;

    const-string v0, "onRewardVideoAdLoad"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onRewardVideoCached()V
    .locals 2
    .annotation runtime Lkotlin/k;
        message = "Deprecated in Java"
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->a:Ljava/lang/String;

    const-string v1, "onRewardVideoCached"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onRewardVideoCached(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)V
    .locals 1
    .param p1    # Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->f()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 4
    :goto_0
    iput-object p1, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->e:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    if-eqz p1, :cond_0

    .line 5
    invoke-interface {p1, p0}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->setRewardAdInteractionListener(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;)V

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->e:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->k:Landroid/app/Activity;

    if-nez v0, :cond_1

    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->showRewardVideoAd(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public onSkippedVideo()V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->a:Ljava/lang/String;

    const-string v1, "onSkippedVideo"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onVideoComplete()V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->a:Ljava/lang/String;

    const-string v1, "onVideoComplete"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onVideoError()V
    .locals 2

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->a:Ljava/lang/String;

    const-string v1, "onVideoError"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final r()V
    .locals 6

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel;->j:Lkotlinx/coroutines/s0;

    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/yuanqi/master/mine/ad/AdViewModel$d;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/yuanqi/master/mine/ad/AdViewModel$d;-><init>(Lcom/yuanqi/master/mine/ad/AdViewModel;Lkotlin/coroutines/d;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method

.method public final s(Landroid/content/Context;I)V
    .locals 18
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    const-string v2, "context"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const v3, 0x7f12001f

    .line 12
    .line 13
    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const v0, 0x7f120020

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    move-object v3, v0

    .line 37
    invoke-static {v3}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    .line 41
    .line 42
    const v2, 0x7f1202cb

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v4, "getString(...)"

    .line 50
    .line 51
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const v5, 0x7f12013e

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-static {v5, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const v6, 0x7f12001e

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    new-instance v12, Lcom/yuanqi/master/mine/ad/AdViewModel$e;

    .line 80
    .line 81
    move-object/from16 v15, p0

    .line 82
    .line 83
    invoke-direct {v12, v15}, Lcom/yuanqi/master/mine/ad/AdViewModel$e;-><init>(Lcom/yuanqi/master/mine/ad/AdViewModel;)V

    .line 84
    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    new-instance v14, Lcom/yuanqi/master/mine/ad/AdViewModel$f;

    .line 88
    .line 89
    invoke-direct {v14, v1}, Lcom/yuanqi/master/mine/ad/AdViewModel$f;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    const/16 v16, 0xbe0

    .line 93
    .line 94
    const/16 v17, 0x0

    .line 95
    .line 96
    move-object/from16 v1, p1

    .line 97
    .line 98
    move-object v4, v5

    .line 99
    move-object v5, v6

    .line 100
    move v6, v7

    .line 101
    move v7, v8

    .line 102
    move v8, v9

    .line 103
    move v9, v10

    .line 104
    move-object v10, v11

    .line 105
    move-object v11, v12

    .line 106
    move-object v12, v13

    .line 107
    move-object v13, v14

    .line 108
    move/from16 v14, v16

    .line 109
    .line 110
    move-object/from16 v15, v17

    .line 111
    .line 112
    invoke-static/range {v0 .. v15}, Lcom/yuanqi/master/tools/o0;->Y(Lcom/yuanqi/master/tools/o0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLv3/a;Lv3/a;Lv3/a;Lv3/a;ILjava/lang/Object;)V

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
.end method
