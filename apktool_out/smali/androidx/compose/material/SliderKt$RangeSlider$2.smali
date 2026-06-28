.class final Landroidx/compose/material/SliderKt$RangeSlider$2;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SliderKt;->RangeSlider(Lkotlin/ranges/f;Lv3/l;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/f;ILv3/a;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/q<",
        "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;",
        "Lkotlin/r2;",
        "invoke",
        "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1195:1\n74#2:1196\n74#2:1197\n25#3:1198\n25#3:1205\n25#3:1216\n1116#4,6:1199\n1116#4,6:1206\n1116#4,3:1217\n1119#4,3:1223\n1116#4,6:1227\n1116#4,6:1233\n1116#4,6:1239\n487#5,4:1212\n491#5,2:1220\n495#5:1226\n487#6:1222\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n319#1:1196\n324#1:1197\n335#1:1198\n336#1:1205\n353#1:1216\n335#1:1199,6\n336#1:1206,6\n353#1:1217,3\n353#1:1223,3\n378#1:1227,6\n420#1:1233,6\n428#1:1239,6\n353#1:1212,4\n353#1:1220,2\n353#1:1226\n353#1:1222\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $colors:Landroidx/compose/material/SliderColors;

.field final synthetic $enabled:Z

.field final synthetic $endInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $onValueChangeFinished:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onValueChangeState:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lv3/l<",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/r2;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $startInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field final synthetic $steps:I

.field final synthetic $tickFractions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $value:Lkotlin/ranges/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $valueRange:Lkotlin/ranges/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/ranges/f;Lkotlin/ranges/f;Landroidx/compose/runtime/State;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZILv3/a;Ljava/util/List;Landroidx/compose/material/SliderColors;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/l<",
            "-",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/r2;",
            ">;>;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "ZI",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/material/SliderColors;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    iput-object p2, p0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    iput-object p3, p0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeState:Landroidx/compose/runtime/State;

    iput-object p4, p0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$startInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-object p5, p0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$endInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-boolean p6, p0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$enabled:Z

    iput p7, p0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$steps:I

    iput-object p8, p0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeFinished:Lv3/a;

    iput-object p9, p0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$tickFractions:Ljava/util/List;

    iput-object p10, p0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$colors:Landroidx/compose/material/SliderColors;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/SliderKt$RangeSlider$2;->invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$invoke$scaleToUserValue(Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Lkotlin/ranges/f;Lkotlin/ranges/f;)Lkotlin/ranges/f;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/SliderKt$RangeSlider$2;->invoke$scaleToUserValue(Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Lkotlin/ranges/f;Lkotlin/ranges/f;)Lkotlin/ranges/f;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/jvm/internal/k1$e;",
            "Lkotlin/jvm/internal/k1$e;",
            "F)F"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface {p0}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    iget p1, p1, Lkotlin/jvm/internal/k1$e;->element:F

    iget p2, p2, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-static {v0, p0, p3, p1, p2}, Landroidx/compose/material/SliderKt;->access$scale(FFFFF)F

    move-result p0

    return p0
.end method

.method private static final invoke$scaleToUserValue(Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Lkotlin/ranges/f;Lkotlin/ranges/f;)Lkotlin/ranges/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/k1$e;",
            "Lkotlin/jvm/internal/k1$e;",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;)",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget p0, p0, Lkotlin/jvm/internal/k1$e;->element:F

    iget p1, p1, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-interface {p2}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface {p2}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p0, p1, p3, v0, p2}, Landroidx/compose/material/SliderKt;->access$scale(FFLkotlin/ranges/f;FF)Lkotlin/ranges/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material/SliderKt$RangeSlider$2;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
    .locals 31
    .param p1    # Landroidx/compose/foundation/layout/BoxWithConstraintsScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_1

    move-object/from16 v1, p1

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v1, p1

    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    .line 2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_4

    .line 4
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:318)"

    const v5, 0x26e5bb63

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    .line 5
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    .line 6
    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    const/4 v8, 0x0

    if-ne v2, v3, :cond_5

    const/4 v2, 0x1

    move/from16 v19, v2

    goto :goto_3

    :cond_5
    move/from16 v19, v8

    .line 7
    :goto_3
    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;->getConstraints-msEJaDk()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v1

    int-to-float v9, v1

    .line 8
    new-instance v10, Lkotlin/jvm/internal/k1$e;

    invoke-direct {v10}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 9
    new-instance v11, Lkotlin/jvm/internal/k1$e;

    invoke-direct {v11}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 10
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    .line 11
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    .line 12
    check-cast v1, Landroidx/compose/ui/unit/Density;

    .line 13
    invoke-static {}, Landroidx/compose/material/SliderKt;->getThumbRadius()F

    move-result v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v2

    sub-float v2, v9, v2

    iput v2, v10, Lkotlin/jvm/internal/k1$e;->element:F

    .line 14
    invoke-static {}, Landroidx/compose/material/SliderKt;->getThumbRadius()F

    move-result v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v1

    iput v1, v11, Lkotlin/jvm/internal/k1$e;->element:F

    .line 15
    iget-object v1, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    const v13, -0x1d58f75c

    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 16
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .line 17
    sget-object v30, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v30 .. v30}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_6

    .line 18
    invoke-interface {v1}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v2, v11, v10, v1}, Landroidx/compose/material/SliderKt$RangeSlider$2;->access$invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F

    move-result v1

    invoke-static {v1}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v3

    .line 19
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 20
    :cond_6
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 21
    move-object v15, v3

    check-cast v15, Landroidx/compose/runtime/MutableFloatState;

    .line 22
    iget-object v1, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 23
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .line 24
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_7

    .line 25
    invoke-interface {v1}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v2, v11, v10, v1}, Landroidx/compose/material/SliderKt$RangeSlider$2;->access$invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F

    move-result v1

    invoke-static {v1}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v3

    .line 26
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 27
    :cond_7
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 28
    move-object v14, v3

    check-cast v14, Landroidx/compose/runtime/MutableFloatState;

    .line 29
    new-instance v1, Landroidx/compose/material/SliderKt$RangeSlider$2$2;

    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-direct {v1, v2, v11, v10}, Landroidx/compose/material/SliderKt$RangeSlider$2$2;-><init>(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;)V

    .line 30
    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    .line 31
    iget v3, v11, Lkotlin/jvm/internal/k1$e;->element:F

    iget v4, v10, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-static {v3, v4}, Lkotlin/ranges/s;->e(FF)Lkotlin/ranges/f;

    move-result-object v3

    .line 32
    iget-object v4, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    invoke-interface {v4}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v5

    const/16 v7, 0xc00

    move-object v4, v15

    move-object/from16 v6, p2

    .line 33
    invoke-static/range {v1 .. v7}, Landroidx/compose/material/SliderKt;->access$CorrectValueSideEffect(Lv3/l;Lkotlin/ranges/f;Lkotlin/ranges/f;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V

    .line 34
    new-instance v1, Landroidx/compose/material/SliderKt$RangeSlider$2$3;

    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-direct {v1, v2, v11, v10}, Landroidx/compose/material/SliderKt$RangeSlider$2$3;-><init>(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;)V

    .line 35
    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    .line 36
    iget v3, v11, Lkotlin/jvm/internal/k1$e;->element:F

    iget v4, v10, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-static {v3, v4}, Lkotlin/ranges/s;->e(FF)Lkotlin/ranges/f;

    move-result-object v3

    .line 37
    iget-object v4, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    invoke-interface {v4}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v5

    move-object v4, v14

    .line 38
    invoke-static/range {v1 .. v7}, Landroidx/compose/material/SliderKt;->access$CorrectValueSideEffect(Lv3/l;Lkotlin/ranges/f;Lkotlin/ranges/f;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V

    const v1, 0x2e20b340

    .line 39
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 40
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 41
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 42
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_8

    .line 43
    sget-object v1, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 44
    invoke-static {v1, v12}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    move-result-object v1

    .line 45
    new-instance v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v2, v1}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 46
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v1, v2

    .line 47
    :cond_8
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 48
    check-cast v1, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 49
    invoke-virtual {v1}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    move-result-object v27

    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 50
    new-instance v1, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;

    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$tickFractions:Ljava/util/List;

    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeFinished:Lv3/a;

    iget-object v4, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeState:Landroidx/compose/runtime/State;

    iget-object v5, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    move-object/from16 v20, v1

    move-object/from16 v21, v15

    move-object/from16 v22, v14

    move-object/from16 v23, v2

    move-object/from16 v24, v11

    move-object/from16 v25, v10

    move-object/from16 v26, v3

    move-object/from16 v28, v4

    move-object/from16 v29, v5

    invoke-direct/range {v20 .. v29}, Landroidx/compose/material/SliderKt$RangeSlider$2$gestureEndAction$1;-><init>(Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Ljava/util/List;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Lv3/a;Lkotlinx/coroutines/s0;Landroidx/compose/runtime/State;Lkotlin/ranges/f;)V

    invoke-static {v1, v12, v8}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    const v2, 0x107ae5a

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget v3, v11, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v3

    or-int/2addr v2, v3

    iget v3, v10, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeState:Landroidx/compose/runtime/State;

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    .line 51
    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    iget-object v4, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeState:Landroidx/compose/runtime/State;

    iget-object v5, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    .line 52
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_9

    .line 53
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_a

    .line 54
    :cond_9
    new-instance v6, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;

    move-object/from16 v20, v6

    move-object/from16 v21, v15

    move-object/from16 v22, v14

    move-object/from16 v23, v3

    move-object/from16 v24, v11

    move-object/from16 v25, v10

    move-object/from16 v26, v4

    move-object/from16 v27, v5

    invoke-direct/range {v20 .. v27}, Landroidx/compose/material/SliderKt$RangeSlider$2$onDrag$1$1;-><init>(Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Landroidx/compose/runtime/State;Lkotlin/ranges/f;)V

    .line 55
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 56
    :cond_a
    check-cast v6, Lv3/p;

    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-static {v6, v12, v8}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v23

    .line 57
    sget-object v24, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 58
    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$startInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 59
    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$endInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 60
    iget-boolean v4, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$enabled:Z

    .line 61
    iget-object v5, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    move-object/from16 v13, v24

    move-object v6, v14

    move-object v14, v2

    move-object v2, v15

    move-object v15, v3

    move-object/from16 v16, v2

    move-object/from16 v17, v6

    move/from16 v18, v4

    move/from16 v20, v9

    move-object/from16 v21, v5

    move-object/from16 v22, v1

    .line 62
    invoke-static/range {v13 .. v23}, Landroidx/compose/material/SliderKt;->access$rangeSliderPressDragModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;ZZFLkotlin/ranges/f;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 63
    iget-object v1, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    invoke-interface {v1}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v2}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    invoke-interface {v3}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v1, v2, v3}, Lkotlin/ranges/s;->H(FFF)F

    move-result v1

    .line 64
    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    invoke-interface {v2}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$value:Lkotlin/ranges/f;

    invoke-interface {v3}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iget-object v4, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v4}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v2, v3, v4}, Lkotlin/ranges/s;->H(FFF)F

    move-result v13

    .line 65
    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v2}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v3}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v2, v3, v1}, Landroidx/compose/material/SliderKt;->access$calcFraction(FFF)F

    move-result v14

    .line 66
    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v2}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v3}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v2, v3, v13}, Landroidx/compose/material/SliderKt;->access$calcFraction(FFF)F

    move-result v15

    .line 67
    iget v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$steps:I

    int-to-float v2, v2

    mul-float/2addr v2, v15

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v8, v2

    .line 68
    iget v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$steps:I

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v3, v14

    mul-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v7, v2

    .line 69
    iget-boolean v4, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$enabled:Z

    const v2, 0x107b5ae

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeState:Landroidx/compose/runtime/State;

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v3

    or-int/2addr v2, v3

    .line 70
    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeState:Landroidx/compose/runtime/State;

    .line 71
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_b

    .line 72
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_c

    .line 73
    :cond_b
    new-instance v5, Landroidx/compose/material/SliderKt$RangeSlider$2$startThumbSemantics$1$1;

    invoke-direct {v5, v3, v13}, Landroidx/compose/material/SliderKt$RangeSlider$2$startThumbSemantics$1$1;-><init>(Landroidx/compose/runtime/State;F)V

    .line 74
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 75
    :cond_c
    check-cast v5, Lv3/l;

    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 76
    iget-object v6, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeFinished:Lv3/a;

    .line 77
    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v2}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v2, v13}, Lkotlin/ranges/s;->e(FF)Lkotlin/ranges/f;

    move-result-object v16

    move-object/from16 v2, v24

    move v3, v1

    move/from16 v17, v7

    move-object/from16 v7, v16

    .line 78
    invoke-static/range {v2 .. v8}, Landroidx/compose/material/SliderKt;->access$sliderSemantics(Landroidx/compose/ui/Modifier;FZLv3/l;Lv3/a;Lkotlin/ranges/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v16

    .line 79
    iget-boolean v4, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$enabled:Z

    const v2, 0x107b6d0

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeState:Landroidx/compose/runtime/State;

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v3

    or-int/2addr v2, v3

    .line 80
    iget-object v3, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeState:Landroidx/compose/runtime/State;

    .line 81
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_d

    .line 82
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_e

    .line 83
    :cond_d
    new-instance v5, Landroidx/compose/material/SliderKt$RangeSlider$2$endThumbSemantics$1$1;

    invoke-direct {v5, v3, v1}, Landroidx/compose/material/SliderKt$RangeSlider$2$endThumbSemantics$1$1;-><init>(Landroidx/compose/runtime/State;F)V

    .line 84
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 85
    :cond_e
    check-cast v5, Lv3/l;

    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 86
    iget-object v6, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$onValueChangeFinished:Lv3/a;

    .line 87
    iget-object v2, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v2}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v1, v2}, Lkotlin/ranges/s;->e(FF)Lkotlin/ranges/f;

    move-result-object v7

    move-object/from16 v2, v24

    move v3, v13

    move/from16 v8, v17

    .line 88
    invoke-static/range {v2 .. v8}, Landroidx/compose/material/SliderKt;->access$sliderSemantics(Landroidx/compose/ui/Modifier;FZLv3/l;Lv3/a;Lkotlin/ranges/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    .line 89
    iget-boolean v1, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$enabled:Z

    .line 90
    iget-object v4, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$tickFractions:Ljava/util/List;

    .line 91
    iget-object v5, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$colors:Landroidx/compose/material/SliderColors;

    .line 92
    iget v2, v10, Lkotlin/jvm/internal/k1$e;->element:F

    iget v3, v11, Lkotlin/jvm/internal/k1$e;->element:F

    sub-float v6, v2, v3

    .line 93
    iget-object v7, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$startInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 94
    iget-object v8, v0, Landroidx/compose/material/SliderKt$RangeSlider$2;->$endInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    const v17, 0xd81000

    const/16 v18, 0x0

    move v2, v14

    move v3, v15

    move-object/from16 v10, v16

    move-object v11, v13

    move-object/from16 v12, p2

    move/from16 v13, v17

    move/from16 v14, v18

    .line 95
    invoke-static/range {v1 .. v14}, Landroidx/compose/material/SliderKt;->access$RangeSliderImpl(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_f
    :goto_4
    return-void
.end method
