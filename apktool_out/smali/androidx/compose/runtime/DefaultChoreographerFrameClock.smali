.class final Landroidx/compose/runtime/DefaultChoreographerFrameClock;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/MonotonicFrameClock;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J9\u0010\t\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00022!\u0010\u0008\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\u0005\u0012\u0008\u0008\u0006\u0012\u0004\u0008\u0008(\u0007\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001c\u0010\r\u001a\n \u000c*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/runtime/DefaultChoreographerFrameClock;",
        "Landroidx/compose/runtime/MonotonicFrameClock;",
        "R",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/v0;",
        "name",
        "frameTimeNanos",
        "onFrame",
        "withFrameNanos",
        "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Landroid/view/Choreographer;",
        "kotlin.jvm.PlatformType",
        "choreographer",
        "Landroid/view/Choreographer;",
        "<init>",
        "()V",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,126:1\n314#2,11:127\n*S KotlinDebug\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n*L\n64#1:127,11\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/runtime/DefaultChoreographerFrameClock;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final choreographer:Landroid/view/Choreographer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/runtime/DefaultChoreographerFrameClock;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/runtime/DefaultChoreographerFrameClock;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/runtime/DefaultChoreographerFrameClock;->INSTANCE:Landroidx/compose/runtime/DefaultChoreographerFrameClock;

    .line 7
    .line 8
    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lkotlinx/coroutines/x2;->C0()Lkotlinx/coroutines/x2;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Landroidx/compose/runtime/DefaultChoreographerFrameClock$choreographer$1;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, v2}, Landroidx/compose/runtime/DefaultChoreographerFrameClock$choreographer$1;-><init>(Lkotlin/coroutines/d;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlinx/coroutines/i;->f(Lkotlin/coroutines/g;Lv3/p;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/view/Choreographer;

    .line 27
    .line 28
    sput-object v0, Landroidx/compose/runtime/DefaultChoreographerFrameClock;->choreographer:Landroid/view/Choreographer;

    .line 29
    .line 30
    return-void
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
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getChoreographer$p()Landroid/view/Choreographer;
    .locals 1

    sget-object v0, Landroidx/compose/runtime/DefaultChoreographerFrameClock;->choreographer:Landroid/view/Choreographer;

    return-object v0
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;
    .locals 0
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lv3/p<",
            "-TR;-",
            "Lkotlin/coroutines/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/MonotonicFrameClock$DefaultImpls;->fold(Landroidx/compose/runtime/MonotonicFrameClock;Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;
    .locals 0
    .param p1    # Lkotlin/coroutines/g$c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lkotlin/coroutines/g$b;",
            ">(",
            "Lkotlin/coroutines/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/runtime/MonotonicFrameClock$DefaultImpls;->get(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;

    move-result-object p1

    return-object p1
.end method

.method public minusKey(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;
    .locals 0
    .param p1    # Lkotlin/coroutines/g$c;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/g$c<",
            "*>;)",
            "Lkotlin/coroutines/g;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/runtime/MonotonicFrameClock$DefaultImpls;->minusKey(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;

    move-result-object p1

    return-object p1
.end method

.method public plus(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;
    .locals 0
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0, p1}, Landroidx/compose/runtime/MonotonicFrameClock$DefaultImpls;->plus(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/coroutines/g;)Lkotlin/coroutines/g;

    move-result-object p1

    return-object p1
.end method

.method public withFrameNanos(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Long;",
            "+TR;>;",
            "Lkotlin/coroutines/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    new-instance v0, Lkotlinx/coroutines/q;

    .line 2
    .line 3
    invoke-static {p2}, Lkotlin/coroutines/intrinsics/b;->e(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/q;-><init>(Lkotlin/coroutines/d;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->B()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1;

    .line 15
    .line 16
    invoke-direct {v1, v0, p1}, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1;-><init>(Lkotlinx/coroutines/p;Lv3/l;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroidx/compose/runtime/DefaultChoreographerFrameClock;->access$getChoreographer$p()Landroid/view/Choreographer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$1;

    .line 27
    .line 28
    invoke-direct {p1, v1}, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$1;-><init>(Landroid/view/Choreographer$FrameCallback;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p1}, Lkotlinx/coroutines/p;->g(Lv3/l;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lkotlinx/coroutines/q;->E()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lkotlin/coroutines/d;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-object p1
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
.end method
