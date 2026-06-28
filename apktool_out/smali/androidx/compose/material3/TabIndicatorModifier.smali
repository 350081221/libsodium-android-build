.class public final Landroidx/compose/material3/TabIndicatorModifier;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/material3/TabIndicatorOffsetNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000e\u0008\u0080\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\t\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u00a2\u0006\u0004\u0008$\u0010%J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u000c\u0010\u0008\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0015\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\tH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J3\u0010\u0014\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000fH\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u000f2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003R#\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0012\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Landroidx/compose/material3/TabIndicatorModifier;",
        "Landroidx/compose/ui/node/ModifierNodeElement;",
        "Landroidx/compose/material3/TabIndicatorOffsetNode;",
        "create",
        "node",
        "Lkotlin/r2;",
        "update",
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "inspectableProperties",
        "Landroidx/compose/runtime/State;",
        "",
        "Landroidx/compose/material3/TabPosition;",
        "component1",
        "",
        "component2",
        "",
        "component3",
        "tabPositionsState",
        "selectedTabIndex",
        "followContentSize",
        "copy",
        "",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "Landroidx/compose/runtime/State;",
        "getTabPositionsState",
        "()Landroidx/compose/runtime/State;",
        "I",
        "getSelectedTabIndex",
        "()I",
        "Z",
        "getFollowContentSize",
        "()Z",
        "<init>",
        "(Landroidx/compose/runtime/State;IZ)V",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final followContentSize:Z

.field private final selectedTabIndex:I

.field private final tabPositionsState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/runtime/State;IZ)V
    .locals 0
    .param p1    # Landroidx/compose/runtime/State;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;>;IZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material3/TabIndicatorModifier;->tabPositionsState:Landroidx/compose/runtime/State;

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/material3/TabIndicatorModifier;->selectedTabIndex:I

    .line 7
    .line 8
    iput-boolean p3, p0, Landroidx/compose/material3/TabIndicatorModifier;->followContentSize:Z

    .line 9
    .line 10
    return-void
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

.method public static synthetic copy$default(Landroidx/compose/material3/TabIndicatorModifier;Landroidx/compose/runtime/State;IZILjava/lang/Object;)Landroidx/compose/material3/TabIndicatorModifier;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Landroidx/compose/material3/TabIndicatorModifier;->tabPositionsState:Landroidx/compose/runtime/State;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Landroidx/compose/material3/TabIndicatorModifier;->selectedTabIndex:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Landroidx/compose/material3/TabIndicatorModifier;->followContentSize:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material3/TabIndicatorModifier;->copy(Landroidx/compose/runtime/State;IZ)Landroidx/compose/material3/TabIndicatorModifier;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/runtime/State;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/State<",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/TabIndicatorModifier;->tabPositionsState:Landroidx/compose/runtime/State;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Landroidx/compose/material3/TabIndicatorModifier;->selectedTabIndex:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/material3/TabIndicatorModifier;->followContentSize:Z

    return v0
.end method

.method public final copy(Landroidx/compose/runtime/State;IZ)Landroidx/compose/material3/TabIndicatorModifier;
    .locals 1
    .param p1    # Landroidx/compose/runtime/State;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;>;IZ)",
            "Landroidx/compose/material3/TabIndicatorModifier;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/material3/TabIndicatorModifier;

    invoke-direct {v0, p1, p2, p3}, Landroidx/compose/material3/TabIndicatorModifier;-><init>(Landroidx/compose/runtime/State;IZ)V

    return-object v0
.end method

.method public create()Landroidx/compose/material3/TabIndicatorOffsetNode;
    .locals 4
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/material3/TabIndicatorOffsetNode;

    .line 3
    iget-object v1, p0, Landroidx/compose/material3/TabIndicatorModifier;->tabPositionsState:Landroidx/compose/runtime/State;

    .line 4
    iget v2, p0, Landroidx/compose/material3/TabIndicatorModifier;->selectedTabIndex:I

    .line 5
    iget-boolean v3, p0, Landroidx/compose/material3/TabIndicatorModifier;->followContentSize:Z

    .line 6
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/material3/TabIndicatorOffsetNode;-><init>(Landroidx/compose/runtime/State;IZ)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/TabIndicatorModifier;->create()Landroidx/compose/material3/TabIndicatorOffsetNode;

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
    instance-of v1, p1, Landroidx/compose/material3/TabIndicatorModifier;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/material3/TabIndicatorModifier;

    iget-object v1, p0, Landroidx/compose/material3/TabIndicatorModifier;->tabPositionsState:Landroidx/compose/runtime/State;

    iget-object v3, p1, Landroidx/compose/material3/TabIndicatorModifier;->tabPositionsState:Landroidx/compose/runtime/State;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Landroidx/compose/material3/TabIndicatorModifier;->selectedTabIndex:I

    iget v3, p1, Landroidx/compose/material3/TabIndicatorModifier;->selectedTabIndex:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Landroidx/compose/material3/TabIndicatorModifier;->followContentSize:Z

    iget-boolean p1, p1, Landroidx/compose/material3/TabIndicatorModifier;->followContentSize:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getFollowContentSize()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/material3/TabIndicatorModifier;->followContentSize:Z

    return v0
.end method

.method public final getSelectedTabIndex()I
    .locals 1

    iget v0, p0, Landroidx/compose/material3/TabIndicatorModifier;->selectedTabIndex:I

    return v0
.end method

.method public final getTabPositionsState()Landroidx/compose/runtime/State;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/State<",
            "Ljava/util/List<",
            "Landroidx/compose/material3/TabPosition;",
            ">;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material3/TabIndicatorModifier;->tabPositionsState:Landroidx/compose/runtime/State;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/material3/TabIndicatorModifier;->tabPositionsState:Landroidx/compose/runtime/State;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/material3/TabIndicatorModifier;->selectedTabIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/material3/TabIndicatorModifier;->followContentSize:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/platform/InspectorInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TabIndicatorModifier(tabPositionsState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/material3/TabIndicatorModifier;->tabPositionsState:Landroidx/compose/runtime/State;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedTabIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/material3/TabIndicatorModifier;->selectedTabIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", followContentSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/material3/TabIndicatorModifier;->followContentSize:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public update(Landroidx/compose/material3/TabIndicatorOffsetNode;)V
    .locals 1
    .param p1    # Landroidx/compose/material3/TabIndicatorOffsetNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/TabIndicatorModifier;->tabPositionsState:Landroidx/compose/runtime/State;

    invoke-virtual {p1, v0}, Landroidx/compose/material3/TabIndicatorOffsetNode;->setTabPositionsState(Landroidx/compose/runtime/State;)V

    .line 3
    iget v0, p0, Landroidx/compose/material3/TabIndicatorModifier;->selectedTabIndex:I

    invoke-virtual {p1, v0}, Landroidx/compose/material3/TabIndicatorOffsetNode;->setSelectedTabIndex(I)V

    .line 4
    iget-boolean v0, p0, Landroidx/compose/material3/TabIndicatorModifier;->followContentSize:Z

    invoke-virtual {p1, v0}, Landroidx/compose/material3/TabIndicatorOffsetNode;->setFollowContentSize(Z)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/material3/TabIndicatorOffsetNode;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/TabIndicatorModifier;->update(Landroidx/compose/material3/TabIndicatorOffsetNode;)V

    return-void
.end method
