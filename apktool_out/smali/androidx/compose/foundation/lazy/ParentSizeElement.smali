.class final Landroidx/compose/foundation/lazy/ParentSizeElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/lazy/ParentSizeNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0010\u0008\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014\u0012\u0010\u0008\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008 \u0010!J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\u0008\u0010\u000c\u001a\u00020\u000bH\u0016J\u000c\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006\""
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/ParentSizeElement;",
        "Landroidx/compose/ui/node/ModifierNodeElement;",
        "Landroidx/compose/foundation/lazy/ParentSizeNode;",
        "create",
        "node",
        "Lkotlin/r2;",
        "update",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "inspectableProperties",
        "",
        "fraction",
        "F",
        "getFraction",
        "()F",
        "Landroidx/compose/runtime/State;",
        "widthState",
        "Landroidx/compose/runtime/State;",
        "getWidthState",
        "()Landroidx/compose/runtime/State;",
        "heightState",
        "getHeightState",
        "",
        "inspectorName",
        "Ljava/lang/String;",
        "getInspectorName",
        "()Ljava/lang/String;",
        "<init>",
        "(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)V",
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
.field private final fraction:F

.field private final heightState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private final inspectorName:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final widthState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)V
    .locals 0
    .param p2    # Landroidx/compose/runtime/State;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/State;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 3
    iput p1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->fraction:F

    .line 4
    iput-object p2, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->widthState:Landroidx/compose/runtime/State;

    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->heightState:Landroidx/compose/runtime/State;

    .line 6
    iput-object p4, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->inspectorName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;ILkotlin/jvm/internal/w;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    move-object p3, v0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/lazy/ParentSizeElement;-><init>(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public create()Landroidx/compose/foundation/lazy/ParentSizeNode;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/foundation/lazy/ParentSizeNode;

    .line 3
    iget v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->fraction:F

    .line 4
    iget-object v2, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->widthState:Landroidx/compose/runtime/State;

    .line 5
    iget-object v3, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->heightState:Landroidx/compose/runtime/State;

    .line 6
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/ParentSizeNode;-><init>(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/ParentSizeElement;->create()Landroidx/compose/foundation/lazy/ParentSizeNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->fraction:F

    .line 12
    .line 13
    check-cast p1, Landroidx/compose/foundation/lazy/ParentSizeElement;

    .line 14
    .line 15
    iget v3, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;->fraction:F

    .line 16
    .line 17
    cmpg-float v1, v1, v3

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    move v1, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_2
    move v1, v2

    .line 24
    :goto_0
    if-eqz v1, :cond_3

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->widthState:Landroidx/compose/runtime/State;

    .line 27
    .line 28
    iget-object v3, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;->widthState:Landroidx/compose/runtime/State;

    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->heightState:Landroidx/compose/runtime/State;

    .line 37
    .line 38
    iget-object p1, p1, Landroidx/compose/foundation/lazy/ParentSizeElement;->heightState:Landroidx/compose/runtime/State;

    .line 39
    .line 40
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    move v0, v2

    .line 48
    :goto_1
    return v0
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
.end method

.method public final getFraction()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->fraction:F

    return v0
.end method

.method public final getHeightState()Landroidx/compose/runtime/State;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->heightState:Landroidx/compose/runtime/State;

    return-object v0
.end method

.method public final getInspectorName()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->inspectorName:Ljava/lang/String;

    return-object v0
.end method

.method public final getWidthState()Landroidx/compose/runtime/State;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->widthState:Landroidx/compose/runtime/State;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->widthState:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->heightState:Landroidx/compose/runtime/State;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    :cond_1
    add-int/2addr v0, v1

    .line 23
    mul-int/lit8 v0, v0, 0x1f

    .line 24
    .line 25
    iget v1, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->fraction:F

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v0, v1

    .line 32
    return v0
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

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/platform/InspectorInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->inspectorName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->fraction:F

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public update(Landroidx/compose/foundation/lazy/ParentSizeNode;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/lazy/ParentSizeNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->fraction:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/ParentSizeNode;->setFraction(F)V

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->widthState:Landroidx/compose/runtime/State;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/ParentSizeNode;->setWidthState(Landroidx/compose/runtime/State;)V

    .line 4
    iget-object v0, p0, Landroidx/compose/foundation/lazy/ParentSizeElement;->heightState:Landroidx/compose/runtime/State;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/ParentSizeNode;->setHeightState(Landroidx/compose/runtime/State;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/ParentSizeNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/ParentSizeElement;->update(Landroidx/compose/foundation/lazy/ParentSizeNode;)V

    return-void
.end method
