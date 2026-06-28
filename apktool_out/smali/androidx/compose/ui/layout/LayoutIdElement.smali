.class final Landroidx/compose/ui/layout/LayoutIdElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/ui/layout/LayoutIdModifier;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0082\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\t\u0010\u0004\u001a\u00020\u0003H\u00c2\u0003J\u0008\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u000c\u0010\n\u001a\u00020\u0007*\u00020\tH\u0016J\u0013\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/ui/layout/LayoutIdElement;",
        "Landroidx/compose/ui/node/ModifierNodeElement;",
        "Landroidx/compose/ui/layout/LayoutIdModifier;",
        "",
        "component1",
        "create",
        "node",
        "Lkotlin/r2;",
        "update",
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "inspectableProperties",
        "layoutId",
        "copy",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "Ljava/lang/Object;",
        "<init>",
        "(Ljava/lang/Object;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final layoutId:Ljava/lang/Object;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/layout/LayoutIdElement;->layoutId:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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

.method private final component1()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutIdElement;->layoutId:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic copy$default(Landroidx/compose/ui/layout/LayoutIdElement;Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/ui/layout/LayoutIdElement;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/layout/LayoutIdElement;->layoutId:Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/layout/LayoutIdElement;->copy(Ljava/lang/Object;)Landroidx/compose/ui/layout/LayoutIdElement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Ljava/lang/Object;)Landroidx/compose/ui/layout/LayoutIdElement;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Landroidx/compose/ui/layout/LayoutIdElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/layout/LayoutIdElement;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/LayoutIdElement;->create()Landroidx/compose/ui/layout/LayoutIdModifier;

    move-result-object v0

    return-object v0
.end method

.method public create()Landroidx/compose/ui/layout/LayoutIdModifier;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/ui/layout/LayoutIdModifier;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutIdElement;->layoutId:Ljava/lang/Object;

    invoke-direct {v0, v1}, Landroidx/compose/ui/layout/LayoutIdModifier;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/layout/LayoutIdElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/layout/LayoutIdElement;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutIdElement;->layoutId:Ljava/lang/Object;

    iget-object p1, p1, Landroidx/compose/ui/layout/LayoutIdElement;->layoutId:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutIdElement;->layoutId:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/platform/InspectorInfo;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "layoutId"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutIdElement;->layoutId:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LayoutIdElement(layoutId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutIdElement;->layoutId:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/LayoutIdModifier;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/layout/LayoutIdElement;->update(Landroidx/compose/ui/layout/LayoutIdModifier;)V

    return-void
.end method

.method public update(Landroidx/compose/ui/layout/LayoutIdModifier;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/layout/LayoutIdModifier;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutIdElement;->layoutId:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/layout/LayoutIdModifier;->setLayoutId$ui_release(Ljava/lang/Object;)V

    return-void
.end method
