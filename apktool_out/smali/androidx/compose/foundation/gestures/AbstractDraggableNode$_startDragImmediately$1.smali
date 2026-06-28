.class final Landroidx/compose/foundation/gestures/AbstractDraggableNode$_startDragImmediately$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


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
        "Lv3/a<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Boolean;"
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

    iput-object p1, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$_startDragImmediately$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AbstractDraggableNode$_startDragImmediately$1;->this$0:Landroidx/compose/foundation/gestures/AbstractDraggableNode;

    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/AbstractDraggableNode;->getStartDragImmediately()Lv3/a;

    move-result-object v0

    invoke-interface {v0}, Lv3/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/AbstractDraggableNode$_startDragImmediately$1;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
