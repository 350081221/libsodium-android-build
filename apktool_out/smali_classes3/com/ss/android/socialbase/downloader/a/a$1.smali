.class Lcom/ss/android/socialbase/downloader/a/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ss/android/socialbase/downloader/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/socialbase/downloader/a/a;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/downloader/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {v0, p1}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;I)I

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
    .line 27
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v1, v2}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;Z)Z

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p1, v0

    .line 23
    :goto_0
    invoke-static {v1, p1}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;I)I

    .line 24
    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/a/a;->b(Lcom/ss/android/socialbase/downloader/a/a;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
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
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v0

    .line 27
    :goto_0
    invoke-static {v1, p1}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;I)I

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static {p1, v1}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;Z)Z

    .line 34
    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/a/a;->b(Lcom/ss/android/socialbase/downloader/a/a;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
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

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object v1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ne p1, v1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 17
    .line 18
    invoke-static {p1, v0}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;I)I

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/ss/android/socialbase/downloader/a/a;->c(Lcom/ss/android/socialbase/downloader/a/a;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lcom/ss/android/socialbase/downloader/a/a$1;->a:Lcom/ss/android/socialbase/downloader/a/a;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lcom/ss/android/socialbase/downloader/a/a;->a(Lcom/ss/android/socialbase/downloader/a/a;Z)Z

    .line 29
    .line 30
    .line 31
    return-void
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
.end method
