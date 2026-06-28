.class public final Landroidx/compose/material/TextFieldImplKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\u00e1\u0001\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0008\u00062\u0006\u0010\t\u001a\u00020\u00082\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0015\u0008\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0015\u0008\u0002\u0010\u000c\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0015\u0008\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0015\u0008\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u0006H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001aT\u0010&\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2 \u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0008\u0006\u00a2\u0006\u000c\u0008!\u0012\u0008\u0008\"\u0012\u0004\u0008\u0003\u0010\u0000H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008$\u0010%\u001a\u001c\u0010)\u001a\u00020\'*\u00020\'2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0002H\u0000\u001a\u0012\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u0000\u001a\u0012\u0010.\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u0000\"\u0014\u0010/\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008/\u00100\"\u0014\u00101\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00081\u00100\"\u0014\u00102\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00082\u00100\"\u0014\u00103\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00083\u00100\"\u0014\u00104\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00084\u00100\"\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109\"\u0014\u0010:\u001a\u00020,8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008:\u0010;\"\u0014\u0010<\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008<\u0010;\"\u0014\u0010=\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008=\u0010;\"\u001a\u0010?\u001a\u00020>8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010B\"\u001a\u0010C\u001a\u00020>8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008C\u0010@\u001a\u0004\u0008D\u0010B\"\u001a\u0010E\u001a\u00020\'8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010H\"\u001a\u0010M\u001a\u0004\u0018\u00010J*\u00020I8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010L\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006N"
    }
    d2 = {
        "Landroidx/compose/material/TextFieldType;",
        "type",
        "",
        "value",
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "Landroidx/compose/runtime/Composable;",
        "innerTextField",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "visualTransformation",
        "label",
        "placeholder",
        "leadingIcon",
        "trailingIcon",
        "",
        "singleLine",
        "enabled",
        "isError",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "interactionSource",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "contentPadding",
        "Landroidx/compose/material/TextFieldColors;",
        "colors",
        "border",
        "CommonDecorationBox",
        "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lv3/p;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lv3/p;Landroidx/compose/runtime/Composer;III)V",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "Landroidx/compose/ui/text/TextStyle;",
        "typography",
        "",
        "contentAlpha",
        "Landroidx/compose/runtime/ComposableOpenTarget;",
        "index",
        "content",
        "Decoration-euL9pac",
        "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lv3/p;Landroidx/compose/runtime/Composer;II)V",
        "Decoration",
        "Landroidx/compose/ui/Modifier;",
        "defaultErrorMessage",
        "defaultErrorSemantics",
        "Landroidx/compose/ui/layout/Placeable;",
        "placeable",
        "",
        "widthOrZero",
        "heightOrZero",
        "TextFieldId",
        "Ljava/lang/String;",
        "PlaceholderId",
        "LabelId",
        "LeadingId",
        "TrailingId",
        "Landroidx/compose/ui/unit/Constraints;",
        "ZeroConstraints",
        "J",
        "getZeroConstraints",
        "()J",
        "AnimationDuration",
        "I",
        "PlaceholderAnimationDuration",
        "PlaceholderAnimationDelayOrDuration",
        "Landroidx/compose/ui/unit/Dp;",
        "TextFieldPadding",
        "F",
        "getTextFieldPadding",
        "()F",
        "HorizontalIconPadding",
        "getHorizontalIconPadding",
        "IconDefaultSizeModifier",
        "Landroidx/compose/ui/Modifier;",
        "getIconDefaultSizeModifier",
        "()Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "",
        "getLayoutId",
        "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;",
        "layoutId",
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
        "SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,369:1\n50#2:370\n49#2:371\n1116#3,6:372\n658#4:378\n646#4:379\n658#4:380\n646#4:381\n154#5:382\n154#5:383\n154#5:384\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n80#1:370\n80#1:371\n80#1:372,6\n111#1:378\n111#1:379\n114#1:380\n114#1:381\n365#1:382\n366#1:383\n368#1:384\n*E\n"
    }
.end annotation


# static fields
.field public static final AnimationDuration:I = 0x96

.field private static final HorizontalIconPadding:F

.field private static final IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final LabelId:Ljava/lang/String; = "Label"
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final LeadingId:Ljava/lang/String; = "Leading"
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final PlaceholderAnimationDelayOrDuration:I = 0x43

.field private static final PlaceholderAnimationDuration:I = 0x53

.field public static final PlaceholderId:Ljava/lang/String; = "Hint"
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final TextFieldId:Ljava/lang/String; = "TextField"
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final TextFieldPadding:F

.field public static final TrailingId:Ljava/lang/String; = "Trailing"
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final ZeroConstraints:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0, v0, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    sput-wide v0, Landroidx/compose/material/TextFieldImplKt;->ZeroConstraints:J

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    int-to-float v0, v0

    .line 11
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sput v0, Landroidx/compose/material/TextFieldImplKt;->TextFieldPadding:F

    .line 16
    .line 17
    const/16 v0, 0xc

    .line 18
    .line 19
    int-to-float v0, v0

    .line 20
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sput v0, Landroidx/compose/material/TextFieldImplKt;->HorizontalIconPadding:F

    .line 25
    .line 26
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 27
    .line 28
    const/16 v1, 0x30

    .line 29
    .line 30
    int-to-float v1, v1

    .line 31
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Landroidx/compose/material/TextFieldImplKt;->IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;

    .line 44
    .line 45
    return-void
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

.method public static final CommonDecorationBox(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lv3/p;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lv3/p;Landroidx/compose/runtime/Composer;III)V
    .locals 38
    .param p0    # Landroidx/compose/material/TextFieldType;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/text/input/VisualTransformation;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p5    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/foundation/interaction/InteractionSource;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/material/TextFieldColors;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p14    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p15    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/TextFieldType;",
            "Ljava/lang/String;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Lv3/p<",
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
            ">;",
            "Lv3/p<",
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
            ">;ZZZ",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/material/TextFieldColors;",
            "Lv3/p<",
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

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v3, p4

    move-object/from16 v1, p11

    move-object/from16 v0, p13

    move/from16 v15, p16

    move/from16 v14, p17

    move/from16 v13, p18

    const v5, -0x2a78ed05

    move-object/from16 v6, p15

    .line 1
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v12

    and-int/lit8 v6, v13, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v6, v15, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v15, 0xe

    move-object/from16 v11, p0

    if-nez v6, :cond_2

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v15

    goto :goto_1

    :cond_2
    move v6, v15

    :goto_1
    and-int/lit8 v9, v13, 0x2

    const/16 v16, 0x10

    if-eqz v9, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v15, 0x70

    if-nez v9, :cond_5

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    move/from16 v9, v16

    :goto_2
    or-int/2addr v6, v9

    :cond_5
    :goto_3
    and-int/lit8 v9, v13, 0x4

    const/16 v17, 0x100

    const/16 v18, 0x80

    if-eqz v9, :cond_6

    or-int/lit16 v6, v6, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v15, 0x380

    if-nez v9, :cond_8

    move-object/from16 v9, p2

    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_7

    move/from16 v19, v17

    goto :goto_4

    :cond_7
    move/from16 v19, v18

    :goto_4
    or-int v6, v6, v19

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v9, p2

    :goto_6
    and-int/lit8 v19, v13, 0x8

    const/16 v20, 0x800

    const/16 v21, 0x400

    if-eqz v19, :cond_9

    or-int/lit16 v6, v6, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v15, 0x1c00

    if-nez v7, :cond_b

    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    move/from16 v7, v20

    goto :goto_7

    :cond_a
    move/from16 v7, v21

    :goto_7
    or-int/2addr v6, v7

    :cond_b
    :goto_8
    and-int/lit8 v7, v13, 0x10

    const/16 v19, 0x4000

    const/16 v22, 0x2000

    if-eqz v7, :cond_c

    or-int/lit16 v6, v6, 0x6000

    goto :goto_a

    :cond_c
    const v7, 0xe000

    and-int/2addr v7, v15

    if-nez v7, :cond_e

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    move/from16 v7, v19

    goto :goto_9

    :cond_d
    move/from16 v7, v22

    :goto_9
    or-int/2addr v6, v7

    :cond_e
    :goto_a
    and-int/lit8 v7, v13, 0x20

    if-eqz v7, :cond_f

    const/high16 v23, 0x30000

    or-int v6, v6, v23

    move-object/from16 v8, p5

    goto :goto_c

    :cond_f
    const/high16 v23, 0x70000

    and-int v23, v15, v23

    move-object/from16 v8, p5

    if-nez v23, :cond_11

    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_10

    const/high16 v24, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v24, 0x10000

    :goto_b
    or-int v6, v6, v24

    :cond_11
    :goto_c
    and-int/lit8 v24, v13, 0x40

    if-eqz v24, :cond_12

    const/high16 v25, 0x180000

    or-int v6, v6, v25

    move-object/from16 v10, p6

    goto :goto_e

    :cond_12
    const/high16 v25, 0x380000

    and-int v25, v15, v25

    move-object/from16 v10, p6

    if-nez v25, :cond_14

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_13

    const/high16 v26, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v26, 0x80000

    :goto_d
    or-int v6, v6, v26

    :cond_14
    :goto_e
    and-int/lit16 v5, v13, 0x80

    if-eqz v5, :cond_15

    const/high16 v27, 0xc00000

    or-int v6, v6, v27

    move-object/from16 v8, p7

    goto :goto_10

    :cond_15
    const/high16 v27, 0x1c00000

    and-int v27, v15, v27

    move-object/from16 v8, p7

    if-nez v27, :cond_17

    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_16

    const/high16 v27, 0x800000

    goto :goto_f

    :cond_16
    const/high16 v27, 0x400000

    :goto_f
    or-int v6, v6, v27

    :cond_17
    :goto_10
    and-int/lit16 v8, v13, 0x100

    if-eqz v8, :cond_18

    const/high16 v27, 0x6000000

    or-int v6, v6, v27

    move/from16 v9, p8

    goto :goto_12

    :cond_18
    const/high16 v27, 0xe000000

    and-int v27, v15, v27

    move/from16 v9, p8

    if-nez v27, :cond_1a

    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v27

    if-eqz v27, :cond_19

    const/high16 v27, 0x4000000

    goto :goto_11

    :cond_19
    const/high16 v27, 0x2000000

    :goto_11
    or-int v6, v6, v27

    :cond_1a
    :goto_12
    and-int/lit16 v9, v13, 0x200

    if-eqz v9, :cond_1b

    const/high16 v27, 0x30000000

    or-int v6, v6, v27

    move/from16 v10, p9

    goto :goto_14

    :cond_1b
    const/high16 v27, 0x70000000

    and-int v27, v15, v27

    move/from16 v10, p9

    if-nez v27, :cond_1d

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v27

    if-eqz v27, :cond_1c

    const/high16 v27, 0x20000000

    goto :goto_13

    :cond_1c
    const/high16 v27, 0x10000000

    :goto_13
    or-int v6, v6, v27

    :cond_1d
    :goto_14
    and-int/lit16 v10, v13, 0x400

    if-eqz v10, :cond_1e

    or-int/lit8 v23, v14, 0x6

    move/from16 v11, p10

    goto :goto_16

    :cond_1e
    and-int/lit8 v27, v14, 0xe

    move/from16 v11, p10

    if-nez v27, :cond_20

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v27

    if-eqz v27, :cond_1f

    const/16 v23, 0x4

    goto :goto_15

    :cond_1f
    const/16 v23, 0x2

    :goto_15
    or-int v23, v14, v23

    goto :goto_16

    :cond_20
    move/from16 v23, v14

    :goto_16
    and-int/lit16 v11, v13, 0x800

    if-eqz v11, :cond_21

    or-int/lit8 v23, v23, 0x30

    goto :goto_17

    :cond_21
    and-int/lit8 v11, v14, 0x70

    if-nez v11, :cond_23

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_22

    const/16 v16, 0x20

    :cond_22
    or-int v23, v23, v16

    :cond_23
    :goto_17
    move/from16 v11, v23

    and-int/lit16 v15, v13, 0x1000

    if-eqz v15, :cond_24

    or-int/lit16 v11, v11, 0x180

    goto :goto_19

    :cond_24
    and-int/lit16 v15, v14, 0x380

    if-nez v15, :cond_26

    move-object/from16 v15, p12

    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_25

    goto :goto_18

    :cond_25
    move/from16 v17, v18

    :goto_18
    or-int v11, v11, v17

    goto :goto_1a

    :cond_26
    :goto_19
    move-object/from16 v15, p12

    :goto_1a
    and-int/lit16 v15, v13, 0x2000

    if-eqz v15, :cond_27

    or-int/lit16 v11, v11, 0xc00

    goto :goto_1c

    :cond_27
    and-int/lit16 v15, v14, 0x1c00

    if-nez v15, :cond_29

    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_28

    goto :goto_1b

    :cond_28
    move/from16 v20, v21

    :goto_1b
    or-int v11, v11, v20

    :cond_29
    :goto_1c
    and-int/lit16 v15, v13, 0x4000

    if-eqz v15, :cond_2a

    or-int/lit16 v11, v11, 0x6000

    move-object/from16 v13, p14

    goto :goto_1e

    :cond_2a
    const v16, 0xe000

    and-int v16, v14, v16

    move-object/from16 v13, p14

    if-nez v16, :cond_2c

    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2b

    goto :goto_1d

    :cond_2b
    move/from16 v19, v22

    :goto_1d
    or-int v11, v11, v19

    :cond_2c
    :goto_1e
    const v16, 0x5b6db6db

    and-int v13, v6, v16

    const v14, 0x12492492

    if-ne v13, v14, :cond_2e

    const v13, 0xb6db

    and-int/2addr v13, v11

    const/16 v14, 0x2492

    if-ne v13, v14, :cond_2e

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v13

    if-nez v13, :cond_2d

    goto :goto_1f

    .line 2
    :cond_2d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v15, p14

    move-object v0, v12

    goto/16 :goto_32

    :cond_2e
    :goto_1f
    const/4 v13, 0x0

    if-eqz v7, :cond_2f

    move-object/from16 v21, v13

    goto :goto_20

    :cond_2f
    move-object/from16 v21, p5

    :goto_20
    if-eqz v24, :cond_30

    move-object/from16 v22, v13

    goto :goto_21

    :cond_30
    move-object/from16 v22, p6

    :goto_21
    if-eqz v5, :cond_31

    move-object/from16 v23, v13

    goto :goto_22

    :cond_31
    move-object/from16 v23, p7

    :goto_22
    if-eqz v8, :cond_32

    const/16 v24, 0x0

    goto :goto_23

    :cond_32
    move/from16 v24, p8

    :goto_23
    if-eqz v9, :cond_33

    const/4 v9, 0x1

    goto :goto_24

    :cond_33
    move/from16 v9, p9

    :goto_24
    if-eqz v10, :cond_34

    const/4 v10, 0x0

    goto :goto_25

    :cond_34
    move/from16 v10, p10

    :goto_25
    if-eqz v15, :cond_35

    move-object/from16 v25, v13

    goto :goto_26

    :cond_35
    move-object/from16 v25, p14

    .line 3
    :goto_26
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_36

    const-string v7, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)"

    const v8, -0x2a78ed05

    .line 4
    invoke-static {v8, v6, v11, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_36
    const v6, 0x1e7b2b64

    .line 5
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 6
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    .line 7
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_37

    .line 8
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_38

    .line 9
    :cond_37
    new-instance v6, Landroidx/compose/ui/text/AnnotatedString;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x6

    const/4 v15, 0x0

    move-object/from16 p5, v6

    move-object/from16 p6, p1

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v13

    move-object/from16 p10, v15

    invoke-direct/range {p5 .. p10}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/w;)V

    invoke-interface {v4, v6}, Landroidx/compose/ui/text/input/VisualTransformation;->filter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;

    move-result-object v7

    .line 10
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 11
    :cond_38
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v7, Landroidx/compose/ui/text/input/TransformedText;

    .line 12
    invoke-virtual {v7}, Landroidx/compose/ui/text/input/TransformedText;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v8

    shr-int/lit8 v6, v11, 0x3

    and-int/lit8 v6, v6, 0xe

    .line 13
    invoke-static {v1, v12, v6}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v6

    invoke-interface {v6}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_39

    .line 14
    sget-object v6, Landroidx/compose/material/InputPhase;->Focused:Landroidx/compose/material/InputPhase;

    :goto_27
    move-object v15, v6

    goto :goto_29

    .line 15
    :cond_39
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_3a

    const/4 v6, 0x1

    goto :goto_28

    :cond_3a
    const/4 v6, 0x0

    :goto_28
    if-eqz v6, :cond_3b

    sget-object v6, Landroidx/compose/material/InputPhase;->UnfocusedEmpty:Landroidx/compose/material/InputPhase;

    goto :goto_27

    .line 16
    :cond_3b
    sget-object v6, Landroidx/compose/material/InputPhase;->UnfocusedNotEmpty:Landroidx/compose/material/InputPhase;

    goto :goto_27

    .line 17
    :goto_29
    new-instance v13, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$labelColor$1;

    invoke-direct {v13, v0, v9, v10, v1}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$labelColor$1;-><init>(Landroidx/compose/material/TextFieldColors;ZZLandroidx/compose/foundation/interaction/InteractionSource;)V

    .line 18
    sget-object v6, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    const/4 v7, 0x6

    invoke-virtual {v6, v12, v7}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v11

    .line 19
    invoke-virtual {v11}, Landroidx/compose/material/Typography;->getSubtitle1()Landroidx/compose/ui/text/TextStyle;

    move-result-object v16

    .line 20
    invoke-virtual {v11}, Landroidx/compose/material/Typography;->getCaption()Landroidx/compose/ui/text/TextStyle;

    move-result-object v11

    move-object/from16 v17, v15

    .line 21
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v14

    sget-object v18, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move-object/from16 p7, v6

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v5

    invoke-static {v14, v15, v5, v6}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v5

    if-eqz v5, :cond_3c

    invoke-virtual {v11}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v5

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v14

    invoke-static {v5, v6, v14, v15}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v5

    if-eqz v5, :cond_3d

    .line 22
    :cond_3c
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v5

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v14

    invoke-static {v5, v6, v14, v15}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v5

    if-nez v5, :cond_3e

    invoke-virtual {v11}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v5

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v14

    invoke-static {v5, v6, v14, v15}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v5

    if-eqz v5, :cond_3e

    :cond_3d
    const/16 v19, 0x1

    goto :goto_2a

    :cond_3e
    const/16 v19, 0x0

    .line 23
    :goto_2a
    sget-object v26, Landroidx/compose/material/TextFieldTransitionScope;->INSTANCE:Landroidx/compose/material/TextFieldTransitionScope;

    const v5, 0x7ee81cc7

    .line 24
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    move-object/from16 v5, p7

    .line 25
    invoke-virtual {v5, v12, v7}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/material/Typography;->getCaption()Landroidx/compose/ui/text/TextStyle;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v14

    if-eqz v19, :cond_41

    .line 26
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v27

    cmp-long v6, v14, v27

    if-eqz v6, :cond_3f

    const/4 v6, 0x1

    goto :goto_2b

    :cond_3f
    const/4 v6, 0x0

    :goto_2b
    if-eqz v6, :cond_40

    goto :goto_2c

    :cond_40
    const/4 v6, 0x0

    .line 27
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    move-object/from16 v6, v17

    invoke-interface {v13, v6, v12, v11}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v14

    goto :goto_2d

    :cond_41
    :goto_2c
    move-object/from16 v6, v17

    :goto_2d
    move-wide/from16 v27, v14

    .line 28
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const v11, 0x7ee81d86

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 29
    invoke-virtual {v5, v12, v7}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/material/Typography;->getSubtitle1()Landroidx/compose/ui/text/TextStyle;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v14

    if-eqz v19, :cond_44

    .line 30
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v16

    cmp-long v5, v14, v16

    if-eqz v5, :cond_42

    const/4 v5, 0x1

    goto :goto_2e

    :cond_42
    const/4 v5, 0x0

    :goto_2e
    if-eqz v5, :cond_43

    goto :goto_2f

    :cond_43
    const/4 v5, 0x0

    .line 31
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v13, v6, v12, v7}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v14

    goto :goto_30

    :cond_44
    :goto_2f
    const/4 v5, 0x0

    :goto_30
    move-wide/from16 v29, v14

    .line 32
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    if-eqz v3, :cond_45

    const/16 v31, 0x1

    goto :goto_31

    :cond_45
    move/from16 v31, v5

    .line 33
    :goto_31
    new-instance v15, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;

    move-object v5, v15

    move-object/from16 v16, v6

    move-object/from16 v6, p4

    move-object/from16 v7, v21

    move/from16 v32, v9

    move-object/from16 v9, p13

    move/from16 v33, v10

    move/from16 v10, v32

    move/from16 v11, v33

    move-object v14, v12

    move-object/from16 v12, p11

    move-object/from16 v34, v13

    move-object/from16 v13, v22

    move-object v0, v14

    const/4 v1, 0x1

    move-object/from16 v14, v23

    move-object v2, v15

    move-object/from16 v35, v16

    move-object/from16 v15, p0

    move-object/from16 v16, p2

    move/from16 v17, v24

    move-object/from16 v18, p12

    move-object/from16 v20, v25

    invoke-direct/range {v5 .. v20}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;-><init>(Lv3/p;Lv3/p;Ljava/lang/String;Landroidx/compose/material/TextFieldColors;ZZLandroidx/compose/foundation/interaction/InteractionSource;Lv3/p;Lv3/p;Landroidx/compose/material/TextFieldType;Lv3/p;ZLandroidx/compose/foundation/layout/PaddingValues;ZLv3/p;)V

    const v5, 0x146073d8

    invoke-static {v0, v5, v1, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v14

    const/high16 v16, 0x1b0000

    move-object/from16 v6, v26

    move-object/from16 v7, v35

    move-wide/from16 v8, v27

    move-wide/from16 v10, v29

    move-object/from16 v12, v34

    move/from16 v13, v31

    move-object v15, v0

    .line 34
    invoke-virtual/range {v6 .. v16}, Landroidx/compose/material/TextFieldTransitionScope;->Transition-DTcfvLk(Landroidx/compose/material/InputPhase;JJLv3/q;ZLv3/t;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_46

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_46
    move-object/from16 v6, v21

    move-object/from16 v7, v22

    move-object/from16 v8, v23

    move/from16 v9, v24

    move-object/from16 v15, v25

    move/from16 v10, v32

    move/from16 v11, v33

    .line 35
    :goto_32
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v14

    if-eqz v14, :cond_47

    new-instance v13, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$4;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v12, p11

    move-object/from16 v36, v13

    move-object/from16 v13, p12

    move-object/from16 v37, v14

    move-object/from16 v14, p13

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    invoke-direct/range {v0 .. v18}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$4;-><init>(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lv3/p;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lv3/p;III)V

    move-object/from16 v1, v36

    move-object/from16 v0, v37

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_47
    return-void
.end method

.method public static final Decoration-euL9pac(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 13
    .param p2    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Float;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableOpenTarget;
        index = 0x0
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/text/TextStyle;",
            "Ljava/lang/Float;",
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
    move-wide v1, p0

    .line 2
    move-object/from16 v5, p4

    .line 3
    .line 4
    move/from16 v6, p6

    .line 5
    .line 6
    const v0, -0x17cfc8dc

    .line 7
    .line 8
    .line 9
    move-object/from16 v3, p5

    .line 10
    .line 11
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    and-int/lit8 v4, p7, 0x1

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    or-int/lit8 v4, v6, 0x6

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    and-int/lit8 v4, v6, 0xe

    .line 23
    .line 24
    if-nez v4, :cond_2

    .line 25
    .line 26
    invoke-interface {v3, p0, p1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v4, 0x2

    .line 35
    :goto_0
    or-int/2addr v4, v6

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move v4, v6

    .line 38
    :goto_1
    and-int/lit8 v7, p7, 0x2

    .line 39
    .line 40
    if-eqz v7, :cond_3

    .line 41
    .line 42
    or-int/lit8 v4, v4, 0x30

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_3
    and-int/lit8 v8, v6, 0x70

    .line 46
    .line 47
    if-nez v8, :cond_5

    .line 48
    .line 49
    move-object v8, p2

    .line 50
    invoke-interface {v3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    if-eqz v9, :cond_4

    .line 55
    .line 56
    const/16 v9, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    const/16 v9, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v4, v9

    .line 62
    goto :goto_4

    .line 63
    :cond_5
    :goto_3
    move-object v8, p2

    .line 64
    :goto_4
    and-int/lit8 v9, p7, 0x4

    .line 65
    .line 66
    if-eqz v9, :cond_6

    .line 67
    .line 68
    or-int/lit16 v4, v4, 0x180

    .line 69
    .line 70
    goto :goto_6

    .line 71
    :cond_6
    and-int/lit16 v10, v6, 0x380

    .line 72
    .line 73
    if-nez v10, :cond_8

    .line 74
    .line 75
    move-object/from16 v10, p3

    .line 76
    .line 77
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-eqz v11, :cond_7

    .line 82
    .line 83
    const/16 v11, 0x100

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_7
    const/16 v11, 0x80

    .line 87
    .line 88
    :goto_5
    or-int/2addr v4, v11

    .line 89
    goto :goto_7

    .line 90
    :cond_8
    :goto_6
    move-object/from16 v10, p3

    .line 91
    .line 92
    :goto_7
    and-int/lit8 v11, p7, 0x8

    .line 93
    .line 94
    if-eqz v11, :cond_9

    .line 95
    .line 96
    or-int/lit16 v4, v4, 0xc00

    .line 97
    .line 98
    goto :goto_9

    .line 99
    :cond_9
    and-int/lit16 v11, v6, 0x1c00

    .line 100
    .line 101
    if-nez v11, :cond_b

    .line 102
    .line 103
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    if-eqz v11, :cond_a

    .line 108
    .line 109
    const/16 v11, 0x800

    .line 110
    .line 111
    goto :goto_8

    .line 112
    :cond_a
    const/16 v11, 0x400

    .line 113
    .line 114
    :goto_8
    or-int/2addr v4, v11

    .line 115
    :cond_b
    :goto_9
    and-int/lit16 v11, v4, 0x16db

    .line 116
    .line 117
    const/16 v12, 0x492

    .line 118
    .line 119
    if-ne v11, v12, :cond_e

    .line 120
    .line 121
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    if-nez v11, :cond_c

    .line 126
    .line 127
    goto :goto_b

    .line 128
    :cond_c
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 129
    .line 130
    .line 131
    :cond_d
    :goto_a
    move-object v4, v10

    .line 132
    goto :goto_d

    .line 133
    :cond_e
    :goto_b
    const/4 v11, 0x0

    .line 134
    if-eqz v7, :cond_f

    .line 135
    .line 136
    move-object v8, v11

    .line 137
    :cond_f
    if-eqz v9, :cond_10

    .line 138
    .line 139
    move-object v10, v11

    .line 140
    :cond_10
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_11

    .line 145
    .line 146
    const/4 v7, -0x1

    .line 147
    const-string v9, "androidx.compose.material.Decoration (TextFieldImpl.kt:223)"

    .line 148
    .line 149
    invoke-static {v0, v4, v7, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_11
    new-instance v0, Landroidx/compose/material/TextFieldImplKt$Decoration$colorAndEmphasis$1;

    .line 153
    .line 154
    invoke-direct {v0, p0, p1, v10, v5}, Landroidx/compose/material/TextFieldImplKt$Decoration$colorAndEmphasis$1;-><init>(JLjava/lang/Float;Lv3/p;)V

    .line 155
    .line 156
    .line 157
    const v7, 0x1d7c49ae

    .line 158
    .line 159
    .line 160
    const/4 v9, 0x1

    .line 161
    invoke-static {v3, v7, v9, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-eqz v8, :cond_12

    .line 166
    .line 167
    const v7, -0x77cd748f

    .line 168
    .line 169
    .line 170
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 171
    .line 172
    .line 173
    shr-int/lit8 v4, v4, 0x3

    .line 174
    .line 175
    and-int/lit8 v4, v4, 0xe

    .line 176
    .line 177
    or-int/lit8 v4, v4, 0x30

    .line 178
    .line 179
    invoke-static {v8, v0, v3, v4}, Landroidx/compose/material/TextKt;->ProvideTextStyle(Landroidx/compose/ui/text/TextStyle;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 180
    .line 181
    .line 182
    goto :goto_c

    .line 183
    :cond_12
    const v4, -0x77cd745b

    .line 184
    .line 185
    .line 186
    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 187
    .line 188
    .line 189
    const/4 v4, 0x6

    .line 190
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    invoke-interface {v0, v3, v4}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    :goto_c
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 198
    .line 199
    .line 200
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_d

    .line 205
    .line 206
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 207
    .line 208
    .line 209
    goto :goto_a

    .line 210
    :goto_d
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    if-eqz v9, :cond_13

    .line 215
    .line 216
    new-instance v10, Landroidx/compose/material/TextFieldImplKt$Decoration$1;

    .line 217
    .line 218
    move-object v0, v10

    .line 219
    move-wide v1, p0

    .line 220
    move-object v3, v8

    .line 221
    move-object/from16 v5, p4

    .line 222
    .line 223
    move/from16 v6, p6

    .line 224
    .line 225
    move/from16 v7, p7

    .line 226
    .line 227
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material/TextFieldImplKt$Decoration$1;-><init>(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lv3/p;II)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v9, v10}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 231
    .line 232
    .line 233
    :cond_13
    return-void
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
.end method

.method public static final defaultErrorSemantics(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 2
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    if-eqz p1, :cond_0

    new-instance p1, Landroidx/compose/material/TextFieldImplKt$defaultErrorSemantics$1;

    invoke-direct {p1, p2}, Landroidx/compose/material/TextFieldImplKt$defaultErrorSemantics$1;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, p2, v0}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final getHorizontalIconPadding()F
    .locals 1

    sget v0, Landroidx/compose/material/TextFieldImplKt;->HorizontalIconPadding:F

    return v0
.end method

.method public static final getIconDefaultSizeModifier()Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material/TextFieldImplKt;->IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public static final getLayoutId(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;
    .locals 2
    .param p0    # Landroidx/compose/ui/layout/IntrinsicMeasurable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    invoke-interface {p0}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->getParentData()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroidx/compose/ui/layout/LayoutIdParentData;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/compose/ui/layout/LayoutIdParentData;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Landroidx/compose/ui/layout/LayoutIdParentData;->getLayoutId()Ljava/lang/Object;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public static final getTextFieldPadding()F
    .locals 1

    sget v0, Landroidx/compose/material/TextFieldImplKt;->TextFieldPadding:F

    return v0
.end method

.method public static final getZeroConstraints()J
    .locals 2

    sget-wide v0, Landroidx/compose/material/TextFieldImplKt;->ZeroConstraints:J

    return-wide v0
.end method

.method public static final heightOrZero(Landroidx/compose/ui/layout/Placeable;)I
    .locals 0
    .param p0    # Landroidx/compose/ui/layout/Placeable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final widthOrZero(Landroidx/compose/ui/layout/Placeable;)I
    .locals 0
    .param p0    # Landroidx/compose/ui/layout/Placeable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
