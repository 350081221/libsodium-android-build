.class public Lcom/huawei/agconnect/apms/g;
.super Lorg/apache/http/entity/HttpEntityWrapper;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/l;


# instance fields
.field public final abc:Lorg/apache/http/HttpEntity;

.field public final bcd:Lcom/huawei/agconnect/apms/fed;

.field public cde:Lcom/huawei/agconnect/apms/i;


# direct methods
.method public constructor <init>(Lorg/apache/http/HttpResponse;Lcom/huawei/agconnect/apms/fed;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lorg/apache/http/entity/HttpEntityWrapper;-><init>(Lorg/apache/http/HttpEntity;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

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
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->uvw:I

    .line 17
    .line 18
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 19
    .line 20
    iget-wide v1, p1, Lcom/huawei/agconnect/apms/k;->abc:J

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/fed;->abc(J)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;)V

    .line 28
    .line 29
    .line 30
    return-void
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

.method public consumeContent()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

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
    iget-object v1, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

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
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->cde:Lcom/huawei/agconnect/apms/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    .line 7
    .line 8
    instance-of v1, v0, Lorg/apache/http/entity/HttpEntityWrapper;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    check-cast v0, Lorg/apache/http/entity/HttpEntityWrapper;

    .line 14
    .line 15
    invoke-virtual {v0}, Lorg/apache/http/entity/HttpEntityWrapper;->isChunked()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    xor-int/2addr v2, v0

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/huawei/agconnect/apms/dcb;->abc(Lcom/huawei/agconnect/apms/fed;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->tuv:I

    .line 32
    .line 33
    new-instance v0, Lcom/huawei/agconnect/apms/i;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    .line 36
    .line 37
    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1, v2}, Lcom/huawei/agconnect/apms/i;-><init>(Ljava/io/InputStream;Z)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/huawei/agconnect/apms/g;->cde:Lcom/huawei/agconnect/apms/i;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/huawei/agconnect/apms/i;->bcd:Lcom/huawei/agconnect/apms/m;

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Lcom/huawei/agconnect/apms/m;->abc(Lcom/huawei/agconnect/apms/l;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->cde:Lcom/huawei/agconnect/apms/i;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    return-object v0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    iget-object v1, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 56
    .line 57
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :catch_1
    move-exception v0

    .line 62
    iget-object v1, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 63
    .line 64
    invoke-static {v1, v0}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 65
    .line 66
    .line 67
    throw v0
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

    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentEncoding()Lorg/apache/http/Header;

    move-result-object v0

    return-object v0
.end method

.method public getContentLength()J
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public getContentType()Lorg/apache/http/Header;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentType()Lorg/apache/http/Header;

    move-result-object v0

    return-object v0
.end method

.method public isChunked()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isChunked()Z

    move-result v0

    return v0
.end method

.method public isRepeatable()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isRepeatable()Z

    move-result v0

    return v0
.end method

.method public isStreaming()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->isStreaming()Z

    move-result v0

    return v0
.end method

.method public writeTo(Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->fgh()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 17
    .line 18
    invoke-static {v1}, Lcom/huawei/agconnect/apms/dcb;->abc(Lcom/huawei/agconnect/apms/fed;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 22
    .line 23
    invoke-static {v1}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iput v2, v1, Lcom/huawei/agconnect/apms/fed;->tuv:I

    .line 28
    .line 29
    new-instance v1, Lcom/huawei/agconnect/apms/j;

    .line 30
    .line 31
    invoke-direct {v1, p1}, Lcom/huawei/agconnect/apms/j;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 32
    .line 33
    .line 34
    :try_start_1
    iget-object p1, p0, Lcom/huawei/agconnect/apms/g;->abc:Lorg/apache/http/HttpEntity;

    .line 35
    .line 36
    invoke-interface {p1, v1}, Lorg/apache/http/HttpEntity;->writeTo(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catch_0
    move-exception p1

    .line 41
    move-object v0, v1

    .line 42
    goto :goto_0

    .line 43
    :catch_1
    move-exception p1

    .line 44
    :goto_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 45
    .line 46
    invoke-static {v1, p1}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 47
    .line 48
    .line 49
    move-object v1, v0

    .line 50
    :goto_1
    if-eqz v1, :cond_1

    .line 51
    .line 52
    iget-object p1, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 53
    .line 54
    iget-wide v0, v1, Lcom/huawei/agconnect/apms/j;->bcd:J

    .line 55
    .line 56
    invoke-virtual {p1, v0, v1}, Lcom/huawei/agconnect/apms/fed;->abc(J)V

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object p1, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iput v0, p1, Lcom/huawei/agconnect/apms/fed;->uvw:I

    .line 66
    .line 67
    iget-object p1, p0, Lcom/huawei/agconnect/apms/g;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/huawei/agconnect/apms/d;->abc(Lcom/huawei/agconnect/apms/fed;)V

    .line 70
    .line 71
    .line 72
    return-void
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
