.class public final Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$Companion;,
        Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$MyHandler;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\u000c\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;",
        "Landroid/app/Activity;",
        "Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;",
        "()V",
        "api",
        "Lcom/tencent/mm/opensdk/openapi/IWXAPI;",
        "handler",
        "Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$MyHandler;",
        "goToShowMsg",
        "",
        "showReq",
        "Lcom/tencent/mm/opensdk/modelmsg/ShowMessageFromWX$Req;",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onNewIntent",
        "intent",
        "Landroid/content/Intent;",
        "onReq",
        "req",
        "Lcom/tencent/mm/opensdk/modelbase/BaseReq;",
        "onResp",
        "resp",
        "Lcom/tencent/mm/opensdk/modelbase/BaseResp;",
        "Companion",
        "MyHandler",
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
.field public static final $stable:I

.field public static final Companion:Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "MicroMsg.WXEntryActivity"
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private api:Lcom/tencent/mm/opensdk/openapi/IWXAPI;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private handler:Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$MyHandler;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;->Companion:Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private final goToShowMsg(Lcom/tencent/mm/opensdk/modelmsg/ShowMessageFromWX$Req;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const-class v0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/TraceManager;->startActivityTrace(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    const-string p1, "wx0abebc768438058b"

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;->api:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 21
    .line 22
    new-instance p1, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$MyHandler;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$MyHandler;-><init>(Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;->handler:Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$MyHandler;

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;->api:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, p1, p0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 43
    .line 44
    .line 45
    :cond_0
    :goto_0
    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityCreateEnd()V

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
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;->api:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1, p0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)V
    .locals 2
    .param p1    # Lcom/tencent/mm/opensdk/modelbase/BaseReq;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "req"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x4

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    check-cast p1, Lcom/tencent/mm/opensdk/modelmsg/ShowMessageFromWX$Req;

    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;->goToShowMsg(Lcom/tencent/mm/opensdk/modelmsg/ShowMessageFromWX$Req;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
    .locals 4
    .param p1    # Lcom/tencent/mm/opensdk/modelbase/BaseResp;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "resp"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p1, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    .line 7
    .line 8
    const/4 v0, -0x2

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "\u652f\u4ed8\u6210\u529f"

    .line 18
    .line 19
    invoke-static {p1, v3, v2, v1}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    .line 23
    .line 24
    invoke-static {}, Lkotlinx/coroutines/k1;->a()Lkotlinx/coroutines/n0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lkotlinx/coroutines/t0;->a(Lkotlin/coroutines/g;)Lkotlinx/coroutines/s0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$onResp$1;->INSTANCE:Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$onResp$1;

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Lcom/yuanqi/master/mine/account/a;->n(Lkotlinx/coroutines/s0;Lv3/a;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-string p1, "\u53d6\u6d88\u652f\u4ed8"

    .line 39
    .line 40
    invoke-static {p1, v3, v2, v1}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 44
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
.end method

.method protected onRestart()V
    .locals 1

    const-class v0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityRestartEnd()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    const-class v0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityResumeEnd()V

    return-void
.end method

.method protected onStart()V
    .locals 1

    const-class v0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartBegin(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    invoke-static {}, Lcom/huawei/agconnect/apms/instrument/AppInstrumentation;->onActivityStartEnd()V

    return-void
.end method
