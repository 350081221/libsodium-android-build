.class public final Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;->firstChildOrNull(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;Lv3/l;)Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;",
        "child",
        "Landroidx/compose/ui/node/TraversableNode;",
        "invoke"
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
        "SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1\n*L\n1#1,307:1\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $match:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $predicate:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv3/l;Lkotlin/jvm/internal/k1$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/internal/k1$h<",
            "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1;->$predicate:Lv3/l;

    iput-object p2, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1;->$match:Lkotlin/jvm/internal/k1$h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;
    .locals 1
    .param p1    # Landroidx/compose/ui/node/TraversableNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 2
    instance-of v0, p1, Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1;->$predicate:Lv3/l;

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1;->$match:Lkotlin/jvm/internal/k1$h;

    iput-object p1, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 4
    sget-object p1, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->CancelTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    return-object p1

    .line 5
    :cond_0
    sget-object p1, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->ContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/node/TraversableNode;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1;->invoke(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    move-result-object p1

    return-object p1
.end method
