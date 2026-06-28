.class public final Lkotlinx/coroutines/selects/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/selects/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lkotlinx/coroutines/selects/c;Lkotlinx/coroutines/selects/i;Lv3/p;)V
    .locals 1
    .param p0    # Lkotlinx/coroutines/selects/c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlinx/coroutines/selects/i;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            "Q:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/selects/c<",
            "-TR;>;",
            "Lkotlinx/coroutines/selects/i<",
            "-TP;+TQ;>;",
            "Lv3/p<",
            "-TQ;-",
            "Lkotlin/coroutines/d<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0, p2}, Lkotlinx/coroutines/selects/c;->a(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;Lv3/p;)V

    return-void
.end method

.method public static b(Lkotlinx/coroutines/selects/c;JLv3/l;)V
    .locals 0
    .param p0    # Lkotlinx/coroutines/selects/c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/selects/c<",
            "-TR;>;J",
            "Lv3/l<",
            "-",
            "Lkotlin/coroutines/d<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/internal/h;
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = "Replaced with the same extension function"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "onTimeout"
            imports = {
                "kotlinx.coroutines.selects.onTimeout"
            }
        .end subannotation
    .end annotation

    .annotation build Lkotlinx/coroutines/a2;
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lkotlinx/coroutines/selects/b;->a(Lkotlinx/coroutines/selects/c;JLv3/l;)V

    return-void
.end method
