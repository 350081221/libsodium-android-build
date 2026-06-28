.class final Landroidx/compose/foundation/draganddrop/DropTargetElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B2\u0012!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u000c\u0010\u0008\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0013\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\u0008\u0010\u000e\u001a\u00020\rH\u0016R2\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/compose/foundation/draganddrop/DropTargetElement;",
        "Landroidx/compose/ui/node/ModifierNodeElement;",
        "Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;",
        "create",
        "node",
        "Lkotlin/r2;",
        "update",
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "inspectableProperties",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/draganddrop/DragAndDropEvent;",
        "Lkotlin/v0;",
        "name",
        "event",
        "shouldStartDragAndDrop",
        "Lv3/l;",
        "getShouldStartDragAndDrop",
        "()Lv3/l;",
        "Landroidx/compose/ui/draganddrop/DragAndDropTarget;",
        "target",
        "Landroidx/compose/ui/draganddrop/DragAndDropTarget;",
        "getTarget",
        "()Landroidx/compose/ui/draganddrop/DragAndDropTarget;",
        "<init>",
        "(Lv3/l;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V",
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
.field private final shouldStartDragAndDrop:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/draganddrop/DragAndDropEvent;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final target:Landroidx/compose/ui/draganddrop/DragAndDropTarget;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv3/l;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/draganddrop/DragAndDropTarget;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/draganddrop/DragAndDropEvent;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/ui/draganddrop/DragAndDropTarget;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->shouldStartDragAndDrop:Lv3/l;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->target:Landroidx/compose/ui/draganddrop/DragAndDropTarget;

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


# virtual methods
.method public create()Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->target:Landroidx/compose/ui/draganddrop/DragAndDropTarget;

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->shouldStartDragAndDrop:Lv3/l;

    .line 4
    new-instance v2, Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;

    invoke-direct {v2, v1, v0}, Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;-><init>(Lv3/l;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V

    return-object v2
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/draganddrop/DropTargetElement;->create()Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/draganddrop/DropTargetElement;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v1

    .line 11
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->target:Landroidx/compose/ui/draganddrop/DragAndDropTarget;

    .line 12
    .line 13
    check-cast p1, Landroidx/compose/foundation/draganddrop/DropTargetElement;

    .line 14
    .line 15
    iget-object v2, p1, Landroidx/compose/foundation/draganddrop/DropTargetElement;->target:Landroidx/compose/ui/draganddrop/DragAndDropTarget;

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    return v1

    .line 24
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->shouldStartDragAndDrop:Lv3/l;

    .line 25
    .line 26
    iget-object p1, p1, Landroidx/compose/foundation/draganddrop/DropTargetElement;->shouldStartDragAndDrop:Lv3/l;

    .line 27
    .line 28
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final getShouldStartDragAndDrop()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/draganddrop/DragAndDropEvent;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->shouldStartDragAndDrop:Lv3/l;

    return-object v0
.end method

.method public final getTarget()Landroidx/compose/ui/draganddrop/DragAndDropTarget;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->target:Landroidx/compose/ui/draganddrop/DragAndDropTarget;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->target:Landroidx/compose/ui/draganddrop/DragAndDropTarget;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->shouldStartDragAndDrop:Lv3/l;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3
    .param p1    # Landroidx/compose/ui/platform/InspectorInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "dropTarget"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "target"

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->target:Landroidx/compose/ui/draganddrop/DragAndDropTarget;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "shouldStartDragAndDrop"

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->shouldStartDragAndDrop:Lv3/l;

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public update(Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->target:Landroidx/compose/ui/draganddrop/DragAndDropTarget;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;->setTarget(Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DropTargetElement;->shouldStartDragAndDrop:Lv3/l;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;->setShouldStartDragAndDrop(Lv3/l;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/draganddrop/DropTargetElement;->update(Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;)V

    return-void
.end method
