.class public Lcom/huawei/agconnect/apms/d0;
.super Lokio/x;
.source "SourceFile"


# instance fields
.field public abc:J

.field public bcd:Z

.field public cde:Z

.field public final synthetic def:Lcom/huawei/agconnect/apms/e0;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/e0;Lokio/n1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lokio/x;-><init>(Lokio/n1;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/d0;->bcd:Z

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/huawei/agconnect/apms/d0;->cde:Z

    .line 10
    .line 11
    return-void
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
.method public final abc(Lcom/huawei/agconnect/apms/fed;)I
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2
    iget-wide v2, p1, Lcom/huawei/agconnect/apms/fed;->xyz:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    long-to-int p1, v0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final abc(Ljava/lang/String;)V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 4
    iget-object v0, v0, Lcom/huawei/agconnect/apms/e0;->abc:Lcom/huawei/agconnect/apms/fed;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->fgh()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 7
    iget-object v0, v0, Lcom/huawei/agconnect/apms/e0;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 8
    iget-wide v1, p0, Lcom/huawei/agconnect/apms/d0;->abc:J

    invoke-virtual {v0, v1, v2}, Lcom/huawei/agconnect/apms/fed;->abc(J)V

    .line 9
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/d0;->abc(Lcom/huawei/agconnect/apms/fed;)I

    move-result v1

    .line 10
    iput v1, v0, Lcom/huawei/agconnect/apms/fed;->uvw:I

    .line 11
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/d0;->abc(Lcom/huawei/agconnect/apms/fed;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/fed;->abc(I)V

    .line 12
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->bcd()Lcom/huawei/agconnect/apms/gfe;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 13
    iget-object v1, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 14
    iget-object v1, v1, Lcom/huawei/agconnect/apms/e0;->abc:Lcom/huawei/agconnect/apms/fed;

    const/4 v2, 0x1

    .line 15
    invoke-virtual {v1, v2}, Lcom/huawei/agconnect/apms/fed;->abc(Z)V

    .line 16
    new-instance v1, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;

    invoke-direct {v1, v0, p1}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/d0;->abc(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lokio/x;->close()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method public read(Lokio/l;J)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/huawei/agconnect/apms/d0;->cde:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/huawei/agconnect/apms/e0;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/d0;->abc(Lcom/huawei/agconnect/apms/fed;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iput v2, v0, Lcom/huawei/agconnect/apms/fed;->tuv:I

    .line 15
    .line 16
    iput-boolean v1, p0, Lcom/huawei/agconnect/apms/d0;->cde:Z

    .line 17
    .line 18
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lokio/x;->read(Lokio/l;J)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 22
    iget-wide v2, p0, Lcom/huawei/agconnect/apms/d0;->abc:J

    .line 23
    .line 24
    const-wide/16 v4, -0x1

    .line 25
    .line 26
    cmp-long p3, p1, v4

    .line 27
    .line 28
    if-eqz p3, :cond_1

    .line 29
    .line 30
    move-wide v4, p1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-wide/16 v4, 0x0

    .line 33
    .line 34
    :goto_0
    add-long/2addr v2, v4

    .line 35
    iput-wide v2, p0, Lcom/huawei/agconnect/apms/d0;->abc:J

    .line 36
    .line 37
    iget-boolean v0, p0, Lcom/huawei/agconnect/apms/d0;->bcd:Z

    .line 38
    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/huawei/agconnect/apms/e0;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-static {v0}, Lcom/huawei/agconnect/apms/dcb;->abc(Lcom/huawei/agconnect/apms/fed;)V

    .line 48
    .line 49
    .line 50
    iput-boolean v1, p0, Lcom/huawei/agconnect/apms/d0;->bcd:Z

    .line 51
    .line 52
    :cond_2
    if-eqz p3, :cond_3

    .line 53
    .line 54
    :try_start_1
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/d0;->abc:J

    .line 55
    .line 56
    iget-object p3, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 57
    .line 58
    invoke-virtual {p3}, Lcom/huawei/agconnect/apms/e0;->contentLength()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    cmp-long p3, v0, v2

    .line 63
    .line 64
    if-eqz p3, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Lokio/x;->delegate()Lokio/n1;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    check-cast p3, Lokio/BufferedSource;

    .line 71
    .line 72
    invoke-interface {p3}, Lokio/BufferedSource;->e0()Z

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    if-eqz p3, :cond_4

    .line 77
    .line 78
    :cond_3
    iget-object p3, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 79
    .line 80
    iget-object p3, p3, Lcom/huawei/agconnect/apms/e0;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 81
    .line 82
    if-eqz p3, :cond_4

    .line 83
    .line 84
    const-string p3, ""

    .line 85
    .line 86
    invoke-virtual {p0, p3}, Lcom/huawei/agconnect/apms/d0;->abc(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 87
    .line 88
    .line 89
    :cond_4
    return-wide p1

    .line 90
    :catch_0
    move-exception p1

    .line 91
    iget-object p2, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 92
    .line 93
    iget-object p2, p2, Lcom/huawei/agconnect/apms/e0;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {p2, p3}, Lcom/huawei/agconnect/apms/fed;->abc(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p0, p2}, Lcom/huawei/agconnect/apms/d0;->abc(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :catch_1
    move-exception p1

    .line 111
    iget-object p2, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 112
    .line 113
    iget-object p2, p2, Lcom/huawei/agconnect/apms/e0;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 114
    .line 115
    iget-wide v0, p0, Lcom/huawei/agconnect/apms/d0;->abc:J

    .line 116
    .line 117
    invoke-virtual {p2, v0, v1}, Lcom/huawei/agconnect/apms/fed;->abc(J)V

    .line 118
    .line 119
    .line 120
    iget-object p2, p0, Lcom/huawei/agconnect/apms/d0;->def:Lcom/huawei/agconnect/apms/e0;

    .line 121
    .line 122
    iget-object p2, p2, Lcom/huawei/agconnect/apms/e0;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    invoke-virtual {p2, p3}, Lcom/huawei/agconnect/apms/fed;->abc(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p0, p2}, Lcom/huawei/agconnect/apms/d0;->abc(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
