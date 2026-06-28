.class abstract Landroidx/compose/foundation/AbstractClickableNode;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/PointerInputModifierNode;
.implements Landroidx/compose/ui/input/key/KeyInputModifierNode;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/AbstractClickableNode$InteractionData;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00082\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B;\u0008\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u00087\u0010\u0010JF\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0008\u0010\u0012\u001a\u00020\rH\u0016J\u0008\u0010\u0013\u001a\u00020\rH\u0004J*\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0008\u0010\u001d\u001a\u00020\rH\u0016J\u001a\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010$\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010&R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\'R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010(R\u001c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010)R\u001a\u0010+\u001a\u00020*8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.R\u0014\u00102\u001a\u00020/8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u00101R\u0014\u00106\u001a\u0002038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u00105\u0082\u0001\u00029:\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006;"
    }
    d2 = {
        "Landroidx/compose/foundation/AbstractClickableNode;",
        "Landroidx/compose/ui/node/DelegatingNode;",
        "Landroidx/compose/ui/node/PointerInputModifierNode;",
        "Landroidx/compose/ui/input/key/KeyInputModifierNode;",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "",
        "enabled",
        "",
        "onClickLabel",
        "Landroidx/compose/ui/semantics/Role;",
        "role",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "onClick",
        "updateCommon-XHw0xAI",
        "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;)V",
        "updateCommon",
        "onDetach",
        "disposeInteractionSource",
        "Landroidx/compose/ui/input/pointer/PointerEvent;",
        "pointerEvent",
        "Landroidx/compose/ui/input/pointer/PointerEventPass;",
        "pass",
        "Landroidx/compose/ui/unit/IntSize;",
        "bounds",
        "onPointerEvent-H0pRuoY",
        "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V",
        "onPointerEvent",
        "onCancelPointerInput",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "event",
        "onKeyEvent-ZmokQxo",
        "(Landroid/view/KeyEvent;)Z",
        "onKeyEvent",
        "onPreKeyEvent-ZmokQxo",
        "onPreKeyEvent",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "Z",
        "Ljava/lang/String;",
        "Landroidx/compose/ui/semantics/Role;",
        "Lv3/a;",
        "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;",
        "interactionData",
        "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;",
        "getInteractionData",
        "()Landroidx/compose/foundation/AbstractClickableNode$InteractionData;",
        "Landroidx/compose/foundation/AbstractClickablePointerInputNode;",
        "getClickablePointerInputNode",
        "()Landroidx/compose/foundation/AbstractClickablePointerInputNode;",
        "clickablePointerInputNode",
        "Landroidx/compose/foundation/ClickableSemanticsNode;",
        "getClickableSemanticsNode",
        "()Landroidx/compose/foundation/ClickableSemanticsNode;",
        "clickableSemanticsNode",
        "<init>",
        "InteractionData",
        "Landroidx/compose/foundation/ClickableNode;",
        "Landroidx/compose/foundation/CombinedClickableNodeImpl;",
        "foundation_release"
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
        "SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1070:1\n1855#2,2:1071\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/AbstractClickableNode\n*L\n783#1:1071,2\n*E\n"
    }
.end annotation


# instance fields
.field private enabled:Z

.field private final interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private onClick:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private onClickLabel:Ljava/lang/String;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private role:Landroidx/compose/ui/semantics/Role;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Z",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/semantics/Role;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 3
    iput-boolean p2, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    .line 4
    iput-object p3, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClickLabel:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Landroidx/compose/foundation/AbstractClickableNode;->role:Landroidx/compose/ui/semantics/Role;

    .line 6
    iput-object p5, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClick:Lv3/a;

    .line 7
    new-instance p1, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    invoke-direct {p1}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/compose/foundation/AbstractClickableNode;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;)V

    return-void
.end method

.method public static final synthetic access$getInteractionSource$p(Landroidx/compose/foundation/AbstractClickableNode;)Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    return-object p0
.end method

.method public static synthetic updateCommon-XHw0xAI$default(Landroidx/compose/foundation/AbstractClickableNode;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;ILjava/lang/Object;)V
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/AbstractClickableNode;->updateCommon-XHw0xAI(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: updateCommon-XHw0xAI"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method protected final disposeInteractionSource()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->getPressInteraction()Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;-><init>(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 15
    .line 16
    invoke-interface {v0, v1}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->getCurrentKeyPressInteractions()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Iterable;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 48
    .line 49
    new-instance v3, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;

    .line 50
    .line 51
    invoke-direct {v3, v1}, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;-><init>(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v2, v3}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-virtual {v0, v1}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->setPressInteraction(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->getCurrentKeyPressInteractions()Ljava/util/Map;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 71
    .line 72
    .line 73
    return-void
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

.method public abstract getClickablePointerInputNode()Landroidx/compose/foundation/AbstractClickablePointerInputNode;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getClickableSemanticsNode()Landroidx/compose/foundation/ClickableSemanticsNode;
    .annotation build Lp4/l;
    .end annotation
.end method

.method protected final getInteractionData()Landroidx/compose/foundation/AbstractClickableNode$InteractionData;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    return-object v0
.end method

.method public onCancelPointerInput()V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->getClickablePointerInputNode()Landroidx/compose/foundation/AbstractClickablePointerInputNode;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/AbstractClickablePointerInputNode;->onCancelPointerInput()V

    return-void
.end method

.method public onDetach()V
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->disposeInteractionSource()V

    return-void
.end method

.method public onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 10
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/compose/foundation/Clickable_androidKt;->isPress-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->getCurrentKeyPressInteractions()Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    invoke-static {v4, v5}, Landroidx/compose/ui/input/key/Key;->box-impl(J)Landroidx/compose/ui/input/key/Key;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    new-instance v0, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 35
    .line 36
    iget-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->getCentreOffset-F1C5BW0()J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    invoke-direct {v0, v4, v5, v3}, Landroidx/compose/foundation/interaction/PressInteraction$Press;-><init>(JLkotlin/jvm/internal/w;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->getCurrentKeyPressInteractions()Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    invoke-static {v4, v5}, Landroidx/compose/ui/input/key/Key;->box-impl(J)Landroidx/compose/ui/input/key/Key;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    new-instance v7, Landroidx/compose/foundation/AbstractClickableNode$onKeyEvent$1;

    .line 69
    .line 70
    invoke-direct {v7, p0, v0, v3}, Landroidx/compose/foundation/AbstractClickableNode$onKeyEvent$1;-><init>(Landroidx/compose/foundation/AbstractClickableNode;Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlin/coroutines/d;)V

    .line 71
    .line 72
    .line 73
    const/4 v8, 0x3

    .line 74
    const/4 v9, 0x0

    .line 75
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    invoke-static {p1}, Landroidx/compose/foundation/Clickable_androidKt;->isClick-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionData:Landroidx/compose/foundation/AbstractClickableNode$InteractionData;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroidx/compose/foundation/AbstractClickableNode$InteractionData;->getCurrentKeyPressInteractions()Ljava/util/Map;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    invoke-static {v4, v5}, Landroidx/compose/ui/input/key/Key;->box-impl(J)Landroidx/compose/ui/input/key/Key;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 108
    .line 109
    if-eqz p1, :cond_1

    .line 110
    .line 111
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    const/4 v5, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    new-instance v7, Landroidx/compose/foundation/AbstractClickableNode$onKeyEvent$2$1;

    .line 118
    .line 119
    invoke-direct {v7, p0, p1, v3}, Landroidx/compose/foundation/AbstractClickableNode$onKeyEvent$2$1;-><init>(Landroidx/compose/foundation/AbstractClickableNode;Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlin/coroutines/d;)V

    .line 120
    .line 121
    .line 122
    const/4 v8, 0x3

    .line 123
    const/4 v9, 0x0

    .line 124
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/i;->e(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;ILjava/lang/Object;)Lkotlinx/coroutines/l2;

    .line 125
    .line 126
    .line 127
    :cond_1
    iget-object p1, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClick:Lv3/a;

    .line 128
    .line 129
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    move v1, v2

    .line 134
    :goto_0
    return v1
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
.end method

.method public onPointerEvent-H0pRuoY(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V
    .locals 1
    .param p1    # Landroidx/compose/ui/input/pointer/PointerEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/input/pointer/PointerEventPass;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->getClickablePointerInputNode()Landroidx/compose/foundation/AbstractClickablePointerInputNode;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/AbstractClickablePointerInputNode;->onPointerEvent-H0pRuoY(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V

    return-void
.end method

.method public onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 0
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method protected final updateCommon-XHw0xAI(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lv3/a;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/semantics/Role;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Z",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/semantics/Role;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->disposeInteractionSource()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroidx/compose/foundation/AbstractClickableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 13
    .line 14
    :cond_0
    iget-boolean p1, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    .line 15
    .line 16
    if-eq p1, p2, :cond_2

    .line 17
    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/foundation/AbstractClickableNode;->disposeInteractionSource()V

    .line 21
    .line 22
    .line 23
    :cond_1
    iput-boolean p2, p0, Landroidx/compose/foundation/AbstractClickableNode;->enabled:Z

    .line 24
    .line 25
    :cond_2
    iput-object p3, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClickLabel:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p4, p0, Landroidx/compose/foundation/AbstractClickableNode;->role:Landroidx/compose/ui/semantics/Role;

    .line 28
    .line 29
    iput-object p5, p0, Landroidx/compose/foundation/AbstractClickableNode;->onClick:Lv3/a;

    .line 30
    .line 31
    return-void
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
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
.end method
