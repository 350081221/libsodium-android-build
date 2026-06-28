.class final Lcom/yuanqi/master/main/d$f$a$d$d;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/main/d$f$a$d;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $mainViewModel:Lcom/yuanqi/master/main/MainViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/main/MainViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/main/d$f$a$d$d;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/main/d$f$a$d$d;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/main/d$f$a$d$d;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/main/MainViewModel;->Q()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 3
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/yuanqi/master/main/MainActivity;->c:Lcom/yuanqi/master/main/MainActivity$a;

    invoke-virtual {v1}, Lcom/yuanqi/master/main/MainActivity$a;->a()Lcom/yuanqi/master/main/MainActivity;

    move-result-object v2

    const-class v3, Lcom/yuanqi/master/addapp/AddAppActivity;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "startScreen"

    const-string v3, "sort_screen"

    .line 4
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-virtual {v1}, Lcom/yuanqi/master/main/MainActivity$a;->a()Lcom/yuanqi/master/main/MainActivity;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v1, v0, v2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
