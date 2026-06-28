.class final Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/TextFieldImplKt;->CommonDecorationBox(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lv3/p;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lv3/p;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/t<",
        "Ljava/lang/Float;",
        "Landroidx/compose/ui/graphics/Color;",
        "Landroidx/compose/ui/graphics/Color;",
        "Ljava/lang/Float;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "labelProgress",
        "Landroidx/compose/ui/graphics/Color;",
        "labelTextStyleColor",
        "labelContentColor",
        "placeholderAlphaProgress",
        "Lkotlin/r2;",
        "invoke-RIQooxk",
        "(FJJFLandroidx/compose/runtime/Composer;I)V",
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
        "SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,369:1\n25#2:370\n1116#3,6:371\n1116#3,6:377\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n*L\n178#1:370\n178#1:371,6\n196#1:377,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $border:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $colors:Landroidx/compose/material/TextFieldColors;

.field final synthetic $contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field final synthetic $enabled:Z

.field final synthetic $innerTextField:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $interactionSource:Landroidx/compose/foundation/interaction/InteractionSource;

.field final synthetic $isError:Z

.field final synthetic $label:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $leadingIcon:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $placeholder:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shouldOverrideTextStyleColor:Z

.field final synthetic $singleLine:Z

.field final synthetic $trailingIcon:Lv3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/p<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $transformedText:Ljava/lang/String;

.field final synthetic $type:Landroidx/compose/material/TextFieldType;


# direct methods
.method constructor <init>(Lv3/p;Lv3/p;Ljava/lang/String;Landroidx/compose/material/TextFieldColors;ZZLandroidx/compose/foundation/interaction/InteractionSource;Lv3/p;Lv3/p;Landroidx/compose/material/TextFieldType;Lv3/p;ZLandroidx/compose/foundation/layout/PaddingValues;ZLv3/p;)V
    .locals 0
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
            "Ljava/lang/String;",
            "Landroidx/compose/material/TextFieldColors;",
            "ZZ",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
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
            "Landroidx/compose/material/TextFieldType;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;Z",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Lv3/p<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$label:Lv3/p;

    iput-object p2, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$placeholder:Lv3/p;

    iput-object p3, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$transformedText:Ljava/lang/String;

    iput-object p4, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$colors:Landroidx/compose/material/TextFieldColors;

    iput-boolean p5, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$enabled:Z

    iput-boolean p6, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$isError:Z

    iput-object p7, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$interactionSource:Landroidx/compose/foundation/interaction/InteractionSource;

    iput-object p8, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$leadingIcon:Lv3/p;

    iput-object p9, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$trailingIcon:Lv3/p;

    iput-object p10, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$type:Landroidx/compose/material/TextFieldType;

    iput-object p11, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$innerTextField:Lv3/p;

    iput-boolean p12, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$singleLine:Z

    iput-object p13, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    iput-boolean p14, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$shouldOverrideTextStyleColor:Z

    iput-object p15, p0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$border:Lv3/p;

    const/4 p1, 0x6

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    check-cast p2, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v2

    check-cast p3, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {p3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v4

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    move-result v6

    move-object v7, p5

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p6, Ljava/lang/Number;

    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->invoke-RIQooxk(FJJFLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke-RIQooxk(FJJFLandroidx/compose/runtime/Composer;I)V
    .locals 18
    .param p7    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v9, p1

    .line 4
    .line 5
    move/from16 v10, p6

    .line 6
    .line 7
    move-object/from16 v15, p7

    .line 8
    .line 9
    move/from16 v1, p8

    .line 10
    .line 11
    and-int/lit8 v2, v1, 0xe

    .line 12
    .line 13
    const/4 v11, 0x2

    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v11

    .line 25
    :goto_0
    or-int/2addr v2, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v2, v1

    .line 28
    :goto_1
    and-int/lit8 v3, v1, 0x70

    .line 29
    .line 30
    move-wide/from16 v7, p2

    .line 31
    .line 32
    if-nez v3, :cond_3

    .line 33
    .line 34
    invoke-interface {v15, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    const/16 v3, 0x20

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/16 v3, 0x10

    .line 44
    .line 45
    :goto_2
    or-int/2addr v2, v3

    .line 46
    :cond_3
    and-int/lit16 v3, v1, 0x380

    .line 47
    .line 48
    if-nez v3, :cond_5

    .line 49
    .line 50
    move-wide/from16 v3, p4

    .line 51
    .line 52
    invoke-interface {v15, v3, v4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_4

    .line 57
    .line 58
    const/16 v5, 0x100

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    const/16 v5, 0x80

    .line 62
    .line 63
    :goto_3
    or-int/2addr v2, v5

    .line 64
    goto :goto_4

    .line 65
    :cond_5
    move-wide/from16 v3, p4

    .line 66
    .line 67
    :goto_4
    and-int/lit16 v1, v1, 0x1c00

    .line 68
    .line 69
    if-nez v1, :cond_7

    .line 70
    .line 71
    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_6

    .line 76
    .line 77
    const/16 v1, 0x800

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_6
    const/16 v1, 0x400

    .line 81
    .line 82
    :goto_5
    or-int/2addr v2, v1

    .line 83
    :cond_7
    move v12, v2

    .line 84
    const v1, 0xb6db

    .line 85
    .line 86
    .line 87
    and-int/2addr v1, v12

    .line 88
    const/16 v2, 0x2492

    .line 89
    .line 90
    if-ne v1, v2, :cond_9

    .line 91
    .line 92
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_8

    .line 97
    .line 98
    goto :goto_6

    .line 99
    :cond_8
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_d

    .line 103
    .line 104
    :cond_9
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_a

    .line 109
    .line 110
    const/4 v1, -0x1

    .line 111
    const-string v2, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:119)"

    .line 112
    .line 113
    const v5, 0x146073d8

    .line 114
    .line 115
    .line 116
    invoke-static {v5, v12, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_a
    iget-object v5, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$label:Lv3/p;

    .line 120
    .line 121
    const/4 v14, 0x1

    .line 122
    if-eqz v5, :cond_b

    .line 123
    .line 124
    iget-boolean v6, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$shouldOverrideTextStyleColor:Z

    .line 125
    .line 126
    new-instance v2, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1;

    .line 127
    .line 128
    move-object v1, v2

    .line 129
    move-object v13, v2

    .line 130
    move/from16 v2, p1

    .line 131
    .line 132
    move-wide/from16 v3, p4

    .line 133
    .line 134
    move-wide/from16 v7, p2

    .line 135
    .line 136
    invoke-direct/range {v1 .. v8}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1;-><init>(FJLv3/p;ZJ)V

    .line 137
    .line 138
    .line 139
    const v1, 0x15a0dc9e

    .line 140
    .line 141
    .line 142
    invoke-static {v15, v1, v14, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    move-object v7, v1

    .line 147
    goto :goto_7

    .line 148
    :cond_b
    const/4 v7, 0x0

    .line 149
    :goto_7
    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$placeholder:Lv3/p;

    .line 150
    .line 151
    if-eqz v1, :cond_d

    .line 152
    .line 153
    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$transformedText:Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_c

    .line 160
    .line 161
    move v1, v14

    .line 162
    goto :goto_8

    .line 163
    :cond_c
    const/4 v1, 0x0

    .line 164
    :goto_8
    if-eqz v1, :cond_d

    .line 165
    .line 166
    const/4 v1, 0x0

    .line 167
    cmpl-float v1, v10, v1

    .line 168
    .line 169
    if-lez v1, :cond_d

    .line 170
    .line 171
    new-instance v1, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1;

    .line 172
    .line 173
    iget-object v2, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$colors:Landroidx/compose/material/TextFieldColors;

    .line 174
    .line 175
    iget-boolean v3, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$enabled:Z

    .line 176
    .line 177
    iget-object v4, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$placeholder:Lv3/p;

    .line 178
    .line 179
    invoke-direct {v1, v10, v2, v3, v4}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1;-><init>(FLandroidx/compose/material/TextFieldColors;ZLv3/p;)V

    .line 180
    .line 181
    .line 182
    const v2, 0x42ca46ca

    .line 183
    .line 184
    .line 185
    invoke-static {v15, v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    move-object v8, v1

    .line 190
    goto :goto_9

    .line 191
    :cond_d
    const/4 v8, 0x0

    .line 192
    :goto_9
    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$colors:Landroidx/compose/material/TextFieldColors;

    .line 193
    .line 194
    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$enabled:Z

    .line 195
    .line 196
    iget-boolean v3, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$isError:Z

    .line 197
    .line 198
    iget-object v4, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$interactionSource:Landroidx/compose/foundation/interaction/InteractionSource;

    .line 199
    .line 200
    const/4 v6, 0x0

    .line 201
    move-object/from16 v5, p7

    .line 202
    .line 203
    invoke-interface/range {v1 .. v6}, Landroidx/compose/material/TextFieldColors;->leadingIconColor(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Landroidx/compose/ui/graphics/Color;

    .line 212
    .line 213
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 214
    .line 215
    .line 216
    move-result-wide v1

    .line 217
    iget-object v3, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$leadingIcon:Lv3/p;

    .line 218
    .line 219
    if-eqz v3, :cond_e

    .line 220
    .line 221
    new-instance v4, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1;

    .line 222
    .line 223
    invoke-direct {v4, v1, v2, v3}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1;-><init>(JLv3/p;)V

    .line 224
    .line 225
    .line 226
    const v1, 0x59b977f0

    .line 227
    .line 228
    .line 229
    invoke-static {v15, v1, v14, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    move-object v10, v1

    .line 234
    goto :goto_a

    .line 235
    :cond_e
    const/4 v10, 0x0

    .line 236
    :goto_a
    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$colors:Landroidx/compose/material/TextFieldColors;

    .line 237
    .line 238
    iget-boolean v2, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$enabled:Z

    .line 239
    .line 240
    iget-boolean v3, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$isError:Z

    .line 241
    .line 242
    iget-object v4, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$interactionSource:Landroidx/compose/foundation/interaction/InteractionSource;

    .line 243
    .line 244
    const/4 v6, 0x0

    .line 245
    move-object/from16 v5, p7

    .line 246
    .line 247
    invoke-interface/range {v1 .. v6}, Landroidx/compose/material/TextFieldColors;->trailingIconColor(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    check-cast v1, Landroidx/compose/ui/graphics/Color;

    .line 256
    .line 257
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 258
    .line 259
    .line 260
    move-result-wide v1

    .line 261
    iget-object v3, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$trailingIcon:Lv3/p;

    .line 262
    .line 263
    if-eqz v3, :cond_f

    .line 264
    .line 265
    new-instance v4, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1;

    .line 266
    .line 267
    invoke-direct {v4, v1, v2, v3}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1;-><init>(JLv3/p;)V

    .line 268
    .line 269
    .line 270
    const v1, -0x70ef3e1c

    .line 271
    .line 272
    .line 273
    invoke-static {v15, v1, v14, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    move-object v6, v1

    .line 278
    goto :goto_b

    .line 279
    :cond_f
    const/4 v6, 0x0

    .line 280
    :goto_b
    iget-object v1, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$type:Landroidx/compose/material/TextFieldType;

    .line 281
    .line 282
    sget-object v2, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    aget v1, v2, v1

    .line 289
    .line 290
    if-eq v1, v14, :cond_14

    .line 291
    .line 292
    if-eq v1, v11, :cond_10

    .line 293
    .line 294
    const v1, -0x4090408f

    .line 295
    .line 296
    .line 297
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 298
    .line 299
    .line 300
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_c

    .line 304
    .line 305
    :cond_10
    const v1, -0x40904651

    .line 306
    .line 307
    .line 308
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 309
    .line 310
    .line 311
    const v1, -0x1d58f75c

    .line 312
    .line 313
    .line 314
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 315
    .line 316
    .line 317
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 322
    .line 323
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    if-ne v1, v4, :cond_11

    .line 328
    .line 329
    sget-object v1, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 330
    .line 331
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    .line 332
    .line 333
    .line 334
    move-result-wide v4

    .line 335
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Size;->box-impl(J)Landroidx/compose/ui/geometry/Size;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    const/4 v4, 0x0

    .line 340
    invoke-static {v1, v4, v11, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :cond_11
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 348
    .line 349
    .line 350
    check-cast v1, Landroidx/compose/runtime/MutableState;

    .line 351
    .line 352
    new-instance v4, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$drawBorder$1;

    .line 353
    .line 354
    iget-object v5, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 355
    .line 356
    iget-object v11, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$border:Lv3/p;

    .line 357
    .line 358
    invoke-direct {v4, v1, v5, v11}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$drawBorder$1;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/PaddingValues;Lv3/p;)V

    .line 359
    .line 360
    .line 361
    const v5, 0x8568183

    .line 362
    .line 363
    .line 364
    invoke-static {v15, v5, v14, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 365
    .line 366
    .line 367
    move-result-object v11

    .line 368
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 369
    .line 370
    iget-object v5, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$innerTextField:Lv3/p;

    .line 371
    .line 372
    iget-boolean v13, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$singleLine:Z

    .line 373
    .line 374
    const v14, -0x3be55bf9

    .line 375
    .line 376
    .line 377
    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 381
    .line 382
    .line 383
    move-result v14

    .line 384
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v16

    .line 388
    or-int v14, v14, v16

    .line 389
    .line 390
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    if-nez v14, :cond_12

    .line 395
    .line 396
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    if-ne v2, v3, :cond_13

    .line 401
    .line 402
    :cond_12
    new-instance v2, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$1$1;

    .line 403
    .line 404
    invoke-direct {v2, v9, v1}, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$1$1;-><init>(FLandroidx/compose/runtime/MutableState;)V

    .line 405
    .line 406
    .line 407
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    :cond_13
    move-object v14, v2

    .line 411
    check-cast v14, Lv3/l;

    .line 412
    .line 413
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 414
    .line 415
    .line 416
    iget-object v3, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 417
    .line 418
    shl-int/lit8 v1, v12, 0x15

    .line 419
    .line 420
    const/high16 v2, 0x1c00000

    .line 421
    .line 422
    and-int/2addr v1, v2

    .line 423
    const v2, 0x30000006

    .line 424
    .line 425
    .line 426
    or-int v16, v1, v2

    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    move-object v1, v4

    .line 431
    move-object v2, v5

    .line 432
    move-object v12, v3

    .line 433
    move-object v3, v8

    .line 434
    move-object v4, v7

    .line 435
    move-object v5, v10

    .line 436
    move v7, v13

    .line 437
    move/from16 v8, p1

    .line 438
    .line 439
    move-object v9, v14

    .line 440
    move-object v10, v11

    .line 441
    move-object v11, v12

    .line 442
    move-object/from16 v12, p7

    .line 443
    .line 444
    move/from16 v13, v16

    .line 445
    .line 446
    move/from16 v14, v17

    .line 447
    .line 448
    invoke-static/range {v1 .. v14}, Landroidx/compose/material/OutlinedTextFieldKt;->OutlinedTextFieldLayout(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/p;Lv3/p;Lv3/p;ZFLv3/l;Lv3/p;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V

    .line 449
    .line 450
    .line 451
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 452
    .line 453
    .line 454
    goto :goto_c

    .line 455
    :cond_14
    const v1, -0x40904870

    .line 456
    .line 457
    .line 458
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 459
    .line 460
    .line 461
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 462
    .line 463
    iget-object v2, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$innerTextField:Lv3/p;

    .line 464
    .line 465
    iget-boolean v11, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$singleLine:Z

    .line 466
    .line 467
    iget-object v13, v0, Landroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3;->$contentPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 468
    .line 469
    shl-int/lit8 v3, v12, 0x15

    .line 470
    .line 471
    const/high16 v4, 0x1c00000

    .line 472
    .line 473
    and-int/2addr v3, v4

    .line 474
    or-int/lit8 v12, v3, 0x6

    .line 475
    .line 476
    move-object v3, v7

    .line 477
    move-object v4, v8

    .line 478
    move-object v5, v10

    .line 479
    move v7, v11

    .line 480
    move/from16 v8, p1

    .line 481
    .line 482
    move-object v9, v13

    .line 483
    move-object/from16 v10, p7

    .line 484
    .line 485
    move v11, v12

    .line 486
    invoke-static/range {v1 .. v11}, Landroidx/compose/material/TextFieldKt;->TextFieldLayout(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/q;Lv3/p;Lv3/p;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V

    .line 487
    .line 488
    .line 489
    invoke-interface/range {p7 .. p7}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 490
    .line 491
    .line 492
    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    if-eqz v1, :cond_15

    .line 497
    .line 498
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 499
    .line 500
    .line 501
    :cond_15
    :goto_d
    return-void
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
.end method
