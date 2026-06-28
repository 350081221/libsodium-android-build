.class public Lcom/google/android/material/color/utilities/Scheme;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation runtime Lo1/b;
.end annotation


# instance fields
.field private background:I

.field private error:I

.field private errorContainer:I

.field private inverseOnSurface:I

.field private inversePrimary:I

.field private inverseSurface:I

.field private onBackground:I

.field private onError:I

.field private onErrorContainer:I

.field private onPrimary:I

.field private onPrimaryContainer:I

.field private onSecondary:I

.field private onSecondaryContainer:I

.field private onSurface:I

.field private onSurfaceVariant:I

.field private onTertiary:I

.field private onTertiaryContainer:I

.field private outline:I

.field private outlineVariant:I

.field private primary:I

.field private primaryContainer:I

.field private scrim:I

.field private secondary:I

.field private secondaryContainer:I

.field private shadow:I

.field private surface:I

.field private surfaceVariant:I

.field private tertiary:I

.field private tertiaryContainer:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIIIIIIIIIIIIIIIIIII)V
    .locals 2

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    .line 3
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->primary:I

    move v1, p2

    .line 4
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onPrimary:I

    move v1, p3

    .line 5
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->primaryContainer:I

    move v1, p4

    .line 6
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onPrimaryContainer:I

    move v1, p5

    .line 7
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->secondary:I

    move v1, p6

    .line 8
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onSecondary:I

    move v1, p7

    .line 9
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->secondaryContainer:I

    move v1, p8

    .line 10
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onSecondaryContainer:I

    move v1, p9

    .line 11
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->tertiary:I

    move v1, p10

    .line 12
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onTertiary:I

    move v1, p11

    .line 13
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->tertiaryContainer:I

    move v1, p12

    .line 14
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onTertiaryContainer:I

    move v1, p13

    .line 15
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->error:I

    move/from16 v1, p14

    .line 16
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onError:I

    move/from16 v1, p15

    .line 17
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->errorContainer:I

    move/from16 v1, p16

    .line 18
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onErrorContainer:I

    move/from16 v1, p17

    .line 19
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->background:I

    move/from16 v1, p18

    .line 20
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onBackground:I

    move/from16 v1, p19

    .line 21
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->surface:I

    move/from16 v1, p20

    .line 22
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onSurface:I

    move/from16 v1, p21

    .line 23
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->surfaceVariant:I

    move/from16 v1, p22

    .line 24
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->onSurfaceVariant:I

    move/from16 v1, p23

    .line 25
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->outline:I

    move/from16 v1, p24

    .line 26
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->outlineVariant:I

    move/from16 v1, p25

    .line 27
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->shadow:I

    move/from16 v1, p26

    .line 28
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->scrim:I

    move/from16 v1, p27

    .line 29
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->inverseSurface:I

    move/from16 v1, p28

    .line 30
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->inverseOnSurface:I

    move/from16 v1, p29

    .line 31
    iput v1, v0, Lcom/google/android/material/color/utilities/Scheme;->inversePrimary:I

    return-void
.end method

.method public static dark(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0

    invoke-static {p0}, Lcom/google/android/material/color/utilities/CorePalette;->of(I)Lcom/google/android/material/color/utilities/CorePalette;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/material/color/utilities/Scheme;->darkFromCorePalette(Lcom/google/android/material/color/utilities/CorePalette;)Lcom/google/android/material/color/utilities/Scheme;

    move-result-object p0

    return-object p0
.end method

.method public static darkContent(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0

    invoke-static {p0}, Lcom/google/android/material/color/utilities/CorePalette;->contentOf(I)Lcom/google/android/material/color/utilities/CorePalette;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/material/color/utilities/Scheme;->darkFromCorePalette(Lcom/google/android/material/color/utilities/CorePalette;)Lcom/google/android/material/color/utilities/Scheme;

    move-result-object p0

    return-object p0
.end method

.method private static darkFromCorePalette(Lcom/google/android/material/color/utilities/CorePalette;)Lcom/google/android/material/color/utilities/Scheme;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/android/material/color/utilities/Scheme;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/Scheme;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 7
    .line 8
    const/16 v2, 0x50

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withPrimary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 19
    .line 20
    const/16 v3, 0x14

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnPrimary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 31
    .line 32
    const/16 v4, 0x1e

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withPrimaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 43
    .line 44
    const/16 v5, 0x5a

    .line 45
    .line 46
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnPrimaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withSecondary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 65
    .line 66
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnSecondary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 75
    .line 76
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withSecondaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 85
    .line 86
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnSecondaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a3:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withTertiary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a3:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 105
    .line 106
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnTertiary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a3:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 115
    .line 116
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withTertiaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a3:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 125
    .line 126
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnTertiaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->error:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 135
    .line 136
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withError(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->error:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 145
    .line 146
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnError(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->error:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 155
    .line 156
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withErrorContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->error:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 165
    .line 166
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnErrorContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 175
    .line 176
    const/16 v6, 0xa

    .line 177
    .line 178
    invoke-virtual {v1, v6}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withBackground(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 187
    .line 188
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnBackground(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 197
    .line 198
    invoke-virtual {v1, v6}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withSurface(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 207
    .line 208
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnSurface(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 217
    .line 218
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withSurfaceVariant(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 227
    .line 228
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnSurfaceVariant(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 237
    .line 238
    const/16 v2, 0x3c

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOutline(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 249
    .line 250
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOutlineVariant(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 259
    .line 260
    const/4 v2, 0x0

    .line 261
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withShadow(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 270
    .line 271
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withScrim(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 280
    .line 281
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withInverseSurface(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 290
    .line 291
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withInverseOnSurface(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iget-object p0, p0, Lcom/google/android/material/color/utilities/CorePalette;->a1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 300
    .line 301
    const/16 v1, 0x28

    .line 302
    .line 303
    invoke-virtual {p0, v1}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 304
    .line 305
    .line 306
    move-result p0

    .line 307
    invoke-virtual {v0, p0}, Lcom/google/android/material/color/utilities/Scheme;->withInversePrimary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    return-object p0
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
.end method

.method public static light(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0

    invoke-static {p0}, Lcom/google/android/material/color/utilities/CorePalette;->of(I)Lcom/google/android/material/color/utilities/CorePalette;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/material/color/utilities/Scheme;->lightFromCorePalette(Lcom/google/android/material/color/utilities/CorePalette;)Lcom/google/android/material/color/utilities/Scheme;

    move-result-object p0

    return-object p0
.end method

.method public static lightContent(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0

    invoke-static {p0}, Lcom/google/android/material/color/utilities/CorePalette;->contentOf(I)Lcom/google/android/material/color/utilities/CorePalette;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/material/color/utilities/Scheme;->lightFromCorePalette(Lcom/google/android/material/color/utilities/CorePalette;)Lcom/google/android/material/color/utilities/Scheme;

    move-result-object p0

    return-object p0
.end method

.method private static lightFromCorePalette(Lcom/google/android/material/color/utilities/CorePalette;)Lcom/google/android/material/color/utilities/Scheme;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/material/color/utilities/Scheme;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/material/color/utilities/Scheme;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 7
    .line 8
    const/16 v2, 0x28

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withPrimary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 19
    .line 20
    const/16 v3, 0x64

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnPrimary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 31
    .line 32
    const/16 v4, 0x5a

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withPrimaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 43
    .line 44
    const/16 v5, 0xa

    .line 45
    .line 46
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnPrimaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withSecondary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 65
    .line 66
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnSecondary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 75
    .line 76
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withSecondaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 85
    .line 86
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnSecondaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a3:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withTertiary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a3:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 105
    .line 106
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnTertiary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a3:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 115
    .line 116
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withTertiaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->a3:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 125
    .line 126
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnTertiaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->error:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 135
    .line 136
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withError(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->error:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 145
    .line 146
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnError(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->error:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 155
    .line 156
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withErrorContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->error:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 165
    .line 166
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnErrorContainer(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 175
    .line 176
    const/16 v2, 0x63

    .line 177
    .line 178
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withBackground(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 187
    .line 188
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnBackground(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 197
    .line 198
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withSurface(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 207
    .line 208
    invoke-virtual {v1, v5}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnSurface(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 217
    .line 218
    invoke-virtual {v1, v4}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withSurfaceVariant(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 227
    .line 228
    const/16 v2, 0x1e

    .line 229
    .line 230
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOnSurfaceVariant(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 239
    .line 240
    const/16 v2, 0x32

    .line 241
    .line 242
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOutline(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n2:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 251
    .line 252
    const/16 v2, 0x50

    .line 253
    .line 254
    invoke-virtual {v1, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withOutlineVariant(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 263
    .line 264
    const/4 v3, 0x0

    .line 265
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withShadow(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 274
    .line 275
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withScrim(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 284
    .line 285
    const/16 v3, 0x14

    .line 286
    .line 287
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withInverseSurface(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    iget-object v1, p0, Lcom/google/android/material/color/utilities/CorePalette;->n1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 296
    .line 297
    const/16 v3, 0x5f

    .line 298
    .line 299
    invoke-virtual {v1, v3}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    invoke-virtual {v0, v1}, Lcom/google/android/material/color/utilities/Scheme;->withInverseOnSurface(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iget-object p0, p0, Lcom/google/android/material/color/utilities/CorePalette;->a1:Lcom/google/android/material/color/utilities/TonalPalette;

    .line 308
    .line 309
    invoke-virtual {p0, v2}, Lcom/google/android/material/color/utilities/TonalPalette;->tone(I)I

    .line 310
    .line 311
    .line 312
    move-result p0

    .line 313
    invoke-virtual {v0, p0}, Lcom/google/android/material/color/utilities/Scheme;->withInversePrimary(I)Lcom/google/android/material/color/utilities/Scheme;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    return-object p0
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
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/google/android/material/color/utilities/Scheme;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    return v2

    .line 18
    :cond_2
    check-cast p1, Lcom/google/android/material/color/utilities/Scheme;

    .line 19
    .line 20
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->primary:I

    .line 21
    .line 22
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->primary:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimary:I

    .line 28
    .line 29
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onPrimary:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->primaryContainer:I

    .line 35
    .line 36
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->primaryContainer:I

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimaryContainer:I

    .line 42
    .line 43
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onPrimaryContainer:I

    .line 44
    .line 45
    if-eq v1, v3, :cond_6

    .line 46
    .line 47
    return v2

    .line 48
    :cond_6
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->secondary:I

    .line 49
    .line 50
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->secondary:I

    .line 51
    .line 52
    if-eq v1, v3, :cond_7

    .line 53
    .line 54
    return v2

    .line 55
    :cond_7
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondary:I

    .line 56
    .line 57
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onSecondary:I

    .line 58
    .line 59
    if-eq v1, v3, :cond_8

    .line 60
    .line 61
    return v2

    .line 62
    :cond_8
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->secondaryContainer:I

    .line 63
    .line 64
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->secondaryContainer:I

    .line 65
    .line 66
    if-eq v1, v3, :cond_9

    .line 67
    .line 68
    return v2

    .line 69
    :cond_9
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondaryContainer:I

    .line 70
    .line 71
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onSecondaryContainer:I

    .line 72
    .line 73
    if-eq v1, v3, :cond_a

    .line 74
    .line 75
    return v2

    .line 76
    :cond_a
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiary:I

    .line 77
    .line 78
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->tertiary:I

    .line 79
    .line 80
    if-eq v1, v3, :cond_b

    .line 81
    .line 82
    return v2

    .line 83
    :cond_b
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiary:I

    .line 84
    .line 85
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onTertiary:I

    .line 86
    .line 87
    if-eq v1, v3, :cond_c

    .line 88
    .line 89
    return v2

    .line 90
    :cond_c
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiaryContainer:I

    .line 91
    .line 92
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->tertiaryContainer:I

    .line 93
    .line 94
    if-eq v1, v3, :cond_d

    .line 95
    .line 96
    return v2

    .line 97
    :cond_d
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiaryContainer:I

    .line 98
    .line 99
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onTertiaryContainer:I

    .line 100
    .line 101
    if-eq v1, v3, :cond_e

    .line 102
    .line 103
    return v2

    .line 104
    :cond_e
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->error:I

    .line 105
    .line 106
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->error:I

    .line 107
    .line 108
    if-eq v1, v3, :cond_f

    .line 109
    .line 110
    return v2

    .line 111
    :cond_f
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onError:I

    .line 112
    .line 113
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onError:I

    .line 114
    .line 115
    if-eq v1, v3, :cond_10

    .line 116
    .line 117
    return v2

    .line 118
    :cond_10
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->errorContainer:I

    .line 119
    .line 120
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->errorContainer:I

    .line 121
    .line 122
    if-eq v1, v3, :cond_11

    .line 123
    .line 124
    return v2

    .line 125
    :cond_11
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onErrorContainer:I

    .line 126
    .line 127
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onErrorContainer:I

    .line 128
    .line 129
    if-eq v1, v3, :cond_12

    .line 130
    .line 131
    return v2

    .line 132
    :cond_12
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->background:I

    .line 133
    .line 134
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->background:I

    .line 135
    .line 136
    if-eq v1, v3, :cond_13

    .line 137
    .line 138
    return v2

    .line 139
    :cond_13
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onBackground:I

    .line 140
    .line 141
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onBackground:I

    .line 142
    .line 143
    if-eq v1, v3, :cond_14

    .line 144
    .line 145
    return v2

    .line 146
    :cond_14
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->surface:I

    .line 147
    .line 148
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->surface:I

    .line 149
    .line 150
    if-eq v1, v3, :cond_15

    .line 151
    .line 152
    return v2

    .line 153
    :cond_15
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurface:I

    .line 154
    .line 155
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onSurface:I

    .line 156
    .line 157
    if-eq v1, v3, :cond_16

    .line 158
    .line 159
    return v2

    .line 160
    :cond_16
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->surfaceVariant:I

    .line 161
    .line 162
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->surfaceVariant:I

    .line 163
    .line 164
    if-eq v1, v3, :cond_17

    .line 165
    .line 166
    return v2

    .line 167
    :cond_17
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurfaceVariant:I

    .line 168
    .line 169
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->onSurfaceVariant:I

    .line 170
    .line 171
    if-eq v1, v3, :cond_18

    .line 172
    .line 173
    return v2

    .line 174
    :cond_18
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->outline:I

    .line 175
    .line 176
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->outline:I

    .line 177
    .line 178
    if-eq v1, v3, :cond_19

    .line 179
    .line 180
    return v2

    .line 181
    :cond_19
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->outlineVariant:I

    .line 182
    .line 183
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->outlineVariant:I

    .line 184
    .line 185
    if-eq v1, v3, :cond_1a

    .line 186
    .line 187
    return v2

    .line 188
    :cond_1a
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->shadow:I

    .line 189
    .line 190
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->shadow:I

    .line 191
    .line 192
    if-eq v1, v3, :cond_1b

    .line 193
    .line 194
    return v2

    .line 195
    :cond_1b
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->scrim:I

    .line 196
    .line 197
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->scrim:I

    .line 198
    .line 199
    if-eq v1, v3, :cond_1c

    .line 200
    .line 201
    return v2

    .line 202
    :cond_1c
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseSurface:I

    .line 203
    .line 204
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->inverseSurface:I

    .line 205
    .line 206
    if-eq v1, v3, :cond_1d

    .line 207
    .line 208
    return v2

    .line 209
    :cond_1d
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseOnSurface:I

    .line 210
    .line 211
    iget v3, p1, Lcom/google/android/material/color/utilities/Scheme;->inverseOnSurface:I

    .line 212
    .line 213
    if-eq v1, v3, :cond_1e

    .line 214
    .line 215
    return v2

    .line 216
    :cond_1e
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->inversePrimary:I

    .line 217
    .line 218
    iget p1, p1, Lcom/google/android/material/color/utilities/Scheme;->inversePrimary:I

    .line 219
    .line 220
    if-eq v1, p1, :cond_1f

    .line 221
    .line 222
    return v2

    .line 223
    :cond_1f
    return v0
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
.end method

.method public getBackground()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->background:I

    return v0
.end method

.method public getError()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->error:I

    return v0
.end method

.method public getErrorContainer()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->errorContainer:I

    return v0
.end method

.method public getInverseOnSurface()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseOnSurface:I

    return v0
.end method

.method public getInversePrimary()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->inversePrimary:I

    return v0
.end method

.method public getInverseSurface()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseSurface:I

    return v0
.end method

.method public getOnBackground()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onBackground:I

    return v0
.end method

.method public getOnError()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onError:I

    return v0
.end method

.method public getOnErrorContainer()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onErrorContainer:I

    return v0
.end method

.method public getOnPrimary()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimary:I

    return v0
.end method

.method public getOnPrimaryContainer()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimaryContainer:I

    return v0
.end method

.method public getOnSecondary()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondary:I

    return v0
.end method

.method public getOnSecondaryContainer()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondaryContainer:I

    return v0
.end method

.method public getOnSurface()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurface:I

    return v0
.end method

.method public getOnSurfaceVariant()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurfaceVariant:I

    return v0
.end method

.method public getOnTertiary()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiary:I

    return v0
.end method

.method public getOnTertiaryContainer()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiaryContainer:I

    return v0
.end method

.method public getOutline()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->outline:I

    return v0
.end method

.method public getOutlineVariant()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->outlineVariant:I

    return v0
.end method

.method public getPrimary()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->primary:I

    return v0
.end method

.method public getPrimaryContainer()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->primaryContainer:I

    return v0
.end method

.method public getScrim()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->scrim:I

    return v0
.end method

.method public getSecondary()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->secondary:I

    return v0
.end method

.method public getSecondaryContainer()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->secondaryContainer:I

    return v0
.end method

.method public getShadow()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->shadow:I

    return v0
.end method

.method public getSurface()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->surface:I

    return v0
.end method

.method public getSurfaceVariant()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->surfaceVariant:I

    return v0
.end method

.method public getTertiary()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiary:I

    return v0
.end method

.method public getTertiaryContainer()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiaryContainer:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->primary:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    mul-int/lit8 v0, v0, 0x1f

    .line 11
    .line 12
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimary:I

    .line 13
    .line 14
    add-int/2addr v0, v1

    .line 15
    mul-int/lit8 v0, v0, 0x1f

    .line 16
    .line 17
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->primaryContainer:I

    .line 18
    .line 19
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimaryContainer:I

    .line 23
    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->secondary:I

    .line 28
    .line 29
    add-int/2addr v0, v1

    .line 30
    mul-int/lit8 v0, v0, 0x1f

    .line 31
    .line 32
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondary:I

    .line 33
    .line 34
    add-int/2addr v0, v1

    .line 35
    mul-int/lit8 v0, v0, 0x1f

    .line 36
    .line 37
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->secondaryContainer:I

    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    mul-int/lit8 v0, v0, 0x1f

    .line 41
    .line 42
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondaryContainer:I

    .line 43
    .line 44
    add-int/2addr v0, v1

    .line 45
    mul-int/lit8 v0, v0, 0x1f

    .line 46
    .line 47
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiary:I

    .line 48
    .line 49
    add-int/2addr v0, v1

    .line 50
    mul-int/lit8 v0, v0, 0x1f

    .line 51
    .line 52
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiary:I

    .line 53
    .line 54
    add-int/2addr v0, v1

    .line 55
    mul-int/lit8 v0, v0, 0x1f

    .line 56
    .line 57
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiaryContainer:I

    .line 58
    .line 59
    add-int/2addr v0, v1

    .line 60
    mul-int/lit8 v0, v0, 0x1f

    .line 61
    .line 62
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiaryContainer:I

    .line 63
    .line 64
    add-int/2addr v0, v1

    .line 65
    mul-int/lit8 v0, v0, 0x1f

    .line 66
    .line 67
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->error:I

    .line 68
    .line 69
    add-int/2addr v0, v1

    .line 70
    mul-int/lit8 v0, v0, 0x1f

    .line 71
    .line 72
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onError:I

    .line 73
    .line 74
    add-int/2addr v0, v1

    .line 75
    mul-int/lit8 v0, v0, 0x1f

    .line 76
    .line 77
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->errorContainer:I

    .line 78
    .line 79
    add-int/2addr v0, v1

    .line 80
    mul-int/lit8 v0, v0, 0x1f

    .line 81
    .line 82
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onErrorContainer:I

    .line 83
    .line 84
    add-int/2addr v0, v1

    .line 85
    mul-int/lit8 v0, v0, 0x1f

    .line 86
    .line 87
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->background:I

    .line 88
    .line 89
    add-int/2addr v0, v1

    .line 90
    mul-int/lit8 v0, v0, 0x1f

    .line 91
    .line 92
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onBackground:I

    .line 93
    .line 94
    add-int/2addr v0, v1

    .line 95
    mul-int/lit8 v0, v0, 0x1f

    .line 96
    .line 97
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->surface:I

    .line 98
    .line 99
    add-int/2addr v0, v1

    .line 100
    mul-int/lit8 v0, v0, 0x1f

    .line 101
    .line 102
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurface:I

    .line 103
    .line 104
    add-int/2addr v0, v1

    .line 105
    mul-int/lit8 v0, v0, 0x1f

    .line 106
    .line 107
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->surfaceVariant:I

    .line 108
    .line 109
    add-int/2addr v0, v1

    .line 110
    mul-int/lit8 v0, v0, 0x1f

    .line 111
    .line 112
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurfaceVariant:I

    .line 113
    .line 114
    add-int/2addr v0, v1

    .line 115
    mul-int/lit8 v0, v0, 0x1f

    .line 116
    .line 117
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->outline:I

    .line 118
    .line 119
    add-int/2addr v0, v1

    .line 120
    mul-int/lit8 v0, v0, 0x1f

    .line 121
    .line 122
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->outlineVariant:I

    .line 123
    .line 124
    add-int/2addr v0, v1

    .line 125
    mul-int/lit8 v0, v0, 0x1f

    .line 126
    .line 127
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->shadow:I

    .line 128
    .line 129
    add-int/2addr v0, v1

    .line 130
    mul-int/lit8 v0, v0, 0x1f

    .line 131
    .line 132
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->scrim:I

    .line 133
    .line 134
    add-int/2addr v0, v1

    .line 135
    mul-int/lit8 v0, v0, 0x1f

    .line 136
    .line 137
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseSurface:I

    .line 138
    .line 139
    add-int/2addr v0, v1

    .line 140
    mul-int/lit8 v0, v0, 0x1f

    .line 141
    .line 142
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseOnSurface:I

    .line 143
    .line 144
    add-int/2addr v0, v1

    .line 145
    mul-int/lit8 v0, v0, 0x1f

    .line 146
    .line 147
    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->inversePrimary:I

    .line 148
    .line 149
    add-int/2addr v0, v1

    .line 150
    return v0
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
.end method

.method public setBackground(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->background:I

    return-void
.end method

.method public setError(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->error:I

    return-void
.end method

.method public setErrorContainer(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->errorContainer:I

    return-void
.end method

.method public setInverseOnSurface(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseOnSurface:I

    return-void
.end method

.method public setInversePrimary(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->inversePrimary:I

    return-void
.end method

.method public setInverseSurface(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseSurface:I

    return-void
.end method

.method public setOnBackground(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onBackground:I

    return-void
.end method

.method public setOnError(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onError:I

    return-void
.end method

.method public setOnErrorContainer(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onErrorContainer:I

    return-void
.end method

.method public setOnPrimary(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimary:I

    return-void
.end method

.method public setOnPrimaryContainer(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimaryContainer:I

    return-void
.end method

.method public setOnSecondary(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondary:I

    return-void
.end method

.method public setOnSecondaryContainer(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondaryContainer:I

    return-void
.end method

.method public setOnSurface(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurface:I

    return-void
.end method

.method public setOnSurfaceVariant(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurfaceVariant:I

    return-void
.end method

.method public setOnTertiary(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiary:I

    return-void
.end method

.method public setOnTertiaryContainer(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiaryContainer:I

    return-void
.end method

.method public setOutline(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->outline:I

    return-void
.end method

.method public setOutlineVariant(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->outlineVariant:I

    return-void
.end method

.method public setPrimary(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->primary:I

    return-void
.end method

.method public setPrimaryContainer(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->primaryContainer:I

    return-void
.end method

.method public setScrim(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->scrim:I

    return-void
.end method

.method public setSecondary(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->secondary:I

    return-void
.end method

.method public setSecondaryContainer(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->secondaryContainer:I

    return-void
.end method

.method public setShadow(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->shadow:I

    return-void
.end method

.method public setSurface(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->surface:I

    return-void
.end method

.method public setSurfaceVariant(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->surfaceVariant:I

    return-void
.end method

.method public setTertiary(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiary:I

    return-void
.end method

.method public setTertiaryContainer(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiaryContainer:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scheme{primary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->primary:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onPrimary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimary:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", primaryContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->primaryContainer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onPrimaryContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimaryContainer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", secondary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->secondary:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onSecondary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondary:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->secondaryContainer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onSecondaryContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondaryContainer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", tertiary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiary:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onTertiary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiary:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", tertiaryContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiaryContainer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onTertiaryContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiaryContainer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->error:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onError:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", errorContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->errorContainer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onErrorContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onErrorContainer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", background="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->background:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onBackground="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onBackground:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", surface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->surface:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurface:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", surfaceVariant="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->surfaceVariant:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", onSurfaceVariant="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurfaceVariant:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", outline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->outline:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", outlineVariant="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->outlineVariant:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", shadow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->shadow:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scrim="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->scrim:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", inverseSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseSurface:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", inverseOnSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseOnSurface:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", inversePrimary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/material/color/utilities/Scheme;->inversePrimary:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withBackground(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->background:I

    return-object p0
.end method

.method public withError(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->error:I

    return-object p0
.end method

.method public withErrorContainer(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->errorContainer:I

    return-object p0
.end method

.method public withInverseOnSurface(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseOnSurface:I

    return-object p0
.end method

.method public withInversePrimary(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->inversePrimary:I

    return-object p0
.end method

.method public withInverseSurface(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->inverseSurface:I

    return-object p0
.end method

.method public withOnBackground(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onBackground:I

    return-object p0
.end method

.method public withOnError(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onError:I

    return-object p0
.end method

.method public withOnErrorContainer(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onErrorContainer:I

    return-object p0
.end method

.method public withOnPrimary(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimary:I

    return-object p0
.end method

.method public withOnPrimaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onPrimaryContainer:I

    return-object p0
.end method

.method public withOnSecondary(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondary:I

    return-object p0
.end method

.method public withOnSecondaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSecondaryContainer:I

    return-object p0
.end method

.method public withOnSurface(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurface:I

    return-object p0
.end method

.method public withOnSurfaceVariant(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onSurfaceVariant:I

    return-object p0
.end method

.method public withOnTertiary(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiary:I

    return-object p0
.end method

.method public withOnTertiaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->onTertiaryContainer:I

    return-object p0
.end method

.method public withOutline(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->outline:I

    return-object p0
.end method

.method public withOutlineVariant(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->outlineVariant:I

    return-object p0
.end method

.method public withPrimary(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->primary:I

    return-object p0
.end method

.method public withPrimaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->primaryContainer:I

    return-object p0
.end method

.method public withScrim(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->scrim:I

    return-object p0
.end method

.method public withSecondary(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->secondary:I

    return-object p0
.end method

.method public withSecondaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->secondaryContainer:I

    return-object p0
.end method

.method public withShadow(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->shadow:I

    return-object p0
.end method

.method public withSurface(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->surface:I

    return-object p0
.end method

.method public withSurfaceVariant(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->surfaceVariant:I

    return-object p0
.end method

.method public withTertiary(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiary:I

    return-object p0
.end method

.method public withTertiaryContainer(I)Lcom/google/android/material/color/utilities/Scheme;
    .locals 0
    .annotation build Lo1/a;
    .end annotation

    iput p1, p0, Lcom/google/android/material/color/utilities/Scheme;->tertiaryContainer:I

    return-object p0
.end method
