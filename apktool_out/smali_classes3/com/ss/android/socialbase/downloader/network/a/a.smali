.class public Lcom/ss/android/socialbase/downloader/network/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/network/a/a$a;
    }
.end annotation


# instance fields
.field protected a:I

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ss/android/socialbase/downloader/network/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ss/android/socialbase/downloader/network/a/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->b:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object v0, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->c:Ljava/util/Map;

    .line 5
    iput v1, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->a:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/ss/android/socialbase/downloader/network/a/a$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/socialbase/downloader/network/a/a;-><init>()V

    return-void
.end method

.method public static a()Lcom/ss/android/socialbase/downloader/network/a/a;
    .locals 1

    .line 17
    invoke-static {}, Lcom/ss/android/socialbase/downloader/network/a/a$a;->a()Lcom/ss/android/socialbase/downloader/network/a/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/a/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;)",
            "Lcom/ss/android/socialbase/downloader/network/a/c;"
        }
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->b:Ljava/util/Map;

    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/socialbase/downloader/network/a/c;

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_1

    .line 8
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/c;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 9
    :try_start_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/c;->d()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 10
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    :goto_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/c;->f()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/c;->e()Z

    move-result p2

    if-eqz p2, :cond_0

    return-object p1

    .line 12
    :cond_0
    :try_start_2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/c;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    :cond_1
    const/4 p1, 0x0

    return-object p1

    :catchall_1
    move-exception p1

    .line 13
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method a(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->a:I

    return-void
.end method

.method a(Ljava/lang/String;Lcom/ss/android/socialbase/downloader/network/a/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->b:Ljava/util/Map;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->b:Ljava/util/Map;

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Ljava/lang/String;)Z
    .locals 3

    .line 14
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/socialbase/downloader/network/a/c;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 15
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/c;->g()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/c;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/c;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    move v0, v2

    :cond_1
    return v0
.end method

.method public b(Ljava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/a/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ss/android/socialbase/downloader/model/c;",
            ">;)",
            "Lcom/ss/android/socialbase/downloader/network/a/d;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->c:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/network/a/a;->c:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lcom/ss/android/socialbase/downloader/network/a/d;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/d;->f()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p2}, Lcom/ss/android/socialbase/downloader/i/f;->a(Ljava/util/List;Ljava/util/List;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    :try_start_1
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/d;->e()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception p2

    .line 30
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/d;->h()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/d;->g()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_0
    :try_start_2
    invoke-virtual {p1}, Lcom/ss/android/socialbase/downloader/network/a/d;->d()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    .line 48
    .line 49
    :catchall_0
    :cond_1
    const/4 p1, 0x0

    .line 50
    return-object p1

    .line 51
    :catchall_1
    move-exception p1

    .line 52
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 53
    throw p1
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
