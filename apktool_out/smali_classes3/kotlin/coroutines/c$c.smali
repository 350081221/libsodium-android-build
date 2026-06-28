.class final Lkotlin/coroutines/c$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/coroutines/c;->writeReplace()Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Lkotlin/r2;",
        "Lkotlin/coroutines/g$b;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "<anonymous parameter 0>",
        "element",
        "Lkotlin/coroutines/CoroutineContext$Element;",
        "invoke",
        "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"
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
.field final synthetic $elements:[Lkotlin/coroutines/g;

.field final synthetic $index:Lkotlin/jvm/internal/k1$f;


# direct methods
.method constructor <init>([Lkotlin/coroutines/g;Lkotlin/jvm/internal/k1$f;)V
    .locals 0

    iput-object p1, p0, Lkotlin/coroutines/c$c;->$elements:[Lkotlin/coroutines/g;

    iput-object p2, p0, Lkotlin/coroutines/c$c;->$index:Lkotlin/jvm/internal/k1$f;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/r2;

    check-cast p2, Lkotlin/coroutines/g$b;

    invoke-virtual {p0, p1, p2}, Lkotlin/coroutines/c$c;->invoke(Lkotlin/r2;Lkotlin/coroutines/g$b;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lkotlin/r2;Lkotlin/coroutines/g$b;)V
    .locals 3
    .param p1    # Lkotlin/r2;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/g$b;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "element"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lkotlin/coroutines/c$c;->$elements:[Lkotlin/coroutines/g;

    iget-object v0, p0, Lkotlin/coroutines/c$c;->$index:Lkotlin/jvm/internal/k1$f;

    iget v1, v0, Lkotlin/jvm/internal/k1$f;->element:I

    add-int/lit8 v2, v1, 0x1

    iput v2, v0, Lkotlin/jvm/internal/k1$f;->element:I

    aput-object p2, p1, v1

    return-void
.end method
