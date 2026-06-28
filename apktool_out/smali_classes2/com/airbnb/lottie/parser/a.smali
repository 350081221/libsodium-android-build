.class public Lcom/airbnb/lottie/parser/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/airbnb/lottie/parser/moshi/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string/jumbo v0, "x"

    .line 2
    .line 3
    .line 4
    const-string/jumbo v1, "y"

    .line 5
    .line 6
    .line 7
    const-string v2, "k"

    .line 8
    .line 9
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lcom/airbnb/lottie/parser/moshi/c$a;->a([Ljava/lang/String;)Lcom/airbnb/lottie/parser/moshi/c$a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/airbnb/lottie/parser/a;->a:Lcom/airbnb/lottie/parser/moshi/c$a;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/e;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->H()Lcom/airbnb/lottie/parser/moshi/c$b;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lcom/airbnb/lottie/parser/moshi/c$b;->BEGIN_ARRAY:Lcom/airbnb/lottie/parser/moshi/c$b;

    .line 11
    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->b()V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->j()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-static {p0, p1}, Lcom/airbnb/lottie/parser/z;->a(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/animation/keyframe/i;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->d()V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/airbnb/lottie/parser/u;->b(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    new-instance p1, Lcom/airbnb/lottie/value/a;

    .line 39
    .line 40
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-static {p0, v1}, Lcom/airbnb/lottie/parser/s;->e(Lcom/airbnb/lottie/parser/moshi/c;F)Landroid/graphics/PointF;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {p1, p0}, Lcom/airbnb/lottie/value/a;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :goto_1
    new-instance p0, Lcom/airbnb/lottie/model/animatable/e;

    .line 55
    .line 56
    invoke-direct {p0, v0}, Lcom/airbnb/lottie/model/animatable/e;-><init>(Ljava/util/List;)V

    .line 57
    .line 58
    .line 59
    return-object p0
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
.end method

.method static b(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/m;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/parser/moshi/c;",
            "Lcom/airbnb/lottie/k;",
            ")",
            "Lcom/airbnb/lottie/model/animatable/m<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->c()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    move-object v2, v0

    .line 7
    move v3, v1

    .line 8
    move-object v1, v2

    .line 9
    :goto_0
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->H()Lcom/airbnb/lottie/parser/moshi/c$b;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    sget-object v5, Lcom/airbnb/lottie/parser/moshi/c$b;->END_OBJECT:Lcom/airbnb/lottie/parser/moshi/c$b;

    .line 14
    .line 15
    if-eq v4, v5, :cond_5

    .line 16
    .line 17
    sget-object v4, Lcom/airbnb/lottie/parser/a;->a:Lcom/airbnb/lottie/parser/moshi/c$a;

    .line 18
    .line 19
    invoke-virtual {p0, v4}, Lcom/airbnb/lottie/parser/moshi/c;->J(Lcom/airbnb/lottie/parser/moshi/c$a;)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_4

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    if-eq v4, v5, :cond_2

    .line 27
    .line 28
    const/4 v6, 0x2

    .line 29
    if-eq v4, v6, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->M()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->O()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->H()Lcom/airbnb/lottie/parser/moshi/c$b;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    sget-object v6, Lcom/airbnb/lottie/parser/moshi/c$b;->STRING:Lcom/airbnb/lottie/parser/moshi/c$b;

    .line 43
    .line 44
    if-ne v4, v6, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->O()V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {p0, p1}, Lcom/airbnb/lottie/parser/d;->e(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/b;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->H()Lcom/airbnb/lottie/parser/moshi/c$b;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget-object v6, Lcom/airbnb/lottie/parser/moshi/c$b;->STRING:Lcom/airbnb/lottie/parser/moshi/c$b;

    .line 60
    .line 61
    if-ne v4, v6, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->O()V

    .line 64
    .line 65
    .line 66
    :goto_1
    move v3, v5

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-static {p0, p1}, Lcom/airbnb/lottie/parser/d;->e(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/b;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    invoke-static {p0, p1}, Lcom/airbnb/lottie/parser/a;->a(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/e;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    goto :goto_0

    .line 78
    :cond_5
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->h()V

    .line 79
    .line 80
    .line 81
    if-eqz v3, :cond_6

    .line 82
    .line 83
    const-string p0, "Lottie doesn\'t support expressions."

    .line 84
    .line 85
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/k;->a(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_6
    if-eqz v0, :cond_7

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_7
    new-instance p0, Lcom/airbnb/lottie/model/animatable/i;

    .line 92
    .line 93
    invoke-direct {p0, v1, v2}, Lcom/airbnb/lottie/model/animatable/i;-><init>(Lcom/airbnb/lottie/model/animatable/b;Lcom/airbnb/lottie/model/animatable/b;)V

    .line 94
    .line 95
    .line 96
    return-object p0
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
