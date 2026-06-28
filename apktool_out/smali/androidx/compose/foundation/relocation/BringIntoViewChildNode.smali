.class public abstract Landroidx/compose/foundation/relocation/BringIntoViewChildNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/modifier/ModifierLocalModifierNode;
.implements Landroidx/compose/ui/node/LayoutAwareModifierNode;
.implements Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008 \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR(\u0010\r\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00058D@BX\u0084\u000e\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\t8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0012\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/foundation/relocation/BringIntoViewChildNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;",
        "Landroidx/compose/ui/node/LayoutAwareModifierNode;",
        "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "coordinates",
        "Lkotlin/r2;",
        "onPlaced",
        "Landroidx/compose/foundation/relocation/BringIntoViewParent;",
        "defaultParent",
        "Landroidx/compose/foundation/relocation/BringIntoViewParent;",
        "<set-?>",
        "layoutCoordinates",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "getLayoutCoordinates",
        "()Landroidx/compose/ui/layout/LayoutCoordinates;",
        "getLocalParent",
        "()Landroidx/compose/foundation/relocation/BringIntoViewParent;",
        "localParent",
        "getParent",
        "parent",
        "<init>",
        "()V",
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
        "SMAP\nBringIntoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoView.kt\nandroidx/compose/foundation/relocation/BringIntoViewChildNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final defaultParent:Landroidx/compose/foundation/relocation/BringIntoViewParent;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;
    .annotation build Lp4/m;
    .end annotation
.end field


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
    invoke-static {p0}, Landroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt;->defaultBringIntoViewParent(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Landroidx/compose/foundation/relocation/BringIntoViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewChildNode;->defaultParent:Landroidx/compose/foundation/relocation/BringIntoViewParent;

    .line 9
    .line 10
    return-void
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

.method private final getLocalParent()Landroidx/compose/foundation/relocation/BringIntoViewParent;
    .locals 1

    invoke-static {}, Landroidx/compose/foundation/relocation/BringIntoViewKt;->getModifierLocalBringIntoViewParent()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/modifier/ModifierLocalModifierNode;->getCurrent(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/relocation/BringIntoViewParent;

    return-object v0
.end method


# virtual methods
.method protected final getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 3
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewChildNode;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method protected final getParent()Landroidx/compose/foundation/relocation/BringIntoViewParent;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-direct {p0}, Landroidx/compose/foundation/relocation/BringIntoViewChildNode;->getLocalParent()Landroidx/compose/foundation/relocation/BringIntoViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewChildNode;->defaultParent:Landroidx/compose/foundation/relocation/BringIntoViewParent;

    :cond_0
    return-object v0
.end method

.method public onPlaced(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewChildNode;->layoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    return-void
.end method
