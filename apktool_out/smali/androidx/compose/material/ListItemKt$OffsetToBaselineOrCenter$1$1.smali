.class final Landroidx/compose/material/ListItemKt$OffsetToBaselineOrCenter$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/ListItemKt;->OffsetToBaselineOrCenter-Kz89ssw(FLandroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "<anonymous>",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"
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
.field final synthetic $offset:F


# direct methods
.method constructor <init>(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/material/ListItemKt$OffsetToBaselineOrCenter$1$1;->$offset:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 9
    .param p1    # Landroidx/compose/ui/layout/MeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    check-cast p2, Landroidx/compose/ui/layout/Measurable;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/16 v7, 0xb

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    move-wide v1, p3

    .line 16
    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/unit/Constraints;->copy-Zbe2FdA$default(JIIIIILjava/lang/Object;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-interface {p2, v1, v2}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p2, v1}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/high16 v2, -0x80000000

    .line 33
    .line 34
    if-eq v1, v2, :cond_0

    .line 35
    .line 36
    iget v0, p0, Landroidx/compose/material/ListItemKt$OffsetToBaselineOrCenter$1$1;->$offset:F

    .line 37
    .line 38
    invoke-interface {p1, v0}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sub-int/2addr v0, v1

    .line 43
    invoke-static {p3, p4}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    add-int/2addr p4, v0

    .line 52
    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {p3, p4}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    sget-object p4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 70
    .line 71
    invoke-virtual {p4}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    sget-object p4, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    .line 76
    .line 77
    invoke-virtual {p4}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 82
    .line 83
    .line 84
    move-result p4

    .line 85
    sub-int p4, p3, p4

    .line 86
    .line 87
    invoke-static {v0, p4}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    invoke-interface {p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-interface/range {v1 .. v6}, Landroidx/compose/ui/Alignment;->align-KFBX0sM(JJLandroidx/compose/ui/unit/LayoutDirection;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    :goto_0
    move v3, p3

    .line 104
    invoke-virtual {p2}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    const/4 v4, 0x0

    .line 109
    new-instance v5, Landroidx/compose/material/ListItemKt$OffsetToBaselineOrCenter$1$1$1;

    .line 110
    .line 111
    invoke-direct {v5, p2, v0}, Landroidx/compose/material/ListItemKt$OffsetToBaselineOrCenter$1$1$1;-><init>(Landroidx/compose/ui/layout/Placeable;I)V

    .line 112
    .line 113
    .line 114
    const/4 v6, 0x4

    .line 115
    const/4 v7, 0x0

    .line 116
    move-object v1, p1

    .line 117
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lv3/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method
