.class public final Landroidx/compose/ui/node/BackwardsCompatNodeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0003\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005\" \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\" \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/node/BackwardsCompatNode;",
        "",
        "isChainUpdate",
        "androidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1",
        "DetachedModifierLocalReadScope",
        "Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;",
        "Lkotlin/Function1;",
        "Lkotlin/r2;",
        "onDrawCacheReadsChanged",
        "Lv3/l;",
        "updateModifierLocalConsumer",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final DetachedModifierLocalReadScope:Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final onDrawCacheReadsChanged:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/node/BackwardsCompatNode;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final updateModifierLocalConsumer:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/node/BackwardsCompatNode;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/ui/node/BackwardsCompatNodeKt;->DetachedModifierLocalReadScope:Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;

    .line 7
    .line 8
    sget-object v0, Landroidx/compose/ui/node/BackwardsCompatNodeKt$onDrawCacheReadsChanged$1;->INSTANCE:Landroidx/compose/ui/node/BackwardsCompatNodeKt$onDrawCacheReadsChanged$1;

    .line 9
    .line 10
    sput-object v0, Landroidx/compose/ui/node/BackwardsCompatNodeKt;->onDrawCacheReadsChanged:Lv3/l;

    .line 11
    .line 12
    sget-object v0, Landroidx/compose/ui/node/BackwardsCompatNodeKt$updateModifierLocalConsumer$1;->INSTANCE:Landroidx/compose/ui/node/BackwardsCompatNodeKt$updateModifierLocalConsumer$1;

    .line 13
    .line 14
    sput-object v0, Landroidx/compose/ui/node/BackwardsCompatNodeKt;->updateModifierLocalConsumer:Lv3/l;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
.end method

.method public static final synthetic access$getDetachedModifierLocalReadScope$p()Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;
    .locals 1

    sget-object v0, Landroidx/compose/ui/node/BackwardsCompatNodeKt;->DetachedModifierLocalReadScope:Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;

    return-object v0
.end method

.method public static final synthetic access$getOnDrawCacheReadsChanged$p()Lv3/l;
    .locals 1

    sget-object v0, Landroidx/compose/ui/node/BackwardsCompatNodeKt;->onDrawCacheReadsChanged:Lv3/l;

    return-object v0
.end method

.method public static final synthetic access$getUpdateModifierLocalConsumer$p()Lv3/l;
    .locals 1

    sget-object v0, Landroidx/compose/ui/node/BackwardsCompatNodeKt;->updateModifierLocalConsumer:Lv3/l;

    return-object v0
.end method

.method public static final synthetic access$isChainUpdate(Landroidx/compose/ui/node/BackwardsCompatNode;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/node/BackwardsCompatNodeKt;->isChainUpdate(Landroidx/compose/ui/node/BackwardsCompatNode;)Z

    move-result p0

    return p0
.end method

.method private static final isChainUpdate(Landroidx/compose/ui/node/BackwardsCompatNode;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode"

    .line 14
    .line 15
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast p0, Landroidx/compose/ui/node/TailModifierNode;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/node/TailModifierNode;->getAttachHasBeenRun()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
