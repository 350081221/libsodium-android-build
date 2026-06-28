.class public final Lkotlinx/coroutines/channels/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/channels/l;
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
.method public static synthetic a(Lkotlinx/coroutines/channels/l;)V
    .locals 0
    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    invoke-static {p0}, Lkotlinx/coroutines/channels/g0$a;->a(Lkotlinx/coroutines/channels/g0;)V

    return-void
.end method

.method public static b(Lkotlinx/coroutines/channels/l;)Lkotlinx/coroutines/selects/g;
    .locals 0
    .param p0    # Lkotlinx/coroutines/channels/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/channels/l<",
            "TE;>;)",
            "Lkotlinx/coroutines/selects/g<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlinx/coroutines/channels/g0$a;->d(Lkotlinx/coroutines/channels/g0;)Lkotlinx/coroutines/selects/g;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lkotlinx/coroutines/channels/l;Ljava/lang/Object;)Z
    .locals 0
    .param p0    # Lkotlinx/coroutines/channels/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/channels/l<",
            "TE;>;TE;)Z"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = "Deprecated in the favour of \'trySend\' method"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "trySend(element).isSuccess"
            imports = {}
        .end subannotation
    .end annotation

    invoke-static {p0, p1}, Lkotlinx/coroutines/channels/h0$a;->c(Lkotlinx/coroutines/channels/h0;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static d(Lkotlinx/coroutines/channels/l;)Ljava/lang/Object;
    .locals 0
    .param p0    # Lkotlinx/coroutines/channels/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/channels/l<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = "Deprecated in the favour of \'tryReceive\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'poll\' did, for the precise replacement please refer to the \'poll\' documentation"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "tryReceive().getOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0}, Lkotlinx/coroutines/channels/g0$a;->h(Lkotlinx/coroutines/channels/g0;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lkotlinx/coroutines/channels/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
    .param p0    # Lkotlinx/coroutines/channels/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/channels/l<",
            "TE;>;",
            "Lkotlin/coroutines/d<",
            "-TE;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lkotlin/internal/h;
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = "Deprecated in favor of \'receiveCatching\'. Please note that the provided replacement does not rethrow channel\'s close cause as \'receiveOrNull\' did, for the detailed replacement please refer to the \'receiveOrNull\' documentation"
        replaceWith = .subannotation Lkotlin/b1;
            expression = "receiveCatching().getOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0, p1}, Lkotlinx/coroutines/channels/g0$a;->i(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
