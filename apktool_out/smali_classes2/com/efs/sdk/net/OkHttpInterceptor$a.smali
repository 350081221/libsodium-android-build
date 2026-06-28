.class final Lcom/efs/sdk/net/OkHttpInterceptor$a;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/net/OkHttpInterceptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Lokhttp3/ResponseBody;

.field private final b:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Lokhttp3/ResponseBody;Ljava/io/InputStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/efs/sdk/net/OkHttpInterceptor$a;->a:Lokhttp3/ResponseBody;

    .line 5
    .line 6
    invoke-static {p2}, Lokio/y0;->u(Ljava/io/InputStream;)Lokio/n1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lokio/y0;->e(Lokio/n1;)Lokio/BufferedSource;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/efs/sdk/net/OkHttpInterceptor$a;->b:Lokio/BufferedSource;

    .line 15
    .line 16
    return-void
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


# virtual methods
.method public final contentLength()J
    .locals 2

    iget-object v0, p0, Lcom/efs/sdk/net/OkHttpInterceptor$a;->a:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public final contentType()Lokhttp3/MediaType;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/net/OkHttpInterceptor$a;->a:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public final source()Lokio/BufferedSource;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/net/OkHttpInterceptor$a;->b:Lokio/BufferedSource;

    return-object v0
.end method
