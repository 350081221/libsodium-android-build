.class public Ld1/a$d;
.super Landroid/app/AlertDialog;
.source "SourceFile"


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Ld1/a;


# direct methods
.method public constructor <init>(Ld1/a;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld1/a$d;->a:Ld1/a;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method

.method private a(Landroid/content/Context;F)I
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 17
    .line 18
    mul-float/2addr p2, p1

    .line 19
    float-to-int p1, p2

    .line 20
    return p1
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

.method private b(Landroid/content/Context;Ljava/lang/String;I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 3
    .line 4
    invoke-static {p2}, Lo0/a;->d(Ljava/lang/String;)[B

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-direct {v1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    new-instance p2, Landroid/graphics/BitmapFactory$Options;

    .line 12
    .line 13
    invoke-direct {p2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 14
    .line 15
    .line 16
    if-gtz p3, :cond_0

    .line 17
    .line 18
    const/16 p3, 0xf0

    .line 19
    .line 20
    :cond_0
    iput p3, p2, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    iget p3, p3, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 31
    .line 32
    iput p3, p2, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 33
    .line 34
    invoke-static {v1, v0, p2}, Lcom/huawei/agconnect/apms/instrument/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    new-instance p3, Landroid/graphics/drawable/BitmapDrawable;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {p3, p1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 48
    .line 49
    .line 50
    :catch_0
    move-object v0, p3

    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_0

    .line 54
    :catchall_1
    move-exception p1

    .line 55
    move-object v1, v0

    .line 56
    :goto_0
    :try_start_3
    invoke-static {p1}, La1/e;->d(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 57
    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 62
    .line 63
    .line 64
    :catch_1
    :cond_1
    :goto_1
    return-object v0

    .line 65
    :catchall_2
    move-exception p1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 69
    .line 70
    .line 71
    :catch_2
    :cond_2
    throw p1
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
.end method

.method private c(Landroid/content/Context;)Landroid/view/View;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-direct {v2, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 11
    .line 12
    const/high16 v4, 0x42480000    # 50.0f

    .line 13
    .line 14
    invoke-direct {v0, v1, v4}, Ld1/a$d;->a(Landroid/content/Context;F)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/4 v5, -0x2

    .line 19
    invoke-direct {v3, v5, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 20
    .line 21
    .line 22
    const/16 v4, 0x11

    .line 23
    .line 24
    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-virtual {v2, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 34
    .line 35
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 36
    .line 37
    .line 38
    const v7, -0x1ae0dcc9

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 42
    .line 43
    .line 44
    const/high16 v7, 0x40a00000    # 5.0f

    .line 45
    .line 46
    invoke-direct {v0, v1, v7}, Ld1/a$d;->a(Landroid/content/Context;F)I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    int-to-float v7, v7

    .line 51
    invoke-virtual {v3, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 55
    .line 56
    .line 57
    new-instance v3, Landroid/widget/ImageView;

    .line 58
    .line 59
    invoke-direct {v3, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 63
    .line 64
    const/high16 v8, 0x41a00000    # 20.0f

    .line 65
    .line 66
    invoke-direct {v0, v1, v8}, Ld1/a$d;->a(Landroid/content/Context;F)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    invoke-direct {v0, v1, v8}, Ld1/a$d;->a(Landroid/content/Context;F)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    invoke-direct {v7, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 75
    .line 76
    .line 77
    const/16 v8, 0x10

    .line 78
    .line 79
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 80
    .line 81
    iget-object v9, v0, Ld1/a$d;->a:Ld1/a;

    .line 82
    .line 83
    invoke-static {v9}, Ld1/a;->a(Ld1/a;)Landroid/app/Activity;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    const/high16 v10, 0x41880000    # 17.0f

    .line 88
    .line 89
    invoke-direct {v0, v9, v10}, Ld1/a$d;->a(Landroid/content/Context;F)I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    iget-object v11, v0, Ld1/a$d;->a:Ld1/a;

    .line 94
    .line 95
    invoke-static {v11}, Ld1/a;->a(Ld1/a;)Landroid/app/Activity;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    const/high16 v12, 0x41200000    # 10.0f

    .line 100
    .line 101
    invoke-direct {v0, v11, v12}, Ld1/a$d;->a(Landroid/content/Context;F)I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    iget-object v13, v0, Ld1/a$d;->a:Ld1/a;

    .line 106
    .line 107
    invoke-static {v13}, Ld1/a;->a(Ld1/a;)Landroid/app/Activity;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    const/high16 v14, 0x41000000    # 8.0f

    .line 112
    .line 113
    invoke-direct {v0, v13, v14}, Ld1/a$d;->a(Landroid/content/Context;F)I

    .line 114
    .line 115
    .line 116
    move-result v13

    .line 117
    iget-object v14, v0, Ld1/a$d;->a:Ld1/a;

    .line 118
    .line 119
    invoke-static {v14}, Ld1/a;->a(Ld1/a;)Landroid/app/Activity;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    invoke-direct {v0, v14, v12}, Ld1/a$d;->a(Landroid/content/Context;F)I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    invoke-virtual {v7, v9, v11, v13, v12}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 131
    .line 132
    .line 133
    sget-object v7, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 134
    .line 135
    invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 136
    .line 137
    .line 138
    sget-object v7, Ld1/a;->l:Ljava/lang/String;

    .line 139
    .line 140
    const/16 v9, 0x1e0

    .line 141
    .line 142
    invoke-direct {v0, v1, v7, v9}, Ld1/a$d;->b(Landroid/content/Context;Ljava/lang/String;I)Landroid/graphics/drawable/Drawable;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 147
    .line 148
    .line 149
    new-instance v7, Landroid/view/animation/RotateAnimation;

    .line 150
    .line 151
    const/4 v12, 0x0

    .line 152
    const v13, 0x43b38000    # 359.0f

    .line 153
    .line 154
    .line 155
    const/4 v14, 0x1

    .line 156
    const/high16 v15, 0x3f000000    # 0.5f

    .line 157
    .line 158
    const/16 v16, 0x1

    .line 159
    .line 160
    const/high16 v17, 0x3f000000    # 0.5f

    .line 161
    .line 162
    move-object v11, v7

    .line 163
    invoke-direct/range {v11 .. v17}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 164
    .line 165
    .line 166
    const/4 v9, -0x1

    .line 167
    invoke-virtual {v7, v9}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    .line 168
    .line 169
    .line 170
    const-wide/16 v11, 0x384

    .line 171
    .line 172
    invoke-virtual {v7, v11, v12}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 173
    .line 174
    .line 175
    new-instance v11, Landroid/view/animation/LinearInterpolator;

    .line 176
    .line 177
    invoke-direct {v11}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7, v11}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 184
    .line 185
    .line 186
    new-instance v7, Landroid/widget/TextView;

    .line 187
    .line 188
    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 189
    .line 190
    .line 191
    iget-object v11, v0, Ld1/a$d;->a:Ld1/a;

    .line 192
    .line 193
    invoke-static {v11}, Ld1/a;->f(Ld1/a;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    if-eqz v11, :cond_0

    .line 202
    .line 203
    const-string/jumbo v11, "\u6b63\u5728\u52a0\u8f7d"

    .line 204
    .line 205
    .line 206
    goto :goto_0

    .line 207
    :cond_0
    iget-object v11, v0, Ld1/a$d;->a:Ld1/a;

    .line 208
    .line 209
    invoke-static {v11}, Ld1/a;->f(Ld1/a;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    :goto_0
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    .line 215
    .line 216
    const/high16 v11, 0x41800000    # 16.0f

    .line 217
    .line 218
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 222
    .line 223
    .line 224
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 225
    .line 226
    invoke-direct {v9, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 227
    .line 228
    .line 229
    iput v8, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 230
    .line 231
    invoke-direct {v0, v1, v10}, Ld1/a$d;->a(Landroid/content/Context;F)I

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    invoke-virtual {v9, v6, v6, v8, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 245
    .line 246
    .line 247
    new-instance v3, Landroid/widget/FrameLayout;

    .line 248
    .line 249
    invoke-direct {v3, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 250
    .line 251
    .line 252
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 253
    .line 254
    invoke-direct {v1, v5, v5, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 261
    .line 262
    .line 263
    return-object v3
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


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0, p1}, Ld1/a$d;->c(Landroid/content/Context;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
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
