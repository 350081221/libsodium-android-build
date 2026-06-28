.class Lcom/ss/android/downloadlib/h$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ss/android/socialbase/appdownloader/c/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ss/android/downloadlib/h;->a(Lcom/ss/android/downloadlib/addownload/b/e;Lcom/ss/android/downloadad/api/a/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ss/android/downloadad/api/a/b;

.field final synthetic b:Lcom/ss/android/downloadlib/h;


# direct methods
.method constructor <init>(Lcom/ss/android/downloadlib/h;Lcom/ss/android/downloadad/api/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ss/android/downloadlib/h$1;->b:Lcom/ss/android/downloadlib/h;

    iput-object p2, p0, Lcom/ss/android/downloadlib/h$1;->a:Lcom/ss/android/downloadad/api/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 1
    invoke-static {}, Lcom/ss/android/downloadlib/g/l;->a()Lcom/ss/android/downloadlib/g/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/h;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v3, "\u6ce8\u518c\u5e7f\u64ad\u76d1\u542c\u6210\u529f,\u6ce8\u518c\u8017\u65f6"

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iget-object v5, p0, Lcom/ss/android/downloadlib/h$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 24
    .line 25
    invoke-virtual {v5}, Lcom/ss/android/downloadad/api/a/b;->ag()J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    sub-long/2addr v3, v5

    .line 30
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "checkMarketInstallFinishEvent"

    .line 38
    .line 39
    invoke-virtual {v0, v1, v3, v2}, Lcom/ss/android/downloadlib/g/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/ss/android/downloadlib/h$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->j(Z)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v1, p0, Lcom/ss/android/downloadlib/h$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 55
    .line 56
    .line 57
    return-void
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
    invoke-static {}, Lcom/ss/android/downloadlib/g/l;->a()Lcom/ss/android/downloadlib/g/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/ss/android/downloadlib/h;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "\u5e7f\u64ad\u76d1\u542c\u65f6\u95f4\u7ed3\u675f,\u4e3b\u52a8\u89e3\u9664\u4e86\u5e7f\u64ad\u76d1\u542c"

    .line 10
    .line 11
    const-string v3, "checkMarketInstallFinishEvent"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v3, v2}, Lcom/ss/android/downloadlib/g/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/ss/android/downloadlib/h$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/ss/android/downloadlib/g/m;->b(Lcom/ss/android/downloadad/api/a/b;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lcom/ss/android/downloadlib/g/l;->a()Lcom/ss/android/downloadlib/g/l;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {}, Lcom/ss/android/downloadlib/h;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "\u76d1\u542c\u7ed3\u675f\u4f9d\u7136\u6ca1\u6709\u5b8c\u6210\u5b89\u88c5"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v3, v2}, Lcom/ss/android/downloadlib/g/l;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/h$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadad/api/a/b;->j(Z)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b/f;->a()Lcom/ss/android/downloadlib/addownload/b/f;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, p0, Lcom/ss/android/downloadlib/h$1;->a:Lcom/ss/android/downloadad/api/a/b;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/addownload/b/f;->a(Lcom/ss/android/downloadad/api/a/b;)V

    .line 50
    .line 51
    .line 52
    return-void
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
