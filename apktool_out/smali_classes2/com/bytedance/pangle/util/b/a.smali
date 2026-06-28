.class public final Lcom/bytedance/pangle/util/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lcom/bytedance/pangle/util/b/b/d;

.field final b:Lcom/bytedance/pangle/util/b/a/b;


# direct methods
.method public constructor <init>(Lcom/bytedance/pangle/util/b/b/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/pangle/util/b/a;->a:Lcom/bytedance/pangle/util/b/b/d;

    .line 5
    .line 6
    new-instance p1, Lcom/bytedance/pangle/util/b/a/b;

    .line 7
    .line 8
    invoke-direct {p1}, Lcom/bytedance/pangle/util/b/a/b;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/bytedance/pangle/util/b/a;->b:Lcom/bytedance/pangle/util/b/a/b;

    .line 12
    .line 13
    return-void
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
.end method

.method static a(Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p0, Ljava/util/zip/ZipException;

    const-string v0, "Could not delete temporary file"

    invoke-direct {p0, v0}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method static a(Ljava/io/RandomAccessFile;Ljava/io/RandomAccessFile;JJLjava/lang/String;)V
    .locals 7

    add-long v4, p2, p4

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v6, p6

    .line 4
    invoke-static/range {v0 .. v6}, Lcom/bytedance/pangle/util/g;->a(Ljava/io/RandomAccessFile;Ljava/io/RandomAccessFile;JJLjava/lang/String;)V

    return-void
.end method
