.class public final Landroidx/compose/material/TextFieldKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u0093\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0015\u0008\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010 \u001a\u00020\u001f2\u0008\u0008\u0002\u0010\"\u001a\u00020!H\u0007\u00a2\u0006\u0004\u0008#\u0010$\u001a\u0089\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0015\u0008\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010 \u001a\u00020\u001f2\u0008\u0008\u0002\u0010\"\u001a\u00020!H\u0007\u00a2\u0006\u0004\u0008#\u0010%\u001a\u0093\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020&2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0015\u0008\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010 \u001a\u00020\u001f2\u0008\u0008\u0002\u0010\"\u001a\u00020!H\u0007\u00a2\u0006\u0004\u0008#\u0010\'\u001a\u0089\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020&2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0015\u0008\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010 \u001a\u00020\u001f2\u0008\u0008\u0002\u0010\"\u001a\u00020!H\u0007\u00a2\u0006\u0004\u0008#\u0010(\u001a\u009c\u0001\u00100\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00030\u000c\u00a2\u0006\u0002\u0008\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\r2\u0013\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001\u00a2\u0006\u0004\u00080\u00101\u001aB\u0010;\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u001a2\u0006\u00108\u001a\u000207H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u00089\u0010:\u001aZ\u0010E\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a2\u0006\u00108\u001a\u0002072\u0006\u0010B\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008C\u0010D\u001at\u0010Q\u001a\u00020\u0003*\u00020F2\u0006\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020I2\u0008\u0010K\u001a\u0004\u0018\u00010I2\u0008\u0010L\u001a\u0004\u0018\u00010I2\u0008\u0010M\u001a\u0004\u0018\u00010I2\u0008\u0010N\u001a\u0004\u0018\u00010I2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0002\u001aZ\u0010S\u001a\u00020\u0003*\u00020F2\u0006\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020I2\u0008\u0010L\u001a\u0004\u0018\u00010I2\u0008\u0010M\u001a\u0004\u0018\u00010I2\u0008\u0010N\u001a\u0004\u0018\u00010I2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010B\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002\u001a\u0014\u0010V\u001a\u00020\u0005*\u00020\u00052\u0006\u0010U\u001a\u00020TH\u0000\"\u001a\u0010X\u001a\u00020W8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[\"\u001a\u0010\\\u001a\u00020W8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\\\u0010Y\u001a\u0004\u0008]\u0010[\"\u001a\u0010^\u001a\u00020W8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008^\u0010Y\u001a\u0004\u0008_\u0010[\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006`"
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
        "Landroidx/compose/ui/text/TextStyle;",
        "textStyle",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "label",
        "placeholder",
        "leadingIcon",
        "trailingIcon",
        "isError",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "visualTransformation",
        "Landroidx/compose/foundation/text/KeyboardOptions;",
        "keyboardOptions",
        "Landroidx/compose/foundation/text/KeyboardActions;",
        "keyboardActions",
        "singleLine",
        "",
        "maxLines",
        "minLines",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "Landroidx/compose/ui/graphics/Shape;",
        "shape",
        "Landroidx/compose/material/TextFieldColors;",
        "colors",
        "TextField",
        "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V",
        "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V",
        "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V",
        "textField",
        "leading",
        "trailing",
        "",
        "animationProgress",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "paddingValues",
        "TextFieldLayout",
        "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/q;Lv3/p;Lv3/p;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V",
        "leadingWidth",
        "trailingWidth",
        "textFieldWidth",
        "labelWidth",
        "placeholderWidth",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "calculateWidth-VsPV1Ek",
        "(IIIIIJ)I",
        "calculateWidth",
        "textFieldHeight",
        "hasLabel",
        "labelBaseline",
        "leadingHeight",
        "trailingHeight",
        "placeholderHeight",
        "density",
        "calculateHeight-O3s9Psw",
        "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I",
        "calculateHeight",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "width",
        "height",
        "Landroidx/compose/ui/layout/Placeable;",
        "textfieldPlaceable",
        "labelPlaceable",
        "placeholderPlaceable",
        "leadingPlaceable",
        "trailingPlaceable",
        "labelEndPosition",
        "textPosition",
        "placeWithLabel",
        "textPlaceable",
        "placeWithoutLabel",
        "Landroidx/compose/foundation/BorderStroke;",
        "indicatorBorder",
        "drawIndicatorLine",
        "Landroidx/compose/ui/unit/Dp;",
        "FirstBaselineOffset",
        "F",
        "getFirstBaselineOffset",
        "()F",
        "TextFieldBottomPadding",
        "getTextFieldBottomPadding",
        "TextFieldTopPadding",
        "getTextFieldTopPadding",
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
        "SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,940:1\n74#2:941\n74#2:951\n74#2:959\n74#2:969\n74#2:987\n25#3:942\n25#3:952\n25#3:960\n25#3:970\n67#3,3:977\n66#3:980\n456#3,8:999\n464#3,3:1013\n456#3,8:1032\n464#3,3:1046\n467#3,3:1050\n456#3,8:1071\n464#3,3:1085\n467#3,3:1089\n456#3,8:1117\n464#3,3:1131\n467#3,3:1135\n456#3,8:1157\n464#3,3:1171\n467#3,3:1175\n467#3,3:1180\n1116#4,6:943\n1116#4,6:953\n1116#4,6:961\n1116#4,6:971\n1116#4,6:981\n658#5:949\n646#5:950\n658#5:967\n646#5:968\n79#6,11:988\n79#6,11:1021\n92#6:1053\n79#6,11:1060\n92#6:1092\n79#6,11:1106\n92#6:1138\n79#6,11:1146\n92#6:1178\n92#6:1183\n3737#7,6:1007\n3737#7,6:1040\n3737#7,6:1079\n3737#7,6:1125\n3737#7,6:1165\n69#8,5:1016\n74#8:1049\n78#8:1054\n69#8,5:1055\n74#8:1088\n78#8:1093\n68#8,6:1100\n74#8:1134\n78#8:1139\n68#8,6:1140\n74#8:1174\n78#8:1179\n58#9:1094\n58#9:1097\n154#10:1095\n211#10:1096\n154#10:1098\n211#10:1099\n154#10:1184\n154#10:1185\n154#10:1186\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n*L\n167#1:941\n244#1:951\n357#1:959\n433#1:969\n491#1:987\n179#1:942\n255#1:952\n369#1:960\n444#1:970\n488#1:977,3\n488#1:980\n492#1:999,8\n492#1:1013,3\n496#1:1032,8\n496#1:1046,3\n496#1:1050,3\n504#1:1071,8\n504#1:1085,3\n504#1:1089,3\n532#1:1117,8\n532#1:1131,3\n532#1:1135,3\n534#1:1157,8\n534#1:1171,3\n534#1:1175,3\n492#1:1180,3\n179#1:943,6\n255#1:953,6\n369#1:961,6\n444#1:971,6\n488#1:981,6\n185#1:949\n185#1:950\n374#1:967\n374#1:968\n492#1:988,11\n496#1:1021,11\n496#1:1053\n504#1:1060,11\n504#1:1092\n532#1:1106,11\n532#1:1138\n534#1:1146,11\n534#1:1178\n492#1:1183\n492#1:1007,6\n496#1:1040,6\n504#1:1079,6\n532#1:1125,6\n534#1:1165,6\n496#1:1016,5\n496#1:1049\n496#1:1054\n504#1:1055,5\n504#1:1088\n504#1:1093\n532#1:1100,6\n532#1:1134\n532#1:1139\n534#1:1140,6\n534#1:1174\n534#1:1179\n516#1:1094\n523#1:1097\n517#1:1095\n516#1:1096\n523#1:1098\n523#1:1099\n932#1:1184\n935#1:1185\n939#1:1186\n*E\n"
    }
.end annotation


# static fields
.field private static final FirstBaselineOffset:F

.field private static final TextFieldBottomPadding:F

.field private static final TextFieldTopPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x14

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
    sput v0, Landroidx/compose/material/TextFieldKt;->FirstBaselineOffset:F

    .line 9
    .line 10
    const/16 v0, 0xa

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
    sput v0, Landroidx/compose/material/TextFieldKt;->TextFieldBottomPadding:F

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    int-to-float v0, v0

    .line 21
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sput v0, Landroidx/compose/material/TextFieldKt;->TextFieldTopPadding:F

    .line 26
    .line 27
    return-void
    .line 28
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

.method public static final TextField(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V
    .locals 103
    .param p0    # Landroidx/compose/ui/text/input/TextFieldValue;
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
    .param p5    # Landroidx/compose/ui/text/TextStyle;
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
    .param p11    # Landroidx/compose/ui/text/input/VisualTransformation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/foundation/text/KeyboardOptions;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/text/KeyboardActions;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p17    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p18    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p19    # Landroidx/compose/material/TextFieldColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p20    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/ui/text/TextStyle;",
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
            ">;Z",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZII",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v15, p21

    move/from16 v14, p22

    move/from16 v13, p23

    const v0, -0x1567ba81

    move-object/from16 v1, p20

    .line 57
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v0

    and-int/lit8 v1, v13, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v15, 0x6

    move v4, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v15, 0xe

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, v15, 0x70

    if-nez v5, :cond_5

    move-object/from16 v5, p1

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v5, p1

    :goto_4
    and-int/lit8 v8, v13, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v11, v15, 0x380

    if-nez v11, :cond_8

    move-object/from16 v11, p2

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_5

    :cond_7
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v4, v12

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v11, p2

    :goto_7
    and-int/lit8 v12, v13, 0x8

    const/16 v16, 0x800

    const/16 v17, 0x400

    if-eqz v12, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v2, v15, 0x1c00

    if-nez v2, :cond_b

    move/from16 v2, p3

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v18, v16

    goto :goto_8

    :cond_a
    move/from16 v18, v17

    :goto_8
    or-int v4, v4, v18

    goto :goto_a

    :cond_b
    :goto_9
    move/from16 v2, p3

    :goto_a
    and-int/lit8 v18, v13, 0x10

    const/16 v19, 0x4000

    const v64, 0xe000

    const/16 v20, 0x2000

    if-eqz v18, :cond_c

    or-int/lit16 v4, v4, 0x6000

    move/from16 v3, p4

    goto :goto_c

    :cond_c
    and-int v21, v15, v64

    move/from16 v3, p4

    if-nez v21, :cond_e

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v22

    if-eqz v22, :cond_d

    move/from16 v22, v19

    goto :goto_b

    :cond_d
    move/from16 v22, v20

    :goto_b
    or-int v4, v4, v22

    :cond_e
    :goto_c
    const/high16 v22, 0x70000

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
    and-int/lit8 v24, v13, 0x40

    const/high16 v65, 0x380000

    const/high16 v25, 0x80000

    if-eqz v24, :cond_11

    const/high16 v26, 0x180000

    or-int v4, v4, v26

    move-object/from16 v7, p6

    goto :goto_10

    :cond_11
    and-int v26, v15, v65

    move-object/from16 v7, p6

    if-nez v26, :cond_13

    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_12

    const/high16 v27, 0x100000

    goto :goto_f

    :cond_12
    move/from16 v27, v25

    :goto_f
    or-int v4, v4, v27

    :cond_13
    :goto_10
    and-int/lit16 v9, v13, 0x80

    if-eqz v9, :cond_14

    const/high16 v28, 0xc00000

    or-int v4, v4, v28

    move-object/from16 v10, p7

    goto :goto_12

    :cond_14
    const/high16 v28, 0x1c00000

    and-int v28, v15, v28

    move-object/from16 v10, p7

    if-nez v28, :cond_16

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_15

    const/high16 v29, 0x800000

    goto :goto_11

    :cond_15
    const/high16 v29, 0x400000

    :goto_11
    or-int v4, v4, v29

    :cond_16
    :goto_12
    and-int/lit16 v1, v13, 0x100

    if-eqz v1, :cond_17

    const/high16 v29, 0x6000000

    or-int v4, v4, v29

    move-object/from16 v2, p8

    goto :goto_14

    :cond_17
    const/high16 v29, 0xe000000

    and-int v29, v15, v29

    move-object/from16 v2, p8

    if-nez v29, :cond_19

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_18

    const/high16 v29, 0x4000000

    goto :goto_13

    :cond_18
    const/high16 v29, 0x2000000

    :goto_13
    or-int v4, v4, v29

    :cond_19
    :goto_14
    and-int/lit16 v2, v13, 0x200

    if-eqz v2, :cond_1a

    const/high16 v29, 0x30000000

    or-int v4, v4, v29

    move-object/from16 v3, p9

    goto :goto_16

    :cond_1a
    const/high16 v29, 0x70000000

    and-int v29, v15, v29

    move-object/from16 v3, p9

    if-nez v29, :cond_1c

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_1b

    const/high16 v29, 0x20000000

    goto :goto_15

    :cond_1b
    const/high16 v29, 0x10000000

    :goto_15
    or-int v4, v4, v29

    :cond_1c
    :goto_16
    and-int/lit16 v3, v13, 0x400

    if-eqz v3, :cond_1d

    or-int/lit8 v21, v14, 0x6

    move/from16 v5, p10

    goto :goto_18

    :cond_1d
    and-int/lit8 v29, v14, 0xe

    move/from16 v5, p10

    if-nez v29, :cond_1f

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v29

    if-eqz v29, :cond_1e

    const/16 v21, 0x4

    goto :goto_17

    :cond_1e
    const/16 v21, 0x2

    :goto_17
    or-int v21, v14, v21

    goto :goto_18

    :cond_1f
    move/from16 v21, v14

    :goto_18
    and-int/lit16 v5, v13, 0x800

    if-eqz v5, :cond_20

    or-int/lit8 v21, v21, 0x30

    goto :goto_1a

    :cond_20
    and-int/lit8 v29, v14, 0x70

    move-object/from16 v6, p11

    if-nez v29, :cond_22

    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_21

    const/16 v26, 0x20

    goto :goto_19

    :cond_21
    const/16 v26, 0x10

    :goto_19
    or-int v21, v21, v26

    :cond_22
    :goto_1a
    move/from16 v6, v21

    and-int/lit16 v7, v13, 0x1000

    if-eqz v7, :cond_23

    or-int/lit16 v6, v6, 0x180

    goto :goto_1c

    :cond_23
    and-int/lit16 v10, v14, 0x380

    if-nez v10, :cond_25

    move-object/from16 v10, p12

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_24

    const/16 v27, 0x100

    goto :goto_1b

    :cond_24
    const/16 v27, 0x80

    :goto_1b
    or-int v6, v6, v27

    goto :goto_1d

    :cond_25
    :goto_1c
    move-object/from16 v10, p12

    :goto_1d
    and-int/lit16 v10, v14, 0x1c00

    if-nez v10, :cond_28

    and-int/lit16 v10, v13, 0x2000

    if-nez v10, :cond_26

    move-object/from16 v10, p13

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_27

    goto :goto_1e

    :cond_26
    move-object/from16 v10, p13

    :cond_27
    move/from16 v16, v17

    :goto_1e
    or-int v6, v6, v16

    goto :goto_1f

    :cond_28
    move-object/from16 v10, p13

    :goto_1f
    and-int/lit16 v10, v13, 0x4000

    if-eqz v10, :cond_29

    or-int/lit16 v6, v6, 0x6000

    move/from16 v11, p14

    goto :goto_21

    :cond_29
    and-int v16, v14, v64

    move/from16 v11, p14

    if-nez v16, :cond_2b

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_2a

    goto :goto_20

    :cond_2a
    move/from16 v19, v20

    :goto_20
    or-int v6, v6, v19

    :cond_2b
    :goto_21
    const/high16 v16, 0x70000

    and-int v16, v14, v16

    if-nez v16, :cond_2d

    const v16, 0x8000

    and-int v16, v13, v16

    move/from16 v11, p15

    if-nez v16, :cond_2c

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_2c

    const/high16 v16, 0x20000

    goto :goto_22

    :cond_2c
    move/from16 v16, v23

    :goto_22
    or-int v6, v6, v16

    goto :goto_23

    :cond_2d
    move/from16 v11, p15

    :goto_23
    and-int v16, v13, v23

    if-eqz v16, :cond_2e

    const/high16 v17, 0x180000

    or-int v6, v6, v17

    move/from16 v11, p16

    goto :goto_25

    :cond_2e
    and-int v17, v14, v65

    move/from16 v11, p16

    if-nez v17, :cond_30

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_2f

    const/high16 v17, 0x100000

    goto :goto_24

    :cond_2f
    move/from16 v17, v25

    :goto_24
    or-int v6, v6, v17

    :cond_30
    :goto_25
    const/high16 v17, 0x20000

    and-int v17, v13, v17

    if-eqz v17, :cond_31

    const/high16 v19, 0xc00000

    or-int v6, v6, v19

    move-object/from16 v11, p17

    goto :goto_27

    :cond_31
    const/high16 v19, 0x1c00000

    and-int v19, v14, v19

    move-object/from16 v11, p17

    if-nez v19, :cond_33

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_32

    const/high16 v19, 0x800000

    goto :goto_26

    :cond_32
    const/high16 v19, 0x400000

    :goto_26
    or-int v6, v6, v19

    :cond_33
    :goto_27
    const/high16 v19, 0xe000000

    and-int v19, v14, v19

    if-nez v19, :cond_35

    const/high16 v19, 0x40000

    and-int v19, v13, v19

    move-object/from16 v11, p18

    if-nez v19, :cond_34

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_34

    const/high16 v19, 0x4000000

    goto :goto_28

    :cond_34
    const/high16 v19, 0x2000000

    :goto_28
    or-int v6, v6, v19

    goto :goto_29

    :cond_35
    move-object/from16 v11, p18

    :goto_29
    const/high16 v19, 0x70000000

    and-int v19, v14, v19

    if-nez v19, :cond_37

    and-int v19, v13, v25

    move-object/from16 v11, p19

    if-nez v19, :cond_36

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_36

    const/high16 v19, 0x20000000

    goto :goto_2a

    :cond_36
    const/high16 v19, 0x10000000

    :goto_2a
    or-int v6, v6, v19

    goto :goto_2b

    :cond_37
    move-object/from16 v11, p19

    :goto_2b
    const v19, 0x5b6db6db

    and-int v11, v4, v19

    const v14, 0x12492492

    if-ne v11, v14, :cond_39

    const v11, 0x5b6db6db

    and-int/2addr v11, v6

    const v14, 0x12492492

    if-ne v11, v14, :cond_39

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v11

    if-nez v11, :cond_38

    goto :goto_2c

    .line 58
    :cond_38
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    goto/16 :goto_45

    .line 59
    :cond_39
    :goto_2c
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v11, v15, 0x1

    const v19, -0x70001

    if-eqz v11, :cond_40

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v11

    if-eqz v11, :cond_3a

    goto :goto_2d

    .line 60
    :cond_3a
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v1, v13, 0x20

    if-eqz v1, :cond_3b

    and-int v4, v4, v19

    :cond_3b
    and-int/lit16 v1, v13, 0x2000

    if-eqz v1, :cond_3c

    and-int/lit16 v6, v6, -0x1c01

    :cond_3c
    const v1, 0x8000

    and-int/2addr v1, v13

    if-eqz v1, :cond_3d

    and-int v6, v6, v19

    :cond_3d
    const/high16 v1, 0x40000

    and-int/2addr v1, v13

    if-eqz v1, :cond_3e

    const v1, -0xe000001

    and-int/2addr v6, v1

    :cond_3e
    and-int v1, v13, v25

    if-eqz v1, :cond_3f

    const v1, -0x70000001

    and-int/2addr v6, v1

    :cond_3f
    move-object/from16 v8, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v14, p5

    move-object/from16 v66, p6

    move-object/from16 v9, p7

    move-object/from16 v1, p8

    move-object/from16 v2, p9

    move/from16 v3, p10

    move-object/from16 v5, p11

    move-object/from16 v7, p12

    move/from16 v10, p14

    move/from16 p14, p15

    move/from16 v67, p16

    move-object/from16 v36, p17

    move-object/from16 v13, p18

    move-object/from16 v15, p19

    move-object/from16 p15, p13

    move/from16 v102, v6

    move v6, v4

    move/from16 v4, v102

    goto/16 :goto_41

    :cond_40
    :goto_2d
    if-eqz v8, :cond_41

    .line 61
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_2e

    :cond_41
    move-object/from16 v8, p2

    :goto_2e
    if-eqz v12, :cond_42

    const/4 v11, 0x1

    goto :goto_2f

    :cond_42
    move/from16 v11, p3

    :goto_2f
    if-eqz v18, :cond_43

    const/4 v12, 0x0

    goto :goto_30

    :cond_43
    move/from16 v12, p4

    :goto_30
    and-int/lit8 v18, v13, 0x20

    if-eqz v18, :cond_44

    .line 62
    invoke-static {}, Landroidx/compose/material/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v14

    .line 63
    invoke-interface {v0, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/compose/ui/text/TextStyle;

    and-int v4, v4, v19

    goto :goto_31

    :cond_44
    move-object/from16 v14, p5

    :goto_31
    if-eqz v24, :cond_45

    const/16 v66, 0x0

    goto :goto_32

    :cond_45
    move-object/from16 v66, p6

    :goto_32
    if-eqz v9, :cond_46

    const/4 v9, 0x0

    goto :goto_33

    :cond_46
    move-object/from16 v9, p7

    :goto_33
    if-eqz v1, :cond_47

    const/4 v1, 0x0

    goto :goto_34

    :cond_47
    move-object/from16 v1, p8

    :goto_34
    if-eqz v2, :cond_48

    const/4 v2, 0x0

    goto :goto_35

    :cond_48
    move-object/from16 v2, p9

    :goto_35
    if-eqz v3, :cond_49

    const/4 v3, 0x0

    goto :goto_36

    :cond_49
    move/from16 v3, p10

    :goto_36
    if-eqz v5, :cond_4a

    .line 64
    sget-object v5, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v5

    goto :goto_37

    :cond_4a
    move-object/from16 v5, p11

    :goto_37
    if-eqz v7, :cond_4b

    .line 65
    sget-object v7, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v7}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v7

    goto :goto_38

    :cond_4b
    move-object/from16 v7, p12

    :goto_38
    move-object/from16 p2, v1

    and-int/lit16 v1, v13, 0x2000

    if-eqz v1, :cond_4c

    .line 66
    new-instance v1, Landroidx/compose/foundation/text/KeyboardActions;

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x3f

    const/16 v27, 0x0

    move-object/from16 p3, v1

    move-object/from16 p4, v18

    move-object/from16 p5, v20

    move-object/from16 p6, v21

    move-object/from16 p7, v22

    move-object/from16 p8, v23

    move-object/from16 p9, v24

    move/from16 p10, v26

    move-object/from16 p11, v27

    invoke-direct/range {p3 .. p11}, Landroidx/compose/foundation/text/KeyboardActions;-><init>(Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;ILkotlin/jvm/internal/w;)V

    and-int/lit16 v6, v6, -0x1c01

    goto :goto_39

    :cond_4c
    move-object/from16 v1, p13

    :goto_39
    if-eqz v10, :cond_4d

    const/4 v10, 0x0

    goto :goto_3a

    :cond_4d
    move/from16 v10, p14

    :goto_3a
    const v18, 0x8000

    and-int v18, v13, v18

    if-eqz v18, :cond_4f

    if-eqz v10, :cond_4e

    const/16 v18, 0x1

    goto :goto_3b

    :cond_4e
    const v18, 0x7fffffff

    :goto_3b
    and-int v6, v6, v19

    move/from16 v102, v18

    move/from16 v18, v6

    move/from16 v6, v102

    goto :goto_3c

    :cond_4f
    move/from16 v18, v6

    move/from16 v6, p15

    :goto_3c
    if-eqz v16, :cond_50

    const/16 v67, 0x1

    goto :goto_3d

    :cond_50
    move/from16 v67, p16

    :goto_3d
    move-object/from16 p3, v1

    if-eqz v17, :cond_52

    const v1, -0x1d58f75c

    .line 67
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 68
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 69
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p4, v2

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_51

    .line 70
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v1

    .line 71
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 72
    :cond_51
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v1, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    goto :goto_3e

    :cond_52
    move-object/from16 p4, v2

    move-object/from16 v1, p17

    :goto_3e
    const/high16 v2, 0x40000

    and-int/2addr v2, v13

    if-eqz v2, :cond_53

    .line 73
    sget-object v2, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    move-object/from16 p5, v1

    const/4 v1, 0x6

    invoke-virtual {v2, v0, v1}, Landroidx/compose/material/TextFieldDefaults;->getTextFieldShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v2

    const v1, -0xe000001

    and-int v1, v18, v1

    goto :goto_3f

    :cond_53
    move-object/from16 p5, v1

    move-object/from16 v2, p18

    move/from16 v1, v18

    :goto_3f
    and-int v16, v13, v25

    if-eqz v16, :cond_54

    .line 74
    sget-object v16, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x30

    const v63, 0x1fffff

    move-object/from16 v59, v0

    invoke-virtual/range {v16 .. v63}, Landroidx/compose/material/TextFieldDefaults;->textFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v16

    const v17, -0x70000001

    and-int v1, v1, v17

    move-object/from16 p15, p3

    move-object/from16 v36, p5

    move-object v13, v2

    move/from16 p14, v6

    move-object/from16 v15, v16

    goto :goto_40

    :cond_54
    move-object/from16 p15, p3

    move-object/from16 v36, p5

    move-object/from16 v15, p19

    move-object v13, v2

    move/from16 p14, v6

    :goto_40
    move-object/from16 v2, p4

    move v6, v4

    move v4, v1

    move-object/from16 v1, p2

    :goto_41
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v16

    move-object/from16 p16, v7

    if-eqz v16, :cond_55

    const v7, -0x1567ba81

    move/from16 p17, v12

    const-string v12, "androidx.compose.material.TextField (TextField.kt:371)"

    .line 75
    invoke-static {v7, v6, v4, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_42

    :cond_55
    move/from16 p17, v12

    :goto_42
    const v7, -0x31a6d89c

    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 76
    invoke-virtual {v14}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v16

    .line 77
    sget-object v7, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v18

    cmp-long v7, v16, v18

    if-eqz v7, :cond_56

    const/4 v7, 0x1

    goto :goto_43

    :cond_56
    const/4 v7, 0x0

    :goto_43
    if-eqz v7, :cond_57

    goto :goto_44

    :cond_57
    shr-int/lit8 v7, v6, 0x9

    and-int/lit8 v7, v7, 0xe

    shr-int/lit8 v12, v4, 0x18

    and-int/lit8 v12, v12, 0x70

    or-int/2addr v7, v12

    .line 78
    invoke-interface {v15, v11, v0, v7}, Landroidx/compose/material/TextFieldColors;->textColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v7

    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v16

    :goto_44
    move-wide/from16 v69, v16

    .line 79
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 80
    new-instance v7, Landroidx/compose/ui/text/TextStyle;

    move-object/from16 v68, v7

    const-wide/16 v71, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const-wide/16 v78, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const-wide/16 v83, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const-wide/16 v90, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const v98, 0xfffffe

    const/16 v99, 0x0

    invoke-direct/range {v68 .. v99}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/w;)V

    invoke-virtual {v14, v7}, Landroidx/compose/ui/text/TextStyle;->merge(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v21

    .line 81
    sget-object v7, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    shr-int/lit8 v12, v6, 0x9

    and-int/lit8 v12, v12, 0xe

    shr-int/lit8 v16, v4, 0x18

    and-int/lit8 v16, v16, 0x70

    or-int v12, v12, v16

    .line 82
    invoke-interface {v15, v11, v0, v12}, Landroidx/compose/material/TextFieldColors;->backgroundColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v12

    invoke-interface {v12}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/ui/graphics/Color;

    move-object/from16 p18, v1

    move-object/from16 p19, v2

    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v1

    invoke-static {v8, v1, v2, v13}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x30

    const/16 v18, 0x0

    move-object/from16 p2, v7

    move-object/from16 p3, v1

    move/from16 p4, v11

    move/from16 p5, v3

    move-object/from16 p6, v36

    move-object/from16 p7, v15

    move/from16 p8, v2

    move/from16 p9, v12

    move/from16 p10, v17

    move-object/from16 p11, v18

    .line 83
    invoke-static/range {p2 .. p11}, Landroidx/compose/material/TextFieldDefaults;->indicatorLine-gv0btCI$default(Landroidx/compose/material/TextFieldDefaults;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 84
    sget-object v2, Landroidx/compose/material/Strings;->Companion:Landroidx/compose/material/Strings$Companion;

    invoke-virtual {v2}, Landroidx/compose/material/Strings$Companion;->getDefaultErrorMessage-UdPEhr4()I

    move-result v2

    const/4 v12, 0x6

    invoke-static {v2, v0, v12}, Landroidx/compose/material/Strings_androidKt;->getString-4foXLRw(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Landroidx/compose/material/TextFieldImplKt;->defaultErrorSemantics(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 85
    invoke-virtual {v7}, Landroidx/compose/material/TextFieldDefaults;->getMinWidth-D9Ej5fM()F

    move-result v2

    .line 86
    invoke-virtual {v7}, Landroidx/compose/material/TextFieldDefaults;->getMinHeight-D9Ej5fM()F

    move-result v7

    .line 87
    invoke-static {v1, v2, v7}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v18

    .line 88
    new-instance v1, Landroidx/compose/ui/graphics/SolidColor;

    move-object/from16 v30, v1

    and-int/lit8 v2, v4, 0xe

    or-int v2, v2, v16

    invoke-interface {v15, v3, v0, v2}, Landroidx/compose/material/TextFieldColors;->cursorColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Color;

    move-object v12, v8

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v7

    const/4 v2, 0x0

    invoke-direct {v1, v7, v8, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/w;)V

    const/16 v28, 0x0

    .line 89
    new-instance v1, Landroidx/compose/material/TextFieldKt$TextField$7;

    move-object/from16 p2, v1

    move-object/from16 p3, p0

    move/from16 p5, v10

    move-object/from16 p6, v5

    move-object/from16 p7, v36

    move/from16 p8, v3

    move-object/from16 p9, v66

    move-object/from16 p10, v9

    move-object/from16 p11, p18

    move-object/from16 p12, p19

    move-object/from16 p13, v15

    invoke-direct/range {p2 .. p13}, Landroidx/compose/material/TextFieldKt$TextField$7;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material/TextFieldColors;)V

    const v2, -0x78c634b

    const/4 v7, 0x1

    invoke-static {v0, v2, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v31

    and-int/lit8 v1, v6, 0xe

    and-int/lit8 v2, v6, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v6, 0x1c00

    or-int/2addr v1, v2

    and-int v2, v6, v64

    or-int/2addr v1, v2

    shl-int/lit8 v2, v4, 0xc

    and-int v6, v2, v65

    or-int/2addr v1, v6

    const/high16 v6, 0x1c00000

    and-int/2addr v6, v2

    or-int/2addr v1, v6

    const/high16 v6, 0xe000000

    and-int/2addr v6, v2

    or-int/2addr v1, v6

    const/high16 v6, 0x70000000

    and-int/2addr v2, v6

    or-int v33, v1, v2

    shr-int/lit8 v1, v4, 0x12

    and-int/lit8 v1, v1, 0xe

    const/high16 v2, 0x30000

    or-int/2addr v1, v2

    and-int/lit8 v2, v4, 0x70

    or-int/2addr v1, v2

    shr-int/lit8 v2, v4, 0xc

    and-int/lit16 v2, v2, 0x1c00

    or-int v34, v1, v2

    const/16 v35, 0x1000

    move-object/from16 v16, p0

    move-object/from16 v17, p1

    move/from16 v19, v11

    move/from16 v20, p17

    move-object/from16 v22, p16

    move-object/from16 v23, p15

    move/from16 v24, v10

    move/from16 v25, p14

    move/from16 v26, v67

    move-object/from16 v27, v5

    move-object/from16 v29, v36

    move-object/from16 v32, v0

    .line 90
    invoke-static/range {v16 .. v35}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lv3/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lv3/q;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_58

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_58
    move/from16 v16, p14

    move-object v8, v9

    move v4, v11

    move-object/from16 v19, v13

    move-object v6, v14

    move-object/from16 v20, v15

    move-object/from16 v18, v36

    move-object/from16 v7, v66

    move/from16 v17, v67

    move-object/from16 v14, p15

    move-object/from16 v13, p16

    move-object/from16 v9, p18

    move v11, v3

    move v15, v10

    move-object v3, v12

    move-object/from16 v10, p19

    move-object v12, v5

    move/from16 v5, p17

    .line 91
    :goto_45
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-eqz v2, :cond_59

    new-instance v1, Landroidx/compose/material/TextFieldKt$TextField$8;

    move-object v0, v1

    move-object/from16 v100, v1

    move-object/from16 v1, p0

    move-object/from16 v101, v2

    move-object/from16 v2, p1

    move/from16 v21, p21

    move/from16 v22, p22

    move/from16 v23, p23

    invoke-direct/range {v0 .. v23}, Landroidx/compose/material/TextFieldKt$TextField$8;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;III)V

    move-object/from16 v1, v100

    move-object/from16 v0, v101

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_59
    return-void
.end method

.method public static final synthetic TextField(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V
    .locals 73
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Maintained for binary compatibility. Use version with minLines instead"
    .end annotation

    move/from16 v15, p20

    move/from16 v14, p21

    move/from16 v13, p22

    const v0, -0x5df95b24

    move-object/from16 v1, p19

    .line 92
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v0

    and-int/lit8 v1, v13, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v15, 0x6

    move v4, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v15, 0xe

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, v15, 0x70

    if-nez v5, :cond_5

    move-object/from16 v5, p1

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v5, p1

    :goto_4
    and-int/lit8 v8, v13, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v11, v15, 0x380

    if-nez v11, :cond_8

    move-object/from16 v11, p2

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_5

    :cond_7
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v4, v12

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v11, p2

    :goto_7
    and-int/lit8 v12, v13, 0x8

    const/16 v16, 0x800

    const/16 v17, 0x400

    if-eqz v12, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v2, v15, 0x1c00

    if-nez v2, :cond_b

    move/from16 v2, p3

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v18, v16

    goto :goto_8

    :cond_a
    move/from16 v18, v17

    :goto_8
    or-int v4, v4, v18

    goto :goto_a

    :cond_b
    :goto_9
    move/from16 v2, p3

    :goto_a
    and-int/lit8 v18, v13, 0x10

    const/16 v19, 0x4000

    const v64, 0xe000

    const/16 v20, 0x2000

    if-eqz v18, :cond_c

    or-int/lit16 v4, v4, 0x6000

    move/from16 v3, p4

    goto :goto_c

    :cond_c
    and-int v21, v15, v64

    move/from16 v3, p4

    if-nez v21, :cond_e

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v22

    if-eqz v22, :cond_d

    move/from16 v22, v19

    goto :goto_b

    :cond_d
    move/from16 v22, v20

    :goto_b
    or-int v4, v4, v22

    :cond_e
    :goto_c
    const/high16 v65, 0x70000

    and-int v22, v15, v65

    const/high16 v23, 0x20000

    if-nez v22, :cond_10

    and-int/lit8 v22, v13, 0x20

    move-object/from16 v6, p5

    if-nez v22, :cond_f

    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    move/from16 v24, v23

    goto :goto_d

    :cond_f
    const/high16 v24, 0x10000

    :goto_d
    or-int v4, v4, v24

    goto :goto_e

    :cond_10
    move-object/from16 v6, p5

    :goto_e
    and-int/lit8 v24, v13, 0x40

    if-eqz v24, :cond_11

    const/high16 v25, 0x180000

    or-int v4, v4, v25

    move-object/from16 v7, p6

    goto :goto_10

    :cond_11
    const/high16 v25, 0x380000

    and-int v25, v15, v25

    move-object/from16 v7, p6

    if-nez v25, :cond_13

    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_12

    const/high16 v26, 0x100000

    goto :goto_f

    :cond_12
    const/high16 v26, 0x80000

    :goto_f
    or-int v4, v4, v26

    :cond_13
    :goto_10
    and-int/lit16 v9, v13, 0x80

    const/high16 v66, 0x1c00000

    if-eqz v9, :cond_14

    const/high16 v27, 0xc00000

    or-int v4, v4, v27

    move-object/from16 v10, p7

    goto :goto_12

    :cond_14
    and-int v27, v15, v66

    move-object/from16 v10, p7

    if-nez v27, :cond_16

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_15

    const/high16 v28, 0x800000

    goto :goto_11

    :cond_15
    const/high16 v28, 0x400000

    :goto_11
    or-int v4, v4, v28

    :cond_16
    :goto_12
    and-int/lit16 v1, v13, 0x100

    const/high16 v67, 0xe000000

    if-eqz v1, :cond_17

    const/high16 v28, 0x6000000

    or-int v4, v4, v28

    move-object/from16 v2, p8

    goto :goto_14

    :cond_17
    and-int v28, v15, v67

    move-object/from16 v2, p8

    if-nez v28, :cond_19

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_18

    const/high16 v28, 0x4000000

    goto :goto_13

    :cond_18
    const/high16 v28, 0x2000000

    :goto_13
    or-int v4, v4, v28

    :cond_19
    :goto_14
    and-int/lit16 v2, v13, 0x200

    if-eqz v2, :cond_1a

    const/high16 v28, 0x30000000

    or-int v4, v4, v28

    move-object/from16 v3, p9

    goto :goto_16

    :cond_1a
    const/high16 v28, 0x70000000

    and-int v28, v15, v28

    move-object/from16 v3, p9

    if-nez v28, :cond_1c

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_1b

    const/high16 v28, 0x20000000

    goto :goto_15

    :cond_1b
    const/high16 v28, 0x10000000

    :goto_15
    or-int v4, v4, v28

    :cond_1c
    :goto_16
    and-int/lit16 v3, v13, 0x400

    if-eqz v3, :cond_1d

    or-int/lit8 v21, v14, 0x6

    move/from16 v5, p10

    goto :goto_18

    :cond_1d
    and-int/lit8 v28, v14, 0xe

    move/from16 v5, p10

    if-nez v28, :cond_1f

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v28

    if-eqz v28, :cond_1e

    const/16 v21, 0x4

    goto :goto_17

    :cond_1e
    const/16 v21, 0x2

    :goto_17
    or-int v21, v14, v21

    goto :goto_18

    :cond_1f
    move/from16 v21, v14

    :goto_18
    and-int/lit16 v5, v13, 0x800

    if-eqz v5, :cond_20

    or-int/lit8 v21, v21, 0x30

    goto :goto_1a

    :cond_20
    and-int/lit8 v28, v14, 0x70

    move-object/from16 v6, p11

    if-nez v28, :cond_22

    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_21

    const/16 v25, 0x20

    goto :goto_19

    :cond_21
    const/16 v25, 0x10

    :goto_19
    or-int v21, v21, v25

    :cond_22
    :goto_1a
    move/from16 v6, v21

    and-int/lit16 v7, v13, 0x1000

    if-eqz v7, :cond_23

    or-int/lit16 v6, v6, 0x180

    goto :goto_1c

    :cond_23
    and-int/lit16 v10, v14, 0x380

    if-nez v10, :cond_25

    move-object/from16 v10, p12

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_24

    const/16 v26, 0x100

    goto :goto_1b

    :cond_24
    const/16 v26, 0x80

    :goto_1b
    or-int v6, v6, v26

    goto :goto_1d

    :cond_25
    :goto_1c
    move-object/from16 v10, p12

    :goto_1d
    and-int/lit16 v10, v14, 0x1c00

    if-nez v10, :cond_28

    and-int/lit16 v10, v13, 0x2000

    if-nez v10, :cond_26

    move-object/from16 v10, p13

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_27

    goto :goto_1e

    :cond_26
    move-object/from16 v10, p13

    :cond_27
    move/from16 v16, v17

    :goto_1e
    or-int v6, v6, v16

    goto :goto_1f

    :cond_28
    move-object/from16 v10, p13

    :goto_1f
    and-int/lit16 v10, v13, 0x4000

    if-eqz v10, :cond_29

    or-int/lit16 v6, v6, 0x6000

    move/from16 v11, p14

    goto :goto_21

    :cond_29
    and-int v16, v14, v64

    move/from16 v11, p14

    if-nez v16, :cond_2b

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_2a

    goto :goto_20

    :cond_2a
    move/from16 v19, v20

    :goto_20
    or-int v6, v6, v19

    :cond_2b
    :goto_21
    const v16, 0x8000

    and-int v16, v13, v16

    if-eqz v16, :cond_2c

    const/high16 v17, 0x30000

    or-int v6, v6, v17

    move/from16 v11, p15

    goto :goto_23

    :cond_2c
    and-int v17, v14, v65

    move/from16 v11, p15

    if-nez v17, :cond_2e

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_2d

    move/from16 v17, v23

    goto :goto_22

    :cond_2d
    const/high16 v17, 0x10000

    :goto_22
    or-int v6, v6, v17

    :cond_2e
    :goto_23
    const/high16 v17, 0x10000

    and-int v17, v13, v17

    if-eqz v17, :cond_2f

    const/high16 v19, 0x180000

    or-int v6, v6, v19

    move-object/from16 v11, p16

    goto :goto_25

    :cond_2f
    const/high16 v19, 0x380000

    and-int v19, v14, v19

    move-object/from16 v11, p16

    if-nez v19, :cond_31

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_30

    const/high16 v19, 0x100000

    goto :goto_24

    :cond_30
    const/high16 v19, 0x80000

    :goto_24
    or-int v6, v6, v19

    :cond_31
    :goto_25
    and-int v19, v14, v66

    if-nez v19, :cond_33

    and-int v19, v13, v23

    move-object/from16 v11, p17

    if-nez v19, :cond_32

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_32

    const/high16 v19, 0x800000

    goto :goto_26

    :cond_32
    const/high16 v19, 0x400000

    :goto_26
    or-int v6, v6, v19

    goto :goto_27

    :cond_33
    move-object/from16 v11, p17

    :goto_27
    and-int v19, v14, v67

    if-nez v19, :cond_35

    const/high16 v19, 0x40000

    and-int v19, v13, v19

    move-object/from16 v11, p18

    if-nez v19, :cond_34

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_34

    const/high16 v19, 0x4000000

    goto :goto_28

    :cond_34
    const/high16 v19, 0x2000000

    :goto_28
    or-int v6, v6, v19

    goto :goto_29

    :cond_35
    move-object/from16 v11, p18

    :goto_29
    const v19, 0x5b6db6db

    and-int v11, v4, v19

    const v14, 0x12492492

    if-ne v11, v14, :cond_37

    const v11, 0xb6db6db

    and-int/2addr v11, v6

    const v14, 0x2492492

    if-ne v11, v14, :cond_37

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v11

    if-nez v11, :cond_36

    goto :goto_2a

    .line 93
    :cond_36
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 p19, v0

    goto/16 :goto_3f

    .line 94
    :cond_37
    :goto_2a
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v11, v15, 0x1

    if-eqz v11, :cond_3d

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v11

    if-eqz v11, :cond_38

    goto :goto_2b

    .line 95
    :cond_38
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v1, v13, 0x20

    if-eqz v1, :cond_39

    const v1, -0x70001

    and-int/2addr v4, v1

    :cond_39
    and-int/lit16 v1, v13, 0x2000

    if-eqz v1, :cond_3a

    and-int/lit16 v6, v6, -0x1c01

    :cond_3a
    and-int v1, v13, v23

    if-eqz v1, :cond_3b

    const v1, -0x1c00001

    and-int/2addr v6, v1

    :cond_3b
    const/high16 v1, 0x40000

    and-int/2addr v1, v13

    if-eqz v1, :cond_3c

    const v1, -0xe000001

    and-int/2addr v6, v1

    :cond_3c
    move-object/from16 v8, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v14, p5

    move-object/from16 v68, p6

    move-object/from16 v9, p7

    move-object/from16 v1, p8

    move-object/from16 v2, p9

    move/from16 v3, p10

    move-object/from16 v5, p11

    move-object/from16 v7, p12

    move/from16 v10, p14

    move/from16 v69, p15

    move-object/from16 v40, p17

    move-object/from16 v41, p18

    move v13, v4

    move v15, v6

    move-object/from16 v4, p13

    move-object/from16 v6, p16

    goto/16 :goto_3d

    :cond_3d
    :goto_2b
    if-eqz v8, :cond_3e

    .line 96
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_2c

    :cond_3e
    move-object/from16 v8, p2

    :goto_2c
    if-eqz v12, :cond_3f

    const/4 v11, 0x1

    goto :goto_2d

    :cond_3f
    move/from16 v11, p3

    :goto_2d
    if-eqz v18, :cond_40

    const/4 v12, 0x0

    goto :goto_2e

    :cond_40
    move/from16 v12, p4

    :goto_2e
    and-int/lit8 v14, v13, 0x20

    if-eqz v14, :cond_41

    .line 97
    invoke-static {}, Landroidx/compose/material/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v14

    .line 98
    invoke-interface {v0, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/compose/ui/text/TextStyle;

    const v18, -0x70001

    and-int v4, v4, v18

    goto :goto_2f

    :cond_41
    move-object/from16 v14, p5

    :goto_2f
    const/16 v18, 0x0

    if-eqz v24, :cond_42

    move-object/from16 v68, v18

    goto :goto_30

    :cond_42
    move-object/from16 v68, p6

    :goto_30
    if-eqz v9, :cond_43

    move-object/from16 v9, v18

    goto :goto_31

    :cond_43
    move-object/from16 v9, p7

    :goto_31
    if-eqz v1, :cond_44

    move-object/from16 v1, v18

    goto :goto_32

    :cond_44
    move-object/from16 v1, p8

    :goto_32
    if-eqz v2, :cond_45

    move-object/from16 v2, v18

    goto :goto_33

    :cond_45
    move-object/from16 v2, p9

    :goto_33
    if-eqz v3, :cond_46

    const/4 v3, 0x0

    goto :goto_34

    :cond_46
    move/from16 v3, p10

    :goto_34
    if-eqz v5, :cond_47

    .line 99
    sget-object v5, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v5

    goto :goto_35

    :cond_47
    move-object/from16 v5, p11

    :goto_35
    if-eqz v7, :cond_48

    .line 100
    sget-object v7, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v7}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v7

    goto :goto_36

    :cond_48
    move-object/from16 v7, p12

    :goto_36
    move-object/from16 p2, v1

    and-int/lit16 v1, v13, 0x2000

    if-eqz v1, :cond_49

    .line 101
    new-instance v1, Landroidx/compose/foundation/text/KeyboardActions;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x3f

    const/16 v26, 0x0

    move-object/from16 p3, v1

    move-object/from16 p4, v18

    move-object/from16 p5, v19

    move-object/from16 p6, v20

    move-object/from16 p7, v21

    move-object/from16 p8, v22

    move-object/from16 p9, v24

    move/from16 p10, v25

    move-object/from16 p11, v26

    invoke-direct/range {p3 .. p11}, Landroidx/compose/foundation/text/KeyboardActions;-><init>(Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;ILkotlin/jvm/internal/w;)V

    and-int/lit16 v6, v6, -0x1c01

    goto :goto_37

    :cond_49
    move-object/from16 v1, p13

    :goto_37
    if-eqz v10, :cond_4a

    const/4 v10, 0x0

    goto :goto_38

    :cond_4a
    move/from16 v10, p14

    :goto_38
    if-eqz v16, :cond_4b

    const v16, 0x7fffffff

    move/from16 v69, v16

    goto :goto_39

    :cond_4b
    move/from16 v69, p15

    :goto_39
    move-object/from16 p3, v1

    if-eqz v17, :cond_4d

    const v1, -0x1d58f75c

    .line 102
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 103
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 104
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p4, v2

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_4c

    .line 105
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v1

    .line 106
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 107
    :cond_4c
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v1, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    goto :goto_3a

    :cond_4d
    move-object/from16 p4, v2

    move-object/from16 v1, p16

    :goto_3a
    and-int v2, v13, v23

    if-eqz v2, :cond_4e

    .line 108
    sget-object v2, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    move-object/from16 p5, v1

    const/4 v1, 0x6

    invoke-virtual {v2, v0, v1}, Landroidx/compose/material/TextFieldDefaults;->getTextFieldShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v1

    const v2, -0x1c00001

    and-int/2addr v2, v6

    move v6, v2

    goto :goto_3b

    :cond_4e
    move-object/from16 p5, v1

    move-object/from16 v1, p17

    :goto_3b
    const/high16 v2, 0x40000

    and-int/2addr v2, v13

    if-eqz v2, :cond_4f

    .line 109
    sget-object v16, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x30

    const v63, 0x1fffff

    move-object/from16 v59, v0

    invoke-virtual/range {v16 .. v63}, Landroidx/compose/material/TextFieldDefaults;->textFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v2

    const v16, -0xe000001

    and-int v6, v6, v16

    move-object/from16 v40, v1

    move-object/from16 v41, v2

    move v13, v4

    move v15, v6

    move-object/from16 v1, p2

    move-object/from16 v4, p3

    move-object/from16 v2, p4

    goto :goto_3c

    :cond_4f
    move-object/from16 v2, p4

    move-object/from16 v41, p18

    move-object/from16 v40, v1

    move v13, v4

    move v15, v6

    move-object/from16 v1, p2

    move-object/from16 v4, p3

    :goto_3c
    move-object/from16 v6, p5

    :goto_3d
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v16

    move-object/from16 p19, v0

    if-eqz v16, :cond_50

    const v0, -0x5df95b24

    move-object/from16 p2, v6

    const-string v6, "androidx.compose.material.TextField (TextField.kt:446)"

    .line 110
    invoke-static {v0, v13, v15, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_3e

    :cond_50
    move-object/from16 p2, v6

    :goto_3e
    const/16 v32, 0x1

    and-int/lit8 v0, v13, 0xe

    and-int/lit8 v6, v13, 0x70

    or-int/2addr v0, v6

    and-int/lit16 v6, v13, 0x380

    or-int/2addr v0, v6

    and-int/lit16 v6, v13, 0x1c00

    or-int/2addr v0, v6

    and-int v6, v13, v64

    or-int/2addr v0, v6

    and-int v6, v13, v65

    or-int/2addr v0, v6

    const/high16 v6, 0x380000

    and-int/2addr v6, v13

    or-int/2addr v0, v6

    and-int v6, v13, v66

    or-int/2addr v0, v6

    and-int v6, v13, v67

    or-int/2addr v0, v6

    const/high16 v6, 0x70000000

    and-int/2addr v6, v13

    or-int v37, v0, v6

    const/high16 v0, 0x180000

    and-int/lit8 v6, v15, 0xe

    or-int/2addr v0, v6

    and-int/lit8 v6, v15, 0x70

    or-int/2addr v0, v6

    and-int/lit16 v6, v15, 0x380

    or-int/2addr v0, v6

    and-int/lit16 v6, v15, 0x1c00

    or-int/2addr v0, v6

    and-int v6, v15, v64

    or-int/2addr v0, v6

    and-int v6, v15, v65

    or-int/2addr v0, v6

    shl-int/lit8 v6, v15, 0x3

    and-int v13, v6, v66

    or-int/2addr v0, v13

    and-int v13, v6, v67

    or-int/2addr v0, v13

    const/high16 v13, 0x70000000

    and-int/2addr v6, v13

    or-int v38, v0, v6

    const/16 v39, 0x0

    move-object/from16 v16, p0

    move-object/from16 v17, p1

    move-object/from16 v18, v8

    move/from16 v19, v11

    move/from16 v20, v12

    move-object/from16 v21, v14

    move-object/from16 v22, v68

    move-object/from16 v23, v9

    move-object/from16 v24, v1

    move-object/from16 v25, v2

    move/from16 v26, v3

    move-object/from16 v27, v5

    move-object/from16 v28, v7

    move-object/from16 v29, v4

    move/from16 v30, v10

    move/from16 v31, v69

    move-object/from16 v33, p2

    move-object/from16 v34, v40

    move-object/from16 v35, v41

    move-object/from16 v36, p19

    .line 111
    invoke-static/range {v16 .. v39}, Landroidx/compose/material/TextFieldKt;->TextField(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_51

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_51
    move-object/from16 v17, p2

    move-object v13, v7

    move v15, v10

    move-object v6, v14

    move-object/from16 v18, v40

    move-object/from16 v19, v41

    move-object/from16 v7, v68

    move/from16 v16, v69

    move-object v10, v2

    move-object v14, v4

    move v4, v11

    move v11, v3

    move-object v3, v8

    move-object v8, v9

    move-object v9, v1

    move/from16 v72, v12

    move-object v12, v5

    move/from16 v5, v72

    .line 112
    :goto_3f
    invoke-interface/range {p19 .. p19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-eqz v2, :cond_52

    new-instance v1, Landroidx/compose/material/TextFieldKt$TextField$10;

    move-object v0, v1

    move-object/from16 v70, v1

    move-object/from16 v1, p0

    move-object/from16 v71, v2

    move-object/from16 v2, p1

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    invoke-direct/range {v0 .. v22}, Landroidx/compose/material/TextFieldKt$TextField$10;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;III)V

    move-object/from16 v1, v70

    move-object/from16 v0, v71

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_52
    return-void
.end method

.method public static final TextField(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V
    .locals 103
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
    .param p5    # Landroidx/compose/ui/text/TextStyle;
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
    .param p11    # Landroidx/compose/ui/text/input/VisualTransformation;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/foundation/text/KeyboardOptions;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/text/KeyboardActions;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p17    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p18    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p19    # Landroidx/compose/material/TextFieldColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p20    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
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
            "Landroidx/compose/ui/text/TextStyle;",
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
            ">;Z",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZII",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v15, p21

    move/from16 v14, p22

    move/from16 v13, p23

    const v0, -0x59a940d4

    move-object/from16 v1, p20

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
    and-int/lit8 v1, v15, 0xe

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, v15, 0x70

    if-nez v5, :cond_5

    move-object/from16 v5, p1

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v5, p1

    :goto_4
    and-int/lit8 v8, v13, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v11, v15, 0x380

    if-nez v11, :cond_8

    move-object/from16 v11, p2

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_5

    :cond_7
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v4, v12

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v11, p2

    :goto_7
    and-int/lit8 v12, v13, 0x8

    const/16 v16, 0x800

    const/16 v17, 0x400

    if-eqz v12, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v2, v15, 0x1c00

    if-nez v2, :cond_b

    move/from16 v2, p3

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v18, v16

    goto :goto_8

    :cond_a
    move/from16 v18, v17

    :goto_8
    or-int v4, v4, v18

    goto :goto_a

    :cond_b
    :goto_9
    move/from16 v2, p3

    :goto_a
    and-int/lit8 v18, v13, 0x10

    const/16 v19, 0x4000

    const v64, 0xe000

    const/16 v20, 0x2000

    if-eqz v18, :cond_c

    or-int/lit16 v4, v4, 0x6000

    move/from16 v3, p4

    goto :goto_c

    :cond_c
    and-int v21, v15, v64

    move/from16 v3, p4

    if-nez v21, :cond_e

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v22

    if-eqz v22, :cond_d

    move/from16 v22, v19

    goto :goto_b

    :cond_d
    move/from16 v22, v20

    :goto_b
    or-int v4, v4, v22

    :cond_e
    :goto_c
    const/high16 v22, 0x70000

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
    and-int/lit8 v24, v13, 0x40

    const/high16 v65, 0x380000

    const/high16 v25, 0x80000

    if-eqz v24, :cond_11

    const/high16 v26, 0x180000

    or-int v4, v4, v26

    move-object/from16 v7, p6

    goto :goto_10

    :cond_11
    and-int v26, v15, v65

    move-object/from16 v7, p6

    if-nez v26, :cond_13

    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_12

    const/high16 v27, 0x100000

    goto :goto_f

    :cond_12
    move/from16 v27, v25

    :goto_f
    or-int v4, v4, v27

    :cond_13
    :goto_10
    and-int/lit16 v9, v13, 0x80

    if-eqz v9, :cond_14

    const/high16 v28, 0xc00000

    or-int v4, v4, v28

    move-object/from16 v10, p7

    goto :goto_12

    :cond_14
    const/high16 v28, 0x1c00000

    and-int v28, v15, v28

    move-object/from16 v10, p7

    if-nez v28, :cond_16

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_15

    const/high16 v29, 0x800000

    goto :goto_11

    :cond_15
    const/high16 v29, 0x400000

    :goto_11
    or-int v4, v4, v29

    :cond_16
    :goto_12
    and-int/lit16 v1, v13, 0x100

    if-eqz v1, :cond_17

    const/high16 v29, 0x6000000

    or-int v4, v4, v29

    move-object/from16 v2, p8

    goto :goto_14

    :cond_17
    const/high16 v29, 0xe000000

    and-int v29, v15, v29

    move-object/from16 v2, p8

    if-nez v29, :cond_19

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_18

    const/high16 v29, 0x4000000

    goto :goto_13

    :cond_18
    const/high16 v29, 0x2000000

    :goto_13
    or-int v4, v4, v29

    :cond_19
    :goto_14
    and-int/lit16 v2, v13, 0x200

    if-eqz v2, :cond_1a

    const/high16 v29, 0x30000000

    or-int v4, v4, v29

    move-object/from16 v3, p9

    goto :goto_16

    :cond_1a
    const/high16 v29, 0x70000000

    and-int v29, v15, v29

    move-object/from16 v3, p9

    if-nez v29, :cond_1c

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_1b

    const/high16 v29, 0x20000000

    goto :goto_15

    :cond_1b
    const/high16 v29, 0x10000000

    :goto_15
    or-int v4, v4, v29

    :cond_1c
    :goto_16
    and-int/lit16 v3, v13, 0x400

    if-eqz v3, :cond_1d

    or-int/lit8 v21, v14, 0x6

    move/from16 v5, p10

    goto :goto_18

    :cond_1d
    and-int/lit8 v29, v14, 0xe

    move/from16 v5, p10

    if-nez v29, :cond_1f

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v29

    if-eqz v29, :cond_1e

    const/16 v21, 0x4

    goto :goto_17

    :cond_1e
    const/16 v21, 0x2

    :goto_17
    or-int v21, v14, v21

    goto :goto_18

    :cond_1f
    move/from16 v21, v14

    :goto_18
    and-int/lit16 v5, v13, 0x800

    if-eqz v5, :cond_20

    or-int/lit8 v21, v21, 0x30

    goto :goto_1a

    :cond_20
    and-int/lit8 v29, v14, 0x70

    move-object/from16 v6, p11

    if-nez v29, :cond_22

    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_21

    const/16 v26, 0x20

    goto :goto_19

    :cond_21
    const/16 v26, 0x10

    :goto_19
    or-int v21, v21, v26

    :cond_22
    :goto_1a
    move/from16 v6, v21

    and-int/lit16 v7, v13, 0x1000

    if-eqz v7, :cond_23

    or-int/lit16 v6, v6, 0x180

    goto :goto_1c

    :cond_23
    and-int/lit16 v10, v14, 0x380

    if-nez v10, :cond_25

    move-object/from16 v10, p12

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_24

    const/16 v27, 0x100

    goto :goto_1b

    :cond_24
    const/16 v27, 0x80

    :goto_1b
    or-int v6, v6, v27

    goto :goto_1d

    :cond_25
    :goto_1c
    move-object/from16 v10, p12

    :goto_1d
    and-int/lit16 v10, v14, 0x1c00

    if-nez v10, :cond_28

    and-int/lit16 v10, v13, 0x2000

    if-nez v10, :cond_26

    move-object/from16 v10, p13

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_27

    goto :goto_1e

    :cond_26
    move-object/from16 v10, p13

    :cond_27
    move/from16 v16, v17

    :goto_1e
    or-int v6, v6, v16

    goto :goto_1f

    :cond_28
    move-object/from16 v10, p13

    :goto_1f
    and-int/lit16 v10, v13, 0x4000

    if-eqz v10, :cond_29

    or-int/lit16 v6, v6, 0x6000

    move/from16 v11, p14

    goto :goto_21

    :cond_29
    and-int v16, v14, v64

    move/from16 v11, p14

    if-nez v16, :cond_2b

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_2a

    goto :goto_20

    :cond_2a
    move/from16 v19, v20

    :goto_20
    or-int v6, v6, v19

    :cond_2b
    :goto_21
    const/high16 v16, 0x70000

    and-int v16, v14, v16

    if-nez v16, :cond_2d

    const v16, 0x8000

    and-int v16, v13, v16

    move/from16 v11, p15

    if-nez v16, :cond_2c

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_2c

    const/high16 v16, 0x20000

    goto :goto_22

    :cond_2c
    move/from16 v16, v23

    :goto_22
    or-int v6, v6, v16

    goto :goto_23

    :cond_2d
    move/from16 v11, p15

    :goto_23
    and-int v16, v13, v23

    if-eqz v16, :cond_2e

    const/high16 v17, 0x180000

    or-int v6, v6, v17

    move/from16 v11, p16

    goto :goto_25

    :cond_2e
    and-int v17, v14, v65

    move/from16 v11, p16

    if-nez v17, :cond_30

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_2f

    const/high16 v17, 0x100000

    goto :goto_24

    :cond_2f
    move/from16 v17, v25

    :goto_24
    or-int v6, v6, v17

    :cond_30
    :goto_25
    const/high16 v17, 0x20000

    and-int v17, v13, v17

    if-eqz v17, :cond_31

    const/high16 v19, 0xc00000

    or-int v6, v6, v19

    move-object/from16 v11, p17

    goto :goto_27

    :cond_31
    const/high16 v19, 0x1c00000

    and-int v19, v14, v19

    move-object/from16 v11, p17

    if-nez v19, :cond_33

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_32

    const/high16 v19, 0x800000

    goto :goto_26

    :cond_32
    const/high16 v19, 0x400000

    :goto_26
    or-int v6, v6, v19

    :cond_33
    :goto_27
    const/high16 v19, 0xe000000

    and-int v19, v14, v19

    if-nez v19, :cond_35

    const/high16 v19, 0x40000

    and-int v19, v13, v19

    move-object/from16 v11, p18

    if-nez v19, :cond_34

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_34

    const/high16 v19, 0x4000000

    goto :goto_28

    :cond_34
    const/high16 v19, 0x2000000

    :goto_28
    or-int v6, v6, v19

    goto :goto_29

    :cond_35
    move-object/from16 v11, p18

    :goto_29
    const/high16 v19, 0x70000000

    and-int v19, v14, v19

    if-nez v19, :cond_37

    and-int v19, v13, v25

    move-object/from16 v11, p19

    if-nez v19, :cond_36

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_36

    const/high16 v19, 0x20000000

    goto :goto_2a

    :cond_36
    const/high16 v19, 0x10000000

    :goto_2a
    or-int v6, v6, v19

    goto :goto_2b

    :cond_37
    move-object/from16 v11, p19

    :goto_2b
    const v19, 0x5b6db6db

    and-int v11, v4, v19

    const v14, 0x12492492

    if-ne v11, v14, :cond_39

    const v11, 0x5b6db6db

    and-int/2addr v11, v6

    const v14, 0x12492492

    if-ne v11, v14, :cond_39

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v11

    if-nez v11, :cond_38

    goto :goto_2c

    .line 2
    :cond_38
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    goto/16 :goto_45

    .line 3
    :cond_39
    :goto_2c
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v11, v15, 0x1

    const v19, -0x70001

    if-eqz v11, :cond_40

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v11

    if-eqz v11, :cond_3a

    goto :goto_2d

    .line 4
    :cond_3a
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v1, v13, 0x20

    if-eqz v1, :cond_3b

    and-int v4, v4, v19

    :cond_3b
    and-int/lit16 v1, v13, 0x2000

    if-eqz v1, :cond_3c

    and-int/lit16 v6, v6, -0x1c01

    :cond_3c
    const v1, 0x8000

    and-int/2addr v1, v13

    if-eqz v1, :cond_3d

    and-int v6, v6, v19

    :cond_3d
    const/high16 v1, 0x40000

    and-int/2addr v1, v13

    if-eqz v1, :cond_3e

    const v1, -0xe000001

    and-int/2addr v6, v1

    :cond_3e
    and-int v1, v13, v25

    if-eqz v1, :cond_3f

    const v1, -0x70000001

    and-int/2addr v6, v1

    :cond_3f
    move-object/from16 v8, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v14, p5

    move-object/from16 v66, p6

    move-object/from16 v9, p7

    move-object/from16 v1, p8

    move-object/from16 v2, p9

    move/from16 v3, p10

    move-object/from16 v5, p11

    move-object/from16 v7, p12

    move/from16 v10, p14

    move/from16 p14, p15

    move/from16 v67, p16

    move-object/from16 v36, p17

    move-object/from16 v13, p18

    move-object/from16 v15, p19

    move-object/from16 p15, p13

    move/from16 v102, v6

    move v6, v4

    move/from16 v4, v102

    goto/16 :goto_41

    :cond_40
    :goto_2d
    if-eqz v8, :cond_41

    .line 5
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_2e

    :cond_41
    move-object/from16 v8, p2

    :goto_2e
    if-eqz v12, :cond_42

    const/4 v11, 0x1

    goto :goto_2f

    :cond_42
    move/from16 v11, p3

    :goto_2f
    if-eqz v18, :cond_43

    const/4 v12, 0x0

    goto :goto_30

    :cond_43
    move/from16 v12, p4

    :goto_30
    and-int/lit8 v18, v13, 0x20

    if-eqz v18, :cond_44

    .line 6
    invoke-static {}, Landroidx/compose/material/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v14

    .line 7
    invoke-interface {v0, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/compose/ui/text/TextStyle;

    and-int v4, v4, v19

    goto :goto_31

    :cond_44
    move-object/from16 v14, p5

    :goto_31
    if-eqz v24, :cond_45

    const/16 v66, 0x0

    goto :goto_32

    :cond_45
    move-object/from16 v66, p6

    :goto_32
    if-eqz v9, :cond_46

    const/4 v9, 0x0

    goto :goto_33

    :cond_46
    move-object/from16 v9, p7

    :goto_33
    if-eqz v1, :cond_47

    const/4 v1, 0x0

    goto :goto_34

    :cond_47
    move-object/from16 v1, p8

    :goto_34
    if-eqz v2, :cond_48

    const/4 v2, 0x0

    goto :goto_35

    :cond_48
    move-object/from16 v2, p9

    :goto_35
    if-eqz v3, :cond_49

    const/4 v3, 0x0

    goto :goto_36

    :cond_49
    move/from16 v3, p10

    :goto_36
    if-eqz v5, :cond_4a

    .line 8
    sget-object v5, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v5

    goto :goto_37

    :cond_4a
    move-object/from16 v5, p11

    :goto_37
    if-eqz v7, :cond_4b

    .line 9
    sget-object v7, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v7}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v7

    goto :goto_38

    :cond_4b
    move-object/from16 v7, p12

    :goto_38
    move-object/from16 p2, v1

    and-int/lit16 v1, v13, 0x2000

    if-eqz v1, :cond_4c

    .line 10
    new-instance v1, Landroidx/compose/foundation/text/KeyboardActions;

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x3f

    const/16 v27, 0x0

    move-object/from16 p3, v1

    move-object/from16 p4, v18

    move-object/from16 p5, v20

    move-object/from16 p6, v21

    move-object/from16 p7, v22

    move-object/from16 p8, v23

    move-object/from16 p9, v24

    move/from16 p10, v26

    move-object/from16 p11, v27

    invoke-direct/range {p3 .. p11}, Landroidx/compose/foundation/text/KeyboardActions;-><init>(Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;ILkotlin/jvm/internal/w;)V

    and-int/lit16 v6, v6, -0x1c01

    goto :goto_39

    :cond_4c
    move-object/from16 v1, p13

    :goto_39
    if-eqz v10, :cond_4d

    const/4 v10, 0x0

    goto :goto_3a

    :cond_4d
    move/from16 v10, p14

    :goto_3a
    const v18, 0x8000

    and-int v18, v13, v18

    if-eqz v18, :cond_4f

    if-eqz v10, :cond_4e

    const/16 v18, 0x1

    goto :goto_3b

    :cond_4e
    const v18, 0x7fffffff

    :goto_3b
    and-int v6, v6, v19

    move/from16 v102, v18

    move/from16 v18, v6

    move/from16 v6, v102

    goto :goto_3c

    :cond_4f
    move/from16 v18, v6

    move/from16 v6, p15

    :goto_3c
    if-eqz v16, :cond_50

    const/16 v67, 0x1

    goto :goto_3d

    :cond_50
    move/from16 v67, p16

    :goto_3d
    move-object/from16 p3, v1

    if-eqz v17, :cond_52

    const v1, -0x1d58f75c

    .line 11
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 12
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 13
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p4, v2

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_51

    .line 14
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 16
    :cond_51
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v1, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    goto :goto_3e

    :cond_52
    move-object/from16 p4, v2

    move-object/from16 v1, p17

    :goto_3e
    const/high16 v2, 0x40000

    and-int/2addr v2, v13

    if-eqz v2, :cond_53

    .line 17
    sget-object v2, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    move-object/from16 p5, v1

    const/4 v1, 0x6

    invoke-virtual {v2, v0, v1}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material/Shapes;->getSmall()Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v16, 0x0

    invoke-static {}, Landroidx/compose/foundation/shape/CornerSizeKt;->getZeroCornerSize()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v17

    invoke-static {}, Landroidx/compose/foundation/shape/CornerSizeKt;->getZeroCornerSize()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v19

    const/16 v20, 0x3

    const/16 v21, 0x0

    move-object/from16 p6, v1

    move-object/from16 p7, v2

    move-object/from16 p8, v16

    move-object/from16 p9, v17

    move-object/from16 p10, v19

    move/from16 p11, v20

    move-object/from16 p12, v21

    invoke-static/range {p6 .. p12}, Landroidx/compose/foundation/shape/CornerBasedShape;->copy$default(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;ILjava/lang/Object;)Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v1

    const v2, -0xe000001

    and-int v2, v18, v2

    goto :goto_3f

    :cond_53
    move-object/from16 p5, v1

    move-object/from16 v1, p18

    move/from16 v2, v18

    :goto_3f
    and-int v16, v13, v25

    if-eqz v16, :cond_54

    .line 18
    sget-object v16, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x30

    const v63, 0x1fffff

    move-object/from16 v59, v0

    invoke-virtual/range {v16 .. v63}, Landroidx/compose/material/TextFieldDefaults;->textFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v16

    const v17, -0x70000001

    and-int v2, v2, v17

    move-object/from16 p15, p3

    move-object/from16 v36, p5

    move-object v13, v1

    move/from16 p14, v6

    move-object/from16 v15, v16

    goto :goto_40

    :cond_54
    move-object/from16 p15, p3

    move-object/from16 v36, p5

    move-object/from16 v15, p19

    move-object v13, v1

    move/from16 p14, v6

    :goto_40
    move-object/from16 v1, p2

    move v6, v4

    move v4, v2

    move-object/from16 v2, p4

    :goto_41
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v16

    move-object/from16 p16, v7

    if-eqz v16, :cond_55

    const v7, -0x59a940d4

    move/from16 p17, v12

    const-string v12, "androidx.compose.material.TextField (TextField.kt:182)"

    .line 19
    invoke-static {v7, v6, v4, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_42

    :cond_55
    move/from16 p17, v12

    :goto_42
    const v7, -0x31a6fc5b    # -9.1022368E8f

    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 20
    invoke-virtual {v14}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v16

    .line 21
    sget-object v7, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v18

    cmp-long v7, v16, v18

    if-eqz v7, :cond_56

    const/4 v7, 0x1

    goto :goto_43

    :cond_56
    const/4 v7, 0x0

    :goto_43
    if-eqz v7, :cond_57

    goto :goto_44

    :cond_57
    shr-int/lit8 v7, v6, 0x9

    and-int/lit8 v7, v7, 0xe

    shr-int/lit8 v12, v4, 0x18

    and-int/lit8 v12, v12, 0x70

    or-int/2addr v7, v12

    .line 22
    invoke-interface {v15, v11, v0, v7}, Landroidx/compose/material/TextFieldColors;->textColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v7

    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v16

    :goto_44
    move-wide/from16 v69, v16

    .line 23
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 24
    new-instance v7, Landroidx/compose/ui/text/TextStyle;

    move-object/from16 v68, v7

    const-wide/16 v71, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const-wide/16 v78, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const-wide/16 v83, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const-wide/16 v90, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const v98, 0xfffffe

    const/16 v99, 0x0

    invoke-direct/range {v68 .. v99}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/w;)V

    invoke-virtual {v14, v7}, Landroidx/compose/ui/text/TextStyle;->merge(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v21

    .line 25
    sget-object v7, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    shr-int/lit8 v12, v6, 0x9

    and-int/lit8 v12, v12, 0xe

    shr-int/lit8 v16, v4, 0x18

    and-int/lit8 v16, v16, 0x70

    or-int v12, v12, v16

    .line 26
    invoke-interface {v15, v11, v0, v12}, Landroidx/compose/material/TextFieldColors;->backgroundColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v12

    invoke-interface {v12}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/ui/graphics/Color;

    move-object/from16 p18, v1

    move-object/from16 p19, v2

    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v1

    invoke-static {v8, v1, v2, v13}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x30

    const/16 v18, 0x0

    move-object/from16 p2, v7

    move-object/from16 p3, v1

    move/from16 p4, v11

    move/from16 p5, v3

    move-object/from16 p6, v36

    move-object/from16 p7, v15

    move/from16 p8, v2

    move/from16 p9, v12

    move/from16 p10, v17

    move-object/from16 p11, v18

    .line 27
    invoke-static/range {p2 .. p11}, Landroidx/compose/material/TextFieldDefaults;->indicatorLine-gv0btCI$default(Landroidx/compose/material/TextFieldDefaults;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 28
    sget-object v2, Landroidx/compose/material/Strings;->Companion:Landroidx/compose/material/Strings$Companion;

    invoke-virtual {v2}, Landroidx/compose/material/Strings$Companion;->getDefaultErrorMessage-UdPEhr4()I

    move-result v2

    const/4 v12, 0x6

    invoke-static {v2, v0, v12}, Landroidx/compose/material/Strings_androidKt;->getString-4foXLRw(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2}, Landroidx/compose/material/TextFieldImplKt;->defaultErrorSemantics(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 29
    invoke-virtual {v7}, Landroidx/compose/material/TextFieldDefaults;->getMinWidth-D9Ej5fM()F

    move-result v2

    .line 30
    invoke-virtual {v7}, Landroidx/compose/material/TextFieldDefaults;->getMinHeight-D9Ej5fM()F

    move-result v7

    .line 31
    invoke-static {v1, v2, v7}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v18

    .line 32
    new-instance v1, Landroidx/compose/ui/graphics/SolidColor;

    move-object/from16 v30, v1

    and-int/lit8 v2, v4, 0xe

    or-int v2, v2, v16

    invoke-interface {v15, v3, v0, v2}, Landroidx/compose/material/TextFieldColors;->cursorColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Color;

    move-object v12, v8

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v7

    const/4 v2, 0x0

    invoke-direct {v1, v7, v8, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/w;)V

    const/16 v28, 0x0

    .line 33
    new-instance v1, Landroidx/compose/material/TextFieldKt$TextField$2;

    move-object/from16 p2, v1

    move-object/from16 p3, p0

    move/from16 p5, v10

    move-object/from16 p6, v5

    move-object/from16 p7, v36

    move/from16 p8, v3

    move-object/from16 p9, v66

    move-object/from16 p10, v9

    move-object/from16 p11, p18

    move-object/from16 p12, p19

    move-object/from16 p13, v15

    invoke-direct/range {p2 .. p13}, Landroidx/compose/material/TextFieldKt$TextField$2;-><init>(Ljava/lang/String;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material/TextFieldColors;)V

    const v2, 0x3affac62

    const/4 v7, 0x1

    invoke-static {v0, v2, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v31

    and-int/lit8 v1, v6, 0xe

    and-int/lit8 v2, v6, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v2, v6, 0x1c00

    or-int/2addr v1, v2

    and-int v2, v6, v64

    or-int/2addr v1, v2

    shl-int/lit8 v2, v4, 0xc

    and-int v6, v2, v65

    or-int/2addr v1, v6

    const/high16 v6, 0x1c00000

    and-int/2addr v6, v2

    or-int/2addr v1, v6

    const/high16 v6, 0xe000000

    and-int/2addr v6, v2

    or-int/2addr v1, v6

    const/high16 v6, 0x70000000

    and-int/2addr v2, v6

    or-int v33, v1, v2

    shr-int/lit8 v1, v4, 0x12

    and-int/lit8 v1, v1, 0xe

    const/high16 v2, 0x30000

    or-int/2addr v1, v2

    and-int/lit8 v2, v4, 0x70

    or-int/2addr v1, v2

    shr-int/lit8 v2, v4, 0xc

    and-int/lit16 v2, v2, 0x1c00

    or-int v34, v1, v2

    const/16 v35, 0x1000

    move-object/from16 v16, p0

    move-object/from16 v17, p1

    move/from16 v19, v11

    move/from16 v20, p17

    move-object/from16 v22, p16

    move-object/from16 v23, p15

    move/from16 v24, v10

    move/from16 v25, p14

    move/from16 v26, v67

    move-object/from16 v27, v5

    move-object/from16 v29, v36

    move-object/from16 v32, v0

    .line 34
    invoke-static/range {v16 .. v35}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lv3/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lv3/q;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_58

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_58
    move/from16 v16, p14

    move-object v8, v9

    move v4, v11

    move-object/from16 v19, v13

    move-object v6, v14

    move-object/from16 v20, v15

    move-object/from16 v18, v36

    move-object/from16 v7, v66

    move/from16 v17, v67

    move-object/from16 v14, p15

    move-object/from16 v13, p16

    move-object/from16 v9, p18

    move v11, v3

    move v15, v10

    move-object v3, v12

    move-object/from16 v10, p19

    move-object v12, v5

    move/from16 v5, p17

    .line 35
    :goto_45
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-eqz v2, :cond_59

    new-instance v1, Landroidx/compose/material/TextFieldKt$TextField$3;

    move-object v0, v1

    move-object/from16 v100, v1

    move-object/from16 v1, p0

    move-object/from16 v101, v2

    move-object/from16 v2, p1

    move/from16 v21, p21

    move/from16 v22, p22

    move/from16 v23, p23

    invoke-direct/range {v0 .. v23}, Landroidx/compose/material/TextFieldKt$TextField$3;-><init>(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;III)V

    move-object/from16 v1, v100

    move-object/from16 v0, v101

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_59
    return-void
.end method

.method public static final synthetic TextField(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V
    .locals 73
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation runtime Lkotlin/k;
        level = .enum Lkotlin/m;->HIDDEN:Lkotlin/m;
        message = "Maintained for binary compatibility. Use version with minLines instead"
    .end annotation

    move/from16 v15, p20

    move/from16 v14, p21

    move/from16 v13, p22

    const v0, -0x64c902f7

    move-object/from16 v1, p19

    .line 36
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v0

    and-int/lit8 v1, v13, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v15, 0x6

    move v4, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v15, 0xe

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, v15, 0x70

    if-nez v5, :cond_5

    move-object/from16 v5, p1

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v5, p1

    :goto_4
    and-int/lit8 v8, v13, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v11, v15, 0x380

    if-nez v11, :cond_8

    move-object/from16 v11, p2

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_5

    :cond_7
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v4, v12

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v11, p2

    :goto_7
    and-int/lit8 v12, v13, 0x8

    const/16 v16, 0x800

    const/16 v17, 0x400

    if-eqz v12, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v2, v15, 0x1c00

    if-nez v2, :cond_b

    move/from16 v2, p3

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_a

    move/from16 v18, v16

    goto :goto_8

    :cond_a
    move/from16 v18, v17

    :goto_8
    or-int v4, v4, v18

    goto :goto_a

    :cond_b
    :goto_9
    move/from16 v2, p3

    :goto_a
    and-int/lit8 v18, v13, 0x10

    const/16 v19, 0x4000

    const v64, 0xe000

    const/16 v20, 0x2000

    if-eqz v18, :cond_c

    or-int/lit16 v4, v4, 0x6000

    move/from16 v3, p4

    goto :goto_c

    :cond_c
    and-int v21, v15, v64

    move/from16 v3, p4

    if-nez v21, :cond_e

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v22

    if-eqz v22, :cond_d

    move/from16 v22, v19

    goto :goto_b

    :cond_d
    move/from16 v22, v20

    :goto_b
    or-int v4, v4, v22

    :cond_e
    :goto_c
    const/high16 v65, 0x70000

    and-int v22, v15, v65

    const/high16 v23, 0x20000

    if-nez v22, :cond_10

    and-int/lit8 v22, v13, 0x20

    move-object/from16 v6, p5

    if-nez v22, :cond_f

    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    move/from16 v24, v23

    goto :goto_d

    :cond_f
    const/high16 v24, 0x10000

    :goto_d
    or-int v4, v4, v24

    goto :goto_e

    :cond_10
    move-object/from16 v6, p5

    :goto_e
    and-int/lit8 v24, v13, 0x40

    if-eqz v24, :cond_11

    const/high16 v25, 0x180000

    or-int v4, v4, v25

    move-object/from16 v7, p6

    goto :goto_10

    :cond_11
    const/high16 v25, 0x380000

    and-int v25, v15, v25

    move-object/from16 v7, p6

    if-nez v25, :cond_13

    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_12

    const/high16 v26, 0x100000

    goto :goto_f

    :cond_12
    const/high16 v26, 0x80000

    :goto_f
    or-int v4, v4, v26

    :cond_13
    :goto_10
    and-int/lit16 v9, v13, 0x80

    const/high16 v66, 0x1c00000

    if-eqz v9, :cond_14

    const/high16 v27, 0xc00000

    or-int v4, v4, v27

    move-object/from16 v10, p7

    goto :goto_12

    :cond_14
    and-int v27, v15, v66

    move-object/from16 v10, p7

    if-nez v27, :cond_16

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_15

    const/high16 v28, 0x800000

    goto :goto_11

    :cond_15
    const/high16 v28, 0x400000

    :goto_11
    or-int v4, v4, v28

    :cond_16
    :goto_12
    and-int/lit16 v1, v13, 0x100

    const/high16 v67, 0xe000000

    if-eqz v1, :cond_17

    const/high16 v28, 0x6000000

    or-int v4, v4, v28

    move-object/from16 v2, p8

    goto :goto_14

    :cond_17
    and-int v28, v15, v67

    move-object/from16 v2, p8

    if-nez v28, :cond_19

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_18

    const/high16 v28, 0x4000000

    goto :goto_13

    :cond_18
    const/high16 v28, 0x2000000

    :goto_13
    or-int v4, v4, v28

    :cond_19
    :goto_14
    and-int/lit16 v2, v13, 0x200

    if-eqz v2, :cond_1a

    const/high16 v28, 0x30000000

    or-int v4, v4, v28

    move-object/from16 v3, p9

    goto :goto_16

    :cond_1a
    const/high16 v28, 0x70000000

    and-int v28, v15, v28

    move-object/from16 v3, p9

    if-nez v28, :cond_1c

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_1b

    const/high16 v28, 0x20000000

    goto :goto_15

    :cond_1b
    const/high16 v28, 0x10000000

    :goto_15
    or-int v4, v4, v28

    :cond_1c
    :goto_16
    and-int/lit16 v3, v13, 0x400

    if-eqz v3, :cond_1d

    or-int/lit8 v21, v14, 0x6

    move/from16 v5, p10

    goto :goto_18

    :cond_1d
    and-int/lit8 v28, v14, 0xe

    move/from16 v5, p10

    if-nez v28, :cond_1f

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v28

    if-eqz v28, :cond_1e

    const/16 v21, 0x4

    goto :goto_17

    :cond_1e
    const/16 v21, 0x2

    :goto_17
    or-int v21, v14, v21

    goto :goto_18

    :cond_1f
    move/from16 v21, v14

    :goto_18
    and-int/lit16 v5, v13, 0x800

    if-eqz v5, :cond_20

    or-int/lit8 v21, v21, 0x30

    goto :goto_1a

    :cond_20
    and-int/lit8 v28, v14, 0x70

    move-object/from16 v6, p11

    if-nez v28, :cond_22

    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_21

    const/16 v25, 0x20

    goto :goto_19

    :cond_21
    const/16 v25, 0x10

    :goto_19
    or-int v21, v21, v25

    :cond_22
    :goto_1a
    move/from16 v6, v21

    and-int/lit16 v7, v13, 0x1000

    if-eqz v7, :cond_23

    or-int/lit16 v6, v6, 0x180

    goto :goto_1c

    :cond_23
    and-int/lit16 v10, v14, 0x380

    if-nez v10, :cond_25

    move-object/from16 v10, p12

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_24

    const/16 v26, 0x100

    goto :goto_1b

    :cond_24
    const/16 v26, 0x80

    :goto_1b
    or-int v6, v6, v26

    goto :goto_1d

    :cond_25
    :goto_1c
    move-object/from16 v10, p12

    :goto_1d
    and-int/lit16 v10, v14, 0x1c00

    if-nez v10, :cond_28

    and-int/lit16 v10, v13, 0x2000

    if-nez v10, :cond_26

    move-object/from16 v10, p13

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_27

    goto :goto_1e

    :cond_26
    move-object/from16 v10, p13

    :cond_27
    move/from16 v16, v17

    :goto_1e
    or-int v6, v6, v16

    goto :goto_1f

    :cond_28
    move-object/from16 v10, p13

    :goto_1f
    and-int/lit16 v10, v13, 0x4000

    if-eqz v10, :cond_29

    or-int/lit16 v6, v6, 0x6000

    move/from16 v11, p14

    goto :goto_21

    :cond_29
    and-int v16, v14, v64

    move/from16 v11, p14

    if-nez v16, :cond_2b

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_2a

    goto :goto_20

    :cond_2a
    move/from16 v19, v20

    :goto_20
    or-int v6, v6, v19

    :cond_2b
    :goto_21
    const v16, 0x8000

    and-int v16, v13, v16

    if-eqz v16, :cond_2c

    const/high16 v17, 0x30000

    or-int v6, v6, v17

    move/from16 v11, p15

    goto :goto_23

    :cond_2c
    and-int v17, v14, v65

    move/from16 v11, p15

    if-nez v17, :cond_2e

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_2d

    move/from16 v17, v23

    goto :goto_22

    :cond_2d
    const/high16 v17, 0x10000

    :goto_22
    or-int v6, v6, v17

    :cond_2e
    :goto_23
    const/high16 v17, 0x10000

    and-int v17, v13, v17

    if-eqz v17, :cond_2f

    const/high16 v19, 0x180000

    or-int v6, v6, v19

    move-object/from16 v11, p16

    goto :goto_25

    :cond_2f
    const/high16 v19, 0x380000

    and-int v19, v14, v19

    move-object/from16 v11, p16

    if-nez v19, :cond_31

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_30

    const/high16 v19, 0x100000

    goto :goto_24

    :cond_30
    const/high16 v19, 0x80000

    :goto_24
    or-int v6, v6, v19

    :cond_31
    :goto_25
    and-int v19, v14, v66

    if-nez v19, :cond_33

    and-int v19, v13, v23

    move-object/from16 v11, p17

    if-nez v19, :cond_32

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_32

    const/high16 v19, 0x800000

    goto :goto_26

    :cond_32
    const/high16 v19, 0x400000

    :goto_26
    or-int v6, v6, v19

    goto :goto_27

    :cond_33
    move-object/from16 v11, p17

    :goto_27
    and-int v19, v14, v67

    if-nez v19, :cond_35

    const/high16 v19, 0x40000

    and-int v19, v13, v19

    move-object/from16 v11, p18

    if-nez v19, :cond_34

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_34

    const/high16 v19, 0x4000000

    goto :goto_28

    :cond_34
    const/high16 v19, 0x2000000

    :goto_28
    or-int v6, v6, v19

    goto :goto_29

    :cond_35
    move-object/from16 v11, p18

    :goto_29
    const v19, 0x5b6db6db

    and-int v11, v4, v19

    const v14, 0x12492492

    if-ne v11, v14, :cond_37

    const v11, 0xb6db6db

    and-int/2addr v11, v6

    const v14, 0x2492492

    if-ne v11, v14, :cond_37

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v11

    if-nez v11, :cond_36

    goto :goto_2a

    .line 37
    :cond_36
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 p19, v0

    goto/16 :goto_3f

    .line 38
    :cond_37
    :goto_2a
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v11, v15, 0x1

    if-eqz v11, :cond_3d

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v11

    if-eqz v11, :cond_38

    goto :goto_2b

    .line 39
    :cond_38
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v1, v13, 0x20

    if-eqz v1, :cond_39

    const v1, -0x70001

    and-int/2addr v4, v1

    :cond_39
    and-int/lit16 v1, v13, 0x2000

    if-eqz v1, :cond_3a

    and-int/lit16 v6, v6, -0x1c01

    :cond_3a
    and-int v1, v13, v23

    if-eqz v1, :cond_3b

    const v1, -0x1c00001

    and-int/2addr v6, v1

    :cond_3b
    const/high16 v1, 0x40000

    and-int/2addr v1, v13

    if-eqz v1, :cond_3c

    const v1, -0xe000001

    and-int/2addr v6, v1

    :cond_3c
    move-object/from16 v8, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v14, p5

    move-object/from16 v68, p6

    move-object/from16 v9, p7

    move-object/from16 v1, p8

    move-object/from16 v2, p9

    move/from16 v3, p10

    move-object/from16 v5, p11

    move-object/from16 v7, p12

    move/from16 v10, p14

    move/from16 v69, p15

    move-object/from16 v40, p17

    move-object/from16 v41, p18

    move v13, v4

    move v15, v6

    move-object/from16 v4, p13

    move-object/from16 v6, p16

    goto/16 :goto_3d

    :cond_3d
    :goto_2b
    if-eqz v8, :cond_3e

    .line 40
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_2c

    :cond_3e
    move-object/from16 v8, p2

    :goto_2c
    if-eqz v12, :cond_3f

    const/4 v11, 0x1

    goto :goto_2d

    :cond_3f
    move/from16 v11, p3

    :goto_2d
    if-eqz v18, :cond_40

    const/4 v12, 0x0

    goto :goto_2e

    :cond_40
    move/from16 v12, p4

    :goto_2e
    and-int/lit8 v14, v13, 0x20

    if-eqz v14, :cond_41

    .line 41
    invoke-static {}, Landroidx/compose/material/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v14

    .line 42
    invoke-interface {v0, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/compose/ui/text/TextStyle;

    const v18, -0x70001

    and-int v4, v4, v18

    goto :goto_2f

    :cond_41
    move-object/from16 v14, p5

    :goto_2f
    const/16 v18, 0x0

    if-eqz v24, :cond_42

    move-object/from16 v68, v18

    goto :goto_30

    :cond_42
    move-object/from16 v68, p6

    :goto_30
    if-eqz v9, :cond_43

    move-object/from16 v9, v18

    goto :goto_31

    :cond_43
    move-object/from16 v9, p7

    :goto_31
    if-eqz v1, :cond_44

    move-object/from16 v1, v18

    goto :goto_32

    :cond_44
    move-object/from16 v1, p8

    :goto_32
    if-eqz v2, :cond_45

    move-object/from16 v2, v18

    goto :goto_33

    :cond_45
    move-object/from16 v2, p9

    :goto_33
    if-eqz v3, :cond_46

    const/4 v3, 0x0

    goto :goto_34

    :cond_46
    move/from16 v3, p10

    :goto_34
    if-eqz v5, :cond_47

    .line 43
    sget-object v5, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v5

    goto :goto_35

    :cond_47
    move-object/from16 v5, p11

    :goto_35
    if-eqz v7, :cond_48

    .line 44
    sget-object v7, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual {v7}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v7

    goto :goto_36

    :cond_48
    move-object/from16 v7, p12

    :goto_36
    move-object/from16 p2, v1

    and-int/lit16 v1, v13, 0x2000

    if-eqz v1, :cond_49

    .line 45
    new-instance v1, Landroidx/compose/foundation/text/KeyboardActions;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x3f

    const/16 v26, 0x0

    move-object/from16 p3, v1

    move-object/from16 p4, v18

    move-object/from16 p5, v19

    move-object/from16 p6, v20

    move-object/from16 p7, v21

    move-object/from16 p8, v22

    move-object/from16 p9, v24

    move/from16 p10, v25

    move-object/from16 p11, v26

    invoke-direct/range {p3 .. p11}, Landroidx/compose/foundation/text/KeyboardActions;-><init>(Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;ILkotlin/jvm/internal/w;)V

    and-int/lit16 v6, v6, -0x1c01

    goto :goto_37

    :cond_49
    move-object/from16 v1, p13

    :goto_37
    if-eqz v10, :cond_4a

    const/4 v10, 0x0

    goto :goto_38

    :cond_4a
    move/from16 v10, p14

    :goto_38
    if-eqz v16, :cond_4b

    const v16, 0x7fffffff

    move/from16 v69, v16

    goto :goto_39

    :cond_4b
    move/from16 v69, p15

    :goto_39
    move-object/from16 p3, v1

    if-eqz v17, :cond_4d

    const v1, -0x1d58f75c

    .line 46
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 47
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 48
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p4, v2

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_4c

    .line 49
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v1

    .line 50
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 51
    :cond_4c
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v1, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    goto :goto_3a

    :cond_4d
    move-object/from16 p4, v2

    move-object/from16 v1, p16

    :goto_3a
    and-int v2, v13, v23

    if-eqz v2, :cond_4e

    .line 52
    sget-object v2, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    move-object/from16 p5, v1

    const/4 v1, 0x6

    invoke-virtual {v2, v0, v1}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/material/Shapes;->getSmall()Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v16, 0x0

    invoke-static {}, Landroidx/compose/foundation/shape/CornerSizeKt;->getZeroCornerSize()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v17

    invoke-static {}, Landroidx/compose/foundation/shape/CornerSizeKt;->getZeroCornerSize()Landroidx/compose/foundation/shape/CornerSize;

    move-result-object v18

    const/16 v19, 0x3

    const/16 v20, 0x0

    move-object/from16 p6, v1

    move-object/from16 p7, v2

    move-object/from16 p8, v16

    move-object/from16 p9, v17

    move-object/from16 p10, v18

    move/from16 p11, v19

    move-object/from16 p12, v20

    invoke-static/range {p6 .. p12}, Landroidx/compose/foundation/shape/CornerBasedShape;->copy$default(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;ILjava/lang/Object;)Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v1

    const v2, -0x1c00001

    and-int/2addr v2, v6

    move v6, v2

    goto :goto_3b

    :cond_4e
    move-object/from16 p5, v1

    move-object/from16 v1, p17

    :goto_3b
    const/high16 v2, 0x40000

    and-int/2addr v2, v13

    if-eqz v2, :cond_4f

    .line 53
    sget-object v16, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x30

    const v63, 0x1fffff

    move-object/from16 v59, v0

    invoke-virtual/range {v16 .. v63}, Landroidx/compose/material/TextFieldDefaults;->textFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v2

    const v16, -0xe000001

    and-int v6, v6, v16

    move-object/from16 v40, v1

    move-object/from16 v41, v2

    move v13, v4

    move v15, v6

    move-object/from16 v1, p2

    move-object/from16 v4, p3

    move-object/from16 v2, p4

    goto :goto_3c

    :cond_4f
    move-object/from16 v2, p4

    move-object/from16 v41, p18

    move-object/from16 v40, v1

    move v13, v4

    move v15, v6

    move-object/from16 v1, p2

    move-object/from16 v4, p3

    :goto_3c
    move-object/from16 v6, p5

    :goto_3d
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v16

    move-object/from16 p19, v0

    if-eqz v16, :cond_50

    const v0, -0x64c902f7

    move-object/from16 p2, v6

    const-string v6, "androidx.compose.material.TextField (TextField.kt:258)"

    .line 54
    invoke-static {v0, v13, v15, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_3e

    :cond_50
    move-object/from16 p2, v6

    :goto_3e
    const/16 v32, 0x1

    and-int/lit8 v0, v13, 0xe

    and-int/lit8 v6, v13, 0x70

    or-int/2addr v0, v6

    and-int/lit16 v6, v13, 0x380

    or-int/2addr v0, v6

    and-int/lit16 v6, v13, 0x1c00

    or-int/2addr v0, v6

    and-int v6, v13, v64

    or-int/2addr v0, v6

    and-int v6, v13, v65

    or-int/2addr v0, v6

    const/high16 v6, 0x380000

    and-int/2addr v6, v13

    or-int/2addr v0, v6

    and-int v6, v13, v66

    or-int/2addr v0, v6

    and-int v6, v13, v67

    or-int/2addr v0, v6

    const/high16 v6, 0x70000000

    and-int/2addr v6, v13

    or-int v37, v0, v6

    const/high16 v0, 0x180000

    and-int/lit8 v6, v15, 0xe

    or-int/2addr v0, v6

    and-int/lit8 v6, v15, 0x70

    or-int/2addr v0, v6

    and-int/lit16 v6, v15, 0x380

    or-int/2addr v0, v6

    and-int/lit16 v6, v15, 0x1c00

    or-int/2addr v0, v6

    and-int v6, v15, v64

    or-int/2addr v0, v6

    and-int v6, v15, v65

    or-int/2addr v0, v6

    shl-int/lit8 v6, v15, 0x3

    and-int v13, v6, v66

    or-int/2addr v0, v13

    and-int v13, v6, v67

    or-int/2addr v0, v13

    const/high16 v13, 0x70000000

    and-int/2addr v6, v13

    or-int v38, v0, v6

    const/16 v39, 0x0

    move-object/from16 v16, p0

    move-object/from16 v17, p1

    move-object/from16 v18, v8

    move/from16 v19, v11

    move/from16 v20, v12

    move-object/from16 v21, v14

    move-object/from16 v22, v68

    move-object/from16 v23, v9

    move-object/from16 v24, v1

    move-object/from16 v25, v2

    move/from16 v26, v3

    move-object/from16 v27, v5

    move-object/from16 v28, v7

    move-object/from16 v29, v4

    move/from16 v30, v10

    move/from16 v31, v69

    move-object/from16 v33, p2

    move-object/from16 v34, v40

    move-object/from16 v35, v41

    move-object/from16 v36, p19

    .line 55
    invoke-static/range {v16 .. v39}, Landroidx/compose/material/TextFieldKt;->TextField(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_51

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_51
    move-object/from16 v17, p2

    move-object v13, v7

    move v15, v10

    move-object v6, v14

    move-object/from16 v18, v40

    move-object/from16 v19, v41

    move-object/from16 v7, v68

    move/from16 v16, v69

    move-object v10, v2

    move-object v14, v4

    move v4, v11

    move v11, v3

    move-object v3, v8

    move-object v8, v9

    move-object v9, v1

    move/from16 v72, v12

    move-object v12, v5

    move/from16 v5, v72

    .line 56
    :goto_3f
    invoke-interface/range {p19 .. p19}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-eqz v2, :cond_52

    new-instance v1, Landroidx/compose/material/TextFieldKt$TextField$5;

    move-object v0, v1

    move-object/from16 v70, v1

    move-object/from16 v1, p0

    move-object/from16 v71, v2

    move-object/from16 v2, p1

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    invoke-direct/range {v0 .. v22}, Landroidx/compose/material/TextFieldKt$TextField$5;-><init>(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;III)V

    move-object/from16 v1, v70

    move-object/from16 v0, v71

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_52
    return-void
.end method

.method public static final TextFieldLayout(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/q;Lv3/p;Lv3/p;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
    .locals 25
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/q;
        .annotation build Lp4/m;
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
    .param p8    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p9    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
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
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/ui/Modifier;",
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
            ">;ZF",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v6, p5

    .line 10
    .line 11
    move/from16 v7, p6

    .line 12
    .line 13
    move/from16 v8, p7

    .line 14
    .line 15
    move-object/from16 v9, p8

    .line 16
    .line 17
    move/from16 v10, p10

    .line 18
    .line 19
    const v0, -0x7dea4cb5

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p9

    .line 23
    .line 24
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    and-int/lit8 v11, v10, 0xe

    .line 29
    .line 30
    if-nez v11, :cond_1

    .line 31
    .line 32
    move-object/from16 v11, p0

    .line 33
    .line 34
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v12

    .line 38
    if-eqz v12, :cond_0

    .line 39
    .line 40
    const/4 v12, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v12, 0x2

    .line 43
    :goto_0
    or-int/2addr v12, v10

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object/from16 v11, p0

    .line 46
    .line 47
    move v12, v10

    .line 48
    :goto_1
    and-int/lit8 v13, v10, 0x70

    .line 49
    .line 50
    if-nez v13, :cond_3

    .line 51
    .line 52
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    if-eqz v13, :cond_2

    .line 57
    .line 58
    const/16 v13, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v13, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v12, v13

    .line 64
    :cond_3
    and-int/lit16 v13, v10, 0x380

    .line 65
    .line 66
    if-nez v13, :cond_5

    .line 67
    .line 68
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v13

    .line 72
    if-eqz v13, :cond_4

    .line 73
    .line 74
    const/16 v13, 0x100

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    const/16 v13, 0x80

    .line 78
    .line 79
    :goto_3
    or-int/2addr v12, v13

    .line 80
    :cond_5
    and-int/lit16 v13, v10, 0x1c00

    .line 81
    .line 82
    if-nez v13, :cond_7

    .line 83
    .line 84
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    if-eqz v13, :cond_6

    .line 89
    .line 90
    const/16 v13, 0x800

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    const/16 v13, 0x400

    .line 94
    .line 95
    :goto_4
    or-int/2addr v12, v13

    .line 96
    :cond_7
    const v13, 0xe000

    .line 97
    .line 98
    .line 99
    and-int/2addr v13, v10

    .line 100
    if-nez v13, :cond_9

    .line 101
    .line 102
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    if-eqz v13, :cond_8

    .line 107
    .line 108
    const/16 v13, 0x4000

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_8
    const/16 v13, 0x2000

    .line 112
    .line 113
    :goto_5
    or-int/2addr v12, v13

    .line 114
    :cond_9
    const/high16 v13, 0x70000

    .line 115
    .line 116
    and-int/2addr v13, v10

    .line 117
    if-nez v13, :cond_b

    .line 118
    .line 119
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v13

    .line 123
    if-eqz v13, :cond_a

    .line 124
    .line 125
    const/high16 v13, 0x20000

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_a
    const/high16 v13, 0x10000

    .line 129
    .line 130
    :goto_6
    or-int/2addr v12, v13

    .line 131
    :cond_b
    const/high16 v13, 0x380000

    .line 132
    .line 133
    and-int/2addr v13, v10

    .line 134
    if-nez v13, :cond_d

    .line 135
    .line 136
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    if-eqz v13, :cond_c

    .line 141
    .line 142
    const/high16 v13, 0x100000

    .line 143
    .line 144
    goto :goto_7

    .line 145
    :cond_c
    const/high16 v13, 0x80000

    .line 146
    .line 147
    :goto_7
    or-int/2addr v12, v13

    .line 148
    :cond_d
    const/high16 v13, 0x1c00000

    .line 149
    .line 150
    and-int/2addr v13, v10

    .line 151
    if-nez v13, :cond_f

    .line 152
    .line 153
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    if-eqz v13, :cond_e

    .line 158
    .line 159
    const/high16 v13, 0x800000

    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_e
    const/high16 v13, 0x400000

    .line 163
    .line 164
    :goto_8
    or-int/2addr v12, v13

    .line 165
    :cond_f
    const/high16 v13, 0xe000000

    .line 166
    .line 167
    and-int/2addr v13, v10

    .line 168
    if-nez v13, :cond_11

    .line 169
    .line 170
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    if-eqz v13, :cond_10

    .line 175
    .line 176
    const/high16 v13, 0x4000000

    .line 177
    .line 178
    goto :goto_9

    .line 179
    :cond_10
    const/high16 v13, 0x2000000

    .line 180
    .line 181
    :goto_9
    or-int/2addr v12, v13

    .line 182
    :cond_11
    const v13, 0xb6db6db

    .line 183
    .line 184
    .line 185
    and-int/2addr v13, v12

    .line 186
    const v14, 0x2492492

    .line 187
    .line 188
    .line 189
    if-ne v13, v14, :cond_13

    .line 190
    .line 191
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    if-nez v13, :cond_12

    .line 196
    .line 197
    goto :goto_a

    .line 198
    :cond_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_11

    .line 202
    .line 203
    :cond_13
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    if-eqz v13, :cond_14

    .line 208
    .line 209
    const/4 v13, -0x1

    .line 210
    const-string v14, "androidx.compose.material.TextFieldLayout (TextField.kt:486)"

    .line 211
    .line 212
    invoke-static {v0, v12, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :cond_14
    invoke-static/range {p6 .. p6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static/range {p7 .. p7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    const v14, 0x607fb4c4

    .line 224
    .line 225
    .line 226
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v13

    .line 237
    or-int/2addr v0, v13

    .line 238
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v13

    .line 242
    or-int/2addr v0, v13

    .line 243
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    if-nez v0, :cond_15

    .line 248
    .line 249
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 250
    .line 251
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-ne v13, v0, :cond_16

    .line 256
    .line 257
    :cond_15
    new-instance v13, Landroidx/compose/material/TextFieldMeasurePolicy;

    .line 258
    .line 259
    invoke-direct {v13, v7, v8, v9}, Landroidx/compose/material/TextFieldMeasurePolicy;-><init>(ZFLandroidx/compose/foundation/layout/PaddingValues;)V

    .line 260
    .line 261
    .line 262
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :cond_16
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 266
    .line 267
    .line 268
    check-cast v13, Landroidx/compose/material/TextFieldMeasurePolicy;

    .line 269
    .line 270
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, Landroidx/compose/ui/unit/LayoutDirection;

    .line 279
    .line 280
    shl-int/lit8 v14, v12, 0x3

    .line 281
    .line 282
    and-int/lit8 v14, v14, 0x70

    .line 283
    .line 284
    const v15, -0x4ee9b9da

    .line 285
    .line 286
    .line 287
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 288
    .line 289
    .line 290
    const/4 v15, 0x0

    .line 291
    invoke-static {v1, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 292
    .line 293
    .line 294
    move-result v16

    .line 295
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 296
    .line 297
    .line 298
    move-result-object v15

    .line 299
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 300
    .line 301
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    invoke-static/range {p0 .. p0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    shl-int/lit8 v14, v14, 0x9

    .line 310
    .line 311
    and-int/lit16 v14, v14, 0x1c00

    .line 312
    .line 313
    const/4 v10, 0x6

    .line 314
    or-int/2addr v14, v10

    .line 315
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 316
    .line 317
    .line 318
    move-result-object v10

    .line 319
    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    .line 320
    .line 321
    if-nez v10, :cond_17

    .line 322
    .line 323
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 324
    .line 325
    .line 326
    :cond_17
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 327
    .line 328
    .line 329
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    if-eqz v10, :cond_18

    .line 334
    .line 335
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 336
    .line 337
    .line 338
    goto :goto_b

    .line 339
    :cond_18
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 340
    .line 341
    .line 342
    :goto_b
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 343
    .line 344
    .line 345
    move-result-object v7

    .line 346
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    invoke-static {v7, v13, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 354
    .line 355
    .line 356
    move-result-object v10

    .line 357
    invoke-static {v7, v15, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 365
    .line 366
    .line 367
    move-result v13

    .line 368
    if-nez v13, :cond_19

    .line 369
    .line 370
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v13

    .line 374
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 375
    .line 376
    .line 377
    move-result-object v15

    .line 378
    invoke-static {v13, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v13

    .line 382
    if-nez v13, :cond_1a

    .line 383
    .line 384
    :cond_19
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v13

    .line 388
    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v13

    .line 395
    invoke-interface {v7, v13, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 396
    .line 397
    .line 398
    :cond_1a
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 403
    .line 404
    .line 405
    move-result-object v7

    .line 406
    shr-int/lit8 v10, v14, 0x3

    .line 407
    .line 408
    and-int/lit8 v10, v10, 0x70

    .line 409
    .line 410
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 411
    .line 412
    .line 413
    move-result-object v10

    .line 414
    invoke-interface {v8, v7, v1, v10}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    const v7, 0x7ab4aae9

    .line 418
    .line 419
    .line 420
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 421
    .line 422
    .line 423
    const v8, 0xf303e63

    .line 424
    .line 425
    .line 426
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 427
    .line 428
    .line 429
    const v8, 0x2bb5b5d7

    .line 430
    .line 431
    .line 432
    if-eqz v5, :cond_1f

    .line 433
    .line 434
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 435
    .line 436
    const-string v13, "Leading"

    .line 437
    .line 438
    invoke-static {v10, v13}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getIconDefaultSizeModifier()Landroidx/compose/ui/Modifier;

    .line 443
    .line 444
    .line 445
    move-result-object v13

    .line 446
    invoke-interface {v10, v13}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 447
    .line 448
    .line 449
    move-result-object v10

    .line 450
    sget-object v13, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 451
    .line 452
    invoke-virtual {v13}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 453
    .line 454
    .line 455
    move-result-object v13

    .line 456
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 457
    .line 458
    .line 459
    const/4 v14, 0x6

    .line 460
    const/4 v15, 0x0

    .line 461
    invoke-static {v13, v15, v1, v14}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 462
    .line 463
    .line 464
    move-result-object v13

    .line 465
    const v14, -0x4ee9b9da

    .line 466
    .line 467
    .line 468
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 469
    .line 470
    .line 471
    invoke-static {v1, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 472
    .line 473
    .line 474
    move-result v14

    .line 475
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 476
    .line 477
    .line 478
    move-result-object v15

    .line 479
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 480
    .line 481
    .line 482
    move-result-object v8

    .line 483
    invoke-static {v10}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 484
    .line 485
    .line 486
    move-result-object v10

    .line 487
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 488
    .line 489
    .line 490
    move-result-object v7

    .line 491
    instance-of v7, v7, Landroidx/compose/runtime/Applier;

    .line 492
    .line 493
    if-nez v7, :cond_1b

    .line 494
    .line 495
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 496
    .line 497
    .line 498
    :cond_1b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 499
    .line 500
    .line 501
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 502
    .line 503
    .line 504
    move-result v7

    .line 505
    if-eqz v7, :cond_1c

    .line 506
    .line 507
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 508
    .line 509
    .line 510
    goto :goto_c

    .line 511
    :cond_1c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 512
    .line 513
    .line 514
    :goto_c
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 519
    .line 520
    .line 521
    move-result-object v8

    .line 522
    invoke-static {v7, v13, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 526
    .line 527
    .line 528
    move-result-object v8

    .line 529
    invoke-static {v7, v15, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 533
    .line 534
    .line 535
    move-result-object v8

    .line 536
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 537
    .line 538
    .line 539
    move-result v13

    .line 540
    if-nez v13, :cond_1d

    .line 541
    .line 542
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v13

    .line 546
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 547
    .line 548
    .line 549
    move-result-object v15

    .line 550
    invoke-static {v13, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v13

    .line 554
    if-nez v13, :cond_1e

    .line 555
    .line 556
    :cond_1d
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 557
    .line 558
    .line 559
    move-result-object v13

    .line 560
    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 564
    .line 565
    .line 566
    move-result-object v13

    .line 567
    invoke-interface {v7, v13, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 568
    .line 569
    .line 570
    :cond_1e
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 571
    .line 572
    .line 573
    move-result-object v7

    .line 574
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 575
    .line 576
    .line 577
    move-result-object v7

    .line 578
    const/4 v8, 0x0

    .line 579
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 580
    .line 581
    .line 582
    move-result-object v13

    .line 583
    invoke-interface {v10, v7, v1, v13}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    const v7, 0x7ab4aae9

    .line 587
    .line 588
    .line 589
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 590
    .line 591
    .line 592
    sget-object v7, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 593
    .line 594
    shr-int/lit8 v7, v12, 0xc

    .line 595
    .line 596
    and-int/lit8 v7, v7, 0xe

    .line 597
    .line 598
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    invoke-interface {v5, v1, v7}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 606
    .line 607
    .line 608
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 609
    .line 610
    .line 611
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 612
    .line 613
    .line 614
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 615
    .line 616
    .line 617
    :cond_1f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 618
    .line 619
    .line 620
    const v7, 0xf303f80

    .line 621
    .line 622
    .line 623
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 624
    .line 625
    .line 626
    if-eqz v6, :cond_24

    .line 627
    .line 628
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 629
    .line 630
    const-string v8, "Trailing"

    .line 631
    .line 632
    invoke-static {v7, v8}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 633
    .line 634
    .line 635
    move-result-object v7

    .line 636
    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getIconDefaultSizeModifier()Landroidx/compose/ui/Modifier;

    .line 637
    .line 638
    .line 639
    move-result-object v8

    .line 640
    invoke-interface {v7, v8}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 641
    .line 642
    .line 643
    move-result-object v7

    .line 644
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 645
    .line 646
    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 647
    .line 648
    .line 649
    move-result-object v8

    .line 650
    const v10, 0x2bb5b5d7

    .line 651
    .line 652
    .line 653
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 654
    .line 655
    .line 656
    const/4 v10, 0x6

    .line 657
    const/4 v13, 0x0

    .line 658
    invoke-static {v8, v13, v1, v10}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 659
    .line 660
    .line 661
    move-result-object v8

    .line 662
    const v10, -0x4ee9b9da

    .line 663
    .line 664
    .line 665
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 666
    .line 667
    .line 668
    invoke-static {v1, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 669
    .line 670
    .line 671
    move-result v10

    .line 672
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 673
    .line 674
    .line 675
    move-result-object v13

    .line 676
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 677
    .line 678
    .line 679
    move-result-object v14

    .line 680
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 681
    .line 682
    .line 683
    move-result-object v7

    .line 684
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 685
    .line 686
    .line 687
    move-result-object v15

    .line 688
    instance-of v15, v15, Landroidx/compose/runtime/Applier;

    .line 689
    .line 690
    if-nez v15, :cond_20

    .line 691
    .line 692
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 693
    .line 694
    .line 695
    :cond_20
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 696
    .line 697
    .line 698
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 699
    .line 700
    .line 701
    move-result v15

    .line 702
    if-eqz v15, :cond_21

    .line 703
    .line 704
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 705
    .line 706
    .line 707
    goto :goto_d

    .line 708
    :cond_21
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 709
    .line 710
    .line 711
    :goto_d
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 712
    .line 713
    .line 714
    move-result-object v14

    .line 715
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 716
    .line 717
    .line 718
    move-result-object v15

    .line 719
    invoke-static {v14, v8, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 723
    .line 724
    .line 725
    move-result-object v8

    .line 726
    invoke-static {v14, v13, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 730
    .line 731
    .line 732
    move-result-object v8

    .line 733
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 734
    .line 735
    .line 736
    move-result v13

    .line 737
    if-nez v13, :cond_22

    .line 738
    .line 739
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v13

    .line 743
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 744
    .line 745
    .line 746
    move-result-object v15

    .line 747
    invoke-static {v13, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    move-result v13

    .line 751
    if-nez v13, :cond_23

    .line 752
    .line 753
    :cond_22
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 754
    .line 755
    .line 756
    move-result-object v13

    .line 757
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 761
    .line 762
    .line 763
    move-result-object v10

    .line 764
    invoke-interface {v14, v10, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 765
    .line 766
    .line 767
    :cond_23
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 768
    .line 769
    .line 770
    move-result-object v8

    .line 771
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 772
    .line 773
    .line 774
    move-result-object v8

    .line 775
    const/4 v10, 0x0

    .line 776
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 777
    .line 778
    .line 779
    move-result-object v13

    .line 780
    invoke-interface {v7, v8, v1, v13}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    const v7, 0x7ab4aae9

    .line 784
    .line 785
    .line 786
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 787
    .line 788
    .line 789
    sget-object v7, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 790
    .line 791
    shr-int/lit8 v7, v12, 0xf

    .line 792
    .line 793
    and-int/lit8 v7, v7, 0xe

    .line 794
    .line 795
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 796
    .line 797
    .line 798
    move-result-object v7

    .line 799
    invoke-interface {v6, v1, v7}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 803
    .line 804
    .line 805
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 806
    .line 807
    .line 808
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 809
    .line 810
    .line 811
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 812
    .line 813
    .line 814
    :cond_24
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 815
    .line 816
    .line 817
    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/PaddingKt;->calculateStartPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 818
    .line 819
    .line 820
    move-result v7

    .line 821
    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/PaddingKt;->calculateEndPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 822
    .line 823
    .line 824
    move-result v0

    .line 825
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 826
    .line 827
    if-eqz v5, :cond_25

    .line 828
    .line 829
    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getHorizontalIconPadding()F

    .line 830
    .line 831
    .line 832
    move-result v10

    .line 833
    sub-float/2addr v7, v10

    .line 834
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 835
    .line 836
    .line 837
    move-result v7

    .line 838
    const/4 v10, 0x0

    .line 839
    int-to-float v13, v10

    .line 840
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 841
    .line 842
    .line 843
    move-result v13

    .line 844
    invoke-static {v7, v13}, Lkotlin/ranges/s;->t(FF)F

    .line 845
    .line 846
    .line 847
    move-result v7

    .line 848
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 849
    .line 850
    .line 851
    move-result v7

    .line 852
    goto :goto_e

    .line 853
    :cond_25
    const/4 v10, 0x0

    .line 854
    :goto_e
    move/from16 v19, v7

    .line 855
    .line 856
    const/16 v20, 0x0

    .line 857
    .line 858
    if-eqz v6, :cond_26

    .line 859
    .line 860
    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getHorizontalIconPadding()F

    .line 861
    .line 862
    .line 863
    move-result v7

    .line 864
    sub-float/2addr v0, v7

    .line 865
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 866
    .line 867
    .line 868
    move-result v0

    .line 869
    int-to-float v7, v10

    .line 870
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 871
    .line 872
    .line 873
    move-result v7

    .line 874
    invoke-static {v0, v7}, Lkotlin/ranges/s;->t(FF)F

    .line 875
    .line 876
    .line 877
    move-result v0

    .line 878
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 879
    .line 880
    .line 881
    move-result v0

    .line 882
    :cond_26
    move/from16 v21, v0

    .line 883
    .line 884
    const/16 v22, 0x0

    .line 885
    .line 886
    const/16 v23, 0xa

    .line 887
    .line 888
    const/16 v24, 0x0

    .line 889
    .line 890
    move-object/from16 v18, v8

    .line 891
    .line 892
    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    const v7, 0xf304373

    .line 897
    .line 898
    .line 899
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 900
    .line 901
    .line 902
    if-eqz v4, :cond_27

    .line 903
    .line 904
    const-string v7, "Hint"

    .line 905
    .line 906
    invoke-static {v8, v7}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 907
    .line 908
    .line 909
    move-result-object v7

    .line 910
    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 911
    .line 912
    .line 913
    move-result-object v7

    .line 914
    shr-int/lit8 v10, v12, 0x6

    .line 915
    .line 916
    and-int/lit8 v10, v10, 0x70

    .line 917
    .line 918
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 919
    .line 920
    .line 921
    move-result-object v10

    .line 922
    invoke-interface {v4, v7, v1, v10}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    :cond_27
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 926
    .line 927
    .line 928
    const v7, 0xf3043f4

    .line 929
    .line 930
    .line 931
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 932
    .line 933
    .line 934
    if-eqz v3, :cond_2c

    .line 935
    .line 936
    const-string v7, "Label"

    .line 937
    .line 938
    invoke-static {v8, v7}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 939
    .line 940
    .line 941
    move-result-object v7

    .line 942
    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 943
    .line 944
    .line 945
    move-result-object v7

    .line 946
    const v10, 0x2bb5b5d7

    .line 947
    .line 948
    .line 949
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 950
    .line 951
    .line 952
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 953
    .line 954
    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 955
    .line 956
    .line 957
    move-result-object v10

    .line 958
    const/4 v13, 0x0

    .line 959
    invoke-static {v10, v13, v1, v13}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 960
    .line 961
    .line 962
    move-result-object v10

    .line 963
    const v14, -0x4ee9b9da

    .line 964
    .line 965
    .line 966
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 967
    .line 968
    .line 969
    invoke-static {v1, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 970
    .line 971
    .line 972
    move-result v14

    .line 973
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 974
    .line 975
    .line 976
    move-result-object v13

    .line 977
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 978
    .line 979
    .line 980
    move-result-object v15

    .line 981
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 982
    .line 983
    .line 984
    move-result-object v7

    .line 985
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 986
    .line 987
    .line 988
    move-result-object v4

    .line 989
    instance-of v4, v4, Landroidx/compose/runtime/Applier;

    .line 990
    .line 991
    if-nez v4, :cond_28

    .line 992
    .line 993
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 994
    .line 995
    .line 996
    :cond_28
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 997
    .line 998
    .line 999
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1000
    .line 1001
    .line 1002
    move-result v4

    .line 1003
    if-eqz v4, :cond_29

    .line 1004
    .line 1005
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 1006
    .line 1007
    .line 1008
    goto :goto_f

    .line 1009
    :cond_29
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1010
    .line 1011
    .line 1012
    :goto_f
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v4

    .line 1016
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v15

    .line 1020
    invoke-static {v4, v10, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v10

    .line 1027
    invoke-static {v4, v13, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v10

    .line 1034
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v13

    .line 1038
    if-nez v13, :cond_2a

    .line 1039
    .line 1040
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v13

    .line 1044
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v15

    .line 1048
    invoke-static {v13, v15}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v13

    .line 1052
    if-nez v13, :cond_2b

    .line 1053
    .line 1054
    :cond_2a
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v13

    .line 1058
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1059
    .line 1060
    .line 1061
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v13

    .line 1065
    invoke-interface {v4, v13, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 1066
    .line 1067
    .line 1068
    :cond_2b
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v4

    .line 1072
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v4

    .line 1076
    const/4 v10, 0x0

    .line 1077
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v13

    .line 1081
    invoke-interface {v7, v4, v1, v13}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    const v4, 0x7ab4aae9

    .line 1085
    .line 1086
    .line 1087
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1088
    .line 1089
    .line 1090
    sget-object v4, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1091
    .line 1092
    shr-int/lit8 v4, v12, 0x6

    .line 1093
    .line 1094
    and-int/lit8 v4, v4, 0xe

    .line 1095
    .line 1096
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v4

    .line 1100
    invoke-interface {v3, v1, v4}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1104
    .line 1105
    .line 1106
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1107
    .line 1108
    .line 1109
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1110
    .line 1111
    .line 1112
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1113
    .line 1114
    .line 1115
    :cond_2c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1116
    .line 1117
    .line 1118
    const-string v4, "TextField"

    .line 1119
    .line 1120
    invoke-static {v8, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v4

    .line 1124
    invoke-interface {v4, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v0

    .line 1128
    const v4, 0x2bb5b5d7

    .line 1129
    .line 1130
    .line 1131
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1132
    .line 1133
    .line 1134
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 1135
    .line 1136
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v4

    .line 1140
    const/16 v7, 0x30

    .line 1141
    .line 1142
    const/4 v8, 0x1

    .line 1143
    invoke-static {v4, v8, v1, v7}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v4

    .line 1147
    const v7, -0x4ee9b9da

    .line 1148
    .line 1149
    .line 1150
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1151
    .line 1152
    .line 1153
    const/4 v7, 0x0

    .line 1154
    invoke-static {v1, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1155
    .line 1156
    .line 1157
    move-result v8

    .line 1158
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v7

    .line 1162
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v10

    .line 1166
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0

    .line 1170
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v13

    .line 1174
    instance-of v13, v13, Landroidx/compose/runtime/Applier;

    .line 1175
    .line 1176
    if-nez v13, :cond_2d

    .line 1177
    .line 1178
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1179
    .line 1180
    .line 1181
    :cond_2d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1182
    .line 1183
    .line 1184
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1185
    .line 1186
    .line 1187
    move-result v13

    .line 1188
    if-eqz v13, :cond_2e

    .line 1189
    .line 1190
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 1191
    .line 1192
    .line 1193
    goto :goto_10

    .line 1194
    :cond_2e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1195
    .line 1196
    .line 1197
    :goto_10
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v10

    .line 1201
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v13

    .line 1205
    invoke-static {v10, v4, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v4

    .line 1212
    invoke-static {v10, v7, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v4

    .line 1219
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1220
    .line 1221
    .line 1222
    move-result v7

    .line 1223
    if-nez v7, :cond_2f

    .line 1224
    .line 1225
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v7

    .line 1229
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v13

    .line 1233
    invoke-static {v7, v13}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1234
    .line 1235
    .line 1236
    move-result v7

    .line 1237
    if-nez v7, :cond_30

    .line 1238
    .line 1239
    :cond_2f
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v7

    .line 1243
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1244
    .line 1245
    .line 1246
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v7

    .line 1250
    invoke-interface {v10, v7, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 1251
    .line 1252
    .line 1253
    :cond_30
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v4

    .line 1257
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v4

    .line 1261
    const/4 v7, 0x0

    .line 1262
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v7

    .line 1266
    invoke-interface {v0, v4, v1, v7}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1267
    .line 1268
    .line 1269
    const v0, 0x7ab4aae9

    .line 1270
    .line 1271
    .line 1272
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1273
    .line 1274
    .line 1275
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1276
    .line 1277
    shr-int/lit8 v0, v12, 0x3

    .line 1278
    .line 1279
    and-int/lit8 v0, v0, 0xe

    .line 1280
    .line 1281
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    invoke-interface {v2, v1, v0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1286
    .line 1287
    .line 1288
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1289
    .line 1290
    .line 1291
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1292
    .line 1293
    .line 1294
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1295
    .line 1296
    .line 1297
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1298
    .line 1299
    .line 1300
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1301
    .line 1302
    .line 1303
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1304
    .line 1305
    .line 1306
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1307
    .line 1308
    .line 1309
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1310
    .line 1311
    .line 1312
    move-result v0

    .line 1313
    if-eqz v0, :cond_31

    .line 1314
    .line 1315
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1316
    .line 1317
    .line 1318
    :cond_31
    :goto_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v12

    .line 1322
    if-eqz v12, :cond_32

    .line 1323
    .line 1324
    new-instance v13, Landroidx/compose/material/TextFieldKt$TextFieldLayout$2;

    .line 1325
    .line 1326
    move-object v0, v13

    .line 1327
    move-object/from16 v1, p0

    .line 1328
    .line 1329
    move-object/from16 v2, p1

    .line 1330
    .line 1331
    move-object/from16 v3, p2

    .line 1332
    .line 1333
    move-object/from16 v4, p3

    .line 1334
    .line 1335
    move-object/from16 v5, p4

    .line 1336
    .line 1337
    move-object/from16 v6, p5

    .line 1338
    .line 1339
    move/from16 v7, p6

    .line 1340
    .line 1341
    move/from16 v8, p7

    .line 1342
    .line 1343
    move-object/from16 v9, p8

    .line 1344
    .line 1345
    move/from16 v10, p10

    .line 1346
    .line 1347
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material/TextFieldKt$TextFieldLayout$2;-><init>(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/q;Lv3/p;Lv3/p;ZFLandroidx/compose/foundation/layout/PaddingValues;I)V

    .line 1348
    .line 1349
    .line 1350
    invoke-interface {v12, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 1351
    .line 1352
    .line 1353
    :cond_32
    return-void
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
.end method

.method public static final synthetic access$calculateHeight-O3s9Psw(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I
    .locals 0

    invoke-static/range {p0 .. p9}, Landroidx/compose/material/TextFieldKt;->calculateHeight-O3s9Psw(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$calculateWidth-VsPV1Ek(IIIIIJ)I
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/material/TextFieldKt;->calculateWidth-VsPV1Ek(IIIIIJ)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$placeWithLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIIFF)V
    .locals 0

    invoke-static/range {p0 .. p12}, Landroidx/compose/material/TextFieldKt;->placeWithLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIIFF)V

    return-void
.end method

.method public static final synthetic access$placeWithoutLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/foundation/layout/PaddingValues;)V
    .locals 0

    invoke-static/range {p0 .. p9}, Landroidx/compose/material/TextFieldKt;->placeWithoutLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/foundation/layout/PaddingValues;)V

    return-void
.end method

.method private static final calculateHeight-O3s9Psw(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I
    .locals 2

    .line 1
    sget v0, Landroidx/compose/material/TextFieldKt;->TextFieldTopPadding:F

    .line 2
    .line 3
    mul-float/2addr v0, p8

    .line 4
    invoke-interface {p9}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    mul-float/2addr v1, p8

    .line 9
    invoke-interface {p9}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    .line 10
    .line 11
    .line 12
    move-result p9

    .line 13
    mul-float/2addr p9, p8

    .line 14
    invoke-static {p0, p5}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    int-to-float p1, p2

    .line 21
    add-float/2addr p1, v0

    .line 22
    int-to-float p0, p0

    .line 23
    add-float/2addr p1, p0

    .line 24
    add-float/2addr p1, p9

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    int-to-float p0, p0

    .line 27
    add-float/2addr v1, p0

    .line 28
    add-float p1, v1, p9

    .line 29
    .line 30
    :goto_0
    invoke-static {p1}, Lkotlin/math/b;->L0(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p6, p7}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0
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
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
.end method

.method private static final calculateWidth-VsPV1Ek(IIIIIJ)I
    .locals 0

    .line 1
    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    add-int/2addr p0, p2

    .line 10
    add-int/2addr p0, p1

    .line 11
    invoke-static {p5, p6}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
    .line 20
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

.method public static final drawIndicatorLine(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;)Landroidx/compose/ui/Modifier;
    .locals 2
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/foundation/BorderStroke;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/compose/foundation/BorderStroke;->getWidth-D9Ej5fM()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Landroidx/compose/material/TextFieldKt$drawIndicatorLine$1;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, Landroidx/compose/material/TextFieldKt$drawIndicatorLine$1;-><init>(FLandroidx/compose/foundation/BorderStroke;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithContent(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
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
.end method

.method public static final getFirstBaselineOffset()F
    .locals 1

    sget v0, Landroidx/compose/material/TextFieldKt;->FirstBaselineOffset:F

    return v0
.end method

.method public static final getTextFieldBottomPadding()F
    .locals 1

    sget v0, Landroidx/compose/material/TextFieldKt;->TextFieldBottomPadding:F

    return v0
.end method

.method public static final getTextFieldTopPadding()F
    .locals 1

    sget v0, Landroidx/compose/material/TextFieldKt;->TextFieldTopPadding:F

    return v0
.end method

.method private static final placeWithLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIIFF)V
    .locals 15

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x4

    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v1, p0

    .line 24
    move-object/from16 v2, p6

    .line 25
    .line 26
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    if-eqz p7, :cond_1

    .line 30
    .line 31
    invoke-virtual/range {p7 .. p7}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    sub-int v10, p1, v1

    .line 36
    .line 37
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual/range {p7 .. p7}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    const/4 v12, 0x0

    .line 52
    const/4 v13, 0x4

    .line 53
    const/4 v14, 0x0

    .line 54
    move-object v8, p0

    .line 55
    move-object/from16 v9, p7

    .line 56
    .line 57
    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    if-eqz p8, :cond_2

    .line 63
    .line 64
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 65
    .line 66
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-static {}, Landroidx/compose/material/TextFieldImplKt;->getTextFieldPadding()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    mul-float v0, v0, p12

    .line 84
    .line 85
    invoke-static {v0}, Lkotlin/math/b;->L0(F)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    :goto_0
    sub-int v1, v0, p9

    .line 90
    .line 91
    int-to-float v1, v1

    .line 92
    mul-float v1, v1, p11

    .line 93
    .line 94
    invoke-static {v1}, Lkotlin/math/b;->L0(F)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    sub-int v3, v0, v1

    .line 99
    .line 100
    invoke-static/range {p6 .. p6}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v4, 0x0

    .line 105
    const/4 v5, 0x4

    .line 106
    const/4 v6, 0x0

    .line 107
    move-object v0, p0

    .line 108
    move-object/from16 v1, p4

    .line 109
    .line 110
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    invoke-static/range {p6 .. p6}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    const/4 v11, 0x0

    .line 118
    const/4 v12, 0x4

    .line 119
    const/4 v13, 0x0

    .line 120
    move-object v7, p0

    .line 121
    move-object/from16 v8, p3

    .line 122
    .line 123
    move/from16 v10, p10

    .line 124
    .line 125
    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    if-eqz p5, :cond_4

    .line 129
    .line 130
    invoke-static/range {p6 .. p6}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v5, 0x4

    .line 136
    const/4 v6, 0x0

    .line 137
    move-object v0, p0

    .line 138
    move-object/from16 v1, p5

    .line 139
    .line 140
    move/from16 v3, p10

    .line 141
    .line 142
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_4
    return-void
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

.method private static final placeWithoutLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/foundation/layout/PaddingValues;)V
    .locals 17

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    invoke-interface/range {p9 .. p9}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-float v1, v1, p8

    .line 8
    .line 9
    invoke-static {v1}, Lkotlin/math/b;->L0(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz p5, :cond_0

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-interface {v2, v3, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x4

    .line 32
    const/4 v8, 0x0

    .line 33
    move-object/from16 v2, p0

    .line 34
    .line 35
    move-object/from16 v3, p5

    .line 36
    .line 37
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    if-eqz p6, :cond_1

    .line 41
    .line 42
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    sub-int v11, p1, v2

    .line 47
    .line 48
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 49
    .line 50
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-interface {v2, v3, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x4

    .line 64
    const/4 v15, 0x0

    .line 65
    move-object/from16 v9, p0

    .line 66
    .line 67
    move-object/from16 v10, p6

    .line 68
    .line 69
    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    if-eqz p7, :cond_2

    .line 73
    .line 74
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 75
    .line 76
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-interface {v2, v3, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    move v6, v2

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    move v6, v1

    .line 91
    :goto_0
    invoke-static/range {p5 .. p5}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x4

    .line 97
    const/4 v9, 0x0

    .line 98
    move-object/from16 v3, p0

    .line 99
    .line 100
    move-object/from16 v4, p3

    .line 101
    .line 102
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    if-eqz p4, :cond_4

    .line 106
    .line 107
    if-eqz p7, :cond_3

    .line 108
    .line 109
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 110
    .line 111
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    :cond_3
    move v13, v1

    .line 124
    invoke-static/range {p5 .. p5}, Landroidx/compose/material/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 125
    .line 126
    .line 127
    move-result v12

    .line 128
    const/4 v14, 0x0

    .line 129
    const/4 v15, 0x4

    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    move-object/from16 v10, p0

    .line 133
    .line 134
    move-object/from16 v11, p4

    .line 135
    .line 136
    invoke-static/range {v10 .. v16}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_4
    return-void
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
.end method
