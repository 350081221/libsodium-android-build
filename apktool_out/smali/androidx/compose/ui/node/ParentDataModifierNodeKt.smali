.class public final Landroidx/compose/ui/node/ParentDataModifierNodeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/node/ParentDataModifierNode;",
        "Lkotlin/r2;",
        "invalidateParentData",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final invalidateParentData(Landroidx/compose/ui/node/ParentDataModifierNode;)V
    .locals 0
    .param p0    # Landroidx/compose/ui/node/ParentDataModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->invalidateParentData$ui_release()V

    return-void
.end method
