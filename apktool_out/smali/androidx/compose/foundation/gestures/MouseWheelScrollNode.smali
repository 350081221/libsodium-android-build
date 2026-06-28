.class final Landroidx/compose/foundation/gestures/MouseWheelScrollNode;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R$\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/MouseWheelScrollNode;",
        "Landroidx/compose/ui/node/DelegatingNode;",
        "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;",
        "Lkotlin/r2;",
        "onAttach",
        "Landroidx/compose/foundation/gestures/ScrollingLogic;",
        "scrollingLogic",
        "Landroidx/compose/foundation/gestures/ScrollingLogic;",
        "Landroidx/compose/foundation/gestures/ScrollConfig;",
        "scrollConfig",
        "Landroidx/compose/foundation/gestures/ScrollConfig;",
        "getScrollConfig",
        "()Landroidx/compose/foundation/gestures/ScrollConfig;",
        "setScrollConfig",
        "(Landroidx/compose/foundation/gestures/ScrollConfig;)V",
        "<init>",
        "(Landroidx/compose/foundation/gestures/ScrollingLogic;)V",
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
.field private scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final scrollingLogic:Landroidx/compose/foundation/gestures/ScrollingLogic;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/ScrollingLogic;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/gestures/ScrollingLogic;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode;->scrollingLogic:Landroidx/compose/foundation/gestures/ScrollingLogic;

    .line 5
    .line 6
    new-instance p1, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Landroidx/compose/foundation/gestures/MouseWheelScrollNode$1;-><init>(Landroidx/compose/foundation/gestures/MouseWheelScrollNode;Lkotlin/coroutines/d;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->SuspendingPointerInputModifierNode(Lv3/p;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 17
    .line 18
    .line 19
    return-void
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

.method public static final synthetic access$getScrollingLogic$p(Landroidx/compose/foundation/gestures/MouseWheelScrollNode;)Landroidx/compose/foundation/gestures/ScrollingLogic;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode;->scrollingLogic:Landroidx/compose/foundation/gestures/ScrollingLogic;

    return-object p0
.end method


# virtual methods
.method public final getScrollConfig()Landroidx/compose/foundation/gestures/ScrollConfig;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode;->scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    return-object v0
.end method

.method public onAttach()V
    .locals 1

    invoke-static {p0}, Landroidx/compose/foundation/gestures/AndroidScrollable_androidKt;->platformScrollConfig(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Landroidx/compose/foundation/gestures/ScrollConfig;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode;->scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    return-void
.end method

.method public final setScrollConfig(Landroidx/compose/foundation/gestures/ScrollConfig;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/gestures/ScrollConfig;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollNode;->scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    return-void
.end method
