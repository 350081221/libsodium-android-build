.class public final Landroidx/lifecycle/CoroutineLiveData;
.super Landroidx/lifecycle/MediatorLiveData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/MediatorLiveData<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002BJ\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017\u0012-\u0010\u001e\u001a)\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019\u00a2\u0006\u0002\u0008\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001e\u0010\u0008\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u000c\u001a\u00020\tH\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\r\u001a\u00020\tH\u0014J\u0008\u0010\u000e\u001a\u00020\tH\u0014R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Landroidx/lifecycle/CoroutineLiveData;",
        "T",
        "Landroidx/lifecycle/MediatorLiveData;",
        "Landroidx/lifecycle/LiveData;",
        "source",
        "Lkotlinx/coroutines/n1;",
        "emitSource$lifecycle_livedata_release",
        "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "emitSource",
        "Lkotlin/r2;",
        "clearSource$lifecycle_livedata_release",
        "(Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "clearSource",
        "onActive",
        "onInactive",
        "Landroidx/lifecycle/BlockRunner;",
        "blockRunner",
        "Landroidx/lifecycle/BlockRunner;",
        "Landroidx/lifecycle/EmittedSource;",
        "emittedSource",
        "Landroidx/lifecycle/EmittedSource;",
        "Lkotlin/coroutines/g;",
        "context",
        "",
        "timeoutInMs",
        "Lkotlin/Function2;",
        "Landroidx/lifecycle/LiveDataScope;",
        "Lkotlin/coroutines/d;",
        "",
        "Lkotlin/u;",
        "block",
        "<init>",
        "(Lkotlin/coroutines/g;JLv3/p;)V",
        "lifecycle-livedata_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private blockRunner:Landroidx/lifecycle/BlockRunner;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/BlockRunner<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation
.end field

.field private emittedSource:Landroidx/lifecycle/EmittedSource;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/coroutines/g;JLv3/p;)V
    .locals 7
    .param p1    # Lkotlin/coroutines/g;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/g;",
            "J",
            "Lv3/p<",
            "-",
            "Landroidx/lifecycle/LiveDataScope<",
            "TT;>;-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/MediatorLiveData;-><init>()V

    .line 4
    sget-object v0, Lkotlinx/coroutines/l2;->U:Lkotlinx/coroutines/l2$b;

    invoke-interface {p1, v0}, Lkotlin/coroutines/g;->get(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/l2;

    invoke-static {v0}, Lkotlinx/coroutines/m3;->a(Lkotlinx/coroutines/l2;)Lkotlinx/coroutines/b0;

    move-result-object v0

    .line 5
    invoke-static {}, Lkotlinx/coroutines/k1;->e()Lkotlinx/coroutines/x2;

    move-result-object v1

    invoke-virtual {v1}, Lkotlinx/coroutines/x2;->C0()Lkotlinx/coroutines/x2;

    move-result-object v1

    invoke-virtual {v1, p1}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;

    move-result-object p1

    invoke-interface {p1, v0}, Lkotlin/coroutines/g;->plus(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/t0;->a(Lkotlin/coroutines/g;)Lkotlinx/coroutines/s0;

    move-result-object v5

    .line 6
    new-instance p1, Landroidx/lifecycle/BlockRunner;

    new-instance v6, Landroidx/lifecycle/CoroutineLiveData$1;

    invoke-direct {v6, p0}, Landroidx/lifecycle/CoroutineLiveData$1;-><init>(Landroidx/lifecycle/CoroutineLiveData;)V

    move-object v0, p1

    move-object v1, p0

    move-object v2, p4

    move-wide v3, p2

    invoke-direct/range {v0 .. v6}, Landroidx/lifecycle/BlockRunner;-><init>(Landroidx/lifecycle/CoroutineLiveData;Lv3/p;JLkotlinx/coroutines/s0;Lv3/a;)V

    iput-object p1, p0, Landroidx/lifecycle/CoroutineLiveData;->blockRunner:Landroidx/lifecycle/BlockRunner;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/coroutines/g;JLv3/p;ILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 1
    sget-object p1, Lkotlin/coroutines/i;->INSTANCE:Lkotlin/coroutines/i;

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    const-wide/16 p2, 0x1388

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/lifecycle/CoroutineLiveData;-><init>(Lkotlin/coroutines/g;JLv3/p;)V

    return-void
.end method

.method public static final synthetic access$setBlockRunner$p(Landroidx/lifecycle/CoroutineLiveData;Landroidx/lifecycle/BlockRunner;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/CoroutineLiveData;->blockRunner:Landroidx/lifecycle/BlockRunner;

    return-void
.end method


# virtual methods
.method public final clearSource$lifecycle_livedata_release(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;-><init>(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroidx/lifecycle/CoroutineLiveData;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Landroidx/lifecycle/CoroutineLiveData;->emittedSource:Landroidx/lifecycle/EmittedSource;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iput-object p0, v0, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput v3, v0, Landroidx/lifecycle/CoroutineLiveData$clearSource$1;->label:I

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroidx/lifecycle/EmittedSource;->disposeNow(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    move-object v0, p0

    .line 73
    :goto_1
    const/4 p1, 0x0

    .line 74
    iput-object p1, v0, Landroidx/lifecycle/CoroutineLiveData;->emittedSource:Landroidx/lifecycle/EmittedSource;

    .line 75
    .line 76
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 77
    .line 78
    return-object p1
.end method

.method public final emitSource$lifecycle_livedata_release(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 5
    .param p1    # Landroidx/lifecycle/LiveData;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "TT;>;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlinx/coroutines/n1;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;-><init>(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Landroidx/lifecycle/CoroutineLiveData;

    .line 44
    .line 45
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-object p1, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Landroidx/lifecycle/LiveData;

    .line 60
    .line 61
    iget-object v2, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Landroidx/lifecycle/CoroutineLiveData;

    .line 64
    .line 65
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object p2, p1

    .line 69
    move-object p1, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object p0, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object p1, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->L$1:Ljava/lang/Object;

    .line 77
    .line 78
    iput v4, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->label:I

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Landroidx/lifecycle/CoroutineLiveData;->clearSource$lifecycle_livedata_release(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-ne p2, v1, :cond_4

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_4
    move-object p2, p1

    .line 88
    move-object p1, p0

    .line 89
    :goto_1
    iput-object p1, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    iput-object v2, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->L$1:Ljava/lang/Object;

    .line 93
    .line 94
    iput v3, v0, Landroidx/lifecycle/CoroutineLiveData$emitSource$1;->label:I

    .line 95
    .line 96
    invoke-static {p1, p2, v0}, Landroidx/lifecycle/CoroutineLiveDataKt;->addDisposableSource(Landroidx/lifecycle/MediatorLiveData;Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    if-ne p2, v1, :cond_5

    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_5
    :goto_2
    check-cast p2, Landroidx/lifecycle/EmittedSource;

    .line 104
    .line 105
    iput-object p2, p1, Landroidx/lifecycle/CoroutineLiveData;->emittedSource:Landroidx/lifecycle/EmittedSource;

    .line 106
    .line 107
    return-object p2
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

.method protected onActive()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/MediatorLiveData;->onActive()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/lifecycle/CoroutineLiveData;->blockRunner:Landroidx/lifecycle/BlockRunner;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/lifecycle/BlockRunner;->maybeRun()V

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
.end method

.method protected onInactive()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/MediatorLiveData;->onInactive()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/lifecycle/CoroutineLiveData;->blockRunner:Landroidx/lifecycle/BlockRunner;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/lifecycle/BlockRunner;->cancel()V

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
.end method
