.class public final Landroidx/compose/ui/draganddrop/DragAndDropNode$onMoved$$inlined$firstChildOrNull$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/draganddrop/DragAndDropNode;->onMoved(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/node/TraversableNode;",
        "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;",
        "child",
        "Landroidx/compose/ui/node/TraversableNode;",
        "invoke",
        "androidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1\n+ 2 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n1#1,307:1\n218#2,2:308\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $event$inlined:Landroidx/compose/ui/draganddrop/DragAndDropEvent;

.field final synthetic $match:Lkotlin/jvm/internal/k1$h;

.field final synthetic this$0:Landroidx/compose/ui/draganddrop/DragAndDropNode;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/k1$h;Landroidx/compose/ui/draganddrop/DragAndDropNode;Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$onMoved$$inlined$firstChildOrNull$1;->$match:Lkotlin/jvm/internal/k1$h;

    iput-object p2, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$onMoved$$inlined$firstChildOrNull$1;->this$0:Landroidx/compose/ui/draganddrop/DragAndDropNode;

    iput-object p3, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$onMoved$$inlined$firstChildOrNull$1;->$event$inlined:Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;
    .locals 3
    .param p1    # Landroidx/compose/ui/node/TraversableNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 2
    instance-of v0, p1, Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;

    .line 3
    iget-object v1, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$onMoved$$inlined$firstChildOrNull$1;->this$0:Landroidx/compose/ui/draganddrop/DragAndDropNode;

    invoke-static {v1}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/node/Owner;->getDragAndDropManager()Landroidx/compose/ui/draganddrop/DragAndDropManager;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/compose/ui/draganddrop/DragAndDropManager;->isInterestedNode(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$onMoved$$inlined$firstChildOrNull$1;->$event$inlined:Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    invoke-static {v1}, Landroidx/compose/ui/draganddrop/DragAndDrop_androidKt;->getPositionInRoot(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Landroidx/compose/ui/draganddrop/DragAndDropNodeKt;->access$contains-Uv8p0NA(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$onMoved$$inlined$firstChildOrNull$1;->$match:Lkotlin/jvm/internal/k1$h;

    iput-object p1, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 6
    sget-object p1, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->CancelTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    return-object p1

    .line 7
    :cond_1
    sget-object p1, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->ContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/node/TraversableNode;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropNode$onMoved$$inlined$firstChildOrNull$1;->invoke(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    move-result-object p1

    return-object p1
.end method
