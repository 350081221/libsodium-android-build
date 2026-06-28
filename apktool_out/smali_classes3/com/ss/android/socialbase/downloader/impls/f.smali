.class public Lcom/ss/android/socialbase/downloader/impls/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/downloader/network/h;


# annotations
.annotation build Lcom/huawei/agconnect/apms/instrument/Instrumented;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;)",
            "Lcom/ss/android/socialbase/downloader/network/g;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/downloader/downloader/c;->s()Lokhttp3/OkHttpClient;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    new-instance v1, Lokhttp3/Request$Builder;

    .line 8
    .line 9
    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->head()Lokhttp3/Request$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-lez v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lcom/ss/android/socialbase/downloader/model/c;

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/c;->a()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1}, Lcom/ss/android/socialbase/downloader/model/c;->b()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/i/f;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p1, v2, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    instance-of p2, p1, Lokhttp3/Request$Builder;

    .line 61
    .line 62
    if-nez p2, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-static {p1}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->build(Lokhttp3/Request$Builder;)Lokhttp3/Request;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_1
    invoke-static {v0, p1}, Lcom/huawei/agconnect/apms/instrument/okhttp3/OkHttp3Instrumentation;->newCall(Lokhttp3/OkHttpClient;Lokhttp3/Request;)Lokhttp3/Call;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-interface {p1}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-eqz p2, :cond_3

    .line 82
    .line 83
    const/high16 v0, 0x200000

    .line 84
    .line 85
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/i/a;->a(I)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    invoke-virtual {p2}, Lokhttp3/Response;->close()V

    .line 92
    .line 93
    .line 94
    :cond_2
    new-instance v0, Lcom/ss/android/socialbase/downloader/impls/f$1;

    .line 95
    .line 96
    invoke-direct {v0, p0, p2, p1}, Lcom/ss/android/socialbase/downloader/impls/f$1;-><init>(Lcom/ss/android/socialbase/downloader/impls/f;Lokhttp3/Response;Lokhttp3/Call;)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 101
    .line 102
    const-string p2, "can\'t get response"

    .line 103
    .line 104
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 109
    .line 110
    const-string p2, "can\'t get httpClient"

    .line 111
    .line 112
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1
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
