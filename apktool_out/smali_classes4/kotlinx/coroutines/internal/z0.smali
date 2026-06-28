.class public final Lkotlinx/coroutines/internal/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00100\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u000e\u00a8\u0006\u0015"
    }
    d2 = {
        "Lkotlin/coroutines/g;",
        "context",
        "",
        "b",
        "countOrElement",
        "c",
        "oldState",
        "Lkotlin/r2;",
        "a",
        "Lkotlinx/coroutines/internal/t0;",
        "Lkotlinx/coroutines/internal/t0;",
        "NO_THREAD_ELEMENTS",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/g$b;",
        "Lv3/p;",
        "countAll",
        "Lkotlinx/coroutines/n3;",
        "findOne",
        "Lkotlinx/coroutines/internal/f1;",
        "d",
        "updateState",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lkotlinx/coroutines/internal/t0;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field private static final b:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/g$b;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final c:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Lkotlinx/coroutines/n3<",
            "*>;",
            "Lkotlin/coroutines/g$b;",
            "Lkotlinx/coroutines/n3<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final d:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Lkotlinx/coroutines/internal/f1;",
            "Lkotlin/coroutines/g$b;",
            "Lkotlinx/coroutines/internal/f1;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/internal/t0;

    .line 2
    .line 3
    const-string v1, "NO_THREAD_ELEMENTS"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lkotlinx/coroutines/internal/z0;->a:Lkotlinx/coroutines/internal/t0;

    .line 9
    .line 10
    sget-object v0, Lkotlinx/coroutines/internal/z0$a;->INSTANCE:Lkotlinx/coroutines/internal/z0$a;

    .line 11
    .line 12
    sput-object v0, Lkotlinx/coroutines/internal/z0;->b:Lv3/p;

    .line 13
    .line 14
    sget-object v0, Lkotlinx/coroutines/internal/z0$b;->INSTANCE:Lkotlinx/coroutines/internal/z0$b;

    .line 15
    .line 16
    sput-object v0, Lkotlinx/coroutines/internal/z0;->c:Lv3/p;

    .line 17
    .line 18
    sget-object v0, Lkotlinx/coroutines/internal/z0$c;->INSTANCE:Lkotlinx/coroutines/internal/z0$c;

    .line 19
    .line 20
    sput-object v0, Lkotlinx/coroutines/internal/z0;->d:Lv3/p;

    .line 21
    .line 22
    return-void
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
.end method

.method public static final a(Lkotlin/coroutines/g;Ljava/lang/Object;)V
    .locals 2
    .param p0    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lkotlinx/coroutines/internal/z0;->a:Lkotlinx/coroutines/internal/t0;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    instance-of v0, p1, Lkotlinx/coroutines/internal/f1;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p1, Lkotlinx/coroutines/internal/f1;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/internal/f1;->b(Lkotlin/coroutines/g;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    sget-object v1, Lkotlinx/coroutines/internal/z0;->c:Lv3/p;

    .line 18
    .line 19
    invoke-interface {p0, v0, v1}, Lkotlin/coroutines/g;->fold(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    check-cast v0, Lkotlinx/coroutines/n3;

    .line 29
    .line 30
    invoke-interface {v0, p0, p1}, Lkotlinx/coroutines/n3;->restoreThreadContext(Lkotlin/coroutines/g;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static final b(Lkotlin/coroutines/g;)Ljava/lang/Object;
    .locals 2
    .param p0    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lkotlinx/coroutines/internal/z0;->b:Lv3/p;

    invoke-interface {p0, v0, v1}, Lkotlin/coroutines/g;->fold(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final c(Lkotlin/coroutines/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lkotlinx/coroutines/internal/z0;->b(Lkotlin/coroutines/g;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    sget-object p0, Lkotlinx/coroutines/internal/z0;->a:Lkotlinx/coroutines/internal/t0;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    new-instance v0, Lkotlinx/coroutines/internal/f1;

    .line 22
    .line 23
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/internal/f1;-><init>(Lkotlin/coroutines/g;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lkotlinx/coroutines/internal/z0;->d:Lv3/p;

    .line 33
    .line 34
    invoke-interface {p0, v0, p1}, Lkotlin/coroutines/g;->fold(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    .line 40
    .line 41
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast p1, Lkotlinx/coroutines/n3;

    .line 45
    .line 46
    invoke-interface {p1, p0}, Lkotlinx/coroutines/n3;->updateThreadContext(Lkotlin/coroutines/g;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :goto_0
    return-object p0
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method
