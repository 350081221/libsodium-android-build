.class public final Landroidx/constraintlayout/compose/HorizontalChainScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/compose/foundation/layout/LayoutScopeMarker;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005R,\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00070\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0015\u001a\u0004\u0008\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0015\u001a\u0004\u0008\u001d\u0010\u0017\u00a8\u0006 "
    }
    d2 = {
        "Landroidx/constraintlayout/compose/HorizontalChainScope;",
        "",
        "id",
        "Ljava/lang/Object;",
        "getId$compose_release",
        "()Ljava/lang/Object;",
        "",
        "Lkotlin/Function1;",
        "Landroidx/constraintlayout/compose/State;",
        "Lkotlin/r2;",
        "tasks",
        "Ljava/util/List;",
        "getTasks$compose_release",
        "()Ljava/util/List;",
        "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "parent",
        "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "getParent",
        "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "Landroidx/constraintlayout/compose/VerticalAnchorable;",
        "start",
        "Landroidx/constraintlayout/compose/VerticalAnchorable;",
        "getStart",
        "()Landroidx/constraintlayout/compose/VerticalAnchorable;",
        "absoluteLeft",
        "getAbsoluteLeft",
        "end",
        "getEnd",
        "absoluteRight",
        "getAbsoluteRight",
        "<init>",
        "(Ljava/lang/Object;)V",
        "compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field private final absoluteLeft:Landroidx/constraintlayout/compose/VerticalAnchorable;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final absoluteRight:Landroidx/constraintlayout/compose/VerticalAnchorable;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final end:Landroidx/constraintlayout/compose/VerticalAnchorable;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final id:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final parent:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final start:Landroidx/constraintlayout/compose/VerticalAnchorable;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final tasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv3/l<",
            "Landroidx/constraintlayout/compose/State;",
            "Lkotlin/r2;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 4
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
    iput-object p1, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->id:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->tasks:Ljava/util/List;

    .line 17
    .line 18
    new-instance v1, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 19
    .line 20
    sget-object v2, Landroidx/constraintlayout/core/state/State;->PARENT:Ljava/lang/Integer;

    .line 21
    .line 22
    const-string v3, "PARENT"

    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, v2}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->parent:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 31
    .line 32
    new-instance v1, Landroidx/constraintlayout/compose/ChainVerticalAnchorable;

    .line 33
    .line 34
    const/4 v2, -0x2

    .line 35
    invoke-direct {v1, v0, p1, v2}, Landroidx/constraintlayout/compose/ChainVerticalAnchorable;-><init>(Ljava/util/List;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->start:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 39
    .line 40
    new-instance v1, Landroidx/constraintlayout/compose/ChainVerticalAnchorable;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v1, v0, p1, v2}, Landroidx/constraintlayout/compose/ChainVerticalAnchorable;-><init>(Ljava/util/List;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->absoluteLeft:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 47
    .line 48
    new-instance v1, Landroidx/constraintlayout/compose/ChainVerticalAnchorable;

    .line 49
    .line 50
    const/4 v2, -0x1

    .line 51
    invoke-direct {v1, v0, p1, v2}, Landroidx/constraintlayout/compose/ChainVerticalAnchorable;-><init>(Ljava/util/List;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->end:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 55
    .line 56
    new-instance v1, Landroidx/constraintlayout/compose/ChainVerticalAnchorable;

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-direct {v1, v0, p1, v2}, Landroidx/constraintlayout/compose/ChainVerticalAnchorable;-><init>(Ljava/util/List;Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    iput-object v1, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->absoluteRight:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 63
    .line 64
    return-void
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


# virtual methods
.method public final getAbsoluteLeft()Landroidx/constraintlayout/compose/VerticalAnchorable;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->absoluteLeft:Landroidx/constraintlayout/compose/VerticalAnchorable;

    return-object v0
.end method

.method public final getAbsoluteRight()Landroidx/constraintlayout/compose/VerticalAnchorable;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->absoluteRight:Landroidx/constraintlayout/compose/VerticalAnchorable;

    return-object v0
.end method

.method public final getEnd()Landroidx/constraintlayout/compose/VerticalAnchorable;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->end:Landroidx/constraintlayout/compose/VerticalAnchorable;

    return-object v0
.end method

.method public final getId$compose_release()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->id:Ljava/lang/Object;

    return-object v0
.end method

.method public final getParent()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->parent:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    return-object v0
.end method

.method public final getStart()Landroidx/constraintlayout/compose/VerticalAnchorable;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->start:Landroidx/constraintlayout/compose/VerticalAnchorable;

    return-object v0
.end method

.method public final getTasks$compose_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv3/l<",
            "Landroidx/constraintlayout/compose/State;",
            "Lkotlin/r2;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/HorizontalChainScope;->tasks:Ljava/util/List;

    return-object v0
.end method
