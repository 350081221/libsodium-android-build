.class public final Landroidx/compose/material3/TextFieldImplKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\u00a2\u0002\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0008\u00062\u0006\u0010\t\u001a\u00020\u00082\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0015\u0008\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0015\u0008\u0002\u0010\u000c\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0015\u0008\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0015\u0008\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0015\u0008\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00a2\u0006\u0002\u0008\u00062\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0008\u0006H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001a9\u0010%\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0008\u0006H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$\u001a\u001c\u0010(\u001a\u00020&*\u00020&2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u0002H\u0000\u001a\u0012\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u0000\u001a\u0012\u0010-\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u0000\"\u0014\u0010.\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008.\u0010/\"\u0014\u00100\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00080\u0010/\"\u0014\u00101\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00081\u0010/\"\u0014\u00102\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00082\u0010/\"\u0014\u00103\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00083\u0010/\"\u0014\u00104\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00084\u0010/\"\u0014\u00105\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00085\u0010/\"\u0014\u00106\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00086\u0010/\"\u0014\u00107\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u00087\u0010/\"\u001a\u00109\u001a\u0002088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\"\u0014\u0010=\u001a\u00020+8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008=\u0010>\"\u0014\u0010?\u001a\u00020+8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008?\u0010>\"\u0014\u0010@\u001a\u00020+8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008@\u0010>\"\u001a\u0010B\u001a\u00020A8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010E\"\u001a\u0010F\u001a\u00020A8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008F\u0010C\u001a\u0004\u0008G\u0010E\"\u001a\u0010H\u001a\u00020A8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008H\u0010C\u001a\u0004\u0008I\u0010E\"\u001a\u0010J\u001a\u00020A8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008J\u0010C\u001a\u0004\u0008K\u0010E\"\u001a\u0010L\u001a\u00020A8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008L\u0010C\u001a\u0004\u0008M\u0010E\"\u001a\u0010N\u001a\u00020A8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008N\u0010C\u001a\u0004\u0008O\u0010E\"\u001a\u0010P\u001a\u00020A8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008P\u0010C\u001a\u0004\u0008Q\u0010E\"\u001a\u0010R\u001a\u00020&8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008R\u0010S\u001a\u0004\u0008T\u0010U\"\u001a\u0010Z\u001a\u0004\u0018\u00010W*\u00020V8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010Y\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006["
    }
    d2 = {
        "Landroidx/compose/material3/TextFieldType;",
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
        "prefix",
        "suffix",
        "supportingText",
        "",
        "singleLine",
        "enabled",
        "isError",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "interactionSource",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "contentPadding",
        "Landroidx/compose/material3/TextFieldColors;",
        "colors",
        "container",
        "CommonDecorationBox",
        "(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lv3/p;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lv3/p;Landroidx/compose/runtime/Composer;III)V",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "Landroidx/compose/ui/text/TextStyle;",
        "typography",
        "content",
        "Decoration-KTwxG1Y",
        "(JLandroidx/compose/ui/text/TextStyle;Lv3/p;Landroidx/compose/runtime/Composer;II)V",
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
        "PrefixId",
        "SuffixId",
        "SupportingId",
        "ContainerId",
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
        "SupportingTopPadding",
        "getSupportingTopPadding",
        "PrefixSuffixTextPadding",
        "getPrefixSuffixTextPadding",
        "MinTextLineHeight",
        "getMinTextLineHeight",
        "MinFocusedLabelLineHeight",
        "getMinFocusedLabelLineHeight",
        "MinSupportingTextLineHeight",
        "getMinSupportingTextLineHeight",
        "IconDefaultSizeModifier",
        "Landroidx/compose/ui/Modifier;",
        "getIconDefaultSizeModifier",
        "()Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
        "",
        "getLayoutId",
        "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;",
        "layoutId",
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
        "SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n1116#2,6:434\n658#3:440\n646#3:441\n658#3:442\n646#3:443\n154#4:444\n154#4:445\n154#4:446\n154#4:447\n154#4:448\n154#4:449\n154#4:450\n154#4:451\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n*L\n81#1:434,6\n106#1:440\n106#1:441\n109#1:442\n109#1:443\n424#1:444\n425#1:445\n426#1:446\n427#1:447\n428#1:448\n429#1:449\n430#1:450\n432#1:451\n*E\n"
    }
.end annotation


# static fields
.field public static final AnimationDuration:I = 0x96

.field public static final ContainerId:Ljava/lang/String; = "Container"
    .annotation build Lp4/l;
    .end annotation
.end field

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

.field private static final MinFocusedLabelLineHeight:F

.field private static final MinSupportingTextLineHeight:F

.field private static final MinTextLineHeight:F

.field private static final PlaceholderAnimationDelayOrDuration:I = 0x43

.field private static final PlaceholderAnimationDuration:I = 0x53

.field public static final PlaceholderId:Ljava/lang/String; = "Hint"
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final PrefixId:Ljava/lang/String; = "Prefix"
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final PrefixSuffixTextPadding:F

.field public static final SuffixId:Ljava/lang/String; = "Suffix"
    .annotation build Lp4/l;
    .end annotation
.end field

.field public static final SupportingId:Ljava/lang/String; = "Supporting"
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final SupportingTopPadding:F

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
    sput-wide v0, Landroidx/compose/material3/TextFieldImplKt;->ZeroConstraints:J

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
    move-result v1

    .line 15
    sput v1, Landroidx/compose/material3/TextFieldImplKt;->TextFieldPadding:F

    .line 16
    .line 17
    const/16 v1, 0xc

    .line 18
    .line 19
    int-to-float v1, v1

    .line 20
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    sput v1, Landroidx/compose/material3/TextFieldImplKt;->HorizontalIconPadding:F

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    int-to-float v1, v1

    .line 28
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    sput v1, Landroidx/compose/material3/TextFieldImplKt;->SupportingTopPadding:F

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    int-to-float v1, v1

    .line 36
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    sput v1, Landroidx/compose/material3/TextFieldImplKt;->PrefixSuffixTextPadding:F

    .line 41
    .line 42
    const/16 v1, 0x18

    .line 43
    .line 44
    int-to-float v1, v1

    .line 45
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    sput v1, Landroidx/compose/material3/TextFieldImplKt;->MinTextLineHeight:F

    .line 50
    .line 51
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    sput v1, Landroidx/compose/material3/TextFieldImplKt;->MinFocusedLabelLineHeight:F

    .line 56
    .line 57
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    sput v0, Landroidx/compose/material3/TextFieldImplKt;->MinSupportingTextLineHeight:F

    .line 62
    .line 63
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 64
    .line 65
    const/16 v1, 0x30

    .line 66
    .line 67
    int-to-float v1, v1

    .line 68
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sput-object v0, Landroidx/compose/material3/TextFieldImplKt;->IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;

    .line 81
    .line 82
    return-void
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

.method public static final CommonDecorationBox(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lv3/p;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lv3/p;Landroidx/compose/runtime/Composer;III)V
    .locals 42
    .param p0    # Landroidx/compose/material3/TextFieldType;
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
    .param p8    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p14    # Landroidx/compose/foundation/interaction/InteractionSource;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p15    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p16    # Landroidx/compose/material3/TextFieldColors;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p17    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p18    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/TextFieldType;",
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
            "Landroidx/compose/material3/TextFieldColors;",
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

    move-object/from16 v4, p3

    move-object/from16 v3, p4

    move-object/from16 v2, p14

    move-object/from16 v1, p16

    move/from16 v0, p19

    move/from16 v15, p20

    move/from16 v14, p21

    const v5, -0x38729d6c

    move-object/from16 v6, p18

    .line 1
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    and-int/lit8 v5, v14, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v0, 0x6

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    move-object/from16 v12, p0

    if-nez v5, :cond_2

    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move v5, v0

    :goto_1
    and-int/lit8 v8, v14, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v0, 0x30

    move-object/from16 v11, p1

    if-nez v8, :cond_5

    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, v14, 0x4

    const/16 v16, 0x100

    const/16 v17, 0x80

    if-eqz v8, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v0, 0x180

    if-nez v8, :cond_8

    move-object/from16 v8, p2

    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_7

    move/from16 v18, v16

    goto :goto_4

    :cond_7
    move/from16 v18, v17

    :goto_4
    or-int v5, v5, v18

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v8, p2

    :goto_6
    and-int/lit8 v18, v14, 0x8

    const/16 v19, 0x400

    if-eqz v18, :cond_9

    or-int/lit16 v5, v5, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_b

    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_7

    :cond_a
    move/from16 v7, v19

    :goto_7
    or-int/2addr v5, v7

    :cond_b
    :goto_8
    and-int/lit8 v7, v14, 0x10

    const/16 v20, 0x4000

    const/16 v21, 0x2000

    if-eqz v7, :cond_c

    or-int/lit16 v5, v5, 0x6000

    goto :goto_a

    :cond_c
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_e

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    move/from16 v7, v20

    goto :goto_9

    :cond_d
    move/from16 v7, v21

    :goto_9
    or-int/2addr v5, v7

    :cond_e
    :goto_a
    and-int/lit8 v7, v14, 0x20

    const/high16 v22, 0x10000

    const/high16 v23, 0x30000

    if-eqz v7, :cond_f

    or-int v5, v5, v23

    move-object/from16 v9, p5

    goto :goto_c

    :cond_f
    and-int v24, v0, v23

    move-object/from16 v9, p5

    if-nez v24, :cond_11

    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_10

    const/high16 v25, 0x20000

    goto :goto_b

    :cond_10
    move/from16 v25, v22

    :goto_b
    or-int v5, v5, v25

    :cond_11
    :goto_c
    and-int/lit8 v25, v14, 0x40

    const/high16 v26, 0x180000

    if-eqz v25, :cond_12

    or-int v5, v5, v26

    move-object/from16 v6, p6

    goto :goto_e

    :cond_12
    and-int v27, v0, v26

    move-object/from16 v6, p6

    if-nez v27, :cond_14

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_13

    const/high16 v28, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v28, 0x80000

    :goto_d
    or-int v5, v5, v28

    :cond_14
    :goto_e
    and-int/lit16 v10, v14, 0x80

    const/high16 v29, 0xc00000

    if-eqz v10, :cond_15

    or-int v5, v5, v29

    move-object/from16 v6, p7

    goto :goto_10

    :cond_15
    and-int v30, v0, v29

    move-object/from16 v6, p7

    if-nez v30, :cond_17

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    const/high16 v30, 0x800000

    goto :goto_f

    :cond_16
    const/high16 v30, 0x400000

    :goto_f
    or-int v5, v5, v30

    :cond_17
    :goto_10
    and-int/lit16 v6, v14, 0x100

    const/high16 v30, 0x6000000

    if-eqz v6, :cond_18

    or-int v5, v5, v30

    move-object/from16 v8, p8

    goto :goto_12

    :cond_18
    and-int v30, v0, v30

    move-object/from16 v8, p8

    if-nez v30, :cond_1a

    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_19

    const/high16 v30, 0x4000000

    goto :goto_11

    :cond_19
    const/high16 v30, 0x2000000

    :goto_11
    or-int v5, v5, v30

    :cond_1a
    :goto_12
    and-int/lit16 v8, v14, 0x200

    const/high16 v30, 0x30000000

    if-eqz v8, :cond_1b

    or-int v5, v5, v30

    move-object/from16 v0, p9

    goto :goto_14

    :cond_1b
    and-int v30, v0, v30

    move-object/from16 v0, p9

    if-nez v30, :cond_1d

    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1c

    const/high16 v30, 0x20000000

    goto :goto_13

    :cond_1c
    const/high16 v30, 0x10000000

    :goto_13
    or-int v5, v5, v30

    :cond_1d
    :goto_14
    and-int/lit16 v0, v14, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v18, v15, 0x6

    move-object/from16 v9, p10

    goto :goto_16

    :cond_1e
    and-int/lit8 v30, v15, 0x6

    move-object/from16 v9, p10

    if-nez v30, :cond_20

    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1f

    const/16 v18, 0x4

    goto :goto_15

    :cond_1f
    const/16 v18, 0x2

    :goto_15
    or-int v18, v15, v18

    goto :goto_16

    :cond_20
    move/from16 v18, v15

    :goto_16
    and-int/lit16 v9, v14, 0x800

    if-eqz v9, :cond_21

    or-int/lit8 v18, v18, 0x30

    goto :goto_18

    :cond_21
    and-int/lit8 v30, v15, 0x30

    move/from16 v11, p11

    if-nez v30, :cond_23

    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v30

    if-eqz v30, :cond_22

    const/16 v24, 0x20

    goto :goto_17

    :cond_22
    const/16 v24, 0x10

    :goto_17
    or-int v18, v18, v24

    :cond_23
    :goto_18
    move/from16 v11, v18

    and-int/lit16 v12, v14, 0x1000

    if-eqz v12, :cond_24

    or-int/lit16 v11, v11, 0x180

    goto :goto_1a

    :cond_24
    and-int/lit16 v3, v15, 0x180

    if-nez v3, :cond_26

    move/from16 v3, p12

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_25

    goto :goto_19

    :cond_25
    move/from16 v16, v17

    :goto_19
    or-int v11, v11, v16

    goto :goto_1b

    :cond_26
    :goto_1a
    move/from16 v3, p12

    :goto_1b
    and-int/lit16 v3, v14, 0x2000

    if-eqz v3, :cond_27

    or-int/lit16 v11, v11, 0xc00

    goto :goto_1c

    :cond_27
    and-int/lit16 v4, v15, 0xc00

    if-nez v4, :cond_29

    move/from16 v4, p13

    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_28

    const/16 v19, 0x800

    :cond_28
    or-int v11, v11, v19

    goto :goto_1d

    :cond_29
    :goto_1c
    move/from16 v4, p13

    :goto_1d
    and-int/lit16 v4, v14, 0x4000

    if-eqz v4, :cond_2a

    or-int/lit16 v11, v11, 0x6000

    goto :goto_1f

    :cond_2a
    and-int/lit16 v4, v15, 0x6000

    if-nez v4, :cond_2c

    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2b

    goto :goto_1e

    :cond_2b
    move/from16 v20, v21

    :goto_1e
    or-int v11, v11, v20

    :cond_2c
    :goto_1f
    const v4, 0x8000

    and-int/2addr v4, v14

    if-eqz v4, :cond_2d

    or-int v11, v11, v23

    goto :goto_21

    :cond_2d
    and-int v4, v15, v23

    if-nez v4, :cond_2f

    move-object/from16 v4, p15

    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2e

    const/high16 v16, 0x20000

    goto :goto_20

    :cond_2e
    move/from16 v16, v22

    :goto_20
    or-int v11, v11, v16

    goto :goto_22

    :cond_2f
    :goto_21
    move-object/from16 v4, p15

    :goto_22
    and-int v16, v14, v22

    if-eqz v16, :cond_30

    or-int v11, v11, v26

    goto :goto_24

    :cond_30
    and-int v16, v15, v26

    if-nez v16, :cond_32

    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_31

    const/high16 v16, 0x100000

    goto :goto_23

    :cond_31
    const/high16 v16, 0x80000

    :goto_23
    or-int v11, v11, v16

    :cond_32
    :goto_24
    const/high16 v16, 0x20000

    and-int v16, v14, v16

    if-eqz v16, :cond_33

    or-int v11, v11, v29

    move-object/from16 v4, p17

    goto :goto_26

    :cond_33
    and-int v16, v15, v29

    move-object/from16 v4, p17

    if-nez v16, :cond_35

    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_34

    const/high16 v16, 0x800000

    goto :goto_25

    :cond_34
    const/high16 v16, 0x400000

    :goto_25
    or-int v11, v11, v16

    :cond_35
    :goto_26
    const v16, 0x12492493

    and-int v4, v5, v16

    const v14, 0x12492492

    if-ne v4, v14, :cond_37

    const v4, 0x492493

    and-int/2addr v4, v11

    const v14, 0x492492

    if-ne v4, v14, :cond_37

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v4

    if-nez v4, :cond_36

    goto :goto_27

    .line 2
    :cond_36
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move/from16 v14, p13

    move-object v1, v13

    move/from16 v13, p12

    goto/16 :goto_3d

    :cond_37
    :goto_27
    const/4 v4, 0x0

    if-eqz v7, :cond_38

    move-object/from16 v26, v4

    goto :goto_28

    :cond_38
    move-object/from16 v26, p5

    :goto_28
    if-eqz v25, :cond_39

    move-object/from16 v29, v4

    goto :goto_29

    :cond_39
    move-object/from16 v29, p6

    :goto_29
    if-eqz v10, :cond_3a

    move-object/from16 v30, v4

    goto :goto_2a

    :cond_3a
    move-object/from16 v30, p7

    :goto_2a
    if-eqz v6, :cond_3b

    move-object/from16 v31, v4

    goto :goto_2b

    :cond_3b
    move-object/from16 v31, p8

    :goto_2b
    if-eqz v8, :cond_3c

    move-object/from16 v32, v4

    goto :goto_2c

    :cond_3c
    move-object/from16 v32, p9

    :goto_2c
    if-eqz v0, :cond_3d

    goto :goto_2d

    :cond_3d
    move-object/from16 v4, p10

    :goto_2d
    const/4 v0, 0x0

    if-eqz v9, :cond_3e

    move/from16 v33, v0

    goto :goto_2e

    :cond_3e
    move/from16 v33, p11

    :goto_2e
    if-eqz v12, :cond_3f

    const/4 v12, 0x1

    goto :goto_2f

    :cond_3f
    move/from16 v12, p12

    :goto_2f
    if-eqz v3, :cond_40

    move v3, v0

    goto :goto_30

    :cond_40
    move/from16 v3, p13

    .line 3
    :goto_30
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_41

    const v6, -0x38729d6c

    const-string v7, "androidx.compose.material3.CommonDecorationBox (TextFieldImpl.kt:79)"

    .line 4
    invoke-static {v6, v5, v11, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_41
    const v6, -0x26871e24

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    and-int/lit8 v6, v5, 0x70

    const/16 v7, 0x20

    if-ne v6, v7, :cond_42

    const/4 v6, 0x1

    goto :goto_31

    :cond_42
    move v6, v0

    :goto_31
    and-int/lit16 v5, v5, 0x1c00

    const/16 v7, 0x800

    if-ne v5, v7, :cond_43

    const/4 v5, 0x1

    goto :goto_32

    :cond_43
    move v5, v0

    :goto_32
    or-int/2addr v5, v6

    .line 5
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_45

    .line 6
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_44

    goto :goto_33

    :cond_44
    move-object/from16 v10, p3

    goto :goto_34

    .line 7
    :cond_45
    :goto_33
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object/from16 p5, v5

    move-object/from16 p6, p1

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move/from16 p9, v8

    move-object/from16 p10, v9

    invoke-direct/range {p5 .. p10}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/w;)V

    move-object/from16 v10, p3

    invoke-interface {v10, v5}, Landroidx/compose/ui/text/input/VisualTransformation;->filter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;

    move-result-object v6

    .line 8
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 9
    :goto_34
    check-cast v6, Landroidx/compose/ui/text/input/TransformedText;

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 10
    invoke-virtual {v6}, Landroidx/compose/ui/text/input/TransformedText;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v16

    shr-int/lit8 v5, v11, 0xc

    and-int/lit8 v5, v5, 0xe

    .line 11
    invoke-static {v2, v13, v5}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v5

    invoke-interface {v5}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_46

    .line 12
    sget-object v5, Landroidx/compose/material3/InputPhase;->Focused:Landroidx/compose/material3/InputPhase;

    :goto_35
    move-object v11, v5

    goto :goto_37

    .line 13
    :cond_46
    invoke-interface/range {v16 .. v16}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_47

    const/4 v5, 0x1

    goto :goto_36

    :cond_47
    move v5, v0

    :goto_36
    if-eqz v5, :cond_48

    sget-object v5, Landroidx/compose/material3/InputPhase;->UnfocusedEmpty:Landroidx/compose/material3/InputPhase;

    goto :goto_35

    .line 14
    :cond_48
    sget-object v5, Landroidx/compose/material3/InputPhase;->UnfocusedNotEmpty:Landroidx/compose/material3/InputPhase;

    goto :goto_35

    .line 15
    :goto_37
    new-instance v9, Landroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$labelColor$1;

    invoke-direct {v9, v1, v12, v3, v2}, Landroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$labelColor$1;-><init>(Landroidx/compose/material3/TextFieldColors;ZZLandroidx/compose/foundation/interaction/InteractionSource;)V

    .line 16
    sget-object v5, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    const/4 v6, 0x6

    invoke-virtual {v5, v13, v6}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v7

    .line 17
    invoke-virtual {v7}, Landroidx/compose/material3/Typography;->getBodyLarge()Landroidx/compose/ui/text/TextStyle;

    move-result-object v23

    .line 18
    invoke-virtual {v7}, Landroidx/compose/material3/Typography;->getBodySmall()Landroidx/compose/ui/text/TextStyle;

    move-result-object v24

    .line 19
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v7

    sget-object v17, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v14

    invoke-static {v7, v8, v14, v15}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v7

    if-eqz v7, :cond_49

    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v7

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v14

    invoke-static {v7, v8, v14, v15}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v7

    if-eqz v7, :cond_4a

    .line 20
    :cond_49
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v7

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v14

    invoke-static {v7, v8, v14, v15}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v7

    if-nez v7, :cond_4b

    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v7

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v14

    invoke-static {v7, v8, v14, v15}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v7

    if-eqz v7, :cond_4b

    :cond_4a
    const/16 v22, 0x1

    goto :goto_38

    :cond_4b
    move/from16 v22, v0

    .line 21
    :goto_38
    sget-object v27, Landroidx/compose/material3/TextFieldTransitionScope;->INSTANCE:Landroidx/compose/material3/TextFieldTransitionScope;

    const v7, -0x26871a65

    .line 22
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 23
    invoke-virtual {v5, v13, v6}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/material3/Typography;->getBodySmall()Landroidx/compose/ui/text/TextStyle;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v7

    const v14, -0x26871a28

    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-eqz v22, :cond_4e

    .line 24
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v14

    cmp-long v14, v7, v14

    if-eqz v14, :cond_4c

    const/4 v14, 0x1

    goto :goto_39

    :cond_4c
    move v14, v0

    :goto_39
    if-eqz v14, :cond_4d

    goto :goto_3a

    .line 25
    :cond_4d
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v11, v13, v7}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v7

    :cond_4e
    :goto_3a
    move-wide/from16 v34, v7

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 26
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const v7, -0x268719a4

    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 27
    invoke-virtual {v5, v13, v6}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/material3/Typography;->getBodyLarge()Landroidx/compose/ui/text/TextStyle;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v5

    const v7, -0x26871967

    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-eqz v22, :cond_51

    .line 28
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v7

    cmp-long v7, v5, v7

    if-eqz v7, :cond_4f

    const/4 v7, 0x1

    goto :goto_3b

    :cond_4f
    move v7, v0

    :goto_3b
    if-eqz v7, :cond_50

    goto :goto_3c

    .line 29
    :cond_50
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v11, v13, v5}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v5

    :cond_51
    :goto_3c
    move-wide/from16 v36, v5

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 30
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    if-eqz p4, :cond_52

    const/4 v0, 0x1

    .line 31
    :cond_52
    new-instance v15, Landroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3;

    move-object v5, v15

    move-object/from16 v6, p4

    move-object/from16 v7, p16

    move v8, v12

    move-object/from16 v28, v9

    move v9, v3

    move-object/from16 v10, p14

    move-object/from16 v38, v11

    move-object/from16 v11, v26

    move/from16 v39, v12

    move-object/from16 v12, v16

    move-object v14, v13

    move-object/from16 v13, v31

    move-object v1, v14

    const/4 v2, 0x1

    move-object/from16 v14, v32

    move/from16 p5, v3

    move-object v3, v15

    move-object/from16 v15, v29

    move-object/from16 v16, v30

    move-object/from16 v17, v4

    move-object/from16 v18, p0

    move-object/from16 v19, p2

    move/from16 v20, v33

    move-object/from16 v21, p15

    move-object/from16 v25, p17

    invoke-direct/range {v5 .. v25}, Landroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3;-><init>(Lv3/p;Landroidx/compose/material3/TextFieldColors;ZZLandroidx/compose/foundation/interaction/InteractionSource;Lv3/p;Ljava/lang/String;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/TextFieldType;Lv3/p;ZLandroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Lv3/p;)V

    const v5, 0x4cf0ddc7    # 1.2628332E8f

    invoke-static {v1, v5, v2, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v14

    const/high16 v16, 0x1b0000

    move-object/from16 v6, v27

    move-object/from16 v7, v38

    move-wide/from16 v8, v34

    move-wide/from16 v10, v36

    move-object/from16 v12, v28

    move v13, v0

    move-object v15, v1

    .line 32
    invoke-virtual/range {v6 .. v16}, Landroidx/compose/material3/TextFieldTransitionScope;->Transition-DTcfvLk(Landroidx/compose/material3/InputPhase;JJLv3/q;ZLv3/u;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_53

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_53
    move/from16 v14, p5

    move-object v11, v4

    move-object/from16 v6, v26

    move-object/from16 v7, v29

    move-object/from16 v8, v30

    move-object/from16 v9, v31

    move-object/from16 v10, v32

    move/from16 v12, v33

    move/from16 v13, v39

    .line 33
    :goto_3d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-eqz v15, :cond_54

    new-instance v5, Landroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$4;

    move-object v0, v5

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v40, v5

    move-object/from16 v5, p4

    move-object/from16 v41, v15

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    invoke-direct/range {v0 .. v21}, Landroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$4;-><init>(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lv3/p;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lv3/p;III)V

    move-object/from16 v1, v40

    move-object/from16 v0, v41

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_54
    return-void
.end method

.method public static final Decoration-KTwxG1Y(JLandroidx/compose/ui/text/TextStyle;Lv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 8
    .param p2    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/text/TextStyle;",
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
    const v0, -0x5a9a5f29

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    and-int/lit8 v1, p6, 0x1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    or-int/lit8 v1, p5, 0x6

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    and-int/lit8 v1, p5, 0x6

    .line 16
    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    invoke-interface {p4, p0, p1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x2

    .line 28
    :goto_0
    or-int/2addr v1, p5

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move v1, p5

    .line 31
    :goto_1
    and-int/lit8 v2, p6, 0x2

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    or-int/lit8 v1, v1, 0x30

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    and-int/lit8 v3, p5, 0x30

    .line 39
    .line 40
    if-nez v3, :cond_5

    .line 41
    .line 42
    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    const/16 v3, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    const/16 v3, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v1, v3

    .line 54
    :cond_5
    :goto_3
    and-int/lit8 v3, p6, 0x4

    .line 55
    .line 56
    if-eqz v3, :cond_6

    .line 57
    .line 58
    or-int/lit16 v1, v1, 0x180

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_6
    and-int/lit16 v3, p5, 0x180

    .line 62
    .line 63
    if-nez v3, :cond_8

    .line 64
    .line 65
    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_7

    .line 70
    .line 71
    const/16 v3, 0x100

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_7
    const/16 v3, 0x80

    .line 75
    .line 76
    :goto_4
    or-int/2addr v1, v3

    .line 77
    :cond_8
    :goto_5
    and-int/lit16 v3, v1, 0x93

    .line 78
    .line 79
    const/16 v4, 0x92

    .line 80
    .line 81
    if-ne v3, v4, :cond_b

    .line 82
    .line 83
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_9

    .line 88
    .line 89
    goto :goto_7

    .line 90
    :cond_9
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 91
    .line 92
    .line 93
    :cond_a
    :goto_6
    move-object v4, p2

    .line 94
    goto :goto_9

    .line 95
    :cond_b
    :goto_7
    if-eqz v2, :cond_c

    .line 96
    .line 97
    const/4 p2, 0x0

    .line 98
    :cond_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_d

    .line 103
    .line 104
    const/4 v2, -0x1

    .line 105
    const-string v3, "androidx.compose.material3.Decoration (TextFieldImpl.kt:271)"

    .line 106
    .line 107
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_d
    new-instance v0, Landroidx/compose/material3/TextFieldImplKt$Decoration$contentWithColor$1;

    .line 111
    .line 112
    invoke-direct {v0, p0, p1, p3}, Landroidx/compose/material3/TextFieldImplKt$Decoration$contentWithColor$1;-><init>(JLv3/p;)V

    .line 113
    .line 114
    .line 115
    const v2, 0x56639ed9

    .line 116
    .line 117
    .line 118
    const/4 v3, 0x1

    .line 119
    invoke-static {p4, v2, v3, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz p2, :cond_e

    .line 124
    .line 125
    const v0, 0x6d1ab802

    .line 126
    .line 127
    .line 128
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 129
    .line 130
    .line 131
    and-int/lit8 v0, v1, 0xe

    .line 132
    .line 133
    and-int/lit8 v2, v1, 0x70

    .line 134
    .line 135
    or-int/2addr v0, v2

    .line 136
    and-int/lit16 v1, v1, 0x380

    .line 137
    .line 138
    or-int v6, v0, v1

    .line 139
    .line 140
    move-wide v1, p0

    .line 141
    move-object v3, p2

    .line 142
    move-object v4, p3

    .line 143
    move-object v5, p4

    .line 144
    invoke-static/range {v1 .. v6}, Landroidx/compose/material3/ProvideContentColorTextStyleKt;->ProvideContentColorTextStyle-3J-VO9M(JLandroidx/compose/ui/text/TextStyle;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 148
    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_e
    const v1, 0x6d1ab853

    .line 152
    .line 153
    .line 154
    invoke-interface {p4, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 155
    .line 156
    .line 157
    const/4 v1, 0x6

    .line 158
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-interface {v0, p4, v1}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 166
    .line 167
    .line 168
    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_a

    .line 173
    .line 174
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 175
    .line 176
    .line 177
    goto :goto_6

    .line 178
    :goto_9
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    if-eqz p2, :cond_f

    .line 183
    .line 184
    new-instance p4, Landroidx/compose/material3/TextFieldImplKt$Decoration$1;

    .line 185
    .line 186
    move-object v1, p4

    .line 187
    move-wide v2, p0

    .line 188
    move-object v5, p3

    .line 189
    move v6, p5

    .line 190
    move v7, p6

    .line 191
    invoke-direct/range {v1 .. v7}, Landroidx/compose/material3/TextFieldImplKt$Decoration$1;-><init>(JLandroidx/compose/ui/text/TextStyle;Lv3/p;II)V

    .line 192
    .line 193
    .line 194
    invoke-interface {p2, p4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 195
    .line 196
    .line 197
    :cond_f
    return-void
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

    new-instance p1, Landroidx/compose/material3/TextFieldImplKt$defaultErrorSemantics$1;

    invoke-direct {p1, p2}, Landroidx/compose/material3/TextFieldImplKt$defaultErrorSemantics$1;-><init>(Ljava/lang/String;)V

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

    sget v0, Landroidx/compose/material3/TextFieldImplKt;->HorizontalIconPadding:F

    return v0
.end method

.method public static final getIconDefaultSizeModifier()Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Landroidx/compose/material3/TextFieldImplKt;->IconDefaultSizeModifier:Landroidx/compose/ui/Modifier;

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

.method public static final getMinFocusedLabelLineHeight()F
    .locals 1

    sget v0, Landroidx/compose/material3/TextFieldImplKt;->MinFocusedLabelLineHeight:F

    return v0
.end method

.method public static final getMinSupportingTextLineHeight()F
    .locals 1

    sget v0, Landroidx/compose/material3/TextFieldImplKt;->MinSupportingTextLineHeight:F

    return v0
.end method

.method public static final getMinTextLineHeight()F
    .locals 1

    sget v0, Landroidx/compose/material3/TextFieldImplKt;->MinTextLineHeight:F

    return v0
.end method

.method public static final getPrefixSuffixTextPadding()F
    .locals 1

    sget v0, Landroidx/compose/material3/TextFieldImplKt;->PrefixSuffixTextPadding:F

    return v0
.end method

.method public static final getSupportingTopPadding()F
    .locals 1

    sget v0, Landroidx/compose/material3/TextFieldImplKt;->SupportingTopPadding:F

    return v0
.end method

.method public static final getTextFieldPadding()F
    .locals 1

    sget v0, Landroidx/compose/material3/TextFieldImplKt;->TextFieldPadding:F

    return v0
.end method

.method public static final getZeroConstraints()J
    .locals 2

    sget-wide v0, Landroidx/compose/material3/TextFieldImplKt;->ZeroConstraints:J

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
