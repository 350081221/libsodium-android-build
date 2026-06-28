.class public interface abstract Landroidx/compose/foundation/text/selection/SelectionLayout;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008`\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&J\u0012\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0000H&J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u000c2\u0006\u0010\u000b\u001a\u00020\nH&R\u0014\u0010\u0012\u001a\u00020\u000f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00178&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001cR\u0014\u0010!\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u001cR\u0014\u0010#\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u001cR\u0014\u0010%\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u001cR\u0014\u0010&\u001a\u00020\u00088&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'R\u0016\u0010*\u001a\u0004\u0018\u00010\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006+\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/text/selection/SelectionLayout;",
        "",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/text/selection/SelectableInfo;",
        "Lkotlin/r2;",
        "block",
        "forEachMiddleInfo",
        "other",
        "",
        "shouldRecomputeSelection",
        "Landroidx/compose/foundation/text/selection/Selection;",
        "selection",
        "",
        "",
        "createSubSelections",
        "",
        "getSize",
        "()I",
        "size",
        "getStartSlot",
        "startSlot",
        "getEndSlot",
        "endSlot",
        "Landroidx/compose/foundation/text/selection/CrossStatus;",
        "getCrossStatus",
        "()Landroidx/compose/foundation/text/selection/CrossStatus;",
        "crossStatus",
        "getStartInfo",
        "()Landroidx/compose/foundation/text/selection/SelectableInfo;",
        "startInfo",
        "getEndInfo",
        "endInfo",
        "getCurrentInfo",
        "currentInfo",
        "getFirstInfo",
        "firstInfo",
        "getLastInfo",
        "lastInfo",
        "isStartHandle",
        "()Z",
        "getPreviousSelection",
        "()Landroidx/compose/foundation/text/selection/Selection;",
        "previousSelection",
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
.method public abstract createSubSelections(Landroidx/compose/foundation/text/selection/Selection;)Ljava/util/Map;
    .param p1    # Landroidx/compose/foundation/text/selection/Selection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/selection/Selection;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Landroidx/compose/foundation/text/selection/Selection;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract forEachMiddleInfo(Lv3/l;)V
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text/selection/SelectableInfo;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract getCrossStatus()Landroidx/compose/foundation/text/selection/CrossStatus;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getCurrentInfo()Landroidx/compose/foundation/text/selection/SelectableInfo;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getEndInfo()Landroidx/compose/foundation/text/selection/SelectableInfo;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getEndSlot()I
.end method

.method public abstract getFirstInfo()Landroidx/compose/foundation/text/selection/SelectableInfo;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getLastInfo()Landroidx/compose/foundation/text/selection/SelectableInfo;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getPreviousSelection()Landroidx/compose/foundation/text/selection/Selection;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getSize()I
.end method

.method public abstract getStartInfo()Landroidx/compose/foundation/text/selection/SelectableInfo;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getStartSlot()I
.end method

.method public abstract isStartHandle()Z
.end method

.method public abstract shouldRecomputeSelection(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z
    .param p1    # Landroidx/compose/foundation/text/selection/SelectionLayout;
        .annotation build Lp4/m;
        .end annotation
    .end param
.end method
