.class public interface abstract Landroidx/compose/foundation/text/selection/Selectable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J\u0008\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H&J\u001d\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0008\u0010\u001f\u001a\u00020\u0013H&R\u0014\u0010#\u001a\u00020 8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u00f8\u0001\u0002\u0082\u0002\u0011\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0004\u0008!0\u0001\u00a8\u0006$\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/text/selection/Selectable;",
        "",
        "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;",
        "builder",
        "Lkotlin/r2;",
        "appendSelectableInfoToBuilder",
        "Landroidx/compose/foundation/text/selection/Selection;",
        "getSelectAllSelection",
        "selection",
        "",
        "isStartHandle",
        "Landroidx/compose/ui/geometry/Offset;",
        "getHandlePosition-dBAh8RU",
        "(Landroidx/compose/foundation/text/selection/Selection;Z)J",
        "getHandlePosition",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "getLayoutCoordinates",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "getText",
        "",
        "offset",
        "Landroidx/compose/ui/geometry/Rect;",
        "getBoundingBox",
        "",
        "getLineLeft",
        "getLineRight",
        "getCenterYForOffset",
        "Landroidx/compose/ui/text/TextRange;",
        "getRangeOfLineContaining--jx7JFs",
        "(I)J",
        "getRangeOfLineContaining",
        "getLastVisibleOffset",
        "",
        "getSelectableId",
        "()J",
        "selectableId",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract appendSelectableInfoToBuilder(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;)V
    .param p1    # Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getCenterYForOffset(I)F
.end method

.method public abstract getHandlePosition-dBAh8RU(Landroidx/compose/foundation/text/selection/Selection;Z)J
    .param p1    # Landroidx/compose/foundation/text/selection/Selection;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract getLastVisibleOffset()I
.end method

.method public abstract getLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getLineLeft(I)F
.end method

.method public abstract getLineRight(I)F
.end method

.method public abstract getRangeOfLineContaining--jx7JFs(I)J
.end method

.method public abstract getSelectAllSelection()Landroidx/compose/foundation/text/selection/Selection;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getSelectableId()J
.end method

.method public abstract getText()Landroidx/compose/ui/text/AnnotatedString;
    .annotation build Lp4/l;
    .end annotation
.end method
