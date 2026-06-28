.class public final Lcom/yuanqi/group/home/HomeViewModel;
.super Lcom/yuanqi/master/BaseViewModel;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;
.implements Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/group/home/HomeViewModel$b;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u009b\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010^\u001a\u00020_J\u0010\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020\nH\u0002J\u0010\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010d\u001a\u00020eJ\u000e\u0010f\u001a\u00020_2\u0006\u0010g\u001a\u00020;J\u0008\u0010h\u001a\u00020_H\u0002J\u0010\u0010i\u001a\u00020_2\u0008\u0008\u0002\u0010j\u001a\u00020\u001eJ\u0008\u0010k\u001a\u00020_H\u0002J\u0006\u0010l\u001a\u00020\nJ\u000e\u0010m\u001a\u00020_2\u0006\u0010n\u001a\u00020oJ\u000e\u0010p\u001a\u00020_2\u0006\u0010n\u001a\u00020oJ\u0006\u0010q\u001a\u00020_J\u0016\u0010r\u001a\u00020_2\u0006\u0010n\u001a\u00020#2\u0006\u0010s\u001a\u00020\nJ\u0008\u0010t\u001a\u00020_H\u0016J\u0008\u0010u\u001a\u00020_H\u0016J\u0008\u0010v\u001a\u00020_H\u0016J\u001a\u0010w\u001a\u00020_2\u0006\u0010x\u001a\u00020\n2\u0008\u0010y\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010z\u001a\u00020_2\u0006\u0010{\u001a\u00020\u001e2\u0006\u0010|\u001a\u00020\n2\u0008\u0010}\u001a\u0004\u0018\u00010~H\u0016J9\u0010\u007f\u001a\u00020_2\u0007\u0010\u0080\u0001\u001a\u00020\u001e2\u0007\u0010\u0081\u0001\u001a\u00020\n2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00062\u0007\u0010\u0083\u0001\u001a\u00020\n2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\u0085\u0001\u001a\u00020_2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010TH\u0016J\t\u0010\u0086\u0001\u001a\u00020_H\u0016J\u0014\u0010\u0086\u0001\u001a\u00020_2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010TH\u0016J\t\u0010\u0088\u0001\u001a\u00020_H\u0016J\t\u0010\u0089\u0001\u001a\u00020_H\u0016J\t\u0010\u008a\u0001\u001a\u00020_H\u0016J1\u0010\u008b\u0001\u001a\u00020_2\u0007\u0010\u008c\u0001\u001a\u00020\u00062\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0016\u0010\u008e\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020_0\u008f\u0001J\u0010\u0010\u0090\u0001\u001a\u00020_2\u0007\u0010\u0091\u0001\u001a\u00020\nJ\u0019\u0010\u0092\u0001\u001a\u00020_2\u0006\u0010n\u001a\u00020o2\u0008\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\t\u0010\u0095\u0001\u001a\u00020_H\u0002J\u0013\u0010\u0096\u0001\u001a\u00020_2\u0008\u0008\u0002\u0010y\u001a\u00020\u0006H\u0002J*\u0010\u0097\u0001\u001a\u00020_2\u0006\u0010n\u001a\u00020o2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00020_0\u009a\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR+\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0011\u0010\u000c\"\u0004\u0008\u0012\u0010\u000eR&\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001aR\u0017\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001aR\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u000e\u0010(\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\u001a\u0010.\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u0010+\"\u0004\u00080\u0010-R\u0017\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010\u001aR\u001a\u00103\u001a\u000204X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R\u001d\u00109\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020;0:0\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010\u001aR+\u0010=\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008@\u0010\u0014\u001a\u0004\u0008>\u0010\u000c\"\u0004\u0008?\u0010\u000eR+\u0010A\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008D\u0010\u0014\u001a\u0004\u0008B\u0010\u000c\"\u0004\u0008C\u0010\u000eR+\u0010E\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008H\u0010\u0014\u001a\u0004\u0008F\u0010\u000c\"\u0004\u0008G\u0010\u000eR\u0017\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010\u001aR\u0010\u0010K\u001a\u0004\u0018\u00010LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010N\u001a\n P*\u0004\u0018\u00010O0OX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010S\u001a\u0004\u0018\u00010TX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010X\u001a\u00020W2\u0006\u0010\u000f\u001a\u00020W8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008]\u0010\u0014\u001a\u0004\u0008Y\u0010Z\"\u0004\u0008[\u0010\\\u00a8\u0006\u009c\u0001"
    }
    d2 = {
        "Lcom/yuanqi/group/home/HomeViewModel;",
        "Lcom/yuanqi/master/BaseViewModel;",
        "Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;",
        "Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;",
        "()V",
        "TAG",
        "",
        "adSlotFive",
        "Lcom/bytedance/sdk/openadsdk/AdSlot;",
        "appIndex",
        "",
        "getAppIndex",
        "()I",
        "setAppIndex",
        "(I)V",
        "<set-?>",
        "appMode",
        "getAppMode",
        "setAppMode",
        "appMode$delegate",
        "Lcom/yuanqi/master/tools/MVFast;",
        "appNoteList",
        "Landroidx/lifecycle/MutableLiveData;",
        "",
        "Lcom/yuanqi/master/database/model/AppNote;",
        "getAppNoteList",
        "()Landroidx/lifecycle/MutableLiveData;",
        "setAppNoteList",
        "(Landroidx/lifecycle/MutableLiveData;)V",
        "deleteModel",
        "",
        "getDeleteModel",
        "longPressGuide",
        "getLongPressGuide",
        "mContext",
        "Landroid/app/Activity;",
        "getMContext",
        "()Landroid/app/Activity;",
        "setMContext",
        "(Landroid/app/Activity;)V",
        "mIsRewardValid",
        "needAboutPoint",
        "getNeedAboutPoint",
        "()Z",
        "setNeedAboutPoint",
        "(Z)V",
        "needShowHelpPoint",
        "getNeedShowHelpPoint",
        "setNeedShowHelpPoint",
        "needShowMenuPoint",
        "getNeedShowMenuPoint",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "getScope",
        "()Lkotlinx/coroutines/CoroutineScope;",
        "setScope",
        "(Lkotlinx/coroutines/CoroutineScope;)V",
        "selectDeleteApp",
        "",
        "Lcom/yuanqi/group/home/models/AppData;",
        "getSelectDeleteApp",
        "showAdNum",
        "getShowAdNum",
        "setShowAdNum",
        "showAdNum$delegate",
        "showAdNumNoLogin",
        "getShowAdNumNoLogin",
        "setShowAdNumNoLogin",
        "showAdNumNoLogin$delegate",
        "showHelp",
        "getShowHelp",
        "setShowHelp",
        "showHelp$delegate",
        "startGuide",
        "getStartGuide",
        "todayMode",
        "Lcom/yuanqi/master/database/model/AdModel;",
        "todayString",
        "ttAdManagerFive",
        "Lcom/bytedance/sdk/openadsdk/TTAdManager;",
        "kotlin.jvm.PlatformType",
        "ttAdNativeFive",
        "Lcom/bytedance/sdk/openadsdk/TTAdNative;",
        "ttRewardVideoAdFive",
        "Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;",
        "updateDialog",
        "Lcom/yuanqi/master/tools/dialog/AlertDialog;",
        "",
        "vipTimeNoLogin",
        "getVipTimeNoLogin",
        "()J",
        "setVipTimeNoLogin",
        "(J)V",
        "vipTimeNoLogin$delegate",
        "checkApp",
        "",
        "checkForce",
        "version",
        "convertBmpByteArrayToBitmap",
        "Landroid/graphics/Bitmap;",
        "bmpData",
        "",
        "deleteAppNote",
        "data",
        "dismissProgress",
        "getAllAppNote",
        "isDelay",
        "getCurrentAd",
        "getSpanCount",
        "insertAboutKey",
        "context",
        "Landroid/content/Context;",
        "insertHelpMenuKey",
        "insertTodayAd",
        "jumpToDataManagement",
        "appNum",
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
        "onRewardVideoCached",
        "ad",
        "onSkippedVideo",
        "onVideoComplete",
        "onVideoError",
        "requestAppNote",
        "mPackageName",
        "userId",
        "action",
        "Lkotlin/Function1;",
        "setAboutPoint",
        "currentVersion",
        "setLocale",
        "newLocale",
        "Ljava/util/Locale;",
        "showGoUpdateDialog",
        "showProgress",
        "verifyAppPwd",
        "noteApp",
        "openAction",
        "Lkotlin/Function0;",
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
.field public static final A:Lcom/yuanqi/group/home/HomeViewModel$b;
    .annotation build Lp4/l;
    .end annotation
.end field

.field static final synthetic B:[Lkotlin/reflect/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/o<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final C:I

.field private static final D:Lkotlin/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/d0<",
            "Lcom/yuanqi/group/home/HomeViewModel;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final E:Lcom/yuanqi/master/database/dao/c;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final F:Lcom/yuanqi/master/database/dao/a;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final b:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private c:Z

.field private d:Z

.field private e:Z

.field private final f:Lcom/bytedance/sdk/openadsdk/TTAdManager;

.field private g:Lcom/bytedance/sdk/openadsdk/TTAdNative;

.field private h:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field private i:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final j:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final k:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final l:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final m:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final n:Lcom/yuanqi/master/tools/x0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private o:I

.field private p:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private q:Lkotlinx/coroutines/s0;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private r:Lv2/a;
    .annotation build Lp4/m;
    .end annotation
.end field

.field public s:Landroid/app/Activity;

.field private final t:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final u:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final v:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final w:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final x:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/List<",
            "Lcom/yuanqi/group/home/models/b;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private y:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/List<",
            "Lv2/b;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private z:Lcom/yuanqi/master/tools/dialog/b;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [Lkotlin/reflect/o;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/x0;

    .line 5
    .line 6
    const-string v2, "showHelp"

    .line 7
    .line 8
    const-string v3, "getShowHelp()I"

    .line 9
    .line 10
    const-class v4, Lcom/yuanqi/group/home/HomeViewModel;

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
    const-string v2, "showAdNum"

    .line 25
    .line 26
    const-string v3, "getShowAdNum()I"

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
    const-string v2, "showAdNumNoLogin"

    .line 41
    .line 42
    const-string v3, "getShowAdNumNoLogin()I"

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
    new-instance v1, Lkotlin/jvm/internal/x0;

    .line 55
    .line 56
    const-string v2, "vipTimeNoLogin"

    .line 57
    .line 58
    const-string v3, "getVipTimeNoLogin()J"

    .line 59
    .line 60
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/x0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Lkotlin/jvm/internal/l1;->k(Lkotlin/jvm/internal/w0;)Lkotlin/reflect/l;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const/4 v2, 0x3

    .line 68
    aput-object v1, v0, v2

    .line 69
    .line 70
    new-instance v1, Lkotlin/jvm/internal/x0;

    .line 71
    .line 72
    const-string v2, "appMode"

    .line 73
    .line 74
    const-string v3, "getAppMode()I"

    .line 75
    .line 76
    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/x0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Lkotlin/jvm/internal/l1;->k(Lkotlin/jvm/internal/w0;)Lkotlin/reflect/l;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const/4 v2, 0x4

    .line 84
    aput-object v1, v0, v2

    .line 85
    .line 86
    sput-object v0, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    .line 87
    .line 88
    new-instance v0, Lcom/yuanqi/group/home/HomeViewModel$b;

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-direct {v0, v1}, Lcom/yuanqi/group/home/HomeViewModel$b;-><init>(Lkotlin/jvm/internal/w;)V

    .line 92
    .line 93
    .line 94
    sput-object v0, Lcom/yuanqi/group/home/HomeViewModel;->A:Lcom/yuanqi/group/home/HomeViewModel$b;

    .line 95
    .line 96
    const/16 v0, 0x8

    .line 97
    .line 98
    sput v0, Lcom/yuanqi/group/home/HomeViewModel;->C:I

    .line 99
    .line 100
    sget-object v0, Lkotlin/h0;->SYNCHRONIZED:Lkotlin/h0;

    .line 101
    .line 102
    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel$a;->INSTANCE:Lcom/yuanqi/group/home/HomeViewModel$a;

    .line 103
    .line 104
    invoke-static {v0, v1}, Lkotlin/e0;->b(Lkotlin/h0;Lv3/a;)Lkotlin/d0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sput-object v0, Lcom/yuanqi/group/home/HomeViewModel;->D:Lkotlin/d0;

    .line 109
    .line 110
    sget-object v0, Lcom/yuanqi/master/database/a;->b:Lcom/yuanqi/master/database/a$b;

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/yuanqi/master/database/a$b;->a()Lcom/yuanqi/master/database/a;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    sget-object v2, Lcom/yuanqi/group/App;->d:Lcom/yuanqi/group/App$a;

    .line 117
    .line 118
    invoke-virtual {v2}, Lcom/yuanqi/group/App$a;->a()Lcom/yuanqi/group/App;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-static {v3}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v3}, Lcom/yuanqi/master/database/a;->c(Landroid/app/Application;)Lcom/yuanqi/master/database/dao/c;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    sput-object v1, Lcom/yuanqi/group/home/HomeViewModel;->E:Lcom/yuanqi/master/database/dao/c;

    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/yuanqi/master/database/a$b;->a()Lcom/yuanqi/master/database/a;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v2}, Lcom/yuanqi/group/App$a;->a()Lcom/yuanqi/group/App;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v1}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Lcom/yuanqi/master/database/a;->b(Landroid/app/Application;)Lcom/yuanqi/master/database/dao/a;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sput-object v0, Lcom/yuanqi/group/home/HomeViewModel;->F:Lcom/yuanqi/master/database/dao/a;

    .line 147
    .line 148
    return-void
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

.method private constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/master/BaseViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "HomeViewModel"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->getAdManager()Lcom/bytedance/sdk/openadsdk/TTAdManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->f:Lcom/bytedance/sdk/openadsdk/TTAdManager;

    .line 13
    .line 14
    new-instance v0, Lcom/yuanqi/master/tools/x0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "hasShowHelp"

    .line 22
    .line 23
    invoke-direct {v0, v2, v1}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->j:Lcom/yuanqi/master/tools/x0;

    .line 27
    .line 28
    new-instance v0, Lcom/yuanqi/master/tools/x0;

    .line 29
    .line 30
    const-string v2, "showADNum"

    .line 31
    .line 32
    invoke-direct {v0, v2, v1}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->k:Lcom/yuanqi/master/tools/x0;

    .line 36
    .line 37
    new-instance v0, Lcom/yuanqi/master/tools/x0;

    .line 38
    .line 39
    const-string v2, "showADNumNoLogin"

    .line 40
    .line 41
    invoke-direct {v0, v2, v1}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->l:Lcom/yuanqi/master/tools/x0;

    .line 45
    .line 46
    new-instance v0, Lcom/yuanqi/master/tools/x0;

    .line 47
    .line 48
    const-wide/16 v1, 0x0

    .line 49
    .line 50
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "showADVipTimeNoLogin"

    .line 55
    .line 56
    invoke-direct {v0, v2, v1}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->m:Lcom/yuanqi/master/tools/x0;

    .line 60
    .line 61
    new-instance v0, Lcom/yuanqi/master/tools/x0;

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const-string v3, "appMode"

    .line 69
    .line 70
    invoke-direct {v0, v3, v2}, Lcom/yuanqi/master/tools/x0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->n:Lcom/yuanqi/master/tools/x0;

    .line 74
    .line 75
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v2, 0x1a

    .line 78
    .line 79
    const-string v3, "yyyy-MM-dd"

    .line 80
    .line 81
    if-lt v0, v2, :cond_0

    .line 82
    .line 83
    invoke-static {v3}, Landroidx/compose/material3/w;->a(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {}, Lcom/yuanqi/group/home/l0;->a()Ljava/time/LocalDateTime;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v0, v2}, Lcom/yuanqi/group/home/m0;->a(Ljava/time/format/DateTimeFormatter;Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 100
    .line 101
    invoke-direct {v0, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    new-instance v2, Ljava/util/Date;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :goto_0
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->p:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lkotlinx/coroutines/t0;->a(Lkotlin/coroutines/g;)Lkotlinx/coroutines/s0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    .line 127
    .line 128
    invoke-virtual {p0, v1}, Lcom/yuanqi/group/home/HomeViewModel;->u(Z)V

    .line 129
    .line 130
    .line 131
    invoke-direct {p0}, Lcom/yuanqi/group/home/HomeViewModel;->z()V

    .line 132
    .line 133
    .line 134
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 135
    .line 136
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 137
    .line 138
    .line 139
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->t:Landroidx/lifecycle/MutableLiveData;

    .line 145
    .line 146
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 147
    .line 148
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->u:Landroidx/lifecycle/MutableLiveData;

    .line 155
    .line 156
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 157
    .line 158
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 165
    .line 166
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 167
    .line 168
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->w:Landroidx/lifecycle/MutableLiveData;

    .line 175
    .line 176
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 177
    .line 178
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v1, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->x:Landroidx/lifecycle/MutableLiveData;

    .line 190
    .line 191
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 192
    .line 193
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-static {}, Lkotlin/collections/u;->E()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iput-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->y:Landroidx/lifecycle/MutableLiveData;

    .line 204
    .line 205
    return-void
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

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/home/HomeViewModel;-><init>()V

    return-void
.end method

.method private final I()I
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->k:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private final J()I
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->l:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private final K()I
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->j:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private final N()J
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->m:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic c(Lcom/yuanqi/group/home/HomeViewModel;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/yuanqi/group/home/HomeViewModel;->q(I)V

    return-void
.end method

.method private final c0(I)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->k:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic d(Lcom/yuanqi/group/home/HomeViewModel;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/home/HomeViewModel;->t()V

    return-void
.end method

.method private final d0(I)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->l:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic e()Lcom/yuanqi/master/database/dao/a;
    .locals 1

    sget-object v0, Lcom/yuanqi/group/home/HomeViewModel;->F:Lcom/yuanqi/master/database/dao/a;

    return-object v0
.end method

.method private final e0(I)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->j:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic f()Lcom/yuanqi/master/database/dao/c;
    .locals 1

    sget-object v0, Lcom/yuanqi/group/home/HomeViewModel;->E:Lcom/yuanqi/master/database/dao/c;

    return-object v0
.end method

.method private final f0(J)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->m:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic g()Lkotlin/d0;
    .locals 1

    sget-object v0, Lcom/yuanqi/group/home/HomeViewModel;->D:Lkotlin/d0;

    return-object v0
.end method

.method private final g0()V
    .locals 6

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/yuanqi/group/home/HomeViewModel$n;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/yuanqi/group/home/HomeViewModel$n;-><init>(Lcom/yuanqi/group/home/HomeViewModel;Lkotlin/coroutines/d;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method

.method public static final synthetic h(Lcom/yuanqi/group/home/HomeViewModel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/home/HomeViewModel;->b:Ljava/lang/String;

    return-object p0
.end method

.method private final h0(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/yuanqi/master/tools/o0;->x0(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic i(Lcom/yuanqi/group/home/HomeViewModel;)Lv2/a;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/home/HomeViewModel;->r:Lv2/a;

    return-object p0
.end method

.method static synthetic i0(Lcom/yuanqi/group/home/HomeViewModel;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    move-result-object p1

    const p2, 0x7f12022d

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/yuanqi/group/home/HomeViewModel;->h0(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic j(Lcom/yuanqi/group/home/HomeViewModel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/home/HomeViewModel;->p:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic k(Lcom/yuanqi/group/home/HomeViewModel;)Lcom/yuanqi/master/tools/dialog/b;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/home/HomeViewModel;->z:Lcom/yuanqi/master/tools/dialog/b;

    return-object p0
.end method

.method public static final synthetic l(Lcom/yuanqi/group/home/HomeViewModel;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/yuanqi/group/home/HomeViewModel;->e0(I)V

    return-void
.end method

.method public static final synthetic m(Lcom/yuanqi/group/home/HomeViewModel;Lv2/a;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->r:Lv2/a;

    return-void
.end method

.method public static final synthetic n(Lcom/yuanqi/group/home/HomeViewModel;Lcom/yuanqi/master/tools/dialog/b;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->z:Lcom/yuanqi/master/tools/dialog/b;

    return-void
.end method

.method public static final synthetic o(Lcom/yuanqi/group/home/HomeViewModel;)V
    .locals 0

    invoke-direct {p0}, Lcom/yuanqi/group/home/HomeViewModel;->g0()V

    return-void
.end method

.method private final q(I)V
    .locals 2

    sget-object v0, Lcom/yuanqi/master/network/repository/f;->g:Lcom/yuanqi/master/network/repository/f;

    invoke-virtual {v0, p1}, Lcom/yuanqi/master/network/repository/f;->i(I)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/yuanqi/group/home/HomeViewModel$e;

    invoke-direct {v0, p0}, Lcom/yuanqi/group/home/HomeViewModel$e;-><init>(Lcom/yuanqi/group/home/HomeViewModel;)V

    new-instance v1, Lcom/yuanqi/group/home/HomeViewModel$f;

    invoke-direct {v1, p0}, Lcom/yuanqi/group/home/HomeViewModel$f;-><init>(Lcom/yuanqi/group/home/HomeViewModel;)V

    invoke-static {p1, v0, v1}, Lcom/yuanqi/master/tools/f1;->a(Lretrofit2/Call;Lv3/l;Lv3/l;)V

    return-void
.end method

.method private final t()V
    .locals 1

    sget-object v0, Lcom/yuanqi/master/tools/o0;->a:Lcom/yuanqi/master/tools/o0;

    invoke-virtual {v0}, Lcom/yuanqi/master/tools/o0;->K()V

    return-void
.end method

.method public static synthetic v(Lcom/yuanqi/group/home/HomeViewModel;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/home/HomeViewModel;->u(Z)V

    return-void
.end method

.method private final z()V
    .locals 6

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/yuanqi/group/home/HomeViewModel$i;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/yuanqi/group/home/HomeViewModel$i;-><init>(Lcom/yuanqi/group/home/HomeViewModel;Lkotlin/coroutines/d;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method


# virtual methods
.method public final A()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->w:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final B()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->u:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final C()Landroid/app/Activity;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->s:Landroid/app/Activity;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final D()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->d:Z

    return v0
.end method

.method public final E()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->c:Z

    return v0
.end method

.method public final F()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final G()Lkotlinx/coroutines/s0;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    return-object v0
.end method

.method public final H()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/List<",
            "Lcom/yuanqi/group/home/models/b;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->x:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final L()I
    .locals 2

    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeViewModel;->x()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeViewModel;->x()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v1, 0x3

    :cond_1
    return v1
.end method

.method public final M()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->t:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final O(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
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
    iput-boolean v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->d:Z

    .line 8
    .line 9
    iget-object v1, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    .line 10
    .line 11
    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    new-instance v4, Lcom/yuanqi/group/home/HomeViewModel$j;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-direct {v4, p1, v5}, Lcom/yuanqi/group/home/HomeViewModel$j;-><init>(Landroid/content/Context;Lkotlin/coroutines/d;)V

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    iget-boolean v1, p0, Lcom/yuanqi/group/home/HomeViewModel;->c:Z

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    iget-boolean v1, p0, Lcom/yuanqi/group/home/HomeViewModel;->d:Z

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    :cond_0
    const/4 v0, 0x1

    .line 38
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
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

.method public final P(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
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
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->c:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    .line 10
    .line 11
    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    new-instance v3, Lcom/yuanqi/group/home/HomeViewModel$k;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v3, p0, v4}, Lcom/yuanqi/group/home/HomeViewModel$k;-><init>(Lcom/yuanqi/group/home/HomeViewModel;Lkotlin/coroutines/d;)V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    iget-boolean v1, p0, Lcom/yuanqi/group/home/HomeViewModel;->c:Z

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    iget-boolean v1, p0, Lcom/yuanqi/group/home/HomeViewModel;->d:Z

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    :cond_0
    const/4 p1, 0x1

    .line 38
    :cond_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
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

.method public final Q()V
    .locals 6

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/yuanqi/group/home/HomeViewModel$l;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/yuanqi/group/home/HomeViewModel$l;-><init>(Lcom/yuanqi/group/home/HomeViewModel;Lkotlin/coroutines/d;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method

.method public final R(Landroid/app/Activity;I)V
    .locals 3
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
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/yuanqi/master/mine/account/a;->k()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/yuanqi/master/BaseViewModel;->b(Landroid/content/Context;I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Landroid/content/Intent;

    .line 20
    .line 21
    const-class v1, Lcom/yuanqi/master/addapp/AddAppActivity;

    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "startScreen"

    .line 27
    .line 28
    const-string v2, "data_manager_screen"

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    const-string v1, "appNum"

    .line 34
    .line 35
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 39
    .line 40
    .line 41
    return-void
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

.method public final S(Ljava/lang/String;ILv3/l;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lv3/l<",
            "-",
            "Lv2/b;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "mPackageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "action"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    .line 12
    .line 13
    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    new-instance v4, Lcom/yuanqi/group/home/HomeViewModel$m;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {v4, p1, p2, p3, v0}, Lcom/yuanqi/group/home/HomeViewModel$m;-><init>(Ljava/lang/String;ILv3/l;Lkotlin/coroutines/d;)V

    .line 22
    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    const/4 v6, 0x0

    .line 26
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 27
    .line 28
    .line 29
    return-void
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
.end method

.method public final T(I)V
    .locals 3

    .line 1
    sget-object v0, Lcom/yuanqi/master/tools/w0;->a:Lcom/yuanqi/master/tools/w0;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "about_"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, p1}, Lcom/yuanqi/master/tools/w0;->b(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v0, 0x1

    .line 25
    xor-int/2addr p1, v0

    .line 26
    iput-boolean p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->d:Z

    .line 27
    .line 28
    iget-object v1, p0, Lcom/yuanqi/group/home/HomeViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    iget-boolean p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->c:Z

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
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

.method public final U(I)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->o:I

    return-void
.end method

.method public final V(I)V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->n:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/yuanqi/master/tools/x0;->setValue(Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V

    return-void
.end method

.method public final W(Landroidx/lifecycle/MutableLiveData;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/MutableLiveData;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/List<",
            "Lv2/b;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->y:Landroidx/lifecycle/MutableLiveData;

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

.method public final X(Landroid/content/Context;Ljava/util/Locale;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/Locale;
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
    const-string v0, "newLocale"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p2}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Landroid/content/res/Configuration;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p2}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v2}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, v2, p2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 42
    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public final Y(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
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
    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->s:Landroid/app/Activity;

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

.method public final Z(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->d:Z

    return-void
.end method

.method public final a0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->c:Z

    return-void
.end method

.method public final b0(Lkotlinx/coroutines/s0;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/s0;
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
    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

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

.method public final j0(Landroid/content/Context;Lv2/b;Lv3/a;)V
    .locals 10
    .param p1    # Landroid/content/Context;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv2/b;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lv2/b;",
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
    const-string v0, "openAction"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    .line 12
    .line 13
    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    new-instance v0, Lcom/yuanqi/group/home/HomeViewModel$o;

    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    move-object v4, v0

    .line 22
    move-object v5, p2

    .line 23
    move-object v6, p1

    .line 24
    move-object v7, p0

    .line 25
    move-object v8, p3

    .line 26
    invoke-direct/range {v4 .. v9}, Lcom/yuanqi/group/home/HomeViewModel$o;-><init>(Lv2/b;Landroid/content/Context;Lcom/yuanqi/group/home/HomeViewModel;Lv3/a;Lkotlin/coroutines/d;)V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x2

    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

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
.end method

.method public onAdClose()V
    .locals 0

    return-void
.end method

.method public onAdShow()V
    .locals 0

    return-void
.end method

.method public onAdVideoBarClick()V
    .locals 0

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/group/home/HomeViewModel;->t()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->b:Ljava/lang/String;

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

    return-void
.end method

.method public onRewardVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)V
    .locals 0
    .param p1    # Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;
        .annotation build Lp4/m;
        .end annotation
    .end param

    return-void
.end method

.method public onRewardVideoCached()V
    .locals 0

    return-void
.end method

.method public onRewardVideoCached(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)V
    .locals 1
    .param p1    # Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/group/home/HomeViewModel;->t()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->i:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->setRewardAdInteractionListener(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/group/home/HomeViewModel;->i:Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeViewModel;->C()Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->showRewardVideoAd(Landroid/app/Activity;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onSkippedVideo()V
    .locals 0

    return-void
.end method

.method public onVideoComplete()V
    .locals 0

    return-void
.end method

.method public onVideoError()V
    .locals 0

    return-void
.end method

.method public final p()V
    .locals 3

    .line 1
    sget-object v0, Lcom/yuanqi/master/tools/w0;->a:Lcom/yuanqi/master/tools/w0;

    .line 2
    .line 3
    const-string v1, "hasShowHelp"

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
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->c:Z

    .line 13
    .line 14
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->c:Z

    .line 24
    .line 25
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    sget-object v0, Lcom/yuanqi/master/network/repository/f;->g:Lcom/yuanqi/master/network/repository/f;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/yuanqi/master/network/repository/f;->h()Lretrofit2/Call;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lcom/yuanqi/group/home/HomeViewModel$c;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lcom/yuanqi/group/home/HomeViewModel$c;-><init>(Lcom/yuanqi/group/home/HomeViewModel;)V

    .line 41
    .line 42
    .line 43
    sget-object v2, Lcom/yuanqi/group/home/HomeViewModel$d;->INSTANCE:Lcom/yuanqi/group/home/HomeViewModel$d;

    .line 44
    .line 45
    invoke-static {v0, v1, v2}, Lcom/yuanqi/master/tools/f1;->a(Lretrofit2/Call;Lv3/l;Lv3/l;)V

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

.method public final r([B)Landroid/graphics/Bitmap;
    .locals 1
    .param p1    # [B
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    const-string v0, "bmpData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public final s(Lcom/yuanqi/group/home/models/b;)V
    .locals 7
    .param p1    # Lcom/yuanqi/group/home/models/b;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    .line 7
    .line 8
    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    new-instance v4, Lcom/yuanqi/group/home/HomeViewModel$g;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {v4, p1, p0, v0}, Lcom/yuanqi/group/home/HomeViewModel$g;-><init>(Lcom/yuanqi/group/home/models/b;Lcom/yuanqi/group/home/HomeViewModel;Lkotlin/coroutines/d;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public final u(Z)V
    .locals 6

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->q:Lkotlinx/coroutines/s0;

    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/yuanqi/group/home/HomeViewModel$h;

    const/4 v4, 0x0

    invoke-direct {v3, p1, p0, v4}, Lcom/yuanqi/group/home/HomeViewModel$h;-><init>(ZLcom/yuanqi/group/home/HomeViewModel;Lkotlin/coroutines/d;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method

.method public final w()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->o:I

    return v0
.end method

.method public final x()I
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->n:Lcom/yuanqi/master/tools/x0;

    sget-object v1, Lcom/yuanqi/group/home/HomeViewModel;->B:[Lkotlin/reflect/o;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/yuanqi/master/tools/x0;->getValue(Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final y()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/List<",
            "Lv2/b;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/yuanqi/group/home/HomeViewModel;->y:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method
