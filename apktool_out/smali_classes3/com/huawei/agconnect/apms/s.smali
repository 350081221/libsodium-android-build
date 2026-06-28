.class public Lcom/huawei/agconnect/apms/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/okhttp/Dns;


# static fields
.field public static final cde:Lcom/huawei/agconnect/apms/log/AgentLog;


# instance fields
.field public abc:Lcom/squareup/okhttp/Dns;

.field public bcd:Lcom/huawei/agconnect/apms/fed;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/huawei/agconnect/apms/s;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/okhttp/Dns;Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/s;->abc:Lcom/squareup/okhttp/Dns;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/huawei/agconnect/apms/s;->bcd:Lcom/huawei/agconnect/apms/fed;

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

.method public static abc(Lcom/squareup/okhttp/OkHttpClient;Lcom/huawei/agconnect/apms/fed;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/OkHttpClient;->getDns()Lcom/squareup/okhttp/Dns;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Lcom/squareup/okhttp/Dns;->SYSTEM:Lcom/squareup/okhttp/Dns;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/OkHttpClient;->setDns(Lcom/squareup/okhttp/Dns;)Lcom/squareup/okhttp/OkHttpClient;

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0}, Lcom/squareup/okhttp/OkHttpClient;->getDns()Lcom/squareup/okhttp/Dns;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/squareup/okhttp/OkHttpClient;->getDns()Lcom/squareup/okhttp/Dns;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v0, v0, Lcom/huawei/agconnect/apms/s;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/squareup/okhttp/OkHttpClient;->getDns()Lcom/squareup/okhttp/Dns;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lcom/huawei/agconnect/apms/s;

    .line 34
    .line 35
    iput-object p1, p0, Lcom/huawei/agconnect/apms/s;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    sget-object v0, Lcom/huawei/agconnect/apms/s;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 39
    .line 40
    const-string v1, "set custom dns success."

    .line 41
    .line 42
    invoke-interface {v0, v1}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lcom/huawei/agconnect/apms/s;

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/squareup/okhttp/OkHttpClient;->getDns()Lcom/squareup/okhttp/Dns;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-direct {v0, v1, p1}, Lcom/huawei/agconnect/apms/s;-><init>(Lcom/squareup/okhttp/Dns;Lcom/huawei/agconnect/apms/fed;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/OkHttpClient;->setDns(Lcom/squareup/okhttp/Dns;)Lcom/squareup/okhttp/OkHttpClient;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    sget-object p1, Lcom/huawei/agconnect/apms/s;->cde:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 60
    .line 61
    const-string v0, "set custom dns class failed: "

    .line 62
    .line 63
    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {p0, v0, p1}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_0
    return-void
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


# virtual methods
.method public lookup(Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/s;->bcd:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    new-instance v1, Lcom/huawei/agconnect/apms/o;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, Lcom/huawei/agconnect/apms/o;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    const/4 v5, 0x1

    .line 14
    :try_start_0
    iget-object v6, p0, Lcom/huawei/agconnect/apms/s;->abc:Lcom/squareup/okhttp/Dns;

    .line 15
    .line 16
    invoke-interface {v6, p1}, Lcom/squareup/okhttp/Dns;->lookup(Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v2
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    sub-long/2addr v6, v3

    .line 25
    long-to-int v3, v6

    .line 26
    iget-object v4, v0, Lcom/huawei/agconnect/apms/fed;->bcd:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-static {v3}, Lcom/huawei/agconnect/apms/edc;->abc(I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    iput v3, v1, Lcom/huawei/agconnect/apms/o;->cde:I

    .line 43
    .line 44
    iput-boolean v5, v1, Lcom/huawei/agconnect/apms/o;->efg:Z

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, v1, Lcom/huawei/agconnect/apms/o;->def:Ljava/lang/String;

    .line 53
    .line 54
    :cond_0
    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/apms/fed;->abc(Lcom/huawei/agconnect/apms/o;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->hij()V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-object v2

    .line 61
    :catch_0
    move-exception p1

    .line 62
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_2

    .line 67
    .line 68
    iget v3, v0, Lcom/huawei/agconnect/apms/fed;->yxw:I

    .line 69
    .line 70
    add-int/2addr v3, v5

    .line 71
    iput v3, v0, Lcom/huawei/agconnect/apms/fed;->yxw:I

    .line 72
    .line 73
    :cond_2
    iput-boolean v2, v1, Lcom/huawei/agconnect/apms/o;->efg:Z

    .line 74
    .line 75
    throw p1
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
