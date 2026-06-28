.class public final Lcom/efs/sdk/base/core/b/g;
.super Landroid/os/Handler;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/base/core/b/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/efs/sdk/base/core/b/g$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/efs/sdk/base/core/b/g$a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/efs/sdk/base/core/e/a/d;

.field private c:Lcom/efs/sdk/base/core/e/a/c;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/efs/sdk/base/core/util/concurrent/a;->a:Landroid/os/HandlerThread;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/efs/sdk/base/core/b/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    new-instance v0, Lcom/efs/sdk/base/core/e/a/d;

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/efs/sdk/base/core/e/a/d;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/efs/sdk/base/core/b/g;->b:Lcom/efs/sdk/base/core/e/a/d;

    .line 23
    .line 24
    new-instance v0, Lcom/efs/sdk/base/core/e/a/c;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/efs/sdk/base/core/e/a/c;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/efs/sdk/base/core/b/g;->c:Lcom/efs/sdk/base/core/e/a/c;

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
.end method

.method private a(Lcom/efs/sdk/base/core/d/b;Ljava/io/File;)Z
    .locals 5

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 33
    :try_start_0
    new-instance v2, Ljava/io/FileReader;

    invoke-direct {v2, p2}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 34
    :try_start_1
    new-instance v3, Ljava/io/BufferedReader;

    invoke-direct {v3, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    :try_start_2
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lcom/efs/sdk/base/core/util/b/b;->b([B)Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    :cond_0
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/efs/sdk/base/core/d/b;->a([B)V

    .line 41
    invoke-virtual {p1}, Lcom/efs/sdk/base/core/d/b;->c()V

    .line 42
    iget-object v0, p0, Lcom/efs/sdk/base/core/b/g;->c:Lcom/efs/sdk/base/core/e/a/c;

    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/core/e/a/c;->a(Lcom/efs/sdk/base/core/d/b;)V

    .line 43
    iput-object p2, p1, Lcom/efs/sdk/base/core/d/b;->d:Ljava/io/File;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    invoke-static {v3}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 45
    invoke-static {v2}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v3, v1

    :goto_1
    move-object v1, v2

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object v3, v1

    :goto_2
    :try_start_3
    const-string p2, "efs.cache"

    const-string v0, "local decode error"

    .line 46
    invoke-static {p2, v0, p1}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 47
    invoke-static {v3}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 48
    invoke-static {v1}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    const/4 p1, 0x0

    return p1

    :catchall_3
    move-exception p1

    .line 49
    invoke-static {v3}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 50
    invoke-static {v1}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 51
    throw p1
.end method

.method private static b(Ljava/lang/String;)J
    .locals 6

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/core/config/a/c;->a()Lcom/efs/sdk/base/core/config/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/a/c;->c()Ljava/util/Map;

    move-result-object v0

    .line 2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "record_accumulation_time_"

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const-wide/32 v2, 0xea60

    if-nez v1, :cond_0

    return-wide v2

    .line 4
    :cond_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 5
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-wide v2

    .line 6
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    .line 7
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-wide v0

    :catchall_0
    move-exception p0

    const-string v0, "efs.cache"

    const-string v1, "get cache interval error"

    .line 8
    invoke-static {v0, v1, p0}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-wide v2
.end method

.method private b(Lcom/efs/sdk/base/core/d/b;)Lcom/efs/sdk/base/core/b/g$a;
    .locals 5

    .line 9
    iget-object v0, p0, Lcom/efs/sdk/base/core/b/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    iget-object v1, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget-object v1, v1, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/efs/sdk/base/core/b/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    iget-object p1, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget-object p1, p1, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 14
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/efs/sdk/base/core/b/g$a;

    return-object p1

    .line 15
    :cond_0
    invoke-static {p1}, Lcom/efs/sdk/base/core/util/b;->a(Lcom/efs/sdk/base/core/d/b;)Ljava/lang/String;

    move-result-object v0

    .line 16
    new-instance v1, Ljava/io/File;

    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v2

    iget-object v2, v2, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->mAppContext:Landroid/content/Context;

    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v3

    invoke-virtual {v3}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getAppid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/efs/sdk/base/core/util/a;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 17
    :try_start_0
    new-instance v2, Lcom/efs/sdk/base/core/b/g$a;

    invoke-direct {v2, v1}, Lcom/efs/sdk/base/core/b/g$a;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    :try_start_1
    iget-object v0, p0, Lcom/efs/sdk/base/core/b/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    iget-object v3, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget-object v3, v3, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 20
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/efs/sdk/base/core/b/g$a;

    if-eqz v0, :cond_1

    .line 21
    invoke-static {v2}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 22
    invoke-static {v1}, Lcom/efs/sdk/base/core/util/b;->b(Ljava/io/File;)V

    return-object v0

    .line 23
    :cond_1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 24
    iget-object v1, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget-object v1, v1, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 25
    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v3, 0x1

    .line 26
    iput v3, v0, Landroid/os/Message;->what:I

    .line 27
    invoke-static {v1}, Lcom/efs/sdk/base/core/b/g;->b(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {p0, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    .line 28
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    :goto_1
    iget-object p1, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget-object p1, p1, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    const-string/jumbo v0, "wa"

    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 31
    invoke-static {}, Lcom/efs/sdk/base/core/f/f$a;->a()Lcom/efs/sdk/base/core/f/f;

    move-result-object p1

    .line 32
    iget-object p1, p1, Lcom/efs/sdk/base/core/f/f;->c:Lcom/efs/sdk/base/core/f/d;

    invoke-virtual {p1}, Lcom/efs/sdk/base/core/f/d;->b()V

    :cond_2
    return-object v2
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string/jumbo v0, "wa"

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lcom/efs/sdk/base/core/b/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v1, p0, Lcom/efs/sdk/base/core/b/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/efs/sdk/base/core/b/g$a;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v1, Lcom/efs/sdk/base/core/b/g$a;->b:Ljava/io/File;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lcom/efs/sdk/base/core/b/g;->a(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/efs/sdk/base/core/b/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    invoke-static {}, Lcom/efs/sdk/base/core/f/f$a;->a()Lcom/efs/sdk/base/core/f/f;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p1, p1, Lcom/efs/sdk/base/core/f/f;->c:Lcom/efs/sdk/base/core/f/d;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/efs/sdk/base/core/f/d;->c()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v1

    .line 57
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lcom/efs/sdk/base/core/b/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_2

    .line 70
    .line 71
    invoke-static {}, Lcom/efs/sdk/base/core/f/f$a;->a()Lcom/efs/sdk/base/core/f/f;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object p1, p1, Lcom/efs/sdk/base/core/f/f;->c:Lcom/efs/sdk/base/core/f/d;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/efs/sdk/base/core/f/d;->c()V

    .line 78
    .line 79
    .line 80
    :cond_2
    return-void

    .line 81
    :catchall_1
    move-exception v1

    .line 82
    iget-object v2, p0, Lcom/efs/sdk/base/core/b/g;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 83
    .line 84
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    invoke-static {}, Lcom/efs/sdk/base/core/f/f$a;->a()Lcom/efs/sdk/base/core/f/f;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget-object p1, p1, Lcom/efs/sdk/base/core/f/f;->c:Lcom/efs/sdk/base/core/f/d;

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/efs/sdk/base/core/f/d;->c()V

    .line 100
    .line 101
    .line 102
    :cond_3
    throw v1
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
.end method


# virtual methods
.method public final a(Lcom/efs/sdk/base/core/d/b;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 2
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 3
    iput p1, v0, Landroid/os/Message;->what:I

    .line 4
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 4

    .line 16
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/efs/sdk/base/core/util/b;->b(Ljava/lang/String;)Lcom/efs/sdk/base/core/d/b;

    move-result-object v0

    if-nez v0, :cond_0

    .line 17
    invoke-static {}, Lcom/efs/sdk/base/core/b/a$b;->a()Lcom/efs/sdk/base/core/b/a;

    .line 18
    invoke-static {p1}, Lcom/efs/sdk/base/core/b/a;->b(Ljava/io/File;)V

    return-void

    .line 19
    :cond_0
    invoke-direct {p0, v0, p1}, Lcom/efs/sdk/base/core/b/g;->a(Lcom/efs/sdk/base/core/d/b;Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 20
    iget-object v1, v0, Lcom/efs/sdk/base/core/d/b;->c:[B

    if-eqz v1, :cond_2

    .line 21
    array-length v1, v1

    if-gtz v1, :cond_1

    goto :goto_0

    .line 22
    :cond_1
    invoke-static {v0}, Lcom/efs/sdk/base/core/util/b;->a(Lcom/efs/sdk/base/core/d/b;)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v2

    iget-object v2, v2, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->mAppContext:Landroid/content/Context;

    .line 24
    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v3

    invoke-virtual {v3}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getAppid()Ljava/lang/String;

    move-result-object v3

    .line 25
    invoke-static {v2, v3}, Lcom/efs/sdk/base/core/util/a;->f(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 26
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 27
    iget-object v0, v0, Lcom/efs/sdk/base/core/d/b;->c:[B

    .line 28
    invoke-static {v3, v0}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/File;[B)Z

    .line 29
    invoke-static {p1}, Lcom/efs/sdk/base/core/util/b;->b(Ljava/io/File;)V

    return-void

    .line 30
    :cond_2
    :goto_0
    invoke-static {}, Lcom/efs/sdk/base/core/b/a$b;->a()Lcom/efs/sdk/base/core/b/a;

    .line 31
    invoke-static {p1}, Lcom/efs/sdk/base/core/b/a;->b(Ljava/io/File;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 12
    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 13
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 14
    iput p1, v0, Landroid/os/Message;->what:I

    .line 15
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final a(Ljava/io/File;Lcom/efs/sdk/base/core/d/b;)Z
    .locals 2

    .line 5
    invoke-virtual {p2}, Lcom/efs/sdk/base/core/d/b;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p0, p1}, Lcom/efs/sdk/base/core/b/g;->a(Ljava/io/File;)V

    return v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 8
    :cond_1
    iput-object p1, p2, Lcom/efs/sdk/base/core/d/b;->d:Ljava/io/File;

    .line 9
    invoke-virtual {p2}, Lcom/efs/sdk/base/core/d/b;->c()V

    const/4 p1, 0x1

    .line 10
    invoke-virtual {p2, p1}, Lcom/efs/sdk/base/core/d/b;->b(I)V

    return p1
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 8
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "efs.cache"

    .line 2
    .line 3
    iget v1, p1, Landroid/os/Message;->what:I

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq v1, v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 13
    .line 14
    instance-of v0, p1, Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, p1}, Lcom/efs/sdk/base/core/b/g;->c(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void

    .line 26
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lcom/efs/sdk/base/core/d/b;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    const/4 v2, 0x3

    .line 32
    if-ge v1, v2, :cond_5

    .line 33
    .line 34
    :try_start_0
    invoke-direct {p0, p1}, Lcom/efs/sdk/base/core/b/g;->b(Lcom/efs/sdk/base/core/d/b;)Lcom/efs/sdk/base/core/b/g$a;

    .line 35
    .line 36
    .line 37
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    const-string/jumbo v3, "writer is null for type "

    .line 39
    .line 40
    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v3, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    .line 49
    .line 50
    iget-object v3, v3, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v0, v2}, Lcom/efs/sdk/base/core/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Ljava/nio/channels/FileChannel;->position()J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    iget-object v6, p1, Lcom/efs/sdk/base/core/d/b;->c:[B

    .line 72
    .line 73
    array-length v6, v6

    .line 74
    int-to-long v6, v6

    .line 75
    add-long/2addr v4, v6

    .line 76
    const-wide/32 v6, 0xc8000

    .line 77
    .line 78
    .line 79
    cmp-long v4, v4, v6

    .line 80
    .line 81
    if-lez v4, :cond_4

    .line 82
    .line 83
    iget-object v2, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    .line 84
    .line 85
    iget-object v2, v2, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-direct {p0, v2}, Lcom/efs/sdk/base/core/b/g;->c(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0, p1}, Lcom/efs/sdk/base/core/b/g;->b(Lcom/efs/sdk/base/core/d/b;)Lcom/efs/sdk/base/core/b/g$a;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-nez v2, :cond_4

    .line 95
    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object v3, p1, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    .line 102
    .line 103
    iget-object v3, v3, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v0, v2}, Lcom/efs/sdk/base/core/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_4
    iget-object v3, p1, Lcom/efs/sdk/base/core/d/b;->c:[B

    .line 117
    .line 118
    const/16 v4, 0xb

    .line 119
    .line 120
    invoke-static {v3, v4}, Landroid/util/Base64;->encode([BI)[B

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    .line 125
    .line 126
    .line 127
    const-string v3, "\n"

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :catchall_0
    move-exception v2

    .line 138
    const-string v3, "cache file error"

    .line 139
    .line 140
    invoke-static {v0, v3, v2}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_5
    :goto_1
    return-void
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
.end method
