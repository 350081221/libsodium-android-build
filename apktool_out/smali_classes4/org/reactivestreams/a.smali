.class public final Lorg/reactivestreams/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/reactivestreams/a$a;,
        Lorg/reactivestreams/a$e;,
        Lorg/reactivestreams/a$b;,
        Lorg/reactivestreams/a$f;,
        Lorg/reactivestreams/a$g;,
        Lorg/reactivestreams/a$c;,
        Lorg/reactivestreams/a$h;,
        Lorg/reactivestreams/a$d;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string v1, "No instances!"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw v0
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
.end method

.method public static a(Lorg/reactivestreams/n;)Ljava/util/concurrent/Flow$Processor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/reactivestreams/n<",
            "-TT;+TU;>;)",
            "Ljava/util/concurrent/Flow$Processor<",
            "TT;TU;>;"
        }
    .end annotation

    .line 1
    const-string v0, "reactiveStreamsProcessor"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lorg/reactivestreams/a$f;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lorg/reactivestreams/a$f;

    .line 11
    .line 12
    iget-object p0, p0, Lorg/reactivestreams/a$f;->a:Ljava/util/concurrent/Flow$Processor;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/Flow$Processor;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Ljava/util/concurrent/Flow$Processor;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    new-instance v0, Lorg/reactivestreams/a$b;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lorg/reactivestreams/a$b;-><init>(Lorg/reactivestreams/n;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :goto_0
    return-object p0
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

.method public static b(Lorg/reactivestreams/o;)Ljava/util/concurrent/Flow$Publisher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/reactivestreams/o<",
            "+TT;>;)",
            "Ljava/util/concurrent/Flow$Publisher<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "reactiveStreamsPublisher"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lorg/reactivestreams/a$e;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lorg/reactivestreams/a$e;

    .line 11
    .line 12
    iget-object p0, p0, Lorg/reactivestreams/a$e;->a:Ljava/util/concurrent/Flow$Publisher;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/Flow$Publisher;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Ljava/util/concurrent/Flow$Publisher;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    new-instance v0, Lorg/reactivestreams/a$a;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lorg/reactivestreams/a$a;-><init>(Lorg/reactivestreams/o;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :goto_0
    return-object p0
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

.method public static c(Lorg/reactivestreams/p;)Ljava/util/concurrent/Flow$Subscriber;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/reactivestreams/p<",
            "TT;>;)",
            "Ljava/util/concurrent/Flow$Subscriber<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "reactiveStreamsSubscriber"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lorg/reactivestreams/a$g;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lorg/reactivestreams/a$g;

    .line 11
    .line 12
    iget-object p0, p0, Lorg/reactivestreams/a$g;->a:Ljava/util/concurrent/Flow$Subscriber;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/Flow$Subscriber;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Ljava/util/concurrent/Flow$Subscriber;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    new-instance v0, Lorg/reactivestreams/a$c;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lorg/reactivestreams/a$c;-><init>(Lorg/reactivestreams/p;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :goto_0
    return-object p0
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

.method public static d(Ljava/util/concurrent/Flow$Processor;)Lorg/reactivestreams/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Flow$Processor<",
            "-TT;+TU;>;)",
            "Lorg/reactivestreams/n<",
            "TT;TU;>;"
        }
    .end annotation

    .line 1
    const-string v0, "flowProcessor"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lorg/reactivestreams/a$b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lorg/reactivestreams/a$b;

    .line 11
    .line 12
    iget-object p0, p0, Lorg/reactivestreams/a$b;->a:Lorg/reactivestreams/n;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p0, Lorg/reactivestreams/n;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Lorg/reactivestreams/n;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    new-instance v0, Lorg/reactivestreams/a$f;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lorg/reactivestreams/a$f;-><init>(Ljava/util/concurrent/Flow$Processor;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :goto_0
    return-object p0
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

.method public static e(Ljava/util/concurrent/Flow$Publisher;)Lorg/reactivestreams/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Flow$Publisher<",
            "+TT;>;)",
            "Lorg/reactivestreams/o<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "flowPublisher"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lorg/reactivestreams/a$a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lorg/reactivestreams/a$a;

    .line 11
    .line 12
    iget-object p0, p0, Lorg/reactivestreams/a$a;->a:Lorg/reactivestreams/o;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p0, Lorg/reactivestreams/o;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Lorg/reactivestreams/o;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    new-instance v0, Lorg/reactivestreams/a$e;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lorg/reactivestreams/a$e;-><init>(Ljava/util/concurrent/Flow$Publisher;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :goto_0
    return-object p0
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

.method public static f(Ljava/util/concurrent/Flow$Subscriber;)Lorg/reactivestreams/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Flow$Subscriber<",
            "TT;>;)",
            "Lorg/reactivestreams/p<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "flowSubscriber"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lorg/reactivestreams/a$c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lorg/reactivestreams/a$c;

    .line 11
    .line 12
    iget-object p0, p0, Lorg/reactivestreams/a$c;->a:Lorg/reactivestreams/p;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p0, Lorg/reactivestreams/p;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Lorg/reactivestreams/p;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    new-instance v0, Lorg/reactivestreams/a$g;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lorg/reactivestreams/a$g;-><init>(Ljava/util/concurrent/Flow$Subscriber;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :goto_0
    return-object p0
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
