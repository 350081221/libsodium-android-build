.class public Lcom/yuanqi/group/effects/ExplosionField;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuanqi/group/effects/ExplosionField$d;
    }
.end annotation


# static fields
.field private static final c:Landroid/graphics/Canvas;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuanqi/group/effects/a;",
            ">;"
        }
    .end annotation
.end field

.field private b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    sput-object v0, Lcom/yuanqi/group/effects/ExplosionField;->c:Landroid/graphics/Canvas;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField;->a:Ljava/util/List;

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 3
    iput-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField;->b:[I

    .line 4
    invoke-direct {p0}, Lcom/yuanqi/group/effects/ExplosionField;->k()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField;->a:Ljava/util/List;

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 7
    iput-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField;->b:[I

    .line 8
    invoke-direct {p0}, Lcom/yuanqi/group/effects/ExplosionField;->k()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField;->a:Ljava/util/List;

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 11
    iput-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField;->b:[I

    .line 12
    invoke-direct {p0}, Lcom/yuanqi/group/effects/ExplosionField;->k()V

    return-void
.end method

.method static synthetic a(Lcom/yuanqi/group/effects/ExplosionField;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/yuanqi/group/effects/ExplosionField;->a:Ljava/util/List;

    return-object p0
.end method

.method public static b(Landroid/app/Activity;)Lcom/yuanqi/group/effects/ExplosionField;
    .locals 3

    .line 1
    const v0, 0x1020002

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    new-instance v1, Lcom/yuanqi/group/effects/ExplosionField;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/yuanqi/group/effects/ExplosionField;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    invoke-direct {p0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-object v1
    .line 25
    .line 26
    .line 27
.end method

.method public static c(Landroid/view/ViewGroup;Landroid/app/Activity;)Lcom/yuanqi/group/effects/ExplosionField;
    .locals 2

    .line 1
    new-instance v0, Lcom/yuanqi/group/effects/ExplosionField;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/yuanqi/group/effects/ExplosionField;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    invoke-direct {p1, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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

.method public static e(Landroid/view/View;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/widget/ImageView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-static {v0, v1, v2, v3}, Lcom/yuanqi/group/effects/ExplosionField;->f(IILandroid/graphics/Bitmap$Config;I)Landroid/graphics/Bitmap;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    sget-object v1, Lcom/yuanqi/group/effects/ExplosionField;->c:Landroid/graphics/Canvas;

    .line 46
    .line 47
    monitor-enter v1

    .line 48
    :try_start_0
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    invoke-virtual {v1, p0}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 56
    .line 57
    .line 58
    monitor-exit v1

    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    throw p0

    .line 63
    :cond_1
    :goto_0
    return-object v0
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

.method public static f(IILandroid/graphics/Bitmap$Config;I)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 8
    .line 9
    .line 10
    if-lez p3, :cond_0

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 13
    .line 14
    .line 15
    add-int/lit8 p3, p3, -0x1

    .line 16
    .line 17
    invoke-static {p0, p1, p2, p3}, Lcom/yuanqi/group/effects/ExplosionField;->f(IILandroid/graphics/Bitmap$Config;I)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
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

.method private k()V
    .locals 3

    iget-object v0, p0, Lcom/yuanqi/group/effects/ExplosionField;->b:[I

    sget-object v1, Lcom/yuanqi/group/App;->d:Lcom/yuanqi/group/App$a;

    invoke-virtual {v1}, Lcom/yuanqi/group/App$a;->a()Lcom/yuanqi/group/App;

    move-result-object v1

    const/16 v2, 0x20

    invoke-static {v1, v2}, Lcom/yuanqi/group/abs/ui/b;->b(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/effects/ExplosionField;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

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
.end method

.method public g(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/yuanqi/group/effects/ExplosionField;->b:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput p1, v0, v1

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    aput p2, v0, p1

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

.method public h(Landroid/graphics/Bitmap;Landroid/graphics/Rect;JJ)V
    .locals 1

    .line 1
    new-instance v0, Lcom/yuanqi/group/effects/a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/yuanqi/group/effects/a;-><init>(Landroid/view/View;Landroid/graphics/Bitmap;Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/yuanqi/group/effects/ExplosionField$a;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/yuanqi/group/effects/ExplosionField$a;-><init>(Lcom/yuanqi/group/effects/ExplosionField;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p3, p4}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p5, p6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/yuanqi/group/effects/ExplosionField;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/yuanqi/group/effects/a;->start()V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public i(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/yuanqi/group/effects/ExplosionField;->j(Landroid/view/View;Lcom/yuanqi/group/effects/ExplosionField$d;)V

    return-void
.end method

.method public j(Landroid/view/View;Lcom/yuanqi/group/effects/ExplosionField$d;)V
    .locals 7

    .line 1
    new-instance v2, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    new-array v1, v0, [I

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    aget v4, v1, v3

    .line 17
    .line 18
    neg-int v4, v4

    .line 19
    const/4 v5, 0x1

    .line 20
    aget v1, v1, v5

    .line 21
    .line 22
    neg-int v1, v1

    .line 23
    invoke-virtual {v2, v4, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/yuanqi/group/effects/ExplosionField;->b:[I

    .line 27
    .line 28
    aget v3, v1, v3

    .line 29
    .line 30
    neg-int v3, v3

    .line 31
    aget v1, v1, v5

    .line 32
    .line 33
    neg-int v1, v1

    .line 34
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Rect;->inset(II)V

    .line 35
    .line 36
    .line 37
    new-array v0, v0, [F

    .line 38
    .line 39
    fill-array-data v0, :array_0

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-wide/16 v3, 0x96

    .line 47
    .line 48
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Lcom/yuanqi/group/effects/ExplosionField$b;

    .line 53
    .line 54
    invoke-direct {v1, p0, p1}, Lcom/yuanqi/group/effects/ExplosionField$b;-><init>(Lcom/yuanqi/group/effects/ExplosionField;Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lcom/yuanqi/group/effects/ExplosionField$c;

    .line 61
    .line 62
    invoke-direct {v1, p0, p2, p1}, Lcom/yuanqi/group/effects/ExplosionField$c;-><init>(Lcom/yuanqi/group/effects/ExplosionField;Lcom/yuanqi/group/effects/ExplosionField$d;Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p2, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    const/16 v0, 0x64

    .line 80
    .line 81
    int-to-long v3, v0

    .line 82
    invoke-virtual {p2, v3, v4}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    const/4 v0, 0x0

    .line 87
    invoke-virtual {p2, v0}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p2, v0}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Lcom/yuanqi/group/effects/ExplosionField;->e(Landroid/view/View;)Landroid/graphics/Bitmap;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    sget-wide v5, Lcom/yuanqi/group/effects/a;->k:J

    .line 107
    .line 108
    move-object v0, p0

    .line 109
    invoke-virtual/range {v0 .. v6}, Lcom/yuanqi/group/effects/ExplosionField;->h(Landroid/graphics/Bitmap;Landroid/graphics/Rect;JJ)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/yuanqi/group/effects/ExplosionField;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/yuanqi/group/effects/a;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Lcom/yuanqi/group/effects/a;->b(Landroid/graphics/Canvas;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
    .line 27
.end method
