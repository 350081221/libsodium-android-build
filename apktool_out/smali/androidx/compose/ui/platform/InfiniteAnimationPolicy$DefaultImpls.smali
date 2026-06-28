.class public final Landroidx/compose/ui/platform/InfiniteAnimationPolicy$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/InfiniteAnimationPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
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
.method public static fold(Landroidx/compose/ui/platform/InfiniteAnimationPolicy;Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;
    .locals 0
    .param p0    # Landroidx/compose/ui/platform/InfiniteAnimationPolicy;
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
            "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;",
            "TR;",
            "Lv3/p<",
            "-TR;-",
            "Lkotlin/coroutines/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lkotlin/coroutines/g$b$a;->a(Lkotlin/coroutines/g$b;Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static get(Landroidx/compose/ui/platform/InfiniteAnimationPolicy;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;
    .locals 0
    .param p0    # Landroidx/compose/ui/platform/InfiniteAnimationPolicy;
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
            "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;",
            "Lkotlin/coroutines/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/coroutines/g$b$a;->b(Lkotlin/coroutines/g$b;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;

    move-result-object p0

    return-object p0
.end method

.method public static getKey(Landroidx/compose/ui/platform/InfiniteAnimationPolicy;)Lkotlin/coroutines/g$c;
    .locals 0
    .param p0    # Landroidx/compose/ui/platform/InfiniteAnimationPolicy;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;",
            ")",
            "Lkotlin/coroutines/g$c<",
            "*>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Landroidx/compose/ui/platform/InfiniteAnimationPolicy;->access$getKey$jd(Landroidx/compose/ui/platform/InfiniteAnimationPolicy;)Lkotlin/coroutines/g$c;

    move-result-object p0

    return-object p0
.end method

.method public static minusKey(Landroidx/compose/ui/platform/InfiniteAnimationPolicy;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;
    .locals 0
    .param p0    # Landroidx/compose/ui/platform/InfiniteAnimationPolicy;
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
            "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;",
            "Lkotlin/coroutines/g$c<",
            "*>;)",
            "Lkotlin/coroutines/g;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/coroutines/g$b$a;->c(Lkotlin/coroutines/g$b;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;

    move-result-object p0

    return-object p0
.end method

.method public static plus(Landroidx/compose/ui/platform/InfiniteAnimationPolicy;Lkotlin/coroutines/g;)Lkotlin/coroutines/g;
    .locals 0
    .param p0    # Landroidx/compose/ui/platform/InfiniteAnimationPolicy;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Lkotlin/coroutines/g$b$a;->d(Lkotlin/coroutines/g$b;Lkotlin/coroutines/g;)Lkotlin/coroutines/g;

    move-result-object p0

    return-object p0
.end method
