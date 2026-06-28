.class final Lkotlinx/coroutines/channels/j$k;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/j;-><init>(ILv3/l;)V
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
        "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\"\u0004\u0008\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "E",
        "Lkotlinx/coroutines/selects/m;",
        "select",
        "",
        "<anonymous parameter 1>",
        "element",
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
.field final synthetic this$0:Lkotlinx/coroutines/channels/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/j<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlinx/coroutines/channels/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/j<",
            "TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/channels/j$k;->this$0:Lkotlinx/coroutines/channels/j;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/selects/m;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/channels/j$k;->invoke(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;Ljava/lang/Object;)Lv3/l;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;Ljava/lang/Object;)Lv3/l;
    .locals 1
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
    new-instance p2, Lkotlinx/coroutines/channels/j$k$a;

    iget-object v0, p0, Lkotlinx/coroutines/channels/j$k;->this$0:Lkotlinx/coroutines/channels/j;

    invoke-direct {p2, p3, v0, p1}, Lkotlinx/coroutines/channels/j$k$a;-><init>(Ljava/lang/Object;Lkotlinx/coroutines/channels/j;Lkotlinx/coroutines/selects/m;)V

    return-object p2
.end method
