.class public final Landroidx/compose/foundation/text/modifiers/SelectionController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/RememberObserver;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\"\u0010#J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0002H\u0016J\u000e\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/foundation/text/modifiers/SelectionController;",
        "Landroidx/compose/runtime/RememberObserver;",
        "Lkotlin/r2;",
        "onRemembered",
        "onForgotten",
        "onAbandoned",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "textLayoutResult",
        "updateTextLayout",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "coordinates",
        "updateGlobalPosition",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "drawScope",
        "draw",
        "",
        "selectableId",
        "J",
        "Landroidx/compose/foundation/text/selection/SelectionRegistrar;",
        "selectionRegistrar",
        "Landroidx/compose/foundation/text/selection/SelectionRegistrar;",
        "Landroidx/compose/ui/graphics/Color;",
        "backgroundSelectionColor",
        "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;",
        "params",
        "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;",
        "Landroidx/compose/foundation/text/selection/Selectable;",
        "selectable",
        "Landroidx/compose/foundation/text/selection/Selectable;",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "getModifier",
        "()Landroidx/compose/ui/Modifier;",
        "<init>",
        "(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/w;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,339:1\n215#2,8:340\n262#2,11:348\n*S KotlinDebug\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n*L\n147#1:340,8\n147#1:348,11\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final backgroundSelectionColor:J

.field private final modifier:Landroidx/compose/ui/Modifier;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private params:Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private selectable:Landroidx/compose/foundation/text/selection/Selectable;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final selectableId:J

.field private final selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectableId:J

    .line 3
    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    .line 4
    iput-wide p4, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->backgroundSelectionColor:J

    .line 5
    iput-object p6, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->params:Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    .line 6
    new-instance p4, Landroidx/compose/foundation/text/modifiers/SelectionController$modifier$1;

    invoke-direct {p4, p0}, Landroidx/compose/foundation/text/modifiers/SelectionController$modifier$1;-><init>(Landroidx/compose/foundation/text/modifiers/SelectionController;)V

    invoke-static {p3, p1, p2, p4}, Landroidx/compose/foundation/text/modifiers/SelectionControllerKt;->access$makeSelectionModifier(Landroidx/compose/foundation/text/selection/SelectionRegistrar;JLv3/a;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    .line 7
    invoke-static {p1, p3}, Landroidx/compose/foundation/text/BasicText_androidKt;->textPointerHoverIcon(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/SelectionRegistrar;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->modifier:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public synthetic constructor <init>(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;ILkotlin/jvm/internal/w;)V
    .locals 9

    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_0

    .line 8
    sget-object v0, Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;->Companion:Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams$Companion;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams$Companion;->getEmpty()Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object v7, p6

    :goto_0
    const/4 v8, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-wide v5, p4

    .line 9
    invoke-direct/range {v1 .. v8}, Landroidx/compose/foundation/text/modifiers/SelectionController;-><init>(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/w;)V

    return-void
.end method

.method public synthetic constructor <init>(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/text/modifiers/SelectionController;-><init>(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;)V

    return-void
.end method

.method public static final synthetic access$getParams$p(Landroidx/compose/foundation/text/modifiers/SelectionController;)Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->params:Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    return-object p0
.end method


# virtual methods
.method public final draw(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 13
    .param p1    # Landroidx/compose/ui/graphics/drawscope/DrawScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/foundation/text/selection/SelectionRegistrar;->getSubselections()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectableId:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/compose/foundation/text/selection/Selection;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getHandlesCrossed()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    :goto_0
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getHandlesCrossed()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getEnd()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection;->getStart()Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;->getOffset()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    :goto_1
    if-ne v1, v0, :cond_3

    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectable:Landroidx/compose/foundation/text/selection/Selectable;

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    invoke-interface {v2}, Landroidx/compose/foundation/text/selection/Selectable;->getLastVisibleOffset()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    const/4 v2, 0x0

    .line 81
    :goto_2
    invoke-static {v1, v2}, Lkotlin/ranges/s;->B(II)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v0, v2}, Lkotlin/ranges/s;->B(II)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->params:Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    .line 90
    .line 91
    invoke-virtual {v2, v1, v0}, Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;->getPathForRange(II)Landroidx/compose/ui/graphics/Path;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    if-nez v4, :cond_5

    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->params:Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;->getShouldClip()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    const/4 v7, 0x0

    .line 108
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    sget-object v0, Landroidx/compose/ui/graphics/ClipOp;->Companion:Landroidx/compose/ui/graphics/ClipOp$Companion;

    .line 125
    .line 126
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/ClipOp$Companion;->getIntersect-rtfAjoo()I

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getSize-NH-jbRc()J

    .line 135
    .line 136
    .line 137
    move-result-wide v1

    .line 138
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-interface {v3}, Landroidx/compose/ui/graphics/Canvas;->save()V

    .line 143
    .line 144
    .line 145
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-interface/range {v5 .. v10}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->clipRect-N_I0leg(FFFFI)V

    .line 150
    .line 151
    .line 152
    iget-wide v5, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->backgroundSelectionColor:J

    .line 153
    .line 154
    const/4 v8, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    const/4 v10, 0x0

    .line 157
    const/16 v11, 0x3c

    .line 158
    .line 159
    const/4 v12, 0x0

    .line 160
    move-object v3, p1

    .line 161
    invoke-static/range {v3 .. v12}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-LG529CI$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getCanvas()Landroidx/compose/ui/graphics/Canvas;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-interface {p1}, Landroidx/compose/ui/graphics/Canvas;->restore()V

    .line 169
    .line 170
    .line 171
    invoke-interface {v0, v1, v2}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->setSize-uvyYCjk(J)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    iget-wide v5, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->backgroundSelectionColor:J

    .line 176
    .line 177
    const/4 v7, 0x0

    .line 178
    const/4 v8, 0x0

    .line 179
    const/4 v9, 0x0

    .line 180
    const/4 v10, 0x0

    .line 181
    const/16 v11, 0x3c

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    move-object v3, p1

    .line 185
    invoke-static/range {v3 .. v12}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-LG529CI$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :goto_3
    return-void
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
.end method

.method public final getModifier()Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->modifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public onAbandoned()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectable:Landroidx/compose/foundation/text/selection/Selectable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Landroidx/compose/foundation/text/selection/SelectionRegistrar;->unsubscribe(Landroidx/compose/foundation/text/selection/Selectable;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectable:Landroidx/compose/foundation/text/selection/Selectable;

    .line 12
    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public onForgotten()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectable:Landroidx/compose/foundation/text/selection/Selectable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Landroidx/compose/foundation/text/selection/SelectionRegistrar;->unsubscribe(Landroidx/compose/foundation/text/selection/Selectable;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectable:Landroidx/compose/foundation/text/selection/Selectable;

    .line 12
    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public onRemembered()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;

    .line 4
    .line 5
    iget-wide v2, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectableId:J

    .line 6
    .line 7
    new-instance v4, Landroidx/compose/foundation/text/modifiers/SelectionController$onRemembered$1;

    .line 8
    .line 9
    invoke-direct {v4, p0}, Landroidx/compose/foundation/text/modifiers/SelectionController$onRemembered$1;-><init>(Landroidx/compose/foundation/text/modifiers/SelectionController;)V

    .line 10
    .line 11
    .line 12
    new-instance v5, Landroidx/compose/foundation/text/modifiers/SelectionController$onRemembered$2;

    .line 13
    .line 14
    invoke-direct {v5, p0}, Landroidx/compose/foundation/text/modifiers/SelectionController$onRemembered$2;-><init>(Landroidx/compose/foundation/text/modifiers/SelectionController;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2, v3, v4, v5}, Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;-><init>(JLv3/a;Lv3/a;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrar;->subscribe(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectable:Landroidx/compose/foundation/text/selection/Selectable;

    .line 25
    .line 26
    return-void
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
.end method

.method public final updateGlobalPosition(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 3
    .param p1    # Landroidx/compose/ui/layout/LayoutCoordinates;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->params:Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-static {v0, p1, v1, v2, v1}, Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;->copy$default(Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/TextLayoutResult;ILjava/lang/Object;)Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->params:Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectionRegistrar:Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    .line 12
    .line 13
    iget-wide v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->selectableId:J

    .line 14
    .line 15
    invoke-interface {p1, v0, v1}, Landroidx/compose/foundation/text/selection/SelectionRegistrar;->notifyPositionChange(J)V

    .line 16
    .line 17
    .line 18
    return-void
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
.end method

.method public final updateTextLayout(Landroidx/compose/ui/text/TextLayoutResult;)V
    .locals 3
    .param p1    # Landroidx/compose/ui/text/TextLayoutResult;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->params:Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, p1, v2, v1}, Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;->copy$default(Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/TextLayoutResult;ILjava/lang/Object;)Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/SelectionController;->params:Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;

    return-void
.end method
