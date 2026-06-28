.class public Lcom/yuanqi/group/widgets/CardStackLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/group/widgets/CardStackLayout$a;
    }
.end annotation


# static fields
.field public static final h:Z = false

.field public static final i:Z = true


# instance fields
.field private a:F

.field private b:F

.field private c:Z

.field private d:Z

.field private e:I

.field private f:Lcom/yuanqi/group/widgets/CardStackLayout$a;

.field private g:Lcom/yuanqi/group/widgets/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->f:Lcom/yuanqi/group/widgets/CardStackLayout$a;

    .line 3
    iput-object p1, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->g:Lcom/yuanqi/group/widgets/f;

    .line 4
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/CardStackLayout;->f()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0}, Lcom/yuanqi/group/widgets/CardStackLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 6
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->f:Lcom/yuanqi/group/widgets/CardStackLayout$a;

    .line 8
    iput-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->g:Lcom/yuanqi/group/widgets/f;

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/yuanqi/group/widgets/CardStackLayout;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->f:Lcom/yuanqi/group/widgets/CardStackLayout$a;

    .line 12
    iput-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->g:Lcom/yuanqi/group/widgets/f;

    .line 13
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/yuanqi/group/widgets/CardStackLayout;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/yuanqi/group/widgets/CardStackLayout;->f()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget-object v0, Lcom/yqtech/multiapp/R$styleable;->CardStackLayout:[I

    .line 9
    .line 10
    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 p2, 0x2

    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->d:Z

    .line 21
    .line 22
    const/4 p2, 0x4

    .line 23
    const/4 p4, 0x1

    .line 24
    invoke-virtual {p1, p2, p4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iput-boolean p2, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->c:Z

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const v0, 0x7f0a0045

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getInteger(I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    const/4 v0, 0x3

    .line 42
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iput p2, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->e:I

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const v0, 0x7f070056

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    iput p2, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->b:F

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const p3, 0x7f070057

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-virtual {p1, p4, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    iput p2, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->a:F

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 83
    .line 84
    .line 85
    return-void
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

.method private f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->f:Lcom/yuanqi/group/widgets/CardStackLayout$a;

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->g:Lcom/yuanqi/group/widgets/f;

    invoke-virtual {v0}, Lcom/yuanqi/group/widgets/f;->m()Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->d:Z

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->c:Z

    return v0
.end method

.method public e()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->g:Lcom/yuanqi/group/widgets/f;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->f:Lcom/yuanqi/group/widgets/CardStackLayout$a;

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
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->g:Lcom/yuanqi/group/widgets/f;

    invoke-virtual {v0}, Lcom/yuanqi/group/widgets/f;->q()V

    return-void
.end method

.method public getAdapter()Lcom/yuanqi/group/widgets/f;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->g:Lcom/yuanqi/group/widgets/f;

    return-object v0
.end method

.method public getCardGap()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->b:F

    return v0
.end method

.method public getCardGapBottom()F
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->a:F

    return v0
.end method

.method getOnCardSelectedListener()Lcom/yuanqi/group/widgets/CardStackLayout$a;
    .locals 1

    iget-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->f:Lcom/yuanqi/group/widgets/CardStackLayout$a;

    return-object v0
.end method

.method public getParallaxScale()I
    .locals 1

    iget v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->e:I

    return v0
.end method

.method public setAdapter(Lcom/yuanqi/group/widgets/f;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->g:Lcom/yuanqi/group/widgets/f;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/yuanqi/group/widgets/f;->s(Lcom/yuanqi/group/widgets/CardStackLayout;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->g:Lcom/yuanqi/group/widgets/f;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/yuanqi/group/widgets/f;->k()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->g:Lcom/yuanqi/group/widgets/f;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/yuanqi/group/widgets/f;->d(I)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-boolean p1, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->c:Z

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    new-instance p1, Lcom/yuanqi/group/widgets/g;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Lcom/yuanqi/group/widgets/g;-><init>(Lcom/yuanqi/group/widgets/CardStackLayout;)V

    .line 30
    .line 31
    .line 32
    const-wide/16 v0, 0x1f4

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
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
.end method

.method public setCardGap(F)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->b:F

    return-void
.end method

.method public setCardGapBottom(F)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->a:F

    return-void
.end method

.method public setOnCardSelectedListener(Lcom/yuanqi/group/widgets/CardStackLayout$a;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->f:Lcom/yuanqi/group/widgets/CardStackLayout$a;

    return-void
.end method

.method public setParallaxEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->d:Z

    return-void
.end method

.method public setParallaxScale(I)V
    .locals 0

    iput p1, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->e:I

    return-void
.end method

.method public setShowInitAnimation(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yuanqi/group/widgets/CardStackLayout;->c:Z

    return-void
.end method
