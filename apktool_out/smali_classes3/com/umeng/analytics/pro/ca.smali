.class public Lcom/umeng/analytics/pro/ca;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/io/ByteArrayOutputStream;

.field private final b:Lcom/umeng/analytics/pro/dc;

.field private c:Lcom/umeng/analytics/pro/cq;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/ck$a;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/ck$a;-><init>()V

    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/ca;-><init>(Lcom/umeng/analytics/pro/cs;)V

    return-void
.end method

.method public constructor <init>(Lcom/umeng/analytics/pro/cs;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/ca;->a:Ljava/io/ByteArrayOutputStream;

    .line 4
    new-instance v1, Lcom/umeng/analytics/pro/dc;

    invoke-direct {v1, v0}, Lcom/umeng/analytics/pro/dc;-><init>(Ljava/io/OutputStream;)V

    iput-object v1, p0, Lcom/umeng/analytics/pro/ca;->b:Lcom/umeng/analytics/pro/dc;

    .line 5
    invoke-interface {p1, v1}, Lcom/umeng/analytics/pro/cs;->a(Lcom/umeng/analytics/pro/de;)Lcom/umeng/analytics/pro/cq;

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/analytics/pro/ca;->c:Lcom/umeng/analytics/pro/cq;

    return-void
.end method


# virtual methods
.method public a(Lcom/umeng/analytics/pro/br;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 4
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/ca;->a(Lcom/umeng/analytics/pro/br;)[B

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 5
    :catch_0
    new-instance p1, Lcom/umeng/analytics/pro/bx;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JVM DOES NOT SUPPORT ENCODING: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/bx;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/umeng/analytics/pro/br;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/pro/ca;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 2
    iget-object v0, p0, Lcom/umeng/analytics/pro/ca;->c:Lcom/umeng/analytics/pro/cq;

    invoke-interface {p1, v0}, Lcom/umeng/analytics/pro/br;->write(Lcom/umeng/analytics/pro/cq;)V

    .line 3
    iget-object p1, p0, Lcom/umeng/analytics/pro/ca;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/umeng/analytics/pro/br;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/umeng/analytics/pro/bx;
        }
    .end annotation

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/ca;->a(Lcom/umeng/analytics/pro/br;)[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    return-object v0
.end method
