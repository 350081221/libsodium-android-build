.class public final Landroidx/compose/ui/focus/FocusTargetNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;
.implements Landroidx/compose/ui/focus/FocusTargetModifierNode;
.implements Landroidx/compose/ui/node/ObserverModifierNode;
.implements Landroidx/compose/ui/modifier/ModifierLocalModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;,
        Landroidx/compose/ui/focus/FocusTargetNode$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00018B\u0007\u00a2\u0006\u0004\u00087\u0010\u0018J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016J\u0008\u0010\u0008\u001a\u00020\u0006H\u0016J\u000f\u0010\u000c\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH\u0080\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH\u0080\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010 R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R*\u00102\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"8V@VX\u0096\u000e\u00a2\u0006\u0012\u0012\u0004\u00081\u0010\u0018\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R\u0013\u00106\u001a\u0004\u0018\u0001038F\u00a2\u0006\u0006\u001a\u0004\u00084\u00105\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00069"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;",
        "Landroidx/compose/ui/focus/FocusTargetModifierNode;",
        "Landroidx/compose/ui/node/ObserverModifierNode;",
        "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "Lkotlin/r2;",
        "onObservedReadsChanged",
        "onReset",
        "Landroidx/compose/ui/focus/FocusProperties;",
        "fetchFocusProperties$ui_release",
        "()Landroidx/compose/ui/focus/FocusProperties;",
        "fetchFocusProperties",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "focusDirection",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/focus/FocusRequester;",
        "block",
        "fetchCustomEnter-aToIllA$ui_release",
        "(ILv3/l;)V",
        "fetchCustomEnter",
        "fetchCustomExit-aToIllA$ui_release",
        "fetchCustomExit",
        "commitFocusState$ui_release",
        "()V",
        "commitFocusState",
        "invalidateFocus$ui_release",
        "invalidateFocus",
        "scheduleInvalidationForFocusEvents$ui_release",
        "scheduleInvalidationForFocusEvents",
        "",
        "isProcessingCustomExit",
        "Z",
        "isProcessingCustomEnter",
        "Landroidx/compose/ui/focus/FocusStateImpl;",
        "committedFocusState",
        "Landroidx/compose/ui/focus/FocusStateImpl;",
        "",
        "previouslyFocusedChildHash",
        "I",
        "getPreviouslyFocusedChildHash",
        "()I",
        "setPreviouslyFocusedChildHash",
        "(I)V",
        "value",
        "getFocusState",
        "()Landroidx/compose/ui/focus/FocusStateImpl;",
        "setFocusState",
        "(Landroidx/compose/ui/focus/FocusStateImpl;)V",
        "getFocusState$annotations",
        "focusState",
        "Landroidx/compose/ui/layout/BeyondBoundsLayout;",
        "getBeyondBoundsLayoutParent",
        "()Landroidx/compose/ui/layout/BeyondBoundsLayout;",
        "beyondBoundsLayoutParent",
        "<init>",
        "FocusTargetElement",
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
        "SMAP\nFocusTargetNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,231:1\n1#2:232\n1#2:240\n1#2:252\n1#2:376\n39#3,7:233\n46#3,4:243\n728#4,2:241\n92#5:247\n90#5:248\n94#5:320\n94#5:364\n90#5:365\n90#5:385\n94#5:387\n241#6,2:249\n58#6:251\n59#6,8:253\n243#6:261\n244#6,2:263\n385#6,12:265\n397#6,8:280\n405#6,9:291\n414#6,8:303\n247#6:311\n68#6,7:312\n248#6:319\n385#6,6:321\n395#6,2:328\n397#6,8:333\n405#6,9:344\n414#6,8:356\n50#6,9:367\n59#6,8:377\n385#6,6:388\n395#6,2:395\n397#6,8:400\n405#6,9:411\n414#6,8:423\n68#6,7:431\n261#7:262\n261#7:327\n261#7:386\n261#7:394\n234#8,3:277\n237#8,3:300\n234#8,3:330\n237#8,3:353\n234#8,3:397\n237#8,3:420\n1208#9:288\n1187#9,2:289\n1208#9:341\n1187#9,2:342\n1208#9:408\n1187#9,2:409\n47#10:366\n*S KotlinDebug\n*F\n+ 1 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n86#1:240\n99#1:252\n196#1:376\n86#1:233,7\n86#1:243,4\n86#1:241,2\n99#1:247\n99#1:248\n189#1:320\n196#1:364\n196#1:365\n197#1:385\n200#1:387\n99#1:249,2\n99#1:251\n99#1:253,8\n99#1:261\n99#1:263,2\n99#1:265,12\n99#1:280,8\n99#1:291,9\n99#1:303,8\n99#1:311\n99#1:312,7\n99#1:319\n189#1:321,6\n189#1:328,2\n189#1:333,8\n189#1:344,9\n189#1:356,8\n196#1:367,9\n196#1:377,8\n200#1:388,6\n200#1:395,2\n200#1:400,8\n200#1:411,9\n200#1:423,8\n196#1:431,7\n99#1:262\n189#1:327\n197#1:386\n200#1:394\n99#1:277,3\n99#1:300,3\n189#1:330,3\n189#1:353,3\n200#1:397,3\n200#1:420,3\n99#1:288\n99#1:289,2\n189#1:341\n189#1:342,2\n200#1:408\n200#1:409,2\n196#1:366\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private committedFocusState:Landroidx/compose/ui/focus/FocusStateImpl;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private isProcessingCustomEnter:Z

.field private isProcessingCustomExit:Z

.field private previouslyFocusedChildHash:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->committedFocusState:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 7
    .line 8
    return-void
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
.end method

.method public static final synthetic access$isProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->isProcessingCustomEnter:Z

    return p0
.end method

.method public static final synthetic access$isProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->isProcessingCustomExit:Z

    return p0
.end method

.method public static final synthetic access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->isProcessingCustomEnter:Z

    return-void
.end method

.method public static final synthetic access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->isProcessingCustomExit:Z

    return-void
.end method

.method public static synthetic getFocusState$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final commitFocusState$ui_release()V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->requireTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getUncommittedFocusState(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->committedFocusState:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "committing a node that was not updated in the current transaction"

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final fetchCustomEnter-aToIllA$ui_release(ILv3/l;)V
    .locals 3
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->access$isProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Landroidx/compose/ui/focus/FocusProperties;->getEnter()Lv3/l;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusDirection;->box-impl(I)Landroidx/compose/ui/focus/FocusDirection;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {v2, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Landroidx/compose/ui/focus/FocusRequester;

    .line 29
    .line 30
    sget-object v2, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eq p1, v2, :cond_0

    .line 37
    .line 38
    invoke-interface {p2, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    invoke-static {v0}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomEnter$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_1
    :goto_0
    return-void
    .line 63
    .line 64
    .line 65
.end method

.method public final fetchCustomExit-aToIllA$ui_release(ILv3/l;)V
    .locals 3
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->access$isProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-static {p0, v0}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Landroidx/compose/ui/focus/FocusProperties;->getExit()Lv3/l;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusDirection;->box-impl(I)Landroidx/compose/ui/focus/FocusDirection;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {v2, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Landroidx/compose/ui/focus/FocusRequester;

    .line 29
    .line 30
    sget-object v2, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eq p1, v2, :cond_0

    .line 37
    .line 38
    invoke-interface {p2, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    invoke-static {v0}, Lkotlin/jvm/internal/i0;->d(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->access$setProcessingCustomExit$p(Landroidx/compose/ui/focus/FocusTargetNode;Z)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/jvm/internal/i0;->c(I)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_1
    :goto_0
    return-void
    .line 63
    .line 64
    .line 65
.end method

.method public final fetchFocusProperties$ui_release()Landroidx/compose/ui/focus/FocusProperties;
    .locals 15
    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/FocusPropertiesImpl;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusPropertiesImpl;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x800

    .line 7
    .line 8
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/16 v2, 0x400

    .line 13
    .line 14
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    or-int v4, v1, v2

    .line 23
    .line 24
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_10

    .line 33
    .line 34
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    :goto_0
    if-eqz v6, :cond_f

    .line 43
    .line 44
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {v7}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    and-int/2addr v7, v4

    .line 57
    const/4 v8, 0x0

    .line 58
    if-eqz v7, :cond_d

    .line 59
    .line 60
    :goto_1
    if-eqz v5, :cond_d

    .line 61
    .line 62
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    and-int/2addr v7, v4

    .line 67
    if-eqz v7, :cond_c

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v9, 0x1

    .line 71
    if-eq v5, v3, :cond_1

    .line 72
    .line 73
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    and-int/2addr v10, v2

    .line 78
    if-eqz v10, :cond_0

    .line 79
    .line 80
    move v10, v9

    .line 81
    goto :goto_2

    .line 82
    :cond_0
    move v10, v7

    .line 83
    :goto_2
    if-nez v10, :cond_f

    .line 84
    .line 85
    :cond_1
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    and-int/2addr v10, v1

    .line 90
    if-eqz v10, :cond_2

    .line 91
    .line 92
    move v10, v9

    .line 93
    goto :goto_3

    .line 94
    :cond_2
    move v10, v7

    .line 95
    :goto_3
    if-eqz v10, :cond_c

    .line 96
    .line 97
    move-object v10, v5

    .line 98
    move-object v11, v8

    .line 99
    :goto_4
    if-eqz v10, :cond_c

    .line 100
    .line 101
    instance-of v12, v10, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .line 102
    .line 103
    if-eqz v12, :cond_3

    .line 104
    .line 105
    check-cast v10, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .line 106
    .line 107
    invoke-interface {v10, v0}, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;->applyFocusProperties(Landroidx/compose/ui/focus/FocusProperties;)V

    .line 108
    .line 109
    .line 110
    goto :goto_9

    .line 111
    :cond_3
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 112
    .line 113
    .line 114
    move-result v12

    .line 115
    and-int/2addr v12, v1

    .line 116
    if-eqz v12, :cond_4

    .line 117
    .line 118
    move v12, v9

    .line 119
    goto :goto_5

    .line 120
    :cond_4
    move v12, v7

    .line 121
    :goto_5
    if-eqz v12, :cond_b

    .line 122
    .line 123
    instance-of v12, v10, Landroidx/compose/ui/node/DelegatingNode;

    .line 124
    .line 125
    if-eqz v12, :cond_b

    .line 126
    .line 127
    move-object v12, v10

    .line 128
    check-cast v12, Landroidx/compose/ui/node/DelegatingNode;

    .line 129
    .line 130
    invoke-virtual {v12}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    move v13, v7

    .line 135
    :goto_6
    if-eqz v12, :cond_a

    .line 136
    .line 137
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 138
    .line 139
    .line 140
    move-result v14

    .line 141
    and-int/2addr v14, v1

    .line 142
    if-eqz v14, :cond_5

    .line 143
    .line 144
    move v14, v9

    .line 145
    goto :goto_7

    .line 146
    :cond_5
    move v14, v7

    .line 147
    :goto_7
    if-eqz v14, :cond_9

    .line 148
    .line 149
    add-int/lit8 v13, v13, 0x1

    .line 150
    .line 151
    if-ne v13, v9, :cond_6

    .line 152
    .line 153
    move-object v10, v12

    .line 154
    goto :goto_8

    .line 155
    :cond_6
    if-nez v11, :cond_7

    .line 156
    .line 157
    new-instance v11, Landroidx/compose/runtime/collection/MutableVector;

    .line 158
    .line 159
    const/16 v14, 0x10

    .line 160
    .line 161
    new-array v14, v14, [Landroidx/compose/ui/Modifier$Node;

    .line 162
    .line 163
    invoke-direct {v11, v14, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 164
    .line 165
    .line 166
    :cond_7
    if-eqz v10, :cond_8

    .line 167
    .line 168
    invoke-virtual {v11, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-object v10, v8

    .line 172
    :cond_8
    invoke-virtual {v11, v12}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :cond_9
    :goto_8
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    goto :goto_6

    .line 180
    :cond_a
    if-ne v13, v9, :cond_b

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_b
    :goto_9
    invoke-static {v11}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    goto :goto_4

    .line 188
    :cond_c
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    goto/16 :goto_1

    .line 193
    .line 194
    :cond_d
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    if-eqz v6, :cond_e

    .line 199
    .line 200
    invoke-virtual {v6}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    if-eqz v5, :cond_e

    .line 205
    .line 206
    invoke-virtual {v5}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_e
    move-object v5, v8

    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_f
    return-object v0

    .line 216
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 217
    .line 218
    const-string/jumbo v1, "visitAncestors called on an unattached node"

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v0
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
.end method

.method public final getBeyondBoundsLayoutParent()Landroidx/compose/ui/layout/BeyondBoundsLayout;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    invoke-static {}, Landroidx/compose/ui/layout/BeyondBoundsLayoutKt;->getModifierLocalBeyondBoundsLayout()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/modifier/ModifierLocalModifierNode;->getCurrent(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/layout/BeyondBoundsLayout;

    return-object v0
.end method

.method public bridge synthetic getFocusState()Landroidx/compose/ui/focus/FocusState;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    return-object v0
.end method

.method public getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->access$getFocusTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getUncommittedFocusState(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->committedFocusState:Landroidx/compose/ui/focus/FocusStateImpl;

    :cond_1
    return-object v0
.end method

.method public final getPreviouslyFocusedChildHash()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/focus/FocusTargetNode;->previouslyFocusedChildHash:I

    return v0
.end method

.method public final invalidateFocus$ui_release()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/FocusTargetNode$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/k1$h;

    .line 21
    .line 22
    invoke-direct {v0}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v2, Landroidx/compose/ui/focus/FocusTargetNode$invalidateFocus$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, p0}, Landroidx/compose/ui/focus/FocusTargetNode$invalidateFocus$1;-><init>(Lkotlin/jvm/internal/k1$h;Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0, v2}, Landroidx/compose/ui/node/ObserverModifierNodeKt;->observeReads(Landroidx/compose/ui/Modifier$Node;Lv3/a;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    const-string v0, "focusProperties"

    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/jvm/internal/l0;->S(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    check-cast v0, Landroidx/compose/ui/focus/FocusProperties;

    .line 45
    .line 46
    :goto_0
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusProperties;->getCanFocus()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0, v1}, Landroidx/compose/ui/focus/FocusManager;->clearFocus(Z)V

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_1
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public onObservedReadsChanged()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->invalidateFocus$ui_release()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusEventModifierNodeKt;->refreshFocusEventNodes(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
.end method

.method public onReset()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/ui/focus/FocusTargetNode$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_3

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_3

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->scheduleInvalidationForFocusEvents$ui_release()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusTargetNode;->scheduleInvalidationForFocusEvents$ui_release()V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->requireTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :try_start_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getOngoingTransaction$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 47
    .line 48
    .line 49
    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusTargetNode;->setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 52
    .line 53
    .line 54
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v1

    .line 61
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_3
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireOwner(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/Owner;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getFocusOwner()Landroidx/compose/ui/focus/FocusOwner;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v0, v1}, Landroidx/compose/ui/focus/FocusManager;->clearFocus(Z)V

    .line 74
    .line 75
    .line 76
    :goto_0
    return-void
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final scheduleInvalidationForFocusEvents$ui_release()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x1000

    .line 6
    .line 7
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    move-object v4, v3

    .line 13
    :goto_0
    const/16 v5, 0x10

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x1

    .line 17
    if-eqz v0, :cond_9

    .line 18
    .line 19
    instance-of v8, v0, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 20
    .line 21
    if-eqz v8, :cond_0

    .line 22
    .line 23
    check-cast v0, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 24
    .line 25
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusEventModifierNodeKt;->invalidateFocusEvent(Landroidx/compose/ui/focus/FocusEventModifierNode;)V

    .line 26
    .line 27
    .line 28
    goto :goto_5

    .line 29
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    and-int/2addr v8, v2

    .line 34
    if-eqz v8, :cond_1

    .line 35
    .line 36
    move v8, v7

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v8, v6

    .line 39
    :goto_1
    if-eqz v8, :cond_8

    .line 40
    .line 41
    instance-of v8, v0, Landroidx/compose/ui/node/DelegatingNode;

    .line 42
    .line 43
    if-eqz v8, :cond_8

    .line 44
    .line 45
    move-object v8, v0

    .line 46
    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 47
    .line 48
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    move v9, v6

    .line 53
    :goto_2
    if-eqz v8, :cond_7

    .line 54
    .line 55
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    and-int/2addr v10, v2

    .line 60
    if-eqz v10, :cond_2

    .line 61
    .line 62
    move v10, v7

    .line 63
    goto :goto_3

    .line 64
    :cond_2
    move v10, v6

    .line 65
    :goto_3
    if-eqz v10, :cond_6

    .line 66
    .line 67
    add-int/lit8 v9, v9, 0x1

    .line 68
    .line 69
    if-ne v9, v7, :cond_3

    .line 70
    .line 71
    move-object v0, v8

    .line 72
    goto :goto_4

    .line 73
    :cond_3
    if-nez v4, :cond_4

    .line 74
    .line 75
    new-instance v4, Landroidx/compose/runtime/collection/MutableVector;

    .line 76
    .line 77
    new-array v10, v5, [Landroidx/compose/ui/Modifier$Node;

    .line 78
    .line 79
    invoke-direct {v4, v10, v6}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 80
    .line 81
    .line 82
    :cond_4
    if-eqz v0, :cond_5

    .line 83
    .line 84
    invoke-virtual {v4, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-object v0, v3

    .line 88
    :cond_5
    invoke-virtual {v4, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_6
    :goto_4
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    goto :goto_2

    .line 96
    :cond_7
    if-ne v9, v7, :cond_8

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_8
    :goto_5
    invoke-static {v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    goto :goto_0

    .line 104
    :cond_9
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    const/16 v2, 0x400

    .line 109
    .line 110
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    or-int/2addr v0, v4

    .line 115
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_18

    .line 124
    .line 125
    invoke-interface {p0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    :goto_6
    if-eqz v8, :cond_17

    .line 138
    .line 139
    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-virtual {v9}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    and-int/2addr v9, v0

    .line 152
    if-eqz v9, :cond_15

    .line 153
    .line 154
    :goto_7
    if-eqz v4, :cond_15

    .line 155
    .line 156
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    and-int/2addr v9, v0

    .line 161
    if-eqz v9, :cond_14

    .line 162
    .line 163
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    and-int/2addr v9, v10

    .line 172
    if-eqz v9, :cond_a

    .line 173
    .line 174
    move v9, v7

    .line 175
    goto :goto_8

    .line 176
    :cond_a
    move v9, v6

    .line 177
    :goto_8
    if-nez v9, :cond_14

    .line 178
    .line 179
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-eqz v9, :cond_14

    .line 184
    .line 185
    invoke-static {v1}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    move-object v11, v3

    .line 190
    move-object v10, v4

    .line 191
    :goto_9
    if-eqz v10, :cond_14

    .line 192
    .line 193
    instance-of v12, v10, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 194
    .line 195
    if-eqz v12, :cond_b

    .line 196
    .line 197
    check-cast v10, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 198
    .line 199
    invoke-static {v10}, Landroidx/compose/ui/focus/FocusEventModifierNodeKt;->invalidateFocusEvent(Landroidx/compose/ui/focus/FocusEventModifierNode;)V

    .line 200
    .line 201
    .line 202
    goto :goto_e

    .line 203
    :cond_b
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    and-int/2addr v12, v9

    .line 208
    if-eqz v12, :cond_c

    .line 209
    .line 210
    move v12, v7

    .line 211
    goto :goto_a

    .line 212
    :cond_c
    move v12, v6

    .line 213
    :goto_a
    if-eqz v12, :cond_13

    .line 214
    .line 215
    instance-of v12, v10, Landroidx/compose/ui/node/DelegatingNode;

    .line 216
    .line 217
    if-eqz v12, :cond_13

    .line 218
    .line 219
    move-object v12, v10

    .line 220
    check-cast v12, Landroidx/compose/ui/node/DelegatingNode;

    .line 221
    .line 222
    invoke-virtual {v12}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    move v13, v6

    .line 227
    :goto_b
    if-eqz v12, :cond_12

    .line 228
    .line 229
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 230
    .line 231
    .line 232
    move-result v14

    .line 233
    and-int/2addr v14, v9

    .line 234
    if-eqz v14, :cond_d

    .line 235
    .line 236
    move v14, v7

    .line 237
    goto :goto_c

    .line 238
    :cond_d
    move v14, v6

    .line 239
    :goto_c
    if-eqz v14, :cond_11

    .line 240
    .line 241
    add-int/lit8 v13, v13, 0x1

    .line 242
    .line 243
    if-ne v13, v7, :cond_e

    .line 244
    .line 245
    move-object v10, v12

    .line 246
    goto :goto_d

    .line 247
    :cond_e
    if-nez v11, :cond_f

    .line 248
    .line 249
    new-instance v11, Landroidx/compose/runtime/collection/MutableVector;

    .line 250
    .line 251
    new-array v14, v5, [Landroidx/compose/ui/Modifier$Node;

    .line 252
    .line 253
    invoke-direct {v11, v14, v6}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 254
    .line 255
    .line 256
    :cond_f
    if-eqz v10, :cond_10

    .line 257
    .line 258
    invoke-virtual {v11, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-object v10, v3

    .line 262
    :cond_10
    invoke-virtual {v11, v12}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    :cond_11
    :goto_d
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 266
    .line 267
    .line 268
    move-result-object v12

    .line 269
    goto :goto_b

    .line 270
    :cond_12
    if-ne v13, v7, :cond_13

    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_13
    :goto_e
    invoke-static {v11}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    goto :goto_9

    .line 278
    :cond_14
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    goto/16 :goto_7

    .line 283
    .line 284
    :cond_15
    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    if-eqz v8, :cond_16

    .line 289
    .line 290
    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    if-eqz v4, :cond_16

    .line 295
    .line 296
    invoke-virtual {v4}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    goto/16 :goto_6

    .line 301
    .line 302
    :cond_16
    move-object v4, v3

    .line 303
    goto/16 :goto_6

    .line 304
    .line 305
    :cond_17
    return-void

    .line 306
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 307
    .line 308
    const-string/jumbo v1, "visitAncestors called on an unattached node"

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v0
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
.end method

.method public setFocusState(Landroidx/compose/ui/focus/FocusStateImpl;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusStateImpl;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/focus/FocusTargetNodeKt;->requireTransactionManager(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p1}, Landroidx/compose/ui/focus/FocusTransactionManager;->setUncommittedFocusState(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusStateImpl;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public final setPreviouslyFocusedChildHash(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/focus/FocusTargetNode;->previouslyFocusedChildHash:I

    return-void
.end method
