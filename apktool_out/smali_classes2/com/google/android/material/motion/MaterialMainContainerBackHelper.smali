.class public Lcom/google/android/material/motion/MaterialMainContainerBackHelper;
.super Lcom/google/android/material/motion/MaterialBackAnimationHelper;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/material/motion/MaterialBackAnimationHelper<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# static fields
.field private static final MIN_SCALE:F = 0.9f


# instance fields
.field private expandedCornerSize:Ljava/lang/Integer;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private initialHideFromClipBounds:Landroid/graphics/Rect;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private initialHideToClipBounds:Landroid/graphics/Rect;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private initialTouchY:F

.field private final maxTranslationY:F

.field private final minEdgeGap:F


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/motion/MaterialBackAnimationHelper;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget v0, Lcom/google/android/material/R$dimen;->m3_back_progress_main_container_min_edge_gap:I

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->minEdgeGap:F

    .line 15
    .line 16
    sget v0, Lcom/google/android/material/R$dimen;->m3_back_progress_main_container_max_translation_y:I

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->maxTranslationY:F

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic a(Lcom/google/android/material/internal/ClippableRoundedCornerLayout;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->lambda$createCornerAnimator$0(Lcom/google/android/material/internal/ClippableRoundedCornerLayout;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private createCornerAnimator(Lcom/google/android/material/internal/ClippableRoundedCornerLayout;)Landroid/animation/ValueAnimator;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->getCornerRadius()F

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    aput v1, v0, v2

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->getExpandedCornerSize()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    const/4 v2, 0x1

    .line 17
    aput v1, v0, v2

    .line 18
    .line 19
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lcom/google/android/material/motion/b;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Lcom/google/android/material/motion/b;-><init>(Lcom/google/android/material/internal/ClippableRoundedCornerLayout;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 29
    .line 30
    .line 31
    return-object v0
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

.method private createResetScaleAndTranslationAnimator(Landroid/view/View;)Landroid/animation/AnimatorSet;
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    new-array v1, v1, [Landroid/animation/Animator;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    .line 10
    .line 11
    sget-object v3, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    new-array v5, v4, [F

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const/high16 v7, 0x3f800000    # 1.0f

    .line 18
    .line 19
    aput v7, v5, v6

    .line 20
    .line 21
    invoke-static {v2, v3, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    aput-object v2, v1, v6

    .line 26
    .line 27
    iget-object v2, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    .line 28
    .line 29
    sget-object v3, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    .line 30
    .line 31
    new-array v5, v4, [F

    .line 32
    .line 33
    aput v7, v5, v6

    .line 34
    .line 35
    invoke-static {v2, v3, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    aput-object v2, v1, v4

    .line 40
    .line 41
    iget-object v2, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    .line 42
    .line 43
    sget-object v3, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 44
    .line 45
    new-array v5, v4, [F

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    aput v7, v5, v6

    .line 49
    .line 50
    invoke-static {v2, v3, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const/4 v3, 0x2

    .line 55
    aput-object v2, v1, v3

    .line 56
    .line 57
    iget-object v2, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    .line 58
    .line 59
    sget-object v3, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 60
    .line 61
    new-array v4, v4, [F

    .line 62
    .line 63
    aput v7, v4, v6

    .line 64
    .line 65
    invoke-static {v2, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const/4 v3, 0x3

    .line 70
    aput-object v2, v1, v3

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lcom/google/android/material/motion/MaterialMainContainerBackHelper$1;

    .line 76
    .line 77
    invoke-direct {v1, p0, p1}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper$1;-><init>(Lcom/google/android/material/motion/MaterialMainContainerBackHelper;Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 81
    .line 82
    .line 83
    return-object v0
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
.end method

.method private getMaxDeviceCornerRadius()I
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v0, v2}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->getRoundedCornerRadius(Landroid/view/WindowInsets;I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {p0, v0, v2}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->getRoundedCornerRadius(Landroid/view/WindowInsets;I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x3

    .line 30
    invoke-direct {p0, v0, v2}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->getRoundedCornerRadius(Landroid/view/WindowInsets;I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x2

    .line 35
    invoke-direct {p0, v0, v3}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->getRoundedCornerRadius(Landroid/view/WindowInsets;I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    return v0

    .line 48
    :cond_0
    return v2
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
.end method

.method private getRoundedCornerRadius(Landroid/view/WindowInsets;I)I
    .locals 0
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1f
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lcom/google/android/material/bottomsheet/a;->a(Landroid/view/WindowInsets;I)Landroid/view/RoundedCorner;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/material/bottomsheet/b;->a(Landroid/view/RoundedCorner;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    return p1
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

.method private isAtTopOfScreen()Z
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget v0, v0, v1

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    return v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static synthetic lambda$createCornerAnimator$0(Lcom/google/android/material/internal/ClippableRoundedCornerLayout;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->updateCornerRadius(F)V

    return-void
.end method

.method private resetInitialValues()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->initialTouchY:F

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->initialHideToClipBounds:Landroid/graphics/Rect;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->initialHideFromClipBounds:Landroid/graphics/Rect;

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


# virtual methods
.method public cancelBackProgress(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0}, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->onCancelBackProgress()Landroidx/activity/BackEventCompat;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->createResetScaleAndTranslationAnimator(Landroid/view/View;)Landroid/animation/AnimatorSet;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    .line 13
    .line 14
    instance-of v1, v0, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    new-array v1, v1, [Landroid/animation/Animator;

    .line 20
    .line 21
    check-cast v0, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->createCornerAnimator(Lcom/google/android/material/internal/ClippableRoundedCornerLayout;)Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v2, 0x0

    .line 28
    aput-object v0, v1, v2

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->cancelDuration:I

    .line 34
    .line 35
    int-to-long v0, v0

    .line 36
    invoke-virtual {p1, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->resetInitialValues()V

    .line 43
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
.end method

.method public finishBackProgress(JLandroid/view/View;)V
    .locals 0
    .param p3    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p3}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->createResetScaleAndTranslationAnimator(Landroid/view/View;)Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-virtual {p3, p1, p2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Landroid/animation/AnimatorSet;->start()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->resetInitialValues()V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public getExpandedCornerSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->expandedCornerSize:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->isAtTopOfScreen()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->getMaxDeviceCornerRadius()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->expandedCornerSize:Ljava/lang/Integer;

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->expandedCornerSize:Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
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
.end method

.method public getInitialHideFromClipBounds()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->initialHideFromClipBounds:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getInitialHideToClipBounds()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->initialHideToClipBounds:Landroid/graphics/Rect;

    return-object v0
.end method

.method public startBackProgress(FLandroid/view/View;)V
    .locals 1
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    invoke-static {v0}, Lcom/google/android/material/internal/ViewUtils;->calculateRectFromBounds(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->initialHideToClipBounds:Landroid/graphics/Rect;

    if-eqz p2, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    invoke-static {v0, p2}, Lcom/google/android/material/internal/ViewUtils;->calculateOffsetRectFromBounds(Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->initialHideFromClipBounds:Landroid/graphics/Rect;

    .line 5
    :cond_0
    iput p1, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->initialTouchY:F

    return-void
.end method

.method public startBackProgress(Landroidx/activity/BackEventCompat;Landroid/view/View;)V
    .locals 0
    .param p1    # Landroidx/activity/BackEventCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->onStartBackProgress(Landroidx/activity/BackEventCompat;)V

    .line 2
    invoke-virtual {p1}, Landroidx/activity/BackEventCompat;->getTouchY()F

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->startBackProgress(FLandroid/view/View;)V

    return-void
.end method

.method public updateBackProgress(FZFF)V
    .locals 6
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 7
    invoke-virtual {p0, p1}, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->interpolateProgress(F)F

    move-result p1

    .line 8
    iget-object v0, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 9
    iget-object v1, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    cmpg-float v3, v0, v2

    if-lez v3, :cond_2

    cmpg-float v3, v1, v2

    if-gtz v3, :cond_0

    goto :goto_1

    :cond_0
    const/high16 v3, 0x3f800000    # 1.0f

    const v4, 0x3f666666    # 0.9f

    .line 10
    invoke-static {v3, v4, p1}, Lcom/google/android/material/animation/AnimationUtils;->lerp(FFF)F

    move-result v3

    mul-float/2addr v4, v0

    sub-float/2addr v0, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v0, v4

    .line 11
    iget v5, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->minEdgeGap:F

    sub-float/2addr v0, v5

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 12
    invoke-static {v2, v0, p1}, Lcom/google/android/material/animation/AnimationUtils;->lerp(FFF)F

    move-result v0

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, -0x1

    :goto_0
    int-to-float p2, p2

    mul-float/2addr v0, p2

    mul-float p2, v3, v1

    sub-float p2, v1, p2

    div-float/2addr p2, v4

    .line 13
    iget v4, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->minEdgeGap:F

    sub-float/2addr p2, v4

    invoke-static {v2, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    .line 14
    iget v4, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->maxTranslationY:F

    invoke-static {p2, v4}, Ljava/lang/Math;->min(FF)F

    move-result p2

    .line 15
    iget v4, p0, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->initialTouchY:F

    sub-float/2addr p3, v4

    .line 16
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v4

    div-float/2addr v4, v1

    .line 17
    invoke-static {p3}, Ljava/lang/Math;->signum(F)F

    move-result p3

    .line 18
    invoke-static {v2, p2, v4}, Lcom/google/android/material/animation/AnimationUtils;->lerp(FFF)F

    move-result p2

    mul-float/2addr p2, p3

    .line 19
    iget-object p3, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    invoke-virtual {p3, v3}, Landroid/view/View;->setScaleX(F)V

    .line 20
    iget-object p3, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    invoke-virtual {p3, v3}, Landroid/view/View;->setScaleY(F)V

    .line 21
    iget-object p3, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    invoke-virtual {p3, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 22
    iget-object p3, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    invoke-virtual {p3, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 23
    iget-object p2, p0, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->view:Landroid/view/View;

    instance-of p3, p2, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    if-eqz p3, :cond_2

    .line 24
    check-cast p2, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 25
    invoke-virtual {p0}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->getExpandedCornerSize()I

    move-result p3

    int-to-float p3, p3

    invoke-static {p3, p4, p1}, Lcom/google/android/material/animation/AnimationUtils;->lerp(FFF)F

    move-result p1

    invoke-virtual {p2, p1}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->updateCornerRadius(F)V

    :cond_2
    :goto_1
    return-void
.end method

.method public updateBackProgress(Landroidx/activity/BackEventCompat;Landroid/view/View;F)V
    .locals 2
    .param p1    # Landroidx/activity/BackEventCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/material/motion/MaterialBackAnimationHelper;->onUpdateBackProgress(Landroidx/activity/BackEventCompat;)Landroidx/activity/BackEventCompat;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 2
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    .line 3
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    :cond_1
    invoke-virtual {p1}, Landroidx/activity/BackEventCompat;->getSwipeEdge()I

    move-result p2

    if-nez p2, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 5
    :goto_0
    invoke-virtual {p1}, Landroidx/activity/BackEventCompat;->getProgress()F

    move-result v0

    invoke-virtual {p1}, Landroidx/activity/BackEventCompat;->getTouchY()F

    move-result p1

    .line 6
    invoke-virtual {p0, v0, p2, p1, p3}, Lcom/google/android/material/motion/MaterialMainContainerBackHelper;->updateBackProgress(FZFF)V

    return-void
.end method
