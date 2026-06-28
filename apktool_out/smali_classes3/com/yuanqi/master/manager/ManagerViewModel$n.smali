.class final Lcom/yuanqi/master/manager/ManagerViewModel$n;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/ManagerViewModel;->h0(Landroid/content/Context;Z)V
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
        "pwd",
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
.field final synthetic $isEdit:Z

.field final synthetic this$0:Lcom/yuanqi/master/manager/ManagerViewModel;


# direct methods
.method constructor <init>(ZLcom/yuanqi/master/manager/ManagerViewModel;)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$n;->$isEdit:Z

    iput-object p2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$n;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/manager/ManagerViewModel$n;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "pwd"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$n;->$isEdit:Z

    const-string v1, "\u5bc6\u7801\u4e3a4\u4f4d\u6570\u5b57"

    const/4 v2, 0x4

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v5, v0, :cond_0

    if-ge v0, v2, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    move v0, v6

    :goto_0
    if-eqz v0, :cond_2

    .line 4
    invoke-static {v1, v6, v3, v4}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    return-void

    .line 5
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v0, v2, :cond_2

    .line 6
    invoke-static {v1, v6, v3, v4}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    return-void

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$n;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-static {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->h(Lcom/yuanqi/master/manager/ManagerViewModel;)Lkotlinx/coroutines/s0;

    move-result-object v7

    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    move-result-object v8

    const/4 v9, 0x0

    new-instance v10, Lcom/yuanqi/master/manager/ManagerViewModel$n$a;

    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$n;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-direct {v10, v0, p1, v4}, Lcom/yuanqi/master/manager/ManagerViewModel$n$a;-><init>(Lcom/yuanqi/master/manager/ManagerViewModel;Ljava/lang/String;Lkotlin/coroutines/d;)V

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 8
    sget-object v0, Lcom/yuanqi/group/home/HomeViewModel;->A:Lcom/yuanqi/group/home/HomeViewModel$b;

    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeViewModel$b;->c()Lcom/yuanqi/group/home/HomeViewModel;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/yuanqi/group/home/HomeViewModel;->u(Z)V

    const-string v0, "\u8bbe\u7f6e\u6210\u529f"

    .line 9
    invoke-static {v0, v6, v3, v4}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 10
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$n;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->E()Lkotlinx/coroutines/flow/e0;

    move-result-object v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move v5, v6

    :goto_1
    if-eqz v5, :cond_4

    const-string p1, "\u5e94\u7528\u9501"

    goto :goto_2

    :cond_4
    const-string p1, "\u4fee\u6539\u5bc6\u7801"

    :goto_2
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/e0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
