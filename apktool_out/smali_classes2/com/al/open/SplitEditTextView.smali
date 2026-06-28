.class public Lcom/al/open/SplitEditTextView;
.super Landroidx/appcompat/widget/AppCompatEditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/al/open/SplitEditTextView$b;
    }
.end annotation


# static fields
.field public static final C:I = 0x1

.field public static final D:I = 0x2

.field public static final E:I = 0x1

.field public static final F:I = 0x2

.field public static final G:I = 0x3


# instance fields
.field private A:I

.field private B:I

.field private a:Landroid/graphics/RectF;

.field private b:Landroid/graphics/RectF;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/Paint;

.field private f:Landroid/graphics/Paint;

.field private g:Ljava/lang/Float;

.field private h:I

.field private i:F

.field private j:F

.field private k:I

.field private l:F

.field private m:I

.field private n:I

.field private o:F

.field private p:I

.field private q:F

.field private r:I

.field private s:Z

.field private t:Lcom/al/open/b;

.field private u:Landroid/graphics/Paint;

.field private v:Lcom/al/open/SplitEditTextView$b;

.field private w:I

.field private x:F

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/al/open/SplitEditTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/al/open/SplitEditTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/al/open/SplitEditTextView;->n(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic a(Lcom/al/open/SplitEditTextView;)Landroid/graphics/Paint;
    .locals 0

    iget-object p0, p0, Lcom/al/open/SplitEditTextView;->u:Landroid/graphics/Paint;

    return-object p0
.end method

.method static synthetic b(Lcom/al/open/SplitEditTextView;)I
    .locals 0

    iget p0, p0, Lcom/al/open/SplitEditTextView;->z:I

    return p0
.end method

.method private c(F)F
    .locals 2

    .line 1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
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
.end method

.method private d(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->a:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->a:Landroid/graphics/RectF;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/high16 v2, 0x40000000    # 2.0f

    .line 15
    .line 16
    div-float/2addr v1, v2

    .line 17
    iget-object v3, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    div-float/2addr v3, v2

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    int-to-float v4, v4

    .line 29
    iget-object v5, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    div-float/2addr v5, v2

    .line 36
    sub-float/2addr v4, v5

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    int-to-float v5, v5

    .line 42
    iget-object v6, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 43
    .line 44
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    div-float/2addr v6, v2

    .line 49
    sub-float/2addr v5, v6

    .line 50
    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->a:Landroid/graphics/RectF;

    .line 54
    .line 55
    iget v1, p0, Lcom/al/open/SplitEditTextView;->i:F

    .line 56
    .line 57
    iget-object v2, p0, Lcom/al/open/SplitEditTextView;->e:Landroid/graphics/Paint;

    .line 58
    .line 59
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, p1}, Lcom/al/open/SplitEditTextView;->g(Landroid/graphics/Canvas;)V

    .line 63
    .line 64
    .line 65
    return-void
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
.end method

.method private e(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v2, p0, Lcom/al/open/SplitEditTextView;->n:I

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lcom/al/open/SplitEditTextView;->d:Landroid/graphics/Paint;

    .line 26
    .line 27
    const/high16 v3, -0x1000000

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ge v4, v2, :cond_1

    .line 37
    .line 38
    invoke-direct {p0, v4}, Lcom/al/open/SplitEditTextView;->k(I)F

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-float v3, v0

    .line 43
    iget v5, p0, Lcom/al/open/SplitEditTextView;->l:F

    .line 44
    .line 45
    iget-object v6, p0, Lcom/al/open/SplitEditTextView;->d:Landroid/graphics/Paint;

    .line 46
    .line 47
    invoke-virtual {p1, v2, v3, v5, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v2, p0, Lcom/al/open/SplitEditTextView;->d:Landroid/graphics/Paint;

    .line 54
    .line 55
    iget v3, p0, Lcom/al/open/SplitEditTextView;->r:I

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lcom/al/open/SplitEditTextView;->d:Landroid/graphics/Paint;

    .line 61
    .line 62
    int-to-float v0, v0

    .line 63
    invoke-direct {p0, v2, v0}, Lcom/al/open/SplitEditTextView;->l(Landroid/graphics/Paint;F)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ge v4, v2, :cond_1

    .line 72
    .line 73
    invoke-direct {p0, v4}, Lcom/al/open/SplitEditTextView;->k(I)F

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iget-object v5, p0, Lcom/al/open/SplitEditTextView;->d:Landroid/graphics/Paint;

    .line 86
    .line 87
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    const/high16 v6, 0x40000000    # 2.0f

    .line 92
    .line 93
    div-float/2addr v5, v6

    .line 94
    sub-float/2addr v2, v5

    .line 95
    iget-object v5, p0, Lcom/al/open/SplitEditTextView;->d:Landroid/graphics/Paint;

    .line 96
    .line 97
    invoke-virtual {p1, v3, v2, v0, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 98
    .line 99
    .line 100
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    return-void
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
.end method

.method private f(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/al/open/SplitEditTextView;->y:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-gt v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-direct {p0, v0}, Lcom/al/open/SplitEditTextView;->k(I)F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget v0, p0, Lcom/al/open/SplitEditTextView;->y:I

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    div-int/lit8 v0, v0, 0x2

    .line 38
    .line 39
    iput v0, p0, Lcom/al/open/SplitEditTextView;->y:I

    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget v1, p0, Lcom/al/open/SplitEditTextView;->y:I

    .line 46
    .line 47
    sub-int/2addr v0, v1

    .line 48
    div-int/lit8 v0, v0, 0x2

    .line 49
    .line 50
    int-to-float v1, v0

    .line 51
    iget-object v2, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    add-float v3, v1, v2

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    sub-int/2addr v1, v0

    .line 64
    int-to-float v0, v1

    .line 65
    iget-object v1, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    sub-float v5, v0, v1

    .line 72
    .line 73
    iget-object v6, p0, Lcom/al/open/SplitEditTextView;->u:Landroid/graphics/Paint;

    .line 74
    .line 75
    move-object v1, p1

    .line 76
    move v2, v4

    .line 77
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    new-instance p1, Landroid/view/InflateException;

    .line 82
    .line 83
    const-string v0, "cursor height must smaller than view height"

    .line 84
    .line 85
    invoke-direct {p1, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1
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
.end method

.method private g(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    iget-object v1, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-float/2addr v0, v1

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget v2, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 15
    .line 16
    add-int/lit8 v2, v2, -0x1

    .line 17
    .line 18
    if-ge v1, v2, :cond_0

    .line 19
    .line 20
    add-int/lit8 v8, v1, 0x1

    .line 21
    .line 22
    int-to-float v2, v8

    .line 23
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    mul-float/2addr v2, v3

    .line 28
    int-to-float v1, v1

    .line 29
    iget v3, p0, Lcom/al/open/SplitEditTextView;->j:F

    .line 30
    .line 31
    mul-float/2addr v1, v3

    .line 32
    add-float/2addr v2, v1

    .line 33
    iget-object v1, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-float/2addr v2, v1

    .line 40
    iget v1, p0, Lcom/al/open/SplitEditTextView;->j:F

    .line 41
    .line 42
    const/high16 v3, 0x40000000    # 2.0f

    .line 43
    .line 44
    div-float/2addr v1, v3

    .line 45
    add-float v5, v2, v1

    .line 46
    .line 47
    iget-object v1, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    iget-object v7, p0, Lcom/al/open/SplitEditTextView;->c:Landroid/graphics/Paint;

    .line 54
    .line 55
    move-object v2, p1

    .line 56
    move v3, v5

    .line 57
    move v6, v0

    .line 58
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 59
    .line 60
    .line 61
    move v1, v8

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return-void
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
.end method

.method private getContentItemWidth()F
    .locals 5

    .line 1
    iget v0, p0, Lcom/al/open/SplitEditTextView;->p:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    iget v1, p0, Lcom/al/open/SplitEditTextView;->j:F

    .line 15
    .line 16
    iget v2, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 17
    .line 18
    add-int/lit8 v2, v2, -0x1

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    mul-float/2addr v1, v2

    .line 22
    sub-float/2addr v0, v1

    .line 23
    iget-object v1, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/high16 v2, 0x40000000    # 2.0f

    .line 30
    .line 31
    :goto_0
    mul-float/2addr v1, v2

    .line 32
    sub-float/2addr v0, v1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    int-to-float v0, v0

    .line 39
    iget v1, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 40
    .line 41
    add-int/lit8 v1, v1, -0x1

    .line 42
    .line 43
    int-to-float v1, v1

    .line 44
    iget v2, p0, Lcom/al/open/SplitEditTextView;->o:F

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    int-to-float v0, v0

    .line 52
    iget v2, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 53
    .line 54
    add-int/lit8 v3, v2, -0x1

    .line 55
    .line 56
    int-to-float v3, v3

    .line 57
    iget v4, p0, Lcom/al/open/SplitEditTextView;->o:F

    .line 58
    .line 59
    mul-float/2addr v3, v4

    .line 60
    sub-float/2addr v0, v3

    .line 61
    mul-int/2addr v2, v1

    .line 62
    int-to-float v1, v2

    .line 63
    iget-object v2, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    goto :goto_0

    .line 70
    :goto_1
    iget v1, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 71
    .line 72
    int-to-float v1, v1

    .line 73
    div-float/2addr v0, v1

    .line 74
    return v0
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method private h(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/al/open/SplitEditTextView;->b:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/graphics/RectF;->setEmpty()V

    .line 9
    .line 10
    .line 11
    int-to-float v1, v0

    .line 12
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    mul-float/2addr v2, v1

    .line 17
    iget v3, p0, Lcom/al/open/SplitEditTextView;->o:F

    .line 18
    .line 19
    mul-float/2addr v3, v1

    .line 20
    add-float/2addr v2, v3

    .line 21
    iget-object v3, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    mul-float/2addr v3, v1

    .line 28
    const/high16 v4, 0x40000000    # 2.0f

    .line 29
    .line 30
    mul-float/2addr v3, v4

    .line 31
    add-float/2addr v2, v3

    .line 32
    iget-object v3, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    div-float/2addr v3, v4

    .line 39
    add-float/2addr v2, v3

    .line 40
    iget v3, p0, Lcom/al/open/SplitEditTextView;->o:F

    .line 41
    .line 42
    mul-float/2addr v1, v3

    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    int-to-float v3, v0

    .line 46
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    mul-float/2addr v3, v5

    .line 51
    add-float/2addr v1, v3

    .line 52
    mul-int/lit8 v3, v0, 0x2

    .line 53
    .line 54
    int-to-float v3, v3

    .line 55
    iget-object v5, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    mul-float/2addr v3, v5

    .line 62
    add-float/2addr v1, v3

    .line 63
    iget-object v3, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    div-float/2addr v3, v4

    .line 70
    sub-float/2addr v1, v3

    .line 71
    iget-object v3, p0, Lcom/al/open/SplitEditTextView;->b:Landroid/graphics/RectF;

    .line 72
    .line 73
    iget-object v5, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    div-float/2addr v5, v4

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    int-to-float v6, v6

    .line 85
    iget-object v7, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 86
    .line 87
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    div-float/2addr v7, v4

    .line 92
    sub-float/2addr v6, v7

    .line 93
    invoke-virtual {v3, v2, v5, v1, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 94
    .line 95
    .line 96
    iget-object v1, p0, Lcom/al/open/SplitEditTextView;->b:Landroid/graphics/RectF;

    .line 97
    .line 98
    iget v2, p0, Lcom/al/open/SplitEditTextView;->i:F

    .line 99
    .line 100
    iget-object v3, p0, Lcom/al/open/SplitEditTextView;->e:Landroid/graphics/Paint;

    .line 101
    .line 102
    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    return-void
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
.end method

.method private i(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget v2, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    int-to-float v2, v1

    .line 19
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    mul-float/2addr v3, v2

    .line 24
    iget v4, p0, Lcom/al/open/SplitEditTextView;->o:F

    .line 25
    .line 26
    mul-float/2addr v2, v4

    .line 27
    add-float v5, v3, v2

    .line 28
    .line 29
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-float v7, v2, v5

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    int-to-float v2, v2

    .line 40
    iget-object v3, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/high16 v4, 0x40000000    # 2.0f

    .line 47
    .line 48
    div-float/2addr v3, v4

    .line 49
    sub-float v8, v2, v3

    .line 50
    .line 51
    iget v2, p0, Lcom/al/open/SplitEditTextView;->A:I

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-lt v2, v1, :cond_0

    .line 60
    .line 61
    iget-object v2, p0, Lcom/al/open/SplitEditTextView;->f:Landroid/graphics/Paint;

    .line 62
    .line 63
    iget v3, p0, Lcom/al/open/SplitEditTextView;->A:I

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    iget-object v2, p0, Lcom/al/open/SplitEditTextView;->f:Landroid/graphics/Paint;

    .line 70
    .line 71
    iget v3, p0, Lcom/al/open/SplitEditTextView;->B:I

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 74
    .line 75
    .line 76
    :cond_1
    :goto_1
    iget-object v9, p0, Lcom/al/open/SplitEditTextView;->f:Landroid/graphics/Paint;

    .line 77
    .line 78
    move-object v4, p1

    .line 79
    move v6, v8

    .line 80
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 81
    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    return-void
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
.end method

.method private j(I)F
    .locals 4

    .line 1
    iget v0, p0, Lcom/al/open/SplitEditTextView;->p:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    iget v0, p0, Lcom/al/open/SplitEditTextView;->j:F

    .line 11
    .line 12
    iget v1, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    int-to-float v1, v1

    .line 17
    mul-float/2addr v0, v1

    .line 18
    sub-float/2addr p1, v0

    .line 19
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/high16 v1, 0x40000000    # 2.0f

    .line 26
    .line 27
    :goto_0
    mul-float/2addr v0, v1

    .line 28
    sub-float/2addr p1, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    int-to-float p1, p1

    .line 31
    iget v0, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    int-to-float v0, v0

    .line 36
    iget v1, p0, Lcom/al/open/SplitEditTextView;->o:F

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    int-to-float p1, p1

    .line 40
    iget v0, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 41
    .line 42
    add-int/lit8 v2, v0, -0x1

    .line 43
    .line 44
    int-to-float v2, v2

    .line 45
    iget v3, p0, Lcom/al/open/SplitEditTextView;->o:F

    .line 46
    .line 47
    mul-float/2addr v2, v3

    .line 48
    sub-float/2addr p1, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    int-to-float v0, v0

    .line 51
    iget-object v1, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    goto :goto_0

    .line 58
    :goto_1
    iget v0, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 59
    .line 60
    int-to-float v0, v0

    .line 61
    div-float/2addr p1, v0

    .line 62
    return p1
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
.end method

.method private k(I)F
    .locals 4

    .line 1
    iget v0, p0, Lcom/al/open/SplitEditTextView;->p:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/high16 v2, 0x40000000    # 2.0f

    .line 5
    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    div-float/2addr v0, v2

    .line 16
    int-to-float p1, p1

    .line 17
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    mul-float/2addr v1, p1

    .line 22
    add-float/2addr v0, v1

    .line 23
    iget v1, p0, Lcom/al/open/SplitEditTextView;->j:F

    .line 24
    .line 25
    mul-float/2addr p1, v1

    .line 26
    add-float/2addr v0, p1

    .line 27
    iget-object p1, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :goto_0
    add-float/2addr v0, p1

    .line 34
    return v0

    .line 35
    :cond_0
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    div-float/2addr v0, v2

    .line 40
    int-to-float p1, p1

    .line 41
    iget v1, p0, Lcom/al/open/SplitEditTextView;->o:F

    .line 42
    .line 43
    mul-float/2addr v1, p1

    .line 44
    add-float/2addr v0, v1

    .line 45
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    :goto_1
    mul-float/2addr p1, v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    div-float/2addr v0, v2

    .line 56
    int-to-float v2, p1

    .line 57
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->getContentItemWidth()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    mul-float/2addr v3, v2

    .line 62
    add-float/2addr v0, v3

    .line 63
    iget v3, p0, Lcom/al/open/SplitEditTextView;->o:F

    .line 64
    .line 65
    mul-float/2addr v2, v3

    .line 66
    add-float/2addr v0, v2

    .line 67
    mul-int/2addr p1, v1

    .line 68
    add-int/lit8 p1, p1, 0x1

    .line 69
    .line 70
    int-to-float p1, p1

    .line 71
    iget-object v1, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    goto :goto_1
    .line 78
.end method

.method private l(Landroid/graphics/Paint;F)F
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p1, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 6
    .line 7
    iget p1, p1, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 8
    .line 9
    sub-float p1, v0, p1

    .line 10
    .line 11
    const/high16 v1, 0x40000000    # 2.0f

    .line 12
    .line 13
    div-float/2addr p1, v1

    .line 14
    sub-float/2addr p1, v0

    .line 15
    add-float/2addr p2, p1

    .line 16
    return p2
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
.end method

.method private m()V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lcom/al/open/SplitEditTextView;->e:Landroid/graphics/Paint;

    .line 8
    .line 9
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->e:Landroid/graphics/Paint;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->e:Landroid/graphics/Paint;

    .line 26
    .line 27
    iget v2, p0, Lcom/al/open/SplitEditTextView;->h:I

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/al/open/SplitEditTextView;->c:Landroid/graphics/Paint;

    .line 38
    .line 39
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->c:Landroid/graphics/Paint;

    .line 45
    .line 46
    iget v2, p0, Lcom/al/open/SplitEditTextView;->j:F

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->c:Landroid/graphics/Paint;

    .line 52
    .line 53
    iget v2, p0, Lcom/al/open/SplitEditTextView;->k:I

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Landroid/graphics/Paint;

    .line 59
    .line 60
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/al/open/SplitEditTextView;->d:Landroid/graphics/Paint;

    .line 64
    .line 65
    iget v2, p0, Lcom/al/open/SplitEditTextView;->q:F

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Landroid/graphics/Paint;

    .line 71
    .line 72
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lcom/al/open/SplitEditTextView;->u:Landroid/graphics/Paint;

    .line 76
    .line 77
    iget v2, p0, Lcom/al/open/SplitEditTextView;->x:F

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->u:Landroid/graphics/Paint;

    .line 83
    .line 84
    iget v2, p0, Lcom/al/open/SplitEditTextView;->w:I

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Landroid/graphics/Paint;

    .line 90
    .line 91
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, Lcom/al/open/SplitEditTextView;->f:Landroid/graphics/Paint;

    .line 95
    .line 96
    iget-object v2, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->f:Landroid/graphics/Paint;

    .line 106
    .line 107
    iget v2, p0, Lcom/al/open/SplitEditTextView;->B:I

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 110
    .line 111
    .line 112
    new-instance v0, Landroid/graphics/RectF;

    .line 113
    .line 114
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object v0, p0, Lcom/al/open/SplitEditTextView;->b:Landroid/graphics/RectF;

    .line 118
    .line 119
    new-instance v0, Landroid/graphics/RectF;

    .line 120
    .line 121
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object v0, p0, Lcom/al/open/SplitEditTextView;->a:Landroid/graphics/RectF;

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/widget/TextView;->setSingleLine()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 130
    .line 131
    .line 132
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 133
    .line 134
    const/16 v2, 0x1d

    .line 135
    .line 136
    const v3, 0x106000d

    .line 137
    .line 138
    .line 139
    if-lt v0, v2, :cond_0

    .line 140
    .line 141
    invoke-virtual {p0, v3}, Landroid/widget/EditText;->setTextSelectHandle(I)V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_0
    :try_start_0
    const-class v0, Landroid/widget/TextView;

    .line 146
    .line 147
    const-string v2, "mTextSelectHandleRes"

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 154
    .line 155
    .line 156
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :catch_0
    move-exception v0

    .line 165
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 166
    .line 167
    .line 168
    :goto_0
    new-array v0, v1, [Landroid/text/InputFilter;

    .line 169
    .line 170
    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    .line 171
    .line 172
    iget v2, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 173
    .line 174
    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 175
    .line 176
    .line 177
    const/4 v2, 0x0

    .line 178
    aput-object v1, v0, v2

    .line 179
    .line 180
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 181
    .line 182
    .line 183
    return-void
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

.method private n(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/al/open/R$styleable;->J6:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget p2, Lcom/al/open/R$styleable;->N6:I

    .line 8
    .line 9
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/al/open/SplitEditTextView;->c(F)F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 24
    .line 25
    sget p2, Lcom/al/open/R$styleable;->M6:I

    .line 26
    .line 27
    const/high16 v1, -0x1000000

    .line 28
    .line 29
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iput p2, p0, Lcom/al/open/SplitEditTextView;->h:I

    .line 34
    .line 35
    sget p2, Lcom/al/open/R$styleable;->R6:I

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iput p2, p0, Lcom/al/open/SplitEditTextView;->i:F

    .line 43
    .line 44
    sget p2, Lcom/al/open/R$styleable;->X6:I

    .line 45
    .line 46
    invoke-direct {p0, v0}, Lcom/al/open/SplitEditTextView;->c(F)F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    iput p2, p0, Lcom/al/open/SplitEditTextView;->j:F

    .line 55
    .line 56
    sget p2, Lcom/al/open/R$styleable;->W6:I

    .line 57
    .line 58
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    iput p2, p0, Lcom/al/open/SplitEditTextView;->k:I

    .line 63
    .line 64
    sget p2, Lcom/al/open/R$styleable;->O6:I

    .line 65
    .line 66
    const/high16 v0, 0x40a00000    # 5.0f

    .line 67
    .line 68
    invoke-direct {p0, v0}, Lcom/al/open/SplitEditTextView;->c(F)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    iput p2, p0, Lcom/al/open/SplitEditTextView;->l:F

    .line 77
    .line 78
    sget p2, Lcom/al/open/R$styleable;->P6:I

    .line 79
    .line 80
    const/4 v0, 0x6

    .line 81
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    iput p2, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 86
    .line 87
    sget p2, Lcom/al/open/R$styleable;->Q6:I

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    iput p2, p0, Lcom/al/open/SplitEditTextView;->n:I

    .line 95
    .line 96
    sget p2, Lcom/al/open/R$styleable;->Z6:I

    .line 97
    .line 98
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    iput p2, p0, Lcom/al/open/SplitEditTextView;->p:I

    .line 103
    .line 104
    sget p2, Lcom/al/open/R$styleable;->a7:I

    .line 105
    .line 106
    const/high16 v3, 0x41200000    # 10.0f

    .line 107
    .line 108
    invoke-direct {p0, v3}, Lcom/al/open/SplitEditTextView;->c(F)F

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    iput p2, p0, Lcom/al/open/SplitEditTextView;->o:F

    .line 117
    .line 118
    sget p2, Lcom/al/open/R$styleable;->K6:I

    .line 119
    .line 120
    const/high16 v3, 0x41800000    # 16.0f

    .line 121
    .line 122
    invoke-direct {p0, v3}, Lcom/al/open/SplitEditTextView;->o(F)F

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    iput p2, p0, Lcom/al/open/SplitEditTextView;->q:F

    .line 131
    .line 132
    sget p2, Lcom/al/open/R$styleable;->L6:I

    .line 133
    .line 134
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    iput p2, p0, Lcom/al/open/SplitEditTextView;->r:I

    .line 139
    .line 140
    sget p2, Lcom/al/open/R$styleable;->Y6:I

    .line 141
    .line 142
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    iput-boolean p2, p0, Lcom/al/open/SplitEditTextView;->s:Z

    .line 147
    .line 148
    sget p2, Lcom/al/open/R$styleable;->S6:I

    .line 149
    .line 150
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    iput p2, p0, Lcom/al/open/SplitEditTextView;->w:I

    .line 155
    .line 156
    sget p2, Lcom/al/open/R$styleable;->T6:I

    .line 157
    .line 158
    const/16 v0, 0x1f4

    .line 159
    .line 160
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    iput p2, p0, Lcom/al/open/SplitEditTextView;->z:I

    .line 165
    .line 166
    sget p2, Lcom/al/open/R$styleable;->V6:I

    .line 167
    .line 168
    const/high16 v0, 0x40000000    # 2.0f

    .line 169
    .line 170
    invoke-direct {p0, v0}, Lcom/al/open/SplitEditTextView;->c(F)F

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    iput p2, p0, Lcom/al/open/SplitEditTextView;->x:F

    .line 179
    .line 180
    sget p2, Lcom/al/open/R$styleable;->U6:I

    .line 181
    .line 182
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    float-to-int p2, p2

    .line 187
    iput p2, p0, Lcom/al/open/SplitEditTextView;->y:I

    .line 188
    .line 189
    sget p2, Lcom/al/open/R$styleable;->c7:I

    .line 190
    .line 191
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    iput p2, p0, Lcom/al/open/SplitEditTextView;->B:I

    .line 196
    .line 197
    sget p2, Lcom/al/open/R$styleable;->b7:I

    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    iput p2, p0, Lcom/al/open/SplitEditTextView;->A:I

    .line 205
    .line 206
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 207
    .line 208
    .line 209
    invoke-direct {p0}, Lcom/al/open/SplitEditTextView;->m()V

    .line 210
    .line 211
    .line 212
    return-void
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
.end method

.method private o(F)F
    .locals 2

    .line 1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
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
.end method


# virtual methods
.method public getContentShowMode()I
    .locals 1

    iget v0, p0, Lcom/al/open/SplitEditTextView;->n:I

    return v0
.end method

.method public getInputBoxStyle()I
    .locals 1

    iget v0, p0, Lcom/al/open/SplitEditTextView;->p:I

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/al/open/SplitEditTextView$b;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lcom/al/open/SplitEditTextView$b;-><init>(Lcom/al/open/SplitEditTextView;Lcom/al/open/SplitEditTextView$a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/al/open/SplitEditTextView;->v:Lcom/al/open/SplitEditTextView$b;

    .line 11
    .line 12
    iget v1, p0, Lcom/al/open/SplitEditTextView;->z:I

    .line 13
    .line 14
    int-to-long v1, v1

    .line 15
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->v:Lcom/al/open/SplitEditTextView$b;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/al/open/SplitEditTextView;->p:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/al/open/SplitEditTextView;->d(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-direct {p0, p1}, Lcom/al/open/SplitEditTextView;->i(Landroid/graphics/Canvas;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-direct {p0, p1}, Lcom/al/open/SplitEditTextView;->h(Landroid/graphics/Canvas;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-direct {p0, p1}, Lcom/al/open/SplitEditTextView;->e(Landroid/graphics/Canvas;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/al/open/SplitEditTextView;->f(Landroid/graphics/Canvas;)V

    .line 24
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
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-boolean p2, p0, Lcom/al/open/SplitEditTextView;->s:Z

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-direct {p0, p1}, Lcom/al/open/SplitEditTextView;->j(I)F

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget v0, p0, Lcom/al/open/SplitEditTextView;->p:I

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/high16 v1, 0x40000000    # 2.0f

    .line 28
    .line 29
    mul-float/2addr v0, v1

    .line 30
    add-float/2addr p2, v0

    .line 31
    float-to-int p2, p2

    .line 32
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/al/open/SplitEditTextView;->g:Ljava/lang/Float;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-float/2addr p2, v0

    .line 43
    float-to-int p2, p2

    .line 44
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void
    .line 48
    .line 49
    .line 50
.end method

.method protected onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, p0, Lcom/al/open/SplitEditTextView;->t:Lcom/al/open/b;

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iget p3, p0, Lcom/al/open/SplitEditTextView;->m:I

    .line 21
    .line 22
    if-ne p2, p3, :cond_0

    .line 23
    .line 24
    iget-object p2, p0, Lcom/al/open/SplitEditTextView;->t:Lcom/al/open/b;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lcom/al/open/b;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p2, p0, Lcom/al/open/SplitEditTextView;->t:Lcom/al/open/b;

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Lcom/al/open/b;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
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
.end method

.method public setContentShowMode(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string/jumbo v0, "the value of the parameter must be one of{1:EDIT_SHOW_MODE_PASSWORD} or {2:EDIT_SHOW_MODE_TEXT}"

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_1
    :goto_0
    iput p1, p0, Lcom/al/open/SplitEditTextView;->n:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public setInputBoxStyle(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string/jumbo v0, "the value of the parameter must be one of{1:INPUT_BOX_STYLE_CONNECT}, {2:INPUT_BOX_STYLE_SINGLE} or {3:INPUT_BOX_STYLE_UNDERLINE}"

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iput p1, p0, Lcom/al/open/SplitEditTextView;->p:I

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 23
    .line 24
    .line 25
    return-void
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
.end method

.method public setOnInputListener(Lcom/al/open/b;)V
    .locals 0

    iput-object p1, p0, Lcom/al/open/SplitEditTextView;->t:Lcom/al/open/b;

    return-void
.end method
