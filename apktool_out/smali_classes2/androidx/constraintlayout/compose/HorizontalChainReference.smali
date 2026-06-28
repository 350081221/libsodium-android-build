.class public final Landroidx/constraintlayout/compose/HorizontalChainReference;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000b\u0010\u0007\u001a\u0004\u0008\u000c\u0010\tR\u001c\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000e\u0010\u0007\u001a\u0004\u0008\u000f\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0013\u0010\u0007\u001a\u0004\u0008\u0014\u0010\t\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/HorizontalChainReference;",
        "",
        "id",
        "(Ljava/lang/Object;)V",
        "absoluteLeft",
        "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;",
        "getAbsoluteLeft$annotations",
        "()V",
        "getAbsoluteLeft",
        "()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;",
        "absoluteRight",
        "getAbsoluteRight$annotations",
        "getAbsoluteRight",
        "end",
        "getEnd$annotations",
        "getEnd",
        "getId$compose_release",
        "()Ljava/lang/Object;",
        "start",
        "getStart$annotations",
        "getStart",
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


# instance fields
.field private final absoluteLeft:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final absoluteRight:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final end:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final id:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final start:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/constraintlayout/compose/HorizontalChainReference;->id:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 12
    .line 13
    const/4 v1, -0x2

    .line 14
    invoke-direct {v0, p1, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainReference;->start:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 18
    .line 19
    new-instance v0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p1, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainReference;->absoluteLeft:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 26
    .line 27
    new-instance v0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 28
    .line 29
    const/4 v1, -0x1

    .line 30
    invoke-direct {v0, p1, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainReference;->end:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 34
    .line 35
    new-instance v0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p1, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainReference;->absoluteRight:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 42
    .line 43
    return-void
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
.end method

.method public static synthetic getAbsoluteLeft$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getAbsoluteRight$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getEnd$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method

.method public static synthetic getStart$annotations()V
    .locals 0
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    return-void
.end method


# virtual methods
.method public final getAbsoluteLeft()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainReference;->absoluteLeft:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    return-object v0
.end method

.method public final getAbsoluteRight()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainReference;->absoluteRight:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    return-object v0
.end method

.method public final getEnd()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainReference;->end:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    return-object v0
.end method

.method public final getId$compose_release()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainReference;->id:Ljava/lang/Object;

    return-object v0
.end method

.method public final getStart()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainReference;->start:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    return-object v0
.end method
