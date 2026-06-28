.class public final Lio/reactivex/rxjava3/internal/operators/parallel/m;
.super Lio/reactivex/rxjava3/parallel/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/operators/parallel/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/parallel/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Lio/reactivex/rxjava3/parallel/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:Lm3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/g<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final c:Lm3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/g<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final d:Lm3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field final e:Lm3/a;

.field final f:Lm3/a;

.field final g:Lm3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/g<",
            "-",
            "Lorg/reactivestreams/q;",
            ">;"
        }
    .end annotation
.end field

.field final h:Lm3/q;

.field final i:Lm3/a;


# direct methods
.method public constructor <init>(Lio/reactivex/rxjava3/parallel/b;Lm3/g;Lm3/g;Lm3/g;Lm3/a;Lm3/a;Lm3/g;Lm3/q;Lm3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/rxjava3/parallel/b<",
            "TT;>;",
            "Lm3/g<",
            "-TT;>;",
            "Lm3/g<",
            "-TT;>;",
            "Lm3/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Lm3/a;",
            "Lm3/a;",
            "Lm3/g<",
            "-",
            "Lorg/reactivestreams/q;",
            ">;",
            "Lm3/q;",
            "Lm3/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/parallel/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->a:Lio/reactivex/rxjava3/parallel/b;

    .line 5
    .line 6
    const-string p1, "onNext is null"

    .line 7
    .line 8
    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    check-cast p2, Lm3/g;

    .line 12
    .line 13
    iput-object p2, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->b:Lm3/g;

    .line 14
    .line 15
    const-string p1, "onAfterNext is null"

    .line 16
    .line 17
    invoke-static {p3, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    check-cast p3, Lm3/g;

    .line 21
    .line 22
    iput-object p3, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->c:Lm3/g;

    .line 23
    .line 24
    const-string p1, "onError is null"

    .line 25
    .line 26
    invoke-static {p4, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    check-cast p4, Lm3/g;

    .line 30
    .line 31
    iput-object p4, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->d:Lm3/g;

    .line 32
    .line 33
    const-string p1, "onComplete is null"

    .line 34
    .line 35
    invoke-static {p5, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    check-cast p5, Lm3/a;

    .line 39
    .line 40
    iput-object p5, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->e:Lm3/a;

    .line 41
    .line 42
    const-string p1, "onAfterTerminated is null"

    .line 43
    .line 44
    invoke-static {p6, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    check-cast p6, Lm3/a;

    .line 48
    .line 49
    iput-object p6, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->f:Lm3/a;

    .line 50
    .line 51
    const-string p1, "onSubscribe is null"

    .line 52
    .line 53
    invoke-static {p7, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    check-cast p7, Lm3/g;

    .line 57
    .line 58
    iput-object p7, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->g:Lm3/g;

    .line 59
    .line 60
    const-string p1, "onRequest is null"

    .line 61
    .line 62
    invoke-static {p8, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    check-cast p8, Lm3/q;

    .line 66
    .line 67
    iput-object p8, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->h:Lm3/q;

    .line 68
    .line 69
    const-string p1, "onCancel is null"

    .line 70
    .line 71
    invoke-static {p9, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    check-cast p9, Lm3/a;

    .line 75
    .line 76
    iput-object p9, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->i:Lm3/a;

    .line 77
    .line 78
    return-void
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
.end method


# virtual methods
.method public M()I
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->a:Lio/reactivex/rxjava3/parallel/b;

    invoke-virtual {v0}, Lio/reactivex/rxjava3/parallel/b;->M()I

    move-result v0

    return v0
.end method

.method public X([Lorg/reactivestreams/p;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/parallel/b;->b0([Lorg/reactivestreams/p;)Z

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
    array-length v0, p1

    .line 9
    new-array v1, v0, [Lorg/reactivestreams/p;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_1

    .line 13
    .line 14
    new-instance v3, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;

    .line 15
    .line 16
    aget-object v4, p1, v2

    .line 17
    .line 18
    invoke-direct {v3, v4, p0}, Lio/reactivex/rxjava3/internal/operators/parallel/m$a;-><init>(Lorg/reactivestreams/p;Lio/reactivex/rxjava3/internal/operators/parallel/m;)V

    .line 19
    .line 20
    .line 21
    aput-object v3, v1, v2

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object p1, p0, Lio/reactivex/rxjava3/internal/operators/parallel/m;->a:Lio/reactivex/rxjava3/parallel/b;

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lio/reactivex/rxjava3/parallel/b;->X([Lorg/reactivestreams/p;)V

    .line 29
    .line 30
    .line 31
    return-void
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
.end method
