.class public final Landroidx/compose/foundation/gestures/DraggableNode$abstractDragScope$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/AbstractDragScope;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/DraggableNode;-><init>(Landroidx/compose/foundation/gestures/DraggableState;Lv3/l;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Lv3/q;Lv3/q;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0008"
    }
    d2 = {
        "androidx/compose/foundation/gestures/DraggableNode$abstractDragScope$1",
        "Landroidx/compose/foundation/gestures/AbstractDragScope;",
        "Landroidx/compose/ui/geometry/Offset;",
        "pixels",
        "Lkotlin/r2;",
        "dragBy-k-4lQ0M",
        "(J)V",
        "dragBy",
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
.field final synthetic this$0:Landroidx/compose/foundation/gestures/DraggableNode;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/DraggableNode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/DraggableNode$abstractDragScope$1;->this$0:Landroidx/compose/foundation/gestures/DraggableNode;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public dragBy-k-4lQ0M(J)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/gestures/DraggableNode$abstractDragScope$1;->this$0:Landroidx/compose/foundation/gestures/DraggableNode;

    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/DraggableNode;->getDragScope()Landroidx/compose/foundation/gestures/DragScope;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/foundation/gestures/DraggableNode$abstractDragScope$1;->this$0:Landroidx/compose/foundation/gestures/DraggableNode;

    invoke-static {v1}, Landroidx/compose/foundation/gestures/DraggableNode;->access$getOrientation$p(Landroidx/compose/foundation/gestures/DraggableNode;)Landroidx/compose/foundation/gestures/Orientation;

    move-result-object v1

    invoke-static {p1, p2, v1}, Landroidx/compose/foundation/gestures/DraggableKt;->access$toFloat-3MmeM6k(JLandroidx/compose/foundation/gestures/Orientation;)F

    move-result p1

    invoke-interface {v0, p1}, Landroidx/compose/foundation/gestures/DragScope;->dragBy(F)V

    return-void
.end method
