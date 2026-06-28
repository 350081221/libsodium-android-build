.class public final Lkotlinx/coroutines/scheduling/a$c;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/scheduling/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0080\u0004\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008H\u0010IB\u0011\u0008\u0016\u0012\u0006\u0010&\u001a\u00020\u000b\u00a2\u0006\u0004\u0008H\u0010JJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002J\u0008\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0008\u0010\u000f\u001a\u00020\u0004H\u0002J\u0008\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0008H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0008H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0008H\u0002J\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00082\n\u0010\u0019\u001a\u00060\u000bj\u0002`\u0018H\u0002J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bJ\u0008\u0010\u001e\u001a\u00020\u0004H\u0016J\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bJ\u0010\u0010%\u001a\u0004\u0018\u00010\u00082\u0006\u0010$\u001a\u00020\u0002R*\u0010\'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u0014\u00100\u001a\u00020-8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0008018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u00102R\u0016\u00105\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u00104R\u0016\u00107\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u00106R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>R\u0016\u0010?\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u00106R\u0016\u0010@\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010(R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010AR\u0012\u0010E\u001a\u00020B8\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010DR\u0008\u0010G\u001a\u00020F8\u0006\u00a8\u0006K"
    }
    d2 = {
        "Lkotlinx/coroutines/scheduling/a$c;",
        "Ljava/lang/Thread;",
        "",
        "x",
        "Lkotlin/r2;",
        "u",
        "y",
        "o",
        "Lkotlinx/coroutines/scheduling/k;",
        "task",
        "d",
        "",
        "taskMode",
        "c",
        "b",
        "r",
        "B",
        "mode",
        "n",
        "f",
        "g",
        "scanLocalQueue",
        "e",
        "s",
        "Lkotlinx/coroutines/scheduling/StealingMode;",
        "stealingMode",
        "A",
        "Lkotlinx/coroutines/scheduling/a$d;",
        "newState",
        "z",
        "run",
        "",
        "t",
        "p",
        "upperBound",
        "q",
        "mayHaveLocalTasks",
        "h",
        "index",
        "indexInArray",
        "I",
        "i",
        "()I",
        "v",
        "(I)V",
        "Lkotlinx/coroutines/scheduling/q;",
        "a",
        "Lkotlinx/coroutines/scheduling/q;",
        "localQueue",
        "Lkotlin/jvm/internal/k1$h;",
        "Lkotlin/jvm/internal/k1$h;",
        "stolenTask",
        "Lkotlinx/coroutines/scheduling/a$d;",
        "state",
        "J",
        "terminationDeadline",
        "",
        "nextParkedWorker",
        "Ljava/lang/Object;",
        "j",
        "()Ljava/lang/Object;",
        "w",
        "(Ljava/lang/Object;)V",
        "minDelayUntilStealableTaskNs",
        "rngState",
        "Z",
        "Lkotlinx/coroutines/scheduling/a;",
        "k",
        "()Lkotlinx/coroutines/scheduling/a;",
        "scheduler",
        "Lkotlinx/atomicfu/AtomicInt;",
        "workerCtl",
        "<init>",
        "(Lkotlinx/coroutines/scheduling/a;)V",
        "(Lkotlinx/coroutines/scheduling/a;I)V",
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
        "SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1033:1\n298#2:1034\n285#2:1035\n299#2,4:1036\n304#2:1040\n294#2,2:1041\n294#2,2:1045\n280#2:1052\n289#2:1053\n283#2:1054\n280#2:1055\n1#3:1043\n87#4:1044\n28#5,4:1047\n20#6:1051\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n665#1:1034\n665#1:1035\n665#1:1036,4\n679#1:1040\n753#1:1041,2\n807#1:1045,2\n855#1:1052\n881#1:1053\n881#1:1054\n963#1:1055\n790#1:1044\n851#1:1047,4\n851#1:1051\n*E\n"
    }
.end annotation


# static fields
.field private static final i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field public final a:Lkotlinx/coroutines/scheduling/q;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field private final b:Lkotlin/jvm/internal/k1$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/k1$h<",
            "Lkotlinx/coroutines/scheduling/k;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field public c:Lkotlinx/coroutines/scheduling/a$d;
    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field private d:J

.field private e:J

.field private f:I

.field public g:Z
    .annotation build Lu3/e;
    .end annotation
.end field

.field final synthetic h:Lkotlinx/coroutines/scheduling/a;

.field private volatile indexInArray:I

.field private volatile nextParkedWorker:Ljava/lang/Object;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private volatile workerCtl:I
    .annotation runtime Lu3/w;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lkotlinx/coroutines/scheduling/a$c;

    const-string v1, "workerCtl"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lkotlinx/coroutines/scheduling/a$c;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method private constructor <init>(Lkotlinx/coroutines/scheduling/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 3
    new-instance p1, Lkotlinx/coroutines/scheduling/q;

    invoke-direct {p1}, Lkotlinx/coroutines/scheduling/q;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->a:Lkotlinx/coroutines/scheduling/q;

    .line 4
    new-instance p1, Lkotlin/jvm/internal/k1$h;

    invoke-direct {p1}, Lkotlin/jvm/internal/k1$h;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->b:Lkotlin/jvm/internal/k1$h;

    .line 5
    sget-object p1, Lkotlinx/coroutines/scheduling/a$d;->DORMANT:Lkotlinx/coroutines/scheduling/a$d;

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 6
    sget-object p1, Lkotlinx/coroutines/scheduling/a;->l:Lkotlinx/coroutines/internal/t0;

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->nextParkedWorker:Ljava/lang/Object;

    .line 7
    sget-object p1, Lkotlin/random/f;->Default:Lkotlin/random/f$a;

    invoke-virtual {p1}, Lkotlin/random/f$a;->nextInt()I

    move-result p1

    iput p1, p0, Lkotlinx/coroutines/scheduling/a$c;->f:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/scheduling/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/a$c;-><init>(Lkotlinx/coroutines/scheduling/a;)V

    .line 9
    invoke-virtual {p0, p2}, Lkotlinx/coroutines/scheduling/a$c;->v(I)V

    return-void
.end method

.method private final A(I)Lkotlinx/coroutines/scheduling/k;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 4
    .line 5
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const-wide/32 v3, 0x1fffff

    .line 14
    .line 15
    .line 16
    and-long/2addr v1, v3

    .line 17
    long-to-int v1, v1

    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-ge v1, v2, :cond_0

    .line 21
    .line 22
    return-object v3

    .line 23
    :cond_0
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/scheduling/a$c;->q(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget-object v4, v0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 28
    .line 29
    const-wide v5, 0x7fffffffffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    move-wide v8, v5

    .line 36
    :goto_0
    const-wide/16 v10, 0x0

    .line 37
    .line 38
    if-ge v7, v1, :cond_5

    .line 39
    .line 40
    const/4 v12, 0x1

    .line 41
    add-int/2addr v2, v12

    .line 42
    if-le v2, v1, :cond_1

    .line 43
    .line 44
    move v2, v12

    .line 45
    :cond_1
    iget-object v12, v4, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 46
    .line 47
    invoke-virtual {v12, v2}, Lkotlinx/coroutines/internal/o0;->b(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    check-cast v12, Lkotlinx/coroutines/scheduling/a$c;

    .line 52
    .line 53
    if-eqz v12, :cond_3

    .line 54
    .line 55
    if-eq v12, v0, :cond_3

    .line 56
    .line 57
    iget-object v12, v12, Lkotlinx/coroutines/scheduling/a$c;->a:Lkotlinx/coroutines/scheduling/q;

    .line 58
    .line 59
    iget-object v13, v0, Lkotlinx/coroutines/scheduling/a$c;->b:Lkotlin/jvm/internal/k1$h;

    .line 60
    .line 61
    move/from16 v14, p1

    .line 62
    .line 63
    invoke-virtual {v12, v14, v13}, Lkotlinx/coroutines/scheduling/q;->p(ILkotlin/jvm/internal/k1$h;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v12

    .line 67
    const-wide/16 v15, -0x1

    .line 68
    .line 69
    cmp-long v15, v12, v15

    .line 70
    .line 71
    if-nez v15, :cond_2

    .line 72
    .line 73
    iget-object v1, v0, Lkotlinx/coroutines/scheduling/a$c;->b:Lkotlin/jvm/internal/k1$h;

    .line 74
    .line 75
    iget-object v2, v1, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Lkotlinx/coroutines/scheduling/k;

    .line 78
    .line 79
    iput-object v3, v1, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_2
    cmp-long v10, v12, v10

    .line 83
    .line 84
    if-lez v10, :cond_4

    .line 85
    .line 86
    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 87
    .line 88
    .line 89
    move-result-wide v8

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move/from16 v14, p1

    .line 92
    .line 93
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    cmp-long v1, v8, v5

    .line 97
    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    move-wide v8, v10

    .line 102
    :goto_2
    iput-wide v8, v0, Lkotlinx/coroutines/scheduling/a$c;->e:J

    .line 103
    .line 104
    return-object v3
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

.method private final B()V
    .locals 8

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 2
    .line 3
    iget-object v1, v0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/a;->isTerminated()Z

    .line 7
    .line 8
    .line 9
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide/32 v4, 0x1fffff

    .line 23
    .line 24
    .line 25
    and-long/2addr v2, v4

    .line 26
    long-to-int v2, v2

    .line 27
    iget v3, v0, Lkotlinx/coroutines/scheduling/a;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    if-gt v2, v3, :cond_1

    .line 30
    .line 31
    monitor-exit v1

    .line 32
    return-void

    .line 33
    :cond_1
    :try_start_2
    sget-object v2, Lkotlinx/coroutines/scheduling/a$c;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 34
    .line 35
    const/4 v3, -0x1

    .line 36
    const/4 v6, 0x1

    .line 37
    invoke-virtual {v2, p0, v3, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 38
    .line 39
    .line 40
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    monitor-exit v1

    .line 44
    return-void

    .line 45
    :cond_2
    :try_start_3
    iget v2, p0, Lkotlinx/coroutines/scheduling/a$c;->indexInArray:I

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-virtual {p0, v3}, Lkotlinx/coroutines/scheduling/a$c;->v(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0, v2, v3}, Lkotlinx/coroutines/scheduling/a;->f0(Lkotlinx/coroutines/scheduling/a$c;II)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndDecrement(Ljava/lang/Object;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    and-long v3, v6, v4

    .line 63
    .line 64
    long-to-int v3, v3

    .line 65
    if-eq v3, v2, :cond_3

    .line 66
    .line 67
    iget-object v4, v0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 68
    .line 69
    invoke-virtual {v4, v3}, Lkotlinx/coroutines/internal/o0;->b(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    check-cast v4, Lkotlinx/coroutines/scheduling/a$c;

    .line 77
    .line 78
    iget-object v5, v0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 79
    .line 80
    invoke-virtual {v5, v2, v4}, Lkotlinx/coroutines/internal/o0;->c(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v2}, Lkotlinx/coroutines/scheduling/a$c;->v(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v4, v3, v2}, Lkotlinx/coroutines/scheduling/a;->f0(Lkotlinx/coroutines/scheduling/a$c;II)V

    .line 87
    .line 88
    .line 89
    :cond_3
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->g:Lkotlinx/coroutines/internal/o0;

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    invoke-virtual {v0, v3, v2}, Lkotlinx/coroutines/internal/o0;->c(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 96
    .line 97
    monitor-exit v1

    .line 98
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->TERMINATED:Lkotlinx/coroutines/scheduling/a$d;

    .line 99
    .line 100
    iput-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 101
    .line 102
    return-void

    .line 103
    :catchall_0
    move-exception v0

    .line 104
    monitor-exit v1

    .line 105
    throw v0
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
.end method

.method public static final synthetic a(Lkotlinx/coroutines/scheduling/a$c;)Lkotlinx/coroutines/scheduling/a;
    .locals 0

    iget-object p0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    return-object p0
.end method

.method private final b(I)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 5
    .line 6
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-wide/32 v1, -0x200000

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 17
    .line 18
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->TERMINATED:Lkotlinx/coroutines/scheduling/a$d;

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    sget-object p1, Lkotlinx/coroutines/scheduling/a$d;->DORMANT:Lkotlinx/coroutines/scheduling/a$d;

    .line 23
    .line 24
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 25
    .line 26
    :cond_1
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
.end method

.method private final c(I)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget-object p1, Lkotlinx/coroutines/scheduling/a$d;->BLOCKING:Lkotlinx/coroutines/scheduling/a$d;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/scheduling/a$c;->z(Lkotlinx/coroutines/scheduling/a$d;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 13
    .line 14
    invoke-virtual {p1}, Lkotlinx/coroutines/scheduling/a;->A0()V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
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

.method private final d(Lkotlinx/coroutines/scheduling/k;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lkotlinx/coroutines/scheduling/k;->b:Lkotlinx/coroutines/scheduling/l;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlinx/coroutines/scheduling/l;->i0()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-direct {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->n(I)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->c(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lkotlinx/coroutines/scheduling/a;->p0(Lkotlinx/coroutines/scheduling/k;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->b(I)V

    .line 19
    .line 20
    .line 21
    return-void
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

.method private final e(Z)Lkotlinx/coroutines/scheduling/k;
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 4
    .line 5
    iget p1, p1, Lkotlinx/coroutines/scheduling/a;->a:I

    .line 6
    .line 7
    mul-int/lit8 p1, p1, 0x2

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lkotlinx/coroutines/scheduling/a$c;->q(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->s()Lkotlinx/coroutines/scheduling/k;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->a:Lkotlinx/coroutines/scheduling/q;

    .line 28
    .line 29
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/q;->h()Lkotlinx/coroutines/scheduling/k;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    if-nez p1, :cond_4

    .line 37
    .line 38
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->s()Lkotlinx/coroutines/scheduling/k;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_3
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->s()Lkotlinx/coroutines/scheduling/k;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_4
    const/4 p1, 0x3

    .line 53
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/a$c;->A(I)Lkotlinx/coroutines/scheduling/k;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
    .line 58
.end method

.method private final f()Lkotlinx/coroutines/scheduling/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->a:Lkotlinx/coroutines/scheduling/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/q;->i()Lkotlinx/coroutines/scheduling/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 10
    .line 11
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->f:Lkotlinx/coroutines/scheduling/f;

    .line 12
    .line 13
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a0;->h()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lkotlinx/coroutines/scheduling/k;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->A(I)Lkotlinx/coroutines/scheduling/k;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    return-object v0
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
.end method

.method private final g()Lkotlinx/coroutines/scheduling/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->a:Lkotlinx/coroutines/scheduling/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/q;->k()Lkotlinx/coroutines/scheduling/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 10
    .line 11
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->f:Lkotlinx/coroutines/scheduling/f;

    .line 12
    .line 13
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a0;->h()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lkotlinx/coroutines/scheduling/k;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    invoke-direct {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->A(I)Lkotlinx/coroutines/scheduling/k;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    return-object v0
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
.end method

.method public static final m()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    sget-object v0, Lkotlinx/coroutines/scheduling/a$c;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method

.method private final n(I)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lkotlinx/coroutines/scheduling/a$c;->d:J

    .line 4
    .line 5
    iget-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 6
    .line 7
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->PARKING:Lkotlinx/coroutines/scheduling/a$d;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    sget-object p1, Lkotlinx/coroutines/scheduling/a$d;->BLOCKING:Lkotlinx/coroutines/scheduling/a$d;

    .line 12
    .line 13
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

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

.method private final o()Z
    .locals 2

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->nextParkedWorker:Ljava/lang/Object;

    sget-object v1, Lkotlinx/coroutines/scheduling/a;->l:Lkotlinx/coroutines/internal/t0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final r()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lkotlinx/coroutines/scheduling/a$c;->d:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object v4, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 14
    .line 15
    iget-wide v4, v4, Lkotlinx/coroutines/scheduling/a;->c:J

    .line 16
    .line 17
    add-long/2addr v0, v4

    .line 18
    iput-wide v0, p0, Lkotlinx/coroutines/scheduling/a$c;->d:J

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 21
    .line 22
    iget-wide v0, v0, Lkotlinx/coroutines/scheduling/a;->c:J

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    iget-wide v4, p0, Lkotlinx/coroutines/scheduling/a$c;->d:J

    .line 32
    .line 33
    sub-long/2addr v0, v4

    .line 34
    cmp-long v0, v0, v2

    .line 35
    .line 36
    if-ltz v0, :cond_1

    .line 37
    .line 38
    iput-wide v2, p0, Lkotlinx/coroutines/scheduling/a$c;->d:J

    .line 39
    .line 40
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->B()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
    .line 44
    .line 45
.end method

.method private final s()Lkotlinx/coroutines/scheduling/k;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->q(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 9
    .line 10
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->e:Lkotlinx/coroutines/scheduling/f;

    .line 11
    .line 12
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a0;->h()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lkotlinx/coroutines/scheduling/k;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 22
    .line 23
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->f:Lkotlinx/coroutines/scheduling/f;

    .line 24
    .line 25
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a0;->h()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lkotlinx/coroutines/scheduling/k;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 33
    .line 34
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->f:Lkotlinx/coroutines/scheduling/f;

    .line 35
    .line 36
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a0;->h()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lkotlinx/coroutines/scheduling/k;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 46
    .line 47
    iget-object v0, v0, Lkotlinx/coroutines/scheduling/a;->e:Lkotlinx/coroutines/scheduling/f;

    .line 48
    .line 49
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a0;->h()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lkotlinx/coroutines/scheduling/k;

    .line 54
    .line 55
    return-object v0
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
.end method

.method private final u()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    move v1, v0

    .line 3
    :goto_1
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 4
    .line 5
    invoke-virtual {v2}, Lkotlinx/coroutines/scheduling/a;->isTerminated()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_3

    .line 10
    .line 11
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 12
    .line 13
    sget-object v3, Lkotlinx/coroutines/scheduling/a$d;->TERMINATED:Lkotlinx/coroutines/scheduling/a$d;

    .line 14
    .line 15
    if-eq v2, v3, :cond_3

    .line 16
    .line 17
    iget-boolean v2, p0, Lkotlinx/coroutines/scheduling/a$c;->g:Z

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lkotlinx/coroutines/scheduling/a$c;->h(Z)Lkotlinx/coroutines/scheduling/k;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iput-wide v3, p0, Lkotlinx/coroutines/scheduling/a$c;->e:J

    .line 28
    .line 29
    invoke-direct {p0, v2}, Lkotlinx/coroutines/scheduling/a$c;->d(Lkotlinx/coroutines/scheduling/k;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iput-boolean v0, p0, Lkotlinx/coroutines/scheduling/a$c;->g:Z

    .line 34
    .line 35
    iget-wide v5, p0, Lkotlinx/coroutines/scheduling/a$c;->e:J

    .line 36
    .line 37
    cmp-long v2, v5, v3

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->PARKING:Lkotlinx/coroutines/scheduling/a$d;

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lkotlinx/coroutines/scheduling/a$c;->z(Lkotlinx/coroutines/scheduling/a$d;)Z

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 51
    .line 52
    .line 53
    iget-wide v1, p0, Lkotlinx/coroutines/scheduling/a$c;->e:J

    .line 54
    .line 55
    invoke-static {v1, v2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(J)V

    .line 56
    .line 57
    .line 58
    iput-wide v3, p0, Lkotlinx/coroutines/scheduling/a$c;->e:J

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->y()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->TERMINATED:Lkotlinx/coroutines/scheduling/a$d;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->z(Lkotlinx/coroutines/scheduling/a$d;)Z

    .line 68
    .line 69
    .line 70
    return-void
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
.end method

.method private final x()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->CPU_ACQUIRED:Lkotlinx/coroutines/scheduling/a$d;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 10
    .line 11
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    const-wide v3, 0x7ffffc0000000000L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v3, v5

    .line 25
    const/16 v7, 0x2a

    .line 26
    .line 27
    shr-long/2addr v3, v7

    .line 28
    long-to-int v3, v3

    .line 29
    const/4 v9, 0x0

    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    move v0, v9

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-wide v3, 0x40000000000L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    sub-long v7, v5, v3

    .line 40
    .line 41
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    move-object v4, v0

    .line 46
    invoke-virtual/range {v3 .. v8}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    move v0, v2

    .line 53
    :goto_0
    if-eqz v0, :cond_3

    .line 54
    .line 55
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->CPU_ACQUIRED:Lkotlinx/coroutines/scheduling/a$d;

    .line 56
    .line 57
    iput-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move v2, v9

    .line 61
    :goto_1
    return v2
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
.end method

.method private final y()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/scheduling/a;->b0(Lkotlinx/coroutines/scheduling/a$c;)Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object v0, Lkotlinx/coroutines/scheduling/a$c;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->o()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    sget-object v0, Lkotlinx/coroutines/scheduling/a$c;->i:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-ne v0, v1, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 34
    .line 35
    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/a;->isTerminated()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 42
    .line 43
    sget-object v2, Lkotlinx/coroutines/scheduling/a$d;->TERMINATED:Lkotlinx/coroutines/scheduling/a$d;

    .line 44
    .line 45
    if-ne v0, v2, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    sget-object v0, Lkotlinx/coroutines/scheduling/a$d;->PARKING:Lkotlinx/coroutines/scheduling/a$d;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lkotlinx/coroutines/scheduling/a$c;->z(Lkotlinx/coroutines/scheduling/a$d;)Z

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->r()V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    :goto_1
    return-void
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
.end method


# virtual methods
.method public final h(Z)Lkotlinx/coroutines/scheduling/k;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->x()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lkotlinx/coroutines/scheduling/a$c;->e(Z)Lkotlinx/coroutines/scheduling/k;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->f()Lkotlinx/coroutines/scheduling/k;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public final i()I
    .locals 1

    iget v0, p0, Lkotlinx/coroutines/scheduling/a$c;->indexInArray:I

    return v0
.end method

.method public final j()Ljava/lang/Object;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->nextParkedWorker:Ljava/lang/Object;

    return-object v0
.end method

.method public final k()Lkotlinx/coroutines/scheduling/a;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlinx/coroutines/scheduling/a$c;->a(Lkotlinx/coroutines/scheduling/a$c;)Lkotlinx/coroutines/scheduling/a;

    move-result-object v0

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lkotlinx/coroutines/scheduling/a$c;->workerCtl:I

    return v0
.end method

.method public final p()Z
    .locals 2

    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->BLOCKING:Lkotlinx/coroutines/scheduling/a$d;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final q(I)I
    .locals 3

    .line 1
    iget v0, p0, Lkotlinx/coroutines/scheduling/a$c;->f:I

    .line 2
    .line 3
    shl-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    xor-int/2addr v0, v1

    .line 6
    shr-int/lit8 v1, v0, 0x11

    .line 7
    .line 8
    xor-int/2addr v0, v1

    .line 9
    shl-int/lit8 v1, v0, 0x5

    .line 10
    .line 11
    xor-int/2addr v0, v1

    .line 12
    iput v0, p0, Lkotlinx/coroutines/scheduling/a$c;->f:I

    .line 13
    .line 14
    add-int/lit8 v1, p1, -0x1

    .line 15
    .line 16
    and-int v2, v1, p1

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    and-int p1, v0, v1

    .line 21
    .line 22
    return p1

    .line 23
    :cond_0
    const v1, 0x7fffffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v0, v1

    .line 27
    rem-int/2addr v0, p1

    .line 28
    return v0
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

.method public run()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->u()V

    return-void
.end method

.method public final t()J
    .locals 6

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->CPU_ACQUIRED:Lkotlinx/coroutines/scheduling/a$d;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->g()Lkotlinx/coroutines/scheduling/k;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-direct {p0}, Lkotlinx/coroutines/scheduling/a$c;->f()Lkotlinx/coroutines/scheduling/k;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_1
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    if-nez v1, :cond_3

    .line 24
    .line 25
    iget-wide v0, p0, Lkotlinx/coroutines/scheduling/a$c;->e:J

    .line 26
    .line 27
    cmp-long v2, v0, v2

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const-wide/16 v0, -0x1

    .line 32
    .line 33
    :cond_2
    return-wide v0

    .line 34
    :cond_3
    iget-object v4, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 35
    .line 36
    invoke-virtual {v4, v1}, Lkotlinx/coroutines/scheduling/a;->p0(Lkotlinx/coroutines/scheduling/k;)V

    .line 37
    .line 38
    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 42
    .line 43
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-wide/32 v4, -0x200000

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 51
    .line 52
    .line 53
    :cond_4
    return-wide v2
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
.end method

.method public final v(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 7
    .line 8
    iget-object v1, v1, Lkotlinx/coroutines/scheduling/a;->d:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "-worker-"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string v1, "TERMINATED"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput p1, p0, Lkotlinx/coroutines/scheduling/a$c;->indexInArray:I

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
.end method

.method public final w(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->nextParkedWorker:Ljava/lang/Object;

    return-void
.end method

.method public final z(Lkotlinx/coroutines/scheduling/a$d;)Z
    .locals 6
    .param p1    # Lkotlinx/coroutines/scheduling/a$d;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 2
    .line 3
    sget-object v1, Lkotlinx/coroutines/scheduling/a$d;->CPU_ACQUIRED:Lkotlinx/coroutines/scheduling/a$d;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Lkotlinx/coroutines/scheduling/a$c;->h:Lkotlinx/coroutines/scheduling/a;

    .line 13
    .line 14
    invoke-static {}, Lkotlinx/coroutines/scheduling/a;->a()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-wide v4, 0x40000000000L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v2, v4, v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->addAndGet(Ljava/lang/Object;J)J

    .line 24
    .line 25
    .line 26
    :cond_1
    if-eq v0, p1, :cond_2

    .line 27
    .line 28
    iput-object p1, p0, Lkotlinx/coroutines/scheduling/a$c;->c:Lkotlinx/coroutines/scheduling/a$d;

    .line 29
    .line 30
    :cond_2
    return v1
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
