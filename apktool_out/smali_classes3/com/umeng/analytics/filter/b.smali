.class public Lcom/umeng/analytics/filter/b;
.super Lcom/umeng/analytics/filter/EventList;
.source "SourceFile"


# instance fields
.field private a:Lcom/umeng/analytics/filter/d;

.field private b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/umeng/analytics/filter/EventList;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/umeng/analytics/filter/b;->b:Ljava/lang/Object;

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
.method protected eventListChange()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/filter/EventList;->mEventList:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/umeng/analytics/filter/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    iput-object v1, p0, Lcom/umeng/analytics/filter/b;->a:Lcom/umeng/analytics/filter/d;

    .line 14
    .line 15
    new-instance v1, Lcom/umeng/analytics/filter/d;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/umeng/analytics/filter/EventList;->mEventList:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {v1, v3, v2}, Lcom/umeng/analytics/filter/d;-><init>(ZLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lcom/umeng/analytics/filter/b;->a:Lcom/umeng/analytics/filter/d;

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw v1

    .line 30
    :cond_0
    :goto_0
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

.method public matchHit(Ljava/lang/String;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/umeng/analytics/filter/EventList;->mEventList:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/umeng/analytics/filter/b;->b:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v2, p0, Lcom/umeng/analytics/filter/b;->a:Lcom/umeng/analytics/filter/d;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    new-instance v2, Lcom/umeng/analytics/filter/d;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/umeng/analytics/filter/EventList;->mEventList:Ljava/lang/String;

    .line 20
    .line 21
    invoke-direct {v2, v1, v3}, Lcom/umeng/analytics/filter/d;-><init>(ZLjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lcom/umeng/analytics/filter/b;->a:Lcom/umeng/analytics/filter/d;

    .line 25
    .line 26
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/filter/b;->a:Lcom/umeng/analytics/filter/d;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Lcom/umeng/analytics/filter/d;->a(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    monitor-exit v0

    .line 33
    return p1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p1

    .line 37
    :cond_1
    return v1
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

.method public setMD5ClearFlag(Z)V
    .locals 0

    sput-boolean p1, Lcom/umeng/analytics/AnalyticsConfig;->CLEAR_EKV_WL:Z

    return-void
.end method
