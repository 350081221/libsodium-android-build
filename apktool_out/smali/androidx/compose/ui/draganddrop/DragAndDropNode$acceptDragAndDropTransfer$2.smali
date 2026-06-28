.class final Landroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/draganddrop/DragAndDropNode;->acceptDragAndDropTransfer(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/draganddrop/DragAndDropNode;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "child",
        "Landroidx/compose/ui/draganddrop/DragAndDropNode;",
        "invoke",
        "(Landroidx/compose/ui/draganddrop/DragAndDropNode;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $handledByChild:Lkotlin/jvm/internal/k1$a;

.field final synthetic $startEvent:Landroidx/compose/ui/draganddrop/DragAndDropEvent;

.field final synthetic this$0:Landroidx/compose/ui/draganddrop/DragAndDropNode;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/k1$a;Landroidx/compose/ui/draganddrop/DragAndDropEvent;Landroidx/compose/ui/draganddrop/DragAndDropNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$2;->$handledByChild:Lkotlin/jvm/internal/k1$a;

    iput-object p2, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$2;->$startEvent:Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    iput-object p3, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$2;->this$0:Landroidx/compose/ui/draganddrop/DragAndDropNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/draganddrop/DragAndDropNode;)Ljava/lang/Boolean;
    .locals 4
    .param p1    # Landroidx/compose/ui/draganddrop/DragAndDropNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$2;->$handledByChild:Lkotlin/jvm/internal/k1$a;

    iget-boolean v1, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 3
    iget-object v2, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$2;->$startEvent:Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    .line 4
    invoke-virtual {p1, v2}, Landroidx/compose/ui/draganddrop/DragAndDropNode;->acceptDragAndDropTransfer(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z

    move-result v2

    .line 5
    iget-object v3, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$2;->this$0:Landroidx/compose/ui/draganddrop/DragAndDropNode;

    if-eqz v2, :cond_0

    .line 6
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    move-result-object v3

    invoke-interface {v3}, Landroidx/compose/ui/node/Owner;->getDragAndDropManager()Landroidx/compose/ui/draganddrop/DragAndDropManager;

    move-result-object v3

    invoke-interface {v3, p1}, Landroidx/compose/ui/draganddrop/DragAndDropManager;->registerNodeInterest(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;)V

    .line 7
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    or-int p1, v1, v2

    .line 8
    iput-boolean p1, v0, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 9
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/draganddrop/DragAndDropNode;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$2;->invoke(Landroidx/compose/ui/draganddrop/DragAndDropNode;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
