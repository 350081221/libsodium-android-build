.class public abstract Lio/reactivex/rxjava3/flowables/a;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/o<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    return-void
.end method


# virtual methods
.method public n9()Lio/reactivex/rxjava3/core/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/flowables/a;->o9(I)Lio/reactivex/rxjava3/core/o;

    move-result-object v0

    return-object v0
.end method

.method public o9(I)Lio/reactivex/rxjava3/core/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/internal/functions/a;->h()Lm3/g;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lio/reactivex/rxjava3/flowables/a;->p9(ILm3/g;)Lio/reactivex/rxjava3/core/o;

    move-result-object p1

    return-object p1
.end method

.method public p9(ILm3/g;)Lio/reactivex/rxjava3/core/o;
    .locals 1
    .param p2    # Lm3/g;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lm3/g<",
            "-",
            "Lio/reactivex/rxjava3/disposables/e;",
            ">;)",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    const-string v0, "connection is null"

    .line 2
    .line 3
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    if-gtz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lio/reactivex/rxjava3/flowables/a;->r9(Lm3/g;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lio/reactivex/rxjava3/plugins/a;->T(Lio/reactivex/rxjava3/flowables/a;)Lio/reactivex/rxjava3/flowables/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/k;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1, p2}, Lio/reactivex/rxjava3/internal/operators/flowable/k;-><init>(Lio/reactivex/rxjava3/flowables/a;ILm3/g;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
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

.method public final q9()Lio/reactivex/rxjava3/disposables/e;
    .locals 1
    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxjava3/internal/util/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/reactivex/rxjava3/internal/util/g;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lio/reactivex/rxjava3/flowables/a;->r9(Lm3/g;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, v0, Lio/reactivex/rxjava3/internal/util/g;->a:Lio/reactivex/rxjava3/disposables/e;

    .line 10
    .line 11
    return-object v0
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

.method public abstract r9(Lm3/g;)V
    .param p1    # Lm3/g;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/g<",
            "-",
            "Lio/reactivex/rxjava3/disposables/e;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation
.end method

.method public s9()Lio/reactivex/rxjava3/core/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/e3;

    invoke-direct {v0, p0}, Lio/reactivex/rxjava3/internal/operators/flowable/e3;-><init>(Lio/reactivex/rxjava3/flowables/a;)V

    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    move-result-object v0

    return-object v0
.end method

.method public final t9(I)Lio/reactivex/rxjava3/core/o;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "none"
    .end annotation

    const-wide/16 v2, 0x0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Lio/reactivex/rxjava3/schedulers/b;->j()Lio/reactivex/rxjava3/core/q0;

    move-result-object v5

    move-object v0, p0

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/rxjava3/flowables/a;->v9(IJLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/o;

    move-result-object p1

    return-object p1
.end method

.method public final u9(IJLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/core/o;
    .locals 6
    .param p4    # Ljava/util/concurrent/TimeUnit;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "io.reactivex:computation"
    .end annotation

    invoke-static {}, Lio/reactivex/rxjava3/schedulers/b;->a()Lio/reactivex/rxjava3/core/q0;

    move-result-object v5

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/rxjava3/flowables/a;->v9(IJLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/o;

    move-result-object p1

    return-object p1
.end method

.method public final v9(IJLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/o;
    .locals 8
    .param p4    # Ljava/util/concurrent/TimeUnit;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p5    # Lio/reactivex/rxjava3/core/q0;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/rxjava3/core/q0;",
            ")",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "custom"
    .end annotation

    .line 1
    const-string v0, "subscriberCount"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lio/reactivex/rxjava3/internal/functions/b;->b(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    const-string v0, "unit is null"

    .line 7
    .line 8
    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    const-string v0, "scheduler is null"

    .line 12
    .line 13
    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    new-instance v0, Lio/reactivex/rxjava3/internal/operators/flowable/e3;

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    move-object v2, p0

    .line 20
    move v3, p1

    .line 21
    move-wide v4, p2

    .line 22
    move-object v6, p4

    .line 23
    move-object v7, p5

    .line 24
    invoke-direct/range {v1 .. v7}, Lio/reactivex/rxjava3/internal/operators/flowable/e3;-><init>(Lio/reactivex/rxjava3/flowables/a;IJLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lio/reactivex/rxjava3/plugins/a;->P(Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
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

.method public final w9(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/rxjava3/core/o;
    .locals 6
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "io.reactivex:computation"
    .end annotation

    const/4 v1, 0x1

    invoke-static {}, Lio/reactivex/rxjava3/schedulers/b;->a()Lio/reactivex/rxjava3/core/q0;

    move-result-object v5

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/rxjava3/flowables/a;->v9(IJLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/o;

    move-result-object p1

    return-object p1
.end method

.method public final x9(JLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/o;
    .locals 6
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .param p4    # Lio/reactivex/rxjava3/core/q0;
        .annotation build Ll3/f;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lio/reactivex/rxjava3/core/q0;",
            ")",
            "Lio/reactivex/rxjava3/core/o<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ll3/b;
        value = .enum Ll3/a;->PASS_THROUGH:Ll3/a;
    .end annotation

    .annotation runtime Ll3/d;
    .end annotation

    .annotation build Ll3/f;
    .end annotation

    .annotation runtime Ll3/h;
        value = "custom"
    .end annotation

    const/4 v1, 0x1

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lio/reactivex/rxjava3/flowables/a;->v9(IJLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/q0;)Lio/reactivex/rxjava3/core/o;

    move-result-object p1

    return-object p1
.end method

.method public abstract y9()V
    .annotation runtime Ll3/h;
        value = "none"
    .end annotation
.end method
