.class public Lcom/yuanqi/group/widgets/RippleButton;
.super Landroidx/appcompat/widget/AppCompatButton;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ClickableViewAccessibility"
    }
.end annotation


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:I

.field private h:Z

.field private i:Z

.field private j:Landroid/graphics/RadialGradient;

.field private k:Landroid/graphics/Paint;

.field private l:Landroid/animation/ObjectAnimator;

.field private m:Z

.field private n:Landroid/graphics/Rect;

.field private o:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/yuanqi/group/widgets/RippleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/yuanqi/group/widgets/RippleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 4
    iput-boolean p3, p0, Lcom/yuanqi/group/widgets/RippleButton;->h:Z

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->i:Z

    .line 6
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->o:Landroid/graphics/Path;

    .line 7
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/RippleButton;->d()V

    .line 8
    sget-object v1, Lcom/yqtech/multiapp/R$styleable;->RippleButton:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x2

    .line 9
    iget v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->g:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/yuanqi/group/widgets/RippleButton;->g:I

    .line 10
    iget p2, p0, Lcom/yuanqi/group/widgets/RippleButton;->c:F

    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/yuanqi/group/widgets/RippleButton;->c:F

    .line 11
    iget-boolean p2, p0, Lcom/yuanqi/group/widgets/RippleButton;->i:Z

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/RippleButton;->i:Z

    .line 12
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method static synthetic a(Lcom/yuanqi/group/widgets/RippleButton;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->h:Z

    return p1
.end method

.method private c(I)I
    .locals 1

    int-to-float p1, p1

    iget v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->d:F

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method


# virtual methods
.method public b(IF)I
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    mul-float/2addr v0, p2

    .line 7
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p2, v0, v1, p1}, Landroid/graphics/Color;->argb(IIII)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
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

.method public d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 14
    .line 15
    iput v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->d:F

    .line 16
    .line 17
    new-instance v0, Landroid/graphics/Paint;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->k:Landroid/graphics/Paint;

    .line 24
    .line 25
    const/16 v1, 0x64

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 28
    .line 29
    .line 30
    const/high16 v0, -0x1000000

    .line 31
    .line 32
    const v1, 0x3e4ccccd    # 0.2f

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Lcom/yuanqi/group/widgets/RippleButton;->setRippleColor(IF)V

    .line 36
    .line 37
    .line 38
    return-void
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
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->o:Landroid/graphics/Path;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->o:Landroid/graphics/Path;

    .line 20
    .line 21
    iget v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->a:F

    .line 22
    .line 23
    iget v2, p0, Lcom/yuanqi/group/widgets/RippleButton;->b:F

    .line 24
    .line 25
    iget v3, p0, Lcom/yuanqi/group/widgets/RippleButton;->e:F

    .line 26
    .line 27
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->o:Landroid/graphics/Path;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 35
    .line 36
    .line 37
    iget v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->a:F

    .line 38
    .line 39
    iget v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->b:F

    .line 40
    .line 41
    iget v2, p0, Lcom/yuanqi/group/widgets/RippleButton;->e:F

    .line 42
    .line 43
    iget-object v3, p0, Lcom/yuanqi/group/widgets/RippleButton;->k:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 46
    .line 47
    .line 48
    return-void
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
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    mul-int/2addr p1, p1

    .line 5
    mul-int/2addr p2, p2

    .line 6
    add-int/2addr p1, p2

    .line 7
    int-to-double p1, p1

    .line 8
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    double-to-float p1, p1

    .line 13
    iput p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->f:F

    .line 14
    .line 15
    return-void
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "TouchEvent"

    .line 10
    .line 11
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->h:Z

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "mIsAnimating"

    .line 21
    .line 22
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->m:Z

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "mAnimationIsCancel"

    .line 32
    .line 33
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x0

    .line 45
    const-string v3, "radius"

    .line 46
    .line 47
    const/16 v4, 0x32

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x2

    .line 51
    const/4 v7, 0x1

    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->i:Z

    .line 61
    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    new-instance v1, Landroid/graphics/Rect;

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    invoke-direct {v1, v8, v9, v10, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 83
    .line 84
    .line 85
    iput-object v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->n:Landroid/graphics/Rect;

    .line 86
    .line 87
    iput-boolean v5, p0, Lcom/yuanqi/group/widgets/RippleButton;->m:Z

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iput v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->a:F

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iput p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->b:F

    .line 100
    .line 101
    new-array p1, v6, [F

    .line 102
    .line 103
    aput v2, p1, v5

    .line 104
    .line 105
    invoke-direct {p0, v4}, Lcom/yuanqi/group/widgets/RippleButton;->c(I)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    int-to-float v1, v1

    .line 110
    aput v1, p1, v7

    .line 111
    .line 112
    invoke-static {p0, v3, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-wide/16 v1, 0x190

    .line 117
    .line 118
    invoke-virtual {p1, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->l:Landroid/animation/ObjectAnimator;

    .line 123
    .line 124
    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 125
    .line 126
    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->l:Landroid/animation/ObjectAnimator;

    .line 133
    .line 134
    new-instance v1, Lcom/yuanqi/group/widgets/RippleButton$a;

    .line 135
    .line 136
    invoke-direct {v1, p0}, Lcom/yuanqi/group/widgets/RippleButton$a;-><init>(Lcom/yuanqi/group/widgets/RippleButton;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->l:Landroid/animation/ObjectAnimator;

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 145
    .line 146
    .line 147
    if-nez v0, :cond_4

    .line 148
    .line 149
    return v7

    .line 150
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-ne v1, v6, :cond_2

    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_2

    .line 161
    .line 162
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->i:Z

    .line 163
    .line 164
    if-eqz v1, :cond_2

    .line 165
    .line 166
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    iput v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->a:F

    .line 171
    .line 172
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    iput v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->b:F

    .line 177
    .line 178
    iget-object v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->n:Landroid/graphics/Rect;

    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    float-to-int v5, v5

    .line 189
    add-int/2addr v3, v5

    .line 190
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    float-to-int p1, p1

    .line 199
    add-int/2addr v5, p1

    .line 200
    invoke-virtual {v1, v3, v5}, Landroid/graphics/Rect;->contains(II)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    xor-int/2addr p1, v7

    .line 205
    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->m:Z

    .line 206
    .line 207
    if-eqz p1, :cond_1

    .line 208
    .line 209
    invoke-virtual {p0, v2}, Lcom/yuanqi/group/widgets/RippleButton;->setRadius(F)V

    .line 210
    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_1
    invoke-direct {p0, v4}, Lcom/yuanqi/group/widgets/RippleButton;->c(I)I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    int-to-float p1, p1

    .line 218
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/RippleButton;->setRadius(F)V

    .line 219
    .line 220
    .line 221
    :goto_0
    if-nez v0, :cond_4

    .line 222
    .line 223
    return v7

    .line 224
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-ne v1, v7, :cond_4

    .line 229
    .line 230
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->m:Z

    .line 231
    .line 232
    if-nez v1, :cond_4

    .line 233
    .line 234
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_4

    .line 239
    .line 240
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    iput v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->a:F

    .line 245
    .line 246
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    iput p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->b:F

    .line 251
    .line 252
    iget v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->a:F

    .line 253
    .line 254
    mul-float/2addr v1, v1

    .line 255
    mul-float/2addr p1, p1

    .line 256
    add-float/2addr v1, p1

    .line 257
    float-to-double v1, v1

    .line 258
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 259
    .line 260
    .line 261
    move-result-wide v1

    .line 262
    double-to-float p1, v1

    .line 263
    iget v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->f:F

    .line 264
    .line 265
    invoke-static {p1, v1}, Ljava/lang/Math;->max(FF)F

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    iget-boolean v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->h:Z

    .line 270
    .line 271
    if-eqz v1, :cond_3

    .line 272
    .line 273
    iget-object v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->l:Landroid/animation/ObjectAnimator;

    .line 274
    .line 275
    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    .line 276
    .line 277
    .line 278
    :cond_3
    new-array v1, v6, [F

    .line 279
    .line 280
    invoke-direct {p0, v4}, Lcom/yuanqi/group/widgets/RippleButton;->c(I)I

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    int-to-float v2, v2

    .line 285
    aput v2, v1, v5

    .line 286
    .line 287
    aput p1, v1, v7

    .line 288
    .line 289
    invoke-static {p0, v3, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    iput-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->l:Landroid/animation/ObjectAnimator;

    .line 294
    .line 295
    const-wide/16 v1, 0x1f4

    .line 296
    .line 297
    invoke-virtual {p1, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 298
    .line 299
    .line 300
    iget-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->l:Landroid/animation/ObjectAnimator;

    .line 301
    .line 302
    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 303
    .line 304
    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 308
    .line 309
    .line 310
    iget-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->l:Landroid/animation/ObjectAnimator;

    .line 311
    .line 312
    new-instance v1, Lcom/yuanqi/group/widgets/RippleButton$b;

    .line 313
    .line 314
    invoke-direct {v1, p0}, Lcom/yuanqi/group/widgets/RippleButton$b;-><init>(Lcom/yuanqi/group/widgets/RippleButton;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 318
    .line 319
    .line 320
    iget-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->l:Landroid/animation/ObjectAnimator;

    .line 321
    .line 322
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 323
    .line 324
    .line 325
    if-nez v0, :cond_4

    .line 326
    .line 327
    return v7

    .line 328
    :cond_4
    return v0
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
.end method

.method public setHover(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->i:Z

    return-void
.end method

.method public setRadius(F)V
    .locals 7

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->e:F

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    cmpl-float p1, p1, v0

    .line 5
    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Landroid/graphics/RadialGradient;

    .line 9
    .line 10
    iget v1, p0, Lcom/yuanqi/group/widgets/RippleButton;->a:F

    .line 11
    .line 12
    iget v2, p0, Lcom/yuanqi/group/widgets/RippleButton;->b:F

    .line 13
    .line 14
    iget v3, p0, Lcom/yuanqi/group/widgets/RippleButton;->e:F

    .line 15
    .line 16
    iget v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->g:I

    .line 17
    .line 18
    iget v4, p0, Lcom/yuanqi/group/widgets/RippleButton;->c:F

    .line 19
    .line 20
    invoke-virtual {p0, v0, v4}, Lcom/yuanqi/group/widgets/RippleButton;->b(IF)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    iget v5, p0, Lcom/yuanqi/group/widgets/RippleButton;->g:I

    .line 25
    .line 26
    sget-object v6, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    invoke-direct/range {v0 .. v6}, Landroid/graphics/RadialGradient;-><init>(FFFIILandroid/graphics/Shader$TileMode;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->j:Landroid/graphics/RadialGradient;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/yuanqi/group/widgets/RippleButton;->k:Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 40
    .line 41
    .line 42
    return-void
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
.end method

.method public setRippleColor(IF)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/RippleButton;->g:I

    .line 2
    .line 3
    iput p2, p0, Lcom/yuanqi/group/widgets/RippleButton;->c:F

    .line 4
    .line 5
    return-void
    .line 6
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
