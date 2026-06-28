.class public final Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;",
        "",
        "value",
        "",
        "(I)V",
        "getValue$foundation_release",
        "()I",
        "Companion",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final FullLine:Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final SingleLane:Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;->Companion:Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;->FullLine:Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;

    .line 16
    .line 17
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;->SingleLane:Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;

    .line 24
    .line 25
    return-void
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

.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;->value:I

    return-void
.end method

.method public static final synthetic access$getFullLine$cp()Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;->FullLine:Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;

    return-object v0
.end method

.method public static final synthetic access$getSingleLane$cp()Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;->SingleLane:Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;

    return-object v0
.end method


# virtual methods
.method public final getValue$foundation_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;->value:I

    return v0
.end method
