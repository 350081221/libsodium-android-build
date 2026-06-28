.class public final Landroidx/compose/material/ModalBottomSheetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aH\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u0007\u001a@\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u0007\u001aG\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\r\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aC\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00082\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u0011\u001a;\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u0012\u001a\u0093\u0001\u0010(\u001a\u00020\u00142\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0007\u00a2\u0006\u0002\u0008\u0015\u00a2\u0006\u0002\u0008\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001e2\u0008\u0008\u0002\u0010!\u001a\u00020 2\u0008\u0008\u0002\u0010\"\u001a\u00020 2\u0008\u0008\u0002\u0010#\u001a\u00020 2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00140$\u00a2\u0006\u0002\u0008\u0015H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008&\u0010\'\u001a\u001c\u0010*\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0005H\u0002\u001a0\u00100\u001a\u00020\u00142\u0006\u0010+\u001a\u00020 2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00140$2\u0006\u0010-\u001a\u00020\u0008H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008.\u0010/\u001a\u001c\u00106\u001a\u0002052\n\u00102\u001a\u0006\u0012\u0002\u0008\u0003012\u0006\u00104\u001a\u000203H\u0002\"\u0014\u00107\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108\"\u0014\u00109\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u00108\"\u0014\u0010:\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u00108\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006<\u00b2\u0006\u000c\u0010;\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/material/ModalBottomSheetValue;",
        "initialValue",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "",
        "animationSpec",
        "Lkotlin/Function1;",
        "",
        "confirmValueChange",
        "isSkipHalfExpanded",
        "Landroidx/compose/material/ModalBottomSheetState;",
        "ModalBottomSheetState",
        "skipHalfExpanded",
        "rememberModalBottomSheetState",
        "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;",
        "confirmStateChange",
        "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;",
        "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/u;",
        "sheetContent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "sheetState",
        "sheetGesturesEnabled",
        "Landroidx/compose/ui/graphics/Shape;",
        "sheetShape",
        "Landroidx/compose/ui/unit/Dp;",
        "sheetElevation",
        "Landroidx/compose/ui/graphics/Color;",
        "sheetBackgroundColor",
        "sheetContentColor",
        "scrimColor",
        "Lkotlin/Function0;",
        "content",
        "ModalBottomSheetLayout-Gs3lGvM",
        "(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLv3/p;Landroidx/compose/runtime/Composer;II)V",
        "ModalBottomSheetLayout",
        "fullHeight",
        "modalBottomSheetAnchors",
        "color",
        "onDismiss",
        "visible",
        "Scrim-3J-VO9M",
        "(JLv3/a;ZLandroidx/compose/runtime/Composer;I)V",
        "Scrim",
        "Landroidx/compose/material/AnchoredDraggableState;",
        "state",
        "Landroidx/compose/foundation/gestures/Orientation;",
        "orientation",
        "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
        "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection",
        "ModalBottomSheetPositionalThreshold",
        "F",
        "ModalBottomSheetVelocityThreshold",
        "MaxModalBottomSheetWidth",
        "alpha",
        "material_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,817:1\n74#2:818\n74#2:819\n487#3,4:820\n491#3,2:828\n495#3:834\n25#4:824\n1116#5,3:825\n1119#5,3:831\n1116#5,6:836\n1116#5,6:842\n1116#5,6:848\n487#6:830\n646#7:835\n81#8:854\n154#9:855\n154#9:856\n154#9:857\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n434#1:818\n567#1:819\n571#1:820,4\n571#1:828,2\n571#1:834\n571#1:824\n571#1:825,3\n571#1:831,3\n722#1:836,6\n723#1:842,6\n735#1:848,6\n571#1:830\n714#1:835\n715#1:854\n814#1:855\n815#1:856\n816#1:857\n*E\n"
    }
.end annotation


# static fields
.field private static final MaxModalBottomSheetWidth:F

.field private static final ModalBottomSheetPositionalThreshold:F

.field private static final ModalBottomSheetVelocityThreshold:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x38

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Landroidx/compose/material/ModalBottomSheetKt;->ModalBottomSheetPositionalThreshold:F

    .line 9
    .line 10
    const/16 v0, 0x7d

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sput v0, Landroidx/compose/material/ModalBottomSheetKt;->ModalBottomSheetVelocityThreshold:F

    .line 18
    .line 19
    const/16 v0, 0x280

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    sput v0, Landroidx/compose/material/ModalBottomSheetKt;->MaxModalBottomSheetWidth:F

    .line 27
    .line 28
    return-void
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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
.end method

.method private static final ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/AnchoredDraggableState<",
            "*>;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            ")",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;"
        }
    .end annotation

    new-instance v0, Landroidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;

    invoke-direct {v0, p0, p1}, Landroidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;-><init>(Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;)V

    return-object v0
.end method

.method public static final ModalBottomSheetLayout-Gs3lGvM(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .param p0    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material/ModalBottomSheetState;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p12    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material/ModalBottomSheetState;",
            "Z",
            "Landroidx/compose/ui/graphics/Shape;",
            "FJJJ",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move/from16 v14, p14

    .line 2
    .line 3
    move/from16 v15, p15

    .line 4
    .line 5
    const v0, -0x58a9d30

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p13

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    and-int/lit8 v1, v15, 0x1

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    or-int/lit8 v1, v14, 0x6

    .line 20
    .line 21
    move-object/from16 v9, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v1, v14, 0xe

    .line 25
    .line 26
    move-object/from16 v9, p0

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    move v1, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x2

    .line 39
    :goto_0
    or-int/2addr v1, v14

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move v1, v14

    .line 42
    :goto_1
    and-int/lit8 v3, v15, 0x2

    .line 43
    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    or-int/lit8 v1, v1, 0x30

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_3
    and-int/lit8 v4, v14, 0x70

    .line 50
    .line 51
    if-nez v4, :cond_5

    .line 52
    .line 53
    move-object/from16 v4, p1

    .line 54
    .line 55
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_4

    .line 60
    .line 61
    const/16 v5, 0x20

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    const/16 v5, 0x10

    .line 65
    .line 66
    :goto_2
    or-int/2addr v1, v5

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    :goto_3
    move-object/from16 v4, p1

    .line 69
    .line 70
    :goto_4
    and-int/lit8 v5, v15, 0x4

    .line 71
    .line 72
    if-eqz v5, :cond_6

    .line 73
    .line 74
    or-int/lit16 v1, v1, 0x80

    .line 75
    .line 76
    :cond_6
    and-int/lit8 v10, v15, 0x8

    .line 77
    .line 78
    if-eqz v10, :cond_7

    .line 79
    .line 80
    or-int/lit16 v1, v1, 0xc00

    .line 81
    .line 82
    move/from16 v11, p3

    .line 83
    .line 84
    goto :goto_6

    .line 85
    :cond_7
    and-int/lit16 v6, v14, 0x1c00

    .line 86
    .line 87
    move/from16 v11, p3

    .line 88
    .line 89
    if-nez v6, :cond_9

    .line 90
    .line 91
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_8

    .line 96
    .line 97
    const/16 v6, 0x800

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_8
    const/16 v6, 0x400

    .line 101
    .line 102
    :goto_5
    or-int/2addr v1, v6

    .line 103
    :cond_9
    :goto_6
    const v6, 0xe000

    .line 104
    .line 105
    .line 106
    and-int/2addr v6, v14

    .line 107
    if-nez v6, :cond_b

    .line 108
    .line 109
    and-int/lit8 v6, v15, 0x10

    .line 110
    .line 111
    move-object/from16 v12, p4

    .line 112
    .line 113
    if-nez v6, :cond_a

    .line 114
    .line 115
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_a

    .line 120
    .line 121
    const/16 v6, 0x4000

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_a
    const/16 v6, 0x2000

    .line 125
    .line 126
    :goto_7
    or-int/2addr v1, v6

    .line 127
    goto :goto_8

    .line 128
    :cond_b
    move-object/from16 v12, p4

    .line 129
    .line 130
    :goto_8
    and-int/lit8 v13, v15, 0x20

    .line 131
    .line 132
    if-eqz v13, :cond_c

    .line 133
    .line 134
    const/high16 v6, 0x30000

    .line 135
    .line 136
    or-int/2addr v1, v6

    .line 137
    move/from16 v7, p5

    .line 138
    .line 139
    goto :goto_a

    .line 140
    :cond_c
    const/high16 v6, 0x70000

    .line 141
    .line 142
    and-int/2addr v6, v14

    .line 143
    move/from16 v7, p5

    .line 144
    .line 145
    if-nez v6, :cond_e

    .line 146
    .line 147
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_d

    .line 152
    .line 153
    const/high16 v6, 0x20000

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_d
    const/high16 v6, 0x10000

    .line 157
    .line 158
    :goto_9
    or-int/2addr v1, v6

    .line 159
    :cond_e
    :goto_a
    const/high16 v6, 0x380000

    .line 160
    .line 161
    and-int/2addr v6, v14

    .line 162
    if-nez v6, :cond_11

    .line 163
    .line 164
    and-int/lit8 v6, v15, 0x40

    .line 165
    .line 166
    if-nez v6, :cond_f

    .line 167
    .line 168
    move-wide/from16 v6, p6

    .line 169
    .line 170
    invoke-interface {v8, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 171
    .line 172
    .line 173
    move-result v16

    .line 174
    if-eqz v16, :cond_10

    .line 175
    .line 176
    const/high16 v16, 0x100000

    .line 177
    .line 178
    goto :goto_b

    .line 179
    :cond_f
    move-wide/from16 v6, p6

    .line 180
    .line 181
    :cond_10
    const/high16 v16, 0x80000

    .line 182
    .line 183
    :goto_b
    or-int v1, v1, v16

    .line 184
    .line 185
    goto :goto_c

    .line 186
    :cond_11
    move-wide/from16 v6, p6

    .line 187
    .line 188
    :goto_c
    const/high16 v16, 0x1c00000

    .line 189
    .line 190
    and-int v16, v14, v16

    .line 191
    .line 192
    if-nez v16, :cond_13

    .line 193
    .line 194
    and-int/lit16 v0, v15, 0x80

    .line 195
    .line 196
    move-wide/from16 v6, p8

    .line 197
    .line 198
    if-nez v0, :cond_12

    .line 199
    .line 200
    invoke-interface {v8, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_12

    .line 205
    .line 206
    const/high16 v0, 0x800000

    .line 207
    .line 208
    goto :goto_d

    .line 209
    :cond_12
    const/high16 v0, 0x400000

    .line 210
    .line 211
    :goto_d
    or-int/2addr v1, v0

    .line 212
    goto :goto_e

    .line 213
    :cond_13
    move-wide/from16 v6, p8

    .line 214
    .line 215
    :goto_e
    const/high16 v0, 0xe000000

    .line 216
    .line 217
    and-int/2addr v0, v14

    .line 218
    if-nez v0, :cond_15

    .line 219
    .line 220
    and-int/lit16 v0, v15, 0x100

    .line 221
    .line 222
    move-wide/from16 v6, p10

    .line 223
    .line 224
    if-nez v0, :cond_14

    .line 225
    .line 226
    invoke-interface {v8, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_14

    .line 231
    .line 232
    const/high16 v0, 0x4000000

    .line 233
    .line 234
    goto :goto_f

    .line 235
    :cond_14
    const/high16 v0, 0x2000000

    .line 236
    .line 237
    :goto_f
    or-int/2addr v1, v0

    .line 238
    goto :goto_10

    .line 239
    :cond_15
    move-wide/from16 v6, p10

    .line 240
    .line 241
    :goto_10
    and-int/lit16 v0, v15, 0x200

    .line 242
    .line 243
    if-eqz v0, :cond_16

    .line 244
    .line 245
    const/high16 v0, 0x30000000

    .line 246
    .line 247
    or-int/2addr v1, v0

    .line 248
    goto :goto_12

    .line 249
    :cond_16
    const/high16 v0, 0x70000000

    .line 250
    .line 251
    and-int/2addr v0, v14

    .line 252
    if-nez v0, :cond_18

    .line 253
    .line 254
    move-object/from16 v0, p12

    .line 255
    .line 256
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v17

    .line 260
    if-eqz v17, :cond_17

    .line 261
    .line 262
    const/high16 v17, 0x20000000

    .line 263
    .line 264
    goto :goto_11

    .line 265
    :cond_17
    const/high16 v17, 0x10000000

    .line 266
    .line 267
    :goto_11
    or-int v1, v1, v17

    .line 268
    .line 269
    goto :goto_13

    .line 270
    :cond_18
    :goto_12
    move-object/from16 v0, p12

    .line 271
    .line 272
    :goto_13
    if-ne v5, v2, :cond_1a

    .line 273
    .line 274
    const v2, 0x5b6db6db

    .line 275
    .line 276
    .line 277
    and-int/2addr v2, v1

    .line 278
    const v0, 0x12492492

    .line 279
    .line 280
    .line 281
    if-ne v2, v0, :cond_1a

    .line 282
    .line 283
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-nez v0, :cond_19

    .line 288
    .line 289
    goto :goto_14

    .line 290
    :cond_19
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 291
    .line 292
    .line 293
    move-object/from16 v3, p2

    .line 294
    .line 295
    move-wide/from16 v9, p6

    .line 296
    .line 297
    move-object v2, v4

    .line 298
    move-wide/from16 v32, v6

    .line 299
    .line 300
    move v4, v11

    .line 301
    move-object v5, v12

    .line 302
    move/from16 v6, p5

    .line 303
    .line 304
    move-wide/from16 v12, p8

    .line 305
    .line 306
    goto/16 :goto_1d

    .line 307
    .line 308
    :cond_1a
    :goto_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 309
    .line 310
    .line 311
    and-int/lit8 v0, v14, 0x1

    .line 312
    .line 313
    const v17, -0xe000001

    .line 314
    .line 315
    .line 316
    const v18, -0x1c00001

    .line 317
    .line 318
    .line 319
    const v19, -0x380001

    .line 320
    .line 321
    .line 322
    const v20, -0xe001

    .line 323
    .line 324
    .line 325
    const/4 v2, 0x1

    .line 326
    if-eqz v0, :cond_21

    .line 327
    .line 328
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_1b

    .line 333
    .line 334
    goto :goto_15

    .line 335
    :cond_1b
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 336
    .line 337
    .line 338
    if-eqz v5, :cond_1c

    .line 339
    .line 340
    and-int/lit16 v1, v1, -0x381

    .line 341
    .line 342
    :cond_1c
    and-int/lit8 v0, v15, 0x10

    .line 343
    .line 344
    if-eqz v0, :cond_1d

    .line 345
    .line 346
    and-int v1, v1, v20

    .line 347
    .line 348
    :cond_1d
    and-int/lit8 v0, v15, 0x40

    .line 349
    .line 350
    if-eqz v0, :cond_1e

    .line 351
    .line 352
    and-int v1, v1, v19

    .line 353
    .line 354
    :cond_1e
    and-int/lit16 v0, v15, 0x80

    .line 355
    .line 356
    if-eqz v0, :cond_1f

    .line 357
    .line 358
    and-int v1, v1, v18

    .line 359
    .line 360
    :cond_1f
    and-int/lit16 v0, v15, 0x100

    .line 361
    .line 362
    if-eqz v0, :cond_20

    .line 363
    .line 364
    and-int v1, v1, v17

    .line 365
    .line 366
    :cond_20
    move/from16 v5, p5

    .line 367
    .line 368
    move v2, v1

    .line 369
    move-object v0, v4

    .line 370
    move-wide/from16 v32, v6

    .line 371
    .line 372
    move-object v3, v12

    .line 373
    move-object/from16 v1, p2

    .line 374
    .line 375
    move-wide/from16 v6, p6

    .line 376
    .line 377
    move-wide/from16 v12, p8

    .line 378
    .line 379
    goto/16 :goto_1c

    .line 380
    .line 381
    :cond_21
    :goto_15
    if-eqz v3, :cond_22

    .line 382
    .line 383
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 384
    .line 385
    goto :goto_16

    .line 386
    :cond_22
    move-object v0, v4

    .line 387
    :goto_16
    if-eqz v5, :cond_23

    .line 388
    .line 389
    sget-object v3, Landroidx/compose/material/ModalBottomSheetValue;->Hidden:Landroidx/compose/material/ModalBottomSheetValue;

    .line 390
    .line 391
    const/4 v4, 0x0

    .line 392
    const/4 v5, 0x0

    .line 393
    const/16 v21, 0x0

    .line 394
    .line 395
    const/16 v22, 0x6

    .line 396
    .line 397
    const/16 v23, 0xe

    .line 398
    .line 399
    move/from16 v31, v1

    .line 400
    .line 401
    move-object v1, v3

    .line 402
    move v3, v2

    .line 403
    move-object v2, v4

    .line 404
    move v4, v3

    .line 405
    move-object v3, v5

    .line 406
    move v5, v4

    .line 407
    move/from16 v4, v21

    .line 408
    .line 409
    move-object v5, v8

    .line 410
    move/from16 v6, v22

    .line 411
    .line 412
    move/from16 v7, v23

    .line 413
    .line 414
    invoke-static/range {v1 .. v7}, Landroidx/compose/material/ModalBottomSheetKt;->rememberModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    move/from16 v2, v31

    .line 419
    .line 420
    and-int/lit16 v2, v2, -0x381

    .line 421
    .line 422
    goto :goto_17

    .line 423
    :cond_23
    move v2, v1

    .line 424
    move-object/from16 v1, p2

    .line 425
    .line 426
    :goto_17
    if-eqz v10, :cond_24

    .line 427
    .line 428
    const/4 v11, 0x1

    .line 429
    :cond_24
    and-int/lit8 v3, v15, 0x10

    .line 430
    .line 431
    const/4 v4, 0x6

    .line 432
    if-eqz v3, :cond_25

    .line 433
    .line 434
    sget-object v3, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 435
    .line 436
    invoke-virtual {v3, v8, v4}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-virtual {v3}, Landroidx/compose/material/Shapes;->getLarge()Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    and-int v2, v2, v20

    .line 445
    .line 446
    goto :goto_18

    .line 447
    :cond_25
    move-object v3, v12

    .line 448
    :goto_18
    if-eqz v13, :cond_26

    .line 449
    .line 450
    sget-object v5, Landroidx/compose/material/ModalBottomSheetDefaults;->INSTANCE:Landroidx/compose/material/ModalBottomSheetDefaults;

    .line 451
    .line 452
    invoke-virtual {v5}, Landroidx/compose/material/ModalBottomSheetDefaults;->getElevation-D9Ej5fM()F

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    goto :goto_19

    .line 457
    :cond_26
    move/from16 v5, p5

    .line 458
    .line 459
    :goto_19
    and-int/lit8 v6, v15, 0x40

    .line 460
    .line 461
    if-eqz v6, :cond_27

    .line 462
    .line 463
    sget-object v6, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 464
    .line 465
    invoke-virtual {v6, v8, v4}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    invoke-virtual {v6}, Landroidx/compose/material/Colors;->getSurface-0d7_KjU()J

    .line 470
    .line 471
    .line 472
    move-result-wide v6

    .line 473
    and-int v2, v2, v19

    .line 474
    .line 475
    goto :goto_1a

    .line 476
    :cond_27
    move-wide/from16 v6, p6

    .line 477
    .line 478
    :goto_1a
    and-int/lit16 v10, v15, 0x80

    .line 479
    .line 480
    if-eqz v10, :cond_28

    .line 481
    .line 482
    shr-int/lit8 v10, v2, 0x12

    .line 483
    .line 484
    and-int/lit8 v10, v10, 0xe

    .line 485
    .line 486
    invoke-static {v6, v7, v8, v10}, Landroidx/compose/material/ColorsKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    .line 487
    .line 488
    .line 489
    move-result-wide v12

    .line 490
    and-int v2, v2, v18

    .line 491
    .line 492
    goto :goto_1b

    .line 493
    :cond_28
    move-wide/from16 v12, p8

    .line 494
    .line 495
    :goto_1b
    and-int/lit16 v10, v15, 0x100

    .line 496
    .line 497
    if-eqz v10, :cond_29

    .line 498
    .line 499
    sget-object v10, Landroidx/compose/material/ModalBottomSheetDefaults;->INSTANCE:Landroidx/compose/material/ModalBottomSheetDefaults;

    .line 500
    .line 501
    invoke-virtual {v10, v8, v4}, Landroidx/compose/material/ModalBottomSheetDefaults;->getScrimColor(Landroidx/compose/runtime/Composer;I)J

    .line 502
    .line 503
    .line 504
    move-result-wide v18

    .line 505
    and-int v2, v2, v17

    .line 506
    .line 507
    move-wide/from16 v32, v18

    .line 508
    .line 509
    goto :goto_1c

    .line 510
    :cond_29
    move-wide/from16 v32, p10

    .line 511
    .line 512
    :goto_1c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 513
    .line 514
    .line 515
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 516
    .line 517
    .line 518
    move-result v4

    .line 519
    if-eqz v4, :cond_2a

    .line 520
    .line 521
    const/4 v4, -0x1

    .line 522
    const-string v10, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:564)"

    .line 523
    .line 524
    const v9, -0x58a9d30

    .line 525
    .line 526
    .line 527
    invoke-static {v9, v2, v4, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 528
    .line 529
    .line 530
    :cond_2a
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 531
    .line 532
    .line 533
    move-result-object v4

    .line 534
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    check-cast v4, Landroidx/compose/ui/unit/Density;

    .line 539
    .line 540
    new-instance v9, Landroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$1;

    .line 541
    .line 542
    invoke-direct {v9, v1, v4}, Landroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$1;-><init>(Landroidx/compose/material/ModalBottomSheetState;Landroidx/compose/ui/unit/Density;)V

    .line 543
    .line 544
    .line 545
    const/4 v4, 0x0

    .line 546
    invoke-static {v9, v8, v4}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lv3/a;Landroidx/compose/runtime/Composer;I)V

    .line 547
    .line 548
    .line 549
    const v4, 0x2e20b340

    .line 550
    .line 551
    .line 552
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 553
    .line 554
    .line 555
    const v4, -0x1d58f75c

    .line 556
    .line 557
    .line 558
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 559
    .line 560
    .line 561
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 566
    .line 567
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v9

    .line 571
    if-ne v4, v9, :cond_2b

    .line 572
    .line 573
    sget-object v4, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 574
    .line 575
    invoke-static {v4, v8}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    new-instance v9, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 580
    .line 581
    invoke-direct {v9, v4}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 582
    .line 583
    .line 584
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    move-object v4, v9

    .line 588
    :cond_2b
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 589
    .line 590
    .line 591
    check-cast v4, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 592
    .line 593
    invoke-virtual {v4}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 594
    .line 595
    .line 596
    move-result-object v29

    .line 597
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 598
    .line 599
    .line 600
    sget-object v19, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 601
    .line 602
    new-instance v10, Landroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$2;

    .line 603
    .line 604
    move-object/from16 v16, v10

    .line 605
    .line 606
    move/from16 v17, v11

    .line 607
    .line 608
    move-object/from16 v18, v1

    .line 609
    .line 610
    move-object/from16 v20, v3

    .line 611
    .line 612
    move-wide/from16 v21, v6

    .line 613
    .line 614
    move-wide/from16 v23, v12

    .line 615
    .line 616
    move/from16 v25, v5

    .line 617
    .line 618
    move-object/from16 v26, p12

    .line 619
    .line 620
    move-wide/from16 v27, v32

    .line 621
    .line 622
    move-object/from16 v30, p0

    .line 623
    .line 624
    invoke-direct/range {v16 .. v30}, Landroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$2;-><init>(ZLandroidx/compose/material/ModalBottomSheetState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/graphics/Shape;JJFLv3/p;JLkotlinx/coroutines/s0;Lv3/q;)V

    .line 625
    .line 626
    .line 627
    const v9, -0x673b9846

    .line 628
    .line 629
    .line 630
    const/4 v4, 0x1

    .line 631
    invoke-static {v8, v9, v4, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 632
    .line 633
    .line 634
    move-result-object v4

    .line 635
    shr-int/lit8 v2, v2, 0x3

    .line 636
    .line 637
    and-int/lit8 v2, v2, 0xe

    .line 638
    .line 639
    or-int/lit16 v2, v2, 0xc00

    .line 640
    .line 641
    const/4 v9, 0x6

    .line 642
    move-object/from16 p1, v0

    .line 643
    .line 644
    const/4 v10, 0x0

    .line 645
    move-object/from16 p2, v10

    .line 646
    .line 647
    const/4 v10, 0x0

    .line 648
    move/from16 p3, v10

    .line 649
    .line 650
    move-object/from16 p4, v4

    .line 651
    .line 652
    move-object/from16 p5, v8

    .line 653
    .line 654
    move/from16 p6, v2

    .line 655
    .line 656
    move/from16 p7, v9

    .line 657
    .line 658
    invoke-static/range {p1 .. p7}, Landroidx/compose/foundation/layout/BoxWithConstraintsKt;->BoxWithConstraints(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 659
    .line 660
    .line 661
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    if-eqz v2, :cond_2c

    .line 666
    .line 667
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 668
    .line 669
    .line 670
    :cond_2c
    move-object v2, v0

    .line 671
    move-wide v9, v6

    .line 672
    move v4, v11

    .line 673
    move v6, v5

    .line 674
    move-object v5, v3

    .line 675
    move-object v3, v1

    .line 676
    :goto_1d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 677
    .line 678
    .line 679
    move-result-object v11

    .line 680
    if-eqz v11, :cond_2d

    .line 681
    .line 682
    new-instance v7, Landroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$3;

    .line 683
    .line 684
    move-object v0, v7

    .line 685
    move-object/from16 v1, p0

    .line 686
    .line 687
    move-object/from16 v34, v7

    .line 688
    .line 689
    move-wide v7, v9

    .line 690
    move-wide v9, v12

    .line 691
    move-object v13, v11

    .line 692
    move-wide/from16 v11, v32

    .line 693
    .line 694
    move-object/from16 v35, v13

    .line 695
    .line 696
    move-object/from16 v13, p12

    .line 697
    .line 698
    move/from16 v14, p14

    .line 699
    .line 700
    move/from16 v15, p15

    .line 701
    .line 702
    invoke-direct/range {v0 .. v15}, Landroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$3;-><init>(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLv3/p;II)V

    .line 703
    .line 704
    .line 705
    move-object/from16 v1, v34

    .line 706
    .line 707
    move-object/from16 v0, v35

    .line 708
    .line 709
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 710
    .line 711
    .line 712
    :cond_2d
    return-void
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method public static final ModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Z)Landroidx/compose/material/ModalBottomSheetState;
    .locals 1
    .param p0    # Landroidx/compose/material/ModalBottomSheetValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Ljava/lang/Boolean;",
            ">;Z)",
            "Landroidx/compose/material/ModalBottomSheetState;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density]."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "\n            ModalBottomSheetState(\n                initialValue = initialValue,\n                density =,\n                animationSpec = animationSpec,\n                isSkipHalfExpanded = isSkipHalfExpanded,\n                confirmStateChange = confirmValueChange\n            )\n            "
            imports = {}
        .end subannotation
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 3
    new-instance v0, Landroidx/compose/material/ModalBottomSheetState;

    invoke-direct {v0, p0, p1, p3, p2}, Landroidx/compose/material/ModalBottomSheetState;-><init>(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLv3/l;)V

    return-object v0
.end method

.method public static final ModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Z)Landroidx/compose/material/ModalBottomSheetState;
    .locals 1
    .param p0    # Landroidx/compose/material/ModalBottomSheetValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Ljava/lang/Boolean;",
            ">;Z)",
            "Landroidx/compose/material/ModalBottomSheetState;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material/ModalBottomSheetState;

    invoke-direct {v0, p0, p2, p4, p3}, Landroidx/compose/material/ModalBottomSheetState;-><init>(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLv3/l;)V

    .line 2
    invoke-virtual {v0, p1}, Landroidx/compose/material/ModalBottomSheetState;->setDensity$material_release(Landroidx/compose/ui/unit/Density;)V

    return-object v0
.end method

.method public static synthetic ModalBottomSheetState$default(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;ZILjava/lang/Object;)Landroidx/compose/material/ModalBottomSheetState;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 4
    sget-object p1, Landroidx/compose/material/AnchoredDraggableDefaults;->INSTANCE:Landroidx/compose/material/AnchoredDraggableDefaults;

    invoke-virtual {p1}, Landroidx/compose/material/AnchoredDraggableDefaults;->getAnimationSpec()Landroidx/compose/animation/core/SpringSpec;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_1

    .line 5
    sget-object p2, Landroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetState$3;->INSTANCE:Landroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetState$3;

    :cond_1
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 6
    :cond_2
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material/ModalBottomSheetKt;->ModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Z)Landroidx/compose/material/ModalBottomSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ModalBottomSheetState$default(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;ZILjava/lang/Object;)Landroidx/compose/material/ModalBottomSheetState;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, Landroidx/compose/material/AnchoredDraggableDefaults;->INSTANCE:Landroidx/compose/material/AnchoredDraggableDefaults;

    invoke-virtual {p2}, Landroidx/compose/material/AnchoredDraggableDefaults;->getAnimationSpec()Landroidx/compose/animation/core/SpringSpec;

    move-result-object p2

    :cond_0
    and-int/lit8 p6, p5, 0x8

    if-eqz p6, :cond_1

    .line 2
    sget-object p3, Landroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetState$1;->INSTANCE:Landroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetState$1;

    :cond_1
    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 3
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material/ModalBottomSheetKt;->ModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Z)Landroidx/compose/material/ModalBottomSheetState;

    move-result-object p0

    return-object p0
.end method

.method private static final Scrim-3J-VO9M(JLv3/a;ZLandroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;Z",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-wide/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move/from16 v5, p5

    .line 8
    .line 9
    const v0, -0x1f62403c

    .line 10
    .line 11
    .line 12
    move-object/from16 v6, p4

    .line 13
    .line 14
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v14

    .line 18
    and-int/lit8 v6, v5, 0xe

    .line 19
    .line 20
    if-nez v6, :cond_1

    .line 21
    .line 22
    invoke-interface {v14, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    const/4 v6, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v6, 0x2

    .line 31
    :goto_0
    or-int/2addr v6, v5

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v6, v5

    .line 34
    :goto_1
    and-int/lit8 v7, v5, 0x70

    .line 35
    .line 36
    if-nez v7, :cond_3

    .line 37
    .line 38
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    const/16 v7, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v7, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v6, v7

    .line 50
    :cond_3
    and-int/lit16 v7, v5, 0x380

    .line 51
    .line 52
    if-nez v7, :cond_5

    .line 53
    .line 54
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_4

    .line 59
    .line 60
    const/16 v7, 0x100

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/16 v7, 0x80

    .line 64
    .line 65
    :goto_3
    or-int/2addr v6, v7

    .line 66
    :cond_5
    and-int/lit16 v7, v6, 0x2db

    .line 67
    .line 68
    const/16 v8, 0x92

    .line 69
    .line 70
    if-ne v7, v8, :cond_7

    .line 71
    .line 72
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-nez v7, :cond_6

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_6
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_8

    .line 83
    .line 84
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_8

    .line 89
    .line 90
    const/4 v7, -0x1

    .line 91
    const-string v8, "androidx.compose.material.Scrim (ModalBottomSheet.kt:712)"

    .line 92
    .line 93
    invoke-static {v0, v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_8
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 97
    .line 98
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    .line 99
    .line 100
    .line 101
    move-result-wide v6

    .line 102
    cmp-long v0, v1, v6

    .line 103
    .line 104
    const/4 v13, 0x1

    .line 105
    if-eqz v0, :cond_9

    .line 106
    .line 107
    move v0, v13

    .line 108
    goto :goto_5

    .line 109
    :cond_9
    const/4 v0, 0x0

    .line 110
    :goto_5
    if-eqz v0, :cond_12

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    if-eqz v4, :cond_a

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_a
    move v6, v0

    .line 119
    :goto_6
    new-instance v16, Landroidx/compose/animation/core/TweenSpec;

    .line 120
    .line 121
    const/4 v8, 0x0

    .line 122
    const/4 v9, 0x0

    .line 123
    const/4 v10, 0x0

    .line 124
    const/4 v11, 0x7

    .line 125
    const/4 v12, 0x0

    .line 126
    move-object/from16 v7, v16

    .line 127
    .line 128
    invoke-direct/range {v7 .. v12}, Landroidx/compose/animation/core/TweenSpec;-><init>(IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/w;)V

    .line 129
    .line 130
    .line 131
    const/4 v8, 0x0

    .line 132
    const/4 v9, 0x0

    .line 133
    const/16 v12, 0x30

    .line 134
    .line 135
    const/16 v17, 0x1c

    .line 136
    .line 137
    move-object v11, v14

    .line 138
    move v15, v13

    .line 139
    move/from16 v13, v17

    .line 140
    .line 141
    invoke-static/range {v6 .. v13}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateFloatAsState(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    sget-object v7, Landroidx/compose/material/Strings;->Companion:Landroidx/compose/material/Strings$Companion;

    .line 146
    .line 147
    invoke-virtual {v7}, Landroidx/compose/material/Strings$Companion;->getCloseSheet-UdPEhr4()I

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    const/4 v8, 0x6

    .line 152
    invoke-static {v7, v14, v8}, Landroidx/compose/material/Strings_androidKt;->getString-4foXLRw(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    const/4 v8, 0x0

    .line 157
    if-eqz v4, :cond_f

    .line 158
    .line 159
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 160
    .line 161
    const v10, -0x51ff2fd7

    .line 162
    .line 163
    .line 164
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    if-nez v10, :cond_b

    .line 176
    .line 177
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 178
    .line 179
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    if-ne v11, v10, :cond_c

    .line 184
    .line 185
    :cond_b
    new-instance v11, Landroidx/compose/material/ModalBottomSheetKt$Scrim$dismissModifier$1$1;

    .line 186
    .line 187
    invoke-direct {v11, v3, v8}, Landroidx/compose/material/ModalBottomSheetKt$Scrim$dismissModifier$1$1;-><init>(Lv3/a;Lkotlin/coroutines/d;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_c
    check-cast v11, Lv3/p;

    .line 194
    .line 195
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 196
    .line 197
    .line 198
    invoke-static {v9, v3, v11}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lv3/p;)Landroidx/compose/ui/Modifier;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    const v10, -0x51ff2f7d

    .line 203
    .line 204
    .line 205
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    or-int/2addr v10, v11

    .line 217
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    if-nez v10, :cond_d

    .line 222
    .line 223
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 224
    .line 225
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    if-ne v11, v10, :cond_e

    .line 230
    .line 231
    :cond_d
    new-instance v11, Landroidx/compose/material/ModalBottomSheetKt$Scrim$dismissModifier$2$1;

    .line 232
    .line 233
    invoke-direct {v11, v7, v3}, Landroidx/compose/material/ModalBottomSheetKt$Scrim$dismissModifier$2$1;-><init>(Ljava/lang/String;Lv3/a;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    :cond_e
    check-cast v11, Lv3/l;

    .line 240
    .line 241
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 242
    .line 243
    .line 244
    invoke-static {v9, v15, v11}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLv3/l;)Landroidx/compose/ui/Modifier;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    goto :goto_7

    .line 249
    :cond_f
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 250
    .line 251
    :goto_7
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 252
    .line 253
    invoke-static {v9, v0, v15, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-interface {v0, v7}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    const v7, -0x51ff2e5d

    .line 262
    .line 263
    .line 264
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 265
    .line 266
    .line 267
    invoke-interface {v14, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    or-int/2addr v7, v8

    .line 276
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    if-nez v7, :cond_10

    .line 281
    .line 282
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 283
    .line 284
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    if-ne v8, v7, :cond_11

    .line 289
    .line 290
    :cond_10
    new-instance v8, Landroidx/compose/material/ModalBottomSheetKt$Scrim$1$1;

    .line 291
    .line 292
    invoke-direct {v8, v1, v2, v6}, Landroidx/compose/material/ModalBottomSheetKt$Scrim$1$1;-><init>(JLandroidx/compose/runtime/State;)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :cond_11
    check-cast v8, Lv3/l;

    .line 299
    .line 300
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 301
    .line 302
    .line 303
    const/4 v6, 0x0

    .line 304
    invoke-static {v0, v8, v14, v6}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 305
    .line 306
    .line 307
    :cond_12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_13

    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 314
    .line 315
    .line 316
    :cond_13
    :goto_8
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    if-eqz v6, :cond_14

    .line 321
    .line 322
    new-instance v7, Landroidx/compose/material/ModalBottomSheetKt$Scrim$2;

    .line 323
    .line 324
    move-object v0, v7

    .line 325
    move-wide/from16 v1, p0

    .line 326
    .line 327
    move-object/from16 v3, p2

    .line 328
    .line 329
    move/from16 v4, p3

    .line 330
    .line 331
    move/from16 v5, p5

    .line 332
    .line 333
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material/ModalBottomSheetKt$Scrim$2;-><init>(JLv3/a;ZI)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v6, v7}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 337
    .line 338
    .line 339
    :cond_14
    return-void
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
.end method

.method private static final Scrim_3J_VO9M$lambda$1(Landroidx/compose/runtime/State;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method public static final synthetic access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/material/ModalBottomSheetKt;->ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$Scrim-3J-VO9M(JLv3/a;ZLandroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/material/ModalBottomSheetKt;->Scrim-3J-VO9M(JLv3/a;ZLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$Scrim_3J_VO9M$lambda$1(Landroidx/compose/runtime/State;)F
    .locals 0

    invoke-static {p0}, Landroidx/compose/material/ModalBottomSheetKt;->Scrim_3J_VO9M$lambda$1(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getMaxModalBottomSheetWidth$p()F
    .locals 1

    sget v0, Landroidx/compose/material/ModalBottomSheetKt;->MaxModalBottomSheetWidth:F

    return v0
.end method

.method public static final synthetic access$getModalBottomSheetPositionalThreshold$p()F
    .locals 1

    sget v0, Landroidx/compose/material/ModalBottomSheetKt;->ModalBottomSheetPositionalThreshold:F

    return v0
.end method

.method public static final synthetic access$getModalBottomSheetVelocityThreshold$p()F
    .locals 1

    sget v0, Landroidx/compose/material/ModalBottomSheetKt;->ModalBottomSheetVelocityThreshold:F

    return v0
.end method

.method public static final synthetic access$modalBottomSheetAnchors(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;F)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/material/ModalBottomSheetKt;->modalBottomSheetAnchors(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;F)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final modalBottomSheetAnchors(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;F)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/material/ModalBottomSheetKt$modalBottomSheetAnchors$1;

    invoke-direct {v0, p1, p2}, Landroidx/compose/material/ModalBottomSheetKt$modalBottomSheetAnchors$1;-><init>(Landroidx/compose/material/ModalBottomSheetState;F)V

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/OnRemeasuredModifierKt;->onSizeChanged(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final rememberModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;
    .locals 8
    .param p0    # Landroidx/compose/material/ModalBottomSheetValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material/ModalBottomSheetState;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmValueChange = confirmStateChange)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const v0, -0x72f3a17c

    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 15
    sget-object p1, Landroidx/compose/material/AnchoredDraggableDefaults;->INSTANCE:Landroidx/compose/material/AnchoredDraggableDefaults;

    invoke-virtual {p1}, Landroidx/compose/material/AnchoredDraggableDefaults;->getAnimationSpec()Landroidx/compose/animation/core/SpringSpec;

    move-result-object p1

    :cond_0
    move-object v2, p1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    const-string p5, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:514)"

    .line 16
    invoke-static {v0, p4, p1, p5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1
    const/4 v4, 0x0

    and-int/lit8 p1, p4, 0xe

    or-int/lit16 p1, p1, 0xc40

    and-int/lit16 p4, p4, 0x380

    or-int v6, p1, p4

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Landroidx/compose/material/ModalBottomSheetKt;->rememberModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;

    move-result-object p0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object p0
.end method

.method public static final rememberModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;
    .locals 12
    .param p0    # Landroidx/compose/material/ModalBottomSheetValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Ljava/lang/Boolean;",
            ">;Z",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material/ModalBottomSheetState;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    move-object v1, p0

    move-object/from16 v7, p4

    const v0, -0x788e558

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_0

    .line 1
    sget-object v2, Landroidx/compose/material/AnchoredDraggableDefaults;->INSTANCE:Landroidx/compose/material/AnchoredDraggableDefaults;

    invoke-virtual {v2}, Landroidx/compose/material/AnchoredDraggableDefaults;->getAnimationSpec()Landroidx/compose/animation/core/SpringSpec;

    move-result-object v2

    move-object v3, v2

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_1

    .line 2
    sget-object v2, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$1;->INSTANCE:Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$1;

    move-object v4, v2

    goto :goto_1

    :cond_1
    move-object v4, p2

    :goto_1
    and-int/lit8 v2, p6, 0x8

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    move v6, v5

    goto :goto_2

    :cond_2
    move v6, p3

    .line 3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, -0x1

    const-string v8, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:432)"

    move/from16 v9, p5

    .line 4
    invoke-static {v0, v9, v2, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 5
    :cond_3
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 6
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    .line 7
    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/unit/Density;

    const v0, 0xa22c6b8

    .line 8
    invoke-interface {v7, v0, p0}, Landroidx/compose/runtime/Composer;->startMovableGroup(ILjava/lang/Object;)V

    const/4 v0, 0x5

    new-array v8, v0, [Ljava/lang/Object;

    aput-object v1, v8, v5

    const/4 v0, 0x1

    aput-object v3, v8, v0

    .line 9
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v5, 0x2

    aput-object v0, v8, v5

    const/4 v0, 0x3

    aput-object v4, v8, v0

    const/4 v0, 0x4

    aput-object v2, v8, v0

    .line 10
    sget-object v0, Landroidx/compose/material/ModalBottomSheetState;->Companion:Landroidx/compose/material/ModalBottomSheetState$Companion;

    invoke-virtual {v0, v3, v4, v6, v2}, Landroidx/compose/material/ModalBottomSheetState$Companion;->Saver(Landroidx/compose/animation/core/AnimationSpec;Lv3/l;ZLandroidx/compose/ui/unit/Density;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v9

    const/4 v10, 0x0

    .line 11
    new-instance v11, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;

    move-object v0, v11

    move-object v1, p0

    move v5, v6

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material/ModalBottomSheetKt$rememberModalBottomSheetState$2;-><init>(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;Z)V

    const/16 v5, 0x48

    const/4 v6, 0x4

    move-object v0, v8

    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    move-object/from16 v4, p4

    invoke-static/range {v0 .. v6}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/material/ModalBottomSheetState;

    invoke-interface/range {p4 .. p4}, Landroidx/compose/runtime/Composer;->endMovableGroup()V

    .line 12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    invoke-interface/range {p4 .. p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object v0
.end method

.method public static final rememberModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;
    .locals 8
    .param p0    # Landroidx/compose/material/ModalBottomSheetValue;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material/ExperimentalMaterialApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;Z",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material/ModalBottomSheetState;"
        }
    .end annotation

    .annotation runtime Lkotlin/k;
        message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange."
        replaceWith = .subannotation Lkotlin/b1;
            expression = "rememberModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const v0, -0x18653f58

    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_0

    .line 13
    sget-object p1, Landroidx/compose/material/AnchoredDraggableDefaults;->INSTANCE:Landroidx/compose/material/AnchoredDraggableDefaults;

    invoke-virtual {p1}, Landroidx/compose/material/AnchoredDraggableDefaults;->getAnimationSpec()Landroidx/compose/animation/core/SpringSpec;

    move-result-object p1

    :cond_0
    move-object v2, p1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    const-string p6, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:486)"

    .line 14
    invoke-static {v0, p5, p1, p6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1
    and-int/lit8 p1, p5, 0xe

    or-int/lit8 p1, p1, 0x40

    shr-int/lit8 p6, p5, 0x3

    and-int/lit16 p6, p6, 0x380

    or-int/2addr p1, p6

    shl-int/lit8 p5, p5, 0x3

    and-int/lit16 p5, p5, 0x1c00

    or-int v6, p1, p5

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p3

    move v4, p2

    move-object v5, p4

    invoke-static/range {v1 .. v7}, Landroidx/compose/material/ModalBottomSheetKt;->rememberModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;

    move-result-object p0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object p0
.end method
