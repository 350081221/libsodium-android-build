.class public Lcom/a/a/a/b$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/a/b$f$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    instance-of v1, v0, Ljava/net/UnknownHostException;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const-string p0, "ALOG:UnknownHostException"

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_2
    new-instance v0, Lcom/a/a/a/b$f$a;

    .line 22
    .line 23
    invoke-direct {v0}, Lcom/a/a/a/b$f$a;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v1, Ljava/io/PrintWriter;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 29
    .line 30
    .line 31
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :catchall_0
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
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
.end method
