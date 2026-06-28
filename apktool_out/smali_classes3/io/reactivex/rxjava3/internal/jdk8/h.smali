.class public final Lio/reactivex/rxjava3/internal/jdk8/h;
.super Lio/reactivex/rxjava3/core/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/rxjava3/internal/jdk8/h$b;,
        Lio/reactivex/rxjava3/internal/jdk8/h$c;,
        Lio/reactivex/rxjava3/internal/jdk8/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lio/reactivex/rxjava3/core/o<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final b:Ljava/util/stream/Stream;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/stream/Stream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/stream/Stream<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lio/reactivex/rxjava3/core/o;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/rxjava3/internal/jdk8/h;->b:Ljava/util/stream/Stream;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
.end method

.method static n9(Ljava/lang/AutoCloseable;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catchall_0
    move-exception p0

    .line 6
    invoke-static {p0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lio/reactivex/rxjava3/plugins/a;->Y(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    :goto_0
    return-void
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
.end method

.method public static o9(Lorg/reactivestreams/p;Ljava/util/stream/Stream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/reactivestreams/p<",
            "-TT;>;",
            "Ljava/util/stream/Stream<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/stream/BaseStream;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lio/reactivex/rxjava3/internal/subscriptions/g;->complete(Lorg/reactivestreams/p;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/jdk8/h;->n9(Ljava/lang/AutoCloseable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    instance-of v1, p0, Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    new-instance v1, Lio/reactivex/rxjava3/internal/jdk8/h$b;

    .line 23
    .line 24
    move-object v2, p0

    .line 25
    check-cast v2, Lio/reactivex/rxjava3/internal/fuseable/c;

    .line 26
    .line 27
    invoke-direct {v1, v2, v0, p1}, Lio/reactivex/rxjava3/internal/jdk8/h$b;-><init>(Lio/reactivex/rxjava3/internal/fuseable/c;Ljava/util/Iterator;Ljava/lang/AutoCloseable;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v1}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance v1, Lio/reactivex/rxjava3/internal/jdk8/h$c;

    .line 35
    .line 36
    invoke-direct {v1, p0, v0, p1}, Lio/reactivex/rxjava3/internal/jdk8/h$c;-><init>(Lorg/reactivestreams/p;Ljava/util/Iterator;Ljava/lang/AutoCloseable;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, v1}, Lorg/reactivestreams/p;->onSubscribe(Lorg/reactivestreams/q;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    invoke-static {v0}, Lio/reactivex/rxjava3/exceptions/b;->b(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0, p0}, Lio/reactivex/rxjava3/internal/subscriptions/g;->error(Ljava/lang/Throwable;Lorg/reactivestreams/p;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lio/reactivex/rxjava3/internal/jdk8/h;->n9(Ljava/lang/AutoCloseable;)V

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


# virtual methods
.method protected O6(Lorg/reactivestreams/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/reactivestreams/p<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/reactivex/rxjava3/internal/jdk8/h;->b:Ljava/util/stream/Stream;

    invoke-static {p1, v0}, Lio/reactivex/rxjava3/internal/jdk8/h;->o9(Lorg/reactivestreams/p;Ljava/util/stream/Stream;)V

    return-void
.end method
