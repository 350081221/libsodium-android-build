.class public final Lcom/efs/sdk/base/core/util/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/efs/sdk/base/core/util/b;->a:Ljava/util/Random;

    return-void
.end method

.method public static a(Lcom/efs/sdk/base/core/d/b;)Ljava/lang/String;
    .locals 3

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    iget-object v1, p0, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget-object v1, v1, Lcom/efs/sdk/base/core/d/a;->a:Ljava/lang/String;

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    iget-object v2, p0, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget-object v2, v2, Lcom/efs/sdk/base/core/d/a;->d:Ljava/lang/String;

    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    iget-object v2, p0, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget v2, v2, Lcom/efs/sdk/base/core/d/a;->e:I

    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    iget-object p0, p0, Lcom/efs/sdk/base/core/d/b;->a:Lcom/efs/sdk/base/core/d/a;

    iget-byte p0, p0, Lcom/efs/sdk/base/core/d/a;->b:B

    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    invoke-static {}, Lcom/efs/sdk/base/core/util/ProcessUtil;->myPid()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Lcom/efs/sdk/base/core/util/b;->a:Ljava/util/Random;

    const/16 v2, 0x2710

    invoke-virtual {p0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/efs/sdk/base/core/a/a;->a()Lcom/efs/sdk/base/core/a/a;

    invoke-static {}, Lcom/efs/sdk/base/core/a/a;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/io/File;)Ljava/lang/String;
    .locals 0

    .line 9
    invoke-static {p0}, Lcom/efs/sdk/base/core/util/b;->e(Ljava/io/File;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/io/Closeable;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 17
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    const-string v0, "efs.util.file"

    const-string v1, "safe close error"

    .line 18
    invoke-static {v0, v1, p0}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/io/File;Ljava/io/File;)V
    .locals 4

    const/high16 v0, 0x80000

    new-array v0, v0, [B

    .line 29
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 31
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 32
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 33
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object p1, v1

    :cond_1
    const/4 v1, 0x0

    .line 34
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 35
    :try_start_1
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    :goto_0
    :try_start_2
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x0

    .line 37
    invoke-virtual {v3, v0, v1, p1}, Ljava/io/OutputStream;->write([BII)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 38
    :cond_2
    invoke-static {v2}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    goto :goto_4

    :catchall_0
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p0

    move-object v3, v1

    :goto_1
    move-object v1, v2

    goto :goto_5

    :catch_1
    move-exception p1

    move-object v3, v1

    :goto_2
    move-object v1, v2

    goto :goto_3

    :catchall_2
    move-exception p0

    move-object v3, v1

    goto :goto_5

    :catch_2
    move-exception p1

    move-object v3, v1

    :goto_3
    :try_start_3
    const-string v0, "efs.util.file"

    const-string v2, "error when copy"

    .line 39
    invoke-static {v0, v2, p1}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 40
    invoke-static {v1}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 41
    :goto_4
    invoke-static {v3}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 42
    invoke-static {p0}, Lcom/efs/sdk/base/core/util/b;->b(Ljava/io/File;)V

    return-void

    :catchall_3
    move-exception p0

    .line 43
    :goto_5
    invoke-static {v1}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 44
    invoke-static {v3}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 45
    throw p0
.end method

.method public static a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-static {p0, p1}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/File;[B)Z

    move-result p0

    return p0
.end method

.method public static a(Ljava/io/File;[B)Z
    .locals 4

    const/4 v0, 0x0

    .line 1
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V

    .line 3
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4
    invoke-static {v1}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    const/4 p0, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    :try_start_2
    const-string v1, "efs.util.file"

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "write file error, filename is "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0, p1}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 6
    invoke-static {v0}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    const/4 p0, 0x0

    :goto_1
    return p0

    :catchall_2
    move-exception p0

    invoke-static {v0}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 7
    throw p0
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 10
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result p0

    new-array v0, p0, [B

    .line 12
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    invoke-static {v2}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catchall_0
    move-exception p0

    move-object v1, v2

    goto :goto_2

    :catch_0
    move-exception p0

    move-object v1, v2

    goto :goto_0

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    :goto_0
    :try_start_2
    const-string v2, "efs.util.file"

    const-string v3, "read data error"

    .line 14
    invoke-static {v2, v3, p0}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 15
    invoke-static {v1}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    :goto_1
    return-object v0

    :goto_2
    invoke-static {v1}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 16
    throw p0
.end method

.method public static b(Ljava/lang/String;)Lcom/efs/sdk/base/core/d/b;
    .locals 4

    const-string v0, "_"

    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 9
    array-length v1, v0

    const/4 v2, 0x7

    if-eq v1, v2, :cond_0

    const-string v0, "File name error, name is "

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "efs.util.file"

    invoke-static {v0, p0}, Lcom/efs/sdk/base/core/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    .line 11
    aget-object p0, v0, p0

    const/4 v1, 0x1

    .line 12
    aget-object v1, v0, v1

    const/4 v2, 0x2

    .line 13
    aget-object v2, v0, v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    const/4 v3, 0x3

    .line 14
    aget-object v0, v0, v3

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    .line 15
    new-instance v3, Lcom/efs/sdk/base/core/d/b;

    invoke-direct {v3, p0, v0}, Lcom/efs/sdk/base/core/d/b;-><init>(Ljava/lang/String;B)V

    .line 16
    invoke-virtual {v3, v1}, Lcom/efs/sdk/base/core/d/b;->a(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v3, v2}, Lcom/efs/sdk/base/core/d/b;->a(I)V

    return-object v3
.end method

.method public static b(Ljava/io/File;)V
    .locals 4

    if-eqz p0, :cond_2

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    array-length v1, v0

    if-lez v1, :cond_1

    .line 5
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 6
    invoke-static {v3}, Lcom/efs/sdk/base/core/util/b;->b(Ljava/io/File;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    :cond_2
    :goto_1
    return-void
.end method

.method public static c(Ljava/io/File;)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return-wide v1

    .line 16
    :cond_0
    array-length v0, p0

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v0, :cond_2

    .line 19
    .line 20
    aget-object v4, p0, v3

    .line 21
    .line 22
    invoke-static {v4}, Lcom/efs/sdk/base/core/util/b;->c(Ljava/io/File;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    add-long/2addr v1, v4

    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    add-long/2addr v1, v3

    .line 35
    :cond_2
    return-wide v1
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
.end method

.method public static d(Ljava/io/File;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_4

    .line 17
    .line 18
    array-length v0, p0

    .line 19
    if-gtz v0, :cond_1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    array-length v1, p0

    .line 28
    const/4 v2, 0x0

    .line 29
    :goto_0
    if-ge v2, v1, :cond_3

    .line 30
    .line 31
    aget-object v3, p0, v2

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-static {v3}, Lcom/efs/sdk/base/core/util/b;->d(Ljava/io/File;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-object v0

    .line 54
    :cond_4
    :goto_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
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

.method private static e(Ljava/io/File;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    .line 15
    .line 16
    const/16 p0, 0x400

    .line 17
    .line 18
    :try_start_1
    new-array p0, p0, [B

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v2, p0}, Ljava/io/FileInputStream;->read([B)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-lez v3, :cond_1

    .line 30
    .line 31
    new-instance v4, Ljava/lang/String;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-direct {v4, p0, v5, v3}, Ljava/lang/String;-><init>([BII)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    invoke-static {v2}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    move-object v0, v2

    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    move-exception p0

    .line 53
    :goto_1
    :try_start_2
    const-string v2, "efs.util.file"

    .line 54
    .line 55
    const-string v3, "read file error"

    .line 56
    .line 57
    invoke-static {v2, v3, p0}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    return-object v1

    .line 64
    :catchall_2
    move-exception p0

    .line 65
    invoke-static {v0}, Lcom/efs/sdk/base/core/util/b;->a(Ljava/io/Closeable;)V

    .line 66
    .line 67
    .line 68
    throw p0
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
