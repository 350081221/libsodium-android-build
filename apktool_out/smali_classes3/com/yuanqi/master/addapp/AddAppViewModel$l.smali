.class final Lcom/yuanqi/master/addapp/AddAppViewModel$l;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/AddAppViewModel;->u0(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/io/File;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Ljava/io/File;",
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
.method constructor <init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l;->$context:Landroid/content/Context;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/AddAppViewModel$l;->invoke(Ljava/io/File;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/io/File;)V
    .locals 7
    .param p1    # Ljava/io/File;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/addapp/AddAppViewModel;->A()Lkotlinx/coroutines/s0;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v4, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;

    iget-object v0, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l;->this$0:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v5, p0, Lcom/yuanqi/master/addapp/AddAppViewModel$l;->$context:Landroid/content/Context;

    const/4 v6, 0x0

    invoke-direct {v4, v0, v5, p1, v6}, Lcom/yuanqi/master/addapp/AddAppViewModel$l$a;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;Ljava/io/File;Lkotlin/coroutines/d;)V

    const/4 v5, 0x2

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method
