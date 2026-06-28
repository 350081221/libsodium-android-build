.class final Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1;->invoke(ILandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/ui/unit/IntSize;",
        "Landroidx/compose/material3/DraggableAnchors<",
        "Landroidx/compose/material3/SheetValue;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/material3/DraggableAnchors;",
        "Landroidx/compose/material3/SheetValue;",
        "sheetSize",
        "Landroidx/compose/ui/unit/IntSize;",
        "invoke-ozmzZPI",
        "(J)Landroidx/compose/material3/DraggableAnchors;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $layoutHeight:I

.field final synthetic $peekHeightPx:I

.field final synthetic $scaffoldState:Landroidx/compose/material3/BottomSheetScaffoldState;


# direct methods
.method constructor <init>(Landroidx/compose/material3/BottomSheetScaffoldState;II)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1;->$scaffoldState:Landroidx/compose/material3/BottomSheetScaffoldState;

    iput p2, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1;->$layoutHeight:I

    iput p3, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1;->$peekHeightPx:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/unit/IntSize;

    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntSize;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1;->invoke-ozmzZPI(J)Landroidx/compose/material3/DraggableAnchors;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-ozmzZPI(J)Landroidx/compose/material3/DraggableAnchors;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Landroidx/compose/material3/DraggableAnchors<",
            "Landroidx/compose/material3/SheetValue;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    new-instance p2, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1$1;

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1;->$scaffoldState:Landroidx/compose/material3/BottomSheetScaffoldState;

    .line 8
    .line 9
    iget v1, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1;->$layoutHeight:I

    .line 10
    .line 11
    iget v2, p0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1;->$peekHeightPx:I

    .line 12
    .line 13
    invoke-direct {p2, v0, v1, v2, p1}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1$1;-><init>(Landroidx/compose/material3/BottomSheetScaffoldState;III)V

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Landroidx/compose/material3/AnchoredDraggableKt;->DraggableAnchors(Lv3/l;)Landroidx/compose/material3/DraggableAnchors;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
