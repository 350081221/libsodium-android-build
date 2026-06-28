.class final Landroidx/compose/material/SliderKt$Slider$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/SliderKt;->Slider(FLv3/l;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/f;ILv3/a;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V
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
        "SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1195:1\n74#2:1196\n74#2:1197\n487#3,4:1198\n491#3,2:1206\n495#3:1212\n25#4:1202\n25#4:1213\n25#4:1220\n67#4,3:1227\n66#4:1230\n1116#5,3:1203\n1119#5,3:1209\n1116#5,6:1214\n1116#5,6:1221\n1116#5,6:1231\n1116#5,6:1237\n487#6:1208\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n*L\n180#1:1196\n185#1:1197\n196#1:1198,4\n196#1:1206,2\n196#1:1212\n196#1:1202\n197#1:1213\n198#1:1220\n200#1:1227,3\n200#1:1230\n196#1:1203,3\n196#1:1209,3\n197#1:1214,6\n198#1:1221,6\n200#1:1231,6\n240#1:1237,6\n196#1:1208\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $colors:Landroidx/compose/material/SliderColors;

.field final synthetic $enabled:Z

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

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
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $tickFractions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $value:F

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
.method constructor <init>(Lkotlin/ranges/f;FLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/util/List;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/State;Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;F",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/material/SliderColors;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lv3/l<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/r2;",
            ">;>;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/SliderKt$Slider$3;->$valueRange:Lkotlin/ranges/f;

    iput p2, p0, Landroidx/compose/material/SliderKt$Slider$3;->$value:F

    iput-object p3, p0, Landroidx/compose/material/SliderKt$Slider$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    iput-boolean p4, p0, Landroidx/compose/material/SliderKt$Slider$3;->$enabled:Z

    iput-object p5, p0, Landroidx/compose/material/SliderKt$Slider$3;->$tickFractions:Ljava/util/List;

    iput-object p6, p0, Landroidx/compose/material/SliderKt$Slider$3;->$colors:Landroidx/compose/material/SliderColors;

    iput-object p7, p0, Landroidx/compose/material/SliderKt$Slider$3;->$onValueChangeState:Landroidx/compose/runtime/State;

    iput-object p8, p0, Landroidx/compose/material/SliderKt$Slider$3;->$onValueChangeFinished:Lv3/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method

.method public static final synthetic access$invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/SliderKt$Slider$3;->invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$invoke$scaleToUserValue(Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Lkotlin/ranges/f;F)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/SliderKt$Slider$3;->invoke$scaleToUserValue(Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Lkotlin/ranges/f;F)F

    move-result p0

    return p0
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

.method private static final invoke$scaleToUserValue(Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Lkotlin/ranges/f;F)F
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/k1$e;",
            "Lkotlin/jvm/internal/k1$e;",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;F)F"
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

    invoke-static {p0, p1, p3, v0, p2}, Landroidx/compose/material/SliderKt;->access$scale(FFFFF)F

    move-result p0

    return p0
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

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material/SliderKt$Slider$3;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
    .locals 30
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

    move-object/from16 v8, p2

    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_1

    move-object/from16 v1, p1

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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

    const-string v4, "androidx.compose.material.Slider.<anonymous> (Slider.kt:179)"

    const v5, 0x7c485b8e

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    .line 5
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    .line 6
    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    const/4 v9, 0x0

    if-ne v2, v3, :cond_5

    const/4 v2, 0x1

    move/from16 v19, v2

    goto :goto_3

    :cond_5
    move/from16 v19, v9

    .line 7
    :goto_3
    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;->getConstraints-msEJaDk()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v1

    int-to-float v13, v1

    .line 8
    new-instance v15, Lkotlin/jvm/internal/k1$e;

    invoke-direct {v15}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 9
    new-instance v14, Lkotlin/jvm/internal/k1$e;

    invoke-direct {v14}, Lkotlin/jvm/internal/k1$e;-><init>()V

    .line 10
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    .line 11
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    .line 12
    check-cast v1, Landroidx/compose/ui/unit/Density;

    .line 13
    invoke-static {}, Landroidx/compose/material/SliderKt;->getThumbRadius()F

    move-result v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v2

    sub-float v2, v13, v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iput v2, v15, Lkotlin/jvm/internal/k1$e;->element:F

    .line 14
    invoke-static {}, Landroidx/compose/material/SliderKt;->getThumbRadius()F

    move-result v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v1

    iget v2, v15, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iput v1, v14, Lkotlin/jvm/internal/k1$e;->element:F

    const v1, 0x2e20b340

    .line 15
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v1, -0x1d58f75c

    .line 16
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 17
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 18
    sget-object v28, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_6

    .line 19
    sget-object v2, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 20
    invoke-static {v2, v8}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    move-result-object v2

    .line 21
    new-instance v4, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v4, v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 22
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v2, v4

    .line 23
    :cond_6
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 24
    check-cast v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 25
    invoke-virtual {v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    move-result-object v25

    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 26
    iget v2, v0, Landroidx/compose/material/SliderKt$Slider$3;->$value:F

    iget-object v4, v0, Landroidx/compose/material/SliderKt$Slider$3;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 27
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .line 28
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_7

    .line 29
    invoke-static {v4, v14, v15, v2}, Landroidx/compose/material/SliderKt$Slider$3;->access$invoke$scaleToOffset(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;F)F

    move-result v2

    invoke-static {v2}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v5

    .line 30
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 31
    :cond_7
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 32
    move-object/from16 v16, v5

    check-cast v16, Landroidx/compose/runtime/MutableFloatState;

    .line 33
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 34
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 35
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_8

    .line 36
    invoke-static {v3}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v1

    .line 37
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 38
    :cond_8
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 39
    move-object/from16 v17, v1

    check-cast v17, Landroidx/compose/runtime/MutableFloatState;

    .line 40
    iget v1, v14, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v2, v15, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget-object v7, v0, Landroidx/compose/material/SliderKt$Slider$3;->$valueRange:Lkotlin/ranges/f;

    iget-object v6, v0, Landroidx/compose/material/SliderKt$Slider$3;->$onValueChangeState:Landroidx/compose/runtime/State;

    const v3, 0x607fb4c4

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 41
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .line 42
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 43
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 44
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_9

    .line 45
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_a

    .line 46
    :cond_9
    new-instance v10, Landroidx/compose/material/SliderDraggableState;

    new-instance v11, Landroidx/compose/material/SliderKt$Slider$3$draggableState$1$1;

    move-object v1, v11

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    move-object v4, v14

    move-object v5, v15

    invoke-direct/range {v1 .. v7}, Landroidx/compose/material/SliderKt$Slider$3$draggableState$1$1;-><init>(Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Landroidx/compose/runtime/State;Lkotlin/ranges/f;)V

    invoke-direct {v10, v11}, Landroidx/compose/material/SliderDraggableState;-><init>(Lv3/l;)V

    .line 47
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v2, v10

    .line 48
    :cond_a
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 49
    move-object/from16 v29, v2

    check-cast v29, Landroidx/compose/material/SliderDraggableState;

    .line 50
    new-instance v1, Landroidx/compose/material/SliderKt$Slider$3$2;

    iget-object v2, v0, Landroidx/compose/material/SliderKt$Slider$3;->$valueRange:Lkotlin/ranges/f;

    invoke-direct {v1, v2, v14, v15}, Landroidx/compose/material/SliderKt$Slider$3$2;-><init>(Lkotlin/ranges/f;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;)V

    iget-object v2, v0, Landroidx/compose/material/SliderKt$Slider$3;->$valueRange:Lkotlin/ranges/f;

    iget v3, v14, Lkotlin/jvm/internal/k1$e;->element:F

    iget v4, v15, Lkotlin/jvm/internal/k1$e;->element:F

    invoke-static {v3, v4}, Lkotlin/ranges/s;->e(FF)Lkotlin/ranges/f;

    move-result-object v3

    iget v5, v0, Landroidx/compose/material/SliderKt$Slider$3;->$value:F

    const/16 v7, 0xc00

    move-object/from16 v4, v16

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v7}, Landroidx/compose/material/SliderKt;->access$CorrectValueSideEffect(Lv3/l;Lkotlin/ranges/f;Lkotlin/ranges/f;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V

    .line 51
    new-instance v1, Landroidx/compose/material/SliderKt$Slider$3$gestureEndAction$1;

    iget-object v2, v0, Landroidx/compose/material/SliderKt$Slider$3;->$tickFractions:Ljava/util/List;

    iget-object v3, v0, Landroidx/compose/material/SliderKt$Slider$3;->$onValueChangeFinished:Lv3/a;

    move-object/from16 v20, v1

    move-object/from16 v21, v16

    move-object/from16 v22, v2

    move-object/from16 v23, v14

    move-object/from16 v24, v15

    move-object/from16 v26, v29

    move-object/from16 v27, v3

    invoke-direct/range {v20 .. v27}, Landroidx/compose/material/SliderKt$Slider$3$gestureEndAction$1;-><init>(Landroidx/compose/runtime/MutableFloatState;Ljava/util/List;Lkotlin/jvm/internal/k1$e;Lkotlin/jvm/internal/k1$e;Lkotlinx/coroutines/s0;Landroidx/compose/material/SliderDraggableState;Lv3/a;)V

    invoke-static {v1, v8, v9}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v1

    .line 52
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 53
    iget-object v12, v0, Landroidx/compose/material/SliderKt$Slider$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 54
    iget-boolean v3, v0, Landroidx/compose/material/SliderKt$Slider$3;->$enabled:Z

    move-object v10, v2

    move-object/from16 v11, v29

    move-object v4, v14

    move/from16 v14, v19

    move-object v5, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v1

    move/from16 v18, v3

    .line 55
    invoke-static/range {v10 .. v18}, Landroidx/compose/material/SliderKt;->access$sliderTapModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;FZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 56
    sget-object v12, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 57
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/material/SliderDraggableState;->isDragging()Z

    move-result v15

    .line 58
    iget-boolean v13, v0, Landroidx/compose/material/SliderKt$Slider$3;->$enabled:Z

    .line 59
    iget-object v14, v0, Landroidx/compose/material/SliderKt$Slider$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    const/16 v16, 0x0

    const v6, 0x10797e9

    .line 60
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    .line 61
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_b

    .line 62
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_c

    .line 63
    :cond_b
    new-instance v7, Landroidx/compose/material/SliderKt$Slider$3$drag$1$1;

    const/4 v6, 0x0

    invoke-direct {v7, v1, v6}, Landroidx/compose/material/SliderKt$Slider$3$drag$1$1;-><init>(Landroidx/compose/runtime/State;Lkotlin/coroutines/d;)V

    .line 64
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 65
    :cond_c
    move-object/from16 v17, v7

    check-cast v17, Lv3/q;

    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const/16 v1, 0x20

    const/16 v20, 0x0

    move-object v10, v2

    move-object/from16 v11, v29

    move/from16 v18, v19

    move/from16 v19, v1

    .line 66
    invoke-static/range {v10 .. v20}, Landroidx/compose/foundation/gestures/DraggableKt;->draggable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/q;Lv3/q;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 67
    iget v2, v0, Landroidx/compose/material/SliderKt$Slider$3;->$value:F

    iget-object v6, v0, Landroidx/compose/material/SliderKt$Slider$3;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v6}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    iget-object v7, v0, Landroidx/compose/material/SliderKt$Slider$3;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v7}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v2, v6, v7}, Lkotlin/ranges/s;->H(FFF)F

    move-result v2

    .line 68
    iget-object v6, v0, Landroidx/compose/material/SliderKt$Slider$3;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v6}, Lkotlin/ranges/g;->getStart()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    iget-object v7, v0, Landroidx/compose/material/SliderKt$Slider$3;->$valueRange:Lkotlin/ranges/f;

    invoke-interface {v7}, Lkotlin/ranges/g;->getEndInclusive()Ljava/lang/Comparable;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v6, v7, v2}, Landroidx/compose/material/SliderKt;->access$calcFraction(FFF)F

    move-result v2

    .line 69
    iget-boolean v6, v0, Landroidx/compose/material/SliderKt$Slider$3;->$enabled:Z

    .line 70
    iget-object v7, v0, Landroidx/compose/material/SliderKt$Slider$3;->$tickFractions:Ljava/util/List;

    .line 71
    iget-object v9, v0, Landroidx/compose/material/SliderKt$Slider$3;->$colors:Landroidx/compose/material/SliderColors;

    .line 72
    iget v5, v5, Lkotlin/jvm/internal/k1$e;->element:F

    iget v4, v4, Lkotlin/jvm/internal/k1$e;->element:F

    sub-float/2addr v5, v4

    .line 73
    iget-object v10, v0, Landroidx/compose/material/SliderKt$Slider$3;->$interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 74
    invoke-interface {v3, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v12, 0x200

    move v1, v6

    move-object v3, v7

    move-object v4, v9

    move-object v6, v10

    move-object v7, v11

    move-object/from16 v8, p2

    move v9, v12

    .line 75
    invoke-static/range {v1 .. v9}, Landroidx/compose/material/SliderKt;->access$SliderImpl(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_d
    :goto_4
    return-void
.end method
