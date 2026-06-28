.class Lcom/huawei/agconnect/https/c$b;
.super Lokhttp3/RequestBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/agconnect/https/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Lokhttp3/RequestBody;

.field b:Lokio/l;


# direct methods
.method constructor <init>(Lokhttp3/RequestBody;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/agconnect/https/c$b;->b:Lokio/l;

    iput-object p1, p0, Lcom/huawei/agconnect/https/c$b;->a:Lokhttp3/RequestBody;

    new-instance v0, Lokio/l;

    invoke-direct {v0}, Lokio/l;-><init>()V

    iput-object v0, p0, Lcom/huawei/agconnect/https/c$b;->b:Lokio/l;

    invoke-virtual {p1, v0}, Lokhttp3/RequestBody;->writeTo(Lokio/m;)V

    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/https/c$b;->b:Lokio/l;

    invoke-virtual {v0}, Lokio/l;->M0()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/https/c$b;->a:Lokhttp3/RequestBody;

    invoke-virtual {v0}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

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

    iget-object v0, p0, Lcom/huawei/agconnect/https/c$b;->b:Lokio/l;

    invoke-virtual {v0}, Lokio/l;->N0()Lokio/n;

    move-result-object v0

    invoke-interface {p1, v0}, Lokio/m;->v0(Lokio/n;)Lokio/m;

    return-void
.end method
