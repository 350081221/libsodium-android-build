.class final Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/modifier/ModifierLocalModifierNode;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;",
        "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "enabled",
        "",
        "(Z)V",
        "getEnabled",
        "()Z",
        "setEnabled",
        "modifierLocalMap",
        "Landroidx/compose/ui/modifier/ModifierLocalMap;",
        "providedValues",
        "getProvidedValues",
        "()Landroidx/compose/ui/modifier/ModifierLocalMap;",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private enabled:Z

.field private final modifierLocalMap:Landroidx/compose/ui/modifier/ModifierLocalMap;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;->enabled:Z

    .line 5
    .line 6
    invoke-static {}, Landroidx/compose/foundation/gestures/ScrollableKt;->getModifierLocalScrollableContainer()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Landroidx/compose/ui/modifier/ModifierLocalModifierNodeKt;->modifierLocalMapOf(Lkotlin/u0;)Landroidx/compose/ui/modifier/ModifierLocalMap;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;->modifierLocalMap:Landroidx/compose/ui/modifier/ModifierLocalMap;

    .line 21
    .line 22
    return-void
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


# virtual methods
.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;->enabled:Z

    return v0
.end method

.method public getProvidedValues()Landroidx/compose/ui/modifier/ModifierLocalMap;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;->enabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;->modifierLocalMap:Landroidx/compose/ui/modifier/ModifierLocalMap;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, Landroidx/compose/ui/modifier/ModifierLocalModifierNodeKt;->modifierLocalMapOf()Landroidx/compose/ui/modifier/ModifierLocalMap;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final setEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;->enabled:Z

    return-void
.end method
