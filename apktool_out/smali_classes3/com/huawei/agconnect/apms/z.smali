.class public Lcom/huawei/agconnect/apms/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Callback;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/fed;

.field public bcd:Lokhttp3/Callback;


# direct methods
.method public constructor <init>(Lokhttp3/Callback;Lcom/huawei/agconnect/apms/fed;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/huawei/agconnect/apms/z;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/huawei/agconnect/apms/z;->bcd:Lokhttp3/Callback;

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
.method public abc(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/z;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/edc;->abc(Lcom/huawei/agconnect/apms/fed;Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->fgh()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->bcd()Lcom/huawei/agconnect/apms/gfe;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    new-instance v1, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;

    .line 25
    .line 26
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-direct {v1, p1, v2}, Lcom/huawei/agconnect/apms/collect/model/event/network/HttpEvent;-><init>(Lcom/huawei/agconnect/apms/gfe;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    invoke-virtual {v0, p1}, Lcom/huawei/agconnect/apms/fed;->abc(Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lcom/huawei/agconnect/apms/yza;->abc(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
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

.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/huawei/agconnect/apms/z;->abc(Ljava/lang/Exception;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catchall_0
    move-exception v0

    .line 6
    iget-object v1, p0, Lcom/huawei/agconnect/apms/z;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 7
    .line 8
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iput-object v2, v1, Lcom/huawei/agconnect/apms/fed;->qpo:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/Exception;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lcom/huawei/agconnect/apms/z;->abc(Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/z;->bcd:Lokhttp3/Callback;

    .line 23
    .line 24
    invoke-interface {v0, p1, p2}, Lokhttp3/Callback;->onFailure(Lokhttp3/Call;Ljava/io/IOException;)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/z;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/fed;->ijk()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/huawei/agconnect/apms/z;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 10
    .line 11
    invoke-static {v0, p2}, Lcom/huawei/agconnect/apms/b0;->abc(Lcom/huawei/agconnect/apms/fed;Lokhttp3/Response;)Lokhttp3/Response;

    .line 12
    .line 13
    .line 14
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    iget-object v1, p0, Lcom/huawei/agconnect/apms/z;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 18
    .line 19
    invoke-static {}, Lcom/huawei/agconnect/apms/x1;->abc()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iput-object v2, v1, Lcom/huawei/agconnect/apms/fed;->qpo:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/Exception;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lcom/huawei/agconnect/apms/z;->abc(Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/z;->bcd:Lokhttp3/Callback;

    .line 34
    .line 35
    invoke-virtual {p2}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, Lcom/huawei/agconnect/apms/e0;

    .line 40
    .line 41
    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget-object v3, p0, Lcom/huawei/agconnect/apms/z;->abc:Lcom/huawei/agconnect/apms/fed;

    .line 46
    .line 47
    invoke-direct {v2, p2, v3}, Lcom/huawei/agconnect/apms/e0;-><init>(Lokhttp3/ResponseBody;Lcom/huawei/agconnect/apms/fed;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-interface {v0, p1, p2}, Lokhttp3/Callback;->onResponse(Lokhttp3/Call;Lokhttp3/Response;)V

    .line 59
    .line 60
    .line 61
    return-void
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
