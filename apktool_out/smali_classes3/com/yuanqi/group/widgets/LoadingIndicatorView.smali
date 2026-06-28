.class public Lcom/yuanqi/group/widgets/LoadingIndicatorView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static final n:Ljava/lang/String; = "LoadingIndicatorView"

.field private static final o:Lcom/yuanqi/group/widgets/i;

.field private static final p:I = 0x1f4

.field private static final q:I = 0x1f4


# instance fields
.field a:I

.field b:I

.field c:I

.field d:I

.field private e:J

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Lcom/yuanqi/group/widgets/i;

.field private j:I

.field private k:Z

.field private final l:Ljava/lang/Runnable;

.field private final m:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/yuanqi/group/widgets/b;

    invoke-direct {v0}, Lcom/yuanqi/group/widgets/b;-><init>()V

    sput-object v0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->o:Lcom/yuanqi/group/widgets/i;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->e:J

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->f:Z

    .line 4
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g:Z

    .line 5
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->h:Z

    .line 6
    new-instance v1, Lcom/yuanqi/group/widgets/LoadingIndicatorView$a;

    invoke-direct {v1, p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView$a;-><init>(Lcom/yuanqi/group/widgets/LoadingIndicatorView;)V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->l:Ljava/lang/Runnable;

    .line 7
    new-instance v1, Lcom/yuanqi/group/widgets/LoadingIndicatorView$b;

    invoke-direct {v1, p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView$b;-><init>(Lcom/yuanqi/group/widgets/LoadingIndicatorView;)V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->m:Ljava/lang/Runnable;

    const/4 v1, 0x0

    .line 8
    invoke-direct {p0, p1, v1, v0, v0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 9
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-wide/16 v0, -0x1

    .line 10
    iput-wide v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->e:J

    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->f:Z

    .line 12
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g:Z

    .line 13
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->h:Z

    .line 14
    new-instance v1, Lcom/yuanqi/group/widgets/LoadingIndicatorView$a;

    invoke-direct {v1, p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView$a;-><init>(Lcom/yuanqi/group/widgets/LoadingIndicatorView;)V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->l:Ljava/lang/Runnable;

    .line 15
    new-instance v1, Lcom/yuanqi/group/widgets/LoadingIndicatorView$b;

    invoke-direct {v1, p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView$b;-><init>(Lcom/yuanqi/group/widgets/LoadingIndicatorView;)V

    iput-object v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->m:Ljava/lang/Runnable;

    const/high16 v1, 0x7f130000

    .line 16
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 17
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 v0, -0x1

    .line 18
    iput-wide v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->e:J

    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->f:Z

    .line 20
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g:Z

    .line 21
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->h:Z

    .line 22
    new-instance v0, Lcom/yuanqi/group/widgets/LoadingIndicatorView$a;

    invoke-direct {v0, p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView$a;-><init>(Lcom/yuanqi/group/widgets/LoadingIndicatorView;)V

    iput-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->l:Ljava/lang/Runnable;

    .line 23
    new-instance v0, Lcom/yuanqi/group/widgets/LoadingIndicatorView$b;

    invoke-direct {v0, p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView$b;-><init>(Lcom/yuanqi/group/widgets/LoadingIndicatorView;)V

    iput-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->m:Ljava/lang/Runnable;

    const/high16 v0, 0x7f130000

    .line 24
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const-wide/16 v0, -0x1

    .line 26
    iput-wide v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->e:J

    const/4 p4, 0x0

    .line 27
    iput-boolean p4, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->f:Z

    .line 28
    iput-boolean p4, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g:Z

    .line 29
    iput-boolean p4, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->h:Z

    .line 30
    new-instance p4, Lcom/yuanqi/group/widgets/LoadingIndicatorView$a;

    invoke-direct {p4, p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView$a;-><init>(Lcom/yuanqi/group/widgets/LoadingIndicatorView;)V

    iput-object p4, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->l:Ljava/lang/Runnable;

    .line 31
    new-instance p4, Lcom/yuanqi/group/widgets/LoadingIndicatorView$b;

    invoke-direct {p4, p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView$b;-><init>(Lcom/yuanqi/group/widgets/LoadingIndicatorView;)V

    iput-object p4, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->m:Ljava/lang/Runnable;

    const/high16 p4, 0x7f130000

    .line 32
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method static synthetic a(Lcom/yuanqi/group/widgets/LoadingIndicatorView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->f:Z

    return p1
.end method

.method static synthetic b(Lcom/yuanqi/group/widgets/LoadingIndicatorView;J)J
    .locals 0

    iput-wide p1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->e:J

    return-wide p1
.end method

.method static synthetic c(Lcom/yuanqi/group/widgets/LoadingIndicatorView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g:Z

    return p1
.end method

.method static synthetic d(Lcom/yuanqi/group/widgets/LoadingIndicatorView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->h:Z

    return p0
.end method

.method private g(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    iput v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->a:I

    .line 4
    .line 5
    const/16 v1, 0x30

    .line 6
    .line 7
    iput v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->b:I

    .line 8
    .line 9
    iput v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->c:I

    .line 10
    .line 11
    iput v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->d:I

    .line 12
    .line 13
    sget-object v0, Lcom/yqtech/multiapp/R$styleable;->LoadingIndicatorView:[I

    .line 14
    .line 15
    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 p2, 0x5

    .line 20
    iget p3, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->a:I

    .line 21
    .line 22
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->a:I

    .line 27
    .line 28
    const/4 p2, 0x3

    .line 29
    iget p3, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->b:I

    .line 30
    .line 31
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iput p2, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->b:I

    .line 36
    .line 37
    const/4 p2, 0x4

    .line 38
    iget p3, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->c:I

    .line 39
    .line 40
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput p2, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->c:I

    .line 45
    .line 46
    const/4 p2, 0x2

    .line 47
    iget p3, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->d:I

    .line 48
    .line 49
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    iput p2, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->d:I

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    const/4 p3, 0x0

    .line 61
    const/4 p4, -0x1

    .line 62
    invoke-virtual {p1, p3, p4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    iput p3, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->j:I

    .line 67
    .line 68
    invoke-virtual {p0, p2}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->setIndicator(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object p2, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 72
    .line 73
    if-nez p2, :cond_0

    .line 74
    .line 75
    sget-object p2, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->o:Lcom/yuanqi/group/widgets/i;

    .line 76
    .line 77
    invoke-virtual {p0, p2}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->setIndicator(Lcom/yuanqi/group/widgets/i;)V

    .line 78
    .line 79
    .line 80
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

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
.end method

.method private h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->l:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->m:Ljava/lang/Runnable;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method private n(II)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    sub-int/2addr p1, v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    sub-int/2addr p2, v0

    .line 21
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    int-to-float v0, v0

    .line 36
    int-to-float v1, v1

    .line 37
    div-float/2addr v0, v1

    .line 38
    int-to-float v1, p1

    .line 39
    int-to-float v2, p2

    .line 40
    div-float v3, v1, v2

    .line 41
    .line 42
    cmpl-float v4, v0, v3

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    cmpl-float v3, v3, v0

    .line 48
    .line 49
    if-lez v3, :cond_0

    .line 50
    .line 51
    mul-float/2addr v2, v0

    .line 52
    float-to-int v0, v2

    .line 53
    sub-int/2addr p1, v0

    .line 54
    div-int/lit8 p1, p1, 0x2

    .line 55
    .line 56
    add-int/2addr v0, p1

    .line 57
    move v6, v5

    .line 58
    move v5, p1

    .line 59
    move p1, v0

    .line 60
    move v0, v6

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/high16 v2, 0x3f800000    # 1.0f

    .line 63
    .line 64
    div-float/2addr v2, v0

    .line 65
    mul-float/2addr v1, v2

    .line 66
    float-to-int v0, v1

    .line 67
    sub-int/2addr p2, v0

    .line 68
    div-int/lit8 p2, p2, 0x2

    .line 69
    .line 70
    add-int/2addr v0, p2

    .line 71
    move v6, v0

    .line 72
    move v0, p2

    .line 73
    move p2, v6

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move v0, v5

    .line 76
    :goto_0
    iget-object v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 77
    .line 78
    invoke-virtual {v1, v5, v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void
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
.end method

.method private o()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public drawableHotspotChanged(FF)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->drawableHotspotChanged(FF)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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

.method protected drawableStateChanged()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->o()V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method

.method e(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    int-to-float v2, v2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    int-to-float v3, v3

    .line 19
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 26
    .line 27
    .line 28
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->k:Z

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->k:Z

    .line 37
    .line 38
    :cond_0
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
.end method

.method public f()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->h:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->m:Ljava/lang/Runnable;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iget-wide v3, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->e:J

    .line 14
    .line 15
    sub-long/2addr v1, v3

    .line 16
    const-wide/16 v5, 0x1f4

    .line 17
    .line 18
    cmp-long v7, v1, v5

    .line 19
    .line 20
    if-gez v7, :cond_1

    .line 21
    .line 22
    const-wide/16 v7, -0x1

    .line 23
    .line 24
    cmp-long v3, v3, v7

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-boolean v3, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->f:Z

    .line 30
    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    iget-object v3, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->l:Ljava/lang/Runnable;

    .line 34
    .line 35
    sub-long/2addr v5, v1

    .line 36
    invoke-virtual {p0, v3, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->f:Z

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    const/16 v0, 0x8

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_1
    return-void
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

.method public getIndicator()Lcom/yuanqi/group/widgets/i;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    return-object v0
.end method

.method public i()V
    .locals 3

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->e:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->l:Ljava/lang/Runnable;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->m:Ljava/lang/Runnable;

    .line 18
    .line 19
    const-wide/16 v1, 0x1f4

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->g:Z

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

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v1, v2

    .line 29
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 30
    .line 31
    add-int/2addr v2, v0

    .line 32
    iget v3, p1, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    add-int/2addr v3, v1

    .line 35
    iget v4, p1, Landroid/graphics/Rect;->right:I

    .line 36
    .line 37
    add-int/2addr v4, v0

    .line 38
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 39
    .line 40
    add-int/2addr p1, v1

    .line 41
    invoke-virtual {p0, v2, v3, v4, p1}, Landroid/view/View;->invalidate(IIII)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    :goto_0
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

.method public j()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x10a0001

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 13
    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method public k()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x10a0000

    .line 6
    .line 7
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method l()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 9
    .line 10
    instance-of v0, v0, Landroid/graphics/drawable/Animatable;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->k:Z

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method

.method m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/yuanqi/group/widgets/i;->stop()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->k:Z

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->l()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->h()V

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
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->m()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->h()V

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
.end method

.method protected declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->e(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    monitor-exit p0

    .line 12
    throw p1
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
.end method

.method protected declared-synchronized onMeasure(II)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v2, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->a:I

    .line 8
    .line 9
    iget v3, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->b:I

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget v3, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->c:I

    .line 24
    .line 25
    iget v4, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->d:I

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v0, v1

    .line 41
    move v2, v0

    .line 42
    :goto_0
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->o()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    add-int/2addr v3, v4

    .line 54
    add-int/2addr v2, v3

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    add-int/2addr v3, v4

    .line 64
    add-int/2addr v0, v3

    .line 65
    invoke-static {v2, p1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {v0, p2, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    monitor-exit p0

    .line 77
    return-void

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    monitor-exit p0

    .line 80
    throw p1
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
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->n(II)V

    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x8

    .line 5
    .line 6
    if-eq p2, p1, :cond_1

    .line 7
    .line 8
    const/4 p1, 0x4

    .line 9
    if-ne p2, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->l()V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->m()V

    .line 17
    .line 18
    .line 19
    :goto_1
    return-void
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

.method public setIndicator(Lcom/yuanqi/group/widgets/i;)V
    .locals 2

    .line 14
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    if-eq v0, p1, :cond_2

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 16
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    invoke-virtual {p0, v0}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    :cond_0
    iput-object p1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 18
    iget v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->j:I

    invoke-virtual {p0, v0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->setIndicatorColor(I)V

    if-eqz p1, :cond_1

    .line 19
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 20
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    :cond_2
    return-void
.end method

.method public setIndicator(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "."

    .line 3
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yuanqi/group/widgets/i;

    .line 10
    invoke-virtual {p0, p1}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->setIndicator(Lcom/yuanqi/group/widgets/i;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :catch_2
    const-string p1, "LoadingIndicatorView"

    const-string v0, "Didn\'t find your class , check the name again !"

    .line 13
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public setIndicatorColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->j:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/yuanqi/group/widgets/i;->o(I)V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method

.method public setVisibility(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p1, :cond_2

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->l()V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->m()V

    .line 23
    .line 24
    .line 25
    :cond_2
    :goto_1
    return-void
    .line 26
    .line 27
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/widgets/LoadingIndicatorView;->i:Lcom/yuanqi/group/widgets/i;

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 15
    :goto_1
    return p1
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
.end method
