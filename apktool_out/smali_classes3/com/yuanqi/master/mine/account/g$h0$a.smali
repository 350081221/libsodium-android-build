.class final Lcom/yuanqi/master/mine/account/g$h0$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/account/g$h0;->invoke()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
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
.field final synthetic $countDown:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/mine/MineViewModel;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/mine/MineViewModel;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/mine/account/g$h0$a;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/mine/account/g$h0$a;->$countDown:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/account/g$h0$a;->invoke(I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 6

    const/16 v0, 0xc8

    if-eq p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/yuanqi/master/mine/account/g$h0$a;->$mineViewModel:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {p1}, Lcom/yuanqi/master/mine/MineViewModel;->t()Lkotlinx/coroutines/s0;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/k1;->c()Lkotlinx/coroutines/n0;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lcom/yuanqi/master/mine/account/g$h0$a$a;

    iget-object p1, p0, Lcom/yuanqi/master/mine/account/g$h0$a;->$countDown:Landroidx/compose/runtime/MutableState;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lcom/yuanqi/master/mine/account/g$h0$a$a;-><init>(Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/d;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    return-void
.end method
