.class public final Lcom/huawei/hms/analytics/dm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final lmn:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/analytics/dm;->lmn:Ljava/nio/charset/Charset;

    return-void
.end method

.method public static lmn(Ljava/io/File;)Ljava/lang/String;
    .locals 9

    const-string v0, "StreamToolsKit"

    const-string v1, ""

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance p0, Lcom/huawei/hms/analytics/db;

    const/4 v2, 0x0

    invoke-direct {p0, v2}, Lcom/huawei/hms/analytics/db;-><init>(B)V

    const/16 v4, 0x400

    new-array v4, v4, [B

    :cond_0
    :goto_0
    invoke-virtual {v3, v4}, Ljava/io/FileInputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_2

    if-lez v5, :cond_0

    iget-object v6, p0, Lcom/huawei/hms/analytics/db;->lmn:[B

    array-length v7, v6

    iget v8, p0, Lcom/huawei/hms/analytics/db;->klm:I

    sub-int/2addr v7, v8

    if-lt v7, v5, :cond_1

    invoke-static {v4, v2, v6, v8, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    :cond_1
    array-length v7, v6

    add-int/2addr v7, v5

    shl-int/lit8 v7, v7, 0x1

    new-array v7, v7, [B

    invoke-static {v6, v2, v7, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v6, p0, Lcom/huawei/hms/analytics/db;->klm:I

    invoke-static {v4, v2, v7, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v7, p0, Lcom/huawei/hms/analytics/db;->lmn:[B

    :goto_1
    iget v6, p0, Lcom/huawei/hms/analytics/db;->klm:I

    add-int/2addr v6, v5

    iput v6, p0, Lcom/huawei/hms/analytics/db;->klm:I

    goto :goto_0

    :cond_2
    iget v4, p0, Lcom/huawei/hms/analytics/db;->klm:I
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v4, :cond_3

    invoke-static {v3}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    return-object v1

    :cond_3
    :try_start_2
    new-instance v5, Ljava/lang/String;

    if-gtz v4, :cond_4

    new-array p0, v2, [B

    goto :goto_2

    :cond_4
    new-array v6, v4, [B

    iget-object p0, p0, Lcom/huawei/hms/analytics/db;->lmn:[B

    invoke-static {p0, v2, v6, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p0, v6

    :goto_2
    sget-object v2, Lcom/huawei/hms/analytics/dm;->lmn:Ljava/nio/charset/Charset;

    invoke-direct {v5, p0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v3}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    return-object v5

    :catchall_0
    move-exception p0

    move-object v2, v3

    goto :goto_5

    :catch_0
    move-object v2, v3

    goto :goto_3

    :catch_1
    move-object v2, v3

    goto :goto_4

    :catchall_1
    move-exception p0

    goto :goto_5

    :catch_2
    :goto_3
    :try_start_3
    const-string p0, "getInfoFromFile(): stream.read or new string exception"

    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-static {v2}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    return-object v1

    :catch_3
    :goto_4
    :try_start_4
    const-string p0, "getInfoFromFile(): No files need to be read"

    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-static {v2}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    return-object v1

    :goto_5
    invoke-static {v2}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    throw p0
.end method

.method public static lmn(Landroid/os/Bundle;)Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/os/BaseBundle;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_0
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v2, "StreamToolsKit"

    const-string v3, "bundleToJSON exception"

    invoke-static {v2, v3}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method private static lmn(Ljava/io/Closeable;)V
    .locals 1

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p0, "StreamToolsKit"

    const-string v0, "closeQuietly(): Exception when closing the closeable!"

    invoke-static {p0, v0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static lmn(Ljava/io/File;Ljava/lang/String;)V
    .locals 3

    const-string v0, "StreamToolsKit"

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string p0, "UTF-8"

    invoke-virtual {p1, p0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v2}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception p0

    move-object v1, v2

    goto :goto_2

    :catch_0
    move-object v1, v2

    goto :goto_0

    :catch_1
    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_2
    :goto_0
    :try_start_2
    const-string p0, "saveInfoToFile(): io exc from write info to file!"

    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {v1}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    return-void

    :catch_3
    :goto_1
    :try_start_3
    const-string p0, "saveInfoToFile(): No files need to be read"

    invoke-static {v0, p0}, Lcom/huawei/hms/analytics/core/log/HiLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-static {v1}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    return-void

    :goto_2
    invoke-static {v1}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    throw p0
.end method

.method public static lmn([B)[B
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

    invoke-static {v0}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v1}, Ljava/util/zip/Deflater;->end()V

    invoke-static {v0}, Lcom/huawei/hms/analytics/dm;->lmn(Ljava/io/Closeable;)V

    throw p0
.end method
