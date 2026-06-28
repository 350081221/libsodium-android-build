.class final Lkotlinx/coroutines/internal/k0$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/internal/k0;->a(Lv3/l;Ljava/lang/Object;Lkotlin/coroutines/g;)Lv3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Throwable;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "E",
        "",
        "<anonymous parameter 0>",
        "Lkotlin/r2;",
        "invoke",
        "(Ljava/lang/Throwable;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $context:Lkotlin/coroutines/g;

.field final synthetic $element:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final synthetic $this_bindCancellationFun:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "TE;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lv3/l;Ljava/lang/Object;Lkotlin/coroutines/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-TE;",
            "Lkotlin/r2;",
            ">;TE;",
            "Lkotlin/coroutines/g;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/internal/k0$a;->$this_bindCancellationFun:Lv3/l;

    iput-object p2, p0, Lkotlinx/coroutines/internal/k0$a;->$element:Ljava/lang/Object;

    iput-object p3, p0, Lkotlinx/coroutines/internal/k0$a;->$context:Lkotlin/coroutines/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/k0$a;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object p1, p0, Lkotlinx/coroutines/internal/k0$a;->$this_bindCancellationFun:Lv3/l;

    iget-object v0, p0, Lkotlinx/coroutines/internal/k0$a;->$element:Ljava/lang/Object;

    iget-object v1, p0, Lkotlinx/coroutines/internal/k0$a;->$context:Lkotlin/coroutines/g;

    invoke-static {p1, v0, v1}, Lkotlinx/coroutines/internal/k0;->b(Lv3/l;Ljava/lang/Object;Lkotlin/coroutines/g;)V

    return-void
.end method
