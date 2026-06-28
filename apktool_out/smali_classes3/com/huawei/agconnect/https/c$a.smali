.class Lcom/huawei/agconnect/https/c$a;
.super Lokhttp3/RequestBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/https/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lokhttp3/RequestBody;


# direct methods
.method public constructor <init>(Lokhttp3/RequestBody;)V
    .locals 0

    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/https/c$a;->a:Lokhttp3/RequestBody;

    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    const-string v0, "application/x-gzip"

    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lokio/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lokio/z;

    invoke-direct {v0, p1}, Lokio/z;-><init>(Lokio/l1;)V

    invoke-static {v0}, Lokio/y0;->d(Lokio/l1;)Lokio/m;

    move-result-object p1

    iget-object v0, p0, Lcom/huawei/agconnect/https/c$a;->a:Lokhttp3/RequestBody;

    invoke-virtual {v0, p1}, Lokhttp3/RequestBody;->writeTo(Lokio/m;)V

    invoke-interface {p1}, Lokio/l1;->close()V

    return-void
.end method
