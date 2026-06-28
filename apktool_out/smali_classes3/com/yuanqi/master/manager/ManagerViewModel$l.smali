.class final Lcom/yuanqi/master/manager/ManagerViewModel$l;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/ManagerViewModel;->g0(Landroid/content/Context;)V
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
.method constructor <init>(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->$context:Landroid/content/Context;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/manager/ManagerViewModel$l;->invoke(Ljava/lang/String;)V

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
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_0

    const/4 p1, 0x2

    const/4 v0, 0x0

    const-string v1, "\u5907\u6ce8\u540d\u5b57\u4e0d\u80fd\u8d85\u8fc720\u4e2a\u5b57\u7b26"

    const/4 v2, 0x0

    .line 3
    invoke-static {v1, v2, p1, v0}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->C()Lv2/b;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->C()Lv2/b;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lv2/b;->setNoteName(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->B()Lkotlinx/coroutines/flow/e0;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/e0;->setValue(Ljava/lang/Object;)V

    .line 7
    iget-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {p1}, Lcom/yuanqi/master/manager/ManagerViewModel;->C()Lv2/b;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->p(Lcom/yuanqi/master/manager/ManagerViewModel;Lv2/b;)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->D()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v1, ""

    :cond_2
    iget-object v2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v2}, Lcom/yuanqi/master/manager/ManagerViewModel;->G()I

    move-result v2

    invoke-static {v0, v1, v2, p1}, Lcom/yuanqi/master/manager/ManagerViewModel;->i(Lcom/yuanqi/master/manager/ManagerViewModel;Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    sget-object v0, Lcom/yuanqi/master/tools/q0;->a:Lcom/yuanqi/master/tools/q0$b;

    invoke-virtual {v0}, Lcom/yuanqi/master/tools/q0$b;->a()Lcom/yuanqi/master/tools/q0;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v2}, Lcom/yuanqi/master/manager/ManagerViewModel;->v()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/yuanqi/master/manager/ManagerViewModel$l;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v3}, Lcom/yuanqi/master/manager/ManagerViewModel;->G()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/yuanqi/master/tools/q0;->o(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
