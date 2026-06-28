.class final Lkotlinx/coroutines/scheduling/p;
.super Lkotlinx/coroutines/n0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001c\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0017J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0010\u0010\u000c\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0017\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkotlinx/coroutines/scheduling/p;",
        "Lkotlinx/coroutines/n0;",
        "Lkotlin/coroutines/g;",
        "context",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "block",
        "Lkotlin/r2;",
        "dispatchYield",
        "dispatch",
        "",
        "parallelism",
        "limitedParallelism",
        "<init>",
        "()V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lkotlinx/coroutines/scheduling/p;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/scheduling/p;

    invoke-direct {v0}, Lkotlinx/coroutines/scheduling/p;-><init>()V

    sput-object v0, Lkotlinx/coroutines/scheduling/p;->a:Lkotlinx/coroutines/scheduling/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/n0;-><init>()V

    return-void
.end method


# virtual methods
.method public dispatch(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V
    .locals 2
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lp4/l;
        .end annotation
    .end param

    sget-object p1, Lkotlinx/coroutines/scheduling/d;->g:Lkotlinx/coroutines/scheduling/d;

    sget-object v0, Lkotlinx/coroutines/scheduling/o;->j:Lkotlinx/coroutines/scheduling/l;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lkotlinx/coroutines/scheduling/i;->E0(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V

    return-void
.end method

.method public dispatchYield(Lkotlin/coroutines/g;Ljava/lang/Runnable;)V
    .locals 2
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlinx/coroutines/g2;
    .end annotation

    sget-object p1, Lkotlinx/coroutines/scheduling/d;->g:Lkotlinx/coroutines/scheduling/d;

    sget-object v0, Lkotlinx/coroutines/scheduling/o;->j:Lkotlinx/coroutines/scheduling/l;

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v0, v1}, Lkotlinx/coroutines/scheduling/i;->E0(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V

    return-void
.end method

.method public limitedParallelism(I)Lkotlinx/coroutines/n0;
    .locals 1
    .annotation build Lkotlinx/coroutines/a2;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p1}, Lkotlinx/coroutines/internal/u;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lkotlinx/coroutines/scheduling/o;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lkotlinx/coroutines/n0;->limitedParallelism(I)Lkotlinx/coroutines/n0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method
