.class final Lcom/efs/sdk/net/a/a/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/net/a/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/io/InputStream;

.field private final b:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/efs/sdk/net/a/a/e$a;->a:Ljava/io/InputStream;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/efs/sdk/net/a/a/e$a;->b:Ljava/io/OutputStream;

    .line 7
    .line 8
    return-void
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
.end method

.method private a()Ljava/lang/Void;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/efs/sdk/net/a/a/e$a;->a:Ljava/io/InputStream;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/efs/sdk/net/a/a/e$a;->b:Ljava/io/OutputStream;

    .line 9
    .line 10
    const/16 v2, 0x400

    .line 11
    .line 12
    new-array v2, v2, [B

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lcom/efs/sdk/net/a/a/i;->a(Ljava/io/InputStream;Ljava/io/OutputStream;[B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/efs/sdk/net/a/a/e$a;->b:Ljava/io/OutputStream;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    return-object v0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    invoke-virtual {v0}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/efs/sdk/net/a/a/e$a;->b:Ljava/io/OutputStream;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 34
    .line 35
    .line 36
    throw v1
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


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/efs/sdk/net/a/a/e$a;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
