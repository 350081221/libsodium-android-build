.class public final Landroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/node/NodeCoordinator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J:\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0019"
    }
    d2 = {
        "androidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1",
        "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;",
        "Landroidx/compose/ui/node/NodeKind;",
        "Landroidx/compose/ui/node/PointerInputModifierNode;",
        "entityType-OLwlOKw",
        "()I",
        "entityType",
        "Landroidx/compose/ui/Modifier$Node;",
        "node",
        "",
        "interceptOutOfBoundsChildEvents",
        "Landroidx/compose/ui/node/LayoutNode;",
        "parentLayoutNode",
        "shouldHitTestChildren",
        "layoutNode",
        "Landroidx/compose/ui/geometry/Offset;",
        "pointerPosition",
        "Landroidx/compose/ui/node/HitTestResult;",
        "hitTestResult",
        "isTouchEvent",
        "isInLayer",
        "Lkotlin/r2;",
        "childHitTest-YqVAtuI",
        "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V",
        "childHitTest",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1329:1\n78#2:1330\n78#2:1331\n385#3,6:1332\n395#3,2:1339\n397#3,8:1344\n405#3,9:1355\n414#3,8:1367\n261#4:1338\n234#5,3:1341\n237#5,3:1364\n1208#6:1352\n1187#6,2:1353\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n*L\n1212#1:1330\n1215#1:1331\n1215#1:1332,6\n1215#1:1339,2\n1215#1:1344,8\n1215#1:1355,9\n1215#1:1367,8\n1215#1:1338\n1215#1:1341,3\n1215#1:1364,3\n1215#1:1352\n1215#1:1353,2\n*E\n"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childHitTest-YqVAtuI(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V
    .locals 0
    .param p1    # Landroidx/compose/ui/node/LayoutNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/node/HitTestResult;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual/range {p1 .. p6}, Landroidx/compose/ui/node/LayoutNode;->hitTest-M_7yMNQ$ui_release(JLandroidx/compose/ui/node/HitTestResult;ZZ)V

    return-void
.end method

.method public entityType-OLwlOKw()I
    .locals 1

    const/16 v0, 0x10

    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v0

    return v0
.end method

.method public interceptOutOfBoundsChildEvents(Landroidx/compose/ui/Modifier$Node;)Z
    .locals 9
    .param p1    # Landroidx/compose/ui/Modifier$Node;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move-object v3, v2

    .line 9
    :goto_0
    const/4 v4, 0x0

    .line 10
    if-eqz p1, :cond_9

    .line 11
    .line 12
    instance-of v5, p1, Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    check-cast p1, Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 18
    .line 19
    invoke-interface {p1}, Landroidx/compose/ui/node/PointerInputModifierNode;->interceptOutOfBoundsChildEvents()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_8

    .line 24
    .line 25
    return v6

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    and-int/2addr v5, v1

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    move v5, v6

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v5, v4

    .line 36
    :goto_1
    if-eqz v5, :cond_8

    .line 37
    .line 38
    instance-of v5, p1, Landroidx/compose/ui/node/DelegatingNode;

    .line 39
    .line 40
    if-eqz v5, :cond_8

    .line 41
    .line 42
    move-object v5, p1

    .line 43
    check-cast v5, Landroidx/compose/ui/node/DelegatingNode;

    .line 44
    .line 45
    invoke-virtual {v5}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    move v7, v4

    .line 50
    :goto_2
    if-eqz v5, :cond_7

    .line 51
    .line 52
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    and-int/2addr v8, v1

    .line 57
    if-eqz v8, :cond_2

    .line 58
    .line 59
    move v8, v6

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    move v8, v4

    .line 62
    :goto_3
    if-eqz v8, :cond_6

    .line 63
    .line 64
    add-int/lit8 v7, v7, 0x1

    .line 65
    .line 66
    if-ne v7, v6, :cond_3

    .line 67
    .line 68
    move-object p1, v5

    .line 69
    goto :goto_4

    .line 70
    :cond_3
    if-nez v3, :cond_4

    .line 71
    .line 72
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    .line 73
    .line 74
    new-array v8, v0, [Landroidx/compose/ui/Modifier$Node;

    .line 75
    .line 76
    invoke-direct {v3, v8, v4}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    :cond_4
    if-eqz p1, :cond_5

    .line 80
    .line 81
    invoke-virtual {v3, p1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-object p1, v2

    .line 85
    :cond_5
    invoke-virtual {v3, v5}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :cond_6
    :goto_4
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    goto :goto_2

    .line 93
    :cond_7
    if-ne v7, v6, :cond_8

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_8
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_0

    .line 101
    :cond_9
    return v4
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public shouldHitTestChildren(Landroidx/compose/ui/node/LayoutNode;)Z
    .locals 0
    .param p1    # Landroidx/compose/ui/node/LayoutNode;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/4 p1, 0x1

    return p1
.end method
