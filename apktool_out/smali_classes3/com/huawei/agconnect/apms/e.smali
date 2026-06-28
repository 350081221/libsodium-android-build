.class public Lcom/huawei/agconnect/apms/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/http/HttpEntity;
.implements Lcom/huawei/agconnect/apms/l;


# instance fields
.field public final abc:Lorg/apache/http/HttpEntity;

.field public final bcd:Lcom/huawei/agconnect/apms/fed;


# direct methods
.method public constructor <init>(Lorg/apache/http/HttpEntity;Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/huawei/agconnect/apms/e;->bcd:Lcom/huawei/agconnect/apms/fed;

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


# virtual methods
.method public abc(Lcom/huawei/agconnect/apms/k;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/huawei/agconnect/apms/n;

    .line 6
    .line 7
    invoke-interface {v0, p0}, Lcom/huawei/agconnect/apms/n;->abc(Lcom/huawei/agconnect/apms/l;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/huawei/agconnect/apms/k;->bcd:Ljava/lang/Exception;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method

.method public bcd(Lcom/huawei/agconnect/apms/k;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/util/EventObject;->getSource()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/huawei/agconnect/apms/n;

    .line 6
    .line 7
    invoke-interface {v0, p0}, Lcom/huawei/agconnect/apms/n;->abc(Lcom/huawei/agconnect/apms/l;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 11
    .line 12
    iget-wide v1, p1, Lcom/huawei/agconnect/apms/k;->abc:J

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/fed;->bcd(J)V

    .line 15
    .line 16
    .line 17
    return-void
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
.end method

.method public consumeContent()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    iget-object v1, p0, Lcom/huawei/agconnect/apms/e;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 11
    .line 12
    .line 13
    throw v0
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
.end method

.method public getContent()Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->mno()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/huawei/agconnect/apms/i;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    .line 12
    .line 13
    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Lcom/huawei/agconnect/apms/i;-><init>(Ljava/io/InputStream;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lcom/huawei/agconnect/apms/i;->bcd:Lcom/huawei/agconnect/apms/m;

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Lcom/huawei/agconnect/apms/m;->abc(Lcom/huawei/agconnect/apms/l;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    .line 27
    .line 28
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    .line 29
    .line 30
    .line 31
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-object v0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    iget-object v1, p0, Lcom/huawei/agconnect/apms/e;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 35
    .line 36
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :catch_1
    move-exception v0

    .line 41
    iget-object v1, p0, Lcom/huawei/agconnect/apms/e;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 42
    .line 43
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 44
    .line 45
    .line 46
    throw v0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method

.method public getContentEncoding()Lorg/apache/http/Header;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentEncoding()Lorg/apache/http/Header;

    move-result-object v0

    return-object v0
.end method

.method public getContentLength()J
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public getContentType()Lorg/apache/http/Header;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentType()Lorg/apache/http/Header;

    move-result-object v0

    return-object v0
.end method

.method public isChunked()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isChunked()Z

    move-result v0

    return v0
.end method

.method public isRepeatable()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isRepeatable()Z

    move-result v0

    return v0
.end method

.method public isStreaming()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isStreaming()Z

    move-result v0

    return v0
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->mno()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/huawei/agconnect/apms/j;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/huawei/agconnect/apms/j;-><init>(Ljava/io/OutputStream;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    .line 15
    .line 16
    invoke-interface {p1, v0}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/huawei/agconnect/apms/e;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 20
    .line 21
    iget-wide v0, v0, Lcom/huawei/agconnect/apms/j;->bcd:J

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Lcom/huawei/agconnect/apms/fed;->bcd(J)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->abc:Lorg/apache/http/HttpEntity;

    .line 28
    .line 29
    invoke-interface {v0, p1}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception p1

    .line 34
    iget-object v0, p0, Lcom/huawei/agconnect/apms/e;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 35
    .line 36
    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    throw p1
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
    .line 84
    .line 85
.end method
