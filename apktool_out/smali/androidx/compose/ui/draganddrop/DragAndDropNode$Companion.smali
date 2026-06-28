.class public final Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/draganddrop/DragAndDropNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$DragAndDropTraversableKey;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0008B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\u0014\u0008\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;",
        "",
        "()V",
        "firstChildOrNull",
        "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;",
        "predicate",
        "Lkotlin/Function1;",
        "",
        "DragAndDropTraversableKey",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;-><init>()V

    return-void
.end method

.method private final firstChildOrNull(Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;Lv3/l;)Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/k1$h;

    .line 14
    .line 15
    invoke-direct {v0}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object v1, Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$DragAndDropTraversableKey;->INSTANCE:Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$DragAndDropTraversableKey;

    .line 19
    .line 20
    new-instance v2, Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1;

    .line 21
    .line 22
    invoke-direct {v2, p2, v0}, Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1;-><init>(Lv3/l;Lkotlin/jvm/internal/k1$h;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v1, v2}, Landroidx/compose/ui/node/TraversableNodeKt;->traverseDescendants(Landroidx/compose/ui/node/DelegatableNode;Ljava/lang/Object;Lv3/l;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;

    .line 31
    .line 32
    return-object p1
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
