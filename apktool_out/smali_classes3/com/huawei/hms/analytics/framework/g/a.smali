.class public final Lcom/huawei/hms/analytics/framework/g/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Ljava/io/OutputStream;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p0, "StreamToolsKit"

    const-string v0, "closeStream(): Exception: close OutputStream error!"

    invoke-static {p0, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a([B)[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Ljava/util/zip/Deflater;

    invoke-direct {v1}, Ljava/util/zip/Deflater;-><init>()V

    :try_start_0
    invoke-virtual {v1, p0}, Ljava/util/zip/Deflater;->setInput([B)V

    invoke-virtual {v1}, Ljava/util/zip/Deflater;->finish()V

    const/16 p0, 0x400

    new-array p0, p0, [B

    :goto_0
    invoke-virtual {v1}, Ljava/util/zip/Deflater;->finished()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1, p0}, Ljava/util/zip/Deflater;->deflate([B)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, p0, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Ljava/util/zip/Deflater;->end()V

    invoke-static {v0}, Lcom/huawei/hms/analytics/framework/g/a;->a(Ljava/io/OutputStream;)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v1}, Ljava/util/zip/Deflater;->end()V

    invoke-static {v0}, Lcom/huawei/hms/analytics/framework/g/a;->a(Ljava/io/OutputStream;)V

    throw p0
.end method
