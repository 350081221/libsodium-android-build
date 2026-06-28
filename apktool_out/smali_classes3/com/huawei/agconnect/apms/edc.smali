.class public Lcom/huawei/agconnect/apms/edc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final abc:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static final bcd:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/edc;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/huawei/agconnect/apms/edc;->bcd:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    return-void
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

.method public static abc(Lcom/huawei/agconnect/apms/fed;)I
    .locals 4

    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 32
    iget-wide v2, p0, Lcom/huawei/agconnect/apms/fed;->xyz:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-lez p0, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long p0, v0, v2

    if-gez p0, :cond_0

    long-to-int p0, v0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;JILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/huawei/agconnect/apms/fed;->def(J)V

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    move-result p1

    if-nez p1, :cond_1

    .line 12
    iput p3, p0, Lcom/huawei/agconnect/apms/fed;->jkl:I

    .line 13
    :cond_1
    iput-object p4, p0, Lcom/huawei/agconnect/apms/fed;->efg:Ljava/lang/String;

    .line 14
    iput-object p5, p0, Lcom/huawei/agconnect/apms/fed;->cde:Ljava/lang/String;

    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V
    .locals 0

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/fed;->abc(Ljava/lang/String;)V

    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/fed;->def(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/fed;->mno()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iput-object p2, p0, Lcom/huawei/agconnect/apms/fed;->def:Ljava/lang/String;

    .line 4
    :goto_0
    invoke-virtual {p0, p3, p4}, Lcom/huawei/agconnect/apms/fed;->bcd(J)V

    return-void
.end method

.method public static abc(Lcom/huawei/agconnect/apms/fed;Ljava/net/HttpURLConnection;)V
    .locals 1

    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-virtual {p0, v0}, Lcom/huawei/agconnect/apms/fed;->def(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Lcom/huawei/agconnect/apms/fed;->mno()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    iput-object p1, p0, Lcom/huawei/agconnect/apms/fed;->def:Ljava/lang/String;

    :cond_2
    :goto_0
    return-void
.end method

.method public static abc(Ljava/lang/String;Lcom/huawei/agconnect/apms/fed;)V
    .locals 7

    .line 17
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 18
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    if-eqz v0, :cond_2

    return-void

    .line 19
    :cond_2
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 20
    invoke-static {p0}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v4

    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v0

    long-to-int v0, v5

    .line 22
    invoke-static {v0}, Lcom/huawei/agconnect/apms/edc;->abc(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 23
    new-instance v1, Lcom/huawei/agconnect/apms/o;

    invoke-direct {v1, p0, v3}, Lcom/huawei/agconnect/apms/o;-><init>(Ljava/lang/String;I)V

    .line 24
    invoke-virtual {p1, v1}, Lcom/huawei/agconnect/apms/fed;->abc(Lcom/huawei/agconnect/apms/o;)V

    .line 25
    invoke-virtual {p1}, Lcom/huawei/agconnect/apms/fed;->hij()V

    .line 26
    iput v0, v1, Lcom/huawei/agconnect/apms/o;->cde:I

    .line 27
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 28
    iput-object p0, v1, Lcom/huawei/agconnect/apms/o;->def:Ljava/lang/String;

    .line 29
    iput-boolean v2, v1, Lcom/huawei/agconnect/apms/o;->efg:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    .line 30
    sget-object p1, Lcom/huawei/agconnect/apms/edc;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v0, "attempt to resolve dns failed: "

    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static abc(I)Z
    .locals 1

    const/16 v0, 0x8

    if-lt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static bcd(Lcom/huawei/agconnect/apms/fed;Ljava/net/HttpURLConnection;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 8
    .line 9
    .line 10
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    invoke-static {}, Lcom/huawei/agconnect/apms/Agent;->getAgentConfiguration()Lcom/huawei/agconnect/apms/efg;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v3, v3, Lcom/huawei/agconnect/apms/efg;->def:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    move-object v3, v1

    .line 24
    :cond_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 34
    :try_start_2
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v8, v2

    .line 42
    move-object v10, v3

    .line 43
    goto :goto_2

    .line 44
    :catchall_0
    move-object v1, v3

    .line 45
    goto :goto_0

    .line 46
    :catchall_1
    const/4 v2, 0x0

    .line 47
    :catchall_2
    :goto_0
    sget-object v3, Lcom/huawei/agconnect/apms/edc;->abc:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 48
    .line 49
    const-string v4, "failed to get response info"

    .line 50
    .line 51
    invoke-interface {v3, v4}, Lcom/huawei/agconnect/apms/log/AgentLog;->warn(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_1
    move-object v10, v1

    .line 55
    move v8, v2

    .line 56
    :goto_2
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    int-to-long v6, v0

    .line 61
    move-object v5, p0

    .line 62
    invoke-static/range {v5 .. v10}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;JILjava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
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
