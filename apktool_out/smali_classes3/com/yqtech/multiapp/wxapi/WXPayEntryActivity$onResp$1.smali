.class final Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$onResp$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$onResp$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$onResp$1;

    invoke-direct {v0}, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$onResp$1;-><init>()V

    sput-object v0, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$onResp$1;->INSTANCE:Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$onResp$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yqtech/multiapp/wxapi/WXPayEntryActivity$onResp$1;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    sget-object v0, Lcom/yuanqi/master/mine/MineActivity;->b:Lcom/yuanqi/master/mine/MineActivity$a;

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/MineActivity$a;->a()Lcom/yuanqi/master/mine/MineActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/MineActivity;->F()V

    :cond_0
    return-void
.end method
