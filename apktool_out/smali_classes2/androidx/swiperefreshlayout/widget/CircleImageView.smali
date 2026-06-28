.class Landroidx/swiperefreshlayout/widget/CircleImageView;
.super Landroid/widget/ImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/swiperefreshlayout/widget/CircleImageView$OvalShadow;
    }
.end annotation


# static fields
.field private static final FILL_SHADOW_COLOR:I = 0x3d000000

.field private static final KEY_SHADOW_COLOR:I = 0x1e000000

.field private static final SHADOW_ELEVATION:I = 0x4

.field private static final SHADOW_RADIUS:F = 3.5f

.field private static final X_OFFSET:F = 0.0f

.field private static final Y_OFFSET:F = 1.75f


# instance fields
.field private mListener:Landroid/view/animation/Animation$AnimationListener;

.field mShadowRadius:I


# direct methods
.method constructor <init>(Landroid/content/Context;I)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 17
    .line 18
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 19
    .line 20
    mul-float/2addr v0, p1

    .line 21
    float-to-int v0, v0

    .line 22
    const/4 v1, 0x0

    .line 23
    mul-float/2addr v1, p1

    .line 24
    float-to-int v1, v1

    .line 25
    const/high16 v2, 0x40600000    # 3.5f

    .line 26
    .line 27
    mul-float/2addr v2, p1

    .line 28
    float-to-int v2, v2

    .line 29
    iput v2, p0, Landroidx/swiperefreshlayout/widget/CircleImageView;->mShadowRadius:I

    .line 30
    .line 31
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/CircleImageView;->elevationSupported()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    .line 38
    .line 39
    new-instance v1, Landroid/graphics/drawable/shapes/OvalShape;

    .line 40
    .line 41
    invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 45
    .line 46
    .line 47
    const/high16 v1, 0x40800000    # 4.0f

    .line 48
    .line 49
    mul-float/2addr p1, v1

    .line 50
    invoke-static {p0, p1}, Landroidx/core/view/ViewCompat;->setElevation(Landroid/view/View;F)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Landroidx/swiperefreshlayout/widget/CircleImageView$OvalShadow;

    .line 55
    .line 56
    iget v2, p0, Landroidx/swiperefreshlayout/widget/CircleImageView;->mShadowRadius:I

    .line 57
    .line 58
    invoke-direct {p1, p0, v2}, Landroidx/swiperefreshlayout/widget/CircleImageView$OvalShadow;-><init>(Landroidx/swiperefreshlayout/widget/CircleImageView;I)V

    .line 59
    .line 60
    .line 61
    new-instance v2, Landroid/graphics/drawable/ShapeDrawable;

    .line 62
    .line 63
    invoke-direct {v2, p1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {p0, p1, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget v3, p0, Landroidx/swiperefreshlayout/widget/CircleImageView;->mShadowRadius:I

    .line 79
    .line 80
    int-to-float v3, v3

    .line 81
    int-to-float v1, v1

    .line 82
    int-to-float v0, v0

    .line 83
    const/high16 v4, 0x1e000000

    .line 84
    .line 85
    invoke-virtual {p1, v3, v1, v0, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 86
    .line 87
    .line 88
    iget p1, p0, Landroidx/swiperefreshlayout/widget/CircleImageView;->mShadowRadius:I

    .line 89
    .line 90
    invoke-virtual {p0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 91
    .line 92
    .line 93
    move-object v0, v2

    .line 94
    :goto_0
    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v0}, Landroidx/core/view/ViewCompat;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 102
    .line 103
    .line 104
    return-void
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
.end method

.method private elevationSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public onAnimationEnd()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAnimationEnd()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/CircleImageView;->mListener:Landroid/view/animation/Animation$AnimationListener;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Landroid/view/animation/Animation$AnimationListener;->onAnimationEnd(Landroid/view/animation/Animation;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public onAnimationStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAnimationStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/swiperefreshlayout/widget/CircleImageView;->mListener:Landroid/view/animation/Animation$AnimationListener;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, Landroid/view/animation/Animation$AnimationListener;->onAnimationStart(Landroid/view/animation/Animation;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method protected onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/swiperefreshlayout/widget/CircleImageView;->elevationSupported()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget p2, p0, Landroidx/swiperefreshlayout/widget/CircleImageView;->mShadowRadius:I

    .line 15
    .line 16
    mul-int/lit8 p2, p2, 0x2

    .line 17
    .line 18
    add-int/2addr p1, p2

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iget v0, p0, Landroidx/swiperefreshlayout/widget/CircleImageView;->mShadowRadius:I

    .line 24
    .line 25
    mul-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    add-int/2addr p2, v0

    .line 28
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
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

.method public setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
    .locals 0

    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/CircleImageView;->mListener:Landroid/view/animation/Animation$AnimationListener;

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroid/graphics/drawable/ShapeDrawable;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/graphics/drawable/ShapeDrawable;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
.end method

.method public setBackgroundColorRes(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/CircleImageView;->setBackgroundColor(I)V

    return-void
.end method
