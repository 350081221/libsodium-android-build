.class public final Landroidx/activity/result/ActivityResultCallerLauncher;
.super Landroidx/activity/result/ActivityResultLauncher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/activity/result/ActivityResultLauncher<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u0004\u0008\u0001\u0010\u00022\u0008\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010\n\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00028\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\'\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0011R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u000f\u001a\u0004\u0008\u001b\u0010\u0011\u00a8\u0006\u001e"
    }
    d2 = {
        "Landroidx/activity/result/ActivityResultCallerLauncher;",
        "I",
        "O",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lkotlin/r2;",
        "input",
        "Landroidx/core/app/ActivityOptionsCompat;",
        "options",
        "launch",
        "(Lkotlin/r2;Landroidx/core/app/ActivityOptionsCompat;)V",
        "unregister",
        "launcher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "callerContract",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "getCallerContract",
        "()Landroidx/activity/result/contract/ActivityResultContract;",
        "callerInput",
        "Ljava/lang/Object;",
        "getCallerInput",
        "()Ljava/lang/Object;",
        "resultContract$delegate",
        "Lkotlin/d0;",
        "getResultContract",
        "resultContract",
        "contract",
        "getContract",
        "<init>",
        "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;)V",
        "activity_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final callerContract:Landroidx/activity/result/contract/ActivityResultContract;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/contract/ActivityResultContract<",
            "TI;TO;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final callerInput:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TI;"
        }
    .end annotation
.end field

.field private final contract:Landroidx/activity/result/contract/ActivityResultContract;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/contract/ActivityResultContract<",
            "Lkotlin/r2;",
            "TO;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final launcher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "TI;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final resultContract$delegate:Lkotlin/d0;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Landroidx/activity/result/ActivityResultLauncher;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/activity/result/contract/ActivityResultContract;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "TI;>;",
            "Landroidx/activity/result/contract/ActivityResultContract<",
            "TI;TO;>;TI;)V"
        }
    .end annotation

    .line 1
    const-string v0, "launcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callerContract"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/activity/result/ActivityResultLauncher;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->launcher:Landroidx/activity/result/ActivityResultLauncher;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->callerContract:Landroidx/activity/result/contract/ActivityResultContract;

    .line 17
    .line 18
    iput-object p3, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->callerInput:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p1, Landroidx/activity/result/ActivityResultCallerLauncher$resultContract$2;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Landroidx/activity/result/ActivityResultCallerLauncher$resultContract$2;-><init>(Landroidx/activity/result/ActivityResultCallerLauncher;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/e0;->c(Lv3/a;)Lkotlin/d0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->resultContract$delegate:Lkotlin/d0;

    .line 30
    .line 31
    invoke-direct {p0}, Landroidx/activity/result/ActivityResultCallerLauncher;->getResultContract()Landroidx/activity/result/contract/ActivityResultContract;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->contract:Landroidx/activity/result/contract/ActivityResultContract;

    .line 36
    .line 37
    return-void
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method private final getResultContract()Landroidx/activity/result/contract/ActivityResultContract;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/activity/result/contract/ActivityResultContract<",
            "Lkotlin/r2;",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->resultContract$delegate:Lkotlin/d0;

    invoke-interface {v0}, Lkotlin/d0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    return-object v0
.end method


# virtual methods
.method public final getCallerContract()Landroidx/activity/result/contract/ActivityResultContract;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/activity/result/contract/ActivityResultContract<",
            "TI;TO;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->callerContract:Landroidx/activity/result/contract/ActivityResultContract;

    return-object v0
.end method

.method public final getCallerInput()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TI;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->callerInput:Ljava/lang/Object;

    return-object v0
.end method

.method public getContract()Landroidx/activity/result/contract/ActivityResultContract;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/activity/result/contract/ActivityResultContract<",
            "Lkotlin/r2;",
            "TO;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->contract:Landroidx/activity/result/contract/ActivityResultContract;

    return-object v0
.end method

.method public bridge synthetic launch(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V
    .locals 0

    .line 1
    check-cast p1, Lkotlin/r2;

    invoke-virtual {p0, p1, p2}, Landroidx/activity/result/ActivityResultCallerLauncher;->launch(Lkotlin/r2;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method

.method public launch(Lkotlin/r2;Landroidx/core/app/ActivityOptionsCompat;)V
    .locals 1
    .param p1    # Lkotlin/r2;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/core/app/ActivityOptionsCompat;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->launcher:Landroidx/activity/result/ActivityResultLauncher;

    iget-object v0, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->callerInput:Ljava/lang/Object;

    invoke-virtual {p1, v0, p2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method

.method public unregister()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/result/ActivityResultCallerLauncher;->launcher:Landroidx/activity/result/ActivityResultLauncher;

    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    return-void
.end method
