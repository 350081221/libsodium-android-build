.class public final Landroidx/constraintlayout/compose/ChainStyle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/compose/ChainStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\u0008\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u0008\u0010\tR\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/ChainStyle;",
        "",
        "style",
        "Landroidx/constraintlayout/core/state/State$Chain;",
        "Landroidx/constraintlayout/compose/SolverChain;",
        "bias",
        "",
        "(Landroidx/constraintlayout/core/state/State$Chain;Ljava/lang/Float;)V",
        "getBias$compose_release",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getStyle$compose_release",
        "()Landroidx/constraintlayout/core/state/State$Chain;",
        "Companion",
        "compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Landroidx/constraintlayout/compose/ChainStyle$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Packed:Landroidx/constraintlayout/compose/ChainStyle;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Spread:Landroidx/constraintlayout/compose/ChainStyle;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final SpreadInside:Landroidx/constraintlayout/compose/ChainStyle;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final bias:Ljava/lang/Float;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final style:Landroidx/constraintlayout/core/state/State$Chain;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/ChainStyle$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/ChainStyle$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/constraintlayout/compose/ChainStyle;->Companion:Landroidx/constraintlayout/compose/ChainStyle$Companion;

    .line 8
    .line 9
    new-instance v2, Landroidx/constraintlayout/compose/ChainStyle;

    .line 10
    .line 11
    sget-object v3, Landroidx/constraintlayout/core/state/State$Chain;->SPREAD:Landroidx/constraintlayout/core/state/State$Chain;

    .line 12
    .line 13
    const/4 v4, 0x2

    .line 14
    invoke-direct {v2, v3, v1, v4, v1}, Landroidx/constraintlayout/compose/ChainStyle;-><init>(Landroidx/constraintlayout/core/state/State$Chain;Ljava/lang/Float;ILkotlin/jvm/internal/w;)V

    .line 15
    .line 16
    .line 17
    sput-object v2, Landroidx/constraintlayout/compose/ChainStyle;->Spread:Landroidx/constraintlayout/compose/ChainStyle;

    .line 18
    .line 19
    new-instance v2, Landroidx/constraintlayout/compose/ChainStyle;

    .line 20
    .line 21
    sget-object v3, Landroidx/constraintlayout/core/state/State$Chain;->SPREAD_INSIDE:Landroidx/constraintlayout/core/state/State$Chain;

    .line 22
    .line 23
    invoke-direct {v2, v3, v1, v4, v1}, Landroidx/constraintlayout/compose/ChainStyle;-><init>(Landroidx/constraintlayout/core/state/State$Chain;Ljava/lang/Float;ILkotlin/jvm/internal/w;)V

    .line 24
    .line 25
    .line 26
    sput-object v2, Landroidx/constraintlayout/compose/ChainStyle;->SpreadInside:Landroidx/constraintlayout/compose/ChainStyle;

    .line 27
    .line 28
    const/high16 v1, 0x3f000000    # 0.5f

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/compose/ChainStyle$Companion;->Packed(F)Landroidx/constraintlayout/compose/ChainStyle;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Landroidx/constraintlayout/compose/ChainStyle;->Packed:Landroidx/constraintlayout/compose/ChainStyle;

    .line 35
    .line 36
    return-void
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
.end method

.method public constructor <init>(Landroidx/constraintlayout/core/state/State$Chain;Ljava/lang/Float;)V
    .locals 1
    .param p1    # Landroidx/constraintlayout/core/state/State$Chain;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/constraintlayout/compose/ChainStyle;->style:Landroidx/constraintlayout/core/state/State$Chain;

    .line 3
    iput-object p2, p0, Landroidx/constraintlayout/compose/ChainStyle;->bias:Ljava/lang/Float;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/constraintlayout/core/state/State$Chain;Ljava/lang/Float;ILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/compose/ChainStyle;-><init>(Landroidx/constraintlayout/core/state/State$Chain;Ljava/lang/Float;)V

    return-void
.end method

.method public static final synthetic access$getPacked$cp()Landroidx/constraintlayout/compose/ChainStyle;
    .locals 1

    sget-object v0, Landroidx/constraintlayout/compose/ChainStyle;->Packed:Landroidx/constraintlayout/compose/ChainStyle;

    return-object v0
.end method

.method public static final synthetic access$getSpread$cp()Landroidx/constraintlayout/compose/ChainStyle;
    .locals 1

    sget-object v0, Landroidx/constraintlayout/compose/ChainStyle;->Spread:Landroidx/constraintlayout/compose/ChainStyle;

    return-object v0
.end method

.method public static final synthetic access$getSpreadInside$cp()Landroidx/constraintlayout/compose/ChainStyle;
    .locals 1

    sget-object v0, Landroidx/constraintlayout/compose/ChainStyle;->SpreadInside:Landroidx/constraintlayout/compose/ChainStyle;

    return-object v0
.end method


# virtual methods
.method public final getBias$compose_release()Ljava/lang/Float;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/ChainStyle;->bias:Ljava/lang/Float;

    return-object v0
.end method

.method public final getStyle$compose_release()Landroidx/constraintlayout/core/state/State$Chain;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/ChainStyle;->style:Landroidx/constraintlayout/core/state/State$Chain;

    return-object v0
.end method
