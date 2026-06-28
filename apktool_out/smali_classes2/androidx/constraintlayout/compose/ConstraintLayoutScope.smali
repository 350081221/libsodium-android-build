.class public final Landroidx/constraintlayout/compose/ConstraintLayoutScope;
.super Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/compose/foundation/layout/LayoutScopeMarker;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;,
        Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\t\u0008\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u000c\u0010\u0005\u001a\u00060\u0004R\u00020\u0000H\u0007J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016J-\u0010\u000e\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\t\u001a\u00020\u00022\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\u0002\u0008\u000cH\u0007R\u001c\u0010\u000f\u001a\u0008\u0018\u00010\u0004R\u00020\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0013R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/ConstraintLayoutScope;",
        "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;",
        "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "createRef",
        "Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;",
        "createRefs",
        "Lkotlin/r2;",
        "reset",
        "Landroidx/compose/ui/Modifier;",
        "ref",
        "Lkotlin/Function1;",
        "Landroidx/constraintlayout/compose/ConstrainScope;",
        "Lkotlin/u;",
        "constrainBlock",
        "constrainAs",
        "referencesObject",
        "Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;",
        "",
        "ChildrenStartIndex",
        "I",
        "childId",
        "Ljava/util/ArrayList;",
        "childrenRefs",
        "Ljava/util/ArrayList;",
        "<init>",
        "()V",
        "ConstrainAsModifier",
        "ConstrainedLayoutReferences",
        "compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final ChildrenStartIndex:I

.field private childId:I

.field private final childrenRefs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private referencesObject:Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation build Lkotlin/a1;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;-><init>()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->ChildrenStartIndex:I

    .line 5
    .line 6
    iput v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->childId:I

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->childrenRefs:Ljava/util/ArrayList;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final constrainAs(Landroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lv3/l;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
            "Lv3/l<",
            "-",
            "Landroidx/constraintlayout/compose/ConstrainScope;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ref"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "constrainBlock"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier;

    .line 17
    .line 18
    invoke-direct {v0, p2, p3}, Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier;-><init>(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lv3/l;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
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
    .line 112
    .line 113
    .line 114
.end method

.method public final createRef()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->childrenRefs:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget v1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->childId:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->childId:I

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/collections/u;->T2(Ljava/util/List;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 18
    .line 19
    iget v1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->childId:I

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->childrenRefs:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-object v0
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
.end method

.method public final createRefs()Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->referencesObject:Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;-><init>(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V

    iput-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->referencesObject:Landroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainedLayoutReferences;

    :cond_0
    return-object v0
.end method

.method public reset()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->reset()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->ChildrenStartIndex:I

    .line 5
    .line 6
    iput v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutScope;->childId:I

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
