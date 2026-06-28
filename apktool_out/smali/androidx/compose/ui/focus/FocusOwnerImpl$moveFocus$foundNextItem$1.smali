.class final Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/focus/FocusOwnerImpl;->moveFocus-3ESFkO8(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
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
        "destination",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "invoke",
        "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"
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
        "SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,335:1\n90#2:336\n262#3:337\n230#3,5:338\n58#3:343\n59#3,8:345\n385#3,5:353\n263#3:358\n390#3:359\n395#3,2:361\n397#3,8:366\n405#3,9:377\n414#3,8:389\n68#3,7:397\n265#3:404\n1#4:344\n1#4:412\n261#5:360\n234#6,3:363\n237#6,3:386\n1208#7:374\n1187#7,2:375\n39#8,7:405\n46#8,4:415\n728#9,2:413\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1\n*L\n182#1:336\n182#1:337\n182#1:338,5\n182#1:343\n182#1:345,8\n182#1:353,5\n182#1:358\n182#1:359\n182#1:361,2\n182#1:366,8\n182#1:377,9\n182#1:389,8\n182#1:397,7\n182#1:404\n182#1:344\n187#1:412\n182#1:360\n182#1:363,3\n182#1:386,3\n182#1:374\n182#1:375,2\n187#1:405,7\n187#1:415,4\n187#1:413,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $focusDirection:I

.field final synthetic $isCancelled:Lkotlin/jvm/internal/k1$a;

.field final synthetic $source:Landroidx/compose/ui/focus/FocusTargetNode;

.field final synthetic this$0:Landroidx/compose/ui/focus/FocusOwnerImpl;


# direct methods
.method constructor <init>(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusOwnerImpl;ILkotlin/jvm/internal/k1$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;->$source:Landroidx/compose/ui/focus/FocusTargetNode;

    iput-object p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;->this$0:Landroidx/compose/ui/focus/FocusOwnerImpl;

    iput p3, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;->$focusDirection:I

    iput-object p4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;->$isCancelled:Lkotlin/jvm/internal/k1$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;
    .locals 11
    .param p1    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;->$source:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    const/16 v0, 0x400

    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v0

    .line 4
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v1

    if-eqz v1, :cond_13

    .line 5
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    .line 6
    invoke-static {p1}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v2

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_d

    .line 7
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v5

    .line 8
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_b

    :goto_1
    if-eqz v1, :cond_b

    .line 9
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_a

    move-object v5, v1

    move-object v6, v3

    :goto_2
    if-eqz v5, :cond_a

    .line 10
    instance-of v7, v5, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v7, :cond_1

    move-object v3, v5

    goto/16 :goto_7

    .line 11
    :cond_1
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v7

    and-int/2addr v7, v0

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    move v7, v4

    goto :goto_3

    :cond_2
    move v7, v8

    :goto_3
    if-eqz v7, :cond_9

    .line 12
    instance-of v7, v5, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v7, :cond_9

    .line 13
    move-object v7, v5

    check-cast v7, Landroidx/compose/ui/node/DelegatingNode;

    .line 14
    invoke-virtual {v7}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    move v9, v8

    :goto_4
    if-eqz v7, :cond_8

    .line 15
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_3

    move v10, v4

    goto :goto_5

    :cond_3
    move v10, v8

    :goto_5
    if-eqz v10, :cond_7

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v4, :cond_4

    move-object v5, v7

    goto :goto_6

    :cond_4
    if-nez v6, :cond_5

    .line 16
    new-instance v6, Landroidx/compose/runtime/collection/MutableVector;

    const/16 v10, 0x10

    new-array v10, v10, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v6, v10, v8}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz v5, :cond_6

    .line 17
    invoke-virtual {v6, v5}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-object v5, v3

    .line 18
    :cond_6
    invoke-virtual {v6, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 19
    :cond_7
    :goto_6
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    goto :goto_4

    :cond_8
    if-ne v9, v4, :cond_9

    goto :goto_2

    .line 20
    :cond_9
    invoke-static {v6}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v5

    goto :goto_2

    .line 21
    :cond_a
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    goto :goto_1

    .line 22
    :cond_b
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 23
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v1

    goto/16 :goto_0

    :cond_c
    move-object v1, v3

    goto/16 :goto_0

    :cond_d
    :goto_7
    if-eqz v3, :cond_12

    .line 24
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;->this$0:Landroidx/compose/ui/focus/FocusOwnerImpl;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;->$focusDirection:I

    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;->$isCancelled:Lkotlin/jvm/internal/k1$a;

    .line 25
    :try_start_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getOngoingTransaction$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 26
    :cond_e
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 27
    invoke-static {p1, v1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomRequestFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    move-result-object v1

    sget-object v3, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    if-eq v1, v4, :cond_11

    const/4 v3, 0x2

    if-eq v1, v3, :cond_10

    const/4 v3, 0x3

    if-eq v1, v3, :cond_10

    const/4 v2, 0x4

    if-ne v1, v2, :cond_f

    .line 28
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performRequestFocus(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    move-result v4

    goto :goto_8

    :cond_f
    new-instance p1, Lkotlin/j0;

    invoke-direct {p1}, Lkotlin/j0;-><init>()V

    throw p1

    .line 29
    :cond_10
    iput-boolean v4, v2, Lkotlin/jvm/internal/k1$a;->element:Z

    .line 30
    :cond_11
    :goto_8
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    throw p1

    .line 32
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Focus search landed at the root."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 33
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "visitAncestors called on an unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$foundNextItem$1;->invoke(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
