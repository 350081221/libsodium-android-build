.class final Lcom/yuanqi/master/manager/ManagerViewModel$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/ManagerViewModel;->u(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/String;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "content",
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


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic this$0:Lcom/yuanqi/master/manager/ManagerViewModel;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/yuanqi/master/manager/ManagerViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$e;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$e;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/manager/ManagerViewModel$e;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/yuanqi/master/tools/e;->a:Lcom/yuanqi/master/tools/e;

    invoke-virtual {v0}, Lcom/yuanqi/master/tools/e;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$e;->$context:Landroid/content/Context;

    const v1, 0x7f1200e8

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$e;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$e;->$context:Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lcom/yuanqi/master/manager/ManagerViewModel;->m(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
