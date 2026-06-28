.class final Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/compose/MotionLayoutKt;->rememberMotionLayoutMeasurePolicy(ILjava/util/EnumSet;JLandroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Landroidx/compose/runtime/MutableState;Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $constraintSetEnd:Landroidx/constraintlayout/compose/ConstraintSet;

.field final synthetic $constraintSetStart:Landroidx/constraintlayout/compose/ConstraintSet;

.field final synthetic $measurer:Landroidx/constraintlayout/compose/MotionMeasurer;

.field final synthetic $optimizationLevel:I

.field final synthetic $progress:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $transition:Landroidx/constraintlayout/compose/Transition;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;ILandroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/compose/MotionMeasurer;",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            "Landroidx/constraintlayout/compose/Transition;",
            "I",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$measurer:Landroidx/constraintlayout/compose/MotionMeasurer;

    iput-object p2, p0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$constraintSetStart:Landroidx/constraintlayout/compose/ConstraintSet;

    iput-object p3, p0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$constraintSetEnd:Landroidx/constraintlayout/compose/ConstraintSet;

    iput-object p4, p0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$transition:Landroidx/constraintlayout/compose/Transition;

    iput p5, p0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$optimizationLevel:I

    iput-object p6, p0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$progress:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public maxIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
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
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/MeasurePolicy$DefaultImpls;->maxIntrinsicHeight(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public maxIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
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
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/MeasurePolicy$DefaultImpls;->maxIntrinsicWidth(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 14
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
    move-object v0, p0

    .line 2
    move-object/from16 v12, p2

    .line 3
    .line 4
    const-string v1, "$this$MeasurePolicy"

    .line 5
    .line 6
    move-object v13, p1

    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "measurables"

    .line 11
    .line 12
    invoke-static {v12, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$measurer:Landroidx/constraintlayout/compose/MotionMeasurer;

    .line 16
    .line 17
    invoke-interface {p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v5, v0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$constraintSetStart:Landroidx/constraintlayout/compose/ConstraintSet;

    .line 22
    .line 23
    iget-object v6, v0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$constraintSetEnd:Landroidx/constraintlayout/compose/ConstraintSet;

    .line 24
    .line 25
    iget-object v7, v0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$transition:Landroidx/constraintlayout/compose/Transition;

    .line 26
    .line 27
    iget v9, v0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$optimizationLevel:I

    .line 28
    .line 29
    iget-object v2, v0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$progress:Landroidx/compose/runtime/MutableState;

    .line 30
    .line 31
    invoke-interface {v2}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    move-wide/from16 v2, p3

    .line 42
    .line 43
    move-object/from16 v8, p2

    .line 44
    .line 45
    move-object v11, p1

    .line 46
    invoke-virtual/range {v1 .. v11}, Landroidx/constraintlayout/compose/MotionMeasurer;->performInterpolationMeasure-OQbXsTc(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Ljava/util/List;IFLandroidx/compose/ui/layout/MeasureScope;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntSize;->getWidth-impl(J)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/IntSize;->getHeight-impl(J)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const/4 v5, 0x0

    .line 59
    new-instance v6, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1$measure$1;

    .line 60
    .line 61
    iget-object v1, v0, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1;->$measurer:Landroidx/constraintlayout/compose/MotionMeasurer;

    .line 62
    .line 63
    invoke-direct {v6, v1, v12}, Landroidx/constraintlayout/compose/MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1$measure$1;-><init>(Landroidx/constraintlayout/compose/MotionMeasurer;Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    const/4 v7, 0x4

    .line 67
    const/4 v8, 0x0

    .line 68
    move-object v2, p1

    .line 69
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/MeasureScope$DefaultImpls;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lv3/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    return-object v1
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public minIntrinsicHeight(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
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
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/MeasurePolicy$DefaultImpls;->minIntrinsicHeight(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public minIntrinsicWidth(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
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
            "Landroidx/compose/ui/layout/IntrinsicMeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;I)I"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/layout/MeasurePolicy$DefaultImpls;->minIntrinsicWidth(Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I

    move-result p1

    return p1
.end method
