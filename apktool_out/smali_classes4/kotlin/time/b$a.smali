.class final Lkotlin/time/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/time/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/time/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0008J\u0015\u0010\n\u001a\u00020\u0007H\u0016\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0008\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0008\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkotlin/time/AbstractLongTimeSource$LongTimeMark;",
        "Lkotlin/time/ComparableTimeMark;",
        "startedAt",
        "",
        "timeSource",
        "Lkotlin/time/AbstractLongTimeSource;",
        "offset",
        "Lkotlin/time/Duration;",
        "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "J",
        "elapsedNow",
        "elapsedNow-UwyO8pc",
        "()J",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "minus",
        "minus-UwyO8pc",
        "(Lkotlin/time/ComparableTimeMark;)J",
        "plus",
        "duration",
        "plus-LRDsOJo",
        "(J)Lkotlin/time/ComparableTimeMark;",
        "toString",
        "",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:Lkotlin/time/b;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final c:J


# direct methods
.method private constructor <init>(JLkotlin/time/b;J)V
    .locals 1

    .line 1
    const-string v0, "timeSource"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lkotlin/time/b$a;->a:J

    .line 10
    .line 11
    iput-object p3, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    .line 12
    .line 13
    iput-wide p4, p0, Lkotlin/time/b$a;->c:J

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
.end method

.method public synthetic constructor <init>(JLkotlin/time/b;JLkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lkotlin/time/b$a;-><init>(JLkotlin/time/b;J)V

    return-void
.end method


# virtual methods
.method public a(J)Lkotlin/time/d;
    .locals 10
    .annotation build Lp4/l;
    .end annotation

    .line 2
    iget-object v0, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    invoke-virtual {v0}, Lkotlin/time/b;->d()Lkotlin/time/h;

    move-result-object v0

    .line 3
    invoke-static {p1, p2}, Lkotlin/time/e;->d0(J)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-wide v1, p0, Lkotlin/time/b$a;->a:J

    invoke-static {v1, v2, v0, p1, p2}, Lkotlin/time/m;->d(JLkotlin/time/h;J)J

    move-result-wide v4

    .line 5
    new-instance p1, Lkotlin/time/b$a;

    iget-object v6, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    sget-object p2, Lkotlin/time/e;->b:Lkotlin/time/e$a;

    invoke-virtual {p2}, Lkotlin/time/e$a;->W()J

    move-result-wide v7

    const/4 v9, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, Lkotlin/time/b$a;-><init>(JLkotlin/time/b;JLkotlin/jvm/internal/w;)V

    return-object p1

    .line 6
    :cond_0
    invoke-static {p1, p2, v0}, Lkotlin/time/e;->x0(JLkotlin/time/h;)J

    move-result-wide v1

    .line 7
    invoke-static {p1, p2, v1, v2}, Lkotlin/time/e;->g0(JJ)J

    move-result-wide p1

    iget-wide v3, p0, Lkotlin/time/b$a;->c:J

    invoke-static {p1, p2, v3, v4}, Lkotlin/time/e;->h0(JJ)J

    move-result-wide p1

    .line 8
    iget-wide v3, p0, Lkotlin/time/b$a;->a:J

    invoke-static {v3, v4, v0, v1, v2}, Lkotlin/time/m;->d(JLkotlin/time/h;J)J

    move-result-wide v1

    .line 9
    invoke-static {p1, p2, v0}, Lkotlin/time/e;->x0(JLkotlin/time/h;)J

    move-result-wide v3

    .line 10
    invoke-static {v1, v2, v0, v3, v4}, Lkotlin/time/m;->d(JLkotlin/time/h;J)J

    move-result-wide v1

    .line 11
    invoke-static {p1, p2, v3, v4}, Lkotlin/time/e;->g0(JJ)J

    move-result-wide p1

    .line 12
    invoke-static {p1, p2}, Lkotlin/time/e;->O(J)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-eqz v7, :cond_1

    cmp-long v7, v3, v5

    if-eqz v7, :cond_1

    xor-long v7, v1, v3

    cmp-long v5, v7, v5

    if-gez v5, :cond_1

    .line 13
    invoke-static {v3, v4}, Lkotlin/math/b;->V(J)I

    move-result v3

    invoke-static {v3, v0}, Lkotlin/time/g;->m0(ILkotlin/time/h;)J

    move-result-wide v3

    .line 14
    invoke-static {v1, v2, v0, v3, v4}, Lkotlin/time/m;->d(JLkotlin/time/h;J)J

    move-result-wide v1

    .line 15
    invoke-static {p1, p2, v3, v4}, Lkotlin/time/e;->g0(JJ)J

    move-result-wide p1

    :cond_1
    const-wide/16 v3, 0x1

    sub-long v5, v1, v3

    or-long/2addr v3, v5

    const-wide v5, 0x7fffffffffffffffL

    cmp-long v0, v3, v5

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    .line 16
    sget-object p1, Lkotlin/time/e;->b:Lkotlin/time/e$a;

    invoke-virtual {p1}, Lkotlin/time/e$a;->W()J

    move-result-wide p1

    :cond_3
    move-wide v4, p1

    .line 17
    new-instance p1, Lkotlin/time/b$a;

    iget-object v3, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    const/4 v6, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/time/b$a;-><init>(JLkotlin/time/b;JLkotlin/jvm/internal/w;)V

    return-object p1
.end method

.method public bridge synthetic a(J)Lkotlin/time/r;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lkotlin/time/b$a;->a(J)Lkotlin/time/d;

    move-result-object p1

    return-object p1
.end method

.method public b(J)Lkotlin/time/d;
    .locals 0
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lkotlin/time/d$a;->d(Lkotlin/time/d;J)Lkotlin/time/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(J)Lkotlin/time/r;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lkotlin/time/b$a;->b(J)Lkotlin/time/d;

    move-result-object p1

    return-object p1
.end method

.method public c()J
    .locals 5

    iget-object v0, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    invoke-static {v0}, Lkotlin/time/b;->b(Lkotlin/time/b;)J

    move-result-wide v0

    iget-wide v2, p0, Lkotlin/time/b$a;->a:J

    iget-object v4, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    invoke-virtual {v4}, Lkotlin/time/b;->d()Lkotlin/time/h;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/time/m;->h(JJLkotlin/time/h;)J

    move-result-wide v0

    iget-wide v2, p0, Lkotlin/time/b$a;->c:J

    invoke-static {v0, v1, v2, v3}, Lkotlin/time/e;->g0(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lkotlin/time/d;

    invoke-virtual {p0, p1}, Lkotlin/time/b$a;->g(Lkotlin/time/d;)I

    move-result p1

    return p1
.end method

.method public d(Lkotlin/time/d;)J
    .locals 6
    .param p1    # Lkotlin/time/d;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "other"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lkotlin/time/b$a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    .line 11
    .line 12
    move-object v1, p1

    .line 13
    check-cast v1, Lkotlin/time/b$a;

    .line 14
    .line 15
    iget-object v2, v1, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-wide v2, p0, Lkotlin/time/b$a;->a:J

    .line 24
    .line 25
    iget-wide v4, v1, Lkotlin/time/b$a;->a:J

    .line 26
    .line 27
    iget-object p1, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    .line 28
    .line 29
    invoke-virtual {p1}, Lkotlin/time/b;->d()Lkotlin/time/h;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {v2, v3, v4, v5, p1}, Lkotlin/time/m;->h(JJLkotlin/time/h;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    iget-wide v4, p0, Lkotlin/time/b$a;->c:J

    .line 38
    .line 39
    iget-wide v0, v1, Lkotlin/time/b$a;->c:J

    .line 40
    .line 41
    invoke-static {v4, v5, v0, v1}, Lkotlin/time/e;->g0(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    invoke-static {v2, v3, v0, v1}, Lkotlin/time/e;->h0(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    return-wide v0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v2, "Subtracting or comparing time marks from different time sources is not possible: "

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v2, " and "

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0
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
.end method

.method public e()Z
    .locals 1

    invoke-static {p0}, Lkotlin/time/d$a;->c(Lkotlin/time/d;)Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    instance-of v0, p1, Lkotlin/time/b$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    move-object v1, p1

    check-cast v1, Lkotlin/time/b$a;

    iget-object v1, v1, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Lkotlin/time/d;

    invoke-virtual {p0, p1}, Lkotlin/time/b$a;->d(Lkotlin/time/d;)J

    move-result-wide v0

    sget-object p1, Lkotlin/time/e;->b:Lkotlin/time/e$a;

    invoke-virtual {p1}, Lkotlin/time/e$a;->W()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lkotlin/time/e;->r(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Z
    .locals 1

    invoke-static {p0}, Lkotlin/time/d$a;->b(Lkotlin/time/d;)Z

    move-result v0

    return v0
.end method

.method public g(Lkotlin/time/d;)I
    .locals 0
    .param p1    # Lkotlin/time/d;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lkotlin/time/d$a;->a(Lkotlin/time/d;Lkotlin/time/d;)I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lkotlin/time/b$a;->c:J

    invoke-static {v0, v1}, Lkotlin/time/e;->Z(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x25

    iget-wide v1, p0, Lkotlin/time/b$a;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LongTimeMark("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lkotlin/time/b$a;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    invoke-virtual {v1}, Lkotlin/time/b;->d()Lkotlin/time/h;

    move-result-object v1

    invoke-static {v1}, Lkotlin/time/k;->h(Lkotlin/time/h;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lkotlin/time/b$a;->c:J

    invoke-static {v1, v2}, Lkotlin/time/e;->u0(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkotlin/time/b$a;->b:Lkotlin/time/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
