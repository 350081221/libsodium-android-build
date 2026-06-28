.class final Landroidx/compose/foundation/lazy/AnimateItemElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0082\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\'\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\t\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u000c\u0010\u0008\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\tH\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\tH\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0019\u001a\u0004\u0008\u001c\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/AnimateItemElement;",
        "Landroidx/compose/ui/node/ModifierNodeElement;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;",
        "create",
        "node",
        "Lkotlin/r2;",
        "update",
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "inspectableProperties",
        "Landroidx/compose/animation/core/FiniteAnimationSpec;",
        "",
        "component1",
        "Landroidx/compose/ui/unit/IntOffset;",
        "component2",
        "appearanceSpec",
        "placementSpec",
        "copy",
        "",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "Landroidx/compose/animation/core/FiniteAnimationSpec;",
        "getAppearanceSpec",
        "()Landroidx/compose/animation/core/FiniteAnimationSpec;",
        "getPlacementSpec",
        "<init>",
        "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private final placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntOffset;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)V
    .locals 0
    .param p1    # Landroidx/compose/animation/core/FiniteAnimationSpec;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/animation/core/FiniteAnimationSpec;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntOffset;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public static synthetic copy$default(Landroidx/compose/foundation/lazy/AnimateItemElement;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;ILjava/lang/Object;)Landroidx/compose/foundation/lazy/AnimateItemElement;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    :cond_1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/AnimateItemElement;->copy(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/foundation/lazy/AnimateItemElement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    return-object v0
.end method

.method public final component2()Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntOffset;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    return-object v0
.end method

.method public final copy(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/foundation/lazy/AnimateItemElement;
    .locals 1
    .param p1    # Landroidx/compose/animation/core/FiniteAnimationSpec;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/animation/core/FiniteAnimationSpec;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntOffset;",
            ">;)",
            "Landroidx/compose/foundation/lazy/AnimateItemElement;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/lazy/AnimateItemElement;

    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/lazy/AnimateItemElement;-><init>(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)V

    return-object v0
.end method

.method public create()Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    iget-object v2, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;-><init>(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/AnimateItemElement;->create()Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/lazy/AnimateItemElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/lazy/AnimateItemElement;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    iget-object v3, p1, Landroidx/compose/foundation/lazy/AnimateItemElement;->appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    iget-object p1, p1, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getAppearanceSpec()Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    return-object v0
.end method

.method public final getPlacementSpec()Landroidx/compose/animation/core/FiniteAnimationSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Landroidx/compose/ui/unit/IntOffset;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/platform/InspectorInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "animateItemPlacement"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AnimateItemElement(appearanceSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placementSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public update(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->appearanceSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;->setAppearanceSpec(Landroidx/compose/animation/core/FiniteAnimationSpec;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/lazy/AnimateItemElement;->placementSpec:Landroidx/compose/animation/core/FiniteAnimationSpec;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;->setPlacementSpec(Landroidx/compose/animation/core/FiniteAnimationSpec;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/AnimateItemElement;->update(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;)V

    return-void
.end method
