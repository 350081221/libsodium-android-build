.class public final Lkotlinx/coroutines/x$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/x;
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
.method public static synthetic a(Lkotlinx/coroutines/x;)V
    .locals 0
    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    invoke-static {p0}, Lkotlinx/coroutines/l2$a;->a(Lkotlinx/coroutines/l2;)V

    return-void
.end method

.method public static b(Lkotlinx/coroutines/x;Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;
    .locals 0
    .param p0    # Lkotlinx/coroutines/x;
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
            ">(",
            "Lkotlinx/coroutines/x;",
            "TR;",
            "Lv3/p<",
            "-TR;-",
            "Lkotlin/coroutines/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/l2$a;->d(Lkotlinx/coroutines/l2;Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lkotlinx/coroutines/x;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;
    .locals 0
    .param p0    # Lkotlinx/coroutines/x;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/g$c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/g$b;",
            ">(",
            "Lkotlinx/coroutines/x;",
            "Lkotlin/coroutines/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0, p1}, Lkotlinx/coroutines/l2$a;->e(Lkotlinx/coroutines/l2;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lkotlinx/coroutines/x;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;
    .locals 0
    .param p0    # Lkotlinx/coroutines/x;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/g$c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/x;",
            "Lkotlin/coroutines/g$c<",
            "*>;)",
            "Lkotlin/coroutines/g;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlinx/coroutines/l2$a;->h(Lkotlinx/coroutines/l2;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lkotlinx/coroutines/x;Lkotlin/coroutines/g;)Lkotlin/coroutines/g;
    .locals 0
    .param p0    # Lkotlinx/coroutines/x;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlinx/coroutines/l2$a;->i(Lkotlinx/coroutines/l2;Lkotlin/coroutines/g;)Lkotlin/coroutines/g;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lkotlinx/coroutines/x;Lkotlinx/coroutines/l2;)Lkotlinx/coroutines/l2;
    .locals 0
    .param p0    # Lkotlinx/coroutines/x;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlinx/coroutines/l2;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`."
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlinx/coroutines/l2$a;->j(Lkotlinx/coroutines/l2;Lkotlinx/coroutines/l2;)Lkotlinx/coroutines/l2;

    move-result-object p0

    return-object p0
.end method
