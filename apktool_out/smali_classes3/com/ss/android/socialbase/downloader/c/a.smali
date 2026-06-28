.class public Lcom/ss/android/socialbase/downloader/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/socialbase/downloader/c/a$a;
    }
.end annotation


# static fields
.field private static a:I = 0x4

.field private static b:Lcom/ss/android/socialbase/downloader/c/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(I)V
    .locals 0

    .line 1
    sput p0, Lcom/ss/android/socialbase/downloader/c/a;->a:I

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "DownloaderLogger"

    .line 7
    invoke-static {v0, p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    sget v0, Lcom/ss/android/socialbase/downloader/c/a;->a:I

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    .line 4
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    :cond_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/c/a;->b:Lcom/ss/android/socialbase/downloader/c/a$a;

    if-eqz v0, :cond_2

    .line 6
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/c/a$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    .line 8
    :cond_0
    sget v0, Lcom/ss/android/socialbase/downloader/c/a;->a:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_1

    .line 9
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 10
    :cond_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/c/a;->b:Lcom/ss/android/socialbase/downloader/c/a$a;

    if-eqz v0, :cond_2

    .line 11
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/c/a$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static a()Z
    .locals 2

    .line 2
    sget v0, Lcom/ss/android/socialbase/downloader/c/a;->a:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Downloader-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "DownloaderLogger"

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    sget v0, Lcom/ss/android/socialbase/downloader/c/a;->a:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_1

    .line 4
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    :cond_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/c/a;->b:Lcom/ss/android/socialbase/downloader/c/a$a;

    if-eqz v0, :cond_2

    .line 6
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/c/a$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    .line 7
    :cond_0
    sget v0, Lcom/ss/android/socialbase/downloader/c/a;->a:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_1

    .line 8
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 9
    :cond_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/c/a;->b:Lcom/ss/android/socialbase/downloader/c/a$a;

    if-eqz v0, :cond_2

    .line 10
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1, p2}, Lcom/ss/android/socialbase/downloader/c/a$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    const-string v0, "DownloaderLogger"

    .line 5
    invoke-static {v0, p0}, Lcom/ss/android/socialbase/downloader/c/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    sget v0, Lcom/ss/android/socialbase/downloader/c/a;->a:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_1

    .line 2
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/c/a;->b:Lcom/ss/android/socialbase/downloader/c/a$a;

    if-eqz v0, :cond_2

    .line 4
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/c/a$a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget v0, Lcom/ss/android/socialbase/downloader/c/a;->a:I

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    if-gt v0, v1, :cond_1

    .line 8
    .line 9
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    :cond_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/c/a;->b:Lcom/ss/android/socialbase/downloader/c/a$a;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/c/a$a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
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

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget v0, Lcom/ss/android/socialbase/downloader/c/a;->a:I

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    if-gt v0, v1, :cond_1

    .line 8
    .line 9
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    :cond_1
    sget-object v0, Lcom/ss/android/socialbase/downloader/c/a;->b:Lcom/ss/android/socialbase/downloader/c/a$a;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-static {p0}, Lcom/ss/android/socialbase/downloader/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, p0, p1}, Lcom/ss/android/socialbase/downloader/c/a$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
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
