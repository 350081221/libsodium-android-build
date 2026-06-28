.class final Landroidx/compose/foundation/layout/PaddingValuesElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/layout/PaddingValuesModifier;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B(\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0014\u00a2\u0006\u0002\u0008\u0015\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u0013\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\u000c\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R(\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0014\u00a2\u0006\u0002\u0008\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/PaddingValuesElement;",
        "Landroidx/compose/ui/node/ModifierNodeElement;",
        "Landroidx/compose/foundation/layout/PaddingValuesModifier;",
        "create",
        "node",
        "Lkotlin/r2;",
        "update",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "Landroidx/compose/ui/platform/InspectorInfo;",
        "inspectableProperties",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "paddingValues",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "getPaddingValues",
        "()Landroidx/compose/foundation/layout/PaddingValues;",
        "Lkotlin/Function1;",
        "Lkotlin/u;",
        "inspectorInfo",
        "Lv3/l;",
        "getInspectorInfo",
        "()Lv3/l;",
        "<init>",
        "(Landroidx/compose/foundation/layout/PaddingValues;Lv3/l;)V",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final inspectorInfo:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Landroidx/compose/ui/platform/InspectorInfo;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final paddingValues:Landroidx/compose/foundation/layout/PaddingValues;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/layout/PaddingValues;Lv3/l;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/platform/InspectorInfo;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->inspectorInfo:Lv3/l;

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
.end method


# virtual methods
.method public create()Landroidx/compose/foundation/layout/PaddingValuesModifier;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/foundation/layout/PaddingValuesModifier;

    iget-object v1, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-direct {v0, v1}, Landroidx/compose/foundation/layout/PaddingValuesModifier;-><init>(Landroidx/compose/foundation/layout/PaddingValues;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/layout/PaddingValuesElement;->create()Landroidx/compose/foundation/layout/PaddingValuesModifier;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Landroidx/compose/foundation/layout/PaddingValuesElement;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/compose/foundation/layout/PaddingValuesElement;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/compose/foundation/layout/PaddingValuesElement;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    .line 16
    .line 17
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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

.method public final getInspectorInfo()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Landroidx/compose/ui/platform/InspectorInfo;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->inspectorInfo:Lv3/l;

    return-object v0
.end method

.method public final getPaddingValues()Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

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

    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->inspectorInfo:Lv3/l;

    invoke-interface {v0, p1}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public update(Landroidx/compose/foundation/layout/PaddingValuesModifier;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/layout/PaddingValuesModifier;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->paddingValues:Landroidx/compose/foundation/layout/PaddingValues;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/PaddingValuesModifier;->setPaddingValues(Landroidx/compose/foundation/layout/PaddingValues;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/layout/PaddingValuesModifier;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/PaddingValuesElement;->update(Landroidx/compose/foundation/layout/PaddingValuesModifier;)V

    return-void
.end method
