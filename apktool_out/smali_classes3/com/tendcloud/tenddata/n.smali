.class public Lcom/tendcloud/tenddata/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/n$a;,
        Lcom/tendcloud/tenddata/n$b;
    }
.end annotation


# static fields
.field private static a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/tendcloud/tenddata/n$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    new-instance v1, Ljava/io/File;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v2, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    sget-object v1, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lcom/tendcloud/tenddata/n$a;

    .line 28
    .line 29
    invoke-static {p0}, Lcom/tendcloud/tenddata/n$a;->access$000(Lcom/tendcloud/tenddata/n$a;)Ljava/io/RandomAccessFile;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v2, Lcom/tendcloud/tenddata/n$a;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v2, v3}, Lcom/tendcloud/tenddata/n$a;-><init>(Lcom/tendcloud/tenddata/n$1;)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Ljava/io/RandomAccessFile;

    .line 41
    .line 42
    const-string v4, "rw"

    .line 43
    .line 44
    invoke-direct {v3, v1, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Lcom/tendcloud/tenddata/n$a;->access$002(Lcom/tendcloud/tenddata/n$a;Ljava/io/RandomAccessFile;)Ljava/io/RandomAccessFile;

    .line 48
    .line 49
    .line 50
    sget-object v1, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    .line 52
    invoke-virtual {v1, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-object p0, v2

    .line 56
    move-object v1, v3

    .line 57
    :goto_0
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/n$a;->access$202(Lcom/tendcloud/tenddata/n$a;Ljava/nio/channels/FileLock;)Ljava/nio/channels/FileLock;

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, Lcom/tendcloud/tenddata/n$a;->access$200(Lcom/tendcloud/tenddata/n$a;)Ljava/nio/channels/FileLock;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eqz p0, :cond_1

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    :cond_1
    return v0

    .line 76
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    .line 77
    .line 78
    const-string v1, "LockManager Error: filePath can not be null!"

    .line 79
    .line 80
    invoke-direct {p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :catchall_0
    return v0
    .line 85
.end method

.method public static b(Ljava/lang/String;)Ljava/io/RandomAccessFile;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    new-instance v1, Ljava/io/File;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v2, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    sget-object v1, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lcom/tendcloud/tenddata/n$a;

    .line 28
    .line 29
    invoke-static {p0}, Lcom/tendcloud/tenddata/n$a;->access$000(Lcom/tendcloud/tenddata/n$a;)Ljava/io/RandomAccessFile;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    new-instance v2, Lcom/tendcloud/tenddata/n$a;

    .line 35
    .line 36
    invoke-direct {v2, v0}, Lcom/tendcloud/tenddata/n$a;-><init>(Lcom/tendcloud/tenddata/n$1;)V

    .line 37
    .line 38
    .line 39
    new-instance v3, Ljava/io/RandomAccessFile;

    .line 40
    .line 41
    const-string v4, "rw"

    .line 42
    .line 43
    invoke-direct {v3, v1, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3}, Lcom/tendcloud/tenddata/n$a;->access$002(Lcom/tendcloud/tenddata/n$a;Ljava/io/RandomAccessFile;)Ljava/io/RandomAccessFile;

    .line 47
    .line 48
    .line 49
    sget-object v1, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-virtual {v1, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 56
    .line 57
    const-string v1, "LockManager Error: filePath can not be null!"

    .line 58
    .line 59
    invoke-direct {p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :catchall_0
    return-object v0
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

.method public static getFileLock(Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    sget-object v0, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lcom/tendcloud/tenddata/n$a;

    .line 27
    .line 28
    invoke-static {p0}, Lcom/tendcloud/tenddata/n$a;->access$000(Lcom/tendcloud/tenddata/n$a;)Ljava/io/RandomAccessFile;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v1, Lcom/tendcloud/tenddata/n$a;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, v2}, Lcom/tendcloud/tenddata/n$a;-><init>(Lcom/tendcloud/tenddata/n$1;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 40
    .line 41
    const-string v3, "rw"

    .line 42
    .line 43
    invoke-direct {v2, v0, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2}, Lcom/tendcloud/tenddata/n$a;->access$002(Lcom/tendcloud/tenddata/n$a;Ljava/io/RandomAccessFile;)Ljava/io/RandomAccessFile;

    .line 47
    .line 48
    .line 49
    sget-object v0, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-object p0, v1

    .line 55
    move-object v0, v2

    .line 56
    :goto_0
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/n$a;->access$202(Lcom/tendcloud/tenddata/n$a;Ljava/nio/channels/FileLock;)Ljava/nio/channels/FileLock;

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 69
    .line 70
    const-string v0, "LockManager Error: filePath can not be null!"

    .line 71
    .line 72
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    :catchall_0
    :goto_1
    return-void
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

.method public static releaseFileLock(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v0, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/tendcloud/tenddata/n;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lcom/tendcloud/tenddata/n$a;

    .line 22
    .line 23
    invoke-static {p0}, Lcom/tendcloud/tenddata/n$a;->access$200(Lcom/tendcloud/tenddata/n$a;)Ljava/nio/channels/FileLock;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-static {p0}, Lcom/tendcloud/tenddata/n$a;->access$200(Lcom/tendcloud/tenddata/n$a;)Ljava/nio/channels/FileLock;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/nio/channels/FileLock;->release()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    .line 38
    .line 39
    const-string v0, "LockManager Error: there is no information about this file in the cache!"

    .line 40
    .line 41
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p0

    .line 45
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 46
    .line 47
    const-string v0, "LockManager Error: filePath can not be null!"

    .line 48
    .line 49
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :catchall_0
    :cond_2
    :goto_0
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
.end method
