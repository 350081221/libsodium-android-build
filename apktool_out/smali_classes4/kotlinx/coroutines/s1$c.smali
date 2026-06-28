.class public abstract Lkotlinx/coroutines/s1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lkotlinx/coroutines/n1;
.implements Lkotlinx/coroutines/internal/e1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/s1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Comparable<",
        "Lkotlinx/coroutines/s1$c;",
        ">;",
        "Lkotlinx/coroutines/n1;",
        "Lkotlinx/coroutines/internal/e1;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008 \u0018\u00002\u00060\u0001j\u0002`\u00022\u0008\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u00a2\u0006\u0004\u0008+\u0010,J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bJ\u001e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0014J\u0008\u0010\u0017\u001a\u00020\u0016H\u0016R\u0016\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\"\u0010#\u001a\u00020\t8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R0\u0010*\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010$2\u000c\u0010%\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010$8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)\u00a8\u0006-"
    }
    d2 = {
        "Lkotlinx/coroutines/s1$c;",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "",
        "Lkotlinx/coroutines/n1;",
        "Lkotlinx/coroutines/internal/e1;",
        "",
        "Lkotlinx/coroutines/internal/SynchronizedObject;",
        "other",
        "",
        "h",
        "",
        "now",
        "",
        "j",
        "Lkotlinx/coroutines/s1$d;",
        "delayed",
        "Lkotlinx/coroutines/s1;",
        "eventLoop",
        "i",
        "Lkotlin/r2;",
        "dispose",
        "",
        "toString",
        "a",
        "J",
        "nanoTime",
        "_heap",
        "Ljava/lang/Object;",
        "b",
        "I",
        "getIndex",
        "()I",
        "setIndex",
        "(I)V",
        "index",
        "Lkotlinx/coroutines/internal/d1;",
        "value",
        "f",
        "()Lkotlinx/coroutines/internal/d1;",
        "c",
        "(Lkotlinx/coroutines/internal/d1;)V",
        "heap",
        "<init>",
        "(J)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,543:1\n28#2,4:544\n28#2,4:550\n28#2,4:562\n20#3:548\n20#3:554\n20#3:566\n72#4:549\n73#4,7:555\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n437#1:544,4\n439#1:550,4\n479#1:562,4\n437#1:548\n439#1:554\n479#1:566\n439#1:549\n439#1:555,7\n*E\n"
    }
.end annotation


# instance fields
.field private volatile _heap:Ljava/lang/Object;
    .annotation build Lp4/m;
    .end annotation
.end field

.field public a:J
    .annotation build Lu3/e;
    .end annotation
.end field

.field private b:I


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lkotlinx/coroutines/s1$c;->a:J

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lkotlinx/coroutines/s1$c;->b:I

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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public c(Lkotlinx/coroutines/internal/d1;)V
    .locals 2
    .param p1    # Lkotlinx/coroutines/internal/d1;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/internal/d1<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/s1$c;->_heap:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {}, Lkotlinx/coroutines/v1;->b()Lkotlinx/coroutines/internal/t0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iput-object p1, p0, Lkotlinx/coroutines/s1$c;->_heap:Ljava/lang/Object;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v0, "Failed requirement."

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
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
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lkotlinx/coroutines/s1$c;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/s1$c;->h(Lkotlinx/coroutines/s1$c;)I

    move-result p1

    return p1
.end method

.method public final dispose()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lkotlinx/coroutines/s1$c;->_heap:Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {}, Lkotlinx/coroutines/v1;->b()Lkotlinx/coroutines/internal/t0;

    .line 5
    .line 6
    .line 7
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    instance-of v1, v0, Lkotlinx/coroutines/s1$d;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Lkotlinx/coroutines/s1$d;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/d1;->k(Lkotlinx/coroutines/internal/e1;)Z

    .line 23
    .line 24
    .line 25
    :cond_2
    invoke-static {}, Lkotlinx/coroutines/v1;->b()Lkotlinx/coroutines/internal/t0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lkotlinx/coroutines/s1$c;->_heap:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    monitor-exit p0

    .line 37
    throw v0
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public f()Lkotlinx/coroutines/internal/d1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/internal/d1<",
            "*>;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/s1$c;->_heap:Ljava/lang/Object;

    instance-of v1, v0, Lkotlinx/coroutines/internal/d1;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/internal/d1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lkotlinx/coroutines/s1$c;->b:I

    return v0
.end method

.method public h(Lkotlinx/coroutines/s1$c;)I
    .locals 4
    .param p1    # Lkotlinx/coroutines/s1$c;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-wide v0, p0, Lkotlinx/coroutines/s1$c;->a:J

    iget-wide v2, p1, Lkotlinx/coroutines/s1$c;->a:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final i(JLkotlinx/coroutines/s1$d;Lkotlinx/coroutines/s1;)I
    .locals 7
    .param p3    # Lkotlinx/coroutines/s1$d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lkotlinx/coroutines/s1;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lkotlinx/coroutines/s1$c;->_heap:Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {}, Lkotlinx/coroutines/v1;->b()Lkotlinx/coroutines/internal/t0;

    .line 5
    .line 6
    .line 7
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    const/4 p1, 0x2

    .line 12
    return p1

    .line 13
    :cond_0
    :try_start_1
    monitor-enter p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    :try_start_2
    invoke-virtual {p3}, Lkotlinx/coroutines/internal/d1;->f()Lkotlinx/coroutines/internal/e1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lkotlinx/coroutines/s1$c;

    .line 19
    .line 20
    invoke-static {p4}, Lkotlinx/coroutines/s1;->S0(Lkotlinx/coroutines/s1;)Z

    .line 21
    .line 22
    .line 23
    move-result p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    if-eqz p4, :cond_1

    .line 25
    .line 26
    :try_start_3
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 27
    monitor-exit p0

    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_1
    const-wide/16 v1, 0x0

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    :try_start_4
    iput-wide p1, p3, Lkotlinx/coroutines/s1$d;->c:J

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    iget-wide v3, v0, Lkotlinx/coroutines/s1$c;->a:J

    .line 38
    .line 39
    sub-long v5, v3, p1

    .line 40
    .line 41
    cmp-long p4, v5, v1

    .line 42
    .line 43
    if-ltz p4, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    move-wide p1, v3

    .line 47
    :goto_0
    iget-wide v3, p3, Lkotlinx/coroutines/s1$d;->c:J

    .line 48
    .line 49
    sub-long v3, p1, v3

    .line 50
    .line 51
    cmp-long p4, v3, v1

    .line 52
    .line 53
    if-lez p4, :cond_4

    .line 54
    .line 55
    iput-wide p1, p3, Lkotlinx/coroutines/s1$d;->c:J

    .line 56
    .line 57
    :cond_4
    :goto_1
    iget-wide p1, p0, Lkotlinx/coroutines/s1$c;->a:J

    .line 58
    .line 59
    iget-wide v3, p3, Lkotlinx/coroutines/s1$d;->c:J

    .line 60
    .line 61
    sub-long/2addr p1, v3

    .line 62
    cmp-long p1, p1, v1

    .line 63
    .line 64
    if-gez p1, :cond_5

    .line 65
    .line 66
    iput-wide v3, p0, Lkotlinx/coroutines/s1$c;->a:J

    .line 67
    .line 68
    :cond_5
    invoke-virtual {p3, p0}, Lkotlinx/coroutines/internal/d1;->a(Lkotlinx/coroutines/internal/e1;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 69
    .line 70
    .line 71
    :try_start_5
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 72
    monitor-exit p0

    .line 73
    const/4 p1, 0x0

    .line 74
    return p1

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    :try_start_6
    monitor-exit p3

    .line 77
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 78
    :catchall_1
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

.method public final j(J)Z
    .locals 2

    iget-wide v0, p0, Lkotlinx/coroutines/s1$c;->a:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public setIndex(I)V
    .locals 0

    iput p1, p0, Lkotlinx/coroutines/s1$c;->b:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Delayed[nanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lkotlinx/coroutines/s1$c;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
