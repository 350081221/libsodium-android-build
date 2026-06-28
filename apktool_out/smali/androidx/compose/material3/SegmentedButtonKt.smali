.class public final Landroidx/compose/material3/SegmentedButtonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001a\u0091\u0001\u0010\u0015\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0013\u0008\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\u0002\u0008\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\u0002\u0008\u0012H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u008b\u0001\u0010\u0015\u001a\u00020\u0004*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0013\u0008\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\u0002\u0008\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\u0002\u0008\u0012H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u001a\u001aD\u0010!\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0002\u0008\u001dH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 \u001aD\u0010#\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0002\u0008\u001dH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010 \u001a5\u0010$\u001a\u00020\u00042\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\u0002\u0008\u00122\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\u0002\u0008\u0012H\u0003\u00a2\u0006\u0004\u0008$\u0010%\u001a\u0019\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\'*\u00020&H\u0003\u00a2\u0006\u0004\u0008)\u0010*\u001a\"\u0010,\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u00012\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020(0\'H\u0002\"\u0014\u0010.\u001a\u00020-8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008.\u0010/\"\u0014\u00100\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010/\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00061"
    }
    d2 = {
        "Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;",
        "",
        "checked",
        "Lkotlin/Function1;",
        "Lkotlin/r2;",
        "onCheckedChange",
        "Landroidx/compose/ui/graphics/Shape;",
        "shape",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "enabled",
        "Landroidx/compose/material3/SegmentedButtonColors;",
        "colors",
        "Landroidx/compose/foundation/BorderStroke;",
        "border",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "icon",
        "label",
        "SegmentedButton",
        "(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLv3/l;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;III)V",
        "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;",
        "selected",
        "onClick",
        "(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLv3/a;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;III)V",
        "Landroidx/compose/ui/unit/Dp;",
        "space",
        "Lkotlin/u;",
        "content",
        "SingleChoiceSegmentedButtonRow-uFdPcIQ",
        "(Landroidx/compose/ui/Modifier;FLv3/q;Landroidx/compose/runtime/Composer;II)V",
        "SingleChoiceSegmentedButtonRow",
        "MultiChoiceSegmentedButtonRow-uFdPcIQ",
        "MultiChoiceSegmentedButtonRow",
        "SegmentedButtonContent",
        "(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "Landroidx/compose/runtime/State;",
        "",
        "interactionCountAsState",
        "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;",
        "interactionCount",
        "interactionZIndex",
        "",
        "CheckedZIndexFactor",
        "F",
        "IconSpacing",
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
        "SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,786:1\n1116#2,6:787\n1116#2,6:793\n1116#2,6:831\n1116#2,6:874\n1116#2,6:924\n1116#2,6:930\n64#3:799\n64#3:842\n91#4,2:800\n93#4:830\n97#4:841\n91#4,2:843\n93#4:873\n97#4:884\n78#5,11:802\n91#5:840\n78#5,11:845\n91#5:883\n78#5,11:890\n91#5:922\n456#6,8:813\n464#6,3:827\n467#6,3:837\n456#6,8:856\n464#6,3:870\n467#6,3:880\n456#6,8:901\n464#6,3:915\n467#6,3:919\n3737#7,6:821\n3737#7,6:864\n3737#7,6:909\n69#8,5:885\n74#8:918\n78#8:923\n154#9:936\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonKt\n*L\n139#1:787,6\n214#1:793,6\n275#1:831,6\n312#1:874,6\n400#1:924,6\n401#1:930,6\n272#1:799\n309#1:842\n267#1:800,2\n267#1:830\n267#1:841\n305#1:843,2\n305#1:873\n305#1:884\n267#1:802,11\n267#1:840\n305#1:845,11\n305#1:883\n323#1:890,11\n323#1:922\n267#1:813,8\n267#1:827,3\n267#1:837,3\n305#1:856,8\n305#1:870,3\n305#1:880,3\n323#1:901,8\n323#1:915,3\n323#1:919,3\n267#1:821,6\n305#1:864,6\n323#1:909,6\n323#1:885,5\n323#1:918\n323#1:923\n777#1:936\n*E\n"
    }
.end annotation


# static fields
.field private static final CheckedZIndexFactor:F = 5.0f

.field private static final IconSpacing:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

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
    sput v0, Landroidx/compose/material3/SegmentedButtonKt;->IconSpacing:F

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public static final MultiChoiceSegmentedButtonRow-uFdPcIQ(Landroidx/compose/ui/Modifier;FLv3/q;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lv3/q;
        .annotation build Lp4/l;
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

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "F",
            "Lv3/q<",
            "-",
            "Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;",
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
    const v0, 0x94b2f8b

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
    if-eqz v3, :cond_3

    .line 34
    .line 35
    or-int/lit8 v2, v2, 0x30

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    and-int/lit8 v4, p4, 0x30

    .line 39
    .line 40
    if-nez v4, :cond_5

    .line 41
    .line 42
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    const/16 v4, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    const/16 v4, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v2, v4

    .line 54
    :cond_5
    :goto_3
    and-int/lit8 v4, p5, 0x4

    .line 55
    .line 56
    if-eqz v4, :cond_6

    .line 57
    .line 58
    or-int/lit16 v2, v2, 0x180

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_6
    and-int/lit16 v4, p4, 0x180

    .line 62
    .line 63
    if-nez v4, :cond_8

    .line 64
    .line 65
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_7

    .line 70
    .line 71
    const/16 v4, 0x100

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_7
    const/16 v4, 0x80

    .line 75
    .line 76
    :goto_4
    or-int/2addr v2, v4

    .line 77
    :cond_8
    :goto_5
    and-int/lit16 v4, v2, 0x93

    .line 78
    .line 79
    const/16 v5, 0x92

    .line 80
    .line 81
    if-ne v4, v5, :cond_b

    .line 82
    .line 83
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-nez v4, :cond_9

    .line 88
    .line 89
    goto :goto_7

    .line 90
    :cond_9
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 91
    .line 92
    .line 93
    :cond_a
    :goto_6
    move-object v2, p0

    .line 94
    move v3, p1

    .line 95
    goto/16 :goto_9

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
    if-eqz v3, :cond_d

    .line 102
    .line 103
    sget-object p1, Landroidx/compose/material3/SegmentedButtonDefaults;->INSTANCE:Landroidx/compose/material3/SegmentedButtonDefaults;

    .line 104
    .line 105
    invoke-virtual {p1}, Landroidx/compose/material3/SegmentedButtonDefaults;->getBorderWidth-D9Ej5fM()F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    :cond_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_e

    .line 114
    .line 115
    const/4 v1, -0x1

    .line 116
    const-string v3, "androidx.compose.material3.MultiChoiceSegmentedButtonRow (SegmentedButton.kt:303)"

    .line 117
    .line 118
    invoke-static {v0, v2, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_e
    sget-object v0, Landroidx/compose/material3/tokens/OutlinedSegmentedButtonTokens;->INSTANCE:Landroidx/compose/material3/tokens/OutlinedSegmentedButtonTokens;

    .line 122
    .line 123
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/OutlinedSegmentedButtonTokens;->getContainerHeight-D9Ej5fM()F

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    const/4 v1, 0x0

    .line 128
    const/4 v3, 0x0

    .line 129
    const/4 v4, 0x1

    .line 130
    invoke-static {p0, v3, v0, v4, v1}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sget-object v1, Landroidx/compose/foundation/layout/IntrinsicSize;->Min:Landroidx/compose/foundation/layout/IntrinsicSize;

    .line 135
    .line 136
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/IntrinsicKt;->width(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/IntrinsicSize;)Landroidx/compose/ui/Modifier;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 141
    .line 142
    neg-float v3, p1

    .line 143
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    invoke-virtual {v1, v3}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 152
    .line 153
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    const v4, 0x2952b718

    .line 158
    .line 159
    .line 160
    invoke-interface {p3, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 161
    .line 162
    .line 163
    const/16 v4, 0x30

    .line 164
    .line 165
    invoke-static {v1, v3, p3, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    const v3, -0x4ee9b9da

    .line 170
    .line 171
    .line 172
    invoke-interface {p3, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 173
    .line 174
    .line 175
    const/4 v3, 0x0

    .line 176
    invoke-static {p3, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 185
    .line 186
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    instance-of v8, v8, Landroidx/compose/runtime/Applier;

    .line 199
    .line 200
    if-nez v8, :cond_f

    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 203
    .line 204
    .line 205
    :cond_f
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 206
    .line 207
    .line 208
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    if-eqz v8, :cond_10

    .line 213
    .line 214
    invoke-interface {p3, v7}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 215
    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_10
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 219
    .line 220
    .line 221
    :goto_8
    invoke-static {p3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    invoke-static {v7, v1, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-static {v7, v5, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-nez v5, :cond_11

    .line 248
    .line 249
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-nez v5, :cond_12

    .line 262
    .line 263
    :cond_11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-interface {v7, v4, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 275
    .line 276
    .line 277
    :cond_12
    invoke-static {p3}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-interface {v0, v1, p3, v3}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    const v0, 0x7ab4aae9

    .line 293
    .line 294
    .line 295
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 296
    .line 297
    .line 298
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 299
    .line 300
    const v1, 0x222da19a

    .line 301
    .line 302
    .line 303
    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 304
    .line 305
    .line 306
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 311
    .line 312
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    if-ne v1, v3, :cond_13

    .line 317
    .line 318
    new-instance v1, Landroidx/compose/material3/MultiChoiceSegmentedButtonScopeWrapper;

    .line 319
    .line 320
    invoke-direct {v1, v0}, Landroidx/compose/material3/MultiChoiceSegmentedButtonScopeWrapper;-><init>(Landroidx/compose/foundation/layout/RowScope;)V

    .line 321
    .line 322
    .line 323
    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    :cond_13
    check-cast v1, Landroidx/compose/material3/MultiChoiceSegmentedButtonScopeWrapper;

    .line 327
    .line 328
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 329
    .line 330
    .line 331
    shr-int/lit8 v0, v2, 0x3

    .line 332
    .line 333
    and-int/lit8 v0, v0, 0x70

    .line 334
    .line 335
    or-int/lit8 v0, v0, 0x6

    .line 336
    .line 337
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-interface {p2, v1, p3, v0}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 345
    .line 346
    .line 347
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 348
    .line 349
    .line 350
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 351
    .line 352
    .line 353
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 354
    .line 355
    .line 356
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    if-eqz v0, :cond_a

    .line 361
    .line 362
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 363
    .line 364
    .line 365
    goto/16 :goto_6

    .line 366
    .line 367
    :goto_9
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    if-eqz p0, :cond_14

    .line 372
    .line 373
    new-instance p1, Landroidx/compose/material3/SegmentedButtonKt$MultiChoiceSegmentedButtonRow$2;

    .line 374
    .line 375
    move-object v1, p1

    .line 376
    move-object v4, p2

    .line 377
    move v5, p4

    .line 378
    move v6, p5

    .line 379
    invoke-direct/range {v1 .. v6}, Landroidx/compose/material3/SegmentedButtonKt$MultiChoiceSegmentedButtonRow$2;-><init>(Landroidx/compose/ui/Modifier;FLv3/q;II)V

    .line 380
    .line 381
    .line 382
    invoke-interface {p0, p1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 383
    .line 384
    .line 385
    :cond_14
    return-void
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

.method public static final SegmentedButton(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLv3/l;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;III)V
    .locals 27
    .param p0    # Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/material3/SegmentedButtonColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/BorderStroke;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;",
            "Z",
            "Lv3/l<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/material3/SegmentedButtonColors;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
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
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v14, p1

    move-object/from16 v12, p10

    move/from16 v11, p12

    move/from16 v4, p14

    const v0, -0x5f219ba5

    move-object/from16 v1, p11

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    const/high16 v1, -0x80000000

    and-int/2addr v1, v4

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    move v6, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v11

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v6, v11

    :goto_1
    and-int/lit8 v7, v4, 0x1

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v11, 0x30

    if-nez v7, :cond_5

    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v4, 0x2

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    move-object/from16 v15, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v11, 0x180

    move-object/from16 v15, p2

    if-nez v7, :cond_8

    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_8
    :goto_5
    and-int/lit8 v7, v4, 0x4

    if-eqz v7, :cond_9

    or-int/lit16 v6, v6, 0xc00

    move-object/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v11, 0xc00

    move-object/from16 v13, p3

    if-nez v7, :cond_b

    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v6, v7

    :cond_b
    :goto_7
    and-int/lit8 v7, v4, 0x8

    if-eqz v7, :cond_c

    or-int/lit16 v6, v6, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v8, v11, 0x6000

    if-nez v8, :cond_e

    move-object/from16 v8, p4

    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v6, v9

    goto :goto_a

    :cond_e
    :goto_9
    move-object/from16 v8, p4

    :goto_a
    and-int/lit8 v9, v4, 0x10

    const/high16 v10, 0x30000

    if-eqz v9, :cond_f

    or-int/2addr v6, v10

    goto :goto_c

    :cond_f
    and-int/2addr v10, v11

    if-nez v10, :cond_11

    move/from16 v10, p5

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v16, 0x10000

    :goto_b
    or-int v6, v6, v16

    goto :goto_d

    :cond_11
    :goto_c
    move/from16 v10, p5

    :goto_d
    const/high16 v16, 0x180000

    and-int v16, v11, v16

    if-nez v16, :cond_13

    and-int/lit8 v16, v4, 0x20

    move-object/from16 v2, p6

    if-nez v16, :cond_12

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x100000

    goto :goto_e

    :cond_12
    const/high16 v16, 0x80000

    :goto_e
    or-int v6, v6, v16

    goto :goto_f

    :cond_13
    move-object/from16 v2, p6

    :goto_f
    const/high16 v16, 0xc00000

    and-int v16, v11, v16

    if-nez v16, :cond_15

    and-int/lit8 v16, v4, 0x40

    move-object/from16 v0, p7

    if-nez v16, :cond_14

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_14

    const/high16 v17, 0x800000

    goto :goto_10

    :cond_14
    const/high16 v17, 0x400000

    :goto_10
    or-int v6, v6, v17

    goto :goto_11

    :cond_15
    move-object/from16 v0, p7

    :goto_11
    and-int/lit16 v5, v4, 0x80

    const/high16 v18, 0x6000000

    if-eqz v5, :cond_16

    or-int v6, v6, v18

    move-object/from16 v0, p8

    goto :goto_13

    :cond_16
    and-int v18, v11, v18

    move-object/from16 v0, p8

    if-nez v18, :cond_18

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_17

    const/high16 v18, 0x4000000

    goto :goto_12

    :cond_17
    const/high16 v18, 0x2000000

    :goto_12
    or-int v6, v6, v18

    :cond_18
    :goto_13
    and-int/lit16 v0, v4, 0x100

    const/high16 v18, 0x30000000

    if-eqz v0, :cond_19

    or-int v6, v6, v18

    move-object/from16 v1, p9

    goto :goto_15

    :cond_19
    and-int v18, v11, v18

    move-object/from16 v1, p9

    if-nez v18, :cond_1b

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1a

    const/high16 v18, 0x20000000

    goto :goto_14

    :cond_1a
    const/high16 v18, 0x10000000

    :goto_14
    or-int v6, v6, v18

    :cond_1b
    :goto_15
    and-int/lit16 v1, v4, 0x200

    if-eqz v1, :cond_1c

    or-int/lit8 v1, p13, 0x6

    goto :goto_17

    :cond_1c
    and-int/lit8 v1, p13, 0x6

    if-nez v1, :cond_1e

    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    const/4 v1, 0x4

    goto :goto_16

    :cond_1d
    const/4 v1, 0x2

    :goto_16
    or-int v1, p13, v1

    goto :goto_17

    :cond_1e
    move/from16 v1, p13

    :goto_17
    const v18, 0x12492493

    and-int v2, v6, v18

    const v8, 0x12492492

    if-ne v2, v8, :cond_20

    and-int/lit8 v2, v1, 0x3

    const/4 v8, 0x2

    if-ne v2, v8, :cond_20

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_1f

    goto :goto_18

    .line 2
    :cond_1f
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v21, v3

    move v6, v10

    move-object/from16 v10, p9

    goto/16 :goto_20

    .line 3
    :cond_20
    :goto_18
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v2, v11, 0x1

    const v8, -0x1c00001

    const v17, -0x380001

    const/4 v10, 0x6

    if-eqz v2, :cond_24

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v2

    if-eqz v2, :cond_21

    goto :goto_19

    .line 4
    :cond_21
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v4, 0x20

    if-eqz v0, :cond_22

    and-int v6, v6, v17

    :cond_22
    and-int/lit8 v0, v4, 0x40

    if-eqz v0, :cond_23

    and-int/2addr v6, v8

    :cond_23
    move-object/from16 v19, p4

    move/from16 v0, p5

    move-object/from16 v9, p6

    move-object/from16 v20, p7

    move-object/from16 v2, p8

    move-object/from16 v7, p9

    move v8, v6

    const/4 v10, 0x1

    goto/16 :goto_1f

    :cond_24
    :goto_19
    if-eqz v7, :cond_25

    .line 5
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_1a

    :cond_25
    move-object/from16 v2, p4

    :goto_1a
    if-eqz v9, :cond_26

    const/4 v7, 0x1

    goto :goto_1b

    :cond_26
    move/from16 v7, p5

    :goto_1b
    and-int/lit8 v9, v4, 0x20

    if-eqz v9, :cond_27

    .line 6
    sget-object v9, Landroidx/compose/material3/SegmentedButtonDefaults;->INSTANCE:Landroidx/compose/material3/SegmentedButtonDefaults;

    invoke-virtual {v9, v3, v10}, Landroidx/compose/material3/SegmentedButtonDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SegmentedButtonColors;

    move-result-object v9

    and-int v6, v6, v17

    goto :goto_1c

    :cond_27
    move-object/from16 v9, p6

    :goto_1c
    and-int/lit8 v17, v4, 0x40

    if-eqz v17, :cond_28

    .line 7
    sget-object v18, Landroidx/compose/material3/SegmentedButtonDefaults;->INSTANCE:Landroidx/compose/material3/SegmentedButtonDefaults;

    .line 8
    invoke-virtual {v9, v7, v14}, Landroidx/compose/material3/SegmentedButtonColors;->borderColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v19

    const/16 v21, 0x0

    const/16 v22, 0x2

    const/16 v23, 0x0

    .line 9
    invoke-static/range {v18 .. v23}, Landroidx/compose/material3/SegmentedButtonDefaults;->borderStroke-l07J4OM$default(Landroidx/compose/material3/SegmentedButtonDefaults;JFILjava/lang/Object;)Landroidx/compose/foundation/BorderStroke;

    move-result-object v17

    and-int/2addr v6, v8

    goto :goto_1d

    :cond_28
    move-object/from16 v17, p7

    :goto_1d
    if-eqz v5, :cond_2a

    const v5, -0x2e1c4152

    .line 10
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 11
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .line 12
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v5, v8, :cond_29

    .line 13
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v5

    .line 14
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 15
    :cond_29
    check-cast v5, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    goto :goto_1e

    :cond_2a
    move-object/from16 v5, p8

    :goto_1e
    if-eqz v0, :cond_2b

    .line 16
    new-instance v0, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$2;

    invoke-direct {v0, v14}, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$2;-><init>(Z)V

    const v8, 0x39d7da22

    const/4 v10, 0x1

    invoke-static {v3, v8, v10, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object/from16 v19, v2

    move-object v2, v5

    move v8, v6

    move-object/from16 v20, v17

    move/from16 v26, v7

    move-object v7, v0

    move/from16 v0, v26

    goto :goto_1f

    :cond_2b
    const/4 v10, 0x1

    move-object/from16 v19, v2

    move-object v2, v5

    move v8, v6

    move v0, v7

    move-object/from16 v20, v17

    move-object/from16 v7, p9

    :goto_1f
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_2c

    const-string v5, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:141)"

    const v6, -0x5f219ba5

    .line 17
    invoke-static {v6, v8, v1, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 18
    :cond_2c
    invoke-virtual {v9, v0, v14}, Landroidx/compose/material3/SegmentedButtonColors;->containerColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v5

    .line 19
    invoke-virtual {v9, v0, v14}, Landroidx/compose/material3/SegmentedButtonColors;->contentColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v16

    move-object/from16 v24, v7

    move v1, v8

    move-wide/from16 v7, v16

    shr-int/lit8 v16, v1, 0x18

    and-int/lit8 v10, v16, 0xe

    move/from16 v21, v0

    .line 20
    invoke-static {v2, v3, v10}, Landroidx/compose/material3/SegmentedButtonKt;->interactionCountAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    const/high16 v16, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    const/16 v22, 0x2

    const/16 v23, 0x0

    move-object/from16 p4, p0

    move-object/from16 p5, v19

    move/from16 p6, v16

    move/from16 p7, v17

    move/from16 p8, v22

    move-object/from16 p9, v23

    move-object/from16 v16, v2

    .line 21
    invoke-static/range {p4 .. p9}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 22
    invoke-static {v2, v14, v0}, Landroidx/compose/material3/SegmentedButtonKt;->interactionZIndex(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 23
    sget-object v2, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/ButtonDefaults;->getMinWidth-D9Ej5fM()F

    move-result v4

    .line 24
    invoke-virtual {v2}, Landroidx/compose/material3/ButtonDefaults;->getMinHeight-D9Ej5fM()F

    move-result v2

    .line 25
    invoke-static {v0, v4, v2}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v22, v16

    const/4 v0, 0x0

    move-object/from16 v23, v9

    move v9, v0

    move v4, v10

    const/4 v9, 0x1

    const/16 v16, 0x6

    move v10, v0

    .line 26
    new-instance v0, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$3;

    move-object/from16 v10, v24

    invoke-direct {v0, v10, v12}, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$3;-><init>(Lv3/p;Lv3/p;)V

    const v10, 0x617ef585

    invoke-static {v3, v10, v9, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v13, v0

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v9, v0, 0xe

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v9

    shr-int/lit8 v9, v1, 0x6

    and-int/lit16 v9, v9, 0x1c00

    or-int/2addr v0, v9

    const v9, 0xe000

    shl-int/lit8 v10, v1, 0x3

    and-int/2addr v9, v10

    or-int/2addr v0, v9

    const/high16 v9, 0x70000000

    shl-int/lit8 v1, v1, 0x6

    and-int/2addr v1, v9

    or-int/2addr v0, v1

    move v15, v0

    or-int/lit8 v16, v4, 0x30

    const/16 v17, 0x180

    move/from16 v18, v21

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v21, v3

    move/from16 v3, v18

    move-object/from16 v4, p3

    move-object/from16 v11, v20

    move-object/from16 v12, v22

    move-object/from16 v14, v21

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 27
    invoke-static/range {v0 .. v17}, Landroidx/compose/material3/SurfaceKt;->Surface-d85dljk(ZLv3/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2d
    move/from16 v6, v18

    move-object/from16 v5, v19

    move-object/from16 v8, v20

    move-object/from16 v9, v22

    move-object/from16 v7, v23

    move-object/from16 v10, v24

    .line 28
    :goto_20
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-eqz v15, :cond_2e

    new-instance v14, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$4;

    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v25, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$4;-><init>(Landroidx/compose/material3/MultiChoiceSegmentedButtonRowScope;ZLv3/l;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Lv3/p;III)V

    move-object/from16 v0, v25

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_2e
    return-void
.end method

.method public static final SegmentedButton(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLv3/a;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;III)V
    .locals 26
    .param p0    # Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/material3/SegmentedButtonColors;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p7    # Landroidx/compose/foundation/BorderStroke;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p8    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p9    # Lv3/p;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p10    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;",
            "Z",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/material3/SegmentedButtonColors;",
            "Landroidx/compose/foundation/BorderStroke;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
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
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v14, p1

    move-object/from16 v12, p10

    move/from16 v11, p12

    move/from16 v4, p14

    const v0, -0x3c97b199

    move-object/from16 v1, p11

    .line 29
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    const/high16 v1, -0x80000000

    and-int/2addr v1, v4

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    move v6, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v11

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v6, v11

    :goto_1
    and-int/lit8 v7, v4, 0x1

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v11, 0x30

    if-nez v7, :cond_5

    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v4, 0x2

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    move-object/from16 v15, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v11, 0x180

    move-object/from16 v15, p2

    if-nez v7, :cond_8

    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_8
    :goto_5
    and-int/lit8 v7, v4, 0x4

    if-eqz v7, :cond_9

    or-int/lit16 v6, v6, 0xc00

    move-object/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v11, 0xc00

    move-object/from16 v13, p3

    if-nez v7, :cond_b

    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v6, v7

    :cond_b
    :goto_7
    and-int/lit8 v7, v4, 0x8

    if-eqz v7, :cond_c

    or-int/lit16 v6, v6, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v8, v11, 0x6000

    if-nez v8, :cond_e

    move-object/from16 v8, p4

    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    const/16 v9, 0x4000

    goto :goto_8

    :cond_d
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v6, v9

    goto :goto_a

    :cond_e
    :goto_9
    move-object/from16 v8, p4

    :goto_a
    and-int/lit8 v9, v4, 0x10

    const/high16 v10, 0x30000

    if-eqz v9, :cond_f

    or-int/2addr v6, v10

    goto :goto_c

    :cond_f
    and-int/2addr v10, v11

    if-nez v10, :cond_11

    move/from16 v10, p5

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v16, 0x10000

    :goto_b
    or-int v6, v6, v16

    goto :goto_d

    :cond_11
    :goto_c
    move/from16 v10, p5

    :goto_d
    const/high16 v16, 0x180000

    and-int v16, v11, v16

    if-nez v16, :cond_13

    and-int/lit8 v16, v4, 0x20

    move-object/from16 v2, p6

    if-nez v16, :cond_12

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x100000

    goto :goto_e

    :cond_12
    const/high16 v16, 0x80000

    :goto_e
    or-int v6, v6, v16

    goto :goto_f

    :cond_13
    move-object/from16 v2, p6

    :goto_f
    const/high16 v16, 0xc00000

    and-int v16, v11, v16

    if-nez v16, :cond_15

    and-int/lit8 v16, v4, 0x40

    move-object/from16 v0, p7

    if-nez v16, :cond_14

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_14

    const/high16 v17, 0x800000

    goto :goto_10

    :cond_14
    const/high16 v17, 0x400000

    :goto_10
    or-int v6, v6, v17

    goto :goto_11

    :cond_15
    move-object/from16 v0, p7

    :goto_11
    and-int/lit16 v5, v4, 0x80

    const/high16 v18, 0x6000000

    if-eqz v5, :cond_16

    or-int v6, v6, v18

    move-object/from16 v0, p8

    goto :goto_13

    :cond_16
    and-int v18, v11, v18

    move-object/from16 v0, p8

    if-nez v18, :cond_18

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_17

    const/high16 v18, 0x4000000

    goto :goto_12

    :cond_17
    const/high16 v18, 0x2000000

    :goto_12
    or-int v6, v6, v18

    :cond_18
    :goto_13
    and-int/lit16 v0, v4, 0x100

    const/high16 v18, 0x30000000

    if-eqz v0, :cond_19

    or-int v6, v6, v18

    move-object/from16 v1, p9

    goto :goto_15

    :cond_19
    and-int v18, v11, v18

    move-object/from16 v1, p9

    if-nez v18, :cond_1b

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1a

    const/high16 v18, 0x20000000

    goto :goto_14

    :cond_1a
    const/high16 v18, 0x10000000

    :goto_14
    or-int v6, v6, v18

    :cond_1b
    :goto_15
    and-int/lit16 v1, v4, 0x200

    if-eqz v1, :cond_1c

    or-int/lit8 v1, p13, 0x6

    goto :goto_17

    :cond_1c
    and-int/lit8 v1, p13, 0x6

    if-nez v1, :cond_1e

    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    const/4 v1, 0x4

    goto :goto_16

    :cond_1d
    const/4 v1, 0x2

    :goto_16
    or-int v1, p13, v1

    goto :goto_17

    :cond_1e
    move/from16 v1, p13

    :goto_17
    const v18, 0x12492493

    and-int v2, v6, v18

    const v8, 0x12492492

    if-ne v2, v8, :cond_20

    and-int/lit8 v2, v1, 0x3

    const/4 v8, 0x2

    if-ne v2, v8, :cond_20

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_1f

    goto :goto_18

    .line 30
    :cond_1f
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v23, v3

    move v6, v10

    move-object/from16 v10, p9

    goto/16 :goto_21

    .line 31
    :cond_20
    :goto_18
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v2, v11, 0x1

    const v8, -0x1c00001

    const v17, -0x380001

    const/4 v10, 0x6

    if-eqz v2, :cond_24

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v2

    if-eqz v2, :cond_21

    goto :goto_1a

    .line 32
    :cond_21
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v4, 0x20

    if-eqz v0, :cond_22

    and-int v6, v6, v17

    :cond_22
    and-int/lit8 v0, v4, 0x40

    if-eqz v0, :cond_23

    and-int/2addr v6, v8

    :cond_23
    move-object/from16 v19, p4

    move/from16 v0, p5

    move-object/from16 v10, p6

    move-object/from16 v20, p7

    move-object/from16 v9, p8

    move-object/from16 v2, p9

    :goto_19
    move v7, v6

    goto/16 :goto_20

    :cond_24
    :goto_1a
    if-eqz v7, :cond_25

    .line 33
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_1b

    :cond_25
    move-object/from16 v2, p4

    :goto_1b
    if-eqz v9, :cond_26

    const/4 v7, 0x1

    goto :goto_1c

    :cond_26
    move/from16 v7, p5

    :goto_1c
    and-int/lit8 v9, v4, 0x20

    if-eqz v9, :cond_27

    .line 34
    sget-object v9, Landroidx/compose/material3/SegmentedButtonDefaults;->INSTANCE:Landroidx/compose/material3/SegmentedButtonDefaults;

    invoke-virtual {v9, v3, v10}, Landroidx/compose/material3/SegmentedButtonDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SegmentedButtonColors;

    move-result-object v9

    and-int v6, v6, v17

    goto :goto_1d

    :cond_27
    move-object/from16 v9, p6

    :goto_1d
    and-int/lit8 v17, v4, 0x40

    if-eqz v17, :cond_28

    .line 35
    sget-object v18, Landroidx/compose/material3/SegmentedButtonDefaults;->INSTANCE:Landroidx/compose/material3/SegmentedButtonDefaults;

    .line 36
    invoke-virtual {v9, v7, v14}, Landroidx/compose/material3/SegmentedButtonColors;->borderColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v19

    const/16 v21, 0x0

    const/16 v22, 0x2

    const/16 v23, 0x0

    .line 37
    invoke-static/range {v18 .. v23}, Landroidx/compose/material3/SegmentedButtonDefaults;->borderStroke-l07J4OM$default(Landroidx/compose/material3/SegmentedButtonDefaults;JFILjava/lang/Object;)Landroidx/compose/foundation/BorderStroke;

    move-result-object v17

    and-int/2addr v6, v8

    goto :goto_1e

    :cond_28
    move-object/from16 v17, p7

    :goto_1e
    if-eqz v5, :cond_2a

    const v5, -0x2e1c33f1

    .line 38
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 39
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .line 40
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v5, v8, :cond_29

    .line 41
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v5

    .line 42
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 43
    :cond_29
    check-cast v5, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    goto :goto_1f

    :cond_2a
    move-object/from16 v5, p8

    :goto_1f
    if-eqz v0, :cond_2b

    .line 44
    new-instance v0, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$6;

    invoke-direct {v0, v14}, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$6;-><init>(Z)V

    const v8, 0x499d9180    # 1290800.0f

    const/4 v10, 0x1

    invoke-static {v3, v8, v10, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object/from16 v19, v2

    move-object v10, v9

    move-object/from16 v20, v17

    move-object v2, v0

    move-object v9, v5

    move v0, v7

    goto :goto_19

    :cond_2b
    move-object/from16 v19, v2

    move v0, v7

    move-object v10, v9

    move-object/from16 v20, v17

    move-object/from16 v2, p9

    move-object v9, v5

    goto :goto_19

    :goto_20
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_2c

    const-string v5, "androidx.compose.material3.SegmentedButton (SegmentedButton.kt:216)"

    const v6, -0x3c97b199

    .line 45
    invoke-static {v6, v7, v1, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 46
    :cond_2c
    invoke-virtual {v10, v0, v14}, Landroidx/compose/material3/SegmentedButtonColors;->containerColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v5

    .line 47
    invoke-virtual {v10, v0, v14}, Landroidx/compose/material3/SegmentedButtonColors;->contentColor-WaAFU9c$material3_release(ZZ)J

    move-result-wide v16

    move v1, v7

    move-wide/from16 v7, v16

    shr-int/lit8 v16, v1, 0x18

    move-object/from16 v17, v10

    and-int/lit8 v10, v16, 0xe

    move/from16 v21, v0

    .line 48
    invoke-static {v9, v3, v10}, Landroidx/compose/material3/SegmentedButtonKt;->interactionCountAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    const/high16 v16, 0x3f800000    # 1.0f

    const/16 v22, 0x0

    const/16 v23, 0x2

    const/16 v24, 0x0

    move-object/from16 p4, p0

    move-object/from16 p5, v19

    move/from16 p6, v16

    move/from16 p7, v22

    move/from16 p8, v23

    move-object/from16 p9, v24

    move-object/from16 v16, v2

    .line 49
    invoke-static/range {p4 .. p9}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 50
    invoke-static {v2, v14, v0}, Landroidx/compose/material3/SegmentedButtonKt;->interactionZIndex(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 51
    sget-object v2, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/ButtonDefaults;->getMinWidth-D9Ej5fM()F

    move-result v4

    .line 52
    invoke-virtual {v2}, Landroidx/compose/material3/ButtonDefaults;->getMinHeight-D9Ej5fM()F

    move-result v2

    .line 53
    invoke-static {v0, v4, v2}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 54
    sget-object v2, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$7;->INSTANCE:Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$7;

    const/4 v4, 0x0

    move-object/from16 v22, v9

    const/4 v9, 0x0

    move/from16 p4, v10

    const/4 v10, 0x1

    invoke-static {v0, v9, v2, v10, v4}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLv3/l;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v4, v16

    const/4 v9, 0x0

    const/4 v0, 0x0

    move/from16 v16, p4

    move v9, v10

    move-object/from16 v18, v17

    const/16 v17, 0x6

    move v10, v0

    .line 55
    new-instance v0, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$8;

    invoke-direct {v0, v4, v12}, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$8;-><init>(Lv3/p;Lv3/p;)V

    const v10, 0x16d9e27d

    invoke-static {v3, v10, v9, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v13, v0

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v9, v0, 0xe

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v9

    shr-int/lit8 v9, v1, 0x6

    and-int/lit16 v9, v9, 0x1c00

    or-int/2addr v0, v9

    const v9, 0xe000

    shl-int/lit8 v10, v1, 0x3

    and-int/2addr v9, v10

    or-int/2addr v0, v9

    const/high16 v9, 0x70000000

    shl-int/lit8 v1, v1, 0x6

    and-int/2addr v1, v9

    or-int/2addr v0, v1

    move v15, v0

    or-int/lit8 v16, v16, 0x30

    const/16 v17, 0x180

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v23, v3

    move/from16 v3, v21

    move-object/from16 v24, v4

    move-object/from16 v4, p3

    move-object/from16 v11, v20

    move-object/from16 v12, v22

    move-object/from16 v14, v23

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 56
    invoke-static/range {v0 .. v17}, Landroidx/compose/material3/SurfaceKt;->Surface-d85dljk(ZLv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2d
    move-object/from16 v7, v18

    move-object/from16 v5, v19

    move-object/from16 v8, v20

    move/from16 v6, v21

    move-object/from16 v9, v22

    move-object/from16 v10, v24

    .line 57
    :goto_21
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-eqz v15, :cond_2e

    new-instance v14, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$9;

    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v25, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButton$9;-><init>(Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;ZLv3/a;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SegmentedButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/p;Lv3/p;III)V

    move-object/from16 v0, v25

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    :cond_2e
    return-void
.end method

.method private static final SegmentedButtonContent(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[_][_]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    const v0, 0x5744b8e2

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
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_6

    .line 63
    .line 64
    const/4 v2, -0x1

    .line 65
    const-string v3, "androidx.compose.material3.SegmentedButtonContent (SegmentedButton.kt:321)"

    .line 66
    .line 67
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_6
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 77
    .line 78
    sget-object v2, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    .line 79
    .line 80
    invoke-virtual {v2}, Landroidx/compose/material3/ButtonDefaults;->getTextButtonContentPadding()Landroidx/compose/foundation/layout/PaddingValues;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/PaddingKt;->padding(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const v2, 0x2bb5b5d7

    .line 89
    .line 90
    .line 91
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 92
    .line 93
    .line 94
    const/4 v2, 0x0

    .line 95
    const/4 v3, 0x6

    .line 96
    invoke-static {v0, v2, p2, v3}, Landroidx/compose/foundation/layout/BoxKt;->rememberBoxMeasurePolicy(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const v4, -0x4ee9b9da

    .line 101
    .line 102
    .line 103
    invoke-interface {p2, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 104
    .line 105
    .line 106
    invoke-static {p2, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 115
    .line 116
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-static {v1}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    instance-of v8, v8, Landroidx/compose/runtime/Applier;

    .line 129
    .line 130
    if-nez v8, :cond_7

    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 133
    .line 134
    .line 135
    :cond_7
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 136
    .line 137
    .line 138
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-eqz v8, :cond_8

    .line 143
    .line 144
    invoke-interface {p2, v7}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_8
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 149
    .line 150
    .line 151
    :goto_4
    invoke-static {p2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-static {v7, v0, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v7, v5, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-nez v5, :cond_9

    .line 178
    .line 179
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-nez v5, :cond_a

    .line 192
    .line 193
    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-interface {v7, v4, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 205
    .line 206
    .line 207
    :cond_a
    invoke-static {p2}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-interface {v1, v0, p2, v2}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    const v0, 0x7ab4aae9

    .line 223
    .line 224
    .line 225
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 226
    .line 227
    .line 228
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 229
    .line 230
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 231
    .line 232
    invoke-virtual {v0, p2, v3}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    sget-object v1, Landroidx/compose/material3/tokens/OutlinedSegmentedButtonTokens;->INSTANCE:Landroidx/compose/material3/tokens/OutlinedSegmentedButtonTokens;

    .line 237
    .line 238
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/OutlinedSegmentedButtonTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-static {v0, v1}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    new-instance v1, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButtonContent$1$1;

    .line 247
    .line 248
    invoke-direct {v1, p0, p1}, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButtonContent$1$1;-><init>(Lv3/p;Lv3/p;)V

    .line 249
    .line 250
    .line 251
    const v2, 0x54ac860b

    .line 252
    .line 253
    .line 254
    const/4 v3, 0x1

    .line 255
    invoke-static {p2, v2, v3, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    const/16 v2, 0x30

    .line 260
    .line 261
    invoke-static {v0, v1, p2, v2}, Landroidx/compose/material3/TextKt;->ProvideTextStyle(Landroidx/compose/ui/text/TextStyle;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 262
    .line 263
    .line 264
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 265
    .line 266
    .line 267
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 268
    .line 269
    .line 270
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 271
    .line 272
    .line 273
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 274
    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_b

    .line 281
    .line 282
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 283
    .line 284
    .line 285
    :cond_b
    :goto_5
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    if-eqz p2, :cond_c

    .line 290
    .line 291
    new-instance v0, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButtonContent$2;

    .line 292
    .line 293
    invoke-direct {v0, p0, p1, p3}, Landroidx/compose/material3/SegmentedButtonKt$SegmentedButtonContent$2;-><init>(Lv3/p;Lv3/p;I)V

    .line 294
    .line 295
    .line 296
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 297
    .line 298
    .line 299
    :cond_c
    return-void
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

.method public static final SingleChoiceSegmentedButtonRow-uFdPcIQ(Landroidx/compose/ui/Modifier;FLv3/q;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Lv3/q;
        .annotation build Lp4/l;
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

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "F",
            "Lv3/q<",
            "-",
            "Landroidx/compose/material3/SingleChoiceSegmentedButtonRowScope;",
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
    const v0, -0x5aa6890a

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
    if-eqz v3, :cond_3

    .line 34
    .line 35
    or-int/lit8 v2, v2, 0x30

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    and-int/lit8 v4, p4, 0x30

    .line 39
    .line 40
    if-nez v4, :cond_5

    .line 41
    .line 42
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    const/16 v4, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    const/16 v4, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v2, v4

    .line 54
    :cond_5
    :goto_3
    and-int/lit8 v4, p5, 0x4

    .line 55
    .line 56
    if-eqz v4, :cond_6

    .line 57
    .line 58
    or-int/lit16 v2, v2, 0x180

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_6
    and-int/lit16 v4, p4, 0x180

    .line 62
    .line 63
    if-nez v4, :cond_8

    .line 64
    .line 65
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_7

    .line 70
    .line 71
    const/16 v4, 0x100

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_7
    const/16 v4, 0x80

    .line 75
    .line 76
    :goto_4
    or-int/2addr v2, v4

    .line 77
    :cond_8
    :goto_5
    and-int/lit16 v4, v2, 0x93

    .line 78
    .line 79
    const/16 v5, 0x92

    .line 80
    .line 81
    if-ne v4, v5, :cond_b

    .line 82
    .line 83
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-nez v4, :cond_9

    .line 88
    .line 89
    goto :goto_7

    .line 90
    :cond_9
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 91
    .line 92
    .line 93
    :cond_a
    :goto_6
    move-object v2, p0

    .line 94
    move v3, p1

    .line 95
    goto/16 :goto_9

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
    if-eqz v3, :cond_d

    .line 102
    .line 103
    sget-object p1, Landroidx/compose/material3/SegmentedButtonDefaults;->INSTANCE:Landroidx/compose/material3/SegmentedButtonDefaults;

    .line 104
    .line 105
    invoke-virtual {p1}, Landroidx/compose/material3/SegmentedButtonDefaults;->getBorderWidth-D9Ej5fM()F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    :cond_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_e

    .line 114
    .line 115
    const/4 v1, -0x1

    .line 116
    const-string v3, "androidx.compose.material3.SingleChoiceSegmentedButtonRow (SegmentedButton.kt:265)"

    .line 117
    .line 118
    invoke-static {v0, v2, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_e
    invoke-static {p0}, Landroidx/compose/foundation/selection/SelectableGroupKt;->selectableGroup(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sget-object v1, Landroidx/compose/material3/tokens/OutlinedSegmentedButtonTokens;->INSTANCE:Landroidx/compose/material3/tokens/OutlinedSegmentedButtonTokens;

    .line 126
    .line 127
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/OutlinedSegmentedButtonTokens;->getContainerHeight-D9Ej5fM()F

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    const/4 v3, 0x0

    .line 132
    const/4 v4, 0x0

    .line 133
    const/4 v5, 0x1

    .line 134
    invoke-static {v0, v4, v1, v5, v3}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sget-object v1, Landroidx/compose/foundation/layout/IntrinsicSize;->Min:Landroidx/compose/foundation/layout/IntrinsicSize;

    .line 139
    .line 140
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/IntrinsicKt;->width(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/IntrinsicSize;)Landroidx/compose/ui/Modifier;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 145
    .line 146
    neg-float v3, p1

    .line 147
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    invoke-virtual {v1, v3}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 156
    .line 157
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    const v4, 0x2952b718

    .line 162
    .line 163
    .line 164
    invoke-interface {p3, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 165
    .line 166
    .line 167
    const/16 v4, 0x30

    .line 168
    .line 169
    invoke-static {v1, v3, p3, v4}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const v3, -0x4ee9b9da

    .line 174
    .line 175
    .line 176
    invoke-interface {p3, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 177
    .line 178
    .line 179
    const/4 v3, 0x0

    .line 180
    invoke-static {p3, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 189
    .line 190
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lv3/a;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->modifierMaterializerOf(Landroidx/compose/ui/Modifier;)Lv3/q;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    instance-of v8, v8, Landroidx/compose/runtime/Applier;

    .line 203
    .line 204
    if-nez v8, :cond_f

    .line 205
    .line 206
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 207
    .line 208
    .line 209
    :cond_f
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 210
    .line 211
    .line 212
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-eqz v8, :cond_10

    .line 217
    .line 218
    invoke-interface {p3, v7}, Landroidx/compose/runtime/Composer;->createNode(Lv3/a;)V

    .line 219
    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_10
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 223
    .line 224
    .line 225
    :goto_8
    invoke-static {p3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lv3/p;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    invoke-static {v7, v1, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lv3/p;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-static {v7, v5, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lv3/p;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lv3/p;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-nez v5, :cond_11

    .line 252
    .line 253
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-nez v5, :cond_12

    .line 266
    .line 267
    :cond_11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    invoke-interface {v7, v4, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lv3/p;)V

    .line 279
    .line 280
    .line 281
    :cond_12
    invoke-static {p3}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-static {v1}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-interface {v0, v1, p3, v3}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    const v0, 0x7ab4aae9

    .line 297
    .line 298
    .line 299
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 300
    .line 301
    .line 302
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 303
    .line 304
    const v1, -0xad2d5b0

    .line 305
    .line 306
    .line 307
    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 308
    .line 309
    .line 310
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 315
    .line 316
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    if-ne v1, v3, :cond_13

    .line 321
    .line 322
    new-instance v1, Landroidx/compose/material3/SingleChoiceSegmentedButtonScopeWrapper;

    .line 323
    .line 324
    invoke-direct {v1, v0}, Landroidx/compose/material3/SingleChoiceSegmentedButtonScopeWrapper;-><init>(Landroidx/compose/foundation/layout/RowScope;)V

    .line 325
    .line 326
    .line 327
    invoke-interface {p3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    :cond_13
    check-cast v1, Landroidx/compose/material3/SingleChoiceSegmentedButtonScopeWrapper;

    .line 331
    .line 332
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 333
    .line 334
    .line 335
    shr-int/lit8 v0, v2, 0x3

    .line 336
    .line 337
    and-int/lit8 v0, v0, 0x70

    .line 338
    .line 339
    or-int/lit8 v0, v0, 0x6

    .line 340
    .line 341
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-interface {p2, v1, p3, v0}, Lv3/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 349
    .line 350
    .line 351
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 352
    .line 353
    .line 354
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 355
    .line 356
    .line 357
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 358
    .line 359
    .line 360
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-eqz v0, :cond_a

    .line 365
    .line 366
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_6

    .line 370
    .line 371
    :goto_9
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    if-eqz p0, :cond_14

    .line 376
    .line 377
    new-instance p1, Landroidx/compose/material3/SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2;

    .line 378
    .line 379
    move-object v1, p1

    .line 380
    move-object v4, p2

    .line 381
    move v5, p4

    .line 382
    move v6, p5

    .line 383
    invoke-direct/range {v1 .. v6}, Landroidx/compose/material3/SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2;-><init>(Landroidx/compose/ui/Modifier;FLv3/q;II)V

    .line 384
    .line 385
    .line 386
    invoke-interface {p0, p1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lv3/p;)V

    .line 387
    .line 388
    .line 389
    :cond_14
    return-void
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

.method public static final synthetic access$SegmentedButtonContent(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/material3/SegmentedButtonKt;->SegmentedButtonContent(Lv3/p;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$getIconSpacing$p()F
    .locals 1

    sget v0, Landroidx/compose/material3/SegmentedButtonKt;->IconSpacing:F

    return v0
.end method

.method private static final interactionCountAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
    .locals 6
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const v0, 0x10cd4d53

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    const-string v2, "androidx.compose.material3.interactionCountAsState (SegmentedButton.kt:398)"

    .line 15
    .line 16
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const v0, -0x51cb65e9

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/4 v3, 0x0

    .line 36
    if-ne v0, v2, :cond_1

    .line 37
    .line 38
    invoke-static {v3}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    check-cast v0, Landroidx/compose/runtime/MutableIntState;

    .line 46
    .line 47
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 48
    .line 49
    .line 50
    const v2, -0x51cb65ae

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 54
    .line 55
    .line 56
    and-int/lit8 v2, p2, 0xe

    .line 57
    .line 58
    xor-int/lit8 v4, v2, 0x6

    .line 59
    .line 60
    const/4 v5, 0x4

    .line 61
    if-le v4, v5, :cond_2

    .line 62
    .line 63
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    :cond_2
    and-int/lit8 p2, p2, 0x6

    .line 70
    .line 71
    if-ne p2, v5, :cond_4

    .line 72
    .line 73
    :cond_3
    const/4 v3, 0x1

    .line 74
    :cond_4
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-nez v3, :cond_5

    .line 79
    .line 80
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    if-ne p2, v1, :cond_6

    .line 85
    .line 86
    :cond_5
    new-instance p2, Landroidx/compose/material3/SegmentedButtonKt$interactionCountAsState$1$1;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    invoke-direct {p2, p0, v0, v1}, Landroidx/compose/material3/SegmentedButtonKt$interactionCountAsState$1$1;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/MutableIntState;Lkotlin/coroutines/d;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    check-cast p2, Lv3/p;

    .line 96
    .line 97
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 98
    .line 99
    .line 100
    invoke-static {p0, p2, p1, v2}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/Composer;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_7

    .line 108
    .line 109
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 110
    .line 111
    .line 112
    :cond_7
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 113
    .line 114
    .line 115
    return-object v0
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
.end method

.method private static final interactionZIndex(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    new-instance v0, Landroidx/compose/material3/SegmentedButtonKt$interactionZIndex$1;

    invoke-direct {v0, p2, p1}, Landroidx/compose/material3/SegmentedButtonKt$interactionZIndex$1;-><init>(Landroidx/compose/runtime/State;Z)V

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/LayoutModifierKt;->layout(Landroidx/compose/ui/Modifier;Lv3/q;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
