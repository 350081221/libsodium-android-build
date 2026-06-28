.class public final Landroidx/compose/foundation/FocusedBoundsObserverNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/modifier/ModifierLocalModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u000bR0\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\"\u0010\u000c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R$\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\t\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/foundation/FocusedBoundsObserverNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "Lkotlin/r2;",
        "onPositioned",
        "Lv3/l;",
        "getOnPositioned",
        "()Lv3/l;",
        "setOnPositioned",
        "(Lv3/l;)V",
        "focusBoundsObserver",
        "Landroidx/compose/ui/modifier/ModifierLocalMap;",
        "providedValues",
        "Landroidx/compose/ui/modifier/ModifierLocalMap;",
        "getProvidedValues",
        "()Landroidx/compose/ui/modifier/ModifierLocalMap;",
        "getParent",
        "parent",
        "<init>",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final focusBoundsObserver:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private onPositioned:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final providedValues:Landroidx/compose/ui/modifier/ModifierLocalMap;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lv3/l;)V
    .locals 1
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/FocusedBoundsObserverNode;->onPositioned:Lv3/l;

    .line 5
    .line 6
    new-instance p1, Landroidx/compose/foundation/FocusedBoundsObserverNode$focusBoundsObserver$1;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Landroidx/compose/foundation/FocusedBoundsObserverNode$focusBoundsObserver$1;-><init>(Landroidx/compose/foundation/FocusedBoundsObserverNode;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/compose/foundation/FocusedBoundsObserverNode;->focusBoundsObserver:Lv3/l;

    .line 12
    .line 13
    invoke-static {}, Landroidx/compose/foundation/FocusedBoundsKt;->getModifierLocalFocusedBoundsObserver()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0, p1}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Landroidx/compose/ui/modifier/ModifierLocalModifierNodeKt;->modifierLocalMapOf(Lkotlin/u0;)Landroidx/compose/ui/modifier/ModifierLocalMap;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Landroidx/compose/foundation/FocusedBoundsObserverNode;->providedValues:Landroidx/compose/ui/modifier/ModifierLocalMap;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic access$getParent(Landroidx/compose/foundation/FocusedBoundsObserverNode;)Lv3/l;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/FocusedBoundsObserverNode;->getParent()Lv3/l;

    move-result-object p0

    return-object p0
.end method

.method private final getParent()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroidx/compose/foundation/FocusedBoundsKt;->getModifierLocalFocusedBoundsObserver()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/modifier/ModifierLocalModifierNode;->getCurrent(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv3/l;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public final getOnPositioned()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/FocusedBoundsObserverNode;->onPositioned:Lv3/l;

    return-object v0
.end method

.method public getProvidedValues()Landroidx/compose/ui/modifier/ModifierLocalMap;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/FocusedBoundsObserverNode;->providedValues:Landroidx/compose/ui/modifier/ModifierLocalMap;

    return-object v0
.end method

.method public final setOnPositioned(Lv3/l;)V
    .locals 0
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/FocusedBoundsObserverNode;->onPositioned:Lv3/l;

    return-void
.end method
