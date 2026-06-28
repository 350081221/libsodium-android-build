.class final Lcom/yuanqi/master/mine/account/b$b$a$f;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/account/b$b$a;->invoke(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $navController:Landroidx/navigation/NavHostController;


# direct methods
.method constructor <init>(Landroidx/navigation/NavHostController;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/mine/account/b$b$a$f;->$navController:Landroidx/navigation/NavHostController;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/mine/account/b$b$a$f;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 12

    .line 2
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/account/a;->b()Landroidx/compose/runtime/MutableState;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, "\u8bf7\u5728\u7ed1\u5b9a\u624b\u673a\u53f7\u4e4b\u540e\u518d\u8fdb\u884c\u591a\u8d26\u53f7\u6ce8\u518c\u3002"

    const/4 v5, 0x0

    if-nez v1, :cond_0

    .line 3
    invoke-static {v4, v3, v2, v5}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/yuanqi/master/mine/account/a;->b()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yuanqi/master/network/model/UserInfoData;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/yuanqi/master/network/model/UserInfoData;->getUserPhone()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v5

    :goto_0
    if-nez v0, :cond_2

    .line 5
    invoke-static {v4, v3, v2, v5}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    return-void

    .line 6
    :cond_2
    iget-object v6, p0, Lcom/yuanqi/master/mine/account/b$b$a$f;->$navController:Landroidx/navigation/NavHostController;

    const-string v7, "/mine/register"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    return-void
.end method
