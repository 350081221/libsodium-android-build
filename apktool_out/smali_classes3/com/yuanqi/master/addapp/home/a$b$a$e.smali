.class final Lcom/yuanqi/master/addapp/home/a$b$a$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/a$b$a;->invoke(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V
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


# instance fields
.field final synthetic $addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $msg:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/a$b$a$e;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/a$b$a$e;->$msg:Ljava/lang/String;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/a$b$a$e;->$context:Landroid/content/Context;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/a$b$a$e;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/a$b$a$e;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/addapp/AddAppViewModel;->t()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/a$b$a$e;->$msg:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    sget-object v0, Lcom/yuanqi/master/tools/v0;->a:Lcom/yuanqi/master/tools/v0;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/a$b$a$e;->$context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/tools/v0;->g(Landroid/content/Context;)V

    :goto_0
    return-void
.end method
