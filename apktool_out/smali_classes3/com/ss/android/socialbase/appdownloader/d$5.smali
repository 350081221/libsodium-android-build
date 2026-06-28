.class Lcom/ss/android/socialbase/appdownloader/d$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/c/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/socialbase/appdownloader/d;->a(Lcom/ss/android/socialbase/appdownloader/f;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

.field final synthetic c:I

.field final synthetic d:Z

.field final synthetic e:Lcom/ss/android/socialbase/appdownloader/d;


# direct methods
.method constructor <init>(Lcom/ss/android/socialbase/appdownloader/d;Ljava/lang/String;Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->e:Lcom/ss/android/socialbase/appdownloader/d;

    iput-object p2, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->b:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    iput p4, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->c:I

    iput-boolean p5, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "notification permission granted, start download :"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->e:Lcom/ss/android/socialbase/appdownloader/d;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->b:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 30
    .line 31
    iget v2, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->c:I

    .line 32
    .line 33
    iget-boolean v3, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->d:Z

    .line 34
    .line 35
    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/socialbase/appdownloader/d;->a(Lcom/ss/android/socialbase/appdownloader/d;Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V

    .line 36
    .line 37
    .line 38
    return-void
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

.method public b()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/ss/android/socialbase/appdownloader/d;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "notification permission denied, start download :"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v0, v1}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->e:Lcom/ss/android/socialbase/appdownloader/d;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->b:Lcom/ss/android/socialbase/downloader/model/DownloadTask;

    .line 30
    .line 31
    iget v2, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->c:I

    .line 32
    .line 33
    iget-boolean v3, p0, Lcom/ss/android/socialbase/appdownloader/d$5;->d:Z

    .line 34
    .line 35
    invoke-static {v0, v1, v2, v3}, Lcom/ss/android/socialbase/appdownloader/d;->a(Lcom/ss/android/socialbase/appdownloader/d;Lcom/ss/android/socialbase/downloader/model/DownloadTask;IZ)V

    .line 36
    .line 37
    .line 38
    return-void
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
