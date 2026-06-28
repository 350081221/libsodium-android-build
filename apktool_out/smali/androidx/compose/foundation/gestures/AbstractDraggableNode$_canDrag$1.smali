.class final Landroidx/compose/foundation/gestures/AbstractDraggableNode$_canDrag$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/AbstractDraggableNode;-><init>(Lv3/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Lv3/q;Lv3/q;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
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
        "it",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "invoke",
        "(Landroidx/compose/ui/input/pointer/PointerInputChange;)Ljava/lang/Boolean;"
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
.field final synthetic this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/AbstractDraggableNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$_canDrag$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/input/pointer/PointerInputChange;)Ljava/lang/Boolean;
    .locals 1
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputChange;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$_canDrag$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/AbstractDraggableNode;->getCanDrag()Lv3/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputChange;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$_canDrag$1;->invoke(Landroidx/compose/ui/input/pointer/PointerInputChange;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
