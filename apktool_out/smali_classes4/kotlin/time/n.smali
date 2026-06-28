.class public final Lkotlin/time/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\u0008\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0007\"\u0004\u0008\u0000\u0010\u00082\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0003H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\t2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\u0008\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0002\u0010\n\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\u0008\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0002\u0010\u000c\u001a7\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0007\"\u0004\u0008\u0000\u0010\u0008*\u00020\t2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0003H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u001a7\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0007\"\u0004\u0008\u0000\u0010\u0008*\u00020\u000b2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u0002H\u00080\u0003H\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u000b\n\u0005\u0008\u009920\u0001\n\u0002\u0008\u0019\u00a8\u0006\r"
    }
    d2 = {
        "measureTime",
        "Lkotlin/time/Duration;",
        "block",
        "Lkotlin/Function0;",
        "",
        "(Lkotlin/jvm/functions/Function0;)J",
        "measureTimedValue",
        "Lkotlin/time/TimedValue;",
        "T",
        "Lkotlin/time/TimeSource;",
        "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)J",
        "Lkotlin/time/TimeSource$Monotonic;",
        "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)J",
        "kotlin-stdlib"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,121:1\n50#1,7:122\n113#1,7:129\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n21#1:122,7\n83#1:129,7\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lkotlin/time/s$b;Lv3/a;)J
    .locals 2
    .param p0    # Lkotlin/time/s$b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/time/s$b;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)J"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.9"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/time/l;
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "block"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lkotlin/time/s$b;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/time/s$b$a;->l(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0
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
.end method

.method public static final b(Lkotlin/time/s;Lv3/a;)J
    .locals 1
    .param p0    # Lkotlin/time/s;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/time/s;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)J"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.9"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/time/l;
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "block"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Lkotlin/time/s;->a()Lkotlin/time/r;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Lkotlin/time/r;->c()J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0
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
.end method

.method public static final c(Lv3/a;)J
    .locals 2
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)J"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.9"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/time/l;
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/time/s$b;->b:Lkotlin/time/s$b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lkotlin/time/s$b;->b()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-interface {p0}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/time/s$b$a;->l(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
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

.method public static final d(Lkotlin/time/s$b;Lv3/a;)Lkotlin/time/t;
    .locals 3
    .param p0    # Lkotlin/time/s$b;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/time/s$b;",
            "Lv3/a<",
            "+TT;>;)",
            "Lkotlin/time/t<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.9"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/time/l;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "block"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lkotlin/time/s$b;->b()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance p1, Lkotlin/time/t;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/time/s$b$a;->l(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {p1, p0, v0, v1, v2}, Lkotlin/time/t;-><init>(Ljava/lang/Object;JLkotlin/jvm/internal/w;)V

    .line 27
    .line 28
    .line 29
    return-object p1
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

.method public static final e(Lkotlin/time/s;Lv3/a;)Lkotlin/time/t;
    .locals 3
    .param p0    # Lkotlin/time/s;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/time/s;",
            "Lv3/a<",
            "+TT;>;)",
            "Lkotlin/time/t<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.9"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/time/l;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "block"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Lkotlin/time/s;->a()Lkotlin/time/r;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p1}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Lkotlin/time/t;

    .line 20
    .line 21
    invoke-interface {p0}, Lkotlin/time/r;->c()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-direct {v0, p1, v1, v2, p0}, Lkotlin/time/t;-><init>(Ljava/lang/Object;JLkotlin/jvm/internal/w;)V

    .line 27
    .line 28
    .line 29
    return-object v0
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

.method public static final f(Lv3/a;)Lkotlin/time/t;
    .locals 4
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv3/a<",
            "+TT;>;)",
            "Lkotlin/time/t<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.9"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/time/l;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/time/s$b;->b:Lkotlin/time/s$b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lkotlin/time/s$b;->b()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-interface {p0}, Lv3/a;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v2, Lkotlin/time/t;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/time/s$b$a;->l(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v2, p0, v0, v1, v3}, Lkotlin/time/t;-><init>(Ljava/lang/Object;JLkotlin/jvm/internal/w;)V

    .line 24
    .line 25
    .line 26
    return-object v2
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
