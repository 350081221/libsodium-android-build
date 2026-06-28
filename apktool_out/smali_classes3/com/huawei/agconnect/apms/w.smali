.class public Lcom/huawei/agconnect/apms/w;
.super Lcom/squareup/okhttp/ResponseBody;
.source "SourceFile"


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/fed;

.field public bcd:Lcom/squareup/okhttp/ResponseBody;

.field public cde:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/ResponseBody;Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/squareup/okhttp/ResponseBody;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/huawei/agconnect/apms/w;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/huawei/agconnect/apms/w;->bcd:Lcom/squareup/okhttp/ResponseBody;

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
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/agconnect/apms/w;->bcd:Lcom/squareup/okhttp/ResponseBody;

    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->close()V

    return-void
.end method

.method public contentLength()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/agconnect/apms/w;->bcd:Lcom/squareup/okhttp/ResponseBody;

    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lcom/squareup/okhttp/MediaType;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/w;->bcd:Lcom/squareup/okhttp/ResponseBody;

    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->contentType()Lcom/squareup/okhttp/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/w;->cde:Lokio/BufferedSource;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/huawei/agconnect/apms/w;->bcd:Lcom/squareup/okhttp/ResponseBody;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->source()Lokio/BufferedSource;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcom/huawei/agconnect/apms/v;

    .line 12
    .line 13
    invoke-direct {v1, p0, v0}, Lcom/huawei/agconnect/apms/v;-><init>(Lcom/huawei/agconnect/apms/w;Lokio/n1;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lokio/y0;->e(Lokio/n1;)Lokio/BufferedSource;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/huawei/agconnect/apms/w;->cde:Lokio/BufferedSource;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/w;->cde:Lokio/BufferedSource;

    .line 23
    .line 24
    return-object v0
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
