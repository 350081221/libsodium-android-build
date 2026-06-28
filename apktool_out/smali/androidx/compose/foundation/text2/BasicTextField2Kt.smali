.class public final Landroidx/compose/foundation/text2/BasicTextField2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0092\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u00ef\u0001\u0010\'\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u001228\u0008\u0002\u0010\u001c\u001a2\u0012\u0004\u0012\u00020\u0015\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u001a\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u001b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0008\u0008\u0002\u0010 \u001a\u00020\u001f2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010#2\u0008\u0008\u0002\u0010&\u001a\u00020%H\u0007\u00a2\u0006\u0004\u0008\'\u0010(\u001a\u00db\u0001\u0010\'\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u001228\u0008\u0002\u0010\u001c\u001a2\u0012\u0004\u0012\u00020\u0015\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016\u00a2\u0006\u000c\u0008\u0018\u0012\u0008\u0008\u0019\u0012\u0004\u0008\u0008(\u001a\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u001b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0008\u0008\u0002\u0010 \u001a\u00020\u001f2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010#2\u0008\u0008\u0002\u0010&\u001a\u00020%H\u0007\u00a2\u0006\u0004\u0008\'\u0010+\u001a\u0017\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,H\u0001\u00a2\u0006\u0004\u0008.\u0010/\u001a\u0017\u00100\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,H\u0001\u00a2\u0006\u0004\u00080\u0010/\"\u001a\u00101\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u00081\u00102\u0012\u0004\u00083\u00104\u00a8\u00067\u00b2\u0006\u000e\u00106\u001a\u0002058\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "value",
        "Lkotlin/Function1;",
        "Lkotlin/r2;",
        "onValueChange",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "enabled",
        "readOnly",
        "Landroidx/compose/foundation/text2/input/InputTransformation;",
        "inputTransformation",
        "Landroidx/compose/ui/text/TextStyle;",
        "textStyle",
        "Landroidx/compose/foundation/text/KeyboardOptions;",
        "keyboardOptions",
        "Landroidx/compose/foundation/text/KeyboardActions;",
        "keyboardActions",
        "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;",
        "lineLimits",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/unit/Density;",
        "Lkotlin/Function0;",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "Lkotlin/v0;",
        "name",
        "getResult",
        "Lkotlin/u;",
        "onTextLayout",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "Landroidx/compose/ui/graphics/Brush;",
        "cursorBrush",
        "Landroidx/compose/foundation/text2/input/CodepointTransformation;",
        "codepointTransformation",
        "Landroidx/compose/foundation/text2/TextFieldDecorator;",
        "decorator",
        "Landroidx/compose/foundation/ScrollState;",
        "scrollState",
        "BasicTextField2",
        "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lv3/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V",
        "Landroidx/compose/foundation/text2/input/TextFieldState;",
        "state",
        "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lv3/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V",
        "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
        "selectionState",
        "TextFieldCursorHandle",
        "(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V",
        "TextFieldSelectionHandles",
        "DefaultTextFieldDecorator",
        "Landroidx/compose/foundation/text2/TextFieldDecorator;",
        "getDefaultTextFieldDecorator$annotations",
        "()V",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "valueWithSelection",
        "foundation_release"
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
        "SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,543:1\n25#2:544\n25#2:551\n25#2:567\n67#2,3:574\n66#2:577\n36#2:585\n36#2:592\n456#2,8:619\n464#2,3:633\n467#2,3:637\n1116#3,6:545\n1116#3,6:552\n1116#3,6:558\n1116#3,6:568\n1116#3,3:578\n1119#3,3:582\n1116#3,6:586\n1116#3,6:593\n1116#3,6:642\n74#4:564\n74#4:565\n74#4:566\n74#4:599\n74#4:600\n74#4:601\n1#5:581\n68#6,6:602\n74#6:636\n78#6:641\n79#7,11:608\n92#7:640\n3737#8,6:627\n81#9:648\n107#9,2:649\n*S KotlinDebug\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt\n*L\n191#1:544\n201#1:551\n342#1:567\n347#1:574,3\n347#1:577\n358#1:585\n360#1:592\n424#1:619,8\n424#1:633,3\n424#1:637,3\n191#1:545,6\n201#1:552,6\n216#1:558,6\n342#1:568,6\n347#1:578,3\n347#1:582,3\n358#1:586,6\n360#1:593,6\n494#1:642,6\n336#1:564\n337#1:565\n338#1:566\n370#1:599\n371#1:600\n372#1:601\n424#1:602,6\n424#1:636\n424#1:641\n424#1:608,11\n424#1:640\n424#1:627,6\n201#1:648\n201#1:649,2\n*E\n"
    }
.end annotation


# static fields
.field private static final DefaultTextFieldDecorator:Landroidx/compose/foundation/text2/TextFieldDecorator;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/foundation/text2/BasicTextField2Kt$DefaultTextFieldDecorator$1;->INSTANCE:Landroidx/compose/foundation/text2/BasicTextField2Kt$DefaultTextFieldDecorator$1;

    sput-object v0, Landroidx/compose/foundation/text2/BasicTextField2Kt;->DefaultTextFieldDecorator:Landroidx/compose/foundation/text2/TextFieldDecorator;

    return-void
.end method

.method public static final BasicTextField2(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lv3/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V
    .locals 33
    .param p0    # Landroidx/compose/foundation/text2/input/TextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/foundation/text2/input/InputTransformation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/foundation/text/KeyboardOptions;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/text/KeyboardActions;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/text2/input/TextFieldLineLimits;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/ui/graphics/Brush;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/foundation/text2/input/CodepointTransformation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/text2/TextFieldDecorator;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p14    # Landroidx/compose/foundation/ScrollState;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p15    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text2/input/TextFieldState;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/foundation/text2/input/InputTransformation;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "-",
            "Lv3/a<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Brush;",
            "Landroidx/compose/foundation/text2/input/CodepointTransformation;",
            "Landroidx/compose/foundation/text2/TextFieldDecorator;",
            "Landroidx/compose/foundation/ScrollState;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v15, p16

    move/from16 v14, p17

    move/from16 v13, p18

    const v0, 0x1a0fdaba

    move-object/from16 v2, p15

    .line 42
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v2

    and-int/lit8 v3, v13, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v15, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v15, 0xe

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v15

    goto :goto_1

    :cond_2
    move v3, v15

    :goto_1
    and-int/lit8 v6, v13, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v15, 0x70

    if-nez v9, :cond_5

    move-object/from16 v9, p1

    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v3, v10

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v9, p1

    :goto_4
    and-int/lit8 v10, v13, 0x4

    if-eqz v10, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v4, v15, 0x380

    if-nez v4, :cond_8

    move/from16 v4, p2

    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_5

    :cond_7
    const/16 v16, 0x80

    :goto_5
    or-int v3, v3, v16

    goto :goto_7

    :cond_8
    :goto_6
    move/from16 v4, p2

    :goto_7
    and-int/lit8 v16, v13, 0x8

    const/16 v17, 0x800

    const/16 v18, 0x400

    if-eqz v16, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v5, v15, 0x1c00

    if-nez v5, :cond_b

    move/from16 v5, p3

    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_a

    move/from16 v20, v17

    goto :goto_8

    :cond_a
    move/from16 v20, v18

    :goto_8
    or-int v3, v3, v20

    goto :goto_a

    :cond_b
    :goto_9
    move/from16 v5, p3

    :goto_a
    and-int/lit8 v20, v13, 0x10

    const/16 v21, 0x2000

    const/16 v22, 0x4000

    if-eqz v20, :cond_c

    or-int/lit16 v3, v3, 0x6000

    move-object/from16 v7, p4

    goto :goto_c

    :cond_c
    const v23, 0xe000

    and-int v23, v15, v23

    move-object/from16 v7, p4

    if-nez v23, :cond_e

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_d

    move/from16 v24, v22

    goto :goto_b

    :cond_d
    move/from16 v24, v21

    :goto_b
    or-int v3, v3, v24

    :cond_e
    :goto_c
    and-int/lit8 v24, v13, 0x20

    if-eqz v24, :cond_f

    const/high16 v25, 0x30000

    or-int v3, v3, v25

    move-object/from16 v8, p5

    goto :goto_e

    :cond_f
    const/high16 v25, 0x70000

    and-int v25, v15, v25

    move-object/from16 v8, p5

    if-nez v25, :cond_11

    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v26, 0x10000

    :goto_d
    or-int v3, v3, v26

    :cond_11
    :goto_e
    and-int/lit8 v26, v13, 0x40

    if-eqz v26, :cond_12

    const/high16 v27, 0x180000

    or-int v3, v3, v27

    move-object/from16 v11, p6

    goto :goto_10

    :cond_12
    const/high16 v27, 0x380000

    and-int v27, v15, v27

    move-object/from16 v11, p6

    if-nez v27, :cond_14

    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_13

    const/high16 v28, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v28, 0x80000

    :goto_f
    or-int v3, v3, v28

    :cond_14
    :goto_10
    and-int/lit16 v12, v13, 0x80

    if-eqz v12, :cond_15

    const/high16 v29, 0xc00000

    or-int v3, v3, v29

    move-object/from16 v0, p7

    goto :goto_12

    :cond_15
    const/high16 v29, 0x1c00000

    and-int v29, v15, v29

    move-object/from16 v0, p7

    if-nez v29, :cond_17

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    const/high16 v30, 0x800000

    goto :goto_11

    :cond_16
    const/high16 v30, 0x400000

    :goto_11
    or-int v3, v3, v30

    :cond_17
    :goto_12
    and-int/lit16 v0, v13, 0x100

    if-eqz v0, :cond_18

    const/high16 v30, 0x6000000

    or-int v3, v3, v30

    move-object/from16 v4, p8

    goto :goto_14

    :cond_18
    const/high16 v30, 0xe000000

    and-int v30, v15, v30

    move-object/from16 v4, p8

    if-nez v30, :cond_1a

    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_19

    const/high16 v30, 0x4000000

    goto :goto_13

    :cond_19
    const/high16 v30, 0x2000000

    :goto_13
    or-int v3, v3, v30

    :cond_1a
    :goto_14
    and-int/lit16 v4, v13, 0x200

    if-eqz v4, :cond_1b

    const/high16 v30, 0x30000000

    or-int v3, v3, v30

    move-object/from16 v5, p9

    goto :goto_16

    :cond_1b
    const/high16 v30, 0x70000000

    and-int v30, v15, v30

    move-object/from16 v5, p9

    if-nez v30, :cond_1d

    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1c

    const/high16 v30, 0x20000000

    goto :goto_15

    :cond_1c
    const/high16 v30, 0x10000000

    :goto_15
    or-int v3, v3, v30

    :cond_1d
    :goto_16
    and-int/lit16 v5, v13, 0x400

    if-eqz v5, :cond_1e

    or-int/lit8 v19, v14, 0x6

    move-object/from16 v7, p10

    goto :goto_18

    :cond_1e
    and-int/lit8 v30, v14, 0xe

    move-object/from16 v7, p10

    if-nez v30, :cond_20

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1f

    const/16 v19, 0x4

    goto :goto_17

    :cond_1f
    const/16 v19, 0x2

    :goto_17
    or-int v19, v14, v19

    goto :goto_18

    :cond_20
    move/from16 v19, v14

    :goto_18
    and-int/lit16 v7, v13, 0x800

    if-eqz v7, :cond_21

    or-int/lit8 v19, v19, 0x30

    goto :goto_1a

    :cond_21
    and-int/lit8 v30, v14, 0x70

    move-object/from16 v8, p11

    if-nez v30, :cond_23

    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_22

    const/16 v23, 0x20

    goto :goto_19

    :cond_22
    const/16 v23, 0x10

    :goto_19
    or-int v19, v19, v23

    :cond_23
    :goto_1a
    move/from16 v8, v19

    and-int/lit16 v9, v13, 0x1000

    if-eqz v9, :cond_24

    or-int/lit16 v8, v8, 0x180

    goto :goto_1c

    :cond_24
    and-int/lit16 v11, v14, 0x380

    if-nez v11, :cond_26

    move-object/from16 v11, p12

    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_25

    const/16 v27, 0x100

    goto :goto_1b

    :cond_25
    const/16 v27, 0x80

    :goto_1b
    or-int v8, v8, v27

    goto :goto_1d

    :cond_26
    :goto_1c
    move-object/from16 v11, p12

    :goto_1d
    and-int/lit16 v11, v13, 0x2000

    if-eqz v11, :cond_27

    or-int/lit16 v8, v8, 0xc00

    goto :goto_1f

    :cond_27
    and-int/lit16 v1, v14, 0x1c00

    if-nez v1, :cond_29

    move-object/from16 v1, p13

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_28

    goto :goto_1e

    :cond_28
    move/from16 v17, v18

    :goto_1e
    or-int v8, v8, v17

    goto :goto_20

    :cond_29
    :goto_1f
    move-object/from16 v1, p13

    :goto_20
    const v17, 0xe000

    and-int v17, v14, v17

    if-nez v17, :cond_2c

    and-int/lit16 v1, v13, 0x4000

    if-nez v1, :cond_2a

    move-object/from16 v1, p14

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2b

    move/from16 v21, v22

    goto :goto_21

    :cond_2a
    move-object/from16 v1, p14

    :cond_2b
    :goto_21
    or-int v8, v8, v21

    goto :goto_22

    :cond_2c
    move-object/from16 v1, p14

    :goto_22
    const v17, 0x5b6db6db

    and-int v1, v3, v17

    const v14, 0x12492492

    if-ne v1, v14, :cond_2e

    const v1, 0xb6db

    and-int/2addr v1, v8

    const/16 v14, 0x2492

    if-ne v1, v14, :cond_2e

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_2d

    goto :goto_23

    .line 43
    :cond_2d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v27, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    goto/16 :goto_3c

    .line 44
    :cond_2e
    :goto_23
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, v15, 0x1

    if-eqz v1, :cond_31

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_2f

    goto :goto_24

    .line 45
    :cond_2f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v13, 0x4000

    if-eqz v0, :cond_30

    const v0, -0xe001

    and-int/2addr v8, v0

    :cond_30
    move-object/from16 v1, p1

    move/from16 v6, p2

    move/from16 v10, p3

    move-object/from16 v4, p4

    move-object/from16 v18, p5

    move-object/from16 v19, p6

    move-object/from16 v12, p7

    move-object/from16 v5, p8

    move-object/from16 v7, p9

    move-object/from16 v9, p11

    move-object/from16 v11, p12

    move-object/from16 v14, p13

    move-object/from16 v20, p14

    move v15, v8

    const/4 v0, 0x0

    move-object/from16 v8, p10

    goto/16 :goto_33

    :cond_31
    :goto_24
    if-eqz v6, :cond_32

    .line 46
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_25

    :cond_32
    move-object/from16 v1, p1

    :goto_25
    if-eqz v10, :cond_33

    const/4 v6, 0x1

    goto :goto_26

    :cond_33
    move/from16 v6, p2

    :goto_26
    if-eqz v16, :cond_34

    const/4 v10, 0x0

    goto :goto_27

    :cond_34
    move/from16 v10, p3

    :goto_27
    if-eqz v20, :cond_35

    const/16 v16, 0x0

    goto :goto_28

    :cond_35
    move-object/from16 v16, p4

    :goto_28
    if-eqz v24, :cond_36

    .line 47
    sget-object v18, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v18

    goto :goto_29

    :cond_36
    move-object/from16 v18, p5

    :goto_29
    if-eqz v26, :cond_37

    .line 48
    sget-object v19, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v19

    goto :goto_2a

    :cond_37
    move-object/from16 v19, p6

    :goto_2a
    if-eqz v12, :cond_38

    .line 49
    sget-object v12, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    invoke-virtual {v12}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    move-result-object v12

    goto :goto_2b

    :cond_38
    move-object/from16 v12, p7

    :goto_2b
    if-eqz v0, :cond_39

    .line 50
    sget-object v0, Landroidx/compose/foundation/text2/input/TextFieldLineLimits;->Companion:Landroidx/compose/foundation/text2/input/TextFieldLineLimits$Companion;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/TextFieldLineLimits$Companion;->getDefault()Landroidx/compose/foundation/text2/input/TextFieldLineLimits;

    move-result-object v0

    goto :goto_2c

    :cond_39
    move-object/from16 v0, p8

    :goto_2c
    if-eqz v4, :cond_3a

    const/4 v4, 0x0

    goto :goto_2d

    :cond_3a
    move-object/from16 v4, p9

    :goto_2d
    if-eqz v5, :cond_3b

    const/4 v5, 0x0

    goto :goto_2e

    :cond_3b
    move-object/from16 v5, p10

    :goto_2e
    if-eqz v7, :cond_3c

    .line 51
    new-instance v7, Landroidx/compose/ui/graphics/SolidColor;

    sget-object v20, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v14

    move-object/from16 p1, v0

    const/4 v0, 0x0

    invoke-direct {v7, v14, v15, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/w;)V

    goto :goto_2f

    :cond_3c
    move-object/from16 p1, v0

    const/4 v0, 0x0

    move-object/from16 v7, p11

    :goto_2f
    if-eqz v9, :cond_3d

    move-object v9, v0

    goto :goto_30

    :cond_3d
    move-object/from16 v9, p12

    :goto_30
    if-eqz v11, :cond_3e

    move-object v11, v0

    goto :goto_31

    :cond_3e
    move-object/from16 v11, p13

    :goto_31
    and-int/lit16 v14, v13, 0x4000

    if-eqz v14, :cond_3f

    const/4 v14, 0x0

    const/4 v15, 0x1

    .line 52
    invoke-static {v14, v2, v14, v15}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    move-result-object v20

    const v14, -0xe001

    and-int/2addr v8, v14

    goto :goto_32

    :cond_3f
    move-object/from16 v20, p14

    :goto_32
    move v15, v8

    move-object v14, v11

    move-object v8, v5

    move-object v11, v9

    move-object/from16 v5, p1

    move-object v9, v7

    move-object v7, v4

    move-object/from16 v4, v16

    :goto_33
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v16

    if-eqz v16, :cond_40

    const-string v0, "androidx.compose.foundation.text2.BasicTextField2 (BasicTextField2.kt:334)"

    const v13, 0x1a0fdaba

    .line 53
    invoke-static {v13, v3, v15, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 54
    :cond_40
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 55
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    .line 56
    check-cast v0, Landroidx/compose/ui/unit/Density;

    .line 57
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    .line 58
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    .line 59
    check-cast v3, Landroidx/compose/ui/unit/LayoutDirection;

    .line 60
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalWindowInfo()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v13

    .line 61
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v13

    .line 62
    check-cast v13, Landroidx/compose/ui/platform/WindowInfo;

    .line 63
    sget-object v15, Landroidx/compose/foundation/text2/input/TextFieldLineLimits$SingleLine;->INSTANCE:Landroidx/compose/foundation/text2/input/TextFieldLineLimits$SingleLine;

    invoke-static {v5, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    move-object/from16 v16, v7

    const v7, -0x39145394

    .line 64
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-nez v8, :cond_42

    const v7, -0x1d58f75c

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 65
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    .line 66
    sget-object v22, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v23, v8

    invoke-virtual/range {v22 .. v22}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_41

    .line 67
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v7

    .line 68
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 69
    :cond_41
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v7, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    goto :goto_34

    :cond_42
    move-object/from16 v23, v8

    move-object/from16 v7, v23

    .line 70
    :goto_34
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    if-eqz v15, :cond_43

    .line 71
    sget-object v8, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_35

    :cond_43
    sget-object v8, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    :goto_35
    move-object/from16 v22, v9

    const/4 v9, 0x0

    .line 72
    invoke-static {v7, v2, v9}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v24

    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    .line 73
    invoke-interface {v13}, Landroidx/compose/ui/platform/WindowInfo;->isWindowFocused()Z

    move-result v13

    move-object/from16 v24, v5

    const v5, 0x607fb4c4

    .line 74
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    move-object/from16 v5, p0

    .line 75
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    .line 76
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    or-int v25, v25, v26

    .line 77
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    or-int v25, v25, v26

    move-object/from16 v26, v14

    .line 78
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    if-nez v25, :cond_44

    .line 79
    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p11, v3

    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v14, v3, :cond_47

    goto :goto_36

    :cond_44
    move-object/from16 p11, v3

    :goto_36
    if-nez v11, :cond_46

    .line 80
    sget-object v3, Landroidx/compose/foundation/text2/input/SingleLineCodepointTransformation;->INSTANCE:Landroidx/compose/foundation/text2/input/SingleLineCodepointTransformation;

    if-eqz v15, :cond_45

    move-object v14, v3

    goto :goto_37

    :cond_45
    const/4 v14, 0x0

    goto :goto_37

    :cond_46
    move-object v14, v11

    .line 81
    :goto_37
    new-instance v3, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    invoke-direct {v3, v5, v4, v14}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;-><init>(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/foundation/text2/input/CodepointTransformation;)V

    .line 82
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v14, v3

    .line 83
    :cond_47
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 84
    move-object v3, v14

    check-cast v3, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    const v14, 0x44faf204

    .line 85
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 86
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    .line 87
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v14, :cond_48

    .line 88
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v5, v14, :cond_49

    .line 89
    :cond_48
    new-instance v5, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    invoke-direct {v5}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;-><init>()V

    .line 90
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 91
    :cond_49
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 92
    check-cast v5, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    const v14, 0x44faf204

    .line 93
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 94
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    move-object/from16 v25, v11

    .line 95
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    if-nez v14, :cond_4a

    .line 96
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v11, v14, :cond_4c

    .line 97
    :cond_4a
    new-instance v11, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    if-eqz v9, :cond_4b

    if-eqz v13, :cond_4b

    const/4 v14, 0x1

    goto :goto_38

    :cond_4b
    const/4 v14, 0x0

    :goto_38
    move-object/from16 p1, v11

    move-object/from16 p2, v3

    move-object/from16 p3, v5

    move-object/from16 p4, v0

    move/from16 p5, v6

    move/from16 p6, v10

    move/from16 p7, v14

    invoke-direct/range {p1 .. p7}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZ)V

    .line 98
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 99
    :cond_4c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 100
    check-cast v11, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 101
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalHapticFeedback()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v14

    .line 102
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v14

    .line 103
    check-cast v14, Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    move/from16 p12, v13

    .line 104
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalClipboardManager()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v13

    .line 105
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v13

    .line 106
    check-cast v13, Landroidx/compose/ui/platform/ClipboardManager;

    move/from16 p13, v9

    .line 107
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalTextToolbar()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v9

    .line 108
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v9

    .line 109
    check-cast v9, Landroidx/compose/ui/platform/TextToolbar;

    move-object/from16 v27, v8

    .line 110
    new-instance v8, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$3;

    move-object/from16 p1, v8

    move-object/from16 p2, v11

    move-object/from16 p3, v14

    move-object/from16 p4, v13

    move-object/from16 p5, v9

    move-object/from16 p6, v0

    move/from16 p7, v6

    move/from16 p8, v10

    invoke-direct/range {p1 .. p8}, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$3;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/ui/platform/ClipboardManager;Landroidx/compose/ui/platform/TextToolbar;Landroidx/compose/ui/unit/Density;ZZ)V

    const/4 v0, 0x0

    invoke-static {v8, v2, v0}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lv3/a;Landroidx/compose/runtime/Composer;I)V

    .line 111
    new-instance v0, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$4;

    invoke-direct {v0, v11}, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$4;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    const/16 v8, 0x8

    invoke-static {v11, v0, v2, v8}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lv3/l;Landroidx/compose/runtime/Composer;I)V

    .line 112
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifier;

    move-object/from16 p1, v0

    move-object/from16 p2, v3

    move-object/from16 p3, v5

    move-object/from16 p4, v11

    move-object/from16 p5, v4

    move/from16 p6, v6

    move/from16 p7, v10

    move-object/from16 p8, v19

    move-object/from16 p9, v12

    move/from16 p10, v15

    invoke-direct/range {p1 .. p10}, Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifier;-><init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Z)V

    .line 113
    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 114
    invoke-static {v0, v6, v7}, Landroidx/compose/foundation/FocusableKt;->focusable(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v6, :cond_4d

    .line 115
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/ScrollState;->getMaxValue()I

    move-result v8

    if-lez v8, :cond_4d

    .line 116
    invoke-virtual {v11}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getDraggingHandle()Landroidx/compose/foundation/text/Handle;

    move-result-object v8

    if-nez v8, :cond_4d

    const/4 v8, 0x1

    goto :goto_39

    :cond_4d
    const/4 v8, 0x0

    .line 117
    :goto_39
    sget-object v9, Landroidx/compose/foundation/gestures/ScrollableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/ScrollableDefaults;

    move-object/from16 v13, p11

    move-object/from16 v14, v27

    move-object/from16 v27, v1

    const/4 v1, 0x0

    invoke-virtual {v9, v13, v14, v1}, Landroidx/compose/foundation/gestures/ScrollableDefaults;->reverseDirection(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;Z)Z

    move-result v9

    const/4 v1, 0x0

    const/16 v13, 0x10

    const/16 v28, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v20

    move-object/from16 p3, v14

    move/from16 p4, v8

    move/from16 p5, v9

    move-object/from16 p6, v1

    move-object/from16 p7, v7

    move/from16 p8, v13

    move-object/from16 p9, v28

    .line 118
    invoke-static/range {p1 .. p9}, Landroidx/compose/foundation/gestures/ScrollableKt;->scrollable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v1, 0x2bb5b5d7

    .line 119
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 120
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v1

    const/16 v7, 0x30

    const/4 v8, 0x1

    .line 121
    invoke-static {v1, v8, v2, v7}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    const v7, -0x4ee9b9da

    .line 122
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const/4 v7, 0x0

    .line 123
    invoke-static {v2, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v8

    .line 124
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v7

    .line 125
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    move-result-object v13

    .line 126
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    move-result-object v0

    move-object/from16 v28, v4

    .line 127
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v4

    instance-of v4, v4, Landroidx/compose/runtime/Applier;

    if-nez v4, :cond_4e

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 128
    :cond_4e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 129
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v4

    if-eqz v4, :cond_4f

    .line 130
    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    goto :goto_3a

    .line 131
    :cond_4f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 132
    :goto_3a
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v4

    .line 133
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    move-result-object v13

    invoke-static {v4, v1, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 134
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    move-result-object v1

    invoke-static {v4, v7, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 135
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    move-result-object v1

    .line 136
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-nez v7, :cond_50

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_51

    .line 137
    :cond_50
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 138
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v4, v7, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 139
    :cond_51
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v1, v2, v4}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    .line 140
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 141
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    if-nez v26, :cond_52

    .line 142
    sget-object v0, Landroidx/compose/foundation/text2/BasicTextField2Kt;->DefaultTextFieldDecorator:Landroidx/compose/foundation/text2/TextFieldDecorator;

    goto :goto_3b

    :cond_52
    move-object/from16 v0, v26

    .line 143
    :goto_3b
    new-instance v1, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$5$1;

    move-object/from16 p1, v1

    move-object/from16 p2, v24

    move-object/from16 p3, v5

    move-object/from16 p4, v18

    move/from16 p5, p13

    move/from16 p6, p12

    move-object/from16 p7, v3

    move-object/from16 p8, v11

    move-object/from16 p9, v22

    move/from16 p10, v6

    move/from16 p11, v10

    move-object/from16 p12, v20

    move-object/from16 p13, v14

    move/from16 p14, v15

    move-object/from16 p15, v16

    invoke-direct/range {p1 .. p15}, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$5$1;-><init>(Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/ui/text/TextStyle;ZZLandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;ZLv3/p;)V

    const v3, 0x57fd8a17

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    const/4 v3, 0x6

    invoke-interface {v0, v1, v2, v3}, Landroidx/compose/foundation/text2/TextFieldDecorator;->Decoration(Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 144
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 145
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 146
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 147
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 148
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_53

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_53
    move v3, v6

    move v4, v10

    move-object v8, v12

    move-object/from16 v10, v16

    move-object/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v15, v20

    move-object/from16 v12, v22

    move-object/from16 v11, v23

    move-object/from16 v9, v24

    move-object/from16 v13, v25

    move-object/from16 v14, v26

    move-object/from16 v5, v28

    .line 149
    :goto_3c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-eqz v2, :cond_54

    new-instance v1, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$6;

    move-object v0, v1

    move-object/from16 v31, v1

    move-object/from16 v1, p0

    move-object/from16 v32, v2

    move-object/from16 v2, v27

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    invoke-direct/range {v0 .. v18}, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$6;-><init>(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lv3/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;III)V

    move-object/from16 v1, v31

    move-object/from16 v0, v32

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_54
    return-void
.end method

.method public static final BasicTextField2(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lv3/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V
    .locals 40
    .param p0    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/foundation/text2/input/InputTransformation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/text/KeyboardOptions;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/text/KeyboardActions;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Landroidx/compose/foundation/text2/input/TextFieldLineLimits;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/ui/graphics/Brush;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/text2/input/CodepointTransformation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p14    # Landroidx/compose/foundation/text2/TextFieldDecorator;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p15    # Landroidx/compose/foundation/ScrollState;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p16    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lv3/l<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/foundation/text2/input/InputTransformation;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "Landroidx/compose/foundation/text2/input/TextFieldLineLimits;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "-",
            "Lv3/a<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Brush;",
            "Landroidx/compose/foundation/text2/input/CodepointTransformation;",
            "Landroidx/compose/foundation/text2/TextFieldDecorator;",
            "Landroidx/compose/foundation/ScrollState;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v15, p17

    move/from16 v14, p18

    move/from16 v13, p19

    const v0, -0x2f82a4ec

    move-object/from16 v3, p16

    .line 1
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    and-int/lit8 v4, v13, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v15, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v15, 0xe

    if-nez v4, :cond_2

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    move v4, v15

    :goto_1
    and-int/lit8 v7, v13, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v15, 0x70

    if-nez v7, :cond_5

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v13, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v12, v15, 0x380

    if-nez v12, :cond_8

    move-object/from16 v12, p2

    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v4, v4, v16

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v12, p2

    :goto_6
    and-int/lit8 v16, v13, 0x8

    const/16 v17, 0x800

    const/16 v18, 0x400

    if-eqz v16, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v5, v15, 0x1c00

    if-nez v5, :cond_b

    move/from16 v5, p3

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v19, v17

    goto :goto_7

    :cond_a
    move/from16 v19, v18

    :goto_7
    or-int v4, v4, v19

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v5, p3

    :goto_9
    and-int/lit8 v19, v13, 0x10

    const/16 v20, 0x4000

    const/16 v21, 0x2000

    const v22, 0xe000

    if-eqz v19, :cond_c

    or-int/lit16 v4, v4, 0x6000

    move/from16 v8, p4

    goto :goto_b

    :cond_c
    and-int v23, v15, v22

    move/from16 v8, p4

    if-nez v23, :cond_e

    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v24

    if-eqz v24, :cond_d

    move/from16 v24, v20

    goto :goto_a

    :cond_d
    move/from16 v24, v21

    :goto_a
    or-int v4, v4, v24

    :cond_e
    :goto_b
    and-int/lit8 v24, v13, 0x20

    const/high16 v25, 0x70000

    if-eqz v24, :cond_f

    const/high16 v26, 0x30000

    or-int v4, v4, v26

    move-object/from16 v9, p5

    goto :goto_d

    :cond_f
    and-int v26, v15, v25

    move-object/from16 v9, p5

    if-nez v26, :cond_11

    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_10

    const/high16 v27, 0x20000

    goto :goto_c

    :cond_10
    const/high16 v27, 0x10000

    :goto_c
    or-int v4, v4, v27

    :cond_11
    :goto_d
    and-int/lit8 v27, v13, 0x40

    if-eqz v27, :cond_12

    const/high16 v28, 0x180000

    or-int v4, v4, v28

    move-object/from16 v10, p6

    goto :goto_f

    :cond_12
    const/high16 v28, 0x380000

    and-int v28, v15, v28

    move-object/from16 v10, p6

    if-nez v28, :cond_14

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_13

    const/high16 v29, 0x100000

    goto :goto_e

    :cond_13
    const/high16 v29, 0x80000

    :goto_e
    or-int v4, v4, v29

    :cond_14
    :goto_f
    and-int/lit16 v11, v13, 0x80

    if-eqz v11, :cond_15

    const/high16 v30, 0xc00000

    or-int v4, v4, v30

    move-object/from16 v6, p7

    goto :goto_11

    :cond_15
    const/high16 v30, 0x1c00000

    and-int v30, v15, v30

    move-object/from16 v6, p7

    if-nez v30, :cond_17

    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_16

    const/high16 v31, 0x800000

    goto :goto_10

    :cond_16
    const/high16 v31, 0x400000

    :goto_10
    or-int v4, v4, v31

    :cond_17
    :goto_11
    and-int/lit16 v0, v13, 0x100

    if-eqz v0, :cond_18

    const/high16 v32, 0x6000000

    or-int v4, v4, v32

    move-object/from16 v5, p8

    goto :goto_13

    :cond_18
    const/high16 v32, 0xe000000

    and-int v32, v15, v32

    move-object/from16 v5, p8

    if-nez v32, :cond_1a

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_19

    const/high16 v32, 0x4000000

    goto :goto_12

    :cond_19
    const/high16 v32, 0x2000000

    :goto_12
    or-int v4, v4, v32

    :cond_1a
    :goto_13
    and-int/lit16 v5, v13, 0x200

    if-eqz v5, :cond_1b

    const/high16 v32, 0x30000000

    or-int v4, v4, v32

    move-object/from16 v6, p9

    goto :goto_15

    :cond_1b
    const/high16 v32, 0x70000000

    and-int v32, v15, v32

    move-object/from16 v6, p9

    if-nez v32, :cond_1d

    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_1c

    const/high16 v32, 0x20000000

    goto :goto_14

    :cond_1c
    const/high16 v32, 0x10000000

    :goto_14
    or-int v4, v4, v32

    :cond_1d
    :goto_15
    and-int/lit16 v6, v13, 0x400

    if-eqz v6, :cond_1e

    or-int/lit8 v32, v14, 0x6

    move-object/from16 v8, p10

    goto :goto_17

    :cond_1e
    and-int/lit8 v32, v14, 0xe

    move-object/from16 v8, p10

    if-nez v32, :cond_20

    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_1f

    const/16 v32, 0x4

    goto :goto_16

    :cond_1f
    const/16 v32, 0x2

    :goto_16
    or-int v32, v14, v32

    goto :goto_17

    :cond_20
    move/from16 v32, v14

    :goto_17
    and-int/lit16 v8, v13, 0x800

    if-eqz v8, :cond_21

    or-int/lit8 v32, v32, 0x30

    goto :goto_19

    :cond_21
    and-int/lit8 v33, v14, 0x70

    move-object/from16 v9, p11

    if-nez v33, :cond_23

    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_22

    const/16 v23, 0x20

    goto :goto_18

    :cond_22
    const/16 v23, 0x10

    :goto_18
    or-int v32, v32, v23

    :cond_23
    :goto_19
    move/from16 v9, v32

    and-int/lit16 v10, v13, 0x1000

    if-eqz v10, :cond_24

    or-int/lit16 v9, v9, 0x180

    goto :goto_1b

    :cond_24
    and-int/lit16 v12, v14, 0x380

    if-nez v12, :cond_26

    move-object/from16 v12, p12

    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_25

    const/16 v28, 0x100

    goto :goto_1a

    :cond_25
    const/16 v28, 0x80

    :goto_1a
    or-int v9, v9, v28

    goto :goto_1c

    :cond_26
    :goto_1b
    move-object/from16 v12, p12

    :goto_1c
    and-int/lit16 v12, v13, 0x2000

    if-eqz v12, :cond_27

    or-int/lit16 v9, v9, 0xc00

    goto :goto_1e

    :cond_27
    and-int/lit16 v2, v14, 0x1c00

    if-nez v2, :cond_29

    move-object/from16 v2, p13

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_28

    goto :goto_1d

    :cond_28
    move/from16 v17, v18

    :goto_1d
    or-int v9, v9, v17

    goto :goto_1f

    :cond_29
    :goto_1e
    move-object/from16 v2, p13

    :goto_1f
    and-int/lit16 v2, v13, 0x4000

    if-eqz v2, :cond_2a

    or-int/lit16 v9, v9, 0x6000

    move-object/from16 v1, p14

    goto :goto_21

    :cond_2a
    and-int v17, v14, v22

    move-object/from16 v1, p14

    if-nez v17, :cond_2c

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2b

    goto :goto_20

    :cond_2b
    move/from16 v20, v21

    :goto_20
    or-int v9, v9, v20

    :cond_2c
    :goto_21
    and-int v17, v14, v25

    const v18, 0x8000

    if-nez v17, :cond_2e

    and-int v17, v13, v18

    move-object/from16 v1, p15

    if-nez v17, :cond_2d

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2d

    const/high16 v17, 0x20000

    goto :goto_22

    :cond_2d
    const/high16 v17, 0x10000

    :goto_22
    or-int v9, v9, v17

    goto :goto_23

    :cond_2e
    move-object/from16 v1, p15

    :goto_23
    const v17, 0x5b6db6db

    and-int v1, v4, v17

    const v14, 0x12492492

    if-ne v1, v14, :cond_30

    const v1, 0x5b6db

    and-int/2addr v1, v9

    const v14, 0x12492

    if-ne v1, v14, :cond_30

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_2f

    goto :goto_24

    .line 2
    :cond_2f
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v12, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v11, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v35, p13

    move-object/from16 v36, p14

    move-object/from16 v16, p15

    goto/16 :goto_35

    .line 3
    :cond_30
    :goto_24
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, v15, 0x1

    const/4 v14, 0x0

    if-eqz v1, :cond_33

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_31

    goto :goto_25

    .line 4
    :cond_31
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int v0, v13, v18

    if-eqz v0, :cond_32

    const v0, -0x70001

    and-int/2addr v9, v0

    :cond_32
    move-object/from16 v1, p2

    move/from16 v0, p3

    move/from16 v2, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v11, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v10, p11

    move-object/from16 v12, p12

    move-object/from16 v35, p13

    move-object/from16 v36, p14

    move-object/from16 v37, p15

    move v14, v9

    move-object/from16 v9, p10

    goto/16 :goto_33

    :cond_33
    :goto_25
    if-eqz v7, :cond_34

    .line 5
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_26

    :cond_34
    move-object/from16 v1, p2

    :goto_26
    if-eqz v16, :cond_35

    const/16 v16, 0x1

    goto :goto_27

    :cond_35
    move/from16 v16, p3

    :goto_27
    if-eqz v19, :cond_36

    const/16 v17, 0x0

    goto :goto_28

    :cond_36
    move/from16 v17, p4

    :goto_28
    if-eqz v24, :cond_37

    move-object/from16 v19, v14

    goto :goto_29

    :cond_37
    move-object/from16 v19, p5

    :goto_29
    if-eqz v27, :cond_38

    .line 6
    sget-object v20, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v20

    goto :goto_2a

    :cond_38
    move-object/from16 v20, p6

    :goto_2a
    if-eqz v11, :cond_39

    .line 7
    sget-object v11, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v11}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v11

    goto :goto_2b

    :cond_39
    move-object/from16 v11, p7

    :goto_2b
    if-eqz v0, :cond_3a

    .line 8
    sget-object v0, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    move-result-object v0

    goto :goto_2c

    :cond_3a
    move-object/from16 v0, p8

    :goto_2c
    if-eqz v5, :cond_3b

    .line 9
    sget-object v5, Landroidx/compose/foundation/text2/input/TextFieldLineLimits;->Companion:Landroidx/compose/foundation/text2/input/TextFieldLineLimits$Companion;

    invoke-virtual {v5}, Landroidx/compose/foundation/text2/input/TextFieldLineLimits$Companion;->getDefault()Landroidx/compose/foundation/text2/input/TextFieldLineLimits;

    move-result-object v5

    goto :goto_2d

    :cond_3b
    move-object/from16 v5, p9

    :goto_2d
    if-eqz v6, :cond_3c

    move-object v6, v14

    goto :goto_2e

    :cond_3c
    move-object/from16 v6, p10

    :goto_2e
    if-eqz v8, :cond_3d

    move-object v8, v14

    goto :goto_2f

    :cond_3d
    move-object/from16 v8, p11

    :goto_2f
    if-eqz v10, :cond_3e

    .line 10
    new-instance v10, Landroidx/compose/ui/graphics/SolidColor;

    sget-object v21, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move-object/from16 p3, v8

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v7

    invoke-direct {v10, v7, v8, v14}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/w;)V

    goto :goto_30

    :cond_3e
    move-object/from16 p3, v8

    move-object/from16 v10, p12

    :goto_30
    if-eqz v12, :cond_3f

    move-object v7, v14

    goto :goto_31

    :cond_3f
    move-object/from16 v7, p13

    :goto_31
    if-eqz v2, :cond_40

    move-object v2, v14

    goto :goto_32

    :cond_40
    move-object/from16 v2, p14

    :goto_32
    and-int v8, v13, v18

    if-eqz v8, :cond_41

    const/4 v8, 0x0

    const/4 v12, 0x1

    .line 11
    invoke-static {v8, v3, v8, v12}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    move-result-object v12

    const v8, -0x70001

    and-int/2addr v9, v8

    move-object/from16 v36, v2

    move-object v8, v5

    move-object/from16 v35, v7

    move v14, v9

    move-object/from16 v37, v12

    move/from16 v2, v17

    move-object/from16 v5, v19

    move-object v7, v0

    move-object v9, v6

    move-object v12, v10

    move/from16 v0, v16

    move-object/from16 v6, v20

    move-object/from16 v10, p3

    goto :goto_33

    :cond_41
    move-object/from16 v37, p15

    move-object/from16 v36, v2

    move-object v8, v5

    move-object/from16 v35, v7

    move v14, v9

    move-object v12, v10

    move/from16 v2, v17

    move-object/from16 v5, v19

    move-object/from16 v10, p3

    move-object v7, v0

    move-object v9, v6

    move/from16 v0, v16

    move-object/from16 v6, v20

    :goto_33
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v17

    if-eqz v17, :cond_42

    const-string v13, "androidx.compose.foundation.text2.BasicTextField2 (BasicTextField2.kt:189)"

    const v15, -0x2f82a4ec

    .line 12
    invoke-static {v15, v4, v14, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_42
    const v13, -0x1d58f75c

    .line 13
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 14
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .line 15
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p9, v12

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v13, v12, :cond_43

    .line 16
    new-instance v13, Landroidx/compose/foundation/text2/input/TextFieldState;

    .line 17
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v12

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    invoke-static {v12}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v9

    move-object/from16 v12, p0

    move-object/from16 p12, v8

    const/4 v8, 0x0

    .line 18
    invoke-direct {v13, v12, v9, v10, v8}, Landroidx/compose/foundation/text2/input/TextFieldState;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/w;)V

    .line 19
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    goto :goto_34

    :cond_43
    move-object/from16 v12, p0

    move-object/from16 p12, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    .line 20
    :goto_34
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 21
    move-object v8, v13

    check-cast v8, Landroidx/compose/foundation/text2/input/TextFieldState;

    const v9, -0x1d58f75c

    .line 22
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 23
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    .line 24
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_44

    .line 25
    new-instance v9, Landroidx/compose/ui/text/input/TextFieldValue;

    .line 26
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v10

    invoke-static {v10}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v17

    const/4 v10, 0x0

    const/4 v13, 0x4

    const/16 v19, 0x0

    move-object/from16 p2, v9

    move-object/from16 p3, p0

    move-wide/from16 p4, v17

    move-object/from16 p6, v10

    move/from16 p7, v13

    move-object/from16 p8, v19

    .line 27
    invoke-direct/range {p2 .. p8}, Landroidx/compose/ui/text/input/TextFieldValue;-><init>(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILkotlin/jvm/internal/w;)V

    const/4 v10, 0x2

    const/4 v13, 0x0

    .line 28
    invoke-static {v9, v13, v10, v13}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v9

    .line 29
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 30
    :cond_44
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 31
    check-cast v9, Landroidx/compose/runtime/MutableState;

    .line 32
    invoke-static {v9}, Landroidx/compose/foundation/text2/BasicTextField2Kt;->BasicTextField2$lambda$2(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v10

    const-wide/16 v16, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x6

    const/16 v19, 0x0

    move-object/from16 p2, v10

    move-object/from16 p3, p0

    move-wide/from16 p4, v16

    move-object/from16 p6, v13

    move/from16 p7, v18

    move-object/from16 p8, v19

    invoke-static/range {p2 .. p8}, Landroidx/compose/ui/text/input/TextFieldValue;->copy-3r_uNRQ$default(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILjava/lang/Object;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v10

    invoke-static {v9, v10}, Landroidx/compose/foundation/text2/BasicTextField2Kt;->BasicTextField2$lambda$3(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V

    .line 33
    invoke-static {v9}, Landroidx/compose/foundation/text2/BasicTextField2Kt;->BasicTextField2$lambda$2(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object v10

    const v13, 0x4ce9f662    # 1.22663696E8f

    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    move-object/from16 v12, p1

    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    or-int v13, v13, v16

    move-object/from16 p2, v7

    .line 34
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v13, :cond_45

    .line 35
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v13

    if-ne v7, v13, :cond_46

    .line 36
    :cond_45
    new-instance v7, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$1$1;

    invoke-direct {v7, v12, v9}, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$1$1;-><init>(Lv3/l;Landroidx/compose/runtime/MutableState;)V

    .line 37
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 38
    :cond_46
    check-cast v7, Lv3/l;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const/4 v9, 0x0

    .line 39
    invoke-static {v1, v8, v10, v7, v9}, Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierKt;->syncTextFieldState(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Z)Landroidx/compose/ui/Modifier;

    move-result-object v17

    shr-int/lit8 v4, v4, 0x3

    and-int/lit16 v7, v4, 0x380

    or-int/lit8 v7, v7, 0x6

    and-int/lit16 v9, v4, 0x1c00

    or-int/2addr v7, v9

    and-int v9, v4, v22

    or-int/2addr v7, v9

    and-int v9, v4, v25

    or-int/2addr v7, v9

    const/high16 v9, 0x380000

    and-int/2addr v9, v4

    or-int/2addr v7, v9

    const/high16 v9, 0x1c00000

    and-int/2addr v9, v4

    or-int/2addr v7, v9

    const/high16 v9, 0xe000000

    and-int/2addr v4, v9

    or-int/2addr v4, v7

    shl-int/lit8 v7, v14, 0x1b

    const/high16 v9, 0x70000000

    and-int/2addr v7, v9

    or-int v32, v4, v7

    shr-int/lit8 v4, v14, 0x3

    and-int/lit8 v7, v4, 0xe

    and-int/lit8 v9, v4, 0x70

    or-int/2addr v7, v9

    and-int/lit16 v9, v4, 0x380

    or-int/2addr v7, v9

    and-int/lit16 v9, v4, 0x1c00

    or-int/2addr v7, v9

    and-int v4, v4, v22

    or-int v33, v7, v4

    const/16 v34, 0x0

    move-object/from16 v16, v8

    move/from16 v18, v0

    move/from16 v19, v2

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move-object/from16 v22, v11

    move-object/from16 v23, p2

    move-object/from16 v24, p12

    move-object/from16 v25, p10

    move-object/from16 v26, p11

    move-object/from16 v27, p9

    move-object/from16 v28, v35

    move-object/from16 v29, v36

    move-object/from16 v30, v37

    move-object/from16 v31, v3

    .line 40
    invoke-static/range {v16 .. v34}, Landroidx/compose/foundation/text2/BasicTextField2Kt;->BasicTextField2(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lv3/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_47

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_47
    move-object/from16 v9, p2

    move-object/from16 v15, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v10, p12

    move-object v4, v1

    move-object v7, v5

    move-object v8, v6

    move-object/from16 v16, v37

    move v5, v0

    move v6, v2

    .line 41
    :goto_35
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v3

    if-eqz v3, :cond_48

    new-instance v2, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$2;

    move-object v0, v2

    move-object/from16 v1, p0

    move-object/from16 v38, v2

    move-object/from16 v2, p1

    move-object v12, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v11

    move-object v11, v13

    move-object v13, v12

    move-object v12, v14

    move-object v14, v13

    move-object v13, v15

    move-object v15, v14

    move-object/from16 v14, v35

    move-object/from16 v39, v15

    move-object/from16 v15, v36

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    invoke-direct/range {v0 .. v19}, Landroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$2;-><init>(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text2/input/TextFieldLineLimits;Lv3/p;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text2/input/CodepointTransformation;Landroidx/compose/foundation/text2/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;III)V

    move-object/from16 v1, v38

    move-object/from16 v0, v39

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_48
    return-void
.end method

.method private static final BasicTextField2$lambda$2(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;)",
            "Landroidx/compose/ui/text/input/TextFieldValue;"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/text/input/TextFieldValue;

    return-object p0
.end method

.method private static final BasicTextField2$lambda$3(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ">;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final TextFieldCursorHandle(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V
    .locals 7
    .param p0    # Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    const v0, 0x2e1e8f07

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    const-string v2, "androidx.compose.foundation.text2.TextFieldCursorHandle (BasicTextField2.kt:487)"

    .line 16
    .line 17
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getCursorHandle()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->getVisible()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->getPosition-F1C5BW0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 35
    .line 36
    const v4, 0x4cea2cce

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-nez v4, :cond_1

    .line 51
    .line 52
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 53
    .line 54
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    if-ne v5, v4, :cond_2

    .line 59
    .line 60
    :cond_1
    new-instance v5, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldCursorHandle$1$1;

    .line 61
    .line 62
    invoke-direct {v5, v0}, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldCursorHandle$1$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    check-cast v5, Lv3/l;

    .line 69
    .line 70
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x1

    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v6, 0x0

    .line 76
    invoke-static {v3, v4, v5, v0, v6}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v3, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldCursorHandle$2;

    .line 81
    .line 82
    invoke-direct {v3, p0, v6}, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldCursorHandle$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v0, p0, v3}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lv3/p;)Landroidx/compose/ui/Modifier;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    const/4 v4, 0x0

    .line 90
    const/16 v6, 0x180

    .line 91
    .line 92
    move-object v5, p1

    .line 93
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/text/AndroidCursorHandle_androidKt;->CursorHandle-ULxng0E(JLandroidx/compose/ui/Modifier;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 103
    .line 104
    .line 105
    :cond_4
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    new-instance v0, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldCursorHandle$3;

    .line 112
    .line 113
    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldCursorHandle$3;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;I)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    return-void
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public static final TextFieldSelectionHandles(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .param p0    # Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    const v0, -0x47348d1a

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    const-string v2, "androidx.compose.foundation.text2.TextFieldSelectionHandles (BasicTextField2.kt:512)"

    .line 16
    .line 17
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getStartSelectionHandle()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v1, -0x56a351be    # -4.9000958E-14f

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->getVisible()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v8, 0x0

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    new-instance v1, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$1;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->getDirection()Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->getHandlesCrossed()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 52
    .line 53
    new-instance v5, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$2;

    .line 54
    .line 55
    invoke-direct {v5, p0, v8}, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p0, v5}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lv3/p;)Landroidx/compose/ui/Modifier;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    const/16 v7, 0x30

    .line 63
    .line 64
    move-object v6, p1

    .line 65
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt;->SelectionHandle(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getEndSelectionHandle()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->getVisible()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    new-instance v1, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$3;

    .line 82
    .line 83
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$3;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 84
    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->getDirection()Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->getHandlesCrossed()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 96
    .line 97
    new-instance v5, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$4;

    .line 98
    .line 99
    invoke-direct {v5, p0, v8}, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$4;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v0, p0, v5}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lv3/p;)Landroidx/compose/ui/Modifier;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const/16 v7, 0x30

    .line 107
    .line 108
    move-object v6, p1

    .line 109
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt;->SelectionHandle(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 110
    .line 111
    .line 112
    :cond_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-eqz p1, :cond_4

    .line 126
    .line 127
    new-instance v0, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$5;

    .line 128
    .line 129
    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$5;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    return-void
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
.end method

.method public static final synthetic access$BasicTextField2$lambda$2(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
    .locals 0

    invoke-static {p0}, Landroidx/compose/foundation/text2/BasicTextField2Kt;->BasicTextField2$lambda$2(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$BasicTextField2$lambda$3(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/foundation/text2/BasicTextField2Kt;->BasicTextField2$lambda$3(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V

    return-void
.end method

.method private static synthetic getDefaultTextFieldDecorator$annotations()V
    .locals 0

    return-void
.end method
