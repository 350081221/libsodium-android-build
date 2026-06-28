.class public final Landroidx/compose/runtime/changelist/OperationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a(\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a(\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002\u001a(\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a8\u0006\u0014"
    }
    d2 = {
        "Landroidx/compose/runtime/SlotWriter;",
        "slots",
        "Landroidx/compose/runtime/Applier;",
        "",
        "applier",
        "",
        "index",
        "Lkotlin/r2;",
        "positionToParentOf",
        "currentNodeIndex",
        "Landroidx/compose/runtime/Anchor;",
        "anchor",
        "positionToInsert",
        "Landroidx/compose/runtime/ControlledComposition;",
        "composition",
        "Landroidx/compose/runtime/CompositionContext;",
        "parentContext",
        "Landroidx/compose/runtime/MovableContentStateReference;",
        "reference",
        "releaseMovableGroupAtCurrent",
        "runtime_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,879:1\n166#2,8:880\n166#2,8:888\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n809#1:880,8\n869#1:888,8\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$positionToInsert(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/Applier;)I
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/changelist/OperationKt;->positionToInsert(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/Applier;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$positionToParentOf(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/changelist/OperationKt;->positionToParentOf(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;I)V

    return-void
.end method

.method public static final synthetic access$releaseMovableGroupAtCurrent(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/runtime/changelist/OperationKt;->releaseMovableGroupAtCurrent(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;)V

    return-void
.end method

.method private static final currentNodeIndex(Landroidx/compose/runtime/SlotWriter;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getParent()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/compose/runtime/SlotWriter;->isNode(I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroidx/compose/runtime/SlotWriter;->parent(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v2, 0x1

    .line 23
    add-int/2addr v1, v2

    .line 24
    const/4 v3, 0x0

    .line 25
    move v4, v3

    .line 26
    :goto_1
    if-ge v1, v0, :cond_4

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Landroidx/compose/runtime/SlotWriter;->indexInGroup(II)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroidx/compose/runtime/SlotWriter;->isNode(I)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    move v4, v3

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-virtual {p0, v1}, Landroidx/compose/runtime/SlotWriter;->isNode(I)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    move v5, v2

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    invoke-virtual {p0, v1}, Landroidx/compose/runtime/SlotWriter;->nodeCount(I)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    :goto_2
    add-int/2addr v4, v5

    .line 57
    invoke-virtual {p0, v1}, Landroidx/compose/runtime/SlotWriter;->groupSize(I)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    add-int/2addr v1, v5

    .line 62
    goto :goto_1

    .line 63
    :cond_4
    return v4
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

.method private static final positionToInsert(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/Applier;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/SlotWriter;",
            "Landroidx/compose/runtime/Anchor;",
            "Landroidx/compose/runtime/Applier<",
            "Ljava/lang/Object;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/SlotWriter;->anchorIndex(Landroidx/compose/runtime/Anchor;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-ge v0, p1, :cond_0

    .line 12
    .line 13
    move v0, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->runtimeCheck(Z)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, p2, p1}, Landroidx/compose/runtime/changelist/OperationKt;->positionToParentOf(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroidx/compose/runtime/changelist/OperationKt;->currentNodeIndex(Landroidx/compose/runtime/SlotWriter;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge v3, p1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/SlotWriter;->indexInCurrentGroup(I)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->isNode()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/SlotWriter;->node(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Applier;->down(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move v0, v2

    .line 56
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->startGroup()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->skipGroup()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    add-int/2addr v0, v3

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getCurrentGroup()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-ne p0, p1, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move v1, v2

    .line 74
    :goto_2
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->runtimeCheck(Z)V

    .line 75
    .line 76
    .line 77
    return v0
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

.method private static final positionToParentOf(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/SlotWriter;",
            "Landroidx/compose/runtime/Applier<",
            "Ljava/lang/Object;",
            ">;I)V"
        }
    .end annotation

    .line 1
    :goto_0
    invoke-virtual {p0, p2}, Landroidx/compose/runtime/SlotWriter;->indexInParent(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->skipToGroupEnd()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->getParent()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/SlotWriter;->isNode(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Landroidx/compose/runtime/Applier;->up()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->endGroup()I

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-void
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

.method private static final releaseMovableGroupAtCurrent(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;)V
    .locals 5

    .line 1
    new-instance v0, Landroidx/compose/runtime/SlotTable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/runtime/SlotTable;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->openWriter()Landroidx/compose/runtime/SlotWriter;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :try_start_0
    invoke-virtual {v1}, Landroidx/compose/runtime/SlotWriter;->beginInsert()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Landroidx/compose/runtime/MovableContentStateReference;->getContent$runtime_release()Landroidx/compose/runtime/MovableContent;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const v3, 0x78cc281

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v3, v2}, Landroidx/compose/runtime/SlotWriter;->startGroup(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x1

    .line 26
    invoke-static {v1, v2, v4, v3}, Landroidx/compose/runtime/SlotWriter;->markGroup$default(Landroidx/compose/runtime/SlotWriter;IILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Landroidx/compose/runtime/MovableContentStateReference;->getParameter$runtime_release()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Landroidx/compose/runtime/SlotWriter;->update(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Landroidx/compose/runtime/MovableContentStateReference;->getAnchor$runtime_release()Landroidx/compose/runtime/Anchor;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p3, v2, v4, v1}, Landroidx/compose/runtime/SlotWriter;->moveTo(Landroidx/compose/runtime/Anchor;ILandroidx/compose/runtime/SlotWriter;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {v1}, Landroidx/compose/runtime/SlotWriter;->skipGroup()I

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Landroidx/compose/runtime/SlotWriter;->endGroup()I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Landroidx/compose/runtime/SlotWriter;->endInsert()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Landroidx/compose/runtime/SlotWriter;->close()V

    .line 54
    .line 55
    .line 56
    new-instance v1, Landroidx/compose/runtime/MovableContentState;

    .line 57
    .line 58
    invoke-direct {v1, v0}, Landroidx/compose/runtime/MovableContentState;-><init>(Landroidx/compose/runtime/SlotTable;)V

    .line 59
    .line 60
    .line 61
    sget-object v2, Landroidx/compose/runtime/RecomposeScopeImpl;->Companion:Landroidx/compose/runtime/RecomposeScopeImpl$Companion;

    .line 62
    .line 63
    invoke-virtual {v2, v0, p3}, Landroidx/compose/runtime/RecomposeScopeImpl$Companion;->hasAnchoredRecomposeScopes$runtime_release(Landroidx/compose/runtime/SlotTable;Ljava/util/List;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_0

    .line 68
    .line 69
    new-instance v3, Landroidx/compose/runtime/changelist/OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1;

    .line 70
    .line 71
    invoke-direct {v3, p0, p2}, Landroidx/compose/runtime/changelist/OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1;-><init>(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/MovableContentStateReference;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/compose/runtime/SlotTable;->openWriter()Landroidx/compose/runtime/SlotWriter;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :try_start_1
    invoke-virtual {v2, p0, p3, v3}, Landroidx/compose/runtime/RecomposeScopeImpl$Companion;->adoptAnchoredScopes$runtime_release(Landroidx/compose/runtime/SlotWriter;Ljava/util/List;Landroidx/compose/runtime/RecomposeScopeOwner;)V

    .line 79
    .line 80
    .line 81
    sget-object p3, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->close()V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    invoke-virtual {p0}, Landroidx/compose/runtime/SlotWriter;->close()V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_0
    :goto_0
    invoke-virtual {p1, p2, v1}, Landroidx/compose/runtime/CompositionContext;->movableContentStateReleased$runtime_release(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :catchall_1
    move-exception p0

    .line 97
    invoke-virtual {v1}, Landroidx/compose/runtime/SlotWriter;->close()V

    .line 98
    .line 99
    .line 100
    throw p0
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
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
