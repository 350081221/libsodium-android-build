.class public final Landroidx/compose/material3/TimePickerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0006\n\u0002\u0008\u000e\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a8\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a+\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a-\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a3\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a3\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0017\u001a\'\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001c\u001a\'\u0010\u001f\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 \u001a\'\u0010!\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008!\u0010 \u001a?\u0010\'\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0003\u00a2\u0006\u0004\u0008\'\u0010(\u001aS\u00102\u001a\u00020\u00082\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020$2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00080+2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u00101\u001a\u0018\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00080-\u00a2\u0006\u0002\u0008/\u00a2\u0006\u0002\u00080H\u0003\u00a2\u0006\u0004\u00082\u00103\u001a\u0017\u00104\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u00084\u00105\u001a:\u0010;\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u00089\u0010:\u001a\'\u0010<\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008<\u0010=\u001a\u001c\u0010>\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a/\u0010?\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0003\u00a2\u0006\u0004\u0008?\u0010@\u001a]\u0010I\u001a\u00020\u00082\u0006\u00108\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00106\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000e2!\u0010F\u001a\u001d\u0012\u0013\u0012\u00110A\u00a2\u0006\u000c\u0008D\u0012\u0008\u0008E\u0012\u0004\u0008\u0008(6\u0012\u0004\u0012\u00020\u00080-H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008G\u0010H\u001ab\u0010Q\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020A2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00080-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0008\u0008\u0002\u0010L\u001a\u00020K2\u0008\u0008\u0002\u0010N\u001a\u00020M2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008O\u0010P\u001a7\u0010V\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010S\u001a\u00020R2\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\u00080+\u00a2\u0006\u0002\u0008/H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008T\u0010U\u001a*\u0010[\u001a\u00020X2\u0006\u00108\u001a\u0002072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\u000eH\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008Y\u0010Z\u001a$\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\\0_2\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\\H\u0002\u001a(\u0010e\u001a\u00020\\2\u0006\u0010a\u001a\u00020\\2\u0006\u0010b\u001a\u00020\\2\u0006\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020\u000eH\u0002\u001a\u0018\u0010h\u001a\u00020\\2\u0006\u0010f\u001a\u00020\\2\u0006\u0010g\u001a\u00020\\H\u0002\u001a\u0014\u0010i\u001a\u00020\u0002*\u00020\u00022\u0006\u0010i\u001a\u00020\u0011H\u0003\"\u0014\u0010j\u001a\u00020\\8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008j\u0010k\"\u0014\u0010m\u001a\u00020l8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008m\u0010n\"\u0014\u0010o\u001a\u00020\\8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008o\u0010k\"\u0014\u0010p\u001a\u00020\\8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008p\u0010k\"\u0014\u0010q\u001a\u00020\\8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008q\u0010k\"\u0014\u0010r\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008r\u0010k\"\u0014\u0010s\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008s\u0010k\"\u0014\u0010t\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010k\"\u0014\u0010u\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010k\"\u0014\u0010v\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008v\u0010k\"\u0014\u0010w\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010k\"\u0014\u0010x\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008x\u0010k\"\u0014\u0010y\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010k\"\u0014\u0010z\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008z\u0010k\"\u001a\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008|\u0010}\"\u001a\u0010~\u001a\u0008\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008~\u0010}\"\u001a\u0010\u007f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u007f\u0010}\"\u0016\u0010\u0080\u0001\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010k\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0086\u0001\u00b2\u0006\r\u0010\u0081\u0001\u001a\u00020\u00118\nX\u008a\u0084\u0002\u00b2\u0006\u000f\u0010\u0082\u0001\u001a\u00020A8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000f\u0010\u0083\u0001\u001a\u00020A8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0085\u0001\u001a\u00030\u0084\u00018\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/material3/TimePickerState;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/material3/TimePickerColors;",
        "colors",
        "Landroidx/compose/material3/TimePickerLayoutType;",
        "layoutType",
        "Lkotlin/r2;",
        "TimePicker-mT9BvqQ",
        "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V",
        "TimePicker",
        "TimeInput",
        "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V",
        "",
        "initialHour",
        "initialMinute",
        "",
        "is24Hour",
        "rememberTimePickerState",
        "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;",
        "autoSwitchToMinute",
        "VerticalTimePicker",
        "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V",
        "HorizontalTimePicker",
        "TimeInputImpl",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V",
        "HorizontalClockDisplay",
        "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "VerticalClockDisplay",
        "ClockDisplayNumbers",
        "HorizontalPeriodToggle",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "VerticalPeriodToggle",
        "Landroidx/compose/ui/layout/MeasurePolicy;",
        "measurePolicy",
        "Landroidx/compose/ui/graphics/Shape;",
        "startShape",
        "endShape",
        "PeriodToggleImpl",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V",
        "checked",
        "shape",
        "Lkotlin/Function0;",
        "onClick",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/RowScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/u;",
        "content",
        "ToggleItem",
        "(ZLandroidx/compose/ui/graphics/Shape;Lv3/a;Landroidx/compose/material3/TimePickerColors;Lv3/q;Landroidx/compose/runtime/Composer;I)V",
        "DisplaySeparator",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "value",
        "Landroidx/compose/material3/Selection;",
        "selection",
        "TimeSelector-uXwN82Y",
        "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V",
        "TimeSelector",
        "ClockFace",
        "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V",
        "drawSelector",
        "ClockText",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "prevValue",
        "max",
        "Lkotlin/v0;",
        "name",
        "onNewValue",
        "timeInputOnChange-gIWD5Rc",
        "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILv3/l;)V",
        "timeInputOnChange",
        "onValueChange",
        "Landroidx/compose/foundation/text/KeyboardOptions;",
        "keyboardOptions",
        "Landroidx/compose/foundation/text/KeyboardActions;",
        "keyboardActions",
        "TimePickerTextField-lxUZ_iY",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V",
        "TimePickerTextField",
        "Landroidx/compose/ui/unit/Dp;",
        "radius",
        "CircularLayout-uFdPcIQ",
        "(Landroidx/compose/ui/Modifier;FLv3/p;Landroidx/compose/runtime/Composer;II)V",
        "CircularLayout",
        "number",
        "",
        "numberContentDescription-YKJpE6Y",
        "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;",
        "numberContentDescription",
        "",
        "current",
        "new",
        "Lkotlin/u0;",
        "valuesForAnimation",
        "x1",
        "y1",
        "x2",
        "y2",
        "dist",
        "y",
        "x",
        "atan",
        "visible",
        "FullCircle",
        "F",
        "",
        "QuarterCircle",
        "D",
        "RadiansPerMinute",
        "RadiansPerHour",
        "SeparatorZIndex",
        "OuterCircleSizeRadius",
        "InnerCircleRadius",
        "ClockDisplayBottomMargin",
        "ClockFaceBottomMargin",
        "DisplaySeparatorWidth",
        "SupportLabelTop",
        "TimeInputBottomPadding",
        "MaxDistance",
        "MinimumInteractiveSize",
        "",
        "Minutes",
        "Ljava/util/List;",
        "Hours",
        "ExtraHours",
        "PeriodToggleMargin",
        "touchExplorationServicesEnabled",
        "hourValue",
        "minuteValue",
        "Landroidx/compose/ui/geometry/Offset;",
        "center",
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
        "SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 13 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 14 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 15 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 16 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 17 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1843:1\n1116#2,6:1844\n1116#2,6:1930\n1116#2,6:1936\n1116#2,6:2184\n1116#2,6:2190\n1116#2,6:2197\n1116#2,6:2231\n1116#2,6:2237\n1116#2,6:2247\n1116#2,3:2301\n1119#2,3:2307\n1116#2,6:2311\n1116#2,6:2317\n1116#2,6:2325\n1116#2,3:2336\n1119#2,3:2342\n1116#2,6:2346\n1116#2,6:2352\n1116#2,6:2392\n1116#2,6:2403\n1116#2,6:2409\n1116#2,6:2487\n1116#2,6:2506\n1116#2,6:2512\n74#3,6:1850\n80#3:1884\n84#3:1889\n73#3,7:2022\n80#3:2057\n84#3:2102\n74#3,6:2415\n80#3:2449\n84#3:2505\n78#4,11:1856\n91#4:1888\n78#4,11:1896\n91#4:1928\n78#4,11:1948\n78#4,11:1983\n91#4:2015\n91#4:2020\n78#4,11:2029\n78#4,11:2064\n91#4:2096\n91#4:2101\n78#4,11:2110\n78#4,11:2145\n91#4:2177\n91#4:2182\n78#4,11:2203\n91#4:2246\n78#4,11:2260\n91#4:2292\n78#4,11:2363\n91#4:2401\n78#4,11:2421\n78#4,11:2458\n91#4:2497\n91#4:2504\n78#4,11:2518\n91#4:2549\n456#5,8:1867\n464#5,3:1881\n467#5,3:1885\n456#5,8:1907\n464#5,3:1921\n467#5,3:1925\n456#5,8:1959\n464#5,3:1973\n456#5,8:1994\n464#5,3:2008\n467#5,3:2012\n467#5,3:2017\n456#5,8:2040\n464#5,3:2054\n456#5,8:2075\n464#5,3:2089\n467#5,3:2093\n467#5,3:2098\n456#5,8:2121\n464#5,3:2135\n456#5,8:2156\n464#5,3:2170\n467#5,3:2174\n467#5,3:2179\n456#5,8:2214\n464#5,3:2228\n467#5,3:2243\n456#5,8:2271\n464#5,3:2285\n467#5,3:2289\n25#5:2300\n25#5:2335\n456#5,8:2374\n464#5,3:2388\n467#5,3:2398\n456#5,8:2432\n464#5,3:2446\n456#5,8:2469\n464#5,3:2483\n467#5,3:2494\n467#5,3:2501\n456#5,8:2529\n464#5,6:2543\n3737#6,6:1875\n3737#6,6:1915\n3737#6,6:1967\n3737#6,6:2002\n3737#6,6:2048\n3737#6,6:2083\n3737#6,6:2129\n3737#6,6:2164\n3737#6,6:2222\n3737#6,6:2279\n3737#6,6:2382\n3737#6,6:2440\n3737#6,6:2477\n3737#6,6:2537\n87#7,6:1890\n93#7:1924\n97#7:1929\n87#7,6:1942\n93#7:1976\n97#7:2021\n86#7,7:2103\n93#7:2138\n97#7:2183\n68#8,6:1977\n74#8:2011\n78#8:2016\n68#8,6:2058\n74#8:2092\n78#8:2097\n68#8,6:2139\n74#8:2173\n78#8:2178\n69#8,5:2255\n74#8:2288\n78#8:2293\n69#8,5:2358\n74#8:2391\n78#8:2402\n68#8,6:2452\n74#8:2486\n78#8:2498\n141#9:2196\n145#9:2294\n143#9:2295\n159#9:2450\n157#9:2451\n153#9:2499\n155#9:2500\n149#9:2550\n151#9:2551\n147#9:2552\n154#10:2253\n154#10:2564\n154#10:2565\n154#10:2566\n154#10:2567\n154#10:2568\n154#10:2569\n154#10:2570\n154#10:2571\n154#10:2572\n154#10:2584\n74#11:2254\n74#11:2323\n74#11:2493\n487#12,4:2296\n491#12,2:2304\n495#12:2310\n487#12,4:2331\n491#12,2:2339\n495#12:2345\n487#13:2306\n487#13:2341\n1#14:2324\n135#15:2553\n81#16:2554\n81#16:2555\n107#16,2:2556\n81#16:2558\n107#16,2:2559\n81#16:2561\n107#16,2:2562\n151#17,3:2573\n33#17,4:2576\n154#17,2:2580\n38#17:2582\n156#17:2583\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n559#1:1844,6\n819#1:1930,6\n822#1:1936,6\n1004#1:2184,6\n1049#1:2190,6\n1106#1:2197,6\n1117#1:2231,6\n1131#1:2237,6\n1153#1:2247,6\n1207#1:2301,3\n1207#1:2307,3\n1210#1:2311,6\n1214#1:2317,6\n1471#1:2325,6\n1472#1:2336,3\n1472#1:2342,3\n1492#1:2346,6\n1494#1:2352,6\n1503#1:2392,6\n1575#1:2403,6\n1576#1:2409,6\n1609#1:2487,6\n1667#1:2506,6\n1683#1:2512,6\n785#1:1850,6\n785#1:1884\n785#1:1889\n923#1:2022,7\n923#1:2057\n923#1:2102\n1583#1:2415,6\n1583#1:2449\n1583#1:2505\n785#1:1856,11\n785#1:1888\n803#1:1896,11\n803#1:1928\n826#1:1948,11\n907#1:1983,11\n907#1:2015\n826#1:2020\n923#1:2029,11\n926#1:2064,11\n926#1:2096\n923#1:2101\n942#1:2110,11\n945#1:2145,11\n945#1:2177\n942#1:2182\n1104#1:2203,11\n1104#1:2246\n1175#1:2260,11\n1175#1:2292\n1487#1:2363,11\n1487#1:2401\n1583#1:2421,11\n1602#1:2458,11\n1602#1:2497\n1583#1:2504\n1681#1:2518,11\n1681#1:2549\n785#1:1867,8\n785#1:1881,3\n785#1:1885,3\n803#1:1907,8\n803#1:1921,3\n803#1:1925,3\n826#1:1959,8\n826#1:1973,3\n907#1:1994,8\n907#1:2008,3\n907#1:2012,3\n826#1:2017,3\n923#1:2040,8\n923#1:2054,3\n926#1:2075,8\n926#1:2089,3\n926#1:2093,3\n923#1:2098,3\n942#1:2121,8\n942#1:2135,3\n945#1:2156,8\n945#1:2170,3\n945#1:2174,3\n942#1:2179,3\n1104#1:2214,8\n1104#1:2228,3\n1104#1:2243,3\n1175#1:2271,8\n1175#1:2285,3\n1175#1:2289,3\n1207#1:2300\n1472#1:2335\n1487#1:2374,8\n1487#1:2388,3\n1487#1:2398,3\n1583#1:2432,8\n1583#1:2446,3\n1602#1:2469,8\n1602#1:2483,3\n1602#1:2494,3\n1583#1:2501,3\n1681#1:2529,8\n1681#1:2543,6\n785#1:1875,6\n803#1:1915,6\n826#1:1967,6\n907#1:2002,6\n923#1:2048,6\n926#1:2083,6\n942#1:2129,6\n945#1:2164,6\n1104#1:2222,6\n1175#1:2279,6\n1487#1:2382,6\n1583#1:2440,6\n1602#1:2477,6\n1681#1:2537,6\n803#1:1890,6\n803#1:1924\n803#1:1929\n826#1:1942,6\n826#1:1976\n826#1:2021\n942#1:2103,7\n942#1:2138\n942#1:2183\n907#1:1977,6\n907#1:2011\n907#1:2016\n926#1:2058,6\n926#1:2092\n926#1:2097\n945#1:2139,6\n945#1:2173\n945#1:2178\n1175#1:2255,5\n1175#1:2288\n1175#1:2293\n1487#1:2358,5\n1487#1:2391\n1487#1:2402\n1602#1:2452,6\n1602#1:2486\n1602#1:2498\n1103#1:2196\n1199#1:2294\n1201#1:2295\n1596#1:2450\n1598#1:2451\n1655#1:2499\n1657#1:2500\n1727#1:2550\n1729#1:2551\n1731#1:2552\n1154#1:2253\n1787#1:2564\n1788#1:2565\n1789#1:2566\n1790#1:2567\n1791#1:2568\n1793#1:2569\n1794#1:2570\n1795#1:2571\n1796#1:2572\n1800#1:2584\n1167#1:2254\n1470#1:2323\n1615#1:2493\n1207#1:2296,4\n1207#1:2304,2\n1207#1:2310\n1472#1:2331,4\n1472#1:2339,2\n1472#1:2345\n1207#1:2306\n1472#1:2341\n1810#1:2553\n209#1:2554\n819#1:2555\n819#1:2556,2\n822#1:2558\n822#1:2559,2\n1471#1:2561\n1471#1:2562,2\n1799#1:2573,3\n1799#1:2576,4\n1799#1:2580,2\n1799#1:2582\n1799#1:2583\n*E\n"
    }
.end annotation


# static fields
.field private static final ClockDisplayBottomMargin:F

.field private static final ClockFaceBottomMargin:F

.field private static final DisplaySeparatorWidth:F

.field private static final ExtraHours:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final FullCircle:F = 6.2831855f

.field private static final Hours:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final InnerCircleRadius:F

.field private static final MaxDistance:F

.field private static final MinimumInteractiveSize:F

.field private static final Minutes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final OuterCircleSizeRadius:F

.field private static final PeriodToggleMargin:F

.field private static final QuarterCircle:D = 1.5707963267948966

.field private static final RadiansPerHour:F = 0.5235988f

.field private static final RadiansPerMinute:F = 0.10471976f

.field private static final SeparatorZIndex:F = 2.0f

.field private static final SupportLabelTop:F

.field private static final TimeInputBottomPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    const/16 v0, 0x65

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
    sput v0, Landroidx/compose/material3/TimePickerKt;->OuterCircleSizeRadius:F

    .line 9
    .line 10
    const/16 v0, 0x45

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
    sput v0, Landroidx/compose/material3/TimePickerKt;->InnerCircleRadius:F

    .line 18
    .line 19
    const/16 v0, 0x24

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
    sput v0, Landroidx/compose/material3/TimePickerKt;->ClockDisplayBottomMargin:F

    .line 27
    .line 28
    const/16 v0, 0x18

    .line 29
    .line 30
    int-to-float v0, v0

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    sput v1, Landroidx/compose/material3/TimePickerKt;->ClockFaceBottomMargin:F

    .line 36
    .line 37
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    sput v1, Landroidx/compose/material3/TimePickerKt;->DisplaySeparatorWidth:F

    .line 42
    .line 43
    const/4 v1, 0x7

    .line 44
    int-to-float v2, v1

    .line 45
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    sput v2, Landroidx/compose/material3/TimePickerKt;->SupportLabelTop:F

    .line 50
    .line 51
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    sput v0, Landroidx/compose/material3/TimePickerKt;->TimeInputBottomPadding:F

    .line 56
    .line 57
    const/16 v0, 0x4a

    .line 58
    .line 59
    int-to-float v0, v0

    .line 60
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sput v0, Landroidx/compose/material3/TimePickerKt;->MaxDistance:F

    .line 65
    .line 66
    const/16 v0, 0x30

    .line 67
    .line 68
    int-to-float v0, v0

    .line 69
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    sput v0, Landroidx/compose/material3/TimePickerKt;->MinimumInteractiveSize:F

    .line 74
    .line 75
    const/16 v0, 0xc

    .line 76
    .line 77
    new-array v2, v0, [Ljava/lang/Integer;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    aput-object v4, v2, v3

    .line 85
    .line 86
    const/4 v4, 0x5

    .line 87
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const/4 v6, 0x1

    .line 92
    aput-object v5, v2, v6

    .line 93
    .line 94
    const/16 v7, 0xa

    .line 95
    .line 96
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    const/4 v9, 0x2

    .line 101
    aput-object v8, v2, v9

    .line 102
    .line 103
    const/16 v10, 0xf

    .line 104
    .line 105
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    const/4 v11, 0x3

    .line 110
    aput-object v10, v2, v11

    .line 111
    .line 112
    const/16 v10, 0x14

    .line 113
    .line 114
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    const/4 v12, 0x4

    .line 119
    aput-object v10, v2, v12

    .line 120
    .line 121
    const/16 v10, 0x19

    .line 122
    .line 123
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    aput-object v10, v2, v4

    .line 128
    .line 129
    const/16 v10, 0x1e

    .line 130
    .line 131
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    const/4 v13, 0x6

    .line 136
    aput-object v10, v2, v13

    .line 137
    .line 138
    const/16 v10, 0x23

    .line 139
    .line 140
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    aput-object v10, v2, v1

    .line 145
    .line 146
    const/16 v10, 0x28

    .line 147
    .line 148
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    const/16 v14, 0x8

    .line 153
    .line 154
    aput-object v10, v2, v14

    .line 155
    .line 156
    const/16 v10, 0x2d

    .line 157
    .line 158
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    const/16 v15, 0x9

    .line 163
    .line 164
    aput-object v10, v2, v15

    .line 165
    .line 166
    const/16 v10, 0x32

    .line 167
    .line 168
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    aput-object v10, v2, v7

    .line 173
    .line 174
    const/16 v10, 0x37

    .line 175
    .line 176
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    const/16 v16, 0xb

    .line 181
    .line 182
    aput-object v10, v2, v16

    .line 183
    .line 184
    invoke-static {v2}, Lkotlin/collections/u;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    sput-object v2, Landroidx/compose/material3/TimePickerKt;->Minutes:Ljava/util/List;

    .line 189
    .line 190
    new-array v2, v0, [Ljava/lang/Integer;

    .line 191
    .line 192
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    aput-object v10, v2, v3

    .line 197
    .line 198
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    aput-object v10, v2, v6

    .line 203
    .line 204
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    aput-object v6, v2, v9

    .line 209
    .line 210
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    aput-object v6, v2, v11

    .line 215
    .line 216
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    aput-object v6, v2, v12

    .line 221
    .line 222
    aput-object v5, v2, v4

    .line 223
    .line 224
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    aput-object v4, v2, v13

    .line 229
    .line 230
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    aput-object v4, v2, v1

    .line 235
    .line 236
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    aput-object v1, v2, v14

    .line 241
    .line 242
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    aput-object v1, v2, v15

    .line 247
    .line 248
    aput-object v8, v2, v7

    .line 249
    .line 250
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    aput-object v1, v2, v16

    .line 255
    .line 256
    invoke-static {v2}, Lkotlin/collections/u;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    sput-object v1, Landroidx/compose/material3/TimePickerKt;->Hours:Ljava/util/List;

    .line 261
    .line 262
    new-instance v2, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    :goto_0
    if-ge v3, v4, :cond_0

    .line 276
    .line 277
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    check-cast v5, Ljava/lang/Number;

    .line 282
    .line 283
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    rem-int/2addr v5, v0

    .line 288
    add-int/2addr v5, v0

    .line 289
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    add-int/lit8 v3, v3, 0x1

    .line 297
    .line 298
    goto :goto_0

    .line 299
    :cond_0
    sput-object v2, Landroidx/compose/material3/TimePickerKt;->ExtraHours:Ljava/util/List;

    .line 300
    .line 301
    int-to-float v0, v0

    .line 302
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    sput v0, Landroidx/compose/material3/TimePickerKt;->PeriodToggleMargin:F

    .line 307
    .line 308
    return-void
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
.end method

.method private static final CircularLayout-uFdPcIQ(Landroidx/compose/ui/Modifier;FLv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 8
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "F",
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
    const v0, 0x5c474950

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p5, 0x1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    or-int/lit8 v2, p4, 0x6

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    and-int/lit8 v2, p4, 0x6

    .line 16
    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v2, 0x2

    .line 28
    :goto_0
    or-int/2addr v2, p4

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move v2, p4

    .line 31
    :goto_1
    and-int/lit8 v3, p5, 0x2

    .line 32
    .line 33
    const/16 v4, 0x20

    .line 34
    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    or-int/lit8 v2, v2, 0x30

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_3
    and-int/lit8 v3, p4, 0x30

    .line 41
    .line 42
    if-nez v3, :cond_5

    .line 43
    .line 44
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    move v3, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_4
    const/16 v3, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v2, v3

    .line 55
    :cond_5
    :goto_3
    and-int/lit8 v3, p5, 0x4

    .line 56
    .line 57
    if-eqz v3, :cond_6

    .line 58
    .line 59
    or-int/lit16 v2, v2, 0x180

    .line 60
    .line 61
    goto :goto_5

    .line 62
    :cond_6
    and-int/lit16 v3, p4, 0x180

    .line 63
    .line 64
    if-nez v3, :cond_8

    .line 65
    .line 66
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_7

    .line 71
    .line 72
    const/16 v3, 0x100

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_7
    const/16 v3, 0x80

    .line 76
    .line 77
    :goto_4
    or-int/2addr v2, v3

    .line 78
    :cond_8
    :goto_5
    and-int/lit16 v3, v2, 0x93

    .line 79
    .line 80
    const/16 v5, 0x92

    .line 81
    .line 82
    if-ne v3, v5, :cond_b

    .line 83
    .line 84
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-nez v3, :cond_9

    .line 89
    .line 90
    goto :goto_7

    .line 91
    :cond_9
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 92
    .line 93
    .line 94
    :cond_a
    :goto_6
    move-object v2, p0

    .line 95
    goto/16 :goto_a

    .line 96
    .line 97
    :cond_b
    :goto_7
    if-eqz v1, :cond_c

    .line 98
    .line 99
    sget-object p0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 100
    .line 101
    :cond_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_d

    .line 106
    .line 107
    const/4 v1, -0x1

    .line 108
    const-string v3, "androidx.compose.material3.CircularLayout (TimePicker.kt:1679)"

    .line 109
    .line 110
    invoke-static {v0, v2, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_d
    const v0, 0x6276dfff

    .line 114
    .line 115
    .line 116
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 117
    .line 118
    .line 119
    and-int/lit8 v0, v2, 0x70

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    if-ne v0, v4, :cond_e

    .line 123
    .line 124
    const/4 v0, 0x1

    .line 125
    goto :goto_8

    .line 126
    :cond_e
    move v0, v1

    .line 127
    :goto_8
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    if-nez v0, :cond_f

    .line 132
    .line 133
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-ne v3, v0, :cond_10

    .line 140
    .line 141
    :cond_f
    new-instance v3, Landroidx/compose/material3/TimePickerKt$CircularLayout$1$1;

    .line 142
    .line 143
    invoke-direct {v3, p1}, Landroidx/compose/material3/TimePickerKt$CircularLayout$1$1;-><init>(F)V

    .line 144
    .line 145
    .line 146
    invoke-interface {p3, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_10
    check-cast v3, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 150
    .line 151
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 152
    .line 153
    .line 154
    shr-int/lit8 v0, v2, 0x6

    .line 155
    .line 156
    and-int/lit8 v0, v0, 0xe

    .line 157
    .line 158
    shl-int/lit8 v2, v2, 0x3

    .line 159
    .line 160
    and-int/lit8 v2, v2, 0x70

    .line 161
    .line 162
    or-int/2addr v0, v2

    .line 163
    const v2, -0x4ee9b9da

    .line 164
    .line 165
    .line 166
    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 167
    .line 168
    .line 169
    invoke-static {p3, v1}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    sget-object v4, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 178
    .line 179
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-static {p0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    shl-int/lit8 v0, v0, 0x9

    .line 188
    .line 189
    and-int/lit16 v0, v0, 0x1c00

    .line 190
    .line 191
    or-int/lit8 v0, v0, 0x6

    .line 192
    .line 193
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    instance-of v7, v7, Landroidx/compose/runtime/Applier;

    .line 198
    .line 199
    if-nez v7, :cond_11

    .line 200
    .line 201
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 202
    .line 203
    .line 204
    :cond_11
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 205
    .line 206
    .line 207
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-eqz v7, :cond_12

    .line 212
    .line 213
    invoke-interface {p3, v5}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 214
    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_12
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 218
    .line 219
    .line 220
    :goto_9
    invoke-static {p3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-static {v5, v3, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-static {v5, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-nez v3, :cond_13

    .line 247
    .line 248
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-nez v3, :cond_14

    .line 261
    .line 262
    :cond_13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 274
    .line 275
    .line 276
    :cond_14
    invoke-static {p3}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    shr-int/lit8 v2, v0, 0x3

    .line 285
    .line 286
    and-int/lit8 v2, v2, 0x70

    .line 287
    .line 288
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-interface {v6, v1, p3, v2}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    const v1, 0x7ab4aae9

    .line 296
    .line 297
    .line 298
    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 299
    .line 300
    .line 301
    shr-int/lit8 v0, v0, 0x9

    .line 302
    .line 303
    and-int/lit8 v0, v0, 0xe

    .line 304
    .line 305
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-interface {p2, p3, v0}, Lv3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 313
    .line 314
    .line 315
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 316
    .line 317
    .line 318
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 319
    .line 320
    .line 321
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_a

    .line 326
    .line 327
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_6

    .line 331
    .line 332
    :goto_a
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    if-eqz p0, :cond_15

    .line 337
    .line 338
    new-instance p3, Landroidx/compose/material3/TimePickerKt$CircularLayout$2;

    .line 339
    .line 340
    move-object v1, p3

    .line 341
    move v3, p1

    .line 342
    move-object v4, p2

    .line 343
    move v5, p4

    .line 344
    move v6, p5

    .line 345
    invoke-direct/range {v1 .. v6}, Landroidx/compose/material3/TimePickerKt$CircularLayout$2;-><init>(Landroidx/compose/ui/Modifier;FLv3/p;II)V

    .line 346
    .line 347
    .line 348
    invoke-interface {p0, p3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 349
    .line 350
    .line 351
    :cond_15
    return-void
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

.method private static final ClockDisplayNumbers(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    const v0, -0x37b44575

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    and-int/lit8 v1, p3, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p3

    .line 24
    :goto_1
    and-int/lit8 v2, p3, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit8 v2, v1, 0x13

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    if-ne v2, v3, :cond_5

    .line 45
    .line 46
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 54
    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_6

    .line 62
    .line 63
    const/4 v2, -0x1

    .line 64
    const-string v3, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:962)"

    .line 65
    .line 66
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_6
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v1, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 74
    .line 75
    const/4 v2, 0x6

    .line 76
    invoke-virtual {v1, p2, v2}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget-object v2, Landroidx/compose/material3/tokens/TimePickerTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimePickerTokens;

    .line 81
    .line 82
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/TimePickerTokens;->getTimeSelectorLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v1, v2}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v1, Landroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1;

    .line 95
    .line 96
    invoke-direct {v1, p0, p1}, Landroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1;-><init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;)V

    .line 97
    .line 98
    .line 99
    const v2, -0x1c7c60b5

    .line 100
    .line 101
    .line 102
    const/4 v3, 0x1

    .line 103
    invoke-static {p2, v2, v3, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sget v2, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    .line 108
    .line 109
    or-int/lit8 v2, v2, 0x0

    .line 110
    .line 111
    or-int/lit8 v2, v2, 0x30

    .line 112
    .line 113
    invoke-static {v0, v1, p2, v2}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 114
    .line 115
    .line 116
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 123
    .line 124
    .line 125
    :cond_7
    :goto_4
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    if-eqz p2, :cond_8

    .line 130
    .line 131
    new-instance v0, Landroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$2;

    .line 132
    .line 133
    invoke-direct {v0, p0, p1, p3}, Landroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$2;-><init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;I)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 137
    .line 138
    .line 139
    :cond_8
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
.end method

.method public static final ClockFace(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V
    .locals 9
    .param p0    # Landroidx/compose/material3/TimePickerState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/material3/TimePickerColors;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    const v0, -0x5ae70b1c

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p4, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 41
    .line 42
    if-nez v2, :cond_5

    .line 43
    .line 44
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    const/16 v2, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v2, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v1, v2

    .line 56
    :cond_5
    and-int/lit16 v2, v1, 0x93

    .line 57
    .line 58
    const/16 v3, 0x92

    .line 59
    .line 60
    if-ne v2, v3, :cond_7

    .line 61
    .line 62
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 70
    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_8

    .line 78
    .line 79
    const/4 v2, -0x1

    .line 80
    const-string v3, "androidx.compose.material3.ClockFace (TimePicker.kt:1339)"

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_8
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 86
    .line 87
    invoke-static {}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->getCircleShape()Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {p1}, Landroidx/compose/material3/TimePickerColors;->getClockDialColor-0d7_KjU()J

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    invoke-static {v0, v2, v3, v1}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sget-object v1, Landroidx/compose/material3/tokens/TimePickerTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimePickerTokens;

    .line 100
    .line 101
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/TimePickerTokens;->getClockDialContainerSize-D9Ej5fM()F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v1, Landroidx/compose/material3/TimePickerKt$ClockFace$1;->INSTANCE:Landroidx/compose/material3/TimePickerKt$ClockFace$1;

    .line 110
    .line 111
    const/4 v2, 0x0

    .line 112
    const/4 v3, 0x1

    .line 113
    const/4 v4, 0x0

    .line 114
    invoke-static {v0, v2, v1, v3, v4}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p0}, Landroidx/compose/material3/TimePickerState;->getValues$material3_release()Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const/16 v5, 0x15e

    .line 123
    .line 124
    const/4 v6, 0x6

    .line 125
    invoke-static {v5, v2, v4, v6, v4}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    const/4 v5, 0x0

    .line 130
    new-instance v2, Landroidx/compose/material3/TimePickerKt$ClockFace$2;

    .line 131
    .line 132
    invoke-direct {v2, p0, p2, p1}, Landroidx/compose/material3/TimePickerKt$ClockFace$2;-><init>(Landroidx/compose/material3/TimePickerState;ZLandroidx/compose/material3/TimePickerColors;)V

    .line 133
    .line 134
    .line 135
    const v6, 0x610bd96f

    .line 136
    .line 137
    .line 138
    invoke-static {p3, v6, v3, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    const/16 v7, 0x6000

    .line 143
    .line 144
    const/16 v8, 0x8

    .line 145
    .line 146
    move-object v2, v0

    .line 147
    move-object v3, v4

    .line 148
    move-object v4, v5

    .line 149
    move-object v5, v6

    .line 150
    move-object v6, p3

    .line 151
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/CrossfadeKt;->Crossfade(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 152
    .line 153
    .line 154
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_9

    .line 159
    .line 160
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 161
    .line 162
    .line 163
    :cond_9
    :goto_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    if-eqz p3, :cond_a

    .line 168
    .line 169
    new-instance v0, Landroidx/compose/material3/TimePickerKt$ClockFace$3;

    .line 170
    .line 171
    invoke-direct {v0, p0, p1, p2, p4}, Landroidx/compose/material3/TimePickerKt$ClockFace$3;-><init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZI)V

    .line 172
    .line 173
    .line 174
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 175
    .line 176
    .line 177
    :cond_a
    return-void
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

.method private static final ClockText(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V
    .locals 35
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move/from16 v6, p2

    .line 2
    .line 3
    move/from16 v7, p5

    .line 4
    .line 5
    const v0, -0x54a55def

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p4

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v8

    .line 14
    and-int/lit8 v1, v7, 0x6

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    move-object/from16 v15, p0

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v1, v2

    .line 30
    :goto_0
    or-int/2addr v1, v7

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v1, v7

    .line 33
    :goto_1
    and-int/lit8 v3, v7, 0x30

    .line 34
    .line 35
    move-object/from16 v14, p1

    .line 36
    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    const/16 v3, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v3, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v1, v3

    .line 51
    :cond_3
    and-int/lit16 v3, v7, 0x180

    .line 52
    .line 53
    if-nez v3, :cond_5

    .line 54
    .line 55
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    const/16 v3, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v3, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v1, v3

    .line 67
    :cond_5
    and-int/lit16 v3, v7, 0xc00

    .line 68
    .line 69
    move/from16 v12, p3

    .line 70
    .line 71
    if-nez v3, :cond_7

    .line 72
    .line 73
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    const/16 v3, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v3, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v1, v3

    .line 85
    :cond_7
    move v11, v1

    .line 86
    and-int/lit16 v1, v11, 0x493

    .line 87
    .line 88
    const/16 v3, 0x492

    .line 89
    .line 90
    if-ne v1, v3, :cond_9

    .line 91
    .line 92
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_8

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 100
    .line 101
    .line 102
    move-object v1, v8

    .line 103
    goto/16 :goto_a

    .line 104
    .line 105
    :cond_9
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_a

    .line 110
    .line 111
    const/4 v1, -0x1

    .line 112
    const-string v3, "androidx.compose.material3.ClockText (TimePicker.kt:1467)"

    .line 113
    .line 114
    invoke-static {v0, v11, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_a
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 118
    .line 119
    const/4 v13, 0x6

    .line 120
    invoke-virtual {v0, v8, v13}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sget-object v1, Landroidx/compose/material3/tokens/TimePickerTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimePickerTokens;

    .line 125
    .line 126
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/TimePickerTokens;->getClockDialLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {v0, v1}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    .line 131
    .line 132
    .line 133
    move-result-object v28

    .line 134
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Landroidx/compose/ui/unit/Density;

    .line 143
    .line 144
    sget v1, Landroidx/compose/material3/TimePickerKt;->MaxDistance:F

    .line 145
    .line 146
    invoke-interface {v0, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    const v0, -0x62869aed

    .line 151
    .line 152
    .line 153
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    sget-object v23, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 161
    .line 162
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    const/4 v4, 0x0

    .line 167
    if-ne v0, v1, :cond_b

    .line 168
    .line 169
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 170
    .line 171
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 172
    .line 173
    .line 174
    move-result-wide v0

    .line 175
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0, v4, v2, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_b
    move-object v3, v0

    .line 187
    check-cast v3, Landroidx/compose/runtime/MutableState;

    .line 188
    .line 189
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 190
    .line 191
    .line 192
    const v0, 0x2e20b340

    .line 193
    .line 194
    .line 195
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 196
    .line 197
    .line 198
    const v0, -0x1d58f75c

    .line 199
    .line 200
    .line 201
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    if-ne v0, v1, :cond_c

    .line 213
    .line 214
    sget-object v0, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 215
    .line 216
    invoke-static {v0, v8}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    new-instance v1, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 221
    .line 222
    invoke-direct {v1, v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    move-object v0, v1

    .line 229
    :cond_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 230
    .line 231
    .line 232
    check-cast v0, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 233
    .line 234
    invoke-virtual {v0}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/TimePickerState;->getSelection-JiIwxys$material3_release()I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/TimePickerState;->is24hour()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    and-int/lit16 v4, v11, 0x380

    .line 250
    .line 251
    invoke-static {v0, v1, v6, v8, v4}, Landroidx/compose/material3/TimePickerKt;->numberContentDescription-YKJpE6Y(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    const/4 v1, 0x0

    .line 256
    const/16 v16, 0x0

    .line 257
    .line 258
    const/16 v17, 0x0

    .line 259
    .line 260
    const/16 v18, 0x7

    .line 261
    .line 262
    const/16 v19, 0x0

    .line 263
    .line 264
    move/from16 v0, p2

    .line 265
    .line 266
    move-object v13, v2

    .line 267
    move/from16 v2, v16

    .line 268
    .line 269
    move-object v10, v3

    .line 270
    move/from16 v3, v17

    .line 271
    .line 272
    move-object/from16 v33, v4

    .line 273
    .line 274
    const/4 v9, 0x0

    .line 275
    move/from16 v4, v18

    .line 276
    .line 277
    move/from16 v34, v5

    .line 278
    .line 279
    move-object/from16 v5, v19

    .line 280
    .line 281
    invoke-static/range {v0 .. v5}, Landroidx/compose/material3/ActualJvm_jvmKt;->toLocalString$default(IIIZILjava/lang/Object;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/TimePickerState;->getSelection-JiIwxys$material3_release()I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    sget-object v2, Landroidx/compose/material3/Selection;->Companion:Landroidx/compose/material3/Selection$Companion;

    .line 290
    .line 291
    invoke-virtual {v2}, Landroidx/compose/material3/Selection$Companion;->getMinute-JiIwxys()I

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    invoke-static {v1, v2}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    if-eqz v1, :cond_d

    .line 300
    .line 301
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/TimePickerState;->getMinute()I

    .line 302
    .line 303
    .line 304
    move-result v17

    .line 305
    const/16 v18, 0x0

    .line 306
    .line 307
    const/16 v19, 0x0

    .line 308
    .line 309
    const/16 v20, 0x0

    .line 310
    .line 311
    const/16 v21, 0x7

    .line 312
    .line 313
    const/16 v22, 0x0

    .line 314
    .line 315
    invoke-static/range {v17 .. v22}, Landroidx/compose/material3/ActualJvm_jvmKt;->toLocalString$default(IIIZILjava/lang/Object;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    goto :goto_6

    .line 324
    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/TimePickerState;->getHour()I

    .line 325
    .line 326
    .line 327
    move-result v17

    .line 328
    const/16 v18, 0x0

    .line 329
    .line 330
    const/16 v19, 0x0

    .line 331
    .line 332
    const/16 v20, 0x0

    .line 333
    .line 334
    const/16 v21, 0x7

    .line 335
    .line 336
    const/16 v22, 0x0

    .line 337
    .line 338
    invoke-static/range {v17 .. v22}, Landroidx/compose/material3/ActualJvm_jvmKt;->toLocalString$default(IIIZILjava/lang/Object;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    :goto_6
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 347
    .line 348
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-static/range {p0 .. p0}, Landroidx/compose/material3/InteractiveComponentSizeKt;->minimumInteractiveComponentSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    sget v4, Landroidx/compose/material3/TimePickerKt;->MinimumInteractiveSize:F

    .line 357
    .line 358
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    const v4, -0x6286984a

    .line 363
    .line 364
    .line 365
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 366
    .line 367
    .line 368
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    if-ne v4, v5, :cond_e

    .line 377
    .line 378
    new-instance v4, Landroidx/compose/material3/TimePickerKt$ClockText$1$1;

    .line 379
    .line 380
    invoke-direct {v4, v10}, Landroidx/compose/material3/TimePickerKt$ClockText$1$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 381
    .line 382
    .line 383
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    :cond_e
    check-cast v4, Lv3/l;

    .line 387
    .line 388
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 389
    .line 390
    .line 391
    invoke-static {v3, v4}, Landroidx/compose/ui/layout/OnGloballyPositionedModifierKt;->onGloballyPositioned(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    const/4 v4, 0x3

    .line 396
    const/4 v5, 0x0

    .line 397
    invoke-static {v3, v5, v9, v4, v9}, Landroidx/compose/foundation/FocusableKt;->focusable$default(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    const v4, -0x628697d9

    .line 402
    .line 403
    .line 404
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 405
    .line 406
    .line 407
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    and-int/lit8 v9, v11, 0x70

    .line 412
    .line 413
    const/16 v5, 0x20

    .line 414
    .line 415
    if-ne v9, v5, :cond_f

    .line 416
    .line 417
    const/4 v5, 0x1

    .line 418
    goto :goto_7

    .line 419
    :cond_f
    const/4 v5, 0x0

    .line 420
    :goto_7
    or-int/2addr v4, v5

    .line 421
    move/from16 v5, v34

    .line 422
    .line 423
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 424
    .line 425
    .line 426
    move-result v9

    .line 427
    or-int/2addr v4, v9

    .line 428
    and-int/lit16 v9, v11, 0x1c00

    .line 429
    .line 430
    const/16 v11, 0x800

    .line 431
    .line 432
    if-ne v9, v11, :cond_10

    .line 433
    .line 434
    const/4 v9, 0x1

    .line 435
    goto :goto_8

    .line 436
    :cond_10
    const/4 v9, 0x0

    .line 437
    :goto_8
    or-int/2addr v4, v9

    .line 438
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 439
    .line 440
    .line 441
    move-result v9

    .line 442
    or-int/2addr v4, v9

    .line 443
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v9

    .line 447
    if-nez v4, :cond_11

    .line 448
    .line 449
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    if-ne v9, v4, :cond_12

    .line 454
    .line 455
    :cond_11
    new-instance v9, Landroidx/compose/material3/TimePickerKt$ClockText$2$1;

    .line 456
    .line 457
    move-object/from16 v16, v9

    .line 458
    .line 459
    move/from16 v17, v1

    .line 460
    .line 461
    move-object/from16 v18, v13

    .line 462
    .line 463
    move-object/from16 v19, p1

    .line 464
    .line 465
    move/from16 v20, v5

    .line 466
    .line 467
    move/from16 v21, p3

    .line 468
    .line 469
    move-object/from16 v22, v10

    .line 470
    .line 471
    invoke-direct/range {v16 .. v22}, Landroidx/compose/material3/TimePickerKt$ClockText$2$1;-><init>(ZLkotlinx/coroutines/s0;Landroidx/compose/material3/TimePickerState;FZLandroidx/compose/runtime/MutableState;)V

    .line 472
    .line 473
    .line 474
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    :cond_12
    check-cast v9, Lv3/l;

    .line 478
    .line 479
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 480
    .line 481
    .line 482
    const/4 v1, 0x1

    .line 483
    invoke-static {v3, v1, v9}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLv3/l;)Landroidx/compose/ui/Modifier;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    const v3, 0x2bb5b5d7

    .line 488
    .line 489
    .line 490
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 491
    .line 492
    .line 493
    const/4 v3, 0x0

    .line 494
    const/4 v4, 0x6

    .line 495
    invoke-static {v2, v3, v8, v4}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    const v4, -0x4ee9b9da

    .line 500
    .line 501
    .line 502
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 503
    .line 504
    .line 505
    invoke-static {v8, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 514
    .line 515
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 516
    .line 517
    .line 518
    move-result-object v9

    .line 519
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 524
    .line 525
    .line 526
    move-result-object v10

    .line 527
    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    .line 528
    .line 529
    if-nez v10, :cond_13

    .line 530
    .line 531
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 532
    .line 533
    .line 534
    :cond_13
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 535
    .line 536
    .line 537
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 538
    .line 539
    .line 540
    move-result v10

    .line 541
    if-eqz v10, :cond_14

    .line 542
    .line 543
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 544
    .line 545
    .line 546
    goto :goto_9

    .line 547
    :cond_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 548
    .line 549
    .line 550
    :goto_9
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 551
    .line 552
    .line 553
    move-result-object v9

    .line 554
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 555
    .line 556
    .line 557
    move-result-object v10

    .line 558
    invoke-static {v9, v2, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    invoke-static {v9, v3, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 573
    .line 574
    .line 575
    move-result v3

    .line 576
    if-nez v3, :cond_15

    .line 577
    .line 578
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    if-nez v3, :cond_16

    .line 591
    .line 592
    :cond_15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    invoke-interface {v9, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 604
    .line 605
    .line 606
    :cond_16
    invoke-static {v8}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    const/4 v3, 0x0

    .line 615
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 616
    .line 617
    .line 618
    move-result-object v3

    .line 619
    invoke-interface {v1, v2, v8, v3}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    const v1, 0x7ab4aae9

    .line 623
    .line 624
    .line 625
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 626
    .line 627
    .line 628
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 629
    .line 630
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 631
    .line 632
    const v2, 0x333cef73

    .line 633
    .line 634
    .line 635
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 636
    .line 637
    .line 638
    move-object/from16 v2, v33

    .line 639
    .line 640
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v3

    .line 644
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v4

    .line 648
    if-nez v3, :cond_17

    .line 649
    .line 650
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    if-ne v4, v3, :cond_18

    .line 655
    .line 656
    :cond_17
    new-instance v4, Landroidx/compose/material3/TimePickerKt$ClockText$3$1$1;

    .line 657
    .line 658
    invoke-direct {v4, v2}, Landroidx/compose/material3/TimePickerKt$ClockText$3$1$1;-><init>(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    :cond_18
    check-cast v4, Lv3/l;

    .line 665
    .line 666
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 667
    .line 668
    .line 669
    invoke-static {v1, v4}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->clearAndSetSemantics(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    .line 670
    .line 671
    .line 672
    move-result-object v9

    .line 673
    const-wide/16 v10, 0x0

    .line 674
    .line 675
    const-wide/16 v1, 0x0

    .line 676
    .line 677
    move-wide v12, v1

    .line 678
    const/4 v1, 0x0

    .line 679
    move-object v14, v1

    .line 680
    move-object v15, v1

    .line 681
    const/16 v16, 0x0

    .line 682
    .line 683
    const-wide/16 v17, 0x0

    .line 684
    .line 685
    const/16 v19, 0x0

    .line 686
    .line 687
    const/16 v20, 0x0

    .line 688
    .line 689
    const-wide/16 v21, 0x0

    .line 690
    .line 691
    const/16 v23, 0x0

    .line 692
    .line 693
    const/16 v24, 0x0

    .line 694
    .line 695
    const/16 v25, 0x0

    .line 696
    .line 697
    const/16 v26, 0x0

    .line 698
    .line 699
    const/16 v27, 0x0

    .line 700
    .line 701
    const/16 v30, 0x0

    .line 702
    .line 703
    const/16 v31, 0x0

    .line 704
    .line 705
    const v32, 0xfffc

    .line 706
    .line 707
    .line 708
    move-object v1, v8

    .line 709
    move-object v8, v0

    .line 710
    move-object/from16 v29, v1

    .line 711
    .line 712
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 713
    .line 714
    .line 715
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 716
    .line 717
    .line 718
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 719
    .line 720
    .line 721
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 722
    .line 723
    .line 724
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 725
    .line 726
    .line 727
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    if-eqz v0, :cond_19

    .line 732
    .line 733
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 734
    .line 735
    .line 736
    :cond_19
    :goto_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 737
    .line 738
    .line 739
    move-result-object v8

    .line 740
    if-eqz v8, :cond_1a

    .line 741
    .line 742
    new-instance v9, Landroidx/compose/material3/TimePickerKt$ClockText$4;

    .line 743
    .line 744
    move-object v0, v9

    .line 745
    move-object/from16 v1, p0

    .line 746
    .line 747
    move-object/from16 v2, p1

    .line 748
    .line 749
    move/from16 v3, p2

    .line 750
    .line 751
    move/from16 v4, p3

    .line 752
    .line 753
    move/from16 v5, p5

    .line 754
    .line 755
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/TimePickerKt$ClockText$4;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;IZI)V

    .line 756
    .line 757
    .line 758
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 759
    .line 760
    .line 761
    :cond_1a
    return-void
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
.end method

.method private static final ClockText$lambda$28(Landroidx/compose/runtime/MutableState;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;)J"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {p0}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final ClockText$lambda$29(Landroidx/compose/runtime/MutableState;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/geometry/Offset;",
            ">;J)V"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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

.method private static final DisplaySeparator(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 48
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const v2, 0x7d35befe

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v15

    .line 14
    and-int/lit8 v3, v1, 0x6

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v3, v4

    .line 28
    :goto_0
    or-int/2addr v3, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v3, v1

    .line 31
    :goto_1
    and-int/lit8 v5, v3, 0x3

    .line 32
    .line 33
    if-ne v5, v4, :cond_3

    .line 34
    .line 35
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 43
    .line 44
    .line 45
    move-object/from16 v28, v15

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_4

    .line 54
    .line 55
    const/4 v4, -0x1

    .line 56
    const-string v5, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1165)"

    .line 57
    .line 58
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_4
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object/from16 v16, v2

    .line 70
    .line 71
    check-cast v16, Landroidx/compose/ui/text/TextStyle;

    .line 72
    .line 73
    const-wide/16 v17, 0x0

    .line 74
    .line 75
    const-wide/16 v19, 0x0

    .line 76
    .line 77
    const/16 v21, 0x0

    .line 78
    .line 79
    const/16 v22, 0x0

    .line 80
    .line 81
    const/16 v23, 0x0

    .line 82
    .line 83
    const/16 v24, 0x0

    .line 84
    .line 85
    const/16 v25, 0x0

    .line 86
    .line 87
    const-wide/16 v26, 0x0

    .line 88
    .line 89
    const/16 v28, 0x0

    .line 90
    .line 91
    const/16 v29, 0x0

    .line 92
    .line 93
    const/16 v30, 0x0

    .line 94
    .line 95
    const-wide/16 v31, 0x0

    .line 96
    .line 97
    const/16 v33, 0x0

    .line 98
    .line 99
    const/16 v34, 0x0

    .line 100
    .line 101
    const/16 v35, 0x0

    .line 102
    .line 103
    sget-object v2, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 104
    .line 105
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 106
    .line 107
    .line 108
    move-result v36

    .line 109
    const/16 v37, 0x0

    .line 110
    .line 111
    const-wide/16 v38, 0x0

    .line 112
    .line 113
    const/16 v40, 0x0

    .line 114
    .line 115
    const/16 v41, 0x0

    .line 116
    .line 117
    new-instance v2, Landroidx/compose/ui/text/style/LineHeightStyle;

    .line 118
    .line 119
    move-object/from16 v42, v2

    .line 120
    .line 121
    sget-object v3, Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;->Companion:Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;

    .line 122
    .line 123
    invoke-virtual {v3}, Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;->getCenter-PIaL0Z0()F

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    sget-object v4, Landroidx/compose/ui/text/style/LineHeightStyle$Trim;->Companion:Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;

    .line 128
    .line 129
    invoke-virtual {v4}, Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;->getBoth-EVpEnUU()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    const/4 v5, 0x0

    .line 134
    invoke-direct {v2, v3, v4, v5}, Landroidx/compose/ui/text/style/LineHeightStyle;-><init>(FILkotlin/jvm/internal/w;)V

    .line 135
    .line 136
    .line 137
    const/16 v43, 0x0

    .line 138
    .line 139
    const/16 v44, 0x0

    .line 140
    .line 141
    const/16 v45, 0x0

    .line 142
    .line 143
    const v46, 0xef7fff

    .line 144
    .line 145
    .line 146
    const/16 v47, 0x0

    .line 147
    .line 148
    invoke-static/range {v16 .. v47}, Landroidx/compose/ui/text/TextStyle;->copy-p1EtxEg$default(Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;

    .line 149
    .line 150
    .line 151
    move-result-object v23

    .line 152
    sget-object v2, Landroidx/compose/material3/TimePickerKt$DisplaySeparator$1;->INSTANCE:Landroidx/compose/material3/TimePickerKt$DisplaySeparator$1;

    .line 153
    .line 154
    invoke-static {v0, v2}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->clearAndSetSemantics(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 159
    .line 160
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    const v4, 0x2bb5b5d7

    .line 165
    .line 166
    .line 167
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 168
    .line 169
    .line 170
    const/4 v4, 0x0

    .line 171
    const/4 v5, 0x6

    .line 172
    invoke-static {v3, v4, v15, v5}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    const v6, -0x4ee9b9da

    .line 177
    .line 178
    .line 179
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 180
    .line 181
    .line 182
    invoke-static {v15, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 191
    .line 192
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    invoke-static {v2}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    instance-of v10, v10, Landroidx/compose/runtime/Applier;

    .line 205
    .line 206
    if-nez v10, :cond_5

    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 209
    .line 210
    .line 211
    :cond_5
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 212
    .line 213
    .line 214
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    if-eqz v10, :cond_6

    .line 219
    .line 220
    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_6
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 225
    .line 226
    .line 227
    :goto_3
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    invoke-static {v9, v3, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-static {v9, v7, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-nez v7, :cond_7

    .line 254
    .line 255
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v7

    .line 259
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v7

    .line 267
    if-nez v7, :cond_8

    .line 268
    .line 269
    :cond_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    invoke-interface {v9, v6, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 281
    .line 282
    .line 283
    :cond_8
    invoke-static {v15}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-interface {v2, v3, v15, v4}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    const v2, 0x7ab4aae9

    .line 299
    .line 300
    .line 301
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 302
    .line 303
    .line 304
    sget-object v2, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 305
    .line 306
    const-string v3, ":"

    .line 307
    .line 308
    const/4 v4, 0x0

    .line 309
    sget-object v2, Landroidx/compose/material3/tokens/TimeInputTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimeInputTokens;

    .line 310
    .line 311
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/TimeInputTokens;->getTimeFieldSeparatorColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-static {v2, v15, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 316
    .line 317
    .line 318
    move-result-wide v5

    .line 319
    const-wide/16 v7, 0x0

    .line 320
    .line 321
    const/4 v9, 0x0

    .line 322
    const/4 v10, 0x0

    .line 323
    const/4 v11, 0x0

    .line 324
    const-wide/16 v12, 0x0

    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const/4 v2, 0x0

    .line 328
    move-object/from16 v28, v15

    .line 329
    .line 330
    move-object v15, v2

    .line 331
    const-wide/16 v16, 0x0

    .line 332
    .line 333
    const/16 v18, 0x0

    .line 334
    .line 335
    const/16 v19, 0x0

    .line 336
    .line 337
    const/16 v20, 0x0

    .line 338
    .line 339
    const/16 v21, 0x0

    .line 340
    .line 341
    const/16 v22, 0x0

    .line 342
    .line 343
    const/16 v25, 0x6

    .line 344
    .line 345
    const/16 v26, 0x0

    .line 346
    .line 347
    const v27, 0xfffa

    .line 348
    .line 349
    .line 350
    move-object/from16 v24, v28

    .line 351
    .line 352
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 353
    .line 354
    .line 355
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 356
    .line 357
    .line 358
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 359
    .line 360
    .line 361
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 362
    .line 363
    .line 364
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 365
    .line 366
    .line 367
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    if-eqz v2, :cond_9

    .line 372
    .line 373
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 374
    .line 375
    .line 376
    :cond_9
    :goto_4
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    if-eqz v2, :cond_a

    .line 381
    .line 382
    new-instance v3, Landroidx/compose/material3/TimePickerKt$DisplaySeparator$3;

    .line 383
    .line 384
    invoke-direct {v3, v0, v1}, Landroidx/compose/material3/TimePickerKt$DisplaySeparator$3;-><init>(Landroidx/compose/ui/Modifier;I)V

    .line 385
    .line 386
    .line 387
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 388
    .line 389
    .line 390
    :cond_a
    return-void
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

.method private static final HorizontalClockDisplay(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x2d089e69

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    and-int/lit8 v5, v2, 0x6

    .line 17
    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v5, 0x2

    .line 29
    :goto_0
    or-int/2addr v5, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v5, v2

    .line 32
    :goto_1
    and-int/lit8 v6, v2, 0x30

    .line 33
    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    const/16 v6, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v6, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v5, v6

    .line 48
    :cond_3
    and-int/lit8 v6, v5, 0x13

    .line 49
    .line 50
    const/16 v7, 0x12

    .line 51
    .line 52
    if-ne v6, v7, :cond_5

    .line 53
    .line 54
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_6

    .line 71
    .line 72
    const/4 v6, -0x1

    .line 73
    const-string v7, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:921)"

    .line 74
    .line 75
    invoke-static {v3, v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_6
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const v6, -0x1cd0f17e

    .line 85
    .line 86
    .line 87
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 88
    .line 89
    .line 90
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 91
    .line 92
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 93
    .line 94
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    const/4 v15, 0x6

    .line 99
    invoke-static {v3, v7, v4, v15}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const v13, -0x4ee9b9da

    .line 104
    .line 105
    .line 106
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 107
    .line 108
    .line 109
    const/4 v12, 0x0

    .line 110
    invoke-static {v4, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 119
    .line 120
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 133
    .line 134
    if-nez v11, :cond_7

    .line 135
    .line 136
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 137
    .line 138
    .line 139
    :cond_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 140
    .line 141
    .line 142
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    if-eqz v11, :cond_8

    .line 147
    .line 148
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_8
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 153
    .line 154
    .line 155
    :goto_4
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    invoke-static {v9, v3, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-static {v9, v8, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    if-nez v8, :cond_9

    .line 182
    .line 183
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    invoke-static {v8, v11}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-nez v8, :cond_a

    .line 196
    .line 197
    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-interface {v9, v7, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 209
    .line 210
    .line 211
    :cond_a
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-interface {v10, v3, v4, v7}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    const v3, 0x7ab4aae9

    .line 227
    .line 228
    .line 229
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 230
    .line 231
    .line 232
    sget-object v7, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 233
    .line 234
    and-int/lit8 v7, v5, 0xe

    .line 235
    .line 236
    and-int/lit8 v8, v5, 0x70

    .line 237
    .line 238
    or-int/2addr v7, v8

    .line 239
    invoke-static {v0, v1, v4, v7}, Landroidx/compose/material3/TimePickerKt;->ClockDisplayNumbers(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 240
    .line 241
    .line 242
    const v7, -0x20ecd6db

    .line 243
    .line 244
    .line 245
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material3/TimePickerState;->is24hour()Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-nez v7, :cond_f

    .line 253
    .line 254
    const/4 v8, 0x0

    .line 255
    sget v9, Landroidx/compose/material3/TimePickerKt;->PeriodToggleMargin:F

    .line 256
    .line 257
    const/4 v10, 0x0

    .line 258
    const/4 v11, 0x0

    .line 259
    const/16 v17, 0xd

    .line 260
    .line 261
    const/16 v18, 0x0

    .line 262
    .line 263
    move-object v7, v6

    .line 264
    move v15, v12

    .line 265
    move/from16 v12, v17

    .line 266
    .line 267
    move v3, v13

    .line 268
    move-object/from16 v13, v18

    .line 269
    .line 270
    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    const v8, 0x2bb5b5d7

    .line 275
    .line 276
    .line 277
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-static {v8, v15, v4, v15}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 289
    .line 290
    .line 291
    invoke-static {v4, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 312
    .line 313
    if-nez v11, :cond_b

    .line 314
    .line 315
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 316
    .line 317
    .line 318
    :cond_b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 319
    .line 320
    .line 321
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    if-eqz v11, :cond_c

    .line 326
    .line 327
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 328
    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 332
    .line 333
    .line 334
    :goto_5
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    invoke-static {v10, v8, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    invoke-static {v10, v9, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    if-nez v9, :cond_d

    .line 361
    .line 362
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v9

    .line 366
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object v11

    .line 370
    invoke-static {v9, v11}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    if-nez v9, :cond_e

    .line 375
    .line 376
    :cond_d
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v9

    .line 380
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    invoke-interface {v10, v3, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 388
    .line 389
    .line 390
    :cond_e
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    invoke-interface {v7, v3, v4, v8}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    const v3, 0x7ab4aae9

    .line 406
    .line 407
    .line 408
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 409
    .line 410
    .line 411
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 412
    .line 413
    sget-object v3, Landroidx/compose/material3/tokens/TimePickerTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimePickerTokens;

    .line 414
    .line 415
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/TimePickerTokens;->getPeriodSelectorHorizontalContainerWidth-D9Ej5fM()F

    .line 416
    .line 417
    .line 418
    move-result v7

    .line 419
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/TimePickerTokens;->getPeriodSelectorHorizontalContainerHeight-D9Ej5fM()F

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    invoke-static {v6, v7, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    shl-int/lit8 v5, v5, 0x3

    .line 428
    .line 429
    and-int/lit8 v6, v5, 0x70

    .line 430
    .line 431
    const/4 v7, 0x6

    .line 432
    or-int/2addr v6, v7

    .line 433
    and-int/lit16 v5, v5, 0x380

    .line 434
    .line 435
    or-int/2addr v5, v6

    .line 436
    invoke-static {v3, v0, v1, v4, v5}, Landroidx/compose/material3/TimePickerKt;->HorizontalPeriodToggle(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 437
    .line 438
    .line 439
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 440
    .line 441
    .line 442
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 443
    .line 444
    .line 445
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 446
    .line 447
    .line 448
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 449
    .line 450
    .line 451
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 452
    .line 453
    .line 454
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 455
    .line 456
    .line 457
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 458
    .line 459
    .line 460
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 461
    .line 462
    .line 463
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 464
    .line 465
    .line 466
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    if-eqz v3, :cond_10

    .line 471
    .line 472
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 473
    .line 474
    .line 475
    :cond_10
    :goto_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    if-eqz v3, :cond_11

    .line 480
    .line 481
    new-instance v4, Landroidx/compose/material3/TimePickerKt$HorizontalClockDisplay$2;

    .line 482
    .line 483
    invoke-direct {v4, v0, v1, v2}, Landroidx/compose/material3/TimePickerKt$HorizontalClockDisplay$2;-><init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;I)V

    .line 484
    .line 485
    .line 486
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 487
    .line 488
    .line 489
    :cond_11
    return-void
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
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
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
.end method

.method private static final HorizontalPeriodToggle(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    const v0, 0x4b2ca0b7    # 1.1313335E7f

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p4, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 41
    .line 42
    if-nez v2, :cond_5

    .line 43
    .line 44
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    const/16 v2, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v2, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v1, v2

    .line 56
    :cond_5
    and-int/lit16 v2, v1, 0x93

    .line 57
    .line 58
    const/16 v3, 0x92

    .line 59
    .line 60
    if-ne v2, v3, :cond_7

    .line 61
    .line 62
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 70
    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_8

    .line 78
    .line 79
    const/4 v2, -0x1

    .line 80
    const-string v3, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1002)"

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_8
    const v0, 0x2d45e721

    .line 86
    .line 87
    .line 88
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-ne v0, v2, :cond_9

    .line 102
    .line 103
    sget-object v0, Landroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1;->INSTANCE:Landroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1;

    .line 104
    .line 105
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_9
    move-object v4, v0

    .line 109
    check-cast v4, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 110
    .line 111
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 112
    .line 113
    .line 114
    sget-object v0, Landroidx/compose/material3/tokens/TimePickerTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimePickerTokens;

    .line 115
    .line 116
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/TimePickerTokens;->getPeriodSelectorContainerShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const/4 v2, 0x6

    .line 121
    invoke-static {v0, p3, v2}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v2, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape"

    .line 126
    .line 127
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    check-cast v0, Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 131
    .line 132
    invoke-static {v0}, Landroidx/compose/material3/ShapesKt;->start(Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-static {v0}, Landroidx/compose/material3/ShapesKt;->end(Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    and-int/lit8 v0, v1, 0xe

    .line 141
    .line 142
    or-int/lit16 v0, v0, 0xc00

    .line 143
    .line 144
    and-int/lit8 v2, v1, 0x70

    .line 145
    .line 146
    or-int/2addr v0, v2

    .line 147
    and-int/lit16 v1, v1, 0x380

    .line 148
    .line 149
    or-int v8, v0, v1

    .line 150
    .line 151
    move-object v1, p0

    .line 152
    move-object v2, p1

    .line 153
    move-object v3, p2

    .line 154
    move-object v7, p3

    .line 155
    invoke-static/range {v1 .. v8}, Landroidx/compose/material3/TimePickerKt;->PeriodToggleImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V

    .line 156
    .line 157
    .line 158
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_a

    .line 163
    .line 164
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 165
    .line 166
    .line 167
    :cond_a
    :goto_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    if-eqz p3, :cond_b

    .line 172
    .line 173
    new-instance v0, Landroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$1;

    .line 174
    .line 175
    invoke-direct {v0, p0, p1, p2, p4}, Landroidx/compose/material3/TimePickerKt$HorizontalPeriodToggle$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;I)V

    .line 176
    .line 177
    .line 178
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 179
    .line 180
    .line 181
    :cond_b
    return-void
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

.method public static final HorizontalTimePicker(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V
    .locals 18
    .param p0    # Landroidx/compose/material3/TimePickerState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/TimePickerColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v4, p3

    .line 4
    .line 5
    move/from16 v5, p5

    .line 6
    .line 7
    const v0, 0x4d8281

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p4

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    and-int/lit8 v3, p6, 0x1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    or-int/lit8 v3, v5, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v3, v5, 0x6

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v5

    .line 39
    :goto_1
    and-int/lit8 v6, p6, 0x2

    .line 40
    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    or-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v7, v5, 0x30

    .line 47
    .line 48
    if-nez v7, :cond_5

    .line 49
    .line 50
    move-object/from16 v7, p1

    .line 51
    .line 52
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_4

    .line 57
    .line 58
    const/16 v8, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/16 v8, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v8

    .line 64
    goto :goto_4

    .line 65
    :cond_5
    :goto_3
    move-object/from16 v7, p1

    .line 66
    .line 67
    :goto_4
    and-int/lit16 v8, v5, 0x180

    .line 68
    .line 69
    if-nez v8, :cond_8

    .line 70
    .line 71
    and-int/lit8 v8, p6, 0x4

    .line 72
    .line 73
    if-nez v8, :cond_6

    .line 74
    .line 75
    move-object/from16 v8, p2

    .line 76
    .line 77
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_7

    .line 82
    .line 83
    const/16 v9, 0x100

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_6
    move-object/from16 v8, p2

    .line 87
    .line 88
    :cond_7
    const/16 v9, 0x80

    .line 89
    .line 90
    :goto_5
    or-int/2addr v3, v9

    .line 91
    goto :goto_6

    .line 92
    :cond_8
    move-object/from16 v8, p2

    .line 93
    .line 94
    :goto_6
    and-int/lit8 v9, p6, 0x8

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    or-int/lit16 v3, v3, 0xc00

    .line 99
    .line 100
    goto :goto_8

    .line 101
    :cond_9
    and-int/lit16 v9, v5, 0xc00

    .line 102
    .line 103
    if-nez v9, :cond_b

    .line 104
    .line 105
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-eqz v9, :cond_a

    .line 110
    .line 111
    const/16 v9, 0x800

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_a
    const/16 v9, 0x400

    .line 115
    .line 116
    :goto_7
    or-int/2addr v3, v9

    .line 117
    :cond_b
    :goto_8
    and-int/lit16 v9, v3, 0x493

    .line 118
    .line 119
    const/16 v10, 0x492

    .line 120
    .line 121
    if-ne v9, v10, :cond_e

    .line 122
    .line 123
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-nez v9, :cond_c

    .line 128
    .line 129
    goto :goto_a

    .line 130
    :cond_c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 131
    .line 132
    .line 133
    move-object v6, v7

    .line 134
    :cond_d
    :goto_9
    move-object v3, v8

    .line 135
    goto/16 :goto_f

    .line 136
    .line 137
    :cond_e
    :goto_a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 138
    .line 139
    .line 140
    and-int/lit8 v9, v5, 0x1

    .line 141
    .line 142
    const/4 v10, 0x6

    .line 143
    if-eqz v9, :cond_11

    .line 144
    .line 145
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    if-eqz v9, :cond_f

    .line 150
    .line 151
    goto :goto_b

    .line 152
    :cond_f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 153
    .line 154
    .line 155
    and-int/lit8 v6, p6, 0x4

    .line 156
    .line 157
    if-eqz v6, :cond_10

    .line 158
    .line 159
    and-int/lit16 v3, v3, -0x381

    .line 160
    .line 161
    :cond_10
    move-object v6, v7

    .line 162
    goto :goto_d

    .line 163
    :cond_11
    :goto_b
    if-eqz v6, :cond_12

    .line 164
    .line 165
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 166
    .line 167
    goto :goto_c

    .line 168
    :cond_12
    move-object v6, v7

    .line 169
    :goto_c
    and-int/lit8 v7, p6, 0x4

    .line 170
    .line 171
    if-eqz v7, :cond_13

    .line 172
    .line 173
    sget-object v7, Landroidx/compose/material3/TimePickerDefaults;->INSTANCE:Landroidx/compose/material3/TimePickerDefaults;

    .line 174
    .line 175
    invoke-virtual {v7, v2, v10}, Landroidx/compose/material3/TimePickerDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TimePickerColors;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    and-int/lit16 v3, v3, -0x381

    .line 180
    .line 181
    move-object v8, v7

    .line 182
    :cond_13
    :goto_d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 183
    .line 184
    .line 185
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    if-eqz v7, :cond_14

    .line 190
    .line 191
    const/4 v7, -0x1

    .line 192
    const-string v9, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:801)"

    .line 193
    .line 194
    invoke-static {v0, v3, v7, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_14
    const/4 v12, 0x0

    .line 198
    const/4 v13, 0x0

    .line 199
    const/4 v14, 0x0

    .line 200
    sget v15, Landroidx/compose/material3/TimePickerKt;->ClockFaceBottomMargin:F

    .line 201
    .line 202
    const/16 v16, 0x7

    .line 203
    .line 204
    const/16 v17, 0x0

    .line 205
    .line 206
    move-object v11, v6

    .line 207
    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 212
    .line 213
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    const v9, 0x2952b718

    .line 218
    .line 219
    .line 220
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 221
    .line 222
    .line 223
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 224
    .line 225
    invoke-virtual {v9}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    const/16 v11, 0x30

    .line 230
    .line 231
    invoke-static {v9, v7, v2, v11}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    const v9, -0x4ee9b9da

    .line 236
    .line 237
    .line 238
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 239
    .line 240
    .line 241
    const/4 v9, 0x0

    .line 242
    invoke-static {v2, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 247
    .line 248
    .line 249
    move-result-object v12

    .line 250
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 251
    .line 252
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 253
    .line 254
    .line 255
    move-result-object v14

    .line 256
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 261
    .line 262
    .line 263
    move-result-object v15

    .line 264
    instance-of v15, v15, Landroidx/compose/runtime/Applier;

    .line 265
    .line 266
    if-nez v15, :cond_15

    .line 267
    .line 268
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 269
    .line 270
    .line 271
    :cond_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 272
    .line 273
    .line 274
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 275
    .line 276
    .line 277
    move-result v15

    .line 278
    if-eqz v15, :cond_16

    .line 279
    .line 280
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 281
    .line 282
    .line 283
    goto :goto_e

    .line 284
    :cond_16
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 285
    .line 286
    .line 287
    :goto_e
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 288
    .line 289
    .line 290
    move-result-object v14

    .line 291
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 292
    .line 293
    .line 294
    move-result-object v15

    .line 295
    invoke-static {v14, v7, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-static {v14, v12, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    if-nez v12, :cond_17

    .line 314
    .line 315
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v13

    .line 323
    invoke-static {v12, v13}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v12

    .line 327
    if-nez v12, :cond_18

    .line 328
    .line 329
    :cond_17
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v12

    .line 333
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 337
    .line 338
    .line 339
    move-result-object v11

    .line 340
    invoke-interface {v14, v11, v7}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 341
    .line 342
    .line 343
    :cond_18
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    invoke-interface {v0, v7, v2, v9}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    const v0, 0x7ab4aae9

    .line 359
    .line 360
    .line 361
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 362
    .line 363
    .line 364
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 365
    .line 366
    and-int/lit8 v0, v3, 0xe

    .line 367
    .line 368
    shr-int/lit8 v3, v3, 0x3

    .line 369
    .line 370
    and-int/lit8 v7, v3, 0x70

    .line 371
    .line 372
    or-int/2addr v0, v7

    .line 373
    invoke-static {v1, v8, v2, v0}, Landroidx/compose/material3/TimePickerKt;->HorizontalClockDisplay(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 374
    .line 375
    .line 376
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 377
    .line 378
    sget v9, Landroidx/compose/material3/TimePickerKt;->ClockDisplayBottomMargin:F

    .line 379
    .line 380
    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    invoke-static {v7, v2, v10}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 385
    .line 386
    .line 387
    and-int/lit16 v3, v3, 0x380

    .line 388
    .line 389
    or-int/2addr v0, v3

    .line 390
    invoke-static {v1, v8, v4, v2, v0}, Landroidx/compose/material3/TimePickerKt;->ClockFace(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V

    .line 391
    .line 392
    .line 393
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 394
    .line 395
    .line 396
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 397
    .line 398
    .line 399
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 400
    .line 401
    .line 402
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 403
    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    if-eqz v0, :cond_d

    .line 410
    .line 411
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 412
    .line 413
    .line 414
    goto/16 :goto_9

    .line 415
    .line 416
    :goto_f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    if-eqz v7, :cond_19

    .line 421
    .line 422
    new-instance v8, Landroidx/compose/material3/TimePickerKt$HorizontalTimePicker$2;

    .line 423
    .line 424
    move-object v0, v8

    .line 425
    move-object/from16 v1, p0

    .line 426
    .line 427
    move-object v2, v6

    .line 428
    move/from16 v4, p3

    .line 429
    .line 430
    move/from16 v5, p5

    .line 431
    .line 432
    move/from16 v6, p6

    .line 433
    .line 434
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/TimePickerKt$HorizontalTimePicker$2;-><init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZII)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v7, v8}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 438
    .line 439
    .line 440
    :cond_19
    return-void
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

.method private static final PeriodToggleImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V
    .locals 25
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move/from16 v7, p7

    .line 8
    .line 9
    const v0, 0x51e9446d

    .line 10
    .line 11
    .line 12
    move-object/from16 v3, p6

    .line 13
    .line 14
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    and-int/lit8 v5, v7, 0x6

    .line 19
    .line 20
    if-nez v5, :cond_1

    .line 21
    .line 22
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    const/4 v5, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v5, 0x2

    .line 31
    :goto_0
    or-int/2addr v5, v7

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v5, v7

    .line 34
    :goto_1
    and-int/lit8 v6, v7, 0x30

    .line 35
    .line 36
    if-nez v6, :cond_3

    .line 37
    .line 38
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    const/16 v6, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v6, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v5, v6

    .line 50
    :cond_3
    and-int/lit16 v6, v7, 0x180

    .line 51
    .line 52
    if-nez v6, :cond_5

    .line 53
    .line 54
    move-object/from16 v6, p2

    .line 55
    .line 56
    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_4

    .line 61
    .line 62
    const/16 v8, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v8, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v5, v8

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    move-object/from16 v6, p2

    .line 70
    .line 71
    :goto_4
    and-int/lit16 v8, v7, 0xc00

    .line 72
    .line 73
    if-nez v8, :cond_7

    .line 74
    .line 75
    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_6

    .line 80
    .line 81
    const/16 v8, 0x800

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_6
    const/16 v8, 0x400

    .line 85
    .line 86
    :goto_5
    or-int/2addr v5, v8

    .line 87
    :cond_7
    and-int/lit16 v8, v7, 0x6000

    .line 88
    .line 89
    move-object/from16 v14, p4

    .line 90
    .line 91
    if-nez v8, :cond_9

    .line 92
    .line 93
    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_8

    .line 98
    .line 99
    const/16 v8, 0x4000

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_8
    const/16 v8, 0x2000

    .line 103
    .line 104
    :goto_6
    or-int/2addr v5, v8

    .line 105
    :cond_9
    const/high16 v8, 0x30000

    .line 106
    .line 107
    and-int/2addr v8, v7

    .line 108
    move-object/from16 v13, p5

    .line 109
    .line 110
    if-nez v8, :cond_b

    .line 111
    .line 112
    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_a

    .line 117
    .line 118
    const/high16 v8, 0x20000

    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_a
    const/high16 v8, 0x10000

    .line 122
    .line 123
    :goto_7
    or-int/2addr v5, v8

    .line 124
    :cond_b
    const v8, 0x12493

    .line 125
    .line 126
    .line 127
    and-int/2addr v8, v5

    .line 128
    const v9, 0x12492

    .line 129
    .line 130
    .line 131
    if-ne v8, v9, :cond_d

    .line 132
    .line 133
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-nez v8, :cond_c

    .line 138
    .line 139
    goto :goto_8

    .line 140
    :cond_c
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_c

    .line 144
    .line 145
    :cond_d
    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-eqz v8, :cond_e

    .line 150
    .line 151
    const/4 v8, -0x1

    .line 152
    const-string v9, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1095)"

    .line 153
    .line 154
    invoke-static {v0, v5, v8, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_e
    sget-object v0, Landroidx/compose/material3/tokens/TimePickerTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimePickerTokens;

    .line 158
    .line 159
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/TimePickerTokens;->getPeriodSelectorOutlineWidth-D9Ej5fM()F

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/material3/TimePickerColors;->getPeriodSelectorBorderColor-0d7_KjU()J

    .line 164
    .line 165
    .line 166
    move-result-wide v9

    .line 167
    invoke-static {v8, v9, v10}, Landroidx/compose/foundation/BorderStrokeKt;->BorderStroke-cXLIe8U(FJ)Landroidx/compose/foundation/BorderStroke;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/TimePickerTokens;->getPeriodSelectorContainerShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const/4 v9, 0x6

    .line 176
    invoke-static {v0, v3, v9}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    const-string v10, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape"

    .line 181
    .line 182
    invoke-static {v0, v10}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    check-cast v0, Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 186
    .line 187
    sget-object v10, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 188
    .line 189
    sget v10, Landroidx/compose/material3/R$string;->m3c_time_picker_period_toggle_description:I

    .line 190
    .line 191
    invoke-static {v10}, Landroidx/compose/material3/Strings;->constructor-impl(I)I

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    const/4 v12, 0x0

    .line 196
    invoke-static {v10, v3, v12}, Landroidx/compose/material3/Strings_androidKt;->getString-NWtq2-8(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    const v11, -0x77b69496

    .line 201
    .line 202
    .line 203
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    if-nez v11, :cond_f

    .line 215
    .line 216
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 217
    .line 218
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    if-ne v15, v11, :cond_10

    .line 223
    .line 224
    :cond_f
    new-instance v15, Landroidx/compose/material3/TimePickerKt$PeriodToggleImpl$1$1;

    .line 225
    .line 226
    invoke-direct {v15, v10}, Landroidx/compose/material3/TimePickerKt$PeriodToggleImpl$1$1;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    :cond_10
    check-cast v15, Lv3/l;

    .line 233
    .line 234
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 235
    .line 236
    .line 237
    const/4 v11, 0x1

    .line 238
    const/4 v10, 0x0

    .line 239
    invoke-static {v1, v12, v15, v11, v10}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 240
    .line 241
    .line 242
    move-result-object v15

    .line 243
    invoke-static {v15}, Landroidx/compose/foundation/selection/SelectableGroupKt;->selectableGroup(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 244
    .line 245
    .line 246
    move-result-object v15

    .line 247
    invoke-static {v15, v8, v0}, Landroidx/compose/foundation/BorderKt;->border(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    shr-int/lit8 v8, v5, 0x3

    .line 252
    .line 253
    and-int/lit16 v8, v8, 0x380

    .line 254
    .line 255
    const v15, -0x4ee9b9da

    .line 256
    .line 257
    .line 258
    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 259
    .line 260
    .line 261
    invoke-static {v3, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 262
    .line 263
    .line 264
    move-result v15

    .line 265
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 266
    .line 267
    .line 268
    move-result-object v10

    .line 269
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 270
    .line 271
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 272
    .line 273
    .line 274
    move-result-object v12

    .line 275
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    shl-int/lit8 v8, v8, 0x9

    .line 280
    .line 281
    and-int/lit16 v8, v8, 0x1c00

    .line 282
    .line 283
    or-int/2addr v8, v9

    .line 284
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    instance-of v9, v9, Landroidx/compose/runtime/Applier;

    .line 289
    .line 290
    if-nez v9, :cond_11

    .line 291
    .line 292
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 293
    .line 294
    .line 295
    :cond_11
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 296
    .line 297
    .line 298
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    if-eqz v9, :cond_12

    .line 303
    .line 304
    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 305
    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_12
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 309
    .line 310
    .line 311
    :goto_9
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    invoke-static {v9, v4, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 323
    .line 324
    .line 325
    move-result-object v12

    .line 326
    invoke-static {v9, v10, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 330
    .line 331
    .line 332
    move-result-object v10

    .line 333
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 334
    .line 335
    .line 336
    move-result v12

    .line 337
    if-nez v12, :cond_13

    .line 338
    .line 339
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 344
    .line 345
    .line 346
    move-result-object v11

    .line 347
    invoke-static {v12, v11}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v11

    .line 351
    if-nez v11, :cond_14

    .line 352
    .line 353
    :cond_13
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    invoke-interface {v9, v11, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 365
    .line 366
    .line 367
    :cond_14
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 368
    .line 369
    .line 370
    move-result-object v9

    .line 371
    invoke-static {v9}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 372
    .line 373
    .line 374
    move-result-object v9

    .line 375
    shr-int/lit8 v8, v8, 0x3

    .line 376
    .line 377
    and-int/lit8 v8, v8, 0x70

    .line 378
    .line 379
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    .line 381
    .line 382
    move-result-object v8

    .line 383
    invoke-interface {v0, v9, v3, v8}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    const v0, 0x7ab4aae9

    .line 387
    .line 388
    .line 389
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/TimePickerState;->isAfternoonToggle$material3_release()Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    const/4 v11, 0x1

    .line 397
    xor-int/lit8 v8, v0, 0x1

    .line 398
    .line 399
    const v0, 0x629d531f

    .line 400
    .line 401
    .line 402
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 403
    .line 404
    .line 405
    and-int/lit8 v0, v5, 0x70

    .line 406
    .line 407
    const/16 v9, 0x20

    .line 408
    .line 409
    if-ne v0, v9, :cond_15

    .line 410
    .line 411
    move v9, v11

    .line 412
    goto :goto_a

    .line 413
    :cond_15
    const/4 v9, 0x0

    .line 414
    :goto_a
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v10

    .line 418
    if-nez v9, :cond_16

    .line 419
    .line 420
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 421
    .line 422
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v9

    .line 426
    if-ne v10, v9, :cond_17

    .line 427
    .line 428
    :cond_16
    new-instance v10, Landroidx/compose/material3/TimePickerKt$PeriodToggleImpl$2$1$1;

    .line 429
    .line 430
    invoke-direct {v10, v2}, Landroidx/compose/material3/TimePickerKt$PeriodToggleImpl$2$1$1;-><init>(Landroidx/compose/material3/TimePickerState;)V

    .line 431
    .line 432
    .line 433
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    :cond_17
    check-cast v10, Lv3/a;

    .line 437
    .line 438
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 439
    .line 440
    .line 441
    sget-object v15, Landroidx/compose/material3/ComposableSingletons$TimePickerKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$TimePickerKt;

    .line 442
    .line 443
    invoke-virtual {v15}, Landroidx/compose/material3/ComposableSingletons$TimePickerKt;->getLambda-1$material3_release()Lv3/q;

    .line 444
    .line 445
    .line 446
    move-result-object v12

    .line 447
    shr-int/lit8 v9, v5, 0x9

    .line 448
    .line 449
    and-int/lit8 v9, v9, 0x70

    .line 450
    .line 451
    or-int/lit16 v9, v9, 0x6000

    .line 452
    .line 453
    shl-int/lit8 v11, v5, 0x3

    .line 454
    .line 455
    and-int/lit16 v11, v11, 0x1c00

    .line 456
    .line 457
    or-int v18, v9, v11

    .line 458
    .line 459
    move-object/from16 v9, p4

    .line 460
    .line 461
    const/4 v1, 0x0

    .line 462
    move/from16 v16, v11

    .line 463
    .line 464
    const/4 v4, 0x1

    .line 465
    move-object/from16 v11, p2

    .line 466
    .line 467
    move-object v13, v3

    .line 468
    move/from16 v14, v18

    .line 469
    .line 470
    invoke-static/range {v8 .. v14}, Landroidx/compose/material3/TimePickerKt;->ToggleItem(ZLandroidx/compose/ui/graphics/Shape;Lv3/a;Landroidx/compose/material3/TimePickerColors;Lv3/q;Landroidx/compose/runtime/Composer;I)V

    .line 471
    .line 472
    .line 473
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 474
    .line 475
    const-string v9, "Spacer"

    .line 476
    .line 477
    invoke-static {v8, v9}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    const/high16 v9, 0x40000000    # 2.0f

    .line 482
    .line 483
    invoke-static {v8, v9}, Landroidx/compose/ui/ZIndexModifierKt;->zIndex(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    const/4 v9, 0x0

    .line 488
    invoke-static {v8, v9, v4, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 489
    .line 490
    .line 491
    move-result-object v19

    .line 492
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/material3/TimePickerColors;->getPeriodSelectorBorderColor-0d7_KjU()J

    .line 493
    .line 494
    .line 495
    move-result-wide v20

    .line 496
    const/16 v22, 0x0

    .line 497
    .line 498
    const/16 v23, 0x2

    .line 499
    .line 500
    const/16 v24, 0x0

    .line 501
    .line 502
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    const/4 v8, 0x0

    .line 507
    invoke-static {v1, v3, v8}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/material3/TimePickerState;->isAfternoonToggle$material3_release()Z

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    const v9, 0x629d5541

    .line 515
    .line 516
    .line 517
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 518
    .line 519
    .line 520
    const/16 v9, 0x20

    .line 521
    .line 522
    if-ne v0, v9, :cond_18

    .line 523
    .line 524
    move v12, v4

    .line 525
    goto :goto_b

    .line 526
    :cond_18
    move v12, v8

    .line 527
    :goto_b
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    if-nez v12, :cond_19

    .line 532
    .line 533
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 534
    .line 535
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    if-ne v0, v4, :cond_1a

    .line 540
    .line 541
    :cond_19
    new-instance v0, Landroidx/compose/material3/TimePickerKt$PeriodToggleImpl$2$2$1;

    .line 542
    .line 543
    invoke-direct {v0, v2}, Landroidx/compose/material3/TimePickerKt$PeriodToggleImpl$2$2$1;-><init>(Landroidx/compose/material3/TimePickerState;)V

    .line 544
    .line 545
    .line 546
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    :cond_1a
    move-object v10, v0

    .line 550
    check-cast v10, Lv3/a;

    .line 551
    .line 552
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v15}, Landroidx/compose/material3/ComposableSingletons$TimePickerKt;->getLambda-2$material3_release()Lv3/q;

    .line 556
    .line 557
    .line 558
    move-result-object v12

    .line 559
    shr-int/lit8 v0, v5, 0xc

    .line 560
    .line 561
    and-int/lit8 v0, v0, 0x70

    .line 562
    .line 563
    or-int/lit16 v0, v0, 0x6000

    .line 564
    .line 565
    or-int v14, v0, v16

    .line 566
    .line 567
    move v8, v1

    .line 568
    move-object/from16 v9, p5

    .line 569
    .line 570
    move-object/from16 v11, p2

    .line 571
    .line 572
    move-object v13, v3

    .line 573
    invoke-static/range {v8 .. v14}, Landroidx/compose/material3/TimePickerKt;->ToggleItem(ZLandroidx/compose/ui/graphics/Shape;Lv3/a;Landroidx/compose/material3/TimePickerColors;Lv3/q;Landroidx/compose/runtime/Composer;I)V

    .line 574
    .line 575
    .line 576
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 577
    .line 578
    .line 579
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 580
    .line 581
    .line 582
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 583
    .line 584
    .line 585
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    if-eqz v0, :cond_1b

    .line 590
    .line 591
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 592
    .line 593
    .line 594
    :cond_1b
    :goto_c
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 595
    .line 596
    .line 597
    move-result-object v8

    .line 598
    if-eqz v8, :cond_1c

    .line 599
    .line 600
    new-instance v9, Landroidx/compose/material3/TimePickerKt$PeriodToggleImpl$3;

    .line 601
    .line 602
    move-object v0, v9

    .line 603
    move-object/from16 v1, p0

    .line 604
    .line 605
    move-object/from16 v2, p1

    .line 606
    .line 607
    move-object/from16 v3, p2

    .line 608
    .line 609
    move-object/from16 v4, p3

    .line 610
    .line 611
    move-object/from16 v5, p4

    .line 612
    .line 613
    move-object/from16 v6, p5

    .line 614
    .line 615
    move/from16 v7, p7

    .line 616
    .line 617
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/TimePickerKt$PeriodToggleImpl$3;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;I)V

    .line 618
    .line 619
    .line 620
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 621
    .line 622
    .line 623
    :cond_1c
    return-void
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
.end method

.method public static final TimeInput(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V
    .locals 7
    .param p0    # Landroidx/compose/material3/TimePickerState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/TimePickerColors;
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

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    const v0, -0x2d59a7c5

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p5, 0x1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    or-int/lit8 v1, p4, 0x6

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    and-int/lit8 v1, p4, 0x6

    .line 16
    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    or-int/2addr v1, p4

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move v1, p4

    .line 31
    :goto_1
    and-int/lit8 v2, p5, 0x2

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
    and-int/lit8 v3, p4, 0x30

    .line 39
    .line 40
    if-nez v3, :cond_5

    .line 41
    .line 42
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit16 v3, p4, 0x180

    .line 55
    .line 56
    if-nez v3, :cond_7

    .line 57
    .line 58
    and-int/lit8 v3, p5, 0x4

    .line 59
    .line 60
    if-nez v3, :cond_6

    .line 61
    .line 62
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_6

    .line 67
    .line 68
    const/16 v3, 0x100

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    const/16 v3, 0x80

    .line 72
    .line 73
    :goto_4
    or-int/2addr v1, v3

    .line 74
    :cond_7
    and-int/lit16 v3, v1, 0x93

    .line 75
    .line 76
    const/16 v4, 0x92

    .line 77
    .line 78
    if-ne v3, v4, :cond_a

    .line 79
    .line 80
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-nez v3, :cond_8

    .line 85
    .line 86
    goto :goto_6

    .line 87
    :cond_8
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 88
    .line 89
    .line 90
    :cond_9
    :goto_5
    move-object v3, p1

    .line 91
    move-object v4, p2

    .line 92
    goto :goto_9

    .line 93
    :cond_a
    :goto_6
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 94
    .line 95
    .line 96
    and-int/lit8 v3, p4, 0x1

    .line 97
    .line 98
    const/4 v4, 0x6

    .line 99
    if-eqz v3, :cond_c

    .line 100
    .line 101
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_b

    .line 106
    .line 107
    goto :goto_7

    .line 108
    :cond_b
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 109
    .line 110
    .line 111
    and-int/lit8 v2, p5, 0x4

    .line 112
    .line 113
    if-eqz v2, :cond_e

    .line 114
    .line 115
    goto :goto_8

    .line 116
    :cond_c
    :goto_7
    if-eqz v2, :cond_d

    .line 117
    .line 118
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 119
    .line 120
    :cond_d
    and-int/lit8 v2, p5, 0x4

    .line 121
    .line 122
    if-eqz v2, :cond_e

    .line 123
    .line 124
    sget-object p2, Landroidx/compose/material3/TimePickerDefaults;->INSTANCE:Landroidx/compose/material3/TimePickerDefaults;

    .line 125
    .line 126
    invoke-virtual {p2, p3, v4}, Landroidx/compose/material3/TimePickerDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TimePickerColors;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    :goto_8
    and-int/lit16 v1, v1, -0x381

    .line 131
    .line 132
    :cond_e
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 133
    .line 134
    .line 135
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_f

    .line 140
    .line 141
    const/4 v2, -0x1

    .line 142
    const-string v3, "androidx.compose.material3.TimeInput (TimePicker.kt:248)"

    .line 143
    .line 144
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_f
    shr-int/lit8 v0, v1, 0x3

    .line 148
    .line 149
    and-int/lit8 v2, v0, 0xe

    .line 150
    .line 151
    and-int/lit8 v0, v0, 0x70

    .line 152
    .line 153
    or-int/2addr v0, v2

    .line 154
    shl-int/2addr v1, v4

    .line 155
    and-int/lit16 v1, v1, 0x380

    .line 156
    .line 157
    or-int/2addr v0, v1

    .line 158
    invoke-static {p1, p2, p0, p3, v0}, Landroidx/compose/material3/TimePickerKt;->TimeInputImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V

    .line 159
    .line 160
    .line 161
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_9

    .line 166
    .line 167
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 168
    .line 169
    .line 170
    goto :goto_5

    .line 171
    :goto_9
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-eqz p1, :cond_10

    .line 176
    .line 177
    new-instance p2, Landroidx/compose/material3/TimePickerKt$TimeInput$1;

    .line 178
    .line 179
    move-object v1, p2

    .line 180
    move-object v2, p0

    .line 181
    move v5, p4

    .line 182
    move v6, p5

    .line 183
    invoke-direct/range {v1 .. v6}, Landroidx/compose/material3/TimePickerKt$TimeInput$1;-><init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;II)V

    .line 184
    .line 185
    .line 186
    invoke-interface {p1, p2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 187
    .line 188
    .line 189
    :cond_10
    return-void
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

.method private static final TimeInputImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V
    .locals 51
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p4

    .line 8
    .line 9
    const v0, -0x1c59f705

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p3

    .line 13
    .line 14
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    and-int/lit8 v1, v10, 0x6

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x2

    .line 31
    :goto_0
    or-int/2addr v1, v10

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v1, v10

    .line 34
    :goto_1
    and-int/lit8 v2, v10, 0x30

    .line 35
    .line 36
    if-nez v2, :cond_3

    .line 37
    .line 38
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    const/16 v2, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v2, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v1, v2

    .line 50
    :cond_3
    and-int/lit16 v2, v10, 0x180

    .line 51
    .line 52
    const/16 v3, 0x100

    .line 53
    .line 54
    if-nez v2, :cond_5

    .line 55
    .line 56
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    move v2, v3

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v2, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v1, v2

    .line 67
    :cond_5
    move v5, v1

    .line 68
    and-int/lit16 v1, v5, 0x93

    .line 69
    .line 70
    const/16 v2, 0x92

    .line 71
    .line 72
    if-ne v1, v2, :cond_7

    .line 73
    .line 74
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_6

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 82
    .line 83
    .line 84
    move-object v15, v6

    .line 85
    goto/16 :goto_9

    .line 86
    .line 87
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_8

    .line 92
    .line 93
    const/4 v1, -0x1

    .line 94
    const-string v2, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:817)"

    .line 95
    .line 96
    invoke-static {v0, v5, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_8
    const/4 v4, 0x0

    .line 100
    new-array v11, v4, [Ljava/lang/Object;

    .line 101
    .line 102
    sget-object v0, Landroidx/compose/ui/text/input/TextFieldValue;->Companion:Landroidx/compose/ui/text/input/TextFieldValue$Companion;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/TextFieldValue$Companion;->getSaver()Landroidx/compose/runtime/saveable/Saver;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    const/4 v13, 0x0

    .line 109
    const v1, 0x21af1613

    .line 110
    .line 111
    .line 112
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 113
    .line 114
    .line 115
    and-int/lit16 v1, v5, 0x380

    .line 116
    .line 117
    const/4 v2, 0x1

    .line 118
    if-ne v1, v3, :cond_9

    .line 119
    .line 120
    move v14, v2

    .line 121
    goto :goto_5

    .line 122
    :cond_9
    move v14, v4

    .line 123
    :goto_5
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    if-nez v14, :cond_a

    .line 128
    .line 129
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 130
    .line 131
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    if-ne v15, v14, :cond_b

    .line 136
    .line 137
    :cond_a
    new-instance v15, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$hourValue$2$1;

    .line 138
    .line 139
    invoke-direct {v15, v9}, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$hourValue$2$1;-><init>(Landroidx/compose/material3/TimePickerState;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_b
    move-object v14, v15

    .line 146
    check-cast v14, Lv3/a;

    .line 147
    .line 148
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 149
    .line 150
    .line 151
    const/16 v16, 0x0

    .line 152
    .line 153
    const/16 v17, 0x4

    .line 154
    .line 155
    move-object v15, v6

    .line 156
    invoke-static/range {v11 .. v17}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;

    .line 157
    .line 158
    .line 159
    move-result-object v15

    .line 160
    new-array v11, v4, [Ljava/lang/Object;

    .line 161
    .line 162
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/TextFieldValue$Companion;->getSaver()Landroidx/compose/runtime/saveable/Saver;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    const/4 v13, 0x0

    .line 167
    const v0, 0x21af16c7

    .line 168
    .line 169
    .line 170
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 171
    .line 172
    .line 173
    if-ne v1, v3, :cond_c

    .line 174
    .line 175
    move v0, v2

    .line 176
    goto :goto_6

    .line 177
    :cond_c
    move v0, v4

    .line 178
    :goto_6
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-nez v0, :cond_d

    .line 183
    .line 184
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 185
    .line 186
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-ne v1, v0, :cond_e

    .line 191
    .line 192
    :cond_d
    new-instance v1, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$minuteValue$2$1;

    .line 193
    .line 194
    invoke-direct {v1, v9}, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$minuteValue$2$1;-><init>(Landroidx/compose/material3/TimePickerState;)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_e
    move-object v14, v1

    .line 201
    check-cast v14, Lv3/a;

    .line 202
    .line 203
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 204
    .line 205
    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    const/16 v17, 0x4

    .line 209
    .line 210
    move-object v3, v15

    .line 211
    move-object v15, v6

    .line 212
    invoke-static/range {v11 .. v17}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    const/4 v1, 0x0

    .line 217
    const/4 v12, 0x0

    .line 218
    const/4 v13, 0x0

    .line 219
    sget v14, Landroidx/compose/material3/TimePickerKt;->TimeInputBottomPadding:F

    .line 220
    .line 221
    const/4 v15, 0x7

    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    move-object/from16 v0, p0

    .line 225
    .line 226
    move v2, v12

    .line 227
    move-object v12, v3

    .line 228
    move v3, v13

    .line 229
    move v13, v4

    .line 230
    move v4, v14

    .line 231
    move v14, v5

    .line 232
    move v5, v15

    .line 233
    move-object v15, v6

    .line 234
    move-object/from16 v6, v16

    .line 235
    .line 236
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 241
    .line 242
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    const v3, 0x2952b718

    .line 247
    .line 248
    .line 249
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 250
    .line 251
    .line 252
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 253
    .line 254
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    const/16 v4, 0x30

    .line 259
    .line 260
    invoke-static {v3, v2, v15, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    const v3, -0x4ee9b9da

    .line 265
    .line 266
    .line 267
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 268
    .line 269
    .line 270
    invoke-static {v15, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 271
    .line 272
    .line 273
    move-result v5

    .line 274
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 279
    .line 280
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    instance-of v4, v4, Landroidx/compose/runtime/Applier;

    .line 293
    .line 294
    if-nez v4, :cond_f

    .line 295
    .line 296
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 297
    .line 298
    .line 299
    :cond_f
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 300
    .line 301
    .line 302
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-eqz v4, :cond_10

    .line 307
    .line 308
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 309
    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_10
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 313
    .line 314
    .line 315
    :goto_7
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-static {v3, v2, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-static {v3, v6, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    if-nez v4, :cond_11

    .line 342
    .line 343
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    invoke-static {v4, v6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    if-nez v4, :cond_12

    .line 356
    .line 357
    :cond_11
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-interface {v3, v4, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 369
    .line 370
    .line 371
    :cond_12
    invoke-static {v15}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-interface {v0, v2, v15, v3}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    const v0, 0x7ab4aae9

    .line 387
    .line 388
    .line 389
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 390
    .line 391
    .line 392
    sget-object v2, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 393
    .line 394
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 395
    .line 396
    const/4 v3, 0x6

    .line 397
    invoke-virtual {v2, v15, v3}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    sget-object v4, Landroidx/compose/material3/tokens/TimeInputTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimeInputTokens;

    .line 402
    .line 403
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/TimeInputTokens;->getTimeFieldLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    invoke-static {v2, v5}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    .line 408
    .line 409
    .line 410
    move-result-object v19

    .line 411
    sget-object v2, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 412
    .line 413
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 414
    .line 415
    .line 416
    move-result v39

    .line 417
    const/4 v2, 0x1

    .line 418
    invoke-virtual {v8, v2}, Landroidx/compose/material3/TimePickerColors;->timeSelectorContentColor-vNxB06k$material3_release(Z)J

    .line 419
    .line 420
    .line 421
    move-result-wide v20

    .line 422
    const-wide/16 v22, 0x0

    .line 423
    .line 424
    const/16 v24, 0x0

    .line 425
    .line 426
    const/16 v25, 0x0

    .line 427
    .line 428
    const/16 v26, 0x0

    .line 429
    .line 430
    const/16 v27, 0x0

    .line 431
    .line 432
    const/16 v28, 0x0

    .line 433
    .line 434
    const-wide/16 v29, 0x0

    .line 435
    .line 436
    const/16 v31, 0x0

    .line 437
    .line 438
    const/16 v32, 0x0

    .line 439
    .line 440
    const/16 v33, 0x0

    .line 441
    .line 442
    const-wide/16 v34, 0x0

    .line 443
    .line 444
    const/16 v36, 0x0

    .line 445
    .line 446
    const/16 v37, 0x0

    .line 447
    .line 448
    const/16 v38, 0x0

    .line 449
    .line 450
    const/16 v40, 0x0

    .line 451
    .line 452
    const-wide/16 v41, 0x0

    .line 453
    .line 454
    const/16 v43, 0x0

    .line 455
    .line 456
    const/16 v44, 0x0

    .line 457
    .line 458
    const/16 v45, 0x0

    .line 459
    .line 460
    const/16 v46, 0x0

    .line 461
    .line 462
    const/16 v47, 0x0

    .line 463
    .line 464
    const/16 v48, 0x0

    .line 465
    .line 466
    const v49, 0xff7ffe

    .line 467
    .line 468
    .line 469
    const/16 v50, 0x0

    .line 470
    .line 471
    invoke-static/range {v19 .. v50}, Landroidx/compose/ui/text/TextStyle;->copy-p1EtxEg$default(Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    invoke-virtual {v6, v5}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    new-instance v6, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1;

    .line 484
    .line 485
    invoke-direct {v6, v12, v9, v8, v11}, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/MutableState;)V

    .line 486
    .line 487
    .line 488
    const v11, 0x4de2ac57    # 4.7536816E8f

    .line 489
    .line 490
    .line 491
    invoke-static {v15, v11, v2, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    sget v6, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    .line 496
    .line 497
    or-int/2addr v6, v13

    .line 498
    const/16 v11, 0x30

    .line 499
    .line 500
    or-int/2addr v6, v11

    .line 501
    invoke-static {v5, v2, v15, v6}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 502
    .line 503
    .line 504
    const v2, 0x21af2390

    .line 505
    .line 506
    .line 507
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/material3/TimePickerState;->is24hour()Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-nez v2, :cond_17

    .line 515
    .line 516
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 517
    .line 518
    sget v18, Landroidx/compose/material3/TimePickerKt;->PeriodToggleMargin:F

    .line 519
    .line 520
    const/16 v19, 0x0

    .line 521
    .line 522
    const/16 v20, 0x0

    .line 523
    .line 524
    const/16 v21, 0x0

    .line 525
    .line 526
    const/16 v22, 0xe

    .line 527
    .line 528
    const/16 v23, 0x0

    .line 529
    .line 530
    move-object/from16 v17, v2

    .line 531
    .line 532
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 533
    .line 534
    .line 535
    move-result-object v5

    .line 536
    const v6, 0x2bb5b5d7

    .line 537
    .line 538
    .line 539
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    invoke-static {v1, v13, v15, v13}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    const v6, -0x4ee9b9da

    .line 551
    .line 552
    .line 553
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 554
    .line 555
    .line 556
    invoke-static {v15, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 557
    .line 558
    .line 559
    move-result v6

    .line 560
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 561
    .line 562
    .line 563
    move-result-object v11

    .line 564
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 565
    .line 566
    .line 567
    move-result-object v12

    .line 568
    invoke-static {v5}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    instance-of v3, v3, Landroidx/compose/runtime/Applier;

    .line 577
    .line 578
    if-nez v3, :cond_13

    .line 579
    .line 580
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 581
    .line 582
    .line 583
    :cond_13
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 584
    .line 585
    .line 586
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    if-eqz v3, :cond_14

    .line 591
    .line 592
    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 593
    .line 594
    .line 595
    goto :goto_8

    .line 596
    :cond_14
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 597
    .line 598
    .line 599
    :goto_8
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 604
    .line 605
    .line 606
    move-result-object v12

    .line 607
    invoke-static {v3, v1, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-static {v3, v11, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 622
    .line 623
    .line 624
    move-result v11

    .line 625
    if-nez v11, :cond_15

    .line 626
    .line 627
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v11

    .line 631
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object v12

    .line 635
    invoke-static {v11, v12}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v11

    .line 639
    if-nez v11, :cond_16

    .line 640
    .line 641
    :cond_15
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 642
    .line 643
    .line 644
    move-result-object v11

    .line 645
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 649
    .line 650
    .line 651
    move-result-object v6

    .line 652
    invoke-interface {v3, v6, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 653
    .line 654
    .line 655
    :cond_16
    invoke-static {v15}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    invoke-interface {v5, v1, v15, v3}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 671
    .line 672
    .line 673
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 674
    .line 675
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/TimeInputTokens;->getPeriodSelectorContainerWidth-D9Ej5fM()F

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/TimeInputTokens;->getPeriodSelectorContainerHeight-D9Ej5fM()F

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    invoke-static {v2, v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    shr-int/lit8 v1, v14, 0x3

    .line 688
    .line 689
    and-int/lit8 v1, v1, 0x70

    .line 690
    .line 691
    const/4 v2, 0x6

    .line 692
    or-int/2addr v1, v2

    .line 693
    shl-int/lit8 v2, v14, 0x3

    .line 694
    .line 695
    and-int/lit16 v2, v2, 0x380

    .line 696
    .line 697
    or-int/2addr v1, v2

    .line 698
    invoke-static {v0, v9, v8, v15, v1}, Landroidx/compose/material3/TimePickerKt;->VerticalPeriodToggle(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 699
    .line 700
    .line 701
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 702
    .line 703
    .line 704
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 705
    .line 706
    .line 707
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 708
    .line 709
    .line 710
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 711
    .line 712
    .line 713
    :cond_17
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 714
    .line 715
    .line 716
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 717
    .line 718
    .line 719
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 720
    .line 721
    .line 722
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 723
    .line 724
    .line 725
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 726
    .line 727
    .line 728
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    if-eqz v0, :cond_18

    .line 733
    .line 734
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 735
    .line 736
    .line 737
    :cond_18
    :goto_9
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    if-eqz v0, :cond_19

    .line 742
    .line 743
    new-instance v1, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$2;

    .line 744
    .line 745
    invoke-direct {v1, v7, v8, v9, v10}, Landroidx/compose/material3/TimePickerKt$TimeInputImpl$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;I)V

    .line 746
    .line 747
    .line 748
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 749
    .line 750
    .line 751
    :cond_19
    return-void
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

.method private static final TimeInputImpl$lambda$5(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
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

.method private static final TimeInputImpl$lambda$6(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
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

.method private static final TimeInputImpl$lambda$8(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
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

.method private static final TimeInputImpl$lambda$9(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
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

.method public static final TimePicker-mT9BvqQ(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V
    .locals 8
    .param p0    # Landroidx/compose/material3/TimePickerState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/TimePickerColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    const v0, -0x24e98fb4

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
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    and-int/lit16 v3, p5, 0x180

    .line 55
    .line 56
    if-nez v3, :cond_7

    .line 57
    .line 58
    and-int/lit8 v3, p6, 0x4

    .line 59
    .line 60
    if-nez v3, :cond_6

    .line 61
    .line 62
    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_6

    .line 67
    .line 68
    const/16 v3, 0x100

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    const/16 v3, 0x80

    .line 72
    .line 73
    :goto_4
    or-int/2addr v1, v3

    .line 74
    :cond_7
    and-int/lit16 v3, p5, 0xc00

    .line 75
    .line 76
    if-nez v3, :cond_9

    .line 77
    .line 78
    and-int/lit8 v3, p6, 0x8

    .line 79
    .line 80
    if-nez v3, :cond_8

    .line 81
    .line 82
    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_8

    .line 87
    .line 88
    const/16 v3, 0x800

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_8
    const/16 v3, 0x400

    .line 92
    .line 93
    :goto_5
    or-int/2addr v1, v3

    .line 94
    :cond_9
    and-int/lit16 v3, v1, 0x493

    .line 95
    .line 96
    const/16 v4, 0x492

    .line 97
    .line 98
    if-ne v3, v4, :cond_c

    .line 99
    .line 100
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-nez v3, :cond_a

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_a
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 108
    .line 109
    .line 110
    :cond_b
    :goto_6
    move-object v3, p1

    .line 111
    move-object v4, p2

    .line 112
    move v5, p3

    .line 113
    goto/16 :goto_b

    .line 114
    .line 115
    :cond_c
    :goto_7
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 116
    .line 117
    .line 118
    and-int/lit8 v3, p5, 0x1

    .line 119
    .line 120
    if-eqz v3, :cond_f

    .line 121
    .line 122
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_d

    .line 127
    .line 128
    goto :goto_8

    .line 129
    :cond_d
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 130
    .line 131
    .line 132
    and-int/lit8 v2, p6, 0x4

    .line 133
    .line 134
    if-eqz v2, :cond_e

    .line 135
    .line 136
    and-int/lit16 v1, v1, -0x381

    .line 137
    .line 138
    :cond_e
    and-int/lit8 v2, p6, 0x8

    .line 139
    .line 140
    if-eqz v2, :cond_12

    .line 141
    .line 142
    goto :goto_9

    .line 143
    :cond_f
    :goto_8
    if-eqz v2, :cond_10

    .line 144
    .line 145
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 146
    .line 147
    :cond_10
    and-int/lit8 v2, p6, 0x4

    .line 148
    .line 149
    const/4 v3, 0x6

    .line 150
    if-eqz v2, :cond_11

    .line 151
    .line 152
    sget-object p2, Landroidx/compose/material3/TimePickerDefaults;->INSTANCE:Landroidx/compose/material3/TimePickerDefaults;

    .line 153
    .line 154
    invoke-virtual {p2, p4, v3}, Landroidx/compose/material3/TimePickerDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TimePickerColors;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    and-int/lit16 v1, v1, -0x381

    .line 159
    .line 160
    :cond_11
    and-int/lit8 v2, p6, 0x8

    .line 161
    .line 162
    if-eqz v2, :cond_12

    .line 163
    .line 164
    sget-object p3, Landroidx/compose/material3/TimePickerDefaults;->INSTANCE:Landroidx/compose/material3/TimePickerDefaults;

    .line 165
    .line 166
    invoke-virtual {p3, p4, v3}, Landroidx/compose/material3/TimePickerDefaults;->layoutType-sDNSZnc(Landroidx/compose/runtime/Composer;I)I

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    :goto_9
    and-int/lit16 v1, v1, -0x1c01

    .line 171
    .line 172
    :cond_12
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 173
    .line 174
    .line 175
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_13

    .line 180
    .line 181
    const/4 v2, -0x1

    .line 182
    const-string v3, "androidx.compose.material3.TimePicker (TimePicker.kt:207)"

    .line 183
    .line 184
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :cond_13
    const/4 v0, 0x0

    .line 188
    invoke-static {p4, v0}, Landroidx/compose/material3/TouchExplorationStateProvider_androidKt;->touchExplorationState(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    sget-object v2, Landroidx/compose/material3/TimePickerLayoutType;->Companion:Landroidx/compose/material3/TimePickerLayoutType$Companion;

    .line 193
    .line 194
    invoke-virtual {v2}, Landroidx/compose/material3/TimePickerLayoutType$Companion;->getVertical-QJTpgSE()I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    invoke-static {p3, v2}, Landroidx/compose/material3/TimePickerLayoutType;->equals-impl0(II)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_14

    .line 203
    .line 204
    const v2, 0x4e905779

    .line 205
    .line 206
    .line 207
    invoke-interface {p4, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 208
    .line 209
    .line 210
    invoke-static {v0}, Landroidx/compose/material3/TimePickerKt;->TimePicker_mT9BvqQ$lambda$0(Landroidx/compose/runtime/State;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    xor-int/lit8 v4, v0, 0x1

    .line 215
    .line 216
    and-int/lit8 v0, v1, 0xe

    .line 217
    .line 218
    and-int/lit8 v2, v1, 0x70

    .line 219
    .line 220
    or-int/2addr v0, v2

    .line 221
    and-int/lit16 v1, v1, 0x380

    .line 222
    .line 223
    or-int v6, v0, v1

    .line 224
    .line 225
    const/4 v7, 0x0

    .line 226
    move-object v1, p0

    .line 227
    move-object v2, p1

    .line 228
    move-object v3, p2

    .line 229
    move-object v5, p4

    .line 230
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/TimePickerKt;->VerticalTimePicker(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V

    .line 231
    .line 232
    .line 233
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 234
    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_14
    const v2, 0x4e905847

    .line 238
    .line 239
    .line 240
    invoke-interface {p4, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 241
    .line 242
    .line 243
    invoke-static {v0}, Landroidx/compose/material3/TimePickerKt;->TimePicker_mT9BvqQ$lambda$0(Landroidx/compose/runtime/State;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    xor-int/lit8 v4, v0, 0x1

    .line 248
    .line 249
    and-int/lit8 v0, v1, 0xe

    .line 250
    .line 251
    and-int/lit8 v2, v1, 0x70

    .line 252
    .line 253
    or-int/2addr v0, v2

    .line 254
    and-int/lit16 v1, v1, 0x380

    .line 255
    .line 256
    or-int v6, v0, v1

    .line 257
    .line 258
    const/4 v7, 0x0

    .line 259
    move-object v1, p0

    .line 260
    move-object v2, p1

    .line 261
    move-object v3, p2

    .line 262
    move-object v5, p4

    .line 263
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/TimePickerKt;->HorizontalTimePicker(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V

    .line 264
    .line 265
    .line 266
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 267
    .line 268
    .line 269
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_b

    .line 274
    .line 275
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_6

    .line 279
    .line 280
    :goto_b
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    if-eqz p1, :cond_15

    .line 285
    .line 286
    new-instance p2, Landroidx/compose/material3/TimePickerKt$TimePicker$1;

    .line 287
    .line 288
    move-object v1, p2

    .line 289
    move-object v2, p0

    .line 290
    move v6, p5

    .line 291
    move v7, p6

    .line 292
    invoke-direct/range {v1 .. v7}, Landroidx/compose/material3/TimePickerKt$TimePicker$1;-><init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;III)V

    .line 293
    .line 294
    .line 295
    invoke-interface {p1, p2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 296
    .line 297
    .line 298
    :cond_15
    return-void
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

.method private static final TimePickerTextField-lxUZ_iY(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V
    .locals 118
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/material3/TimePickerState;",
            "I",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "Landroidx/compose/material3/TimePickerColors;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v13, p1

    .line 2
    .line 3
    move-object/from16 v7, p3

    .line 4
    .line 5
    move/from16 v15, p4

    .line 6
    .line 7
    move-object/from16 v12, p7

    .line 8
    .line 9
    move/from16 v11, p9

    .line 10
    .line 11
    move/from16 v10, p10

    .line 12
    .line 13
    const v0, -0x15e7f74a

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p8

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    and-int/lit8 v1, v10, 0x1

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    or-int/lit8 v1, v11, 0x6

    .line 27
    .line 28
    move-object/from16 v6, p0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    and-int/lit8 v1, v11, 0x6

    .line 32
    .line 33
    move-object/from16 v6, p0

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v1, 0x2

    .line 46
    :goto_0
    or-int/2addr v1, v11

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v1, v11

    .line 49
    :goto_1
    and-int/lit8 v2, v10, 0x2

    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    or-int/lit8 v1, v1, 0x30

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    and-int/lit8 v2, v11, 0x30

    .line 57
    .line 58
    if-nez v2, :cond_5

    .line 59
    .line 60
    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    const/16 v2, 0x20

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    const/16 v2, 0x10

    .line 70
    .line 71
    :goto_2
    or-int/2addr v1, v2

    .line 72
    :cond_5
    :goto_3
    and-int/lit8 v2, v10, 0x4

    .line 73
    .line 74
    if-eqz v2, :cond_6

    .line 75
    .line 76
    or-int/lit16 v1, v1, 0x180

    .line 77
    .line 78
    move-object/from16 v5, p2

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_6
    and-int/lit16 v2, v11, 0x180

    .line 82
    .line 83
    move-object/from16 v5, p2

    .line 84
    .line 85
    if-nez v2, :cond_8

    .line 86
    .line 87
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_7

    .line 92
    .line 93
    const/16 v2, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_7
    const/16 v2, 0x80

    .line 97
    .line 98
    :goto_4
    or-int/2addr v1, v2

    .line 99
    :cond_8
    :goto_5
    and-int/lit8 v2, v10, 0x8

    .line 100
    .line 101
    if-eqz v2, :cond_9

    .line 102
    .line 103
    or-int/lit16 v1, v1, 0xc00

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_9
    and-int/lit16 v2, v11, 0xc00

    .line 107
    .line 108
    if-nez v2, :cond_b

    .line 109
    .line 110
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_a

    .line 115
    .line 116
    const/16 v2, 0x800

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_a
    const/16 v2, 0x400

    .line 120
    .line 121
    :goto_6
    or-int/2addr v1, v2

    .line 122
    :cond_b
    :goto_7
    and-int/lit8 v2, v10, 0x10

    .line 123
    .line 124
    if-eqz v2, :cond_c

    .line 125
    .line 126
    or-int/lit16 v1, v1, 0x6000

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_c
    and-int/lit16 v2, v11, 0x6000

    .line 130
    .line 131
    if-nez v2, :cond_e

    .line 132
    .line 133
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_d

    .line 138
    .line 139
    const/16 v2, 0x4000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_d
    const/16 v2, 0x2000

    .line 143
    .line 144
    :goto_8
    or-int/2addr v1, v2

    .line 145
    :cond_e
    :goto_9
    and-int/lit8 v2, v10, 0x20

    .line 146
    .line 147
    const/high16 v16, 0x30000

    .line 148
    .line 149
    if-eqz v2, :cond_f

    .line 150
    .line 151
    or-int v1, v1, v16

    .line 152
    .line 153
    move-object/from16 v3, p5

    .line 154
    .line 155
    goto :goto_b

    .line 156
    :cond_f
    and-int v16, v11, v16

    .line 157
    .line 158
    move-object/from16 v3, p5

    .line 159
    .line 160
    if-nez v16, :cond_11

    .line 161
    .line 162
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v16

    .line 166
    if-eqz v16, :cond_10

    .line 167
    .line 168
    const/high16 v16, 0x20000

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_10
    const/high16 v16, 0x10000

    .line 172
    .line 173
    :goto_a
    or-int v1, v1, v16

    .line 174
    .line 175
    :cond_11
    :goto_b
    and-int/lit8 v16, v10, 0x40

    .line 176
    .line 177
    const/high16 v17, 0x180000

    .line 178
    .line 179
    if-eqz v16, :cond_12

    .line 180
    .line 181
    or-int v1, v1, v17

    .line 182
    .line 183
    move-object/from16 v4, p6

    .line 184
    .line 185
    goto :goto_d

    .line 186
    :cond_12
    and-int v17, v11, v17

    .line 187
    .line 188
    move-object/from16 v4, p6

    .line 189
    .line 190
    if-nez v17, :cond_14

    .line 191
    .line 192
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v17

    .line 196
    if-eqz v17, :cond_13

    .line 197
    .line 198
    const/high16 v17, 0x100000

    .line 199
    .line 200
    goto :goto_c

    .line 201
    :cond_13
    const/high16 v17, 0x80000

    .line 202
    .line 203
    :goto_c
    or-int v1, v1, v17

    .line 204
    .line 205
    :cond_14
    :goto_d
    and-int/lit16 v8, v10, 0x80

    .line 206
    .line 207
    if-eqz v8, :cond_15

    .line 208
    .line 209
    const/high16 v8, 0xc00000

    .line 210
    .line 211
    :goto_e
    or-int/2addr v1, v8

    .line 212
    goto :goto_f

    .line 213
    :cond_15
    const/high16 v8, 0xc00000

    .line 214
    .line 215
    and-int/2addr v8, v11

    .line 216
    if-nez v8, :cond_17

    .line 217
    .line 218
    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    if-eqz v8, :cond_16

    .line 223
    .line 224
    const/high16 v8, 0x800000

    .line 225
    .line 226
    goto :goto_e

    .line 227
    :cond_16
    const/high16 v8, 0x400000

    .line 228
    .line 229
    goto :goto_e

    .line 230
    :cond_17
    :goto_f
    move v8, v1

    .line 231
    const v1, 0x492493

    .line 232
    .line 233
    .line 234
    and-int/2addr v1, v8

    .line 235
    const v14, 0x492492

    .line 236
    .line 237
    .line 238
    if-ne v1, v14, :cond_19

    .line 239
    .line 240
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-nez v1, :cond_18

    .line 245
    .line 246
    goto :goto_10

    .line 247
    :cond_18
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 248
    .line 249
    .line 250
    move-object v6, v3

    .line 251
    move-object v5, v7

    .line 252
    move-object v3, v9

    .line 253
    move v0, v15

    .line 254
    move-object v7, v4

    .line 255
    goto/16 :goto_1d

    .line 256
    .line 257
    :cond_19
    :goto_10
    if-eqz v2, :cond_1a

    .line 258
    .line 259
    sget-object v1, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    .line 260
    .line 261
    invoke-virtual {v1}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    move-object/from16 v110, v1

    .line 266
    .line 267
    goto :goto_11

    .line 268
    :cond_1a
    move-object/from16 v110, v3

    .line 269
    .line 270
    :goto_11
    if-eqz v16, :cond_1b

    .line 271
    .line 272
    sget-object v1, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    .line 273
    .line 274
    invoke-virtual {v1}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    move-object/from16 v111, v1

    .line 279
    .line 280
    goto :goto_12

    .line 281
    :cond_1b
    move-object/from16 v111, v4

    .line 282
    .line 283
    :goto_12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_1c

    .line 288
    .line 289
    const/4 v1, -0x1

    .line 290
    const-string v2, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1573)"

    .line 291
    .line 292
    invoke-static {v0, v8, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 293
    .line 294
    .line 295
    :cond_1c
    const v0, -0x1f55c9e1

    .line 296
    .line 297
    .line 298
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 299
    .line 300
    .line 301
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    sget-object v112, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 306
    .line 307
    invoke-virtual/range {v112 .. v112}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    if-ne v0, v1, :cond_1d

    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_1d
    move-object v14, v0

    .line 321
    check-cast v14, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 322
    .line 323
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 324
    .line 325
    .line 326
    const v0, -0x1f55c9a0

    .line 327
    .line 328
    .line 329
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual/range {v112 .. v112}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    if-ne v0, v1, :cond_1e

    .line 341
    .line 342
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester;

    .line 343
    .line 344
    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 345
    .line 346
    .line 347
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :cond_1e
    move-object v4, v0

    .line 351
    check-cast v4, Landroidx/compose/ui/focus/FocusRequester;

    .line 352
    .line 353
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 354
    .line 355
    .line 356
    sget-object v16, Landroidx/compose/material3/OutlinedTextFieldDefaults;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldDefaults;

    .line 357
    .line 358
    const/4 v3, 0x1

    .line 359
    invoke-virtual {v12, v3}, Landroidx/compose/material3/TimePickerColors;->timeSelectorContainerColor-vNxB06k$material3_release(Z)J

    .line 360
    .line 361
    .line 362
    move-result-wide v25

    .line 363
    invoke-virtual {v12, v3}, Landroidx/compose/material3/TimePickerColors;->timeSelectorContainerColor-vNxB06k$material3_release(Z)J

    .line 364
    .line 365
    .line 366
    move-result-wide v27

    .line 367
    invoke-virtual {v12, v3}, Landroidx/compose/material3/TimePickerColors;->timeSelectorContentColor-vNxB06k$material3_release(Z)J

    .line 368
    .line 369
    .line 370
    move-result-wide v17

    .line 371
    const-wide/16 v19, 0x0

    .line 372
    .line 373
    const-wide/16 v21, 0x0

    .line 374
    .line 375
    const-wide/16 v23, 0x0

    .line 376
    .line 377
    const-wide/16 v29, 0x0

    .line 378
    .line 379
    const-wide/16 v31, 0x0

    .line 380
    .line 381
    const-wide/16 v33, 0x0

    .line 382
    .line 383
    const-wide/16 v35, 0x0

    .line 384
    .line 385
    const/16 v37, 0x0

    .line 386
    .line 387
    const-wide/16 v38, 0x0

    .line 388
    .line 389
    const-wide/16 v40, 0x0

    .line 390
    .line 391
    const-wide/16 v42, 0x0

    .line 392
    .line 393
    const-wide/16 v44, 0x0

    .line 394
    .line 395
    const-wide/16 v46, 0x0

    .line 396
    .line 397
    const-wide/16 v48, 0x0

    .line 398
    .line 399
    const-wide/16 v50, 0x0

    .line 400
    .line 401
    const-wide/16 v52, 0x0

    .line 402
    .line 403
    const-wide/16 v54, 0x0

    .line 404
    .line 405
    const-wide/16 v56, 0x0

    .line 406
    .line 407
    const-wide/16 v58, 0x0

    .line 408
    .line 409
    const-wide/16 v60, 0x0

    .line 410
    .line 411
    const-wide/16 v62, 0x0

    .line 412
    .line 413
    const-wide/16 v64, 0x0

    .line 414
    .line 415
    const-wide/16 v66, 0x0

    .line 416
    .line 417
    const-wide/16 v68, 0x0

    .line 418
    .line 419
    const-wide/16 v70, 0x0

    .line 420
    .line 421
    const-wide/16 v72, 0x0

    .line 422
    .line 423
    const-wide/16 v74, 0x0

    .line 424
    .line 425
    const-wide/16 v76, 0x0

    .line 426
    .line 427
    const-wide/16 v78, 0x0

    .line 428
    .line 429
    const-wide/16 v80, 0x0

    .line 430
    .line 431
    const-wide/16 v82, 0x0

    .line 432
    .line 433
    const-wide/16 v84, 0x0

    .line 434
    .line 435
    const-wide/16 v86, 0x0

    .line 436
    .line 437
    const-wide/16 v88, 0x0

    .line 438
    .line 439
    const-wide/16 v90, 0x0

    .line 440
    .line 441
    const-wide/16 v92, 0x0

    .line 442
    .line 443
    const-wide/16 v94, 0x0

    .line 444
    .line 445
    const-wide/16 v96, 0x0

    .line 446
    .line 447
    const-wide/16 v98, 0x0

    .line 448
    .line 449
    const-wide/16 v100, 0x0

    .line 450
    .line 451
    const/16 v103, 0x0

    .line 452
    .line 453
    const/16 v104, 0x0

    .line 454
    .line 455
    const/16 v105, 0x0

    .line 456
    .line 457
    const/16 v106, 0x0

    .line 458
    .line 459
    const/16 v107, 0xc00

    .line 460
    .line 461
    const v108, 0x7fffffce

    .line 462
    .line 463
    .line 464
    const/16 v109, 0xfff

    .line 465
    .line 466
    move-object/from16 v102, v9

    .line 467
    .line 468
    invoke-virtual/range {v16 .. v109}, Landroidx/compose/material3/OutlinedTextFieldDefaults;->colors-0hiis_0(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/material3/TimePickerState;->getSelection-JiIwxys$material3_release()I

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    invoke-static {v15, v0}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    and-int/lit8 v0, v8, 0xe

    .line 481
    .line 482
    const v3, -0x1cd0f17e

    .line 483
    .line 484
    .line 485
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 486
    .line 487
    .line 488
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 489
    .line 490
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    sget-object v16, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 495
    .line 496
    move-object/from16 p6, v2

    .line 497
    .line 498
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    shr-int/lit8 v17, v0, 0x3

    .line 503
    .line 504
    and-int/lit8 v18, v17, 0xe

    .line 505
    .line 506
    and-int/lit8 v17, v17, 0x70

    .line 507
    .line 508
    move-object/from16 v19, v4

    .line 509
    .line 510
    or-int v4, v18, v17

    .line 511
    .line 512
    invoke-static {v3, v2, v9, v4}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    const/16 v17, 0x3

    .line 517
    .line 518
    shl-int/lit8 v0, v0, 0x3

    .line 519
    .line 520
    and-int/lit8 v0, v0, 0x70

    .line 521
    .line 522
    const v3, -0x4ee9b9da

    .line 523
    .line 524
    .line 525
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 526
    .line 527
    .line 528
    const/4 v4, 0x0

    .line 529
    invoke-static {v9, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    sget-object v20, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 538
    .line 539
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    invoke-static/range {p0 .. p0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    shl-int/lit8 v0, v0, 0x9

    .line 548
    .line 549
    and-int/lit16 v0, v0, 0x1c00

    .line 550
    .line 551
    const/4 v12, 0x6

    .line 552
    or-int/2addr v0, v12

    .line 553
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 554
    .line 555
    .line 556
    move-result-object v12

    .line 557
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 558
    .line 559
    if-nez v12, :cond_1f

    .line 560
    .line 561
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 562
    .line 563
    .line 564
    :cond_1f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 565
    .line 566
    .line 567
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 568
    .line 569
    .line 570
    move-result v12

    .line 571
    if-eqz v12, :cond_20

    .line 572
    .line 573
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 574
    .line 575
    .line 576
    goto :goto_13

    .line 577
    :cond_20
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 578
    .line 579
    .line 580
    :goto_13
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 585
    .line 586
    .line 587
    move-result-object v12

    .line 588
    invoke-static {v5, v2, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    invoke-static {v5, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 603
    .line 604
    .line 605
    move-result v4

    .line 606
    if-nez v4, :cond_21

    .line 607
    .line 608
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    move-result-object v12

    .line 616
    invoke-static {v4, v12}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v4

    .line 620
    if-nez v4, :cond_22

    .line 621
    .line 622
    :cond_21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 623
    .line 624
    .line 625
    move-result-object v4

    .line 626
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    invoke-interface {v5, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 634
    .line 635
    .line 636
    :cond_22
    invoke-static {v9}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    shr-int/lit8 v0, v0, 0x3

    .line 645
    .line 646
    and-int/lit8 v0, v0, 0x70

    .line 647
    .line 648
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-interface {v6, v2, v9, v0}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    const v0, 0x7ab4aae9

    .line 656
    .line 657
    .line 658
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 659
    .line 660
    .line 661
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 662
    .line 663
    const v0, 0x356a4891

    .line 664
    .line 665
    .line 666
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 667
    .line 668
    .line 669
    if-nez v1, :cond_24

    .line 670
    .line 671
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 672
    .line 673
    sget-object v2, Landroidx/compose/material3/tokens/TimeInputTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimeInputTokens;

    .line 674
    .line 675
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/TimeInputTokens;->getTimeFieldContainerWidth-D9Ej5fM()F

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/TimeInputTokens;->getTimeFieldContainerHeight-D9Ej5fM()F

    .line 680
    .line 681
    .line 682
    move-result v2

    .line 683
    invoke-static {v0, v3, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    sget-object v2, Landroidx/compose/material3/Selection;->Companion:Landroidx/compose/material3/Selection$Companion;

    .line 688
    .line 689
    invoke-virtual {v2}, Landroidx/compose/material3/Selection$Companion;->getHour-JiIwxys()I

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    invoke-static {v15, v2}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 694
    .line 695
    .line 696
    move-result v2

    .line 697
    if-eqz v2, :cond_23

    .line 698
    .line 699
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/material3/TimePickerState;->getHourForDisplay$material3_release()I

    .line 700
    .line 701
    .line 702
    move-result v2

    .line 703
    goto :goto_14

    .line 704
    :cond_23
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/material3/TimePickerState;->getMinute()I

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    :goto_14
    shr-int/lit8 v3, v8, 0x3

    .line 709
    .line 710
    and-int/lit16 v4, v3, 0x380

    .line 711
    .line 712
    const/4 v5, 0x6

    .line 713
    or-int/2addr v4, v5

    .line 714
    and-int/lit16 v3, v3, 0x1c00

    .line 715
    .line 716
    or-int/2addr v3, v4

    .line 717
    shr-int/lit8 v4, v8, 0x9

    .line 718
    .line 719
    const v5, 0xe000

    .line 720
    .line 721
    .line 722
    and-int/2addr v4, v5

    .line 723
    or-int v6, v3, v4

    .line 724
    .line 725
    move v12, v1

    .line 726
    move v1, v2

    .line 727
    move-object/from16 v5, p6

    .line 728
    .line 729
    move-object/from16 v2, p3

    .line 730
    .line 731
    const/4 v4, 0x1

    .line 732
    move/from16 v3, p4

    .line 733
    .line 734
    move/from16 p8, v8

    .line 735
    .line 736
    move-object/from16 v11, v19

    .line 737
    .line 738
    const/4 v10, 0x0

    .line 739
    move v8, v4

    .line 740
    move-object/from16 v4, p7

    .line 741
    .line 742
    move-object/from16 v113, v5

    .line 743
    .line 744
    move-object v5, v9

    .line 745
    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/TimePickerKt;->TimeSelector-uXwN82Y(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 746
    .line 747
    .line 748
    goto :goto_15

    .line 749
    :cond_24
    move-object/from16 v113, p6

    .line 750
    .line 751
    move v12, v1

    .line 752
    move/from16 p8, v8

    .line 753
    .line 754
    move-object/from16 v11, v19

    .line 755
    .line 756
    const/4 v8, 0x1

    .line 757
    const/4 v10, 0x0

    .line 758
    :goto_15
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 759
    .line 760
    .line 761
    sget-object v22, Landroidx/compose/material3/Selection;->Companion:Landroidx/compose/material3/Selection$Companion;

    .line 762
    .line 763
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/material3/Selection$Companion;->getMinute-JiIwxys()I

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    invoke-static {v15, v0}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 768
    .line 769
    .line 770
    move-result v0

    .line 771
    if-eqz v0, :cond_25

    .line 772
    .line 773
    sget-object v0, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 774
    .line 775
    sget v0, Landroidx/compose/material3/R$string;->m3c_time_picker_minute_text_field:I

    .line 776
    .line 777
    invoke-static {v0}, Landroidx/compose/material3/Strings;->constructor-impl(I)I

    .line 778
    .line 779
    .line 780
    move-result v0

    .line 781
    goto :goto_16

    .line 782
    :cond_25
    sget-object v0, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 783
    .line 784
    sget v0, Landroidx/compose/material3/R$string;->m3c_time_picker_hour_text_field:I

    .line 785
    .line 786
    invoke-static {v0}, Landroidx/compose/material3/Strings;->constructor-impl(I)I

    .line 787
    .line 788
    .line 789
    move-result v0

    .line 790
    :goto_16
    invoke-static {v0, v9, v10}, Landroidx/compose/material3/Strings_androidKt;->getString-NWtq2-8(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 795
    .line 796
    invoke-static {v6, v12}, Landroidx/compose/material3/TimePickerKt;->visible(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    const v2, 0x2bb5b5d7

    .line 801
    .line 802
    .line 803
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    invoke-static {v2, v10, v9, v10}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    const v3, -0x4ee9b9da

    .line 815
    .line 816
    .line 817
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 818
    .line 819
    .line 820
    invoke-static {v9, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 821
    .line 822
    .line 823
    move-result v3

    .line 824
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 825
    .line 826
    .line 827
    move-result-object v4

    .line 828
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 829
    .line 830
    .line 831
    move-result-object v5

    .line 832
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 837
    .line 838
    .line 839
    move-result-object v12

    .line 840
    instance-of v12, v12, Landroidx/compose/runtime/Applier;

    .line 841
    .line 842
    if-nez v12, :cond_26

    .line 843
    .line 844
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 845
    .line 846
    .line 847
    :cond_26
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 848
    .line 849
    .line 850
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 851
    .line 852
    .line 853
    move-result v12

    .line 854
    if-eqz v12, :cond_27

    .line 855
    .line 856
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 857
    .line 858
    .line 859
    goto :goto_17

    .line 860
    :cond_27
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 861
    .line 862
    .line 863
    :goto_17
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 864
    .line 865
    .line 866
    move-result-object v5

    .line 867
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 868
    .line 869
    .line 870
    move-result-object v12

    .line 871
    invoke-static {v5, v2, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    invoke-static {v5, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 879
    .line 880
    .line 881
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 886
    .line 887
    .line 888
    move-result v4

    .line 889
    if-nez v4, :cond_28

    .line 890
    .line 891
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v4

    .line 895
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v12

    .line 899
    invoke-static {v4, v12}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v4

    .line 903
    if-nez v4, :cond_29

    .line 904
    .line 905
    :cond_28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 906
    .line 907
    .line 908
    move-result-object v4

    .line 909
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 913
    .line 914
    .line 915
    move-result-object v3

    .line 916
    invoke-interface {v5, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 917
    .line 918
    .line 919
    :cond_29
    invoke-static {v9}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 920
    .line 921
    .line 922
    move-result-object v2

    .line 923
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 928
    .line 929
    .line 930
    move-result-object v3

    .line 931
    invoke-interface {v1, v2, v9, v3}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    const v1, 0x7ab4aae9

    .line 935
    .line 936
    .line 937
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 938
    .line 939
    .line 940
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 941
    .line 942
    invoke-static {v6, v11}, Landroidx/compose/ui/focus/FocusRequesterModifierKt;->focusRequester(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;

    .line 943
    .line 944
    .line 945
    move-result-object v1

    .line 946
    sget-object v20, Landroidx/compose/material3/tokens/TimeInputTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimeInputTokens;

    .line 947
    .line 948
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/tokens/TimeInputTokens;->getTimeFieldContainerWidth-D9Ej5fM()F

    .line 949
    .line 950
    .line 951
    move-result v2

    .line 952
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/tokens/TimeInputTokens;->getTimeFieldContainerHeight-D9Ej5fM()F

    .line 953
    .line 954
    .line 955
    move-result v3

    .line 956
    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    const v2, -0x65068ca0

    .line 961
    .line 962
    .line 963
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 964
    .line 965
    .line 966
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 967
    .line 968
    .line 969
    move-result v2

    .line 970
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v3

    .line 974
    if-nez v2, :cond_2a

    .line 975
    .line 976
    invoke-virtual/range {v112 .. v112}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v2

    .line 980
    if-ne v3, v2, :cond_2b

    .line 981
    .line 982
    :cond_2a
    new-instance v3, Landroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$1$1;

    .line 983
    .line 984
    invoke-direct {v3, v0}, Landroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$1$1;-><init>(Ljava/lang/String;)V

    .line 985
    .line 986
    .line 987
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 988
    .line 989
    .line 990
    :cond_2b
    check-cast v3, Lv3/l;

    .line 991
    .line 992
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 993
    .line 994
    .line 995
    const/4 v0, 0x0

    .line 996
    invoke-static {v1, v10, v3, v8, v0}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 997
    .line 998
    .line 999
    move-result-object v2

    .line 1000
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v1

    .line 1004
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    move-object v5, v1

    .line 1009
    check-cast v5, Landroidx/compose/ui/text/TextStyle;

    .line 1010
    .line 1011
    sget-object v23, Landroidx/compose/ui/graphics/Brush;->Companion:Landroidx/compose/ui/graphics/Brush$Companion;

    .line 1012
    .line 1013
    const/4 v1, 0x6

    .line 1014
    new-array v3, v1, [Lkotlin/u0;

    .line 1015
    .line 1016
    const/4 v1, 0x0

    .line 1017
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v1

    .line 1021
    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 1022
    .line 1023
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 1024
    .line 1025
    .line 1026
    move-result-wide v18

    .line 1027
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v12

    .line 1031
    invoke-static {v1, v12}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v1

    .line 1035
    aput-object v1, v3, v10

    .line 1036
    .line 1037
    const v1, 0x3dcccccd    # 0.1f

    .line 1038
    .line 1039
    .line 1040
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v1

    .line 1044
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 1045
    .line 1046
    .line 1047
    move-result-wide v18

    .line 1048
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v12

    .line 1052
    invoke-static {v1, v12}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v1

    .line 1056
    aput-object v1, v3, v8

    .line 1057
    .line 1058
    const v1, 0x3dcccccd    # 0.1f

    .line 1059
    .line 1060
    .line 1061
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    sget-object v12, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 1066
    .line 1067
    const/4 v0, 0x6

    .line 1068
    invoke-virtual {v12, v9, v0}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v16

    .line 1072
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/ColorScheme;->getPrimary-0d7_KjU()J

    .line 1073
    .line 1074
    .line 1075
    move-result-wide v18

    .line 1076
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v8

    .line 1080
    invoke-static {v1, v8}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    const/4 v8, 0x2

    .line 1085
    aput-object v1, v3, v8

    .line 1086
    .line 1087
    const v1, 0x3f666666    # 0.9f

    .line 1088
    .line 1089
    .line 1090
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    invoke-virtual {v12, v9, v0}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v8

    .line 1098
    invoke-virtual {v8}, Landroidx/compose/material3/ColorScheme;->getPrimary-0d7_KjU()J

    .line 1099
    .line 1100
    .line 1101
    move-result-wide v18

    .line 1102
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v8

    .line 1106
    invoke-static {v1, v8}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v1

    .line 1110
    aput-object v1, v3, v17

    .line 1111
    .line 1112
    const v1, 0x3f666666    # 0.9f

    .line 1113
    .line 1114
    .line 1115
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v1

    .line 1119
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 1120
    .line 1121
    .line 1122
    move-result-wide v17

    .line 1123
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v8

    .line 1127
    invoke-static {v1, v8}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v1

    .line 1131
    const/4 v8, 0x4

    .line 1132
    aput-object v1, v3, v8

    .line 1133
    .line 1134
    const/high16 v1, 0x3f800000    # 1.0f

    .line 1135
    .line 1136
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 1141
    .line 1142
    .line 1143
    move-result-wide v17

    .line 1144
    invoke-static/range {v17 .. v18}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v4

    .line 1148
    invoke-static {v1, v4}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v1

    .line 1152
    const/4 v4, 0x5

    .line 1153
    aput-object v1, v3, v4

    .line 1154
    .line 1155
    const/16 v25, 0x0

    .line 1156
    .line 1157
    const/16 v26, 0x0

    .line 1158
    .line 1159
    const/16 v27, 0x0

    .line 1160
    .line 1161
    const/16 v28, 0xe

    .line 1162
    .line 1163
    const/16 v29, 0x0

    .line 1164
    .line 1165
    move-object/from16 v24, v3

    .line 1166
    .line 1167
    invoke-static/range {v23 .. v29}, Landroidx/compose/ui/graphics/Brush$Companion;->verticalGradient-8A-3gB4$default(Landroidx/compose/ui/graphics/Brush$Companion;[Lkotlin/u0;FFIILjava/lang/Object;)Landroidx/compose/ui/graphics/Brush;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    move-object v8, v14

    .line 1172
    move-object v14, v1

    .line 1173
    const/4 v3, 0x1

    .line 1174
    const/4 v4, 0x0

    .line 1175
    const/4 v1, 0x1

    .line 1176
    move/from16 v3, p8

    .line 1177
    .line 1178
    move-object v4, v8

    .line 1179
    move v8, v1

    .line 1180
    const/4 v1, 0x0

    .line 1181
    move-object v8, v9

    .line 1182
    move v9, v1

    .line 1183
    move v10, v1

    .line 1184
    const/4 v1, 0x0

    .line 1185
    move-object/from16 v114, v11

    .line 1186
    .line 1187
    move-object v11, v1

    .line 1188
    move-object v0, v12

    .line 1189
    move-object v12, v1

    .line 1190
    new-instance v1, Landroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2;

    .line 1191
    .line 1192
    move-object/from16 v9, v113

    .line 1193
    .line 1194
    invoke-direct {v1, v13, v4, v9}, Landroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material3/TextFieldColors;)V

    .line 1195
    .line 1196
    .line 1197
    const v9, 0x7f2b783c

    .line 1198
    .line 1199
    .line 1200
    const/4 v10, 0x1

    .line 1201
    invoke-static {v8, v9, v10, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v1

    .line 1205
    move v9, v15

    .line 1206
    move-object v15, v1

    .line 1207
    shr-int/lit8 v1, v3, 0x3

    .line 1208
    .line 1209
    and-int/lit8 v16, v1, 0xe

    .line 1210
    .line 1211
    const v17, 0x6000c00

    .line 1212
    .line 1213
    .line 1214
    or-int v16, v16, v17

    .line 1215
    .line 1216
    and-int/lit8 v1, v1, 0x70

    .line 1217
    .line 1218
    or-int v1, v16, v1

    .line 1219
    .line 1220
    shl-int/lit8 v16, v3, 0x3

    .line 1221
    .line 1222
    const/high16 v17, 0x380000

    .line 1223
    .line 1224
    and-int v17, v16, v17

    .line 1225
    .line 1226
    or-int v1, v1, v17

    .line 1227
    .line 1228
    const/high16 v17, 0x1c00000

    .line 1229
    .line 1230
    and-int v16, v16, v17

    .line 1231
    .line 1232
    or-int v17, v1, v16

    .line 1233
    .line 1234
    const v18, 0x30c00

    .line 1235
    .line 1236
    .line 1237
    const/16 v19, 0x1e10

    .line 1238
    .line 1239
    move-object v1, v0

    .line 1240
    move-object/from16 v0, p1

    .line 1241
    .line 1242
    move-object/from16 v115, v1

    .line 1243
    .line 1244
    move-object/from16 v1, p2

    .line 1245
    .line 1246
    move-object/from16 v116, v6

    .line 1247
    .line 1248
    move-object/from16 v6, v110

    .line 1249
    .line 1250
    move-object/from16 v7, v111

    .line 1251
    .line 1252
    move-object v13, v4

    .line 1253
    move-object/from16 v16, v8

    .line 1254
    .line 1255
    move/from16 v117, v3

    .line 1256
    .line 1257
    move-object/from16 p5, v8

    .line 1258
    .line 1259
    const/4 v3, 0x1

    .line 1260
    const/4 v4, 0x0

    .line 1261
    const/4 v8, 0x1

    .line 1262
    const/4 v9, 0x0

    .line 1263
    const/4 v10, 0x0

    .line 1264
    invoke-static/range {v0 .. v19}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lv3/l;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lv3/q;Landroidx/compose/runtime/Composer;III)V

    .line 1265
    .line 1266
    .line 1267
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1268
    .line 1269
    .line 1270
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1271
    .line 1272
    .line 1273
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1274
    .line 1275
    .line 1276
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1277
    .line 1278
    .line 1279
    const/4 v0, 0x0

    .line 1280
    sget v1, Landroidx/compose/material3/TimePickerKt;->SupportLabelTop:F

    .line 1281
    .line 1282
    move-object/from16 v2, v116

    .line 1283
    .line 1284
    const/4 v14, 0x0

    .line 1285
    const/4 v15, 0x1

    .line 1286
    invoke-static {v2, v0, v1, v15, v14}, Landroidx/compose/foundation/layout/OffsetKt;->offset-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v0

    .line 1290
    sget-object v1, Landroidx/compose/material3/TimePickerKt$TimePickerTextField$1$2;->INSTANCE:Landroidx/compose/material3/TimePickerKt$TimePickerTextField$1$2;

    .line 1291
    .line 1292
    invoke-static {v0, v1}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->clearAndSetSemantics(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v2

    .line 1296
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/material3/Selection$Companion;->getHour-JiIwxys()I

    .line 1297
    .line 1298
    .line 1299
    move-result v0

    .line 1300
    move/from16 v13, p4

    .line 1301
    .line 1302
    invoke-static {v13, v0}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 1303
    .line 1304
    .line 1305
    move-result v0

    .line 1306
    if-eqz v0, :cond_2c

    .line 1307
    .line 1308
    sget-object v0, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 1309
    .line 1310
    sget v0, Landroidx/compose/material3/R$string;->m3c_time_picker_hour:I

    .line 1311
    .line 1312
    invoke-static {v0}, Landroidx/compose/material3/Strings;->constructor-impl(I)I

    .line 1313
    .line 1314
    .line 1315
    move-result v0

    .line 1316
    goto :goto_18

    .line 1317
    :cond_2c
    sget-object v0, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 1318
    .line 1319
    sget v0, Landroidx/compose/material3/R$string;->m3c_time_picker_minute:I

    .line 1320
    .line 1321
    invoke-static {v0}, Landroidx/compose/material3/Strings;->constructor-impl(I)I

    .line 1322
    .line 1323
    .line 1324
    move-result v0

    .line 1325
    :goto_18
    move-object/from16 v12, p5

    .line 1326
    .line 1327
    const/4 v10, 0x0

    .line 1328
    invoke-static {v0, v12, v10}, Landroidx/compose/material3/Strings_androidKt;->getString-NWtq2-8(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v1

    .line 1332
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/tokens/TimeInputTokens;->getTimeFieldSupportingTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    const/4 v5, 0x6

    .line 1337
    invoke-static {v0, v12, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 1338
    .line 1339
    .line 1340
    move-result-wide v3

    .line 1341
    move-object/from16 v0, v115

    .line 1342
    .line 1343
    invoke-virtual {v0, v12, v5}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v0

    .line 1347
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/tokens/TimeInputTokens;->getTimeFieldSupportingTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v5

    .line 1351
    invoke-static {v0, v5}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v21

    .line 1355
    const-wide/16 v5, 0x0

    .line 1356
    .line 1357
    const/4 v7, 0x0

    .line 1358
    const/4 v8, 0x0

    .line 1359
    const/4 v9, 0x0

    .line 1360
    const-wide/16 v16, 0x0

    .line 1361
    .line 1362
    move v0, v10

    .line 1363
    move-wide/from16 v10, v16

    .line 1364
    .line 1365
    const/16 v16, 0x0

    .line 1366
    .line 1367
    move-object/from16 p5, v12

    .line 1368
    .line 1369
    move-object/from16 v12, v16

    .line 1370
    .line 1371
    move v0, v13

    .line 1372
    move-object/from16 v13, v16

    .line 1373
    .line 1374
    const-wide/16 v16, 0x0

    .line 1375
    .line 1376
    move/from16 v26, v15

    .line 1377
    .line 1378
    move-wide/from16 v14, v16

    .line 1379
    .line 1380
    const/16 v16, 0x0

    .line 1381
    .line 1382
    const/16 v17, 0x0

    .line 1383
    .line 1384
    const/16 v18, 0x0

    .line 1385
    .line 1386
    const/16 v19, 0x0

    .line 1387
    .line 1388
    const/16 v20, 0x0

    .line 1389
    .line 1390
    const/16 v23, 0x0

    .line 1391
    .line 1392
    const/16 v24, 0x0

    .line 1393
    .line 1394
    const v25, 0xfff8

    .line 1395
    .line 1396
    .line 1397
    move-object/from16 v22, p5

    .line 1398
    .line 1399
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILv3/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1400
    .line 1401
    .line 1402
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1403
    .line 1404
    .line 1405
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1406
    .line 1407
    .line 1408
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1409
    .line 1410
    .line 1411
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/material3/TimePickerState;->getSelection-JiIwxys$material3_release()I

    .line 1415
    .line 1416
    .line 1417
    move-result v1

    .line 1418
    invoke-static {v1}, Landroidx/compose/material3/Selection;->box-impl(I)Landroidx/compose/material3/Selection;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v1

    .line 1422
    const v2, -0x1f55bb4e

    .line 1423
    .line 1424
    .line 1425
    move-object/from16 v3, p5

    .line 1426
    .line 1427
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 1428
    .line 1429
    .line 1430
    move/from16 v2, v117

    .line 1431
    .line 1432
    and-int/lit16 v4, v2, 0x1c00

    .line 1433
    .line 1434
    const/16 v5, 0x800

    .line 1435
    .line 1436
    if-ne v4, v5, :cond_2d

    .line 1437
    .line 1438
    move/from16 v4, v26

    .line 1439
    .line 1440
    goto :goto_19

    .line 1441
    :cond_2d
    const/4 v4, 0x0

    .line 1442
    :goto_19
    const v5, 0xe000

    .line 1443
    .line 1444
    .line 1445
    and-int/2addr v2, v5

    .line 1446
    const/16 v5, 0x4000

    .line 1447
    .line 1448
    if-ne v2, v5, :cond_2e

    .line 1449
    .line 1450
    goto :goto_1a

    .line 1451
    :cond_2e
    const/16 v26, 0x0

    .line 1452
    .line 1453
    :goto_1a
    or-int v2, v4, v26

    .line 1454
    .line 1455
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v4

    .line 1459
    if-nez v2, :cond_30

    .line 1460
    .line 1461
    invoke-virtual/range {v112 .. v112}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v2

    .line 1465
    if-ne v4, v2, :cond_2f

    .line 1466
    .line 1467
    goto :goto_1b

    .line 1468
    :cond_2f
    move-object/from16 v5, p3

    .line 1469
    .line 1470
    goto :goto_1c

    .line 1471
    :cond_30
    :goto_1b
    new-instance v4, Landroidx/compose/material3/TimePickerKt$TimePickerTextField$2$1;

    .line 1472
    .line 1473
    move-object/from16 v5, p3

    .line 1474
    .line 1475
    move-object/from16 v2, v114

    .line 1476
    .line 1477
    const/4 v6, 0x0

    .line 1478
    invoke-direct {v4, v5, v0, v2, v6}, Landroidx/compose/material3/TimePickerKt$TimePickerTextField$2$1;-><init>(Landroidx/compose/material3/TimePickerState;ILandroidx/compose/ui/focus/FocusRequester;Lkotlin/coroutines/d;)V

    .line 1479
    .line 1480
    .line 1481
    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1482
    .line 1483
    .line 1484
    :goto_1c
    check-cast v4, Lv3/p;

    .line 1485
    .line 1486
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 1487
    .line 1488
    .line 1489
    const/4 v2, 0x0

    .line 1490
    invoke-static {v1, v4, v3, v2}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 1491
    .line 1492
    .line 1493
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1494
    .line 1495
    .line 1496
    move-result v1

    .line 1497
    if-eqz v1, :cond_31

    .line 1498
    .line 1499
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1500
    .line 1501
    .line 1502
    :cond_31
    move-object/from16 v6, v110

    .line 1503
    .line 1504
    move-object/from16 v7, v111

    .line 1505
    .line 1506
    :goto_1d
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v11

    .line 1510
    if-eqz v11, :cond_32

    .line 1511
    .line 1512
    new-instance v12, Landroidx/compose/material3/TimePickerKt$TimePickerTextField$3;

    .line 1513
    .line 1514
    move-object v0, v12

    .line 1515
    move-object/from16 v1, p0

    .line 1516
    .line 1517
    move-object/from16 v2, p1

    .line 1518
    .line 1519
    move-object/from16 v3, p2

    .line 1520
    .line 1521
    move-object/from16 v4, p3

    .line 1522
    .line 1523
    move/from16 v5, p4

    .line 1524
    .line 1525
    move-object/from16 v8, p7

    .line 1526
    .line 1527
    move/from16 v9, p9

    .line 1528
    .line 1529
    move/from16 v10, p10

    .line 1530
    .line 1531
    invoke-direct/range {v0 .. v10}, Landroidx/compose/material3/TimePickerKt$TimePickerTextField$3;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;II)V

    .line 1532
    .line 1533
    .line 1534
    invoke-interface {v11, v12}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 1535
    .line 1536
    .line 1537
    :cond_32
    return-void
.end method

.method private static final TimePicker_mT9BvqQ$lambda$0(Landroidx/compose/runtime/State;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final TimeSelector-uXwN82Y(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 31
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    move/from16 v9, p3

    .line 6
    .line 7
    move-object/from16 v10, p4

    .line 8
    .line 9
    move/from16 v11, p6

    .line 10
    .line 11
    const v0, 0x141f367

    .line 12
    .line 13
    .line 14
    move-object/from16 v2, p5

    .line 15
    .line 16
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v14

    .line 20
    and-int/lit8 v2, v11, 0x6

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v2, 0x2

    .line 33
    :goto_0
    or-int/2addr v2, v11

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v2, v11

    .line 36
    :goto_1
    and-int/lit8 v3, v11, 0x30

    .line 37
    .line 38
    move/from16 v12, p1

    .line 39
    .line 40
    if-nez v3, :cond_3

    .line 41
    .line 42
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    const/16 v3, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v3, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v2, v3

    .line 54
    :cond_3
    and-int/lit16 v3, v11, 0x180

    .line 55
    .line 56
    const/16 v4, 0x100

    .line 57
    .line 58
    if-nez v3, :cond_5

    .line 59
    .line 60
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    move v3, v4

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v3, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v2, v3

    .line 71
    :cond_5
    and-int/lit16 v3, v11, 0xc00

    .line 72
    .line 73
    const/16 v5, 0x800

    .line 74
    .line 75
    if-nez v3, :cond_7

    .line 76
    .line 77
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_6

    .line 82
    .line 83
    move v3, v5

    .line 84
    goto :goto_4

    .line 85
    :cond_6
    const/16 v3, 0x400

    .line 86
    .line 87
    :goto_4
    or-int/2addr v2, v3

    .line 88
    :cond_7
    and-int/lit16 v3, v11, 0x6000

    .line 89
    .line 90
    if-nez v3, :cond_9

    .line 91
    .line 92
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    or-int/2addr v2, v3

    .line 104
    :cond_9
    and-int/lit16 v3, v2, 0x2493

    .line 105
    .line 106
    const/16 v6, 0x2492

    .line 107
    .line 108
    if-ne v3, v6, :cond_b

    .line 109
    .line 110
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_a

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_a
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 118
    .line 119
    .line 120
    move-object v0, v14

    .line 121
    goto/16 :goto_a

    .line 122
    .line 123
    :cond_b
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_c

    .line 128
    .line 129
    const/4 v3, -0x1

    .line 130
    const-string v6, "androidx.compose.material3.TimeSelector (TimePicker.kt:1194)"

    .line 131
    .line 132
    invoke-static {v0, v2, v3, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_c
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/material3/TimePickerState;->getSelection-JiIwxys$material3_release()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-static {v0, v9}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    sget-object v3, Landroidx/compose/material3/Selection;->Companion:Landroidx/compose/material3/Selection$Companion;

    .line 144
    .line 145
    invoke-virtual {v3}, Landroidx/compose/material3/Selection$Companion;->getHour-JiIwxys()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-static {v9, v3}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_d

    .line 154
    .line 155
    sget-object v3, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 156
    .line 157
    sget v3, Landroidx/compose/material3/R$string;->m3c_time_picker_hour_selection:I

    .line 158
    .line 159
    invoke-static {v3}, Landroidx/compose/material3/Strings;->constructor-impl(I)I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    goto :goto_7

    .line 164
    :cond_d
    sget-object v3, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 165
    .line 166
    sget v3, Landroidx/compose/material3/R$string;->m3c_time_picker_minute_selection:I

    .line 167
    .line 168
    invoke-static {v3}, Landroidx/compose/material3/Strings;->constructor-impl(I)I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    :goto_7
    const/4 v6, 0x0

    .line 173
    invoke-static {v3, v14, v6}, Landroidx/compose/material3/Strings_androidKt;->getString-NWtq2-8(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v10, v0}, Landroidx/compose/material3/TimePickerColors;->timeSelectorContainerColor-vNxB06k$material3_release(Z)J

    .line 178
    .line 179
    .line 180
    move-result-wide v17

    .line 181
    invoke-virtual {v10, v0}, Landroidx/compose/material3/TimePickerColors;->timeSelectorContentColor-vNxB06k$material3_release(Z)J

    .line 182
    .line 183
    .line 184
    move-result-wide v25

    .line 185
    const v7, 0x2e20b340

    .line 186
    .line 187
    .line 188
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 189
    .line 190
    .line 191
    const v7, -0x1d58f75c

    .line 192
    .line 193
    .line 194
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 202
    .line 203
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    if-ne v7, v15, :cond_e

    .line 208
    .line 209
    sget-object v7, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    .line 210
    .line 211
    invoke-static {v7, v14}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/g;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/s0;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    new-instance v15, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 216
    .line 217
    invoke-direct {v15, v7}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/s0;)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    move-object v7, v15

    .line 224
    :cond_e
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 225
    .line 226
    .line 227
    check-cast v7, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 228
    .line 229
    invoke-virtual {v7}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/s0;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 234
    .line 235
    .line 236
    const v15, -0x25c0807d

    .line 237
    .line 238
    .line 239
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v15

    .line 246
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    if-nez v15, :cond_f

    .line 251
    .line 252
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v15

    .line 256
    if-ne v6, v15, :cond_10

    .line 257
    .line 258
    :cond_f
    new-instance v6, Landroidx/compose/material3/TimePickerKt$TimeSelector$1$1;

    .line 259
    .line 260
    invoke-direct {v6, v3}, Landroidx/compose/material3/TimePickerKt$TimeSelector$1$1;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_10
    check-cast v6, Lv3/l;

    .line 267
    .line 268
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 269
    .line 270
    .line 271
    const/4 v3, 0x1

    .line 272
    invoke-static {v1, v3, v6}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLv3/l;)Landroidx/compose/ui/Modifier;

    .line 273
    .line 274
    .line 275
    move-result-object v16

    .line 276
    sget-object v6, Landroidx/compose/material3/tokens/TimePickerTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimePickerTokens;

    .line 277
    .line 278
    invoke-virtual {v6}, Landroidx/compose/material3/tokens/TimePickerTokens;->getTimeSelectorContainerShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    const/4 v15, 0x6

    .line 283
    invoke-static {v6, v14, v15}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 284
    .line 285
    .line 286
    move-result-object v30

    .line 287
    const v6, -0x25c07fed

    .line 288
    .line 289
    .line 290
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 291
    .line 292
    .line 293
    and-int/lit16 v6, v2, 0x1c00

    .line 294
    .line 295
    if-ne v6, v5, :cond_11

    .line 296
    .line 297
    move v5, v3

    .line 298
    goto :goto_8

    .line 299
    :cond_11
    const/4 v5, 0x0

    .line 300
    :goto_8
    and-int/lit16 v2, v2, 0x380

    .line 301
    .line 302
    if-ne v2, v4, :cond_12

    .line 303
    .line 304
    move v6, v3

    .line 305
    goto :goto_9

    .line 306
    :cond_12
    const/4 v6, 0x0

    .line 307
    :goto_9
    or-int v2, v5, v6

    .line 308
    .line 309
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    or-int/2addr v2, v4

    .line 314
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    if-nez v2, :cond_13

    .line 319
    .line 320
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    if-ne v4, v2, :cond_14

    .line 325
    .line 326
    :cond_13
    new-instance v4, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;

    .line 327
    .line 328
    invoke-direct {v4, v9, v8, v7}, Landroidx/compose/material3/TimePickerKt$TimeSelector$2$1;-><init>(ILandroidx/compose/material3/TimePickerState;Lkotlinx/coroutines/s0;)V

    .line 329
    .line 330
    .line 331
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_14
    move-object v13, v4

    .line 335
    check-cast v13, Lv3/a;

    .line 336
    .line 337
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 338
    .line 339
    .line 340
    const/4 v15, 0x0

    .line 341
    const-wide/16 v19, 0x0

    .line 342
    .line 343
    const/16 v21, 0x0

    .line 344
    .line 345
    const/16 v22, 0x0

    .line 346
    .line 347
    const/16 v23, 0x0

    .line 348
    .line 349
    const/16 v24, 0x0

    .line 350
    .line 351
    new-instance v6, Landroidx/compose/material3/TimePickerKt$TimeSelector$3;

    .line 352
    .line 353
    move-object v2, v6

    .line 354
    move v7, v3

    .line 355
    move/from16 v3, p3

    .line 356
    .line 357
    move-object/from16 v4, p2

    .line 358
    .line 359
    move/from16 v5, p1

    .line 360
    .line 361
    move-object v15, v6

    .line 362
    move v1, v7

    .line 363
    move-wide/from16 v6, v25

    .line 364
    .line 365
    invoke-direct/range {v2 .. v7}, Landroidx/compose/material3/TimePickerKt$TimeSelector$3;-><init>(ILandroidx/compose/material3/TimePickerState;IJ)V

    .line 366
    .line 367
    .line 368
    const v2, -0x4fcb146f

    .line 369
    .line 370
    .line 371
    invoke-static {v14, v2, v1, v15}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 372
    .line 373
    .line 374
    move-result-object v25

    .line 375
    const/16 v27, 0x0

    .line 376
    .line 377
    const/16 v28, 0x30

    .line 378
    .line 379
    const/16 v29, 0x7c8

    .line 380
    .line 381
    move v12, v0

    .line 382
    move-object v0, v14

    .line 383
    move-object/from16 v14, v16

    .line 384
    .line 385
    move-object/from16 v16, v30

    .line 386
    .line 387
    move-object/from16 v26, v0

    .line 388
    .line 389
    const/4 v15, 0x0

    .line 390
    invoke-static/range {v12 .. v29}, Landroidx/compose/material3/SurfaceKt;->Surface-d85dljk(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;III)V

    .line 391
    .line 392
    .line 393
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-eqz v1, :cond_15

    .line 398
    .line 399
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 400
    .line 401
    .line 402
    :cond_15
    :goto_a
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 403
    .line 404
    .line 405
    move-result-object v7

    .line 406
    if-eqz v7, :cond_16

    .line 407
    .line 408
    new-instance v12, Landroidx/compose/material3/TimePickerKt$TimeSelector$4;

    .line 409
    .line 410
    move-object v0, v12

    .line 411
    move-object/from16 v1, p0

    .line 412
    .line 413
    move/from16 v2, p1

    .line 414
    .line 415
    move-object/from16 v3, p2

    .line 416
    .line 417
    move/from16 v4, p3

    .line 418
    .line 419
    move-object/from16 v5, p4

    .line 420
    .line 421
    move/from16 v6, p6

    .line 422
    .line 423
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/TimePickerKt$TimeSelector$4;-><init>(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;I)V

    .line 424
    .line 425
    .line 426
    invoke-interface {v7, v12}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 427
    .line 428
    .line 429
    :cond_16
    return-void
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

.method private static final ToggleItem(ZLandroidx/compose/ui/graphics/Shape;Lv3/a;Landroidx/compose/material3/TimePickerColors;Lv3/q;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/ui/graphics/Shape;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/material3/TimePickerColors;",
            "Lv3/q<",
            "-",
            "Landroidx/compose/foundation/layout/RowScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move/from16 v6, p6

    .line 6
    .line 7
    const v0, -0x737a8062

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p5

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    and-int/lit8 v3, v6, 0x6

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    :goto_0
    or-int/2addr v3, v6

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v3, v6

    .line 32
    :goto_1
    and-int/lit8 v7, v6, 0x30

    .line 33
    .line 34
    move-object/from16 v14, p1

    .line 35
    .line 36
    if-nez v7, :cond_3

    .line 37
    .line 38
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

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
    or-int/2addr v3, v7

    .line 50
    :cond_3
    and-int/lit16 v7, v6, 0x180

    .line 51
    .line 52
    move-object/from16 v15, p2

    .line 53
    .line 54
    if-nez v7, :cond_5

    .line 55
    .line 56
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_4

    .line 61
    .line 62
    const/16 v7, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v7, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v3, v7

    .line 68
    :cond_5
    and-int/lit16 v7, v6, 0xc00

    .line 69
    .line 70
    if-nez v7, :cond_7

    .line 71
    .line 72
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_6

    .line 77
    .line 78
    const/16 v7, 0x800

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    const/16 v7, 0x400

    .line 82
    .line 83
    :goto_4
    or-int/2addr v3, v7

    .line 84
    :cond_7
    and-int/lit16 v7, v6, 0x6000

    .line 85
    .line 86
    move-object/from16 v12, p4

    .line 87
    .line 88
    if-nez v7, :cond_9

    .line 89
    .line 90
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_8

    .line 95
    .line 96
    const/16 v7, 0x4000

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    const/16 v7, 0x2000

    .line 100
    .line 101
    :goto_5
    or-int/2addr v3, v7

    .line 102
    :cond_9
    and-int/lit16 v7, v3, 0x2493

    .line 103
    .line 104
    const/16 v8, 0x2492

    .line 105
    .line 106
    if-ne v7, v8, :cond_b

    .line 107
    .line 108
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-nez v7, :cond_a

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_9

    .line 119
    .line 120
    :cond_b
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-eqz v7, :cond_c

    .line 125
    .line 126
    const/4 v7, -0x1

    .line 127
    const-string v8, "androidx.compose.material3.ToggleItem (TimePicker.kt:1144)"

    .line 128
    .line 129
    invoke-static {v0, v3, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_c
    invoke-virtual {v4, v1}, Landroidx/compose/material3/TimePickerColors;->periodSelectorContentColor-vNxB06k$material3_release(Z)J

    .line 133
    .line 134
    .line 135
    move-result-wide v10

    .line 136
    invoke-virtual {v4, v1}, Landroidx/compose/material3/TimePickerColors;->periodSelectorContainerColor-vNxB06k$material3_release(Z)J

    .line 137
    .line 138
    .line 139
    move-result-wide v8

    .line 140
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    if-eqz v1, :cond_d

    .line 144
    .line 145
    move v13, v7

    .line 146
    goto :goto_7

    .line 147
    :cond_d
    const/high16 v13, 0x3f800000    # 1.0f

    .line 148
    .line 149
    :goto_7
    invoke-static {v0, v13}, Landroidx/compose/ui/ZIndexModifierKt;->zIndex(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const/4 v13, 0x1

    .line 154
    const/4 v5, 0x0

    .line 155
    invoke-static {v0, v7, v13, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const v7, 0x1f621930

    .line 160
    .line 161
    .line 162
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 163
    .line 164
    .line 165
    and-int/lit8 v7, v3, 0xe

    .line 166
    .line 167
    const/4 v5, 0x4

    .line 168
    if-ne v7, v5, :cond_e

    .line 169
    .line 170
    move v5, v13

    .line 171
    goto :goto_8

    .line 172
    :cond_e
    const/4 v5, 0x0

    .line 173
    :goto_8
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    if-nez v5, :cond_f

    .line 178
    .line 179
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 180
    .line 181
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    if-ne v7, v5, :cond_10

    .line 186
    .line 187
    :cond_f
    new-instance v7, Landroidx/compose/material3/TimePickerKt$ToggleItem$1$1;

    .line 188
    .line 189
    invoke-direct {v7, v1}, Landroidx/compose/material3/TimePickerKt$ToggleItem$1$1;-><init>(Z)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_10
    check-cast v7, Lv3/l;

    .line 196
    .line 197
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 198
    .line 199
    .line 200
    const/4 v1, 0x0

    .line 201
    const/4 v5, 0x0

    .line 202
    invoke-static {v0, v1, v7, v13, v5}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    int-to-float v1, v1

    .line 207
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    invoke-static {v1}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    sget-object v7, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    .line 216
    .line 217
    const-wide/16 v16, 0x0

    .line 218
    .line 219
    const-wide/16 v18, 0x0

    .line 220
    .line 221
    const/16 v5, 0x6000

    .line 222
    .line 223
    const/16 v20, 0xc

    .line 224
    .line 225
    move-wide/from16 v12, v16

    .line 226
    .line 227
    move-wide/from16 v14, v18

    .line 228
    .line 229
    move-object/from16 v16, v2

    .line 230
    .line 231
    move/from16 v17, v5

    .line 232
    .line 233
    move/from16 v18, v20

    .line 234
    .line 235
    invoke-virtual/range {v7 .. v18}, Landroidx/compose/material3/ButtonDefaults;->textButtonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    const/4 v9, 0x0

    .line 240
    const/4 v12, 0x0

    .line 241
    const/4 v13, 0x0

    .line 242
    const/4 v15, 0x0

    .line 243
    shr-int/lit8 v5, v3, 0x6

    .line 244
    .line 245
    and-int/lit8 v5, v5, 0xe

    .line 246
    .line 247
    const/high16 v7, 0xc00000

    .line 248
    .line 249
    or-int/2addr v5, v7

    .line 250
    shl-int/lit8 v7, v3, 0x6

    .line 251
    .line 252
    and-int/lit16 v7, v7, 0x1c00

    .line 253
    .line 254
    or-int/2addr v5, v7

    .line 255
    shl-int/lit8 v3, v3, 0xf

    .line 256
    .line 257
    const/high16 v7, 0x70000000

    .line 258
    .line 259
    and-int/2addr v3, v7

    .line 260
    or-int v18, v5, v3

    .line 261
    .line 262
    const/16 v19, 0x164

    .line 263
    .line 264
    move-object/from16 v7, p2

    .line 265
    .line 266
    move-object v8, v0

    .line 267
    move-object/from16 v10, p1

    .line 268
    .line 269
    move-object v14, v1

    .line 270
    move-object/from16 v16, p4

    .line 271
    .line 272
    move-object/from16 v17, v2

    .line 273
    .line 274
    invoke-static/range {v7 .. v19}, Landroidx/compose/material3/ButtonKt;->TextButton(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Landroidx/compose/runtime/Composer;II)V

    .line 275
    .line 276
    .line 277
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_11

    .line 282
    .line 283
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 284
    .line 285
    .line 286
    :cond_11
    :goto_9
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    if-eqz v7, :cond_12

    .line 291
    .line 292
    new-instance v8, Landroidx/compose/material3/TimePickerKt$ToggleItem$2;

    .line 293
    .line 294
    move-object v0, v8

    .line 295
    move/from16 v1, p0

    .line 296
    .line 297
    move-object/from16 v2, p1

    .line 298
    .line 299
    move-object/from16 v3, p2

    .line 300
    .line 301
    move-object/from16 v4, p3

    .line 302
    .line 303
    move-object/from16 v5, p4

    .line 304
    .line 305
    move/from16 v6, p6

    .line 306
    .line 307
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/TimePickerKt$ToggleItem$2;-><init>(ZLandroidx/compose/ui/graphics/Shape;Lv3/a;Landroidx/compose/material3/TimePickerColors;Lv3/q;I)V

    .line 308
    .line 309
    .line 310
    invoke-interface {v7, v8}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 311
    .line 312
    .line 313
    :cond_12
    return-void
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

.method private static final VerticalClockDisplay(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x7a77dc3b

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    and-int/lit8 v5, v2, 0x6

    .line 17
    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v5, 0x2

    .line 29
    :goto_0
    or-int/2addr v5, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v5, v2

    .line 32
    :goto_1
    and-int/lit8 v6, v2, 0x30

    .line 33
    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    const/16 v6, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v6, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v5, v6

    .line 48
    :cond_3
    and-int/lit8 v6, v5, 0x13

    .line 49
    .line 50
    const/16 v7, 0x12

    .line 51
    .line 52
    if-ne v6, v7, :cond_5

    .line 53
    .line 54
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_6

    .line 71
    .line 72
    const/4 v6, -0x1

    .line 73
    const-string v7, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:940)"

    .line 74
    .line 75
    invoke-static {v3, v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_6
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const v6, 0x2952b718

    .line 85
    .line 86
    .line 87
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 88
    .line 89
    .line 90
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 91
    .line 92
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 93
    .line 94
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    const/4 v15, 0x6

    .line 99
    invoke-static {v3, v7, v4, v15}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const v13, -0x4ee9b9da

    .line 104
    .line 105
    .line 106
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 107
    .line 108
    .line 109
    const/4 v12, 0x0

    .line 110
    invoke-static {v4, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 119
    .line 120
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 133
    .line 134
    if-nez v11, :cond_7

    .line 135
    .line 136
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 137
    .line 138
    .line 139
    :cond_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 140
    .line 141
    .line 142
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    if-eqz v11, :cond_8

    .line 147
    .line 148
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_8
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 153
    .line 154
    .line 155
    :goto_4
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    invoke-static {v9, v3, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-static {v9, v8, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    if-nez v8, :cond_9

    .line 182
    .line 183
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    invoke-static {v8, v11}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-nez v8, :cond_a

    .line 196
    .line 197
    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-interface {v9, v7, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 209
    .line 210
    .line 211
    :cond_a
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-interface {v10, v3, v4, v7}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    const v3, 0x7ab4aae9

    .line 227
    .line 228
    .line 229
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 230
    .line 231
    .line 232
    sget-object v7, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 233
    .line 234
    and-int/lit8 v7, v5, 0xe

    .line 235
    .line 236
    and-int/lit8 v8, v5, 0x70

    .line 237
    .line 238
    or-int/2addr v7, v8

    .line 239
    invoke-static {v0, v1, v4, v7}, Landroidx/compose/material3/TimePickerKt;->ClockDisplayNumbers(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 240
    .line 241
    .line 242
    const v7, 0x38cc50e5

    .line 243
    .line 244
    .line 245
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material3/TimePickerState;->is24hour()Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-nez v7, :cond_f

    .line 253
    .line 254
    sget v8, Landroidx/compose/material3/TimePickerKt;->PeriodToggleMargin:F

    .line 255
    .line 256
    const/4 v9, 0x0

    .line 257
    const/4 v10, 0x0

    .line 258
    const/4 v11, 0x0

    .line 259
    const/16 v17, 0xe

    .line 260
    .line 261
    const/16 v18, 0x0

    .line 262
    .line 263
    move-object v7, v6

    .line 264
    move v15, v12

    .line 265
    move/from16 v12, v17

    .line 266
    .line 267
    move v3, v13

    .line 268
    move-object/from16 v13, v18

    .line 269
    .line 270
    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    const v8, 0x2bb5b5d7

    .line 275
    .line 276
    .line 277
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-static {v8, v15, v4, v15}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 289
    .line 290
    .line 291
    invoke-static {v4, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 300
    .line 301
    .line 302
    move-result-object v10

    .line 303
    invoke-static {v7}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 312
    .line 313
    if-nez v11, :cond_b

    .line 314
    .line 315
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 316
    .line 317
    .line 318
    :cond_b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 319
    .line 320
    .line 321
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    if-eqz v11, :cond_c

    .line 326
    .line 327
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 328
    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 332
    .line 333
    .line 334
    :goto_5
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 335
    .line 336
    .line 337
    move-result-object v10

    .line 338
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    invoke-static {v10, v8, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    invoke-static {v10, v9, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    if-nez v9, :cond_d

    .line 361
    .line 362
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v9

    .line 366
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object v11

    .line 370
    invoke-static {v9, v11}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v9

    .line 374
    if-nez v9, :cond_e

    .line 375
    .line 376
    :cond_d
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v9

    .line 380
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    invoke-interface {v10, v3, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 388
    .line 389
    .line 390
    :cond_e
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-static {v3}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    invoke-interface {v7, v3, v4, v8}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    const v3, 0x7ab4aae9

    .line 406
    .line 407
    .line 408
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 409
    .line 410
    .line 411
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 412
    .line 413
    sget-object v3, Landroidx/compose/material3/tokens/TimePickerTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimePickerTokens;

    .line 414
    .line 415
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/TimePickerTokens;->getPeriodSelectorVerticalContainerWidth-D9Ej5fM()F

    .line 416
    .line 417
    .line 418
    move-result v7

    .line 419
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/TimePickerTokens;->getPeriodSelectorVerticalContainerHeight-D9Ej5fM()F

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    invoke-static {v6, v7, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    shl-int/lit8 v5, v5, 0x3

    .line 428
    .line 429
    and-int/lit8 v6, v5, 0x70

    .line 430
    .line 431
    const/4 v7, 0x6

    .line 432
    or-int/2addr v6, v7

    .line 433
    and-int/lit16 v5, v5, 0x380

    .line 434
    .line 435
    or-int/2addr v5, v6

    .line 436
    invoke-static {v3, v0, v1, v4, v5}, Landroidx/compose/material3/TimePickerKt;->VerticalPeriodToggle(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 437
    .line 438
    .line 439
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 440
    .line 441
    .line 442
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 443
    .line 444
    .line 445
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 446
    .line 447
    .line 448
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 449
    .line 450
    .line 451
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 452
    .line 453
    .line 454
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 455
    .line 456
    .line 457
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 458
    .line 459
    .line 460
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 461
    .line 462
    .line 463
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 464
    .line 465
    .line 466
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    if-eqz v3, :cond_10

    .line 471
    .line 472
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 473
    .line 474
    .line 475
    :cond_10
    :goto_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    if-eqz v3, :cond_11

    .line 480
    .line 481
    new-instance v4, Landroidx/compose/material3/TimePickerKt$VerticalClockDisplay$2;

    .line 482
    .line 483
    invoke-direct {v4, v0, v1, v2}, Landroidx/compose/material3/TimePickerKt$VerticalClockDisplay$2;-><init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;I)V

    .line 484
    .line 485
    .line 486
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 487
    .line 488
    .line 489
    :cond_11
    return-void
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
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
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
.end method

.method private static final VerticalPeriodToggle(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    const v0, -0x712f30db

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    and-int/lit8 v1, p4, 0x6

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    :goto_0
    or-int/2addr v1, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v1, p4

    .line 24
    :goto_1
    and-int/lit8 v2, p4, 0x30

    .line 25
    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/16 v2, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v2, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v1, v2

    .line 40
    :cond_3
    and-int/lit16 v2, p4, 0x180

    .line 41
    .line 42
    if-nez v2, :cond_5

    .line 43
    .line 44
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    const/16 v2, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v2, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr v1, v2

    .line 56
    :cond_5
    and-int/lit16 v2, v1, 0x93

    .line 57
    .line 58
    const/16 v3, 0x92

    .line 59
    .line 60
    if-ne v2, v3, :cond_7

    .line 61
    .line 62
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_6

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 70
    .line 71
    .line 72
    goto :goto_5

    .line 73
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_8

    .line 78
    .line 79
    const/4 v2, -0x1

    .line 80
    const-string v3, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1047)"

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_8
    const v0, -0x7900ee37

    .line 86
    .line 87
    .line 88
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-ne v0, v2, :cond_9

    .line 102
    .line 103
    sget-object v0, Landroidx/compose/material3/TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1;->INSTANCE:Landroidx/compose/material3/TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1;

    .line 104
    .line 105
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_9
    move-object v4, v0

    .line 109
    check-cast v4, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 110
    .line 111
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 112
    .line 113
    .line 114
    sget-object v0, Landroidx/compose/material3/tokens/TimePickerTokens;->INSTANCE:Landroidx/compose/material3/tokens/TimePickerTokens;

    .line 115
    .line 116
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/TimePickerTokens;->getPeriodSelectorContainerShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const/4 v2, 0x6

    .line 121
    invoke-static {v0, p3, v2}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v2, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape"

    .line 126
    .line 127
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->n(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    check-cast v0, Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 131
    .line 132
    invoke-static {v0}, Landroidx/compose/material3/ShapesKt;->top(Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-static {v0}, Landroidx/compose/material3/ShapesKt;->bottom(Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    and-int/lit8 v0, v1, 0xe

    .line 141
    .line 142
    or-int/lit16 v0, v0, 0xc00

    .line 143
    .line 144
    and-int/lit8 v2, v1, 0x70

    .line 145
    .line 146
    or-int/2addr v0, v2

    .line 147
    and-int/lit16 v1, v1, 0x380

    .line 148
    .line 149
    or-int v8, v0, v1

    .line 150
    .line 151
    move-object v1, p0

    .line 152
    move-object v2, p1

    .line 153
    move-object v3, p2

    .line 154
    move-object v7, p3

    .line 155
    invoke-static/range {v1 .. v8}, Landroidx/compose/material3/TimePickerKt;->PeriodToggleImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V

    .line 156
    .line 157
    .line 158
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_a

    .line 163
    .line 164
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 165
    .line 166
    .line 167
    :cond_a
    :goto_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    if-eqz p3, :cond_b

    .line 172
    .line 173
    new-instance v0, Landroidx/compose/material3/TimePickerKt$VerticalPeriodToggle$1;

    .line 174
    .line 175
    invoke-direct {v0, p0, p1, p2, p4}, Landroidx/compose/material3/TimePickerKt$VerticalPeriodToggle$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;I)V

    .line 176
    .line 177
    .line 178
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 179
    .line 180
    .line 181
    :cond_b
    return-void
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

.method public static final VerticalTimePicker(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V
    .locals 16
    .param p0    # Landroidx/compose/material3/TimePickerState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/material3/TimePickerColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v4, p3

    .line 4
    .line 5
    move/from16 v5, p5

    .line 6
    .line 7
    const v0, 0x1284a66f

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p4

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    and-int/lit8 v3, p6, 0x1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    or-int/lit8 v3, v5, 0x6

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    and-int/lit8 v3, v5, 0x6

    .line 24
    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    :goto_0
    or-int/2addr v3, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v3, v5

    .line 39
    :goto_1
    and-int/lit8 v6, p6, 0x2

    .line 40
    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    or-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v7, v5, 0x30

    .line 47
    .line 48
    if-nez v7, :cond_5

    .line 49
    .line 50
    move-object/from16 v7, p1

    .line 51
    .line 52
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_4

    .line 57
    .line 58
    const/16 v8, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    const/16 v8, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v8

    .line 64
    goto :goto_4

    .line 65
    :cond_5
    :goto_3
    move-object/from16 v7, p1

    .line 66
    .line 67
    :goto_4
    and-int/lit16 v8, v5, 0x180

    .line 68
    .line 69
    if-nez v8, :cond_8

    .line 70
    .line 71
    and-int/lit8 v8, p6, 0x4

    .line 72
    .line 73
    if-nez v8, :cond_6

    .line 74
    .line 75
    move-object/from16 v8, p2

    .line 76
    .line 77
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_7

    .line 82
    .line 83
    const/16 v9, 0x100

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_6
    move-object/from16 v8, p2

    .line 87
    .line 88
    :cond_7
    const/16 v9, 0x80

    .line 89
    .line 90
    :goto_5
    or-int/2addr v3, v9

    .line 91
    goto :goto_6

    .line 92
    :cond_8
    move-object/from16 v8, p2

    .line 93
    .line 94
    :goto_6
    and-int/lit8 v9, p6, 0x8

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    or-int/lit16 v3, v3, 0xc00

    .line 99
    .line 100
    goto :goto_8

    .line 101
    :cond_9
    and-int/lit16 v9, v5, 0xc00

    .line 102
    .line 103
    if-nez v9, :cond_b

    .line 104
    .line 105
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-eqz v9, :cond_a

    .line 110
    .line 111
    const/16 v9, 0x800

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_a
    const/16 v9, 0x400

    .line 115
    .line 116
    :goto_7
    or-int/2addr v3, v9

    .line 117
    :cond_b
    :goto_8
    and-int/lit16 v9, v3, 0x493

    .line 118
    .line 119
    const/16 v10, 0x492

    .line 120
    .line 121
    if-ne v9, v10, :cond_e

    .line 122
    .line 123
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-nez v9, :cond_c

    .line 128
    .line 129
    goto :goto_a

    .line 130
    :cond_c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 131
    .line 132
    .line 133
    move-object v6, v7

    .line 134
    :cond_d
    :goto_9
    move-object v3, v8

    .line 135
    goto/16 :goto_f

    .line 136
    .line 137
    :cond_e
    :goto_a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 138
    .line 139
    .line 140
    and-int/lit8 v9, v5, 0x1

    .line 141
    .line 142
    const/4 v10, 0x6

    .line 143
    if-eqz v9, :cond_11

    .line 144
    .line 145
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    if-eqz v9, :cond_f

    .line 150
    .line 151
    goto :goto_b

    .line 152
    :cond_f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 153
    .line 154
    .line 155
    and-int/lit8 v6, p6, 0x4

    .line 156
    .line 157
    if-eqz v6, :cond_10

    .line 158
    .line 159
    and-int/lit16 v3, v3, -0x381

    .line 160
    .line 161
    :cond_10
    move-object v6, v7

    .line 162
    goto :goto_d

    .line 163
    :cond_11
    :goto_b
    if-eqz v6, :cond_12

    .line 164
    .line 165
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 166
    .line 167
    goto :goto_c

    .line 168
    :cond_12
    move-object v6, v7

    .line 169
    :goto_c
    and-int/lit8 v7, p6, 0x4

    .line 170
    .line 171
    if-eqz v7, :cond_13

    .line 172
    .line 173
    sget-object v7, Landroidx/compose/material3/TimePickerDefaults;->INSTANCE:Landroidx/compose/material3/TimePickerDefaults;

    .line 174
    .line 175
    invoke-virtual {v7, v2, v10}, Landroidx/compose/material3/TimePickerDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TimePickerColors;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    and-int/lit16 v3, v3, -0x381

    .line 180
    .line 181
    move-object v8, v7

    .line 182
    :cond_13
    :goto_d
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 183
    .line 184
    .line 185
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    if-eqz v7, :cond_14

    .line 190
    .line 191
    const/4 v7, -0x1

    .line 192
    const-string v9, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:783)"

    .line 193
    .line 194
    invoke-static {v0, v3, v7, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_14
    sget-object v0, Landroidx/compose/material3/TimePickerKt$VerticalTimePicker$1;->INSTANCE:Landroidx/compose/material3/TimePickerKt$VerticalTimePicker$1;

    .line 198
    .line 199
    const/4 v7, 0x0

    .line 200
    const/4 v9, 0x0

    .line 201
    const/4 v11, 0x1

    .line 202
    invoke-static {v6, v9, v0, v11, v7}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 207
    .line 208
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    const v11, -0x1cd0f17e

    .line 213
    .line 214
    .line 215
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 216
    .line 217
    .line 218
    sget-object v11, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 219
    .line 220
    invoke-virtual {v11}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    const/16 v12, 0x30

    .line 225
    .line 226
    invoke-static {v11, v7, v2, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    const v11, -0x4ee9b9da

    .line 231
    .line 232
    .line 233
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 234
    .line 235
    .line 236
    invoke-static {v2, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 245
    .line 246
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 247
    .line 248
    .line 249
    move-result-object v14

    .line 250
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 255
    .line 256
    .line 257
    move-result-object v15

    .line 258
    instance-of v15, v15, Landroidx/compose/runtime/Applier;

    .line 259
    .line 260
    if-nez v15, :cond_15

    .line 261
    .line 262
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 263
    .line 264
    .line 265
    :cond_15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 266
    .line 267
    .line 268
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 269
    .line 270
    .line 271
    move-result v15

    .line 272
    if-eqz v15, :cond_16

    .line 273
    .line 274
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 275
    .line 276
    .line 277
    goto :goto_e

    .line 278
    :cond_16
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 279
    .line 280
    .line 281
    :goto_e
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 282
    .line 283
    .line 284
    move-result-object v14

    .line 285
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 286
    .line 287
    .line 288
    move-result-object v15

    .line 289
    invoke-static {v14, v7, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    invoke-static {v14, v12, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 304
    .line 305
    .line 306
    move-result v12

    .line 307
    if-nez v12, :cond_17

    .line 308
    .line 309
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v12

    .line 313
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    invoke-static {v12, v13}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v12

    .line 321
    if-nez v12, :cond_18

    .line 322
    .line 323
    :cond_17
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 324
    .line 325
    .line 326
    move-result-object v12

    .line 327
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v11

    .line 334
    invoke-interface {v14, v11, v7}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 335
    .line 336
    .line 337
    :cond_18
    invoke-static {v2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    invoke-static {v7}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object v9

    .line 349
    invoke-interface {v0, v7, v2, v9}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    const v0, 0x7ab4aae9

    .line 353
    .line 354
    .line 355
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 356
    .line 357
    .line 358
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 359
    .line 360
    and-int/lit8 v0, v3, 0xe

    .line 361
    .line 362
    shr-int/lit8 v3, v3, 0x3

    .line 363
    .line 364
    and-int/lit8 v7, v3, 0x70

    .line 365
    .line 366
    or-int/2addr v0, v7

    .line 367
    invoke-static {v1, v8, v2, v0}, Landroidx/compose/material3/TimePickerKt;->VerticalClockDisplay(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    .line 368
    .line 369
    .line 370
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 371
    .line 372
    sget v9, Landroidx/compose/material3/TimePickerKt;->ClockDisplayBottomMargin:F

    .line 373
    .line 374
    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 375
    .line 376
    .line 377
    move-result-object v9

    .line 378
    invoke-static {v9, v2, v10}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 379
    .line 380
    .line 381
    and-int/lit16 v3, v3, 0x380

    .line 382
    .line 383
    or-int/2addr v0, v3

    .line 384
    invoke-static {v1, v8, v4, v2, v0}, Landroidx/compose/material3/TimePickerKt;->ClockFace(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V

    .line 385
    .line 386
    .line 387
    sget v0, Landroidx/compose/material3/TimePickerKt;->ClockFaceBottomMargin:F

    .line 388
    .line 389
    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-static {v0, v2, v10}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 394
    .line 395
    .line 396
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 397
    .line 398
    .line 399
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 400
    .line 401
    .line 402
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 403
    .line 404
    .line 405
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 406
    .line 407
    .line 408
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_d

    .line 413
    .line 414
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 415
    .line 416
    .line 417
    goto/16 :goto_9

    .line 418
    .line 419
    :goto_f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    if-eqz v7, :cond_19

    .line 424
    .line 425
    new-instance v8, Landroidx/compose/material3/TimePickerKt$VerticalTimePicker$3;

    .line 426
    .line 427
    move-object v0, v8

    .line 428
    move-object/from16 v1, p0

    .line 429
    .line 430
    move-object v2, v6

    .line 431
    move/from16 v4, p3

    .line 432
    .line 433
    move/from16 v5, p5

    .line 434
    .line 435
    move/from16 v6, p6

    .line 436
    .line 437
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material3/TimePickerKt$VerticalTimePicker$3;-><init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZII)V

    .line 438
    .line 439
    .line 440
    invoke-interface {v7, v8}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 441
    .line 442
    .line 443
    :cond_19
    return-void
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

.method public static final synthetic access$CircularLayout-uFdPcIQ(Landroidx/compose/ui/Modifier;FLv3/p;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/TimePickerKt;->CircularLayout-uFdPcIQ(Landroidx/compose/ui/Modifier;FLv3/p;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final synthetic access$ClockDisplayNumbers(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/TimePickerKt;->ClockDisplayNumbers(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$ClockText(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/TimePickerKt;->ClockText(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$ClockText$lambda$28(Landroidx/compose/runtime/MutableState;)J
    .locals 2

    invoke-static {p0}, Landroidx/compose/material3/TimePickerKt;->ClockText$lambda$28(Landroidx/compose/runtime/MutableState;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$ClockText$lambda$29(Landroidx/compose/runtime/MutableState;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/material3/TimePickerKt;->ClockText$lambda$29(Landroidx/compose/runtime/MutableState;J)V

    return-void
.end method

.method public static final synthetic access$DisplaySeparator(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/material3/TimePickerKt;->DisplaySeparator(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$HorizontalClockDisplay(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/TimePickerKt;->HorizontalClockDisplay(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$HorizontalPeriodToggle(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/TimePickerKt;->HorizontalPeriodToggle(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$PeriodToggleImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p7}, Landroidx/compose/material3/TimePickerKt;->PeriodToggleImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$TimeInputImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/TimePickerKt;->TimeInputImpl(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$TimeInputImpl$lambda$5(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
    .locals 0

    invoke-static {p0}, Landroidx/compose/material3/TimePickerKt;->TimeInputImpl$lambda$5(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$TimeInputImpl$lambda$6(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/material3/TimePickerKt;->TimeInputImpl$lambda$6(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V

    return-void
.end method

.method public static final synthetic access$TimeInputImpl$lambda$8(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
    .locals 0

    invoke-static {p0}, Landroidx/compose/material3/TimePickerKt;->TimeInputImpl$lambda$8(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$TimeInputImpl$lambda$9(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/material3/TimePickerKt;->TimeInputImpl$lambda$9(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/text/input/TextFieldValue;)V

    return-void
.end method

.method public static final synthetic access$TimePickerTextField-lxUZ_iY(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p10}, Landroidx/compose/material3/TimePickerKt;->TimePickerTextField-lxUZ_iY(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final synthetic access$TimeSelector-uXwN82Y(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/material3/TimePickerKt;->TimeSelector-uXwN82Y(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$ToggleItem(ZLandroidx/compose/ui/graphics/Shape;Lv3/a;Landroidx/compose/material3/TimePickerColors;Lv3/q;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/material3/TimePickerKt;->ToggleItem(ZLandroidx/compose/ui/graphics/Shape;Lv3/a;Landroidx/compose/material3/TimePickerColors;Lv3/q;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$VerticalClockDisplay(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/TimePickerKt;->VerticalClockDisplay(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$VerticalPeriodToggle(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/material3/TimePickerKt;->VerticalPeriodToggle(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$atan(FF)F
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/material3/TimePickerKt;->atan(FF)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$dist(FFII)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/TimePickerKt;->dist(FFII)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$drawSelector(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/material3/TimePickerKt;->drawSelector(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDisplaySeparatorWidth$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/TimePickerKt;->DisplaySeparatorWidth:F

    return v0
.end method

.method public static final synthetic access$getExtraHours$p()Ljava/util/List;
    .locals 1

    sget-object v0, Landroidx/compose/material3/TimePickerKt;->ExtraHours:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getHours$p()Ljava/util/List;
    .locals 1

    sget-object v0, Landroidx/compose/material3/TimePickerKt;->Hours:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getInnerCircleRadius$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/TimePickerKt;->InnerCircleRadius:F

    return v0
.end method

.method public static final synthetic access$getMaxDistance$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/TimePickerKt;->MaxDistance:F

    return v0
.end method

.method public static final synthetic access$getMinutes$p()Ljava/util/List;
    .locals 1

    sget-object v0, Landroidx/compose/material3/TimePickerKt;->Minutes:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getOuterCircleSizeRadius$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/TimePickerKt;->OuterCircleSizeRadius:F

    return v0
.end method

.method public static final synthetic access$timeInputOnChange-gIWD5Rc(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILv3/l;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/TimePickerKt;->timeInputOnChange-gIWD5Rc(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILv3/l;)V

    return-void
.end method

.method public static final synthetic access$valuesForAnimation(FF)Lkotlin/u0;
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/material3/TimePickerKt;->valuesForAnimation(FF)Lkotlin/u0;

    move-result-object p0

    return-object p0
.end method

.method private static final atan(FF)F
    .locals 2

    float-to-double v0, p0

    float-to-double p0, p1

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    double-to-float p0, p0

    const p1, 0x3fc90fdb

    sub-float/2addr p0, p1

    const/4 p1, 0x0

    cmpg-float p1, p0, p1

    if-gez p1, :cond_0

    const p1, 0x40c90fdb

    add-float/2addr p0, p1

    :cond_0
    return p0
.end method

.method private static final dist(FFII)F
    .locals 2

    int-to-float p2, p2

    sub-float/2addr p2, p0

    int-to-float p0, p3

    sub-float/2addr p0, p1

    float-to-double p1, p2

    float-to-double v0, p0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method private static final drawSelector(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/material3/TimePickerKt$drawSelector$1;

    invoke-direct {v0, p1, p2}, Landroidx/compose/material3/TimePickerKt$drawSelector$1;-><init>(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithContent(Landroidx/compose/ui/Modifier;Lv3/l;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final numberContentDescription-YKJpE6Y(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 3
    .param p3    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ReadOnlyComposable;
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1724)"

    .line 9
    .line 10
    const v2, 0x6cd8ecfc

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p4, Landroidx/compose/material3/Selection;->Companion:Landroidx/compose/material3/Selection$Companion;

    .line 17
    .line 18
    invoke-virtual {p4}, Landroidx/compose/material3/Selection$Companion;->getMinute-JiIwxys()I

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    invoke-static {p0, p4}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    sget-object p0, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 29
    .line 30
    sget p0, Landroidx/compose/material3/R$string;->m3c_time_picker_minute_suffix:I

    .line 31
    .line 32
    invoke-static {p0}, Landroidx/compose/material3/Strings;->constructor-impl(I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz p1, :cond_2

    .line 38
    .line 39
    sget-object p0, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 40
    .line 41
    sget p0, Landroidx/compose/material3/R$string;->m3c_time_picker_hour_24h_suffix:I

    .line 42
    .line 43
    invoke-static {p0}, Landroidx/compose/material3/Strings;->constructor-impl(I)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    sget-object p0, Landroidx/compose/material3/Strings;->Companion:Landroidx/compose/material3/Strings$Companion;

    .line 49
    .line 50
    sget p0, Landroidx/compose/material3/R$string;->m3c_time_picker_hour_suffix:I

    .line 51
    .line 52
    invoke-static {p0}, Landroidx/compose/material3/Strings;->constructor-impl(I)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    :goto_0
    const/4 p1, 0x1

    .line 57
    new-array p1, p1, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    const/4 p4, 0x0

    .line 64
    aput-object p2, p1, p4

    .line 65
    .line 66
    invoke-static {p0, p1, p3, p4}, Landroidx/compose/material3/Strings_androidKt;->getString-iSCLEhQ(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 77
    .line 78
    .line 79
    :cond_3
    return-object p0
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
.end method

.method public static final rememberTimePickerState(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;
    .locals 13
    .param p3    # Landroidx/compose/runtime/Composer;
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
    move-object/from16 v7, p3

    .line 2
    .line 3
    move/from16 v0, p4

    .line 4
    .line 5
    const v1, 0x49c6094d

    .line 6
    .line 7
    .line 8
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 9
    .line 10
    .line 11
    and-int/lit8 v2, p5, 0x1

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    move v2, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, p0

    .line 19
    :goto_0
    and-int/lit8 v4, p5, 0x2

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    move v4, v3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v4, p1

    .line 26
    :goto_1
    const/4 v5, 0x4

    .line 27
    and-int/lit8 v6, p5, 0x4

    .line 28
    .line 29
    if-eqz v6, :cond_2

    .line 30
    .line 31
    invoke-static {v7, v3}, Landroidx/compose/material3/TimeFormat_androidKt;->is24HourFormat(Landroidx/compose/runtime/Composer;I)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v6, p2

    .line 37
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_3

    .line 42
    .line 43
    const/4 v8, -0x1

    .line 44
    const-string v9, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:556)"

    .line 45
    .line 46
    invoke-static {v1, v0, v8, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    new-array v1, v3, [Ljava/lang/Object;

    .line 50
    .line 51
    sget-object v8, Landroidx/compose/material3/TimePickerState;->Companion:Landroidx/compose/material3/TimePickerState$Companion;

    .line 52
    .line 53
    invoke-virtual {v8}, Landroidx/compose/material3/TimePickerState$Companion;->Saver()Landroidx/compose/runtime/saveable/Saver;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    const/4 v9, 0x0

    .line 58
    const v10, 0x6793d19e

    .line 59
    .line 60
    .line 61
    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 62
    .line 63
    .line 64
    and-int/lit8 v10, v0, 0xe

    .line 65
    .line 66
    xor-int/lit8 v10, v10, 0x6

    .line 67
    .line 68
    const/4 v11, 0x1

    .line 69
    if-le v10, v5, :cond_4

    .line 70
    .line 71
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-nez v10, :cond_5

    .line 76
    .line 77
    :cond_4
    and-int/lit8 v10, v0, 0x6

    .line 78
    .line 79
    if-ne v10, v5, :cond_6

    .line 80
    .line 81
    :cond_5
    move v5, v11

    .line 82
    goto :goto_3

    .line 83
    :cond_6
    move v5, v3

    .line 84
    :goto_3
    and-int/lit8 v10, v0, 0x70

    .line 85
    .line 86
    xor-int/lit8 v10, v10, 0x30

    .line 87
    .line 88
    const/16 v12, 0x20

    .line 89
    .line 90
    if-le v10, v12, :cond_7

    .line 91
    .line 92
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-nez v10, :cond_8

    .line 97
    .line 98
    :cond_7
    and-int/lit8 v10, v0, 0x30

    .line 99
    .line 100
    if-ne v10, v12, :cond_9

    .line 101
    .line 102
    :cond_8
    move v10, v11

    .line 103
    goto :goto_4

    .line 104
    :cond_9
    move v10, v3

    .line 105
    :goto_4
    or-int/2addr v5, v10

    .line 106
    and-int/lit16 v10, v0, 0x380

    .line 107
    .line 108
    xor-int/lit16 v10, v10, 0x180

    .line 109
    .line 110
    const/16 v12, 0x100

    .line 111
    .line 112
    if-le v10, v12, :cond_a

    .line 113
    .line 114
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-nez v10, :cond_b

    .line 119
    .line 120
    :cond_a
    and-int/lit16 v0, v0, 0x180

    .line 121
    .line 122
    if-ne v0, v12, :cond_c

    .line 123
    .line 124
    :cond_b
    move v3, v11

    .line 125
    :cond_c
    or-int v0, v5, v3

    .line 126
    .line 127
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    if-nez v0, :cond_d

    .line 132
    .line 133
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-ne v3, v0, :cond_e

    .line 140
    .line 141
    :cond_d
    new-instance v3, Landroidx/compose/material3/TimePickerKt$rememberTimePickerState$1$1;

    .line 142
    .line 143
    invoke-direct {v3, v2, v4, v6}, Landroidx/compose/material3/TimePickerKt$rememberTimePickerState$1$1;-><init>(IIZ)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_e
    check-cast v3, Lv3/a;

    .line 150
    .line 151
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 152
    .line 153
    .line 154
    const/4 v5, 0x0

    .line 155
    const/4 v6, 0x4

    .line 156
    move-object v0, v1

    .line 157
    move-object v1, v8

    .line 158
    move-object v2, v9

    .line 159
    move-object/from16 v4, p3

    .line 160
    .line 161
    invoke-static/range {v0 .. v6}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lv3/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Landroidx/compose/material3/TimePickerState;

    .line 166
    .line 167
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_f

    .line 172
    .line 173
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 174
    .line 175
    .line 176
    :cond_f
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 177
    .line 178
    .line 179
    return-object v0
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

.method private static final timeInputOnChange-gIWD5Rc(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILv3/l;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/material3/TimePickerState;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "I",
            "Lv3/l<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p3}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-static {v0, p3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    invoke-interface {p5, p2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    const/4 v0, 0x1

    .line 28
    const/4 v1, 0x0

    .line 29
    if-nez p3, :cond_1

    .line 30
    .line 31
    move p3, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move p3, v1

    .line 34
    :goto_0
    if-eqz p3, :cond_3

    .line 35
    .line 36
    sget-object p3, Landroidx/compose/material3/Selection;->Companion:Landroidx/compose/material3/Selection$Companion;

    .line 37
    .line 38
    invoke-virtual {p3}, Landroidx/compose/material3/Selection$Companion;->getHour-JiIwxys()I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    invoke-static {p0, p3}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1, v1}, Landroidx/compose/material3/TimePickerState;->setHour$material3_release(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p1, v1}, Landroidx/compose/material3/TimePickerState;->setMinute$material3_release(I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    const-string v3, ""

    .line 56
    .line 57
    const-wide/16 v4, 0x0

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x6

    .line 61
    const/4 v8, 0x0

    .line 62
    move-object v2, p2

    .line 63
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/text/input/TextFieldValue;->copy-3r_uNRQ$default(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILjava/lang/Object;)Landroidx/compose/ui/text/input/TextFieldValue;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-interface {p5, p0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    :try_start_0
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    const/4 v2, 0x3

    .line 80
    if-ne p3, v2, :cond_4

    .line 81
    .line 82
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/TextFieldValue;->getSelection-d9O1mEE()J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    if-ne p3, v0, :cond_4

    .line 91
    .line 92
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    invoke-virtual {p3, v1}, Ljava/lang/String;->charAt(I)C

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    invoke-static {p3}, Lkotlin/text/c;->F(C)I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    :goto_2
    if-gt p3, p4, :cond_8

    .line 114
    .line 115
    sget-object p4, Landroidx/compose/material3/Selection;->Companion:Landroidx/compose/material3/Selection$Companion;

    .line 116
    .line 117
    invoke-virtual {p4}, Landroidx/compose/material3/Selection$Companion;->getHour-JiIwxys()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-static {p0, v2}, Landroidx/compose/material3/Selection;->equals-impl0(II)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-eqz p0, :cond_5

    .line 126
    .line 127
    invoke-virtual {p1, p3}, Landroidx/compose/material3/TimePickerState;->setHour$material3_release(I)V

    .line 128
    .line 129
    .line 130
    if-le p3, v0, :cond_6

    .line 131
    .line 132
    invoke-virtual {p1}, Landroidx/compose/material3/TimePickerState;->is24hour()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-nez p0, :cond_6

    .line 137
    .line 138
    invoke-virtual {p4}, Landroidx/compose/material3/Selection$Companion;->getMinute-JiIwxys()I

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    invoke-virtual {p1, p0}, Landroidx/compose/material3/TimePickerState;->setSelection-iHAOin8$material3_release(I)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_5
    invoke-virtual {p1, p3}, Landroidx/compose/material3/TimePickerState;->setMinute$material3_release(I)V

    .line 147
    .line 148
    .line 149
    :cond_6
    :goto_3
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    const/4 p1, 0x2

    .line 158
    if-gt p0, p1, :cond_7

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_7
    invoke-virtual {p2}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const-wide/16 v2, 0x0

    .line 174
    .line 175
    const/4 v4, 0x0

    .line 176
    const/4 v5, 0x6

    .line 177
    const/4 v6, 0x0

    .line 178
    move-object v0, p2

    .line 179
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/text/input/TextFieldValue;->copy-3r_uNRQ$default(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILjava/lang/Object;)Landroidx/compose/ui/text/input/TextFieldValue;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    :goto_4
    invoke-interface {p5, p2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    .line 185
    .line 186
    :catch_0
    :cond_8
    return-void
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

.method private static final valuesForAnimation(FF)Lkotlin/u0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF)",
            "Lkotlin/u0<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    sub-float v0, p0, p1

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    float-to-double v0, v0

    .line 8
    const-wide v2, 0x400921fb54442d18L    # Math.PI

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmpg-double v0, v0, v2

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lkotlin/u0;

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v0, p0, p1}, Lkotlin/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    float-to-double v0, p0

    .line 32
    cmpl-double v4, v0, v2

    .line 33
    .line 34
    const v5, 0x40c90fdb

    .line 35
    .line 36
    .line 37
    if-lez v4, :cond_1

    .line 38
    .line 39
    float-to-double v6, p1

    .line 40
    cmpg-double v4, v6, v2

    .line 41
    .line 42
    if-gez v4, :cond_1

    .line 43
    .line 44
    add-float/2addr p1, v5

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    cmpg-double v0, v0, v2

    .line 47
    .line 48
    if-gez v0, :cond_2

    .line 49
    .line 50
    float-to-double v0, p1

    .line 51
    cmpl-double v0, v0, v2

    .line 52
    .line 53
    if-lez v0, :cond_2

    .line 54
    .line 55
    add-float/2addr p0, v5

    .line 56
    :cond_2
    :goto_0
    new-instance v0, Lkotlin/u0;

    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {v0, p0, p1}, Lkotlin/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object v0
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
.end method

.method private static final visible(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;
    .locals 2
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material3/VisibleModifier;

    .line 2
    .line 3
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->isDebugInspectorInfoEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Landroidx/compose/material3/TimePickerKt$visible$$inlined$debugInspectorInfo$1;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Landroidx/compose/material3/TimePickerKt$visible$$inlined$debugInspectorInfo$1;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/InspectableValueKt;->getNoInspectorInfo()Lv3/l;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-direct {v0, p1, v1}, Landroidx/compose/material3/VisibleModifier;-><init>(ZLv3/l;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
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
