.class final Lcom/yuanqi/master/addapp/AddAppViewModel$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/AddAppViewModel;->h(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/response/ConfigResponse;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "result",
        "Lcom/yuanqi/master/network/model/response/ConfigResponse;",
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


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/yuanqi/master/addapp/AddAppViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$c;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$c;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/response/ConfigResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$c;->invoke(Lcom/yuanqi/master/network/model/response/ConfigResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/response/ConfigResponse;)V
    .locals 2
    .param p1    # Lcom/yuanqi/master/network/model/response/ConfigResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    sget-object v0, Lcom/yuanqi/master/tools/v0;->a:Lcom/yuanqi/master/tools/v0;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$c;->$context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/tools/v0;->e(Landroid/content/Context;)I

    move-result v0

    if-eqz p1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$c;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-virtual {v1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->t()Landroidx/compose/runtime/MutableState;

    move-result-object v1

    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/response/ConfigResponse;->getVersion()I

    move-result p1

    if-ge v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v1, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
