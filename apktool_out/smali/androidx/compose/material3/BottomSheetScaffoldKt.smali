.class public final Landroidx/compose/material3/BottomSheetScaffoldKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\u001a\u008a\u0002\u0010!\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u0003\u00a2\u0006\u0002\u0008\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\n2\u0015\u0008\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u00032\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0015\u0008\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u00032\u0019\u0008\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u00032\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u000f2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u0003H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 \u001a#\u0010%\u001a\u00020\u00082\u0008\u0008\u0002\u0010#\u001a\u00020\"2\u0008\u0008\u0002\u0010$\u001a\u00020\u0019H\u0007\u00a2\u0006\u0004\u0008%\u0010&\u001a9\u0010+\u001a\u00020\"2\u0008\u0008\u0002\u0010(\u001a\u00020\'2\u0014\u0008\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00160\u00002\u0008\u0008\u0002\u0010*\u001a\u00020\u0016H\u0007\u00a2\u0006\u0004\u0008+\u0010,\u001a\u00b6\u0001\u0010;\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\"2\'\u00103\u001a#\u0012\u0013\u0012\u00110.\u00a2\u0006\u000c\u0008/\u0012\u0008\u00080\u0012\u0004\u0008\u0008(1\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\'020\u00002\u0006\u00104\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00105\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u00032\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u0003\u00a2\u0006\u0002\u0008\u0004H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u00089\u0010:\u001a\u00c0\u0001\u0010F\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u00032&\u0010=\u001a\"\u0012\u0013\u0012\u00110\u001d\u00a2\u0006\u000c\u0008/\u0012\u0008\u00080\u0012\u0004\u0008\u0008(<\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u00032&\u0010@\u001a\"\u0012\u0013\u0012\u00110>\u00a2\u0006\u000c\u0008/\u0012\u0008\u00080\u0012\u0004\u0008\u0008(?\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00020\u0014\u00a2\u0006\u0002\u0008\u00032\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020A0\u00142\u0006\u0010C\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008D\u0010E\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006G"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/u;",
        "sheetContent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/material3/BottomSheetScaffoldState;",
        "scaffoldState",
        "Landroidx/compose/ui/unit/Dp;",
        "sheetPeekHeight",
        "sheetMaxWidth",
        "Landroidx/compose/ui/graphics/Shape;",
        "sheetShape",
        "Landroidx/compose/ui/graphics/Color;",
        "sheetContainerColor",
        "sheetContentColor",
        "sheetTonalElevation",
        "sheetShadowElevation",
        "Lkotlin/Function0;",
        "sheetDragHandle",
        "",
        "sheetSwipeEnabled",
        "topBar",
        "Landroidx/compose/material3/SnackbarHostState;",
        "snackbarHost",
        "containerColor",
        "contentColor",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "content",
        "BottomSheetScaffold-sdMYb0k",
        "(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;ZLv3/p;Lv3/q;JJLv3/q;Landroidx/compose/runtime/Composer;III)V",
        "BottomSheetScaffold",
        "Landroidx/compose/material3/SheetState;",
        "bottomSheetState",
        "snackbarHostState",
        "rememberBottomSheetScaffoldState",
        "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;",
        "Landroidx/compose/material3/SheetValue;",
        "initialValue",
        "confirmValueChange",
        "skipHiddenState",
        "rememberStandardBottomSheetState",
        "(Landroidx/compose/material3/SheetValue;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;",
        "state",
        "Landroidx/compose/ui/unit/IntSize;",
        "Lkotlin/v0;",
        "name",
        "sheetSize",
        "Landroidx/compose/material3/DraggableAnchors;",
        "calculateAnchors",
        "peekHeight",
        "shape",
        "tonalElevation",
        "shadowElevation",
        "dragHandle",
        "StandardBottomSheet-XcniZvE",
        "(Landroidx/compose/material3/SheetState;Lv3/l;FFZLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;Lv3/q;Landroidx/compose/runtime/Composer;II)V",
        "StandardBottomSheet",
        "innerPadding",
        "body",
        "",
        "layoutHeight",
        "bottomSheet",
        "",
        "sheetOffset",
        "sheetState",
        "BottomSheetScaffoldLayout-PxNyym8",
        "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/q;Lv3/p;FLv3/a;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V",
        "BottomSheetScaffoldLayout",
        "material3_release"
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
        "SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,386:1\n74#2:387\n74#2:433\n1116#3,6:388\n1116#3,6:394\n1116#3,6:400\n1116#3,3:411\n1119#3,3:417\n1116#3,6:421\n1116#3,6:427\n1116#3,6:434\n1116#3,6:440\n487#4,4:406\n491#4,2:414\n495#4:420\n25#5:410\n487#6:416\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n120#1:387\n335#1:433\n131#1:388,6\n191#1:394,6\n193#1:400,6\n233#1:411,3\n233#1:417,3\n243#1:421,6\n256#1:427,6\n336#1:434,6\n339#1:440,6\n233#1:406,4\n233#1:414,2\n233#1:420\n233#1:410\n233#1:416\n*E\n"
    }
.end annotation


# direct methods
.method public static final BottomSheetScaffold-sdMYb0k(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;ZLv3/p;Lv3/q;JJLv3/q;Landroidx/compose/runtime/Composer;III)V
    .locals 29
    .param p0    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/BottomSheetScaffoldState;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p12    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p14    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p15    # Lv3/q;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p20    # Lv3/q;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p21    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
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
            "Landroidx/compose/material3/BottomSheetScaffoldState;",
            "FF",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFF",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;Z",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/material3/SnackbarHostState;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;JJ",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v15, p22

    move/from16 v14, p23

    move/from16 v13, p24

    const v0, -0x5ad53ca7

    move-object/from16 v1, p21

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v0

    and-int/lit8 v1, v13, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v15, 0x6

    move v4, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v15, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v15

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v4, v15

    :goto_1
    and-int/lit8 v5, v13, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v15, 0x30

    if-nez v8, :cond_5

    move-object/from16 v8, p1

    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v4, v9

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v8, p1

    :goto_4
    and-int/lit16 v9, v15, 0x180

    if-nez v9, :cond_8

    and-int/lit8 v9, v13, 0x4

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_5

    :cond_6
    move-object/from16 v9, p2

    :cond_7
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v4, v12

    goto :goto_6

    :cond_8
    move-object/from16 v9, p2

    :goto_6
    and-int/lit8 v12, v13, 0x8

    const/16 v16, 0x800

    const/16 v17, 0x400

    if-eqz v12, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v2, v15, 0xc00

    if-nez v2, :cond_b

    move/from16 v2, p3

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v18, v16

    goto :goto_7

    :cond_a
    move/from16 v18, v17

    :goto_7
    or-int v4, v4, v18

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v2, p3

    :goto_9
    and-int/lit8 v18, v13, 0x10

    const/16 v19, 0x2000

    const/16 v20, 0x4000

    if-eqz v18, :cond_c

    or-int/lit16 v4, v4, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v3, v15, 0x6000

    if-nez v3, :cond_e

    move/from16 v3, p4

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v22

    if-eqz v22, :cond_d

    move/from16 v22, v20

    goto :goto_a

    :cond_d
    move/from16 v22, v19

    :goto_a
    or-int v4, v4, v22

    goto :goto_c

    :cond_e
    :goto_b
    move/from16 v3, p4

    :goto_c
    const/high16 v22, 0x30000

    and-int v22, v15, v22

    const/high16 v23, 0x10000

    if-nez v22, :cond_10

    and-int/lit8 v22, v13, 0x20

    move-object/from16 v6, p5

    if-nez v22, :cond_f

    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    const/high16 v24, 0x20000

    goto :goto_d

    :cond_f
    move/from16 v24, v23

    :goto_d
    or-int v4, v4, v24

    goto :goto_e

    :cond_10
    move-object/from16 v6, p5

    :goto_e
    const/high16 v24, 0x180000

    and-int v25, v15, v24

    if-nez v25, :cond_12

    and-int/lit8 v25, v13, 0x40

    move-wide/from16 v7, p6

    if-nez v25, :cond_11

    invoke-interface {v0, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v26

    if-eqz v26, :cond_11

    const/high16 v26, 0x100000

    goto :goto_f

    :cond_11
    const/high16 v26, 0x80000

    :goto_f
    or-int v4, v4, v26

    goto :goto_10

    :cond_12
    move-wide/from16 v7, p6

    :goto_10
    const/high16 v26, 0xc00000

    and-int v26, v15, v26

    if-nez v26, :cond_15

    and-int/lit16 v11, v13, 0x80

    if-nez v11, :cond_13

    move-wide/from16 v10, p8

    invoke-interface {v0, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v27

    if-eqz v27, :cond_14

    const/high16 v27, 0x800000

    goto :goto_11

    :cond_13
    move-wide/from16 v10, p8

    :cond_14
    const/high16 v27, 0x400000

    :goto_11
    or-int v4, v4, v27

    goto :goto_12

    :cond_15
    move-wide/from16 v10, p8

    :goto_12
    and-int/lit16 v1, v13, 0x100

    const/high16 v27, 0x6000000

    if-eqz v1, :cond_16

    or-int v4, v4, v27

    move/from16 v2, p10

    goto :goto_14

    :cond_16
    and-int v27, v15, v27

    move/from16 v2, p10

    if-nez v27, :cond_18

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v27

    if-eqz v27, :cond_17

    const/high16 v27, 0x4000000

    goto :goto_13

    :cond_17
    const/high16 v27, 0x2000000

    :goto_13
    or-int v4, v4, v27

    :cond_18
    :goto_14
    and-int/lit16 v2, v13, 0x200

    const/high16 v27, 0x30000000

    if-eqz v2, :cond_19

    or-int v4, v4, v27

    move/from16 v3, p11

    goto :goto_16

    :cond_19
    and-int v27, v15, v27

    move/from16 v3, p11

    if-nez v27, :cond_1b

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v27

    if-eqz v27, :cond_1a

    const/high16 v27, 0x20000000

    goto :goto_15

    :cond_1a
    const/high16 v27, 0x10000000

    :goto_15
    or-int v4, v4, v27

    :cond_1b
    :goto_16
    and-int/lit16 v3, v13, 0x400

    if-eqz v3, :cond_1c

    or-int/lit8 v21, v14, 0x6

    move-object/from16 v6, p12

    goto :goto_18

    :cond_1c
    and-int/lit8 v27, v14, 0x6

    move-object/from16 v6, p12

    if-nez v27, :cond_1e

    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_1d

    const/16 v21, 0x4

    goto :goto_17

    :cond_1d
    const/16 v21, 0x2

    :goto_17
    or-int v21, v14, v21

    goto :goto_18

    :cond_1e
    move/from16 v21, v14

    :goto_18
    and-int/lit16 v6, v13, 0x800

    if-eqz v6, :cond_1f

    or-int/lit8 v21, v21, 0x30

    move/from16 v7, p13

    goto :goto_1a

    :cond_1f
    and-int/lit8 v27, v14, 0x30

    move/from16 v7, p13

    if-nez v27, :cond_21

    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-eqz v8, :cond_20

    const/16 v25, 0x20

    goto :goto_19

    :cond_20
    const/16 v25, 0x10

    :goto_19
    or-int v21, v21, v25

    :cond_21
    :goto_1a
    move/from16 v8, v21

    and-int/lit16 v7, v13, 0x1000

    if-eqz v7, :cond_22

    or-int/lit16 v8, v8, 0x180

    goto :goto_1c

    :cond_22
    and-int/lit16 v9, v14, 0x180

    if-nez v9, :cond_24

    move-object/from16 v9, p14

    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_23

    const/16 v26, 0x100

    goto :goto_1b

    :cond_23
    const/16 v26, 0x80

    :goto_1b
    or-int v8, v8, v26

    goto :goto_1d

    :cond_24
    :goto_1c
    move-object/from16 v9, p14

    :goto_1d
    and-int/lit16 v9, v13, 0x2000

    if-eqz v9, :cond_25

    or-int/lit16 v8, v8, 0xc00

    goto :goto_1f

    :cond_25
    and-int/lit16 v10, v14, 0xc00

    if-nez v10, :cond_27

    move-object/from16 v10, p15

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_26

    goto :goto_1e

    :cond_26
    move/from16 v16, v17

    :goto_1e
    or-int v8, v8, v16

    goto :goto_20

    :cond_27
    :goto_1f
    move-object/from16 v10, p15

    :goto_20
    and-int/lit16 v11, v14, 0x6000

    if-nez v11, :cond_2a

    and-int/lit16 v11, v13, 0x4000

    if-nez v11, :cond_28

    move-wide/from16 v10, p16

    invoke-interface {v0, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v16

    if-eqz v16, :cond_29

    move/from16 v19, v20

    goto :goto_21

    :cond_28
    move-wide/from16 v10, p16

    :cond_29
    :goto_21
    or-int v8, v8, v19

    goto :goto_22

    :cond_2a
    move-wide/from16 v10, p16

    :goto_22
    const/high16 v16, 0x30000

    and-int v16, v14, v16

    const v17, 0x8000

    if-nez v16, :cond_2c

    and-int v16, v13, v17

    move-wide/from16 v10, p18

    if-nez v16, :cond_2b

    invoke-interface {v0, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v16

    if-eqz v16, :cond_2b

    const/high16 v16, 0x20000

    goto :goto_23

    :cond_2b
    move/from16 v16, v23

    :goto_23
    or-int v8, v8, v16

    goto :goto_24

    :cond_2c
    move-wide/from16 v10, p18

    :goto_24
    and-int v16, v13, v23

    if-eqz v16, :cond_2d

    or-int v8, v8, v24

    move-object/from16 v14, p20

    goto :goto_26

    :cond_2d
    and-int v16, v14, v24

    move-object/from16 v14, p20

    if-nez v16, :cond_2f

    invoke-interface {v0, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2e

    const/high16 v16, 0x100000

    goto :goto_25

    :cond_2e
    const/high16 v16, 0x80000

    :goto_25
    or-int v8, v8, v16

    :cond_2f
    :goto_26
    const v16, 0x12492493

    and-int v10, v4, v16

    const v11, 0x12492492

    if-ne v10, v11, :cond_31

    const v10, 0x92493

    and-int/2addr v10, v8

    const v11, 0x92492

    if-ne v10, v11, :cond_31

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v10

    if-nez v10, :cond_30

    goto :goto_27

    .line 2
    :cond_30
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-wide/from16 v17, p16

    move-wide/from16 v19, p18

    goto/16 :goto_3b

    .line 3
    :cond_31
    :goto_27
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v10, v15, 0x1

    if-eqz v10, :cond_39

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v10

    if-eqz v10, :cond_32

    goto :goto_28

    .line 4
    :cond_32
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v1, v13, 0x4

    if-eqz v1, :cond_33

    and-int/lit16 v4, v4, -0x381

    :cond_33
    and-int/lit8 v1, v13, 0x20

    if-eqz v1, :cond_34

    const v1, -0x70001

    and-int/2addr v4, v1

    :cond_34
    and-int/lit8 v1, v13, 0x40

    if-eqz v1, :cond_35

    const v1, -0x380001

    and-int/2addr v4, v1

    :cond_35
    and-int/lit16 v1, v13, 0x80

    if-eqz v1, :cond_36

    const v1, -0x1c00001

    and-int/2addr v4, v1

    :cond_36
    and-int/lit16 v1, v13, 0x4000

    if-eqz v1, :cond_37

    const v1, -0xe001

    and-int/2addr v8, v1

    :cond_37
    and-int v1, v13, v17

    if-eqz v1, :cond_38

    const v1, -0x70001

    and-int/2addr v8, v1

    :cond_38
    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v12, p4

    move-wide/from16 v5, p6

    move-wide/from16 v20, p8

    move/from16 v7, p10

    move-object/from16 v9, p12

    move/from16 v10, p13

    move-object/from16 v18, p14

    move-object/from16 v11, p15

    move-wide/from16 v22, p16

    move-wide/from16 v24, p18

    move v13, v4

    move v14, v8

    move-object/from16 v4, p5

    move/from16 v8, p11

    goto/16 :goto_38

    :cond_39
    :goto_28
    if-eqz v5, :cond_3a

    .line 5
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_29

    :cond_3a
    move-object/from16 v5, p1

    :goto_29
    and-int/lit8 v10, v13, 0x4

    const/4 v11, 0x0

    if-eqz v10, :cond_3b

    const/4 v10, 0x0

    move-object/from16 p1, v5

    const/4 v5, 0x3

    .line 6
    invoke-static {v11, v11, v0, v10, v5}, Landroidx/compose/material3/BottomSheetScaffoldKt;->rememberBottomSheetScaffoldState(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;

    move-result-object v5

    and-int/lit16 v4, v4, -0x381

    goto :goto_2a

    :cond_3b
    move-object/from16 p1, v5

    move-object/from16 v5, p2

    :goto_2a
    if-eqz v12, :cond_3c

    .line 7
    sget-object v10, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v10}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetPeekHeight-D9Ej5fM()F

    move-result v10

    goto :goto_2b

    :cond_3c
    move/from16 v10, p3

    :goto_2b
    if-eqz v18, :cond_3d

    .line 8
    sget-object v12, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v12}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetMaxWidth-D9Ej5fM()F

    move-result v12

    goto :goto_2c

    :cond_3d
    move/from16 v12, p4

    :goto_2c
    and-int/lit8 v18, v13, 0x20

    if-eqz v18, :cond_3e

    .line 9
    sget-object v11, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    move-object/from16 p2, v5

    const/4 v5, 0x6

    invoke-virtual {v11, v0, v5}, Landroidx/compose/material3/BottomSheetDefaults;->getExpandedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v11

    const v16, -0x70001

    and-int v4, v4, v16

    goto :goto_2d

    :cond_3e
    move-object/from16 p2, v5

    const/4 v5, 0x6

    move-object/from16 v11, p5

    :goto_2d
    and-int/lit8 v16, v13, 0x40

    move/from16 p3, v10

    if-eqz v16, :cond_3f

    .line 10
    sget-object v10, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v10, v0, v5}, Landroidx/compose/material3/BottomSheetDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v20

    const v5, -0x380001

    and-int/2addr v4, v5

    move v10, v4

    move-wide/from16 v4, v20

    goto :goto_2e

    :cond_3f
    move v10, v4

    move-wide/from16 v4, p6

    :goto_2e
    move-object/from16 p4, v11

    and-int/lit16 v11, v13, 0x80

    if-eqz v11, :cond_40

    shr-int/lit8 v11, v10, 0x12

    and-int/lit8 v11, v11, 0xe

    .line 11
    invoke-static {v4, v5, v0, v11}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v20

    const v11, -0x1c00001

    and-int/2addr v10, v11

    goto :goto_2f

    :cond_40
    move-wide/from16 v20, p8

    :goto_2f
    if-eqz v1, :cond_41

    .line 12
    sget-object v1, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v1}, Landroidx/compose/material3/BottomSheetDefaults;->getElevation-D9Ej5fM()F

    move-result v1

    goto :goto_30

    :cond_41
    move/from16 v1, p10

    :goto_30
    if-eqz v2, :cond_42

    .line 13
    sget-object v2, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/BottomSheetDefaults;->getElevation-D9Ej5fM()F

    move-result v2

    goto :goto_31

    :cond_42
    move/from16 v2, p11

    :goto_31
    if-eqz v3, :cond_43

    sget-object v3, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;

    invoke-virtual {v3}, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->getLambda-1$material3_release()Lv3/p;

    move-result-object v3

    goto :goto_32

    :cond_43
    move-object/from16 v3, p12

    :goto_32
    if-eqz v6, :cond_44

    const/4 v6, 0x1

    goto :goto_33

    :cond_44
    move/from16 v6, p13

    :goto_33
    if-eqz v7, :cond_45

    const/16 v18, 0x0

    goto :goto_34

    :cond_45
    move-object/from16 v18, p14

    :goto_34
    if-eqz v9, :cond_46

    .line 14
    sget-object v7, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;

    invoke-virtual {v7}, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->getLambda-2$material3_release()Lv3/q;

    move-result-object v7

    goto :goto_35

    :cond_46
    move-object/from16 v7, p15

    :goto_35
    and-int/lit16 v9, v13, 0x4000

    if-eqz v9, :cond_47

    .line 15
    sget-object v9, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    const/4 v11, 0x6

    invoke-virtual {v9, v0, v11}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/material3/ColorScheme;->getSurface-0d7_KjU()J

    move-result-wide v22

    const v9, -0xe001

    and-int/2addr v8, v9

    move v11, v8

    move-wide/from16 v8, v22

    goto :goto_36

    :cond_47
    move v11, v8

    move-wide/from16 v8, p16

    :goto_36
    and-int v17, v13, v17

    if-eqz v17, :cond_48

    shr-int/lit8 v17, v11, 0xc

    move/from16 p5, v1

    and-int/lit8 v1, v17, 0xe

    .line 16
    invoke-static {v8, v9, v0, v1}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v22

    const v1, -0x70001

    and-int/2addr v1, v11

    move v14, v1

    move-object v11, v7

    move v13, v10

    move-wide/from16 v24, v22

    move-object/from16 v1, p1

    move/from16 v7, p5

    move v10, v6

    move-wide/from16 v22, v8

    move v8, v2

    move-object v9, v3

    move-wide v5, v4

    move-object/from16 v2, p2

    move/from16 v3, p3

    goto :goto_37

    :cond_48
    move/from16 p5, v1

    move-object/from16 v1, p1

    move-wide/from16 v24, p18

    move-wide/from16 v22, v8

    move v13, v10

    move v14, v11

    move v8, v2

    move-object v9, v3

    move v10, v6

    move-object v11, v7

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v7, p5

    move-wide v5, v4

    :goto_37
    move-object/from16 v4, p4

    :goto_38
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v17

    if-eqz v17, :cond_49

    const v15, -0x5ad53ca7

    move-object/from16 p16, v1

    const-string v1, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:118)"

    .line 17
    invoke-static {v15, v13, v14, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_39

    :cond_49
    move-object/from16 p16, v1

    .line 18
    :goto_39
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    .line 19
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    .line 20
    check-cast v1, Landroidx/compose/ui/unit/Density;

    .line 21
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    move-result v1

    .line 22
    invoke-virtual {v2}, Landroidx/compose/material3/BottomSheetScaffoldState;->getBottomSheetState()Landroidx/compose/material3/SheetState;

    move-result-object v15

    move-object/from16 p17, v15

    .line 23
    new-instance v15, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1;

    move-object/from16 p1, v15

    move-object/from16 p2, v2

    move/from16 p3, v1

    move/from16 p4, v3

    move/from16 p5, v12

    move/from16 p6, v10

    move-object/from16 p7, v4

    move-wide/from16 p8, v5

    move-wide/from16 p10, v20

    move/from16 p12, v7

    move/from16 p13, v8

    move-object/from16 p14, v9

    move-object/from16 p15, p0

    invoke-direct/range {p1 .. p15}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1;-><init>(Landroidx/compose/material3/BottomSheetScaffoldState;IFFZLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;Lv3/q;)V

    const v1, -0x2889a628

    move-object/from16 p15, v4

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v15}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    .line 24
    new-instance v15, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$2;

    invoke-direct {v15, v11, v2}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$2;-><init>(Lv3/q;Landroidx/compose/material3/BottomSheetScaffoldState;)V

    move-wide/from16 p18, v5

    const v5, 0x548d5be

    invoke-static {v0, v5, v4, v15}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v5

    const v6, -0x5d6ed43b

    .line 25
    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit16 v6, v13, 0x380

    xor-int/lit16 v6, v6, 0x180

    const/16 v15, 0x100

    if-le v6, v15, :cond_4a

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4c

    :cond_4a
    and-int/lit16 v6, v13, 0x180

    if-ne v6, v15, :cond_4b

    goto :goto_3a

    :cond_4b
    const/4 v4, 0x0

    .line 26
    :cond_4c
    :goto_3a
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_4d

    .line 27
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_4e

    .line 28
    :cond_4d
    new-instance v6, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$3$1;

    invoke-direct {v6, v2}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$3$1;-><init>(Landroidx/compose/material3/BottomSheetScaffoldState;)V

    .line 29
    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 30
    :cond_4e
    move-object v4, v6

    check-cast v4, Lv3/a;

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    shr-int/lit8 v6, v13, 0x3

    and-int/lit8 v6, v6, 0xe

    or-int/lit16 v6, v6, 0x6c00

    shr-int/lit8 v15, v14, 0x3

    and-int/lit8 v15, v15, 0x70

    or-int/2addr v6, v15

    shr-int/lit8 v15, v14, 0xc

    and-int/lit16 v15, v15, 0x380

    or-int/2addr v6, v15

    const/high16 v15, 0x70000

    const/16 v16, 0x6

    shl-int/lit8 v13, v13, 0x6

    and-int/2addr v13, v15

    or-int/2addr v6, v13

    shl-int/lit8 v13, v14, 0xc

    const/high16 v14, 0xe000000

    and-int/2addr v14, v13

    or-int/2addr v6, v14

    const/high16 v14, 0x70000000

    and-int/2addr v13, v14

    or-int/2addr v6, v13

    move-object/from16 p1, p16

    move-object/from16 p2, v18

    move-object/from16 p3, p20

    move-object/from16 p4, v1

    move-object/from16 p5, v5

    move/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, p17

    move-wide/from16 p9, v22

    move-wide/from16 p11, v24

    move-object/from16 p13, v0

    move/from16 p14, v6

    .line 31
    invoke-static/range {p1 .. p14}, Landroidx/compose/material3/BottomSheetScaffoldKt;->BottomSheetScaffoldLayout-PxNyym8(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/q;Lv3/p;FLv3/a;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_4f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4f
    move-object/from16 v6, p15

    move v4, v3

    move-object v13, v9

    move v14, v10

    move-object/from16 v16, v11

    move v5, v12

    move-object/from16 v15, v18

    move-wide/from16 v9, v20

    move-wide/from16 v17, v22

    move-wide/from16 v19, v24

    move-object v3, v2

    move v11, v7

    move v12, v8

    move-object/from16 v2, p16

    move-wide/from16 v7, p18

    .line 32
    :goto_3b
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_50

    new-instance v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$4;

    move-object/from16 p1, v0

    move-object/from16 v28, v1

    move-object/from16 v1, p0

    move-object/from16 v21, p20

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    invoke-direct/range {v0 .. v24}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$4;-><init>(Lv3/q;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;ZLv3/p;Lv3/q;JJLv3/q;III)V

    move-object/from16 v1, p1

    move-object/from16 v0, v28

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_50
    return-void
.end method

.method private static final BottomSheetScaffoldLayout-PxNyym8(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/q;Lv3/p;FLv3/a;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;F",
            "Lv3/a<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/material3/SheetState;",
            "JJ",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v13, p7

    .line 2
    .line 3
    move/from16 v14, p13

    .line 4
    .line 5
    const v0, -0x42ca6b10

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p12

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v15

    .line 14
    and-int/lit8 v1, v14, 0x6

    .line 15
    .line 16
    move-object/from16 v12, p0

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x2

    .line 29
    :goto_0
    or-int/2addr v1, v14

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v1, v14

    .line 32
    :goto_1
    and-int/lit8 v3, v14, 0x30

    .line 33
    .line 34
    move-object/from16 v11, p1

    .line 35
    .line 36
    if-nez v3, :cond_3

    .line 37
    .line 38
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    const/16 v3, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v1, v3

    .line 50
    :cond_3
    and-int/lit16 v3, v14, 0x180

    .line 51
    .line 52
    move-object/from16 v10, p2

    .line 53
    .line 54
    if-nez v3, :cond_5

    .line 55
    .line 56
    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    const/16 v3, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v3, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v1, v3

    .line 68
    :cond_5
    and-int/lit16 v3, v14, 0xc00

    .line 69
    .line 70
    move-object/from16 v9, p3

    .line 71
    .line 72
    if-nez v3, :cond_7

    .line 73
    .line 74
    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_6

    .line 79
    .line 80
    const/16 v3, 0x800

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    const/16 v3, 0x400

    .line 84
    .line 85
    :goto_4
    or-int/2addr v1, v3

    .line 86
    :cond_7
    and-int/lit16 v3, v14, 0x6000

    .line 87
    .line 88
    move-object/from16 v8, p4

    .line 89
    .line 90
    if-nez v3, :cond_9

    .line 91
    .line 92
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_8

    .line 97
    .line 98
    const/16 v3, 0x4000

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_8
    const/16 v3, 0x2000

    .line 102
    .line 103
    :goto_5
    or-int/2addr v1, v3

    .line 104
    :cond_9
    const/high16 v3, 0x30000

    .line 105
    .line 106
    and-int/2addr v3, v14

    .line 107
    if-nez v3, :cond_b

    .line 108
    .line 109
    move/from16 v3, p5

    .line 110
    .line 111
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 112
    .line 113
    .line 114
    move-result v16

    .line 115
    if-eqz v16, :cond_a

    .line 116
    .line 117
    const/high16 v16, 0x20000

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v16, 0x10000

    .line 121
    .line 122
    :goto_6
    or-int v1, v1, v16

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_b
    move/from16 v3, p5

    .line 126
    .line 127
    :goto_7
    const/high16 v16, 0x180000

    .line 128
    .line 129
    and-int v16, v14, v16

    .line 130
    .line 131
    move-object/from16 v7, p6

    .line 132
    .line 133
    if-nez v16, :cond_d

    .line 134
    .line 135
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v17

    .line 139
    if-eqz v17, :cond_c

    .line 140
    .line 141
    const/high16 v17, 0x100000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_c
    const/high16 v17, 0x80000

    .line 145
    .line 146
    :goto_8
    or-int v1, v1, v17

    .line 147
    .line 148
    :cond_d
    const/high16 v17, 0xc00000

    .line 149
    .line 150
    and-int v17, v14, v17

    .line 151
    .line 152
    if-nez v17, :cond_f

    .line 153
    .line 154
    invoke-interface {v15, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v17

    .line 158
    if-eqz v17, :cond_e

    .line 159
    .line 160
    const/high16 v17, 0x800000

    .line 161
    .line 162
    goto :goto_9

    .line 163
    :cond_e
    const/high16 v17, 0x400000

    .line 164
    .line 165
    :goto_9
    or-int v1, v1, v17

    .line 166
    .line 167
    :cond_f
    const/high16 v17, 0x6000000

    .line 168
    .line 169
    and-int v17, v14, v17

    .line 170
    .line 171
    move-wide/from16 v2, p8

    .line 172
    .line 173
    if-nez v17, :cond_11

    .line 174
    .line 175
    invoke-interface {v15, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 176
    .line 177
    .line 178
    move-result v18

    .line 179
    if-eqz v18, :cond_10

    .line 180
    .line 181
    const/high16 v18, 0x4000000

    .line 182
    .line 183
    goto :goto_a

    .line 184
    :cond_10
    const/high16 v18, 0x2000000

    .line 185
    .line 186
    :goto_a
    or-int v1, v1, v18

    .line 187
    .line 188
    :cond_11
    const/high16 v18, 0x30000000

    .line 189
    .line 190
    and-int v18, v14, v18

    .line 191
    .line 192
    move-wide/from16 v6, p10

    .line 193
    .line 194
    if-nez v18, :cond_13

    .line 195
    .line 196
    invoke-interface {v15, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 197
    .line 198
    .line 199
    move-result v19

    .line 200
    if-eqz v19, :cond_12

    .line 201
    .line 202
    const/high16 v19, 0x20000000

    .line 203
    .line 204
    goto :goto_b

    .line 205
    :cond_12
    const/high16 v19, 0x10000000

    .line 206
    .line 207
    :goto_b
    or-int v1, v1, v19

    .line 208
    .line 209
    :cond_13
    const v19, 0x12492493

    .line 210
    .line 211
    .line 212
    and-int v4, v1, v19

    .line 213
    .line 214
    const v5, 0x12492492

    .line 215
    .line 216
    .line 217
    if-ne v4, v5, :cond_15

    .line 218
    .line 219
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_14

    .line 224
    .line 225
    goto :goto_c

    .line 226
    :cond_14
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_1a

    .line 230
    .line 231
    :cond_15
    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eqz v4, :cond_16

    .line 236
    .line 237
    const/4 v4, -0x1

    .line 238
    const-string v5, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:332)"

    .line 239
    .line 240
    invoke-static {v0, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :cond_16
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    check-cast v0, Landroidx/compose/ui/unit/Density;

    .line 252
    .line 253
    const v4, -0x5e90850

    .line 254
    .line 255
    .line 256
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x1c00000

    .line 260
    .line 261
    and-int/2addr v4, v1

    .line 262
    const/high16 v5, 0x800000

    .line 263
    .line 264
    if-ne v4, v5, :cond_17

    .line 265
    .line 266
    const/4 v5, 0x1

    .line 267
    goto :goto_d

    .line 268
    :cond_17
    const/4 v5, 0x0

    .line 269
    :goto_d
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v20

    .line 273
    or-int v5, v5, v20

    .line 274
    .line 275
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v14

    .line 279
    if-nez v5, :cond_18

    .line 280
    .line 281
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 282
    .line 283
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    if-ne v14, v5, :cond_19

    .line 288
    .line 289
    :cond_18
    new-instance v14, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1;

    .line 290
    .line 291
    invoke-direct {v14, v13, v0}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1;-><init>(Landroidx/compose/material3/SheetState;Landroidx/compose/ui/unit/Density;)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_19
    check-cast v14, Lv3/a;

    .line 298
    .line 299
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 300
    .line 301
    .line 302
    const/4 v0, 0x0

    .line 303
    invoke-static {v14, v15, v0}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lv3/a;Landroidx/compose/runtime/Composer;I)V

    .line 304
    .line 305
    .line 306
    const v0, -0x5e9080e

    .line 307
    .line 308
    .line 309
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 310
    .line 311
    .line 312
    and-int/lit16 v0, v1, 0x1c00

    .line 313
    .line 314
    const/16 v5, 0x800

    .line 315
    .line 316
    if-ne v0, v5, :cond_1a

    .line 317
    .line 318
    const/4 v0, 0x1

    .line 319
    goto :goto_e

    .line 320
    :cond_1a
    const/4 v0, 0x0

    .line 321
    :goto_e
    and-int/lit8 v5, v1, 0x70

    .line 322
    .line 323
    const/16 v14, 0x20

    .line 324
    .line 325
    if-ne v5, v14, :cond_1b

    .line 326
    .line 327
    const/4 v5, 0x1

    .line 328
    goto :goto_f

    .line 329
    :cond_1b
    const/4 v5, 0x0

    .line 330
    :goto_f
    or-int/2addr v0, v5

    .line 331
    and-int/lit8 v5, v1, 0xe

    .line 332
    .line 333
    const/4 v14, 0x4

    .line 334
    if-ne v5, v14, :cond_1c

    .line 335
    .line 336
    const/4 v5, 0x1

    .line 337
    goto :goto_10

    .line 338
    :cond_1c
    const/4 v5, 0x0

    .line 339
    :goto_10
    or-int/2addr v0, v5

    .line 340
    const/high16 v5, 0xe000000

    .line 341
    .line 342
    and-int/2addr v5, v1

    .line 343
    const/high16 v14, 0x4000000

    .line 344
    .line 345
    if-ne v5, v14, :cond_1d

    .line 346
    .line 347
    const/4 v5, 0x1

    .line 348
    goto :goto_11

    .line 349
    :cond_1d
    const/4 v5, 0x0

    .line 350
    :goto_11
    or-int/2addr v0, v5

    .line 351
    const/high16 v5, 0x70000000

    .line 352
    .line 353
    and-int/2addr v5, v1

    .line 354
    const/high16 v14, 0x20000000

    .line 355
    .line 356
    if-ne v5, v14, :cond_1e

    .line 357
    .line 358
    const/4 v5, 0x1

    .line 359
    goto :goto_12

    .line 360
    :cond_1e
    const/4 v5, 0x0

    .line 361
    :goto_12
    or-int/2addr v0, v5

    .line 362
    and-int/lit16 v5, v1, 0x380

    .line 363
    .line 364
    const/16 v14, 0x100

    .line 365
    .line 366
    if-ne v5, v14, :cond_1f

    .line 367
    .line 368
    const/4 v5, 0x1

    .line 369
    goto :goto_13

    .line 370
    :cond_1f
    const/4 v5, 0x0

    .line 371
    :goto_13
    or-int/2addr v0, v5

    .line 372
    const/high16 v5, 0x70000

    .line 373
    .line 374
    and-int/2addr v5, v1

    .line 375
    const/high16 v14, 0x20000

    .line 376
    .line 377
    if-ne v5, v14, :cond_20

    .line 378
    .line 379
    const/4 v5, 0x1

    .line 380
    goto :goto_14

    .line 381
    :cond_20
    const/4 v5, 0x0

    .line 382
    :goto_14
    or-int/2addr v0, v5

    .line 383
    const v5, 0xe000

    .line 384
    .line 385
    .line 386
    and-int/2addr v5, v1

    .line 387
    const/16 v14, 0x4000

    .line 388
    .line 389
    if-ne v5, v14, :cond_21

    .line 390
    .line 391
    const/4 v5, 0x1

    .line 392
    goto :goto_15

    .line 393
    :cond_21
    const/4 v5, 0x0

    .line 394
    :goto_15
    or-int/2addr v0, v5

    .line 395
    const/high16 v5, 0x380000

    .line 396
    .line 397
    and-int/2addr v1, v5

    .line 398
    const/high16 v5, 0x100000

    .line 399
    .line 400
    if-ne v1, v5, :cond_22

    .line 401
    .line 402
    const/4 v1, 0x1

    .line 403
    goto :goto_16

    .line 404
    :cond_22
    const/4 v1, 0x0

    .line 405
    :goto_16
    or-int/2addr v0, v1

    .line 406
    const/high16 v1, 0x800000

    .line 407
    .line 408
    if-ne v4, v1, :cond_23

    .line 409
    .line 410
    const/4 v1, 0x1

    .line 411
    goto :goto_17

    .line 412
    :cond_23
    const/4 v1, 0x0

    .line 413
    :goto_17
    or-int/2addr v0, v1

    .line 414
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    if-nez v0, :cond_25

    .line 419
    .line 420
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 421
    .line 422
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    if-ne v1, v0, :cond_24

    .line 427
    .line 428
    goto :goto_18

    .line 429
    :cond_24
    const/4 v13, 0x1

    .line 430
    goto :goto_19

    .line 431
    :cond_25
    :goto_18
    new-instance v14, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;

    .line 432
    .line 433
    move-object v0, v14

    .line 434
    move-object/from16 v1, p1

    .line 435
    .line 436
    move-object/from16 v2, p4

    .line 437
    .line 438
    move-object/from16 v3, p3

    .line 439
    .line 440
    move-object/from16 v4, p0

    .line 441
    .line 442
    const/4 v7, 0x1

    .line 443
    move-wide/from16 v5, p8

    .line 444
    .line 445
    move v13, v7

    .line 446
    move-wide/from16 v7, p10

    .line 447
    .line 448
    move-object/from16 v9, p2

    .line 449
    .line 450
    move/from16 v10, p5

    .line 451
    .line 452
    move-object/from16 v11, p6

    .line 453
    .line 454
    move-object/from16 v12, p7

    .line 455
    .line 456
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;-><init>(Lv3/p;Lv3/p;Lv3/q;Landroidx/compose/ui/Modifier;JJLv3/q;FLv3/a;Landroidx/compose/material3/SheetState;)V

    .line 457
    .line 458
    .line 459
    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    move-object v1, v14

    .line 463
    :goto_19
    check-cast v1, Lv3/p;

    .line 464
    .line 465
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 466
    .line 467
    .line 468
    const/4 v0, 0x0

    .line 469
    const/4 v2, 0x0

    .line 470
    invoke-static {v0, v1, v15, v2, v13}, Landroidx/compose/ui/layout/SubcomposeLayoutKt;->SubcomposeLayout(Landroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    .line 471
    .line 472
    .line 473
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-eqz v0, :cond_26

    .line 478
    .line 479
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 480
    .line 481
    .line 482
    :cond_26
    :goto_1a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 483
    .line 484
    .line 485
    move-result-object v14

    .line 486
    if-eqz v14, :cond_27

    .line 487
    .line 488
    new-instance v15, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3;

    .line 489
    .line 490
    move-object v0, v15

    .line 491
    move-object/from16 v1, p0

    .line 492
    .line 493
    move-object/from16 v2, p1

    .line 494
    .line 495
    move-object/from16 v3, p2

    .line 496
    .line 497
    move-object/from16 v4, p3

    .line 498
    .line 499
    move-object/from16 v5, p4

    .line 500
    .line 501
    move/from16 v6, p5

    .line 502
    .line 503
    move-object/from16 v7, p6

    .line 504
    .line 505
    move-object/from16 v8, p7

    .line 506
    .line 507
    move-wide/from16 v9, p8

    .line 508
    .line 509
    move-wide/from16 v11, p10

    .line 510
    .line 511
    move/from16 v13, p13

    .line 512
    .line 513
    invoke-direct/range {v0 .. v13}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3;-><init>(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/q;Lv3/p;FLv3/a;Landroidx/compose/material3/SheetState;JJI)V

    .line 514
    .line 515
    .line 516
    invoke-interface {v14, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 517
    .line 518
    .line 519
    :cond_27
    return-void
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
.end method

.method private static final StandardBottomSheet-XcniZvE(Landroidx/compose/material3/SheetState;Lv3/l;FFZLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;Lv3/q;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetState;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/unit/IntSize;",
            "+",
            "Landroidx/compose/material3/DraggableAnchors<",
            "Landroidx/compose/material3/SheetValue;",
            ">;>;FFZ",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFF",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
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

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move/from16 v15, p15

    const v0, 0x194cbd93

    move-object/from16 v1, p14

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    and-int/lit8 v1, v15, 0x6

    if-nez v1, :cond_1

    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v15

    goto :goto_1

    :cond_1
    move v1, v15

    :goto_1
    and-int/lit8 v4, v15, 0x30

    const/16 v5, 0x10

    if-nez v4, :cond_3

    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit16 v4, v15, 0x180

    if-nez v4, :cond_5

    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v1, v4

    :cond_5
    and-int/lit16 v4, v15, 0xc00

    if-nez v4, :cond_7

    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v1, v4

    :cond_7
    and-int/lit16 v4, v15, 0x6000

    move/from16 v12, p4

    if-nez v4, :cond_9

    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_5

    :cond_8
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v1, v4

    :cond_9
    const/high16 v4, 0x30000

    and-int/2addr v4, v15

    move-object/from16 v13, p5

    if-nez v4, :cond_b

    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    const/high16 v4, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v4, 0x10000

    :goto_6
    or-int/2addr v1, v4

    :cond_b
    const/high16 v4, 0x180000

    and-int/2addr v4, v15

    move-wide/from16 v11, p6

    if-nez v4, :cond_d

    invoke-interface {v10, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v4

    if-eqz v4, :cond_c

    const/high16 v4, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v4, 0x80000

    :goto_7
    or-int/2addr v1, v4

    :cond_d
    const/high16 v14, 0xc00000

    and-int v4, v15, v14

    move-wide/from16 v2, p8

    if-nez v4, :cond_f

    invoke-interface {v10, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v17

    if-eqz v17, :cond_e

    const/high16 v17, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v17, 0x400000

    :goto_8
    or-int v1, v1, v17

    :cond_f
    const/high16 v17, 0x6000000

    and-int v17, v15, v17

    move/from16 v14, p10

    if-nez v17, :cond_11

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v17, 0x2000000

    :goto_9
    or-int v1, v1, v17

    :cond_11
    const/high16 v17, 0x30000000

    and-int v17, v15, v17

    move/from16 v0, p11

    if-nez v17, :cond_13

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v18

    if-eqz v18, :cond_12

    const/high16 v18, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v18, 0x10000000

    :goto_a
    or-int v1, v1, v18

    :cond_13
    and-int/lit8 v18, p16, 0x6

    move-object/from16 v13, p12

    if-nez v18, :cond_15

    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_14

    const/16 v18, 0x4

    goto :goto_b

    :cond_14
    const/16 v18, 0x2

    :goto_b
    or-int v18, p16, v18

    goto :goto_c

    :cond_15
    move/from16 v18, p16

    :goto_c
    and-int/lit8 v19, p16, 0x30

    move-object/from16 v14, p13

    if-nez v19, :cond_17

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_16

    const/16 v5, 0x20

    :cond_16
    or-int v18, v18, v5

    :cond_17
    move/from16 v5, v18

    const v18, 0x12492493

    and-int v4, v1, v18

    const v0, 0x12492492

    if-ne v4, v0, :cond_19

    and-int/lit8 v0, v5, 0x13

    const/16 v4, 0x12

    if-ne v0, v4, :cond_19

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_d

    .line 2
    :cond_18
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_f

    .line 3
    :cond_19
    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1a

    const-string v0, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:231)"

    const v4, 0x194cbd93

    invoke-static {v4, v1, v5, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1a
    const v0, 0x2e20b340

    .line 4
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const v0, -0x1d58f75c

    .line 5
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 6
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 7
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v0, v5, :cond_1b

    .line 8
    sget-object v0, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 9
    invoke-static {v0, v10}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    move-result-object v0

    .line 10
    new-instance v5, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v5, v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 11
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v0, v5

    .line 12
    :cond_1b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 13
    check-cast v0, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 14
    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    move-result-object v5

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 15
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 16
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v3, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    .line 17
    invoke-static {v2, v3, v9, v11, v12}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 18
    invoke-static {v2, v3, v11, v12}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v11, 0x2

    .line 19
    invoke-static {v2, v8, v3, v11, v12}, Landroidx/compose/foundation/layout/SizeKt;->requiredHeightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 20
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/AnchoredDraggableState;

    move-result-object v3

    const v11, 0x5f933896

    invoke-interface {v10, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    .line 21
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_1c

    .line 22
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v11, v3, :cond_1d

    .line 23
    :cond_1c
    new-instance v3, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$1$1;

    invoke-direct {v3, v5, v6}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$1$1;-><init>(Lkotlinx/coroutines/s0;Landroidx/compose/material3/SheetState;)V

    invoke-static {v6, v0, v3}, Landroidx/compose/material3/SheetDefaultsKt;->ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(Landroidx/compose/material3/SheetState;Landroidx/compose/foundation/gestures/Orientation;Lv3/l;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object v11

    .line 24
    invoke-interface {v10, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 25
    :cond_1d
    check-cast v11, Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const/4 v3, 0x2

    .line 26
    invoke-static {v2, v11, v12, v3, v12}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt;->nestedScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    .line 27
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/AnchoredDraggableState;

    move-result-object v17

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x18

    const/16 v23, 0x0

    move-object/from16 v18, v0

    move/from16 v19, p4

    .line 28
    invoke-static/range {v16 .. v23}, Landroidx/compose/material3/AnchoredDraggableKt;->anchoredDraggable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v2, 0x5f933ac1

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 v2, v1, 0x70

    const/4 v3, 0x0

    const/16 v11, 0x20

    if-ne v2, v11, :cond_1e

    const/4 v2, 0x1

    goto :goto_e

    :cond_1e
    move v2, v3

    :goto_e
    and-int/lit8 v11, v1, 0xe

    const/4 v12, 0x4

    if-ne v11, v12, :cond_1f

    const/4 v3, 0x1

    :cond_1f
    or-int/2addr v2, v3

    .line 29
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_20

    .line 30
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_21

    .line 31
    :cond_20
    new-instance v3, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$2$1;

    invoke-direct {v3, v7, v6}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$2$1;-><init>(Lv3/l;Landroidx/compose/material3/SheetState;)V

    .line 32
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 33
    :cond_21
    check-cast v3, Lv3/l;

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    invoke-static {v0, v3}, Landroidx/compose/ui/layout/OnRemeasuredModifierKt;->onSizeChanged(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v11, 0x0

    .line 34
    new-instance v12, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3;

    move-object v0, v12

    move/from16 v17, v1

    move-object/from16 v1, p12

    move-object/from16 v2, p0

    move/from16 v3, p4

    move-object v4, v5

    move-object/from16 v5, p13

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3;-><init>(Lv3/p;Landroidx/compose/material3/SheetState;ZLkotlinx/coroutines/s0;Lv3/q;)V

    const v0, 0x3fcf3058

    const/4 v1, 0x1

    invoke-static {v10, v0, v1, v12}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v25

    shr-int/lit8 v0, v17, 0xc

    and-int/lit8 v1, v0, 0x70

    const/high16 v2, 0xc00000

    or-int/2addr v1, v2

    and-int/lit16 v2, v0, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v0, 0x1c00

    or-int/2addr v1, v2

    const v2, 0xe000

    and-int/2addr v2, v0

    or-int/2addr v1, v2

    const/high16 v2, 0x70000

    and-int/2addr v0, v2

    or-int v27, v1, v0

    const/16 v28, 0x40

    move-object/from16 v17, p5

    move-wide/from16 v18, p6

    move-wide/from16 v20, p8

    move/from16 v22, p10

    move/from16 v23, p11

    move-object/from16 v24, v11

    move-object/from16 v26, v10

    .line 35
    invoke-static/range {v16 .. v28}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lv3/p;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 36
    :cond_22
    :goto_f
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_23

    new-instance v11, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$4;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-object/from16 v29, v11

    move/from16 v11, p10

    move-object/from16 v30, v12

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move/from16 v16, p16

    invoke-direct/range {v0 .. v16}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$4;-><init>(Landroidx/compose/material3/SheetState;Lv3/l;FFZLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;Lv3/q;II)V

    move-object/from16 v1, v29

    move-object/from16 v0, v30

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_23
    return-void
.end method

.method public static final synthetic access$BottomSheetScaffoldLayout-PxNyym8(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/q;Lv3/p;FLv3/a;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p13}, Landroidx/compose/material3/BottomSheetScaffoldKt;->BottomSheetScaffoldLayout-PxNyym8(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/q;Lv3/p;FLv3/a;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$StandardBottomSheet-XcniZvE(Landroidx/compose/material3/SheetState;Lv3/l;FFZLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;Lv3/q;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p16}, Landroidx/compose/material3/BottomSheetScaffoldKt;->StandardBottomSheet-XcniZvE(Landroidx/compose/material3/SheetState;Lv3/l;FFZLandroidx/compose/ui/graphics/Shape;JJFFLv3/p;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final rememberBottomSheetScaffoldState(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;
    .locals 8
    .param p0    # Landroidx/compose/material3/SheetState;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/material3/SnackbarHostState;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, -0x57e4b436

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p4, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x7

    .line 16
    move-object v5, p2

    .line 17
    invoke-static/range {v2 .. v7}, Landroidx/compose/material3/BottomSheetScaffoldKt;->rememberStandardBottomSheetState(Landroidx/compose/material3/SheetValue;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    const p1, 0x27c69848

    .line 26
    .line 27
    .line 28
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 36
    .line 37
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    if-ne p1, p4, :cond_1

    .line 42
    .line 43
    new-instance p1, Landroidx/compose/material3/SnackbarHostState;

    .line 44
    .line 45
    invoke-direct {p1}, Landroidx/compose/material3/SnackbarHostState;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    check-cast p1, Landroidx/compose/material3/SnackbarHostState;

    .line 52
    .line 53
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    if-eqz p4, :cond_3

    .line 61
    .line 62
    const/4 p4, -0x1

    .line 63
    const-string v1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:191)"

    .line 64
    .line 65
    invoke-static {v0, p3, p4, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    const p4, 0x27c69892

    .line 69
    .line 70
    .line 71
    invoke-interface {p2, p4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 72
    .line 73
    .line 74
    and-int/lit8 p4, p3, 0xe

    .line 75
    .line 76
    xor-int/lit8 p4, p4, 0x6

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    const/4 v1, 0x4

    .line 80
    const/4 v2, 0x1

    .line 81
    if-le p4, v1, :cond_4

    .line 82
    .line 83
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p4

    .line 87
    if-nez p4, :cond_5

    .line 88
    .line 89
    :cond_4
    and-int/lit8 p4, p3, 0x6

    .line 90
    .line 91
    if-ne p4, v1, :cond_6

    .line 92
    .line 93
    :cond_5
    move p4, v2

    .line 94
    goto :goto_0

    .line 95
    :cond_6
    move p4, v0

    .line 96
    :goto_0
    and-int/lit8 v1, p3, 0x70

    .line 97
    .line 98
    xor-int/lit8 v1, v1, 0x30

    .line 99
    .line 100
    const/16 v3, 0x20

    .line 101
    .line 102
    if-le v1, v3, :cond_7

    .line 103
    .line 104
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_8

    .line 109
    .line 110
    :cond_7
    and-int/lit8 p3, p3, 0x30

    .line 111
    .line 112
    if-ne p3, v3, :cond_9

    .line 113
    .line 114
    :cond_8
    move v0, v2

    .line 115
    :cond_9
    or-int p3, p4, v0

    .line 116
    .line 117
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    if-nez p3, :cond_a

    .line 122
    .line 123
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 124
    .line 125
    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    if-ne p4, p3, :cond_b

    .line 130
    .line 131
    :cond_a
    new-instance p4, Landroidx/compose/material3/BottomSheetScaffoldState;

    .line 132
    .line 133
    invoke-direct {p4, p0, p1}, Landroidx/compose/material3/BottomSheetScaffoldState;-><init>(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p2, p4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_b
    check-cast p4, Landroidx/compose/material3/BottomSheetScaffoldState;

    .line 140
    .line 141
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 142
    .line 143
    .line 144
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_c

    .line 149
    .line 150
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 151
    .line 152
    .line 153
    :cond_c
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 154
    .line 155
    .line 156
    return-object p4
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
.end method

.method public static final rememberStandardBottomSheetState(Landroidx/compose/material3/SheetValue;Lv3/l;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;
    .locals 8
    .param p0    # Landroidx/compose/material3/SheetValue;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetValue;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/material3/SheetValue;",
            "Ljava/lang/Boolean;",
            ">;Z",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material3/SheetState;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const v0, 0x287143dd

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p5, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object p0, Landroidx/compose/material3/SheetValue;->PartiallyExpanded:Landroidx/compose/material3/SheetValue;

    .line 12
    .line 13
    :cond_0
    move-object v3, p0

    .line 14
    and-int/lit8 p0, p5, 0x2

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    sget-object p1, Landroidx/compose/material3/BottomSheetScaffoldKt$rememberStandardBottomSheetState$1;->INSTANCE:Landroidx/compose/material3/BottomSheetScaffoldKt$rememberStandardBottomSheetState$1;

    .line 19
    .line 20
    :cond_1
    move-object v2, p1

    .line 21
    and-int/lit8 p0, p5, 0x4

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    const/4 p2, 0x1

    .line 26
    :cond_2
    move v4, p2

    .line 27
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    const/4 p0, -0x1

    .line 34
    const-string p1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:214)"

    .line 35
    .line 36
    invoke-static {v0, p4, p0, p1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_3
    const/4 v1, 0x0

    .line 40
    and-int/lit8 p0, p4, 0x70

    .line 41
    .line 42
    or-int/lit8 p0, p0, 0x6

    .line 43
    .line 44
    shl-int/lit8 p1, p4, 0x6

    .line 45
    .line 46
    and-int/lit16 p1, p1, 0x380

    .line 47
    .line 48
    or-int/2addr p0, p1

    .line 49
    shl-int/lit8 p1, p4, 0x3

    .line 50
    .line 51
    and-int/lit16 p1, p1, 0x1c00

    .line 52
    .line 53
    or-int v6, p0, p1

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    move-object v5, p3

    .line 57
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/SheetDefaultsKt;->rememberSheetState(ZLv3/l;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 68
    .line 69
    .line 70
    :cond_4
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 71
    .line 72
    .line 73
    return-object p0
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
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
.end method
