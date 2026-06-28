.class public Lcom/airbnb/lottie/model/layer/i;
.super Lcom/airbnb/lottie/model/layer/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/lottie/model/layer/i$d;
    }
.end annotation


# instance fields
.field private final H:Ljava/lang/StringBuilder;

.field private final I:Landroid/graphics/RectF;

.field private final J:Landroid/graphics/Matrix;

.field private final K:Landroid/graphics/Paint;

.field private final L:Landroid/graphics/Paint;

.field private final M:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/airbnb/lottie/model/d;",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/animation/content/d;",
            ">;>;"
        }
    .end annotation
.end field

.field private final N:Landroidx/collection/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/LongSparseArray<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final O:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/layer/i$d;",
            ">;"
        }
    .end annotation
.end field

.field private final P:Lcom/airbnb/lottie/animation/keyframe/o;

.field private final Q:Lcom/airbnb/lottie/x0;

.field private final R:Lcom/airbnb/lottie/k;

.field private S:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private T:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private U:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private V:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private W:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private X:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private Y:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private Z:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private a0:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private b0:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Landroid/graphics/Typeface;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/x0;Lcom/airbnb/lottie/model/layer/e;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/airbnb/lottie/model/layer/b;-><init>(Lcom/airbnb/lottie/x0;Lcom/airbnb/lottie/model/layer/e;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->H:Ljava/lang/StringBuilder;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->I:Landroid/graphics/RectF;

    .line 18
    .line 19
    new-instance v0, Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->J:Landroid/graphics/Matrix;

    .line 25
    .line 26
    new-instance v0, Lcom/airbnb/lottie/model/layer/i$a;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, v1}, Lcom/airbnb/lottie/model/layer/i$a;-><init>(Lcom/airbnb/lottie/model/layer/i;I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 33
    .line 34
    new-instance v0, Lcom/airbnb/lottie/model/layer/i$b;

    .line 35
    .line 36
    invoke-direct {v0, p0, v1}, Lcom/airbnb/lottie/model/layer/i$b;-><init>(Lcom/airbnb/lottie/model/layer/i;I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 40
    .line 41
    new-instance v0, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->M:Ljava/util/Map;

    .line 47
    .line 48
    new-instance v0, Landroidx/collection/LongSparseArray;

    .line 49
    .line 50
    invoke-direct {v0}, Landroidx/collection/LongSparseArray;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->N:Landroidx/collection/LongSparseArray;

    .line 54
    .line 55
    new-instance v0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->O:Ljava/util/List;

    .line 61
    .line 62
    iput-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->Q:Lcom/airbnb/lottie/x0;

    .line 63
    .line 64
    invoke-virtual {p2}, Lcom/airbnb/lottie/model/layer/e;->c()Lcom/airbnb/lottie/k;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->R:Lcom/airbnb/lottie/k;

    .line 69
    .line 70
    invoke-virtual {p2}, Lcom/airbnb/lottie/model/layer/e;->t()Lcom/airbnb/lottie/model/animatable/j;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Lcom/airbnb/lottie/model/animatable/j;->d()Lcom/airbnb/lottie/animation/keyframe/o;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->P:Lcom/airbnb/lottie/animation/keyframe/o;

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Lcom/airbnb/lottie/model/layer/e;->u()Lcom/airbnb/lottie/model/animatable/k;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_0

    .line 91
    .line 92
    iget-object p2, p1, Lcom/airbnb/lottie/model/animatable/k;->a:Lcom/airbnb/lottie/model/animatable/a;

    .line 93
    .line 94
    if-eqz p2, :cond_0

    .line 95
    .line 96
    invoke-virtual {p2}, Lcom/airbnb/lottie/model/animatable/a;->a()Lcom/airbnb/lottie/animation/keyframe/a;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    iput-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->S:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 101
    .line 102
    invoke-virtual {p2, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 103
    .line 104
    .line 105
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->S:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 106
    .line 107
    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 108
    .line 109
    .line 110
    :cond_0
    if-eqz p1, :cond_1

    .line 111
    .line 112
    iget-object p2, p1, Lcom/airbnb/lottie/model/animatable/k;->b:Lcom/airbnb/lottie/model/animatable/a;

    .line 113
    .line 114
    if-eqz p2, :cond_1

    .line 115
    .line 116
    invoke-virtual {p2}, Lcom/airbnb/lottie/model/animatable/a;->a()Lcom/airbnb/lottie/animation/keyframe/a;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    iput-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->U:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 121
    .line 122
    invoke-virtual {p2, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 123
    .line 124
    .line 125
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->U:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 126
    .line 127
    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 128
    .line 129
    .line 130
    :cond_1
    if-eqz p1, :cond_2

    .line 131
    .line 132
    iget-object p2, p1, Lcom/airbnb/lottie/model/animatable/k;->c:Lcom/airbnb/lottie/model/animatable/b;

    .line 133
    .line 134
    if-eqz p2, :cond_2

    .line 135
    .line 136
    invoke-virtual {p2}, Lcom/airbnb/lottie/model/animatable/b;->a()Lcom/airbnb/lottie/animation/keyframe/a;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    iput-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->W:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 141
    .line 142
    invoke-virtual {p2, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 143
    .line 144
    .line 145
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->W:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 146
    .line 147
    invoke-virtual {p0, p2}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 148
    .line 149
    .line 150
    :cond_2
    if-eqz p1, :cond_3

    .line 151
    .line 152
    iget-object p1, p1, Lcom/airbnb/lottie/model/animatable/k;->d:Lcom/airbnb/lottie/model/animatable/b;

    .line 153
    .line 154
    if-eqz p1, :cond_3

    .line 155
    .line 156
    invoke-virtual {p1}, Lcom/airbnb/lottie/model/animatable/b;->a()Lcom/airbnb/lottie/animation/keyframe/a;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iput-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->Y:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 161
    .line 162
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->Y:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 166
    .line 167
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 168
    .line 169
    .line 170
    :cond_3
    return-void
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

.method private P(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/String;->codePointAt(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, p2

    .line 10
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/String;->codePointAt(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {p0, v2}, Lcom/airbnb/lottie/model/layer/i;->d0(I)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/2addr v1, v3

    .line 32
    mul-int/lit8 v0, v0, 0x1f

    .line 33
    .line 34
    add-int/2addr v0, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    iget-object v2, p0, Lcom/airbnb/lottie/model/layer/i;->N:Landroidx/collection/LongSparseArray;

    .line 37
    .line 38
    int-to-long v3, v0

    .line 39
    invoke-virtual {v2, v3, v4}, Landroidx/collection/LongSparseArray;->containsKey(J)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->N:Landroidx/collection/LongSparseArray;

    .line 46
    .line 47
    invoke-virtual {p1, v3, v4}, Landroidx/collection/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->H:Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 58
    .line 59
    .line 60
    :goto_2
    if-ge p2, v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Ljava/lang/String;->codePointAt(I)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v2, p0, Lcom/airbnb/lottie/model/layer/i;->H:Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Ljava/lang/Character;->charCount(I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    add-int/2addr p2, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->H:Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->N:Landroidx/collection/LongSparseArray;

    .line 84
    .line 85
    invoke-virtual {p2, v3, v4, p1}, Landroidx/collection/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-object p1
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
.end method

.method private Q(Lcom/airbnb/lottie/model/b;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->T:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->S:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 42
    .line 43
    iget v1, p1, Lcom/airbnb/lottie/model/b;->h:I

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->V:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->U:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 89
    .line 90
    iget v1, p1, Lcom/airbnb/lottie/model/b;->i:I

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/b;->x:Lcom/airbnb/lottie/animation/keyframe/p;

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/p;->h()Lcom/airbnb/lottie/animation/keyframe/a;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const/16 v1, 0x64

    .line 102
    .line 103
    if-nez v0, :cond_4

    .line 104
    .line 105
    move v0, v1

    .line 106
    goto :goto_2

    .line 107
    :cond_4
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/b;->x:Lcom/airbnb/lottie/animation/keyframe/p;

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/p;->h()Lcom/airbnb/lottie/animation/keyframe/a;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    :goto_2
    mul-int/lit16 v0, v0, 0xff

    .line 124
    .line 125
    div-int/2addr v0, v1

    .line 126
    mul-int/2addr v0, p2

    .line 127
    div-int/lit16 v0, v0, 0xff

    .line 128
    .line 129
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 130
    .line 131
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 132
    .line 133
    .line 134
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 135
    .line 136
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 137
    .line 138
    .line 139
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->X:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 140
    .line 141
    if-eqz p2, :cond_5

    .line 142
    .line 143
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 144
    .line 145
    invoke-virtual {p2}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    check-cast p2, Ljava/lang/Float;

    .line 150
    .line 151
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->W:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 160
    .line 161
    if-eqz p2, :cond_6

    .line 162
    .line 163
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 164
    .line 165
    invoke-virtual {p2}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    check-cast p2, Ljava/lang/Float;

    .line 170
    .line 171
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_6
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 180
    .line 181
    iget p1, p1, Lcom/airbnb/lottie/model/b;->j:F

    .line 182
    .line 183
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    mul-float/2addr p1, v0

    .line 188
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 189
    .line 190
    .line 191
    :goto_3
    return-void
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

.method private R(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 13
    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    cmpl-float v0, v0, v1

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const/4 v3, 0x0

    .line 27
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    move-object v1, p3

    .line 34
    move-object v2, p1

    .line 35
    move-object v7, p2

    .line 36
    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method

.method private S(Lcom/airbnb/lottie/model/d;FLcom/airbnb/lottie/model/b;Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/model/layer/i;->a0(Lcom/airbnb/lottie/model/d;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/airbnb/lottie/animation/content/d;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/airbnb/lottie/animation/content/d;->getPath()Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/i;->I:Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-virtual {v2, v3, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/i;->J:Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/i;->J:Landroid/graphics/Matrix;

    .line 34
    .line 35
    iget v4, p3, Lcom/airbnb/lottie/model/b;->g:F

    .line 36
    .line 37
    neg-float v4, v4

    .line 38
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    mul-float/2addr v4, v5

    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-virtual {v3, v5, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 45
    .line 46
    .line 47
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/i;->J:Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-virtual {v3, p2, p2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 50
    .line 51
    .line 52
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/i;->J:Landroid/graphics/Matrix;

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 55
    .line 56
    .line 57
    iget-boolean v3, p3, Lcom/airbnb/lottie/model/b;->k:Z

    .line 58
    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 62
    .line 63
    invoke-direct {p0, v2, v3, p4}, Lcom/airbnb/lottie/model/layer/i;->V(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 64
    .line 65
    .line 66
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 67
    .line 68
    invoke-direct {p0, v2, v3, p4}, Lcom/airbnb/lottie/model/layer/i;->V(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 73
    .line 74
    invoke-direct {p0, v2, v3, p4}, Lcom/airbnb/lottie/model/layer/i;->V(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 75
    .line 76
    .line 77
    iget-object v3, p0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 78
    .line 79
    invoke-direct {p0, v2, v3, p4}, Lcom/airbnb/lottie/model/layer/i;->V(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
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
.end method

.method private T(Ljava/lang/String;Lcom/airbnb/lottie/model/b;Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    iget-boolean p2, p2, Lcom/airbnb/lottie/model/b;->k:Z

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/airbnb/lottie/model/layer/i;->R(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, Lcom/airbnb/lottie/model/layer/i;->R(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-direct {p0, p1, p2, p3}, Lcom/airbnb/lottie/model/layer/i;->R(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/airbnb/lottie/model/layer/i;->R(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 24
    .line 25
    .line 26
    :goto_0
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

.method private U(Ljava/lang/String;Lcom/airbnb/lottie/model/b;Landroid/graphics/Canvas;F)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Lcom/airbnb/lottie/model/layer/i;->P(Ljava/lang/String;I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v0, v2

    .line 17
    invoke-direct {p0, v1, p2, p3}, Lcom/airbnb/lottie/model/layer/i;->T(Ljava/lang/String;Lcom/airbnb/lottie/model/b;Landroid/graphics/Canvas;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-float/2addr v1, p4

    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {p3, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
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

.method private V(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 13
    .line 14
    if-ne v0, v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    cmpl-float v0, v0, v1

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {p3, p1, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 27
    .line 28
    .line 29
    return-void
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
.end method

.method private W(Ljava/lang/String;Lcom/airbnb/lottie/model/b;Lcom/airbnb/lottie/model/c;Landroid/graphics/Canvas;FFF)V
    .locals 3

    .line 1
    const/4 p5, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-ge p5, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1, p5}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/c;->b()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/c;->d()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v0, v1, v2}, Lcom/airbnb/lottie/model/d;->c(CLjava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->R:Lcom/airbnb/lottie/k;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/airbnb/lottie/k;->c()Landroidx/collection/SparseArrayCompat;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1, v0}, Landroidx/collection/SparseArrayCompat;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/airbnb/lottie/model/d;

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-direct {p0, v0, p6, p2, p4}, Lcom/airbnb/lottie/model/layer/i;->S(Lcom/airbnb/lottie/model/d;FLcom/airbnb/lottie/model/b;Landroid/graphics/Canvas;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/airbnb/lottie/model/d;->b()D

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    double-to-float v0, v0

    .line 47
    mul-float/2addr v0, p6

    .line 48
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    mul-float/2addr v0, v1

    .line 53
    add-float/2addr v0, p7

    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-virtual {p4, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 56
    .line 57
    .line 58
    :goto_1
    add-int/lit8 p5, p5, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return-void
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
.end method

.method private X(Lcom/airbnb/lottie/model/b;Lcom/airbnb/lottie/model/c;Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move-object/from16 v10, p3

    .line 8
    .line 9
    invoke-direct {v7, v9}, Lcom/airbnb/lottie/model/layer/i;->c0(Lcom/airbnb/lottie/model/c;)Landroid/graphics/Typeface;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, v8, Lcom/airbnb/lottie/model/b;->a:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, v7, Lcom/airbnb/lottie/model/layer/i;->Q:Lcom/airbnb/lottie/x0;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/airbnb/lottie/x0;->i0()Lcom/airbnb/lottie/l1;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual/range {p0 .. p0}, Lcom/airbnb/lottie/model/layer/b;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3, v1}, Lcom/airbnb/lottie/l1;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :cond_1
    iget-object v2, v7, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 37
    .line 38
    .line 39
    iget-object v0, v7, Lcom/airbnb/lottie/model/layer/i;->a0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/Float;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    iget v0, v8, Lcom/airbnb/lottie/model/b;->c:F

    .line 55
    .line 56
    :goto_0
    iget-object v2, v7, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 57
    .line 58
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    mul-float/2addr v3, v0

    .line 63
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v7, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 67
    .line 68
    iget-object v3, v7, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 69
    .line 70
    invoke-virtual {v3}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 75
    .line 76
    .line 77
    iget-object v2, v7, Lcom/airbnb/lottie/model/layer/i;->L:Landroid/graphics/Paint;

    .line 78
    .line 79
    iget-object v3, v7, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 80
    .line 81
    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 86
    .line 87
    .line 88
    iget v2, v8, Lcom/airbnb/lottie/model/b;->e:I

    .line 89
    .line 90
    int-to-float v2, v2

    .line 91
    const/high16 v3, 0x41200000    # 10.0f

    .line 92
    .line 93
    div-float/2addr v2, v3

    .line 94
    iget-object v3, v7, Lcom/airbnb/lottie/model/layer/i;->Z:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 95
    .line 96
    if-eqz v3, :cond_3

    .line 97
    .line 98
    invoke-virtual {v3}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Ljava/lang/Float;

    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    :goto_1
    add-float/2addr v2, v3

    .line 109
    goto :goto_2

    .line 110
    :cond_3
    iget-object v3, v7, Lcom/airbnb/lottie/model/layer/i;->Y:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 111
    .line 112
    if-eqz v3, :cond_4

    .line 113
    .line 114
    invoke-virtual {v3}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Ljava/lang/Float;

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    goto :goto_1

    .line 125
    :cond_4
    :goto_2
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    mul-float/2addr v2, v3

    .line 130
    mul-float/2addr v2, v0

    .line 131
    const/high16 v0, 0x42c80000    # 100.0f

    .line 132
    .line 133
    div-float v11, v2, v0

    .line 134
    .line 135
    invoke-direct {v7, v1}, Lcom/airbnb/lottie/model/layer/i;->b0(Ljava/lang/String;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v13

    .line 143
    const/4 v14, 0x0

    .line 144
    const/4 v0, -0x1

    .line 145
    move v15, v0

    .line 146
    move v6, v14

    .line 147
    :goto_3
    if-ge v6, v13, :cond_8

    .line 148
    .line 149
    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    move-object v1, v0

    .line 154
    check-cast v1, Ljava/lang/String;

    .line 155
    .line 156
    iget-object v0, v8, Lcom/airbnb/lottie/model/b;->m:Landroid/graphics/PointF;

    .line 157
    .line 158
    if-nez v0, :cond_5

    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    goto :goto_4

    .line 162
    :cond_5
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 163
    .line 164
    :goto_4
    move v2, v0

    .line 165
    const/4 v4, 0x0

    .line 166
    const/16 v16, 0x0

    .line 167
    .line 168
    move-object/from16 v0, p0

    .line 169
    .line 170
    move-object/from16 v3, p2

    .line 171
    .line 172
    move v5, v11

    .line 173
    move/from16 v17, v6

    .line 174
    .line 175
    move/from16 v6, v16

    .line 176
    .line 177
    invoke-direct/range {v0 .. v6}, Lcom/airbnb/lottie/model/layer/i;->f0(Ljava/lang/String;FLcom/airbnb/lottie/model/c;FFZ)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    move v1, v14

    .line 182
    :goto_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-ge v1, v2, :cond_7

    .line 187
    .line 188
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    check-cast v2, Lcom/airbnb/lottie/model/layer/i$d;

    .line 193
    .line 194
    add-int/lit8 v15, v15, 0x1

    .line 195
    .line 196
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    .line 197
    .line 198
    .line 199
    invoke-static {v2}, Lcom/airbnb/lottie/model/layer/i$d;->a(Lcom/airbnb/lottie/model/layer/i$d;)F

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    invoke-direct {v7, v10, v8, v15, v3}, Lcom/airbnb/lottie/model/layer/i;->e0(Landroid/graphics/Canvas;Lcom/airbnb/lottie/model/b;IF)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_6

    .line 208
    .line 209
    invoke-static {v2}, Lcom/airbnb/lottie/model/layer/i$d;->b(Lcom/airbnb/lottie/model/layer/i$d;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-direct {v7, v2, v8, v10, v11}, Lcom/airbnb/lottie/model/layer/i;->U(Ljava/lang/String;Lcom/airbnb/lottie/model/b;Landroid/graphics/Canvas;F)V

    .line 214
    .line 215
    .line 216
    :cond_6
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    .line 217
    .line 218
    .line 219
    add-int/lit8 v1, v1, 0x1

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_7
    add-int/lit8 v6, v17, 0x1

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_8
    return-void
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
.end method

.method private Y(Lcom/airbnb/lottie/model/b;Landroid/graphics/Matrix;Lcom/airbnb/lottie/model/c;Landroid/graphics/Canvas;)V
    .locals 20

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    iget-object v0, v8, Lcom/airbnb/lottie/model/layer/i;->a0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Float;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v0, v9, Lcom/airbnb/lottie/model/b;->c:F

    .line 21
    .line 22
    :goto_0
    const/high16 v1, 0x42c80000    # 100.0f

    .line 23
    .line 24
    div-float v10, v0, v1

    .line 25
    .line 26
    invoke-static/range {p2 .. p2}, Lcom/airbnb/lottie/utils/l;->g(Landroid/graphics/Matrix;)F

    .line 27
    .line 28
    .line 29
    move-result v11

    .line 30
    iget-object v0, v9, Lcom/airbnb/lottie/model/b;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-direct {v8, v0}, Lcom/airbnb/lottie/model/layer/i;->b0(Ljava/lang/String;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v12

    .line 36
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    iget v0, v9, Lcom/airbnb/lottie/model/b;->e:I

    .line 41
    .line 42
    int-to-float v0, v0

    .line 43
    const/high16 v1, 0x41200000    # 10.0f

    .line 44
    .line 45
    div-float/2addr v0, v1

    .line 46
    iget-object v1, v8, Lcom/airbnb/lottie/model/layer/i;->Z:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ljava/lang/Float;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    :goto_1
    add-float/2addr v0, v1

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    iget-object v1, v8, Lcom/airbnb/lottie/model/layer/i;->Y:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/lang/Float;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    :goto_2
    move v14, v0

    .line 78
    const/4 v15, 0x0

    .line 79
    const/4 v0, -0x1

    .line 80
    move v7, v0

    .line 81
    move v6, v15

    .line 82
    :goto_3
    if-ge v6, v13, :cond_6

    .line 83
    .line 84
    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v1, v0

    .line 89
    check-cast v1, Ljava/lang/String;

    .line 90
    .line 91
    iget-object v0, v9, Lcom/airbnb/lottie/model/b;->m:Landroid/graphics/PointF;

    .line 92
    .line 93
    if-nez v0, :cond_3

    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    goto :goto_4

    .line 97
    :cond_3
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 98
    .line 99
    :goto_4
    move v2, v0

    .line 100
    const/16 v16, 0x1

    .line 101
    .line 102
    move-object/from16 v0, p0

    .line 103
    .line 104
    move-object/from16 v3, p3

    .line 105
    .line 106
    move v4, v10

    .line 107
    move v5, v14

    .line 108
    move/from16 v17, v6

    .line 109
    .line 110
    move/from16 v6, v16

    .line 111
    .line 112
    invoke-direct/range {v0 .. v6}, Lcom/airbnb/lottie/model/layer/i;->f0(Ljava/lang/String;FLcom/airbnb/lottie/model/c;FFZ)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    move v5, v15

    .line 117
    :goto_5
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-ge v5, v0, :cond_5

    .line 122
    .line 123
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Lcom/airbnb/lottie/model/layer/i$d;

    .line 128
    .line 129
    add-int/lit8 v7, v7, 0x1

    .line 130
    .line 131
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Canvas;->save()I

    .line 132
    .line 133
    .line 134
    invoke-static {v0}, Lcom/airbnb/lottie/model/layer/i$d;->a(Lcom/airbnb/lottie/model/layer/i$d;)F

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    move-object/from16 v4, p4

    .line 139
    .line 140
    invoke-direct {v8, v4, v9, v7, v1}, Lcom/airbnb/lottie/model/layer/i;->e0(Landroid/graphics/Canvas;Lcom/airbnb/lottie/model/b;IF)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_4

    .line 145
    .line 146
    invoke-static {v0}, Lcom/airbnb/lottie/model/layer/i$d;->b(Lcom/airbnb/lottie/model/layer/i$d;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    move-object/from16 v0, p0

    .line 151
    .line 152
    move-object/from16 v2, p1

    .line 153
    .line 154
    move-object/from16 v3, p3

    .line 155
    .line 156
    move-object/from16 v4, p4

    .line 157
    .line 158
    move/from16 v16, v5

    .line 159
    .line 160
    move v5, v11

    .line 161
    move-object/from16 v18, v6

    .line 162
    .line 163
    move v6, v10

    .line 164
    move/from16 v19, v7

    .line 165
    .line 166
    move v7, v14

    .line 167
    invoke-direct/range {v0 .. v7}, Lcom/airbnb/lottie/model/layer/i;->W(Ljava/lang/String;Lcom/airbnb/lottie/model/b;Lcom/airbnb/lottie/model/c;Landroid/graphics/Canvas;FFF)V

    .line 168
    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_4
    move/from16 v16, v5

    .line 172
    .line 173
    move-object/from16 v18, v6

    .line 174
    .line 175
    move/from16 v19, v7

    .line 176
    .line 177
    :goto_6
    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Canvas;->restore()V

    .line 178
    .line 179
    .line 180
    add-int/lit8 v5, v16, 0x1

    .line 181
    .line 182
    move-object/from16 v6, v18

    .line 183
    .line 184
    move/from16 v7, v19

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_5
    add-int/lit8 v6, v17, 0x1

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    return-void
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

.method private Z(I)Lcom/airbnb/lottie/model/layer/i$d;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->O:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    :goto_0
    if-ge v0, p1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->O:Ljava/util/List;

    .line 10
    .line 11
    new-instance v2, Lcom/airbnb/lottie/model/layer/i$d;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, v3}, Lcom/airbnb/lottie/model/layer/i$d;-><init>(Lcom/airbnb/lottie/model/layer/i$a;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->O:Ljava/util/List;

    .line 24
    .line 25
    add-int/lit8 p1, p1, -0x1

    .line 26
    .line 27
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lcom/airbnb/lottie/model/layer/i$d;

    .line 32
    .line 33
    return-object p1
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

.method private a0(Lcom/airbnb/lottie/model/d;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/model/d;",
            ")",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/animation/content/d;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->M:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->M:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-virtual {p1}, Lcom/airbnb/lottie/model/d;->a()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    new-instance v2, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-ge v3, v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Lcom/airbnb/lottie/model/content/q;

    .line 39
    .line 40
    new-instance v5, Lcom/airbnb/lottie/animation/content/d;

    .line 41
    .line 42
    iget-object v6, p0, Lcom/airbnb/lottie/model/layer/i;->Q:Lcom/airbnb/lottie/x0;

    .line 43
    .line 44
    iget-object v7, p0, Lcom/airbnb/lottie/model/layer/i;->R:Lcom/airbnb/lottie/k;

    .line 45
    .line 46
    invoke-direct {v5, v6, p0, v4, v7}, Lcom/airbnb/lottie/animation/content/d;-><init>(Lcom/airbnb/lottie/x0;Lcom/airbnb/lottie/model/layer/b;Lcom/airbnb/lottie/model/content/q;Lcom/airbnb/lottie/k;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->M:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-object v2
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

.method private b0(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "\r\n"

    .line 2
    .line 3
    const-string v1, "\r"

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "\u0003"

    .line 10
    .line 11
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "\n"

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
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

.method private c0(Lcom/airbnb/lottie/model/c;)Landroid/graphics/Typeface;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->b0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/graphics/Typeface;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->Q:Lcom/airbnb/lottie/x0;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/x0;->j0(Lcom/airbnb/lottie/model/c;)Landroid/graphics/Typeface;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    invoke-virtual {p1}, Lcom/airbnb/lottie/model/c;->e()Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
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

.method private d0(I)Z
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x1b

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x6

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/16 v1, 0x1c

    .line 29
    .line 30
    if-eq v0, v1, :cond_1

    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/16 v1, 0x8

    .line 37
    .line 38
    if-eq v0, v1, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Character;->getType(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/16 v0, 0x13

    .line 45
    .line 46
    if-ne p1, v0, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 p1, 0x0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 52
    :goto_1
    return p1
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

.method private e0(Landroid/graphics/Canvas;Lcom/airbnb/lottie/model/b;IF)Z
    .locals 6

    .line 1
    iget-object v0, p2, Lcom/airbnb/lottie/model/b;->l:Landroid/graphics/PointF;

    .line 2
    .line 3
    iget-object v1, p2, Lcom/airbnb/lottie/model/b;->m:Landroid/graphics/PointF;

    .line 4
    .line 5
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v4, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v4, p2, Lcom/airbnb/lottie/model/b;->f:F

    .line 15
    .line 16
    mul-float/2addr v4, v2

    .line 17
    iget v5, v0, Landroid/graphics/PointF;->y:F

    .line 18
    .line 19
    add-float/2addr v4, v5

    .line 20
    :goto_0
    int-to-float p3, p3

    .line 21
    iget v5, p2, Lcom/airbnb/lottie/model/b;->f:F

    .line 22
    .line 23
    mul-float/2addr p3, v5

    .line 24
    mul-float/2addr p3, v2

    .line 25
    add-float/2addr p3, v4

    .line 26
    iget-object v2, p0, Lcom/airbnb/lottie/model/layer/i;->Q:Lcom/airbnb/lottie/x0;

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/airbnb/lottie/x0;->P()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget v2, v0, Landroid/graphics/PointF;->y:F

    .line 39
    .line 40
    iget v4, v1, Landroid/graphics/PointF;->y:F

    .line 41
    .line 42
    add-float/2addr v2, v4

    .line 43
    iget v4, p2, Lcom/airbnb/lottie/model/b;->c:F

    .line 44
    .line 45
    add-float/2addr v2, v4

    .line 46
    cmpl-float v2, p3, v2

    .line 47
    .line 48
    if-ltz v2, :cond_1

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    return p1

    .line 52
    :cond_1
    if-nez v0, :cond_2

    .line 53
    .line 54
    move v0, v3

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 57
    .line 58
    :goto_1
    if-nez v1, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 62
    .line 63
    :goto_2
    sget-object v1, Lcom/airbnb/lottie/model/layer/i$c;->a:[I

    .line 64
    .line 65
    iget-object p2, p2, Lcom/airbnb/lottie/model/b;->d:Lcom/airbnb/lottie/model/b$a;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    aget p2, v1, p2

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    if-eq p2, v1, :cond_6

    .line 75
    .line 76
    const/4 v2, 0x2

    .line 77
    if-eq p2, v2, :cond_5

    .line 78
    .line 79
    const/4 v2, 0x3

    .line 80
    if-eq p2, v2, :cond_4

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    const/high16 p2, 0x40000000    # 2.0f

    .line 84
    .line 85
    div-float/2addr v3, p2

    .line 86
    add-float/2addr v0, v3

    .line 87
    div-float/2addr p4, p2

    .line 88
    sub-float/2addr v0, p4

    .line 89
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    add-float/2addr v0, v3

    .line 94
    sub-float/2addr v0, p4

    .line 95
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    invoke-virtual {p1, v0, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 100
    .line 101
    .line 102
    :goto_3
    return v1
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

.method private f0(Ljava/lang/String;FLcom/airbnb/lottie/model/c;FFZ)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "F",
            "Lcom/airbnb/lottie/model/c;",
            "FFZ)",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/model/layer/i$d;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move v4, v2

    .line 8
    move v6, v4

    .line 9
    move v7, v6

    .line 10
    move v8, v7

    .line 11
    move v10, v8

    .line 12
    move v5, v3

    .line 13
    move v9, v5

    .line 14
    move v11, v9

    .line 15
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v12

    .line 19
    if-ge v4, v12, :cond_7

    .line 20
    .line 21
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v12

    .line 25
    if-eqz p6, :cond_1

    .line 26
    .line 27
    invoke-virtual/range {p3 .. p3}, Lcom/airbnb/lottie/model/c;->b()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v13

    .line 31
    invoke-virtual/range {p3 .. p3}, Lcom/airbnb/lottie/model/c;->d()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v14

    .line 35
    invoke-static {v12, v13, v14}, Lcom/airbnb/lottie/model/d;->c(CLjava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-object v14, v0, Lcom/airbnb/lottie/model/layer/i;->R:Lcom/airbnb/lottie/k;

    .line 40
    .line 41
    invoke-virtual {v14}, Lcom/airbnb/lottie/k;->c()Landroidx/collection/SparseArrayCompat;

    .line 42
    .line 43
    .line 44
    move-result-object v14

    .line 45
    invoke-virtual {v14, v13}, Landroidx/collection/SparseArrayCompat;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v13

    .line 49
    check-cast v13, Lcom/airbnb/lottie/model/d;

    .line 50
    .line 51
    if-nez v13, :cond_0

    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_0
    invoke-virtual {v13}, Lcom/airbnb/lottie/model/d;->b()D

    .line 56
    .line 57
    .line 58
    move-result-wide v13

    .line 59
    double-to-float v13, v13

    .line 60
    mul-float v13, v13, p4

    .line 61
    .line 62
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    mul-float/2addr v13, v14

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    iget-object v13, v0, Lcom/airbnb/lottie/model/layer/i;->K:Landroid/graphics/Paint;

    .line 69
    .line 70
    add-int/lit8 v14, v4, 0x1

    .line 71
    .line 72
    invoke-virtual {v1, v4, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v14

    .line 76
    invoke-virtual {v13, v14}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    :goto_1
    add-float v13, v13, p5

    .line 81
    .line 82
    const/16 v14, 0x20

    .line 83
    .line 84
    if-ne v12, v14, :cond_2

    .line 85
    .line 86
    const/4 v8, 0x1

    .line 87
    move v11, v13

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    if-eqz v8, :cond_3

    .line 90
    .line 91
    move v8, v2

    .line 92
    move v10, v4

    .line 93
    move v9, v13

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    add-float/2addr v9, v13

    .line 96
    :goto_2
    add-float/2addr v5, v13

    .line 97
    cmpl-float v15, p2, v3

    .line 98
    .line 99
    if-lez v15, :cond_6

    .line 100
    .line 101
    cmpl-float v15, v5, p2

    .line 102
    .line 103
    if-ltz v15, :cond_6

    .line 104
    .line 105
    if-ne v12, v14, :cond_4

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 109
    .line 110
    invoke-direct {v0, v6}, Lcom/airbnb/lottie/model/layer/i;->Z(I)Lcom/airbnb/lottie/model/layer/i$d;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    if-ne v10, v7, :cond_5

    .line 115
    .line 116
    invoke-virtual {v1, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    sub-int/2addr v10, v7

    .line 133
    int-to-float v7, v10

    .line 134
    mul-float/2addr v7, v11

    .line 135
    sub-float/2addr v5, v13

    .line 136
    sub-float/2addr v5, v7

    .line 137
    invoke-virtual {v12, v9, v5}, Lcom/airbnb/lottie/model/layer/i$d;->c(Ljava/lang/String;F)V

    .line 138
    .line 139
    .line 140
    move v7, v4

    .line 141
    move v10, v7

    .line 142
    move v5, v13

    .line 143
    move v9, v5

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    add-int/lit8 v13, v10, -0x1

    .line 146
    .line 147
    invoke-virtual {v1, v7, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    sub-int/2addr v7, v14

    .line 164
    int-to-float v7, v7

    .line 165
    mul-float/2addr v7, v11

    .line 166
    sub-float/2addr v5, v9

    .line 167
    sub-float/2addr v5, v7

    .line 168
    sub-float/2addr v5, v11

    .line 169
    invoke-virtual {v12, v13, v5}, Lcom/airbnb/lottie/model/layer/i$d;->c(Ljava/lang/String;F)V

    .line 170
    .line 171
    .line 172
    move v5, v9

    .line 173
    move v7, v10

    .line 174
    :cond_6
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :cond_7
    cmpl-float v3, v5, v3

    .line 179
    .line 180
    if-lez v3, :cond_8

    .line 181
    .line 182
    add-int/lit8 v6, v6, 0x1

    .line 183
    .line 184
    invoke-direct {v0, v6}, Lcom/airbnb/lottie/model/layer/i;->Z(I)Lcom/airbnb/lottie/model/layer/i$d;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v3, v1, v5}, Lcom/airbnb/lottie/model/layer/i$d;->c(Ljava/lang/String;F)V

    .line 193
    .line 194
    .line 195
    :cond_8
    iget-object v1, v0, Lcom/airbnb/lottie/model/layer/i;->O:Ljava/util/List;

    .line 196
    .line 197
    invoke-interface {v1, v2, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    return-object v1
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
.end method


# virtual methods
.method public d(Ljava/lang/Object;Lcom/airbnb/lottie/value/j;)V
    .locals 2
    .param p2    # Lcom/airbnb/lottie/value/j;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/airbnb/lottie/value/j<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lcom/airbnb/lottie/model/layer/b;->d(Ljava/lang/Object;Lcom/airbnb/lottie/value/j;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/airbnb/lottie/c1;->a:Ljava/lang/Integer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-ne p1, v0, :cond_2

    .line 8
    .line 9
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->T:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->H(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-nez p2, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->T:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_1
    new-instance p1, Lcom/airbnb/lottie/animation/keyframe/q;

    .line 23
    .line 24
    invoke-direct {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/q;-><init>(Lcom/airbnb/lottie/value/j;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->T:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->T:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_2
    sget-object v0, Lcom/airbnb/lottie/c1;->b:Ljava/lang/Integer;

    .line 40
    .line 41
    if-ne p1, v0, :cond_5

    .line 42
    .line 43
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->V:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 44
    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->H(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    if-nez p2, :cond_4

    .line 51
    .line 52
    iput-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->V:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_4
    new-instance p1, Lcom/airbnb/lottie/animation/keyframe/q;

    .line 57
    .line 58
    invoke-direct {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/q;-><init>(Lcom/airbnb/lottie/value/j;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->V:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->V:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_5
    sget-object v0, Lcom/airbnb/lottie/c1;->s:Ljava/lang/Float;

    .line 74
    .line 75
    if-ne p1, v0, :cond_8

    .line 76
    .line 77
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->X:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 78
    .line 79
    if-eqz p1, :cond_6

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->H(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 82
    .line 83
    .line 84
    :cond_6
    if-nez p2, :cond_7

    .line 85
    .line 86
    iput-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->X:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 87
    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :cond_7
    new-instance p1, Lcom/airbnb/lottie/animation/keyframe/q;

    .line 91
    .line 92
    invoke-direct {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/q;-><init>(Lcom/airbnb/lottie/value/j;)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->X:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->X:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_0

    .line 106
    .line 107
    :cond_8
    sget-object v0, Lcom/airbnb/lottie/c1;->t:Ljava/lang/Float;

    .line 108
    .line 109
    if-ne p1, v0, :cond_b

    .line 110
    .line 111
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->Z:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 112
    .line 113
    if-eqz p1, :cond_9

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->H(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 116
    .line 117
    .line 118
    :cond_9
    if-nez p2, :cond_a

    .line 119
    .line 120
    iput-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->Z:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_a
    new-instance p1, Lcom/airbnb/lottie/animation/keyframe/q;

    .line 124
    .line 125
    invoke-direct {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/q;-><init>(Lcom/airbnb/lottie/value/j;)V

    .line 126
    .line 127
    .line 128
    iput-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->Z:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 129
    .line 130
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->Z:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_b
    sget-object v0, Lcom/airbnb/lottie/c1;->F:Ljava/lang/Float;

    .line 140
    .line 141
    if-ne p1, v0, :cond_e

    .line 142
    .line 143
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->a0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 144
    .line 145
    if-eqz p1, :cond_c

    .line 146
    .line 147
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->H(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 148
    .line 149
    .line 150
    :cond_c
    if-nez p2, :cond_d

    .line 151
    .line 152
    iput-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->a0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_d
    new-instance p1, Lcom/airbnb/lottie/animation/keyframe/q;

    .line 156
    .line 157
    invoke-direct {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/q;-><init>(Lcom/airbnb/lottie/value/j;)V

    .line 158
    .line 159
    .line 160
    iput-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->a0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 161
    .line 162
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->a0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 166
    .line 167
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_e
    sget-object v0, Lcom/airbnb/lottie/c1;->M:Landroid/graphics/Typeface;

    .line 172
    .line 173
    if-ne p1, v0, :cond_11

    .line 174
    .line 175
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->b0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 176
    .line 177
    if-eqz p1, :cond_f

    .line 178
    .line 179
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->H(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 180
    .line 181
    .line 182
    :cond_f
    if-nez p2, :cond_10

    .line 183
    .line 184
    iput-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->b0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_10
    new-instance p1, Lcom/airbnb/lottie/animation/keyframe/q;

    .line 188
    .line 189
    invoke-direct {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/q;-><init>(Lcom/airbnb/lottie/value/j;)V

    .line 190
    .line 191
    .line 192
    iput-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->b0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 193
    .line 194
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->b0:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 198
    .line 199
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 200
    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_11
    sget-object v0, Lcom/airbnb/lottie/c1;->O:Ljava/lang/CharSequence;

    .line 204
    .line 205
    if-ne p1, v0, :cond_12

    .line 206
    .line 207
    iget-object p1, p0, Lcom/airbnb/lottie/model/layer/i;->P:Lcom/airbnb/lottie/animation/keyframe/o;

    .line 208
    .line 209
    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/o;->r(Lcom/airbnb/lottie/value/j;)V

    .line 210
    .line 211
    .line 212
    :cond_12
    :goto_0
    return-void
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
.end method

.method public f(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/airbnb/lottie/model/layer/b;->f(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/airbnb/lottie/model/layer/i;->R:Lcom/airbnb/lottie/k;

    .line 5
    .line 6
    invoke-virtual {p2}, Lcom/airbnb/lottie/k;->b()Landroid/graphics/Rect;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    int-to-float p2, p2

    .line 15
    iget-object p3, p0, Lcom/airbnb/lottie/model/layer/i;->R:Lcom/airbnb/lottie/k;

    .line 16
    .line 17
    invoke-virtual {p3}, Lcom/airbnb/lottie/k;->b()Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    int-to-float p3, p3

    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, v0, v0, p2, p3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 28
    .line 29
    .line 30
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

.method t(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/model/layer/i;->P:Lcom/airbnb/lottie/animation/keyframe/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/airbnb/lottie/model/b;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/airbnb/lottie/model/layer/i;->R:Lcom/airbnb/lottie/k;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/airbnb/lottie/k;->g()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v0, Lcom/airbnb/lottie/model/b;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/airbnb/lottie/model/c;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, p3}, Lcom/airbnb/lottie/model/layer/i;->Q(Lcom/airbnb/lottie/model/b;I)V

    .line 33
    .line 34
    .line 35
    iget-object p3, p0, Lcom/airbnb/lottie/model/layer/i;->Q:Lcom/airbnb/lottie/x0;

    .line 36
    .line 37
    invoke-virtual {p3}, Lcom/airbnb/lottie/x0;->H1()Z

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    if-eqz p3, :cond_1

    .line 42
    .line 43
    invoke-direct {p0, v0, p2, v1, p1}, Lcom/airbnb/lottie/model/layer/i;->Y(Lcom/airbnb/lottie/model/b;Landroid/graphics/Matrix;Lcom/airbnb/lottie/model/c;Landroid/graphics/Canvas;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-direct {p0, v0, v1, p1}, Lcom/airbnb/lottie/model/layer/i;->X(Lcom/airbnb/lottie/model/b;Lcom/airbnb/lottie/model/c;Landroid/graphics/Canvas;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 51
    .line 52
    .line 53
    return-void
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
.end method
