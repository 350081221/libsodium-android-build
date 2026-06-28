.class final Lkotlinx/coroutines/sync/b$e;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/sync/b;-><init>(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/q<",
        "Lkotlinx/coroutines/selects/m<",
        "*>;",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Lv3/l<",
        "-",
        "Ljava/lang/Throwable;",
        "+",
        "Lkotlin/r2;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\u0008\u00030\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlinx/coroutines/selects/m;",
        "<anonymous parameter 0>",
        "",
        "owner",
        "<anonymous parameter 2>",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/r2;",
        "invoke",
        "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;Ljava/lang/Object;)Lv3/l;",
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
.field final synthetic this$0:Lkotlinx/coroutines/sync/b;


# direct methods
.method constructor <init>(Lkotlinx/coroutines/sync/b;)V
    .locals 0

    iput-object p1, p0, Lkotlinx/coroutines/sync/b$e;->this$0:Lkotlinx/coroutines/sync/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/selects/m;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/sync/b$e;->invoke(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;Ljava/lang/Object;)Lv3/l;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;Ljava/lang/Object;)Lv3/l;
    .locals 0
    .param p1    # Lkotlinx/coroutines/selects/m;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/selects/m<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")",
            "Lv3/l<",
            "Ljava/lang/Throwable;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance p1, Lkotlinx/coroutines/sync/b$e$a;

    iget-object p3, p0, Lkotlinx/coroutines/sync/b$e;->this$0:Lkotlinx/coroutines/sync/b;

    invoke-direct {p1, p3, p2}, Lkotlinx/coroutines/sync/b$e$a;-><init>(Lkotlinx/coroutines/sync/b;Ljava/lang/Object;)V

    return-object p1
.end method
