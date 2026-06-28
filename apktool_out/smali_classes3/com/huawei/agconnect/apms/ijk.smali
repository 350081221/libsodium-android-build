.class public Lcom/huawei/agconnect/apms/ijk;
.super Lcom/huawei/agconnect/apms/vwx;
.source "SourceFile"


# instance fields
.field public final abc:Lcom/huawei/agconnect/apms/wxy;

.field public final bcd:Landroid/content/SharedPreferences;

.field public final cde:Landroid/content/SharedPreferences$Editor;

.field public final def:Ljava/util/concurrent/locks/Lock;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/huawei/agconnect/apms/vwx;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/huawei/agconnect/apms/wxy;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/wxy;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->abc:Lcom/huawei/agconnect/apms/wxy;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/wxy;->bcd()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->def:Ljava/util/concurrent/locks/Lock;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "com.huawei.agconnect.apms.v1_"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lcom/huawei/agconnect/apms/ijk;->bcd:Landroid/content/SharedPreferences;

    .line 48
    .line 49
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lcom/huawei/agconnect/apms/ijk;->cde:Landroid/content/SharedPreferences$Editor;

    .line 54
    .line 55
    return-void
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


# virtual methods
.method public abc()V
    .locals 2

    .line 13
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->def:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 14
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->cde:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 15
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->cde:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 16
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->abc:Lcom/huawei/agconnect/apms/wxy;

    invoke-virtual {v0}, Lcom/huawei/agconnect/apms/wxy;->bcd()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->def:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/huawei/agconnect/apms/ijk;->def:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 18
    throw v0
.end method

.method public abc(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->def:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->cde:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 3
    iget-object p1, p0, Lcom/huawei/agconnect/apms/ijk;->cde:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    iget-object p1, p0, Lcom/huawei/agconnect/apms/ijk;->def:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/huawei/agconnect/apms/ijk;->def:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 5
    throw p1
.end method

.method public final abc(Ljava/lang/String;Z)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->def:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->cde:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 8
    iget-object p1, p0, Lcom/huawei/agconnect/apms/ijk;->cde:Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object p1, p0, Lcom/huawei/agconnect/apms/ijk;->def:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/huawei/agconnect/apms/ijk;->def:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 10
    throw p1
.end method

.method public abc(Z)V
    .locals 1

    const-string v0, "apms.disabled_by_user"

    .line 12
    invoke-virtual {p0, v0, p1}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;Z)V

    return-void
.end method

.method public final abc(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/ijk;->bcd:Landroid/content/SharedPreferences;

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p1

    :catchall_0
    return v0
.end method

.method public bcd(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->bcd:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/ijk;->bcd:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    return-object v1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
