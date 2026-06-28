.class public Lcom/huawei/agconnect/apms/j;
.super Ljava/io/OutputStream;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/n;


# instance fields
.field public abc:Ljava/io/OutputStream;

.field public bcd:J

.field public cde:Lcom/huawei/agconnect/apms/m;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/huawei/agconnect/apms/j;->bcd:J

    .line 7
    .line 8
    new-instance v0, Lcom/huawei/agconnect/apms/m;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/m;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/huawei/agconnect/apms/j;->cde:Lcom/huawei/agconnect/apms/m;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iput-object p1, p0, Lcom/huawei/agconnect/apms/j;->abc:Ljava/io/OutputStream;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 21
    .line 22
    const-string v0, "OutputStreamExtension: output stream can not be null."

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method


# virtual methods
.method public abc(Lcom/huawei/agconnect/apms/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/j;->cde:Lcom/huawei/agconnect/apms/m;

    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/m;->bcd(Lcom/huawei/agconnect/apms/l;)V

    return-void
.end method

.method public final abc(Ljava/lang/Exception;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/huawei/agconnect/apms/j;->cde:Lcom/huawei/agconnect/apms/m;

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/m;->cde()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/huawei/agconnect/apms/j;->cde:Lcom/huawei/agconnect/apms/m;

    new-instance v1, Lcom/huawei/agconnect/apms/k;

    iget-wide v2, p0, Lcom/huawei/agconnect/apms/j;->bcd:J

    invoke-direct {v1, p0, v2, v3, p1}, Lcom/huawei/agconnect/apms/k;-><init>(Ljava/lang/Object;JLjava/lang/Exception;)V

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/m;->bcd(Lcom/huawei/agconnect/apms/k;)V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/j;->abc:Ljava/io/OutputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/huawei/agconnect/apms/j;->cde:Lcom/huawei/agconnect/apms/m;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/m;->cde()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/huawei/agconnect/apms/j;->cde:Lcom/huawei/agconnect/apms/m;

    .line 15
    .line 16
    new-instance v1, Lcom/huawei/agconnect/apms/k;

    .line 17
    .line 18
    iget-wide v2, p0, Lcom/huawei/agconnect/apms/j;->bcd:J

    .line 19
    .line 20
    invoke-direct {v1, p0, v2, v3}, Lcom/huawei/agconnect/apms/k;-><init>(Ljava/lang/Object;J)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/m;->abc(Lcom/huawei/agconnect/apms/k;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :catch_0
    move-exception v0

    .line 28
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/j;->abc(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    throw v0
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

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/j;->abc:Ljava/io/OutputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
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
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/j;->abc(Ljava/lang/Exception;)V

    .line 9
    .line 10
    .line 11
    throw v0
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
.end method

.method public write(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/j;->abc:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 2
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/j;->bcd:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/j;->bcd:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/j;->abc(Ljava/lang/Exception;)V

    .line 4
    throw p1
.end method

.method public write([B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/j;->abc:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 6
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/j;->bcd:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/agconnect/apms/j;->bcd:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/j;->abc(Ljava/lang/Exception;)V

    .line 8
    throw p1
.end method

.method public write([BII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/j;->abc:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 10
    iget-wide p1, p0, Lcom/huawei/agconnect/apms/j;->bcd:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lcom/huawei/agconnect/apms/j;->bcd:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/j;->abc(Ljava/lang/Exception;)V

    .line 12
    throw p1
.end method
