.class public Landroidx/constraintlayout/utils/widget/MotionLabel;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroidx/constraintlayout/motion/widget/FloatLayout;


# static fields
.field private static final MONOSPACE:I = 0x3

.field private static final SANS:I = 0x1

.field private static final SERIF:I = 0x2

.field static TAG:Ljava/lang/String; = "MotionLabel"


# instance fields
.field private mAutoSize:Z

.field private mAutoSizeTextType:I

.field mBackgroundPanX:F

.field mBackgroundPanY:F

.field private mBaseTextSize:F

.field private mDeltaLeft:F

.field private mFloatHeight:F

.field private mFloatWidth:F

.field private mFontFamily:Ljava/lang/String;

.field private mGravity:I

.field private mLayout:Landroid/text/Layout;

.field mNotBuilt:Z

.field mOutlinePositionMatrix:Landroid/graphics/Matrix;

.field private mPaddingBottom:I

.field private mPaddingLeft:I

.field private mPaddingRight:I

.field private mPaddingTop:I

.field mPaint:Landroid/text/TextPaint;

.field mPath:Landroid/graphics/Path;

.field mRect:Landroid/graphics/RectF;

.field mRotate:F

.field private mRound:F

.field private mRoundPercent:F

.field private mStyleIndex:I

.field mTempPaint:Landroid/graphics/Paint;

.field mTempRect:Landroid/graphics/Rect;

.field private mText:Ljava/lang/String;

.field private mTextBackground:Landroid/graphics/drawable/Drawable;

.field private mTextBackgroundBitmap:Landroid/graphics/Bitmap;

.field private mTextBounds:Landroid/graphics/Rect;

.field private mTextFillColor:I

.field private mTextOutlineColor:I

.field private mTextOutlineThickness:F

.field private mTextPanX:F

.field private mTextPanY:F

.field private mTextShader:Landroid/graphics/BitmapShader;

.field private mTextShaderMatrix:Landroid/graphics/Matrix;

.field private mTextSize:F

.field private mTextureEffect:I

.field private mTextureHeight:F

.field private mTextureWidth:F

.field private mTransformed:Ljava/lang/CharSequence;

.field private mTypefaceIndex:I

.field private mUseOutline:Z

.field mViewOutlineProvider:Landroid/view/ViewOutlineProvider;

.field mZoom:F

.field paintCache:Landroid/graphics/Paint;

.field paintTextSize:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 3
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    const v0, 0xffff

    .line 4
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextFillColor:I

    .line 5
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineColor:I

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    const/4 v1, 0x0

    .line 7
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 8
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    const/high16 v3, 0x42400000    # 48.0f

    .line 9
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 10
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 11
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    const-string v3, "Hello World"

    .line 12
    iput-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mText:Ljava/lang/String;

    const/4 v3, 0x1

    .line 13
    iput-boolean v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mNotBuilt:Z

    .line 14
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBounds:Landroid/graphics/Rect;

    .line 15
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    .line 16
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingRight:I

    .line 17
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    .line 18
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingBottom:I

    const v3, 0x800033

    .line 19
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mGravity:I

    .line 20
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSizeTextType:I

    .line 21
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSize:Z

    .line 22
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 23
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 24
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    .line 25
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    .line 26
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintCache:Landroid/graphics/Paint;

    .line 27
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureEffect:I

    .line 28
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanX:F

    .line 29
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanY:F

    .line 30
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mZoom:F

    .line 31
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRotate:F

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, p1, v0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 35
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    const v0, 0xffff

    .line 36
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextFillColor:I

    .line 37
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineColor:I

    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    const/4 v1, 0x0

    .line 39
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 40
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    const/high16 v3, 0x42400000    # 48.0f

    .line 41
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 42
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 43
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    const-string v3, "Hello World"

    .line 44
    iput-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mText:Ljava/lang/String;

    const/4 v3, 0x1

    .line 45
    iput-boolean v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mNotBuilt:Z

    .line 46
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBounds:Landroid/graphics/Rect;

    .line 47
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    .line 48
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingRight:I

    .line 49
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    .line 50
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingBottom:I

    const v3, 0x800033

    .line 51
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mGravity:I

    .line 52
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSizeTextType:I

    .line 53
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSize:Z

    .line 54
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 55
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 56
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    .line 57
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    .line 58
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintCache:Landroid/graphics/Paint;

    .line 59
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureEffect:I

    .line 60
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanX:F

    .line 61
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanY:F

    .line 62
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mZoom:F

    .line 63
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRotate:F

    .line 64
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 65
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 66
    new-instance p3, Landroid/text/TextPaint;

    invoke-direct {p3}, Landroid/text/TextPaint;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 67
    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    const p3, 0xffff

    .line 68
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextFillColor:I

    .line 69
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineColor:I

    const/4 p3, 0x0

    .line 70
    iput-boolean p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    const/4 v0, 0x0

    .line 71
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 72
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    const/high16 v2, 0x42400000    # 48.0f

    .line 73
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 74
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 75
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    const-string v2, "Hello World"

    .line 76
    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mText:Ljava/lang/String;

    const/4 v2, 0x1

    .line 77
    iput-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mNotBuilt:Z

    .line 78
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBounds:Landroid/graphics/Rect;

    .line 79
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    .line 80
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingRight:I

    .line 81
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    .line 82
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingBottom:I

    const v2, 0x800033

    .line 83
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mGravity:I

    .line 84
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSizeTextType:I

    .line 85
    iput-boolean p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSize:Z

    .line 86
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 87
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 88
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    .line 89
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    .line 90
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintCache:Landroid/graphics/Paint;

    .line 91
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureEffect:I

    .line 92
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanX:F

    .line 93
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanY:F

    .line 94
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mZoom:F

    .line 95
    iput v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRotate:F

    .line 96
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Landroidx/constraintlayout/utils/widget/MotionLabel;)F
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    return p0
.end method

.method static synthetic access$100(Landroidx/constraintlayout/utils/widget/MotionLabel;)F
    .locals 0

    iget p0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    return p0
.end method

.method private adjustTexture(FFFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShaderMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sub-float/2addr p3, p1

    .line 7
    iput p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatWidth:F

    .line 8
    .line 9
    sub-float/2addr p4, p2

    .line 10
    iput p4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatHeight:F

    .line 11
    .line 12
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->updateShaderMatrix()V

    .line 13
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
.end method

.method private getHorizontalOffset()F
    .locals 6

    .line 1
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 14
    .line 15
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 16
    .line 17
    div-float/2addr v0, v2

    .line 18
    :goto_0
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 19
    .line 20
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mText:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {v2, v3, v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    mul-float/2addr v0, v2

    .line 32
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatWidth:F

    .line 33
    .line 34
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    int-to-float v2, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatWidth:F

    .line 47
    .line 48
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    int-to-float v3, v3

    .line 53
    sub-float/2addr v2, v3

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    int-to-float v3, v3

    .line 59
    sub-float/2addr v2, v3

    .line 60
    sub-float/2addr v2, v0

    .line 61
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    .line 62
    .line 63
    add-float/2addr v0, v1

    .line 64
    mul-float/2addr v2, v0

    .line 65
    const/high16 v0, 0x40000000    # 2.0f

    .line 66
    .line 67
    div-float/2addr v2, v0

    .line 68
    return v2
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

.method private getVerticalOffset()F
    .locals 5

    .line 1
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 14
    .line 15
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 16
    .line 17
    div-float/2addr v0, v2

    .line 18
    :goto_0
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatHeight:F

    .line 25
    .line 26
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    int-to-float v3, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatHeight:F

    .line 39
    .line 40
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    int-to-float v4, v4

    .line 45
    sub-float/2addr v3, v4

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    int-to-float v4, v4

    .line 51
    sub-float/2addr v3, v4

    .line 52
    iget v4, v2, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 53
    .line 54
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 55
    .line 56
    sub-float/2addr v4, v2

    .line 57
    mul-float/2addr v4, v0

    .line 58
    sub-float/2addr v3, v4

    .line 59
    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    .line 60
    .line 61
    sub-float/2addr v1, v4

    .line 62
    mul-float/2addr v3, v1

    .line 63
    const/high16 v1, 0x40000000    # 2.0f

    .line 64
    .line 65
    div-float/2addr v3, v1

    .line 66
    mul-float/2addr v0, v2

    .line 67
    sub-float/2addr v3, v0

    .line 68
    return v3
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

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setUpTheme(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_18

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel:[I

    .line 11
    .line 12
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 v0, 0x0

    .line 21
    move v1, v0

    .line 22
    :goto_0
    if-ge v1, p2, :cond_17

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_android_text:I

    .line 29
    .line 30
    if-ne v2, v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_0
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_android_fontFamily:I

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFontFamily:Ljava/lang/String;

    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :cond_1
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_scaleFromTextSize:I

    .line 54
    .line 55
    if-ne v2, v3, :cond_2

    .line 56
    .line 57
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 58
    .line 59
    float-to-int v3, v3

    .line 60
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    int-to-float v2, v2

    .line 65
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :cond_2
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_android_textSize:I

    .line 70
    .line 71
    if-ne v2, v3, :cond_3

    .line 72
    .line 73
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 74
    .line 75
    float-to-int v3, v3

    .line 76
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    int-to-float v2, v2

    .line 81
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_3
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_android_textStyle:I

    .line 86
    .line 87
    if-ne v2, v3, :cond_4

    .line 88
    .line 89
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mStyleIndex:I

    .line 90
    .line 91
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mStyleIndex:I

    .line 96
    .line 97
    goto/16 :goto_1

    .line 98
    .line 99
    :cond_4
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_android_typeface:I

    .line 100
    .line 101
    if-ne v2, v3, :cond_5

    .line 102
    .line 103
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTypefaceIndex:I

    .line 104
    .line 105
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTypefaceIndex:I

    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :cond_5
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_android_textColor:I

    .line 114
    .line 115
    if-ne v2, v3, :cond_6

    .line 116
    .line 117
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextFillColor:I

    .line 118
    .line 119
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextFillColor:I

    .line 124
    .line 125
    goto/16 :goto_1

    .line 126
    .line 127
    :cond_6
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_borderRound:I

    .line 128
    .line 129
    if-ne v2, v3, :cond_7

    .line 130
    .line 131
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    .line 132
    .line 133
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    .line 138
    .line 139
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setRound(F)V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_1

    .line 143
    .line 144
    :cond_7
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_borderRoundPercent:I

    .line 145
    .line 146
    if-ne v2, v3, :cond_8

    .line 147
    .line 148
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    .line 149
    .line 150
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    .line 155
    .line 156
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setRoundPercent(F)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_1

    .line 160
    .line 161
    :cond_8
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_android_gravity:I

    .line 162
    .line 163
    if-ne v2, v3, :cond_9

    .line 164
    .line 165
    const/4 v3, -0x1

    .line 166
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setGravity(I)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_1

    .line 174
    .line 175
    :cond_9
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_android_autoSizeTextType:I

    .line 176
    .line 177
    if-ne v2, v3, :cond_a

    .line 178
    .line 179
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSizeTextType:I

    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :cond_a
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textOutlineColor:I

    .line 188
    .line 189
    const/4 v4, 0x1

    .line 190
    if-ne v2, v3, :cond_b

    .line 191
    .line 192
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineColor:I

    .line 193
    .line 194
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineColor:I

    .line 199
    .line 200
    iput-boolean v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    .line 201
    .line 202
    goto/16 :goto_1

    .line 203
    .line 204
    :cond_b
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textOutlineThickness:I

    .line 205
    .line 206
    if-ne v2, v3, :cond_c

    .line 207
    .line 208
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    .line 209
    .line 210
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    .line 215
    .line 216
    iput-boolean v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    .line 217
    .line 218
    goto/16 :goto_1

    .line 219
    .line 220
    :cond_c
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textBackground:I

    .line 221
    .line 222
    if-ne v2, v3, :cond_d

    .line 223
    .line 224
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackground:Landroid/graphics/drawable/Drawable;

    .line 229
    .line 230
    iput-boolean v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :cond_d
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textBackgroundPanX:I

    .line 235
    .line 236
    if-ne v2, v3, :cond_e

    .line 237
    .line 238
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanX:F

    .line 239
    .line 240
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanX:F

    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :cond_e
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textBackgroundPanY:I

    .line 249
    .line 250
    if-ne v2, v3, :cond_f

    .line 251
    .line 252
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanY:F

    .line 253
    .line 254
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanY:F

    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_f
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textPanX:I

    .line 262
    .line 263
    if-ne v2, v3, :cond_10

    .line 264
    .line 265
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    .line 266
    .line 267
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    .line 272
    .line 273
    goto :goto_1

    .line 274
    :cond_10
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textPanY:I

    .line 275
    .line 276
    if-ne v2, v3, :cond_11

    .line 277
    .line 278
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    .line 279
    .line 280
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    .line 285
    .line 286
    goto :goto_1

    .line 287
    :cond_11
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textBackgroundRotate:I

    .line 288
    .line 289
    if-ne v2, v3, :cond_12

    .line 290
    .line 291
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRotate:F

    .line 292
    .line 293
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRotate:F

    .line 298
    .line 299
    goto :goto_1

    .line 300
    :cond_12
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textBackgroundZoom:I

    .line 301
    .line 302
    if-ne v2, v3, :cond_13

    .line 303
    .line 304
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mZoom:F

    .line 305
    .line 306
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mZoom:F

    .line 311
    .line 312
    goto :goto_1

    .line 313
    :cond_13
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textureHeight:I

    .line 314
    .line 315
    if-ne v2, v3, :cond_14

    .line 316
    .line 317
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 318
    .line 319
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 324
    .line 325
    goto :goto_1

    .line 326
    :cond_14
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textureWidth:I

    .line 327
    .line 328
    if-ne v2, v3, :cond_15

    .line 329
    .line 330
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 331
    .line 332
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 337
    .line 338
    goto :goto_1

    .line 339
    :cond_15
    sget v3, Landroidx/constraintlayout/widget/R$styleable;->MotionLabel_textureEffect:I

    .line 340
    .line 341
    if-ne v2, v3, :cond_16

    .line 342
    .line 343
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureEffect:I

    .line 344
    .line 345
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureEffect:I

    .line 350
    .line 351
    :cond_16
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 352
    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :cond_17
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 356
    .line 357
    .line 358
    :cond_18
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setupTexture()V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setupPath()V

    .line 362
    .line 363
    .line 364
    return-void
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
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
.end method

.method private setTypefaceFromAttrs(Ljava/lang/String;II)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1, p3}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setTypeface(Landroid/graphics/Typeface;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :cond_1
    const/4 v0, 0x2

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq p2, v1, :cond_4

    .line 17
    .line 18
    if-eq p2, v0, :cond_3

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    if-eq p2, v2, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 31
    .line 32
    :goto_0
    const/4 p2, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    if-lez p3, :cond_9

    .line 35
    .line 36
    if-nez p1, :cond_5

    .line 37
    .line 38
    invoke-static {p3}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    goto :goto_1

    .line 43
    :cond_5
    invoke-static {p1, p3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setTypeface(Landroid/graphics/Typeface;)V

    .line 48
    .line 49
    .line 50
    if-eqz p1, :cond_6

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/graphics/Typeface;->getStyle()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    goto :goto_2

    .line 57
    :cond_6
    move p1, v2

    .line 58
    :goto_2
    not-int p1, p1

    .line 59
    and-int/2addr p1, p3

    .line 60
    iget-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 61
    .line 62
    and-int/lit8 v3, p1, 0x1

    .line 63
    .line 64
    if-eqz v3, :cond_7

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_7
    move v1, v2

    .line 68
    :goto_3
    invoke-virtual {p3, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 69
    .line 70
    .line 71
    iget-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 72
    .line 73
    and-int/2addr p1, v0

    .line 74
    if-eqz p1, :cond_8

    .line 75
    .line 76
    const/high16 p2, -0x41800000    # -0.25f

    .line 77
    .line 78
    :cond_8
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 79
    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_9
    iget-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 83
    .line 84
    invoke-virtual {p3, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 85
    .line 86
    .line 87
    iget-object p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 88
    .line 89
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setTextSkewX(F)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setTypeface(Landroid/graphics/Typeface;)V

    .line 93
    .line 94
    .line 95
    :goto_4
    return-void
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

.method private setUpTheme(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance p2, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget v0, Landroidx/appcompat/R$attr;->colorPrimary:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p1, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 17
    .line 18
    iget p2, p2, Landroid/util/TypedValue;->data:I

    .line 19
    .line 20
    iput p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextFillColor:I

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

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
.end method

.method private setupTexture()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackground:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShaderMatrix:Landroid/graphics/Matrix;

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackground:Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackground:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/16 v2, 0x80

    .line 25
    .line 26
    if-gtz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    move v0, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 45
    .line 46
    float-to-int v0, v0

    .line 47
    :cond_1
    :goto_0
    if-gtz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 65
    .line 66
    float-to-int v2, v1

    .line 67
    :goto_1
    move v1, v2

    .line 68
    :cond_3
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureEffect:I

    .line 69
    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    div-int/lit8 v0, v0, 0x2

    .line 73
    .line 74
    div-int/lit8 v1, v1, 0x2

    .line 75
    .line 76
    :cond_4
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 83
    .line 84
    new-instance v0, Landroid/graphics/Canvas;

    .line 85
    .line 86
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 87
    .line 88
    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackground:Landroid/graphics/drawable/Drawable;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getHeight()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    const/4 v4, 0x0

    .line 102
    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackground:Landroid/graphics/drawable/Drawable;

    .line 106
    .line 107
    const/4 v2, 0x1

    .line 108
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackground:Landroid/graphics/drawable/Drawable;

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 114
    .line 115
    .line 116
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureEffect:I

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 121
    .line 122
    const/4 v1, 0x4

    .line 123
    invoke-virtual {p0, v0, v1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->blur(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 128
    .line 129
    :cond_5
    new-instance v0, Landroid/graphics/BitmapShader;

    .line 130
    .line 131
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 132
    .line 133
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 134
    .line 135
    invoke-direct {v0, v1, v2, v2}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 136
    .line 137
    .line 138
    iput-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShader:Landroid/graphics/BitmapShader;

    .line 139
    .line 140
    :cond_6
    return-void
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
.end method

.method private updateShaderMatrix()V
    .locals 11

    .line 1
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanX:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanX:F

    .line 13
    .line 14
    :goto_0
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanY:F

    .line 15
    .line 16
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    move v2, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanY:F

    .line 25
    .line 26
    :goto_1
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mZoom:F

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    const/high16 v3, 0x3f800000    # 1.0f

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mZoom:F

    .line 38
    .line 39
    :goto_2
    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRotate:F

    .line 40
    .line 41
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRotate:F

    .line 49
    .line 50
    :goto_3
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShaderMatrix:Landroid/graphics/Matrix;

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    .line 53
    .line 54
    .line 55
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 56
    .line 57
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    int-to-float v4, v4

    .line 62
    iget-object v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBackgroundBitmap:Landroid/graphics/Bitmap;

    .line 63
    .line 64
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    int-to-float v5, v5

    .line 69
    iget v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 70
    .line 71
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    iget v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatWidth:F

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_4
    iget v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 81
    .line 82
    :goto_4
    iget v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 83
    .line 84
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    iget v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatHeight:F

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_5
    iget v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 94
    .line 95
    :goto_5
    mul-float v8, v4, v7

    .line 96
    .line 97
    mul-float v9, v5, v6

    .line 98
    .line 99
    cmpg-float v8, v8, v9

    .line 100
    .line 101
    if-gez v8, :cond_6

    .line 102
    .line 103
    div-float v8, v6, v4

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_6
    div-float v8, v7, v5

    .line 107
    .line 108
    :goto_6
    mul-float/2addr v3, v8

    .line 109
    iget-object v8, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShaderMatrix:Landroid/graphics/Matrix;

    .line 110
    .line 111
    invoke-virtual {v8, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 112
    .line 113
    .line 114
    mul-float/2addr v4, v3

    .line 115
    sub-float v8, v6, v4

    .line 116
    .line 117
    mul-float/2addr v3, v5

    .line 118
    sub-float v5, v7, v3

    .line 119
    .line 120
    iget v9, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 121
    .line 122
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    const/high16 v10, 0x40000000    # 2.0f

    .line 127
    .line 128
    if-nez v9, :cond_7

    .line 129
    .line 130
    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 131
    .line 132
    div-float/2addr v5, v10

    .line 133
    :cond_7
    iget v9, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 134
    .line 135
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-nez v9, :cond_8

    .line 140
    .line 141
    iget v8, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 142
    .line 143
    div-float/2addr v8, v10

    .line 144
    :cond_8
    mul-float/2addr v0, v8

    .line 145
    add-float/2addr v0, v6

    .line 146
    sub-float/2addr v0, v4

    .line 147
    const/high16 v4, 0x3f000000    # 0.5f

    .line 148
    .line 149
    mul-float/2addr v0, v4

    .line 150
    mul-float/2addr v2, v5

    .line 151
    add-float/2addr v2, v7

    .line 152
    sub-float/2addr v2, v3

    .line 153
    mul-float/2addr v2, v4

    .line 154
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShaderMatrix:Landroid/graphics/Matrix;

    .line 155
    .line 156
    invoke-virtual {v3, v0, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShaderMatrix:Landroid/graphics/Matrix;

    .line 160
    .line 161
    div-float/2addr v6, v10

    .line 162
    div-float/2addr v7, v10

    .line 163
    invoke-virtual {v0, v1, v6, v7}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 164
    .line 165
    .line 166
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShader:Landroid/graphics/BitmapShader;

    .line 167
    .line 168
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShaderMatrix:Landroid/graphics/Matrix;

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 171
    .line 172
    .line 173
    return-void
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


# virtual methods
.method blur(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    div-int/lit8 v0, v0, 0x2

    .line 13
    .line 14
    div-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-static {p1, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_0
    if-ge v3, p2, :cond_1

    .line 23
    .line 24
    const/16 v4, 0x20

    .line 25
    .line 26
    if-lt v0, v4, :cond_1

    .line 27
    .line 28
    if-ge v1, v4, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    div-int/lit8 v0, v0, 0x2

    .line 32
    .line 33
    div-int/lit8 v1, v1, 0x2

    .line 34
    .line 35
    invoke-static {p1, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :goto_1
    return-object p1
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method buildShape(F)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    cmpl-float v0, p1, v1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mText:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBounds:Landroid/graphics/Rect;

    .line 26
    .line 27
    const/4 v9, 0x0

    .line 28
    invoke-virtual {v0, v3, v9, v5, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    iget-object v8, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 37
    .line 38
    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    .line 39
    .line 40
    .line 41
    cmpl-float v0, p1, v1

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    sget-object v0, Landroidx/constraintlayout/utils/widget/MotionLabel;->TAG:Ljava/lang/String;

    .line 46
    .line 47
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Landroidx/constraintlayout/motion/widget/Debug;->getLoc()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v2, " scale "

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    new-instance v0, Landroid/graphics/Matrix;

    .line 75
    .line 76
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1, p1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBounds:Landroid/graphics/Rect;

    .line 88
    .line 89
    iget v0, p1, Landroid/graphics/Rect;->right:I

    .line 90
    .line 91
    add-int/lit8 v0, v0, -0x1

    .line 92
    .line 93
    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 94
    .line 95
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 96
    .line 97
    add-int/lit8 v0, v0, 0x1

    .line 98
    .line 99
    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 100
    .line 101
    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 102
    .line 103
    add-int/lit8 v0, v0, 0x1

    .line 104
    .line 105
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 106
    .line 107
    iget v0, p1, Landroid/graphics/Rect;->top:I

    .line 108
    .line 109
    add-int/lit8 v0, v0, -0x1

    .line 110
    .line 111
    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 112
    .line 113
    new-instance p1, Landroid/graphics/RectF;

    .line 114
    .line 115
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    int-to-float v0, v0

    .line 123
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    int-to-float v0, v0

    .line 130
    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 131
    .line 132
    iput-boolean v9, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mNotBuilt:Z

    .line 133
    .line 134
    return-void
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

.method public getRound()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    return v0
.end method

.method public getRoundPercent()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    return v0
.end method

.method public getScaleFromTextSize()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    return v0
.end method

.method public getTextBackgroundPanX()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanX:F

    return v0
.end method

.method public getTextBackgroundPanY()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanY:F

    return v0
.end method

.method public getTextBackgroundRotate()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRotate:F

    return v0
.end method

.method public getTextBackgroundZoom()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mZoom:F

    return v0
.end method

.method public getTextOutlineColor()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineColor:I

    return v0
.end method

.method public getTextPanX()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    return v0
.end method

.method public getTextPanY()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    return v0
.end method

.method public getTextureHeight()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    return v0
.end method

.method public getTextureWidth()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    return v0
.end method

.method public getTypeface()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public layout(FFFF)V
    .locals 8

    const/high16 v0, 0x3f000000    # 0.5f

    add-float v1, p1, v0

    float-to-int v1, v1

    int-to-float v2, v1

    sub-float v2, p1, v2

    .line 22
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mDeltaLeft:F

    add-float v2, p3, v0

    float-to-int v2, v2

    sub-int v3, v2, v1

    add-float v4, p4, v0

    float-to-int v4, v4

    add-float/2addr v0, p2

    float-to-int v0, v0

    sub-int v5, v4, v0

    sub-float v6, p3, p1

    .line 23
    iput v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatWidth:F

    sub-float v7, p4, p2

    .line 24
    iput v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatHeight:F

    .line 25
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/utils/widget/MotionLabel;->adjustTexture(FFFF)V

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    if-ne p1, v5, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    if-eq p1, v3, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    invoke-super {p0, v1, v0, v2, v4}, Landroid/view/View;->layout(IIII)V

    goto :goto_1

    :cond_1
    :goto_0
    const/high16 p1, 0x40000000    # 2.0f

    .line 28
    invoke-static {v3, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 29
    invoke-static {v5, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 30
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->measure(II)V

    .line 31
    invoke-super {p0, v1, v0, v2, v4}, Landroid/view/View;->layout(IIII)V

    .line 32
    :goto_1
    iget-boolean p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSize:Z

    if-eqz p1, :cond_6

    .line 33
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempRect:Landroid/graphics/Rect;

    if-nez p1, :cond_2

    .line 34
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempPaint:Landroid/graphics/Paint;

    .line 35
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempRect:Landroid/graphics/Rect;

    .line 36
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempPaint:Landroid/graphics/Paint;

    iget-object p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 37
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempPaint:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result p1

    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintTextSize:F

    .line 38
    :cond_2
    iput v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatWidth:F

    .line 39
    iput v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatHeight:F

    .line 40
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempPaint:Landroid/graphics/Paint;

    iget-object p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mText:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    iget-object p4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempRect:Landroid/graphics/Rect;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 41
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    .line 42
    iget-object p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    const p3, 0x3fa66666    # 1.3f

    mul-float/2addr p2, p3

    .line 43
    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingRight:I

    int-to-float p3, p3

    sub-float/2addr v6, p3

    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    int-to-float p3, p3

    sub-float/2addr v6, p3

    .line 44
    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingBottom:I

    int-to-float p3, p3

    sub-float/2addr v7, p3

    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    int-to-float p3, p3

    sub-float/2addr v7, p3

    int-to-float p1, p1

    mul-float p3, p1, v7

    mul-float p4, p2, v6

    cmpl-float p3, p3, p4

    if-lez p3, :cond_3

    .line 45
    iget-object p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintTextSize:F

    mul-float/2addr p3, v6

    div-float/2addr p3, p1

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_2

    .line 46
    :cond_3
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    iget p3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintTextSize:F

    mul-float/2addr p3, v7

    div-float/2addr p3, p2

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 47
    :goto_2
    iget-boolean p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    if-nez p1, :cond_4

    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-nez p1, :cond_6

    .line 48
    :cond_4
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_5

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_5
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    iget p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    div-float/2addr p1, p2

    :goto_3
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->buildShape(F)V

    :cond_6
    return-void
.end method

.method public layout(IIII)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    .line 2
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_0

    .line 3
    :cond_0
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    div-float/2addr v1, v2

    :goto_0
    sub-int v2, p3, p1

    int-to-float v2, v2

    .line 4
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatWidth:F

    sub-int v2, p4, p2

    int-to-float v2, v2

    .line 5
    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatHeight:F

    .line 6
    iget-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSize:Z

    if-eqz v2, :cond_5

    .line 7
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempRect:Landroid/graphics/Rect;

    if-nez v2, :cond_1

    .line 8
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempPaint:Landroid/graphics/Paint;

    .line 9
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempRect:Landroid/graphics/Rect;

    .line 10
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempPaint:Landroid/graphics/Paint;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 11
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempPaint:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintTextSize:F

    .line 12
    :cond_1
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempPaint:Landroid/graphics/Paint;

    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mText:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    iget-object v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempRect:Landroid/graphics/Rect;

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v6, v4, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 13
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    .line 14
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    const v4, 0x3fa66666    # 1.3f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    .line 15
    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatWidth:F

    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingRight:I

    int-to-float v5, v5

    sub-float/2addr v4, v5

    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    int-to-float v5, v5

    sub-float/2addr v4, v5

    .line 16
    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFloatHeight:F

    iget v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingBottom:I

    int-to-float v6, v6

    sub-float/2addr v5, v6

    iget v6, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    int-to-float v6, v6

    sub-float/2addr v5, v6

    if-eqz v0, :cond_3

    int-to-float v2, v2

    mul-float v6, v2, v5

    int-to-float v3, v3

    mul-float v7, v3, v4

    cmpl-float v6, v6, v7

    if-lez v6, :cond_2

    .line 17
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    iget v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintTextSize:F

    mul-float/2addr v5, v4

    div-float/2addr v5, v2

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_1

    .line 18
    :cond_2
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintTextSize:F

    mul-float/2addr v4, v5

    div-float/2addr v4, v3

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_1

    :cond_3
    int-to-float v1, v2

    mul-float v2, v1, v5

    int-to-float v3, v3

    mul-float v6, v3, v4

    cmpl-float v2, v2, v6

    if-lez v2, :cond_4

    div-float/2addr v4, v1

    move v1, v4

    goto :goto_1

    :cond_4
    div-float/2addr v5, v3

    move v1, v5

    .line 19
    :cond_5
    :goto_1
    iget-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    if-nez v2, :cond_6

    if-nez v0, :cond_7

    :cond_6
    int-to-float p1, p1

    int-to-float p2, p2

    int-to-float p3, p3

    int-to-float p4, p4

    .line 20
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/utils/widget/MotionLabel;->adjustTexture(FFFF)V

    .line 21
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->buildShape(F)V

    :cond_7
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 14
    .line 15
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 16
    .line 17
    div-float/2addr v0, v2

    .line 18
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    cmpl-float v1, v0, v1

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    .line 30
    .line 31
    int-to-float v0, v0

    .line 32
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->getHorizontalOffset()F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-float/2addr v0, v1

    .line 37
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    .line 38
    .line 39
    int-to-float v1, v1

    .line 40
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->getVerticalOffset()F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-float/2addr v1, v2

    .line 45
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mText:Ljava/lang/String;

    .line 46
    .line 47
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mDeltaLeft:F

    .line 48
    .line 49
    add-float/2addr v3, v0

    .line 50
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 51
    .line 52
    invoke-virtual {p1, v2, v3, v1, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    iget-boolean v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mNotBuilt:Z

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->buildShape(F)V

    .line 61
    .line 62
    .line 63
    :cond_2
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    new-instance v1, Landroid/graphics/Matrix;

    .line 68
    .line 69
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 73
    .line 74
    :cond_3
    iget-boolean v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    .line 75
    .line 76
    if-eqz v1, :cond_6

    .line 77
    .line 78
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintCache:Landroid/graphics/Paint;

    .line 79
    .line 80
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 88
    .line 89
    .line 90
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    .line 91
    .line 92
    int-to-float v1, v1

    .line 93
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->getHorizontalOffset()F

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    add-float/2addr v1, v2

    .line 98
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    .line 99
    .line 100
    int-to-float v2, v2

    .line 101
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->getVerticalOffset()F

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    add-float/2addr v2, v3

    .line 106
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 107
    .line 108
    invoke-virtual {v3, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 112
    .line 113
    invoke-virtual {v3, v0, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 117
    .line 118
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 119
    .line 120
    invoke-virtual {v0, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShader:Landroid/graphics/BitmapShader;

    .line 124
    .line 125
    if-eqz v0, :cond_4

    .line 126
    .line 127
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 128
    .line 129
    const/4 v3, 0x1

    .line 130
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 131
    .line 132
    .line 133
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 134
    .line 135
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShader:Landroid/graphics/BitmapShader;

    .line 136
    .line 137
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_4
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 142
    .line 143
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextFillColor:I

    .line 144
    .line 145
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 146
    .line 147
    .line 148
    :goto_1
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 149
    .line 150
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 151
    .line 152
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 156
    .line 157
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    .line 158
    .line 159
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 160
    .line 161
    .line 162
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 163
    .line 164
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 165
    .line 166
    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextShader:Landroid/graphics/BitmapShader;

    .line 170
    .line 171
    if-eqz v0, :cond_5

    .line 172
    .line 173
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 174
    .line 175
    const/4 v3, 0x0

    .line 176
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 177
    .line 178
    .line 179
    :cond_5
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 180
    .line 181
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineColor:I

    .line 182
    .line 183
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 187
    .line 188
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 189
    .line 190
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 194
    .line 195
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    .line 196
    .line 197
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 198
    .line 199
    .line 200
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 201
    .line 202
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 203
    .line 204
    invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 205
    .line 206
    .line 207
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 208
    .line 209
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 210
    .line 211
    .line 212
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 213
    .line 214
    neg-float v0, v1

    .line 215
    neg-float v1, v2

    .line 216
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 217
    .line 218
    .line 219
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 220
    .line 221
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 222
    .line 223
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 227
    .line 228
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->paintCache:Landroid/graphics/Paint;

    .line 229
    .line 230
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_6
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    .line 235
    .line 236
    int-to-float v0, v0

    .line 237
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->getHorizontalOffset()F

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    add-float/2addr v0, v1

    .line 242
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    .line 243
    .line 244
    int-to-float v1, v1

    .line 245
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->getVerticalOffset()F

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    add-float/2addr v1, v2

    .line 250
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 251
    .line 252
    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 253
    .line 254
    .line 255
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 256
    .line 257
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 258
    .line 259
    .line 260
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 261
    .line 262
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 263
    .line 264
    invoke-virtual {v2, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 265
    .line 266
    .line 267
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 268
    .line 269
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextFillColor:I

    .line 270
    .line 271
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 272
    .line 273
    .line 274
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 275
    .line 276
    sget-object v3, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 277
    .line 278
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 279
    .line 280
    .line 281
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 282
    .line 283
    iget v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    .line 284
    .line 285
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 286
    .line 287
    .line 288
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 289
    .line 290
    iget-object v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 291
    .line 292
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 293
    .line 294
    .line 295
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 296
    .line 297
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 298
    .line 299
    .line 300
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 301
    .line 302
    neg-float v0, v0

    .line 303
    neg-float v1, v1

    .line 304
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 305
    .line 306
    .line 307
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 308
    .line 309
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mOutlinePositionMatrix:Landroid/graphics/Matrix;

    .line 310
    .line 311
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 312
    .line 313
    .line 314
    :goto_2
    return-void
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

.method protected onMeasure(II)V
    .locals 8

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 v2, 0x0

    .line 18
    iput-boolean v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSize:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingRight:I

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingBottom:I

    .line 43
    .line 44
    const/high16 v3, 0x40000000    # 2.0f

    .line 45
    .line 46
    if-ne v0, v3, :cond_1

    .line 47
    .line 48
    if-eq v1, v3, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSizeTextType:I

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mAutoSize:Z

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    :goto_0
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 60
    .line 61
    iget-object v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mText:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    iget-object v7, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBounds:Landroid/graphics/Rect;

    .line 68
    .line 69
    invoke-virtual {v4, v5, v2, v6, v7}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 70
    .line 71
    .line 72
    const v2, 0x3f7fff58    # 0.99999f

    .line 73
    .line 74
    .line 75
    if-eq v0, v3, :cond_2

    .line 76
    .line 77
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextBounds:Landroid/graphics/Rect;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    int-to-float p1, p1

    .line 84
    add-float/2addr p1, v2

    .line 85
    float-to-int p1, p1

    .line 86
    :cond_2
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    .line 87
    .line 88
    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingRight:I

    .line 89
    .line 90
    add-int/2addr v0, v4

    .line 91
    add-int/2addr p1, v0

    .line 92
    if-eq v1, v3, :cond_4

    .line 93
    .line 94
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 95
    .line 96
    const/4 v3, 0x0

    .line 97
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    int-to-float v0, v0

    .line 102
    add-float/2addr v0, v2

    .line 103
    float-to-int v0, v0

    .line 104
    const/high16 v2, -0x80000000

    .line 105
    .line 106
    if-ne v1, v2, :cond_3

    .line 107
    .line 108
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    :cond_3
    iget p2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    .line 113
    .line 114
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingBottom:I

    .line 115
    .line 116
    add-int/2addr p2, v1

    .line 117
    add-int/2addr p2, v0

    .line 118
    :cond_4
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 119
    .line 120
    .line 121
    return-void
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

.method public setGravity(I)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RtlHardcoded"
        }
    .end annotation

    .line 1
    const v0, 0x800007

    .line 2
    .line 3
    .line 4
    and-int v1, p1, v0

    .line 5
    .line 6
    const v2, 0x800003

    .line 7
    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    or-int/2addr p1, v2

    .line 12
    :cond_0
    and-int/lit8 v1, p1, 0x70

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x30

    .line 17
    .line 18
    :cond_1
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mGravity:I

    .line 19
    .line 20
    if-eq p1, v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    :cond_2
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mGravity:I

    .line 26
    .line 27
    and-int/lit8 v1, p1, 0x70

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    const/high16 v4, 0x3f800000    # 1.0f

    .line 31
    .line 32
    const/high16 v5, -0x40800000    # -1.0f

    .line 33
    .line 34
    const/16 v6, 0x30

    .line 35
    .line 36
    if-eq v1, v6, :cond_4

    .line 37
    .line 38
    const/16 v6, 0x50

    .line 39
    .line 40
    if-eq v1, v6, :cond_3

    .line 41
    .line 42
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    iput v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iput v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    .line 49
    .line 50
    :goto_0
    and-int/2addr p1, v0

    .line 51
    const/4 v0, 0x3

    .line 52
    if-eq p1, v0, :cond_6

    .line 53
    .line 54
    const/4 v0, 0x5

    .line 55
    if-eq p1, v0, :cond_5

    .line 56
    .line 57
    if-eq p1, v2, :cond_6

    .line 58
    .line 59
    const v0, 0x800005

    .line 60
    .line 61
    .line 62
    if-eq p1, v0, :cond_5

    .line 63
    .line 64
    iput v3, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_5
    iput v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_6
    iput v5, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    .line 71
    .line 72
    :goto_1
    return-void
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public setRound(F)V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x15
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    .line 8
    .line 9
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    .line 10
    .line 11
    const/high16 v0, -0x40800000    # -1.0f

    .line 12
    .line 13
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setRoundPercent(F)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    .line 20
    .line 21
    cmpl-float v0, v0, p1

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v0, v2

    .line 30
    :goto_0
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    cmpl-float p1, p1, v3

    .line 34
    .line 35
    if-eqz p1, :cond_5

    .line 36
    .line 37
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    new-instance p1, Landroid/graphics/Path;

    .line 42
    .line 43
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRect:Landroid/graphics/RectF;

    .line 49
    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    new-instance p1, Landroid/graphics/RectF;

    .line 53
    .line 54
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRect:Landroid/graphics/RectF;

    .line 58
    .line 59
    :cond_3
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mViewOutlineProvider:Landroid/view/ViewOutlineProvider;

    .line 60
    .line 61
    if-nez p1, :cond_4

    .line 62
    .line 63
    new-instance p1, Landroidx/constraintlayout/utils/widget/MotionLabel$2;

    .line 64
    .line 65
    invoke-direct {p1, p0}, Landroidx/constraintlayout/utils/widget/MotionLabel$2;-><init>(Landroidx/constraintlayout/utils/widget/MotionLabel;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mViewOutlineProvider:Landroid/view/ViewOutlineProvider;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-virtual {p0, v1}, Landroid/view/View;->setClipToOutline(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iget-object v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRect:Landroid/graphics/RectF;

    .line 85
    .line 86
    int-to-float p1, p1

    .line 87
    int-to-float v1, v1

    .line 88
    invoke-virtual {v2, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 97
    .line 98
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRect:Landroid/graphics/RectF;

    .line 99
    .line 100
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRound:F

    .line 101
    .line 102
    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 103
    .line 104
    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    invoke-virtual {p0, v2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 109
    .line 110
    .line 111
    :goto_1
    if-eqz v0, :cond_6

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->invalidateOutline()V

    .line 114
    .line 115
    .line 116
    :cond_6
    return-void
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

.method public setRoundPercent(F)V
    .locals 5
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x15
    .end annotation

    .line 1
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v0, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v2

    .line 12
    :goto_0
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    cmpl-float p1, p1, v3

    .line 16
    .line 17
    if-eqz p1, :cond_4

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    new-instance p1, Landroid/graphics/Path;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 29
    .line 30
    :cond_1
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRect:Landroid/graphics/RectF;

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    new-instance p1, Landroid/graphics/RectF;

    .line 35
    .line 36
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRect:Landroid/graphics/RectF;

    .line 40
    .line 41
    :cond_2
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mViewOutlineProvider:Landroid/view/ViewOutlineProvider;

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    new-instance p1, Landroidx/constraintlayout/utils/widget/MotionLabel$1;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Landroidx/constraintlayout/utils/widget/MotionLabel$1;-><init>(Landroidx/constraintlayout/utils/widget/MotionLabel;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mViewOutlineProvider:Landroid/view/ViewOutlineProvider;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setClipToOutline(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    int-to-float v2, v2

    .line 71
    iget v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRoundPercent:F

    .line 72
    .line 73
    mul-float/2addr v2, v4

    .line 74
    const/high16 v4, 0x40000000    # 2.0f

    .line 75
    .line 76
    div-float/2addr v2, v4

    .line 77
    iget-object v4, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRect:Landroid/graphics/RectF;

    .line 78
    .line 79
    int-to-float p1, p1

    .line 80
    int-to-float v1, v1

    .line 81
    invoke-virtual {v4, v3, v3, p1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPath:Landroid/graphics/Path;

    .line 90
    .line 91
    iget-object v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRect:Landroid/graphics/RectF;

    .line 92
    .line 93
    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 94
    .line 95
    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-virtual {p0, v2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 100
    .line 101
    .line 102
    :goto_1
    if-eqz v0, :cond_5

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->invalidateOutline()V

    .line 105
    .line 106
    .line 107
    :cond_5
    return-void
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

.method public setScaleFromTextSize(F)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mText:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
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
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setTextBackgroundPanX(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanX:F

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->updateShaderMatrix()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 22
    .line 23
    .line 24
.end method

.method public setTextBackgroundPanY(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBackgroundPanY:F

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->updateShaderMatrix()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 22
    .line 23
    .line 24
.end method

.method public setTextBackgroundRotate(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mRotate:F

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->updateShaderMatrix()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 22
    .line 23
    .line 24
.end method

.method public setTextBackgroundZoom(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mZoom:F

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->updateShaderMatrix()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 22
    .line 23
    .line 24
.end method

.method public setTextFillColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextFillColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public setTextOutlineColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineColor:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 22
    .line 23
    .line 24
.end method

.method public setTextOutlineThickness(F)V
    .locals 1

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/high16 p1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mUseOutline:Z

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
.end method

.method public setTextPanX(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanX:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public setTextPanY(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextPanY:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public setTextSize(F)V
    .locals 3

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 2
    .line 3
    sget-object v0, Landroidx/constraintlayout/utils/widget/MotionLabel;->TAG:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroidx/constraintlayout/motion/widget/Debug;->getLoc()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, "  "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, " / "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 43
    .line 44
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 45
    .line 46
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 54
    .line 55
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 56
    .line 57
    .line 58
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 59
    .line 60
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    const/high16 p1, 0x3f800000    # 1.0f

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    iget p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 70
    .line 71
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mBaseTextSize:F

    .line 72
    .line 73
    div-float/2addr p1, v0

    .line 74
    :goto_1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/utils/widget/MotionLabel;->buildShape(F)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 81
    .line 82
    .line 83
    return-void
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

.method public setTextureHeight(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureHeight:F

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->updateShaderMatrix()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 22
    .line 23
    .line 24
.end method

.method public setTextureWidth(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextureWidth:F

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->updateShaderMatrix()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 22
    .line 23
    .line 24
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mLayout:Landroid/text/Layout;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mLayout:Landroid/text/Layout;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
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

.method setupPath()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingLeft:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingRight:I

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingTop:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaddingBottom:I

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mFontFamily:Ljava/lang/String;

    .line 26
    .line 27
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTypefaceIndex:I

    .line 28
    .line 29
    iget v2, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mStyleIndex:I

    .line 30
    .line 31
    invoke-direct {p0, v0, v1, v2}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setTypefaceFromAttrs(Ljava/lang/String;II)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 35
    .line 36
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextFillColor:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 42
    .line 43
    iget v1, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextOutlineThickness:F

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 49
    .line 50
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 56
    .line 57
    const/16 v1, 0x80

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 60
    .line 61
    .line 62
    iget v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mTextSize:F

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/utils/widget/MotionLabel;->setTextSize(F)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Landroidx/constraintlayout/utils/widget/MotionLabel;->mPaint:Landroid/text/TextPaint;

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 71
    .line 72
    .line 73
    return-void
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
