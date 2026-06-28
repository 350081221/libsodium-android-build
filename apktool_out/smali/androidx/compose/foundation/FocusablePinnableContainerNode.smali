.class final Landroidx/compose/foundation/FocusablePinnableContainerNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;
.implements Landroidx/compose/ui/node/ObserverModifierNode;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006J\u0008\u0010\n\u001a\u00020\u0008H\u0016J\u0008\u0010\u000b\u001a\u00020\u0008H\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/foundation/FocusablePinnableContainerNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;",
        "Landroidx/compose/ui/node/ObserverModifierNode;",
        "Landroidx/compose/ui/layout/PinnableContainer;",
        "retrievePinnableContainer",
        "",
        "focused",
        "Lkotlin/r2;",
        "setFocus",
        "onReset",
        "onObservedReadsChanged",
        "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;",
        "pinnedHandle",
        "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;",
        "isFocused",
        "Z",
        "<init>",
        "()V",
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
.field private isFocused:Z

.field private pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    return-void
.end method

.method private final retrievePinnableContainer()Landroidx/compose/ui/layout/PinnableContainer;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/k1$h;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/compose/foundation/FocusablePinnableContainerNode$retrievePinnableContainer$1;

    .line 7
    .line 8
    invoke-direct {v1, v0, p0}, Landroidx/compose/foundation/FocusablePinnableContainerNode$retrievePinnableContainer$1;-><init>(Lkotlin/jvm/internal/k1$h;Landroidx/compose/foundation/FocusablePinnableContainerNode;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Landroidx/compose/ui/node/ObserverModifierNodeKt;->observeReads(Landroidx/compose/ui/Modifier$Node;Lv3/a;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroidx/compose/ui/layout/PinnableContainer;

    .line 17
    .line 18
    return-object v0
    .line 19
.end method


# virtual methods
.method public onObservedReadsChanged()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/FocusablePinnableContainerNode;->retrievePinnableContainer()Landroidx/compose/ui/layout/PinnableContainer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, Landroidx/compose/foundation/FocusablePinnableContainerNode;->isFocused:Z

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/foundation/FocusablePinnableContainerNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;->release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Landroidx/compose/ui/layout/PinnableContainer;->pin()Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    iput-object v0, p0, Landroidx/compose/foundation/FocusablePinnableContainerNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 25
    .line 26
    :cond_2
    return-void
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

.method public onReset()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/FocusablePinnableContainerNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;->release()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroidx/compose/foundation/FocusablePinnableContainerNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

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
.end method

.method public final setFocus(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/compose/foundation/FocusablePinnableContainerNode;->retrievePinnableContainer()Landroidx/compose/ui/layout/PinnableContainer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Landroidx/compose/ui/layout/PinnableContainer;->pin()Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    iput-object v0, p0, Landroidx/compose/foundation/FocusablePinnableContainerNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/FocusablePinnableContainerNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-interface {v1}, Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;->release()V

    .line 22
    .line 23
    .line 24
    :cond_2
    iput-object v0, p0, Landroidx/compose/foundation/FocusablePinnableContainerNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 25
    .line 26
    :goto_0
    iput-boolean p1, p0, Landroidx/compose/foundation/FocusablePinnableContainerNode;->isFocused:Z

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
.end method
