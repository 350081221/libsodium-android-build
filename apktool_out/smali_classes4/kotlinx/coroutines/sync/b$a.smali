.class final Lkotlinx/coroutines/sync/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/p;
.implements Lkotlinx/coroutines/z3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/sync/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/p<",
        "Lkotlin/r2;",
        ">;",
        "Lkotlinx/coroutines/z3;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0082\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00020*\u0012\u0008\u0010.\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u00088\u00109J\u0015\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0001J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0097\u0001J\t\u0010\u000b\u001a\u00020\u0002H\u0097\u0001J2\u0010\u0011\u001a\u00020\u00022\'\u0010\u0010\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0008(\u0005\u0012\u0004\u0012\u00020\u00020\u000cj\u0002`\u000fH\u0096\u0001J!\u0010\u0014\u001a\u00020\u00022\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J&\u0010\u0018\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0016\u001a\u00020\u00022\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0008H\u0097\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u001a\u001a\u00020\u0004H\u0097\u0001J\u001c\u0010\u001d\u001a\u00020\u0002*\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0002H\u0097\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u0002*\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0004H\u0097\u0001J\u001d\u0010$\u001a\u00020\u00022\n\u0010!\u001a\u0006\u0012\u0002\u0008\u00030 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001JH\u0010&\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0016\u001a\u00020\u00022\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00082#\u0010%\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0008(\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008&\u0010\'J<\u0010(\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022#\u0010%\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0008(\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008(\u0010)R\u001a\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00020*8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010-R\u0014\u00102\u001a\u00020/8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u00080\u00101R\u0014\u00103\u001a\u00020\u00068\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u00083\u00104R\u0014\u00105\u001a\u00020\u00068\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u00085\u00104R\u0014\u00107\u001a\u00020\u00068\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u00086\u00104\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006:"
    }
    d2 = {
        "Lkotlinx/coroutines/sync/b$a;",
        "Lkotlinx/coroutines/p;",
        "Lkotlin/r2;",
        "Lkotlinx/coroutines/z3;",
        "",
        "cause",
        "",
        "a",
        "",
        "token",
        "K",
        "B",
        "Lkotlin/Function1;",
        "Lkotlin/v0;",
        "name",
        "Lkotlinx/coroutines/CompletionHandler;",
        "handler",
        "g",
        "Lkotlin/d1;",
        "result",
        "resumeWith",
        "(Ljava/lang/Object;)V",
        "value",
        "idempotent",
        "h",
        "(Lkotlin/r2;Ljava/lang/Object;)Ljava/lang/Object;",
        "exception",
        "i",
        "Lkotlinx/coroutines/n0;",
        "f",
        "(Lkotlinx/coroutines/n0;Lkotlin/r2;)V",
        "k",
        "Lkotlinx/coroutines/internal/q0;",
        "segment",
        "",
        "index",
        "b",
        "onCancellation",
        "j",
        "(Lkotlin/r2;Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;",
        "c",
        "(Lkotlin/r2;Lv3/l;)V",
        "Lkotlinx/coroutines/q;",
        "Lkotlinx/coroutines/q;",
        "cont",
        "Ljava/lang/Object;",
        "owner",
        "Lkotlin/coroutines/g;",
        "getContext",
        "()Lkotlin/coroutines/g;",
        "context",
        "isActive",
        "()Z",
        "isCancelled",
        "d",
        "isCompleted",
        "<init>",
        "(Lkotlinx/coroutines/sync/b;Lkotlinx/coroutines/q;Ljava/lang/Object;)V",
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
        "SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlinx/coroutines/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/q<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation build Lp4/m;
    .end annotation

    .annotation build Lu3/e;
    .end annotation
.end field

.field final synthetic c:Lkotlinx/coroutines/sync/b;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/sync/b;Lkotlinx/coroutines/q;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lkotlinx/coroutines/sync/b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlinx/coroutines/q;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/q<",
            "-",
            "Lkotlin/r2;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/sync/b$a;->c:Lkotlinx/coroutines/sync/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    .line 7
    .line 8
    iput-object p3, p0, Lkotlinx/coroutines/sync/b$a;->b:Ljava/lang/Object;

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


# virtual methods
.method public B()V
    .locals 1
    .annotation build Lkotlinx/coroutines/g2;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0}, Lkotlinx/coroutines/q;->B()V

    return-void
.end method

.method public bridge synthetic C(Ljava/lang/Object;Lv3/l;)V
    .locals 0

    check-cast p1, Lkotlin/r2;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/sync/b$a;->c(Lkotlin/r2;Lv3/l;)V

    return-void
.end method

.method public K(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlinx/coroutines/g2;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/q;->K(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/q;->a(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public b(Lkotlinx/coroutines/internal/q0;I)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/internal/q0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/internal/q0<",
            "*>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/q;->b(Lkotlinx/coroutines/internal/q0;I)V

    return-void
.end method

.method public c(Lkotlin/r2;Lv3/l;)V
    .locals 2
    .param p1    # Lkotlin/r2;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/r2;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lkotlinx/coroutines/sync/b;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->c:Lkotlinx/coroutines/sync/b;

    .line 6
    .line 7
    iget-object v1, p0, Lkotlinx/coroutines/sync/b$a;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    .line 13
    .line 14
    new-instance v0, Lkotlinx/coroutines/sync/b$a$a;

    .line 15
    .line 16
    iget-object v1, p0, Lkotlinx/coroutines/sync/b$a;->c:Lkotlinx/coroutines/sync/b;

    .line 17
    .line 18
    invoke-direct {v0, v1, p0}, Lkotlinx/coroutines/sync/b$a$a;-><init>(Lkotlinx/coroutines/sync/b;Lkotlinx/coroutines/sync/b$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1, v0}, Lkotlinx/coroutines/q;->C(Ljava/lang/Object;Lv3/l;)V

    .line 22
    .line 23
    .line 24
    return-void
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
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0}, Lkotlinx/coroutines/q;->d()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/r2;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/sync/b$a;->h(Lkotlin/r2;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Lkotlinx/coroutines/n0;Lkotlin/r2;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/n0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/r2;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlinx/coroutines/a2;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/q;->z(Lkotlinx/coroutines/n0;Ljava/lang/Object;)V

    return-void
.end method

.method public g(Lv3/l;)V
    .locals 1
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/q;->g(Lv3/l;)V

    return-void
.end method

.method public getContext()Lkotlin/coroutines/g;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0}, Lkotlinx/coroutines/q;->getContext()Lkotlin/coroutines/g;

    move-result-object v0

    return-object v0
.end method

.method public h(Lkotlin/r2;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/r2;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lkotlinx/coroutines/g2;
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/q;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlinx/coroutines/g2;
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/q;->i(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isActive()Z
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0}, Lkotlinx/coroutines/q;->isActive()Z

    move-result v0

    return v0
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0}, Lkotlinx/coroutines/q;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public j(Lkotlin/r2;Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlin/r2;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/r2;",
            "Ljava/lang/Object;",
            "Lv3/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object p3, p0, Lkotlinx/coroutines/sync/b$a;->c:Lkotlinx/coroutines/sync/b;

    .line 2
    .line 3
    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    .line 4
    .line 5
    new-instance v1, Lkotlinx/coroutines/sync/b$a$b;

    .line 6
    .line 7
    invoke-direct {v1, p3, p0}, Lkotlinx/coroutines/sync/b$a$b;-><init>(Lkotlinx/coroutines/sync/b;Lkotlinx/coroutines/sync/b$a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, v1}, Lkotlinx/coroutines/q;->u(Ljava/lang/Object;Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lkotlinx/coroutines/sync/b;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-object p3, p0, Lkotlinx/coroutines/sync/b$a;->c:Lkotlinx/coroutines/sync/b;

    .line 21
    .line 22
    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->b:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
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

.method public k(Lkotlinx/coroutines/n0;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Lkotlinx/coroutines/n0;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lkotlinx/coroutines/a2;
    .end annotation

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0, p1, p2}, Lkotlinx/coroutines/q;->k(Lkotlinx/coroutines/n0;Ljava/lang/Throwable;)V

    return-void
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Lkotlinx/coroutines/sync/b$a;->a:Lkotlinx/coroutines/q;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/q;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/r2;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/sync/b$a;->j(Lkotlin/r2;Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic z(Lkotlinx/coroutines/n0;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lkotlin/r2;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/sync/b$a;->f(Lkotlinx/coroutines/n0;Lkotlin/r2;)V

    return-void
.end method
