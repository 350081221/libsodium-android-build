.class final Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier$measure$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $placeable:Landroidx/compose/ui/layout/Placeable;

.field final synthetic this$0:Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier$measure$1;->$placeable:Landroidx/compose/ui/layout/Placeable;

    iput-object p2, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier$measure$1;->this$0:Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier$measure$1;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 8
    .param p1    # Landroidx/compose/ui/layout/Placeable$PlacementScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 2
    iget-object v1, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier$measure$1;->$placeable:Landroidx/compose/ui/layout/Placeable;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier$measure$1;->this$0:Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;->getLayerBlock()Lv3/l;

    move-result-object v5

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeWithLayer$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFLv3/l;ILjava/lang/Object;)V

    return-void
.end method
